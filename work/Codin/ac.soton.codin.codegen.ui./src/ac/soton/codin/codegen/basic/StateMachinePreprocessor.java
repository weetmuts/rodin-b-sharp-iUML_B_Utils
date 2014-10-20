package ac.soton.codin.codegen.basic;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eventb.codegen.tasking.TaskingTranslationException;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.machine.impl.MachineImpl;

import ac.soton.eventb.emf.components.Component;
import ac.soton.eventb.emf.components.ComponentAxiom;
import ac.soton.eventb.emf.components.ComponentInvariant;
import ac.soton.eventb.emf.components.ComponentsPackage;
import ac.soton.eventb.emf.components.diagram.edit.parts.ComponentEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ComponentNameEditPart;
import ac.soton.eventb.statemachines.Statemachine;

public class StateMachinePreprocessor {

	private static StateMachinePreprocessor singleton = null;
	private MachineImpl parentMachine = null;

	public static StateMachinePreprocessor getDefault() {
		if (singleton == null) {
			singleton = new StateMachinePreprocessor();
			return singleton;
		} else {
			return singleton;
		}
	}

	public void run(EventBElement source, 
			VHDL_TranslationData translationData)
			throws TaskingTranslationException, CodinTranslatorException {
		// The machine that we are working on.
		parentMachine = (MachineImpl) source;

		translationData.parentMachine = parentMachine;
		// selected components in the UI
		List<ComponentEditPart> selectedComponentEditList = CodinTranslator.selectedComponentList;
		// All components in the machine
		EList<EObject> componentEList = translationData.parentMachine
				.getAllContained(ComponentsPackage.Literals.COMPONENT, true);

		List<Component> componentArray = new ArrayList<Component>();
		for (EObject eo : componentEList) {
			if (eo instanceof Component) {
				componentArray.add((Component) eo);
			}
		}

		// keep track of (EMF) componentNames selected for code generation
		List<String> selectedComponentNames = new ArrayList<String>();
		// keep track of (EMF) components selected for code generation
		List<Component> selectedComponentList = new ArrayList<Component>();

		// foreach selected UI component, get the name, add to the list of
		// selected component names
		for (ComponentEditPart componentEditPart : selectedComponentEditList) {
			List<?> componentChildList = componentEditPart.getChildren();
			for (Object componentChild : componentChildList) {
				if (componentChild instanceof ComponentNameEditPart) {
					ComponentNameEditPart nameEditPart = (ComponentNameEditPart) componentChild;
					String selectedComponentName = nameEditPart.getFigure()
							.toString();
					selectedComponentNames.add(selectedComponentName);
				}
			}
		}
		// add the EMF component to a list of components
		// based on the name obtained from the UI
		for (Component component : componentArray) {
			if (selectedComponentNames.contains(component.getName())) {
				selectedComponentList.add(component);
			}			
		}
		
		// Check validity of component.
		// Each component must have exactly one processSM
		// and one synchSM
		
		checkValidity(selectedComponentList);
		
		// general info for downstream translation.
		collectData(translationData, selectedComponentList);

		// In the this first-pass pre-processing part we gather
		// events and state-machine information.
		ProcessSMAssistant processSMAssistant = new ProcessSMAssistant();
		SynchSMAssistant synchSMAssistant = new SynchSMAssistant();
		firstPassPreprocess(translationData, selectedComponentList,
				processSMAssistant);

		// In the second phase we use the data from the first pass to
		// produce flattened state-machines.
		secondPassPreprocess(translationData, processSMAssistant,
				synchSMAssistant);

		// do some output to console for debugging. Can be removed later.
		doTestPrintouts(translationData, processSMAssistant, synchSMAssistant);
	}

	private void checkValidity(List<Component> selectedComponentList) throws CodinTranslatorException {
		for(Component c: selectedComponentList){
			if(!(c.getSynchronousStatemachines().size() == 1 )){
				throw new CodinTranslatorException("Invalid count (" + c.getSynchronousStatemachines().size() 
						+ ") of Synchronous State-machines found in component: "
						+ c.getName());
			}
			if(!( c.getProcessStatemachines().size() == 1)){
				throw new CodinTranslatorException("Invalid count (" + c.getProcessStatemachines().size() 
						+ ") of Process State-machines found in component: "
						+ c.getName());
			}
		}
	}

	private void collectData(VHDL_TranslationData translationData,
			List<Component> selectedComponentList)
			throws CodinTranslatorException {
		// FOR EACH SELECTED COMPONENT >>>,
		// (1) add the invariant/axioms to lists, and get the
		// ancestors too.
		// (2) There is just one process state-machine per component,
		// for each component, add the process state-machine to a map of
		// ComponentName <-> ProcessStateMachine
		// (3) add the synchronous state-machines to the map of
		// ComponentName <-> ListOfStatemachines
		// (4) identify the state-machine's containing component and store it.
		for (Component component : selectedComponentList) {
			collectTypePredicates(translationData, component);
			// There should be just one process state-machine in the a codin
			// component. Lets get it, or throw an exception if there is more
			// than one.
			EList<Statemachine> procSM_EList = component
					.getProcessStatemachines();
			if (procSM_EList.size() > 1) {
				throw new CodinTranslatorException(
						"There is a limit of one process state-machine per component");
			} else if (procSM_EList.size() == 1) {
				// (2) store the process state machine in a map of componentName <->
				// StateMachine
				translationData.processSM_Map.put(component.getName(), procSM_EList.get(0));
				// (3) store the synchronous state machines in a map of
				// componentName <-> StateMachine
				List<Statemachine> synchronousStatemachines = component.getSynchronousStatemachines();
				translationData.synchronousSM_Map.put(component.getName(),
						synchronousStatemachines);
				// (4) store a map of state-machine <-> containing component
				for(Statemachine statemachine: synchronousStatemachines){
					translationData.SM_Component_Map.put(statemachine, component);
				}
			}
		}
	}


	private void collectTypePredicates(VHDL_TranslationData translationData, Component component) {
		// Get Invariants/Axioms of this component
		EList<ComponentInvariant> invariantList = component.getInvariants();
		List<String> iPredicateList = new ArrayList<String>();
		for(ComponentInvariant i: invariantList){
			iPredicateList.add(i.getPredicate());
		}
		List<String> existingIList = translationData.componentInvariantMap.get(component.getName());
		if(existingIList == null){
			existingIList = new ArrayList<String>();
		}
		for(String predicate: iPredicateList){
			if(!existingIList.contains(predicate)){
				existingIList.add(predicate);
			}
		}
		// Now do axioms
		EList<ComponentAxiom> axiomList = component.getAxioms();
		List<String> aPredicateList = new ArrayList<String>();
		for(ComponentAxiom a: axiomList){
			aPredicateList.add(a.getPredicate());
		}
		List<String> existingAList = translationData.componentAxiomMap.get(component.getName());
		if(existingAList == null){
			existingAList = new ArrayList<String>();
		}
		for(String predicate: aPredicateList){
			if(!existingAList.contains(predicate)){
				existingAList.add(predicate);
			}
		}
		// update the lists
		translationData.componentInvariantMap.put(component.getName(), existingIList);
		translationData.componentAxiomMap.put(component.getName(), existingAList);
		// get invariants of the ancestor
		Component ancestor = component.getRefines();
		if(ancestor != null){
			collectTypePredicates(translationData, ancestor);
		}
		else{
			// do nothing - we have no further refinements
		}
	}

	private void firstPassPreprocess(VHDL_TranslationData translationData,
			List<Component> selectedComponentList,
			ProcessSMAssistant processSMAssistant)
			throws TaskingTranslationException {
		for (Component component : selectedComponentList) {
			// add the component to the list of components
			translationData.componentList.add(component);
			
			Statemachine procSM = translationData.processSM_Map.get(component.getName());
			// if the component has a state-machine
			if (procSM != null) {
				// store relevant info in the translationData maps
				// for this component
				processSMAssistant.preProcessProcStateMachine(procSM,
						translationData);
			}
	
			// Find which SynchSMs relate to events in the procSM.
			// We use this to find out when a procSM 'calls' a synchSM .
			List<Statemachine> synchSMList = translationData.synchronousSM_Map
					.get(component.getName());
			translationData.synchSMList = synchSMList;
			for (Statemachine synchSM : synchSMList) {
				processSMAssistant.findProcessUsersOfSynchSM(synchSM,
						translationData);
			}
	
		}
	}

	private void secondPassPreprocess(VHDL_TranslationData translationData,
			ProcessSMAssistant processSMAssistant,
			SynchSMAssistant synchSMAssistant) {
		// Now the second-pass pre-processing: for each node, identify a
		// starting state; elaborating events on transitions, and a target
		// state. This gives us a map: State<->(Event<->Node)
		processSMAssistant.buildNextStateMaps(translationData);
		synchSMAssistant.buildNextStateMaps(translationData);
	}

	private void doTestPrintouts(VHDL_TranslationData translationData,
			ProcessSMAssistant processSMAssistant,
			SynchSMAssistant synchSMAssistant) {
		// do print-outs of process state machine
		processSMAssistant.testPrint_flattened_Event_Target(translationData);
		synchSMAssistant.testPrint_flattened_Event_Target(translationData);
		processSMAssistant.testPrint_transit_map(translationData);
	}
}