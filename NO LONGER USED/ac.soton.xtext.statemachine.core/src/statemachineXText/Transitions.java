/**
 */
package statemachineXText;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transitions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link statemachineXText.Transitions#getEvent <em>Event</em>}</li>
 *   <li>{@link statemachineXText.Transitions#getSource <em>Source</em>}</li>
 *   <li>{@link statemachineXText.Transitions#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see statemachineXText.StatemachineXTextPackage#getTransitions()
 * @model
 * @generated
 */
public interface Transitions extends EObject {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' attribute.
	 * The default value is <code>"evt1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' attribute.
	 * @see #setEvent(String)
	 * @see statemachineXText.StatemachineXTextPackage#getTransitions_Event()
	 * @model default="evt1"
	 * @generated
	 */
	String getEvent();

	/**
	 * Sets the value of the '{@link statemachineXText.Transitions#getEvent <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' attribute.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * The default value is <code>"state_1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see statemachineXText.StatemachineXTextPackage#getTransitions_Source()
	 * @model default="state_1"
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link statemachineXText.Transitions#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * The default value is <code>"target_1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see #setTarget(String)
	 * @see statemachineXText.StatemachineXTextPackage#getTransitions_Target()
	 * @model default="target_1"
	 * @generated
	 */
	String getTarget();

	/**
	 * Sets the value of the '{@link statemachineXText.Transitions#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(String value);

} // Transitions
