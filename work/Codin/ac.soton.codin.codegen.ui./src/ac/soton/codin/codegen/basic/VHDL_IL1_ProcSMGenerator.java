package ac.soton.codin.codegen.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eventb.codegen.il1.Call;
import org.eventb.codegen.il1.Command;
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

	private Program program = null;
	private Map<State, Subroutine> state_SubroutineMap = new HashMap<State, Subroutine>();
	private State dummyTopState;

	public void makeProcSMStatement(Task task,
			StateMachineTranslationData smTranslationMgr)
			throws CodinTranslatorException {
		program = smTranslationMgr.program;
		// make a subroutine for each state in the process state-machine
		makeSubroutines(smTranslationMgr);
		// in the second pass we provide the subroutine bodies
		makeSubroutineBodies(smTranslationMgr);

	}

	private void makeSubroutineBodies(
			StateMachineTranslationData smTranslationMgr) {

		for (State state : smTranslationMgr.processSM_transitPaths.keySet()) {
			// Get the transit paths for this state
			List<TransitPath> transitPathList = smTranslationMgr.processSM_transitPaths
					.get(state);
			// get the subroutine for this state that was generated in the first pass.
			Subroutine subroutine = state_SubroutineMap.get(state);
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
				List<Statemachine> synchSMList = smTranslationMgr.synchSMEventUser
						.get(transitEvent);
				List<Call> callList = new ArrayList<>();
				// if the event is associated with a synch state-machine
				if (synchSMList != null && synchSMList.size() > 0) {
					for (Statemachine statemachine : synchSMList) {
						// get the pre-existing subroutine for the synchSM
						Subroutine calledSynchSMSubroutine = smTranslationMgr.synchSM_subroutineMap
								.get(statemachine);
						Call synchSMCall = Il1Factory.eINSTANCE.createCall();
						callList.add(synchSMCall);
						synchSMCall.setSubroutine(calledSynchSMSubroutine);
					}
					Subroutine nextstateSubroutine = state_SubroutineMap.get(targetNode);
					Seq seq = Il1Factory.eINSTANCE.createSeq();
					// convert the list of calls to a sequence
										
					
					// the left branch calls the synch state machines
										
					
					seq.setLeftBranch(synchSMCall);
					// the right branch calls the next-state subroutine
					Call nextStateCall = Il1Factory.eINSTANCE.createCall();
					nextStateCall.setSubroutine(nextstateSubroutine);
					seq.setRightBranch(nextStateCall);
				}
				// else the event is a simple transition with a call to its next state
				else{
					List<Action> emfActionList = transitPath.getActionList();
					Command command = completeIL1CaseActionSequence(state, targetNode, emfActionList);
					
				}
				
				
				
				
				
				subroutine.setBody(command);
			}
			// if there are multiple transit paths
			else if (transitPathList.size() > 1) {
				// each path has a branch/subbranch
				boolean first = true;

				// ???? if the event is associated with a synch state-machine
				// ???? else the event is a simple transition with a call to its next state

				
				
				for(TransitPath transitPath: transitPathList){
					if(first){
						first = false;
						makeBranch(state, transitPath);
					}
					else{
						makeSubBranch(state,transitPath);
					}
				}
			}
			// there are no transit paths, do nothing
			else {
			}
		}
	}

	private void makeSubBranch(State state, TransitPath transitPath) {
		// TODO Auto-generated method stub
		
	}

	private void makeBranch(State state, TransitPath transitPath) {
		AbstractNode targetNode = transitPath.getTargetNode();
		List<Action> emfActionList = transitPath.getActionList();
		List<Guard> emfGuardList = transitPath.getGuardList();
		List<String> guardList = makeIL1GuardsFromEMFGuardList(emfGuardList);
		Command command = completeIL1CaseActionSequence(state, targetNode, emfActionList);
		If topBranch = Il1Factory.eINSTANCE.createIf();
		topBranch.getCondition().addAll(guardList);
		topBranch.setBody(command);
	}

	// This method builds subroutines for the process state machine
	private void makeSubroutines(StateMachineTranslationData smTranslationMgr)
			throws CodinTranslatorException {
		// each state has an associated subroutine
		for (State state : smTranslationMgr.processSM_transitPaths.keySet()) {
			dummyTopState = null;
			if (state.getName().equals("dummyTopState")) {
				dummyTopState = state;
			}
			Subroutine stateSubroutine = Il1Factory.eINSTANCE
					.createSubroutine();
			program.getSubroutines().add(stateSubroutine);
			stateSubroutine.setName(state.getName());
			stateSubroutine.setMachineName(smTranslationMgr.parentMachine
					.getName());
			stateSubroutine.setProjectName(smTranslationMgr.parentProject
					.getProject().getName());
			stateSubroutine.setTemporary(false);
			// we'll keep a map of State<->state-subroutine for our own use
			state_SubroutineMap.put(state, stateSubroutine);
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

	// this method adds a next-state subroutine call to a body command, 
	// any actions are generated from an actionList.
	private Command completeIL1CaseActionSequence(State currentState,
			AbstractNode targetNode, List<Action> actionList) {
		// use this command to make a sequence from the list of actions
		Command body = makeIL1SeqFromActionList(actionList);
		// if there is a new target state
		if (targetNode != null && targetNode != currentState){
			// create a new next-state subroutine Call
			Call call = Il1Factory.eINSTANCE
					.createCall();
			// set the subroutine associated with the call
			Subroutine nextStateSubroutine = state_SubroutineMap.get(targetNode);
			call.setSubroutine(nextStateSubroutine);
			
			// if the body is null
			if (body == null) {
				// Set the new state update action as the body.
				body = call;
			}
			// else add it to an existing body.
			else {
				Seq seq = Il1Factory.eINSTANCE.createSeq();
				seq.setLeftBranch(body);
				seq.setRightBranch(call);
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

}
