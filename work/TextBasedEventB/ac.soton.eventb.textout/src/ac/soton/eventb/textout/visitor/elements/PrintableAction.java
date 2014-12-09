package ac.soton.eventb.textout.visitor.elements;

import java.util.ArrayList;
import java.util.List;

import org.eventb.emf.core.machine.Action;

import ac.soton.eventb.textout.core.ExportTextManager;

public class PrintableAction implements IPrintable{

	public Action action;
	
	public PrintableAction(Action action){
		this.action = action; 
	}
	
	public List<String> print() {
		List<String> output = new ArrayList<>();
		String comment = ExportTextManager.adjustComment(action.getComment());
		output.add("action" + " " + action.getName() + " " + comment);
		output.add("then " + action.getAction());
		return output;
	}

}
