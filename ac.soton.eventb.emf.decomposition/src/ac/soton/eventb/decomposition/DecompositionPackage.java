/**
 */
package ac.soton.eventb.decomposition;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eventb.emf.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ac.soton.eventb.decomposition.DecompositionFactory
 * @model kind="package"
 * @generated
 */
public interface DecompositionPackage extends EPackage {
	/**
	 * Decomposition extension ID, assigned to Region extensions to Event-B,
	 * as well as used by decomposition plugins.
	 */
	String DECOMPOSITION_REGION_EXTENSION_ID = "ac.soton.eventb.emf.decomposition.region";	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2016\rUniversity of Southampton.\rAll rights reserved. This program and the accompanying materials  are made\ravailable under the terms of the Eclipse Public License v1.0 which accompanies this \rdistribution, and is available at http://www.eclipse.org/legal/epl-v10.html\n";

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "decomposition";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://soton.ac.uk/models/eventb/decomposition/2016";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "decomposition";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DecompositionPackage eINSTANCE = ac.soton.eventb.decomposition.impl.DecompositionPackageImpl.init();

	/**
	 * The meta object id for the '{@link ac.soton.eventb.decomposition.impl.RegionImpl <em>Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.decomposition.impl.RegionImpl
	 * @see ac.soton.eventb.decomposition.impl.DecompositionPackageImpl#getRegion()
	 * @generated
	 */
	int REGION = 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__ANNOTATIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__EXTENSIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__ATTRIBUTES = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__REFERENCE = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__LOCAL_GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__INTERNAL_ID = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__COMMENT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__NAME = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Extension Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__EXTENSION_ID = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ready</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__READY = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__PROJECT_NAME = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Context Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__CONTEXT_NAME = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Allocated Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__ALLOCATED_VARIABLES = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Allocated Extensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__ALLOCATED_EXTENSIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_FEATURE_COUNT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.decomposition.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region</em>'.
	 * @see ac.soton.eventb.decomposition.Region
	 * @generated
	 */
	EClass getRegion();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.eventb.decomposition.Region#isReady <em>Ready</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ready</em>'.
	 * @see ac.soton.eventb.decomposition.Region#isReady()
	 * @see #getRegion()
	 * @generated
	 */
	EAttribute getRegion_Ready();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.eventb.decomposition.Region#getProjectName <em>Project Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Name</em>'.
	 * @see ac.soton.eventb.decomposition.Region#getProjectName()
	 * @see #getRegion()
	 * @generated
	 */
	EAttribute getRegion_ProjectName();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.eventb.decomposition.Region#getContextName <em>Context Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context Name</em>'.
	 * @see ac.soton.eventb.decomposition.Region#getContextName()
	 * @see #getRegion()
	 * @generated
	 */
	EAttribute getRegion_ContextName();

	/**
	 * Returns the meta object for the reference list '{@link ac.soton.eventb.decomposition.Region#getAllocatedVariables <em>Allocated Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allocated Variables</em>'.
	 * @see ac.soton.eventb.decomposition.Region#getAllocatedVariables()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_AllocatedVariables();

	/**
	 * Returns the meta object for the reference list '{@link ac.soton.eventb.decomposition.Region#getAllocatedExtensions <em>Allocated Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allocated Extensions</em>'.
	 * @see ac.soton.eventb.decomposition.Region#getAllocatedExtensions()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_AllocatedExtensions();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DecompositionFactory getDecompositionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ac.soton.eventb.decomposition.impl.RegionImpl <em>Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.decomposition.impl.RegionImpl
		 * @see ac.soton.eventb.decomposition.impl.DecompositionPackageImpl#getRegion()
		 * @generated
		 */
		EClass REGION = eINSTANCE.getRegion();

		/**
		 * The meta object literal for the '<em><b>Ready</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGION__READY = eINSTANCE.getRegion_Ready();

		/**
		 * The meta object literal for the '<em><b>Project Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGION__PROJECT_NAME = eINSTANCE.getRegion_ProjectName();

		/**
		 * The meta object literal for the '<em><b>Context Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGION__CONTEXT_NAME = eINSTANCE.getRegion_ContextName();

		/**
		 * The meta object literal for the '<em><b>Allocated Variables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__ALLOCATED_VARIABLES = eINSTANCE.getRegion_AllocatedVariables();

		/**
		 * The meta object literal for the '<em><b>Allocated Extensions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__ALLOCATED_EXTENSIONS = eINSTANCE.getRegion_AllocatedExtensions();

	}

} //DecompositionPackage
