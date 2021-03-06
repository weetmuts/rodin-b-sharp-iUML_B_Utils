/*
* generated by Xtext
*/
package ac.soton.xtext.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import ac.soton.xtext.services.MachineDslGrammarAccess;

public class MachineDslParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private MachineDslGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected ac.soton.xtext.parser.antlr.internal.InternalMachineDslParser createParser(XtextTokenStream stream) {
		return new ac.soton.xtext.parser.antlr.internal.InternalMachineDslParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Machine";
	}
	
	public MachineDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(MachineDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
