package ac.soton.codin.codegen.quickPrint;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eventb.codegen.templates.IGenerator;
import org.eventb.codegen.templates.IGeneratorData;

import ac.soton.codin.codegen.basic.VHDL_TranslationData;
import ac.soton.eventb.emf.components.Component;
import ac.soton.eventb.emf.components.Connector;

public class PortMapGenerator implements IGenerator {


	private VHDL_TranslationData translationData;

	@Override
	public List<String> generate(IGeneratorData data) throws Exception {
		List<Object> dataList = data.getDataList();
		for(Object o: dataList){
			if(o instanceof VHDL_TranslationData){
				translationData = (VHDL_TranslationData) o;
				break;
			}
		}
		
		List<String> returnList = new ArrayList<>();
		Component currentComponent = translationData.currentComponent;
		EList<Connector> outConnectors = currentComponent.getOutConnectors();
		EList<Connector> inConnectors = currentComponent.getInConnectors();
		for(Connector outC: outConnectors){
			String typeString = outC.getType();
			returnList.add(outC.getName().toLowerCase() + ": out " + typeString + ";" );
		}
		for(Connector inC: inConnectors){
			String typeString = inC.getType();
			returnList.add(inC.getName().toLowerCase() + ": in " + typeString + ";" );
		}
		// the port map has an extra delimiter, delete it
		String lastString = returnList.get(returnList.size()-1);
		lastString = lastString.replace(";", "");
		returnList.set(returnList.size()-1, lastString);
		
		return returnList;
	}

}
