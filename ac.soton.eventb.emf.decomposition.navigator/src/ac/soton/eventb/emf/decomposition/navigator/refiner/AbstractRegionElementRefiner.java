/*******************************************************************************
 * Copyright (c) 2012 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package ac.soton.eventb.emf.decomposition.navigator.refiner;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

import ac.soton.eventb.decomposition.DecompositionPackage;
import ac.soton.eventb.emf.core.extension.navigator.refiner.CoreextensionElementRefiner;

/**
 * State-machine Element Refiner 
 * 
 * @author cfsnook
 *
 */
public class AbstractRegionElementRefiner extends CoreextensionElementRefiner {

	/**
	 * populate the given list with the meta-classes that the refiner needs to filter out
	 *  from the copy for statemachine refinement.
	 * (e.g. state invariants)
	 */
	@Override
	protected void populateFilterByTypeList(final List<EClass> filterList){
		super.populateFilterByTypeList(filterList);
	}
	
	/**
	 * populate the given map with the reference features that the refiner needs to copy for statemachine refinement.
	 * This is refines (as references to their abstract counterparts) and
	 * incoming, outgoing, source and target (as intra-level references).
	 * Instances
	 */
	@Override
	protected void populateReferenceMap(final Map<EReference,RefHandling> referencemap){
		super.populateReferenceMap(referencemap);
		referencemap.put(DecompositionPackage.Literals.ABSTRACT_REGION__ALLOCATED_EXTENSIONS, RefHandling.EQUIV);
		referencemap.put(DecompositionPackage.Literals.ABSTRACT_REGION__ALLOCATED_VARIABLES, RefHandling.EQUIV);;
	}
	
	/**
	 * Change this to specialise the meaning of 'equivalent' 
	 * (used when finding reference targets in the refined model)
	 * 
	 */
	
//	public EventBObject getEquivalentObject(EObject concreteParent, EStructuralFeature feature, EObject abstractObject) {
//			return super.getEquivalentObject(concreteParent, feature, abstractObject);
//	}
	
}
