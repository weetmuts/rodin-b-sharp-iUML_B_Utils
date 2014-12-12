package ac.soton.eventb.textout.visitor.machine;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Invariant;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.Variable;

import ac.soton.eventb.printable.IPrintable;
import ac.soton.eventb.textout.core.ExportTextManager;

public class PrintableMachine implements IPrintable {

	protected Machine machine;

	public PrintableMachine(Machine machine) {
		this.machine = machine;
	}

	@Override
	public List<String> print() {
		List<String> output = new ArrayList<String>();
		// Add a comment string if necessary
		String comment = ExportTextManager.adjustComment(machine.getComment());
		// Name
		output.add("machine " + machine.getName() + " " + comment);
		//RefinesNames
		EList<String> refinesNames = machine.getRefinesNames();
		if (refinesNames.size() > 0) {
			output.add("refines ");
			for (String name : refinesNames) {
				output.add(indent1 + name);
			}
		}
		// SeesNames
		EList<String> seesNames = machine.getSeesNames();
		if (seesNames.size() > 0) {
			output.add("sees ");
			for (String name : seesNames) {
				output.add(indent1 + name);
			}
		}
		
		//Variables
		formatVariables(output);

		//Invariants
		EList<Invariant> invariantList = machine.getInvariants();
		if (invariantList.size() > 0) {
			output.add("invariants ");
			for (Invariant invariant : invariantList) {
				for (String s : new PrintableInvariant(invariant).print()) {
					output.add(indent1 + s);
				}
			}
		}

		// Events
		EList<Event> eventList = machine.getEvents();
		if (eventList.size() > 0) {
			output.add("events ");
			for (Event event : eventList) {
				for (String s : new PrintableEvent(event).print()) {
					output.add(indent1 + s);
				}
			}
		}
		output.add("end");

		// Save and open for editing
		String fileName = machine.getName() + ".mch";
		ExportTextManager.saveToFile(output, fileName);
		ExportTextManager.openFileForEditing(fileName, ExportTextManager.rodinProject);
		
		return output;
	}

	private void formatVariables(List<String> output) {
		EList<Variable> variableList = machine.getVariables();
		if (variableList.size() > 0) {
			output.add("variables ");

			List<String> tempStore = new ArrayList<String>();
			for (Variable v : variableList) {
				tempStore.addAll(new PrintableVariable(v).print());
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
				String singleLineOut = indent1;
				boolean first = true;
				for (String s : tempStore) {
					if (first) {
						singleLineOut = singleLineOut + s;
						first = false;
					} else {
						singleLineOut = singleLineOut + " " + s;
					}
				}
				output.add(singleLineOut);
			}
		}
	}
}
