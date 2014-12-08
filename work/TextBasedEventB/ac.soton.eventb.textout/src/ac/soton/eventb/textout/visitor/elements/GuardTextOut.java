package ac.soton.eventb.textout.visitor.elements;

import java.util.ArrayList;
import java.util.List;

import org.eventb.emf.core.machine.Guard;

import ac.soton.eventb.textout.core.ExportTextManager;

public class GuardTextOut {

	public List<String> print(Guard guard) {
		List<String> output = new ArrayList<>();
		// Add a comment string if necessary
		String comment = ExportTextManager.adjustComment(guard.getComment());
		output.add("guard" + " " + guard.getName() + " theorem = "
				+ Boolean.toString(guard.isTheorem()) + " " + comment);
		output.add("when " + guard.getPredicate());
		return output;
	}
}
