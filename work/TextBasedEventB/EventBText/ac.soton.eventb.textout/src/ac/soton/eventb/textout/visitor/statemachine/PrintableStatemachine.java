package ac.soton.eventb.textout.visitor.statemachine;
import java.util.ArrayList;
import java.util.List;

import ac.soton.eventb.printable.IPrintable;
import ac.soton.eventb.statemachines.AbstractNode;
import ac.soton.eventb.statemachines.State;
import ac.soton.eventb.statemachines.Statemachine;


public class PrintableStatemachine implements IPrintable {

	private Statemachine statemachine;

	public PrintableStatemachine(Statemachine statemachine) {
		this.statemachine = statemachine;
	}

	@Override
	public List<String> print() {
		List<String> output = new ArrayList<String>();
		output.add("Statemachine \""+ statemachine.getName()+"\"");
		List<AbstractNode> nodeList = statemachine.getNodes();
		if(nodeList.size()>0){
			output.add("nodes");
		}
		//print all but the last node with delimiter
		for(int i = 0; i< nodeList.size()-1; i++){
			AbstractNode node = nodeList.get(i);
			printNode(output, node, ",");

		}
		//print the last node without a delimiter
		printNode(output, nodeList.get(nodeList.size()), "");
		return output;
	}

	private void printNode(List<String> output, AbstractNode node, String delimiter) {
		State state = (State) node;
		if( node instanceof State){
			output.add("State \"" + state.getName() + "\"" + delimiter);
		}
		else{
			String typePrefix = node.getElementTypePrefix();
			int typeLocation = typePrefix.lastIndexOf("::") + 2;
			String type = typePrefix.substring(typeLocation);
			output.add(type + delimiter);
		}
	}

}
