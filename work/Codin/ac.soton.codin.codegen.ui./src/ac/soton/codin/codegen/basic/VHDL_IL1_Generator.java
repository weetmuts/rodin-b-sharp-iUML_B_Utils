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
import org.eventb.codegen.il1.ElseIf;
import org.eventb.codegen.il1.If;
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
					// get the outgoing transitions
					EList<Transition> transitionList = currentState
							.getOutgoing();
					// handle the case of one outgoing event for this state.
					// There should be no guards on the event - we do not handle
					// synchronising events with typed parameters.
					if (transitionList.size() == 1) {
						simpleCaseStatementBuilder(stateMachineName,
								currentState, caseStatement);
					}
					// .. or multiple outgoing transitions for this state.
					else if (transitionList.size() > 1) {
						complexCaseStatementBuilder(stateMachineName,
								currentState, caseStatement);
					} else {
						// Do nothing, this is an implicit final state
					}
				}
			}
		}
	}

	// make the case body for the current state, where there are multiple
	// transitions/events from the state.
	private void complexCaseStatementBuilder(String stateMachineName,
			State currentState, CaseStatement caseStatement) {
		EList<Transition> transitionEList = currentState.getOutgoing();
		List<Transition> transitionList = new ArrayList<Transition>(transitionEList);
		// Make a branch for this state's outgoing transitions.
		If branch = Il1Factory.eINSTANCE.createIf();
		// for each transition
		for (Transition currentTransition : transitionList) {
			AbstractNode targetNode = currentTransition.getTarget();
			String targetName = null;
			if (targetNode instanceof State) {
				targetName = ((State) targetNode).getName();
			}
			// for the first transition
			EList<Guard> guardEList = currentTransition.getGuards();
			// Transform the guards of this transition
			// to a list of guards for this branch condition.
			// First create a java list from the EList
			List<Guard> emfGuardList = Arrays.asList(guardEList
					.toArray(new Guard[guardEList.size()]));
			// Obtain a list of predicate strings
			List<String> predicateStringList = makeIL1GuardsFromEMFGuardList(emfGuardList);
			// add the predicate string to the branch condition
			branch.getCondition().addAll(predicateStringList);
			// add any actions
			EList<Action> actionEList = currentTransition.getActions();
			// transform the actions of this transition
			// to an il1.command for the branch body.
			// First create a java list
			List<Action> actionList = Arrays.asList(actionEList
					.toArray(new Action[actionEList.size()]));
			Command branchBody = completeCaseActionSequence(stateMachineName,
					currentState, targetName, actionList);
			// Set the branch body for the first transition
			branch.setBody(branchBody);
			// add a sub-branch for each subsequent transition
			// there must be at least one or it would have been handled
			// by the simple case-statement builder.
			// Remove the current transition from the processing list
			
			transitionList.remove(currentTransition);
			// and process the rest as a subBranch
			ElseIf subBranch = makeSubBranch(transitionList, stateMachineName, currentState, branch);
			if(subBranch!=null){
				branch.setBranch(subBranch);
			}
		}
		// set the case-statement body
		caseStatement.setCommand(branch);

	}

	// Make a new subBranch, or set the else branch if we have navigated to
	// the final transition.
	private ElseIf makeSubBranch(List<Transition> transitionList,
			String stateMachineName, State currentState, If branch) {
		ArrayList<Transition> newTransitionList = new ArrayList<>(
				transitionList);
		if (transitionList.size() > 1) {
			ElseIf subBranch = Il1Factory.eINSTANCE.createElseIf();
			// create a subBranch from the removed transition
			// pass the list on recursively
			Transition currentTransition = newTransitionList.remove(0);
			// Get the target name of this transition if there is one.
			AbstractNode targetNode = currentTransition.getTarget();
			String targetName = null;
			if (targetNode instanceof State) {
				targetName = ((State) targetNode).getName();
			}
			EList<Guard> emfGuardList = currentTransition.getGuards();
			// Obtain a list of predicate strings
			List<String> predicateStringList = makeIL1GuardsFromEMFGuardList(emfGuardList);
			// add the predicate string to the branch condition
			subBranch.getCondition().addAll(predicateStringList);
			// add any actions
			EList<Action> actionEList = currentTransition.getActions();
			// transform the actions of this transition
			// to an il1.command for the branch body.
			// First create a java list
			List<Action> actionList = Arrays.asList(actionEList
					.toArray(new Action[actionEList.size()]));
			Command subBranchBody = completeCaseActionSequence(stateMachineName, currentState,
					targetName, actionList);
			subBranch.setAction(subBranchBody);
			subBranch.setBranch(makeSubBranch(newTransitionList, targetName, currentState, branch));
			return subBranch;
		} else if (transitionList.size() == 1) {
			// set the elseBranch of the original 'if'.
			Transition lastTransition = transitionList.get(0);
			// Get the target name of this transition if there is one.
			AbstractNode targetNode = lastTransition.getTarget();
			String targetName = null;
			if (targetNode instanceof State) {
				targetName = ((State) targetNode).getName();
			}
			// Else will have no guards
			// So just process the actions.
			EList<Action> actionEList = lastTransition.getActions();
			// transform the actions of this transition
			// to an il1.command for the else body.
			// First create a java list
			List<Action> actionList = Arrays.asList(actionEList
					.toArray(new Action[actionEList.size()]));
			Command elseBranchBody = completeCaseActionSequence(stateMachineName, currentState,
					targetName, actionList);
			branch.setElse(elseBranchBody);
			return null;
		} else {
			return null;
		}
	}

	private List<String> makeIL1GuardsFromEMFGuardList(List<Guard> emfGuardEList) {
		List<String> predicateStringList = new ArrayList<>();
		for (Guard guard : emfGuardEList) {
			predicateStringList.add(guard.getPredicate());
		}
		return predicateStringList;
	}

	// make the case body for the current state, where there is just
	// a single transition out from the state.
	private void simpleCaseStatementBuilder(String stateMachineName,
			State currentState, CaseStatement caseStatement) {
		EList<Transition> transitionList = currentState.getOutgoing();
		for (Transition transition : transitionList) {
			AbstractNode targetNode = transition.getTarget();
			String targetName = null;
			if (targetNode instanceof State) {
				targetName = ((State) targetNode).getName();
			}

			EList<Action> actionEList = transition.getActions();
			// transform the actions of this single transition
			// to an il1.command for the caseStatement body.
			List<Action> actionList = Arrays.asList(actionEList
					.toArray(new Action[actionEList.size()]));
			Command body = completeCaseActionSequence(stateMachineName,
					currentState, targetName, actionList);
			// in any case... set the caseStatement
			caseStatement.setCommand(body);
		}
	}

	// this method adds a state counter update assignment to a sequence
	// of actions, the actions are generated from an actionList
	private Command completeCaseActionSequence(String stateMachineName,
			State currentState, String targetName, List<Action> actionList) {
		// use this command to do the work
		Command body = makeBodyFromActionList(actionList);
		// if there is a new target state
		if (targetName != null && !(targetName.equals(currentState.getName()))) {
			// create a new state update action
			org.eventb.codegen.il1.Action il1Action = Il1Factory.eINSTANCE
					.createAction();
			il1Action.setAction(stateMachineName
					+ CodeGenTaskingUtils.ASSIGNMENT_SYMBOL + targetName);
			// if the body is null
			if (body == null) {
				// Set the new state update action as the body.
				body = il1Action;
			}
			// else add it to an existing body.
			else {
				Seq seq = Il1Factory.eINSTANCE.createSeq();
				seq.setRightBranch(il1Action);
				seq.setLeftBranch(body);
				body = seq;
			}
		}
		return body;
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
		} else if (actionList.size() > 1) {
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
		} else {
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
