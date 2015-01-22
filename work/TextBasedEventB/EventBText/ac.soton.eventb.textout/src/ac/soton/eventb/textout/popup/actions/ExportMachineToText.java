package ac.soton.eventb.textout.popup.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eventb.core.basis.ContextRoot;
import org.eventb.core.basis.MachineRoot;
import org.rodinp.core.IRodinElement;

import ac.soton.eventb.textout.core.ExportTextManager;

public class ExportMachineToText implements IObjectActionDelegate {

	public Shell shell;
	public IStructuredSelection selection;

	/**
	 * Constructor for Action1.
	 */
	public ExportMachineToText() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		// Handle the pop-up menu selection for text from Rodin
		// There should only be a single object selected
		Object object = selection.getFirstElement();
		try {
			 if (object.getClass() == MachineRoot.class ||
					 object.getClass() == ContextRoot.class ) {
				 IRodinElement rodinElement = (IRodinElement) object;
				 // Export the machine/context RodinElement
				ExportTextManager.export(rodinElement);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = (IStructuredSelection) selection;
	}

}
