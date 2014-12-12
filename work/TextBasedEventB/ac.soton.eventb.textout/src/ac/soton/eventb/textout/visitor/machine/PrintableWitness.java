package ac.soton.eventb.textout.visitor.machine;

import java.util.ArrayList;
import java.util.List;

import org.eventb.emf.core.machine.Witness;

import ac.soton.eventb.printable.IPrintable;
import ac.soton.eventb.textout.core.ExportTextManager;

public class PrintableWitness implements IPrintable {

	private Witness witness;

	public PrintableWitness(Witness witness) {
		this.witness = witness;
	}

	@Override
	public List<String> print() {
		List<String> output = new ArrayList<String>();
		String name = witness.getName();
		String pred = witness.getPredicate();
		String comment = witness.getComment();
		comment = ExportTextManager.adjustComment(comment);
		output.add(indent1 + "@" + name + " \"" + pred + "\" " + comment);
		return output;
	}

}
