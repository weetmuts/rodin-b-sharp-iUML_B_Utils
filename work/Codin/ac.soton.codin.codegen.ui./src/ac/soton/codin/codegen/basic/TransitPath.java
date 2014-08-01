package ac.soton.codin.codegen.basic;

import java.util.ArrayList;
import java.util.List;

import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Guard;

import ac.soton.eventb.statemachines.AbstractNode;

public class TransitPath {
	private List<Guard> guardList = new ArrayList<Guard>();
	private Event event;
	private AbstractNode targetNode;
	
	public AbstractNode getTargetNode() {
		return targetNode;
	}

	public void setTargetNode(AbstractNode targetNode) {
		this.targetNode = targetNode;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public List<Guard> getGuardList() {
		return guardList;
	}
	
	public void setGuardList(List<Guard> guardList) {
		this.guardList = guardList;
	}
		
	
}
