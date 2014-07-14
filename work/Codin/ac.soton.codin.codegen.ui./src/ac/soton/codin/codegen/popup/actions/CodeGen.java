package ac.soton.codin.codegen.popup.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import ac.soton.codin.codegen.basic.CodinTranslator;

public class CodeGen implements IObjectActionDelegate {

	private IStructuredSelection selection = null;

	@Override
	public void run(IAction arg0) {
		// This method invokes the translation from Event-B to FMU Version 1.0
		CodinTranslator translator = new CodinTranslator();
		translator.translate(selection);
		// catch all the things that may go wrong


	}

	@Override
	public void selectionChanged(IAction arg0, ISelection selection) {
		this.selection = (IStructuredSelection) selection;
	}

	@Override
	public void setActivePart(IAction arg0, IWorkbenchPart arg1) {
		// TODO Auto-generated method stub

	}

}
