package ac.soton.codin.codegen.basic;

import static org.eventb.codegen.tasking.utils.CodeGenTaskingUtils.ASSIGNMENT_ELEMENT_IN;
import static org.eventb.codegen.tasking.utils.CodeGenTaskingUtils.ASSIGNMENT_SYMBOL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eventb.codegen.il1.Declaration;
import org.eventb.codegen.il1.Il1Factory;
import org.eventb.codegen.il1.Program;
import org.eventb.codegen.tasking.utils.CodeGenTaskingUtils;

import ac.soton.eventb.emf.components.Component;
import ac.soton.eventb.emf.components.ComponentInitialisation;
import ac.soton.eventb.emf.components.ComponentInvariant;

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

	public void run(StateMachineTranslationData smTranslationMgr) {
		this.program = smTranslationMgr.program;
		List<Declaration> tmpDeclarationList = new ArrayList<>();
		// get the variables from the top-level and components.
		for (Component component : smTranslationMgr.componentList) {
			List<ComponentInitialisation> initialisationsList = component
					.getInitialisations();
			for (ComponentInitialisation initialisation : initialisationsList) {
				Declaration decl = Il1Factory.eINSTANCE.createVariableDecl();
				String initialisationString = initialisation.getAction();
				initialisationString = makeSingleSpaceBetweenElements(initialisationString);
				// Obtain the  variable name from the first part
				// of the initialisation string.
				String variableName = initialisationString.split(" ")[0];
				variableName = variableName.trim();
				// set information for the declaration
				decl.setIdentifier(variableName);
				decl.setProjectName(smTranslationMgr.parentProject.getElementName());
				decl.setComponentName(smTranslationMgr.parentMachine.getName());
				// Get the initialisation part
				boolean hasDetAssignment = initialisationString
						.startsWith(variableName + " " + ASSIGNMENT_SYMBOL);
				boolean hasNonDetAssignment = initialisationString
						.startsWith(variableName + " " + ASSIGNMENT_ELEMENT_IN);
				
				if (initialisationString.startsWith(variableName + " ")
						|| hasDetAssignment || hasNonDetAssignment) {
					String[] aInit = null;
					// split the initialisation in the appropriate place.
					if (hasDetAssignment) {
						aInit = initialisationString.split(ASSIGNMENT_SYMBOL);
					} else if (hasNonDetAssignment) {
						aInit = initialisationString
								.split(ASSIGNMENT_ELEMENT_IN);
					}
					// set the initial value.
					if (aInit != null && aInit.length > 1) {
						decl.setInitialValue(aInit[1].trim());
					}
				}
				// add this declaration to the tmp list of declarations 
				if (decl != null) {
					tmpDeclarationList.add(decl);
				}

				// Finished the initialisation part. Now add the type info.
				List<ComponentInvariant> invariantList = component.getInvariants();
				for(ComponentInvariant invariant: invariantList){
					String predicate = invariant.getPredicate();
					predicate = makeSingleSpaceBetweenElements(predicate.trim());
					// if we found an invariant that starts with the varName
					// lets see if it has is a typing expression
					if(predicate.startsWith(variableName)){
						String[] wordArray = predicate.split(" ");
												
						List<String> wordList = Arrays.asList(wordArray);
						if(wordList.contains(CodeGenTaskingUtils.ELEMENT_OF)){
							// we have found a typing predicate for this initialisation
							// and the type is at index 2 of the wordList
							decl.setType(wordList.get(2));
							// quit the invariant search loop.
							break;
						}
					}
				}
			}
		}
		// Add the new list to the existing list of declarations.
		program.getDecls().addAll(tmpDeclarationList);
	}

	public String makeSingleSpaceBetweenElements(String predIn) {
		// first remove spaces
		predIn = predIn.replace(" ", "");
		String pred = "";
		boolean lastNormal = true;
		for (char c : predIn.toCharArray()) {
			boolean currentNormal = ((c >= 'a' && c <= 'z')
					|| (c >= 'A' && c <= 'Z') || c == ' ' || c == '_' || (c >= '0' && c <= '9' || CodeGenTaskingUtils.INT_SYMBOL.equals(""+c)));
			 
			if (lastNormal && currentNormal) { // do nothing special
			} else if (lastNormal && !currentNormal) { // add a space
				pred += ' ';
			} else if (!lastNormal && currentNormal) { // add a space
				pred += ' ';
			} else if (!lastNormal && !currentNormal) { // do nothing special
			}
			lastNormal = currentNormal;
			pred += c;
		}
		return pred;
	}
}
