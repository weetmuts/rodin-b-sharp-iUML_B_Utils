package ac.soton.eventb.texttorodin.handlers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.context.impl.ContextImpl;
import org.eventb.emf.core.machine.impl.MachineImpl;
import org.eventb.emf.persistence.EMFRodinDB;
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
	private IRodinProject rodinProject;

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
			rodinProject = RodinCore.getRodinDB()
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
			}
			// persist machine or context in rodin database
			save(uri, toRodinList);
		}
		return null;
	}

	private void save(URI uri, List<EventBElement> toRodinList) {
		for (EventBElement e : toRodinList) {
			EcoreUtil.resolveAll(e);
			URI uri2 = uri;
			if (isMachine) {
				uri2 = uri2.trimFileExtension().appendFileExtension("bum");
			} else if (isContext) {
				uri2 = uri2.trimFileExtension().appendFileExtension("buc");
			}
			EMFRodinDB.INSTANCE.saveResource(uri2, e);
			String fileName = e.getURI().lastSegment();
			TextOutUtil.openFileForEditing(fileName , rodinProject);
		}
	}
}