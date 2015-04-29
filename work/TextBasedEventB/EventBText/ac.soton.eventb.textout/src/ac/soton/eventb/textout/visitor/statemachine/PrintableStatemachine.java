package ac.soton.eventb.textout.visitor.statemachine;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.machine.Action;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Guard;
import org.eventb.emf.core.machine.Invariant;
import org.eventb.emf.core.machine.Witness;

import ac.soton.eventb.emf.core.extension.coreextension.TypedParameter;
import ac.soton.eventb.statemachines.AbstractNode;
import ac.soton.eventb.statemachines.State;
import ac.soton.eventb.statemachines.Statemachine;
import ac.soton.eventb.statemachines.Transition;
import ac.soton.eventb.textout.IPrintable;
import ac.soton.eventb.textout.utils.ExportTextManager;
import ac.soton.eventb.textout.visitor.machine.PrintableAction;
import ac.soton.eventb.textout.visitor.machine.PrintableGuard;
import ac.soton.eventb.textout.visitor.machine.PrintableInvariant;
import ac.soton.eventb.textout.visitor.machine.PrintableWitness;


public class PrintableStatemachine implements IPrintable {

	private Statemachine statemachine;

	public PrintableStatemachine(Statemachine statemachine) {
		this.statemachine = statemachine;
	}

	@Override
	public List<String> print() {
		return print("");
	}

	public List<String> print(String indent){
		List<String> output = new ArrayList<String>();
		
		//construct the Statemachine title line
		String firstLine = "Statemachine \""+ statemachine.getName()+"\"";
		if (statemachine.getInstances()!=null) firstLine += " instances "+getQName(statemachine.getInstances());
		if (statemachine.getSelfName()!=null && statemachine.getSelfName().length()>0) firstLine += " selfName \""+statemachine.getSelfName()+"\"";
		firstLine += " translation "+statemachine.getTranslation().getLiteral();
		if (statemachine.getElaborates()!=null) firstLine += " elaborates \""+statemachine.getElaborates().getName()+"\"";
		if (statemachine.getRefines()!=null) firstLine += " refines "+getQName(statemachine.getRefines());
		if (statemachine.getComment()!=null && statemachine.getComment().length()>0) 
			firstLine += " >\""+statemachine.getComment()+"\"";
		output.add(indent+firstLine);
		
		//Construct the list of nodes
		List<AbstractNode> nodeList = statemachine.getNodes();
		if (!nodeList.isEmpty()) output.add(indent+"nodes");
		for(int i = 0; i< nodeList.size(); i++){
			List<String> nodeText = printNode(indent+"\t", nodeList.get(i));
			output.addAll(nodeText);
			if (i<nodeList.size()-1){
				addToLastLine(output, " ,");
			}	
		}
		
		//Construct the list of transitions
		List<Transition> transitionList = statemachine.getTransitions();
		if (!transitionList.isEmpty()){
			output.add(indent+"transitions");
			for (Transition transition : transitionList) {
				output.addAll(printTransition(indent+"\t", transition));
			}
		}
		
		output.add(indent+"end");
		return output;
	}

	private void addToLastLine(List<String> output, String string) {
		int size = output.size();
		String lastLine = output.get(size-1);
		lastLine += string;
		output.set(size-1, lastLine);
	}

	private List<String> printNode(String indent, AbstractNode node) {
		List<String> output = new ArrayList<String>();
		//construct the Node title line
		String firstLine = node.eClass().getName()+" \"" + node.getName() + "\"";
		if (node instanceof State && ((State)node).getRefines()!=null ){
			firstLine += " refines "+getQName(((State)node).getRefines());
		}
		output.add(indent+firstLine);
		
		String newIndent = indent+"\t";
		
		if (node instanceof State){
			State state = (State)node;
			//Invariants
			EList<Invariant> invariantList = state.getInvariants();
			if (invariantList.size() > 0) {
				output.add(newIndent+"invariants ");
				for (Invariant invariant : invariantList) {
					output.addAll(new PrintableInvariant(invariant).print(newIndent));
				}
			}
			//nestedStatemachines
			EList<Statemachine> statemachinesList = state.getStatemachines();
			if (statemachinesList.size() > 0) {
				output.add(newIndent+"statemachines ");
				for (Statemachine statemachine : statemachinesList) {
					output.addAll(new PrintableStatemachine(statemachine).print(newIndent+"\t"));
				}
				output.add(newIndent+"end");
			}
		}
		
		return output;
	}

	
	private List<String> printTransition(String indent, Transition transition) {
		List<String> output = new ArrayList<String>();
		
		//construct the transition title line
		String firstLine = (transition.isExtended()? "extended" : "")+"Transition";
		firstLine += " elaborates";
		for (Event elab : transition.getElaborates()){
			firstLine += " "+getQName(elab);
		}
		if (transition.getComment()!=null && transition.getComment().length()>0) 
			firstLine += " >\""+transition.getComment()+"\"";
		output.add(indent+firstLine);

		String newIndent = indent+"\t";
		
		String secondLine = "source "+getQName(transition.getSource());
		secondLine += " target "+getQName(transition.getTarget());

		output.add(newIndent+secondLine);
		
		EList<TypedParameter> parameters = transition.getParameters();
		if (parameters.size() > 0) {
			output.add(indent+"parameters");
			for (TypedParameter p : parameters) {
				String ptext = p.getName()+" \u2208 \""+p.getType()+"\"";
				if (p.getComment()!=null && p.getComment().length()>0) 
					ptext += " >\""+p.getComment()+"\"";
				output.add(newIndent+ptext);
			}
		}
		
		EList<Guard> guards = transition.getGuards();
		if (guards.size() > 0) {
			output.add(indent+"where");
			for (Guard g : guards) {
				output.addAll(new PrintableGuard(g).print(newIndent));
			}
		}
		
		EList<Witness> witnesses = transition.getWitnesses();
		if (witnesses.size() > 0) {
			output.add(indent+"with");
			for (Witness w : witnesses) {
				output.addAll(new PrintableWitness(w).print(newIndent));
			}
		}
		
		EList<Action> actions = transition.getActions();
		if (actions.size() > 0) {
			output.add(indent+"then");
			for (Action a : actions) {
				output.addAll(new PrintableAction(a).print(newIndent));
			}
		}

		output.add(indent+"end");
		return output;
	}
	
	private String getQName(EventBElement el){
		String qn = el.getReference();
		qn = qn.substring(qn.lastIndexOf("::")+2);
		qn = qn.replace('.', '\u00b7');
		return qn;
	}
}
