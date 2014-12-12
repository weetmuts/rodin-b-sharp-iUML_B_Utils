package ac.soton.eventb.textout.visitor.machine;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.EList;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Invariant;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.Variable;
import org.rodinp.core.IRodinProject;

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
		output.add("machine " + machine.getName() + " " + comment);

		EList<String> refinesNames = machine.getRefinesNames();
		if (refinesNames.size() > 0) {
			output.add("refines ");
			for (String name : refinesNames) {
				output.add(indent1 + name);
			}
		}

		EList<String> seesNames = machine.getSeesNames();
		if (seesNames.size() > 0) {
			output.add("sees ");
			for (String name : seesNames) {
				output.add(indent1 + name);
			}
		}

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

		EList<Invariant> invariantList = machine.getInvariants();
		if (invariantList.size() > 0) {
			output.add("invariants ");
			for (Invariant invariant : invariantList) {
				for (String s : new PrintableInvariant(invariant).print()) {
					output.add(indent1 + s);
				}
			}
		}

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

		IRodinProject rodinProject = ExportTextManager.rodinProject;
		IPath parentProjectPath = rodinProject.getProject()
				.getLocation();
		String newFilePath = parentProjectPath.toString() + File.separatorChar
				+ machine.getName() + ".mch";

		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(newFilePath));
			for (String line : output) {
				out.write(line + "\n");
			}
			out.close();
			rodinProject.getResource().refreshLocal(IResource.DEPTH_INFINITE, null);

		} catch (IOException e) {
			e.printStackTrace(System.out);
		} catch (CoreException e) {
			e.printStackTrace();
		}

		return output;
	}
}
