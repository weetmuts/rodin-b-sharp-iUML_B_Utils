/*
 * Copyright (c) 2014 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package ac.soton.eventb.emf.decomposition.propertySections;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.jface.viewers.IFilter;

import ac.soton.eventb.decomposition.AbstractRegion;
import ac.soton.eventb.decomposition.DecompositionPackage;

/**
 * Ready property section for Region.
 * 
 *
 */
public class ReadyPropertySection extends AbstractEnumerationPropertySection implements IFilter {


	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IFilter#select(java.lang.Object)
	 */
	public boolean select(final Object selected) {
		return selected instanceof AbstractRegion;
	}

	@Override
	protected EAttribute getFeature() {
		return DecompositionPackage.Literals.ABSTRACT_REGION__READY;
	}
	
}
