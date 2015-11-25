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

public interface IAdapter {

	/**
	 * if the translation descriptor describes or requires the translation of a new resource level component,
	 * this should return the resource URI to be used in creating the new resource.
	 * The root element of this translation is passed in case it is needed to construct the URI. (E.g. to find 
	 * the containing project.
	 * 
	 * @param translationDescriptor
	 * @param rootElement
	 * @return
	 */
	
	URI getComponentURI(TranslationDescriptor translationDescriptor, EObject rootElement);

	/**
	 * Filters out any translationDescriptors that should not be acted upon.
	 * This may be because a child is already visible via extension of the refined parent
	 *
	 * @param translationDescriptor
	 * @return true if this translation descriptor should be filtered out (ignored)
	 */
	boolean filter(TranslationDescriptor translationDescriptor);
	
	/**
	 * whether these two objects are considered to be essentially the same thing
	 * 
	 * @param obj1
	 * @param obj2
	 * @return
	 */
	boolean match(Object obj1, Object obj2);
	
	/**
	 * gets the ID of the given root source element.
	 * This ID will be used to annotate all translated elements.
	 * return null if annotation is not required.
	 * 
	 *  (Note that translated elements with the same ID are deleted at the start of any translation
	 *  hence, if translated elements are not annotated, subsequent translations are likely to cause duplication
	 *  of the translated elements)
	 * 
	 * @param rootElement
	 * @return
	 */
	Object getGeneratorId(EObject rootElement);

	/**
	 * Sets the translatedBy attribute of the given object to the given String value
	 * In translal the object will be an EObject for this to succeed.
	 * 
	 * @param translatedByID
	 * @param object
	 */
	void setGeneratedBy(String translatedByID, Object object);

	/**
	 * Sets the priority attribute of the given object to the given integer value
	 * In translal the object will be an EObject for this to succeed.
	 * 
	 * @param translatedByID
	 * @param object
	 */
	void setPriority(int pri, Object value);
	
}
