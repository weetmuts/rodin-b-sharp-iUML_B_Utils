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
import org.eventb.codegen.il1.Il1Factory;
import org.eventb.codegen.il1.Program;
import org.eventb.codegen.tasking.utils.CodeGenTaskingUtils;

import quickprint.impl.QuickPrintInfo;
import ac.soton.eventb.emf.components.Component;
import ac.soton.eventb.emf.components.ComponentAxiom;
import ac.soton.eventb.emf.components.ComponentConstant;
import ac.soton.eventb.emf.components.ComponentInitialisation;
import ac.soton.eventb.emf.components.ComponentInvariant;
import ac.soton.eventb.emf.components.Connector;
import ac.soton.eventb.emf.components.impl.ComponentImpl;

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

	public void run(VHDL_TranslationData smTranslationMgr)
			throws CodinTranslatorException {
		this.program = smTranslationMgr.program;
		List<Declaration> tmpDeclarationList = new ArrayList<>();
		// get the variables from the top-level and components.
		for (Component component : smTranslationMgr.componentList) {
			List<ComponentInitialisation> initialisationsList = component
					.getInitialisations();
			for (ComponentInitialisation initialisation : initialisationsList) {
				makeVarDeclaration(smTranslationMgr, tmpDeclarationList,
						component, initialisation);
			}
			// Make constant declarations
			makeConstDeclarations(smTranslationMgr, tmpDeclarationList,
					component);
		}
		// Use a component to find the container and get the top-level
		// variables.
		Component firstInList = smTranslationMgr.componentList.get(0);
		Component topComponent = null;
		EObject tmpTopComponent_ = firstInList.eContainer();
		if (tmpTopComponent_.getClass() == ComponentImpl.class) {
			topComponent = (Component) tmpTopComponent_;
			List<ComponentInitialisation> initialisationsList = topComponent
					.getInitialisations();
			for (ComponentInitialisation initialisation : initialisationsList) {
				makeVarDeclaration(smTranslationMgr, tmpDeclarationList,
						topComponent, initialisation);
			}
			// Make constant declarations
			makeConstDeclarations(smTranslationMgr, tmpDeclarationList,
					topComponent);
		}

		// We track of signals in the smTranslatorData class. We can then map
		// the associated variable Declarations to signals in the
		// stage 2 (IL1 to code) translation.
		for (Connector connector : topComponent.getConnectors()) {
			VHDL_TranslationData.connectorList.add(connector);
			QuickPrintInfo.getConns().add(connector);
		}

		// Add the new list to the existing list of declarations.
		program.getDecls().addAll(tmpDeclarationList);
	}

	private void makeConstDeclarations(
			VHDL_TranslationData smTranslationMgr,
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
//////// REPLACE With THIS
/////// 		predicate = new TranslatorUtils()
///////				.makeSingleSpaceBetweenElements(predicate);
				predicate = CodeGenTaskingUtils
								.makeSingleSpaceBetweenElements(predicate);
///////	END REPLACE
				
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
						cDecl.setComponentName(smTranslationMgr.parentMachine
								.getName());
						cDecl.setProjectName(smTranslationMgr.parentProject
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

	private void makeVarDeclaration(
			VHDL_TranslationData smTranslationMgr,
			List<Declaration> tmpDeclarationList, Component component,
			ComponentInitialisation initialisation) {
		Declaration vDecl = Il1Factory.eINSTANCE.createVariableDecl();
		String initialisationString = initialisation.getAction();

//////// REPLACE With THIS
/////// 		initialisationString = new TranslatorUtils()
///////				.makeSingleSpaceBetweenElements(initialisationString);
		initialisationString = CodeGenTaskingUtils
								.makeSingleSpaceBetweenElements(initialisationString);
///////	END REPLACE	

		// Obtain the variable name from the first part
		// of the initialisation string.
		String variableName = initialisationString.split(" ")[0];
		variableName = variableName.trim();
		// set information for the declaration
		vDecl.setIdentifier(variableName);
		vDecl.setProjectName(smTranslationMgr.parentProject.getElementName());
		vDecl.setComponentName(smTranslationMgr.parentMachine.getName());
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
//////// REPLACE With THIS
/////// 		predicate = new TranslatorUtils()
///////				.makeSingleSpaceBetweenElements(predicate);
						predicate = CodeGenTaskingUtils
										.makeSingleSpaceBetweenElements(predicate);
		///////	END REPLACE			// if we found an invariant that starts with the varName
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
