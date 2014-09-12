package ac.soton.codin.codegen.quickPrint;

import java.util.ArrayList;
import java.util.List;

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

import ac.soton.codin.codegen.basic.VHDL_TranslationData;
import ac.soton.codin.codegen.ui.CodinCGPlugin;
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
	private List<String> returnList = new ArrayList<>();
	private static VHDL_TranslationData translationData;
	
	// Constructor used to initiate template build
	public QuickPrinter(VHDL_TranslationData translationData, Program program, IRodinProject rodinProject) {
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

	public void useTemplates() throws Exception {
		// Create the Template Processor
		TemplateProcessor templateProcessor = TemplateProcessor.getDefault();
		// Initialise the template processor with the TARGET and SOURCE information.
		templateProcessor.setFileExtension(".vhdl");
		//also set vhdl language formatter at a later date
		
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
		templateProcessor.instantiateTemplate("testTemplate.vhdl", generatorData);
	}
	
	public List<String> printProgram(){
		printEobject(program);
		return returnList;
	}
	
	// print from a supplied IL1 command
	public List<String> printEobject(EObject element) {
		if (element == null)
			return returnList;
		EClass eClass = element.eClass();

		if (eClass == programClass) {
			program = (Program) element;
			EList<Declaration> decls = program.getDecls();
			for (Declaration d : decls) {
				if (d.eClass() == vDeclClass) {
					doPrint((VariableDecl) d);
				} else if (d.eClass() == cDeclClass) {
					doPrint((ConstantDecl) d);
				} else if (d.eClass() == eDeclClass){
					doPrint((Enumeration) d);
				}
			}
			List<Task> taskList = program.getTaskTypeTasks();
			for (Task t : taskList) {
				doPrint(t);
			}
			return returnList;
		} else if (eClass == vDeclClass) {
			doPrint((VariableDecl) element);
			return returnList;
		} else if (eClass == cDeclClass) {
			doPrint((ConstantDecl) element);
			return returnList;
		} else if (eClass == subroutineClass) {
			doPrint((Subroutine) element);
			return returnList;
		} else if (eClass == paramClass) {
			doPrint((Parameter) element);
			return returnList;
		} else if (eClass == guardClass) {
			doPrint((ConditionSet) element);
			return returnList;
		} else if (eClass == caseStatementClass) {
			doprint((CaseStatement) element);
			return returnList;
		} else if (eClass == actionClass) {
			doPrint((Action) element);
			return returnList;
		} else if (eClass == seqClass) {
			doPrint((Seq) element);
			return returnList;
		} else if (eClass == caseClass) {
			doPrint((Case) element);
			return returnList;
		} else if (eClass == ifClass) {
			doPrint((If) element);
			return returnList;
		} else if (eClass == elseIfClass) {
			doPrint((ElseIf) element);
			return returnList;
		} else if (eClass == callClass) {
//			doPrint((Call) element);
			doPrint_Inline((Call) element);
			return returnList;
		}
		else{
			return returnList;
		}
	}


	private void doPrint(Task t) {
		EList<Subroutine> subroutineList = t.getSubroutines();
		for (Subroutine s : subroutineList) {
			doPrint(s);
		}
	}

	
	private void doPrint_Inline(Call el) {
		// get the subroutine of the call;
		Subroutine calledSubroutine = el.getSubroutine();
		// store the program's subroutine definitions
		List<Subroutine> subroutineList = new ArrayList<>();
		// add the program's mainEntry-level subroutines.
		// But most subroutines will be in the tasks.
		subroutineList.addAll(program.getSubroutines());
		// find the Subroutine of tasks
		EList<Task> taskList = program.getTaskTypeTasks();
		for(Task task: taskList){
			subroutineList.addAll(task.getSubroutines());
		}
		// find the called subroutine implementation in the list
		Subroutine subroutineImpl = null;
		for(Subroutine s: subroutineList){
			if(calledSubroutine.getName().equals(s.getName())){
				subroutineImpl = s;
				break;
			}
		}

		if(isSMSubroutine(subroutineImpl)){
			// call the synch stateMachine procedure
			returnList.add(subroutineImpl.getName()+";");
		}
		else{
			Command body = subroutineImpl.getBody();
			printEobject(body);
		}
	}

	private boolean isSMSubroutine(Subroutine subroutineImpl) {
		// returns true if the subroutine is in the list of 
		// synchronous state machines, by name.
		// get the list of synchronous state machines
		ArrayList<String> synchSMNamesList = new ArrayList<>();
		for(Statemachine s: translationData.synchSMList){
			synchSMNamesList.add(s.getName());
		}
		// if the subroutine is a synch stateMachine call,
		boolean hasSynchSMName = synchSMNamesList.contains(subroutineImpl.getName());
		return hasSynchSMName;
	}

	
	private void doPrint(ElseIf el) {
		returnList.add("ELSIF ");
		boolean first = true;

		for (String s : el.getCondition()) {
			if (first) {
				first = false;
				returnList.add(" " + s);
			} else {
				returnList.add(" and " + s);
			}
		}
		returnList.add("THEN ");
		printEobject(el.getAction());
		
		ElseIf subBranch = el.getBranch();
		if(subBranch != null){
			doPrint(subBranch);
		}
	}

	private void doPrint(If el) {
		returnList.add("IF ");
		boolean first = true;
		for (String s : el.getCondition()) {
			if (first) {
				first = false;
				returnList.add(" " + s);
			} else {
				returnList.add(" and " + s);
			}
		}
		returnList.add("THEN ");
		printEobject(el.getBody());
		printEobject(el.getBranch());
		returnList.add("ELSE ");
		printEobject(el.getElse());
		returnList.add("END IF;");
	}

	private void doPrint(Case el) {
		returnList.add("CASE " + el.getCaseExpression() + " IS ");
		List<CaseStatement> caseStatementEList = el.getCaseStatement();
		for (CaseStatement cs : caseStatementEList) {
			printEobject(cs);
		}
		returnList.add("END CASE;");
	}

	private void doPrint(Seq el) {
		printEobject(el.getLeftBranch());
		printEobject(el.getRightBranch());
	}

	private void doPrint(Action el) {
		List<String> connectorNameList = translationData.quickPrintInfo.getConnectorNameList();
		String actionString = CodeGenTaskingUtils
				.makeSingleSpaceBetweenElements(el.getAction());

		String[] actionArray = actionString.split(" ");
		String varName = "";
		if(actionArray.length >= 2){
			varName = actionArray[0];
		}
		if (connectorNameList.contains(varName)) {
			actionArray[1] = " <= ";
			// recreate string
			String newString = "";
			for (int i = 0; i < actionArray.length; i++) {
				newString = newString + " " + actionArray[i];
			}
			returnList.add(newString + ";");
		} else {
			returnList.add(" " + el.getAction() + ";");
		}
	}

	private void doprint(CaseStatement el) {
		returnList.add("WHEN " + el.getCaseValue() + " => ");
		Command command = el.getCommand();
		if (command == null) {
			returnList.add(" null ;");
		} else {
			printEobject(command);
		}
	}

	private void doPrint(ConditionSet el) {
		EList<String> conditions = el.getConditions();
		returnList.add("Conditions");
		for (String s : conditions) {
			returnList.add(" " + s);
		}
	}

	private void doPrint(Parameter el) {
		returnList.add("Parameter " + el.getIdentifier());
	}

	private void doPrint(Subroutine el) {
		
		String subroutineName = el.getName();
		String subroutineType;
		String paramString = "";

		// if the subroutine is a state machine implementation
		// then it a procedure.
		if(isSMSubroutine(el)){
			subroutineType = "PROCEDURE";
		}
		// else if it is the process SM entry then it is process
		else if (subroutineName.equals(BeginCycleName)) {
			subroutineType = "PROCESS";
			paramString = "(...)";
		}
		// else return since the other subroutines should be in-lined
		else {
			return;
		}
		returnList.add("\n" + subroutineName + ": " + subroutineType
				+ paramString);
		returnList.add("BEGIN");
		printEobject(el.getBody());
		returnList.add("END " + subroutineType + " " + subroutineName + ";");
	}

	private void doPrint(ConstantDecl el) {
		String constantType = el.getType();
		if(constantType.equals(CodeGenTaskingUtils.INT_SYMBOL)){
			constantType = "Integer";
		}
		else if(constantType.equals(CodeGenTaskingUtils.BOOL_SYMBOL)){
			constantType = "Boolean";
		}
		returnList.add("CONSTANT " + el.getIdentifier() + ": "
				+ constantType + " := " + el.getInitialValue());
	}

	private void doPrint(Enumeration el) {
		boolean first = true;
		String tmpStr = "TYPE " + el.getIdentifier() + " IS (";
		for(String str: el.getLiteralValues()){
			if(first){
				tmpStr = tmpStr + str;
				first = false;
			}
			else{
				tmpStr = tmpStr + ", " + str;
			}
		}
		tmpStr = tmpStr + ");";
		returnList.add(tmpStr);
	}
	
	private void doPrint(VariableDecl el) {
		List<String> connectorNameList = translationData.quickPrintInfo.getConnectorNameList();
		List<String> synchSMNames = translationData.quickPrintInfo.getSynchSMNamesList();
		String assignmentOperator = " := ";
		String initialValue = el.getInitialValue();
		String variableType = el.getType();
		String declarationType = null;
		// If the list contains the variable ID then it is a signal.
		if(connectorNameList.contains(el.getIdentifier())){
			declarationType = "SIGNAL ";
			assignmentOperator = " <= ";
			if(variableType.equals(CodeGenTaskingUtils.INT_SYMBOL)){
				variableType = "Integer";
			}
			else if(variableType.equals(CodeGenTaskingUtils.BOOL_SYMBOL)){
				variableType = "std_logic_signal";
				if(initialValue.equals("true")){
					initialValue = "1";
				}
				else{ initialValue = "0";}
			}
		}
		// else if the variable is a state-machine program counter
		// (i.e. with the same name as the state-machine itself)
		else if(synchSMNames.contains(el.getIdentifier()) 
		//		||synchSMNames.contains(el.getIdentifier().replace("init_", ""))
				){
			declarationType = "SIGNAL ";
			assignmentOperator = " <= ";
		}
		else{
			declarationType = "VARIABLE ";
			if(variableType.equals(CodeGenTaskingUtils.INT_SYMBOL)){
				variableType = "Integer";
			}
			else if(variableType.equals(CodeGenTaskingUtils.BOOL_SYMBOL)){
				variableType = "Boolean";
			}
		}
		returnList.add(declarationType + el.getIdentifier() + ": "
				+ variableType + assignmentOperator + initialValue);
	}
}
