package ac.soton.eventb.textout.tasking.core;

import java.util.ArrayList;
import java.util.List;

import compositeControl.CompositeControl;

import tasking.AutoTask_Machine;
import ac.soton.eventb.printable.IPrintable;



public class PrintableTasking implements IPrintable {

	private AutoTask_Machine task;

	public PrintableTasking(AutoTask_Machine task) {
		this.task = task;
	}

	@Override
	public List<String> print() {
		List<String> output =  new ArrayList<String>();
		CompositeControl body = task.getTaskBody();
		
		output.add("\n// JUST TESTING EXTENSIBILITY MECHANISM");
		output.add("// This message comes from the Tasking Extension");
		output.add("// and can be implemented if necessary");
		output.add("// At the top-level the task body contains a:");
		output.add("   " + body.toString());
		return output;
	}

}
