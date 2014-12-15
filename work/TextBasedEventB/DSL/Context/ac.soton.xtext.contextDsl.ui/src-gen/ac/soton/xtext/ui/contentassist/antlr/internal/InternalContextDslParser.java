package ac.soton.xtext.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import ac.soton.xtext.services.ContextDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalContextDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'context'", "'comment'", "'extends'", "'sets'", "'constants'", "'axioms'", "'//'", "'@'", "'theorem'"
    };
    public static final int T__19=19;
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalContextDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalContextDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalContextDslParser.tokenNames; }
    public String getGrammarFileName() { return "../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g"; }


     
     	private ContextDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ContextDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleContext"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:60:1: entryRuleContext : ruleContext EOF ;
    public final void entryRuleContext() throws RecognitionException {
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:61:1: ( ruleContext EOF )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:62:1: ruleContext EOF
            {
             before(grammarAccess.getContextRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleContext_in_entryRuleContext61);
            ruleContext();

            state._fsp--;

             after(grammarAccess.getContextRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleContext68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContext"


    // $ANTLR start "ruleContext"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:69:1: ruleContext : ( ( rule__Context__Group__0 ) ) ;
    public final void ruleContext() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:73:2: ( ( ( rule__Context__Group__0 ) ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:74:1: ( ( rule__Context__Group__0 ) )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:74:1: ( ( rule__Context__Group__0 ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:75:1: ( rule__Context__Group__0 )
            {
             before(grammarAccess.getContextAccess().getGroup()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:76:1: ( rule__Context__Group__0 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:76:2: rule__Context__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__Group__0_in_ruleContext94);
            rule__Context__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContext"


    // $ANTLR start "entryRuleEString"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:88:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:89:1: ( ruleEString EOF )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:90:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString121);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:97:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:101:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:102:1: ( ( rule__EString__Alternatives ) )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:102:1: ( ( rule__EString__Alternatives ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:103:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:104:1: ( rule__EString__Alternatives )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:104:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString154);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleCarrierSet"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:116:1: entryRuleCarrierSet : ruleCarrierSet EOF ;
    public final void entryRuleCarrierSet() throws RecognitionException {
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:117:1: ( ruleCarrierSet EOF )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:118:1: ruleCarrierSet EOF
            {
             before(grammarAccess.getCarrierSetRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCarrierSet_in_entryRuleCarrierSet181);
            ruleCarrierSet();

            state._fsp--;

             after(grammarAccess.getCarrierSetRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCarrierSet188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCarrierSet"


    // $ANTLR start "ruleCarrierSet"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:125:1: ruleCarrierSet : ( ( rule__CarrierSet__Group__0 ) ) ;
    public final void ruleCarrierSet() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:129:2: ( ( ( rule__CarrierSet__Group__0 ) ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:130:1: ( ( rule__CarrierSet__Group__0 ) )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:130:1: ( ( rule__CarrierSet__Group__0 ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:131:1: ( rule__CarrierSet__Group__0 )
            {
             before(grammarAccess.getCarrierSetAccess().getGroup()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:132:1: ( rule__CarrierSet__Group__0 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:132:2: rule__CarrierSet__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CarrierSet__Group__0_in_ruleCarrierSet214);
            rule__CarrierSet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCarrierSetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCarrierSet"


    // $ANTLR start "entryRuleConstant"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:144:1: entryRuleConstant : ruleConstant EOF ;
    public final void entryRuleConstant() throws RecognitionException {
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:145:1: ( ruleConstant EOF )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:146:1: ruleConstant EOF
            {
             before(grammarAccess.getConstantRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstant_in_entryRuleConstant241);
            ruleConstant();

            state._fsp--;

             after(grammarAccess.getConstantRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstant248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:153:1: ruleConstant : ( ( rule__Constant__Group__0 ) ) ;
    public final void ruleConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:157:2: ( ( ( rule__Constant__Group__0 ) ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:158:1: ( ( rule__Constant__Group__0 ) )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:158:1: ( ( rule__Constant__Group__0 ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:159:1: ( rule__Constant__Group__0 )
            {
             before(grammarAccess.getConstantAccess().getGroup()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:160:1: ( rule__Constant__Group__0 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:160:2: rule__Constant__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constant__Group__0_in_ruleConstant274);
            rule__Constant__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleAxiom"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:172:1: entryRuleAxiom : ruleAxiom EOF ;
    public final void entryRuleAxiom() throws RecognitionException {
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:173:1: ( ruleAxiom EOF )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:174:1: ruleAxiom EOF
            {
             before(grammarAccess.getAxiomRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAxiom_in_entryRuleAxiom301);
            ruleAxiom();

            state._fsp--;

             after(grammarAccess.getAxiomRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAxiom308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAxiom"


    // $ANTLR start "ruleAxiom"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:181:1: ruleAxiom : ( ( rule__Axiom__Group__0 ) ) ;
    public final void ruleAxiom() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:185:2: ( ( ( rule__Axiom__Group__0 ) ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:186:1: ( ( rule__Axiom__Group__0 ) )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:186:1: ( ( rule__Axiom__Group__0 ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:187:1: ( rule__Axiom__Group__0 )
            {
             before(grammarAccess.getAxiomAccess().getGroup()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:188:1: ( rule__Axiom__Group__0 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:188:2: rule__Axiom__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axiom__Group__0_in_ruleAxiom334);
            rule__Axiom__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAxiomAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAxiom"


    // $ANTLR start "rule__EString__Alternatives"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:200:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:204:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:205:1: ( RULE_STRING )
                    {
                    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:205:1: ( RULE_STRING )
                    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:206:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives370); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:211:6: ( RULE_ID )
                    {
                    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:211:6: ( RULE_ID )
                    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:212:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives387); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Context__Group__0"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:224:1: rule__Context__Group__0 : rule__Context__Group__0__Impl rule__Context__Group__1 ;
    public final void rule__Context__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:228:1: ( rule__Context__Group__0__Impl rule__Context__Group__1 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:229:2: rule__Context__Group__0__Impl rule__Context__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__Group__0__Impl_in_rule__Context__Group__0417);
            rule__Context__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Context__Group__1_in_rule__Context__Group__0420);
            rule__Context__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__0"


    // $ANTLR start "rule__Context__Group__0__Impl"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:236:1: rule__Context__Group__0__Impl : ( () ) ;
    public final void rule__Context__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:240:1: ( ( () ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:241:1: ( () )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:241:1: ( () )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:242:1: ()
            {
             before(grammarAccess.getContextAccess().getContextAction_0()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:243:1: ()
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:245:1: 
            {
            }

             after(grammarAccess.getContextAccess().getContextAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__0__Impl"


    // $ANTLR start "rule__Context__Group__1"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:255:1: rule__Context__Group__1 : rule__Context__Group__1__Impl rule__Context__Group__2 ;
    public final void rule__Context__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:259:1: ( rule__Context__Group__1__Impl rule__Context__Group__2 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:260:2: rule__Context__Group__1__Impl rule__Context__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__Group__1__Impl_in_rule__Context__Group__1478);
            rule__Context__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Context__Group__2_in_rule__Context__Group__1481);
            rule__Context__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__1"


    // $ANTLR start "rule__Context__Group__1__Impl"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:267:1: rule__Context__Group__1__Impl : ( 'context' ) ;
    public final void rule__Context__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:271:1: ( ( 'context' ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:272:1: ( 'context' )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:272:1: ( 'context' )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:273:1: 'context'
            {
             before(grammarAccess.getContextAccess().getContextKeyword_1()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__Context__Group__1__Impl509); 
             after(grammarAccess.getContextAccess().getContextKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__1__Impl"


    // $ANTLR start "rule__Context__Group__2"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:286:1: rule__Context__Group__2 : rule__Context__Group__2__Impl rule__Context__Group__3 ;
    public final void rule__Context__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:290:1: ( rule__Context__Group__2__Impl rule__Context__Group__3 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:291:2: rule__Context__Group__2__Impl rule__Context__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__Group__2__Impl_in_rule__Context__Group__2540);
            rule__Context__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Context__Group__3_in_rule__Context__Group__2543);
            rule__Context__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__2"


    // $ANTLR start "rule__Context__Group__2__Impl"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:298:1: rule__Context__Group__2__Impl : ( ( rule__Context__NameAssignment_2 ) ) ;
    public final void rule__Context__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:302:1: ( ( ( rule__Context__NameAssignment_2 ) ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:303:1: ( ( rule__Context__NameAssignment_2 ) )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:303:1: ( ( rule__Context__NameAssignment_2 ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:304:1: ( rule__Context__NameAssignment_2 )
            {
             before(grammarAccess.getContextAccess().getNameAssignment_2()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:305:1: ( rule__Context__NameAssignment_2 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:305:2: rule__Context__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__NameAssignment_2_in_rule__Context__Group__2__Impl570);
            rule__Context__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getContextAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__2__Impl"


    // $ANTLR start "rule__Context__Group__3"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:315:1: rule__Context__Group__3 : rule__Context__Group__3__Impl rule__Context__Group__4 ;
    public final void rule__Context__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:319:1: ( rule__Context__Group__3__Impl rule__Context__Group__4 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:320:2: rule__Context__Group__3__Impl rule__Context__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__Group__3__Impl_in_rule__Context__Group__3600);
            rule__Context__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Context__Group__4_in_rule__Context__Group__3603);
            rule__Context__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__3"


    // $ANTLR start "rule__Context__Group__3__Impl"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:327:1: rule__Context__Group__3__Impl : ( ( rule__Context__Group_3__0 )? ) ;
    public final void rule__Context__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:331:1: ( ( ( rule__Context__Group_3__0 )? ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:332:1: ( ( rule__Context__Group_3__0 )? )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:332:1: ( ( rule__Context__Group_3__0 )? )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:333:1: ( rule__Context__Group_3__0 )?
            {
             before(grammarAccess.getContextAccess().getGroup_3()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:334:1: ( rule__Context__Group_3__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:334:2: rule__Context__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Context__Group_3__0_in_rule__Context__Group__3__Impl630);
                    rule__Context__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContextAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__3__Impl"


    // $ANTLR start "rule__Context__Group__4"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:344:1: rule__Context__Group__4 : rule__Context__Group__4__Impl rule__Context__Group__5 ;
    public final void rule__Context__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:348:1: ( rule__Context__Group__4__Impl rule__Context__Group__5 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:349:2: rule__Context__Group__4__Impl rule__Context__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__Group__4__Impl_in_rule__Context__Group__4661);
            rule__Context__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Context__Group__5_in_rule__Context__Group__4664);
            rule__Context__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__4"


    // $ANTLR start "rule__Context__Group__4__Impl"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:356:1: rule__Context__Group__4__Impl : ( ( rule__Context__Group_4__0 )? ) ;
    public final void rule__Context__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:360:1: ( ( ( rule__Context__Group_4__0 )? ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:361:1: ( ( rule__Context__Group_4__0 )? )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:361:1: ( ( rule__Context__Group_4__0 )? )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:362:1: ( rule__Context__Group_4__0 )?
            {
             before(grammarAccess.getContextAccess().getGroup_4()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:363:1: ( rule__Context__Group_4__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:363:2: rule__Context__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Context__Group_4__0_in_rule__Context__Group__4__Impl691);
                    rule__Context__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContextAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__4__Impl"


    // $ANTLR start "rule__Context__Group__5"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:373:1: rule__Context__Group__5 : rule__Context__Group__5__Impl rule__Context__Group__6 ;
    public final void rule__Context__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:377:1: ( rule__Context__Group__5__Impl rule__Context__Group__6 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:378:2: rule__Context__Group__5__Impl rule__Context__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__Group__5__Impl_in_rule__Context__Group__5722);
            rule__Context__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Context__Group__6_in_rule__Context__Group__5725);
            rule__Context__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__5"


    // $ANTLR start "rule__Context__Group__5__Impl"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:385:1: rule__Context__Group__5__Impl : ( ( rule__Context__Group_5__0 )? ) ;
    public final void rule__Context__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:389:1: ( ( ( rule__Context__Group_5__0 )? ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:390:1: ( ( rule__Context__Group_5__0 )? )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:390:1: ( ( rule__Context__Group_5__0 )? )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:391:1: ( rule__Context__Group_5__0 )?
            {
             before(grammarAccess.getContextAccess().getGroup_5()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:392:1: ( rule__Context__Group_5__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:392:2: rule__Context__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Context__Group_5__0_in_rule__Context__Group__5__Impl752);
                    rule__Context__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContextAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__5__Impl"


    // $ANTLR start "rule__Context__Group__6"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:402:1: rule__Context__Group__6 : rule__Context__Group__6__Impl rule__Context__Group__7 ;
    public final void rule__Context__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:406:1: ( rule__Context__Group__6__Impl rule__Context__Group__7 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:407:2: rule__Context__Group__6__Impl rule__Context__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__Group__6__Impl_in_rule__Context__Group__6783);
            rule__Context__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Context__Group__7_in_rule__Context__Group__6786);
            rule__Context__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__6"


    // $ANTLR start "rule__Context__Group__6__Impl"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:414:1: rule__Context__Group__6__Impl : ( ( rule__Context__Group_6__0 )? ) ;
    public final void rule__Context__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:418:1: ( ( ( rule__Context__Group_6__0 )? ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:419:1: ( ( rule__Context__Group_6__0 )? )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:419:1: ( ( rule__Context__Group_6__0 )? )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:420:1: ( rule__Context__Group_6__0 )?
            {
             before(grammarAccess.getContextAccess().getGroup_6()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:421:1: ( rule__Context__Group_6__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:421:2: rule__Context__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Context__Group_6__0_in_rule__Context__Group__6__Impl813);
                    rule__Context__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContextAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__6__Impl"


    // $ANTLR start "rule__Context__Group__7"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:431:1: rule__Context__Group__7 : rule__Context__Group__7__Impl ;
    public final void rule__Context__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:435:1: ( rule__Context__Group__7__Impl )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:436:2: rule__Context__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__Group__7__Impl_in_rule__Context__Group__7844);
            rule__Context__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__7"


    // $ANTLR start "rule__Context__Group__7__Impl"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:442:1: rule__Context__Group__7__Impl : ( ( rule__Context__Group_7__0 )? ) ;
    public final void rule__Context__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:446:1: ( ( ( rule__Context__Group_7__0 )? ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:447:1: ( ( rule__Context__Group_7__0 )? )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:447:1: ( ( rule__Context__Group_7__0 )? )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:448:1: ( rule__Context__Group_7__0 )?
            {
             before(grammarAccess.getContextAccess().getGroup_7()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:449:1: ( rule__Context__Group_7__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:449:2: rule__Context__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Context__Group_7__0_in_rule__Context__Group__7__Impl871);
                    rule__Context__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContextAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__7__Impl"


    // $ANTLR start "rule__Context__Group_3__0"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:475:1: rule__Context__Group_3__0 : rule__Context__Group_3__0__Impl rule__Context__Group_3__1 ;
    public final void rule__Context__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:479:1: ( rule__Context__Group_3__0__Impl rule__Context__Group_3__1 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:480:2: rule__Context__Group_3__0__Impl rule__Context__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__Group_3__0__Impl_in_rule__Context__Group_3__0918);
            rule__Context__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Context__Group_3__1_in_rule__Context__Group_3__0921);
            rule__Context__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_3__0"


    // $ANTLR start "rule__Context__Group_3__0__Impl"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:487:1: rule__Context__Group_3__0__Impl : ( 'comment' ) ;
    public final void rule__Context__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:491:1: ( ( 'comment' ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:492:1: ( 'comment' )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:492:1: ( 'comment' )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:493:1: 'comment'
            {
             before(grammarAccess.getContextAccess().getCommentKeyword_3_0()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Context__Group_3__0__Impl949); 
             after(grammarAccess.getContextAccess().getCommentKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_3__0__Impl"


    // $ANTLR start "rule__Context__Group_3__1"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:506:1: rule__Context__Group_3__1 : rule__Context__Group_3__1__Impl ;
    public final void rule__Context__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:510:1: ( rule__Context__Group_3__1__Impl )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:511:2: rule__Context__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__Group_3__1__Impl_in_rule__Context__Group_3__1980);
            rule__Context__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_3__1"


    // $ANTLR start "rule__Context__Group_3__1__Impl"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:517:1: rule__Context__Group_3__1__Impl : ( ( rule__Context__CommentAssignment_3_1 ) ) ;
    public final void rule__Context__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:521:1: ( ( ( rule__Context__CommentAssignment_3_1 ) ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:522:1: ( ( rule__Context__CommentAssignment_3_1 ) )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:522:1: ( ( rule__Context__CommentAssignment_3_1 ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:523:1: ( rule__Context__CommentAssignment_3_1 )
            {
             before(grammarAccess.getContextAccess().getCommentAssignment_3_1()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:524:1: ( rule__Context__CommentAssignment_3_1 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:524:2: rule__Context__CommentAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__CommentAssignment_3_1_in_rule__Context__Group_3__1__Impl1007);
            rule__Context__CommentAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getContextAccess().getCommentAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_3__1__Impl"


    // $ANTLR start "rule__Context__Group_4__0"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:538:1: rule__Context__Group_4__0 : rule__Context__Group_4__0__Impl rule__Context__Group_4__1 ;
    public final void rule__Context__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:542:1: ( rule__Context__Group_4__0__Impl rule__Context__Group_4__1 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:543:2: rule__Context__Group_4__0__Impl rule__Context__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__Group_4__0__Impl_in_rule__Context__Group_4__01041);
            rule__Context__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Context__Group_4__1_in_rule__Context__Group_4__01044);
            rule__Context__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_4__0"


    // $ANTLR start "rule__Context__Group_4__0__Impl"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:550:1: rule__Context__Group_4__0__Impl : ( 'extends' ) ;
    public final void rule__Context__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:554:1: ( ( 'extends' ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:555:1: ( 'extends' )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:555:1: ( 'extends' )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:556:1: 'extends'
            {
             before(grammarAccess.getContextAccess().getExtendsKeyword_4_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Context__Group_4__0__Impl1072); 
             after(grammarAccess.getContextAccess().getExtendsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_4__0__Impl"


    // $ANTLR start "rule__Context__Group_4__1"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:569:1: rule__Context__Group_4__1 : rule__Context__Group_4__1__Impl rule__Context__Group_4__2 ;
    public final void rule__Context__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:573:1: ( rule__Context__Group_4__1__Impl rule__Context__Group_4__2 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:574:2: rule__Context__Group_4__1__Impl rule__Context__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__Group_4__1__Impl_in_rule__Context__Group_4__11103);
            rule__Context__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Context__Group_4__2_in_rule__Context__Group_4__11106);
            rule__Context__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_4__1"


    // $ANTLR start "rule__Context__Group_4__1__Impl"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:581:1: rule__Context__Group_4__1__Impl : ( ( rule__Context__ExtendsAssignment_4_1 ) ) ;
    public final void rule__Context__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:585:1: ( ( ( rule__Context__ExtendsAssignment_4_1 ) ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:586:1: ( ( rule__Context__ExtendsAssignment_4_1 ) )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:586:1: ( ( rule__Context__ExtendsAssignment_4_1 ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:587:1: ( rule__Context__ExtendsAssignment_4_1 )
            {
             before(grammarAccess.getContextAccess().getExtendsAssignment_4_1()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:588:1: ( rule__Context__ExtendsAssignment_4_1 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:588:2: rule__Context__ExtendsAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__ExtendsAssignment_4_1_in_rule__Context__Group_4__1__Impl1133);
            rule__Context__ExtendsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getContextAccess().getExtendsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_4__1__Impl"


    // $ANTLR start "rule__Context__Group_4__2"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:598:1: rule__Context__Group_4__2 : rule__Context__Group_4__2__Impl ;
    public final void rule__Context__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:602:1: ( rule__Context__Group_4__2__Impl )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:603:2: rule__Context__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__Group_4__2__Impl_in_rule__Context__Group_4__21163);
            rule__Context__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_4__2"


    // $ANTLR start "rule__Context__Group_4__2__Impl"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:609:1: rule__Context__Group_4__2__Impl : ( ( rule__Context__ExtendsAssignment_4_2 )* ) ;
    public final void rule__Context__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:613:1: ( ( ( rule__Context__ExtendsAssignment_4_2 )* ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:614:1: ( ( rule__Context__ExtendsAssignment_4_2 )* )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:614:1: ( ( rule__Context__ExtendsAssignment_4_2 )* )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:615:1: ( rule__Context__ExtendsAssignment_4_2 )*
            {
             before(grammarAccess.getContextAccess().getExtendsAssignment_4_2()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:616:1: ( rule__Context__ExtendsAssignment_4_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:616:2: rule__Context__ExtendsAssignment_4_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Context__ExtendsAssignment_4_2_in_rule__Context__Group_4__2__Impl1190);
            	    rule__Context__ExtendsAssignment_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getContextAccess().getExtendsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_4__2__Impl"


    // $ANTLR start "rule__Context__Group_5__0"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:632:1: rule__Context__Group_5__0 : rule__Context__Group_5__0__Impl rule__Context__Group_5__1 ;
    public final void rule__Context__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:636:1: ( rule__Context__Group_5__0__Impl rule__Context__Group_5__1 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:637:2: rule__Context__Group_5__0__Impl rule__Context__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__Group_5__0__Impl_in_rule__Context__Group_5__01227);
            rule__Context__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Context__Group_5__1_in_rule__Context__Group_5__01230);
            rule__Context__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_5__0"


    // $ANTLR start "rule__Context__Group_5__0__Impl"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:644:1: rule__Context__Group_5__0__Impl : ( 'sets' ) ;
    public final void rule__Context__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:648:1: ( ( 'sets' ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:649:1: ( 'sets' )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:649:1: ( 'sets' )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:650:1: 'sets'
            {
             before(grammarAccess.getContextAccess().getSetsKeyword_5_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Context__Group_5__0__Impl1258); 
             after(grammarAccess.getContextAccess().getSetsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_5__0__Impl"


    // $ANTLR start "rule__Context__Group_5__1"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:663:1: rule__Context__Group_5__1 : rule__Context__Group_5__1__Impl rule__Context__Group_5__2 ;
    public final void rule__Context__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:667:1: ( rule__Context__Group_5__1__Impl rule__Context__Group_5__2 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:668:2: rule__Context__Group_5__1__Impl rule__Context__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__Group_5__1__Impl_in_rule__Context__Group_5__11289);
            rule__Context__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Context__Group_5__2_in_rule__Context__Group_5__11292);
            rule__Context__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_5__1"


    // $ANTLR start "rule__Context__Group_5__1__Impl"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:675:1: rule__Context__Group_5__1__Impl : ( ( rule__Context__SetsAssignment_5_1 ) ) ;
    public final void rule__Context__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:679:1: ( ( ( rule__Context__SetsAssignment_5_1 ) ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:680:1: ( ( rule__Context__SetsAssignment_5_1 ) )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:680:1: ( ( rule__Context__SetsAssignment_5_1 ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:681:1: ( rule__Context__SetsAssignment_5_1 )
            {
             before(grammarAccess.getContextAccess().getSetsAssignment_5_1()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:682:1: ( rule__Context__SetsAssignment_5_1 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:682:2: rule__Context__SetsAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__SetsAssignment_5_1_in_rule__Context__Group_5__1__Impl1319);
            rule__Context__SetsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getContextAccess().getSetsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_5__1__Impl"


    // $ANTLR start "rule__Context__Group_5__2"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:692:1: rule__Context__Group_5__2 : rule__Context__Group_5__2__Impl ;
    public final void rule__Context__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:696:1: ( rule__Context__Group_5__2__Impl )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:697:2: rule__Context__Group_5__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__Group_5__2__Impl_in_rule__Context__Group_5__21349);
            rule__Context__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_5__2"


    // $ANTLR start "rule__Context__Group_5__2__Impl"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:703:1: rule__Context__Group_5__2__Impl : ( ( rule__Context__SetsAssignment_5_2 )* ) ;
    public final void rule__Context__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:707:1: ( ( ( rule__Context__SetsAssignment_5_2 )* ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:708:1: ( ( rule__Context__SetsAssignment_5_2 )* )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:708:1: ( ( rule__Context__SetsAssignment_5_2 )* )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:709:1: ( rule__Context__SetsAssignment_5_2 )*
            {
             before(grammarAccess.getContextAccess().getSetsAssignment_5_2()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:710:1: ( rule__Context__SetsAssignment_5_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_ID)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:710:2: rule__Context__SetsAssignment_5_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Context__SetsAssignment_5_2_in_rule__Context__Group_5__2__Impl1376);
            	    rule__Context__SetsAssignment_5_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getContextAccess().getSetsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_5__2__Impl"


    // $ANTLR start "rule__Context__Group_6__0"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:726:1: rule__Context__Group_6__0 : rule__Context__Group_6__0__Impl rule__Context__Group_6__1 ;
    public final void rule__Context__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:730:1: ( rule__Context__Group_6__0__Impl rule__Context__Group_6__1 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:731:2: rule__Context__Group_6__0__Impl rule__Context__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__Group_6__0__Impl_in_rule__Context__Group_6__01413);
            rule__Context__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Context__Group_6__1_in_rule__Context__Group_6__01416);
            rule__Context__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_6__0"


    // $ANTLR start "rule__Context__Group_6__0__Impl"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:738:1: rule__Context__Group_6__0__Impl : ( 'constants' ) ;
    public final void rule__Context__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:742:1: ( ( 'constants' ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:743:1: ( 'constants' )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:743:1: ( 'constants' )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:744:1: 'constants'
            {
             before(grammarAccess.getContextAccess().getConstantsKeyword_6_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Context__Group_6__0__Impl1444); 
             after(grammarAccess.getContextAccess().getConstantsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_6__0__Impl"


    // $ANTLR start "rule__Context__Group_6__1"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:757:1: rule__Context__Group_6__1 : rule__Context__Group_6__1__Impl rule__Context__Group_6__2 ;
    public final void rule__Context__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:761:1: ( rule__Context__Group_6__1__Impl rule__Context__Group_6__2 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:762:2: rule__Context__Group_6__1__Impl rule__Context__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__Group_6__1__Impl_in_rule__Context__Group_6__11475);
            rule__Context__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Context__Group_6__2_in_rule__Context__Group_6__11478);
            rule__Context__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_6__1"


    // $ANTLR start "rule__Context__Group_6__1__Impl"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:769:1: rule__Context__Group_6__1__Impl : ( ( rule__Context__ConstantsAssignment_6_1 ) ) ;
    public final void rule__Context__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:773:1: ( ( ( rule__Context__ConstantsAssignment_6_1 ) ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:774:1: ( ( rule__Context__ConstantsAssignment_6_1 ) )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:774:1: ( ( rule__Context__ConstantsAssignment_6_1 ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:775:1: ( rule__Context__ConstantsAssignment_6_1 )
            {
             before(grammarAccess.getContextAccess().getConstantsAssignment_6_1()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:776:1: ( rule__Context__ConstantsAssignment_6_1 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:776:2: rule__Context__ConstantsAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__ConstantsAssignment_6_1_in_rule__Context__Group_6__1__Impl1505);
            rule__Context__ConstantsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getContextAccess().getConstantsAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_6__1__Impl"


    // $ANTLR start "rule__Context__Group_6__2"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:786:1: rule__Context__Group_6__2 : rule__Context__Group_6__2__Impl ;
    public final void rule__Context__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:790:1: ( rule__Context__Group_6__2__Impl )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:791:2: rule__Context__Group_6__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__Group_6__2__Impl_in_rule__Context__Group_6__21535);
            rule__Context__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_6__2"


    // $ANTLR start "rule__Context__Group_6__2__Impl"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:797:1: rule__Context__Group_6__2__Impl : ( ( rule__Context__ConstantsAssignment_6_2 )* ) ;
    public final void rule__Context__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:801:1: ( ( ( rule__Context__ConstantsAssignment_6_2 )* ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:802:1: ( ( rule__Context__ConstantsAssignment_6_2 )* )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:802:1: ( ( rule__Context__ConstantsAssignment_6_2 )* )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:803:1: ( rule__Context__ConstantsAssignment_6_2 )*
            {
             before(grammarAccess.getContextAccess().getConstantsAssignment_6_2()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:804:1: ( rule__Context__ConstantsAssignment_6_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_ID)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:804:2: rule__Context__ConstantsAssignment_6_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Context__ConstantsAssignment_6_2_in_rule__Context__Group_6__2__Impl1562);
            	    rule__Context__ConstantsAssignment_6_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getContextAccess().getConstantsAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_6__2__Impl"


    // $ANTLR start "rule__Context__Group_7__0"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:820:1: rule__Context__Group_7__0 : rule__Context__Group_7__0__Impl rule__Context__Group_7__1 ;
    public final void rule__Context__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:824:1: ( rule__Context__Group_7__0__Impl rule__Context__Group_7__1 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:825:2: rule__Context__Group_7__0__Impl rule__Context__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__Group_7__0__Impl_in_rule__Context__Group_7__01599);
            rule__Context__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Context__Group_7__1_in_rule__Context__Group_7__01602);
            rule__Context__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_7__0"


    // $ANTLR start "rule__Context__Group_7__0__Impl"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:832:1: rule__Context__Group_7__0__Impl : ( 'axioms' ) ;
    public final void rule__Context__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:836:1: ( ( 'axioms' ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:837:1: ( 'axioms' )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:837:1: ( 'axioms' )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:838:1: 'axioms'
            {
             before(grammarAccess.getContextAccess().getAxiomsKeyword_7_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Context__Group_7__0__Impl1630); 
             after(grammarAccess.getContextAccess().getAxiomsKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_7__0__Impl"


    // $ANTLR start "rule__Context__Group_7__1"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:851:1: rule__Context__Group_7__1 : rule__Context__Group_7__1__Impl rule__Context__Group_7__2 ;
    public final void rule__Context__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:855:1: ( rule__Context__Group_7__1__Impl rule__Context__Group_7__2 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:856:2: rule__Context__Group_7__1__Impl rule__Context__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__Group_7__1__Impl_in_rule__Context__Group_7__11661);
            rule__Context__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Context__Group_7__2_in_rule__Context__Group_7__11664);
            rule__Context__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_7__1"


    // $ANTLR start "rule__Context__Group_7__1__Impl"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:863:1: rule__Context__Group_7__1__Impl : ( ( rule__Context__AxiomsAssignment_7_1 ) ) ;
    public final void rule__Context__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:867:1: ( ( ( rule__Context__AxiomsAssignment_7_1 ) ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:868:1: ( ( rule__Context__AxiomsAssignment_7_1 ) )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:868:1: ( ( rule__Context__AxiomsAssignment_7_1 ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:869:1: ( rule__Context__AxiomsAssignment_7_1 )
            {
             before(grammarAccess.getContextAccess().getAxiomsAssignment_7_1()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:870:1: ( rule__Context__AxiomsAssignment_7_1 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:870:2: rule__Context__AxiomsAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__AxiomsAssignment_7_1_in_rule__Context__Group_7__1__Impl1691);
            rule__Context__AxiomsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getContextAccess().getAxiomsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_7__1__Impl"


    // $ANTLR start "rule__Context__Group_7__2"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:880:1: rule__Context__Group_7__2 : rule__Context__Group_7__2__Impl ;
    public final void rule__Context__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:884:1: ( rule__Context__Group_7__2__Impl )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:885:2: rule__Context__Group_7__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__Group_7__2__Impl_in_rule__Context__Group_7__21721);
            rule__Context__Group_7__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_7__2"


    // $ANTLR start "rule__Context__Group_7__2__Impl"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:891:1: rule__Context__Group_7__2__Impl : ( ( rule__Context__AxiomsAssignment_7_2 )* ) ;
    public final void rule__Context__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:895:1: ( ( ( rule__Context__AxiomsAssignment_7_2 )* ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:896:1: ( ( rule__Context__AxiomsAssignment_7_2 )* )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:896:1: ( ( rule__Context__AxiomsAssignment_7_2 )* )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:897:1: ( rule__Context__AxiomsAssignment_7_2 )*
            {
             before(grammarAccess.getContextAccess().getAxiomsAssignment_7_2()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:898:1: ( rule__Context__AxiomsAssignment_7_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=18 && LA10_0<=19)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:898:2: rule__Context__AxiomsAssignment_7_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Context__AxiomsAssignment_7_2_in_rule__Context__Group_7__2__Impl1748);
            	    rule__Context__AxiomsAssignment_7_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getContextAccess().getAxiomsAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_7__2__Impl"


    // $ANTLR start "rule__CarrierSet__Group__0"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:914:1: rule__CarrierSet__Group__0 : rule__CarrierSet__Group__0__Impl rule__CarrierSet__Group__1 ;
    public final void rule__CarrierSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:918:1: ( rule__CarrierSet__Group__0__Impl rule__CarrierSet__Group__1 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:919:2: rule__CarrierSet__Group__0__Impl rule__CarrierSet__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CarrierSet__Group__0__Impl_in_rule__CarrierSet__Group__01785);
            rule__CarrierSet__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CarrierSet__Group__1_in_rule__CarrierSet__Group__01788);
            rule__CarrierSet__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CarrierSet__Group__0"


    // $ANTLR start "rule__CarrierSet__Group__0__Impl"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:926:1: rule__CarrierSet__Group__0__Impl : ( () ) ;
    public final void rule__CarrierSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:930:1: ( ( () ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:931:1: ( () )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:931:1: ( () )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:932:1: ()
            {
             before(grammarAccess.getCarrierSetAccess().getCarrierSetAction_0()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:933:1: ()
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:935:1: 
            {
            }

             after(grammarAccess.getCarrierSetAccess().getCarrierSetAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CarrierSet__Group__0__Impl"


    // $ANTLR start "rule__CarrierSet__Group__1"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:945:1: rule__CarrierSet__Group__1 : rule__CarrierSet__Group__1__Impl rule__CarrierSet__Group__2 ;
    public final void rule__CarrierSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:949:1: ( rule__CarrierSet__Group__1__Impl rule__CarrierSet__Group__2 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:950:2: rule__CarrierSet__Group__1__Impl rule__CarrierSet__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CarrierSet__Group__1__Impl_in_rule__CarrierSet__Group__11846);
            rule__CarrierSet__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CarrierSet__Group__2_in_rule__CarrierSet__Group__11849);
            rule__CarrierSet__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CarrierSet__Group__1"


    // $ANTLR start "rule__CarrierSet__Group__1__Impl"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:957:1: rule__CarrierSet__Group__1__Impl : ( ( rule__CarrierSet__NameAssignment_1 ) ) ;
    public final void rule__CarrierSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:961:1: ( ( ( rule__CarrierSet__NameAssignment_1 ) ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:962:1: ( ( rule__CarrierSet__NameAssignment_1 ) )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:962:1: ( ( rule__CarrierSet__NameAssignment_1 ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:963:1: ( rule__CarrierSet__NameAssignment_1 )
            {
             before(grammarAccess.getCarrierSetAccess().getNameAssignment_1()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:964:1: ( rule__CarrierSet__NameAssignment_1 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:964:2: rule__CarrierSet__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CarrierSet__NameAssignment_1_in_rule__CarrierSet__Group__1__Impl1876);
            rule__CarrierSet__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCarrierSetAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CarrierSet__Group__1__Impl"


    // $ANTLR start "rule__CarrierSet__Group__2"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:974:1: rule__CarrierSet__Group__2 : rule__CarrierSet__Group__2__Impl ;
    public final void rule__CarrierSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:978:1: ( rule__CarrierSet__Group__2__Impl )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:979:2: rule__CarrierSet__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CarrierSet__Group__2__Impl_in_rule__CarrierSet__Group__21906);
            rule__CarrierSet__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CarrierSet__Group__2"


    // $ANTLR start "rule__CarrierSet__Group__2__Impl"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:985:1: rule__CarrierSet__Group__2__Impl : ( ( rule__CarrierSet__Group_2__0 )? ) ;
    public final void rule__CarrierSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:989:1: ( ( ( rule__CarrierSet__Group_2__0 )? ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:990:1: ( ( rule__CarrierSet__Group_2__0 )? )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:990:1: ( ( rule__CarrierSet__Group_2__0 )? )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:991:1: ( rule__CarrierSet__Group_2__0 )?
            {
             before(grammarAccess.getCarrierSetAccess().getGroup_2()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:992:1: ( rule__CarrierSet__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:992:2: rule__CarrierSet__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__CarrierSet__Group_2__0_in_rule__CarrierSet__Group__2__Impl1933);
                    rule__CarrierSet__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCarrierSetAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CarrierSet__Group__2__Impl"


    // $ANTLR start "rule__CarrierSet__Group_2__0"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1008:1: rule__CarrierSet__Group_2__0 : rule__CarrierSet__Group_2__0__Impl rule__CarrierSet__Group_2__1 ;
    public final void rule__CarrierSet__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1012:1: ( rule__CarrierSet__Group_2__0__Impl rule__CarrierSet__Group_2__1 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1013:2: rule__CarrierSet__Group_2__0__Impl rule__CarrierSet__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CarrierSet__Group_2__0__Impl_in_rule__CarrierSet__Group_2__01970);
            rule__CarrierSet__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CarrierSet__Group_2__1_in_rule__CarrierSet__Group_2__01973);
            rule__CarrierSet__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CarrierSet__Group_2__0"


    // $ANTLR start "rule__CarrierSet__Group_2__0__Impl"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1020:1: rule__CarrierSet__Group_2__0__Impl : ( '//' ) ;
    public final void rule__CarrierSet__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1024:1: ( ( '//' ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1025:1: ( '//' )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1025:1: ( '//' )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1026:1: '//'
            {
             before(grammarAccess.getCarrierSetAccess().getSolidusSolidusKeyword_2_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__CarrierSet__Group_2__0__Impl2001); 
             after(grammarAccess.getCarrierSetAccess().getSolidusSolidusKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CarrierSet__Group_2__0__Impl"


    // $ANTLR start "rule__CarrierSet__Group_2__1"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1039:1: rule__CarrierSet__Group_2__1 : rule__CarrierSet__Group_2__1__Impl ;
    public final void rule__CarrierSet__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1043:1: ( rule__CarrierSet__Group_2__1__Impl )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1044:2: rule__CarrierSet__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CarrierSet__Group_2__1__Impl_in_rule__CarrierSet__Group_2__12032);
            rule__CarrierSet__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CarrierSet__Group_2__1"


    // $ANTLR start "rule__CarrierSet__Group_2__1__Impl"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1050:1: rule__CarrierSet__Group_2__1__Impl : ( ( rule__CarrierSet__CommentAssignment_2_1 ) ) ;
    public final void rule__CarrierSet__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1054:1: ( ( ( rule__CarrierSet__CommentAssignment_2_1 ) ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1055:1: ( ( rule__CarrierSet__CommentAssignment_2_1 ) )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1055:1: ( ( rule__CarrierSet__CommentAssignment_2_1 ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1056:1: ( rule__CarrierSet__CommentAssignment_2_1 )
            {
             before(grammarAccess.getCarrierSetAccess().getCommentAssignment_2_1()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1057:1: ( rule__CarrierSet__CommentAssignment_2_1 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1057:2: rule__CarrierSet__CommentAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CarrierSet__CommentAssignment_2_1_in_rule__CarrierSet__Group_2__1__Impl2059);
            rule__CarrierSet__CommentAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCarrierSetAccess().getCommentAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CarrierSet__Group_2__1__Impl"


    // $ANTLR start "rule__Constant__Group__0"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1071:1: rule__Constant__Group__0 : rule__Constant__Group__0__Impl rule__Constant__Group__1 ;
    public final void rule__Constant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1075:1: ( rule__Constant__Group__0__Impl rule__Constant__Group__1 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1076:2: rule__Constant__Group__0__Impl rule__Constant__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constant__Group__0__Impl_in_rule__Constant__Group__02093);
            rule__Constant__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Constant__Group__1_in_rule__Constant__Group__02096);
            rule__Constant__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__0"


    // $ANTLR start "rule__Constant__Group__0__Impl"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1083:1: rule__Constant__Group__0__Impl : ( () ) ;
    public final void rule__Constant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1087:1: ( ( () ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1088:1: ( () )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1088:1: ( () )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1089:1: ()
            {
             before(grammarAccess.getConstantAccess().getConstantAction_0()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1090:1: ()
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1092:1: 
            {
            }

             after(grammarAccess.getConstantAccess().getConstantAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__0__Impl"


    // $ANTLR start "rule__Constant__Group__1"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1102:1: rule__Constant__Group__1 : rule__Constant__Group__1__Impl rule__Constant__Group__2 ;
    public final void rule__Constant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1106:1: ( rule__Constant__Group__1__Impl rule__Constant__Group__2 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1107:2: rule__Constant__Group__1__Impl rule__Constant__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constant__Group__1__Impl_in_rule__Constant__Group__12154);
            rule__Constant__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Constant__Group__2_in_rule__Constant__Group__12157);
            rule__Constant__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__1"


    // $ANTLR start "rule__Constant__Group__1__Impl"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1114:1: rule__Constant__Group__1__Impl : ( ( rule__Constant__NameAssignment_1 ) ) ;
    public final void rule__Constant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1118:1: ( ( ( rule__Constant__NameAssignment_1 ) ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1119:1: ( ( rule__Constant__NameAssignment_1 ) )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1119:1: ( ( rule__Constant__NameAssignment_1 ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1120:1: ( rule__Constant__NameAssignment_1 )
            {
             before(grammarAccess.getConstantAccess().getNameAssignment_1()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1121:1: ( rule__Constant__NameAssignment_1 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1121:2: rule__Constant__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constant__NameAssignment_1_in_rule__Constant__Group__1__Impl2184);
            rule__Constant__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__1__Impl"


    // $ANTLR start "rule__Constant__Group__2"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1131:1: rule__Constant__Group__2 : rule__Constant__Group__2__Impl ;
    public final void rule__Constant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1135:1: ( rule__Constant__Group__2__Impl )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1136:2: rule__Constant__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constant__Group__2__Impl_in_rule__Constant__Group__22214);
            rule__Constant__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__2"


    // $ANTLR start "rule__Constant__Group__2__Impl"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1142:1: rule__Constant__Group__2__Impl : ( ( rule__Constant__Group_2__0 )? ) ;
    public final void rule__Constant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1146:1: ( ( ( rule__Constant__Group_2__0 )? ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1147:1: ( ( rule__Constant__Group_2__0 )? )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1147:1: ( ( rule__Constant__Group_2__0 )? )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1148:1: ( rule__Constant__Group_2__0 )?
            {
             before(grammarAccess.getConstantAccess().getGroup_2()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1149:1: ( rule__Constant__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==17) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1149:2: rule__Constant__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Constant__Group_2__0_in_rule__Constant__Group__2__Impl2241);
                    rule__Constant__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstantAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__2__Impl"


    // $ANTLR start "rule__Constant__Group_2__0"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1165:1: rule__Constant__Group_2__0 : rule__Constant__Group_2__0__Impl rule__Constant__Group_2__1 ;
    public final void rule__Constant__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1169:1: ( rule__Constant__Group_2__0__Impl rule__Constant__Group_2__1 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1170:2: rule__Constant__Group_2__0__Impl rule__Constant__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constant__Group_2__0__Impl_in_rule__Constant__Group_2__02278);
            rule__Constant__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Constant__Group_2__1_in_rule__Constant__Group_2__02281);
            rule__Constant__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group_2__0"


    // $ANTLR start "rule__Constant__Group_2__0__Impl"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1177:1: rule__Constant__Group_2__0__Impl : ( '//' ) ;
    public final void rule__Constant__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1181:1: ( ( '//' ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1182:1: ( '//' )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1182:1: ( '//' )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1183:1: '//'
            {
             before(grammarAccess.getConstantAccess().getSolidusSolidusKeyword_2_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Constant__Group_2__0__Impl2309); 
             after(grammarAccess.getConstantAccess().getSolidusSolidusKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group_2__0__Impl"


    // $ANTLR start "rule__Constant__Group_2__1"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1196:1: rule__Constant__Group_2__1 : rule__Constant__Group_2__1__Impl ;
    public final void rule__Constant__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1200:1: ( rule__Constant__Group_2__1__Impl )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1201:2: rule__Constant__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constant__Group_2__1__Impl_in_rule__Constant__Group_2__12340);
            rule__Constant__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group_2__1"


    // $ANTLR start "rule__Constant__Group_2__1__Impl"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1207:1: rule__Constant__Group_2__1__Impl : ( ( rule__Constant__CommentAssignment_2_1 ) ) ;
    public final void rule__Constant__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1211:1: ( ( ( rule__Constant__CommentAssignment_2_1 ) ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1212:1: ( ( rule__Constant__CommentAssignment_2_1 ) )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1212:1: ( ( rule__Constant__CommentAssignment_2_1 ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1213:1: ( rule__Constant__CommentAssignment_2_1 )
            {
             before(grammarAccess.getConstantAccess().getCommentAssignment_2_1()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1214:1: ( rule__Constant__CommentAssignment_2_1 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1214:2: rule__Constant__CommentAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constant__CommentAssignment_2_1_in_rule__Constant__Group_2__1__Impl2367);
            rule__Constant__CommentAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getCommentAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group_2__1__Impl"


    // $ANTLR start "rule__Axiom__Group__0"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1228:1: rule__Axiom__Group__0 : rule__Axiom__Group__0__Impl rule__Axiom__Group__1 ;
    public final void rule__Axiom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1232:1: ( rule__Axiom__Group__0__Impl rule__Axiom__Group__1 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1233:2: rule__Axiom__Group__0__Impl rule__Axiom__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axiom__Group__0__Impl_in_rule__Axiom__Group__02401);
            rule__Axiom__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axiom__Group__1_in_rule__Axiom__Group__02404);
            rule__Axiom__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axiom__Group__0"


    // $ANTLR start "rule__Axiom__Group__0__Impl"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1240:1: rule__Axiom__Group__0__Impl : ( ( rule__Axiom__TheoremAssignment_0 )? ) ;
    public final void rule__Axiom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1244:1: ( ( ( rule__Axiom__TheoremAssignment_0 )? ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1245:1: ( ( rule__Axiom__TheoremAssignment_0 )? )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1245:1: ( ( rule__Axiom__TheoremAssignment_0 )? )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1246:1: ( rule__Axiom__TheoremAssignment_0 )?
            {
             before(grammarAccess.getAxiomAccess().getTheoremAssignment_0()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1247:1: ( rule__Axiom__TheoremAssignment_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1247:2: rule__Axiom__TheoremAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Axiom__TheoremAssignment_0_in_rule__Axiom__Group__0__Impl2431);
                    rule__Axiom__TheoremAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAxiomAccess().getTheoremAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axiom__Group__0__Impl"


    // $ANTLR start "rule__Axiom__Group__1"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1257:1: rule__Axiom__Group__1 : rule__Axiom__Group__1__Impl rule__Axiom__Group__2 ;
    public final void rule__Axiom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1261:1: ( rule__Axiom__Group__1__Impl rule__Axiom__Group__2 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1262:2: rule__Axiom__Group__1__Impl rule__Axiom__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axiom__Group__1__Impl_in_rule__Axiom__Group__12462);
            rule__Axiom__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axiom__Group__2_in_rule__Axiom__Group__12465);
            rule__Axiom__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axiom__Group__1"


    // $ANTLR start "rule__Axiom__Group__1__Impl"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1269:1: rule__Axiom__Group__1__Impl : ( '@' ) ;
    public final void rule__Axiom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1273:1: ( ( '@' ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1274:1: ( '@' )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1274:1: ( '@' )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1275:1: '@'
            {
             before(grammarAccess.getAxiomAccess().getCommercialAtKeyword_1()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Axiom__Group__1__Impl2493); 
             after(grammarAccess.getAxiomAccess().getCommercialAtKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axiom__Group__1__Impl"


    // $ANTLR start "rule__Axiom__Group__2"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1288:1: rule__Axiom__Group__2 : rule__Axiom__Group__2__Impl rule__Axiom__Group__3 ;
    public final void rule__Axiom__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1292:1: ( rule__Axiom__Group__2__Impl rule__Axiom__Group__3 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1293:2: rule__Axiom__Group__2__Impl rule__Axiom__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axiom__Group__2__Impl_in_rule__Axiom__Group__22524);
            rule__Axiom__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axiom__Group__3_in_rule__Axiom__Group__22527);
            rule__Axiom__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axiom__Group__2"


    // $ANTLR start "rule__Axiom__Group__2__Impl"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1300:1: rule__Axiom__Group__2__Impl : ( ( rule__Axiom__NameAssignment_2 ) ) ;
    public final void rule__Axiom__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1304:1: ( ( ( rule__Axiom__NameAssignment_2 ) ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1305:1: ( ( rule__Axiom__NameAssignment_2 ) )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1305:1: ( ( rule__Axiom__NameAssignment_2 ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1306:1: ( rule__Axiom__NameAssignment_2 )
            {
             before(grammarAccess.getAxiomAccess().getNameAssignment_2()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1307:1: ( rule__Axiom__NameAssignment_2 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1307:2: rule__Axiom__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axiom__NameAssignment_2_in_rule__Axiom__Group__2__Impl2554);
            rule__Axiom__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAxiomAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axiom__Group__2__Impl"


    // $ANTLR start "rule__Axiom__Group__3"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1317:1: rule__Axiom__Group__3 : rule__Axiom__Group__3__Impl rule__Axiom__Group__4 ;
    public final void rule__Axiom__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1321:1: ( rule__Axiom__Group__3__Impl rule__Axiom__Group__4 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1322:2: rule__Axiom__Group__3__Impl rule__Axiom__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axiom__Group__3__Impl_in_rule__Axiom__Group__32584);
            rule__Axiom__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axiom__Group__4_in_rule__Axiom__Group__32587);
            rule__Axiom__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axiom__Group__3"


    // $ANTLR start "rule__Axiom__Group__3__Impl"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1329:1: rule__Axiom__Group__3__Impl : ( ( rule__Axiom__Group_3__0 )? ) ;
    public final void rule__Axiom__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1333:1: ( ( ( rule__Axiom__Group_3__0 )? ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1334:1: ( ( rule__Axiom__Group_3__0 )? )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1334:1: ( ( rule__Axiom__Group_3__0 )? )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1335:1: ( rule__Axiom__Group_3__0 )?
            {
             before(grammarAccess.getAxiomAccess().getGroup_3()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1336:1: ( rule__Axiom__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==17) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1336:2: rule__Axiom__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Axiom__Group_3__0_in_rule__Axiom__Group__3__Impl2614);
                    rule__Axiom__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAxiomAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axiom__Group__3__Impl"


    // $ANTLR start "rule__Axiom__Group__4"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1346:1: rule__Axiom__Group__4 : rule__Axiom__Group__4__Impl ;
    public final void rule__Axiom__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1350:1: ( rule__Axiom__Group__4__Impl )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1351:2: rule__Axiom__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axiom__Group__4__Impl_in_rule__Axiom__Group__42645);
            rule__Axiom__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axiom__Group__4"


    // $ANTLR start "rule__Axiom__Group__4__Impl"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1357:1: rule__Axiom__Group__4__Impl : ( ( rule__Axiom__PredicateAssignment_4 ) ) ;
    public final void rule__Axiom__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1361:1: ( ( ( rule__Axiom__PredicateAssignment_4 ) ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1362:1: ( ( rule__Axiom__PredicateAssignment_4 ) )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1362:1: ( ( rule__Axiom__PredicateAssignment_4 ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1363:1: ( rule__Axiom__PredicateAssignment_4 )
            {
             before(grammarAccess.getAxiomAccess().getPredicateAssignment_4()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1364:1: ( rule__Axiom__PredicateAssignment_4 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1364:2: rule__Axiom__PredicateAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axiom__PredicateAssignment_4_in_rule__Axiom__Group__4__Impl2672);
            rule__Axiom__PredicateAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAxiomAccess().getPredicateAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axiom__Group__4__Impl"


    // $ANTLR start "rule__Axiom__Group_3__0"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1384:1: rule__Axiom__Group_3__0 : rule__Axiom__Group_3__0__Impl rule__Axiom__Group_3__1 ;
    public final void rule__Axiom__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1388:1: ( rule__Axiom__Group_3__0__Impl rule__Axiom__Group_3__1 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1389:2: rule__Axiom__Group_3__0__Impl rule__Axiom__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axiom__Group_3__0__Impl_in_rule__Axiom__Group_3__02712);
            rule__Axiom__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axiom__Group_3__1_in_rule__Axiom__Group_3__02715);
            rule__Axiom__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axiom__Group_3__0"


    // $ANTLR start "rule__Axiom__Group_3__0__Impl"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1396:1: rule__Axiom__Group_3__0__Impl : ( '//' ) ;
    public final void rule__Axiom__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1400:1: ( ( '//' ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1401:1: ( '//' )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1401:1: ( '//' )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1402:1: '//'
            {
             before(grammarAccess.getAxiomAccess().getSolidusSolidusKeyword_3_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Axiom__Group_3__0__Impl2743); 
             after(grammarAccess.getAxiomAccess().getSolidusSolidusKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axiom__Group_3__0__Impl"


    // $ANTLR start "rule__Axiom__Group_3__1"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1415:1: rule__Axiom__Group_3__1 : rule__Axiom__Group_3__1__Impl ;
    public final void rule__Axiom__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1419:1: ( rule__Axiom__Group_3__1__Impl )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1420:2: rule__Axiom__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axiom__Group_3__1__Impl_in_rule__Axiom__Group_3__12774);
            rule__Axiom__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axiom__Group_3__1"


    // $ANTLR start "rule__Axiom__Group_3__1__Impl"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1426:1: rule__Axiom__Group_3__1__Impl : ( ( rule__Axiom__CommentAssignment_3_1 ) ) ;
    public final void rule__Axiom__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1430:1: ( ( ( rule__Axiom__CommentAssignment_3_1 ) ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1431:1: ( ( rule__Axiom__CommentAssignment_3_1 ) )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1431:1: ( ( rule__Axiom__CommentAssignment_3_1 ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1432:1: ( rule__Axiom__CommentAssignment_3_1 )
            {
             before(grammarAccess.getAxiomAccess().getCommentAssignment_3_1()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1433:1: ( rule__Axiom__CommentAssignment_3_1 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1433:2: rule__Axiom__CommentAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axiom__CommentAssignment_3_1_in_rule__Axiom__Group_3__1__Impl2801);
            rule__Axiom__CommentAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAxiomAccess().getCommentAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axiom__Group_3__1__Impl"


    // $ANTLR start "rule__Context__NameAssignment_2"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1448:1: rule__Context__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Context__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1452:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1453:1: ( ruleEString )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1453:1: ( ruleEString )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1454:1: ruleEString
            {
             before(grammarAccess.getContextAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Context__NameAssignment_22840);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getContextAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__NameAssignment_2"


    // $ANTLR start "rule__Context__CommentAssignment_3_1"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1463:1: rule__Context__CommentAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Context__CommentAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1467:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1468:1: ( ruleEString )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1468:1: ( ruleEString )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1469:1: ruleEString
            {
             before(grammarAccess.getContextAccess().getCommentEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Context__CommentAssignment_3_12871);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getContextAccess().getCommentEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__CommentAssignment_3_1"


    // $ANTLR start "rule__Context__ExtendsAssignment_4_1"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1478:1: rule__Context__ExtendsAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Context__ExtendsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1482:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1483:1: ( ( ruleEString ) )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1483:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1484:1: ( ruleEString )
            {
             before(grammarAccess.getContextAccess().getExtendsContextCrossReference_4_1_0()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1485:1: ( ruleEString )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1486:1: ruleEString
            {
             before(grammarAccess.getContextAccess().getExtendsContextEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Context__ExtendsAssignment_4_12906);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getContextAccess().getExtendsContextEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getContextAccess().getExtendsContextCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__ExtendsAssignment_4_1"


    // $ANTLR start "rule__Context__ExtendsAssignment_4_2"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1497:1: rule__Context__ExtendsAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__Context__ExtendsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1501:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1502:1: ( ( ruleEString ) )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1502:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1503:1: ( ruleEString )
            {
             before(grammarAccess.getContextAccess().getExtendsContextCrossReference_4_2_0()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1504:1: ( ruleEString )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1505:1: ruleEString
            {
             before(grammarAccess.getContextAccess().getExtendsContextEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Context__ExtendsAssignment_4_22945);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getContextAccess().getExtendsContextEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getContextAccess().getExtendsContextCrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__ExtendsAssignment_4_2"


    // $ANTLR start "rule__Context__SetsAssignment_5_1"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1516:1: rule__Context__SetsAssignment_5_1 : ( ruleCarrierSet ) ;
    public final void rule__Context__SetsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1520:1: ( ( ruleCarrierSet ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1521:1: ( ruleCarrierSet )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1521:1: ( ruleCarrierSet )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1522:1: ruleCarrierSet
            {
             before(grammarAccess.getContextAccess().getSetsCarrierSetParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCarrierSet_in_rule__Context__SetsAssignment_5_12980);
            ruleCarrierSet();

            state._fsp--;

             after(grammarAccess.getContextAccess().getSetsCarrierSetParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__SetsAssignment_5_1"


    // $ANTLR start "rule__Context__SetsAssignment_5_2"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1531:1: rule__Context__SetsAssignment_5_2 : ( ruleCarrierSet ) ;
    public final void rule__Context__SetsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1535:1: ( ( ruleCarrierSet ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1536:1: ( ruleCarrierSet )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1536:1: ( ruleCarrierSet )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1537:1: ruleCarrierSet
            {
             before(grammarAccess.getContextAccess().getSetsCarrierSetParserRuleCall_5_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCarrierSet_in_rule__Context__SetsAssignment_5_23011);
            ruleCarrierSet();

            state._fsp--;

             after(grammarAccess.getContextAccess().getSetsCarrierSetParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__SetsAssignment_5_2"


    // $ANTLR start "rule__Context__ConstantsAssignment_6_1"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1546:1: rule__Context__ConstantsAssignment_6_1 : ( ruleConstant ) ;
    public final void rule__Context__ConstantsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1550:1: ( ( ruleConstant ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1551:1: ( ruleConstant )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1551:1: ( ruleConstant )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1552:1: ruleConstant
            {
             before(grammarAccess.getContextAccess().getConstantsConstantParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstant_in_rule__Context__ConstantsAssignment_6_13042);
            ruleConstant();

            state._fsp--;

             after(grammarAccess.getContextAccess().getConstantsConstantParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__ConstantsAssignment_6_1"


    // $ANTLR start "rule__Context__ConstantsAssignment_6_2"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1561:1: rule__Context__ConstantsAssignment_6_2 : ( ruleConstant ) ;
    public final void rule__Context__ConstantsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1565:1: ( ( ruleConstant ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1566:1: ( ruleConstant )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1566:1: ( ruleConstant )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1567:1: ruleConstant
            {
             before(grammarAccess.getContextAccess().getConstantsConstantParserRuleCall_6_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstant_in_rule__Context__ConstantsAssignment_6_23073);
            ruleConstant();

            state._fsp--;

             after(grammarAccess.getContextAccess().getConstantsConstantParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__ConstantsAssignment_6_2"


    // $ANTLR start "rule__Context__AxiomsAssignment_7_1"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1576:1: rule__Context__AxiomsAssignment_7_1 : ( ruleAxiom ) ;
    public final void rule__Context__AxiomsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1580:1: ( ( ruleAxiom ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1581:1: ( ruleAxiom )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1581:1: ( ruleAxiom )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1582:1: ruleAxiom
            {
             before(grammarAccess.getContextAccess().getAxiomsAxiomParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAxiom_in_rule__Context__AxiomsAssignment_7_13104);
            ruleAxiom();

            state._fsp--;

             after(grammarAccess.getContextAccess().getAxiomsAxiomParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__AxiomsAssignment_7_1"


    // $ANTLR start "rule__Context__AxiomsAssignment_7_2"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1591:1: rule__Context__AxiomsAssignment_7_2 : ( ruleAxiom ) ;
    public final void rule__Context__AxiomsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1595:1: ( ( ruleAxiom ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1596:1: ( ruleAxiom )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1596:1: ( ruleAxiom )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1597:1: ruleAxiom
            {
             before(grammarAccess.getContextAccess().getAxiomsAxiomParserRuleCall_7_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAxiom_in_rule__Context__AxiomsAssignment_7_23135);
            ruleAxiom();

            state._fsp--;

             after(grammarAccess.getContextAccess().getAxiomsAxiomParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__AxiomsAssignment_7_2"


    // $ANTLR start "rule__CarrierSet__NameAssignment_1"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1606:1: rule__CarrierSet__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__CarrierSet__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1610:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1611:1: ( ruleEString )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1611:1: ( ruleEString )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1612:1: ruleEString
            {
             before(grammarAccess.getCarrierSetAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__CarrierSet__NameAssignment_13166);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCarrierSetAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CarrierSet__NameAssignment_1"


    // $ANTLR start "rule__CarrierSet__CommentAssignment_2_1"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1621:1: rule__CarrierSet__CommentAssignment_2_1 : ( ruleEString ) ;
    public final void rule__CarrierSet__CommentAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1625:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1626:1: ( ruleEString )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1626:1: ( ruleEString )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1627:1: ruleEString
            {
             before(grammarAccess.getCarrierSetAccess().getCommentEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__CarrierSet__CommentAssignment_2_13197);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCarrierSetAccess().getCommentEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CarrierSet__CommentAssignment_2_1"


    // $ANTLR start "rule__Constant__NameAssignment_1"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1636:1: rule__Constant__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Constant__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1640:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1641:1: ( ruleEString )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1641:1: ( ruleEString )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1642:1: ruleEString
            {
             before(grammarAccess.getConstantAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Constant__NameAssignment_13228);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConstantAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__NameAssignment_1"


    // $ANTLR start "rule__Constant__CommentAssignment_2_1"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1651:1: rule__Constant__CommentAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Constant__CommentAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1655:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1656:1: ( ruleEString )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1656:1: ( ruleEString )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1657:1: ruleEString
            {
             before(grammarAccess.getConstantAccess().getCommentEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Constant__CommentAssignment_2_13259);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConstantAccess().getCommentEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__CommentAssignment_2_1"


    // $ANTLR start "rule__Axiom__TheoremAssignment_0"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1666:1: rule__Axiom__TheoremAssignment_0 : ( ( 'theorem' ) ) ;
    public final void rule__Axiom__TheoremAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1670:1: ( ( ( 'theorem' ) ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1671:1: ( ( 'theorem' ) )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1671:1: ( ( 'theorem' ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1672:1: ( 'theorem' )
            {
             before(grammarAccess.getAxiomAccess().getTheoremTheoremKeyword_0_0()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1673:1: ( 'theorem' )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1674:1: 'theorem'
            {
             before(grammarAccess.getAxiomAccess().getTheoremTheoremKeyword_0_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Axiom__TheoremAssignment_03295); 
             after(grammarAccess.getAxiomAccess().getTheoremTheoremKeyword_0_0()); 

            }

             after(grammarAccess.getAxiomAccess().getTheoremTheoremKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axiom__TheoremAssignment_0"


    // $ANTLR start "rule__Axiom__NameAssignment_2"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1689:1: rule__Axiom__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Axiom__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1693:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1694:1: ( ruleEString )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1694:1: ( ruleEString )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1695:1: ruleEString
            {
             before(grammarAccess.getAxiomAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Axiom__NameAssignment_23334);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAxiomAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axiom__NameAssignment_2"


    // $ANTLR start "rule__Axiom__CommentAssignment_3_1"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1704:1: rule__Axiom__CommentAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Axiom__CommentAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1708:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1709:1: ( ruleEString )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1709:1: ( ruleEString )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1710:1: ruleEString
            {
             before(grammarAccess.getAxiomAccess().getCommentEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Axiom__CommentAssignment_3_13365);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAxiomAccess().getCommentEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axiom__CommentAssignment_3_1"


    // $ANTLR start "rule__Axiom__PredicateAssignment_4"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1719:1: rule__Axiom__PredicateAssignment_4 : ( ruleEString ) ;
    public final void rule__Axiom__PredicateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1723:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1724:1: ( ruleEString )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1724:1: ( ruleEString )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1725:1: ruleEString
            {
             before(grammarAccess.getAxiomAccess().getPredicateEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Axiom__PredicateAssignment_43396);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAxiomAccess().getPredicateEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axiom__PredicateAssignment_4"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleContext_in_entryRuleContext61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleContext68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__Group__0_in_ruleContext94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCarrierSet_in_entryRuleCarrierSet181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCarrierSet188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CarrierSet__Group__0_in_ruleCarrierSet214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstant248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constant__Group__0_in_ruleConstant274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAxiom_in_entryRuleAxiom301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAxiom308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axiom__Group__0_in_ruleAxiom334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__Group__0__Impl_in_rule__Context__Group__0417 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Context__Group__1_in_rule__Context__Group__0420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__Group__1__Impl_in_rule__Context__Group__1478 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Context__Group__2_in_rule__Context__Group__1481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Context__Group__1__Impl509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__Group__2__Impl_in_rule__Context__Group__2540 = new BitSet(new long[]{0x000000000001F000L});
        public static final BitSet FOLLOW_rule__Context__Group__3_in_rule__Context__Group__2543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__NameAssignment_2_in_rule__Context__Group__2__Impl570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__Group__3__Impl_in_rule__Context__Group__3600 = new BitSet(new long[]{0x000000000001F000L});
        public static final BitSet FOLLOW_rule__Context__Group__4_in_rule__Context__Group__3603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__Group_3__0_in_rule__Context__Group__3__Impl630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__Group__4__Impl_in_rule__Context__Group__4661 = new BitSet(new long[]{0x000000000001F000L});
        public static final BitSet FOLLOW_rule__Context__Group__5_in_rule__Context__Group__4664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__Group_4__0_in_rule__Context__Group__4__Impl691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__Group__5__Impl_in_rule__Context__Group__5722 = new BitSet(new long[]{0x000000000001F000L});
        public static final BitSet FOLLOW_rule__Context__Group__6_in_rule__Context__Group__5725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__Group_5__0_in_rule__Context__Group__5__Impl752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__Group__6__Impl_in_rule__Context__Group__6783 = new BitSet(new long[]{0x000000000001F000L});
        public static final BitSet FOLLOW_rule__Context__Group__7_in_rule__Context__Group__6786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__Group_6__0_in_rule__Context__Group__6__Impl813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__Group__7__Impl_in_rule__Context__Group__7844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__Group_7__0_in_rule__Context__Group__7__Impl871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__Group_3__0__Impl_in_rule__Context__Group_3__0918 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Context__Group_3__1_in_rule__Context__Group_3__0921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Context__Group_3__0__Impl949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__Group_3__1__Impl_in_rule__Context__Group_3__1980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__CommentAssignment_3_1_in_rule__Context__Group_3__1__Impl1007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__Group_4__0__Impl_in_rule__Context__Group_4__01041 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Context__Group_4__1_in_rule__Context__Group_4__01044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Context__Group_4__0__Impl1072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__Group_4__1__Impl_in_rule__Context__Group_4__11103 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Context__Group_4__2_in_rule__Context__Group_4__11106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__ExtendsAssignment_4_1_in_rule__Context__Group_4__1__Impl1133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__Group_4__2__Impl_in_rule__Context__Group_4__21163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__ExtendsAssignment_4_2_in_rule__Context__Group_4__2__Impl1190 = new BitSet(new long[]{0x0000000000000032L});
        public static final BitSet FOLLOW_rule__Context__Group_5__0__Impl_in_rule__Context__Group_5__01227 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Context__Group_5__1_in_rule__Context__Group_5__01230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Context__Group_5__0__Impl1258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__Group_5__1__Impl_in_rule__Context__Group_5__11289 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Context__Group_5__2_in_rule__Context__Group_5__11292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__SetsAssignment_5_1_in_rule__Context__Group_5__1__Impl1319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__Group_5__2__Impl_in_rule__Context__Group_5__21349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__SetsAssignment_5_2_in_rule__Context__Group_5__2__Impl1376 = new BitSet(new long[]{0x0000000000000032L});
        public static final BitSet FOLLOW_rule__Context__Group_6__0__Impl_in_rule__Context__Group_6__01413 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Context__Group_6__1_in_rule__Context__Group_6__01416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Context__Group_6__0__Impl1444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__Group_6__1__Impl_in_rule__Context__Group_6__11475 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Context__Group_6__2_in_rule__Context__Group_6__11478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__ConstantsAssignment_6_1_in_rule__Context__Group_6__1__Impl1505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__Group_6__2__Impl_in_rule__Context__Group_6__21535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__ConstantsAssignment_6_2_in_rule__Context__Group_6__2__Impl1562 = new BitSet(new long[]{0x0000000000000032L});
        public static final BitSet FOLLOW_rule__Context__Group_7__0__Impl_in_rule__Context__Group_7__01599 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_rule__Context__Group_7__1_in_rule__Context__Group_7__01602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Context__Group_7__0__Impl1630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__Group_7__1__Impl_in_rule__Context__Group_7__11661 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_rule__Context__Group_7__2_in_rule__Context__Group_7__11664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__AxiomsAssignment_7_1_in_rule__Context__Group_7__1__Impl1691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__Group_7__2__Impl_in_rule__Context__Group_7__21721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__AxiomsAssignment_7_2_in_rule__Context__Group_7__2__Impl1748 = new BitSet(new long[]{0x00000000000C0002L});
        public static final BitSet FOLLOW_rule__CarrierSet__Group__0__Impl_in_rule__CarrierSet__Group__01785 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__CarrierSet__Group__1_in_rule__CarrierSet__Group__01788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CarrierSet__Group__1__Impl_in_rule__CarrierSet__Group__11846 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__CarrierSet__Group__2_in_rule__CarrierSet__Group__11849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CarrierSet__NameAssignment_1_in_rule__CarrierSet__Group__1__Impl1876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CarrierSet__Group__2__Impl_in_rule__CarrierSet__Group__21906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CarrierSet__Group_2__0_in_rule__CarrierSet__Group__2__Impl1933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CarrierSet__Group_2__0__Impl_in_rule__CarrierSet__Group_2__01970 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__CarrierSet__Group_2__1_in_rule__CarrierSet__Group_2__01973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__CarrierSet__Group_2__0__Impl2001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CarrierSet__Group_2__1__Impl_in_rule__CarrierSet__Group_2__12032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CarrierSet__CommentAssignment_2_1_in_rule__CarrierSet__Group_2__1__Impl2059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constant__Group__0__Impl_in_rule__Constant__Group__02093 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Constant__Group__1_in_rule__Constant__Group__02096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constant__Group__1__Impl_in_rule__Constant__Group__12154 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Constant__Group__2_in_rule__Constant__Group__12157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constant__NameAssignment_1_in_rule__Constant__Group__1__Impl2184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constant__Group__2__Impl_in_rule__Constant__Group__22214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constant__Group_2__0_in_rule__Constant__Group__2__Impl2241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constant__Group_2__0__Impl_in_rule__Constant__Group_2__02278 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Constant__Group_2__1_in_rule__Constant__Group_2__02281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Constant__Group_2__0__Impl2309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constant__Group_2__1__Impl_in_rule__Constant__Group_2__12340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constant__CommentAssignment_2_1_in_rule__Constant__Group_2__1__Impl2367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axiom__Group__0__Impl_in_rule__Axiom__Group__02401 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_rule__Axiom__Group__1_in_rule__Axiom__Group__02404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axiom__TheoremAssignment_0_in_rule__Axiom__Group__0__Impl2431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axiom__Group__1__Impl_in_rule__Axiom__Group__12462 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Axiom__Group__2_in_rule__Axiom__Group__12465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Axiom__Group__1__Impl2493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axiom__Group__2__Impl_in_rule__Axiom__Group__22524 = new BitSet(new long[]{0x0000000000020030L});
        public static final BitSet FOLLOW_rule__Axiom__Group__3_in_rule__Axiom__Group__22527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axiom__NameAssignment_2_in_rule__Axiom__Group__2__Impl2554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axiom__Group__3__Impl_in_rule__Axiom__Group__32584 = new BitSet(new long[]{0x0000000000020030L});
        public static final BitSet FOLLOW_rule__Axiom__Group__4_in_rule__Axiom__Group__32587 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axiom__Group_3__0_in_rule__Axiom__Group__3__Impl2614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axiom__Group__4__Impl_in_rule__Axiom__Group__42645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axiom__PredicateAssignment_4_in_rule__Axiom__Group__4__Impl2672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axiom__Group_3__0__Impl_in_rule__Axiom__Group_3__02712 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Axiom__Group_3__1_in_rule__Axiom__Group_3__02715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Axiom__Group_3__0__Impl2743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axiom__Group_3__1__Impl_in_rule__Axiom__Group_3__12774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axiom__CommentAssignment_3_1_in_rule__Axiom__Group_3__1__Impl2801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Context__NameAssignment_22840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Context__CommentAssignment_3_12871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Context__ExtendsAssignment_4_12906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Context__ExtendsAssignment_4_22945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCarrierSet_in_rule__Context__SetsAssignment_5_12980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCarrierSet_in_rule__Context__SetsAssignment_5_23011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstant_in_rule__Context__ConstantsAssignment_6_13042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstant_in_rule__Context__ConstantsAssignment_6_23073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAxiom_in_rule__Context__AxiomsAssignment_7_13104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAxiom_in_rule__Context__AxiomsAssignment_7_23135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__CarrierSet__NameAssignment_13166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__CarrierSet__CommentAssignment_2_13197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Constant__NameAssignment_13228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Constant__CommentAssignment_2_13259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Axiom__TheoremAssignment_03295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Axiom__NameAssignment_23334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Axiom__CommentAssignment_3_13365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Axiom__PredicateAssignment_43396 = new BitSet(new long[]{0x0000000000000002L});
    }


}