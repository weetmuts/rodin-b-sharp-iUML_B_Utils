package ac.soton.eventb.emf.decomposition.generator.handlers;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;

import ac.soton.emf.translator.handler.TranslateHandler;

public class DecompositionHandler extends TranslateHandler {


	/**
	 * 
	 * Now does nothing - used to have a post processing to flatten composite machine
	 * 
	 */
	protected void postProcessing(EObject sourceElement, String commandId, IProgressMonitor monitor) throws Exception {

	}

}
