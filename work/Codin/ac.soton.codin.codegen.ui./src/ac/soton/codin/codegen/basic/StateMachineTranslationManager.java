package ac.soton.codin.codegen.basic;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eventb.codegen.il1.IL1Element;
import org.eventb.codegen.tasking.TaskingTranslationManager;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.impl.MachineImpl;

import ac.soton.eventb.statemachines.AbstractNode;
import ac.soton.eventb.statemachines.State;

public class StateMachineTranslationManager {

	
	MachineImpl parentMachine;
	TaskingTranslationManager taskingTranslationManager;
	IL1Element actualTarget;
	// In our translation Events map to sequences, and branches in the process task body.
	// So we record info relating to the events rather than transitions, since
	// transitions may be associated with multiple events.
	
	// Given a state node, get the events associated with the state
	Map<State, List<Event>> stateEventMap = new HashMap<State, List<Event>>();

	// Complement to the stateEventMap above: Keys are nodes, but not including states.
	// Given a node, we can get the associated events. (Needed for Joins, in particular)
	Map<AbstractNode, List<Event>> nodeEventMap = new HashMap<AbstractNode, List<Event>>();

	// Given a current state node: navigate to next state, via events/joins etc: 
	// Descriptively: a map of type CurrentState <-> (Event <-> NextState)
	Map<State,Map<Event,AbstractNode>> current_NextStateMap = new HashMap<State,Map<Event,AbstractNode>>();

}
