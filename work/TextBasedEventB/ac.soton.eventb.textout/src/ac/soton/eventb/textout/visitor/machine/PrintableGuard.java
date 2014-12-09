package ac.soton.eventb.textout.visitor.machine;

import java.util.ArrayList;
import java.util.List;

import org.eventb.emf.core.machine.Guard;

import ac.soton.eventb.textout.core.ExportTextManager;
import ac.soton.eventb.textout.core.IPrintable;

public class PrintableGuard implements IPrintable {

	private Guard guard;

	public PrintableGuard(Guard guard) {
		this.guard = guard;
	}

	@Override
	public List<String> print() {
		List<String> output = new ArrayList<String>();
		// Add a comment string if necessary
		String comment = ExportTextManager.adjustComment(guard.getComment());
		String theoremString;
		if(guard.isTheorem()){
			theoremString = " theorem";
		}
		else{
			theoremString = " not theorem";
		}
		output.add("@" + guard.getName() + " " + guard.getPredicate() + theoremString + " " + comment);
		return output;
	}

}
