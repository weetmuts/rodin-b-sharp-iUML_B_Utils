package ac.soton.codin.codegen.basic;

import org.eventb.codegen.tasking.utils.CodeGenTaskingUtils;

public class TranslatorUtils {
	public String makeSingleSpaceBetweenElements(String predIn) {
		// first remove spaces
		predIn = predIn.replace(" ", "");
		String pred = "";
		boolean lastNormal = true;
		for (char c : predIn.toCharArray()) {
			boolean currentNormal = ((c >= 'a' && c <= 'z')
					|| (c >= 'A' && c <= 'Z') || c == ' ' || c == '_'
					|| (c >= '0' && c <= '9')
					|| CodeGenTaskingUtils.INT_SYMBOL.equals("" + c) || CodeGenTaskingUtils.BOOL_SYMBOL
					.equals("" + c));

			if (lastNormal && currentNormal) { // do nothing special
			} else if (lastNormal && !currentNormal) { // add a space
				pred += ' ';
			} else if (!lastNormal && currentNormal) { // add a space
				pred += ' ';
			} else if (!lastNormal && !currentNormal) { // do nothing special
			}
			lastNormal = currentNormal;
			pred += c;
		}
		return pred;
	}
}
