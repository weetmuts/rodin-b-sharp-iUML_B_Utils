package ac.soton.eventb.textout.visitor.context;

import java.util.ArrayList;
import java.util.List;

import org.eventb.emf.core.context.Axiom;

import ac.soton.eventb.printable.IPrintable;
import ac.soton.eventb.textout.core.ExportTextManager;

public class PrintableAxiom implements IPrintable {

	private Axiom axiom;

	public PrintableAxiom(Axiom axiom) {
		this.axiom = axiom;
	}

	@Override
	public List<String> print() {
		List<String> output = new ArrayList<String>();
		// Add a comment string if necessary
		String comment = ExportTextManager
				.adjustComment(axiom.getComment());
		String theoremString = "";
		if (axiom.isTheorem()) {
			theoremString = " theorem";
		} 
		output.add("@" + axiom.getName() + " \"" + axiom.getPredicate()
				+ "\" " + theoremString + " " + comment);
		return output;
	}
}
