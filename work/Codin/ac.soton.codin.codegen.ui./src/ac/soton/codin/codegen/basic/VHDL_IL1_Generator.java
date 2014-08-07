package ac.soton.codin.codegen.basic;

import org.eventb.codegen.il1.Task;
import org.eventb.codegen.tasking.TaskingTranslationException;
import org.eventb.emf.core.EventBElement;

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

	// Generate the IL1 model.
	public void run(Task task,
			StateMachineTranslationData smTranslationMgr, EventBElement emfMachine)
			throws TaskingTranslationException, CodinTranslatorException {
		// Run the state-machine processor on the state-machines.
		// this should generate a map of states to events and next states.
		StateMachinePreprocessor.getDefault().preProcess(emfMachine, 
				smTranslationMgr.taskingTranslationManager, smTranslationMgr);
		// We can use the maps to generate the IL1 control flow for the state machines. 
		VHDL_IL1_SynchSMGenerator.getDefault().makeSynchSMSubroutines(task, smTranslationMgr);
		VHDL_IL1_ProcSMGenerator.getDefault().makeProcSMStatement(task, smTranslationMgr);
		
		// add variables and initialisations etc

	}
}
