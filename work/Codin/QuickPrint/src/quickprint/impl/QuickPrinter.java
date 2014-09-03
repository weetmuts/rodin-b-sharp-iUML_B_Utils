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
import org.eventb.codegen.il1.ElseIf;
import org.eventb.codegen.il1.If;
import org.eventb.codegen.il1.Il1Package;
import org.eventb.codegen.il1.Parameter;
import org.eventb.codegen.il1.Seq;
import org.eventb.codegen.il1.Subroutine;
import org.eventb.codegen.il1.VariableDecl;

import quickprint.util.QuickPrintInfo;

import ac.soton.codin.codegen.basic.TranslatorUtils;
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

	public void printElements(IStructuredSelection selectionChanged)
			throws IOException {
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
				print(content);
			}
		}
	}

	// print from a supplied list list
	private void print(List<EObject> content) {
		for (EObject element : content) {
			print(element);
		}
	}

	// print from a supplied IL1 command
	private void print(EObject element) {
		if (element == null)
			return;
		EClass eClass = element.eClass();

		if (eClass == programClass) {
		} else if (eClass == vDeclClass) {
			VariableDecl el = (VariableDecl) element;
			System.out.println("VARIABLE " + el.getIdentifier() + " "
					+ el.getType() + " := " + el.getInitialValue());
			return;
		} else if (eClass == cDeclClass) {
			ConstantDecl el = (ConstantDecl) element;
			System.out.println("CONSTANT " + el.getIdentifier() + " "
					+ el.getType() + " := " + el.getInitialValue());
			return;
		} else if (eClass == subroutineClass) {
			Subroutine el = (Subroutine) element;
			String subroutineName = el.getName();
			String subroutineType ;
			String paramString = "";

			if(subroutineName.equals("BeginCycle")){
				subroutineType = "PROCESS";
				paramString = "(...)";
			}
			else{
				subroutineType = "PROCEDURE";
			}
			System.out.println("\n" + subroutineName + ": " + subroutineType + paramString);
			System.out.println("BEGIN");
			print(el.getBody());
			System.out.println("END " + subroutineType + " " + subroutineName + ";");
			return;
		} else if (eClass == paramClass) {
			Parameter el = (Parameter) element;
			System.out.println("Parameter " + el.getIdentifier());
			return;
		} else if (eClass == guardClass) {
			ConditionSet el = (ConditionSet) element;
			EList<String> conditions = el.getConditions();
			System.out.println("Conditions");
			for (String s : conditions) {
				System.out.println(" @Condition " + s);
			}
			return;
		} else if (eClass == caseStatementClass) {
			CaseStatement el = (CaseStatement) element;
			System.out.println("WHEN " + el.getCaseValue() + " => ");
			Command command = el.getCommand();
			if(command == null){
				System.out.println(" @Action null ;");
			}
			else{
				print(command);
			}
			return;
		} else if (eClass == actionClass) {
			Action el = (Action) element;
			List<Connector> connectorList = QuickPrintInfo.getConns();
			List<String> connectorNamesList = new ArrayList<>();
			for (Connector c : connectorList) {
				connectorNamesList.add(c.getName().toLowerCase());
			}
			String actionString = new TranslatorUtils()
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
			if(connectorNamesList.contains(varName)){
				actionArray[1] = " <= ";
				// recreate string
				String newString = "";
				for(int i = 0; i<actionArray.length; i++){
					newString = newString + " " + actionArray[i];
				}
				System.out.println(" @Action " + newString + ";");
			}
			else{
				System.out.println(" @Action " + el.getAction() + ";");
			}
			return;
		} else if (eClass == seqClass) {
			Seq el = (Seq) element;
			print(el.getLeftBranch());
			print(el.getRightBranch());
			return;
		} else if (eClass == caseClass) {
			Case el = (Case) element;
			System.out.println("CASE " + el.getCaseExpression() + " IS ");
			List<CaseStatement> caseStatementEList = el.getCaseStatement();
			for(CaseStatement cs: caseStatementEList){
				print(cs);
			}
			System.out.println("END CASE;");
			return;
		} else if (eClass == ifClass) {
			If el = (If) element;
			System.out.println("IF ");
			for (String s : el.getCondition()) {
				System.out.println(" @Condition " + s);
			}
			System.out.println("THEN ");
			print(el.getBody());
			print(el.getBranch());
			System.out.println("ELSE ");
			print(el.getElse());
			System.out.println("END IF;");
			return;
		} else if (eClass == elseIfClass) {
			ElseIf el = (ElseIf) element;
			System.out.println("ELSIF ");
			for (String s : el.getCondition()) {
				System.out.println(" @Condition " + s);
			}
			System.out.println("THEN ");
		} else if (eClass == callClass) {
			Call el = (Call) element;
			System.out.println(" @Call " + el.getSubroutine().getName() + ";");
			return;
		}

		// pass on the List-Based children to print
		List<EObject> children = element.eContents();
		if (children != null) {
			print(children);
		}
	}
}
