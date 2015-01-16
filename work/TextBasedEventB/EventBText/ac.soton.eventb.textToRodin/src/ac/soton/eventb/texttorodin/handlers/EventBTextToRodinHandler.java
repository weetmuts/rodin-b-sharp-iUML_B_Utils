package ac.soton.eventb.texttorodin.handlers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.impl.TerminalRuleImpl;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.impl.HiddenLeafNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eventb.emf.core.EventBCommented;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.EventBObject;
import org.eventb.emf.core.context.impl.ContextImpl;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.impl.MachineImpl;
import org.rodinp.core.IRodinElement;
import org.rodinp.core.IRodinProject;
import org.rodinp.core.RodinCore;

import ac.soton.eventb.textout.utils.TextOutUtil;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * 
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class EventBTextToRodinHandler extends AbstractHandler {
	/**
	 * The constructor.
	 */
	public EventBTextToRodinHandler() {
	}

	// a place to store machines etc that require processing
	public static Map<String, String> crossRefMap = new HashMap<String, String>();

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {

		IEditorPart editorPart = HandlerUtil.getActiveEditorChecked(event);
		Class<XtextEditor> xTextEditorClazz = XtextEditor.class;
		Class<? extends IEditorPart> thisEditorClazz = editorPart.getClass();
		Class<MachineImpl> machineClazz = MachineImpl.class;
		Class<ContextImpl> contextClazz = ContextImpl.class;

		if (thisEditorClazz == xTextEditorClazz) {
			// Get the input from the editor UI
			IFileEditorInput input = (IFileEditorInput) editorPart
					.getEditorInput();
			// This is the file associated with the editor.
			IFile f = input.getFile();
			URI uri = URI.createPlatformResourceURI(f.getFullPath()
					.toOSString(), true);
			// get the resource associated with the file
			ResourceSet rs = new ResourceSetImpl();
			Resource r = rs.getResource(uri, true);

			// check we are in a rodin project
			String directoryName = uri.segment(uri.segmentCount() - 2);
			IRodinProject rodinProject = RodinCore.getRodinDB()
					.getRodinProject(directoryName);
			if (rodinProject == null) {
				Shell shell = editorPart.getSite().getShell();
				MessageDialog.openError(shell, directoryName,
						"Please use an Event-B Project");
				return null;
			}

			// reset the URI to point to a new file
			URI newURI = uri.trimFileExtension().appendFileExtension("bum");
			r.setURI(newURI);

			// get the contents of the resource
			List<EObject> contentList = r.getContents();
			List<EventBElement> toRodinList = new ArrayList<EventBElement>();

			// find the event refines cross references, store in a map
			// with machine/context names
			for (EObject e : contentList) {
				Class<? extends EObject> eClazz = e.getClass();
				boolean isMachine = eClazz == machineClazz;
				boolean isContext = eClazz == contextClazz;
				// if we have a machine or context
				// we need to store the (key) xtext cross reference name
				// and (value) machine/context name for later use
				if (isMachine || isContext) {
					toRodinList.add((EventBElement) e);

					if (isMachine) {
						Machine machine = (Machine) e;
						List<Event> eventList = machine.getEvents();
						for (Event evt : eventList) {
							recordCrossRefs(evt, f, uri, rs);
						}
						handleComments(e);
					}
				}
			}
			// persist as rodin
			save(uri, toRodinList);
		}
		TextOutUtil.crossRefMap.clear();
		return null;
	}

	private void handleComments(EObject e) {
		// this object can have an eventb comment
		if (e instanceof EventBCommented) {
			EventBCommented commentedElement = (EventBCommented) e;
			// Get the node associated with this object. 
			ICompositeNode compositeNode = NodeModelUtils.getNode(e);
			// Comments are leaf nodes, so get these
			Iterable<ILeafNode> leafnodes = compositeNode.getLeafNodes();
			Iterator<ILeafNode> iter = leafnodes.iterator();
			// comments are HiddeLeafNodes - so find these
			while (iter.hasNext()) {
				ILeafNode node = iter.next();
				String text = node.getText();
				if (node instanceof HiddenLeafNode) {
					HiddenLeafNode hiddenLeafNode = (HiddenLeafNode) node;
					EObject grammerElement = hiddenLeafNode.getGrammarElement();
					// If it is a Comments, it is found in the Terminal rules
					if (grammerElement instanceof TerminalRule) {
						TerminalRule tRule = (TerminalRule) grammerElement;
						String name = tRule.getName();
						if (name.equals("SL_COMMENT")
								|| name.equals("ML_COMMENT")) {
							// set the comment in the model
							text = text.replace("//", "");
							text = text.replace("\n", "").trim();
							commentedElement.setComment(text);
							break;
						}
					}
				}
			}
			// now get the contents and recurse
			EList<EObject> eList = e.eContents();
			for(EObject eobj: eList){
				handleComments(eobj);
			}
		}
	}

	private void save(URI uri, List<EventBElement> toRodinList) {
		for (EventBElement e : toRodinList) {
			EcoreUtil.resolveAll(e);
			Map<IRodinElement, EventBObject> map = new HashMap<IRodinElement, EventBObject>();
			try {
				ResourceSet rs2 = new ResourceSetImpl();
				URI uri2 = uri;
				uri2 = uri2.trimFileExtension().appendFileExtension("bum");
				Resource r2 = rs2.getResource(uri2, false);
				if (r2 == null) {
					r2 = rs2.createResource(uri2);
				}
				r2.getContents().clear();
				r2.getContents().add(e);
				r2.save(map);
			} catch (IOException e1) {
				e1.printStackTrace();
			}

		}
	}

	private void recordCrossRefs(Event e, IFile f, URI uri, ResourceSet rs) {
		EList<Event> refinesList = e.getRefines();
		if (refinesList.size() > 0) {
			try {
				FileReader fr = new FileReader(f.getLocation().toString());
				BufferedReader br = new BufferedReader(fr);
				for (Event refinedEvt : refinesList) {
					if (refinedEvt.eIsProxy()) {
						String line = br.readLine();
						while (line != null) {
							Pattern p = Pattern
									.compile(" " + e.getName() + " ");
							Matcher matcher = p.matcher(line);
							boolean found = matcher.find();
							if (line.contains("event") && found) {
								line = br.readLine();
								// counter for refined events
								int i = 0;
								// if refines and an event name are in the same
								// line
								if (line.trim().length() > "refines".length()) {
									// remove the refines clause
									String name = line.replace("refines", "")
											.trim();
									String incorrectName = ((InternalEObject) refinedEvt)
											.eProxyURI().fragment();
									TextOutUtil.crossRefMap.put(incorrectName,
											name);
									i++;
								}
								for (; i < refinesList.size();) {
									line = br.readLine().trim();
									if (line != null
											&& line.trim().length() > 0) {
										String incorrectName = ((InternalEObject) refinedEvt)
												.eProxyURI().fragment();
										int xtTextLinkPos = incorrectName
												.indexOf("xtextLink_");
										incorrectName = incorrectName
												.substring(xtTextLinkPos);

										TextOutUtil.crossRefMap.put(
												incorrectName, line.trim());
										i++;
									}
								}
							}
							line = br.readLine();
						}
					}
				}
				br.close();
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}

}