/*
* generated by Xtext
*/
package ac.soton.xtext.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import ac.soton.xtext.services.ContextDslGrammarAccess;

public class ContextDslParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private ContextDslGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected ac.soton.xtext.parser.antlr.internal.InternalContextDslParser createParser(XtextTokenStream stream) {
		return new ac.soton.xtext.parser.antlr.internal.InternalContextDslParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Context";
	}
	
	public ContextDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ContextDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
