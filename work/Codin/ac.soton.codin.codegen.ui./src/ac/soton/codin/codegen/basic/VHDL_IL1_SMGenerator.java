package ac.soton.codin.codegen.basic;

import org.eventb.codegen.il1.Task;
import org.eventb.codegen.tasking.TaskingTranslationException;
import org.eventb.emf.core.EventBElement;

public class VHDL_IL1_SMGenerator {

	private static VHDL_IL1_SMGenerator singleton = null;

	public static VHDL_IL1_SMGenerator getDefault() {
		if (singleton == null) {
			singleton = new VHDL_IL1_SMGenerator();
			return singleton;
		} else {
			return singleton;
		}
	}

	// Generate the IL1 model.
	public void run(Task task,
			VHDL_TranslationData translationData, EventBElement emfMachine)
			throws TaskingTranslationException, CodinTranslatorException {
		// Run the state-machine processor on the state-machines.
		// this should generate a map of states to events and next states.
		StateMachinePreprocessor.getDefault().run(emfMachine, translationData);
		// We can use the maps to generate the IL1 control flow for the state machines. 
		VHDL_IL1_SynchSMSubroutineGen.getDefault().run(task, translationData);
		// Downstream processing makes use of the fact that synchSM subroutines
		// are generated BEFORE the process state machine. Do not change this
		// order without due consideration.
		VHDL_IL1_ProcSMStatementGen.getDefault().run(task, translationData);
	}
}
