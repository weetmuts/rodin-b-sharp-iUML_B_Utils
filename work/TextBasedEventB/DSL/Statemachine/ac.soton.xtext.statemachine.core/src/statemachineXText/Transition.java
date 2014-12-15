/**
 */
package statemachineXText;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link statemachineXText.Transition#getEvent <em>Event</em>}</li>
 *   <li>{@link statemachineXText.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link statemachineXText.Transition#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see statemachineXText.StatemachineXTextPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
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
	 * @see statemachineXText.StatemachineXTextPackage#getTransition_Event()
	 * @model default="evt1"
	 * @generated
	 */
	String getEvent();

	/**
	 * Sets the value of the '{@link statemachineXText.Transition#getEvent <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' attribute.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(AbstractNode)
	 * @see statemachineXText.StatemachineXTextPackage#getTransition_Source()
	 * @model
	 * @generated
	 */
	AbstractNode getSource();

	/**
	 * Sets the value of the '{@link statemachineXText.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(AbstractNode value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(AbstractNode)
	 * @see statemachineXText.StatemachineXTextPackage#getTransition_Target()
	 * @model
	 * @generated
	 */
	AbstractNode getTarget();

	/**
	 * Sets the value of the '{@link statemachineXText.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(AbstractNode value);

} // Transition
