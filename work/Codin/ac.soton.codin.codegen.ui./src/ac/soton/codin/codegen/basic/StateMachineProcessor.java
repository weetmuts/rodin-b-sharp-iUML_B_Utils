package ac.soton.codin.codegen.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eventb.codegen.il1.Call;
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
import ac.soton.eventb.statemachines.AbstractNode;
import ac.soton.eventb.statemachines.Initial;
import ac.soton.eventb.statemachines.Junction;
import ac.soton.eventb.statemachines.State;
import ac.soton.eventb.statemachines.Statemachine;
import ac.soton.eventb.statemachines.StatemachinesFactory;
import ac.soton.eventb.statemachines.StatemachinesPackage;
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

	public Call run(EventBElement source, IL1Element actualTarget,
			TaskingTranslationManager translationManager)
			throws TaskingTranslationException, CodinTranslatorException {
		// create a new class to store translation info
		StateMachineTranslationManager smTranslationMgr = new StateMachineTranslationManager();
		smTranslationMgr.taskingTranslationManager = translationManager;
		smTranslationMgr.actualTarget = actualTarget;
		// The machine that we are working on.
		smTranslationMgr.parentMachine = (MachineImpl) source;
		// selected components in the UI
		List<ComponentEditPart> selectedComponentEditList = CodinTranslator.selectedComponentList;
		// All components in the machine
		EList<EObject> componentEList = smTranslationMgr.parentMachine
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
		// add the EMF component based on the name
		for (Component component : componentArray) {

			if (selectedComponentNames.contains(component.getName())) {
				selectedComponentList.add(component);
			}
		}
		// Foreach component,
		// add the synchronous state-machines to a map of
		// ComponentName <-> ListOfStatemachines
		// There is just one process state-machine per component,
		// foreach component,
		// add the process state-machine to a map of
		// ComponentName <-> ProcessStateMachine
		Map<String, List<Statemachine>> synchSMMap = new HashMap<String, List<Statemachine>>();
		Map<String, Statemachine> procSMMap = new HashMap<String, Statemachine>();
		for (Component component : selectedComponentList) {
			// There should be just one process state-machine in the a codin
			// component.
			// Lets get it, or throw an exception if there is more than one.
			EList<Statemachine> procSMEList = component
					.getProcessStatemachines();
			if (procSMEList.size() > 1) {
				throw new CodinTranslatorException(
						"There is a limit of one process state-machine per component");
			} else if (procSMEList.size() == 1) {
				procSMMap.put(component.getName(), procSMEList.get(0));
				synchSMMap.put(component.getName(),
						component.getSynchronousStatemachines());
			}
		}

		// foreach component prepare for translation of its process
		// state-machine;
		// In the pre-processing part we gather events and state-machine
		// information
		ComponentUtil componentUtil = new ComponentUtil();
		for (Component component : selectedComponentList) {
			Statemachine statemachine = procSMMap.get(component.getName());
			// if the component has a statemachine
			if(statemachine != null)
			componentUtil.preProcessProcStateMachine(
					statemachine, smTranslationMgr);
		}

		// foreach node, identify and process the initial states,
		// followed by the remainder.
		Set<AbstractNode> nodeSet = smTranslationMgr.nodeEventMap.keySet();
		List<Object> nodeList = Arrays.asList(nodeSet.toArray());

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
						Map<Event, AbstractNode> storedInnerMap = smTranslationMgr.initial_NextStateMap
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
						smTranslationMgr.initial_NextStateMap.put(parentState,
								storedInnerMap);
					}
					// else we can get the events of the initial transition from
					// the pre-constructed list.
					else {
						List<Event> eventList = smTranslationMgr.nodeEventMap
								.get(initialState);
						// for each event related to the initial state
						for (Event event : eventList) {
							// create the 'inner map'
							Map<Event, AbstractNode> innerMap = new HashMap<Event, AbstractNode>();
							// Add the event <-> nextState relation
							innerMap.put(event, initialTransitionTarget);
							Map<Event, AbstractNode> storedInnerMap = smTranslationMgr.initial_NextStateMap
									.get(initialState);
							if (storedInnerMap != null) {
								storedInnerMap.putAll(innerMap);
							} else {
								storedInnerMap = innerMap;
							}

							// We store the parentState that contains the
							// initialState, with the Event<-> TargetState map
							smTranslationMgr.initial_NextStateMap.put(
									parentState, storedInnerMap);

						}
					}
				}
			}
			// end of sorting the initial transitions

			// Next process the States
			Set<State> stateSet = smTranslationMgr.stateEventMap.keySet();
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
							Map<Event, AbstractNode> storedInnerMap = smTranslationMgr.current_NextStateMap
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
							smTranslationMgr.current_NextStateMap.put(state,
									storedInnerMap);
						}
						// else if the outgoing transition target is not a junction
						// we can obtain the events that it elaborates
						else {
							List<Event> eventList = stateTransition.getElaborates();
							
							// for each event related to the state
							for (Event event : eventList) {
								// create the 'inner map'
								Map<Event, AbstractNode> innerMap = new HashMap<Event, AbstractNode>();
								// Add the event <-> nextState relation
								innerMap.put(event, transitionTarget);
								Map<Event, AbstractNode> storedInnerMap = smTranslationMgr.current_NextStateMap
										.get(state);
								if (storedInnerMap != null) {
									storedInnerMap.putAll(innerMap);
								} else {
									storedInnerMap = innerMap;
								}
								smTranslationMgr.current_NextStateMap.put(
										state, storedInnerMap);
							}
						}
					}
				}
			}
		}

		ComponentUtil.flattenStateMachine(smTranslationMgr);
		System.out.println("");
		testPrint_flattened_Event_Target(smTranslationMgr);
		System.out.println("");
		testPrint_initial_Event_Target(smTranslationMgr);
		System.out.println("");
		testPrint_current_Event_Target(smTranslationMgr);
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

	
	// test print the flattened state machine targets
	private void testPrint_initial_Event_Target(
			StateMachineTranslationManager smTranslationMgr) {
		// Test navigation through the map of state-event-next states
		Map<State, Map<Event, AbstractNode>> oneMap = smTranslationMgr.initial_NextStateMap;
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
	}
	
	
	// test print the flattened state machine targets
	private void testPrint_current_Event_Target(
			StateMachineTranslationManager smTranslationMgr) {
		// Test navigation through the map of state-event-next states
		Map<State, Map<Event, AbstractNode>> oneMap = smTranslationMgr.current_NextStateMap;
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
	}
	
	// test print the flattened state machine targets
	private void testPrint_flattened_Event_Target(
			StateMachineTranslationManager smTranslationMgr) {
		// Test navigation through the map of state-event-next states
		Map<State, Map<Event, AbstractNode>> oneMap = smTranslationMgr.flattenedNextStateMap;
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
	}
}