package ac.soton.eventb.textout.visitor.elements;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Invariant;
import org.eventb.emf.core.machine.Machine;

public class MachineProcessor {

	public List<String> visit(Machine machine) {
		List<String> output = new ArrayList<>();
		output.add("machine " + machine.getName());
		String comment1 = machine.getComment();
		if (comment1 != null && comment1 != "") {
			output.add("// " + comment1);
		}

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

		EList<Invariant> invariantList = machine.getInvariants();
		if (invariantList.size() > 0) {
			output.add("invariants ");
			for (Invariant invariant : invariantList) {
				output.addAll(new InvariantProcessor().visit(invariant));
			}
		}
		output.add("events ");
		EList<Event> eventList = machine.getEvents();
		for (Event event : eventList) {
			output.addAll(new EventProcessor().visit(event));
		}
		return output;
	}
}
