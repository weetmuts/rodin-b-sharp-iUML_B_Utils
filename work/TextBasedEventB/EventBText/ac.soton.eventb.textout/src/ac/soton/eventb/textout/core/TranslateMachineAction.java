/*******************************************************************************
 * Copyright (c) 2006, 2011 ETH Zurich and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     ETH Zurich - initial API and implementation
 *     Systerel - separation of file and root element
 *     Systerel - introduced read only elements through new super class
 *     Systerel - refactored to use NewVariablesWizard
 *******************************************************************************/
package ac.soton.eventb.textout.core;

import org.eclipse.jface.action.IAction;
import org.eventb.core.IMachineRoot;
import org.eventb.internal.ui.eventbeditor.actions.AbstractNewActionDelegate;
import org.rodinp.core.RodinDBException;

public class TranslateMachineAction extends AbstractNewActionDelegate<IMachineRoot> {

	@Override
	public void runAction(IAction action) {
		
		IMachineRoot machineRoot = this.editor.getRodinInput();
		
		try {
			new ExportTextManager().export(machineRoot);
		} catch (RodinDBException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
