package ac.soton.codin.codegen.basic;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eventb.codegen.il1.IL1Element;
import org.eventb.codegen.tasking.TaskingTranslationException;
import org.eventb.codegen.tasking.TaskingTranslationManager;
import org.eventb.codegen.tasking.utils.CodeGenTaskingUtils;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.machine.Action;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.impl.MachineImpl;

import ac.soton.eventb.emf.components.Component;
import ac.soton.eventb.emf.components.ComponentsPackage;
import ac.soton.eventb.emf.components.diagram.edit.parts.ComponentEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ComponentNameEditPart;
import ac.soton.eventb.statemachines.Statemachine;

public class StateMachineProcessor {

	private static StateMachineProcessor singleton = null;
	private MachineImpl parentMachine = null;

	public static StateMachineProcessor getDefault() {
		if (singleton == null) {
			singleton = new StateMachineProcessor();
			return singleton;
		} else {
			return singleton;
		}
	}

	public void run(EventBElement source, IL1Element actualTarget,
			TaskingTranslationManager translationManager,
			StateMachineTranslationData smTranslationData)
			throws TaskingTranslationException, CodinTranslatorException {
		// The machine that we are working on.
		parentMachine = (MachineImpl) source;

		smTranslationData.parentMachine = parentMachine;
		smTranslationData.taskingTranslationManager = translationManager;
		smTranslationData.actualTarget = actualTarget;
		// selected components in the UI
		List<ComponentEditPart> selectedComponentEditList = CodinTranslator.selectedComponentList;
		// All components in the machine
		EList<EObject> componentEList = smTranslationData.parentMachine
				.getAllContained(ComponentsPackage.Literals.COMPONENT, true);

		List<Component> componentArray = new ArrayList<Component>();
		for (EObject eo : componentEList) {
			if (eo instanceof Component) {
				componentArray.add((Component) eo);
			}
		}

		// names of components (EMF) selected for code generation
		List<String> selectedComponentNames = new ArrayList<>();
		// components (EMF) selected for code generation
		List<Component> selectedComponentList = new ArrayList<>();

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

		// FOR EACH SELECTED COMPONENT >>>,
		// add the synchronous state-machines to the map of
		// ComponentName <-> ListOfStatemachines
		// There is just one process state-machine per component,
		// for each component,
		// add the process state-machine to a map of
		// ComponentName <-> ProcessStateMachine
		for (Component component : selectedComponentList) {
			// There should be just one process state-machine in the a codin
			// component. Lets get it, or throw an exception if there is more
			// than one.
			EList<Statemachine> procSM_EList = component
					.getProcessStatemachines();
			if (procSM_EList.size() > 1) {
				throw new CodinTranslatorException(
						"There is a limit of one process state-machine per component");
			} else if (procSM_EList.size() == 1) {
				// store the process state machine in a map of componentName <->
				// StateMachine
				smTranslationData.processSM_Map.put(component.getName(), procSM_EList.get(0));
				// store the synchronous state machines in a map of
				// componentName <-> StateMachine
				smTranslationData.synchronousSM_Map.put(component.getName(),
						component.getSynchronousStatemachines());
			}
		}

		// for each component prepare for translation of its process
		// state-machine. In the this first-pass pre-processing part we gather
		// events and state-machine information.
		ProcessSMAssistant processSMAssistant = new ProcessSMAssistant();
		SynchSMAssistant synchSMAssistant = new SynchSMAssistant();
		for (Component component : selectedComponentList) {
			Statemachine procSM = smTranslationData.processSM_Map.get(component.getName());
			// if the component has a state-machine
			if (procSM != null) {
				// store relevant info in the smTranslationMgr maps
				// for this component
				processSMAssistant.preProcessProcStateMachine(procSM,
						smTranslationData);
			}

			// Find which SynchSMs relate to events in the procSM.
			// We use this to find out when a procSM 'calls' a synchSM .
			List<Statemachine> synchSMList = smTranslationData.synchronousSM_Map
					.get(component.getName());
			for (Statemachine synchSM : synchSMList) {
				processSMAssistant.findProcessUsersOfSynchSM(synchSM,
						smTranslationData);
			}

		}

		// Now the second-pass pre-processing: for each node, identify a
		// starting state; elaborating events on transitions, and a target
		// state. This gives us a map: State<->(Event<->Node)
		processSMAssistant.buildNextStateMaps(smTranslationData);
		synchSMAssistant.buildNextStateMaps(smTranslationData);

		// do print-outs of process state machine
		processSMAssistant.testPrint_flattened_Event_Target(smTranslationData);
		synchSMAssistant.testPrint_flattened_Event_Target(smTranslationData);
		
	}

	private void removeStateUpdateAction(String stateMachineName, Event event) {
		// The code above removes the guard that appears in the 'case' statement
		// of a state-machine implementation.

		// We also replace the state-update assignment with a call to the
		// next-state subroutine. We repeat the algorithm above for actions,
		// then substitute in a call instead.

		EList<Action> actionList = event.getActions();
		int idx2 = -1;
		boolean found2 = false;
		for (Action action : actionList) {
			idx2++;
			String actionString = CodeGenTaskingUtils
					.makeSingleSpaceBetweenElements(action.getAction());
			String nextStateAssignment = stateMachineName + " "
					+ CodeGenTaskingUtils.ASSIGNMENT_SYMBOL + " ";
			if (actionString.startsWith(nextStateAssignment)) {
				found2 = true;
				break;
			}
		}
		if (found2) {
			actionList.remove(idx2);
		}
	}
}