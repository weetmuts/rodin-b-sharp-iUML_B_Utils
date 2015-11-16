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

public class GeneratedRemover {

	private final List<Resource> resources;
	private String generatedByID;
	private List<Resource> modifiedResources;
	
	public GeneratedRemover(final List<Resource> resources, String generatedByID) {
		this.resources = resources;
		this.generatedByID = generatedByID;
	}
	
	public boolean canExecute(){
		return resources!=null && generatedByID!=null ;
	}	
	
	public List<Resource> removeGenerated(){
		modifiedResources = new ArrayList<Resource>();
		if (canExecute()){
			for (Resource res : resources){
				EObject component = res.getContents().get(0);
				if (component instanceof EventBNamedCommentedComponentElement){
					List<EObject> previouslyGeneratedElements = getPreviouslyGeneratedElements((EventBNamedCommentedComponentElement) component);
					for (EObject eObject : previouslyGeneratedElements){
						EcoreUtil.delete(eObject, true);	//this deletes the object from its containment and removes all references to it and its content
					}
				}
			}
		}
		return modifiedResources;
	}
	
	/*
	 * finds all elements that have previously been generated with this generators generatorByID
	 * Returns a list of the modified resources
	 * @return List of elements
	 */
	private ArrayList<EObject> getPreviouslyGeneratedElements(final EventBNamedCommentedComponentElement component) {
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
						if(Is.generatedBy(ieObject, generatedByID)){
							remove.add(ieObject);
							if(!modifiedResources.contains(ctx))
								modifiedResources.add(ctx.eResource());
						}
					}
					


				}

			}
			if (Is.generatedBy(eObject,generatedByID)){
				remove.add(eObject);						
			}
			
		}
		return remove;
	}
	
}
