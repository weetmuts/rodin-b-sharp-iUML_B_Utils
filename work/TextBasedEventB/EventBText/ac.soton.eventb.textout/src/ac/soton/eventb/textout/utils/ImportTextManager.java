package ac.soton.eventb.textout.utils;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.EventBNamed;
import org.eventb.emf.core.EventBNamedCommentedComponentElement;
import org.eventb.emf.core.context.impl.ContextImpl;
import org.eventb.emf.core.machine.impl.MachineImpl;
import org.eventb.emf.persistence.EMFRodinDB;
import org.rodinp.core.IRodinProject;

public class ImportTextManager {

	private static final Class<MachineImpl> machineClazz = MachineImpl.class;
	private static final Class<ContextImpl> contextClazz = ContextImpl.class;
	
	/**
	 * import a text file into Rodin creating an Event-B component.
	 * 
	 * if successful the file name of the new component is returned
	 */
	
	public static String importText(IRodinProject rodinProject, IResource textRes){

		// get the resource associated with the file
		ResourceSet rs = new ResourceSetImpl();
		//ResourceSet rs = EMFRodinDB.INSTANCE.getResourceSet();	//doesn't work with the resource set used by EMFRodinDB
		URI uri = URI.createPlatformResourceURI(textRes.getFullPath().toOSString(), true);
		Resource r = rs.getResource(uri, true);
		EList<EObject> c = r.getContents();
		EObject e = c.get(0);
		if (!(e instanceof EventBNamedCommentedComponentElement)) return null;
			
		//put the model in a Rodin resource
		URI uri2 = URI.createPlatformResourceURI(rodinProject.getPath().toOSString(),true);
		uri2 = uri2.appendSegment(((EventBNamed)e).getName());
		if (e.getClass() == machineClazz) {
			uri2 = uri2.trimFileExtension().appendFileExtension("bum");
		} else if (e.getClass() == contextClazz) {
			uri2 = uri2.trimFileExtension().appendFileExtension("buc");
		} else return null;
		
		//resolve all xtext references
		EcoreUtil.resolveAll(e);
		
//		Resource res = EMFRodinDB.INSTANCE.loadResource(uri2);
//		c = res.getContents();
//		c.clear();
//		c.add(e);
		// xtext doesn't support bidirectional associations so first we need to fix them up
		fixEOpposites(e);
		//save as a Rodin model
		Resource res = EMFRodinDB.INSTANCE.saveResource(uri2, (EventBElement)e);
		
		return res==null? null : res.getURI().lastSegment();
	}
	
	/**
	 * This recursively traverses the model finding any reference associations that 
	 * should be bidirectional (i.e. have an inverse). If the inverse is not set appropriately it is added
	 * without raising notifications. 
	 * 
	 * @param e
	 */
	private static void fixEOpposites(EObject e){
		EClass clazz = e.eClass();
		for (EReference ref : clazz.getEAllReferences()){
			EReference oppositeRef = ref.getEOpposite();
			if (ref.getEOpposite()!=null){
				if (ref.isMany()){
					for (Object r : (EList<?>)e.eGet(ref)){
						if (r instanceof EObject){
							setInverse((EObject)r, oppositeRef, e);
						}						
					}
				}else{
					Object r = e.eGet(ref);
					if (r instanceof EObject ){
						setInverse((EObject)r, oppositeRef, e);
					}
				}
			}
		}
		for (EObject c : e.eContents()){
			fixEOpposites(c);
		}
	}
	
	private static void setInverse(EObject owner, EReference referenceFeature, EObject value){
		if (((EObject) owner).eClass().getEAllReferences().contains(referenceFeature)){
			Object featureValue = owner.eGet(referenceFeature);
			if ((!referenceFeature.isMany() && featureValue != value) || 
				(featureValue instanceof EList && (!((EList<?>)featureValue).contains(value)) )){
					boolean d = owner.eDeliver();
					owner.eSetDeliver(false);
					((InternalEObject)owner).eInverseAdd((InternalEObject) value, referenceFeature.getFeatureID(), owner.eClass().getClass(),  null);
					owner.eSetDeliver(d);
			}
		}
	}
}
