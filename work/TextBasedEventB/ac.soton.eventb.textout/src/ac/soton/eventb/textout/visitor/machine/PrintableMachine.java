package ac.soton.eventb.textout.visitor.machine;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eventb.codegen.il1.Il1Factory;
import org.eventb.codegen.il1.Il1Package;
import org.eventb.codegen.il1.Task;
import org.eventb.emf.core.AbstractExtension;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Invariant;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.Variable;

import tasking.AutoTask_Machine;
import tasking.Environ_Machine;
import tasking.Shared_Machine;
import tasking.TaskingPackage;
import tasking.Tasking_Machine;
import tasking.impl.AutoTask_MachineImpl;
import tasking.impl.Tasking_MachineImpl;
import ac.soton.eventb.printable.IPrintable;
import ac.soton.eventb.textout.core.ExportTextManager;
import ac.soton.eventb.textout.tasking.core.PrintableTasking;

public class PrintableMachine implements IPrintable {

	private Machine machine;

	public PrintableMachine(Machine machine) {
		this.machine = machine;
	}

	@Override
	public List<String> print(){
		List<String> output = new ArrayList<String>();
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
			
			List<String> tempStore = new ArrayList<String>();
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
		
		
		EList<AbstractExtension> extensions = machine.getExtensions();
		
		for(AbstractExtension abstractExtension: extensions){
			EClass extensionEclass = abstractExtension.eClass();
			EClass autoTaskEClass = TaskingPackage.Literals.AUTO_TASK_MACHINE;
			EClass sharedEClass = TaskingPackage.Literals.SHARED_MACHINE;
			EClass environTaskEClass = TaskingPackage.Literals.ENVIRON_MACHINE;
			
			if(extensionEclass == autoTaskEClass){
				AutoTask_Machine autoTask = (AutoTask_Machine) abstractExtension;
				output.addAll(new PrintableTasking(autoTask).print());
			}
			else if(extensionEclass == sharedEClass){
				Shared_Machine sharedMachine = (Shared_Machine) abstractExtension;
				//TODO
				System.out.println();
			}
			else if(extensionEclass == environTaskEClass){
				Environ_Machine environMachine = (Environ_Machine) abstractExtension;
				//TODO
				System.out.println();
			}
			
		}
		
		
		output.add("end");
		return output;
	}
}
