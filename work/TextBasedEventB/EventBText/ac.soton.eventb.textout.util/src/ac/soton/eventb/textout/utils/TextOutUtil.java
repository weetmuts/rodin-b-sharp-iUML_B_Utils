package ac.soton.eventb.textout.utils;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorRegistry;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.rodinp.core.IRodinProject;

public class TextOutUtil {

	// A place to store the cross references
	public static Map<String, String> crossRefMap = new HashMap<String, String>();
	
	
	public static void openFileForEditing(String fileName,
			IRodinProject rodinProject) {
		IFile file = rodinProject.getProject().getFile(fileName);
		IEditorDescriptor rodinEditorDesc = PlatformUI.getWorkbench().getEditorRegistry().findEditor("fr.systerel.editor.editors.RodinEditor");
		IEditorDescriptor defaultDesc = PlatformUI.getWorkbench().getEditorRegistry()
				.getDefaultEditor(file.getName());
		IEditorDescriptor desc = defaultDesc;
		if(defaultDesc.getId().equals("org.eventb.texteditor.ui.texteditor")){
			// we don't want to use camille so override the default with
			// the rodin editor
			desc  = rodinEditorDesc;
		}
		
		IWorkbenchWindow workbenchWindow = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();

		IWorkbenchPage page = workbenchWindow.getActivePage();
			IEditorPart editorPart;
			try {
				// This is where we open the file for editing
				editorPart = page.openEditor(new FileEditorInput(file), desc.getId());
				// Add the rodin keyboardListener if working
				if(editorPart instanceof XtextEditor){
//					AddRodinKeyboardListener.setup((XtextEditor) editorPart);
				}
			} catch (PartInitException e) {
				e.printStackTrace();
			}
	}
	

}
