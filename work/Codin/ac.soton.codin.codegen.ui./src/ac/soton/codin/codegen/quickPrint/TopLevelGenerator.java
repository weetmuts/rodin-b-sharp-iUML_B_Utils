package ac.soton.codin.codegen.quickPrint;

import java.util.List;

import org.eventb.codegen.il1.Program;
import org.eventb.codegen.il1.impl.ProgramImpl;
import org.eventb.codegen.templates.IGenerator;
import org.eventb.codegen.templates.IGeneratorData;

public class TopLevelGenerator implements IGenerator {

	@Override
	public List<String> generate(IGeneratorData data) throws Exception {
		List<Object> dataList = data.getDataList();
		Program program = null;
		for(Object o: dataList){
			if(o instanceof ProgramImpl){
				program = (Program) o;
				break;
			}
		}
		
		QuickPrinter qp = new QuickPrinter();
		return qp.printEobject(program);
	}
}
