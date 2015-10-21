package ac.soton.eventb.textout.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eventb.core.IContextRoot;
import org.eventb.core.IMachineRoot;
import org.rodinp.core.IRodinElement;
import org.rodinp.core.IRodinFile;
import org.rodinp.core.IRodinProject;
import org.rodinp.core.RodinCore;

import ac.soton.eventb.textout.Activator;
import ac.soton.eventb.textout.utils.ExportTextManager;
import ac.soton.eventb.textout.utils.TextOutUtil;

public class EventBRodinProjectToTextHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// Get project from selection event
		IProject project= getSelectedProject(HandlerUtil.getCurrentSelection(event));
		// check we are in a rodin project
		IRodinProject rodinProject = getRodinProject(project);
		if (rodinProject == null) {
			return null;
		}
		
		TextOutUtil.addXtextNature(project);
		
		// For each component in the project... 
		try {
			for (IRodinFile rodinFile : rodinProject.getRodinFiles()){
				String elId =  rodinFile.getRootElementType().getId();
				// If it's a machine or context then export it
				if (elId.equals(IMachineRoot.ELEMENT_TYPE.getId()) ||
						elId.equals(IContextRoot.ELEMENT_TYPE.getId())) {
						// Call the export method.
						ExportTextManager.export((IRodinElement) rodinFile);
				}
			}
		} catch (Exception e) {
			Status status = new Status(IStatus.ERROR,
					Activator.PLUGIN_ID,
					"Failed TextOut: Exception while generating text : "
					+ e.getMessage()  , e);
				StatusManager.getManager().handle(status,
					StatusManager.SHOW);
			e.printStackTrace();
		}

		return null;
	}

	private IRodinProject getRodinProject(IProject project) {
		return project==null? null: RodinCore.getRodinDB().getRodinProject(project.getName());
	}

	private IProject getSelectedProject(ISelection currentSelection) {
		if (currentSelection instanceof IStructuredSelection) {
			Object selected = ((IStructuredSelection) currentSelection).getFirstElement();
			if (selected instanceof IProject){
				return (IProject)selected;
			}else{
				return null;
			}
		} else {
			return null;
		}
	}

	/**
	 * Called by the framework to allow the handler to update its enabled state
	 * by extracting the same information available at execution time. Clients
	 * may override if they need to extract information from the application
	 * context.
	 * 
	 * @param evaluationContext
	 *            the application context. May be <code>null</code>
	 */
	public void setEnabled(Object evaluationContext) {
		ISelection selection = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getSelectionService()
				.getSelection();
		setBaseEnabled(getRodinProject(getSelectedProject(selection))!=null);
	}

}
