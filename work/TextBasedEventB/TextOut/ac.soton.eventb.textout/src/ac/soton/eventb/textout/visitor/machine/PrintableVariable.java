package ac.soton.eventb.textout.visitor.machine;

import java.util.ArrayList;
import java.util.List;

import org.eventb.emf.core.machine.Variable;

import ac.soton.eventb.printable.IPrintable;
import ac.soton.eventb.textout.core.ExportTextManager;

public class PrintableVariable implements IPrintable {

	private Variable variable;

	public PrintableVariable(Variable variable) {
		this.variable = variable;
	}

	@Override
	public List<String> print() {
		List<String> output = new ArrayList<String>();
		// Add a comment string if necessary
		String comment = ExportTextManager.adjustComment(variable.getComment());
		output.add(variable.getName() + " " + comment);
		return output;
	}

}
