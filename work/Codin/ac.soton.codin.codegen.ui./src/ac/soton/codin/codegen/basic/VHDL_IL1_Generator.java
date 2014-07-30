package ac.soton.codin.codegen.basic;

import java.awt.PageAttributes.OriginType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;
import org.eventb.codegen.il1.Case;
import org.eventb.codegen.il1.CaseStatement;
import org.eventb.codegen.il1.Command;
import org.eventb.codegen.il1.Il1Factory;
import org.eventb.codegen.il1.Seq;
import org.eventb.codegen.il1.Subroutine;
import org.eventb.codegen.il1.Task;
import org.eventb.codegen.tasking.TaskingTranslationException;
import org.eventb.codegen.tasking.utils.CodeGenTaskingUtils;
import org.eventb.emf.core.machine.Action;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Guard;

import ac.soton.eventb.statemachines.AbstractNode;
import ac.soton.eventb.statemachines.State;
import ac.soton.eventb.statemachines.Statemachine;
import ac.soton.eventb.statemachines.StatemachinesPackage;
import ac.soton.eventb.statemachines.Transition;

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

	public void process(Task task, StateMachineTranslationData smTranslationMgr)
			throws TaskingTranslationException {
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
				// create a new case-block for this state-machine
				Case caseblock = Il1Factory.eINSTANCE.createCase();
				Il1Factory.eINSTANCE.createCase();
				smSubroutine.setBody(caseblock);
				caseblock.setCaseExpression(stateMachineName);
				caseblock.setEnvirStateMachineChild(false);

				// iterate through each state. Each state is a case-statement
				// multiple outgoing transitions/events require a choice,
				// derived from a guard.
				Map<State, Map<Event, AbstractNode>> stateMap = smTranslationMgr.synchSM_flattened_nextStateMap
						.get(statemachine);
				List<State> stateList = Arrays.asList(stateMap.keySet()
						.toArray(new State[stateMap.size()]));
				for (State currentState : stateList) {
					// create a new case-block for this state
					CaseStatement caseStatement = Il1Factory.eINSTANCE
							.createCaseStatement();
					caseblock.getCaseStatement().add(caseStatement);
					String stateName = currentState.getName();
					caseStatement.setCaseValue(stateName);
					// Get the events for this state
					Map<Event, AbstractNode> eventMap = stateMap
							.get(currentState);
					List<Event> eventList = Arrays.asList(eventMap.keySet()
							.toArray(new Event[eventMap.keySet().size()]));

					// handle the case of one outgoing event for this state.
					// There should be no guards on the event - we do not handle
					// synchronising events with typed parameters.
					if (eventList.size() == 1) {
						EList<Transition> transitionList = currentState
								.getOutgoing();
						for (Transition transition : transitionList) {
							AbstractNode targetNode = transition.getTarget();
							String targetName = null;
							if (targetNode instanceof State) {
								targetName = ((State) targetNode).getName();
							}

							EList<Action> actionEList = transition.getActions();
							// transform the actions of this single transition
							// to an il1.command for the caseStatement body.
							// First create a java list
							List<Action> actionList = Arrays.asList(actionEList
									.toArray(new Action[actionEList.size()]));
							// use this command to do the work
							Command body = makeBodyFromActionList(actionList);
							// if there is a new target state
							if (targetName != null) {
								// create a new state update action
								org.eventb.codegen.il1.Action il1Action = Il1Factory.eINSTANCE
										.createAction();
								il1Action
										.setAction(stateMachineName
												+ CodeGenTaskingUtils.ASSIGNMENT_SYMBOL
												+ targetName);
								// if the body is null
								if(body == null){
									// Set the new state update action as the body.
									body = il1Action;
								}
								// else add it to an existing body.
								else{
									Seq seq = Il1Factory.eINSTANCE.createSeq();
									seq.setRightBranch(il1Action);
									seq.setLeftBranch(body);
									body = seq;
								}
							}
							// in any case... set the caseStatement
							caseStatement.setCommand(body);
						}
					}
					// handle the case of multiple transitions for this state in
					// a branch.
					else if (eventList.size() > 1) {
						for (Event event : eventList) {
							// get the target node for the event
							AbstractNode targetNode = eventMap.get(event);

						}
					} else {
						// Do nothing, this is an implicit final state
					}
				}
			}
		}
	}

	// transform the list of EMFactions to an il1.command for use in the
	// caseStatement body.
	private Command makeBodyFromActionList(List<Action> actionList) {
		if (actionList.size() == 1) {
			Action emfAction = actionList.get(0);
			// create a new IL1Action
			org.eventb.codegen.il1.Action il1Action = Il1Factory.eINSTANCE
					.createAction();
			il1Action.setAction(emfAction.getAction());
			return il1Action;
		} else if (actionList.size() > 1){
			// Create a new seq. Add the removed action to the left branch
			// and whatever is returned from a recursive call with the
			// remaining actions, to the right branch.
			ArrayList<Action> newActionList = new ArrayList<Action>(actionList);
			Action emfAction = newActionList.remove(0);
			Seq seq = Il1Factory.eINSTANCE.createSeq();
			org.eventb.codegen.il1.Action il1Action = Il1Factory.eINSTANCE
					.createAction();
			il1Action.setAction(emfAction.getAction());
			seq.setLeftBranch(il1Action);
			seq.setRightBranch(makeBodyFromActionList(newActionList));
			return seq;
		}
		else{
			return null;
		}
	}

	public String makeSingleSpaceBetweenElements(String actionString) {
		// first remove spaces
		actionString = actionString.replace(" ", "");
		String pred = "";
		boolean lastNormal = true;
		for (char c : actionString.toCharArray()) {
			boolean currentNormal = ((c >= 'a' && c <= 'z')
					|| (c >= 'A' && c <= 'Z') || c == ' ' || c == '_' || (c >= '0' && c <= '9'));
			if (lastNormal && currentNormal) {
			}// do nothing
			else if (lastNormal && !currentNormal) {
				pred += ' ';
			}// add a space
			else if (!lastNormal && currentNormal) {
				pred += ' ';
			}// add a space
			else if (!lastNormal && !currentNormal) {
			}// do nothing special
			lastNormal = currentNormal;
			pred += c;
		}
		return pred;
	}
}
