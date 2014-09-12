package ac.soton.codin.codegen.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eventb.codegen.il1.Call;
import org.eventb.codegen.il1.Command;
import org.eventb.codegen.il1.ElseIf;
import org.eventb.codegen.il1.If;
import org.eventb.codegen.il1.Il1Factory;
import org.eventb.codegen.il1.Program;
import org.eventb.codegen.il1.Seq;
import org.eventb.codegen.il1.Subroutine;
import org.eventb.codegen.il1.Task;
import org.eventb.emf.core.machine.Action;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Guard;

import ac.soton.eventb.statemachines.AbstractNode;
import ac.soton.eventb.statemachines.State;
import ac.soton.eventb.statemachines.Statemachine;
import ac.soton.eventb.statemachines.impl.FinalImpl;

public class VHDL_IL1_ProcSMStatementGen {

	private static VHDL_IL1_ProcSMStatementGen singleton;

	public static VHDL_IL1_ProcSMStatementGen getDefault() {
		if (singleton == null) {
			singleton = new VHDL_IL1_ProcSMStatementGen();
			return singleton;
		} else {
			return singleton;
		}
	}

	private Program program = null;
	private Map<State, Subroutine> stateSubroutine_Map = new HashMap<State, Subroutine>();

	public void run(Task task,
			VHDL_TranslationData translationData)
			throws CodinTranslatorException {
		program = translationData.program;
		// make a subroutine for each state in the process state-machine
		makeSubroutines(translationData);
		// in the second pass we provide the subroutine bodies
		makeSubroutineBodies(translationData);
	}

	// This method builds subroutines for the process state machine
	private void makeSubroutines(VHDL_TranslationData translationData)
			throws CodinTranslatorException {
		stateSubroutine_Map.clear();
		// each state has an associated subroutine
		for (State state : translationData.processSM_transitPathMap.keySet()) {
			Subroutine stateSubroutine = Il1Factory.eINSTANCE
					.createSubroutine();
			// get the one and only task model for the VHDL process
			Task theTask = program.getTaskTypeTasks().get(0);
			theTask.getSubroutines().add(stateSubroutine);
			// we'll keep a map of State<->state-subroutine for our own use
			stateSubroutine_Map.put(state, stateSubroutine);
			stateSubroutine.setName(state.getName());
			stateSubroutine.setMachineName(translationData.parentMachine
					.getName());
			stateSubroutine.setProjectName(translationData.parentProject
					.getProject().getName());
			stateSubroutine.setTemporary(false);
		}
	}

	private void makeSubroutineBodies(
			VHDL_TranslationData translationData) {

		for (State currentState : translationData.processSM_transitPathMap.keySet()) {
			// Get the transit paths for this state
			List<TransitPath> transitPathList = translationData.processSM_transitPathMap
					.get(currentState);
			// get the subroutine for this state that was generated in the first
			// pass.
			Subroutine currentStateSubroutine = stateSubroutine_Map.get(currentState);
			// A state will have a next-state call, and at least one transit
			// path 'action'.
			// If there are multiple transit paths then a branching statement is
			// needed. An event associated with a synchronous state-machine
			// gives rise to
			// a call to the synch state-machine routine.
			// if there is a single transition..
			if (transitPathList.size() == 1) {
				TransitPath transitPath = transitPathList.get(0);
				AbstractNode targetNode = transitPath.getTargetNode();
				Event transitEvent = transitPath.getEvent();
				List<Statemachine> synchSMList = translationData.synchSMEventUser
						.get(transitEvent);
				// if the event is associated with a synch state-machine
				if (synchSMList != null && synchSMList.size() > 0) {
					makeSynchSMCallSeq(translationData,
							currentStateSubroutine, targetNode, synchSMList);
				}
				// else the event is a simple transition with a call to its next
				// state
				else {
					List<Action> emfActionList = transitPath.getActionList();
					Command command = completeIL1ActionSequence(currentState,
							targetNode, emfActionList);
					currentStateSubroutine.setBody(command);
				}
			}
			// if there are multiple transit paths
			else if (transitPathList.size() > 1) {
				// each path has a branch/subbranch

				// if any single event in this transitPathList is associated with
				// a synch state-machine then we assume there are no other process
				// transitions to handle; and all transitions are to a single state.
				boolean isSynchSMTransition = false;
				for(TransitPath transitPath: transitPathList){
					Event transitEvent = transitPath.getEvent();
					List<Statemachine> synchSMList = translationData.synchSMEventUser
							.get(transitEvent);
					if(synchSMList != null && synchSMList.size()>0) isSynchSMTransition = true;
					break;
				}
				if(isSynchSMTransition){
					// get the first targetNode assuming they are all the same
					AbstractNode targetNode = transitPathList.get(0).getTargetNode();
					// find all the synchronous state machines that are associated with 
					// these outgoing transitions
					Set<Statemachine> allSynchSMSet = new HashSet<Statemachine>();
					for(TransitPath transitPath: transitPathList){
						Event transitEvent = transitPath.getEvent();
						
						allSynchSMSet.addAll(translationData.synchSMEventUser
								.get(transitEvent));
					}
					List<Statemachine> allSynchSMList = Arrays.asList(allSynchSMSet.toArray(new Statemachine[allSynchSMSet.size()]));
					makeSynchSMCallSeq(translationData,
							currentStateSubroutine, targetNode, allSynchSMList);
				}
				// else create a branching structure to represent the transitions
				// of the state, then finally add a call to the next stateSubroutine
				// if one exists.
				else{
					currentStateSubroutine.setBody(makeTopBranch(currentState, transitPathList));
				}
			}
			// there are no transit paths, do nothing
			else {
			}
		}
	}

	private If makeTopBranch(State currentState, List<TransitPath> transitPathList) {
		// get the first transit path and remove form the list
		TransitPath firstPath = transitPathList.remove(0);
		AbstractNode targetNode = firstPath.getTargetNode();
		List<Action> emfActionList = firstPath.getActionList();
		List<Guard> emfGuardList = firstPath.getGuardList();
		List<String> guardList = makeIL1GuardsFromEMFGuardList(emfGuardList);
		Command command = completeIL1ActionSequence(currentState, targetNode,
				emfActionList);
		If topBranch = Il1Factory.eINSTANCE.createIf();
		topBranch.getCondition().addAll(guardList);
		topBranch.setBody(command);
		makeSubBranch(transitPathList, topBranch, currentState, targetNode, null);
		return topBranch;
	}

	private void makeSubBranch(List<TransitPath> transitPathList, If topBranch,
			State stateMachineName, AbstractNode currentState,
			ElseIf parentElseif) {
		if (transitPathList.size() > 1) {
			ElseIf subBranch = Il1Factory.eINSTANCE.createElseIf();
			// create a subBranch from the removed transition
			// pass the list on recursively
			TransitPath currentTransition = transitPathList.remove(0);
			List<Guard> emfGuardList = currentTransition.getGuardList();
			// Obtain a list of predicate strings
			List<String> predicateStringList = makeIL1GuardsFromEMFGuardList(emfGuardList);
			// add the predicate string to the subbranch condition
			subBranch.getCondition().addAll(predicateStringList);
			// add any actions
			List<Action> actionList = currentTransition.getActionList();
			// transform the actions of this transition
			// to an il1.command for the branch body.
			// First create a java list
			Command subBranchBody = completeIL1ActionSequence(
					stateMachineName, currentState, actionList);
			subBranch.setAction(subBranchBody);
			// parentElseIf is null if this is to be added at the top-level
			if (parentElseif == null)
				topBranch.setBranch(subBranch);
			else
				parentElseif.setBranch(subBranch);
			makeSubBranch(transitPathList, topBranch, stateMachineName,
					currentState, subBranch);
		} 
		else if (transitPathList.size() == 1) {
			// set the elseBranch of the original 'if'.
			TransitPath lastTransition = transitPathList.get(0);
			// Else has no guards so just process the actions.
			List<Action> actionList = lastTransition.getActionList();
			// transform the actions of this transition
			// to an il1.command for the else body.
			// First create a java list
			Command elseBranchBody = completeIL1ActionSequence(
					stateMachineName, currentState, actionList);
			topBranch.setElse(elseBranchBody);
		}
	}

	private void makeSynchSMCallSeq(
			VHDL_TranslationData translationData,
			Subroutine currentStateSubroutine, AbstractNode targetNode,
			List<Statemachine> synchSMList) {
		List<Call> callList = new ArrayList<>();
		for (Statemachine statemachine : synchSMList) {
			// get the pre-existing subroutine for the synchSM
			Subroutine calledSynchSMSubroutine = translationData.synchSM_subroutineMap
					.get(statemachine);
			// create a call and add it to a list of calls
			Call synchSMCall = Il1Factory.eINSTANCE.createCall();
			callList.add(synchSMCall);
			// set the called Synchronous subroutine
			synchSMCall.setSubroutine(EcoreUtil.copy(calledSynchSMSubroutine));
		}
		// Get the subroutine associated with the target node
		Subroutine targetSubroutine = stateSubroutine_Map
				.get(targetNode);
		Seq callSeq = Il1Factory.eINSTANCE.createSeq();
		// convert the list of calls to a sequence
		// the left branch calls the synch state machines
		Command callCommands = makeIL1SeqFromCallList(callList);
		callSeq.setLeftBranch(callCommands);
		// the right branch calls the next-state subroutine
		Call gotoNextstateCall = Il1Factory.eINSTANCE.createCall();
		gotoNextstateCall.setSubroutine(EcoreUtil.copy(targetSubroutine));
		callSeq.setRightBranch(gotoNextstateCall);
		currentStateSubroutine.setBody(callSeq);
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

	// transform the list of Calls to a seq of il1.command for use in the
	// caseStatement body.
	private Command makeIL1SeqFromCallList(List<Call> callList) {
		if (callList.size() == 1) {
			Call call = callList.get(0);
			return call;
		} else if (callList.size() > 1) {
			// Create a new seq. Add the removed call to the left branch
			// and whatever is returned from a recursive call with the
			// remaining calls, to the right branch.
			ArrayList<Call> newCallList = new ArrayList<Call>(callList);
			Call call = newCallList.remove(0);
			Seq seq = Il1Factory.eINSTANCE.createSeq();
			seq.setLeftBranch(call);
			seq.setRightBranch(makeIL1SeqFromCallList(newCallList));
			return seq;
		} else {
			return null;
		}
	}

	// this method adds a next-state subroutine call to a body command,
	// any actions are generated from an actionList.
	private Command completeIL1ActionSequence(State currentState,
			AbstractNode targetNode, List<Action> actionList) {
		// use this command to make a sequence from the list of actions
		Command body = makeIL1SeqFromActionList(actionList);
		// if there is a new target state but not a final impl
		Class<FinalImpl> theFinalImplClass = FinalImpl.class;
		if (targetNode != null && targetNode.getClass() != theFinalImplClass && targetNode != currentState) {
			// create a new next-state subroutine Call
			Call call = Il1Factory.eINSTANCE.createCall();
			// set the subroutine associated with the call
			Subroutine nextStateSubroutine = stateSubroutine_Map
					.get(targetNode);
			// if there is no next state, then we do nothing.
			if(nextStateSubroutine == null){
				return null;
			}
			// We seem to need to copy this, since the subroutine
			// disappears from the task otherwise.
			call.setSubroutine(EcoreUtil.copy(nextStateSubroutine));

			// if the body is null just return the call
			// since we have no actions.
			if (body == null) {
				return call;
			}
			// else add the call to the sequence of actions.
			else {
				Seq seq = Il1Factory.eINSTANCE.createSeq();
				seq.setLeftBranch(body);
				seq.setRightBranch(call);
				body = seq;
				return seq;
			}
		}
		// return the list of actions in the case that there
		// is no next state.
		else{
			return body;
		}
	}

	private List<String> makeIL1GuardsFromEMFGuardList(List<Guard> emfGuardEList) {
		List<String> predicateStringList = new ArrayList<>();
		for (Guard guard : emfGuardEList) {
			predicateStringList.add(guard.getPredicate());
		}
		return predicateStringList;
	}

}
