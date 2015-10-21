package ac.soton.eventb.textout.handlers;

import java.util.ArrayList;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.statushandlers.StatusManager;
import org.rodinp.core.IRodinProject;
import org.rodinp.core.RodinCore;

import ac.soton.eventb.textout.Activator;
import ac.soton.eventb.textout.utils.ImportTextManager;
import ac.soton.eventb.textout.utils.TextOutUtil;

public class EventBRodinProjectFromTextHandler extends AbstractHandler {

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

		//Import text to Rodin for all XText files in the selected project
		try {
			ArrayList<IResource> resources = new ArrayList<IResource>();
			recursiveGetTextResources(resources, project);
			for (IResource res : resources){
				ImportTextManager.importText(rodinProject, res);
			}
		} catch (Exception e) {
			Status status = new Status(IStatus.ERROR,
					Activator.PLUGIN_ID,
					"Failed TextOut: Exception while generating Rodin : "
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
	
	private void recursiveGetTextResources(ArrayList<IResource> result, IContainer container) throws CoreException{
        IResource[] iResources;
        iResources = container.members();
        for (IResource iR : iResources){
            if ("mch".equalsIgnoreCase(iR.getFileExtension()) || 
            	"ctx".equalsIgnoreCase(iR.getFileExtension()))
                result.add(iR);
            if (iR.getType() == IResource.FOLDER){
                recursiveGetTextResources(result, (IContainer) iR);
            }
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
