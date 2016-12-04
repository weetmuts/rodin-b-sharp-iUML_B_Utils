/**
 */
package ac.soton.eventb.decomposition;

import org.eclipse.emf.common.util.EList;

import org.eventb.emf.core.AbstractExtension;
import org.eventb.emf.core.EventBNamedCommentedElement;

import org.eventb.emf.core.machine.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.soton.eventb.decomposition.Region#isReady <em>Ready</em>}</li>
 *   <li>{@link ac.soton.eventb.decomposition.Region#getProjectName <em>Project Name</em>}</li>
 *   <li>{@link ac.soton.eventb.decomposition.Region#getContextName <em>Context Name</em>}</li>
 *   <li>{@link ac.soton.eventb.decomposition.Region#getAllocatedVariables <em>Allocated Variables</em>}</li>
 *   <li>{@link ac.soton.eventb.decomposition.Region#getAllocatedExtensions <em>Allocated Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.soton.eventb.decomposition.DecompositionPackage#getRegion()
 * @model
 * @generated
 */
public interface Region extends EventBNamedCommentedElement, AbstractExtension {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2016\rUniversity of Southampton.\rAll rights reserved. This program and the accompanying materials  are made\ravailable under the terms of the Eclipse Public License v1.0 which accompanies this \rdistribution, and is available at http://www.eclipse.org/legal/epl-v10.html\n";

	/**
	 * Returns the value of the '<em><b>Ready</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ready</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ready</em>' attribute.
	 * @see #setReady(boolean)
	 * @see ac.soton.eventb.decomposition.DecompositionPackage#getRegion_Ready()
	 * @model
	 * @generated
	 */
	boolean isReady();

	/**
	 * Sets the value of the '{@link ac.soton.eventb.decomposition.Region#isReady <em>Ready</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ready</em>' attribute.
	 * @see #isReady()
	 * @generated
	 */
	void setReady(boolean value);

	/**
	 * Returns the value of the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Name</em>' attribute.
	 * @see #setProjectName(String)
	 * @see ac.soton.eventb.decomposition.DecompositionPackage#getRegion_ProjectName()
	 * @model
	 * @generated
	 */
	String getProjectName();

	/**
	 * Sets the value of the '{@link ac.soton.eventb.decomposition.Region#getProjectName <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Name</em>' attribute.
	 * @see #getProjectName()
	 * @generated
	 */
	void setProjectName(String value);

	/**
	 * Returns the value of the '<em><b>Context Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Name</em>' attribute.
	 * @see #setContextName(String)
	 * @see ac.soton.eventb.decomposition.DecompositionPackage#getRegion_ContextName()
	 * @model
	 * @generated
	 */
	String getContextName();

	/**
	 * Sets the value of the '{@link ac.soton.eventb.decomposition.Region#getContextName <em>Context Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Name</em>' attribute.
	 * @see #getContextName()
	 * @generated
	 */
	void setContextName(String value);

	/**
	 * Returns the value of the '<em><b>Allocated Variables</b></em>' reference list.
	 * The list contents are of type {@link org.eventb.emf.core.machine.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocated Variables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated Variables</em>' reference list.
	 * @see ac.soton.eventb.decomposition.DecompositionPackage#getRegion_AllocatedVariables()
	 * @model
	 * @generated
	 */
	EList<Variable> getAllocatedVariables();

	/**
	 * Returns the value of the '<em><b>Allocated Extensions</b></em>' reference list.
	 * The list contents are of type {@link org.eventb.emf.core.AbstractExtension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocated Extensions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated Extensions</em>' reference list.
	 * @see ac.soton.eventb.decomposition.DecompositionPackage#getRegion_AllocatedExtensions()
	 * @model
	 * @generated
	 */
	EList<AbstractExtension> getAllocatedExtensions();

} // Region
