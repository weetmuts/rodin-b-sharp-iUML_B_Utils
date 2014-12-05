package ac.soton.eventb.textout.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eventb.core.IMachineRoot;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.EventBObject;
import org.eventb.emf.core.machine.impl.MachineImpl;
import org.eventb.emf.persistence.synchroniser.SyncManager;
import org.rodinp.core.IRodinElement;
import org.rodinp.core.RodinDBException;

import ac.soton.eventb.textout.visitor.elements.MachineProcessor;

public class ExportTextManager {

	public void export(IMachineRoot machineRoot) throws RodinDBException,
			Exception {
		SyncManager syncManager = new SyncManager();
		Map<IRodinElement, EventBObject> map = new HashMap<IRodinElement, EventBObject>();
		map.clear();
		EventBElement element = syncManager.loadRodinElement(machineRoot, null,
				map, null);
		MachineImpl emfMachine = (MachineImpl) element;
		
		
		List<String> output = new MachineProcessor().visit(emfMachine);
		
		for(String string: output){
			System.out.println(string);
		}
		
	}
}