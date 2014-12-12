package ac.soton.eventb.textout.visitor.machine;

import java.util.ArrayList;
import java.util.List;

import org.eventb.emf.core.machine.Action;

import ac.soton.eventb.printable.IPrintable;
import ac.soton.eventb.textout.core.ExportTextManager;

public class PrintableAction implements IPrintable{

	public Action action;
	
	public PrintableAction(Action action){
		this.action = action; 
	}
	
	public List<String> print() {
		List<String> output = new ArrayList<String>();
		String comment = ExportTextManager.adjustComment(action.getComment());
		output.add("@" + action.getName() + " \"" + action.getAction()+"\" " + comment);
		return output;
	}

}
