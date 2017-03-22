package ac.soton.eventb.emf.decomposition.generator.handlers;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eventb.emf.core.AbstractExtension;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.persistence.EMFRodinDB;

import ac.soton.emf.translator.TranslatorFactory;
import ac.soton.emf.translator.handler.TranslateHandler;
import ac.soton.eventb.decomposition.AbstractRegion;

public class DecompositionHandler extends TranslateHandler {

	private static final String flattenCommandId = "ac.soton.eventb.emf.inclusion.commands.include";
	private static final String compositionMachinePostfix = "_cmp";	
	private static final String compositionMachineExtension = "bum";

	/**
	 * after doing the decomposition translation, we need to call the flatten translation
	 * 
	 * @param sourceElement
	 * @param commandId
	 * @param newChild
	 * @throws CoreException 
	 */
	protected void postProcessing(EObject sourceElement, String commandId, IProgressMonitor monitor) throws Exception {
		if (sourceElement instanceof Machine){
			EList<AbstractExtension> exts = ((Machine)sourceElement).getExtensions();
			
			EMFRodinDB emfRodinDB = new EMFRodinDB();
			
			final TranslatorFactory factory = TranslatorFactory.getFactory();
			for (AbstractExtension ext : exts){
				
				if (ext instanceof AbstractRegion){
					String compositionMachineName = ((AbstractRegion)ext).getMachineName();
					if (compositionMachineName == null) continue;
					compositionMachineName = compositionMachineName+compositionMachinePostfix;
					URI fileURI = ((Machine)sourceElement).getURI();
					fileURI = fileURI.trimFileExtension().trimSegments(1).appendSegment(compositionMachineName).appendFileExtension(compositionMachineExtension);
					String fragment = fileURI.fragment();
					int x = fragment.lastIndexOf("::")+2;
					fragment = fragment.substring(0, x) + compositionMachineName;
					fileURI = fileURI.trimFragment().appendFragment(fragment);
					EventBElement compositionMachine = emfRodinDB.loadEventBComponent(fileURI);
							
					if (factory != null && compositionMachine!=null && factory.canTranslate(flattenCommandId, compositionMachine.eClass())){
						factory.translate(compositionMachine, flattenCommandId, monitor);
					}
				}
			}
		}
	}

}
