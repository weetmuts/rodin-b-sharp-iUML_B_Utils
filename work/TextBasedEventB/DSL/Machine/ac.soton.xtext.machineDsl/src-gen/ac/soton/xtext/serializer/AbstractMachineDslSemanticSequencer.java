package ac.soton.xtext.serializer;

import ac.soton.eventb.emf.core.extension.coreextension.CoreextensionPackage;
import ac.soton.eventb.emf.core.extension.coreextension.TypedParameter;
import ac.soton.eventb.statemachines.Any;
import ac.soton.eventb.statemachines.Final;
import ac.soton.eventb.statemachines.Fork;
import ac.soton.eventb.statemachines.Initial;
import ac.soton.eventb.statemachines.Junction;
import ac.soton.eventb.statemachines.State;
import ac.soton.eventb.statemachines.Statemachine;
import ac.soton.eventb.statemachines.StatemachinesPackage;
import ac.soton.eventb.statemachines.Transition;
import ac.soton.xtext.services.MachineDslGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eventb.emf.core.machine.Action;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Guard;
import org.eventb.emf.core.machine.Invariant;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.MachinePackage;
import org.eventb.emf.core.machine.Parameter;
import org.eventb.emf.core.machine.Variable;
import org.eventb.emf.core.machine.Variant;
import org.eventb.emf.core.machine.Witness;

@SuppressWarnings("all")
public abstract class AbstractMachineDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MachineDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == CoreextensionPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case CoreextensionPackage.TYPED_PARAMETER:
				if(context == grammarAccess.getTypedParameterRule()) {
					sequence_TypedParameter(context, (TypedParameter) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == MachinePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case MachinePackage.ACTION:
				if(context == grammarAccess.getActionRule()) {
					sequence_Action(context, (Action) semanticObject); 
					return; 
				}
				else break;
			case MachinePackage.EVENT:
				if(context == grammarAccess.getEventRule()) {
					sequence_event(context, (Event) semanticObject); 
					return; 
				}
				else break;
			case MachinePackage.GUARD:
				if(context == grammarAccess.getGuardRule()) {
					sequence_Guard(context, (Guard) semanticObject); 
					return; 
				}
				else break;
			case MachinePackage.INVARIANT:
				if(context == grammarAccess.getInvariantRule()) {
					sequence_Invariant(context, (Invariant) semanticObject); 
					return; 
				}
				else break;
			case MachinePackage.MACHINE:
				if(context == grammarAccess.getMachineRule()) {
					sequence_Machine(context, (Machine) semanticObject); 
					return; 
				}
				else break;
			case MachinePackage.PARAMETER:
				if(context == grammarAccess.getParameterRule()) {
					sequence_Parameter(context, (Parameter) semanticObject); 
					return; 
				}
				else break;
			case MachinePackage.VARIABLE:
				if(context == grammarAccess.getVariableRule()) {
					sequence_Variable(context, (Variable) semanticObject); 
					return; 
				}
				else break;
			case MachinePackage.VARIANT:
				if(context == grammarAccess.getVariantRule()) {
					sequence_Variant(context, (Variant) semanticObject); 
					return; 
				}
				else break;
			case MachinePackage.WITNESS:
				if(context == grammarAccess.getWitnessRule()) {
					sequence_Witness(context, (Witness) semanticObject); 
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
				if(context == grammarAccess.getAbstractExtensionRule() ||
				   context == grammarAccess.getStatemachineRule()) {
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
	 *     (name=EString action=EString? comment=EString?)
	 */
	protected void sequence_Action(EObject context, Action semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_Any(EObject context, Any semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_Final(EObject context, Final semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_Fork(EObject context, Fork semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString predicate=EString? theorem?='theorem'? comment=EString?)
	 */
	protected void sequence_Guard(EObject context, Guard semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_Initial(EObject context, Initial semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString predicate=EString? theorem?='theorem'? comment=EString?)
	 */
	protected void sequence_Invariant(EObject context, Invariant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_Junction(EObject context, Junction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         comment=EString? 
	 *         (refines+=[Machine|EString] refines+=[Machine|EString]*)? 
	 *         (sees+=[Context|EString] sees+=[Context|EString]*)? 
	 *         (variables+=Variable variables+=Variable*)? 
	 *         (invariants+=Invariant invariants+=Invariant*)? 
	 *         variant=Variant? 
	 *         (events+=event events+=event*)? 
	 *         (extensions+=AbstractExtension extensions+=AbstractExtension*)?
	 *     )
	 */
	protected void sequence_Machine(EObject context, Machine semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString comment=EString?)
	 */
	protected void sequence_Parameter(EObject context, Parameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         refines=[State|EString]? 
	 *         (invariants+=Invariant invariants+=Invariant*)? 
	 *         (statemachines+=Statemachine statemachines+=Statemachine*)?
	 *     )
	 */
	protected void sequence_State(EObject context, State semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         comment=EString? 
	 *         translation=TranslationKind? 
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
	 *         (elaborates+=[Event|QString] elaborates+=[Event|QString]*)? 
	 *         source=[AbstractNode|QString]? 
	 *         target=[AbstractNode|QString]? 
	 *         (parameters+=TypedParameter parameters+=TypedParameter*)? 
	 *         (guards+=Guard guards+=Guard*)? 
	 *         (witnesses+=Witness witnesses+=Witness*)? 
	 *         (actions+=Action actions+=Action*)?
	 *     )
	 */
	protected void sequence_Transition(EObject context, Transition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString type=EString comment=EString?)
	 */
	protected void sequence_TypedParameter(EObject context, TypedParameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString comment=EString?)
	 */
	protected void sequence_Variable(EObject context, Variable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=EString? comment=EString?)
	 */
	protected void sequence_Variant(EObject context, Variant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (localGenerated?='localGenerated'? name=EString predicate=EString? comment=EString?)
	 */
	protected void sequence_Witness(EObject context, Witness semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         extended?='extended'? 
	 *         convergence=Convergence? 
	 *         comment=EString? 
	 *         (refines+=[Event|QString] refines+=[Event|QString]*)? 
	 *         (parameters+=Parameter parameters+=Parameter*)? 
	 *         (guards+=Guard guards+=Guard*)? 
	 *         (witnesses+=Witness witnesses+=Witness*)? 
	 *         (actions+=Action actions+=Action*)?
	 *     )
	 */
	protected void sequence_event(EObject context, Event semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
