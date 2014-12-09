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

	String indent1 = " ";
	
	public List<String> print(Machine machine) {
		List<String> output = new ArrayList<>();
		// Add a comment string if necessary
		String comment = ExportTextManager.adjustComment(machine.getComment());
		output.add("machine " + machine.getName() + " " + comment);

		EList<String> refinesNames = machine.getRefinesNames();
		if (refinesNames.size() > 0) {
			output.add("refines ");
			for(String name : refinesNames){
				output.add(indent1 + name);
			}
		}

		EList<String> seesNames = machine.getSeesNames();
		if (seesNames.size() > 0) {
			output.add("sees ");
			for(String name: seesNames){
				output.add(indent1 + name);
			}
		}

		EList<Variable> variableList = machine.getVariables();
		if (variableList.size() > 0) {
			output.add("variables ");
			
			List<String> tempStore = new ArrayList<>();
			for (Variable v : variableList) {				
				tempStore.addAll(new PrintableVariable(v).print());
			}
			// if any parameter has a comment we put each parameter
			// on its own line, else we make it into a sequential list			
			boolean hasComments = false;
			for(String s: tempStore){
				if(s.contains("//")){
					hasComments = true;
					break;
				}
			}
			
			if(hasComments){
				//we found a comment so just add individual lines
				for(String s: tempStore){
					output.add(indent1 + s);
				}
			}
			else{
				// no comment found so sequence the parameters
				String out = indent1;
				boolean first = true;
				for(String s: tempStore){
					if(first){
						out = out + s;
						first = false;
					}
					else{
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
				for(String s: new PrintableInvariant(invariant).print()){
					output.add(indent1 + s);
				}
			}
		}

		EList<Event> eventList = machine.getEvents();
		if (eventList.size() > 0) {
			output.add("events ");
			for (Event event : eventList) {
				for(String s: new PrintableEvent(event).print()){
					output.add(indent1 + s);
				}
			}
		}
		output.add("end");
		return output;
	}
}
