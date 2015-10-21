package ac.soton.eventb.textout.visitor.machine;

import java.util.ArrayList;
import java.util.List;

import org.eventb.emf.core.machine.Guard;

import ac.soton.eventb.textout.IPrintable;
import ac.soton.eventb.textout.utils.ExportTextManager;

public class PrintableGuard implements IPrintable {

	private Guard guard;

	public PrintableGuard(Guard guard) {
		this.guard = guard;
	}

	@Override
	public List<String> print() {
		return print(indent1);
	}

	public List<String> print(String indent) {
		List<String> output = new ArrayList<String>();
		// Add a comment string if necessary
		String comment = ExportTextManager.adjustComment(guard.getComment());
		String theoremString = "";
		if(guard.isTheorem()){
			theoremString = " theorem";
		}
		output.add(indent+"@" + guard.getName() + " \"" + guard.getPredicate() + "\" " + theoremString + " " + comment);
		return output;
	}

}
