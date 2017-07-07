/*******************************************************************************
 * Copyright (c) 2017 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package ac.soton.eventb.emf.decomposition.navigator;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.eventb.emf.core.EventBObject;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.MachinePackage;

import org.eclipse.core.expressions.PropertyTester;

/**
 * <p>
 * 
 * </p>
 * 
 * @author cfs
 * @version
 * @see
 * @since
 */
public class CompositeMachineTester extends PropertyTester {

	private static final String compositeMachineFileExtension = "xmc";
	
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		EObject eo = (EObject)receiver;
        if ("isCompositeMachine".equals(property)) {
        	return expectedValue == null
        			? isCompositeMachine(eo)
        			: isCompositeMachine(eo) == ((Boolean)expectedValue).booleanValue();
        }
        Assert.isTrue(false);
        return false;
    }

	/**
	 * @param eo
	 * @return
	 */
	private boolean isCompositeMachine(EObject eo) {
		if (eo instanceof EventBObject){
			Machine m =(Machine) ((EventBObject)eo).getContaining(MachinePackage.Literals.MACHINE);
			if (m!=null){
				return compositeMachineFileExtension.equals(m.eResource().getURI().fileExtension());
			}
		}
		return false;
	}
    
}
