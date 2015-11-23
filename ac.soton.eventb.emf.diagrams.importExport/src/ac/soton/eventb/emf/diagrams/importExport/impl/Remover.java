/**
 * Copyright (c) 2015 - University of Southampton.
 * All rights reserved. This program and the accompanying materials  are made
 * available under the terms of the Eclipse Public License v1.0 which accompanies this 
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 *
 * $Id$
 */
package ac.soton.eventb.emf.diagrams.importExport.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eventb.emf.core.CorePackage;
import org.eventb.emf.core.EventBNamedCommentedComponentElement;
import org.eventb.emf.core.context.Context;
import org.eventb.emf.core.machine.Machine;

import ac.soton.eventb.emf.diagrams.importExport.utils.Is;

public class Remover {

	private final List<Resource> resources;
	private String translatedByID;
	private List<Resource> modifiedResources;
	
	public Remover(final List<Resource> resources, String translatedByID) {
		this.resources = resources;
		this.translatedByID = translatedByID;
	}
	
	public boolean canExecute(){
		return resources!=null && translatedByID!=null ;
	}	
	
	public List<Resource> removeTranslated(){
		modifiedResources = new ArrayList<Resource>();
		if (canExecute()){
			for (Resource res : resources){
				EObject component = res.getContents().get(0);
				if (component instanceof EventBNamedCommentedComponentElement){
					List<EObject> previouslyTranslatedElements = getPreviouslyTranslatedElements((EventBNamedCommentedComponentElement) component);
					for (EObject eObject : previouslyTranslatedElements){
						EcoreUtil.delete(eObject, true);	//this deletes the object from its containment and removes all references to it and its content
					}
				}
			}
		}
		return modifiedResources;
	}
	
	/*
	 * finds all elements that have previously been translated with this translators translatedByID
	 * Returns a list of the modified resources
	 * @return List of elements
	 */
	private ArrayList<EObject> getPreviouslyTranslatedElements(final EventBNamedCommentedComponentElement component) {
		EList<EObject> contents = component.getAllContained(CorePackage.eINSTANCE.getEventBElement(),false);
		contents.remove(null);
		contents.add(0,component);
		modifiedResources.add(component.eResource());
		ArrayList<EObject> remove = new ArrayList<EObject>();
		for(EObject eObject : contents){
			if(eObject instanceof Machine){
				for(Context ctx : ((Machine)eObject).getSees()){
//					if(!ctx.getName().equals(((Machine)eObject).getName() + "_implicitContext"))	
//						continue;
					for(EObject ieObject : ctx.eContents()){
						if(Is.translatedBy(ieObject, translatedByID)){
							remove.add(ieObject);
							if(!modifiedResources.contains(ctx))
								modifiedResources.add(ctx.eResource());
						}
					}
					


				}

			}
			if (Is.translatedBy(eObject,translatedByID)){
				remove.add(eObject);						
			}
			
		}
		return remove;
	}
	
}
