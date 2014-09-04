package ac.soton.codin.codegen.popup.actions;

import java.io.IOException;
import java.net.URISyntaxException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eventb.codegen.tasking.TaskingTranslationException;
import org.osgi.service.prefs.BackingStoreException;

import ac.soton.codin.codegen.basic.CodinTranslator;
import ac.soton.codin.codegen.basic.CodinTranslatorException;
import ac.soton.codin.codegen.ui.CodinCGPlugin;

public class CodinCGAction implements IObjectActionDelegate {

	private IStructuredSelection selection = null;

	@Override
	public void run(IAction arg0) {
		// This method invokes the translation from Event-B to FMU Version 1.0
		CodinTranslator translator = new CodinTranslator();
		try {
			translator.translate(selection);
		} catch (CodinTranslatorException e) {
			Status status = new Status(IStatus.ERROR, CodinCGPlugin.PLUGIN_ID,
					"Failed Translation: RodinDBException:" + e.getMessage(), e);
			StatusManager.getManager().handle(status, StatusManager.SHOW);
			e.printStackTrace();
		}
		// catch all the things that may go wrong
 catch (TaskingTranslationException e) {
	 Status status = new Status(IStatus.ERROR, CodinCGPlugin.PLUGIN_ID,
				"Failed Translation: TaskingTranslationException:"
						+ e.getMessage(), e);
		StatusManager.getManager().handle(status, StatusManager.SHOW);
		} catch (BackingStoreException e) {
			Status status = new Status(IStatus.ERROR, CodinCGPlugin.PLUGIN_ID,
					"Failed Translation: BackingStoreException:"
							+ e.getMessage(), e);
			StatusManager.getManager().handle(status, StatusManager.SHOW);
		} catch (CoreException e) {
			Status status = new Status(IStatus.ERROR, CodinCGPlugin.PLUGIN_ID,
					"Failed Translation: CoreException:" + e.getMessage(), e);
			StatusManager.getManager().handle(status, StatusManager.SHOW);
		} catch (IOException e) {
			Status status = new Status(IStatus.ERROR, CodinCGPlugin.PLUGIN_ID,
					"Failed Translation: IOException:" + e.getMessage(), e);
			StatusManager.getManager().handle(status, StatusManager.SHOW);
		} catch (URISyntaxException e) {
			Status status = new Status(IStatus.ERROR, CodinCGPlugin.PLUGIN_ID,
					"Failed Translation: URISyntaxException:" + e.getMessage(), e);
			StatusManager.getManager().handle(status, StatusManager.SHOW);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


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
