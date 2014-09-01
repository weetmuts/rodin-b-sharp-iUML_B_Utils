package quickprint;

import java.io.IOException;
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
import org.eventb.codegen.il1.ConditionSet;
import org.eventb.codegen.il1.ConstantDecl;
import org.eventb.codegen.il1.ElseIf;
import org.eventb.codegen.il1.If;
import org.eventb.codegen.il1.Il1Package;
import org.eventb.codegen.il1.Parameter;
import org.eventb.codegen.il1.Seq;
import org.eventb.codegen.il1.Subroutine;
import org.eventb.codegen.il1.VariableDecl;

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

	//print from a supplied list list
	private void print(List<EObject> content) {
		// print info for this object

		for (EObject element : content) {
			print(element);
		}
	}

	// print from a supplied IL1 command
	private void print(EObject element) {
		if(element == null) return;
		EClass eClass = element.eClass();
		

		
		if (eClass == programClass) {
		}
		else if(eClass == vDeclClass){
			VariableDecl el = (VariableDecl) element;
			System.out.println( "VARIABLE " + el.getIdentifier() + " " + el.getType() + " := " + el.getInitialValue());
			return;
		}
		else if(eClass == cDeclClass){
			ConstantDecl el = (ConstantDecl) element;
			System.out.println( "CONSTANT " + el.getIdentifier() + " " + el.getType() + " := " + el.getInitialValue());
			return;
		}
		else if(eClass == subroutineClass){
			Subroutine el = (Subroutine) element;
			System.out.println("\nSUBROUTINE " + el.getName());
			print(el.getBody());
			return;
		}
		else if(eClass == paramClass){
			Parameter el = (Parameter) element;
			System.out.println("Parameter " + el.getIdentifier());
			return;
		}
		else if(eClass == guardClass){
			 ConditionSet el = (ConditionSet) element;
			 EList<String> conditions = el.getConditions();
			 System.out.println("Conditions");
			 for(String s : conditions){
				 System.out.println(" @Condition " + s);
			 }
			 return;
		}
		else if(eClass == caseStatementClass){
			CaseStatement el = (CaseStatement) element;
			System.out.println("WHEN " + el.getCaseValue());
			print(el.getCommand());
			return;
		}
		else if(eClass == actionClass){
			Action el = (Action) element;
			System.out.println(" @Action " + el.getAction() + ";");
			return;
		}
		else if(eClass == seqClass){
			Seq el = (Seq) element;
			print(el.getLeftBranch());
			print(el.getRightBranch());
			return;
		}
		else if(eClass == caseClass) {
			Case el = (Case) element;
			System.out.println("CASE " + el.getCaseExpression());
		}
		else if(eClass == ifClass){
			If el = (If) element;
			System.out.println("IF ");
			for(String s: el.getCondition()){
				System.out.println(" @Condition " + s);
			}
			print(el.getBody());
			print(el.getBranch());
			System.out.println("ELSE "); 
			print(el.getElse());
			return;
		}
		else if(eClass == elseIfClass){
			ElseIf el = (ElseIf) element;
			System.out.println("ELSIF ");
			for(String s: el.getCondition()){
				System.out.println(" @Condition " + s);
			}
		}
		else if(eClass == callClass){
			Call el = (Call) element;
			System.out.println("CALL " + el.getSubroutine().getName());
			return;
		}
		
		// pass on the List-Based children to print
		List<EObject> children = element.eContents();
		if (children != null) {
			print(children);
		}
	}
}
