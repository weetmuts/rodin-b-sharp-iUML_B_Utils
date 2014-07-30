package ac.soton.codin.codegen.basic;

import java.util.List;
import java.util.Map;

import org.eventb.codegen.il1.Case;
import org.eventb.codegen.il1.Il1Factory;
import org.eventb.codegen.il1.Subroutine;
import org.eventb.codegen.il1.Task;
import org.eventb.emf.core.machine.Event;

import ac.soton.eventb.statemachines.AbstractNode;
import ac.soton.eventb.statemachines.State;
import ac.soton.eventb.statemachines.Statemachine;

public class VHDL_IL1_Generator {

	private static VHDL_IL1_Generator singleton = null;

	public static VHDL_IL1_Generator getDefault() {
		if (singleton == null) {
			singleton = new VHDL_IL1_Generator();
			return singleton;
		} else {
			return singleton;
		}
	}

	public void process(Task task, StateMachineTranslationData smTranslationMgr) {
		// We can create a subroutine for each synchronous state-machine.
		Map<String, List<Statemachine>> synchronousSM_Map = smTranslationMgr.synchronousSM_Map;
		for (String componentName : synchronousSM_Map.keySet()) {
			List<Statemachine> stateMachineList = synchronousSM_Map
					.get(componentName);
			for (Statemachine statemachine : stateMachineList) {
				String stateMachineName = statemachine.getName();
				// Set up the subroutine that will implement the state-machine
				Subroutine smSubroutine = Il1Factory.eINSTANCE
						.createSubroutine();
				smSubroutine.setName(stateMachineName);
				smSubroutine.setTemporary(false);
				smSubroutine.setMachineName(smTranslationMgr.parentMachine
						.getName());
				smSubroutine.setProjectName(smTranslationMgr.parentProject
						.getElementName());
				task.getSubroutines().add(smSubroutine);

				// iterate through each state. Each state is a case
				// multiple events require a choice, derived from a guard.
				Map<State, Map<Event, AbstractNode>> stateMap = smTranslationMgr.synchSM_flattened_nextStateMap
						.get(statemachine);
				for (State state : stateMap.keySet()) {
					//create a new case-block for this state
					Case caseblock = Il1Factory.eINSTANCE.createCase();
					Il1Factory.eINSTANCE.createCase();
					smSubroutine.setBody(caseblock);
					caseblock.setCaseExpression(stateMachineName);
					caseblock.setEnvirStateMachineChild(false);
					
					
					// Get the events for this state
					Map<Event, AbstractNode> eventMap = stateMap.get(state);
					for(Event event: eventMap.keySet()){
						// get the target node for the event
						AbstractNode targetNode = eventMap.get(event);
						
					}
				}
			}
		}
	}

}
