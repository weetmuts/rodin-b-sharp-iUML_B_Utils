package ac.soton.codin.codegen.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eventb.codegen.il1.IL1Element;
import org.eventb.codegen.il1.Program;
import org.eventb.codegen.il1.Subroutine;
import org.eventb.codegen.tasking.TaskingTranslationManager;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.impl.MachineImpl;
import org.rodinp.core.IRodinProject;

import ac.soton.codin.codegen.quickPrint.QuickPrintInfo;
import ac.soton.eventb.emf.components.Component;
import ac.soton.eventb.emf.components.Connector;
import ac.soton.eventb.statemachines.AbstractNode;
import ac.soton.eventb.statemachines.State;
import ac.soton.eventb.statemachines.Statemachine;

public class VHDL_TranslationData {

	MachineImpl parentMachine;
	public IRodinProject parentProject = null;
	// The current component (being processed) can be set in 
	// downstream processing to gain access the maps.
	// This should be reset (calling the reset() method)
	// while iterating through components during processing
	public Component currentComponent = null;

	TaskingTranslationManager taskingTranslationManager;
	IL1Element actualTarget;
	// In our translation Events map to sequences, and branches in the process
	// task body.
	// So we record info relating to the events rather than transitions, since
	// transitions may be associated with multiple events.

	// Given a current state node: navigate to next state, via events/joins etc:
	// Descriptively: a map of type CurrentState <-> (Event <-> NextState)
	// Representation of flattened state machine
	public Map<State, Map<Event, AbstractNode>> processSM_flattenedNextStateMap;
	
	// Each state has a list of transit paths; a transit path includes guards and actions.
	public Map<State, List<TransitPath>> processSM_transitPathMap =  new HashMap<State, List<TransitPath>>();

	// Given a synchronous State-machine and current state node: navigate to the
	// next state, via events/joins etc: Descriptively: a map of 
	// type State-machine <-> (CurrentState <-> (Event <-> NextState))
	// Representation of flattened state machine
	public Map<Statemachine,Map<State, Map<Event, AbstractNode>>> synchSM_flattened_nextStateMap = 
			new HashMap<Statemachine, Map<State,Map<Event,AbstractNode>>>();

	// A map to store which state-machines use an event in synchronous
	// state-machines.
	// If an event of a synchronous state-machine appears in a process
	// state-machine then
	// the synch state machine is invoked.
	public Map<Event, List<Statemachine>> synchSMEventUser = new HashMap<Event, List<Statemachine>>();

	// The IL1 program that we will create.
	public Program program;

	// Store the synchronous state-machines for each component
	// in a map of ComponentName <-> ListOfStatemachines
	public Map<String, List<Statemachine>> synchronousSM_Map = new HashMap<String, List<Statemachine>>();
	
	// given a state-machine find the component associated with it.
	// in a map of State-machine <-> Component
	public Map<Statemachine, Component> SM_Component_Map = new HashMap<>();

	// There is just one process state-machine per component,
	// for each component, record the process state-machines
	// in a map of ComponentName <-> ProcessStateMachine
	public Map<String, Statemachine> processSM_Map = new HashMap<String, Statemachine>();

	// Keep track of the components to be translated
	public List<Component> componentList = new ArrayList<>();
	// Keep track of the connectors
	public static List<Connector> connectorList = new ArrayList<>();
		
	// BEGIN: The following maps/data structures are refreshed (cleared) for each new component.
	//
	// In a component: Given a state node, get the events associated with the
	// state
	public Map<State, List<Event>> component_stateEventMap = new HashMap<State, List<Event>>();
	// provide some utilities for each iteration
	public QuickPrintInfo quickPrintInfo = new QuickPrintInfo(this);
	// In a component: Complement to the stateEventMap above: Keys are nodes,
	// but not including states.
	// Given a node, we can get the associated events. (Needed for Joins, in
	// particular)
	public Map<AbstractNode, List<Event>> component_nodeEventMap = new HashMap<AbstractNode, List<Event>>();
	// A map from synchronous state-machines to subroutines
	public Map<Statemachine, Subroutine> synchSM_subroutineMap = new HashMap<Statemachine, Subroutine>();
	// A list of synchronous state-machines for the current component
	public List<Statemachine> synchSMList = new ArrayList<>();
	
	// call reset for each new component
	public void resetMaps() {
		currentComponent = null;
		component_stateEventMap.clear();
		component_nodeEventMap.clear();
		synchronousSM_Map.clear();
		quickPrintInfo = new QuickPrintInfo(this);
		synchSMList.clear();
	}

	// END: of maps refreshed (cleared) for each new component.

}
