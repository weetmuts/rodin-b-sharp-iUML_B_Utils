/**
 * Copyright (c) 2015 - University of Southampton.
 * All rights reserved. This program and the accompanying materials  are made
 * available under the terms of the Eclipse Public License v1.0 which accompanies this 
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 *
 * $Id$
 */
package ac.soton.eventb.emf.diagrams.importExport.utils;


import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eventb.emf.core.AbstractExtension;

import ac.soton.eventb.emf.diagrams.importExport.TranslationDescriptor;


/**
 * This is a collection of static convenience methods for making objects that are needed in translator Rules
 * 
 */

public class Make {
	
	public static String translatedById(EObject sourceElement){
		if (sourceElement instanceof AbstractExtension){
			return ((AbstractExtension)sourceElement).getExtensionId();
		}else{
			return sourceElement.toString();
		}
	}
	
	public static TranslationDescriptor descriptor(EObject parent, EStructuralFeature feature, Object value, int priority){
		return new TranslationDescriptor(parent,feature,value,Integer.valueOf(priority));
	}
	
	public static TranslationDescriptor descriptor(EObject parent, EStructuralFeature feature, Object value , int priority, Boolean remove) {
		return new TranslationDescriptor(parent, feature,value,Integer.valueOf(priority), remove);
	}
	
}
