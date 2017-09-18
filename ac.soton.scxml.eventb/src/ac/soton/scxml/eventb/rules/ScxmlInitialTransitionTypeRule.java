/*******************************************************************************
 *  Copyright (c) 2016 University of Southampton.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *   
 *  Contributors:
 *  University of Southampton - Initial implementation
 *******************************************************************************/
package ac.soton.scxml.eventb.rules;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tests.sample.scxml.ScxmlAssignType;
import org.eclipse.sirius.tests.sample.scxml.ScxmlInitialType;
import org.eclipse.sirius.tests.sample.scxml.ScxmlPackage;
import org.eclipse.sirius.tests.sample.scxml.ScxmlRaiseType;
import org.eclipse.sirius.tests.sample.scxml.ScxmlScxmlType;
import org.eclipse.sirius.tests.sample.scxml.ScxmlStateType;
import org.eclipse.sirius.tests.sample.scxml.ScxmlTransitionType;
import org.eventb.emf.core.machine.Action;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Guard;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.MachinePackage;

import ac.soton.emf.translator.TranslationDescriptor;
import ac.soton.emf.translator.configuration.IRule;
import ac.soton.emf.translator.utils.Find;
import ac.soton.eventb.statemachines.AbstractNode;
import ac.soton.eventb.statemachines.Initial;
import ac.soton.eventb.statemachines.State;
import ac.soton.eventb.statemachines.Statemachine;
import ac.soton.eventb.statemachines.StatemachinesPackage;
import ac.soton.eventb.statemachines.Transition;
import ac.soton.scxml.eventb.strings.Strings;
import ac.soton.scxml.eventb.utils.IumlbScxmlAdapter;
import ac.soton.scxml.eventb.utils.Make;
import ac.soton.scxml.eventb.utils.Refinement;
import ac.soton.scxml.eventb.utils.Utils;

/**
 * This rules translates SCXML initial transitions
 * It must fire late as it uses what has been generated for normal transitions
 * 
 * @author cfs
 *
 */
public class ScxmlInitialTransitionTypeRule extends AbstractSCXMLImporterRule implements IRule {

	private List<Refinement> refinements = new ArrayList<Refinement>();
	
	//This must be done after normal transitions as we will look at what has been generated for incomers.
	public boolean fireLate(){return true;}

	@Override
	public boolean enabled(final EObject sourceElement) throws Exception  {
		ScxmlScxmlType scxmlContainer = (ScxmlScxmlType) Find.containing(ScxmlPackage.Literals.SCXML_SCXML_TYPE, sourceElement);
		return scxmlContainer!=null && sourceElement.eContainer() instanceof ScxmlInitialType;
	}
	
	@Override
	public boolean dependenciesOK(EObject sourceElement, final List<TranslationDescriptor> generatedElements) throws Exception  {
		
		ScxmlStateType stateContainer = (ScxmlStateType) Find.containing(ScxmlPackage.Literals.SCXML_STATE_TYPE, sourceElement.eContainer().eContainer());
		ScxmlScxmlType scxmlContainer = (ScxmlScxmlType) Find.containing(ScxmlPackage.Literals.SCXML_SCXML_TYPE, sourceElement);
		refinements.clear();
		int refinementLevel = Utils.getRefinementLevel(stateContainer==null? scxmlContainer : stateContainer);
		int depth = getRefinementDepth(sourceElement);		
		String parentSmName = (stateContainer==null? scxmlContainer.getName() : stateContainer.getId())+"_sm";
		
		for (int i=refinementLevel; i<=depth; i++){
			Refinement ref = new Refinement();
			ref.level = i;
			Machine m = (Machine) Find.translatedElement(generatedElements, null, null, MachinePackage.Literals.MACHINE, Utils.getMachineName(scxmlContainer,i));
			ref.machine = m;
			if (ref.machine == null) 
				return false;
			
			ref.statemachine = (Statemachine) Find.element(m, null, null, StatemachinesPackage.Literals.STATEMACHINE, parentSmName);
			if (ref.statemachine == null) 
				return false;
			
			String sourceStateName = sourceElement.eContainer() instanceof ScxmlInitialType? ref.statemachine.getName()+"_initialState" :
											null;
			ref.source = (AbstractNode) Find.element(m, null, null, StatemachinesPackage.Literals.ABSTRACT_NODE, sourceStateName);
			if (ref.source == null) 
				return false;	
			String targetStateName = ((ScxmlTransitionType) sourceElement).getTarget().get(0);		//we only support single target - ignore the rest
			ref.target = (AbstractNode) Find.element(m, null, null, StatemachinesPackage.Literals.ABSTRACT_NODE, targetStateName);
			if (ref.target == null) 
				return false;
			refinements.add(ref);
		}
		return true;
	}

	@Override
	public List<TranslationDescriptor> fire(EObject sourceElement, List<TranslationDescriptor> translatedElements) throws Exception {
		//Map<String, Trigger> triggerStore = (Map<String, Trigger>) storage.fetch("triggers");
		ScxmlTransitionType scxmlTransition = ((ScxmlTransitionType) sourceElement);

		//TODO: calculate finalised
		boolean finalised = false;		// if true => no more refinements
		
		for (Refinement ref : refinements){
			
			//add a transition in the iUML-B statemachine
			Transition transition = Make.transition(ref.source, ref.target, "");
			ref.statemachine.getTransitions().add(transition);
			
			transition.getElaborates().addAll(findElaboratedEvents(transition));
					
			//add a guard to define the triggers that are raised by this transition
			String raiseList = "";
			// set parameter value for raised triggers
			for (ScxmlRaiseType raise : scxmlTransition.getRaise()){
				if(new IumlbScxmlAdapter(raise).getRefinementLevel() <= ref.level){
					raiseList = raiseList.length()==0? raise.getEvent() : ","+raise.getEvent();
				}
			}	
			// no guard needed if there are no raised triggers.. unless..
			// refinement has been finalised.. in which case we specify that no future triggers will ever be raised by this event
			if (!"".equals(raiseList) || finalised==true){  
				raiseList = "".equals(raiseList)? "\u2205" : "{"+raiseList+" }";
				Guard guard =  (Guard) Make.guard(
						Strings.specificRaisedInternalTriggersGuardName,false,
						Strings.specificRaisedInternalTriggersGuardPredicate(raiseList, finalised),
						Strings.specificRaisedInternalTriggersGuardComment); 
				transition.getGuards().add(guard);
			}
				
			//add any explicit guards of the scxml transition
			List<IumlbScxmlAdapter> gds = new IumlbScxmlAdapter(scxmlTransition).getGuards();
			for (IumlbScxmlAdapter gd : gds){
				int rl = gd.getRefinementLevel();
				if (rl <= ref.level){
					String name = (String)gd.getAnyAttributeValue("name");
					String derived = (String)gd.getAnyAttributeValue("derived");
					String predicate = (String)gd.getAnyAttributeValue("predicate");
					String comment = (String)gd.getAnyAttributeValue("comment");
					Guard guard =  (Guard) Make.guard(name,Boolean.parseBoolean(derived),Strings.INV_PREDICATE(predicate),comment); 
					transition.getGuards().add(guard);
				}
			}
			
			//add any explicit actions of the scxml transition (assigns in SCXML)
			int i=0;
			for (ScxmlAssignType assign : scxmlTransition.getAssign()){
				if(new IumlbScxmlAdapter(assign).getRefinementLevel() <= ref.level){
					Action action = (Action) Make.action(transition.getLabel()+"_act_"+i, Strings.ASSIGN_ACTION(assign), "SCXML transition assign");
					transition.getActions().add(action);
					i++;
				}
			}	
			
		}
		return Collections.emptyList();
	}

	/**
	 * @param transition
	 */
	protected List<Event> findElaboratedEvents(Transition transition) {
		List<Event> ret = new ArrayList<Event>();
		EObject parent = transition.eContainer().eContainer();
		if (parent instanceof State){
			for (Transition in : ((State)parent).getIncoming()){
				if (in.getSource() instanceof State){
					ret.addAll(in.getElaborates());
				}else if (in.getSource() instanceof Initial){
					ret.addAll(findElaboratedEvents(in));
				}
			}
		} else {
			
		}
		return ret;
	}
	
}
