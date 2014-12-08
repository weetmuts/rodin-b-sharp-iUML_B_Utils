package ac.soton.eventb.textout.visitor.elements;

import java.util.ArrayList;
import java.util.List;

import org.eventb.emf.core.machine.Invariant;

import ac.soton.eventb.textout.core.ExportTextManager;

public class InvariantTextOut {

	public List<String> print(Invariant invariant) {
		List<String> output = new ArrayList<>();
		// Add a comment string if necessary
		String comment = ExportTextManager.adjustComment(invariant.getComment());
		output.add(invariant.getName() + " " + invariant.getPredicate() + " "
				+ "theorem = " + Boolean.toString(invariant.isTheorem()) + " "
				+ comment);
		return output;
	}
}
