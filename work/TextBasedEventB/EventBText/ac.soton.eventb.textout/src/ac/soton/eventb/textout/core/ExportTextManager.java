package ac.soton.eventb.textout.core;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eventb.core.basis.ContextRoot;
import org.eventb.core.basis.MachineRoot;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.EventBObject;
import org.eventb.emf.core.context.Context;
import org.eventb.emf.core.context.impl.ContextImpl;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.impl.MachineImpl;
import org.eventb.emf.persistence.synchroniser.SyncManager;
import org.rodinp.core.IRodinElement;
import org.rodinp.core.IRodinProject;
import org.rodinp.core.RodinDBException;

import ac.soton.eventb.textout.visitor.context.PrintableContext;
import ac.soton.eventb.textout.visitor.machine.PrintableMachine;

public class ExportTextManager {

	private static IRodinProject rodinProject = null;
	private static List<Machine> refinesEmfMachine = null;
	private static List<Context> extendsEmfContext = null;

	private Machine emfMachine = null;
	private Context emfContext = null;
	
	public void export(IRodinElement rodinElement) throws RodinDBException,
			Exception {
		Map<IRodinElement, EventBObject> map = new HashMap<IRodinElement, EventBObject>();
		map.clear();

		IResource rodinResource = rodinElement.getResource();
		ResourceSet rs = new ResourceSetImpl();	
		URI uri = URI.createPlatformResourceURI(rodinResource.getFullPath()
				.toOSString(), true);
		Resource emfResource = rs.getResource(uri, true);
		if(!emfResource.isLoaded()){
			emfResource.load(map);
		}
		EObject element = emfResource.getContents().get(0);
		
		rodinProject = rodinElement.getRodinProject();
		List<String> output = new ArrayList<String>();
		if (rodinElement.getClass() == MachineRoot.class) {
			emfMachine = (MachineImpl) element;			
			output.addAll(new PrintableMachine(emfMachine).print());
		} else if (rodinElement.getClass() == ContextRoot.class) {
			emfContext = (ContextImpl) element;
			output.addAll(new PrintableContext(emfContext).print());
		}
	}

	public static String adjustComment(String comment) {
		String adjustedComment = "";
		// add the comment characters if there is a comment
		if (comment != null && !comment.equals("")) {
			adjustedComment = "// " + comment;
		}
		
		String separator = System.getProperty("line.separator");
		adjustedComment = adjustedComment.replace(separator, " ");
		adjustedComment = adjustedComment.replace("\r", " ");
		// if the comment is null or "" then return ""
		return adjustedComment;
	}

	public static void saveToFile(List<String> output, String fileName) {
		IRodinProject rodinProject = ExportTextManager.rodinProject;
		IPath parentProjectPath = rodinProject.getProject().getLocation();
		String newFilePath = parentProjectPath.toString() + File.separatorChar
				+ fileName;
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(newFilePath));
			for (String line : output) {
				out.write(line + "\n");
			}
			out.close();
			rodinProject.getResource().refreshLocal(IResource.DEPTH_INFINITE,
					null);
		} catch (IOException e) {
			e.printStackTrace(System.out);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	public static void openFileForEditing(String fileName,
			IRodinProject rodinProject) {
		IFile file = rodinProject.getProject().getFile(fileName);
		IEditorDescriptor desc = PlatformUI.getWorkbench().getEditorRegistry()
				.getDefaultEditor(file.getName());
		IWorkbenchWindow workbenchWindow = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();

		IWorkbenchPage page = workbenchWindow.getActivePage();
			IEditorPart editorPart;
			try {
				editorPart = page.openEditor(new FileEditorInput(file), desc.getId());
				if(editorPart instanceof XtextEditor){
					AddRodinKeyboardListener.setup((XtextEditor) editorPart);
					
				}

			} catch (PartInitException e) {
				e.printStackTrace();
			}
			
			
	}

	public static IRodinProject getRodinProject() {
		return rodinProject;
	}
	public static List<Machine> getRefinesEmfMachine() {
		return refinesEmfMachine;
	}

	public static void setRefinesEmfMachine(List<Machine> refinesEmfMachine) {
		ExportTextManager.refinesEmfMachine = refinesEmfMachine;
	}

	public static List<Context> getExtendsEmfContext() {
		return extendsEmfContext;
	}

	public static void setExtendsEmfContext(List<Context> extendsEmfContext) {
		ExportTextManager.extendsEmfContext = extendsEmfContext;
	}

}

