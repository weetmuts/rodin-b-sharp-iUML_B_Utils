package ac.soton.codin.codegen.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eventb.codegen.il1.IL1Element;
import org.eventb.codegen.tasking.TaskingTranslationManager;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.impl.MachineImpl;

public class StateMachineTranslationManager {

	 MachineImpl parentMachine;
	 TaskingTranslationManager taskingTranslationManager;
	 IL1Element actualTarget;
	 List<String> stateNames = new ArrayList<String>();
	 Map<String, List<Event>> stateEventMap = new HashMap<String, List<Event>>();
	 Map<String,Integer> stateBranchCount = new HashMap<String, Integer>();

}
