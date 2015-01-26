package ac.soton.xtext.ui;

import org.eclipse.xtext.naming.IQualifiedNameConverter.DefaultImpl;

public class CustomQualifiedNameConverter extends DefaultImpl {
	
	@Override
	public String getDelimiter() {
		return "\u00b7";
//		return ".";
	}

}
