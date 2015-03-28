package ac.soton.eventb.textout.visitor.context;

import java.util.ArrayList;
import java.util.List;

import org.eventb.emf.core.context.Constant;

import ac.soton.eventb.textout.IPrintable;
import ac.soton.eventb.textout.core.ExportTextManager;

public class PrintableConstant implements IPrintable {

	private Constant constant;

	public PrintableConstant(Constant constant) {
		this.constant = constant;
	}

	@Override
	public List<String> print() {
		List<String> output = new ArrayList<String>();
		// Add a comment string if necessary
		String comment = ExportTextManager.adjustComment(constant.getComment());
		output.add(constant.getName() + " " + comment);
		return output;
	}

}
