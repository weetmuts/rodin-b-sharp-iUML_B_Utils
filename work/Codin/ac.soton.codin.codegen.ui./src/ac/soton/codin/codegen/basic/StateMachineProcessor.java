package ac.soton.codin.codegen.basic;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eventb.codegen.il1.Call;
import org.eventb.codegen.il1.IL1Element;
import org.eventb.codegen.tasking.RodinToEMFConverter;
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
import ac.soton.eventb.statemachines.AbstractNode;
import ac.soton.eventb.statemachines.Initial;
import ac.soton.eventb.statemachines.State;
import ac.soton.eventb.statemachines.Statemachine;
import ac.soton.eventb.statemachines.Transition;

public class StateMachineProcessor {

	private static StateMachineProcessor singleton = null;

	public static StateMachineProcessor getDefault() {
		if (singleton == null) {
			singleton = new StateMachineProcessor();
			return singleton;
		} else {
			return singleton;
		}
	}

	private MachineImpl parentMachine = null;

	public Call run(EventBElement source, IL1Element actualTarget,
			TaskingTranslationManager translationManager)
			throws TaskingTranslationException, CodinTranslatorException {
		// The machine that we are working on.
		parentMachine  = (MachineImpl) source;
		// selected components in the UI
		List<ComponentEditPart> selectedComponentEditList = CodinTranslator.selectedComponentList;
		// All components in the machine
		EList<EObject> componentEList = parentMachine.getAllContained(ComponentsPackage.Literals.COMPONENT, true);
		
		
		
		List<Component> componentArray = new ArrayList<Component>();
		for(EObject eo: componentEList){
			if(eo instanceof Component){ componentArray.add((Component) eo);}
		}
		
		// names of components (EMF) selected for code generation
		List<String> selectedComponentNames = new ArrayList<>();
		// components (EMF) selected for code generation
		List<Component> selectedComponentList = new ArrayList<>();
		
		// foreach selected UI component, get the name, add to the list of selected component names
		for(ComponentEditPart componentEditPart: selectedComponentEditList){
			List<?> componentChildList = componentEditPart.getChildren();
			for(Object componentChild : componentChildList){
				if(componentChild instanceof ComponentNameEditPart){
					ComponentNameEditPart nameEditPart = (ComponentNameEditPart) componentChild;
					String selectedComponentName = nameEditPart.getFigure().toString();
					selectedComponentNames.add(selectedComponentName);
				}
			}
		}
		// add the EMF component based on the name
		for(Component component: componentArray){
			
			if(selectedComponentNames.contains(component.getName())){
				selectedComponentList.add(component);
			}
		}

		
		Map<String, List<Statemachine>> synchSMMap = new HashMap<String,List<Statemachine>>();
		Map<String, Statemachine> procSMMap = new HashMap<String,Statemachine>();
		// Foreach component, add the synchronous state-machines to a map of NAME <-> ListOfState-machines
		// There is just one process state-machine per component, foreach component add the process 
		// state-machine to a map of NAME <-> ProcessStateMachine 
		for(Component component: selectedComponentList){
			// There should be just one process state-machine in the a codin component.
			// Lets get it, or throw an exception if there is more than one.
			EList<Statemachine> procSMEList = component.getProcessStatemachines();
			if(procSMEList.size()>1){
				throw new CodinTranslatorException("There is a limit of one process state-machine per component");
			}
			else{
				procSMMap.put(component.getName(), procSMEList.get(0));
			}
			synchSMMap.put(component.getName(), component.getSynchronousStatemachines());
		}
		
		// foreach component translate its process state-machine; translate to seq/branching structure, 
		// and also calls to synchronous SM.
		for(Component component: selectedComponentList){
			translateProcStateMachine(procSMMap.get(component.getName()),
					actualTarget, translationManager);
		}
		
		return null;

	}

	private Call translateProcStateMachine(Statemachine statemachine,
			IL1Element actualTarget,
			TaskingTranslationManager translationManager)
			throws TaskingTranslationException {
		
		EList<AbstractNode> nodes = statemachine.getNodes();
		List<String> stateNames = new ArrayList<String>();
		String stateMachineName = statemachine.getName();

		// It is useful to have a map of stateNames to a list of outgoing events
		Map<String, List<Event>> stateEventMap = new HashMap<String, List<Event>>();
		
		for (AbstractNode node : nodes) {
			int branchCount = 0;

			if (node instanceof Initial) {
				// The initial transition supplies the
				// entry point (the first state)
			} else if (node instanceof State) {
				State si = (State) node;
				String stateName = si.getName();
				stateNames.add(stateName);

				EList<Transition> outGoing = si.getOutgoing();
				// add the events of the outgoing transition to the hashmap
				branchCount = branchCount + outGoing.size();

				List<Event> eventList = new ArrayList<Event>();
				for (Transition t : outGoing) {
					EList<Event> events = t.getElaborates();
					// sometimes we obtain a proxy which will need to be
					// resolved
					for (Event event : events) {
						if (event.eIsProxy()) {
							event = (Event) EcoreUtil.resolve(event,
									RodinToEMFConverter.machineResSet);
						}
						// add this event to the list of transition elaborates
						// events
						// these events do not need to be constructed in
						// machines
						if (!TaskingTranslationManager.elaboratesNamesList
								.contains(event.getName())) {
							TaskingTranslationManager.elaboratesNamesList
									.add(event.getName());
						}
						eventList.add(event);
						translationManager.getEventTargMap().put(event,
								t.getTarget());

						// this is where we store the link between the event and
						// the statemachine
						// that has a transition that elaborates it.
						TaskingTranslationManager.getEvent_SM_Map().put(event,
								stateMachineName);

					}
				}
				stateEventMap.put(stateName, eventList);
			}
		}

		
		
		return null;
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
					.makeSingleSpaceBetweenElements(action
							.getAction());
			String nextStateAssignment = stateMachineName + " "+ CodeGenTaskingUtils.ASSIGNMENT_SYMBOL + " ";
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
