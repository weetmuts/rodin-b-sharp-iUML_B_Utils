package ac.soton.codin.codegen.basic;

import static org.eventb.codegen.tasking.utils.CodeGenTaskingUtils.ASSIGNMENT_ELEMENT_IN;
import static org.eventb.codegen.tasking.utils.CodeGenTaskingUtils.ASSIGNMENT_SYMBOL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eventb.codegen.il1.ConstantDecl;
import org.eventb.codegen.il1.Declaration;
import org.eventb.codegen.il1.Enumeration;
import org.eventb.codegen.il1.Il1Factory;
import org.eventb.codegen.il1.Program;
import org.eventb.codegen.il1.VariableDecl;
import org.eventb.codegen.tasking.utils.CodeGenTaskingUtils;

import ac.soton.eventb.emf.components.Component;
import ac.soton.eventb.emf.components.ComponentAxiom;
import ac.soton.eventb.emf.components.ComponentConstant;
import ac.soton.eventb.emf.components.ComponentInitialisation;
import ac.soton.eventb.emf.components.ComponentInvariant;
import ac.soton.eventb.emf.components.Connector;
import ac.soton.eventb.emf.components.impl.ComponentImpl;
import ac.soton.eventb.statemachines.AbstractNode;
import ac.soton.eventb.statemachines.Initial;
import ac.soton.eventb.statemachines.State;
import ac.soton.eventb.statemachines.Statemachine;
import ac.soton.eventb.statemachines.StatemachinesPackage;
import ac.soton.eventb.statemachines.Transition;

public class VHDL_IL1_DeclarationsGenerator {

	private static VHDL_IL1_DeclarationsGenerator singleton;

	public static VHDL_IL1_DeclarationsGenerator getDefault() {
		if (singleton == null) {
			singleton = new VHDL_IL1_DeclarationsGenerator();
			return singleton;
		} else {
			return singleton;
		}
	}

	private Program program;

	public void run(VHDL_TranslationData translationData)
			throws CodinTranslatorException {
		this.program = translationData.program;
		List<Declaration> tmpDeclarationList = new ArrayList<>();
		// get the variables from the top-level and components.
		for (Component component : translationData.componentList) {
			List<ComponentInitialisation> initialisationsList = component
					.getInitialisations();
			for (ComponentInitialisation initialisation : initialisationsList) {
				makeVarDeclaration(translationData, tmpDeclarationList,
						component, initialisation);
			}
			// Make constant declarations
			makeConstDeclarations(translationData, tmpDeclarationList,
					component);
		}
		// Use a component to find the container and get the top-level
		// variables.
		Component firstInList = translationData.componentList.get(0);
		Component topComponent = null;
		EObject tmpTopComponent_ = firstInList.eContainer();
		if (tmpTopComponent_.getClass() == ComponentImpl.class) {
			topComponent = (Component) tmpTopComponent_;
			List<ComponentInitialisation> initialisationsList = topComponent
					.getInitialisations();
			for (ComponentInitialisation initialisation : initialisationsList) {
				makeVarDeclaration(translationData, tmpDeclarationList,
						topComponent, initialisation);
			}
			// Make constant declarations
			makeConstDeclarations(translationData, tmpDeclarationList,
					topComponent);
		}

		// We track of signals in the smTranslatorData class. We can then map
		// the associated variable Declarations to signals in the
		// stage 2 (IL1 to code) translation.
		for (Connector connector : topComponent.getConnectors()) {
			VHDL_TranslationData.connectorList.add(connector);
			translationData.quickPrintInfo.getConnectorList().add(connector);
		}

		// Add the new list to the existing list of declarations.
		program.getDecls().addAll(tmpDeclarationList);

		// Add the state-machine program counter values as an enum.
		for (Statemachine sm : translationData.synchSMList) {
			// get the nodes of the state-machine
			List<AbstractNode> nodeList = sm.getNodes();
			// we add a program counter variable;
			VariableDecl pcVarDecl = Il1Factory.eINSTANCE.createVariableDecl();
			VariableDecl next_pcVarDecl = Il1Factory.eINSTANCE.createVariableDecl();
			VariableDecl init_pcVarDecl = Il1Factory.eINSTANCE.createVariableDecl();
			// we add the program counter states enum
			Enumeration enm = Il1Factory.eINSTANCE.createEnumeration();
			program.getDecls().add(enm);
			enm.setIdentifier(sm.getName() + "_States");
			for (AbstractNode node : nodeList) {
				if (node != null) {
					// if we have a state add the name to the literals
					if (node.eClass() == StatemachinesPackage.Literals.STATE) {
						State state = (State) node;
						enm.getLiteralValues().add(state.getName());
					} else if (node.eClass() == StatemachinesPackage.Literals.INITIAL) {
						// else we have the initialisation.
						Initial i = (Initial) node;
						// the should be exactly one outgoing transition on the
						// initial node
						Transition transition = i.getOutgoing().get(0);
						AbstractNode initialSynchSMCounterValue = transition
								.getTarget();
						// if we have a state machine counter value
						if (initialSynchSMCounterValue.eClass() == StatemachinesPackage.Literals.STATE) {
							State startingState = (State) initialSynchSMCounterValue;
							pcVarDecl.setInitialValue(startingState.getName());
							next_pcVarDecl.setInitialValue(startingState.getName());
							init_pcVarDecl.setInitialValue(startingState.getName());
						}
					}
				}
			}
			// add the variable to record the current state-machine state.
			program.getDecls().add(pcVarDecl);
			pcVarDecl.setIdentifier(sm.getName());
			pcVarDecl.setType(sm.getName() + "_States");
			// add the variable to record the next state-machine state.
			program.getDecls().add(next_pcVarDecl);
			next_pcVarDecl.setIdentifier("next_"+sm.getName());
			next_pcVarDecl.setType(sm.getName() + "_States");
			// we also need to record the initial value
			program.getDecls().add(init_pcVarDecl);
			init_pcVarDecl.setIdentifier("init_"+sm.getName());
			init_pcVarDecl.setType(sm.getName() + "_States");
		}
	}

	private void makeConstDeclarations(VHDL_TranslationData translationData,
			List<Declaration> tmpDeclarationList, Component topComponent)
			throws CodinTranslatorException {
		List<ComponentConstant> constantList = topComponent.getConstants();
		List<ComponentAxiom> axiomList = topComponent.getAxioms();
		Map<String, ConstantDecl> cDeclMap = new HashMap<>();
		// for each constant
		for (ComponentConstant constant : constantList) {
			String cName = constant.getName();
			// To find the typing axiom:
			// find an axiom that starts with the constant's
			// name and contains the :: element of symbol.
			// We ignore partitions (enums) for now.
			for (ComponentAxiom axiom : axiomList) {
				String predicate = axiom.getPredicate();
				predicate = CodeGenTaskingUtils
						.makeSingleSpaceBetweenElements(predicate);
				// if this is an initialisation axiom of the form cName = x
				// or type axiom cName : y
				// then we assume it is a constant Declaration with value x
				// and type y.
				if (predicate.startsWith(cName)
						&& (predicate.contains(CodeGenTaskingUtils.ELEMENT_OF) || predicate
								.contains(CodeGenTaskingUtils.EQUALS_SYMBOL))) {
					boolean isType = predicate.startsWith(cName + " "
							+ CodeGenTaskingUtils.ELEMENT_OF);

					boolean isInitialisationEquality = predicate
							.startsWith(cName + " "
									+ CodeGenTaskingUtils.EQUALS_SYMBOL);
					// if there is no declaration of cName in the map
					ConstantDecl cDecl = null;
					if (!cDeclMap.keySet().contains(cName)) {
						// create a new declaration and add it to the map
						cDecl = Il1Factory.eINSTANCE.createConstantDecl();
						tmpDeclarationList.add(cDecl);
						cDecl.setIdentifier(cName);
						cDeclMap.put(cName, cDecl);
						cDecl.setComponentName(translationData.parentMachine
								.getName());
						cDecl.setProjectName(translationData.parentProject
								.getElementName());
					}
					// else get the existing declaration
					else {
						cDecl = cDeclMap.get(cName);
					}
					if (cDecl == null)
						throw new CodinTranslatorException(
								"constant name not found: " + cName);
					if (isInitialisationEquality) {
						// split the initialisation in the appropriate place.
						// to find the initial value
						String[] cInit = predicate
								.split(CodeGenTaskingUtils.EQUALS_SYMBOL);
						// set the initial value.
						if (cInit != null && cInit.length > 1) {
							cDecl.setInitialValue(cInit[1].trim());
						}
					} else if (isType) {
						// find the type of the value
						String[] cType = predicate
								.split(CodeGenTaskingUtils.ELEMENT_OF);
						// set the initial value.
						if (cType != null && cType.length > 1) {
							cDecl.setType(cType[1].trim());
							continue;
						}
					}
				}
			}
		}
	}

	private void makeVarDeclaration(VHDL_TranslationData translationData,
			List<Declaration> tmpDeclarationList, Component component,
			ComponentInitialisation initialisation) {
		Declaration vDecl = Il1Factory.eINSTANCE.createVariableDecl();
		String initialisationString = initialisation.getAction();

		initialisationString = CodeGenTaskingUtils
				.makeSingleSpaceBetweenElements(initialisationString);

		// Obtain the variable name from the first part
		// of the initialisation string.
		String variableName = initialisationString.split(" ")[0];
		variableName = variableName.trim();
		// set information for the declaration
		vDecl.setIdentifier(variableName);
		vDecl.setProjectName(translationData.parentProject.getElementName());
		vDecl.setComponentName(translationData.parentMachine.getName());
		// Get the initialisation part
		boolean hasDetAssignment = initialisationString.startsWith(variableName
				+ " " + ASSIGNMENT_SYMBOL);
		boolean hasNonDetAssignment = initialisationString
				.startsWith(variableName + " " + ASSIGNMENT_ELEMENT_IN);

		if (initialisationString.startsWith(variableName + " ")
				|| hasDetAssignment || hasNonDetAssignment) {
			String[] vInit = null;
			// split the initialisation in the appropriate place.
			if (hasDetAssignment) {
				vInit = initialisationString.split(ASSIGNMENT_SYMBOL);
			} else if (hasNonDetAssignment) {
				vInit = initialisationString.split(ASSIGNMENT_ELEMENT_IN);
			}
			// set the initial value.
			if (vInit != null && vInit.length > 1) {
				vDecl.setInitialValue(vInit[1].trim());
			}
		}
		// add this declaration to the tmp list of declarations
		if (vDecl != null) {
			tmpDeclarationList.add(vDecl);
		}

		// Finished the initialisation part. Now add the type info.
		List<ComponentInvariant> invariantList = component.getInvariants();
		for (ComponentInvariant invariant : invariantList) {
			String predicate = invariant.getPredicate().trim();
			predicate = CodeGenTaskingUtils
					.makeSingleSpaceBetweenElements(predicate);
			// if we found an invariant that starts with the varName
			// lets see if it has is a typing expression
			if (predicate.startsWith(variableName)) {
				String[] wordArray = predicate.split(" ");

				List<String> wordList = Arrays.asList(wordArray);
				if (wordList.contains(CodeGenTaskingUtils.ELEMENT_OF)) {
					// we have found a typing predicate for this
					// initialisation
					// and the type is at index 2 of the wordList
					vDecl.setType(wordList.get(2));
					// quit the invariant search loop.
					break;
				}
			}
		}
	}

}
