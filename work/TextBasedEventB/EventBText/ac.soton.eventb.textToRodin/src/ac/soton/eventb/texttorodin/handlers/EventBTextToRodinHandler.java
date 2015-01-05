package ac.soton.eventb.texttorodin.handlers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.EventBObject;
import org.eventb.emf.core.context.Context;
import org.eventb.emf.core.context.impl.ContextImpl;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.impl.MachineImpl;
import org.eventb.emf.persistence.synchroniser.SyncManager;
import org.rodinp.core.IRodinElement;
import org.rodinp.core.IRodinProject;
import org.rodinp.core.RodinCore;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * 
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class EventBTextToRodinHandler extends AbstractHandler {
	/**
	 * The constructor.
	 */
	public EventBTextToRodinHandler() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {

		IEditorPart editorPart = HandlerUtil.getActiveEditorChecked(event);
		Class<XtextEditor> xTextEditorClazz = XtextEditor.class;
		Class<? extends IEditorPart> thisEditorClazz = editorPart.getClass();
		if (thisEditorClazz == xTextEditorClazz) {
			IFileEditorInput input = (IFileEditorInput) editorPart
					.getEditorInput();
			IFile f = input.getFile();
			URI uri = URI.createPlatformResourceURI(f.getFullPath().toString(),
					true);
			ResourceSet rs = new ResourceSetImpl();
			Resource r = rs.getResource(uri, true);

			String directoryName = uri.segment(uri.segmentCount() - 2);
			IRodinProject rodinProject = RodinCore.getRodinDB()
					.getRodinProject(directoryName);
			if (rodinProject == null) {
				Shell shell = editorPart.getSite().getShell();
				MessageDialog.openError(shell, directoryName,
						"Please use an Event-B Project");
				return null;
			}

			URI newURI = uri.trimFileExtension().appendFileExtension("bum");
			r.setURI(newURI);

			List<EObject> contentList = r.getContents();
			for (EObject e : contentList) {
				Class<? extends EObject> eClazz = e.getClass();
				Class<MachineImpl> machineClazz = MachineImpl.class;
				Class<ContextImpl> contextClazz = ContextImpl.class;
				boolean isMachine = eClazz == machineClazz;
				boolean isContext = eClazz == contextClazz;
				if (isMachine || isContext) {
					// Set the machines refinesNames to force the correct
					// internal Rodin representation.
					// Looks like it breaks the XText model
					if (isMachine) {
						Machine machine = (Machine) e;
						List<Machine> tmpRefinesList = machine.getRefines();
						List<String> refinesNamesList = new ArrayList<String>();
						for (Machine refined : tmpRefinesList) {
							String refinedMachineName = refined.getName();
							if (!tmpRefinesList.contains(refinedMachineName)) {
								refinesNamesList.add(refinedMachineName);
							}
						}
						machine.getRefinesNames().addAll(refinesNamesList);

						// List<Context> seesList = machine.getSees();
						// List<String> tmpSeesNamesList = new
						// ArrayList<String>();
						// for(Context seen: seesList){
						// String seenContextName = seen.getName();
						// if(!tmpSeesNamesList.contains(seenContextName)){
						// tmpSeesNamesList.add(seenContextName);
						// }
						// }
						// machine.getSeesNames().addAll(tmpSeesNamesList);
					}
					// else if(isContext){
					// Context context = (Context) e;
					// EList<Context> extendsList = context.getExtends();
					// List<String> tmpExtendsNamesList = new
					// ArrayList<String>();
					// for(Context extended: extendsList){
					// String extendedName = extended.getName();
					// if(!tmpExtendsNamesList.contains(extendedName)){
					// tmpExtendsNamesList.add(extendedName);
					// }
					// context.getExtendsNames().addAll(tmpExtendsNamesList);
					// }
					// }

					Map<IRodinElement, EventBObject> map = new HashMap<IRodinElement, EventBObject>();
					SyncManager synchManager = new SyncManager();
					try {
						synchManager.saveModelElement((EventBElement) e,
								rodinProject, map, null);
					} catch (CoreException e1) {
						e1.printStackTrace();
					}
				}
			}
		}
		return null;
	}
}