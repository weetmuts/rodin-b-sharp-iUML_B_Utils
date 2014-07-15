package ac.soton.codin.codegen.basic;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eventb.codegen.il1.Il1Factory;
import org.eventb.codegen.il1.Program;
import org.eventb.codegen.il1.Protected;
import org.eventb.codegen.il1.Subroutine;
import org.eventb.codegen.il1.impl.Il1PackageImpl;
import org.eventb.codegen.il1.translator.AbstractTranslateEventBToTarget;
import org.eventb.codegen.il1.translator.ClassHeaderInformation;
import org.eventb.codegen.il1.translator.IL1TranslationManager;
import org.eventb.codegen.il1.translator.TargetLanguage;
import org.eventb.codegen.tasking.RMLDataStruct;
import org.eventb.codegen.tasking.TaskingTranslationException;
import org.eventb.codegen.tasking.TaskingTranslationManager;
import org.eventb.core.IEventBProject;
import org.eventb.core.IMachineRoot;
import org.eventb.emf.core.machine.MachinePackage;
import org.eventb.emf.core.machine.impl.MachineImpl;
import org.eventb.emf.persistence.factory.RodinResource;
import org.osgi.service.prefs.BackingStoreException;
import org.rodinp.core.IRodinProject;

import ac.soton.eventb.emf.components.diagram.edit.parts.ComponentEditPart;
import ac.soton.eventb.emf.components.impl.ComponentImpl;

public class CodinTranslator extends AbstractTranslateEventBToTarget{

	private IMachineRoot machineRoot = null;
	private static TaskingTranslationManager taskingTranslationManager = null;
	private static TargetLanguage targetLanguage = null;
	// the components that have been selected for translation
	private IStructuredSelection selectedComponents = null;
	private MachineImpl emfMachine = null;

	public void translate(IStructuredSelection selection)
			throws CodinTranslatorException, TaskingTranslationException, BackingStoreException, CoreException, IOException, URISyntaxException {

		// set the field
		selectedComponents = selection;
		// get the first (component) item.
		Object item = selection.getFirstElement();

		ComponentEditPart selectedEditPart = null;
		if (!(item instanceof ComponentEditPart)) {
			throw new CodinTranslatorException(
					"Only components can be selected for translation");
		} else {
			selectedEditPart = (ComponentEditPart) item;
		}

		// The translator works on the machineRoot, get this.
		ComponentImpl eventBComponent = (ComponentImpl) selectedEditPart
				.getNotationView().getElement();
		emfMachine = (MachineImpl) eventBComponent
				.getContaining(MachinePackage.Literals.MACHINE);
		if (emfMachine == null) {
			throw new CodinTranslatorException(
					"Machine for translation not found for component: "
							+ eventBComponent.getName());
		}
		Resource resource = emfMachine.eResource();
		if (resource instanceof RodinResource) {
			RodinResource rodinResource = (RodinResource) resource;
			IRodinProject rodinProject = rodinResource.getRodinFile()
					.getRodinProject();
			IEventBProject eventBProject = (IEventBProject) rodinProject
					.getAdapter(IEventBProject.class);
			machineRoot  = eventBProject.getMachineRoot(emfMachine.getName());
			if(machineRoot == null){
				throw new CodinTranslatorException("MachineRoot not found for: " 
						+ emfMachine.getName());
			}
		}
//		super.setSelection(newSelection);
		doTranslation(machineRoot);
	}

	private void doTranslation(IMachineRoot machineRoot) throws TaskingTranslationException, BackingStoreException, CoreException, IOException, URISyntaxException, CodinTranslatorException {
		// Initialisations
		// Initialise the tasking translation manager
		Il1PackageImpl.init();
		Il1Factory factory = Il1Factory.eINSTANCE;
		taskingTranslationManager  = new TaskingTranslationManager(factory);
		// prevent tasking static checks on Task Body and so on
		TaskingTranslationManager.setTranslationType("non-tasking");
		// Generate an IL1 program using existing stage 1 code generator.
		Program program = translateEventBToIL1(machineRoot);
		// create a protected
		Protected prot = Il1Factory.eINSTANCE.createProtected();
		// add it to the program
		program.getProtected().add(prot);
		//get the selected components state-machine diagrams
		
		
		// run the state-machine processor on the state-machines
		StateMachineProcessor stateMachineProcessor = StateMachineProcessor.getDefault();
		stateMachineProcessor.run(emfMachine, prot, taskingTranslationManager);

		// add variables and initialisations etc
		
		
		System.out.println();
		
	}

	
	// This method translates Event-B models into an IL1 program
	private static Program translateEventBToIL1(IMachineRoot machineRoot)
			throws TaskingTranslationException, BackingStoreException,
			CoreException, IOException, URISyntaxException,
			CodinTranslatorException {
		// indicate to the tasking translation manager that we are undertaking
		// an FMU translation.
		// We need this since the FMU translation type is optional and may well
		// be removed.;
		taskingTranslationManager.setFMUTranslation(false);
		// load the EMF components
		RMLDataStruct loadedEMFComponents = EMFLoader
				.loadEMFMachinesContexts(machineRoot);
		// insert the machineRoot into an array to send to the translator
		List<Object> componentList = new ArrayList<Object>();
		componentList.add(machineRoot);
		Object[] componentArrays = componentList.toArray();

		IFile target = null;
		// Get target's location from the list which is derived from the
		// structured selection.
		target = machineRoot.getResource();
		storeProject(target.getProject(), taskingTranslationManager);

		Program program = taskingTranslationManager.translateToIL1Entry(
				componentArrays, null, null, null, loadedEMFComponents);

		// We delete the temporary subroutines
		EList<Protected> protectedList = program.getProtected();
		for (Protected prot : protectedList) {
			EList<Subroutine> subroutineList = prot.getSubroutines();
			List<Subroutine> tmpSubroutine = new ArrayList<Subroutine>();
			for (Subroutine subroutine : subroutineList) {
				if (!subroutine.isTemporary()) {
					tmpSubroutine.add(subroutine);
				}
			}
			if (tmpSubroutine.size() != subroutineList.size()) {
				subroutineList.clear();
				subroutineList.addAll(tmpSubroutine);
			}
		}
		saveBaseProgram(program, targetFile(target));
		// We reset this flag, since we have finished.
		taskingTranslationManager.setFMUTranslation(false);
		return program;
	}

	// set the project fiels in the translation manager for
	// use in downstream processing
	private static void storeProject(IProject project,
			TaskingTranslationManager translationManager) {
		translationManager.setProject(project);
	}

	// Create the file associated with the output
	// The sourceRes is the container of the MainClass
	// element that we want to transform
	protected static String targetFile(IFile source) throws URISyntaxException {
		java.net.URI location = source.getLocationURI();
		IPath p = new Path(location.getPath());
		IPath newPath = p.removeFileExtension();
		String path = newPath + ".il1";
		return path;
	}
	
	// save the program at the given location
	protected static void saveBaseProgram(Program program, String filename)
			throws IOException {
		URI uri = URI.createFileURI(filename);
		Resource outResource = new XMLResourceFactoryImpl().createResource(uri);
		outResource.getContents().add(program);
		outResource.save(null);
	}

	
	@Override
	protected TargetLanguage getTargetLanguage() {
		return targetLanguage;
	}

	@Override
	protected ArrayList<String> formatCode(ArrayList<String> code,
			IL1TranslationManager translationManager) {
		// Intentionally empty
		return null;
	}

	@Override
	protected void saveToFile(ArrayList<String> codeToSave,
			ArrayList<ClassHeaderInformation> headerInformation,
			Program program, String directoryName,
			IL1TranslationManager translationManager) {
		// Intentionally blank
	}

}
