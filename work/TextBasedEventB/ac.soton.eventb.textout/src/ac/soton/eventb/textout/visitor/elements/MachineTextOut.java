package ac.soton.eventb.textout.visitor.elements;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Invariant;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.Variable;

import ac.soton.eventb.textout.core.ExportTextManager;

public class MachineTextOut {

	public List<String> print(Machine machine) {
		List<String> output = new ArrayList<>();
		// Add a comment string if necessary
		String comment = ExportTextManager.adjustComment(machine.getComment());
		output.add("machine " + machine.getName() + " " + comment);

		EList<String> refinesNames = machine.getRefinesNames();
		if (refinesNames.size() > 0) {
			output.add("refines ");
			output.addAll(refinesNames);
		}

		EList<String> seesNames = machine.getSeesNames();
		if (seesNames.size() > 0) {
			output.add("sees ");
			output.addAll(seesNames);
		}

		EList<Variable> variableList = machine.getVariables();
		if (variableList.size() > 0) {
			output.add("variables ");
			for (Variable v : variableList) {
				output.addAll(new VariableTextOut().print(v));
			}
		}

		EList<Invariant> invariantList = machine.getInvariants();
		if (invariantList.size() > 0) {
			output.add("invariants ");
			for (Invariant invariant : invariantList) {
				output.addAll(new InvariantTextOut().print(invariant));
			}
		}

		EList<Event> eventList = machine.getEvents();
		if (eventList.size() > 0) {
			output.add("events ");
			for (Event event : eventList) {
				output.addAll(new EventTextOut().print(event));
			}
		}
		output.add("end");
		return output;
	}
}
