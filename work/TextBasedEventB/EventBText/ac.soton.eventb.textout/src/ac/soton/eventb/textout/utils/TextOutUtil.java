package ac.soton.eventb.textout.utils;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.rodinp.core.IRodinProject;

import ac.soton.eventb.textout.Activator;

public class TextOutUtil {

	public static void openFileForEditing(String fileName, IRodinProject rodinProject) {
		IFile file = rodinProject.getProject().getFile(fileName);
		IEditorDescriptor rodinEditorDesc = PlatformUI.getWorkbench()
				.getEditorRegistry()
				.findEditor("fr.systerel.editor.editors.RodinEditor");
		IEditorDescriptor defaultDesc = PlatformUI.getWorkbench()
				.getEditorRegistry().getDefaultEditor(file.getName());
		IEditorDescriptor desc = defaultDesc;
		if (defaultDesc.getId().equals("org.eventb.texteditor.ui.texteditor")) {
			// we don't want to use camille, so override if camille is the
			// default, with
			// the rodin editor.
			desc = rodinEditorDesc;
		}

		IWorkbenchWindow workbenchWindow = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();

		IWorkbenchPage page = workbenchWindow.getActivePage();
		IEditorPart editorPart;
		try {
			// This is where we open the file for editing
			editorPart = page.openEditor(new FileEditorInput(file),
					desc.getId());
			// Add the rodin keyboardListener if working
			if (editorPart instanceof XtextEditor) {
				// AddRodinKeyboardListener.setup((XtextEditor) editorPart);
			}
		} catch (PartInitException e) {
			Status status = new Status(IStatus.ERROR,
					Activator.PLUGIN_ID,
					"Failed TextOut: PartInitException: "
					+ e.getMessage()  , e);
				StatusManager.getManager().handle(status,
					StatusManager.SHOW);
		}
	}

	// Used to determine if lists of variables, constants,
	// sets, parameters, need to be put on a separate line.
	// This happens when one of the elements has a comment.
	public static boolean hasComment(String s) {
			if(s.contains(COMMENT_CHAR)){
				return true;
			}
			else{
				return false;
			}
	}

	public static String COMMENT_CHAR = ">";

}
