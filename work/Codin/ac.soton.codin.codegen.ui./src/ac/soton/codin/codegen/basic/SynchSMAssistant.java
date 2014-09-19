package ac.soton.codin.codegen.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eventb.emf.core.machine.Action;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Guard;

import ac.soton.codin.codegen.quickPrint.QuickPrinter;
import ac.soton.eventb.statemachines.AbstractNode;
import ac.soton.eventb.statemachines.Initial;
import ac.soton.eventb.statemachines.Junction;
import ac.soton.eventb.statemachines.State;
import ac.soton.eventb.statemachines.Statemachine;
import ac.soton.eventb.statemachines.StatemachinesFactory;
import ac.soton.eventb.statemachines.StatemachinesPackage;
import ac.soton.eventb.statemachines.Transition;

public class SynchSMAssistant {
	// In a synchSM: Given a current state node: navigate to next state, via
	// events/joins etc. Descriptively: a map of type
	// Statemachine <-> (CurrentState <-> (Event <-> NextState))
	public Map<State, Map<Event, AbstractNode>> synchSM_curr_nextStateMap = new HashMap<State, Map<Event, AbstractNode>>();

	// In a synch SM: Given an initial node: navigate to next state, via
	// events/joins etc:
	// Descriptively: a map of type InitialState <-> (Event <-> NextState)
	// Initial states have to be treated differently.
	public Map<State, Map<Event, AbstractNode>> synchSM_ini_nextStateMap = new HashMap<State, Map<Event, AbstractNode>>();

	private VHDL_TranslationData translationData;

	private State parentState;

	public void buildNextStateMaps(VHDL_TranslationData translationData_) {
		// For each component
		translationData = translationData_;
		for (String componentName : translationData.synchronousSM_Map.keySet()) {
			// reset the nextState data for a new component
			resetMaps();
			// get this component's state-machines.
			List<Statemachine> statemachineList = translationData.synchronousSM_Map
					.get(componentName);
			for (Statemachine statemachine : statemachineList) {
				// process each state-machine
				doStateMachine(statemachine);
				// flatten the state-machine
				Map<State, Map<Event, AbstractNode>> flattenedStatemachineData = flattenStateMachine();
				// store the flattened state-machine in a map with the
				// state-machine key
				translationData.synchSM_flattened_nextStateMap.put(
						statemachine, flattenedStatemachineData);
			}
		}
	}

	private void doStateMachine(Statemachine statemachine) {
		// build next step maps
		for (AbstractNode node : statemachine.getNodes()) {
			// process a state-machine node.
			doNode(statemachine, node);
		}
	}

	private void doNode(Statemachine statemachine, AbstractNode node) {
		if (node instanceof Initial) {
			Initial initialState = (Initial) node;
			sortInitialTransitions(initialState);
		}
		// end of sorting the initial transitions

		// Next process the States of this statemachine
		EList<EObject> stateSet = statemachine.getAllContained(
				StatemachinesPackage.Literals.STATE, true);
		List<State> stateList = Arrays.asList(stateSet
				.toArray(new State[stateSet.size()]));
		// foreach state
		for (State state : stateList) {
			if (state == null)
				continue;
			// get the outgoing transitions
			EList<Transition> outgoingTList = state.getOutgoing();

			// process each outgoing transition
			for (Transition stateTransition : outgoingTList) {
				doOutgoingTransition(state, stateTransition);
			}
			
			// Alternative NEW approach !!!! for nested state-machines
			EList<Statemachine> nestSynchSMList = state.getStatemachines();
			// process nested synch state-machines
			for (Statemachine nestedStatemachine : nestSynchSMList) {
				if (nestedStatemachine == null)
					continue;
				doStateMachine(nestedStatemachine);
			}
			
			
			// END Alternative NEW approach !!!! for nested state-machines
		}
	}

	private void doOutgoingTransition(State state, Transition stateTransition) {
		AbstractNode transitionTarget = stateTransition.getTarget();
		ArrayList<Guard> transitPathGuardList = new ArrayList<Guard>();
		ArrayList<Action> transitPathActionList = new ArrayList<Action>();
		transitPathActionList.addAll(stateTransition.getActions());
		transitPathGuardList.addAll(stateTransition.getGuards());
		
		// if the state transition target is a Junction we
		// will need to build the event list here
		if (transitionTarget instanceof Junction) {
			transitPathGuardList.addAll(stateTransition.getGuards());
			transitPathActionList.addAll(stateTransition.getActions());
			Junction junctionTarget = (Junction) transitionTarget;
			// create the 'inner map'
			Map<Event, AbstractNode> innerMap = new HashMap<Event, AbstractNode>();
			EList<Transition> junctionOutList = junctionTarget.getOutgoing();
			Map<Event, AbstractNode> storedInnerMap = synchSM_curr_nextStateMap
					.get(state);
			if (storedInnerMap != null) {
				storedInnerMap.putAll(innerMap);
			} else {
				storedInnerMap = innerMap;
			}

			for (Transition junctionTransition : junctionOutList) {
				for (Event junctionEvent : junctionTransition.getElaborates()) {
					storedInnerMap.put(junctionEvent,
							junctionTransition.getTarget());
					// eventList.add(junctionEvent);
					updateTransitionPath(junctionEvent, state,
							transitPathGuardList, transitPathActionList,
							storedInnerMap);
				}
			}
			synchSM_curr_nextStateMap.put(state, storedInnerMap);
		}
		// else if the outgoing transition target is not a
		// junction
		// we can obtain the events that it elaborates
		else {
			List<Event> eventList = stateTransition.getElaborates();
			transitPathGuardList.addAll(stateTransition
					.getGuards());
			transitPathActionList.addAll(stateTransition.getActions());

			// for each event related to the state
			for (Event event : eventList) {
				// create the 'inner map'
				Map<Event, AbstractNode> innerMap = new HashMap<Event, AbstractNode>();
				// Add the event <-> nextState relation
				innerMap.put(event, transitionTarget);
				Map<Event, AbstractNode> storedInnerMap = synchSM_curr_nextStateMap
						.get(state);
				if (storedInnerMap != null) {
					storedInnerMap.putAll(innerMap);
				} else {
					storedInnerMap = innerMap;
				}
				synchSM_curr_nextStateMap.put(state, storedInnerMap);

				updateTransitionPath(event, state, transitPathGuardList,
						transitPathActionList, storedInnerMap);

			}
		}
	}

	private void updateTransitionPath(Event event, State state,
			ArrayList<Guard> transitPathGuardList,
			ArrayList<Action> transitPathActionList,
			Map<Event, AbstractNode> storedInnerMap) {

		// Set up a transitPath.
		List<TransitPath> transitPathList = translationData.synchSM_transitPathMap
				.get(state);
		TransitPath transitPath = null;
		if (transitPathList == null) {
			transitPathList = new ArrayList<TransitPath>();
		}
		for (TransitPath tp : transitPathList) {
			if (tp.getEvent() == event) {
				transitPath = tp;
				break;
			}
		}
		if (transitPath == null) {
			transitPath = new TransitPath();
			transitPath.setEvent(event);
			transitPath.setTargetNode(storedInnerMap.get(event));
			transitPath.getGuardList().addAll(transitPathGuardList);
			transitPath.getActionList().addAll(transitPathActionList);
			// finally add the transition path to the list of
			// transition paths for this state
			transitPathList.add(transitPath);

		} else {
			List<Guard> existingGuardList = transitPath.getGuardList();
			List<Action> existingActionList = transitPath.getActionList();
			// add guards and actions to existing the existing lists
			for (Guard g : transitPathGuardList) {
				if (!existingGuardList.contains(g)) {
					transitPath.getGuardList().add(g);
				}
			}
			for (Action a : transitPathActionList) {
				if (!existingActionList.contains(a)) {
					transitPath.getActionList().add(a);
				}
			}
		}
		translationData.synchSM_transitPathMap.put(state,
				transitPathList);

	}

	private void sortInitialTransitions(Initial initialState) {
		EList<Transition> outgoingTList = initialState.getOutgoing();
		parentState = (State) initialState
				.getContaining(StatemachinesPackage.Literals.STATE);
		if (parentState == null) {
			// we have the topmost initial node
			parentState = StatemachinesFactory.eINSTANCE.createState();
			parentState.setName(QuickPrinter.BeginCycleName);
		}

		for (Transition initialTransition : outgoingTList) {
			AbstractNode initialTransitionTarget = initialTransition
					.getTarget();
			
			ArrayList<Guard> transitPathGuardList = new ArrayList<Guard>();
			ArrayList<Action> transitPathActionList = new ArrayList<Action>();
			transitPathActionList.addAll(initialTransition.getActions());
			transitPathGuardList.addAll(initialTransition.getGuards());
			
			if (initialTransitionTarget instanceof Junction) {
				// we have found a Junction, so need to obtain
				// its eventlist
				Junction initialJunction = (Junction) initialTransitionTarget;
				Map<Event, AbstractNode> innerMap = new HashMap<Event, AbstractNode>();
				EList<Transition> junctionOutList = initialJunction
						.getOutgoing();
				Map<Event, AbstractNode> storedInnerMap = synchSM_ini_nextStateMap
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
				synchSM_ini_nextStateMap.put(parentState, storedInnerMap);
			}
			// else we can get the events of the initial
			// transition from the pre-constructed list.
			else {
				List<Event> eventList = initialTransition.getElaborates();
				transitPathGuardList.addAll(initialTransition
						.getGuards());
				transitPathActionList.addAll(initialTransition.getActions());

				// for each event related to the initial state
				for (Event event : eventList) {
					// create the 'inner map'
					Map<Event, AbstractNode> innerMap = new HashMap<Event, AbstractNode>();
					// Add the event <-> nextState relation
					innerMap.put(event, initialTransitionTarget);
					Map<Event, AbstractNode> storedInnerMap = synchSM_ini_nextStateMap
							.get(initialState);
					if (storedInnerMap != null) {
						storedInnerMap.putAll(innerMap);
					} else {
						storedInnerMap = innerMap;
					}

					// We store the parentState that contains
					// the
					// initialState, with the Event<->
					// TargetState map
					synchSM_ini_nextStateMap.put(parentState, storedInnerMap);
					
					updateTransitionPath(event, parentState, transitPathGuardList, transitPathActionList, storedInnerMap);

				}
			}
		}
	}

	private void resetMaps() {
		synchSM_curr_nextStateMap.clear();
		synchSM_ini_nextStateMap.clear();
	}

	private Map<State, Map<Event, AbstractNode>> flattenStateMachine() {

		Map<State, Map<Event, AbstractNode>> unifiedMap = new HashMap<State, Map<Event, AbstractNode>>();
		unifiedMap.putAll(synchSM_curr_nextStateMap);
		unifiedMap.putAll(synchSM_ini_nextStateMap);

		Map<State, Map<Event, AbstractNode>> updatedMap = new HashMap<State, Map<Event, AbstractNode>>();
		updatedMap.putAll(synchSM_curr_nextStateMap);
		updatedMap.putAll(synchSM_ini_nextStateMap);

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
							synchSM_curr_nextStateMap.put(s1, newMap);
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

							// NEWLY ADDED !!! >>>>>>

							Map<State, List<TransitPath>> transitPathMap = translationData.synchSM_transitPathMap;
							// get all the paths from s1
							List<TransitPath> s1_transitPathList = transitPathMap
									.get(s1);
							// get all paths from s2 - the candidate for removal
							List<TransitPath> s2_transitPathList = transitPathMap
									.get(s2);

							List<Guard> moveGuards = null;
							List<Action> moveActions = null;
							AbstractNode replacementNode = null;
							// remove s2->e2->n2 getting the s2->e2 guards
							for (TransitPath tp : s2_transitPathList) {
								if (tp.getEvent() == e2) {
									moveGuards = tp.getGuardList();
									moveActions = tp.getActionList();
									replacementNode = tp.getTargetNode();
									// In s2 remove the transitPath with e2-n2
									// if it is empty just remove it
									s2_transitPathList.remove(tp);
									if (s2_transitPathList.size() == 0) {
										translationData.synchSM_transitPathMap
												.remove(s2);
									} else {
										translationData.synchSM_transitPathMap
												.put(s2, s2_transitPathList);
									}
									break;
								}
							}

							for (TransitPath tp : s1_transitPathList) {
								if (tp.getEvent() == e1) {
									tp.setTargetNode(replacementNode);
									tp.getGuardList().addAll(moveGuards);
									tp.getActionList().addAll(moveActions);
									break;
								}
							}

							// <<<<<<<< END OF NEWLY ADDED !!!

						}
					}
				}
			}
		}
		return updatedMap;
	}

	// test print the flattened state machine targets
	public void testPrint_flattened_Event_Target(
			VHDL_TranslationData translationData) {

		Map<Statemachine, Map<State, Map<Event, AbstractNode>>> zeroMap = translationData.synchSM_flattened_nextStateMap;
		for (Statemachine statemachine : zeroMap.keySet()) {
			Map<State, Map<Event, AbstractNode>> oneMap = zeroMap
					.get(statemachine);

			System.out
					.println("BEGIN SynchSM_testPrint_flattened_Event_Target");
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
			System.out.println("END SynchSM_testPrint_flattened_Event_Target");
			System.out.println("");
		}
	}
}
