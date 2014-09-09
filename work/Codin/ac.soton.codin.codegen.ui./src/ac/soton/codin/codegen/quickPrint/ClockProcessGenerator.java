package ac.soton.codin.codegen.quickPrint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

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
			}
		}
		
		Set<Statemachine> keys = translationData.synchSM_flattened_nextStateMap.keySet();
		List<Statemachine> synchSMList = Arrays.asList(keys.toArray(new Statemachine[keys.size()]));
		ArrayList<String> returnList = new ArrayList<>();
		for(Statemachine synchSM: synchSMList){
			String n = synchSM.getName();
			returnList.add(n + " := next" + n );
		}
		return returnList;
	}
}
