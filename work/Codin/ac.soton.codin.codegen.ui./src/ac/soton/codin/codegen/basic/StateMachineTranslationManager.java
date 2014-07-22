package ac.soton.codin.codegen.basic;

import java.util.ArrayList;
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
	List<String> stateNames = new ArrayList<String>();
	Map<AbstractNode, List<Event>> nodeEventMap = new HashMap<AbstractNode, List<Event>>();
	Map<String, Integer> stateBranchCountMap = new HashMap<String, Integer>();
	Map<State, List<Event>> stateEventMap = new HashMap<State, List<Event>>();;

}
