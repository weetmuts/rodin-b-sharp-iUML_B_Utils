package ac.soton.eventb.textout.visitor.elements;

import java.util.ArrayList;
import java.util.List;

import org.eventb.emf.core.machine.Parameter;

public class ParameterProcessor {

	public List<String> visit(Parameter p) {
		List<String> output = new ArrayList<>();
		output.add(p.getName());
		return output;
	}

}
