/**
 */
package statemachineXText;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link statemachineXText.State#getNested <em>Nested</em>}</li>
 * </ul>
 * </p>
 *
 * @see statemachineXText.StatemachineXTextPackage#getState()
 * @model
 * @generated
 */
public interface State extends AbstractNode {
	/**
	 * Returns the value of the '<em><b>Nested</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested</em>' containment reference.
	 * @see #setNested(StateMachine)
	 * @see statemachineXText.StatemachineXTextPackage#getState_Nested()
	 * @model containment="true"
	 * @generated
	 */
	StateMachine getNested();

	/**
	 * Sets the value of the '{@link statemachineXText.State#getNested <em>Nested</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nested</em>' containment reference.
	 * @see #getNested()
	 * @generated
	 */
	void setNested(StateMachine value);

} // State
