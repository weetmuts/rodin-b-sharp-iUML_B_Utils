package ac.soton.xtext.statemachine.serializer;

import ac.soton.xtext.statemachine.services.DslGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import statemachineXText.Any;
import statemachineXText.Final;
import statemachineXText.Fork;
import statemachineXText.Initial;
import statemachineXText.Join;
import statemachineXText.Junction;
import statemachineXText.State;
import statemachineXText.StateMachine;
import statemachineXText.StatemachineXTextPackage;
import statemachineXText.Transition;

@SuppressWarnings("all")
public abstract class AbstractDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == StatemachineXTextPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case StatemachineXTextPackage.ANY:
				if(context == grammarAccess.getAbstractNodeRule() ||
				   context == grammarAccess.getAnyRule()) {
					sequence_Any(context, (Any) semanticObject); 
					return; 
				}
				else break;
			case StatemachineXTextPackage.FINAL:
				if(context == grammarAccess.getAbstractNodeRule() ||
				   context == grammarAccess.getFinalRule()) {
					sequence_Final(context, (Final) semanticObject); 
					return; 
				}
				else break;
			case StatemachineXTextPackage.FORK:
				if(context == grammarAccess.getAbstractNodeRule() ||
				   context == grammarAccess.getForkRule()) {
					sequence_Fork(context, (Fork) semanticObject); 
					return; 
				}
				else break;
			case StatemachineXTextPackage.INITIAL:
				if(context == grammarAccess.getAbstractNodeRule() ||
				   context == grammarAccess.getInitialRule()) {
					sequence_Initial(context, (Initial) semanticObject); 
					return; 
				}
				else break;
			case StatemachineXTextPackage.JOIN:
				if(context == grammarAccess.getAbstractNodeRule() ||
				   context == grammarAccess.getJoinRule()) {
					sequence_Join(context, (Join) semanticObject); 
					return; 
				}
				else break;
			case StatemachineXTextPackage.JUNCTION:
				if(context == grammarAccess.getAbstractNodeRule() ||
				   context == grammarAccess.getJunctionRule()) {
					sequence_Junction(context, (Junction) semanticObject); 
					return; 
				}
				else break;
			case StatemachineXTextPackage.STATE:
				if(context == grammarAccess.getAbstractNodeRule() ||
				   context == grammarAccess.getStateRule()) {
					sequence_State(context, (State) semanticObject); 
					return; 
				}
				else break;
			case StatemachineXTextPackage.STATE_MACHINE:
				if(context == grammarAccess.getStateMachineRule()) {
					sequence_StateMachine(context, (StateMachine) semanticObject); 
					return; 
				}
				else break;
			case StatemachineXTextPackage.TRANSITION:
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
	 *     name=EString
	 */
	protected void sequence_Any(EObject context, Any semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StatemachineXTextPackage.Literals.ABSTRACT_NODE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StatemachineXTextPackage.Literals.ABSTRACT_NODE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAnyAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_Final(EObject context, Final semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StatemachineXTextPackage.Literals.ABSTRACT_NODE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StatemachineXTextPackage.Literals.ABSTRACT_NODE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFinalAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_Fork(EObject context, Fork semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StatemachineXTextPackage.Literals.ABSTRACT_NODE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StatemachineXTextPackage.Literals.ABSTRACT_NODE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getForkAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_Initial(EObject context, Initial semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StatemachineXTextPackage.Literals.ABSTRACT_NODE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StatemachineXTextPackage.Literals.ABSTRACT_NODE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInitialAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_Join(EObject context, Join semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StatemachineXTextPackage.Literals.ABSTRACT_NODE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StatemachineXTextPackage.Literals.ABSTRACT_NODE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getJoinAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_Junction(EObject context, Junction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StatemachineXTextPackage.Literals.ABSTRACT_NODE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StatemachineXTextPackage.Literals.ABSTRACT_NODE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getJunctionAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         (Nodes+=AbstractNode Nodes+=AbstractNode*)? 
	 *         (Transitions+=Transition Transitions+=Transition*)? 
	 *         (StateMachines+=StateMachine StateMachines+=StateMachine*)?
	 *     )
	 */
	protected void sequence_StateMachine(EObject context, StateMachine semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString nested=StateMachine?)
	 */
	protected void sequence_State(EObject context, State semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (event=EString? source=[AbstractNode|EString]? target=[AbstractNode|EString]?)
	 */
	protected void sequence_Transition(EObject context, Transition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
