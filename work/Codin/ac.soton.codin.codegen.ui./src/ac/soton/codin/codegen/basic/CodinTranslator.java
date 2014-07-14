package ac.soton.codin.codegen.basic;

import java.util.Iterator;

import org.eclipse.jface.viewers.IStructuredSelection;

import ac.soton.eventb.emf.components.diagram.edit.parts.ComponentEditPart;

public class CodinTranslator {

	public void translate(IStructuredSelection selection) {
		Iterator<ComponentEditPart> iter = (Iterator<ComponentEditPart>) selection.iterator();
	
		while(iter.hasNext()){
			ComponentEditPart item = iter.next();
			item.getDiagramEditDomain();
			System.out.println();
		}
	}

}
