package ac.soton.eventb.textout.visitor.context;

import java.util.List;

import org.eventb.emf.core.context.Context;

import ac.soton.eventb.printable.IPrintable;

public class PrintableContext implements IPrintable {

	private Context context;

	public PrintableContext(Context context) {
		this.context = context;
	}

	@Override
	public List<String> print() {
		//TODO
		return null;
	}

}
