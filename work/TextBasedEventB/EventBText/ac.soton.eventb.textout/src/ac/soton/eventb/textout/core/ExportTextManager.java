package ac.soton.eventb.textout.core;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eventb.emf.core.EventBObject;
import org.eventb.emf.core.context.Context;
import org.eventb.emf.core.context.impl.ContextImpl;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.impl.MachineImpl;
import org.rodinp.core.IRodinElement;
import org.rodinp.core.IRodinProject;
import org.rodinp.core.RodinDBException;

import ac.soton.eventb.textout.Activator;
import ac.soton.eventb.textout.utils.TextOutUtil;
import ac.soton.eventb.textout.visitor.context.PrintableContext;
import ac.soton.eventb.textout.visitor.machine.PrintableMachine;

public class ExportTextManager {

	private static IRodinProject rodinProject = null;
	private static List<Machine> refinesEmfMachine = null;
	private static List<Context> extendsEmfContext = null;

	private static Machine emfMachine = null;
	private static Context emfContext = null;
	
	public static void export(IRodinElement rodinElement) throws RodinDBException,
			Exception {
		Map<IRodinElement, EventBObject> map = new HashMap<IRodinElement, EventBObject>();
		map.clear();
		// Store the rodin project for use when saving
		rodinProject = rodinElement.getRodinProject();
		// Load the EMF model associated with the machine/context
		IResource rodinResource = rodinElement.getResource();
		ResourceSet rs = new ResourceSetImpl();	
		URI uri = URI.createPlatformResourceURI(rodinResource.getFullPath()
				.toOSString(), true);
		Resource emfResource = rs.getResource(uri, true);
		if(!emfResource.isLoaded()){
			emfResource.load(map);
		}
		EObject element = emfResource.getContents().get(0);
		List<String> output = new ArrayList<String>();
		if (element.getClass() == MachineImpl.class) {
			emfMachine = (MachineImpl) element;			
			output.addAll(new PrintableMachine(emfMachine).print());
		} else if (element.getClass() == ContextImpl.class) {
			emfContext = (ContextImpl) element;
			output.addAll(new PrintableContext(emfContext).print());
		}
	}

	public static String adjustComment(String comment) {
		String adjustedComment = "";
		// add the comment characters if there is a comment,
		// after replacing "s with ', " becomes the comment delimiter
		if (comment != null && !comment.equals("")) {
			adjustedComment = comment.replaceAll("\"", "'");
			adjustedComment = TextOutUtil.COMMENT_CHAR +" \"" + adjustedComment + "\"";
		}
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
			Status status = new Status(IStatus.ERROR,
					Activator.PLUGIN_ID,
					"Failed TextOut: IOException: "
					+ e.getMessage()  , e);
				StatusManager.getManager().handle(status,
					StatusManager.SHOW);
		} catch (CoreException e) {
			Status status = new Status(IStatus.ERROR,
					Activator.PLUGIN_ID,
					"Failed TextOut: CoreException: "
					+ e.getMessage()  , e);
				StatusManager.getManager().handle(status,
					StatusManager.SHOW);
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

