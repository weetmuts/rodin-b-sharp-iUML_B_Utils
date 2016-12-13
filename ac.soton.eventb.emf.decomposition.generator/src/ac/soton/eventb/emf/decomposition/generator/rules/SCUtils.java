/**
 * 
 */
package ac.soton.eventb.emf.decomposition.generator.rules;

import org.eclipse.core.runtime.CoreException;
import org.eventb.core.IMachineRoot;
import org.eventb.core.ISCEvent;
import org.eventb.core.ISCMachineRoot;
import org.eventb.core.ISCParameter;
import org.eventb.core.ast.Type;

/**
 * <p>
 * Some more SC utils - 
 * 	These should be moved to EventBSCUtils.
 * </p>
 * 
 * @author cfs
 * @version
 * @see
 * @since
 */
public final class SCUtils {
	private SCUtils() {
		// Utility classes shall not have a public or default constructor.
	}
	
	/**
	 * 
	 * get the type of a parameter
	 * 
	 * @param mchRoot
	 * @param eventName
	 * @param identifier
	 * @return 
	 * @throws CoreException 
	 */
	//TODO: move this to ch.ethc.eventb.utils.EventBSCutils
	public static Type getParameterType(IMachineRoot mchRoot, String eventName, String identifier)
			throws CoreException {
		// Assert preconditions.
//		Assert.isNotNull(mchRoot, Messages.error_NullMachine);
//		Assert.isTrue(mchRoot.exists(), Messages.bind(
//				Messages.error_NonExistingMachine, mchRoot.getRodinFile()
//						.getBareName()));
		ISCMachineRoot scMchRoot = mchRoot.getSCMachineRoot();
//		Assert.isNotNull(scMchRoot, Messages.error_NullSCMachine);
//		Assert.isTrue(scMchRoot.exists(), Messages.bind(
//				Messages.error_NonExistingSCMachine, scMchRoot.getRodinFile()
//						.getBareName()));

		
		ISCEvent[] scEvents = scMchRoot.getSCEvents();
		for (ISCEvent scEvent : scEvents){
			String id = scEvent.getLabel();
			if (id.equals(eventName)) {
				//ISCParameter[] scPs = scEvent.getSCParameters();
				ISCParameter scParameter = scEvent.getSCParameter(identifier); 	
				if (scParameter.exists()){
					return scParameter.getType(scMchRoot.getFormulaFactory());
				}
			}
		}
		return null;
		
	}	
}
