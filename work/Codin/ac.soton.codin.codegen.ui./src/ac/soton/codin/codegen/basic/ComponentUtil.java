package ac.soton.codin.codegen.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eventb.codegen.il1.Call;
import org.eventb.codegen.tasking.RodinToEMFConverter;
import org.eventb.codegen.tasking.TaskingTranslationException;
import org.eventb.codegen.tasking.TaskingTranslationManager;
import org.eventb.emf.core.machine.Event;

import ac.soton.eventb.statemachines.AbstractNode;
import ac.soton.eventb.statemachines.State;
import ac.soton.eventb.statemachines.Statemachine;
import ac.soton.eventb.statemachines.Transition;

public class ComponentUtil {

	// Process state machines differ from synchronous state-machines. A process
	// SM translates to a 'vhdl' process. A synchronous SM translates to a
	// subroutine in the task, with a case statement in its body.
	// In IL1 we generate a task for the process,
	// the body contains branches and sequences, and calls to synchronous
	// state-machine subroutines.
	// First we generate state-'outgoing transition' info.
	public Call preProcessProcStateMachine(Statemachine statemachine,
			StateMachineTranslationManager smTranslationMgr)
			throws TaskingTranslationException {
		EList<AbstractNode> nodes = statemachine.getNodes();
		// foreach state we gather info in processState
		for (AbstractNode node : nodes) {
			preprocessNode(node, statemachine, smTranslationMgr);
		}
		return null;
	}

	private void preprocessNode(AbstractNode node, Statemachine statemachine,
			StateMachineTranslationManager smTranslationMgr)
			throws TaskingTranslationException {

		EList<Transition> outGoing = node.getOutgoing();

		// add each event that elaborates a transition to the list
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
					TaskingTranslationManager.elaboratesNamesList.add(event
							.getName());
				}
				eventList.add(event);
				smTranslationMgr.taskingTranslationManager.getEventTargMap()
						.put(event, t.getTarget());

				// store a link between the event and the state-machine
				// that has a transition that elaborates it.
				TaskingTranslationManager.getEvent_SM_Map().put(event,
						statemachine.getName());

			}
		}

		// add the eventList, associated with this state (and the node), to maps
		List<Event> storedEventList = smTranslationMgr.nodeEventMap.get(node);
		if (storedEventList == null) {
			smTranslationMgr.nodeEventMap.put(node, eventList);
			if (node instanceof State) {
				smTranslationMgr.stateEventMap.put((State) node, eventList);
			}
		} else {
			storedEventList.addAll(eventList);
			smTranslationMgr.nodeEventMap.put(node, storedEventList);
			if (node instanceof State) {
				smTranslationMgr.stateEventMap.put((State) node,
						storedEventList);
			}
		}

		// process nested states.
		// This adds internal transition info
		if (node instanceof State) {
			EList<Statemachine> containedSMList = ((State) node)
					.getStatemachines();
			for (Statemachine s : containedSMList) {
				preProcessProcStateMachine(s, smTranslationMgr);
			}
		}
	}

	public static void flattenStateMachine(
			StateMachineTranslationManager smTranslationMgr) {
		Map<State, Map<Event, AbstractNode>> unifiedMap = new HashMap<State, Map<Event, AbstractNode>>();
		unifiedMap.putAll(smTranslationMgr.current_NextStateMap);
		unifiedMap.putAll(smTranslationMgr.initial_NextStateMap);

		Map<State, Map<Event, AbstractNode>> updatedMap = new HashMap<State, Map<Event, AbstractNode>>();
		updatedMap.putAll(smTranslationMgr.current_NextStateMap);
		updatedMap.putAll(smTranslationMgr.initial_NextStateMap);

		// iterate through each state in the unified map comparing as we go
		for (State s1 : unifiedMap.keySet()) {
			// set up a map to compare the current s1->e1->n1, with this element
			// removed
			Map<State, Map<Event, AbstractNode>> compareMap = new HashMap<State, Map<Event, AbstractNode>>();
			compareMap.putAll(unifiedMap);
			compareMap.remove(s1);
			Map<Event, AbstractNode> eventStateMap = unifiedMap.get(s1);
			for (Event e1 : eventStateMap.keySet()) {
				AbstractNode n1 = eventStateMap.get(e1);
				// compare the s1->e1-n1 states with those in the comparison map
				for (State s2 : compareMap.keySet()) {
					Map<Event, AbstractNode> compareInner = compareMap.get(s2);
					for (Event e2 : compareInner.keySet()) {
						AbstractNode n2 = compareInner.get(e2);
						// Now we have found s2->e2->n2
						if (e1 == e2 && n1 == s2) {

							String n1Name = "";
							if (n1 instanceof State) {
								n1Name = ((State) n1).getName();
							} else {
								n1Name = n1.getInternalId();
							}

							String n2Name = "";
							if (n2 instanceof State) {
								n2Name = ((State) n2).getName();
							} else {
								n2Name = n2.getInternalId();
							}

							// replace as above

							Map<Event, AbstractNode> newMap = updatedMap
									.get(s1);
							newMap.put(e1, n2);
							smTranslationMgr.current_NextStateMap.put(s1,
									newMap);
							updatedMap.remove(s2);

							System.out.println("We matched:    " + s1.getName()
									+ "->" + e1.getName() + "->" + n1Name);
							System.out.println("with:          " + s2.getName()
									+ "->" + e2.getName() + "->" + n2Name);
							System.out.println("and set:       " + s1.getName()
									+ "->" + e1.getName() + "->" + n2Name);
							System.out.println("to be removed: " + s2.getName()
									+ "->" + e2.getName() + "->" + n2Name);

							System.out.println();

						}
					}
				}
			}
		}
		smTranslationMgr.flattenedNextStateMap = updatedMap;
	}
}
