package ac.soton.eventb.textout.visitor.elements;

import java.util.ArrayList;
import java.util.List;

import org.eventb.emf.core.machine.Invariant;

public class InvariantProcessor {

	public List<String> visit(Invariant invariant) {
		List<String> output = new ArrayList<>();
		output.add(invariant.getName());
		output.add(invariant.getPredicate());
		output.add("theorem = " + Boolean.toString(invariant.isTheorem()));
		output.add("// " + invariant.getComment());
		return output;
	}


}
