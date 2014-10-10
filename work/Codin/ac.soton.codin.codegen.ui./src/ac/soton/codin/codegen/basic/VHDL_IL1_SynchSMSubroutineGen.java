package ac.soton.codin.codegen.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eventb.codegen.il1.Case;
import org.eventb.codegen.il1.CaseStatement;
import org.eventb.codegen.il1.Command;
import org.eventb.codegen.il1.ElseIf;
import org.eventb.codegen.il1.If;
import org.eventb.codegen.il1.Il1Factory;
import org.eventb.codegen.il1.Seq;
import org.eventb.codegen.il1.Subroutine;
import org.eventb.codegen.il1.Task;
import org.eventb.codegen.tasking.utils.CodeGenTaskingUtils;
import org.eventb.emf.core.machine.Action;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Guard;

import ac.soton.codin.codegen.quickPrint.QuickPrinter;
import ac.soton.eventb.emf.components.Component;
import ac.soton.eventb.statemachines.AbstractNode;
import ac.soton.eventb.statemachines.State;
import ac.soton.eventb.statemachines.Statemachine;
import ac.soton.eventb.statemachines.StatemachinesPackage;
import ac.soton.eventb.statemachines.Transition;

public class VHDL_IL1_SynchSMSubroutineGen {

	private static VHDL_IL1_SynchSMSubroutineGen singleton = null;
	// flag indicating that we require case 'others' to
	// be added to a case statement
	private boolean requiresNonProgress;
	private VHDL_TranslationData translationData;

	public static VHDL_IL1_SynchSMSubroutineGen getDefault() {
		if (singleton == null) {
			singleton = new VHDL_IL1_SynchSMSubroutineGen();
			return singleton;
		} else {
			return singleton;
		}
	}

	// Make the synchronous state-machine's subroutines
	public void run(Task task, VHDL_TranslationData translationData_)
			throws CodinTranslatorException {
		// get a state-machine to track down the component parent
		translationData = translationData_;
		if(!(translationData.synchSMList.size() == 1)){
			throw new CodinTranslatorException("Invalid number of Synchronous State-machines in this component");
		}
		Statemachine aStatemachine = translationData.synchSMList.get(0);
		Component parentComponent = translationData.SM_Component_Map
				.get(aStatemachine);
		translationData.currentComponent = parentComponent;
		// We can create a subroutine for each synchronous state-machine.
		for (Statemachine statemachine : translationData.synchSMList) {
			String stateMachineName = statemachine.getName();
			// Set up the subroutine that will implement the state-machine
			Subroutine smSubroutine = Il1Factory.eINSTANCE.createSubroutine();
			translationData.synchSM_subroutineMap.put(statemachine,
					smSubroutine);
			smSubroutine.setName("do_" + stateMachineName);
			smSubroutine.setTemporary(false);
			smSubroutine
					.setMachineName(translationData.parentMachine.getName());
			smSubroutine.setProjectName(translationData.parentProject
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
			Map<State, Map<Event, AbstractNode>> stateMap = translationData.synchSM_flattened_nextStateMap
					.get(statemachine);
			List<State> stateList = Arrays.asList(stateMap.keySet().toArray(
					new State[stateMap.size()]));
			// reset the non-progress flag. This flag causes a
			// "when => others" case to be generated in the case
			// of states with no outgoing transitions.
			requiresNonProgress = false;

			for (State currentState : stateList) {
				// ignore the initialisation.
				if (currentState.getName().equals(QuickPrinter.BeginCycleName))
					continue;
				// create a new case-block for this state
				CaseStatement caseStatement = Il1Factory.eINSTANCE
						.createCaseStatement();
				caseblock.getCaseStatement().add(caseStatement);
				String stateName = currentState.getName();
				caseStatement.setCaseValue(stateName);
				// get the outgoing transitions
				EList<Transition> transitionList = currentState.getOutgoing();
				// handle the case of one outgoing event for this state.
				if (transitionList.size() == 1) {
					makeIL1CaseNonBranching(stateMachineName, currentState,
							caseStatement);
				}
				// .. or multiple outgoing transitions for this state.
				else if (transitionList.size() > 1) {
					makeIL1CaseBranch(stateMachineName, currentState,
							caseStatement);
				} else {
					// Do nothing, this is an implicit final state
				}
			}

			// we've handled all the states - now for the others statement
			// We supply an others case, for non-progressing states
			// i.e. states with no outgoing transitions.
			if (requiresNonProgress) {
				CaseStatement othersStatement = Il1Factory.eINSTANCE
						.createCaseStatement();
				caseblock.getCaseStatement().add(othersStatement);
				othersStatement.setCaseValue("others");
				// There is no command for this case - it is null
			}
		}
	}

	// make the case body for the current state, where there are multiple
	// transitions/events from the state.
	private void makeIL1CaseBranch(String stateMachineName, State currentState,
			CaseStatement caseStatement) throws CodinTranslatorException {
		EList<Transition> transitionEList = currentState.getOutgoing();
		List<Transition> transitionList = new ArrayList<Transition>(
				transitionEList);
		// Make a branch for this state's outgoing transitions.
		If topBranch = Il1Factory.eINSTANCE.createIf();
		// Remove the current transition from the processing list
		ArrayList<Transition> newTransitionList = new ArrayList<Transition>(
				transitionList);
		Transition currentTransition = newTransitionList.remove(0);

		// for each transition
		AbstractNode targetNode = currentTransition.getTarget();
		String targetName = null;
		if (targetNode instanceof State) {
			State targetState = (State) targetNode;
			if (hasNestedSM(targetState)) {
				// get any of the events, use to find the nested target state.
				Event event = currentTransition.getElaborates().get(0);
				AbstractNode nestedTarget = findNestedTarget(currentState,
						event);
				if (nestedTarget.eClass() != StatemachinesPackage.Literals.STATE) {
					throw new CodinTranslatorException(
							"Nested Statemachine does not have a state as a target node");
				} else {
					targetState = (State) nestedTarget;
				}
			}
			targetName = targetState.getName();
			if (targetNode.getOutgoing().size() == 0) {
				// This is an implicit final state
				if (requiresNonProgress == false) {
					requiresNonProgress = true;
				}
			}
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
		// add the predicate string to the branch condition for this
		// state's top-level branch.
		topBranch.getCondition().addAll(predicateStringList);
		// add any actions
		List<Action> actionList = currentTransition.getActions();
		// transform the actions of this transition
		// to an il1.command for the branch body.
		// First create a java list
		Command branchBody = completeIL1CaseActionSequence(stateMachineName,
				currentState, targetName, actionList);
		// Set the branch body for the first transition
		topBranch.setBody(branchBody);
		// add a sub-branch for each subsequent transition
		// there must be at least one or it would have been handled
		// by the simple case-statement builder.
		// and process the rest as a subBranch
		makeIL1SubBranch(newTransitionList, stateMachineName, currentState,
				topBranch, null);
		// Since we have multiple transitions, then we have guarded transitions,
		// and
		// therefore require an implicit self loop. This is implemented here.

// ELSE null branch removed.		
//		org.eventb.codegen.il1.Action doNothingAction = Il1Factory.eINSTANCE
//				.createAction();
//		doNothingAction.setAction("null");
//		topBranch.setElse(doNothingAction);

		// set the case-statement body
		caseStatement.setCommand(topBranch);

	}

	// Make a new subBranch, or set the else branch if we have navigated to
	// the final transition.
	private void makeIL1SubBranch(List<Transition> transitionList,
			String stateMachineName, State currentState, If topBranch,
			ElseIf parentElseif) throws CodinTranslatorException {
		// there will be a subBranch + an else. So create the subBranch
		// and call this again with a reduced list
		// if (transitionList.size() > 1) {
		if (transitionList.size() >= 1) {
			ArrayList<Transition> newTransitionList = new ArrayList<>(
					transitionList);
			ElseIf subBranch = Il1Factory.eINSTANCE.createElseIf();
			// create a subBranch from the removed transition
			// pass the list on recursively
			Transition currentTransition = newTransitionList.remove(0);
			// Get the target name of this transition if there is one.
			AbstractNode targetNode = currentTransition.getTarget();
			String targetName = null;
			if (targetNode instanceof State) {
				State targetState = (State) targetNode;
				if (hasNestedSM(targetState)) {
					// get any of the events, use to find the nested target
					// state.
					Event event = currentTransition.getElaborates().get(0);
					AbstractNode nestedTarget = findNestedTarget(currentState,
							event);
					if (nestedTarget.eClass() != StatemachinesPackage.Literals.STATE) {
						throw new CodinTranslatorException(
								"Nested Statemachine does not have a state as a target node");
					} else {
						targetState = (State) nestedTarget;
						targetNode = nestedTarget;
					}
				}

				targetName = targetState.getName();
				if (targetNode.getOutgoing().size() == 0) {
					// This is an implicit final state
					if (requiresNonProgress == false) {
						requiresNonProgress = true;
					}
				}
			}
			EList<Guard> emfGuardList = currentTransition.getGuards();
			// Obtain a list of predicate strings
			List<String> predicateStringList = makeIL1GuardsFromEMFGuardList(emfGuardList);
			// add the predicate string to the subbranch condition
			subBranch.getCondition().addAll(predicateStringList);
			// add any actions
			List<Action> actionList = currentTransition.getActions();
			// transform the actions of this transition
			// to an il1.command for the branch body.
			// First create a java list
			Command subBranchBody = completeIL1CaseActionSequence(
					stateMachineName, currentState, targetName, actionList);
			subBranch.setAction(subBranchBody);
			// parentElseIf is null if this is to be added at the top-level
			if (parentElseif == null)
				topBranch.setBranch(subBranch);
			else
				parentElseif.setBranch(subBranch);
			makeIL1SubBranch(newTransitionList, stateMachineName, currentState,
					topBranch, subBranch);
		}
	}

	// make the case body for the current state, where there is just
	// a single transition out from the state.
	private void makeIL1CaseNonBranching(String stateMachineName,
			State currentState, CaseStatement caseStatement) {
		EList<Transition> transitionList = currentState.getOutgoing();
		for (Transition transition : transitionList) {
			AbstractNode targetNode = transition.getTarget();
			String targetName = null;
			if (targetNode instanceof State) {
				State targetState = (State) targetNode;
				hasNestedSM(targetState);
				targetName = targetState.getName();
				if (targetNode.getOutgoing().size() == 0) {
					// This is an implicit final state
					if (requiresNonProgress == false) {
						requiresNonProgress = true;
					}
				}
			}

			EList<Action> actionEList = transition.getActions();
			// transform the actions of this single transition
			// to an il1.command for the caseStatement body.
			List<Action> actionList = Arrays.asList(actionEList
					.toArray(new Action[actionEList.size()]));
			Command body = completeIL1CaseActionSequence(stateMachineName,
					currentState, targetName, actionList);
			// in any case... set the caseStatement
			caseStatement.setCommand(body);
		}
	}

	// transform the list of EMFactions to an il1.command for use in the
	// caseStatement body.
	private Command makeIL1SeqFromActionList(List<Action> actionList) {
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
			seq.setRightBranch(makeIL1SeqFromActionList(newActionList));
			return seq;
		} else {
			return null;
		}
	}

	// this method adds a state counter update assignment to a sequence
	// of actions, the actions are generated from an actionList
	private Command completeIL1CaseActionSequence(String stateMachineName,
			State currentState, String targetName, List<Action> actionList) {
		// use this command to make a sequence from the list of actions
		Command body = makeIL1SeqFromActionList(actionList);
		// if there is a new target state
		if (targetName != null && !(targetName.equals(currentState.getName()))) {
			// create a new state update action
			org.eventb.codegen.il1.Action il1Action = Il1Factory.eINSTANCE
					.createAction();
			il1Action.setAction("next_" + stateMachineName
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

	private List<String> makeIL1GuardsFromEMFGuardList(List<Guard> emfGuardEList) {
		List<String> predicateStringList = new ArrayList<>();
		for (Guard guard : emfGuardEList) {
			predicateStringList.add(guard.getPredicate());
		}
		return predicateStringList;
	}

	private boolean hasNestedSM(State targetState) {
		EList<EObject> list = targetState.getAllContained(
				StatemachinesPackage.Literals.STATEMACHINE, true);
		for (EObject eo : list) {
			if (eo != null) {
				// we have found a nested state-machine
				return true;
			}
		}
		return false;
	}

	private AbstractNode findNestedTarget(State currentState, Event event) {
		// get the transit map for this state.
		Map<State, List<TransitPath>> map = translationData.synchSM_transitPathMap;
		List<TransitPath> transitPathList = map.get(currentState);
		for (TransitPath transitPath : transitPathList) {
			if (transitPath.getEvent() == event) {
				return transitPath.getTargetNode();
			}
		}
		return null;
	}
}
