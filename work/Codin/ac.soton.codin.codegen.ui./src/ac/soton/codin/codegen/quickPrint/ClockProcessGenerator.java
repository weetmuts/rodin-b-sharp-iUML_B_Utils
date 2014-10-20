package ac.soton.codin.codegen.quickPrint;

import java.util.ArrayList;
import java.util.List;

import org.eventb.codegen.templates.IGenerator;
import org.eventb.codegen.templates.IGeneratorData;

import ac.soton.codin.codegen.basic.VHDL_TranslationData;
import ac.soton.eventb.statemachines.Statemachine;

public class ClockProcessGenerator implements IGenerator {

	private VHDL_TranslationData translationData =  null;

	@Override
	public List<String> generate(IGeneratorData data) throws Exception {
		List<Object> dataList = data.getDataList();
		for(Object o: dataList){
			if(o instanceof VHDL_TranslationData){
				translationData = (VHDL_TranslationData) o;
				break;
			}
		}
		
		ArrayList<String> returnList = new ArrayList<String>();
		for(Statemachine synchSM: translationData.synchSMList){
			String n = synchSM.getName();
			returnList.add(n + " <= next_" + n +";");
		}
		return returnList;
	}
}
