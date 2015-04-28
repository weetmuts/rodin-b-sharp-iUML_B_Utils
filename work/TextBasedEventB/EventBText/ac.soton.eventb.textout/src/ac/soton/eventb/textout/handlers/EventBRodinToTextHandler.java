package ac.soton.eventb.textout.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eventb.core.IContextRoot;
import org.eventb.core.IMachineRoot;
import org.rodinp.core.IElementType;
import org.rodinp.core.IRodinElement;
import org.rodinp.core.IRodinFile;
import org.rodinp.core.IRodinProject;
import org.rodinp.core.RodinCore;
import org.rodinp.core.RodinDBException;

import ac.soton.eventb.textout.Activator;
import ac.soton.eventb.textout.utils.ExportTextManager;
import ac.soton.eventb.textout.utils.TextOutUtil;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * 
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class EventBRodinToTextHandler extends AbstractHandler {
	// Handles the execution that results from the button click 
	// when enabled in the Rodin editor tool bar.
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IEditorPart editorPart = HandlerUtil.getActiveEditorChecked(event);

		// Get the input from the editor UI
		IFileEditorInput input = (IFileEditorInput) editorPart.getEditorInput();
		// This is the file associated with the editor.
		IFile f = input.getFile();
		URI uri = URI.createPlatformResourceURI(f.getFullPath().toOSString(),
				true);

		// check we are in a rodin project
		String directoryName = uri.segment(uri.segmentCount() - 2);
		IRodinProject rodinProject = RodinCore.getRodinDB().getRodinProject(
				directoryName);
		if (rodinProject == null) {
			Shell shell = editorPart.getSite().getShell();
			MessageDialog.openError(shell, directoryName,
					"Please use an Event-B Project");
			return null;
		}
		
		TextOutUtil.addXtextNature(rodinProject.getProject());

		// The next sequence gets the RodinElement from the project
		String fName = uri.lastSegment();

		IRodinFile rodinFile = rodinProject.getRodinFile(fName);
		IElementType<? extends IRodinElement> elType = rodinFile
				.getRootElementType();

		String elId = elType.getId();
		// If it's a machine or context then export it
		String result = null;
		if (elId.equals(IMachineRoot.ELEMENT_TYPE.getId()) ||
				elId.equals(IContextRoot.ELEMENT_TYPE.getId())) {
			
			IRodinElement rodinEl = (IRodinElement) rodinFile;
			try {
				// Call the export method.
				result = ExportTextManager.export(rodinEl);
			} catch (RodinDBException e) {
				Status status = new Status(IStatus.ERROR,
						Activator.PLUGIN_ID,
						"Failed TextOut: RodinDBException: "
						+ e.getMessage()  , e);
					StatusManager.getManager().handle(status,
						StatusManager.SHOW);
			} catch (Exception e) {
				Status status = new Status(IStatus.ERROR,
						Activator.PLUGIN_ID,
						"Failed TextOut: Exception: "
						+ e.getMessage()  , e);
					StatusManager.getManager().handle(status,
						StatusManager.SHOW);
			}
		}
		
		TextOutUtil.openFileForEditing(result, rodinProject);
		
		return null;
	}
}