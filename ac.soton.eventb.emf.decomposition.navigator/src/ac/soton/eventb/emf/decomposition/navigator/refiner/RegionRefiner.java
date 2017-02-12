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
import ac.soton.eventb.emf.core.extension.navigator.refiner.AbstractExtensionRefiner;

/**
 * Decomposition Refiner 
 * 
 * @author cfsnook
 *
 */
public class RegionRefiner extends AbstractExtensionRefiner {

	/**
	 * populate the given list with the meta-classes that the refiner needs to filter out from the copy
	 * 
	 */
	@Override
	protected void populateFilterByTypeList(final List<EClass> filterList){
		super.populateFilterByTypeList(filterList);
	}
	
	/**
	 * populate the given map with the reference features that the refiner needs to copy.
	 */
	@Override
	protected void populateReferenceMap(final Map<EReference,RefHandling> referencemap){
		super.populateReferenceMap(referencemap);
		referencemap.put(DecompositionPackage.Literals.ABSTRACT_REGION__ALLOCATED_EXTENSIONS, RefHandling.EQUIV);
		referencemap.put(DecompositionPackage.Literals.ABSTRACT_REGION__ALLOCATED_VARIABLES, RefHandling.EQUIV);;
	}

/**
 * returns the Components Extension ID
 */
	@Override
	protected String getExtensionID() {
		return DecompositionPackage.DECOMPOSITION_REGION_EXTENSION_ID;
	}
	
}
