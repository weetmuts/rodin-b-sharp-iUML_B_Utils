package ac.soton.eventb.textout.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eventb.emf.core.CorePackage;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.context.Context;
import org.eventb.emf.core.context.impl.ContextImpl;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.impl.MachineImpl;
import org.eventb.emf.persistence.EMFRodinDB;
import org.rodinp.core.IRodinElement;
import org.rodinp.core.IRodinProject;
import org.rodinp.core.RodinDBException;

import ac.soton.eventb.statemachines.StatemachinesPackage;
import ac.soton.eventb.textout.Activator;
import ac.soton.eventb.textout.visitor.context.PrintableContext;
import ac.soton.eventb.textout.visitor.machine.PrintableMachine;

public class ExportTextManager {

	private static IRodinProject rodinProject = null;
	private static List<Machine> refinesEmfMachine = null;
	private static List<Context> extendsEmfContext = null;

	private static Machine emfMachine = null;
	private static Context emfContext = null;
	
	// Set this to true to switch from printing the file as an output stream to using the XTEXT serialisation
	// Currently there are problems getting the XTEXT serialisation to work
	// 1) For XTEXT serialisation usupported features have to be unset in the model (works but we change the model)
	// 2) Statemachines have eOpposite incoming-target and outgoing-source which are not supported in XTEXT
	// 3) XTEXT serialisation fails at the Event sequencer 
	// 4) The output is unformatted (single line)
	
	private static boolean TRY_SERIALISE = false;
	private static List<EStructuralFeature> unsupportedFeatures = new ArrayList<EStructuralFeature>();
	static {
		unsupportedFeatures.add(CorePackage.Literals.EVENT_BOBJECT__ANNOTATIONS);
		unsupportedFeatures.add(CorePackage.Literals.EVENT_BELEMENT__INTERNAL_ID);
		unsupportedFeatures.add(CorePackage.Literals.ABSTRACT_EXTENSION__EXTENSION_ID);
		unsupportedFeatures.add(CorePackage.Literals.EVENT_BELEMENT__ATTRIBUTES);
		unsupportedFeatures.add(CorePackage.Literals.EVENT_BELEMENT__LOCAL_GENERATED);
		//these should be supported!!
		unsupportedFeatures.add(StatemachinesPackage.Literals.STATEMACHINE__SELF_NAME);
	}
	
	public static void export(IRodinElement rodinElement) throws RodinDBException,Exception {

		
		// cache rodin project for use when saving
		rodinProject = rodinElement.getRodinProject();
		// Load the EMF model associated with the machine/context
		IResource rodinResource = rodinElement.getResource();
		URI uri = URI.createPlatformResourceURI(rodinResource.getFullPath().toOSString(), true);
		EObject element = EMFRodinDB.INSTANCE.loadEventBComponent(uri);
		
		if (element instanceof Machine){
			uri = uri.trimFileExtension().appendFileExtension("mch");
		}else if (element instanceof Context){
			uri = uri.trimFileExtension().appendFileExtension("ctx");
		}else return;
		
		if (TRY_SERIALISE){
			//Would prefer to make a copy to avoid altering our model, but this might cause problems for XTEXT
			//Copier copier = new Copier();
			//EObject result = copier.copy(element);
			//copier.copyReferences();
			EObject result = element;
			if (result instanceof EventBElement){
				clean(result);  //removes the unsupported features
				EMFRodinDB.INSTANCE.saveResource(uri, (EventBElement)result);
			}
		}else{
			List<String> output = new ArrayList<String>();
			// The start of text conversion is here >>
			if (element.getClass() == MachineImpl.class) {
				emfMachine = (MachineImpl) element;			
				output.addAll(new PrintableMachine(emfMachine).print());
			} else if (element.getClass() == ContextImpl.class) {
				emfContext = (ContextImpl) element;
				output.addAll(new PrintableContext(emfContext).print());
			}
			ExportTextManager.saveToFile(output, uri.lastSegment());
		}
		
		TextOutUtil.openFileForEditing(uri.lastSegment(), rodinProject);	
	}
	
	private static void clean(EObject e){
		EList<EStructuralFeature> features = e.eClass().getEAllStructuralFeatures();
		for (EStructuralFeature feature : unsupportedFeatures){
			if (features.contains(feature)){
				e.eUnset(feature);
			}	
		}		
		for (EObject c : e.eContents()){
			clean(c);
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
			
			BufferedWriter out = new BufferedWriter
				    (new OutputStreamWriter(new FileOutputStream(newFilePath),"UTF-8"));
			
//			BufferedWriter out = new BufferedWriter(new FileWriter(newFilePath));
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

