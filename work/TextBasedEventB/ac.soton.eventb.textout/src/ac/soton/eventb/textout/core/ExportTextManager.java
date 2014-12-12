package ac.soton.eventb.textout.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eventb.core.IContextRoot;
import org.eventb.core.basis.ContextRoot;
import org.eventb.core.basis.MachineRoot;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.EventBObject;
import org.eventb.emf.core.context.impl.ContextImpl;
import org.eventb.emf.core.machine.impl.MachineImpl;
import org.eventb.emf.persistence.synchroniser.SyncManager;
import org.rodinp.core.IRodinElement;
import org.rodinp.core.IRodinProject;
import org.rodinp.core.RodinDBException;

import ac.soton.eventb.textout.visitor.context.PrintableContext;
import ac.soton.eventb.textout.visitor.machine.PrintableMachine;

public class ExportTextManager {
	
	
	public static IRodinProject rodinProject;

	public void export(IRodinElement rodinElement) throws RodinDBException,
			Exception {
		SyncManager syncManager = new SyncManager();
		Map<IRodinElement, EventBObject> map = new HashMap<IRodinElement, EventBObject>();
		map.clear();
		EventBElement element = syncManager.loadRodinElement(rodinElement,
				null, map, null);
		rodinProject = rodinElement.getRodinProject();
		List<String> output = new ArrayList<String>();
		if (rodinElement.getClass() == MachineRoot.class) {
			MachineImpl emfMachine = (MachineImpl) element;
			output.addAll(new PrintableMachine(emfMachine).print());
		}
		else if(rodinElement.getClass() == ContextRoot.class){
			ContextImpl emfContext = (ContextImpl) element;
			output.addAll(new PrintableContext(emfContext).print());
		}
		for (String string : output) {
			System.out.println(string);
		}

	}

	public void export(IContextRoot contextRoot) {

	}

	public static String adjustComment(String comment) {
		String adjustedComment = "";
		// add the comment characters if there is a comment
		if (comment != null && !comment.equals("")) {
			adjustedComment = "// " + comment;
		}
		// if the comment is null or "" then return ""
		return adjustedComment;
	}
}