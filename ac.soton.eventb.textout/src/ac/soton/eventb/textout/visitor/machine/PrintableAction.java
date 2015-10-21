package ac.soton.eventb.textout.visitor.machine;

import java.util.ArrayList;
import java.util.List;

import org.eventb.emf.core.machine.Action;

import ac.soton.eventb.textout.IPrintable;
import ac.soton.eventb.textout.utils.ExportTextManager;

public class PrintableAction implements IPrintable{

	public Action action;
	
	public PrintableAction(Action action){
		this.action = action; 
	}
	
	public List<String> print() {
		return print("");
	}

	public List<String> print(String indent) {
		List<String> output = new ArrayList<String>();
		String comment = ExportTextManager.adjustComment(action.getComment());
		output.add(indent+ "@" + action.getName() + " \"" + action.getAction()+"\" " + comment);
		return output;
	}

}
