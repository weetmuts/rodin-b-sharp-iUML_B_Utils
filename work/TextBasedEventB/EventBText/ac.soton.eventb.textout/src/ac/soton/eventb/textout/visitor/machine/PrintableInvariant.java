package ac.soton.eventb.textout.visitor.machine;

import java.util.ArrayList;
import java.util.List;

import org.eventb.emf.core.machine.Invariant;

import ac.soton.eventb.textout.IPrintable;
import ac.soton.eventb.textout.core.ExportTextManager;

public class PrintableInvariant implements IPrintable {

	private Invariant invariant;

	public PrintableInvariant(Invariant invariant) {
		this.invariant = invariant;
	}

	@Override
	public List<String> print() {
		return print("");
	}

	public List<String> print(String indent) {
		List<String> output = new ArrayList<String>();
		// Add a comment string if necessary
		String comment = ExportTextManager
				.adjustComment(invariant.getComment());
		String theoremString = "";
		if (invariant.isTheorem()) {
			theoremString = " theorem";
		} 
		output.add(indent+"@" + invariant.getName() + " \"" + invariant.getPredicate()
				+ "\" " + theoremString + " " + comment);
		return output;
	}

}
