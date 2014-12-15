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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'context'", "'end'", "'comment'", "'extends'", "'sets'", "'constants'", "'axioms'", "'//'", "'@'", "'theorem'"
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
    public static final int T__20=20;
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

            if ( (LA2_0==13) ) {
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

            if ( (LA3_0==14) ) {
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

            if ( (LA4_0==15) ) {
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

            if ( (LA5_0==16) ) {
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:431:1: rule__Context__Group__7 : rule__Context__Group__7__Impl rule__Context__Group__8 ;
    public final void rule__Context__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:435:1: ( rule__Context__Group__7__Impl rule__Context__Group__8 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:436:2: rule__Context__Group__7__Impl rule__Context__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__Group__7__Impl_in_rule__Context__Group__7844);
            rule__Context__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Context__Group__8_in_rule__Context__Group__7847);
            rule__Context__Group__8();

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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:443:1: rule__Context__Group__7__Impl : ( ( rule__Context__Group_7__0 )? ) ;
    public final void rule__Context__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:447:1: ( ( ( rule__Context__Group_7__0 )? ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:448:1: ( ( rule__Context__Group_7__0 )? )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:448:1: ( ( rule__Context__Group_7__0 )? )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:449:1: ( rule__Context__Group_7__0 )?
            {
             before(grammarAccess.getContextAccess().getGroup_7()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:450:1: ( rule__Context__Group_7__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:450:2: rule__Context__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Context__Group_7__0_in_rule__Context__Group__7__Impl874);
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


    // $ANTLR start "rule__Context__Group__8"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:460:1: rule__Context__Group__8 : rule__Context__Group__8__Impl ;
    public final void rule__Context__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:464:1: ( rule__Context__Group__8__Impl )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:465:2: rule__Context__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__Group__8__Impl_in_rule__Context__Group__8905);
            rule__Context__Group__8__Impl();

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
    // $ANTLR end "rule__Context__Group__8"


    // $ANTLR start "rule__Context__Group__8__Impl"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:471:1: rule__Context__Group__8__Impl : ( 'end' ) ;
    public final void rule__Context__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:475:1: ( ( 'end' ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:476:1: ( 'end' )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:476:1: ( 'end' )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:477:1: 'end'
            {
             before(grammarAccess.getContextAccess().getEndKeyword_8()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Context__Group__8__Impl933); 
             after(grammarAccess.getContextAccess().getEndKeyword_8()); 

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
    // $ANTLR end "rule__Context__Group__8__Impl"


    // $ANTLR start "rule__Context__Group_3__0"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:508:1: rule__Context__Group_3__0 : rule__Context__Group_3__0__Impl rule__Context__Group_3__1 ;
    public final void rule__Context__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:512:1: ( rule__Context__Group_3__0__Impl rule__Context__Group_3__1 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:513:2: rule__Context__Group_3__0__Impl rule__Context__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__Group_3__0__Impl_in_rule__Context__Group_3__0982);
            rule__Context__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Context__Group_3__1_in_rule__Context__Group_3__0985);
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:520:1: rule__Context__Group_3__0__Impl : ( 'comment' ) ;
    public final void rule__Context__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:524:1: ( ( 'comment' ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:525:1: ( 'comment' )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:525:1: ( 'comment' )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:526:1: 'comment'
            {
             before(grammarAccess.getContextAccess().getCommentKeyword_3_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Context__Group_3__0__Impl1013); 
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:539:1: rule__Context__Group_3__1 : rule__Context__Group_3__1__Impl ;
    public final void rule__Context__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:543:1: ( rule__Context__Group_3__1__Impl )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:544:2: rule__Context__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__Group_3__1__Impl_in_rule__Context__Group_3__11044);
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:550:1: rule__Context__Group_3__1__Impl : ( ( rule__Context__CommentAssignment_3_1 ) ) ;
    public final void rule__Context__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:554:1: ( ( ( rule__Context__CommentAssignment_3_1 ) ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:555:1: ( ( rule__Context__CommentAssignment_3_1 ) )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:555:1: ( ( rule__Context__CommentAssignment_3_1 ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:556:1: ( rule__Context__CommentAssignment_3_1 )
            {
             before(grammarAccess.getContextAccess().getCommentAssignment_3_1()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:557:1: ( rule__Context__CommentAssignment_3_1 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:557:2: rule__Context__CommentAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__CommentAssignment_3_1_in_rule__Context__Group_3__1__Impl1071);
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:571:1: rule__Context__Group_4__0 : rule__Context__Group_4__0__Impl rule__Context__Group_4__1 ;
    public final void rule__Context__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:575:1: ( rule__Context__Group_4__0__Impl rule__Context__Group_4__1 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:576:2: rule__Context__Group_4__0__Impl rule__Context__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__Group_4__0__Impl_in_rule__Context__Group_4__01105);
            rule__Context__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Context__Group_4__1_in_rule__Context__Group_4__01108);
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:583:1: rule__Context__Group_4__0__Impl : ( 'extends' ) ;
    public final void rule__Context__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:587:1: ( ( 'extends' ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:588:1: ( 'extends' )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:588:1: ( 'extends' )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:589:1: 'extends'
            {
             before(grammarAccess.getContextAccess().getExtendsKeyword_4_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Context__Group_4__0__Impl1136); 
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:602:1: rule__Context__Group_4__1 : rule__Context__Group_4__1__Impl rule__Context__Group_4__2 ;
    public final void rule__Context__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:606:1: ( rule__Context__Group_4__1__Impl rule__Context__Group_4__2 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:607:2: rule__Context__Group_4__1__Impl rule__Context__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__Group_4__1__Impl_in_rule__Context__Group_4__11167);
            rule__Context__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Context__Group_4__2_in_rule__Context__Group_4__11170);
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:614:1: rule__Context__Group_4__1__Impl : ( ( rule__Context__ExtendsAssignment_4_1 ) ) ;
    public final void rule__Context__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:618:1: ( ( ( rule__Context__ExtendsAssignment_4_1 ) ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:619:1: ( ( rule__Context__ExtendsAssignment_4_1 ) )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:619:1: ( ( rule__Context__ExtendsAssignment_4_1 ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:620:1: ( rule__Context__ExtendsAssignment_4_1 )
            {
             before(grammarAccess.getContextAccess().getExtendsAssignment_4_1()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:621:1: ( rule__Context__ExtendsAssignment_4_1 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:621:2: rule__Context__ExtendsAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__ExtendsAssignment_4_1_in_rule__Context__Group_4__1__Impl1197);
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:631:1: rule__Context__Group_4__2 : rule__Context__Group_4__2__Impl ;
    public final void rule__Context__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:635:1: ( rule__Context__Group_4__2__Impl )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:636:2: rule__Context__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__Group_4__2__Impl_in_rule__Context__Group_4__21227);
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:642:1: rule__Context__Group_4__2__Impl : ( ( rule__Context__ExtendsAssignment_4_2 )* ) ;
    public final void rule__Context__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:646:1: ( ( ( rule__Context__ExtendsAssignment_4_2 )* ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:647:1: ( ( rule__Context__ExtendsAssignment_4_2 )* )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:647:1: ( ( rule__Context__ExtendsAssignment_4_2 )* )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:648:1: ( rule__Context__ExtendsAssignment_4_2 )*
            {
             before(grammarAccess.getContextAccess().getExtendsAssignment_4_2()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:649:1: ( rule__Context__ExtendsAssignment_4_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:649:2: rule__Context__ExtendsAssignment_4_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Context__ExtendsAssignment_4_2_in_rule__Context__Group_4__2__Impl1254);
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:665:1: rule__Context__Group_5__0 : rule__Context__Group_5__0__Impl rule__Context__Group_5__1 ;
    public final void rule__Context__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:669:1: ( rule__Context__Group_5__0__Impl rule__Context__Group_5__1 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:670:2: rule__Context__Group_5__0__Impl rule__Context__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__Group_5__0__Impl_in_rule__Context__Group_5__01291);
            rule__Context__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Context__Group_5__1_in_rule__Context__Group_5__01294);
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:677:1: rule__Context__Group_5__0__Impl : ( 'sets' ) ;
    public final void rule__Context__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:681:1: ( ( 'sets' ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:682:1: ( 'sets' )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:682:1: ( 'sets' )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:683:1: 'sets'
            {
             before(grammarAccess.getContextAccess().getSetsKeyword_5_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Context__Group_5__0__Impl1322); 
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:696:1: rule__Context__Group_5__1 : rule__Context__Group_5__1__Impl rule__Context__Group_5__2 ;
    public final void rule__Context__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:700:1: ( rule__Context__Group_5__1__Impl rule__Context__Group_5__2 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:701:2: rule__Context__Group_5__1__Impl rule__Context__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__Group_5__1__Impl_in_rule__Context__Group_5__11353);
            rule__Context__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Context__Group_5__2_in_rule__Context__Group_5__11356);
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:708:1: rule__Context__Group_5__1__Impl : ( ( rule__Context__SetsAssignment_5_1 ) ) ;
    public final void rule__Context__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:712:1: ( ( ( rule__Context__SetsAssignment_5_1 ) ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:713:1: ( ( rule__Context__SetsAssignment_5_1 ) )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:713:1: ( ( rule__Context__SetsAssignment_5_1 ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:714:1: ( rule__Context__SetsAssignment_5_1 )
            {
             before(grammarAccess.getContextAccess().getSetsAssignment_5_1()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:715:1: ( rule__Context__SetsAssignment_5_1 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:715:2: rule__Context__SetsAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__SetsAssignment_5_1_in_rule__Context__Group_5__1__Impl1383);
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:725:1: rule__Context__Group_5__2 : rule__Context__Group_5__2__Impl ;
    public final void rule__Context__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:729:1: ( rule__Context__Group_5__2__Impl )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:730:2: rule__Context__Group_5__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__Group_5__2__Impl_in_rule__Context__Group_5__21413);
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:736:1: rule__Context__Group_5__2__Impl : ( ( rule__Context__SetsAssignment_5_2 )* ) ;
    public final void rule__Context__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:740:1: ( ( ( rule__Context__SetsAssignment_5_2 )* ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:741:1: ( ( rule__Context__SetsAssignment_5_2 )* )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:741:1: ( ( rule__Context__SetsAssignment_5_2 )* )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:742:1: ( rule__Context__SetsAssignment_5_2 )*
            {
             before(grammarAccess.getContextAccess().getSetsAssignment_5_2()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:743:1: ( rule__Context__SetsAssignment_5_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_ID)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:743:2: rule__Context__SetsAssignment_5_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Context__SetsAssignment_5_2_in_rule__Context__Group_5__2__Impl1440);
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:759:1: rule__Context__Group_6__0 : rule__Context__Group_6__0__Impl rule__Context__Group_6__1 ;
    public final void rule__Context__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:763:1: ( rule__Context__Group_6__0__Impl rule__Context__Group_6__1 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:764:2: rule__Context__Group_6__0__Impl rule__Context__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__Group_6__0__Impl_in_rule__Context__Group_6__01477);
            rule__Context__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Context__Group_6__1_in_rule__Context__Group_6__01480);
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:771:1: rule__Context__Group_6__0__Impl : ( 'constants' ) ;
    public final void rule__Context__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:775:1: ( ( 'constants' ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:776:1: ( 'constants' )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:776:1: ( 'constants' )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:777:1: 'constants'
            {
             before(grammarAccess.getContextAccess().getConstantsKeyword_6_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Context__Group_6__0__Impl1508); 
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:790:1: rule__Context__Group_6__1 : rule__Context__Group_6__1__Impl rule__Context__Group_6__2 ;
    public final void rule__Context__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:794:1: ( rule__Context__Group_6__1__Impl rule__Context__Group_6__2 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:795:2: rule__Context__Group_6__1__Impl rule__Context__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__Group_6__1__Impl_in_rule__Context__Group_6__11539);
            rule__Context__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Context__Group_6__2_in_rule__Context__Group_6__11542);
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:802:1: rule__Context__Group_6__1__Impl : ( ( rule__Context__ConstantsAssignment_6_1 ) ) ;
    public final void rule__Context__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:806:1: ( ( ( rule__Context__ConstantsAssignment_6_1 ) ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:807:1: ( ( rule__Context__ConstantsAssignment_6_1 ) )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:807:1: ( ( rule__Context__ConstantsAssignment_6_1 ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:808:1: ( rule__Context__ConstantsAssignment_6_1 )
            {
             before(grammarAccess.getContextAccess().getConstantsAssignment_6_1()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:809:1: ( rule__Context__ConstantsAssignment_6_1 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:809:2: rule__Context__ConstantsAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__ConstantsAssignment_6_1_in_rule__Context__Group_6__1__Impl1569);
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:819:1: rule__Context__Group_6__2 : rule__Context__Group_6__2__Impl ;
    public final void rule__Context__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:823:1: ( rule__Context__Group_6__2__Impl )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:824:2: rule__Context__Group_6__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__Group_6__2__Impl_in_rule__Context__Group_6__21599);
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:830:1: rule__Context__Group_6__2__Impl : ( ( rule__Context__ConstantsAssignment_6_2 )* ) ;
    public final void rule__Context__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:834:1: ( ( ( rule__Context__ConstantsAssignment_6_2 )* ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:835:1: ( ( rule__Context__ConstantsAssignment_6_2 )* )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:835:1: ( ( rule__Context__ConstantsAssignment_6_2 )* )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:836:1: ( rule__Context__ConstantsAssignment_6_2 )*
            {
             before(grammarAccess.getContextAccess().getConstantsAssignment_6_2()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:837:1: ( rule__Context__ConstantsAssignment_6_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_ID)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:837:2: rule__Context__ConstantsAssignment_6_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Context__ConstantsAssignment_6_2_in_rule__Context__Group_6__2__Impl1626);
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:853:1: rule__Context__Group_7__0 : rule__Context__Group_7__0__Impl rule__Context__Group_7__1 ;
    public final void rule__Context__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:857:1: ( rule__Context__Group_7__0__Impl rule__Context__Group_7__1 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:858:2: rule__Context__Group_7__0__Impl rule__Context__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__Group_7__0__Impl_in_rule__Context__Group_7__01663);
            rule__Context__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Context__Group_7__1_in_rule__Context__Group_7__01666);
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:865:1: rule__Context__Group_7__0__Impl : ( 'axioms' ) ;
    public final void rule__Context__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:869:1: ( ( 'axioms' ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:870:1: ( 'axioms' )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:870:1: ( 'axioms' )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:871:1: 'axioms'
            {
             before(grammarAccess.getContextAccess().getAxiomsKeyword_7_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Context__Group_7__0__Impl1694); 
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:884:1: rule__Context__Group_7__1 : rule__Context__Group_7__1__Impl rule__Context__Group_7__2 ;
    public final void rule__Context__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:888:1: ( rule__Context__Group_7__1__Impl rule__Context__Group_7__2 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:889:2: rule__Context__Group_7__1__Impl rule__Context__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__Group_7__1__Impl_in_rule__Context__Group_7__11725);
            rule__Context__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Context__Group_7__2_in_rule__Context__Group_7__11728);
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:896:1: rule__Context__Group_7__1__Impl : ( ( rule__Context__AxiomsAssignment_7_1 ) ) ;
    public final void rule__Context__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:900:1: ( ( ( rule__Context__AxiomsAssignment_7_1 ) ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:901:1: ( ( rule__Context__AxiomsAssignment_7_1 ) )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:901:1: ( ( rule__Context__AxiomsAssignment_7_1 ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:902:1: ( rule__Context__AxiomsAssignment_7_1 )
            {
             before(grammarAccess.getContextAccess().getAxiomsAssignment_7_1()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:903:1: ( rule__Context__AxiomsAssignment_7_1 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:903:2: rule__Context__AxiomsAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__AxiomsAssignment_7_1_in_rule__Context__Group_7__1__Impl1755);
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:913:1: rule__Context__Group_7__2 : rule__Context__Group_7__2__Impl ;
    public final void rule__Context__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:917:1: ( rule__Context__Group_7__2__Impl )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:918:2: rule__Context__Group_7__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__Group_7__2__Impl_in_rule__Context__Group_7__21785);
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:924:1: rule__Context__Group_7__2__Impl : ( ( rule__Context__AxiomsAssignment_7_2 )* ) ;
    public final void rule__Context__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:928:1: ( ( ( rule__Context__AxiomsAssignment_7_2 )* ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:929:1: ( ( rule__Context__AxiomsAssignment_7_2 )* )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:929:1: ( ( rule__Context__AxiomsAssignment_7_2 )* )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:930:1: ( rule__Context__AxiomsAssignment_7_2 )*
            {
             before(grammarAccess.getContextAccess().getAxiomsAssignment_7_2()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:931:1: ( rule__Context__AxiomsAssignment_7_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:931:2: rule__Context__AxiomsAssignment_7_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Context__AxiomsAssignment_7_2_in_rule__Context__Group_7__2__Impl1812);
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:947:1: rule__CarrierSet__Group__0 : rule__CarrierSet__Group__0__Impl rule__CarrierSet__Group__1 ;
    public final void rule__CarrierSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:951:1: ( rule__CarrierSet__Group__0__Impl rule__CarrierSet__Group__1 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:952:2: rule__CarrierSet__Group__0__Impl rule__CarrierSet__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CarrierSet__Group__0__Impl_in_rule__CarrierSet__Group__01849);
            rule__CarrierSet__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CarrierSet__Group__1_in_rule__CarrierSet__Group__01852);
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:959:1: rule__CarrierSet__Group__0__Impl : ( () ) ;
    public final void rule__CarrierSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:963:1: ( ( () ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:964:1: ( () )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:964:1: ( () )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:965:1: ()
            {
             before(grammarAccess.getCarrierSetAccess().getCarrierSetAction_0()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:966:1: ()
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:968:1: 
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:978:1: rule__CarrierSet__Group__1 : rule__CarrierSet__Group__1__Impl rule__CarrierSet__Group__2 ;
    public final void rule__CarrierSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:982:1: ( rule__CarrierSet__Group__1__Impl rule__CarrierSet__Group__2 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:983:2: rule__CarrierSet__Group__1__Impl rule__CarrierSet__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CarrierSet__Group__1__Impl_in_rule__CarrierSet__Group__11910);
            rule__CarrierSet__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CarrierSet__Group__2_in_rule__CarrierSet__Group__11913);
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:990:1: rule__CarrierSet__Group__1__Impl : ( ( rule__CarrierSet__NameAssignment_1 ) ) ;
    public final void rule__CarrierSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:994:1: ( ( ( rule__CarrierSet__NameAssignment_1 ) ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:995:1: ( ( rule__CarrierSet__NameAssignment_1 ) )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:995:1: ( ( rule__CarrierSet__NameAssignment_1 ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:996:1: ( rule__CarrierSet__NameAssignment_1 )
            {
             before(grammarAccess.getCarrierSetAccess().getNameAssignment_1()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:997:1: ( rule__CarrierSet__NameAssignment_1 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:997:2: rule__CarrierSet__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CarrierSet__NameAssignment_1_in_rule__CarrierSet__Group__1__Impl1940);
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1007:1: rule__CarrierSet__Group__2 : rule__CarrierSet__Group__2__Impl ;
    public final void rule__CarrierSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1011:1: ( rule__CarrierSet__Group__2__Impl )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1012:2: rule__CarrierSet__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CarrierSet__Group__2__Impl_in_rule__CarrierSet__Group__21970);
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1018:1: rule__CarrierSet__Group__2__Impl : ( ( rule__CarrierSet__Group_2__0 )? ) ;
    public final void rule__CarrierSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1022:1: ( ( ( rule__CarrierSet__Group_2__0 )? ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1023:1: ( ( rule__CarrierSet__Group_2__0 )? )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1023:1: ( ( rule__CarrierSet__Group_2__0 )? )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1024:1: ( rule__CarrierSet__Group_2__0 )?
            {
             before(grammarAccess.getCarrierSetAccess().getGroup_2()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1025:1: ( rule__CarrierSet__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1025:2: rule__CarrierSet__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__CarrierSet__Group_2__0_in_rule__CarrierSet__Group__2__Impl1997);
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1041:1: rule__CarrierSet__Group_2__0 : rule__CarrierSet__Group_2__0__Impl rule__CarrierSet__Group_2__1 ;
    public final void rule__CarrierSet__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1045:1: ( rule__CarrierSet__Group_2__0__Impl rule__CarrierSet__Group_2__1 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1046:2: rule__CarrierSet__Group_2__0__Impl rule__CarrierSet__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CarrierSet__Group_2__0__Impl_in_rule__CarrierSet__Group_2__02034);
            rule__CarrierSet__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CarrierSet__Group_2__1_in_rule__CarrierSet__Group_2__02037);
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1053:1: rule__CarrierSet__Group_2__0__Impl : ( '//' ) ;
    public final void rule__CarrierSet__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1057:1: ( ( '//' ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1058:1: ( '//' )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1058:1: ( '//' )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1059:1: '//'
            {
             before(grammarAccess.getCarrierSetAccess().getSolidusSolidusKeyword_2_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__CarrierSet__Group_2__0__Impl2065); 
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1072:1: rule__CarrierSet__Group_2__1 : rule__CarrierSet__Group_2__1__Impl ;
    public final void rule__CarrierSet__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1076:1: ( rule__CarrierSet__Group_2__1__Impl )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1077:2: rule__CarrierSet__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CarrierSet__Group_2__1__Impl_in_rule__CarrierSet__Group_2__12096);
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1083:1: rule__CarrierSet__Group_2__1__Impl : ( ( rule__CarrierSet__CommentAssignment_2_1 ) ) ;
    public final void rule__CarrierSet__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1087:1: ( ( ( rule__CarrierSet__CommentAssignment_2_1 ) ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1088:1: ( ( rule__CarrierSet__CommentAssignment_2_1 ) )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1088:1: ( ( rule__CarrierSet__CommentAssignment_2_1 ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1089:1: ( rule__CarrierSet__CommentAssignment_2_1 )
            {
             before(grammarAccess.getCarrierSetAccess().getCommentAssignment_2_1()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1090:1: ( rule__CarrierSet__CommentAssignment_2_1 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1090:2: rule__CarrierSet__CommentAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CarrierSet__CommentAssignment_2_1_in_rule__CarrierSet__Group_2__1__Impl2123);
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1104:1: rule__Constant__Group__0 : rule__Constant__Group__0__Impl rule__Constant__Group__1 ;
    public final void rule__Constant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1108:1: ( rule__Constant__Group__0__Impl rule__Constant__Group__1 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1109:2: rule__Constant__Group__0__Impl rule__Constant__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constant__Group__0__Impl_in_rule__Constant__Group__02157);
            rule__Constant__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Constant__Group__1_in_rule__Constant__Group__02160);
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1116:1: rule__Constant__Group__0__Impl : ( () ) ;
    public final void rule__Constant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1120:1: ( ( () ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1121:1: ( () )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1121:1: ( () )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1122:1: ()
            {
             before(grammarAccess.getConstantAccess().getConstantAction_0()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1123:1: ()
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1125:1: 
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1135:1: rule__Constant__Group__1 : rule__Constant__Group__1__Impl rule__Constant__Group__2 ;
    public final void rule__Constant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1139:1: ( rule__Constant__Group__1__Impl rule__Constant__Group__2 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1140:2: rule__Constant__Group__1__Impl rule__Constant__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constant__Group__1__Impl_in_rule__Constant__Group__12218);
            rule__Constant__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Constant__Group__2_in_rule__Constant__Group__12221);
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1147:1: rule__Constant__Group__1__Impl : ( ( rule__Constant__NameAssignment_1 ) ) ;
    public final void rule__Constant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1151:1: ( ( ( rule__Constant__NameAssignment_1 ) ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1152:1: ( ( rule__Constant__NameAssignment_1 ) )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1152:1: ( ( rule__Constant__NameAssignment_1 ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1153:1: ( rule__Constant__NameAssignment_1 )
            {
             before(grammarAccess.getConstantAccess().getNameAssignment_1()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1154:1: ( rule__Constant__NameAssignment_1 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1154:2: rule__Constant__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constant__NameAssignment_1_in_rule__Constant__Group__1__Impl2248);
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1164:1: rule__Constant__Group__2 : rule__Constant__Group__2__Impl ;
    public final void rule__Constant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1168:1: ( rule__Constant__Group__2__Impl )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1169:2: rule__Constant__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constant__Group__2__Impl_in_rule__Constant__Group__22278);
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1175:1: rule__Constant__Group__2__Impl : ( ( rule__Constant__Group_2__0 )? ) ;
    public final void rule__Constant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1179:1: ( ( ( rule__Constant__Group_2__0 )? ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1180:1: ( ( rule__Constant__Group_2__0 )? )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1180:1: ( ( rule__Constant__Group_2__0 )? )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1181:1: ( rule__Constant__Group_2__0 )?
            {
             before(grammarAccess.getConstantAccess().getGroup_2()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1182:1: ( rule__Constant__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1182:2: rule__Constant__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Constant__Group_2__0_in_rule__Constant__Group__2__Impl2305);
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1198:1: rule__Constant__Group_2__0 : rule__Constant__Group_2__0__Impl rule__Constant__Group_2__1 ;
    public final void rule__Constant__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1202:1: ( rule__Constant__Group_2__0__Impl rule__Constant__Group_2__1 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1203:2: rule__Constant__Group_2__0__Impl rule__Constant__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constant__Group_2__0__Impl_in_rule__Constant__Group_2__02342);
            rule__Constant__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Constant__Group_2__1_in_rule__Constant__Group_2__02345);
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1210:1: rule__Constant__Group_2__0__Impl : ( '//' ) ;
    public final void rule__Constant__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1214:1: ( ( '//' ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1215:1: ( '//' )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1215:1: ( '//' )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1216:1: '//'
            {
             before(grammarAccess.getConstantAccess().getSolidusSolidusKeyword_2_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Constant__Group_2__0__Impl2373); 
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1229:1: rule__Constant__Group_2__1 : rule__Constant__Group_2__1__Impl ;
    public final void rule__Constant__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1233:1: ( rule__Constant__Group_2__1__Impl )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1234:2: rule__Constant__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constant__Group_2__1__Impl_in_rule__Constant__Group_2__12404);
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1240:1: rule__Constant__Group_2__1__Impl : ( ( rule__Constant__CommentAssignment_2_1 ) ) ;
    public final void rule__Constant__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1244:1: ( ( ( rule__Constant__CommentAssignment_2_1 ) ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1245:1: ( ( rule__Constant__CommentAssignment_2_1 ) )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1245:1: ( ( rule__Constant__CommentAssignment_2_1 ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1246:1: ( rule__Constant__CommentAssignment_2_1 )
            {
             before(grammarAccess.getConstantAccess().getCommentAssignment_2_1()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1247:1: ( rule__Constant__CommentAssignment_2_1 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1247:2: rule__Constant__CommentAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constant__CommentAssignment_2_1_in_rule__Constant__Group_2__1__Impl2431);
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1261:1: rule__Axiom__Group__0 : rule__Axiom__Group__0__Impl rule__Axiom__Group__1 ;
    public final void rule__Axiom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1265:1: ( rule__Axiom__Group__0__Impl rule__Axiom__Group__1 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1266:2: rule__Axiom__Group__0__Impl rule__Axiom__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axiom__Group__0__Impl_in_rule__Axiom__Group__02465);
            rule__Axiom__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axiom__Group__1_in_rule__Axiom__Group__02468);
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1273:1: rule__Axiom__Group__0__Impl : ( '@' ) ;
    public final void rule__Axiom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1277:1: ( ( '@' ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1278:1: ( '@' )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1278:1: ( '@' )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1279:1: '@'
            {
             before(grammarAccess.getAxiomAccess().getCommercialAtKeyword_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Axiom__Group__0__Impl2496); 
             after(grammarAccess.getAxiomAccess().getCommercialAtKeyword_0()); 

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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1292:1: rule__Axiom__Group__1 : rule__Axiom__Group__1__Impl rule__Axiom__Group__2 ;
    public final void rule__Axiom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1296:1: ( rule__Axiom__Group__1__Impl rule__Axiom__Group__2 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1297:2: rule__Axiom__Group__1__Impl rule__Axiom__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axiom__Group__1__Impl_in_rule__Axiom__Group__12527);
            rule__Axiom__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axiom__Group__2_in_rule__Axiom__Group__12530);
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1304:1: rule__Axiom__Group__1__Impl : ( ( rule__Axiom__NameAssignment_1 ) ) ;
    public final void rule__Axiom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1308:1: ( ( ( rule__Axiom__NameAssignment_1 ) ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1309:1: ( ( rule__Axiom__NameAssignment_1 ) )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1309:1: ( ( rule__Axiom__NameAssignment_1 ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1310:1: ( rule__Axiom__NameAssignment_1 )
            {
             before(grammarAccess.getAxiomAccess().getNameAssignment_1()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1311:1: ( rule__Axiom__NameAssignment_1 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1311:2: rule__Axiom__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axiom__NameAssignment_1_in_rule__Axiom__Group__1__Impl2557);
            rule__Axiom__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAxiomAccess().getNameAssignment_1()); 

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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1321:1: rule__Axiom__Group__2 : rule__Axiom__Group__2__Impl rule__Axiom__Group__3 ;
    public final void rule__Axiom__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1325:1: ( rule__Axiom__Group__2__Impl rule__Axiom__Group__3 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1326:2: rule__Axiom__Group__2__Impl rule__Axiom__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axiom__Group__2__Impl_in_rule__Axiom__Group__22587);
            rule__Axiom__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axiom__Group__3_in_rule__Axiom__Group__22590);
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1333:1: rule__Axiom__Group__2__Impl : ( ( rule__Axiom__PredicateAssignment_2 )? ) ;
    public final void rule__Axiom__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1337:1: ( ( ( rule__Axiom__PredicateAssignment_2 )? ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1338:1: ( ( rule__Axiom__PredicateAssignment_2 )? )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1338:1: ( ( rule__Axiom__PredicateAssignment_2 )? )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1339:1: ( rule__Axiom__PredicateAssignment_2 )?
            {
             before(grammarAccess.getAxiomAccess().getPredicateAssignment_2()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1340:1: ( rule__Axiom__PredicateAssignment_2 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_ID)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1340:2: rule__Axiom__PredicateAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Axiom__PredicateAssignment_2_in_rule__Axiom__Group__2__Impl2617);
                    rule__Axiom__PredicateAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAxiomAccess().getPredicateAssignment_2()); 

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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1350:1: rule__Axiom__Group__3 : rule__Axiom__Group__3__Impl rule__Axiom__Group__4 ;
    public final void rule__Axiom__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1354:1: ( rule__Axiom__Group__3__Impl rule__Axiom__Group__4 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1355:2: rule__Axiom__Group__3__Impl rule__Axiom__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axiom__Group__3__Impl_in_rule__Axiom__Group__32648);
            rule__Axiom__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axiom__Group__4_in_rule__Axiom__Group__32651);
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1362:1: rule__Axiom__Group__3__Impl : ( ( rule__Axiom__TheoremAssignment_3 )? ) ;
    public final void rule__Axiom__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1366:1: ( ( ( rule__Axiom__TheoremAssignment_3 )? ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1367:1: ( ( rule__Axiom__TheoremAssignment_3 )? )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1367:1: ( ( rule__Axiom__TheoremAssignment_3 )? )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1368:1: ( rule__Axiom__TheoremAssignment_3 )?
            {
             before(grammarAccess.getAxiomAccess().getTheoremAssignment_3()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1369:1: ( rule__Axiom__TheoremAssignment_3 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1369:2: rule__Axiom__TheoremAssignment_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Axiom__TheoremAssignment_3_in_rule__Axiom__Group__3__Impl2678);
                    rule__Axiom__TheoremAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAxiomAccess().getTheoremAssignment_3()); 

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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1379:1: rule__Axiom__Group__4 : rule__Axiom__Group__4__Impl ;
    public final void rule__Axiom__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1383:1: ( rule__Axiom__Group__4__Impl )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1384:2: rule__Axiom__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axiom__Group__4__Impl_in_rule__Axiom__Group__42709);
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1390:1: rule__Axiom__Group__4__Impl : ( ( rule__Axiom__Group_4__0 )? ) ;
    public final void rule__Axiom__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1394:1: ( ( ( rule__Axiom__Group_4__0 )? ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1395:1: ( ( rule__Axiom__Group_4__0 )? )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1395:1: ( ( rule__Axiom__Group_4__0 )? )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1396:1: ( rule__Axiom__Group_4__0 )?
            {
             before(grammarAccess.getAxiomAccess().getGroup_4()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1397:1: ( rule__Axiom__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1397:2: rule__Axiom__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Axiom__Group_4__0_in_rule__Axiom__Group__4__Impl2736);
                    rule__Axiom__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAxiomAccess().getGroup_4()); 

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


    // $ANTLR start "rule__Axiom__Group_4__0"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1417:1: rule__Axiom__Group_4__0 : rule__Axiom__Group_4__0__Impl rule__Axiom__Group_4__1 ;
    public final void rule__Axiom__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1421:1: ( rule__Axiom__Group_4__0__Impl rule__Axiom__Group_4__1 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1422:2: rule__Axiom__Group_4__0__Impl rule__Axiom__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axiom__Group_4__0__Impl_in_rule__Axiom__Group_4__02777);
            rule__Axiom__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axiom__Group_4__1_in_rule__Axiom__Group_4__02780);
            rule__Axiom__Group_4__1();

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
    // $ANTLR end "rule__Axiom__Group_4__0"


    // $ANTLR start "rule__Axiom__Group_4__0__Impl"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1429:1: rule__Axiom__Group_4__0__Impl : ( '//' ) ;
    public final void rule__Axiom__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1433:1: ( ( '//' ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1434:1: ( '//' )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1434:1: ( '//' )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1435:1: '//'
            {
             before(grammarAccess.getAxiomAccess().getSolidusSolidusKeyword_4_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Axiom__Group_4__0__Impl2808); 
             after(grammarAccess.getAxiomAccess().getSolidusSolidusKeyword_4_0()); 

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
    // $ANTLR end "rule__Axiom__Group_4__0__Impl"


    // $ANTLR start "rule__Axiom__Group_4__1"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1448:1: rule__Axiom__Group_4__1 : rule__Axiom__Group_4__1__Impl ;
    public final void rule__Axiom__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1452:1: ( rule__Axiom__Group_4__1__Impl )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1453:2: rule__Axiom__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axiom__Group_4__1__Impl_in_rule__Axiom__Group_4__12839);
            rule__Axiom__Group_4__1__Impl();

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
    // $ANTLR end "rule__Axiom__Group_4__1"


    // $ANTLR start "rule__Axiom__Group_4__1__Impl"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1459:1: rule__Axiom__Group_4__1__Impl : ( ( rule__Axiom__CommentAssignment_4_1 ) ) ;
    public final void rule__Axiom__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1463:1: ( ( ( rule__Axiom__CommentAssignment_4_1 ) ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1464:1: ( ( rule__Axiom__CommentAssignment_4_1 ) )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1464:1: ( ( rule__Axiom__CommentAssignment_4_1 ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1465:1: ( rule__Axiom__CommentAssignment_4_1 )
            {
             before(grammarAccess.getAxiomAccess().getCommentAssignment_4_1()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1466:1: ( rule__Axiom__CommentAssignment_4_1 )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1466:2: rule__Axiom__CommentAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axiom__CommentAssignment_4_1_in_rule__Axiom__Group_4__1__Impl2866);
            rule__Axiom__CommentAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAxiomAccess().getCommentAssignment_4_1()); 

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
    // $ANTLR end "rule__Axiom__Group_4__1__Impl"


    // $ANTLR start "rule__Context__NameAssignment_2"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1481:1: rule__Context__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Context__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1485:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1486:1: ( ruleEString )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1486:1: ( ruleEString )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1487:1: ruleEString
            {
             before(grammarAccess.getContextAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Context__NameAssignment_22905);
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1496:1: rule__Context__CommentAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Context__CommentAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1500:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1501:1: ( ruleEString )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1501:1: ( ruleEString )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1502:1: ruleEString
            {
             before(grammarAccess.getContextAccess().getCommentEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Context__CommentAssignment_3_12936);
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1511:1: rule__Context__ExtendsAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Context__ExtendsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1515:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1516:1: ( ( ruleEString ) )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1516:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1517:1: ( ruleEString )
            {
             before(grammarAccess.getContextAccess().getExtendsContextCrossReference_4_1_0()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1518:1: ( ruleEString )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1519:1: ruleEString
            {
             before(grammarAccess.getContextAccess().getExtendsContextEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Context__ExtendsAssignment_4_12971);
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1530:1: rule__Context__ExtendsAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__Context__ExtendsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1534:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1535:1: ( ( ruleEString ) )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1535:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1536:1: ( ruleEString )
            {
             before(grammarAccess.getContextAccess().getExtendsContextCrossReference_4_2_0()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1537:1: ( ruleEString )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1538:1: ruleEString
            {
             before(grammarAccess.getContextAccess().getExtendsContextEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Context__ExtendsAssignment_4_23010);
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1549:1: rule__Context__SetsAssignment_5_1 : ( ruleCarrierSet ) ;
    public final void rule__Context__SetsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1553:1: ( ( ruleCarrierSet ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1554:1: ( ruleCarrierSet )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1554:1: ( ruleCarrierSet )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1555:1: ruleCarrierSet
            {
             before(grammarAccess.getContextAccess().getSetsCarrierSetParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCarrierSet_in_rule__Context__SetsAssignment_5_13045);
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1564:1: rule__Context__SetsAssignment_5_2 : ( ruleCarrierSet ) ;
    public final void rule__Context__SetsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1568:1: ( ( ruleCarrierSet ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1569:1: ( ruleCarrierSet )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1569:1: ( ruleCarrierSet )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1570:1: ruleCarrierSet
            {
             before(grammarAccess.getContextAccess().getSetsCarrierSetParserRuleCall_5_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCarrierSet_in_rule__Context__SetsAssignment_5_23076);
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1579:1: rule__Context__ConstantsAssignment_6_1 : ( ruleConstant ) ;
    public final void rule__Context__ConstantsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1583:1: ( ( ruleConstant ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1584:1: ( ruleConstant )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1584:1: ( ruleConstant )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1585:1: ruleConstant
            {
             before(grammarAccess.getContextAccess().getConstantsConstantParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstant_in_rule__Context__ConstantsAssignment_6_13107);
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1594:1: rule__Context__ConstantsAssignment_6_2 : ( ruleConstant ) ;
    public final void rule__Context__ConstantsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1598:1: ( ( ruleConstant ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1599:1: ( ruleConstant )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1599:1: ( ruleConstant )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1600:1: ruleConstant
            {
             before(grammarAccess.getContextAccess().getConstantsConstantParserRuleCall_6_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstant_in_rule__Context__ConstantsAssignment_6_23138);
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1609:1: rule__Context__AxiomsAssignment_7_1 : ( ruleAxiom ) ;
    public final void rule__Context__AxiomsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1613:1: ( ( ruleAxiom ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1614:1: ( ruleAxiom )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1614:1: ( ruleAxiom )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1615:1: ruleAxiom
            {
             before(grammarAccess.getContextAccess().getAxiomsAxiomParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAxiom_in_rule__Context__AxiomsAssignment_7_13169);
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1624:1: rule__Context__AxiomsAssignment_7_2 : ( ruleAxiom ) ;
    public final void rule__Context__AxiomsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1628:1: ( ( ruleAxiom ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1629:1: ( ruleAxiom )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1629:1: ( ruleAxiom )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1630:1: ruleAxiom
            {
             before(grammarAccess.getContextAccess().getAxiomsAxiomParserRuleCall_7_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAxiom_in_rule__Context__AxiomsAssignment_7_23200);
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1639:1: rule__CarrierSet__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__CarrierSet__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1643:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1644:1: ( ruleEString )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1644:1: ( ruleEString )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1645:1: ruleEString
            {
             before(grammarAccess.getCarrierSetAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__CarrierSet__NameAssignment_13231);
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1654:1: rule__CarrierSet__CommentAssignment_2_1 : ( ruleEString ) ;
    public final void rule__CarrierSet__CommentAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1658:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1659:1: ( ruleEString )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1659:1: ( ruleEString )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1660:1: ruleEString
            {
             before(grammarAccess.getCarrierSetAccess().getCommentEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__CarrierSet__CommentAssignment_2_13262);
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1669:1: rule__Constant__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Constant__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1673:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1674:1: ( ruleEString )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1674:1: ( ruleEString )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1675:1: ruleEString
            {
             before(grammarAccess.getConstantAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Constant__NameAssignment_13293);
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
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1684:1: rule__Constant__CommentAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Constant__CommentAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1688:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1689:1: ( ruleEString )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1689:1: ( ruleEString )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1690:1: ruleEString
            {
             before(grammarAccess.getConstantAccess().getCommentEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Constant__CommentAssignment_2_13324);
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


    // $ANTLR start "rule__Axiom__NameAssignment_1"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1699:1: rule__Axiom__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Axiom__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1703:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1704:1: ( ruleEString )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1704:1: ( ruleEString )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1705:1: ruleEString
            {
             before(grammarAccess.getAxiomAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Axiom__NameAssignment_13355);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAxiomAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Axiom__NameAssignment_1"


    // $ANTLR start "rule__Axiom__PredicateAssignment_2"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1714:1: rule__Axiom__PredicateAssignment_2 : ( ruleEString ) ;
    public final void rule__Axiom__PredicateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1718:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1719:1: ( ruleEString )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1719:1: ( ruleEString )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1720:1: ruleEString
            {
             before(grammarAccess.getAxiomAccess().getPredicateEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Axiom__PredicateAssignment_23386);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAxiomAccess().getPredicateEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Axiom__PredicateAssignment_2"


    // $ANTLR start "rule__Axiom__TheoremAssignment_3"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1729:1: rule__Axiom__TheoremAssignment_3 : ( ( 'theorem' ) ) ;
    public final void rule__Axiom__TheoremAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1733:1: ( ( ( 'theorem' ) ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1734:1: ( ( 'theorem' ) )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1734:1: ( ( 'theorem' ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1735:1: ( 'theorem' )
            {
             before(grammarAccess.getAxiomAccess().getTheoremTheoremKeyword_3_0()); 
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1736:1: ( 'theorem' )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1737:1: 'theorem'
            {
             before(grammarAccess.getAxiomAccess().getTheoremTheoremKeyword_3_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Axiom__TheoremAssignment_33422); 
             after(grammarAccess.getAxiomAccess().getTheoremTheoremKeyword_3_0()); 

            }

             after(grammarAccess.getAxiomAccess().getTheoremTheoremKeyword_3_0()); 

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
    // $ANTLR end "rule__Axiom__TheoremAssignment_3"


    // $ANTLR start "rule__Axiom__CommentAssignment_4_1"
    // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1752:1: rule__Axiom__CommentAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Axiom__CommentAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1756:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1757:1: ( ruleEString )
            {
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1757:1: ( ruleEString )
            // ../ac.soton.xtext.contextDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalContextDsl.g:1758:1: ruleEString
            {
             before(grammarAccess.getAxiomAccess().getCommentEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Axiom__CommentAssignment_4_13461);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAxiomAccess().getCommentEStringParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Axiom__CommentAssignment_4_1"

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
        public static final BitSet FOLLOW_rule__Context__Group__2__Impl_in_rule__Context__Group__2540 = new BitSet(new long[]{0x000000000003F000L});
        public static final BitSet FOLLOW_rule__Context__Group__3_in_rule__Context__Group__2543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__NameAssignment_2_in_rule__Context__Group__2__Impl570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__Group__3__Impl_in_rule__Context__Group__3600 = new BitSet(new long[]{0x000000000003F000L});
        public static final BitSet FOLLOW_rule__Context__Group__4_in_rule__Context__Group__3603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__Group_3__0_in_rule__Context__Group__3__Impl630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__Group__4__Impl_in_rule__Context__Group__4661 = new BitSet(new long[]{0x000000000003F000L});
        public static final BitSet FOLLOW_rule__Context__Group__5_in_rule__Context__Group__4664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__Group_4__0_in_rule__Context__Group__4__Impl691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__Group__5__Impl_in_rule__Context__Group__5722 = new BitSet(new long[]{0x000000000003F000L});
        public static final BitSet FOLLOW_rule__Context__Group__6_in_rule__Context__Group__5725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__Group_5__0_in_rule__Context__Group__5__Impl752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__Group__6__Impl_in_rule__Context__Group__6783 = new BitSet(new long[]{0x000000000003F000L});
        public static final BitSet FOLLOW_rule__Context__Group__7_in_rule__Context__Group__6786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__Group_6__0_in_rule__Context__Group__6__Impl813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__Group__7__Impl_in_rule__Context__Group__7844 = new BitSet(new long[]{0x000000000003F000L});
        public static final BitSet FOLLOW_rule__Context__Group__8_in_rule__Context__Group__7847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__Group_7__0_in_rule__Context__Group__7__Impl874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__Group__8__Impl_in_rule__Context__Group__8905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Context__Group__8__Impl933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__Group_3__0__Impl_in_rule__Context__Group_3__0982 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Context__Group_3__1_in_rule__Context__Group_3__0985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Context__Group_3__0__Impl1013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__Group_3__1__Impl_in_rule__Context__Group_3__11044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__CommentAssignment_3_1_in_rule__Context__Group_3__1__Impl1071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__Group_4__0__Impl_in_rule__Context__Group_4__01105 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Context__Group_4__1_in_rule__Context__Group_4__01108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Context__Group_4__0__Impl1136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__Group_4__1__Impl_in_rule__Context__Group_4__11167 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Context__Group_4__2_in_rule__Context__Group_4__11170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__ExtendsAssignment_4_1_in_rule__Context__Group_4__1__Impl1197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__Group_4__2__Impl_in_rule__Context__Group_4__21227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__ExtendsAssignment_4_2_in_rule__Context__Group_4__2__Impl1254 = new BitSet(new long[]{0x0000000000000032L});
        public static final BitSet FOLLOW_rule__Context__Group_5__0__Impl_in_rule__Context__Group_5__01291 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Context__Group_5__1_in_rule__Context__Group_5__01294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Context__Group_5__0__Impl1322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__Group_5__1__Impl_in_rule__Context__Group_5__11353 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Context__Group_5__2_in_rule__Context__Group_5__11356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__SetsAssignment_5_1_in_rule__Context__Group_5__1__Impl1383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__Group_5__2__Impl_in_rule__Context__Group_5__21413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__SetsAssignment_5_2_in_rule__Context__Group_5__2__Impl1440 = new BitSet(new long[]{0x0000000000000032L});
        public static final BitSet FOLLOW_rule__Context__Group_6__0__Impl_in_rule__Context__Group_6__01477 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Context__Group_6__1_in_rule__Context__Group_6__01480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Context__Group_6__0__Impl1508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__Group_6__1__Impl_in_rule__Context__Group_6__11539 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Context__Group_6__2_in_rule__Context__Group_6__11542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__ConstantsAssignment_6_1_in_rule__Context__Group_6__1__Impl1569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__Group_6__2__Impl_in_rule__Context__Group_6__21599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__ConstantsAssignment_6_2_in_rule__Context__Group_6__2__Impl1626 = new BitSet(new long[]{0x0000000000000032L});
        public static final BitSet FOLLOW_rule__Context__Group_7__0__Impl_in_rule__Context__Group_7__01663 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Context__Group_7__1_in_rule__Context__Group_7__01666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Context__Group_7__0__Impl1694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__Group_7__1__Impl_in_rule__Context__Group_7__11725 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Context__Group_7__2_in_rule__Context__Group_7__11728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__AxiomsAssignment_7_1_in_rule__Context__Group_7__1__Impl1755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__Group_7__2__Impl_in_rule__Context__Group_7__21785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__AxiomsAssignment_7_2_in_rule__Context__Group_7__2__Impl1812 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__CarrierSet__Group__0__Impl_in_rule__CarrierSet__Group__01849 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__CarrierSet__Group__1_in_rule__CarrierSet__Group__01852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CarrierSet__Group__1__Impl_in_rule__CarrierSet__Group__11910 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__CarrierSet__Group__2_in_rule__CarrierSet__Group__11913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CarrierSet__NameAssignment_1_in_rule__CarrierSet__Group__1__Impl1940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CarrierSet__Group__2__Impl_in_rule__CarrierSet__Group__21970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CarrierSet__Group_2__0_in_rule__CarrierSet__Group__2__Impl1997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CarrierSet__Group_2__0__Impl_in_rule__CarrierSet__Group_2__02034 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__CarrierSet__Group_2__1_in_rule__CarrierSet__Group_2__02037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__CarrierSet__Group_2__0__Impl2065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CarrierSet__Group_2__1__Impl_in_rule__CarrierSet__Group_2__12096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CarrierSet__CommentAssignment_2_1_in_rule__CarrierSet__Group_2__1__Impl2123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constant__Group__0__Impl_in_rule__Constant__Group__02157 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Constant__Group__1_in_rule__Constant__Group__02160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constant__Group__1__Impl_in_rule__Constant__Group__12218 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Constant__Group__2_in_rule__Constant__Group__12221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constant__NameAssignment_1_in_rule__Constant__Group__1__Impl2248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constant__Group__2__Impl_in_rule__Constant__Group__22278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constant__Group_2__0_in_rule__Constant__Group__2__Impl2305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constant__Group_2__0__Impl_in_rule__Constant__Group_2__02342 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Constant__Group_2__1_in_rule__Constant__Group_2__02345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Constant__Group_2__0__Impl2373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constant__Group_2__1__Impl_in_rule__Constant__Group_2__12404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constant__CommentAssignment_2_1_in_rule__Constant__Group_2__1__Impl2431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axiom__Group__0__Impl_in_rule__Axiom__Group__02465 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Axiom__Group__1_in_rule__Axiom__Group__02468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Axiom__Group__0__Impl2496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axiom__Group__1__Impl_in_rule__Axiom__Group__12527 = new BitSet(new long[]{0x0000000000140030L});
        public static final BitSet FOLLOW_rule__Axiom__Group__2_in_rule__Axiom__Group__12530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axiom__NameAssignment_1_in_rule__Axiom__Group__1__Impl2557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axiom__Group__2__Impl_in_rule__Axiom__Group__22587 = new BitSet(new long[]{0x0000000000140030L});
        public static final BitSet FOLLOW_rule__Axiom__Group__3_in_rule__Axiom__Group__22590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axiom__PredicateAssignment_2_in_rule__Axiom__Group__2__Impl2617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axiom__Group__3__Impl_in_rule__Axiom__Group__32648 = new BitSet(new long[]{0x0000000000140030L});
        public static final BitSet FOLLOW_rule__Axiom__Group__4_in_rule__Axiom__Group__32651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axiom__TheoremAssignment_3_in_rule__Axiom__Group__3__Impl2678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axiom__Group__4__Impl_in_rule__Axiom__Group__42709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axiom__Group_4__0_in_rule__Axiom__Group__4__Impl2736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axiom__Group_4__0__Impl_in_rule__Axiom__Group_4__02777 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Axiom__Group_4__1_in_rule__Axiom__Group_4__02780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Axiom__Group_4__0__Impl2808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axiom__Group_4__1__Impl_in_rule__Axiom__Group_4__12839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axiom__CommentAssignment_4_1_in_rule__Axiom__Group_4__1__Impl2866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Context__NameAssignment_22905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Context__CommentAssignment_3_12936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Context__ExtendsAssignment_4_12971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Context__ExtendsAssignment_4_23010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCarrierSet_in_rule__Context__SetsAssignment_5_13045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCarrierSet_in_rule__Context__SetsAssignment_5_23076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstant_in_rule__Context__ConstantsAssignment_6_13107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstant_in_rule__Context__ConstantsAssignment_6_23138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAxiom_in_rule__Context__AxiomsAssignment_7_13169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAxiom_in_rule__Context__AxiomsAssignment_7_23200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__CarrierSet__NameAssignment_13231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__CarrierSet__CommentAssignment_2_13262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Constant__NameAssignment_13293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Constant__CommentAssignment_2_13324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Axiom__NameAssignment_13355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Axiom__PredicateAssignment_23386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Axiom__TheoremAssignment_33422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Axiom__CommentAssignment_4_13461 = new BitSet(new long[]{0x0000000000000002L});
    }


}