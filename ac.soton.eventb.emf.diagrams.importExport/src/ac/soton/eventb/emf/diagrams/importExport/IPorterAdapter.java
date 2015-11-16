package ac.soton.eventb.emf.diagrams.importExport;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

public interface IPorterAdapter {

	/**
	 * if the generation descriptor describes or requires the generation of a new resource level component,
	 * this should return the resource URI to be used in creating the new resource.
	 * The root element of this generation is passed in case it is needed to construct the URI. (E.g. to find 
	 * the containing project.
	 * 
	 * @param generationDescriptor
	 * @param rootElement
	 * @return
	 */
	
	URI getComponentURI(GenerationDescriptor generationDescriptor, EObject rootElement);

	/**
	 * Filters out any generationDescriptors that should not be acted upon.
	 * This may be because a child is already visible via extension of the refined parent
	 *
	 * @param generationDescriptor
	 * @return true if this generation descriptor should be filtered out (ignored)
	 */
	boolean filter(GenerationDescriptor generationDescriptor);
	
	/**
	 * whether these two objects are considered to be essentially the same thing
	 * 
	 * @param obj1
	 * @param obj2
	 * @return
	 */
	boolean match(Object obj1, Object obj2);
	
	/**
	 * gets the ID of the root source element.
	 * This ID will be used to annotate all generated elements.
	 * return null if annotation is not required.
	 * 
	 *  (Note that generated elements with the same ID are deleted at the start of any generation
	 *  hence, if generated elements are not annotated, subsequent generations are likely to cause duplication
	 *  of the generated elements)
	 * 
	 * @param rootElement
	 * @return
	 */
	Object getGeneratorId(EObject rootElement);

	void setGeneratedBy(String generatedByID, Object value);

	void setPriority(int pri, Object value);
	
}
