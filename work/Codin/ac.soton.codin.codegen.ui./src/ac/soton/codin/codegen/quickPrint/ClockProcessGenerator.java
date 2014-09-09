package ac.soton.codin.codegen.quickPrint;

import java.util.List;
import java.util.Set;

import org.eventb.codegen.templates.IGenerator;
import org.eventb.codegen.templates.IGeneratorData;

import ac.soton.codin.codegen.basic.VHDL_TranslationData;

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
		
		Set<String> keys = translationData.synchronousSM_Map.keySet();
		return null;
	}

}
