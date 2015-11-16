/**
 * Copyright (c) 2012 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package ac.soton.eventb.emf.diagrams.importExport.utils;


import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eventb.emf.core.AbstractExtension;

import ac.soton.eventb.emf.diagrams.importExport.GenerationDescriptor;


/**
 * This is a collection of static convenience methods for making objects that are needed in generator Rules
 * 
 */

public class Make {
	
	public static String generatedById(EObject sourceElement){
		if (sourceElement instanceof AbstractExtension){
			return ((AbstractExtension)sourceElement).getExtensionId();
		}else{
			return sourceElement.toString();
		}
	}
	
	public static GenerationDescriptor descriptor(EObject parent, EStructuralFeature feature, Object value, int priority){
		return new GenerationDescriptor(parent,feature,value,Integer.valueOf(priority));
	}
	
	public static GenerationDescriptor descriptor(EObject parent, EStructuralFeature feature, Object value , int priority, Boolean remove) {
		return new GenerationDescriptor(parent, feature,value,Integer.valueOf(priority), remove);
	}
	
}
