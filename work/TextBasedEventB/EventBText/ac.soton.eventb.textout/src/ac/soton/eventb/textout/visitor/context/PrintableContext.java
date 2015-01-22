package ac.soton.eventb.textout.visitor.context;

import java.util.ArrayList;
import java.util.List;

import org.eventb.emf.core.context.Axiom;
import org.eventb.emf.core.context.CarrierSet;
import org.eventb.emf.core.context.Constant;
import org.eventb.emf.core.context.Context;

import ac.soton.eventb.printable.IPrintable;
import ac.soton.eventb.textout.core.ExportTextManager;
import ac.soton.eventb.textout.utils.TextOutUtil;

public class PrintableContext implements IPrintable {

	private Context context;

	public PrintableContext(Context context) {
		this.context = context;
	}

	@Override
	public List<String> print() {
		List<String> output = new ArrayList<String>();
		// Add a comment string if necessary
		String comment = ExportTextManager.adjustComment(context.getComment());
		output.add("context " + context.getName() + " " + comment);

		// Extends
		List<String> extendsNames = context.getExtendsNames();
		if (extendsNames.size() > 0) {
			output.add("extends ");
			for (String name : extendsNames) {
				output.add(indent1 + name);
			}
		}

		// CarrierSets
		formatCarrierSets(output);

		// Constants
		formatConstants(output);

		// Axioms
		List<Axiom> axiomList = context.getAxioms();
		if (axiomList.size() > 0) {
			output.add("axioms ");
			for (Axiom axiom : axiomList) {
				output.addAll(new PrintableAxiom(axiom).print());
			}
		}
		output.add("end");
		
		// Save and open for editing
		String fileName = context.getName() + ".ctx";
		ExportTextManager.saveToFile(output, fileName);
		TextOutUtil.openFileForEditing(fileName, ExportTextManager.getRodinProject());
		
		return output;
	}

	private void formatConstants(List<String> output) {
		List<Constant> constantList = context.getConstants();
		if (constantList.size() > 0) {
			output.add("constants ");
			List<String> tempStore = new ArrayList<String>();
			for (Constant constant : constantList) {
				tempStore.addAll(new PrintableConstant(constant).print());
			}
			output.addAll(resolveSingleMulti(tempStore));
		}
	}

	private void formatCarrierSets(List<String> output) {
		List<CarrierSet> carrierSetList = context.getSets();
		if (carrierSetList.size() > 0) {
			output.add("sets ");
			List<String> tempStore = new ArrayList<String>();
			for (CarrierSet carrierSet : carrierSetList) {
				tempStore.addAll(new PrintableSet(carrierSet).print());
			}
			output.addAll(resolveSingleMulti(tempStore));
		}
	}

	private List<String> resolveSingleMulti(List<String> incomingSeparateLines) {
		// if any line has a comment we put each line
		// on its own line, else we make it into a sequential list
		boolean hasComments = false;
		for (String separateLine : incomingSeparateLines) {
			if (separateLine.contains("//")) {
				hasComments = true;
				break;
			}
		}

		if (hasComments) {
			// we found a comment so just add individual lines, but add an
			// indent
			List<String> indentedLines = new ArrayList<String>();
			for (String separateLine : incomingSeparateLines) {
				indentedLines.add(indent1 + separateLine);
			}
			return indentedLines;

		} else {
			// no comment found so sequence the parameters
			String singleLineOut = indent1;
			boolean first = true;
			for (String separateLine : incomingSeparateLines) {
				if (first) {
					singleLineOut = singleLineOut + separateLine;
					first = false;
				} else {
					singleLineOut = singleLineOut + " " + separateLine;
				}
			}
			List<String> storeOfSequenced = new ArrayList<String>();
			storeOfSequenced.add(singleLineOut);
			return storeOfSequenced;
		}
	}
}
