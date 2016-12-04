/*******************************************************************************
 * Copyright (c) 2006,2007,2008 University of Southampton and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package ac.soton.eventb.emf.decomposition.propertySections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.viewers.IFilter;
import org.eventb.emf.core.CorePackage;

import ac.soton.eventb.decomposition.DecompositionPackage;
import ac.soton.eventb.decomposition.Region;



/**
 * Allocated Extensions tab table section.
 *
 * @author cfs
 */

public class AllocatedExtensionsPropertySection extends AbstractTablePropertySection implements IFilter {

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IFilter#select(java.lang.Object)
	 */
	public boolean select(final Object selected) {
			return selected instanceof Region;
	}

	@Override
	protected EReference getFeature() {
		return DecompositionPackage.Literals.REGION__ALLOCATED_EXTENSIONS;
	}

	@Override
	protected EStructuralFeature getFeatureForCol(final int col) {
		switch (col) {
		case 0 : return CorePackage.Literals.EVENT_BNAMED__NAME; //this is just to provide a non-null value - we will put the eClass name in this column
		case 1 : return CorePackage.Literals.EVENT_BNAMED__NAME;
		default : return null;
		}
	}

	@Override
	protected int columnWidth(final int col){
		switch (col) {
		case 0 : return super.columnWidth(col);	//name
		case 1 : return 400;					//comment
		default : return -1;
		}
	}

	/**
	 * all columns are read only
	 */
	protected boolean isReadOnly(final int col){
		return true;
	}
	
	/**
	 * Label for generatedBy column is not the feature name since we need to find the right attribute 
	 * in the attributes map
	 * 
	 * @param col
	 * @return
	 */
	protected String getColumnLabelText(int col) {
		if (col==0){	
			return "Type";
		}else{
			return super.getColumnLabelText(col);
		}
	}
	
	/**
	 * 
	 * 
	 * 
	 *@Override
	 *
	 */
	protected String getValueForCol(final Object object, int col) {
		if (col==0){
			if (object instanceof EObject){
				return ((EObject)object).eClass().getName();
			}
			return "";
		}else{
			return super.getValueForCol(object, col);
		}
	}
	
}