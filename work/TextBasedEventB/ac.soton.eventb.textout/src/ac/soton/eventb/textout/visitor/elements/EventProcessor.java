package ac.soton.eventb.textout.visitor.elements;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Guard;
import org.eventb.emf.core.machine.Parameter;

public class EventProcessor {

	public List<String> visit(Event event) {
		List<String> output = new ArrayList<>();
		output.add("event ");
		EList<Parameter> parameterList = event.getParameters();
		if (parameterList.size() > 0) {
			output.add("parameters");
			for (Parameter p : parameterList) {
				output.addAll(new ParameterProcessor().visit(p));
			}
		}
		EList<Guard> guardList = event.getGuards();
		if (guardList.size() > 0) {
			output.add("guards ");
			for (Guard guard : guardList) {
				output.add("guard");
				output.add(guard.getName());
				output.add("when " + guard.getPredicate());
				output.add("theorem = " + Boolean.toString(guard.isTheorem()));
				
				String comment = guard.getComment();
				if(comment != null && comment != ""){
					output.add("// " + comment);
				}
			}
		}
		event.getActions();
		return output;
	}

}
