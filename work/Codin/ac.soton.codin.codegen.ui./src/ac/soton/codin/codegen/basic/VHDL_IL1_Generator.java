package ac.soton.codin.codegen.basic;

import org.eventb.codegen.il1.Task;
import org.eventb.codegen.tasking.TaskingTranslationException;

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

	// Coordinator for the process.
	public void doStatemachines(Task task,
			StateMachineTranslationData smTranslationMgr)
			throws TaskingTranslationException, CodinTranslatorException {
		VHDL_IL1_SynchSMGenerator.getDefault().makeSynchSMSubroutines(task, smTranslationMgr);
		VHDL_IL1_ProcSMGenerator.getDefault().makeProcSMStatement(task, smTranslationMgr);
	}


}
