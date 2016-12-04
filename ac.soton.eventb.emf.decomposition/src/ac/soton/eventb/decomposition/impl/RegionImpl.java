/**
 */
package ac.soton.eventb.decomposition.impl;

import ac.soton.eventb.decomposition.DecompositionPackage;
import ac.soton.eventb.decomposition.Region;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eventb.emf.core.AbstractExtension;
import org.eventb.emf.core.CorePackage;
import org.eventb.emf.core.impl.EventBNamedCommentedElementImpl;
import org.eventb.emf.core.machine.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ac.soton.eventb.decomposition.impl.RegionImpl#getExtensionId <em>Extension Id</em>}</li>
 *   <li>{@link ac.soton.eventb.decomposition.impl.RegionImpl#isReady <em>Ready</em>}</li>
 *   <li>{@link ac.soton.eventb.decomposition.impl.RegionImpl#getProjectName <em>Project Name</em>}</li>
 *   <li>{@link ac.soton.eventb.decomposition.impl.RegionImpl#getContextName <em>Context Name</em>}</li>
 *   <li>{@link ac.soton.eventb.decomposition.impl.RegionImpl#getAllocatedVariables <em>Allocated Variables</em>}</li>
 *   <li>{@link ac.soton.eventb.decomposition.impl.RegionImpl#getAllocatedExtensions <em>Allocated Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegionImpl extends EventBNamedCommentedElementImpl implements Region {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2016\rUniversity of Southampton.\rAll rights reserved. This program and the accompanying materials  are made\ravailable under the terms of the Eclipse Public License v1.0 which accompanies this \rdistribution, and is available at http://www.eclipse.org/legal/epl-v10.html\n";

	/**
	 * The default value of the '{@link #getExtensionId() <em>Extension Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionId()
	 * @generated NOT
	 * @ordered
	 */
	protected static final String EXTENSION_ID_EDEFAULT = DecompositionPackage.DECOMPOSITION_REGION_EXTENSION_ID;

	/**
	 * The cached value of the '{@link #getExtensionId() <em>Extension Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionId()
	 * @generated NOT
	 * @ordered
	 */
	protected String extensionId = EXTENSION_ID_EDEFAULT+"."+EcoreUtil.generateUUID();

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DecompositionPackage.Literals.REGION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtensionId() {
		return extensionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensionId(String newExtensionId) {
		String oldExtensionId = extensionId;
		extensionId = newExtensionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecompositionPackage.REGION__EXTENSION_ID, oldExtensionId, extensionId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DecompositionPackage.REGION__READY, oldReady, ready));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DecompositionPackage.REGION__PROJECT_NAME, oldProjectName, projectName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DecompositionPackage.REGION__CONTEXT_NAME, oldContextName, contextName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getAllocatedVariables() {
		if (allocatedVariables == null) {
			allocatedVariables = new EObjectResolvingEList<Variable>(Variable.class, this, DecompositionPackage.REGION__ALLOCATED_VARIABLES);
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
			allocatedExtensions = new EObjectResolvingEList<AbstractExtension>(AbstractExtension.class, this, DecompositionPackage.REGION__ALLOCATED_EXTENSIONS);
		}
		return allocatedExtensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DecompositionPackage.REGION__EXTENSION_ID:
				return getExtensionId();
			case DecompositionPackage.REGION__READY:
				return isReady();
			case DecompositionPackage.REGION__PROJECT_NAME:
				return getProjectName();
			case DecompositionPackage.REGION__CONTEXT_NAME:
				return getContextName();
			case DecompositionPackage.REGION__ALLOCATED_VARIABLES:
				return getAllocatedVariables();
			case DecompositionPackage.REGION__ALLOCATED_EXTENSIONS:
				return getAllocatedExtensions();
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
			case DecompositionPackage.REGION__EXTENSION_ID:
				setExtensionId((String)newValue);
				return;
			case DecompositionPackage.REGION__READY:
				setReady((Boolean)newValue);
				return;
			case DecompositionPackage.REGION__PROJECT_NAME:
				setProjectName((String)newValue);
				return;
			case DecompositionPackage.REGION__CONTEXT_NAME:
				setContextName((String)newValue);
				return;
			case DecompositionPackage.REGION__ALLOCATED_VARIABLES:
				getAllocatedVariables().clear();
				getAllocatedVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case DecompositionPackage.REGION__ALLOCATED_EXTENSIONS:
				getAllocatedExtensions().clear();
				getAllocatedExtensions().addAll((Collection<? extends AbstractExtension>)newValue);
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
			case DecompositionPackage.REGION__EXTENSION_ID:
				setExtensionId(EXTENSION_ID_EDEFAULT);
				return;
			case DecompositionPackage.REGION__READY:
				setReady(READY_EDEFAULT);
				return;
			case DecompositionPackage.REGION__PROJECT_NAME:
				setProjectName(PROJECT_NAME_EDEFAULT);
				return;
			case DecompositionPackage.REGION__CONTEXT_NAME:
				setContextName(CONTEXT_NAME_EDEFAULT);
				return;
			case DecompositionPackage.REGION__ALLOCATED_VARIABLES:
				getAllocatedVariables().clear();
				return;
			case DecompositionPackage.REGION__ALLOCATED_EXTENSIONS:
				getAllocatedExtensions().clear();
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
			case DecompositionPackage.REGION__EXTENSION_ID:
				return EXTENSION_ID_EDEFAULT == null ? extensionId != null : !EXTENSION_ID_EDEFAULT.equals(extensionId);
			case DecompositionPackage.REGION__READY:
				return ready != READY_EDEFAULT;
			case DecompositionPackage.REGION__PROJECT_NAME:
				return PROJECT_NAME_EDEFAULT == null ? projectName != null : !PROJECT_NAME_EDEFAULT.equals(projectName);
			case DecompositionPackage.REGION__CONTEXT_NAME:
				return CONTEXT_NAME_EDEFAULT == null ? contextName != null : !CONTEXT_NAME_EDEFAULT.equals(contextName);
			case DecompositionPackage.REGION__ALLOCATED_VARIABLES:
				return allocatedVariables != null && !allocatedVariables.isEmpty();
			case DecompositionPackage.REGION__ALLOCATED_EXTENSIONS:
				return allocatedExtensions != null && !allocatedExtensions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractExtension.class) {
			switch (derivedFeatureID) {
				case DecompositionPackage.REGION__EXTENSION_ID: return CorePackage.ABSTRACT_EXTENSION__EXTENSION_ID;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractExtension.class) {
			switch (baseFeatureID) {
				case CorePackage.ABSTRACT_EXTENSION__EXTENSION_ID: return DecompositionPackage.REGION__EXTENSION_ID;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (extensionId: ");
		result.append(extensionId);
		result.append(", ready: ");
		result.append(ready);
		result.append(", projectName: ");
		result.append(projectName);
		result.append(", contextName: ");
		result.append(contextName);
		result.append(')');
		return result.toString();
	}

} //RegionImpl
