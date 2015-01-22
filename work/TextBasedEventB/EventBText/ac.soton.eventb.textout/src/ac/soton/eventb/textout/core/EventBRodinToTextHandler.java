package ac.soton.eventb.textout.core;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eventb.core.IContextRoot;
import org.eventb.core.IMachineRoot;
import org.rodinp.core.IElementType;
import org.rodinp.core.IRodinElement;
import org.rodinp.core.IRodinFile;
import org.rodinp.core.IRodinProject;
import org.rodinp.core.RodinCore;
import org.rodinp.core.RodinDBException;

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

		// The next sequence gets the RodinElement from the project
		String fName = uri.lastSegment();

		IRodinFile rodinFile = rodinProject.getRodinFile(fName);
		IElementType<? extends IRodinElement> elType = rodinFile
				.getRootElementType();

		String elId = elType.getId();
		// If it's a machine or context then export it
		if (elId.equals(IMachineRoot.ELEMENT_TYPE.getId()) ||
				elId.equals(IContextRoot.ELEMENT_TYPE.getId())) {
			
			IRodinElement rodinEl = (IRodinElement) rodinFile;
			try {
				// Call the export method.
				ExportTextManager.export(rodinEl);
			} catch (RodinDBException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}
}