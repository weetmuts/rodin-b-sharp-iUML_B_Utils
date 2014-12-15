package ac.soton.eventb.textout.visitor.machine;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eventb.emf.core.machine.Action;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Guard;
import org.eventb.emf.core.machine.Parameter;
import org.eventb.emf.core.machine.Witness;

import ac.soton.eventb.printable.IPrintable;
import ac.soton.eventb.textout.core.ExportTextManager;

public class PrintableEvent implements IPrintable {

	private Event event;

	public PrintableEvent(Event event) {
		this.event = event;
	}

	@Override
	public List<String> print() {

		List<String> output = new ArrayList<String>();
		String comment = ExportTextManager.adjustComment(event.getComment());
//		String internalString = " internal";
//		if (event.isSetInternalId()) {
//			internalString = " " + event.getInternalId();
//		}
		String extendedString = "";
		if (event.isExtended()) {
			extendedString = " extended";
		} 
		String convergenceString = event.getConvergence().getLiteral();

		output.add("event" + " \"" + event.getName() + "\" " 
				//+ internalString 
				+ extendedString + " "
				+ convergenceString + " " + comment);
		EList<Parameter> parameterList = event.getParameters();
		if (parameterList.size() > 0) {
			output.add("any");
			List<String> tempStore = new ArrayList<String>();
			for (Parameter p : parameterList) {
				tempStore.addAll(new PrintableParameter(p).print());
			}
			// if any parameter has a comment we put each parameter
			// on its own line, else we make it into a sequential list
			boolean hasComments = false;
			for (String s : tempStore) {
				if (s.contains("//")) {
					hasComments = true;
					break;
				}
			}

			if (hasComments) {
				// we found a comment so just add individual lines
				for (String s : tempStore) {
					output.add(indent1 + s);
				}
			} else {
				// no comment found so sequence the parameters
				String out = indent1;
				boolean first = true;
				for (String s : tempStore) {
					if (first) {
						out = out + s;
						first = false;
					} else {
						out = out + " " + s;
					}
				}
				output.add(out);
			}
		}
		EList<Guard> guardList = event.getGuards();
		if (guardList.size() > 0) {
			if (parameterList.size() > 0) {
				output.add("where ");
			} else {
				output.add("when ");
			}
			for (Guard guard : guardList) {
				List<String> guardStringList = new PrintableGuard(guard)
						.print();
				for (String guardString : guardStringList) {
					output.add(indent1 + guardString);
				}
			}
		}

		EList<Witness> witnessList = event.getWitnesses();
		if (witnessList.size() > 0) {
			output.add("with");
			// create a temporary list of witnesses
			for (Witness w : witnessList) {
				output.addAll(new PrintableWitness(w).print());
			}
		}

		EList<Action> actionList = event.getActions();
		if (actionList.size() > 0) {
			output.add("then");
			for (Action action : actionList) {
				List<String> actionStringList = new PrintableAction(action)
						.print();
				for (String actionString : actionStringList) {
					output.add(indent1 + actionString);
				}
			}
		}
		output.add("end");
		return output;
	}
}
