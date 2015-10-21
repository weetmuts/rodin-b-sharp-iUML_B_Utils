package ac.soton.eventb.printable;

import java.util.List;

// implement this to make an element printable
public interface IPrintable {
	String indent1 = " ";
	public List<String> print();
}
