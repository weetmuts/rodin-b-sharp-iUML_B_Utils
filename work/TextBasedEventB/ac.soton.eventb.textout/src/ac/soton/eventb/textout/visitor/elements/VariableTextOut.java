package ac.soton.eventb.textout.visitor.elements;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eventb.emf.core.machine.Variable;

import ac.soton.eventb.textout.core.ExportTextManager;

public class VariableTextOut {

	public Collection<? extends String> print(Variable v) {
		List<String> output = new ArrayList<>();
		// Add a comment string if necessary
		String comment = ExportTextManager.adjustComment(v.getComment());
		output.add(v.getName() + " " + comment);
		return output;
	}

}
