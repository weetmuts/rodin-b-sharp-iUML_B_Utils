package quickprint.impl;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eventb.codegen.il1.Program;
import org.eventb.codegen.templates.IGenerator;
import org.eventb.codegen.templates.IGeneratorData;

public class TopLevelGenerator implements IGenerator {

	public TopLevelGenerator() {
		
	}

	@Override
	public List<String> generate(IGeneratorData data) throws Exception {
		// data[0] is the program
		Program program = (Program) data.getDataList().get(0);
		QuickPrinter qp = new QuickPrinter();
		qp.printEobject(program);
		return null;
	}

}