package ac.soton.eventb.textout.visitor.context;

import java.util.ArrayList;
import java.util.List;

import org.eventb.emf.core.context.CarrierSet;

import ac.soton.eventb.textout.IPrintable;
import ac.soton.eventb.textout.core.ExportTextManager;

public class PrintableSet implements IPrintable {

	private CarrierSet carrierSet;

	public PrintableSet(CarrierSet carrierSet) {
		this.carrierSet = carrierSet;
	}

	@Override
	public List<String> print() {
		List<String> output = new ArrayList<String>();
		// Add a comment string if necessary
		String comment = ExportTextManager.adjustComment(carrierSet.getComment());
		output.add(carrierSet.getName() + " " + comment);
		return output;
	}

}
