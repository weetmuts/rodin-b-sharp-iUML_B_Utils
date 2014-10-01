package ac.soton.codin.codegen.basic;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eventb.codegen.il1.Il1Factory;
import org.eventb.codegen.il1.Program;
import org.eventb.codegen.il1.Task;
import org.eventb.codegen.il1.impl.Il1PackageImpl;
import org.eventb.codegen.il1.translator.AbstractTranslateEventBToTarget;
import org.eventb.codegen.il1.translator.ClassHeaderInformation;
import org.eventb.codegen.il1.translator.IL1TranslationManager;
import org.eventb.codegen.il1.translator.TargetLanguage;
import org.eventb.codegen.tasking.TaskingTranslationManager;
import org.eventb.core.IEventBProject;
import org.eventb.core.IMachineRoot;
import org.eventb.emf.core.machine.MachinePackage;
import org.eventb.emf.core.machine.impl.MachineImpl;
import org.eventb.emf.persistence.factory.RodinResource;
import org.rodinp.core.IRodinProject;

import ac.soton.codin.codegen.formatter.Formatter;
import ac.soton.codin.codegen.quickPrint.QuickPrinter;
import ac.soton.codin.codegen.quickPrint.UnicodeReplaceUtil;
import ac.soton.eventb.emf.components.diagram.edit.parts.ComponentEditPart;
import ac.soton.eventb.emf.components.impl.ComponentImpl;

public class CodinTranslator extends AbstractTranslateEventBToTarget {

	private IMachineRoot machineRoot = null;
	private static TaskingTranslationManager taskingTranslationManager = null;
	private static TargetLanguage targetLanguage = null;
	// the components that have been selected for translation
	public static List<ComponentEditPart> selectedComponentList = new ArrayList<>();
	private MachineImpl emfMachine = null;
	private static IFile target;
	private IRodinProject rodinProject;

	public void translate(IStructuredSelection selection)
			throws Exception {
		// set the list of components to be translated
		if(selection.size() > 1){
			throw new CodinTranslatorException("This tool only handles one component at a time (for now?).");
		}

		for (Object s : selection.toList()) {
			if (s instanceof ComponentEditPart) {
				selectedComponentList.add((ComponentEditPart) s);
			}
		}
		// get the first (component) item.collection.
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
			rodinProject = rodinResource.getRodinFile()
					.getRodinProject();
			IEventBProject eventBProject = (IEventBProject) rodinProject
					.getAdapter(IEventBProject.class);
			machineRoot = eventBProject.getMachineRoot(emfMachine.getName());
			if (machineRoot == null) {
				throw new CodinTranslatorException(
						"MachineRoot not found for: " + emfMachine.getName());
			}
		}
		target = machineRoot.getResource();
		doTranslation(machineRoot);
		machineRoot.getRodinProject().getResource().refreshLocal(IResource.DEPTH_INFINITE, null);
	}

	private void doTranslation(IMachineRoot machineRoot)
			throws Exception {
		// Initialisations
		// Initialise the tasking translation manager
		Il1PackageImpl.init();
		Il1Factory factory = Il1Factory.eINSTANCE;
		// create a new class to store translation info
		VHDL_TranslationData translationData = new VHDL_TranslationData();
		// and we made need the previous tasking translation manager
		taskingTranslationManager = new TaskingTranslationManager(factory);
		translationData.taskingTranslationManager = taskingTranslationManager;
		translationData.parentProject = machineRoot.getParent().getRodinProject();
		// prevent tasking static checks on Task Body and so on
		TaskingTranslationManager.setTranslationType("non-tasking");
		Program program = Il1Factory.eINSTANCE.createProgram();
		// create a protected
		Task task = Il1Factory.eINSTANCE.createTask();
		// add it to the program
		program.getTaskTypeTasks().add(task);
		translationData.program = program;
		// do the translation of the state machines
		VHDL_IL1_SMGenerator.getDefault().run(task, translationData, emfMachine);
		// add variables and initialisations etc
		VHDL_IL1_DeclarationsGenerator.getDefault().run(translationData);
		// Save the IL1 model.
		program.setName(translationData.currentComponent.getName());
		saveBaseProgram(program, targetFile(target));
		// pass it to the quickprinter
		QuickPrinter qp = new QuickPrinter(translationData, program, rodinProject);
		qp.printToFile();
		Formatter f = new Formatter();
		f.formatVHDL(translationData);
		UnicodeReplaceUtil replacer = new UnicodeReplaceUtil();
		replacer.run(translationData); 
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
