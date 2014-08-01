package ac.soton.codin.codegen.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eventb.codegen.il1.Call;
import org.eventb.codegen.il1.Command;
import org.eventb.codegen.il1.Il1Factory;
import org.eventb.codegen.il1.Subroutine;
import org.eventb.codegen.il1.Task;
import org.eventb.emf.core.machine.Event;

import ac.soton.eventb.statemachines.AbstractNode;
import ac.soton.eventb.statemachines.Initial;
import ac.soton.eventb.statemachines.State;
import ac.soton.eventb.statemachines.Statemachine;
import ac.soton.eventb.statemachines.Transition;
import ac.soton.eventb.statemachines.impl.InitialImpl;

public class VHDL_IL1_ProcSMGenerator {

	private static VHDL_IL1_ProcSMGenerator singleton;

	public static VHDL_IL1_ProcSMGenerator getDefault() {
		if (singleton == null) {
			singleton = new VHDL_IL1_ProcSMGenerator();
			return singleton;
		} else {
			return singleton;
		}
	}

	public void makeProcSMStatement(Task task,
			StateMachineTranslationData smTranslationMgr)
			throws CodinTranslatorException {

		Map<String, Statemachine> procSMMap = smTranslationMgr.processSM_Map;
		for (String componentName : procSMMap.keySet()) {
			// get the process state-machine for this component
			Statemachine statemachine = procSMMap.get(componentName);
			EList<AbstractNode> nodeEList = statemachine.getNodes();
			for (AbstractNode node : nodeEList) {
				Class<? extends AbstractNode> clazz = node.getClass();
				if (clazz == InitialImpl.class) {
					beginFlow((Initial) node, smTranslationMgr);
				}
			}
		}
	}

	private void beginFlow(Initial initialNode,
			StateMachineTranslationData smTranslationMgr)
			throws CodinTranslatorException {
		List<Command> commandList = new ArrayList<Command>();
		EList<Transition> outgoingList = initialNode.getOutgoing();
		// find the initial state in the next-state map
		State dummyTopState = null;
		for (State state : smTranslationMgr.processSM_flattenedNextStateMap
				.keySet()) {
			if (state.getName().equals("dummyTopState")) {
				dummyTopState = state;
				break;
			}
		}
		Map<Event, AbstractNode> eventMap = null;
		// find the next-state map for the events of the initial state
		if (dummyTopState != null) {
			eventMap = smTranslationMgr.processSM_flattenedNextStateMap
					.get(dummyTopState);
		} else {
			throw new CodinTranslatorException(
					"Initial State not found in process state-machine.");
		}
		
		
		
		// we get the next state for the events from the initial transition
		for (Event event : eventMap.keySet()) {
			// How to handle multiple outgoing event/transitions when the
			// events do not elaborate the transitions
			Map<State, List<TransitPath>> transitPaths = smTranslationMgr.procSM_transitPaths;
			List<TransitPath> initialTransitionsPaths = transitPaths.get(dummyTopState);
			System.out.println();
			
			
			
			// If this event belongs to a synchronous state-machine then we
			// need to add a call the synchronous state-machine subroutine
			List<Statemachine> synchSMList = smTranslationMgr.synchSMEventUser.get(event);
			
			
			for(Statemachine statemachine: synchSMList){
				// get the subroutine for this synch statemachine
				Subroutine subroutine = smTranslationMgr.synchSM_subroutineMap.get(statemachine);
				Call call = Il1Factory.eINSTANCE.createCall();
				commandList.add(call);
				call.setSubroutine(subroutine);
			}
			AbstractNode nextState = eventMap.get(event);

			

			
			// we need to get all the guards from the transitions
			// that this state elaborates.
			

			
			
			
			
			System.out.println();
		}

	}
	
}
