/**
 * Copyright (c) 2012 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package ac.soton.eventb.emf.diagrams.importExport.utils;

import java.util.List;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eventb.emf.core.AbstractExtension;
import org.eventb.emf.core.Attribute;
import org.eventb.emf.core.CorePackage;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.EventBObject;
import org.eventb.emf.persistence.AttributeIdentifiers;

import ac.soton.eventb.emf.diagrams.importExport.TranslationDescriptor;


/**
 * Convenience methods for testing things in Translator Rules
 * 
 * @author cfs
 *
 */
public class Is {
	
	/**
	 * Convenience method to check whether an element has been translated already in the list of translationDescriptors
	 * (parent and/or feature may be null if not required to be matched)
	 * 
	 * @param translatedElements
	 * @param parent (or null)
	 * @param feature (or null)
	 * @param identifier
	 * @return
	 */
	public static boolean translated(List<TranslationDescriptor> translatedElements, EventBElement parent, EStructuralFeature feature, String identifier){
		return Find.translatedElement(translatedElements, parent, feature, identifier) != null;
	}
	

	public static boolean translatedBy(Object object, Object sourceElement){
		if (sourceElement instanceof EventBObject){
			AbstractExtension ae = (AbstractExtension) ((EventBObject) sourceElement).getContaining(CorePackage.Literals.ABSTRACT_EXTENSION);
			if (ae instanceof AbstractExtension){
				return translatedBy(object, Make.translatedById(ae));
			}
		}
		return false;
	}
	
	public static boolean translatedBy(Object object, String id){
		if (object instanceof EventBElement){
			Attribute translatedBy = ((EventBElement)object).getAttributes().get(AttributeIdentifiers.GENERATOR_ID_KEY);
			if (translatedBy!= null && id.equals(translatedBy.getValue()) ){
				return true;
			}
		}
		return false;
	}
	
	public static boolean translated(Object object){
		if (object instanceof EventBElement){
			Attribute translatedBy = ((EventBElement)object).getAttributes().get(AttributeIdentifiers.GENERATOR_ID_KEY);
			if (translatedBy!= null){
				return true;
			}
		}
		return false;
	}
}
