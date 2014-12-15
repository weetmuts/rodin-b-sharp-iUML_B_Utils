package ac.soton.xtext.serializer;

import ac.soton.xtext.services.ContextDslGrammarAccess;
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
import org.eventb.emf.core.context.Axiom;
import org.eventb.emf.core.context.CarrierSet;
import org.eventb.emf.core.context.Constant;
import org.eventb.emf.core.context.Context;
import org.eventb.emf.core.context.ContextPackage;

@SuppressWarnings("all")
public abstract class AbstractContextDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ContextDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ContextPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ContextPackage.AXIOM:
				if(context == grammarAccess.getAxiomRule()) {
					sequence_Axiom(context, (Axiom) semanticObject); 
					return; 
				}
				else break;
			case ContextPackage.CARRIER_SET:
				if(context == grammarAccess.getCarrierSetRule()) {
					sequence_CarrierSet(context, (CarrierSet) semanticObject); 
					return; 
				}
				else break;
			case ContextPackage.CONSTANT:
				if(context == grammarAccess.getConstantRule()) {
					sequence_Constant(context, (Constant) semanticObject); 
					return; 
				}
				else break;
			case ContextPackage.CONTEXT:
				if(context == grammarAccess.getContextRule()) {
					sequence_Context(context, (Context) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=EString predicate=EString? theorem?='theorem'? comment=EString?)
	 */
	protected void sequence_Axiom(EObject context, Axiom semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString comment=EString?)
	 */
	protected void sequence_CarrierSet(EObject context, CarrierSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString comment=EString?)
	 */
	protected void sequence_Constant(EObject context, Constant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         comment=EString? 
	 *         (extends+=[Context|EString] extends+=[Context|EString]*)? 
	 *         (sets+=CarrierSet sets+=CarrierSet*)? 
	 *         (constants+=Constant constants+=Constant*)? 
	 *         (axioms+=Axiom axioms+=Axiom*)?
	 *     )
	 */
	protected void sequence_Context(EObject context, Context semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
