package ac.soton.codin.codegen.basic;

import java.util.ArrayList;
import java.util.List;

import org.eventb.codegen.il1.Declaration;
import org.eventb.codegen.il1.Program;

public class VHDL_IL1_DeclarationsGenerator {

	private static VHDL_IL1_DeclarationsGenerator singleton;

	public static VHDL_IL1_DeclarationsGenerator getDefault() {
		if (singleton == null) {
			singleton = new VHDL_IL1_DeclarationsGenerator();
			return singleton;
		} else {
			return singleton;
		}
	}

	private Program program;

	public void run(StateMachineTranslationData smTranslationMgr) {
		this.program = smTranslationMgr.program;
		List<Declaration> newDeclarationList = new ArrayList<>();
		// get the variables from the top-level and components.
		
		
		
		program.getDecls().addAll(newDeclarationList);
	}

}
