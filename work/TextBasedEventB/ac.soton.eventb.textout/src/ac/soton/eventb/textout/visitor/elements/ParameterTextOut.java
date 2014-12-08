package ac.soton.eventb.textout.visitor.elements;

import java.util.ArrayList;
import java.util.List;

import org.eventb.emf.core.machine.Parameter;

import ac.soton.eventb.textout.core.ExportTextManager;

public class ParameterTextOut {

	public List<String> print(Parameter p) {
		List<String> output = new ArrayList<>();
		String comment = ExportTextManager.adjustComment(p.getComment());
		output.add(p.getName() + " " + comment);
		return output;
	}

}
