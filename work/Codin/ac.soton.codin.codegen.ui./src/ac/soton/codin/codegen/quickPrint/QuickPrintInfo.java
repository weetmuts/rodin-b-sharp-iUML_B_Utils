package ac.soton.codin.codegen.quickPrint;

import java.util.ArrayList;
import java.util.List;

import ac.soton.codin.codegen.basic.VHDL_TranslationData;
import ac.soton.eventb.emf.components.Connector;
import ac.soton.eventb.statemachines.Statemachine;

public class QuickPrintInfo {
	private static List<Connector> conns = new ArrayList<>();
	private VHDL_TranslationData translationData;
	
	
	
	public QuickPrintInfo(VHDL_TranslationData vhdl_translationData) {
		this.translationData = vhdl_translationData;
	}

	public List<Connector> getConnectorList(){
		return conns;
	}
	
	public List<String> getConnectorNameList() {
		List<Connector> connectorList = getConnectorList();
		List<String> connectorNamesList = new ArrayList<>();
		for (Connector c : connectorList) {
			connectorNamesList.add(c.getName().toLowerCase());
		}
		return connectorNamesList;
	}

	public List<String> getSynchSMNamesList() {
		ArrayList<String> returnList = new ArrayList<>();
		for(Statemachine s: translationData.synchSMList){
			returnList.add(s.getName());
		}
		return returnList;
	}
}
