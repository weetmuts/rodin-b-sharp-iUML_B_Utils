package ac.soton.eventb.texttorodin.handlers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
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
import org.eclipse.xtext.nodemodel.BidiIterator;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.impl.HiddenLeafNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eventb.emf.core.EventBCommented;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.EventBObject;
import org.eventb.emf.core.context.Axiom;
import org.eventb.emf.core.context.Constant;
import org.eventb.emf.core.context.Context;
import org.eventb.emf.core.context.impl.ContextImpl;
import org.eventb.emf.core.machine.Action;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Guard;
import org.eventb.emf.core.machine.Invariant;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.Parameter;
import org.eventb.emf.core.machine.Variable;
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
	private boolean isMachine;
	private boolean isContext;
	private EventBCommented previousCommentedElement = null;

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

			// get the contents of the resource
			EObject e = r.getContents().get(0);
			List<EventBElement> toRodinList = new ArrayList<EventBElement>();

			// find the event refines cross references, store in a map
			// with machine/context names
			Class<? extends EObject> eClazz = e.getClass();
			isMachine = eClazz == machineClazz;
			isContext = eClazz == contextClazz;
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
				}
				// retrieve lost comment of the machine
				persistComments(e);
				// retrieve lost comments of all the contents
				TreeIterator<EObject> iter = e.eAllContents();
				while (iter.hasNext()) {
					EObject next = iter.next();
					persistComments(next);
				}
			}
			// persist machine or context in rodin database
			save(uri, toRodinList);
		}
		TextOutUtil.crossRefMap.clear();
		return null;
	}

	// XText comments are a horrible mess. The comments may appear before or
	// after the associated semantic text. The comments also
	// contain spurious end of line characters and spurious text. 
	// The 'actual' comment can come before or after the 
	// spurious newline.
	private void persistComments(EObject e) {
		// this object can have an eventb comment
		if (e instanceof EventBCommented) {
			EventBCommented currentCommentedElement = (EventBCommented) e;
			// Get the node associated with this object.
			ICompositeNode compositeNode = NodeModelUtils.getNode(e);
			// Get the node iterator
			BidiIterator<INode> iter = compositeNode.getChildren().iterator();
			// comments are HiddeLeafNodes - so find these
			while (iter.hasNext()) {
				INode node = iter.next();

				String text = node.getText();
				if (text.contains("//")) {
					// set the comment in the previous element
					text = text.replace("//", "");
					// remove any spurious trailing newlines
					if(text.contains("\n") && !(previousCommentedElement instanceof Constant)){
						text = text.substring(0, text.indexOf("\n"));
					}
					// unless it is a comment on a constant which comes with a
					// spurious preceding newline
					else if(text.contains("\n") && previousCommentedElement instanceof Constant){
						text.replace("\n", "");
					}
					text = text.trim();
					if (e instanceof Event ||
							e instanceof Machine ||
							e instanceof Context) {
						currentCommentedElement.setComment(text);
					} else if (e instanceof Parameter ||
							e instanceof Invariant || 
							e instanceof Variable ||
							e instanceof Guard ||
							e instanceof Action ||
							e instanceof Constant ||
							e instanceof Axiom) {
						previousCommentedElement.setComment(text);
					}
					break;
				}
			}
			previousCommentedElement = currentCommentedElement;
		}
	}

	private void save(URI uri, List<EventBElement> toRodinList) {
		for (EventBElement e : toRodinList) {
			EcoreUtil.resolveAll(e);
			Map<IRodinElement, EventBObject> map = new HashMap<IRodinElement, EventBObject>();
			try {
				ResourceSet rs2 = new ResourceSetImpl();
				URI uri2 = uri;

				if (isMachine) {
					uri2 = uri2.trimFileExtension().appendFileExtension("bum");
				} else if (isContext) {
					uri2 = uri2.trimFileExtension().appendFileExtension("buc");
				}

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