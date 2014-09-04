package quickprint.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.internal.resources.File;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eventb.codegen.il1.Action;
import org.eventb.codegen.il1.Call;
import org.eventb.codegen.il1.Case;
import org.eventb.codegen.il1.CaseStatement;
import org.eventb.codegen.il1.Command;
import org.eventb.codegen.il1.ConditionSet;
import org.eventb.codegen.il1.ConstantDecl;
import org.eventb.codegen.il1.Declaration;
import org.eventb.codegen.il1.ElseIf;
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

import quickprint.Activator;
import ac.soton.eventb.emf.components.Connector;

@SuppressWarnings("restriction")
public class QuickPrinter {

	private EClass programClass = Il1Package.Literals.PROGRAM;
	private EClass vDeclClass = Il1Package.Literals.VARIABLE_DECL;
	private EClass cDeclClass = Il1Package.Literals.CONSTANT_DECL;
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
	
	public void useTemplates(Program program) throws Exception {
		this.program = program;
		// Create the Template Processor
		TemplateProcessor templateProcessor = TemplateProcessor.getDefault();
		// Initialise the template processor with the TARGET and SOURCE information.
		templateProcessor.setFileExtension(".vhdl");
		//also set vhdl language formatter at a later date
		
		templateProcessor.initialiseTarget(sourceRodinProject.getProject(),
				Activator.GENERATED_SRC_FOLDER);
		templateProcessor.initialiseSource(sourceRodinProject,
				Activator.TEMPLATES_SRC_FOLDER);
		// Get the processor to instantiate the 'Top-Level' template.
		// Templates contained 'within' are handled by the processor
		// and TemplateHelper. We can pass a data object to assist with the
		// translation, so we pass the actual source object, we could make this
		// more complex if necessary (and add constraints)
		GeneratorData generatorData = new GeneratorData();
		List<Object> generatorDataList = generatorData.getDataList();
		generatorDataList.add(program); // add data here
		templateProcessor.instantiateTemplate("testTemplate.vhdl", generatorData);
	}

	
	
	public void printSelection(IStructuredSelection selectionChanged)
			throws IOException {
		List<String> connectorNameList = getConnectorNameList();
		if(connectorNameList.size() == 0){
			System.out.println("\n--#### No Connectors identified => Signals not Identified.");
			System.out.println("--#### Run the VHDL generator to ensure they have been created.\n");
		}
		Iterator<?> iter = selectionChanged.iterator();
		while (iter.hasNext()) {
			Object item = iter.next();
			Class<? extends Object> itemClass = item.getClass();
			if (itemClass == File.class) {
				File source = (File) item;
				IPath fullPath = source.getFullPath();
				URI uri = URI.createPlatformResourceURI(fullPath.toString(),
						true);
				Resource resource = new XMLResourceFactoryImpl()
						.createResource(uri);
				resource.load(null);
				List<EObject> content = resource.getContents();
				printEobjectList(content);
			}
		}
	}

	// print from a supplied list list
	public void printEobjectList(List<EObject> content) {
		for (EObject element : content) {
			printEobject(element);
		}
	}

	// print from a supplied IL1 command
	private void printEobject(EObject element) {
		if (element == null)
			return;
		EClass eClass = element.eClass();

		if (eClass == programClass) {
			program = (Program) element;
			
			EList<Declaration> decls = program.getDecls();
			for (Declaration d : decls) {
				if (d.eClass() == vDeclClass) {
					doPrint((VariableDecl) d);
				} else if (d.eClass() == cDeclClass) {
					doPrint((ConstantDecl) d);
				}
			}
			List<Task> taskList = program.getTaskTypeTasks();
			for (Task t : taskList) {
				doPrint(t);
			}
			return;
		} else if (eClass == vDeclClass) {
			doPrint((VariableDecl) element);
			return;
		} else if (eClass == cDeclClass) {
			doPrint((ConstantDecl) element);
			return;
		} else if (eClass == subroutineClass) {
			doPrint((Subroutine) element);
			return;
		} else if (eClass == paramClass) {
			doPrint((Parameter) element);
			return;
		} else if (eClass == guardClass) {
			doPrint((ConditionSet) element);
			return;
		} else if (eClass == caseStatementClass) {
			doprint((CaseStatement) element);
			return;
		} else if (eClass == actionClass) {
			doPrint((Action) element);
			return;
		} else if (eClass == seqClass) {
			doPrint((Seq) element);
			return;
		} else if (eClass == caseClass) {
			doPrint((Case) element);
			return;
		} else if (eClass == ifClass) {
			doPrint((If) element);
			return;
		} else if (eClass == elseIfClass) {
			doPrint((ElseIf) element);
			return;
		} else if (eClass == callClass) {
			doPrint((Call) element);
			return;
		}

		// // pass on the List-Based children to print
		// List<EObject> children = element.eContents();
		// if (children != null) {
		// printEobjectList(children);
		// }
	}

	private void doPrint(Task t) {
		EList<Subroutine> subroutineList = t.getSubroutines();
		for (Subroutine s : subroutineList) {
			doPrint(s);
		}
	}

	private void doPrint(Call el) {
		System.out.println(" " + el.getSubroutine().getName() + ";");
	}

	private void doPrint(ElseIf el) {
		System.out.println("ELSIF ");
		boolean first = true;

		for (String s : el.getCondition()) {

			if (first) {
				first = false;
				System.out.println(" " + s);
			} else {
				System.out.println(" and " + s);
			}
		}
		System.out.println("THEN ");
		printEobject(el.getAction());
	}

	private void doPrint(If el) {
		System.out.println("IF ");
		boolean first = true;
		for (String s : el.getCondition()) {
			if (first) {
				first = false;
				System.out.println(" " + s);
			} else {
				System.out.println(" and " + s);
			}
		}
		System.out.println("THEN ");
		printEobject(el.getBody());
		printEobject(el.getBranch());
		System.out.println("ELSE ");
		printEobject(el.getElse());
		System.out.println("END IF;");
	}

	private void doPrint(Case el) {
		System.out.println("CASE " + el.getCaseExpression() + " IS ");
		List<CaseStatement> caseStatementEList = el.getCaseStatement();
		for (CaseStatement cs : caseStatementEList) {
			printEobject(cs);
		}
		System.out.println("END CASE;");
	}

	private void doPrint(Seq el) {
		printEobject(el.getLeftBranch());
		printEobject(el.getRightBranch());
	}

	private void doPrint(Action el) {
		List<String> connectorNameList = getConnectorNameList();
		String actionString = CodeGenTaskingUtils
				.makeSingleSpaceBetweenElements(el.getAction());

		String[] actionArray = actionString.split(" ");
		String varName = actionArray[2];
		// NOTE!!!
		// This only translates assignment to signal assignment
		// if the translator has been run since start up.
		// This is because the information necessary to print
		// it is only generated during translation.
		// We could add an attribute to the assignment
		// in a 'proper' translation.
		if (connectorNameList.contains(varName)) {
			actionArray[1] = " <= ";
			// recreate string
			String newString = "";
			for (int i = 0; i < actionArray.length; i++) {
				newString = newString + " " + actionArray[i];
			}
			System.out.println(newString + ";");
		} else {
			System.out.println(" " + el.getAction() + ";");
		}
	}

	private List<String> getConnectorNameList() {
		List<Connector> connectorList = QuickPrintInfo.getConns();
		List<String> connectorNamesList = new ArrayList<>();
		for (Connector c : connectorList) {
			connectorNamesList.add(c.getName().toLowerCase());
		}
		return connectorNamesList;
	}

	private void doprint(CaseStatement el) {
		System.out.println("WHEN " + el.getCaseValue() + " => ");
		Command command = el.getCommand();
		if (command == null) {
			System.out.println(" null ;");
		} else {
			printEobject(command);
		}
	}

	private void doPrint(ConditionSet el) {
		EList<String> conditions = el.getConditions();
		System.out.println("Conditions");
		for (String s : conditions) {
			System.out.println(" " + s);
		}
	}

	private void doPrint(Parameter el) {
		System.out.println("Parameter " + el.getIdentifier());
	}

	private void doPrint(Subroutine el) {
		String subroutineName = el.getName();
		String subroutineType;
		String paramString = "";

		if (subroutineName.equals("BeginCycle")) {
			subroutineType = "PROCESS";
			paramString = "(...)";
		} else {
			subroutineType = "PROCEDURE";
		}
		System.out.println("\n" + subroutineName + ": " + subroutineType
				+ paramString);
		System.out.println("BEGIN");
		printEobject(el.getBody());
		System.out
				.println("END " + subroutineType + " " + subroutineName + ";");
	}

	private void doPrint(ConstantDecl el) {
		System.out.println("CONSTANT " + el.getIdentifier() + ": "
				+ el.getType() + " := " + el.getInitialValue());
	}

	private void doPrint(VariableDecl el) {
		List<String> connectorNameList = getConnectorNameList();
		String declType;
		// If the list contains the variable ID then it is a signal.
		if(connectorNameList.contains(el.getIdentifier())){
			declType = "SIGNAL ";
		}
		else{
			declType = "VARIABLE ";
		}
		
		System.out.println(declType + el.getIdentifier() + ": "
				+ el.getType() + " := " + el.getInitialValue());
	}



	public void setTranslationManager(IRodinProject rodinProject) {
		this.sourceRodinProject = rodinProject;
	}
}
