package ac.soton.uk.iumlb.xtext.serializer;

import ac.soton.eventb.statemachines.Any;
import ac.soton.eventb.statemachines.Final;
import ac.soton.eventb.statemachines.Fork;
import ac.soton.eventb.statemachines.Initial;
import ac.soton.eventb.statemachines.Junction;
import ac.soton.eventb.statemachines.State;
import ac.soton.eventb.statemachines.Statemachine;
import ac.soton.eventb.statemachines.StatemachinesPackage;
import ac.soton.eventb.statemachines.Transition;
import ac.soton.uk.iumlb.xtext.services.DslGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eventb.emf.core.machine.Invariant;
import org.eventb.emf.core.machine.MachinePackage;

@SuppressWarnings("all")
public abstract class AbstractDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == EcorePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case EcorePackage.EOBJECT:
				if(context == grammarAccess.getEObjectRule()) {
					sequence_EObject(context, (EObject) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == MachinePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case MachinePackage.INVARIANT:
				if(context == grammarAccess.getInvariantRule()) {
					sequence_Invariant(context, (Invariant) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == StatemachinesPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case StatemachinesPackage.ANY:
				if(context == grammarAccess.getAbstractNodeRule() ||
				   context == grammarAccess.getAnyRule()) {
					sequence_Any(context, (Any) semanticObject); 
					return; 
				}
				else break;
			case StatemachinesPackage.FINAL:
				if(context == grammarAccess.getAbstractNodeRule() ||
				   context == grammarAccess.getFinalRule()) {
					sequence_Final(context, (Final) semanticObject); 
					return; 
				}
				else break;
			case StatemachinesPackage.FORK:
				if(context == grammarAccess.getAbstractNodeRule() ||
				   context == grammarAccess.getForkRule()) {
					sequence_Fork(context, (Fork) semanticObject); 
					return; 
				}
				else break;
			case StatemachinesPackage.INITIAL:
				if(context == grammarAccess.getAbstractNodeRule() ||
				   context == grammarAccess.getInitialRule()) {
					sequence_Initial(context, (Initial) semanticObject); 
					return; 
				}
				else break;
			case StatemachinesPackage.JUNCTION:
				if(context == grammarAccess.getAbstractNodeRule() ||
				   context == grammarAccess.getJunctionRule()) {
					sequence_Junction(context, (Junction) semanticObject); 
					return; 
				}
				else break;
			case StatemachinesPackage.STATE:
				if(context == grammarAccess.getAbstractNodeRule() ||
				   context == grammarAccess.getStateRule()) {
					sequence_State(context, (State) semanticObject); 
					return; 
				}
				else break;
			case StatemachinesPackage.STATEMACHINE:
				if(context == grammarAccess.getStatemachineRule()) {
					sequence_Statemachine(context, (Statemachine) semanticObject); 
					return; 
				}
				else break;
			case StatemachinesPackage.TRANSITION:
				if(context == grammarAccess.getTransitionRule()) {
					sequence_Transition(context, (Transition) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (internalId=EString?)
	 */
	protected void sequence_Any(EObject context, Any semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {EObject}
	 */
	protected void sequence_EObject(EObject context, EObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (internalId=EString?)
	 */
	protected void sequence_Final(EObject context, Final semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (internalId=EString?)
	 */
	protected void sequence_Fork(EObject context, Fork semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (internalId=EString?)
	 */
	protected void sequence_Initial(EObject context, Initial semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString theorem?='theorem'? comment=EString? predicate=EString)
	 */
	protected void sequence_Invariant(EObject context, Invariant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (internalId=EString?)
	 */
	protected void sequence_Junction(EObject context, Junction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString (statemachines+=Statemachine statemachines+=Statemachine*)? (invariants+=Invariant invariants+=Invariant*)?)
	 */
	protected void sequence_State(EObject context, State semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         elaborates=[EventBNamed|EString]? 
	 *         refines=[Statemachine|EString]? 
	 *         (nodes+=AbstractNode nodes+=AbstractNode*)? 
	 *         (transitions+=Transition transitions+=Transition*)?
	 *     )
	 */
	protected void sequence_Statemachine(EObject context, Statemachine semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         extended?='extended'? 
	 *         comment=EString? 
	 *         (elaborates+=[Event|EString] elaborates+=[Event|EString]*)? 
	 *         target=[AbstractNode|EString] 
	 *         source=[AbstractNode|EString]
	 *     )
	 */
	protected void sequence_Transition(EObject context, Transition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
