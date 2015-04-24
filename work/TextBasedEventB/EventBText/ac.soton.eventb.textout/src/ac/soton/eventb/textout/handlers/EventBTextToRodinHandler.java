package ac.soton.eventb.textout.handlers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
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
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.context.impl.ContextImpl;
import org.eventb.emf.core.machine.impl.MachineImpl;
import org.eventb.emf.persistence.EMFRodinDB;
import org.rodinp.core.IRodinProject;
import org.rodinp.core.RodinCore;

import ac.soton.eventb.textout.utils.TextOutUtil;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * 
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class EventBTextToRodinHandler extends AbstractHandler {
	/**
	 * The constructor.
	 */
	public EventBTextToRodinHandler() {
	}

	// a place to store machines etc that require processing
	public static Map<String, String> crossRefMap = new HashMap<String, String>();
	private boolean isMachine;
	private boolean isContext;
	private IRodinProject rodinProject;

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {

		IEditorPart editorPart = HandlerUtil.getActiveEditorChecked(event);
		Class<XtextEditor> xTextEditorClazz = XtextEditor.class;
		Class<? extends IEditorPart> thisEditorClazz = editorPart.getClass();
		Class<MachineImpl> machineClazz = MachineImpl.class;
		Class<ContextImpl> contextClazz = ContextImpl.class;

		if (thisEditorClazz == xTextEditorClazz) {
			XtextEditor xted = (XtextEditor)editorPart;
			IResource res = xted.getResource();
			URI uri = URI.createPlatformResourceURI(res.getFullPath()
					.toOSString(), true);

			// check we are in a rodin project
			String directoryName = uri.segment(uri.segmentCount() - 2);
			rodinProject = RodinCore.getRodinDB()
					.getRodinProject(directoryName);
			if (rodinProject == null) {
				Shell shell = editorPart.getSite().getShell();
				MessageDialog.openError(shell, directoryName,
						"Please use an Event-B Project");
				return null;
			}
			
			TextOutUtil.addXtextNature(rodinProject.getProject());
			
			// get the resource associated with the file
			ResourceSet rs = new ResourceSetImpl();
			//ResourceSet rs = EMFRodinDB.INSTANCE.getResourceSet();	//doesn't work with the resource set used by EMFRodinDB
			Resource r = rs.getResource(uri, true);
			EList<EObject> c = r.getContents();
			EObject e = c.get(0);
			if (e==null) return null;
			
			List<EventBElement> toRodinList = new ArrayList<EventBElement>();

			// find the event refines cross references, store in a map
			// with machine/context names
			Class<? extends EObject> eClazz = e.getClass();
			isMachine = eClazz == machineClazz;
			isContext = eClazz == contextClazz;
			// if we have a machine or context
			// we need to store the (key) xtext cross reference name
			// and (value) machine/context name for later use
			if (isMachine || isContext) {
				toRodinList.add((EventBElement) e);
			}
			// persist machine or context in rodin database
			save(uri, toRodinList);
		}
		return null;
	}

	private void save(URI uri, List<EventBElement> toRodinList) {
		for (EventBElement e : toRodinList) {
			//resolve all xtext references
			EcoreUtil.resolveAll(e);
			
			//put the model in a Rodin resource
			URI uri2 = uri;
			if (isMachine) {
				uri2 = uri2.trimFileExtension().appendFileExtension("bum");
			} else if (isContext) {
				uri2 = uri2.trimFileExtension().appendFileExtension("buc");
			}
			Resource res = EMFRodinDB.INSTANCE.loadResource(uri2);
			EList<EObject> c = res.getContents();
			c.clear();
			c.add(e);
			// xtext doesn't support bidirectional associations
			// so first we need to fix them up
			fixEOpposites(e);
			//save as a Rodin model
			EMFRodinDB.INSTANCE.saveResource(uri2, e);
			//open the Rodin editor
			String fileName = e.getURI().lastSegment();
			TextOutUtil.openFileForEditing(fileName , rodinProject);
		}
	}
	
	/**
	 * This recursively traverses the model finding any reference associations that 
	 * should be bidirectional (i.e. have an inverse). If the inverse is not set appropriately it is added
	 * without raising notifications. 
	 * 
	 * @param e
	 */
	private void fixEOpposites(EObject e){
		EClass clazz = e.eClass();
		for (EReference ref : clazz.getEAllReferences()){
			EReference oppositeRef = ref.getEOpposite();
			if (ref.getEOpposite()!=null){
				if (ref.isMany()){
					for (Object r : (EList<?>)e.eGet(ref)){
						if (r instanceof EObject){
							secretlySet((EObject)r, oppositeRef, e);
						}						
					}
				}else{
					Object r = e.eGet(ref);
					if (r instanceof EObject ){
						secretlySet((EObject)r, oppositeRef, e);
					}
				}
			}
		}
		for (EObject c : e.eContents()){
			fixEOpposites(c);
		}
	}
	
	private void secretlySet(EObject owner, EReference referenceFeature, EObject value){
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