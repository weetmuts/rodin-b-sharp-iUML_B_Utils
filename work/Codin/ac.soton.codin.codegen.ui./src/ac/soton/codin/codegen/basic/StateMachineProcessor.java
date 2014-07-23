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

		Map<String, List<Statemachine>> synchSMMap = new HashMap<String, List<Statemachine>>();
		Map<String, Statemachine> procSMMap = new HashMap<String, Statemachine>();
		// Foreach component, add the synchronous state-machines to a map of
		// NAME <-> ListOfState-machines
		// There is just one process state-machine per component, foreach
		// component add the process
		// state-machine to a map of NAME <-> ProcessStateMachine
		for (Component component : selectedComponentList) {
			// There should be just one process state-machine in the a codin
			// component.
			// Lets get it, or throw an exception if there is more than one.
			EList<Statemachine> procSMEList = component
					.getProcessStatemachines();
			if (procSMEList.size() > 1) {
				throw new CodinTranslatorException(
						"There is a limit of one process state-machine per component");
			} else {
				procSMMap.put(component.getName(), procSMEList.get(0));
			}
			synchSMMap.put(component.getName(),
					component.getSynchronousStatemachines());
		}

		// foreach component prepare for translation of its process
		// state-machine;
		// In the processing part we gather events and state-machine information
		for (Component component : selectedComponentList) {
			translateProcStateMachine(procSMMap.get(component.getName()),
					smTranslationMgr);
		}

		// foreach node, we will first process the initial states

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
						Map<Event, AbstractNode> storedInnerMap = smTranslationMgr.current_NextStateMap
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
						smTranslationMgr.current_NextStateMap.put(parentState,
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
							Map<Event, AbstractNode> storedInnerMap = smTranslationMgr.current_NextStateMap
									.get(initialState);
							if (storedInnerMap != null) {
								storedInnerMap.putAll(innerMap);
							} else {
								storedInnerMap = innerMap;
							}
							
							// We store the parentState that contains the
							// initialState, with the Event<-> TargetState map
							smTranslationMgr.current_NextStateMap.put(
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
						// else if the outgoing transition is not a junction
						// we can obtain the pre-constructed event list
						else {
							List<Event> eventList = smTranslationMgr.stateEventMap
									.get(state);
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

		testPrint_State_Event_Target(smTranslationMgr);

		return null;
	}

	// Process state machines differ from synchronous state-machines. A process
	// SM translates to a 'vhdl' process. A synchronous SM translates to a
	// subroutine in the task, with a case statement in its body.
	// In IL1 we generate a task for the process,
	// the body contains branches and sequences, and calls to synchronous
	// state-machine subroutines.
	// First we generate state-'outgoing transition' info.
	private Call translateProcStateMachine(Statemachine statemachine,
			StateMachineTranslationManager smTranslationMgr)
			throws TaskingTranslationException {
		EList<AbstractNode> nodes = statemachine.getNodes();
		// foreach state we gather info in processState
		for (AbstractNode node : nodes) {
			processNode(statemachine, smTranslationMgr, node);
		}
		return null;
	}

	// Gather events and state-machine information
	// A list of events that are elaborated (in the TaskingTranslation Manager)
	// Map of State <-> Events (in the TaskingTranslation Manager)
	// A map of Event <-> StateMachineNames (in the TaskingTranslation Manager)
	// A map of Event <-> TargetStates
	// a list of events involved in the current translation.

	private void processNode(Statemachine statemachine,
			StateMachineTranslationManager smTranslationMgr, AbstractNode node)
			throws TaskingTranslationException {
		String nodeName = "";
		if (node instanceof State) {
			nodeName = ((State) node).getName();
			smTranslationMgr.stateNames.add(nodeName);
		} else {
			nodeName = node.getInternalId();
		}

		EList<Transition> outGoing = node.getOutgoing();

		// record the number of outgoing transitions of
		// the current state in the hashmap
		smTranslationMgr.stateBranchCountMap.put(nodeName, outGoing.size());
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
				translateProcStateMachine(s, smTranslationMgr);
			}
		}
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

	// test print the current_NextStateMap
	private void testPrint_State_Event_Target(
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
}