package testaccessemf.popup.actions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eventb.core.basis.MachineRoot;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.EventBObject;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Invariant;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.impl.MachineImpl;
import org.eventb.emf.persistence.synchroniser.SyncManager;
import org.rodinp.core.IRodinElement;
import org.rodinp.core.RodinDBException;

public class NewAction implements IObjectActionDelegate {
	@SuppressWarnings("unused")
	private Shell shell;
	private IStructuredSelection selection;

	/**
	 * Constructor for Action1.
	 */
	public NewAction() {
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
		Resource r = null;
		IFile file = null;
		Object firstElement = selection.getFirstElement();
		if (firstElement instanceof IFile) {
			file = (IFile) firstElement;
			String path = file.getFullPath().toOSString();

			ResourceSet rs = new ResourceSetImpl();
			URI uri = URI.createPlatformResourceURI(path, true);
			r = rs.getResource(uri, true);
		} else if (firstElement instanceof MachineRoot) {
			MachineRoot mr = (MachineRoot) firstElement;
			file = mr.getResource();

			URI uri = URI.createPlatformResourceURI(file.getFullPath()
					.toOSString(), true);
			ResourceSet rs = new ResourceSetImpl();
			r = rs.getResource(uri, true);
		}

		
		////////////////////////////////////////////////////////////////
		
		SyncManager syncManager = new SyncManager();
		IRodinElement rodinElement = null;

		
		
		Map<IRodinElement, EventBObject> map = new HashMap<IRodinElement, EventBObject>();
		map.clear();
		try {
			EventBElement element = syncManager.saveModelElement(emfElement, rodinParent, map, null);;
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		
		//////////////////////////////////////////////////////////////////
		
		
		
		
		List<EObject> contentOfYourFile = r.getContents();
		for (EObject eo : contentOfYourFile) {
			Class<? extends EObject> clazz = eo.getClass();
			if (clazz.equals(MachineImpl.class)) {
				Machine m = (Machine) eo;
				EList<Invariant> invariants = m.getInvariants();
				EList<Event> events = m.getEvents();
				EList<EObject> iter = m.eContents();

				try {
					Work command = new Work(m.getURI());
					if (command.canExecute())
						command.execute(new NullProgressMonitor(), null);
				} catch (Exception e) {
					Status status = new Status(Status.ERROR, "Failed to work",
							e.getLocalizedMessage());
					StatusManager.getManager().handle(status,
							StatusManager.SHOW);
				}
			}
		}
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = (IStructuredSelection) selection;
	}

}
