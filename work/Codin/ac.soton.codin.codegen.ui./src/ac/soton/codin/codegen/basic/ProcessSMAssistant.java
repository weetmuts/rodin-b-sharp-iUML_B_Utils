package ac.soton.codin.codegen.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eventb.codegen.tasking.RodinToEMFConverter;
import org.eventb.codegen.tasking.TaskingTranslationException;
import org.eventb.codegen.tasking.TaskingTranslationManager;
import org.eventb.emf.core.machine.Event;

import ac.soton.eventb.statemachines.AbstractNode;
import ac.soton.eventb.statemachines.Initial;
import ac.soton.eventb.statemachines.Junction;
import ac.soton.eventb.statemachines.State;
import ac.soton.eventb.statemachines.Statemachine;
import ac.soton.eventb.statemachines.StatemachinesFactory;
import ac.soton.eventb.statemachines.StatemachinesPackage;
import ac.soton.eventb.statemachines.Transition;

public class ProcessSMAssistant {

	public void findProcessUsersOfSynchSM(Statemachine statemachine,
			StateMachineTranslationData smTranslationData) {
		// Store a map of all the synchronous state machine events and which
		// state-machines they play for!
		// Event <-> List<state-machine>.
		// If such an event appears in a process state-machine's stateEventMap
		// the a call invoking the synch SM must occur.
		EList<EObject> transitionList = statemachine.getAllContained(
				StatemachinesPackage.Literals.TRANSITION, true);
		for (EObject eo : transitionList) {
			if (eo instanceof Transition) {
				Transition transition = (Transition) eo;
				EList<Event> elaboratesList = transition.getElaborates();
				for (Event event : elaboratesList) {
					// if the event has no state machines associated with it
					List<Statemachine> stateMachineList = smTranslationData.synchSMEventUser
							.get(event);
					if (stateMachineList == null) {
						List<Statemachine> newSMList_ = new ArrayList<Statemachine>();
						newSMList_.add(statemachine);
						smTranslationData.synchSMEventUser.put(event, newSMList_);
					} else {
						stateMachineList.add(statemachine);
						smTranslationData.synchSMEventUser.put(event,
								stateMachineList);
					}
				}
			}
		}
	}

	// Process state machines differ from synchronous state-machines. A process
	// SM translates to a 'vhdl' process. A synchronous SM translates to a
	// subroutine in the task, with a case statement in its body.
	// In IL1 we generate a task for the process,
	// the body contains branches and sequences, and calls to synchronous
	// state-machine subroutines.
	// First we generate state-'outgoing transition' info.
	public void preProcessProcStateMachine(Statemachine statemachine,
			StateMachineTranslationData smTranslationData)
			throws TaskingTranslationException {
		// Reset the maps (relating states-events-nextStates)
		// for the process state-machine.
		smTranslationData.resetMaps();
		// Obtain the nodes in the state-machine.
		EList<AbstractNode> nodes = statemachine.getNodes();
		// for each node we gather info
		for (AbstractNode node : nodes) {
			extractDataForNode(node, statemachine, smTranslationData);
		}
	}

	private void extractDataForNode(AbstractNode node,
			Statemachine statemachine,
			StateMachineTranslationData smTranslationData)
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
				smTranslationData.taskingTranslationManager.getEventTargMap()
						.put(event, t.getTarget());

				// store a link between the event and the state-machine
				// that has a transition that elaborates it.
				TaskingTranslationManager.getEvent_SM_Map().put(event,
						statemachine.getName());

			}
		}

		// add the eventList, associated with this state (and the node), to maps
		List<Event> storedEventList = smTranslationData.component_nodeEventMap.get(node);
		if (storedEventList == null) {
			smTranslationData.component_nodeEventMap.put(node, eventList);
			if (node instanceof State) {
				smTranslationData.component_stateEventMap.put((State) node, eventList);
			}
		} else {
			storedEventList.addAll(eventList);
			smTranslationData.component_nodeEventMap.put(node, storedEventList);
			if (node instanceof State) {
				smTranslationData.component_stateEventMap.put((State) node,
						storedEventList);
			}
		}

		// process nested states.
		// This adds internal transition info
		if (node instanceof State) {
			EList<Statemachine> containedSMList = ((State) node)
					.getStatemachines();
			for (Statemachine s : containedSMList) {
				preProcessProcStateMachine(s, smTranslationData);
			}
		}
	}

	// In second-pass pre-processing: for each node, identify a
	// starting state, elaborating events on transitions, and a target state.
	// This gives us a map: State<->(Event<->Node)
	public void buildNextStateMaps(
			StateMachineTranslationData smTranslationData) {
		Set<AbstractNode> nodeSet = smTranslationData.component_nodeEventMap.keySet();
		List<Object> nodeList = Arrays.asList(nodeSet.toArray());
		// for each node, identify and process the initial states,
		// followed by the remainder.
		for (Object node : nodeList) {
			if (node instanceof Initial) {
				Initial initialState = (Initial) node;
				EList<Transition> outgoingTList = initialState.getOutgoing();
				// Get the existing events associated with the inital state
				State parentState = (State) initialState
						.getContaining(StatemachinesPackage.Literals.STATE);
				if (parentState == null) {
					// we have the topmost initial node
					parentState = StatemachinesFactory.eINSTANCE.createState();
					parentState.setName("dummyTopState");
				}

				for (Transition initialTransition : outgoingTList) {
					AbstractNode initialTransitionTarget = initialTransition
							.getTarget();
					if (initialTransitionTarget instanceof Junction) {
						// we have found a Junction, so need to obtain its
						// eventlist
						Junction initialJunction = (Junction) initialTransitionTarget;
						Map<Event, AbstractNode> innerMap = new HashMap<Event, AbstractNode>();
						EList<Transition> junctionOutList = initialJunction
								.getOutgoing();
						Map<Event, AbstractNode> storedInnerMap = smTranslationData.processSM_ini_nextStateMap
								.get(parentState);
						if (storedInnerMap != null) {
							storedInnerMap.putAll(innerMap);
						} else {
							storedInnerMap = innerMap;
						}
						for (Transition junctionTransition : junctionOutList) {
							for (Event junctionEvent : junctionTransition
									.getElaborates()) {
								storedInnerMap.put(junctionEvent,
										junctionTransition.getTarget());
							}
						}
						smTranslationData.processSM_ini_nextStateMap.put(parentState,
								storedInnerMap);
					}
					// else we can get the events of the initial transition from
					// the pre-constructed list.
					else {
						List<Event> eventList = smTranslationData.component_nodeEventMap
								.get(initialState);
						// for each event related to the initial state
						for (Event event : eventList) {
							// create the 'inner map'
							Map<Event, AbstractNode> innerMap = new HashMap<Event, AbstractNode>();
							// Add the event <-> nextState relation
							innerMap.put(event, initialTransitionTarget);
							Map<Event, AbstractNode> storedInnerMap = smTranslationData.processSM_ini_nextStateMap
									.get(initialState);
							if (storedInnerMap != null) {
								storedInnerMap.putAll(innerMap);
							} else {
								storedInnerMap = innerMap;
							}

							// We store the parentState that contains the
							// initialState, with the Event<-> TargetState map
							smTranslationData.processSM_ini_nextStateMap.put(
									parentState, storedInnerMap);

						}
					}
				}
			}
			// end of sorting the initial transitions

			// Next process the States
			Set<State> stateSet = smTranslationData.component_stateEventMap.keySet();
			List<Object> stateList = Arrays.asList(stateSet.toArray());
			// foreach state
			for (Object state_ : stateList) {
				if (state_ instanceof State) {
					State state = (State) state_;
					// get the outgoing transitions
					EList<Transition> outgoingTList = state.getOutgoing();

					// foreach outgoing transition
					for (Transition stateTransition : outgoingTList) {
						AbstractNode transitionTarget = stateTransition
								.getTarget();
						// if the state transition target is a Junction we will
						// need
						// to
						// build the event list here
						if (transitionTarget instanceof Junction) {
							// List<Event> eventList = new ArrayList<Event>();
							Junction junctionTarget = (Junction) transitionTarget;
							// create the 'inner map'
							Map<Event, AbstractNode> innerMap = new HashMap<Event, AbstractNode>();
							EList<Transition> junctionOutList = junctionTarget
									.getOutgoing();
							Map<Event, AbstractNode> storedInnerMap = smTranslationData.processSM_curr_nextStateMap
									.get(state);
							if (storedInnerMap != null) {
								storedInnerMap.putAll(innerMap);
							} else {
								storedInnerMap = innerMap;
							}

							for (Transition junctionTransition : junctionOutList) {
								for (Event junctionEvent : junctionTransition
										.getElaborates()) {
									storedInnerMap.put(junctionEvent,
											junctionTransition.getTarget());
									// eventList.add(junctionEvent);
								}
							}
							smTranslationData.processSM_curr_nextStateMap.put(state,
									storedInnerMap);
						}
						// else if the outgoing transition target is not a
						// junction
						// we can obtain the events that it elaborates
						else {
							List<Event> eventList = stateTransition
									.getElaborates();

							// for each event related to the state
							for (Event event : eventList) {
								// create the 'inner map'
								Map<Event, AbstractNode> innerMap = new HashMap<Event, AbstractNode>();
								// Add the event <-> nextState relation
								innerMap.put(event, transitionTarget);
								Map<Event, AbstractNode> storedInnerMap = smTranslationData.processSM_curr_nextStateMap
										.get(state);
								if (storedInnerMap != null) {
									storedInnerMap.putAll(innerMap);
								} else {
									storedInnerMap = innerMap;
								}
								smTranslationData.processSM_curr_nextStateMap.put(
										state, storedInnerMap);
							}
						}
					}
				}
			}
		}
		flattenStateMachine(smTranslationData);
	}

	// Flattening removes nested initial transitions. It points
	// the external transition target (i.e. the related event) at the
	// internal transition target in our (flattened) map structure.
	private void flattenStateMachine(
			StateMachineTranslationData smTranslationData) {
		Map<State, Map<Event, AbstractNode>> unifiedMap = new HashMap<State, Map<Event, AbstractNode>>();
		unifiedMap.putAll(smTranslationData.processSM_curr_nextStateMap);
		unifiedMap.putAll(smTranslationData.processSM_ini_nextStateMap);

		Map<State, Map<Event, AbstractNode>> updatedMap = new HashMap<State, Map<Event, AbstractNode>>();
		updatedMap.putAll(smTranslationData.processSM_curr_nextStateMap);
		updatedMap.putAll(smTranslationData.processSM_ini_nextStateMap);

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
							smTranslationData.processSM_curr_nextStateMap.put(s1,
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
		smTranslationData.processSM_flattenedNextStateMap = updatedMap;
	}

	// test print the flattened state machine targets
	public void testPrint_initial_Event_Target(
			StateMachineTranslationData smTranslationData) {
		System.out.println("BEGIN testPrint_initial_Event_Target");
		// Test navigation through the map of state-event-next states
		Map<State, Map<Event, AbstractNode>> oneMap = smTranslationData.processSM_ini_nextStateMap;
		Set<State> oneKeys = oneMap.keySet();
		List<State> oneKeyList = Arrays.asList(oneKeys
				.toArray(new State[oneKeys.size()]));
		for (State s : oneKeyList) {
			Map<Event, AbstractNode> twoMap = oneMap.get(s);
			Set<Event> twoKeys = twoMap.keySet();
			List<Event> twoKeyList = Arrays.asList(twoKeys
					.toArray(new Event[twoKeys.size()]));
			for (Event evt : twoKeyList) {
				AbstractNode nextNode = twoMap.get(evt);
				if (nextNode instanceof State) {
					String nextStateName = ((State) nextNode).getName();
					System.out.println(s.getName() + ">>" + evt.getName()
							+ ">>" + nextStateName);
				} else {
					System.out.println(s.getName() + ">>" + evt.getName()
							+ ">>" + nextNode.getInternalId());
				}
			}
		}
		System.out.println("END testPrint_initial_Event_Target");
		System.out.println("");
	}

	// test print the flattened state machine targets
	public void testPrint_current_Event_Target(
			StateMachineTranslationData smTranslationData) {
		System.out.println("BEGIN testPrint_current_Event_Target");
		// Test navigation through the map of state-event-next states
		Map<State, Map<Event, AbstractNode>> oneMap = smTranslationData.processSM_curr_nextStateMap;
		Set<State> oneKeys = oneMap.keySet();
		List<State> oneKeyList = Arrays.asList(oneKeys
				.toArray(new State[oneKeys.size()]));
		for (State s : oneKeyList) {
			Map<Event, AbstractNode> twoMap = oneMap.get(s);
			Set<Event> twoKeys = twoMap.keySet();
			List<Event> twoKeyList = Arrays.asList(twoKeys
					.toArray(new Event[twoKeys.size()]));
			for (Event evt : twoKeyList) {
				AbstractNode nextNode = twoMap.get(evt);
				if (nextNode instanceof State) {
					String nextStateName = ((State) nextNode).getName();
					System.out.println(s.getName() + ">>" + evt.getName()
							+ ">>" + nextStateName);
				} else {
					System.out.println(s.getName() + ">>" + evt.getName()
							+ ">>" + nextNode.getInternalId());
				}
			}
		}
		System.out.println("END testPrint_current_Event_Target");
		System.out.println("");
	}

	// test print the flattened state machine targets
	public void testPrint_flattened_Event_Target(
			StateMachineTranslationData smTranslationData) {
		System.out.println("testPrint_flattened_Event_Target");
		// Test navigation through the map of state-event-next states
		Map<State, Map<Event, AbstractNode>> oneMap = smTranslationData.processSM_flattenedNextStateMap;
		Set<State> oneKeys = oneMap.keySet();
		List<State> oneKeyList = Arrays.asList(oneKeys
				.toArray(new State[oneKeys.size()]));
		for (State s : oneKeyList) {
			Map<Event, AbstractNode> twoMap = oneMap.get(s);
			Set<Event> twoKeys = twoMap.keySet();
			List<Event> twoKeyList = Arrays.asList(twoKeys
					.toArray(new Event[twoKeys.size()]));
			for (Event evt : twoKeyList) {
				// if the event is in the event state-machine user list then
				// call the sm routine
				boolean isSynchSMEvent = smTranslationData.synchSMEventUser
						.keySet().contains(evt);
				// The string to call the state machines
				String smCallString = "";
				if (isSynchSMEvent) {
					List<Statemachine> stateMachineUsers = smTranslationData.synchSMEventUser
							.get(evt);
					for (Statemachine statemachine : stateMachineUsers) {
						smCallString = smCallString + ".Call("
								+ statemachine.getName() + "); ";
					}

				}
				AbstractNode nextNode = twoMap.get(evt);
				if (nextNode instanceof State) {
					String nextStateName = ((State) nextNode).getName();
					System.out.println(s.getName() + ">>" + evt.getName()
							+ smCallString + ">>" + nextStateName);
				} else {
					System.out.println(s.getName() + ">>" + evt.getName()
							+ smCallString + ">>" + nextNode.getInternalId());
				}
			}
		}
		System.out.println("END testPrint_flattened_Event_Target");
		System.out.println("");
	}
}
