package ac.soton.eventb.textout.tasking.core;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eventb.emf.core.AbstractExtension;
import org.eventb.emf.core.machine.Machine;

import tasking.AutoTask_Machine;
import tasking.Environ_Machine;
import tasking.Shared_Machine;
import tasking.TaskingPackage;
import ac.soton.eventb.textout.visitor.machine.PrintableMachine;


// Currently, the contents of this print method should be copied and pasted
// (or copy the whole class, and refer to that) into ac.soton.eventb.textout
// the PrintableMachine.print(). 
// Ideally a self-referential approach should be used but at this time
// I'm not coding it up.
public class ExtPrintableMachine extends PrintableMachine {

	public ExtPrintableMachine(Machine machine) {
		super(machine);
	}
	
	public List<String> print(){
		List<String> output = super.print();
		
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

		
		return output;
	}

}
