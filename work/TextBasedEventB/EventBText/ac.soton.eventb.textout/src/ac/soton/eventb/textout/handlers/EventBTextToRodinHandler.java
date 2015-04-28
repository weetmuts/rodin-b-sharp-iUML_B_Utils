package ac.soton.eventb.textout.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.rodinp.core.IRodinProject;
import org.rodinp.core.RodinCore;

import ac.soton.eventb.textout.utils.ImportTextManager;
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


	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {

		IEditorPart editorPart = HandlerUtil.getActiveEditorChecked(event);
		Class<XtextEditor> xTextEditorClazz = XtextEditor.class;
		Class<? extends IEditorPart> thisEditorClazz = editorPart.getClass();

		if (thisEditorClazz == xTextEditorClazz) {
			XtextEditor xted = (XtextEditor)editorPart;
			IResource res = xted.getResource();
			
			// check we are in a rodin project
			String directoryName = res.getProject().getName();
			//String directoryName = uri.segment(uri.segmentCount() - 2);
			IRodinProject rodinProject = RodinCore.getRodinDB().getRodinProject(directoryName);
			if (rodinProject == null) {
				MessageDialog.openError(editorPart.getEditorSite().getShell(), directoryName,"Please use an Event-B Project");
				return null;
			}
			
			TextOutUtil.addXtextNature(rodinProject.getProject());
			
			String fileName = ImportTextManager.importText(rodinProject, res);
			
			//open the Rodin editor 
			if (fileName!=null) 
				TextOutUtil.openFileForEditing(fileName , rodinProject);
		}
		return null;
	}

	
}