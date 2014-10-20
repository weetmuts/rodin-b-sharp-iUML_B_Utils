package ac.soton.codin.codegen.quickPrint;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eventb.codegen.il1.Action;
import org.eventb.codegen.il1.Call;
import org.eventb.codegen.il1.Case;
import org.eventb.codegen.il1.CaseStatement;
import org.eventb.codegen.il1.Command;
import org.eventb.codegen.il1.ConditionSet;
import org.eventb.codegen.il1.ConstantDecl;
import org.eventb.codegen.il1.Declaration;
import org.eventb.codegen.il1.ElseIf;
import org.eventb.codegen.il1.Enumeration;
import org.eventb.codegen.il1.If;
import org.eventb.codegen.il1.Il1Package;
import org.eventb.codegen.il1.Parameter;
import org.eventb.codegen.il1.Program;
import org.eventb.codegen.il1.Seq;
import org.eventb.codegen.il1.Subroutine;
import org.eventb.codegen.il1.Task;
import org.eventb.codegen.il1.VariableDecl;
import org.eventb.codegen.tasking.utils.CodeGenTaskingUtils;
import org.eventb.codegen.templates.GeneratorData;
import org.eventb.codegen.templates.util.TemplateProcessor;
import org.rodinp.core.IRodinProject;

import ac.soton.codin.codegen.basic.CodinTranslatorException;
import ac.soton.codin.codegen.basic.VHDL_TranslationData;
import ac.soton.codin.codegen.ui.CodinCGPlugin;
import ac.soton.eventb.emf.components.Component;
import ac.soton.eventb.emf.components.Connector;
import ac.soton.eventb.statemachines.Statemachine;

public class QuickPrinter {

	public static final String BeginCycleName = "BeginCycle";
	private EClass programClass = Il1Package.Literals.PROGRAM;
	private EClass vDeclClass = Il1Package.Literals.VARIABLE_DECL;
	private EClass cDeclClass = Il1Package.Literals.CONSTANT_DECL;
	private EClass eDeclClass = Il1Package.Literals.ENUMERATION;
	private EClass subroutineClass = Il1Package.Literals.SUBROUTINE;
	private EClass paramClass = Il1Package.Literals.PARAMETER;
	private EClass guardClass = Il1Package.Literals.CONDITION_SET;
	private EClass actionClass = Il1Package.Literals.ACTION;
	private EClass seqClass = Il1Package.Literals.SEQ;
	private EClass caseClass = Il1Package.Literals.CASE;
	private EClass caseStatementClass = Il1Package.Literals.CASE_STATEMENT;
	private EClass ifClass = Il1Package.Literals.IF;
	private EClass elseIfClass = Il1Package.Literals.ELSE_IF;
	private EClass callClass = Il1Package.Literals.CALL;
	private IRodinProject sourceRodinProject;
	private Program program;
	private static VHDL_TranslationData translationData;

	// Constructor used to initiate template build
	public QuickPrinter(VHDL_TranslationData translationData, Program program,
			IRodinProject rodinProject) {
		QuickPrinter.translationData = translationData;
		this.program = program;
		this.sourceRodinProject = rodinProject;
	}

	// constructor used to initiate print-only feature
	public QuickPrinter() {

	}

	public QuickPrinter(Program program) {
		this.program = program;
	}

	public void printToFile() throws Exception {
		// Create the Template Processor
		TemplateProcessor templateProcessor = TemplateProcessor.getDefault();
		// Initialise the template processor with the TARGET and SOURCE
		// information.
		templateProcessor.setFileExtension(CodinCGPlugin.VHDL_EXT);
		templateProcessor.setLanguage("VHDL");
		// also set vhdl language formatter at a later date

		templateProcessor.initialiseTarget(sourceRodinProject,
				CodinCGPlugin.GENERATED_SRC_FOLDER);
		templateProcessor.initialiseSource(sourceRodinProject,
				CodinCGPlugin.TEMPLATES_SRC_FOLDER);

		// Get the processor to instantiate the 'Top-Level' template.
		// Templates contained 'within' are handled by the processor
		// and TemplateHelper. We can pass a data object to assist with the
		// translation, so we pass the actual source object, we could make this
		// more complex if necessary (and add constraints)
		GeneratorData generatorData = new GeneratorData();
		List<Object> generatorDataList = generatorData.getDataList();
		generatorDataList.add(program); // add program data here
		generatorDataList.add(translationData);
		templateProcessor.instantiateTemplate("testTemplate." + CodinCGPlugin.VHDL_EXT,
				generatorData);
	}

	public List<String> printProgram() throws CodinTranslatorException {
		List<String> returnList = new ArrayList<String>();
		printEobject(program, returnList);
		return returnList;
	}

	// print from a supplied IL1 command
	public List<String> printEobject(EObject element, List<String> returnList) throws CodinTranslatorException {
		if (element == null)
			return returnList;
		EClass eClass = element.eClass();

		if (eClass == programClass) {
			program = (Program) element;
			EList<Declaration> decls = program.getDecls();
			for (Declaration d : decls) {
				if (d.eClass() == vDeclClass) {
					doPrint((VariableDecl) d, returnList);
				} else if (d.eClass() == cDeclClass) {
					doPrint((ConstantDecl) d, returnList);
				} else if (d.eClass() == eDeclClass) {
					doPrint((Enumeration) d, returnList);
				}
			}
			List<Task> taskList = program.getTaskTypeTasks();
			for (Task t : taskList) {
				doPrint(t, returnList);
			}
			return returnList;
		} else if (eClass == vDeclClass) {
			doPrint((VariableDecl) element, returnList);
			return returnList;
		} else if (eClass == cDeclClass) {
			doPrint((ConstantDecl) element, returnList);
			return returnList;
		} else if (eClass == subroutineClass) {
			doPrint((Subroutine) element, returnList);
			return returnList;
		} else if (eClass == paramClass) {
			doPrint((Parameter) element, returnList);
			return returnList;
		} else if (eClass == guardClass) {
			doPrint((ConditionSet) element, returnList);
			return returnList;
		} else if (eClass == caseStatementClass) {
			doprint((CaseStatement) element, returnList);
			return returnList;
		} else if (eClass == actionClass) {
			doPrint((Action) element, returnList);
			return returnList;
		} else if (eClass == seqClass) {
			doPrint((Seq) element, returnList);
			return returnList;
		} else if (eClass == caseClass) {
			doPrint((Case) element, returnList);
			return returnList;
		} else if (eClass == ifClass) {
			doPrint((If) element, returnList);
			return returnList;
		} else if (eClass == elseIfClass) {
			doPrint((ElseIf) element, returnList);
			return returnList;
		} else if (eClass == callClass) {
			doPrint_Inline((Call) element, returnList);
			return returnList;
		} else {
			return returnList;
		}
	}

	private void doPrint(Task t, List<String> returnList) throws CodinTranslatorException {
		EList<Subroutine> subroutineList = t.getSubroutines();
		for (Subroutine s : subroutineList) {
			doPrint(s, returnList);
		}
	}

	private void doPrint_Inline(Call el, List<String> returnList) throws CodinTranslatorException {
		// get the subroutine of the call;
		Subroutine calledSubroutine = el.getSubroutine();
		// store the program's subroutine definitions
		List<Subroutine> subroutineList = new ArrayList<Subroutine>();
		// add the program's mainEntry-level subroutines.
		// But most subroutines will be in the tasks.
		subroutineList.addAll(program.getSubroutines());
		// find the Subroutine of tasks
		EList<Task> taskList = program.getTaskTypeTasks();
		for (Task task : taskList) {
			subroutineList.addAll(task.getSubroutines());
		}
		// find the called subroutine implementation in the list
		Subroutine subroutineImpl = null;
		for (Subroutine s : subroutineList) {
			if (calledSubroutine.getName().equals(s.getName())) {
				subroutineImpl = s;
				break;
			}
		}

		if (isSMSubroutine(subroutineImpl)) {
			// call the synch stateMachine procedure
			returnList.add(subroutineImpl.getName() + ";");
		} else {
			Command body = subroutineImpl.getBody();
			printEobject(body, returnList);
		}
	}

	private void doPrint(If el, List<String> returnList) throws CodinTranslatorException {
		String eventName = translationData.branchEventMap.get(el);
		returnList.add("IF "+"\t\t-- "+eventName);		
		boolean first = true;
		for (String s : el.getCondition()) {
			s = resolvePredicate(s);
			if (first) {
				first = false;
				returnList.add(" " + s);
			} else {
				returnList.add(" and " + s);
			}
		}
		returnList.add("THEN ");
		printEobject(el.getBody(), returnList);
		printEobject(el.getBranch(), returnList);
		Command elseCommand = el.getElse();
		if(elseCommand != null){
			returnList.add("ELSE ");
			printEobject(elseCommand, returnList);
		}
		returnList.add("END IF;");
	}

	private void doPrint(ElseIf el, List<String> returnList) throws CodinTranslatorException {
		String eventName = translationData.subBranchEventMap.get(el);

		returnList.add("ELSIF "+"\t\t-- "+eventName);
		boolean first = true;

		for (String s : el.getCondition()) {
			s = resolvePredicate(s);
			if (first) {
				first = false;
				returnList.add(" " + s);
			} else {
				returnList.add(" and " + s);
			}
		}
		returnList.add("THEN ");
		printEobject(el.getAction(), returnList);

		ElseIf subBranch = el.getBranch();
		if (subBranch != null) {
			doPrint(subBranch, returnList);
		}
	}

	private void doPrint(Case el, List<String> returnList) throws CodinTranslatorException {
		returnList.add("CASE " + el.getCaseExpression() + " IS ");
		List<CaseStatement> caseStatementEList = el.getCaseStatement();
		for (CaseStatement cs : caseStatementEList) {
			printEobject(cs, returnList);
		}
		returnList.add("END CASE;");
	}

	private void doPrint(Seq el, List<String> returnList ) throws CodinTranslatorException {
		printEobject(el.getLeftBranch(), returnList);
		printEobject(el.getRightBranch(), returnList);
	}

	private void doPrint(Action el, List<String> returnList) {
		String actionString = CodeGenTaskingUtils
				.makeSingleSpaceBetweenElements(el.getAction());
		String[] actionArray = actionString.split(" ");
		if (actionAssignsToSignal(el)) {
			actionArray[1] = " <= ";
			// if it is std_logic type then add quotes to
			// what we assume is an integer literal.
			// more complex expressions will have to be
			// handled differently.
			if (actionAssignsToStdLogic(el)) {
				actionArray[2] = "'" + actionArray[2] + "'";
			}
			// recreate string
			String newString = "";
			for (int i = 0; i < actionArray.length; i++) {
				newString = newString + " " + actionArray[i];
			}
			returnList.add(newString + ";");
		}

		else {
			returnList.add(" " + el.getAction() + ";");
		}
	}

	private void doprint(CaseStatement el, List<String> returnList) throws CodinTranslatorException {
		returnList.add("WHEN " + el.getCaseValue() + " => ");
		Command command = el.getCommand();
		if (command == null) {
			returnList.add(" null ;");
		} else {
			printEobject(command, returnList);
		}
	}

	private void doPrint(ConditionSet el, List<String> returnList) {
		EList<String> conditions = el.getConditions();
		returnList.add("Conditions");
		for (String s : conditions) {
			returnList.add(" " + s);
		}
	}

	private void doPrint(Parameter el, List<String> returnList) {
		returnList.add("Parameter " + el.getIdentifier());
	}

	private void doPrint(Subroutine el, List<String> returnList) throws CodinTranslatorException {

		String subroutineName = el.getName();
		String subroutineType;
		String paramString = "";

		// if the subroutine is a state machine implementation
		// then it is mapped to a procedure.
		
		// We split the synchSM procedures and processSM,
		// storing the synchSM procedures for later insertion into
		// the declarative part of 'the' main-cycle process.
		// There is just one cycle process! 
		if (isSMSubroutine(el)) {
			subroutineType = "PROCEDURE";
			List<String> tmpCodeList = new ArrayList<String>();
			tmpCodeList.add("\n"+ subroutineType + " " + subroutineName + " IS ");
			tmpCodeList.add("BEGIN");
			printEobject(el.getBody(),tmpCodeList);
			tmpCodeList.add("END " + subroutineType + " " + subroutineName + ";");
			translationData.storedSynchSMTranslations.put(subroutineName, tmpCodeList);
		}
		// else if it is the process SM entry then it is process
		else if (subroutineName.equals(BeginCycleName)) {
			returnList.add("\nbegin");
			subroutineType = "PROCESS";
			paramString = "(" + makeSensitivityList() + ")";
			// create the process header
			returnList.add("\n" + subroutineName + ": " + subroutineType
					 + paramString + " IS ");
			// add a declarative part which contains the synchSM procedures
			Map<String, List<String>> storedCodeMap = translationData.storedSynchSMTranslations;
			Set<String> procedureNames =  storedCodeMap.keySet();
			for(String procedureName: procedureNames){
				List<String> codeListing = storedCodeMap.get(procedureName);
				for(String line: codeListing){
					returnList.add(line);
				}
				returnList.add("");
			}
			returnList.add("BEGIN");
			printEobject(el.getBody(), returnList);
			returnList.add("END " + subroutineType + " " + subroutineName + ";");
		}
		// else return since the other subroutines should be in-lined
		else {
			return;
		}
	}

	private void doPrint(ConstantDecl el, List<String> returnList) {
		String constantType = el.getType();
		if (constantType.equals(CodeGenTaskingUtils.INT_SYMBOL)) {
			constantType = "Integer";
		} else if (constantType.equals(CodeGenTaskingUtils.BOOL_SYMBOL)) {
			constantType = "Boolean";
		}
		returnList.add("CONSTANT " + el.getIdentifier() + ": " + constantType
				+ " := " + el.getInitialValue() + ";");
	}

	private void doPrint(Enumeration el, List<String> returnList) {
		boolean first = true;
		String tmpStr = "TYPE " + el.getIdentifier() + " IS (";
		for (String str : el.getLiteralValues()) {
			if (first) {
				tmpStr = tmpStr + str;
				first = false;
			} else {
				tmpStr = tmpStr + ", " + str;
			}
		}
		tmpStr = tmpStr + ");";
		returnList.add(tmpStr);
	}

	private void doPrint(VariableDecl el, List<String> returnList) throws CodinTranslatorException {
		List<String> synchSMNames = translationData.quickPrintInfo
				.getSynchSMNamesList();
		List<String> signalNameList = translationData.quickPrintInfo
				.getSignalNamesList();
		List<String> connectorNamesList = translationData.quickPrintInfo
				.getConnectorNameList();
		String assignmentOperator = " := ";
		String initialValue = el.getInitialValue();
		String variableType = el.getType();
		String declarationType = null;
		
		String variableName = el.getIdentifier();
		if(connectorNamesList.contains(variableName)){
			// IF the variable is a connector ignore it
			return;
		}
		// else IF the variable is a signal ...
		else if (signalNameList.contains(variableName)) {
			if(variableType == null){
				throw new CodinTranslatorException("No type for variable: "+ variableName +". Check Typing invariant");
			}
			declarationType = "SIGNAL ";
			assignmentOperator = " := ";
			if (variableType.equals(CodeGenTaskingUtils.INT_SYMBOL)) {
				variableType = "Integer";
			} else if (variableType.equals(CodeGenTaskingUtils.BOOL_SYMBOL)) {
				variableType = "std_logic";
				translationData.quickPrintInfo.getStdLogicNamesList().add(
						variableName);
				if (initialValue.equals("true")) {
					initialValue = "'1'";
				} else {
					initialValue = "'0'";
				}
			}
		}
		// ELSE if the variable is a state-machine program counter
		// (i.e. with the same name as the state-machine itself)...
		else if (synchSMNames.contains(variableName)) {
			declarationType = "SIGNAL ";
			assignmentOperator = " := ";
		} else {
			declarationType = "VARIABLE ";
			if (variableType.equals(CodeGenTaskingUtils.INT_SYMBOL)) {
				variableType = "Integer";
			} else if (variableType.equals(CodeGenTaskingUtils.BOOL_SYMBOL)) {
				variableType = "Boolean";
			}
		}
		returnList.add(declarationType + variableName + ": " + variableType
				+ assignmentOperator + initialValue + ";");
	}

	// If a signal is being assigned to, on the RHS
	// of an expression, return true.
	private boolean actionAssignsToSignal(Action el) {
		List<String> signalNamesList = translationData.quickPrintInfo
				.getSignalNamesList();
		String actionString = CodeGenTaskingUtils
				.makeSingleSpaceBetweenElements(el.getAction());
		String[] actionArray = actionString.split(" ");
		String varName = "";
		if (actionArray.length >= 2) {
			varName = actionArray[0];
		}
		return signalNamesList.contains(varName);
	}

	// If action is of type std_logic return true.
	private boolean actionAssignsToStdLogic(Action el) {
		List<String> stdLogicNamesList = translationData.quickPrintInfo
				.getStdLogicNamesList();
		String actionString = CodeGenTaskingUtils
				.makeSingleSpaceBetweenElements(el.getAction());
		String[] actionArray = actionString.split(" ");
		String varName = "";
		if (actionArray.length >= 2) {
			varName = actionArray[0];
		}
		return stdLogicNamesList.contains(varName);
	}

	// If a predicate refers to a std_logic then booleans literals true/false
	// are mapped to '0' and '1'. It is more complex than an action since
	// predicate can be more complex. So:
	// std_log1 = true or false = std_log2 and aVar = true or std_log1 /=
	// std_log2
	// maps to
	// std_log1 = '1' or std_log2 = '0' and aVar = true or std_log1 /= std_log2
	// Where aVar is a variable. Note eventB ordering is not implied.
	private String resolvePredicate(String predicate) {
		String resolvedPredicate = "";
		String predString = CodeGenTaskingUtils
				.makeSingleSpaceBetweenElements(predicate);
		String[] predArray = predString.split(" ");
		// find the locations of the literals
		for (int i = 1; i < predArray.length; i++) {
			String s = predArray[i];
			// if it is a 'true' literal
			if (s.equals(CodinCGPlugin.TRUE_LITERAL_STRING)) {
				// look to the left. If it is an equality/inequality
				// look to the left again. If this a varNmae of type std_logic
				// then change true to '1'
				if (CodinCGPlugin.stdLogicPredOpsList
						.contains(predArray[i - 1])) {
					String leftString = predArray[i - 2];
					List<String> stdLogicNamesList = translationData.quickPrintInfo
							.getStdLogicNamesList();
					if (stdLogicNamesList.contains(leftString)) {
						predArray[i] = "'1'";
					}
				}
				// do the same but looking right of the literal
				else if (CodinCGPlugin.stdLogicPredOpsList
						.contains(predArray[i + 1])) {
					String rightString = predArray[i + 2];
					List<String> stdLogicNamesList = translationData.quickPrintInfo
							.getStdLogicNamesList();
					if (stdLogicNamesList.contains(rightString)) {
						predArray[i] = "'1'";
						// we've sorted [i + 2] so increment i by 2
						// and let the for-loop do another increment
						i = i + 2;
					}
				}
			}
			// else if it is false
			else if (s.equals(CodinCGPlugin.FALSE_LITERAL_STRING)) {
				// look to the left. If it is an equality/inequality
				// look to the left again. If this a varNmae of type std_logic
				// then change false to '0'
				if (CodinCGPlugin.stdLogicPredOpsList
						.contains(predArray[i - 1])) {
					String leftString = predArray[i - 2];
					List<String> stdLogicNamesList = translationData.quickPrintInfo
							.getStdLogicNamesList();
					if (stdLogicNamesList.contains(leftString)) {
						predArray[i] = "'0'";
					}
				}
				// do the same but looking right of the literal
				else if (CodinCGPlugin.stdLogicPredOpsList
						.contains(predArray[i + 1])) {
					String rightString = predArray[i + 2];
					List<String> stdLogicNamesList = translationData.quickPrintInfo
							.getStdLogicNamesList();
					if (stdLogicNamesList.contains(rightString)) {
						predArray[i] = "'0'";
						// we've sorted [i + 2] so increment i by 2
						// and let the for-loop do another increment
						i = i + 2;
					}
				}
			}
		}
		// recreate the predicate
		for (int i = 0; i < predArray.length; i++) {
			resolvedPredicate = resolvedPredicate + " " + predArray[i];
		}
		return resolvedPredicate;
	}

	private boolean isSMSubroutine(Subroutine subroutineImpl) {
		// returns true if the subroutine is in the list of
		// synchronous state machines, by name.
		// get the list of synchronous state machines
		ArrayList<String> synchSMNamesList = new ArrayList<String>();
		for (Statemachine s : translationData.synchSMList) {
			synchSMNamesList.add(s.getName());
		}
		// if the subroutine is a synch stateMachine call,
		boolean hasSynchSMName = synchSMNamesList.contains(subroutineImpl
				.getName().replace("do_", ""));
		return hasSynchSMName;
	}

	private String makeSensitivityList() {
		Component currentComponent = translationData.currentComponent;
		EList<Connector> inConnectorList = currentComponent.getInConnectors();
		// flatten the sensitivity list
		String sensitivityList = "";
		boolean first = true;
		for (Connector s : inConnectorList) {
			// The convention is to have a lower-case version of
			// the Connector name, for the signal.
			String name = s.getName().toLowerCase();
			if (!first) {
				sensitivityList = sensitivityList + ", " + name;
			} else {
				first = false;
				sensitivityList = name;
			}

		}
		return sensitivityList;
	}
}
