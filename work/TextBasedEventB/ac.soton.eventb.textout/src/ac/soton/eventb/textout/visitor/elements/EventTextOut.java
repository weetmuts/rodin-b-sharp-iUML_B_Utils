package ac.soton.eventb.textout.visitor.elements;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eventb.emf.core.machine.Action;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Guard;
import org.eventb.emf.core.machine.Parameter;

import ac.soton.eventb.textout.core.ExportTextManager;

public class EventTextOut {

	public List<String> print(Event event) {
		List<String> output = new ArrayList<>();
		String comment = ExportTextManager.adjustComment(event.getComment());
		output.add("event " + event.getName() + " " + comment);
		EList<Parameter> parameterList = event.getParameters();
		if (parameterList.size() > 0) {
			output.add("any");
			for (Parameter p : parameterList) {
				output.addAll(new ParameterTextOut().print(p));
			}
		}
		EList<Guard> guardList = event.getGuards();
		if (guardList.size() > 0) {
			if(parameterList.size()>0){ output.add("where "); }
			else{output.add("when ");}
			for (Guard guard : guardList) {
				output.addAll(new GuardTextOut().print(guard));
			}
		}
		
		EList<Action> actionList = event.getActions();
		if(actionList.size()>0){
			output.add("actions");
			for(Action action: actionList){
				output.addAll(new PrintableAction(action).print());
			}
		}
		output.add("end");
		return output;
	}

}
