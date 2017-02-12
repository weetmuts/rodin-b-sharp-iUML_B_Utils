/**
 * Copyright (c) 2016
 * University of Southampton.
 * All rights reserved. This program and the accompanying materials  are made
 * available under the terms of the Eclipse Public License v1.0 which accompanies this 
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 *
 * $Id$
 */
package ac.soton.eventb.decomposition.impl;

import ac.soton.eventb.decomposition.AbstractRegion;
import ac.soton.eventb.decomposition.DecompositionPackage;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eventb.emf.core.AbstractExtension;
import org.eventb.emf.core.impl.EventBElementImpl;
import org.eventb.emf.core.machine.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ac.soton.eventb.decomposition.impl.AbstractRegionImpl#isReady <em>Ready</em>}</li>
 *   <li>{@link ac.soton.eventb.decomposition.impl.AbstractRegionImpl#getProjectName <em>Project Name</em>}</li>
 *   <li>{@link ac.soton.eventb.decomposition.impl.AbstractRegionImpl#getContextName <em>Context Name</em>}</li>
 *   <li>{@link ac.soton.eventb.decomposition.impl.AbstractRegionImpl#getAllocatedVariables <em>Allocated Variables</em>}</li>
 *   <li>{@link ac.soton.eventb.decomposition.impl.AbstractRegionImpl#getAllocatedExtensions <em>Allocated Extensions</em>}</li>
 *   <li>{@link ac.soton.eventb.decomposition.impl.AbstractRegionImpl#getMachineName <em>Machine Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractRegionImpl extends EventBElementImpl implements AbstractRegion {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2016\rUniversity of Southampton.\rAll rights reserved. This program and the accompanying materials  are made\ravailable under the terms of the Eclipse Public License v1.0 which accompanies this \rdistribution, and is available at http://www.eclipse.org/legal/epl-v10.html\n";

	/**
	 * The default value of the '{@link #isReady() <em>Ready</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReady()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReady() <em>Ready</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReady()
	 * @generated
	 * @ordered
	 */
	protected boolean ready = READY_EDEFAULT;

	/**
	 * The default value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectName()
	 * @generated
	 * @ordered
	 */
	protected String projectName = PROJECT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getContextName() <em>Context Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTEXT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContextName() <em>Context Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextName()
	 * @generated
	 * @ordered
	 */
	protected String contextName = CONTEXT_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAllocatedVariables() <em>Allocated Variables</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> allocatedVariables;

	/**
	 * The cached value of the '{@link #getAllocatedExtensions() <em>Allocated Extensions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedExtensions()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractExtension> allocatedExtensions;

	/**
	 * The default value of the '{@link #getMachineName() <em>Machine Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachineName()
	 * @generated
	 * @ordered
	 */
	protected static final String MACHINE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMachineName() <em>Machine Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachineName()
	 * @generated
	 * @ordered
	 */
	protected String machineName = MACHINE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractRegionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DecompositionPackage.Literals.ABSTRACT_REGION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReady() {
		return ready;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReady(boolean newReady) {
		boolean oldReady = ready;
		ready = newReady;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecompositionPackage.ABSTRACT_REGION__READY, oldReady, ready));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProjectName() {
		return projectName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectName(String newProjectName) {
		String oldProjectName = projectName;
		projectName = newProjectName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecompositionPackage.ABSTRACT_REGION__PROJECT_NAME, oldProjectName, projectName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContextName() {
		return contextName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextName(String newContextName) {
		String oldContextName = contextName;
		contextName = newContextName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecompositionPackage.ABSTRACT_REGION__CONTEXT_NAME, oldContextName, contextName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getAllocatedVariables() {
		if (allocatedVariables == null) {
			allocatedVariables = new EObjectResolvingEList<Variable>(Variable.class, this, DecompositionPackage.ABSTRACT_REGION__ALLOCATED_VARIABLES);
		}
		return allocatedVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractExtension> getAllocatedExtensions() {
		if (allocatedExtensions == null) {
			allocatedExtensions = new EObjectResolvingEList<AbstractExtension>(AbstractExtension.class, this, DecompositionPackage.ABSTRACT_REGION__ALLOCATED_EXTENSIONS);
		}
		return allocatedExtensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMachineName() {
		return machineName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMachineName(String newMachineName) {
		String oldMachineName = machineName;
		machineName = newMachineName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecompositionPackage.ABSTRACT_REGION__MACHINE_NAME, oldMachineName, machineName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DecompositionPackage.ABSTRACT_REGION__READY:
				return isReady();
			case DecompositionPackage.ABSTRACT_REGION__PROJECT_NAME:
				return getProjectName();
			case DecompositionPackage.ABSTRACT_REGION__CONTEXT_NAME:
				return getContextName();
			case DecompositionPackage.ABSTRACT_REGION__ALLOCATED_VARIABLES:
				return getAllocatedVariables();
			case DecompositionPackage.ABSTRACT_REGION__ALLOCATED_EXTENSIONS:
				return getAllocatedExtensions();
			case DecompositionPackage.ABSTRACT_REGION__MACHINE_NAME:
				return getMachineName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DecompositionPackage.ABSTRACT_REGION__READY:
				setReady((Boolean)newValue);
				return;
			case DecompositionPackage.ABSTRACT_REGION__PROJECT_NAME:
				setProjectName((String)newValue);
				return;
			case DecompositionPackage.ABSTRACT_REGION__CONTEXT_NAME:
				setContextName((String)newValue);
				return;
			case DecompositionPackage.ABSTRACT_REGION__ALLOCATED_VARIABLES:
				getAllocatedVariables().clear();
				getAllocatedVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case DecompositionPackage.ABSTRACT_REGION__ALLOCATED_EXTENSIONS:
				getAllocatedExtensions().clear();
				getAllocatedExtensions().addAll((Collection<? extends AbstractExtension>)newValue);
				return;
			case DecompositionPackage.ABSTRACT_REGION__MACHINE_NAME:
				setMachineName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DecompositionPackage.ABSTRACT_REGION__READY:
				setReady(READY_EDEFAULT);
				return;
			case DecompositionPackage.ABSTRACT_REGION__PROJECT_NAME:
				setProjectName(PROJECT_NAME_EDEFAULT);
				return;
			case DecompositionPackage.ABSTRACT_REGION__CONTEXT_NAME:
				setContextName(CONTEXT_NAME_EDEFAULT);
				return;
			case DecompositionPackage.ABSTRACT_REGION__ALLOCATED_VARIABLES:
				getAllocatedVariables().clear();
				return;
			case DecompositionPackage.ABSTRACT_REGION__ALLOCATED_EXTENSIONS:
				getAllocatedExtensions().clear();
				return;
			case DecompositionPackage.ABSTRACT_REGION__MACHINE_NAME:
				setMachineName(MACHINE_NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DecompositionPackage.ABSTRACT_REGION__READY:
				return ready != READY_EDEFAULT;
			case DecompositionPackage.ABSTRACT_REGION__PROJECT_NAME:
				return PROJECT_NAME_EDEFAULT == null ? projectName != null : !PROJECT_NAME_EDEFAULT.equals(projectName);
			case DecompositionPackage.ABSTRACT_REGION__CONTEXT_NAME:
				return CONTEXT_NAME_EDEFAULT == null ? contextName != null : !CONTEXT_NAME_EDEFAULT.equals(contextName);
			case DecompositionPackage.ABSTRACT_REGION__ALLOCATED_VARIABLES:
				return allocatedVariables != null && !allocatedVariables.isEmpty();
			case DecompositionPackage.ABSTRACT_REGION__ALLOCATED_EXTENSIONS:
				return allocatedExtensions != null && !allocatedExtensions.isEmpty();
			case DecompositionPackage.ABSTRACT_REGION__MACHINE_NAME:
				return MACHINE_NAME_EDEFAULT == null ? machineName != null : !MACHINE_NAME_EDEFAULT.equals(machineName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ready: ");
		result.append(ready);
		result.append(", projectName: ");
		result.append(projectName);
		result.append(", contextName: ");
		result.append(contextName);
		result.append(", machineName: ");
		result.append(machineName);
		result.append(')');
		return result.toString();
	}

} //AbstractRegionImpl
