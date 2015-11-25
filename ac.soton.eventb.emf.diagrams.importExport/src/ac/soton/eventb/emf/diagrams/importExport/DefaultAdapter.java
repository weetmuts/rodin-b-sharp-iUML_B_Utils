/*******************************************************************************
 *  Copyright (c) 2015 University of Southampton.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *   
 *  Contributors:
 *  University of Southampton - Initial implementation
 *******************************************************************************/
package ac.soton.eventb.emf.diagrams.importExport;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

/**
 * This implementation of IAdapter is a default for translation to an EMF other than Event-B
 * for match it uses the java object equals method, for other methods 
 * it does the minimum by returning false or doing nothing
 * 
 * @author cfs
 *
 */

public class DefaultAdapter implements IAdapter {

	/**
	 * return null
	 */
	@Override
	public URI getComponentURI(TranslationDescriptor translationDescriptor, EObject rootElement) {
		return null;
	}
	
	/**
	 * filter nothing
	 */
	@Override
	public boolean filter(TranslationDescriptor translationDescriptor) {
		return false;
	}


	/**
	 * match
	 * test whether two elements are equal using the equals method of el1
	 * (or both null if el1 is null)
	 */
	
	@Override
	public boolean match(Object el1, Object el2) {
		return el1==null? el2==null : el1.equals(el2);
	}


	/**
	 * returns null
	 */
	@Override
	public Object getGeneratorId(EObject eObject){
		return null;
	}

	/**
	 * do nothing
	 */
	@Override
	public void setGeneratedBy(String generatedByID, Object object) {
	}
	
	/**
	 * do nothing
	 */
	@Override
	public void setPriority(int priority, Object object) {
	}
	
}
