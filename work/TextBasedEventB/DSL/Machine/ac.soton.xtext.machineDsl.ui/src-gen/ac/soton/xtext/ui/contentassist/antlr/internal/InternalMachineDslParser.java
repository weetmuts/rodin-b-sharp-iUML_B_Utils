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
import ac.soton.xtext.services.MachineDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMachineDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ordinary'", "'convergent'", "'anticipated'", "'machine'", "'end'", "'//'", "'refines'", "'sees'", "'variables'", "'invariants'", "'variant'", "'events'", "'@'", "'Variant'", "'expression'", "'event'", "','", "'when'", "'any'", "'where'", "'with'", "'then'", "'theorem'", "'extended'", "'localGenerated'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalMachineDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMachineDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMachineDslParser.tokenNames; }
    public String getGrammarFileName() { return "../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g"; }


     
     	private MachineDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MachineDslGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleMachine"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:60:1: entryRuleMachine : ruleMachine EOF ;
    public final void entryRuleMachine() throws RecognitionException {
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:61:1: ( ruleMachine EOF )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:62:1: ruleMachine EOF
            {
             before(grammarAccess.getMachineRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMachine_in_entryRuleMachine61);
            ruleMachine();

            state._fsp--;

             after(grammarAccess.getMachineRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMachine68); 

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
    // $ANTLR end "entryRuleMachine"


    // $ANTLR start "ruleMachine"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:69:1: ruleMachine : ( ( rule__Machine__Group__0 ) ) ;
    public final void ruleMachine() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:73:2: ( ( ( rule__Machine__Group__0 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:74:1: ( ( rule__Machine__Group__0 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:74:1: ( ( rule__Machine__Group__0 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:75:1: ( rule__Machine__Group__0 )
            {
             before(grammarAccess.getMachineAccess().getGroup()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:76:1: ( rule__Machine__Group__0 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:76:2: rule__Machine__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__0_in_ruleMachine94);
            rule__Machine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getGroup()); 

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
    // $ANTLR end "ruleMachine"


    // $ANTLR start "entryRuleEString"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:88:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:89:1: ( ruleEString EOF )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:90:1: ruleEString EOF
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:97:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:101:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:102:1: ( ( rule__EString__Alternatives ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:102:1: ( ( rule__EString__Alternatives ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:103:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:104:1: ( rule__EString__Alternatives )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:104:2: rule__EString__Alternatives
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


    // $ANTLR start "entryRuleVariable"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:116:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:117:1: ( ruleVariable EOF )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:118:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_entryRuleVariable181);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariable188); 

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:125:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:129:2: ( ( ( rule__Variable__Group__0 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:130:1: ( ( rule__Variable__Group__0 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:130:1: ( ( rule__Variable__Group__0 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:131:1: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:132:1: ( rule__Variable__Group__0 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:132:2: rule__Variable__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__0_in_ruleVariable214);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleInvariant"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:144:1: entryRuleInvariant : ruleInvariant EOF ;
    public final void entryRuleInvariant() throws RecognitionException {
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:145:1: ( ruleInvariant EOF )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:146:1: ruleInvariant EOF
            {
             before(grammarAccess.getInvariantRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInvariant_in_entryRuleInvariant241);
            ruleInvariant();

            state._fsp--;

             after(grammarAccess.getInvariantRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInvariant248); 

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
    // $ANTLR end "entryRuleInvariant"


    // $ANTLR start "ruleInvariant"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:153:1: ruleInvariant : ( ( rule__Invariant__Group__0 ) ) ;
    public final void ruleInvariant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:157:2: ( ( ( rule__Invariant__Group__0 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:158:1: ( ( rule__Invariant__Group__0 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:158:1: ( ( rule__Invariant__Group__0 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:159:1: ( rule__Invariant__Group__0 )
            {
             before(grammarAccess.getInvariantAccess().getGroup()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:160:1: ( rule__Invariant__Group__0 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:160:2: rule__Invariant__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__0_in_ruleInvariant274);
            rule__Invariant__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInvariantAccess().getGroup()); 

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
    // $ANTLR end "ruleInvariant"


    // $ANTLR start "entryRuleVariant"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:172:1: entryRuleVariant : ruleVariant EOF ;
    public final void entryRuleVariant() throws RecognitionException {
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:173:1: ( ruleVariant EOF )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:174:1: ruleVariant EOF
            {
             before(grammarAccess.getVariantRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariant_in_entryRuleVariant301);
            ruleVariant();

            state._fsp--;

             after(grammarAccess.getVariantRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariant308); 

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
    // $ANTLR end "entryRuleVariant"


    // $ANTLR start "ruleVariant"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:181:1: ruleVariant : ( ( rule__Variant__Group__0 ) ) ;
    public final void ruleVariant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:185:2: ( ( ( rule__Variant__Group__0 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:186:1: ( ( rule__Variant__Group__0 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:186:1: ( ( rule__Variant__Group__0 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:187:1: ( rule__Variant__Group__0 )
            {
             before(grammarAccess.getVariantAccess().getGroup()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:188:1: ( rule__Variant__Group__0 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:188:2: rule__Variant__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variant__Group__0_in_ruleVariant334);
            rule__Variant__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariantAccess().getGroup()); 

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
    // $ANTLR end "ruleVariant"


    // $ANTLR start "entryRuleevent"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:200:1: entryRuleevent : ruleevent EOF ;
    public final void entryRuleevent() throws RecognitionException {
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:201:1: ( ruleevent EOF )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:202:1: ruleevent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleevent_in_entryRuleevent361);
            ruleevent();

            state._fsp--;

             after(grammarAccess.getEventRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleevent368); 

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
    // $ANTLR end "entryRuleevent"


    // $ANTLR start "ruleevent"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:209:1: ruleevent : ( ( rule__Event__Group__0 ) ) ;
    public final void ruleevent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:213:2: ( ( ( rule__Event__Group__0 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:214:1: ( ( rule__Event__Group__0 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:214:1: ( ( rule__Event__Group__0 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:215:1: ( rule__Event__Group__0 )
            {
             before(grammarAccess.getEventAccess().getGroup()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:216:1: ( rule__Event__Group__0 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:216:2: rule__Event__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__0_in_ruleevent394);
            rule__Event__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getGroup()); 

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
    // $ANTLR end "ruleevent"


    // $ANTLR start "entryRuleParameter"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:228:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:229:1: ( ruleParameter EOF )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:230:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParameter_in_entryRuleParameter421);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameter428); 

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:237:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:241:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:242:1: ( ( rule__Parameter__Group__0 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:242:1: ( ( rule__Parameter__Group__0 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:243:1: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:244:1: ( rule__Parameter__Group__0 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:244:2: rule__Parameter__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__0_in_ruleParameter454);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleGuard"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:256:1: entryRuleGuard : ruleGuard EOF ;
    public final void entryRuleGuard() throws RecognitionException {
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:257:1: ( ruleGuard EOF )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:258:1: ruleGuard EOF
            {
             before(grammarAccess.getGuardRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGuard_in_entryRuleGuard481);
            ruleGuard();

            state._fsp--;

             after(grammarAccess.getGuardRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGuard488); 

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
    // $ANTLR end "entryRuleGuard"


    // $ANTLR start "ruleGuard"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:265:1: ruleGuard : ( ( rule__Guard__Group__0 ) ) ;
    public final void ruleGuard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:269:2: ( ( ( rule__Guard__Group__0 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:270:1: ( ( rule__Guard__Group__0 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:270:1: ( ( rule__Guard__Group__0 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:271:1: ( rule__Guard__Group__0 )
            {
             before(grammarAccess.getGuardAccess().getGroup()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:272:1: ( rule__Guard__Group__0 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:272:2: rule__Guard__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group__0_in_ruleGuard514);
            rule__Guard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGuardAccess().getGroup()); 

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
    // $ANTLR end "ruleGuard"


    // $ANTLR start "entryRuleWitness"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:284:1: entryRuleWitness : ruleWitness EOF ;
    public final void entryRuleWitness() throws RecognitionException {
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:285:1: ( ruleWitness EOF )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:286:1: ruleWitness EOF
            {
             before(grammarAccess.getWitnessRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWitness_in_entryRuleWitness541);
            ruleWitness();

            state._fsp--;

             after(grammarAccess.getWitnessRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWitness548); 

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
    // $ANTLR end "entryRuleWitness"


    // $ANTLR start "ruleWitness"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:293:1: ruleWitness : ( ( rule__Witness__Group__0 ) ) ;
    public final void ruleWitness() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:297:2: ( ( ( rule__Witness__Group__0 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:298:1: ( ( rule__Witness__Group__0 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:298:1: ( ( rule__Witness__Group__0 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:299:1: ( rule__Witness__Group__0 )
            {
             before(grammarAccess.getWitnessAccess().getGroup()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:300:1: ( rule__Witness__Group__0 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:300:2: rule__Witness__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Witness__Group__0_in_ruleWitness574);
            rule__Witness__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWitnessAccess().getGroup()); 

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
    // $ANTLR end "ruleWitness"


    // $ANTLR start "entryRuleAction"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:312:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:313:1: ( ruleAction EOF )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:314:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAction_in_entryRuleAction601);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAction608); 

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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:321:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:325:2: ( ( ( rule__Action__Group__0 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:326:1: ( ( rule__Action__Group__0 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:326:1: ( ( rule__Action__Group__0 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:327:1: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:328:1: ( rule__Action__Group__0 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:328:2: rule__Action__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__0_in_ruleAction634);
            rule__Action__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getGroup()); 

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "ruleConvergence"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:341:1: ruleConvergence : ( ( rule__Convergence__Alternatives ) ) ;
    public final void ruleConvergence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:345:1: ( ( ( rule__Convergence__Alternatives ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:346:1: ( ( rule__Convergence__Alternatives ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:346:1: ( ( rule__Convergence__Alternatives ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:347:1: ( rule__Convergence__Alternatives )
            {
             before(grammarAccess.getConvergenceAccess().getAlternatives()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:348:1: ( rule__Convergence__Alternatives )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:348:2: rule__Convergence__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Convergence__Alternatives_in_ruleConvergence671);
            rule__Convergence__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConvergenceAccess().getAlternatives()); 

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
    // $ANTLR end "ruleConvergence"


    // $ANTLR start "rule__EString__Alternatives"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:359:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:363:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:364:1: ( RULE_STRING )
                    {
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:364:1: ( RULE_STRING )
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:365:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives706); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:370:6: ( RULE_ID )
                    {
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:370:6: ( RULE_ID )
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:371:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives723); 
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


    // $ANTLR start "rule__Convergence__Alternatives"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:381:1: rule__Convergence__Alternatives : ( ( ( 'ordinary' ) ) | ( ( 'convergent' ) ) | ( ( 'anticipated' ) ) );
    public final void rule__Convergence__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:385:1: ( ( ( 'ordinary' ) ) | ( ( 'convergent' ) ) | ( ( 'anticipated' ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:386:1: ( ( 'ordinary' ) )
                    {
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:386:1: ( ( 'ordinary' ) )
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:387:1: ( 'ordinary' )
                    {
                     before(grammarAccess.getConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0()); 
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:388:1: ( 'ordinary' )
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:388:3: 'ordinary'
                    {
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__Convergence__Alternatives756); 

                    }

                     after(grammarAccess.getConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:393:6: ( ( 'convergent' ) )
                    {
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:393:6: ( ( 'convergent' ) )
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:394:1: ( 'convergent' )
                    {
                     before(grammarAccess.getConvergenceAccess().getConvergentEnumLiteralDeclaration_1()); 
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:395:1: ( 'convergent' )
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:395:3: 'convergent'
                    {
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__Convergence__Alternatives777); 

                    }

                     after(grammarAccess.getConvergenceAccess().getConvergentEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:400:6: ( ( 'anticipated' ) )
                    {
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:400:6: ( ( 'anticipated' ) )
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:401:1: ( 'anticipated' )
                    {
                     before(grammarAccess.getConvergenceAccess().getAnticipatedEnumLiteralDeclaration_2()); 
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:402:1: ( 'anticipated' )
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:402:3: 'anticipated'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__Convergence__Alternatives798); 

                    }

                     after(grammarAccess.getConvergenceAccess().getAnticipatedEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__Convergence__Alternatives"


    // $ANTLR start "rule__Machine__Group__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:414:1: rule__Machine__Group__0 : rule__Machine__Group__0__Impl rule__Machine__Group__1 ;
    public final void rule__Machine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:418:1: ( rule__Machine__Group__0__Impl rule__Machine__Group__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:419:2: rule__Machine__Group__0__Impl rule__Machine__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__0__Impl_in_rule__Machine__Group__0831);
            rule__Machine__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__1_in_rule__Machine__Group__0834);
            rule__Machine__Group__1();

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
    // $ANTLR end "rule__Machine__Group__0"


    // $ANTLR start "rule__Machine__Group__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:426:1: rule__Machine__Group__0__Impl : ( () ) ;
    public final void rule__Machine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:430:1: ( ( () ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:431:1: ( () )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:431:1: ( () )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:432:1: ()
            {
             before(grammarAccess.getMachineAccess().getMachineAction_0()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:433:1: ()
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:435:1: 
            {
            }

             after(grammarAccess.getMachineAccess().getMachineAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__0__Impl"


    // $ANTLR start "rule__Machine__Group__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:445:1: rule__Machine__Group__1 : rule__Machine__Group__1__Impl rule__Machine__Group__2 ;
    public final void rule__Machine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:449:1: ( rule__Machine__Group__1__Impl rule__Machine__Group__2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:450:2: rule__Machine__Group__1__Impl rule__Machine__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__1__Impl_in_rule__Machine__Group__1892);
            rule__Machine__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__2_in_rule__Machine__Group__1895);
            rule__Machine__Group__2();

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
    // $ANTLR end "rule__Machine__Group__1"


    // $ANTLR start "rule__Machine__Group__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:457:1: rule__Machine__Group__1__Impl : ( 'machine' ) ;
    public final void rule__Machine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:461:1: ( ( 'machine' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:462:1: ( 'machine' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:462:1: ( 'machine' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:463:1: 'machine'
            {
             before(grammarAccess.getMachineAccess().getMachineKeyword_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Machine__Group__1__Impl923); 
             after(grammarAccess.getMachineAccess().getMachineKeyword_1()); 

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
    // $ANTLR end "rule__Machine__Group__1__Impl"


    // $ANTLR start "rule__Machine__Group__2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:476:1: rule__Machine__Group__2 : rule__Machine__Group__2__Impl rule__Machine__Group__3 ;
    public final void rule__Machine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:480:1: ( rule__Machine__Group__2__Impl rule__Machine__Group__3 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:481:2: rule__Machine__Group__2__Impl rule__Machine__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__2__Impl_in_rule__Machine__Group__2954);
            rule__Machine__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__3_in_rule__Machine__Group__2957);
            rule__Machine__Group__3();

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
    // $ANTLR end "rule__Machine__Group__2"


    // $ANTLR start "rule__Machine__Group__2__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:488:1: rule__Machine__Group__2__Impl : ( ( rule__Machine__NameAssignment_2 ) ) ;
    public final void rule__Machine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:492:1: ( ( ( rule__Machine__NameAssignment_2 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:493:1: ( ( rule__Machine__NameAssignment_2 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:493:1: ( ( rule__Machine__NameAssignment_2 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:494:1: ( rule__Machine__NameAssignment_2 )
            {
             before(grammarAccess.getMachineAccess().getNameAssignment_2()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:495:1: ( rule__Machine__NameAssignment_2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:495:2: rule__Machine__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__NameAssignment_2_in_rule__Machine__Group__2__Impl984);
            rule__Machine__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Machine__Group__2__Impl"


    // $ANTLR start "rule__Machine__Group__3"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:505:1: rule__Machine__Group__3 : rule__Machine__Group__3__Impl rule__Machine__Group__4 ;
    public final void rule__Machine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:509:1: ( rule__Machine__Group__3__Impl rule__Machine__Group__4 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:510:2: rule__Machine__Group__3__Impl rule__Machine__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__3__Impl_in_rule__Machine__Group__31014);
            rule__Machine__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__4_in_rule__Machine__Group__31017);
            rule__Machine__Group__4();

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
    // $ANTLR end "rule__Machine__Group__3"


    // $ANTLR start "rule__Machine__Group__3__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:517:1: rule__Machine__Group__3__Impl : ( ( rule__Machine__Group_3__0 )? ) ;
    public final void rule__Machine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:521:1: ( ( ( rule__Machine__Group_3__0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:522:1: ( ( rule__Machine__Group_3__0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:522:1: ( ( rule__Machine__Group_3__0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:523:1: ( rule__Machine__Group_3__0 )?
            {
             before(grammarAccess.getMachineAccess().getGroup_3()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:524:1: ( rule__Machine__Group_3__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:524:2: rule__Machine__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_3__0_in_rule__Machine__Group__3__Impl1044);
                    rule__Machine__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMachineAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Machine__Group__3__Impl"


    // $ANTLR start "rule__Machine__Group__4"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:534:1: rule__Machine__Group__4 : rule__Machine__Group__4__Impl rule__Machine__Group__5 ;
    public final void rule__Machine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:538:1: ( rule__Machine__Group__4__Impl rule__Machine__Group__5 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:539:2: rule__Machine__Group__4__Impl rule__Machine__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__4__Impl_in_rule__Machine__Group__41075);
            rule__Machine__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__5_in_rule__Machine__Group__41078);
            rule__Machine__Group__5();

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
    // $ANTLR end "rule__Machine__Group__4"


    // $ANTLR start "rule__Machine__Group__4__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:546:1: rule__Machine__Group__4__Impl : ( ( rule__Machine__Group_4__0 )? ) ;
    public final void rule__Machine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:550:1: ( ( ( rule__Machine__Group_4__0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:551:1: ( ( rule__Machine__Group_4__0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:551:1: ( ( rule__Machine__Group_4__0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:552:1: ( rule__Machine__Group_4__0 )?
            {
             before(grammarAccess.getMachineAccess().getGroup_4()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:553:1: ( rule__Machine__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:553:2: rule__Machine__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_4__0_in_rule__Machine__Group__4__Impl1105);
                    rule__Machine__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMachineAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Machine__Group__4__Impl"


    // $ANTLR start "rule__Machine__Group__5"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:563:1: rule__Machine__Group__5 : rule__Machine__Group__5__Impl rule__Machine__Group__6 ;
    public final void rule__Machine__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:567:1: ( rule__Machine__Group__5__Impl rule__Machine__Group__6 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:568:2: rule__Machine__Group__5__Impl rule__Machine__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__5__Impl_in_rule__Machine__Group__51136);
            rule__Machine__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__6_in_rule__Machine__Group__51139);
            rule__Machine__Group__6();

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
    // $ANTLR end "rule__Machine__Group__5"


    // $ANTLR start "rule__Machine__Group__5__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:575:1: rule__Machine__Group__5__Impl : ( ( rule__Machine__Group_5__0 )? ) ;
    public final void rule__Machine__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:579:1: ( ( ( rule__Machine__Group_5__0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:580:1: ( ( rule__Machine__Group_5__0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:580:1: ( ( rule__Machine__Group_5__0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:581:1: ( rule__Machine__Group_5__0 )?
            {
             before(grammarAccess.getMachineAccess().getGroup_5()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:582:1: ( rule__Machine__Group_5__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:582:2: rule__Machine__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_5__0_in_rule__Machine__Group__5__Impl1166);
                    rule__Machine__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMachineAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Machine__Group__5__Impl"


    // $ANTLR start "rule__Machine__Group__6"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:592:1: rule__Machine__Group__6 : rule__Machine__Group__6__Impl rule__Machine__Group__7 ;
    public final void rule__Machine__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:596:1: ( rule__Machine__Group__6__Impl rule__Machine__Group__7 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:597:2: rule__Machine__Group__6__Impl rule__Machine__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__6__Impl_in_rule__Machine__Group__61197);
            rule__Machine__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__7_in_rule__Machine__Group__61200);
            rule__Machine__Group__7();

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
    // $ANTLR end "rule__Machine__Group__6"


    // $ANTLR start "rule__Machine__Group__6__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:604:1: rule__Machine__Group__6__Impl : ( ( rule__Machine__Group_6__0 )? ) ;
    public final void rule__Machine__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:608:1: ( ( ( rule__Machine__Group_6__0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:609:1: ( ( rule__Machine__Group_6__0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:609:1: ( ( rule__Machine__Group_6__0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:610:1: ( rule__Machine__Group_6__0 )?
            {
             before(grammarAccess.getMachineAccess().getGroup_6()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:611:1: ( rule__Machine__Group_6__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:611:2: rule__Machine__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_6__0_in_rule__Machine__Group__6__Impl1227);
                    rule__Machine__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMachineAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Machine__Group__6__Impl"


    // $ANTLR start "rule__Machine__Group__7"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:621:1: rule__Machine__Group__7 : rule__Machine__Group__7__Impl rule__Machine__Group__8 ;
    public final void rule__Machine__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:625:1: ( rule__Machine__Group__7__Impl rule__Machine__Group__8 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:626:2: rule__Machine__Group__7__Impl rule__Machine__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__7__Impl_in_rule__Machine__Group__71258);
            rule__Machine__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__8_in_rule__Machine__Group__71261);
            rule__Machine__Group__8();

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
    // $ANTLR end "rule__Machine__Group__7"


    // $ANTLR start "rule__Machine__Group__7__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:633:1: rule__Machine__Group__7__Impl : ( ( rule__Machine__Group_7__0 )? ) ;
    public final void rule__Machine__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:637:1: ( ( ( rule__Machine__Group_7__0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:638:1: ( ( rule__Machine__Group_7__0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:638:1: ( ( rule__Machine__Group_7__0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:639:1: ( rule__Machine__Group_7__0 )?
            {
             before(grammarAccess.getMachineAccess().getGroup_7()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:640:1: ( rule__Machine__Group_7__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:640:2: rule__Machine__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_7__0_in_rule__Machine__Group__7__Impl1288);
                    rule__Machine__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMachineAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Machine__Group__7__Impl"


    // $ANTLR start "rule__Machine__Group__8"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:650:1: rule__Machine__Group__8 : rule__Machine__Group__8__Impl rule__Machine__Group__9 ;
    public final void rule__Machine__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:654:1: ( rule__Machine__Group__8__Impl rule__Machine__Group__9 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:655:2: rule__Machine__Group__8__Impl rule__Machine__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__8__Impl_in_rule__Machine__Group__81319);
            rule__Machine__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__9_in_rule__Machine__Group__81322);
            rule__Machine__Group__9();

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
    // $ANTLR end "rule__Machine__Group__8"


    // $ANTLR start "rule__Machine__Group__8__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:662:1: rule__Machine__Group__8__Impl : ( ( rule__Machine__Group_8__0 )? ) ;
    public final void rule__Machine__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:666:1: ( ( ( rule__Machine__Group_8__0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:667:1: ( ( rule__Machine__Group_8__0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:667:1: ( ( rule__Machine__Group_8__0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:668:1: ( rule__Machine__Group_8__0 )?
            {
             before(grammarAccess.getMachineAccess().getGroup_8()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:669:1: ( rule__Machine__Group_8__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:669:2: rule__Machine__Group_8__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_8__0_in_rule__Machine__Group__8__Impl1349);
                    rule__Machine__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMachineAccess().getGroup_8()); 

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
    // $ANTLR end "rule__Machine__Group__8__Impl"


    // $ANTLR start "rule__Machine__Group__9"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:679:1: rule__Machine__Group__9 : rule__Machine__Group__9__Impl rule__Machine__Group__10 ;
    public final void rule__Machine__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:683:1: ( rule__Machine__Group__9__Impl rule__Machine__Group__10 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:684:2: rule__Machine__Group__9__Impl rule__Machine__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__9__Impl_in_rule__Machine__Group__91380);
            rule__Machine__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__10_in_rule__Machine__Group__91383);
            rule__Machine__Group__10();

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
    // $ANTLR end "rule__Machine__Group__9"


    // $ANTLR start "rule__Machine__Group__9__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:691:1: rule__Machine__Group__9__Impl : ( ( rule__Machine__Group_9__0 )? ) ;
    public final void rule__Machine__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:695:1: ( ( ( rule__Machine__Group_9__0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:696:1: ( ( rule__Machine__Group_9__0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:696:1: ( ( rule__Machine__Group_9__0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:697:1: ( rule__Machine__Group_9__0 )?
            {
             before(grammarAccess.getMachineAccess().getGroup_9()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:698:1: ( rule__Machine__Group_9__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:698:2: rule__Machine__Group_9__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_9__0_in_rule__Machine__Group__9__Impl1410);
                    rule__Machine__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMachineAccess().getGroup_9()); 

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
    // $ANTLR end "rule__Machine__Group__9__Impl"


    // $ANTLR start "rule__Machine__Group__10"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:708:1: rule__Machine__Group__10 : rule__Machine__Group__10__Impl ;
    public final void rule__Machine__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:712:1: ( rule__Machine__Group__10__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:713:2: rule__Machine__Group__10__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__10__Impl_in_rule__Machine__Group__101441);
            rule__Machine__Group__10__Impl();

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
    // $ANTLR end "rule__Machine__Group__10"


    // $ANTLR start "rule__Machine__Group__10__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:719:1: rule__Machine__Group__10__Impl : ( 'end' ) ;
    public final void rule__Machine__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:723:1: ( ( 'end' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:724:1: ( 'end' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:724:1: ( 'end' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:725:1: 'end'
            {
             before(grammarAccess.getMachineAccess().getEndKeyword_10()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Machine__Group__10__Impl1469); 
             after(grammarAccess.getMachineAccess().getEndKeyword_10()); 

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
    // $ANTLR end "rule__Machine__Group__10__Impl"


    // $ANTLR start "rule__Machine__Group_3__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:760:1: rule__Machine__Group_3__0 : rule__Machine__Group_3__0__Impl rule__Machine__Group_3__1 ;
    public final void rule__Machine__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:764:1: ( rule__Machine__Group_3__0__Impl rule__Machine__Group_3__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:765:2: rule__Machine__Group_3__0__Impl rule__Machine__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_3__0__Impl_in_rule__Machine__Group_3__01522);
            rule__Machine__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_3__1_in_rule__Machine__Group_3__01525);
            rule__Machine__Group_3__1();

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
    // $ANTLR end "rule__Machine__Group_3__0"


    // $ANTLR start "rule__Machine__Group_3__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:772:1: rule__Machine__Group_3__0__Impl : ( '//' ) ;
    public final void rule__Machine__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:776:1: ( ( '//' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:777:1: ( '//' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:777:1: ( '//' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:778:1: '//'
            {
             before(grammarAccess.getMachineAccess().getSolidusSolidusKeyword_3_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Machine__Group_3__0__Impl1553); 
             after(grammarAccess.getMachineAccess().getSolidusSolidusKeyword_3_0()); 

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
    // $ANTLR end "rule__Machine__Group_3__0__Impl"


    // $ANTLR start "rule__Machine__Group_3__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:791:1: rule__Machine__Group_3__1 : rule__Machine__Group_3__1__Impl ;
    public final void rule__Machine__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:795:1: ( rule__Machine__Group_3__1__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:796:2: rule__Machine__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_3__1__Impl_in_rule__Machine__Group_3__11584);
            rule__Machine__Group_3__1__Impl();

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
    // $ANTLR end "rule__Machine__Group_3__1"


    // $ANTLR start "rule__Machine__Group_3__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:802:1: rule__Machine__Group_3__1__Impl : ( ( rule__Machine__CommentAssignment_3_1 ) ) ;
    public final void rule__Machine__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:806:1: ( ( ( rule__Machine__CommentAssignment_3_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:807:1: ( ( rule__Machine__CommentAssignment_3_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:807:1: ( ( rule__Machine__CommentAssignment_3_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:808:1: ( rule__Machine__CommentAssignment_3_1 )
            {
             before(grammarAccess.getMachineAccess().getCommentAssignment_3_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:809:1: ( rule__Machine__CommentAssignment_3_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:809:2: rule__Machine__CommentAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__CommentAssignment_3_1_in_rule__Machine__Group_3__1__Impl1611);
            rule__Machine__CommentAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getCommentAssignment_3_1()); 

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
    // $ANTLR end "rule__Machine__Group_3__1__Impl"


    // $ANTLR start "rule__Machine__Group_4__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:823:1: rule__Machine__Group_4__0 : rule__Machine__Group_4__0__Impl rule__Machine__Group_4__1 ;
    public final void rule__Machine__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:827:1: ( rule__Machine__Group_4__0__Impl rule__Machine__Group_4__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:828:2: rule__Machine__Group_4__0__Impl rule__Machine__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_4__0__Impl_in_rule__Machine__Group_4__01645);
            rule__Machine__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_4__1_in_rule__Machine__Group_4__01648);
            rule__Machine__Group_4__1();

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
    // $ANTLR end "rule__Machine__Group_4__0"


    // $ANTLR start "rule__Machine__Group_4__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:835:1: rule__Machine__Group_4__0__Impl : ( 'refines' ) ;
    public final void rule__Machine__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:839:1: ( ( 'refines' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:840:1: ( 'refines' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:840:1: ( 'refines' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:841:1: 'refines'
            {
             before(grammarAccess.getMachineAccess().getRefinesKeyword_4_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Machine__Group_4__0__Impl1676); 
             after(grammarAccess.getMachineAccess().getRefinesKeyword_4_0()); 

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
    // $ANTLR end "rule__Machine__Group_4__0__Impl"


    // $ANTLR start "rule__Machine__Group_4__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:854:1: rule__Machine__Group_4__1 : rule__Machine__Group_4__1__Impl rule__Machine__Group_4__2 ;
    public final void rule__Machine__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:858:1: ( rule__Machine__Group_4__1__Impl rule__Machine__Group_4__2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:859:2: rule__Machine__Group_4__1__Impl rule__Machine__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_4__1__Impl_in_rule__Machine__Group_4__11707);
            rule__Machine__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_4__2_in_rule__Machine__Group_4__11710);
            rule__Machine__Group_4__2();

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
    // $ANTLR end "rule__Machine__Group_4__1"


    // $ANTLR start "rule__Machine__Group_4__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:866:1: rule__Machine__Group_4__1__Impl : ( ( rule__Machine__RefinesAssignment_4_1 ) ) ;
    public final void rule__Machine__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:870:1: ( ( ( rule__Machine__RefinesAssignment_4_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:871:1: ( ( rule__Machine__RefinesAssignment_4_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:871:1: ( ( rule__Machine__RefinesAssignment_4_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:872:1: ( rule__Machine__RefinesAssignment_4_1 )
            {
             before(grammarAccess.getMachineAccess().getRefinesAssignment_4_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:873:1: ( rule__Machine__RefinesAssignment_4_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:873:2: rule__Machine__RefinesAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__RefinesAssignment_4_1_in_rule__Machine__Group_4__1__Impl1737);
            rule__Machine__RefinesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getRefinesAssignment_4_1()); 

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
    // $ANTLR end "rule__Machine__Group_4__1__Impl"


    // $ANTLR start "rule__Machine__Group_4__2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:883:1: rule__Machine__Group_4__2 : rule__Machine__Group_4__2__Impl ;
    public final void rule__Machine__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:887:1: ( rule__Machine__Group_4__2__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:888:2: rule__Machine__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_4__2__Impl_in_rule__Machine__Group_4__21767);
            rule__Machine__Group_4__2__Impl();

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
    // $ANTLR end "rule__Machine__Group_4__2"


    // $ANTLR start "rule__Machine__Group_4__2__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:894:1: rule__Machine__Group_4__2__Impl : ( ( rule__Machine__RefinesAssignment_4_2 )* ) ;
    public final void rule__Machine__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:898:1: ( ( ( rule__Machine__RefinesAssignment_4_2 )* ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:899:1: ( ( rule__Machine__RefinesAssignment_4_2 )* )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:899:1: ( ( rule__Machine__RefinesAssignment_4_2 )* )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:900:1: ( rule__Machine__RefinesAssignment_4_2 )*
            {
             before(grammarAccess.getMachineAccess().getRefinesAssignment_4_2()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:901:1: ( rule__Machine__RefinesAssignment_4_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_ID)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:901:2: rule__Machine__RefinesAssignment_4_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Machine__RefinesAssignment_4_2_in_rule__Machine__Group_4__2__Impl1794);
            	    rule__Machine__RefinesAssignment_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getMachineAccess().getRefinesAssignment_4_2()); 

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
    // $ANTLR end "rule__Machine__Group_4__2__Impl"


    // $ANTLR start "rule__Machine__Group_5__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:917:1: rule__Machine__Group_5__0 : rule__Machine__Group_5__0__Impl rule__Machine__Group_5__1 ;
    public final void rule__Machine__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:921:1: ( rule__Machine__Group_5__0__Impl rule__Machine__Group_5__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:922:2: rule__Machine__Group_5__0__Impl rule__Machine__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_5__0__Impl_in_rule__Machine__Group_5__01831);
            rule__Machine__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_5__1_in_rule__Machine__Group_5__01834);
            rule__Machine__Group_5__1();

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
    // $ANTLR end "rule__Machine__Group_5__0"


    // $ANTLR start "rule__Machine__Group_5__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:929:1: rule__Machine__Group_5__0__Impl : ( 'sees' ) ;
    public final void rule__Machine__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:933:1: ( ( 'sees' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:934:1: ( 'sees' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:934:1: ( 'sees' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:935:1: 'sees'
            {
             before(grammarAccess.getMachineAccess().getSeesKeyword_5_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Machine__Group_5__0__Impl1862); 
             after(grammarAccess.getMachineAccess().getSeesKeyword_5_0()); 

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
    // $ANTLR end "rule__Machine__Group_5__0__Impl"


    // $ANTLR start "rule__Machine__Group_5__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:948:1: rule__Machine__Group_5__1 : rule__Machine__Group_5__1__Impl rule__Machine__Group_5__2 ;
    public final void rule__Machine__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:952:1: ( rule__Machine__Group_5__1__Impl rule__Machine__Group_5__2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:953:2: rule__Machine__Group_5__1__Impl rule__Machine__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_5__1__Impl_in_rule__Machine__Group_5__11893);
            rule__Machine__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_5__2_in_rule__Machine__Group_5__11896);
            rule__Machine__Group_5__2();

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
    // $ANTLR end "rule__Machine__Group_5__1"


    // $ANTLR start "rule__Machine__Group_5__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:960:1: rule__Machine__Group_5__1__Impl : ( ( rule__Machine__SeesAssignment_5_1 ) ) ;
    public final void rule__Machine__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:964:1: ( ( ( rule__Machine__SeesAssignment_5_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:965:1: ( ( rule__Machine__SeesAssignment_5_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:965:1: ( ( rule__Machine__SeesAssignment_5_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:966:1: ( rule__Machine__SeesAssignment_5_1 )
            {
             before(grammarAccess.getMachineAccess().getSeesAssignment_5_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:967:1: ( rule__Machine__SeesAssignment_5_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:967:2: rule__Machine__SeesAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__SeesAssignment_5_1_in_rule__Machine__Group_5__1__Impl1923);
            rule__Machine__SeesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getSeesAssignment_5_1()); 

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
    // $ANTLR end "rule__Machine__Group_5__1__Impl"


    // $ANTLR start "rule__Machine__Group_5__2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:977:1: rule__Machine__Group_5__2 : rule__Machine__Group_5__2__Impl ;
    public final void rule__Machine__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:981:1: ( rule__Machine__Group_5__2__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:982:2: rule__Machine__Group_5__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_5__2__Impl_in_rule__Machine__Group_5__21953);
            rule__Machine__Group_5__2__Impl();

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
    // $ANTLR end "rule__Machine__Group_5__2"


    // $ANTLR start "rule__Machine__Group_5__2__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:988:1: rule__Machine__Group_5__2__Impl : ( ( rule__Machine__SeesAssignment_5_2 )* ) ;
    public final void rule__Machine__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:992:1: ( ( ( rule__Machine__SeesAssignment_5_2 )* ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:993:1: ( ( rule__Machine__SeesAssignment_5_2 )* )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:993:1: ( ( rule__Machine__SeesAssignment_5_2 )* )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:994:1: ( rule__Machine__SeesAssignment_5_2 )*
            {
             before(grammarAccess.getMachineAccess().getSeesAssignment_5_2()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:995:1: ( rule__Machine__SeesAssignment_5_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_ID)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:995:2: rule__Machine__SeesAssignment_5_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Machine__SeesAssignment_5_2_in_rule__Machine__Group_5__2__Impl1980);
            	    rule__Machine__SeesAssignment_5_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getMachineAccess().getSeesAssignment_5_2()); 

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
    // $ANTLR end "rule__Machine__Group_5__2__Impl"


    // $ANTLR start "rule__Machine__Group_6__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1011:1: rule__Machine__Group_6__0 : rule__Machine__Group_6__0__Impl rule__Machine__Group_6__1 ;
    public final void rule__Machine__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1015:1: ( rule__Machine__Group_6__0__Impl rule__Machine__Group_6__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1016:2: rule__Machine__Group_6__0__Impl rule__Machine__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_6__0__Impl_in_rule__Machine__Group_6__02017);
            rule__Machine__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_6__1_in_rule__Machine__Group_6__02020);
            rule__Machine__Group_6__1();

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
    // $ANTLR end "rule__Machine__Group_6__0"


    // $ANTLR start "rule__Machine__Group_6__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1023:1: rule__Machine__Group_6__0__Impl : ( 'variables' ) ;
    public final void rule__Machine__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1027:1: ( ( 'variables' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1028:1: ( 'variables' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1028:1: ( 'variables' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1029:1: 'variables'
            {
             before(grammarAccess.getMachineAccess().getVariablesKeyword_6_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Machine__Group_6__0__Impl2048); 
             after(grammarAccess.getMachineAccess().getVariablesKeyword_6_0()); 

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
    // $ANTLR end "rule__Machine__Group_6__0__Impl"


    // $ANTLR start "rule__Machine__Group_6__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1042:1: rule__Machine__Group_6__1 : rule__Machine__Group_6__1__Impl rule__Machine__Group_6__2 ;
    public final void rule__Machine__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1046:1: ( rule__Machine__Group_6__1__Impl rule__Machine__Group_6__2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1047:2: rule__Machine__Group_6__1__Impl rule__Machine__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_6__1__Impl_in_rule__Machine__Group_6__12079);
            rule__Machine__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_6__2_in_rule__Machine__Group_6__12082);
            rule__Machine__Group_6__2();

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
    // $ANTLR end "rule__Machine__Group_6__1"


    // $ANTLR start "rule__Machine__Group_6__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1054:1: rule__Machine__Group_6__1__Impl : ( ( rule__Machine__VariablesAssignment_6_1 ) ) ;
    public final void rule__Machine__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1058:1: ( ( ( rule__Machine__VariablesAssignment_6_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1059:1: ( ( rule__Machine__VariablesAssignment_6_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1059:1: ( ( rule__Machine__VariablesAssignment_6_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1060:1: ( rule__Machine__VariablesAssignment_6_1 )
            {
             before(grammarAccess.getMachineAccess().getVariablesAssignment_6_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1061:1: ( rule__Machine__VariablesAssignment_6_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1061:2: rule__Machine__VariablesAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__VariablesAssignment_6_1_in_rule__Machine__Group_6__1__Impl2109);
            rule__Machine__VariablesAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getVariablesAssignment_6_1()); 

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
    // $ANTLR end "rule__Machine__Group_6__1__Impl"


    // $ANTLR start "rule__Machine__Group_6__2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1071:1: rule__Machine__Group_6__2 : rule__Machine__Group_6__2__Impl ;
    public final void rule__Machine__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1075:1: ( rule__Machine__Group_6__2__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1076:2: rule__Machine__Group_6__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_6__2__Impl_in_rule__Machine__Group_6__22139);
            rule__Machine__Group_6__2__Impl();

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
    // $ANTLR end "rule__Machine__Group_6__2"


    // $ANTLR start "rule__Machine__Group_6__2__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1082:1: rule__Machine__Group_6__2__Impl : ( ( rule__Machine__VariablesAssignment_6_2 )* ) ;
    public final void rule__Machine__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1086:1: ( ( ( rule__Machine__VariablesAssignment_6_2 )* ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1087:1: ( ( rule__Machine__VariablesAssignment_6_2 )* )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1087:1: ( ( rule__Machine__VariablesAssignment_6_2 )* )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1088:1: ( rule__Machine__VariablesAssignment_6_2 )*
            {
             before(grammarAccess.getMachineAccess().getVariablesAssignment_6_2()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1089:1: ( rule__Machine__VariablesAssignment_6_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_ID)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1089:2: rule__Machine__VariablesAssignment_6_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Machine__VariablesAssignment_6_2_in_rule__Machine__Group_6__2__Impl2166);
            	    rule__Machine__VariablesAssignment_6_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getMachineAccess().getVariablesAssignment_6_2()); 

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
    // $ANTLR end "rule__Machine__Group_6__2__Impl"


    // $ANTLR start "rule__Machine__Group_7__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1105:1: rule__Machine__Group_7__0 : rule__Machine__Group_7__0__Impl rule__Machine__Group_7__1 ;
    public final void rule__Machine__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1109:1: ( rule__Machine__Group_7__0__Impl rule__Machine__Group_7__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1110:2: rule__Machine__Group_7__0__Impl rule__Machine__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_7__0__Impl_in_rule__Machine__Group_7__02203);
            rule__Machine__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_7__1_in_rule__Machine__Group_7__02206);
            rule__Machine__Group_7__1();

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
    // $ANTLR end "rule__Machine__Group_7__0"


    // $ANTLR start "rule__Machine__Group_7__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1117:1: rule__Machine__Group_7__0__Impl : ( 'invariants' ) ;
    public final void rule__Machine__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1121:1: ( ( 'invariants' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1122:1: ( 'invariants' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1122:1: ( 'invariants' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1123:1: 'invariants'
            {
             before(grammarAccess.getMachineAccess().getInvariantsKeyword_7_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Machine__Group_7__0__Impl2234); 
             after(grammarAccess.getMachineAccess().getInvariantsKeyword_7_0()); 

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
    // $ANTLR end "rule__Machine__Group_7__0__Impl"


    // $ANTLR start "rule__Machine__Group_7__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1136:1: rule__Machine__Group_7__1 : rule__Machine__Group_7__1__Impl rule__Machine__Group_7__2 ;
    public final void rule__Machine__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1140:1: ( rule__Machine__Group_7__1__Impl rule__Machine__Group_7__2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1141:2: rule__Machine__Group_7__1__Impl rule__Machine__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_7__1__Impl_in_rule__Machine__Group_7__12265);
            rule__Machine__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_7__2_in_rule__Machine__Group_7__12268);
            rule__Machine__Group_7__2();

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
    // $ANTLR end "rule__Machine__Group_7__1"


    // $ANTLR start "rule__Machine__Group_7__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1148:1: rule__Machine__Group_7__1__Impl : ( ( rule__Machine__InvariantsAssignment_7_1 ) ) ;
    public final void rule__Machine__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1152:1: ( ( ( rule__Machine__InvariantsAssignment_7_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1153:1: ( ( rule__Machine__InvariantsAssignment_7_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1153:1: ( ( rule__Machine__InvariantsAssignment_7_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1154:1: ( rule__Machine__InvariantsAssignment_7_1 )
            {
             before(grammarAccess.getMachineAccess().getInvariantsAssignment_7_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1155:1: ( rule__Machine__InvariantsAssignment_7_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1155:2: rule__Machine__InvariantsAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__InvariantsAssignment_7_1_in_rule__Machine__Group_7__1__Impl2295);
            rule__Machine__InvariantsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getInvariantsAssignment_7_1()); 

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
    // $ANTLR end "rule__Machine__Group_7__1__Impl"


    // $ANTLR start "rule__Machine__Group_7__2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1165:1: rule__Machine__Group_7__2 : rule__Machine__Group_7__2__Impl ;
    public final void rule__Machine__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1169:1: ( rule__Machine__Group_7__2__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1170:2: rule__Machine__Group_7__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_7__2__Impl_in_rule__Machine__Group_7__22325);
            rule__Machine__Group_7__2__Impl();

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
    // $ANTLR end "rule__Machine__Group_7__2"


    // $ANTLR start "rule__Machine__Group_7__2__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1176:1: rule__Machine__Group_7__2__Impl : ( ( rule__Machine__InvariantsAssignment_7_2 )* ) ;
    public final void rule__Machine__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1180:1: ( ( ( rule__Machine__InvariantsAssignment_7_2 )* ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1181:1: ( ( rule__Machine__InvariantsAssignment_7_2 )* )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1181:1: ( ( rule__Machine__InvariantsAssignment_7_2 )* )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1182:1: ( rule__Machine__InvariantsAssignment_7_2 )*
            {
             before(grammarAccess.getMachineAccess().getInvariantsAssignment_7_2()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1183:1: ( rule__Machine__InvariantsAssignment_7_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==23) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1183:2: rule__Machine__InvariantsAssignment_7_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Machine__InvariantsAssignment_7_2_in_rule__Machine__Group_7__2__Impl2352);
            	    rule__Machine__InvariantsAssignment_7_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getMachineAccess().getInvariantsAssignment_7_2()); 

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
    // $ANTLR end "rule__Machine__Group_7__2__Impl"


    // $ANTLR start "rule__Machine__Group_8__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1199:1: rule__Machine__Group_8__0 : rule__Machine__Group_8__0__Impl rule__Machine__Group_8__1 ;
    public final void rule__Machine__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1203:1: ( rule__Machine__Group_8__0__Impl rule__Machine__Group_8__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1204:2: rule__Machine__Group_8__0__Impl rule__Machine__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_8__0__Impl_in_rule__Machine__Group_8__02389);
            rule__Machine__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_8__1_in_rule__Machine__Group_8__02392);
            rule__Machine__Group_8__1();

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
    // $ANTLR end "rule__Machine__Group_8__0"


    // $ANTLR start "rule__Machine__Group_8__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1211:1: rule__Machine__Group_8__0__Impl : ( 'variant' ) ;
    public final void rule__Machine__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1215:1: ( ( 'variant' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1216:1: ( 'variant' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1216:1: ( 'variant' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1217:1: 'variant'
            {
             before(grammarAccess.getMachineAccess().getVariantKeyword_8_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Machine__Group_8__0__Impl2420); 
             after(grammarAccess.getMachineAccess().getVariantKeyword_8_0()); 

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
    // $ANTLR end "rule__Machine__Group_8__0__Impl"


    // $ANTLR start "rule__Machine__Group_8__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1230:1: rule__Machine__Group_8__1 : rule__Machine__Group_8__1__Impl ;
    public final void rule__Machine__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1234:1: ( rule__Machine__Group_8__1__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1235:2: rule__Machine__Group_8__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_8__1__Impl_in_rule__Machine__Group_8__12451);
            rule__Machine__Group_8__1__Impl();

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
    // $ANTLR end "rule__Machine__Group_8__1"


    // $ANTLR start "rule__Machine__Group_8__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1241:1: rule__Machine__Group_8__1__Impl : ( ( rule__Machine__VariantAssignment_8_1 ) ) ;
    public final void rule__Machine__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1245:1: ( ( ( rule__Machine__VariantAssignment_8_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1246:1: ( ( rule__Machine__VariantAssignment_8_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1246:1: ( ( rule__Machine__VariantAssignment_8_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1247:1: ( rule__Machine__VariantAssignment_8_1 )
            {
             before(grammarAccess.getMachineAccess().getVariantAssignment_8_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1248:1: ( rule__Machine__VariantAssignment_8_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1248:2: rule__Machine__VariantAssignment_8_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__VariantAssignment_8_1_in_rule__Machine__Group_8__1__Impl2478);
            rule__Machine__VariantAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getVariantAssignment_8_1()); 

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
    // $ANTLR end "rule__Machine__Group_8__1__Impl"


    // $ANTLR start "rule__Machine__Group_9__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1262:1: rule__Machine__Group_9__0 : rule__Machine__Group_9__0__Impl rule__Machine__Group_9__1 ;
    public final void rule__Machine__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1266:1: ( rule__Machine__Group_9__0__Impl rule__Machine__Group_9__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1267:2: rule__Machine__Group_9__0__Impl rule__Machine__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_9__0__Impl_in_rule__Machine__Group_9__02512);
            rule__Machine__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_9__1_in_rule__Machine__Group_9__02515);
            rule__Machine__Group_9__1();

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
    // $ANTLR end "rule__Machine__Group_9__0"


    // $ANTLR start "rule__Machine__Group_9__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1274:1: rule__Machine__Group_9__0__Impl : ( 'events' ) ;
    public final void rule__Machine__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1278:1: ( ( 'events' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1279:1: ( 'events' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1279:1: ( 'events' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1280:1: 'events'
            {
             before(grammarAccess.getMachineAccess().getEventsKeyword_9_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Machine__Group_9__0__Impl2543); 
             after(grammarAccess.getMachineAccess().getEventsKeyword_9_0()); 

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
    // $ANTLR end "rule__Machine__Group_9__0__Impl"


    // $ANTLR start "rule__Machine__Group_9__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1293:1: rule__Machine__Group_9__1 : rule__Machine__Group_9__1__Impl rule__Machine__Group_9__2 ;
    public final void rule__Machine__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1297:1: ( rule__Machine__Group_9__1__Impl rule__Machine__Group_9__2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1298:2: rule__Machine__Group_9__1__Impl rule__Machine__Group_9__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_9__1__Impl_in_rule__Machine__Group_9__12574);
            rule__Machine__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_9__2_in_rule__Machine__Group_9__12577);
            rule__Machine__Group_9__2();

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
    // $ANTLR end "rule__Machine__Group_9__1"


    // $ANTLR start "rule__Machine__Group_9__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1305:1: rule__Machine__Group_9__1__Impl : ( ( rule__Machine__EventsAssignment_9_1 ) ) ;
    public final void rule__Machine__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1309:1: ( ( ( rule__Machine__EventsAssignment_9_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1310:1: ( ( rule__Machine__EventsAssignment_9_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1310:1: ( ( rule__Machine__EventsAssignment_9_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1311:1: ( rule__Machine__EventsAssignment_9_1 )
            {
             before(grammarAccess.getMachineAccess().getEventsAssignment_9_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1312:1: ( rule__Machine__EventsAssignment_9_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1312:2: rule__Machine__EventsAssignment_9_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__EventsAssignment_9_1_in_rule__Machine__Group_9__1__Impl2604);
            rule__Machine__EventsAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getEventsAssignment_9_1()); 

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
    // $ANTLR end "rule__Machine__Group_9__1__Impl"


    // $ANTLR start "rule__Machine__Group_9__2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1322:1: rule__Machine__Group_9__2 : rule__Machine__Group_9__2__Impl ;
    public final void rule__Machine__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1326:1: ( rule__Machine__Group_9__2__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1327:2: rule__Machine__Group_9__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_9__2__Impl_in_rule__Machine__Group_9__22634);
            rule__Machine__Group_9__2__Impl();

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
    // $ANTLR end "rule__Machine__Group_9__2"


    // $ANTLR start "rule__Machine__Group_9__2__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1333:1: rule__Machine__Group_9__2__Impl : ( ( rule__Machine__EventsAssignment_9_2 )* ) ;
    public final void rule__Machine__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1337:1: ( ( ( rule__Machine__EventsAssignment_9_2 )* ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1338:1: ( ( rule__Machine__EventsAssignment_9_2 )* )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1338:1: ( ( rule__Machine__EventsAssignment_9_2 )* )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1339:1: ( rule__Machine__EventsAssignment_9_2 )*
            {
             before(grammarAccess.getMachineAccess().getEventsAssignment_9_2()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1340:1: ( rule__Machine__EventsAssignment_9_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==26) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1340:2: rule__Machine__EventsAssignment_9_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Machine__EventsAssignment_9_2_in_rule__Machine__Group_9__2__Impl2661);
            	    rule__Machine__EventsAssignment_9_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getMachineAccess().getEventsAssignment_9_2()); 

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
    // $ANTLR end "rule__Machine__Group_9__2__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1356:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1360:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1361:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__02698);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__02701);
            rule__Variable__Group__1();

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
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1368:1: rule__Variable__Group__0__Impl : ( () ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1372:1: ( ( () ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1373:1: ( () )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1373:1: ( () )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1374:1: ()
            {
             before(grammarAccess.getVariableAccess().getVariableAction_0()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1375:1: ()
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1377:1: 
            {
            }

             after(grammarAccess.getVariableAccess().getVariableAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1387:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1391:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1392:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__12759);
            rule__Variable__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__2_in_rule__Variable__Group__12762);
            rule__Variable__Group__2();

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
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1399:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__NameAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1403:1: ( ( ( rule__Variable__NameAssignment_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1404:1: ( ( rule__Variable__NameAssignment_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1404:1: ( ( rule__Variable__NameAssignment_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1405:1: ( rule__Variable__NameAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1406:1: ( rule__Variable__NameAssignment_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1406:2: rule__Variable__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__NameAssignment_1_in_rule__Variable__Group__1__Impl2789);
            rule__Variable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Variable__Group__2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1416:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1420:1: ( rule__Variable__Group__2__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1421:2: rule__Variable__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__2__Impl_in_rule__Variable__Group__22819);
            rule__Variable__Group__2__Impl();

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
    // $ANTLR end "rule__Variable__Group__2"


    // $ANTLR start "rule__Variable__Group__2__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1427:1: rule__Variable__Group__2__Impl : ( ( rule__Variable__Group_2__0 )? ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1431:1: ( ( ( rule__Variable__Group_2__0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1432:1: ( ( rule__Variable__Group_2__0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1432:1: ( ( rule__Variable__Group_2__0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1433:1: ( rule__Variable__Group_2__0 )?
            {
             before(grammarAccess.getVariableAccess().getGroup_2()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1434:1: ( rule__Variable__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==16) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1434:2: rule__Variable__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Variable__Group_2__0_in_rule__Variable__Group__2__Impl2846);
                    rule__Variable__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Variable__Group__2__Impl"


    // $ANTLR start "rule__Variable__Group_2__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1450:1: rule__Variable__Group_2__0 : rule__Variable__Group_2__0__Impl rule__Variable__Group_2__1 ;
    public final void rule__Variable__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1454:1: ( rule__Variable__Group_2__0__Impl rule__Variable__Group_2__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1455:2: rule__Variable__Group_2__0__Impl rule__Variable__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group_2__0__Impl_in_rule__Variable__Group_2__02883);
            rule__Variable__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group_2__1_in_rule__Variable__Group_2__02886);
            rule__Variable__Group_2__1();

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
    // $ANTLR end "rule__Variable__Group_2__0"


    // $ANTLR start "rule__Variable__Group_2__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1462:1: rule__Variable__Group_2__0__Impl : ( '//' ) ;
    public final void rule__Variable__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1466:1: ( ( '//' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1467:1: ( '//' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1467:1: ( '//' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1468:1: '//'
            {
             before(grammarAccess.getVariableAccess().getSolidusSolidusKeyword_2_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Variable__Group_2__0__Impl2914); 
             after(grammarAccess.getVariableAccess().getSolidusSolidusKeyword_2_0()); 

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
    // $ANTLR end "rule__Variable__Group_2__0__Impl"


    // $ANTLR start "rule__Variable__Group_2__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1481:1: rule__Variable__Group_2__1 : rule__Variable__Group_2__1__Impl ;
    public final void rule__Variable__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1485:1: ( rule__Variable__Group_2__1__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1486:2: rule__Variable__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group_2__1__Impl_in_rule__Variable__Group_2__12945);
            rule__Variable__Group_2__1__Impl();

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
    // $ANTLR end "rule__Variable__Group_2__1"


    // $ANTLR start "rule__Variable__Group_2__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1492:1: rule__Variable__Group_2__1__Impl : ( ( rule__Variable__CommentAssignment_2_1 ) ) ;
    public final void rule__Variable__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1496:1: ( ( ( rule__Variable__CommentAssignment_2_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1497:1: ( ( rule__Variable__CommentAssignment_2_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1497:1: ( ( rule__Variable__CommentAssignment_2_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1498:1: ( rule__Variable__CommentAssignment_2_1 )
            {
             before(grammarAccess.getVariableAccess().getCommentAssignment_2_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1499:1: ( rule__Variable__CommentAssignment_2_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1499:2: rule__Variable__CommentAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__CommentAssignment_2_1_in_rule__Variable__Group_2__1__Impl2972);
            rule__Variable__CommentAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getCommentAssignment_2_1()); 

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
    // $ANTLR end "rule__Variable__Group_2__1__Impl"


    // $ANTLR start "rule__Invariant__Group__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1513:1: rule__Invariant__Group__0 : rule__Invariant__Group__0__Impl rule__Invariant__Group__1 ;
    public final void rule__Invariant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1517:1: ( rule__Invariant__Group__0__Impl rule__Invariant__Group__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1518:2: rule__Invariant__Group__0__Impl rule__Invariant__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__0__Impl_in_rule__Invariant__Group__03006);
            rule__Invariant__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__1_in_rule__Invariant__Group__03009);
            rule__Invariant__Group__1();

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
    // $ANTLR end "rule__Invariant__Group__0"


    // $ANTLR start "rule__Invariant__Group__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1525:1: rule__Invariant__Group__0__Impl : ( '@' ) ;
    public final void rule__Invariant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1529:1: ( ( '@' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1530:1: ( '@' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1530:1: ( '@' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1531:1: '@'
            {
             before(grammarAccess.getInvariantAccess().getCommercialAtKeyword_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Invariant__Group__0__Impl3037); 
             after(grammarAccess.getInvariantAccess().getCommercialAtKeyword_0()); 

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
    // $ANTLR end "rule__Invariant__Group__0__Impl"


    // $ANTLR start "rule__Invariant__Group__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1544:1: rule__Invariant__Group__1 : rule__Invariant__Group__1__Impl rule__Invariant__Group__2 ;
    public final void rule__Invariant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1548:1: ( rule__Invariant__Group__1__Impl rule__Invariant__Group__2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1549:2: rule__Invariant__Group__1__Impl rule__Invariant__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__1__Impl_in_rule__Invariant__Group__13068);
            rule__Invariant__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__2_in_rule__Invariant__Group__13071);
            rule__Invariant__Group__2();

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
    // $ANTLR end "rule__Invariant__Group__1"


    // $ANTLR start "rule__Invariant__Group__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1556:1: rule__Invariant__Group__1__Impl : ( ( rule__Invariant__NameAssignment_1 ) ) ;
    public final void rule__Invariant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1560:1: ( ( ( rule__Invariant__NameAssignment_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1561:1: ( ( rule__Invariant__NameAssignment_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1561:1: ( ( rule__Invariant__NameAssignment_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1562:1: ( rule__Invariant__NameAssignment_1 )
            {
             before(grammarAccess.getInvariantAccess().getNameAssignment_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1563:1: ( rule__Invariant__NameAssignment_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1563:2: rule__Invariant__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__NameAssignment_1_in_rule__Invariant__Group__1__Impl3098);
            rule__Invariant__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInvariantAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Invariant__Group__1__Impl"


    // $ANTLR start "rule__Invariant__Group__2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1573:1: rule__Invariant__Group__2 : rule__Invariant__Group__2__Impl rule__Invariant__Group__3 ;
    public final void rule__Invariant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1577:1: ( rule__Invariant__Group__2__Impl rule__Invariant__Group__3 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1578:2: rule__Invariant__Group__2__Impl rule__Invariant__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__2__Impl_in_rule__Invariant__Group__23128);
            rule__Invariant__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__3_in_rule__Invariant__Group__23131);
            rule__Invariant__Group__3();

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
    // $ANTLR end "rule__Invariant__Group__2"


    // $ANTLR start "rule__Invariant__Group__2__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1585:1: rule__Invariant__Group__2__Impl : ( ( rule__Invariant__PredicateAssignment_2 )? ) ;
    public final void rule__Invariant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1589:1: ( ( ( rule__Invariant__PredicateAssignment_2 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1590:1: ( ( rule__Invariant__PredicateAssignment_2 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1590:1: ( ( rule__Invariant__PredicateAssignment_2 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1591:1: ( rule__Invariant__PredicateAssignment_2 )?
            {
             before(grammarAccess.getInvariantAccess().getPredicateAssignment_2()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1592:1: ( rule__Invariant__PredicateAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1592:2: rule__Invariant__PredicateAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Invariant__PredicateAssignment_2_in_rule__Invariant__Group__2__Impl3158);
                    rule__Invariant__PredicateAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInvariantAccess().getPredicateAssignment_2()); 

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
    // $ANTLR end "rule__Invariant__Group__2__Impl"


    // $ANTLR start "rule__Invariant__Group__3"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1602:1: rule__Invariant__Group__3 : rule__Invariant__Group__3__Impl rule__Invariant__Group__4 ;
    public final void rule__Invariant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1606:1: ( rule__Invariant__Group__3__Impl rule__Invariant__Group__4 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1607:2: rule__Invariant__Group__3__Impl rule__Invariant__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__3__Impl_in_rule__Invariant__Group__33189);
            rule__Invariant__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__4_in_rule__Invariant__Group__33192);
            rule__Invariant__Group__4();

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
    // $ANTLR end "rule__Invariant__Group__3"


    // $ANTLR start "rule__Invariant__Group__3__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1614:1: rule__Invariant__Group__3__Impl : ( ( rule__Invariant__TheoremAssignment_3 )? ) ;
    public final void rule__Invariant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1618:1: ( ( ( rule__Invariant__TheoremAssignment_3 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1619:1: ( ( rule__Invariant__TheoremAssignment_3 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1619:1: ( ( rule__Invariant__TheoremAssignment_3 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1620:1: ( rule__Invariant__TheoremAssignment_3 )?
            {
             before(grammarAccess.getInvariantAccess().getTheoremAssignment_3()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1621:1: ( rule__Invariant__TheoremAssignment_3 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1621:2: rule__Invariant__TheoremAssignment_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Invariant__TheoremAssignment_3_in_rule__Invariant__Group__3__Impl3219);
                    rule__Invariant__TheoremAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInvariantAccess().getTheoremAssignment_3()); 

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
    // $ANTLR end "rule__Invariant__Group__3__Impl"


    // $ANTLR start "rule__Invariant__Group__4"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1631:1: rule__Invariant__Group__4 : rule__Invariant__Group__4__Impl ;
    public final void rule__Invariant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1635:1: ( rule__Invariant__Group__4__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1636:2: rule__Invariant__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__4__Impl_in_rule__Invariant__Group__43250);
            rule__Invariant__Group__4__Impl();

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
    // $ANTLR end "rule__Invariant__Group__4"


    // $ANTLR start "rule__Invariant__Group__4__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1642:1: rule__Invariant__Group__4__Impl : ( ( rule__Invariant__Group_4__0 )? ) ;
    public final void rule__Invariant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1646:1: ( ( ( rule__Invariant__Group_4__0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1647:1: ( ( rule__Invariant__Group_4__0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1647:1: ( ( rule__Invariant__Group_4__0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1648:1: ( rule__Invariant__Group_4__0 )?
            {
             before(grammarAccess.getInvariantAccess().getGroup_4()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1649:1: ( rule__Invariant__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==16) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1649:2: rule__Invariant__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group_4__0_in_rule__Invariant__Group__4__Impl3277);
                    rule__Invariant__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInvariantAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Invariant__Group__4__Impl"


    // $ANTLR start "rule__Invariant__Group_4__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1669:1: rule__Invariant__Group_4__0 : rule__Invariant__Group_4__0__Impl rule__Invariant__Group_4__1 ;
    public final void rule__Invariant__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1673:1: ( rule__Invariant__Group_4__0__Impl rule__Invariant__Group_4__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1674:2: rule__Invariant__Group_4__0__Impl rule__Invariant__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group_4__0__Impl_in_rule__Invariant__Group_4__03318);
            rule__Invariant__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group_4__1_in_rule__Invariant__Group_4__03321);
            rule__Invariant__Group_4__1();

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
    // $ANTLR end "rule__Invariant__Group_4__0"


    // $ANTLR start "rule__Invariant__Group_4__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1681:1: rule__Invariant__Group_4__0__Impl : ( '//' ) ;
    public final void rule__Invariant__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1685:1: ( ( '//' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1686:1: ( '//' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1686:1: ( '//' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1687:1: '//'
            {
             before(grammarAccess.getInvariantAccess().getSolidusSolidusKeyword_4_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Invariant__Group_4__0__Impl3349); 
             after(grammarAccess.getInvariantAccess().getSolidusSolidusKeyword_4_0()); 

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
    // $ANTLR end "rule__Invariant__Group_4__0__Impl"


    // $ANTLR start "rule__Invariant__Group_4__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1700:1: rule__Invariant__Group_4__1 : rule__Invariant__Group_4__1__Impl ;
    public final void rule__Invariant__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1704:1: ( rule__Invariant__Group_4__1__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1705:2: rule__Invariant__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group_4__1__Impl_in_rule__Invariant__Group_4__13380);
            rule__Invariant__Group_4__1__Impl();

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
    // $ANTLR end "rule__Invariant__Group_4__1"


    // $ANTLR start "rule__Invariant__Group_4__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1711:1: rule__Invariant__Group_4__1__Impl : ( ( rule__Invariant__CommentAssignment_4_1 ) ) ;
    public final void rule__Invariant__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1715:1: ( ( ( rule__Invariant__CommentAssignment_4_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1716:1: ( ( rule__Invariant__CommentAssignment_4_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1716:1: ( ( rule__Invariant__CommentAssignment_4_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1717:1: ( rule__Invariant__CommentAssignment_4_1 )
            {
             before(grammarAccess.getInvariantAccess().getCommentAssignment_4_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1718:1: ( rule__Invariant__CommentAssignment_4_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1718:2: rule__Invariant__CommentAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__CommentAssignment_4_1_in_rule__Invariant__Group_4__1__Impl3407);
            rule__Invariant__CommentAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getInvariantAccess().getCommentAssignment_4_1()); 

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
    // $ANTLR end "rule__Invariant__Group_4__1__Impl"


    // $ANTLR start "rule__Variant__Group__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1732:1: rule__Variant__Group__0 : rule__Variant__Group__0__Impl rule__Variant__Group__1 ;
    public final void rule__Variant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1736:1: ( rule__Variant__Group__0__Impl rule__Variant__Group__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1737:2: rule__Variant__Group__0__Impl rule__Variant__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variant__Group__0__Impl_in_rule__Variant__Group__03441);
            rule__Variant__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Variant__Group__1_in_rule__Variant__Group__03444);
            rule__Variant__Group__1();

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
    // $ANTLR end "rule__Variant__Group__0"


    // $ANTLR start "rule__Variant__Group__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1744:1: rule__Variant__Group__0__Impl : ( 'Variant' ) ;
    public final void rule__Variant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1748:1: ( ( 'Variant' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1749:1: ( 'Variant' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1749:1: ( 'Variant' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1750:1: 'Variant'
            {
             before(grammarAccess.getVariantAccess().getVariantKeyword_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Variant__Group__0__Impl3472); 
             after(grammarAccess.getVariantAccess().getVariantKeyword_0()); 

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
    // $ANTLR end "rule__Variant__Group__0__Impl"


    // $ANTLR start "rule__Variant__Group__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1763:1: rule__Variant__Group__1 : rule__Variant__Group__1__Impl rule__Variant__Group__2 ;
    public final void rule__Variant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1767:1: ( rule__Variant__Group__1__Impl rule__Variant__Group__2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1768:2: rule__Variant__Group__1__Impl rule__Variant__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variant__Group__1__Impl_in_rule__Variant__Group__13503);
            rule__Variant__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Variant__Group__2_in_rule__Variant__Group__13506);
            rule__Variant__Group__2();

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
    // $ANTLR end "rule__Variant__Group__1"


    // $ANTLR start "rule__Variant__Group__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1775:1: rule__Variant__Group__1__Impl : ( 'expression' ) ;
    public final void rule__Variant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1779:1: ( ( 'expression' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1780:1: ( 'expression' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1780:1: ( 'expression' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1781:1: 'expression'
            {
             before(grammarAccess.getVariantAccess().getExpressionKeyword_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Variant__Group__1__Impl3534); 
             after(grammarAccess.getVariantAccess().getExpressionKeyword_1()); 

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
    // $ANTLR end "rule__Variant__Group__1__Impl"


    // $ANTLR start "rule__Variant__Group__2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1794:1: rule__Variant__Group__2 : rule__Variant__Group__2__Impl rule__Variant__Group__3 ;
    public final void rule__Variant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1798:1: ( rule__Variant__Group__2__Impl rule__Variant__Group__3 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1799:2: rule__Variant__Group__2__Impl rule__Variant__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variant__Group__2__Impl_in_rule__Variant__Group__23565);
            rule__Variant__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Variant__Group__3_in_rule__Variant__Group__23568);
            rule__Variant__Group__3();

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
    // $ANTLR end "rule__Variant__Group__2"


    // $ANTLR start "rule__Variant__Group__2__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1806:1: rule__Variant__Group__2__Impl : ( ( rule__Variant__ExpressionAssignment_2 )? ) ;
    public final void rule__Variant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1810:1: ( ( ( rule__Variant__ExpressionAssignment_2 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1811:1: ( ( rule__Variant__ExpressionAssignment_2 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1811:1: ( ( rule__Variant__ExpressionAssignment_2 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1812:1: ( rule__Variant__ExpressionAssignment_2 )?
            {
             before(grammarAccess.getVariantAccess().getExpressionAssignment_2()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1813:1: ( rule__Variant__ExpressionAssignment_2 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_STRING && LA19_0<=RULE_ID)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1813:2: rule__Variant__ExpressionAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Variant__ExpressionAssignment_2_in_rule__Variant__Group__2__Impl3595);
                    rule__Variant__ExpressionAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariantAccess().getExpressionAssignment_2()); 

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
    // $ANTLR end "rule__Variant__Group__2__Impl"


    // $ANTLR start "rule__Variant__Group__3"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1823:1: rule__Variant__Group__3 : rule__Variant__Group__3__Impl ;
    public final void rule__Variant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1827:1: ( rule__Variant__Group__3__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1828:2: rule__Variant__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variant__Group__3__Impl_in_rule__Variant__Group__33626);
            rule__Variant__Group__3__Impl();

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
    // $ANTLR end "rule__Variant__Group__3"


    // $ANTLR start "rule__Variant__Group__3__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1834:1: rule__Variant__Group__3__Impl : ( ( rule__Variant__Group_3__0 )? ) ;
    public final void rule__Variant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1838:1: ( ( ( rule__Variant__Group_3__0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1839:1: ( ( rule__Variant__Group_3__0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1839:1: ( ( rule__Variant__Group_3__0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1840:1: ( rule__Variant__Group_3__0 )?
            {
             before(grammarAccess.getVariantAccess().getGroup_3()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1841:1: ( rule__Variant__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==16) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1841:2: rule__Variant__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Variant__Group_3__0_in_rule__Variant__Group__3__Impl3653);
                    rule__Variant__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariantAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Variant__Group__3__Impl"


    // $ANTLR start "rule__Variant__Group_3__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1859:1: rule__Variant__Group_3__0 : rule__Variant__Group_3__0__Impl rule__Variant__Group_3__1 ;
    public final void rule__Variant__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1863:1: ( rule__Variant__Group_3__0__Impl rule__Variant__Group_3__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1864:2: rule__Variant__Group_3__0__Impl rule__Variant__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variant__Group_3__0__Impl_in_rule__Variant__Group_3__03692);
            rule__Variant__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Variant__Group_3__1_in_rule__Variant__Group_3__03695);
            rule__Variant__Group_3__1();

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
    // $ANTLR end "rule__Variant__Group_3__0"


    // $ANTLR start "rule__Variant__Group_3__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1871:1: rule__Variant__Group_3__0__Impl : ( '//' ) ;
    public final void rule__Variant__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1875:1: ( ( '//' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1876:1: ( '//' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1876:1: ( '//' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1877:1: '//'
            {
             before(grammarAccess.getVariantAccess().getSolidusSolidusKeyword_3_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Variant__Group_3__0__Impl3723); 
             after(grammarAccess.getVariantAccess().getSolidusSolidusKeyword_3_0()); 

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
    // $ANTLR end "rule__Variant__Group_3__0__Impl"


    // $ANTLR start "rule__Variant__Group_3__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1890:1: rule__Variant__Group_3__1 : rule__Variant__Group_3__1__Impl ;
    public final void rule__Variant__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1894:1: ( rule__Variant__Group_3__1__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1895:2: rule__Variant__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variant__Group_3__1__Impl_in_rule__Variant__Group_3__13754);
            rule__Variant__Group_3__1__Impl();

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
    // $ANTLR end "rule__Variant__Group_3__1"


    // $ANTLR start "rule__Variant__Group_3__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1901:1: rule__Variant__Group_3__1__Impl : ( ( rule__Variant__CommentAssignment_3_1 ) ) ;
    public final void rule__Variant__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1905:1: ( ( ( rule__Variant__CommentAssignment_3_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1906:1: ( ( rule__Variant__CommentAssignment_3_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1906:1: ( ( rule__Variant__CommentAssignment_3_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1907:1: ( rule__Variant__CommentAssignment_3_1 )
            {
             before(grammarAccess.getVariantAccess().getCommentAssignment_3_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1908:1: ( rule__Variant__CommentAssignment_3_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1908:2: rule__Variant__CommentAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variant__CommentAssignment_3_1_in_rule__Variant__Group_3__1__Impl3781);
            rule__Variant__CommentAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getVariantAccess().getCommentAssignment_3_1()); 

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
    // $ANTLR end "rule__Variant__Group_3__1__Impl"


    // $ANTLR start "rule__Event__Group__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1922:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1926:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1927:2: rule__Event__Group__0__Impl rule__Event__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__03815);
            rule__Event__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__1_in_rule__Event__Group__03818);
            rule__Event__Group__1();

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
    // $ANTLR end "rule__Event__Group__0"


    // $ANTLR start "rule__Event__Group__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1934:1: rule__Event__Group__0__Impl : ( () ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1938:1: ( ( () ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1939:1: ( () )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1939:1: ( () )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1940:1: ()
            {
             before(grammarAccess.getEventAccess().getEventAction_0()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1941:1: ()
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1943:1: 
            {
            }

             after(grammarAccess.getEventAccess().getEventAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__0__Impl"


    // $ANTLR start "rule__Event__Group__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1953:1: rule__Event__Group__1 : rule__Event__Group__1__Impl rule__Event__Group__2 ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1957:1: ( rule__Event__Group__1__Impl rule__Event__Group__2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1958:2: rule__Event__Group__1__Impl rule__Event__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__13876);
            rule__Event__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__2_in_rule__Event__Group__13879);
            rule__Event__Group__2();

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
    // $ANTLR end "rule__Event__Group__1"


    // $ANTLR start "rule__Event__Group__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1965:1: rule__Event__Group__1__Impl : ( 'event' ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1969:1: ( ( 'event' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1970:1: ( 'event' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1970:1: ( 'event' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1971:1: 'event'
            {
             before(grammarAccess.getEventAccess().getEventKeyword_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Event__Group__1__Impl3907); 
             after(grammarAccess.getEventAccess().getEventKeyword_1()); 

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
    // $ANTLR end "rule__Event__Group__1__Impl"


    // $ANTLR start "rule__Event__Group__2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1984:1: rule__Event__Group__2 : rule__Event__Group__2__Impl rule__Event__Group__3 ;
    public final void rule__Event__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1988:1: ( rule__Event__Group__2__Impl rule__Event__Group__3 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1989:2: rule__Event__Group__2__Impl rule__Event__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__2__Impl_in_rule__Event__Group__23938);
            rule__Event__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__3_in_rule__Event__Group__23941);
            rule__Event__Group__3();

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
    // $ANTLR end "rule__Event__Group__2"


    // $ANTLR start "rule__Event__Group__2__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1996:1: rule__Event__Group__2__Impl : ( ( rule__Event__NameAssignment_2 ) ) ;
    public final void rule__Event__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2000:1: ( ( ( rule__Event__NameAssignment_2 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2001:1: ( ( rule__Event__NameAssignment_2 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2001:1: ( ( rule__Event__NameAssignment_2 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2002:1: ( rule__Event__NameAssignment_2 )
            {
             before(grammarAccess.getEventAccess().getNameAssignment_2()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2003:1: ( rule__Event__NameAssignment_2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2003:2: rule__Event__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__NameAssignment_2_in_rule__Event__Group__2__Impl3968);
            rule__Event__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Event__Group__2__Impl"


    // $ANTLR start "rule__Event__Group__3"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2013:1: rule__Event__Group__3 : rule__Event__Group__3__Impl rule__Event__Group__4 ;
    public final void rule__Event__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2017:1: ( rule__Event__Group__3__Impl rule__Event__Group__4 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2018:2: rule__Event__Group__3__Impl rule__Event__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__3__Impl_in_rule__Event__Group__33998);
            rule__Event__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__4_in_rule__Event__Group__34001);
            rule__Event__Group__4();

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
    // $ANTLR end "rule__Event__Group__3"


    // $ANTLR start "rule__Event__Group__3__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2025:1: rule__Event__Group__3__Impl : ( ( rule__Event__ExtendedAssignment_3 )? ) ;
    public final void rule__Event__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2029:1: ( ( ( rule__Event__ExtendedAssignment_3 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2030:1: ( ( rule__Event__ExtendedAssignment_3 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2030:1: ( ( rule__Event__ExtendedAssignment_3 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2031:1: ( rule__Event__ExtendedAssignment_3 )?
            {
             before(grammarAccess.getEventAccess().getExtendedAssignment_3()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2032:1: ( rule__Event__ExtendedAssignment_3 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==34) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2032:2: rule__Event__ExtendedAssignment_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Event__ExtendedAssignment_3_in_rule__Event__Group__3__Impl4028);
                    rule__Event__ExtendedAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEventAccess().getExtendedAssignment_3()); 

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
    // $ANTLR end "rule__Event__Group__3__Impl"


    // $ANTLR start "rule__Event__Group__4"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2042:1: rule__Event__Group__4 : rule__Event__Group__4__Impl rule__Event__Group__5 ;
    public final void rule__Event__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2046:1: ( rule__Event__Group__4__Impl rule__Event__Group__5 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2047:2: rule__Event__Group__4__Impl rule__Event__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__4__Impl_in_rule__Event__Group__44059);
            rule__Event__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__5_in_rule__Event__Group__44062);
            rule__Event__Group__5();

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
    // $ANTLR end "rule__Event__Group__4"


    // $ANTLR start "rule__Event__Group__4__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2054:1: rule__Event__Group__4__Impl : ( ( rule__Event__ConvergenceAssignment_4 )? ) ;
    public final void rule__Event__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2058:1: ( ( ( rule__Event__ConvergenceAssignment_4 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2059:1: ( ( rule__Event__ConvergenceAssignment_4 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2059:1: ( ( rule__Event__ConvergenceAssignment_4 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2060:1: ( rule__Event__ConvergenceAssignment_4 )?
            {
             before(grammarAccess.getEventAccess().getConvergenceAssignment_4()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2061:1: ( rule__Event__ConvergenceAssignment_4 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=11 && LA22_0<=13)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2061:2: rule__Event__ConvergenceAssignment_4
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Event__ConvergenceAssignment_4_in_rule__Event__Group__4__Impl4089);
                    rule__Event__ConvergenceAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEventAccess().getConvergenceAssignment_4()); 

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
    // $ANTLR end "rule__Event__Group__4__Impl"


    // $ANTLR start "rule__Event__Group__5"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2071:1: rule__Event__Group__5 : rule__Event__Group__5__Impl rule__Event__Group__6 ;
    public final void rule__Event__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2075:1: ( rule__Event__Group__5__Impl rule__Event__Group__6 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2076:2: rule__Event__Group__5__Impl rule__Event__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__5__Impl_in_rule__Event__Group__54120);
            rule__Event__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__6_in_rule__Event__Group__54123);
            rule__Event__Group__6();

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
    // $ANTLR end "rule__Event__Group__5"


    // $ANTLR start "rule__Event__Group__5__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2083:1: rule__Event__Group__5__Impl : ( ( rule__Event__Group_5__0 )? ) ;
    public final void rule__Event__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2087:1: ( ( ( rule__Event__Group_5__0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2088:1: ( ( rule__Event__Group_5__0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2088:1: ( ( rule__Event__Group_5__0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2089:1: ( rule__Event__Group_5__0 )?
            {
             before(grammarAccess.getEventAccess().getGroup_5()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2090:1: ( rule__Event__Group_5__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==16) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2090:2: rule__Event__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Event__Group_5__0_in_rule__Event__Group__5__Impl4150);
                    rule__Event__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEventAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Event__Group__5__Impl"


    // $ANTLR start "rule__Event__Group__6"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2100:1: rule__Event__Group__6 : rule__Event__Group__6__Impl rule__Event__Group__7 ;
    public final void rule__Event__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2104:1: ( rule__Event__Group__6__Impl rule__Event__Group__7 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2105:2: rule__Event__Group__6__Impl rule__Event__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__6__Impl_in_rule__Event__Group__64181);
            rule__Event__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__7_in_rule__Event__Group__64184);
            rule__Event__Group__7();

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
    // $ANTLR end "rule__Event__Group__6"


    // $ANTLR start "rule__Event__Group__6__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2112:1: rule__Event__Group__6__Impl : ( ( rule__Event__Group_6__0 )? ) ;
    public final void rule__Event__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2116:1: ( ( ( rule__Event__Group_6__0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2117:1: ( ( rule__Event__Group_6__0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2117:1: ( ( rule__Event__Group_6__0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2118:1: ( rule__Event__Group_6__0 )?
            {
             before(grammarAccess.getEventAccess().getGroup_6()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2119:1: ( rule__Event__Group_6__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==17) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2119:2: rule__Event__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Event__Group_6__0_in_rule__Event__Group__6__Impl4211);
                    rule__Event__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEventAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Event__Group__6__Impl"


    // $ANTLR start "rule__Event__Group__7"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2129:1: rule__Event__Group__7 : rule__Event__Group__7__Impl rule__Event__Group__8 ;
    public final void rule__Event__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2133:1: ( rule__Event__Group__7__Impl rule__Event__Group__8 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2134:2: rule__Event__Group__7__Impl rule__Event__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__7__Impl_in_rule__Event__Group__74242);
            rule__Event__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__8_in_rule__Event__Group__74245);
            rule__Event__Group__8();

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
    // $ANTLR end "rule__Event__Group__7"


    // $ANTLR start "rule__Event__Group__7__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2141:1: rule__Event__Group__7__Impl : ( ( rule__Event__Group_7__0 )? ) ;
    public final void rule__Event__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2145:1: ( ( ( rule__Event__Group_7__0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2146:1: ( ( rule__Event__Group_7__0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2146:1: ( ( rule__Event__Group_7__0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2147:1: ( rule__Event__Group_7__0 )?
            {
             before(grammarAccess.getEventAccess().getGroup_7()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2148:1: ( rule__Event__Group_7__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==28) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2148:2: rule__Event__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Event__Group_7__0_in_rule__Event__Group__7__Impl4272);
                    rule__Event__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEventAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Event__Group__7__Impl"


    // $ANTLR start "rule__Event__Group__8"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2158:1: rule__Event__Group__8 : rule__Event__Group__8__Impl rule__Event__Group__9 ;
    public final void rule__Event__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2162:1: ( rule__Event__Group__8__Impl rule__Event__Group__9 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2163:2: rule__Event__Group__8__Impl rule__Event__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__8__Impl_in_rule__Event__Group__84303);
            rule__Event__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__9_in_rule__Event__Group__84306);
            rule__Event__Group__9();

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
    // $ANTLR end "rule__Event__Group__8"


    // $ANTLR start "rule__Event__Group__8__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2170:1: rule__Event__Group__8__Impl : ( ( rule__Event__Group_8__0 )? ) ;
    public final void rule__Event__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2174:1: ( ( ( rule__Event__Group_8__0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2175:1: ( ( rule__Event__Group_8__0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2175:1: ( ( rule__Event__Group_8__0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2176:1: ( rule__Event__Group_8__0 )?
            {
             before(grammarAccess.getEventAccess().getGroup_8()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2177:1: ( rule__Event__Group_8__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==29) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2177:2: rule__Event__Group_8__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Event__Group_8__0_in_rule__Event__Group__8__Impl4333);
                    rule__Event__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEventAccess().getGroup_8()); 

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
    // $ANTLR end "rule__Event__Group__8__Impl"


    // $ANTLR start "rule__Event__Group__9"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2187:1: rule__Event__Group__9 : rule__Event__Group__9__Impl rule__Event__Group__10 ;
    public final void rule__Event__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2191:1: ( rule__Event__Group__9__Impl rule__Event__Group__10 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2192:2: rule__Event__Group__9__Impl rule__Event__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__9__Impl_in_rule__Event__Group__94364);
            rule__Event__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__10_in_rule__Event__Group__94367);
            rule__Event__Group__10();

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
    // $ANTLR end "rule__Event__Group__9"


    // $ANTLR start "rule__Event__Group__9__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2199:1: rule__Event__Group__9__Impl : ( ( rule__Event__Group_9__0 )? ) ;
    public final void rule__Event__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2203:1: ( ( ( rule__Event__Group_9__0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2204:1: ( ( rule__Event__Group_9__0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2204:1: ( ( rule__Event__Group_9__0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2205:1: ( rule__Event__Group_9__0 )?
            {
             before(grammarAccess.getEventAccess().getGroup_9()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2206:1: ( rule__Event__Group_9__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==31) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2206:2: rule__Event__Group_9__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Event__Group_9__0_in_rule__Event__Group__9__Impl4394);
                    rule__Event__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEventAccess().getGroup_9()); 

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
    // $ANTLR end "rule__Event__Group__9__Impl"


    // $ANTLR start "rule__Event__Group__10"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2216:1: rule__Event__Group__10 : rule__Event__Group__10__Impl rule__Event__Group__11 ;
    public final void rule__Event__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2220:1: ( rule__Event__Group__10__Impl rule__Event__Group__11 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2221:2: rule__Event__Group__10__Impl rule__Event__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__10__Impl_in_rule__Event__Group__104425);
            rule__Event__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__11_in_rule__Event__Group__104428);
            rule__Event__Group__11();

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
    // $ANTLR end "rule__Event__Group__10"


    // $ANTLR start "rule__Event__Group__10__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2228:1: rule__Event__Group__10__Impl : ( ( rule__Event__Group_10__0 )? ) ;
    public final void rule__Event__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2232:1: ( ( ( rule__Event__Group_10__0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2233:1: ( ( rule__Event__Group_10__0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2233:1: ( ( rule__Event__Group_10__0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2234:1: ( rule__Event__Group_10__0 )?
            {
             before(grammarAccess.getEventAccess().getGroup_10()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2235:1: ( rule__Event__Group_10__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==32) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2235:2: rule__Event__Group_10__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Event__Group_10__0_in_rule__Event__Group__10__Impl4455);
                    rule__Event__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEventAccess().getGroup_10()); 

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
    // $ANTLR end "rule__Event__Group__10__Impl"


    // $ANTLR start "rule__Event__Group__11"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2245:1: rule__Event__Group__11 : rule__Event__Group__11__Impl ;
    public final void rule__Event__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2249:1: ( rule__Event__Group__11__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2250:2: rule__Event__Group__11__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__11__Impl_in_rule__Event__Group__114486);
            rule__Event__Group__11__Impl();

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
    // $ANTLR end "rule__Event__Group__11"


    // $ANTLR start "rule__Event__Group__11__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2256:1: rule__Event__Group__11__Impl : ( 'end' ) ;
    public final void rule__Event__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2260:1: ( ( 'end' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2261:1: ( 'end' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2261:1: ( 'end' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2262:1: 'end'
            {
             before(grammarAccess.getEventAccess().getEndKeyword_11()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Event__Group__11__Impl4514); 
             after(grammarAccess.getEventAccess().getEndKeyword_11()); 

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
    // $ANTLR end "rule__Event__Group__11__Impl"


    // $ANTLR start "rule__Event__Group_5__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2299:1: rule__Event__Group_5__0 : rule__Event__Group_5__0__Impl rule__Event__Group_5__1 ;
    public final void rule__Event__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2303:1: ( rule__Event__Group_5__0__Impl rule__Event__Group_5__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2304:2: rule__Event__Group_5__0__Impl rule__Event__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_5__0__Impl_in_rule__Event__Group_5__04569);
            rule__Event__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_5__1_in_rule__Event__Group_5__04572);
            rule__Event__Group_5__1();

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
    // $ANTLR end "rule__Event__Group_5__0"


    // $ANTLR start "rule__Event__Group_5__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2311:1: rule__Event__Group_5__0__Impl : ( '//' ) ;
    public final void rule__Event__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2315:1: ( ( '//' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2316:1: ( '//' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2316:1: ( '//' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2317:1: '//'
            {
             before(grammarAccess.getEventAccess().getSolidusSolidusKeyword_5_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Event__Group_5__0__Impl4600); 
             after(grammarAccess.getEventAccess().getSolidusSolidusKeyword_5_0()); 

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
    // $ANTLR end "rule__Event__Group_5__0__Impl"


    // $ANTLR start "rule__Event__Group_5__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2330:1: rule__Event__Group_5__1 : rule__Event__Group_5__1__Impl ;
    public final void rule__Event__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2334:1: ( rule__Event__Group_5__1__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2335:2: rule__Event__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_5__1__Impl_in_rule__Event__Group_5__14631);
            rule__Event__Group_5__1__Impl();

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
    // $ANTLR end "rule__Event__Group_5__1"


    // $ANTLR start "rule__Event__Group_5__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2341:1: rule__Event__Group_5__1__Impl : ( ( rule__Event__CommentAssignment_5_1 ) ) ;
    public final void rule__Event__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2345:1: ( ( ( rule__Event__CommentAssignment_5_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2346:1: ( ( rule__Event__CommentAssignment_5_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2346:1: ( ( rule__Event__CommentAssignment_5_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2347:1: ( rule__Event__CommentAssignment_5_1 )
            {
             before(grammarAccess.getEventAccess().getCommentAssignment_5_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2348:1: ( rule__Event__CommentAssignment_5_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2348:2: rule__Event__CommentAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__CommentAssignment_5_1_in_rule__Event__Group_5__1__Impl4658);
            rule__Event__CommentAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getCommentAssignment_5_1()); 

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
    // $ANTLR end "rule__Event__Group_5__1__Impl"


    // $ANTLR start "rule__Event__Group_6__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2362:1: rule__Event__Group_6__0 : rule__Event__Group_6__0__Impl rule__Event__Group_6__1 ;
    public final void rule__Event__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2366:1: ( rule__Event__Group_6__0__Impl rule__Event__Group_6__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2367:2: rule__Event__Group_6__0__Impl rule__Event__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_6__0__Impl_in_rule__Event__Group_6__04692);
            rule__Event__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_6__1_in_rule__Event__Group_6__04695);
            rule__Event__Group_6__1();

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
    // $ANTLR end "rule__Event__Group_6__0"


    // $ANTLR start "rule__Event__Group_6__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2374:1: rule__Event__Group_6__0__Impl : ( 'refines' ) ;
    public final void rule__Event__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2378:1: ( ( 'refines' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2379:1: ( 'refines' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2379:1: ( 'refines' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2380:1: 'refines'
            {
             before(grammarAccess.getEventAccess().getRefinesKeyword_6_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Event__Group_6__0__Impl4723); 
             after(grammarAccess.getEventAccess().getRefinesKeyword_6_0()); 

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
    // $ANTLR end "rule__Event__Group_6__0__Impl"


    // $ANTLR start "rule__Event__Group_6__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2393:1: rule__Event__Group_6__1 : rule__Event__Group_6__1__Impl rule__Event__Group_6__2 ;
    public final void rule__Event__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2397:1: ( rule__Event__Group_6__1__Impl rule__Event__Group_6__2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2398:2: rule__Event__Group_6__1__Impl rule__Event__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_6__1__Impl_in_rule__Event__Group_6__14754);
            rule__Event__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_6__2_in_rule__Event__Group_6__14757);
            rule__Event__Group_6__2();

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
    // $ANTLR end "rule__Event__Group_6__1"


    // $ANTLR start "rule__Event__Group_6__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2405:1: rule__Event__Group_6__1__Impl : ( ( rule__Event__RefinesAssignment_6_1 ) ) ;
    public final void rule__Event__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2409:1: ( ( ( rule__Event__RefinesAssignment_6_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2410:1: ( ( rule__Event__RefinesAssignment_6_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2410:1: ( ( rule__Event__RefinesAssignment_6_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2411:1: ( rule__Event__RefinesAssignment_6_1 )
            {
             before(grammarAccess.getEventAccess().getRefinesAssignment_6_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2412:1: ( rule__Event__RefinesAssignment_6_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2412:2: rule__Event__RefinesAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__RefinesAssignment_6_1_in_rule__Event__Group_6__1__Impl4784);
            rule__Event__RefinesAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getRefinesAssignment_6_1()); 

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
    // $ANTLR end "rule__Event__Group_6__1__Impl"


    // $ANTLR start "rule__Event__Group_6__2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2422:1: rule__Event__Group_6__2 : rule__Event__Group_6__2__Impl ;
    public final void rule__Event__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2426:1: ( rule__Event__Group_6__2__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2427:2: rule__Event__Group_6__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_6__2__Impl_in_rule__Event__Group_6__24814);
            rule__Event__Group_6__2__Impl();

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
    // $ANTLR end "rule__Event__Group_6__2"


    // $ANTLR start "rule__Event__Group_6__2__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2433:1: rule__Event__Group_6__2__Impl : ( ( rule__Event__Group_6_2__0 )* ) ;
    public final void rule__Event__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2437:1: ( ( ( rule__Event__Group_6_2__0 )* ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2438:1: ( ( rule__Event__Group_6_2__0 )* )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2438:1: ( ( rule__Event__Group_6_2__0 )* )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2439:1: ( rule__Event__Group_6_2__0 )*
            {
             before(grammarAccess.getEventAccess().getGroup_6_2()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2440:1: ( rule__Event__Group_6_2__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==27) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2440:2: rule__Event__Group_6_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Event__Group_6_2__0_in_rule__Event__Group_6__2__Impl4841);
            	    rule__Event__Group_6_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getEventAccess().getGroup_6_2()); 

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
    // $ANTLR end "rule__Event__Group_6__2__Impl"


    // $ANTLR start "rule__Event__Group_6_2__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2456:1: rule__Event__Group_6_2__0 : rule__Event__Group_6_2__0__Impl rule__Event__Group_6_2__1 ;
    public final void rule__Event__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2460:1: ( rule__Event__Group_6_2__0__Impl rule__Event__Group_6_2__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2461:2: rule__Event__Group_6_2__0__Impl rule__Event__Group_6_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_6_2__0__Impl_in_rule__Event__Group_6_2__04878);
            rule__Event__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_6_2__1_in_rule__Event__Group_6_2__04881);
            rule__Event__Group_6_2__1();

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
    // $ANTLR end "rule__Event__Group_6_2__0"


    // $ANTLR start "rule__Event__Group_6_2__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2468:1: rule__Event__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__Event__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2472:1: ( ( ',' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2473:1: ( ',' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2473:1: ( ',' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2474:1: ','
            {
             before(grammarAccess.getEventAccess().getCommaKeyword_6_2_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Event__Group_6_2__0__Impl4909); 
             after(grammarAccess.getEventAccess().getCommaKeyword_6_2_0()); 

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
    // $ANTLR end "rule__Event__Group_6_2__0__Impl"


    // $ANTLR start "rule__Event__Group_6_2__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2487:1: rule__Event__Group_6_2__1 : rule__Event__Group_6_2__1__Impl ;
    public final void rule__Event__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2491:1: ( rule__Event__Group_6_2__1__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2492:2: rule__Event__Group_6_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_6_2__1__Impl_in_rule__Event__Group_6_2__14940);
            rule__Event__Group_6_2__1__Impl();

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
    // $ANTLR end "rule__Event__Group_6_2__1"


    // $ANTLR start "rule__Event__Group_6_2__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2498:1: rule__Event__Group_6_2__1__Impl : ( ( rule__Event__RefinesAssignment_6_2_1 ) ) ;
    public final void rule__Event__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2502:1: ( ( ( rule__Event__RefinesAssignment_6_2_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2503:1: ( ( rule__Event__RefinesAssignment_6_2_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2503:1: ( ( rule__Event__RefinesAssignment_6_2_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2504:1: ( rule__Event__RefinesAssignment_6_2_1 )
            {
             before(grammarAccess.getEventAccess().getRefinesAssignment_6_2_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2505:1: ( rule__Event__RefinesAssignment_6_2_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2505:2: rule__Event__RefinesAssignment_6_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__RefinesAssignment_6_2_1_in_rule__Event__Group_6_2__1__Impl4967);
            rule__Event__RefinesAssignment_6_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getRefinesAssignment_6_2_1()); 

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
    // $ANTLR end "rule__Event__Group_6_2__1__Impl"


    // $ANTLR start "rule__Event__Group_7__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2519:1: rule__Event__Group_7__0 : rule__Event__Group_7__0__Impl rule__Event__Group_7__1 ;
    public final void rule__Event__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2523:1: ( rule__Event__Group_7__0__Impl rule__Event__Group_7__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2524:2: rule__Event__Group_7__0__Impl rule__Event__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_7__0__Impl_in_rule__Event__Group_7__05001);
            rule__Event__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_7__1_in_rule__Event__Group_7__05004);
            rule__Event__Group_7__1();

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
    // $ANTLR end "rule__Event__Group_7__0"


    // $ANTLR start "rule__Event__Group_7__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2531:1: rule__Event__Group_7__0__Impl : ( 'when' ) ;
    public final void rule__Event__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2535:1: ( ( 'when' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2536:1: ( 'when' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2536:1: ( 'when' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2537:1: 'when'
            {
             before(grammarAccess.getEventAccess().getWhenKeyword_7_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Event__Group_7__0__Impl5032); 
             after(grammarAccess.getEventAccess().getWhenKeyword_7_0()); 

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
    // $ANTLR end "rule__Event__Group_7__0__Impl"


    // $ANTLR start "rule__Event__Group_7__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2550:1: rule__Event__Group_7__1 : rule__Event__Group_7__1__Impl rule__Event__Group_7__2 ;
    public final void rule__Event__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2554:1: ( rule__Event__Group_7__1__Impl rule__Event__Group_7__2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2555:2: rule__Event__Group_7__1__Impl rule__Event__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_7__1__Impl_in_rule__Event__Group_7__15063);
            rule__Event__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_7__2_in_rule__Event__Group_7__15066);
            rule__Event__Group_7__2();

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
    // $ANTLR end "rule__Event__Group_7__1"


    // $ANTLR start "rule__Event__Group_7__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2562:1: rule__Event__Group_7__1__Impl : ( ( rule__Event__GuardsAssignment_7_1 ) ) ;
    public final void rule__Event__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2566:1: ( ( ( rule__Event__GuardsAssignment_7_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2567:1: ( ( rule__Event__GuardsAssignment_7_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2567:1: ( ( rule__Event__GuardsAssignment_7_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2568:1: ( rule__Event__GuardsAssignment_7_1 )
            {
             before(grammarAccess.getEventAccess().getGuardsAssignment_7_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2569:1: ( rule__Event__GuardsAssignment_7_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2569:2: rule__Event__GuardsAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__GuardsAssignment_7_1_in_rule__Event__Group_7__1__Impl5093);
            rule__Event__GuardsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getGuardsAssignment_7_1()); 

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
    // $ANTLR end "rule__Event__Group_7__1__Impl"


    // $ANTLR start "rule__Event__Group_7__2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2579:1: rule__Event__Group_7__2 : rule__Event__Group_7__2__Impl ;
    public final void rule__Event__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2583:1: ( rule__Event__Group_7__2__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2584:2: rule__Event__Group_7__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_7__2__Impl_in_rule__Event__Group_7__25123);
            rule__Event__Group_7__2__Impl();

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
    // $ANTLR end "rule__Event__Group_7__2"


    // $ANTLR start "rule__Event__Group_7__2__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2590:1: rule__Event__Group_7__2__Impl : ( ( rule__Event__GuardsAssignment_7_2 )* ) ;
    public final void rule__Event__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2594:1: ( ( ( rule__Event__GuardsAssignment_7_2 )* ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2595:1: ( ( rule__Event__GuardsAssignment_7_2 )* )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2595:1: ( ( rule__Event__GuardsAssignment_7_2 )* )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2596:1: ( rule__Event__GuardsAssignment_7_2 )*
            {
             before(grammarAccess.getEventAccess().getGuardsAssignment_7_2()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2597:1: ( rule__Event__GuardsAssignment_7_2 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==23) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2597:2: rule__Event__GuardsAssignment_7_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Event__GuardsAssignment_7_2_in_rule__Event__Group_7__2__Impl5150);
            	    rule__Event__GuardsAssignment_7_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getEventAccess().getGuardsAssignment_7_2()); 

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
    // $ANTLR end "rule__Event__Group_7__2__Impl"


    // $ANTLR start "rule__Event__Group_8__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2613:1: rule__Event__Group_8__0 : rule__Event__Group_8__0__Impl rule__Event__Group_8__1 ;
    public final void rule__Event__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2617:1: ( rule__Event__Group_8__0__Impl rule__Event__Group_8__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2618:2: rule__Event__Group_8__0__Impl rule__Event__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_8__0__Impl_in_rule__Event__Group_8__05187);
            rule__Event__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_8__1_in_rule__Event__Group_8__05190);
            rule__Event__Group_8__1();

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
    // $ANTLR end "rule__Event__Group_8__0"


    // $ANTLR start "rule__Event__Group_8__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2625:1: rule__Event__Group_8__0__Impl : ( 'any' ) ;
    public final void rule__Event__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2629:1: ( ( 'any' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2630:1: ( 'any' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2630:1: ( 'any' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2631:1: 'any'
            {
             before(grammarAccess.getEventAccess().getAnyKeyword_8_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Event__Group_8__0__Impl5218); 
             after(grammarAccess.getEventAccess().getAnyKeyword_8_0()); 

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
    // $ANTLR end "rule__Event__Group_8__0__Impl"


    // $ANTLR start "rule__Event__Group_8__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2644:1: rule__Event__Group_8__1 : rule__Event__Group_8__1__Impl rule__Event__Group_8__2 ;
    public final void rule__Event__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2648:1: ( rule__Event__Group_8__1__Impl rule__Event__Group_8__2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2649:2: rule__Event__Group_8__1__Impl rule__Event__Group_8__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_8__1__Impl_in_rule__Event__Group_8__15249);
            rule__Event__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_8__2_in_rule__Event__Group_8__15252);
            rule__Event__Group_8__2();

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
    // $ANTLR end "rule__Event__Group_8__1"


    // $ANTLR start "rule__Event__Group_8__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2656:1: rule__Event__Group_8__1__Impl : ( ( rule__Event__ParametersAssignment_8_1 ) ) ;
    public final void rule__Event__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2660:1: ( ( ( rule__Event__ParametersAssignment_8_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2661:1: ( ( rule__Event__ParametersAssignment_8_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2661:1: ( ( rule__Event__ParametersAssignment_8_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2662:1: ( rule__Event__ParametersAssignment_8_1 )
            {
             before(grammarAccess.getEventAccess().getParametersAssignment_8_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2663:1: ( rule__Event__ParametersAssignment_8_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2663:2: rule__Event__ParametersAssignment_8_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__ParametersAssignment_8_1_in_rule__Event__Group_8__1__Impl5279);
            rule__Event__ParametersAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getParametersAssignment_8_1()); 

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
    // $ANTLR end "rule__Event__Group_8__1__Impl"


    // $ANTLR start "rule__Event__Group_8__2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2673:1: rule__Event__Group_8__2 : rule__Event__Group_8__2__Impl rule__Event__Group_8__3 ;
    public final void rule__Event__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2677:1: ( rule__Event__Group_8__2__Impl rule__Event__Group_8__3 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2678:2: rule__Event__Group_8__2__Impl rule__Event__Group_8__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_8__2__Impl_in_rule__Event__Group_8__25309);
            rule__Event__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_8__3_in_rule__Event__Group_8__25312);
            rule__Event__Group_8__3();

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
    // $ANTLR end "rule__Event__Group_8__2"


    // $ANTLR start "rule__Event__Group_8__2__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2685:1: rule__Event__Group_8__2__Impl : ( ( rule__Event__ParametersAssignment_8_2 )* ) ;
    public final void rule__Event__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2689:1: ( ( ( rule__Event__ParametersAssignment_8_2 )* ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2690:1: ( ( rule__Event__ParametersAssignment_8_2 )* )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2690:1: ( ( rule__Event__ParametersAssignment_8_2 )* )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2691:1: ( rule__Event__ParametersAssignment_8_2 )*
            {
             before(grammarAccess.getEventAccess().getParametersAssignment_8_2()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2692:1: ( rule__Event__ParametersAssignment_8_2 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=RULE_STRING && LA31_0<=RULE_ID)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2692:2: rule__Event__ParametersAssignment_8_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Event__ParametersAssignment_8_2_in_rule__Event__Group_8__2__Impl5339);
            	    rule__Event__ParametersAssignment_8_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getEventAccess().getParametersAssignment_8_2()); 

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
    // $ANTLR end "rule__Event__Group_8__2__Impl"


    // $ANTLR start "rule__Event__Group_8__3"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2702:1: rule__Event__Group_8__3 : rule__Event__Group_8__3__Impl rule__Event__Group_8__4 ;
    public final void rule__Event__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2706:1: ( rule__Event__Group_8__3__Impl rule__Event__Group_8__4 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2707:2: rule__Event__Group_8__3__Impl rule__Event__Group_8__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_8__3__Impl_in_rule__Event__Group_8__35370);
            rule__Event__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_8__4_in_rule__Event__Group_8__35373);
            rule__Event__Group_8__4();

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
    // $ANTLR end "rule__Event__Group_8__3"


    // $ANTLR start "rule__Event__Group_8__3__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2714:1: rule__Event__Group_8__3__Impl : ( 'where' ) ;
    public final void rule__Event__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2718:1: ( ( 'where' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2719:1: ( 'where' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2719:1: ( 'where' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2720:1: 'where'
            {
             before(grammarAccess.getEventAccess().getWhereKeyword_8_3()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Event__Group_8__3__Impl5401); 
             after(grammarAccess.getEventAccess().getWhereKeyword_8_3()); 

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
    // $ANTLR end "rule__Event__Group_8__3__Impl"


    // $ANTLR start "rule__Event__Group_8__4"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2733:1: rule__Event__Group_8__4 : rule__Event__Group_8__4__Impl rule__Event__Group_8__5 ;
    public final void rule__Event__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2737:1: ( rule__Event__Group_8__4__Impl rule__Event__Group_8__5 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2738:2: rule__Event__Group_8__4__Impl rule__Event__Group_8__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_8__4__Impl_in_rule__Event__Group_8__45432);
            rule__Event__Group_8__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_8__5_in_rule__Event__Group_8__45435);
            rule__Event__Group_8__5();

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
    // $ANTLR end "rule__Event__Group_8__4"


    // $ANTLR start "rule__Event__Group_8__4__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2745:1: rule__Event__Group_8__4__Impl : ( ( rule__Event__GuardsAssignment_8_4 ) ) ;
    public final void rule__Event__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2749:1: ( ( ( rule__Event__GuardsAssignment_8_4 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2750:1: ( ( rule__Event__GuardsAssignment_8_4 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2750:1: ( ( rule__Event__GuardsAssignment_8_4 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2751:1: ( rule__Event__GuardsAssignment_8_4 )
            {
             before(grammarAccess.getEventAccess().getGuardsAssignment_8_4()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2752:1: ( rule__Event__GuardsAssignment_8_4 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2752:2: rule__Event__GuardsAssignment_8_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__GuardsAssignment_8_4_in_rule__Event__Group_8__4__Impl5462);
            rule__Event__GuardsAssignment_8_4();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getGuardsAssignment_8_4()); 

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
    // $ANTLR end "rule__Event__Group_8__4__Impl"


    // $ANTLR start "rule__Event__Group_8__5"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2762:1: rule__Event__Group_8__5 : rule__Event__Group_8__5__Impl ;
    public final void rule__Event__Group_8__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2766:1: ( rule__Event__Group_8__5__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2767:2: rule__Event__Group_8__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_8__5__Impl_in_rule__Event__Group_8__55492);
            rule__Event__Group_8__5__Impl();

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
    // $ANTLR end "rule__Event__Group_8__5"


    // $ANTLR start "rule__Event__Group_8__5__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2773:1: rule__Event__Group_8__5__Impl : ( ( rule__Event__GuardsAssignment_8_5 )* ) ;
    public final void rule__Event__Group_8__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2777:1: ( ( ( rule__Event__GuardsAssignment_8_5 )* ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2778:1: ( ( rule__Event__GuardsAssignment_8_5 )* )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2778:1: ( ( rule__Event__GuardsAssignment_8_5 )* )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2779:1: ( rule__Event__GuardsAssignment_8_5 )*
            {
             before(grammarAccess.getEventAccess().getGuardsAssignment_8_5()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2780:1: ( rule__Event__GuardsAssignment_8_5 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==23) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2780:2: rule__Event__GuardsAssignment_8_5
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Event__GuardsAssignment_8_5_in_rule__Event__Group_8__5__Impl5519);
            	    rule__Event__GuardsAssignment_8_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getEventAccess().getGuardsAssignment_8_5()); 

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
    // $ANTLR end "rule__Event__Group_8__5__Impl"


    // $ANTLR start "rule__Event__Group_9__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2802:1: rule__Event__Group_9__0 : rule__Event__Group_9__0__Impl rule__Event__Group_9__1 ;
    public final void rule__Event__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2806:1: ( rule__Event__Group_9__0__Impl rule__Event__Group_9__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2807:2: rule__Event__Group_9__0__Impl rule__Event__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_9__0__Impl_in_rule__Event__Group_9__05562);
            rule__Event__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_9__1_in_rule__Event__Group_9__05565);
            rule__Event__Group_9__1();

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
    // $ANTLR end "rule__Event__Group_9__0"


    // $ANTLR start "rule__Event__Group_9__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2814:1: rule__Event__Group_9__0__Impl : ( 'with' ) ;
    public final void rule__Event__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2818:1: ( ( 'with' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2819:1: ( 'with' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2819:1: ( 'with' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2820:1: 'with'
            {
             before(grammarAccess.getEventAccess().getWithKeyword_9_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Event__Group_9__0__Impl5593); 
             after(grammarAccess.getEventAccess().getWithKeyword_9_0()); 

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
    // $ANTLR end "rule__Event__Group_9__0__Impl"


    // $ANTLR start "rule__Event__Group_9__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2833:1: rule__Event__Group_9__1 : rule__Event__Group_9__1__Impl rule__Event__Group_9__2 ;
    public final void rule__Event__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2837:1: ( rule__Event__Group_9__1__Impl rule__Event__Group_9__2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2838:2: rule__Event__Group_9__1__Impl rule__Event__Group_9__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_9__1__Impl_in_rule__Event__Group_9__15624);
            rule__Event__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_9__2_in_rule__Event__Group_9__15627);
            rule__Event__Group_9__2();

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
    // $ANTLR end "rule__Event__Group_9__1"


    // $ANTLR start "rule__Event__Group_9__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2845:1: rule__Event__Group_9__1__Impl : ( ( rule__Event__WitnessesAssignment_9_1 ) ) ;
    public final void rule__Event__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2849:1: ( ( ( rule__Event__WitnessesAssignment_9_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2850:1: ( ( rule__Event__WitnessesAssignment_9_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2850:1: ( ( rule__Event__WitnessesAssignment_9_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2851:1: ( rule__Event__WitnessesAssignment_9_1 )
            {
             before(grammarAccess.getEventAccess().getWitnessesAssignment_9_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2852:1: ( rule__Event__WitnessesAssignment_9_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2852:2: rule__Event__WitnessesAssignment_9_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__WitnessesAssignment_9_1_in_rule__Event__Group_9__1__Impl5654);
            rule__Event__WitnessesAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getWitnessesAssignment_9_1()); 

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
    // $ANTLR end "rule__Event__Group_9__1__Impl"


    // $ANTLR start "rule__Event__Group_9__2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2862:1: rule__Event__Group_9__2 : rule__Event__Group_9__2__Impl ;
    public final void rule__Event__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2866:1: ( rule__Event__Group_9__2__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2867:2: rule__Event__Group_9__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_9__2__Impl_in_rule__Event__Group_9__25684);
            rule__Event__Group_9__2__Impl();

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
    // $ANTLR end "rule__Event__Group_9__2"


    // $ANTLR start "rule__Event__Group_9__2__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2873:1: rule__Event__Group_9__2__Impl : ( ( rule__Event__WitnessesAssignment_9_2 )* ) ;
    public final void rule__Event__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2877:1: ( ( ( rule__Event__WitnessesAssignment_9_2 )* ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2878:1: ( ( rule__Event__WitnessesAssignment_9_2 )* )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2878:1: ( ( rule__Event__WitnessesAssignment_9_2 )* )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2879:1: ( rule__Event__WitnessesAssignment_9_2 )*
            {
             before(grammarAccess.getEventAccess().getWitnessesAssignment_9_2()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2880:1: ( rule__Event__WitnessesAssignment_9_2 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==23||LA33_0==35) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2880:2: rule__Event__WitnessesAssignment_9_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Event__WitnessesAssignment_9_2_in_rule__Event__Group_9__2__Impl5711);
            	    rule__Event__WitnessesAssignment_9_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getEventAccess().getWitnessesAssignment_9_2()); 

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
    // $ANTLR end "rule__Event__Group_9__2__Impl"


    // $ANTLR start "rule__Event__Group_10__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2896:1: rule__Event__Group_10__0 : rule__Event__Group_10__0__Impl rule__Event__Group_10__1 ;
    public final void rule__Event__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2900:1: ( rule__Event__Group_10__0__Impl rule__Event__Group_10__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2901:2: rule__Event__Group_10__0__Impl rule__Event__Group_10__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_10__0__Impl_in_rule__Event__Group_10__05748);
            rule__Event__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_10__1_in_rule__Event__Group_10__05751);
            rule__Event__Group_10__1();

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
    // $ANTLR end "rule__Event__Group_10__0"


    // $ANTLR start "rule__Event__Group_10__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2908:1: rule__Event__Group_10__0__Impl : ( 'then' ) ;
    public final void rule__Event__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2912:1: ( ( 'then' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2913:1: ( 'then' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2913:1: ( 'then' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2914:1: 'then'
            {
             before(grammarAccess.getEventAccess().getThenKeyword_10_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Event__Group_10__0__Impl5779); 
             after(grammarAccess.getEventAccess().getThenKeyword_10_0()); 

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
    // $ANTLR end "rule__Event__Group_10__0__Impl"


    // $ANTLR start "rule__Event__Group_10__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2927:1: rule__Event__Group_10__1 : rule__Event__Group_10__1__Impl rule__Event__Group_10__2 ;
    public final void rule__Event__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2931:1: ( rule__Event__Group_10__1__Impl rule__Event__Group_10__2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2932:2: rule__Event__Group_10__1__Impl rule__Event__Group_10__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_10__1__Impl_in_rule__Event__Group_10__15810);
            rule__Event__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_10__2_in_rule__Event__Group_10__15813);
            rule__Event__Group_10__2();

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
    // $ANTLR end "rule__Event__Group_10__1"


    // $ANTLR start "rule__Event__Group_10__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2939:1: rule__Event__Group_10__1__Impl : ( ( rule__Event__ActionsAssignment_10_1 ) ) ;
    public final void rule__Event__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2943:1: ( ( ( rule__Event__ActionsAssignment_10_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2944:1: ( ( rule__Event__ActionsAssignment_10_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2944:1: ( ( rule__Event__ActionsAssignment_10_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2945:1: ( rule__Event__ActionsAssignment_10_1 )
            {
             before(grammarAccess.getEventAccess().getActionsAssignment_10_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2946:1: ( rule__Event__ActionsAssignment_10_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2946:2: rule__Event__ActionsAssignment_10_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__ActionsAssignment_10_1_in_rule__Event__Group_10__1__Impl5840);
            rule__Event__ActionsAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getActionsAssignment_10_1()); 

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
    // $ANTLR end "rule__Event__Group_10__1__Impl"


    // $ANTLR start "rule__Event__Group_10__2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2956:1: rule__Event__Group_10__2 : rule__Event__Group_10__2__Impl ;
    public final void rule__Event__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2960:1: ( rule__Event__Group_10__2__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2961:2: rule__Event__Group_10__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_10__2__Impl_in_rule__Event__Group_10__25870);
            rule__Event__Group_10__2__Impl();

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
    // $ANTLR end "rule__Event__Group_10__2"


    // $ANTLR start "rule__Event__Group_10__2__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2967:1: rule__Event__Group_10__2__Impl : ( ( rule__Event__ActionsAssignment_10_2 )* ) ;
    public final void rule__Event__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2971:1: ( ( ( rule__Event__ActionsAssignment_10_2 )* ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2972:1: ( ( rule__Event__ActionsAssignment_10_2 )* )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2972:1: ( ( rule__Event__ActionsAssignment_10_2 )* )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2973:1: ( rule__Event__ActionsAssignment_10_2 )*
            {
             before(grammarAccess.getEventAccess().getActionsAssignment_10_2()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2974:1: ( rule__Event__ActionsAssignment_10_2 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==23) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2974:2: rule__Event__ActionsAssignment_10_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Event__ActionsAssignment_10_2_in_rule__Event__Group_10__2__Impl5897);
            	    rule__Event__ActionsAssignment_10_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getEventAccess().getActionsAssignment_10_2()); 

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
    // $ANTLR end "rule__Event__Group_10__2__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2990:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2994:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2995:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__05934);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__05937);
            rule__Parameter__Group__1();

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
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3002:1: rule__Parameter__Group__0__Impl : ( () ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3006:1: ( ( () ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3007:1: ( () )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3007:1: ( () )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3008:1: ()
            {
             before(grammarAccess.getParameterAccess().getParameterAction_0()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3009:1: ()
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3011:1: 
            {
            }

             after(grammarAccess.getParameterAccess().getParameterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3021:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3025:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3026:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__15995);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__15998);
            rule__Parameter__Group__2();

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
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3033:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3037:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3038:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3038:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3039:1: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3040:1: ( rule__Parameter__NameAssignment_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3040:2: rule__Parameter__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__NameAssignment_1_in_rule__Parameter__Group__1__Impl6025);
            rule__Parameter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3050:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3054:1: ( rule__Parameter__Group__2__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3055:2: rule__Parameter__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__26055);
            rule__Parameter__Group__2__Impl();

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
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3061:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__Group_2__0 )? ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3065:1: ( ( ( rule__Parameter__Group_2__0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3066:1: ( ( rule__Parameter__Group_2__0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3066:1: ( ( rule__Parameter__Group_2__0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3067:1: ( rule__Parameter__Group_2__0 )?
            {
             before(grammarAccess.getParameterAccess().getGroup_2()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3068:1: ( rule__Parameter__Group_2__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==16) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3068:2: rule__Parameter__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_2__0_in_rule__Parameter__Group__2__Impl6082);
                    rule__Parameter__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Parameter__Group_2__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3084:1: rule__Parameter__Group_2__0 : rule__Parameter__Group_2__0__Impl rule__Parameter__Group_2__1 ;
    public final void rule__Parameter__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3088:1: ( rule__Parameter__Group_2__0__Impl rule__Parameter__Group_2__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3089:2: rule__Parameter__Group_2__0__Impl rule__Parameter__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_2__0__Impl_in_rule__Parameter__Group_2__06119);
            rule__Parameter__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_2__1_in_rule__Parameter__Group_2__06122);
            rule__Parameter__Group_2__1();

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
    // $ANTLR end "rule__Parameter__Group_2__0"


    // $ANTLR start "rule__Parameter__Group_2__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3096:1: rule__Parameter__Group_2__0__Impl : ( '//' ) ;
    public final void rule__Parameter__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3100:1: ( ( '//' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3101:1: ( '//' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3101:1: ( '//' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3102:1: '//'
            {
             before(grammarAccess.getParameterAccess().getSolidusSolidusKeyword_2_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Parameter__Group_2__0__Impl6150); 
             after(grammarAccess.getParameterAccess().getSolidusSolidusKeyword_2_0()); 

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
    // $ANTLR end "rule__Parameter__Group_2__0__Impl"


    // $ANTLR start "rule__Parameter__Group_2__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3115:1: rule__Parameter__Group_2__1 : rule__Parameter__Group_2__1__Impl ;
    public final void rule__Parameter__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3119:1: ( rule__Parameter__Group_2__1__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3120:2: rule__Parameter__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_2__1__Impl_in_rule__Parameter__Group_2__16181);
            rule__Parameter__Group_2__1__Impl();

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
    // $ANTLR end "rule__Parameter__Group_2__1"


    // $ANTLR start "rule__Parameter__Group_2__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3126:1: rule__Parameter__Group_2__1__Impl : ( ( rule__Parameter__CommentAssignment_2_1 ) ) ;
    public final void rule__Parameter__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3130:1: ( ( ( rule__Parameter__CommentAssignment_2_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3131:1: ( ( rule__Parameter__CommentAssignment_2_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3131:1: ( ( rule__Parameter__CommentAssignment_2_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3132:1: ( rule__Parameter__CommentAssignment_2_1 )
            {
             before(grammarAccess.getParameterAccess().getCommentAssignment_2_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3133:1: ( rule__Parameter__CommentAssignment_2_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3133:2: rule__Parameter__CommentAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__CommentAssignment_2_1_in_rule__Parameter__Group_2__1__Impl6208);
            rule__Parameter__CommentAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getCommentAssignment_2_1()); 

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
    // $ANTLR end "rule__Parameter__Group_2__1__Impl"


    // $ANTLR start "rule__Guard__Group__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3147:1: rule__Guard__Group__0 : rule__Guard__Group__0__Impl rule__Guard__Group__1 ;
    public final void rule__Guard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3151:1: ( rule__Guard__Group__0__Impl rule__Guard__Group__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3152:2: rule__Guard__Group__0__Impl rule__Guard__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group__0__Impl_in_rule__Guard__Group__06242);
            rule__Guard__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group__1_in_rule__Guard__Group__06245);
            rule__Guard__Group__1();

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
    // $ANTLR end "rule__Guard__Group__0"


    // $ANTLR start "rule__Guard__Group__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3159:1: rule__Guard__Group__0__Impl : ( '@' ) ;
    public final void rule__Guard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3163:1: ( ( '@' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3164:1: ( '@' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3164:1: ( '@' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3165:1: '@'
            {
             before(grammarAccess.getGuardAccess().getCommercialAtKeyword_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Guard__Group__0__Impl6273); 
             after(grammarAccess.getGuardAccess().getCommercialAtKeyword_0()); 

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
    // $ANTLR end "rule__Guard__Group__0__Impl"


    // $ANTLR start "rule__Guard__Group__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3178:1: rule__Guard__Group__1 : rule__Guard__Group__1__Impl rule__Guard__Group__2 ;
    public final void rule__Guard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3182:1: ( rule__Guard__Group__1__Impl rule__Guard__Group__2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3183:2: rule__Guard__Group__1__Impl rule__Guard__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group__1__Impl_in_rule__Guard__Group__16304);
            rule__Guard__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group__2_in_rule__Guard__Group__16307);
            rule__Guard__Group__2();

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
    // $ANTLR end "rule__Guard__Group__1"


    // $ANTLR start "rule__Guard__Group__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3190:1: rule__Guard__Group__1__Impl : ( ( rule__Guard__NameAssignment_1 ) ) ;
    public final void rule__Guard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3194:1: ( ( ( rule__Guard__NameAssignment_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3195:1: ( ( rule__Guard__NameAssignment_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3195:1: ( ( rule__Guard__NameAssignment_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3196:1: ( rule__Guard__NameAssignment_1 )
            {
             before(grammarAccess.getGuardAccess().getNameAssignment_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3197:1: ( rule__Guard__NameAssignment_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3197:2: rule__Guard__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Guard__NameAssignment_1_in_rule__Guard__Group__1__Impl6334);
            rule__Guard__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGuardAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Guard__Group__1__Impl"


    // $ANTLR start "rule__Guard__Group__2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3207:1: rule__Guard__Group__2 : rule__Guard__Group__2__Impl rule__Guard__Group__3 ;
    public final void rule__Guard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3211:1: ( rule__Guard__Group__2__Impl rule__Guard__Group__3 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3212:2: rule__Guard__Group__2__Impl rule__Guard__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group__2__Impl_in_rule__Guard__Group__26364);
            rule__Guard__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group__3_in_rule__Guard__Group__26367);
            rule__Guard__Group__3();

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
    // $ANTLR end "rule__Guard__Group__2"


    // $ANTLR start "rule__Guard__Group__2__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3219:1: rule__Guard__Group__2__Impl : ( ( rule__Guard__PredicateAssignment_2 )? ) ;
    public final void rule__Guard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3223:1: ( ( ( rule__Guard__PredicateAssignment_2 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3224:1: ( ( rule__Guard__PredicateAssignment_2 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3224:1: ( ( rule__Guard__PredicateAssignment_2 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3225:1: ( rule__Guard__PredicateAssignment_2 )?
            {
             before(grammarAccess.getGuardAccess().getPredicateAssignment_2()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3226:1: ( rule__Guard__PredicateAssignment_2 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=RULE_STRING && LA36_0<=RULE_ID)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3226:2: rule__Guard__PredicateAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Guard__PredicateAssignment_2_in_rule__Guard__Group__2__Impl6394);
                    rule__Guard__PredicateAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGuardAccess().getPredicateAssignment_2()); 

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
    // $ANTLR end "rule__Guard__Group__2__Impl"


    // $ANTLR start "rule__Guard__Group__3"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3236:1: rule__Guard__Group__3 : rule__Guard__Group__3__Impl rule__Guard__Group__4 ;
    public final void rule__Guard__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3240:1: ( rule__Guard__Group__3__Impl rule__Guard__Group__4 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3241:2: rule__Guard__Group__3__Impl rule__Guard__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group__3__Impl_in_rule__Guard__Group__36425);
            rule__Guard__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group__4_in_rule__Guard__Group__36428);
            rule__Guard__Group__4();

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
    // $ANTLR end "rule__Guard__Group__3"


    // $ANTLR start "rule__Guard__Group__3__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3248:1: rule__Guard__Group__3__Impl : ( ( rule__Guard__TheoremAssignment_3 )? ) ;
    public final void rule__Guard__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3252:1: ( ( ( rule__Guard__TheoremAssignment_3 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3253:1: ( ( rule__Guard__TheoremAssignment_3 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3253:1: ( ( rule__Guard__TheoremAssignment_3 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3254:1: ( rule__Guard__TheoremAssignment_3 )?
            {
             before(grammarAccess.getGuardAccess().getTheoremAssignment_3()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3255:1: ( rule__Guard__TheoremAssignment_3 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==33) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3255:2: rule__Guard__TheoremAssignment_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Guard__TheoremAssignment_3_in_rule__Guard__Group__3__Impl6455);
                    rule__Guard__TheoremAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGuardAccess().getTheoremAssignment_3()); 

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
    // $ANTLR end "rule__Guard__Group__3__Impl"


    // $ANTLR start "rule__Guard__Group__4"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3265:1: rule__Guard__Group__4 : rule__Guard__Group__4__Impl ;
    public final void rule__Guard__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3269:1: ( rule__Guard__Group__4__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3270:2: rule__Guard__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group__4__Impl_in_rule__Guard__Group__46486);
            rule__Guard__Group__4__Impl();

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
    // $ANTLR end "rule__Guard__Group__4"


    // $ANTLR start "rule__Guard__Group__4__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3276:1: rule__Guard__Group__4__Impl : ( ( rule__Guard__Group_4__0 )? ) ;
    public final void rule__Guard__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3280:1: ( ( ( rule__Guard__Group_4__0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3281:1: ( ( rule__Guard__Group_4__0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3281:1: ( ( rule__Guard__Group_4__0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3282:1: ( rule__Guard__Group_4__0 )?
            {
             before(grammarAccess.getGuardAccess().getGroup_4()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3283:1: ( rule__Guard__Group_4__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==16) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3283:2: rule__Guard__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Guard__Group_4__0_in_rule__Guard__Group__4__Impl6513);
                    rule__Guard__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGuardAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Guard__Group__4__Impl"


    // $ANTLR start "rule__Guard__Group_4__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3303:1: rule__Guard__Group_4__0 : rule__Guard__Group_4__0__Impl rule__Guard__Group_4__1 ;
    public final void rule__Guard__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3307:1: ( rule__Guard__Group_4__0__Impl rule__Guard__Group_4__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3308:2: rule__Guard__Group_4__0__Impl rule__Guard__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group_4__0__Impl_in_rule__Guard__Group_4__06554);
            rule__Guard__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group_4__1_in_rule__Guard__Group_4__06557);
            rule__Guard__Group_4__1();

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
    // $ANTLR end "rule__Guard__Group_4__0"


    // $ANTLR start "rule__Guard__Group_4__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3315:1: rule__Guard__Group_4__0__Impl : ( '//' ) ;
    public final void rule__Guard__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3319:1: ( ( '//' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3320:1: ( '//' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3320:1: ( '//' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3321:1: '//'
            {
             before(grammarAccess.getGuardAccess().getSolidusSolidusKeyword_4_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Guard__Group_4__0__Impl6585); 
             after(grammarAccess.getGuardAccess().getSolidusSolidusKeyword_4_0()); 

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
    // $ANTLR end "rule__Guard__Group_4__0__Impl"


    // $ANTLR start "rule__Guard__Group_4__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3334:1: rule__Guard__Group_4__1 : rule__Guard__Group_4__1__Impl ;
    public final void rule__Guard__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3338:1: ( rule__Guard__Group_4__1__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3339:2: rule__Guard__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group_4__1__Impl_in_rule__Guard__Group_4__16616);
            rule__Guard__Group_4__1__Impl();

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
    // $ANTLR end "rule__Guard__Group_4__1"


    // $ANTLR start "rule__Guard__Group_4__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3345:1: rule__Guard__Group_4__1__Impl : ( ( rule__Guard__CommentAssignment_4_1 ) ) ;
    public final void rule__Guard__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3349:1: ( ( ( rule__Guard__CommentAssignment_4_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3350:1: ( ( rule__Guard__CommentAssignment_4_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3350:1: ( ( rule__Guard__CommentAssignment_4_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3351:1: ( rule__Guard__CommentAssignment_4_1 )
            {
             before(grammarAccess.getGuardAccess().getCommentAssignment_4_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3352:1: ( rule__Guard__CommentAssignment_4_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3352:2: rule__Guard__CommentAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Guard__CommentAssignment_4_1_in_rule__Guard__Group_4__1__Impl6643);
            rule__Guard__CommentAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getGuardAccess().getCommentAssignment_4_1()); 

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
    // $ANTLR end "rule__Guard__Group_4__1__Impl"


    // $ANTLR start "rule__Witness__Group__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3366:1: rule__Witness__Group__0 : rule__Witness__Group__0__Impl rule__Witness__Group__1 ;
    public final void rule__Witness__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3370:1: ( rule__Witness__Group__0__Impl rule__Witness__Group__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3371:2: rule__Witness__Group__0__Impl rule__Witness__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Witness__Group__0__Impl_in_rule__Witness__Group__06677);
            rule__Witness__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Witness__Group__1_in_rule__Witness__Group__06680);
            rule__Witness__Group__1();

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
    // $ANTLR end "rule__Witness__Group__0"


    // $ANTLR start "rule__Witness__Group__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3378:1: rule__Witness__Group__0__Impl : ( ( rule__Witness__LocalGeneratedAssignment_0 )? ) ;
    public final void rule__Witness__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3382:1: ( ( ( rule__Witness__LocalGeneratedAssignment_0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3383:1: ( ( rule__Witness__LocalGeneratedAssignment_0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3383:1: ( ( rule__Witness__LocalGeneratedAssignment_0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3384:1: ( rule__Witness__LocalGeneratedAssignment_0 )?
            {
             before(grammarAccess.getWitnessAccess().getLocalGeneratedAssignment_0()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3385:1: ( rule__Witness__LocalGeneratedAssignment_0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==35) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3385:2: rule__Witness__LocalGeneratedAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Witness__LocalGeneratedAssignment_0_in_rule__Witness__Group__0__Impl6707);
                    rule__Witness__LocalGeneratedAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWitnessAccess().getLocalGeneratedAssignment_0()); 

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
    // $ANTLR end "rule__Witness__Group__0__Impl"


    // $ANTLR start "rule__Witness__Group__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3395:1: rule__Witness__Group__1 : rule__Witness__Group__1__Impl rule__Witness__Group__2 ;
    public final void rule__Witness__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3399:1: ( rule__Witness__Group__1__Impl rule__Witness__Group__2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3400:2: rule__Witness__Group__1__Impl rule__Witness__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Witness__Group__1__Impl_in_rule__Witness__Group__16738);
            rule__Witness__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Witness__Group__2_in_rule__Witness__Group__16741);
            rule__Witness__Group__2();

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
    // $ANTLR end "rule__Witness__Group__1"


    // $ANTLR start "rule__Witness__Group__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3407:1: rule__Witness__Group__1__Impl : ( '@' ) ;
    public final void rule__Witness__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3411:1: ( ( '@' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3412:1: ( '@' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3412:1: ( '@' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3413:1: '@'
            {
             before(grammarAccess.getWitnessAccess().getCommercialAtKeyword_1()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Witness__Group__1__Impl6769); 
             after(grammarAccess.getWitnessAccess().getCommercialAtKeyword_1()); 

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
    // $ANTLR end "rule__Witness__Group__1__Impl"


    // $ANTLR start "rule__Witness__Group__2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3426:1: rule__Witness__Group__2 : rule__Witness__Group__2__Impl rule__Witness__Group__3 ;
    public final void rule__Witness__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3430:1: ( rule__Witness__Group__2__Impl rule__Witness__Group__3 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3431:2: rule__Witness__Group__2__Impl rule__Witness__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Witness__Group__2__Impl_in_rule__Witness__Group__26800);
            rule__Witness__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Witness__Group__3_in_rule__Witness__Group__26803);
            rule__Witness__Group__3();

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
    // $ANTLR end "rule__Witness__Group__2"


    // $ANTLR start "rule__Witness__Group__2__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3438:1: rule__Witness__Group__2__Impl : ( ( rule__Witness__NameAssignment_2 ) ) ;
    public final void rule__Witness__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3442:1: ( ( ( rule__Witness__NameAssignment_2 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3443:1: ( ( rule__Witness__NameAssignment_2 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3443:1: ( ( rule__Witness__NameAssignment_2 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3444:1: ( rule__Witness__NameAssignment_2 )
            {
             before(grammarAccess.getWitnessAccess().getNameAssignment_2()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3445:1: ( rule__Witness__NameAssignment_2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3445:2: rule__Witness__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Witness__NameAssignment_2_in_rule__Witness__Group__2__Impl6830);
            rule__Witness__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWitnessAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Witness__Group__2__Impl"


    // $ANTLR start "rule__Witness__Group__3"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3455:1: rule__Witness__Group__3 : rule__Witness__Group__3__Impl rule__Witness__Group__4 ;
    public final void rule__Witness__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3459:1: ( rule__Witness__Group__3__Impl rule__Witness__Group__4 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3460:2: rule__Witness__Group__3__Impl rule__Witness__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Witness__Group__3__Impl_in_rule__Witness__Group__36860);
            rule__Witness__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Witness__Group__4_in_rule__Witness__Group__36863);
            rule__Witness__Group__4();

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
    // $ANTLR end "rule__Witness__Group__3"


    // $ANTLR start "rule__Witness__Group__3__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3467:1: rule__Witness__Group__3__Impl : ( ( rule__Witness__PredicateAssignment_3 )? ) ;
    public final void rule__Witness__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3471:1: ( ( ( rule__Witness__PredicateAssignment_3 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3472:1: ( ( rule__Witness__PredicateAssignment_3 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3472:1: ( ( rule__Witness__PredicateAssignment_3 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3473:1: ( rule__Witness__PredicateAssignment_3 )?
            {
             before(grammarAccess.getWitnessAccess().getPredicateAssignment_3()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3474:1: ( rule__Witness__PredicateAssignment_3 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=RULE_STRING && LA40_0<=RULE_ID)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3474:2: rule__Witness__PredicateAssignment_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Witness__PredicateAssignment_3_in_rule__Witness__Group__3__Impl6890);
                    rule__Witness__PredicateAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWitnessAccess().getPredicateAssignment_3()); 

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
    // $ANTLR end "rule__Witness__Group__3__Impl"


    // $ANTLR start "rule__Witness__Group__4"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3484:1: rule__Witness__Group__4 : rule__Witness__Group__4__Impl ;
    public final void rule__Witness__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3488:1: ( rule__Witness__Group__4__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3489:2: rule__Witness__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Witness__Group__4__Impl_in_rule__Witness__Group__46921);
            rule__Witness__Group__4__Impl();

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
    // $ANTLR end "rule__Witness__Group__4"


    // $ANTLR start "rule__Witness__Group__4__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3495:1: rule__Witness__Group__4__Impl : ( ( rule__Witness__Group_4__0 )? ) ;
    public final void rule__Witness__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3499:1: ( ( ( rule__Witness__Group_4__0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3500:1: ( ( rule__Witness__Group_4__0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3500:1: ( ( rule__Witness__Group_4__0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3501:1: ( rule__Witness__Group_4__0 )?
            {
             before(grammarAccess.getWitnessAccess().getGroup_4()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3502:1: ( rule__Witness__Group_4__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==16) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3502:2: rule__Witness__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Witness__Group_4__0_in_rule__Witness__Group__4__Impl6948);
                    rule__Witness__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWitnessAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Witness__Group__4__Impl"


    // $ANTLR start "rule__Witness__Group_4__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3522:1: rule__Witness__Group_4__0 : rule__Witness__Group_4__0__Impl rule__Witness__Group_4__1 ;
    public final void rule__Witness__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3526:1: ( rule__Witness__Group_4__0__Impl rule__Witness__Group_4__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3527:2: rule__Witness__Group_4__0__Impl rule__Witness__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Witness__Group_4__0__Impl_in_rule__Witness__Group_4__06989);
            rule__Witness__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Witness__Group_4__1_in_rule__Witness__Group_4__06992);
            rule__Witness__Group_4__1();

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
    // $ANTLR end "rule__Witness__Group_4__0"


    // $ANTLR start "rule__Witness__Group_4__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3534:1: rule__Witness__Group_4__0__Impl : ( '//' ) ;
    public final void rule__Witness__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3538:1: ( ( '//' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3539:1: ( '//' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3539:1: ( '//' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3540:1: '//'
            {
             before(grammarAccess.getWitnessAccess().getSolidusSolidusKeyword_4_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Witness__Group_4__0__Impl7020); 
             after(grammarAccess.getWitnessAccess().getSolidusSolidusKeyword_4_0()); 

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
    // $ANTLR end "rule__Witness__Group_4__0__Impl"


    // $ANTLR start "rule__Witness__Group_4__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3553:1: rule__Witness__Group_4__1 : rule__Witness__Group_4__1__Impl ;
    public final void rule__Witness__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3557:1: ( rule__Witness__Group_4__1__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3558:2: rule__Witness__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Witness__Group_4__1__Impl_in_rule__Witness__Group_4__17051);
            rule__Witness__Group_4__1__Impl();

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
    // $ANTLR end "rule__Witness__Group_4__1"


    // $ANTLR start "rule__Witness__Group_4__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3564:1: rule__Witness__Group_4__1__Impl : ( ( rule__Witness__CommentAssignment_4_1 ) ) ;
    public final void rule__Witness__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3568:1: ( ( ( rule__Witness__CommentAssignment_4_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3569:1: ( ( rule__Witness__CommentAssignment_4_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3569:1: ( ( rule__Witness__CommentAssignment_4_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3570:1: ( rule__Witness__CommentAssignment_4_1 )
            {
             before(grammarAccess.getWitnessAccess().getCommentAssignment_4_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3571:1: ( rule__Witness__CommentAssignment_4_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3571:2: rule__Witness__CommentAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Witness__CommentAssignment_4_1_in_rule__Witness__Group_4__1__Impl7078);
            rule__Witness__CommentAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getWitnessAccess().getCommentAssignment_4_1()); 

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
    // $ANTLR end "rule__Witness__Group_4__1__Impl"


    // $ANTLR start "rule__Action__Group__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3585:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3589:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3590:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__0__Impl_in_rule__Action__Group__07112);
            rule__Action__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__1_in_rule__Action__Group__07115);
            rule__Action__Group__1();

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
    // $ANTLR end "rule__Action__Group__0"


    // $ANTLR start "rule__Action__Group__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3597:1: rule__Action__Group__0__Impl : ( '@' ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3601:1: ( ( '@' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3602:1: ( '@' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3602:1: ( '@' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3603:1: '@'
            {
             before(grammarAccess.getActionAccess().getCommercialAtKeyword_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Action__Group__0__Impl7143); 
             after(grammarAccess.getActionAccess().getCommercialAtKeyword_0()); 

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
    // $ANTLR end "rule__Action__Group__0__Impl"


    // $ANTLR start "rule__Action__Group__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3616:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3620:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3621:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__1__Impl_in_rule__Action__Group__17174);
            rule__Action__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__2_in_rule__Action__Group__17177);
            rule__Action__Group__2();

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
    // $ANTLR end "rule__Action__Group__1"


    // $ANTLR start "rule__Action__Group__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3628:1: rule__Action__Group__1__Impl : ( ( rule__Action__NameAssignment_1 ) ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3632:1: ( ( ( rule__Action__NameAssignment_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3633:1: ( ( rule__Action__NameAssignment_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3633:1: ( ( rule__Action__NameAssignment_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3634:1: ( rule__Action__NameAssignment_1 )
            {
             before(grammarAccess.getActionAccess().getNameAssignment_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3635:1: ( rule__Action__NameAssignment_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3635:2: rule__Action__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__NameAssignment_1_in_rule__Action__Group__1__Impl7204);
            rule__Action__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Action__Group__1__Impl"


    // $ANTLR start "rule__Action__Group__2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3645:1: rule__Action__Group__2 : rule__Action__Group__2__Impl rule__Action__Group__3 ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3649:1: ( rule__Action__Group__2__Impl rule__Action__Group__3 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3650:2: rule__Action__Group__2__Impl rule__Action__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__2__Impl_in_rule__Action__Group__27234);
            rule__Action__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__3_in_rule__Action__Group__27237);
            rule__Action__Group__3();

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
    // $ANTLR end "rule__Action__Group__2"


    // $ANTLR start "rule__Action__Group__2__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3657:1: rule__Action__Group__2__Impl : ( ( rule__Action__ActionAssignment_2 )? ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3661:1: ( ( ( rule__Action__ActionAssignment_2 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3662:1: ( ( rule__Action__ActionAssignment_2 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3662:1: ( ( rule__Action__ActionAssignment_2 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3663:1: ( rule__Action__ActionAssignment_2 )?
            {
             before(grammarAccess.getActionAccess().getActionAssignment_2()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3664:1: ( rule__Action__ActionAssignment_2 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=RULE_STRING && LA42_0<=RULE_ID)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3664:2: rule__Action__ActionAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Action__ActionAssignment_2_in_rule__Action__Group__2__Impl7264);
                    rule__Action__ActionAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getActionAssignment_2()); 

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
    // $ANTLR end "rule__Action__Group__2__Impl"


    // $ANTLR start "rule__Action__Group__3"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3674:1: rule__Action__Group__3 : rule__Action__Group__3__Impl ;
    public final void rule__Action__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3678:1: ( rule__Action__Group__3__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3679:2: rule__Action__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__3__Impl_in_rule__Action__Group__37295);
            rule__Action__Group__3__Impl();

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
    // $ANTLR end "rule__Action__Group__3"


    // $ANTLR start "rule__Action__Group__3__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3685:1: rule__Action__Group__3__Impl : ( ( rule__Action__Group_3__0 )? ) ;
    public final void rule__Action__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3689:1: ( ( ( rule__Action__Group_3__0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3690:1: ( ( rule__Action__Group_3__0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3690:1: ( ( rule__Action__Group_3__0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3691:1: ( rule__Action__Group_3__0 )?
            {
             before(grammarAccess.getActionAccess().getGroup_3()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3692:1: ( rule__Action__Group_3__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==16) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3692:2: rule__Action__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Action__Group_3__0_in_rule__Action__Group__3__Impl7322);
                    rule__Action__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Action__Group__3__Impl"


    // $ANTLR start "rule__Action__Group_3__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3710:1: rule__Action__Group_3__0 : rule__Action__Group_3__0__Impl rule__Action__Group_3__1 ;
    public final void rule__Action__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3714:1: ( rule__Action__Group_3__0__Impl rule__Action__Group_3__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3715:2: rule__Action__Group_3__0__Impl rule__Action__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__Group_3__0__Impl_in_rule__Action__Group_3__07361);
            rule__Action__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Action__Group_3__1_in_rule__Action__Group_3__07364);
            rule__Action__Group_3__1();

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
    // $ANTLR end "rule__Action__Group_3__0"


    // $ANTLR start "rule__Action__Group_3__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3722:1: rule__Action__Group_3__0__Impl : ( '//' ) ;
    public final void rule__Action__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3726:1: ( ( '//' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3727:1: ( '//' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3727:1: ( '//' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3728:1: '//'
            {
             before(grammarAccess.getActionAccess().getSolidusSolidusKeyword_3_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Action__Group_3__0__Impl7392); 
             after(grammarAccess.getActionAccess().getSolidusSolidusKeyword_3_0()); 

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
    // $ANTLR end "rule__Action__Group_3__0__Impl"


    // $ANTLR start "rule__Action__Group_3__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3741:1: rule__Action__Group_3__1 : rule__Action__Group_3__1__Impl ;
    public final void rule__Action__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3745:1: ( rule__Action__Group_3__1__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3746:2: rule__Action__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__Group_3__1__Impl_in_rule__Action__Group_3__17423);
            rule__Action__Group_3__1__Impl();

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
    // $ANTLR end "rule__Action__Group_3__1"


    // $ANTLR start "rule__Action__Group_3__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3752:1: rule__Action__Group_3__1__Impl : ( ( rule__Action__CommentAssignment_3_1 ) ) ;
    public final void rule__Action__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3756:1: ( ( ( rule__Action__CommentAssignment_3_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3757:1: ( ( rule__Action__CommentAssignment_3_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3757:1: ( ( rule__Action__CommentAssignment_3_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3758:1: ( rule__Action__CommentAssignment_3_1 )
            {
             before(grammarAccess.getActionAccess().getCommentAssignment_3_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3759:1: ( rule__Action__CommentAssignment_3_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3759:2: rule__Action__CommentAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__CommentAssignment_3_1_in_rule__Action__Group_3__1__Impl7450);
            rule__Action__CommentAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getCommentAssignment_3_1()); 

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
    // $ANTLR end "rule__Action__Group_3__1__Impl"


    // $ANTLR start "rule__Machine__NameAssignment_2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3774:1: rule__Machine__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Machine__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3778:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3779:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3779:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3780:1: ruleEString
            {
             before(grammarAccess.getMachineAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Machine__NameAssignment_27489);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Machine__NameAssignment_2"


    // $ANTLR start "rule__Machine__CommentAssignment_3_1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3789:1: rule__Machine__CommentAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Machine__CommentAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3793:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3794:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3794:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3795:1: ruleEString
            {
             before(grammarAccess.getMachineAccess().getCommentEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Machine__CommentAssignment_3_17520);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getCommentEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Machine__CommentAssignment_3_1"


    // $ANTLR start "rule__Machine__RefinesAssignment_4_1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3804:1: rule__Machine__RefinesAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Machine__RefinesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3808:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3809:1: ( ( ruleEString ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3809:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3810:1: ( ruleEString )
            {
             before(grammarAccess.getMachineAccess().getRefinesMachineCrossReference_4_1_0()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3811:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3812:1: ruleEString
            {
             before(grammarAccess.getMachineAccess().getRefinesMachineEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Machine__RefinesAssignment_4_17555);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getRefinesMachineEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getMachineAccess().getRefinesMachineCrossReference_4_1_0()); 

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
    // $ANTLR end "rule__Machine__RefinesAssignment_4_1"


    // $ANTLR start "rule__Machine__RefinesAssignment_4_2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3823:1: rule__Machine__RefinesAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__Machine__RefinesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3827:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3828:1: ( ( ruleEString ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3828:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3829:1: ( ruleEString )
            {
             before(grammarAccess.getMachineAccess().getRefinesMachineCrossReference_4_2_0()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3830:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3831:1: ruleEString
            {
             before(grammarAccess.getMachineAccess().getRefinesMachineEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Machine__RefinesAssignment_4_27594);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getRefinesMachineEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getMachineAccess().getRefinesMachineCrossReference_4_2_0()); 

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
    // $ANTLR end "rule__Machine__RefinesAssignment_4_2"


    // $ANTLR start "rule__Machine__SeesAssignment_5_1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3842:1: rule__Machine__SeesAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__Machine__SeesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3846:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3847:1: ( ( ruleEString ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3847:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3848:1: ( ruleEString )
            {
             before(grammarAccess.getMachineAccess().getSeesContextCrossReference_5_1_0()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3849:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3850:1: ruleEString
            {
             before(grammarAccess.getMachineAccess().getSeesContextEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Machine__SeesAssignment_5_17633);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getSeesContextEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getMachineAccess().getSeesContextCrossReference_5_1_0()); 

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
    // $ANTLR end "rule__Machine__SeesAssignment_5_1"


    // $ANTLR start "rule__Machine__SeesAssignment_5_2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3861:1: rule__Machine__SeesAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__Machine__SeesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3865:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3866:1: ( ( ruleEString ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3866:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3867:1: ( ruleEString )
            {
             before(grammarAccess.getMachineAccess().getSeesContextCrossReference_5_2_0()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3868:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3869:1: ruleEString
            {
             before(grammarAccess.getMachineAccess().getSeesContextEStringParserRuleCall_5_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Machine__SeesAssignment_5_27672);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getSeesContextEStringParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getMachineAccess().getSeesContextCrossReference_5_2_0()); 

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
    // $ANTLR end "rule__Machine__SeesAssignment_5_2"


    // $ANTLR start "rule__Machine__VariablesAssignment_6_1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3880:1: rule__Machine__VariablesAssignment_6_1 : ( ruleVariable ) ;
    public final void rule__Machine__VariablesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3884:1: ( ( ruleVariable ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3885:1: ( ruleVariable )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3885:1: ( ruleVariable )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3886:1: ruleVariable
            {
             before(grammarAccess.getMachineAccess().getVariablesVariableParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_rule__Machine__VariablesAssignment_6_17707);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getVariablesVariableParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Machine__VariablesAssignment_6_1"


    // $ANTLR start "rule__Machine__VariablesAssignment_6_2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3895:1: rule__Machine__VariablesAssignment_6_2 : ( ruleVariable ) ;
    public final void rule__Machine__VariablesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3899:1: ( ( ruleVariable ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3900:1: ( ruleVariable )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3900:1: ( ruleVariable )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3901:1: ruleVariable
            {
             before(grammarAccess.getMachineAccess().getVariablesVariableParserRuleCall_6_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_rule__Machine__VariablesAssignment_6_27738);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getVariablesVariableParserRuleCall_6_2_0()); 

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
    // $ANTLR end "rule__Machine__VariablesAssignment_6_2"


    // $ANTLR start "rule__Machine__InvariantsAssignment_7_1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3910:1: rule__Machine__InvariantsAssignment_7_1 : ( ruleInvariant ) ;
    public final void rule__Machine__InvariantsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3914:1: ( ( ruleInvariant ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3915:1: ( ruleInvariant )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3915:1: ( ruleInvariant )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3916:1: ruleInvariant
            {
             before(grammarAccess.getMachineAccess().getInvariantsInvariantParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInvariant_in_rule__Machine__InvariantsAssignment_7_17769);
            ruleInvariant();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getInvariantsInvariantParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__Machine__InvariantsAssignment_7_1"


    // $ANTLR start "rule__Machine__InvariantsAssignment_7_2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3925:1: rule__Machine__InvariantsAssignment_7_2 : ( ruleInvariant ) ;
    public final void rule__Machine__InvariantsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3929:1: ( ( ruleInvariant ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3930:1: ( ruleInvariant )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3930:1: ( ruleInvariant )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3931:1: ruleInvariant
            {
             before(grammarAccess.getMachineAccess().getInvariantsInvariantParserRuleCall_7_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInvariant_in_rule__Machine__InvariantsAssignment_7_27800);
            ruleInvariant();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getInvariantsInvariantParserRuleCall_7_2_0()); 

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
    // $ANTLR end "rule__Machine__InvariantsAssignment_7_2"


    // $ANTLR start "rule__Machine__VariantAssignment_8_1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3940:1: rule__Machine__VariantAssignment_8_1 : ( ruleVariant ) ;
    public final void rule__Machine__VariantAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3944:1: ( ( ruleVariant ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3945:1: ( ruleVariant )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3945:1: ( ruleVariant )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3946:1: ruleVariant
            {
             before(grammarAccess.getMachineAccess().getVariantVariantParserRuleCall_8_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariant_in_rule__Machine__VariantAssignment_8_17831);
            ruleVariant();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getVariantVariantParserRuleCall_8_1_0()); 

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
    // $ANTLR end "rule__Machine__VariantAssignment_8_1"


    // $ANTLR start "rule__Machine__EventsAssignment_9_1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3955:1: rule__Machine__EventsAssignment_9_1 : ( ruleevent ) ;
    public final void rule__Machine__EventsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3959:1: ( ( ruleevent ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3960:1: ( ruleevent )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3960:1: ( ruleevent )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3961:1: ruleevent
            {
             before(grammarAccess.getMachineAccess().getEventsEventParserRuleCall_9_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleevent_in_rule__Machine__EventsAssignment_9_17862);
            ruleevent();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getEventsEventParserRuleCall_9_1_0()); 

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
    // $ANTLR end "rule__Machine__EventsAssignment_9_1"


    // $ANTLR start "rule__Machine__EventsAssignment_9_2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3970:1: rule__Machine__EventsAssignment_9_2 : ( ruleevent ) ;
    public final void rule__Machine__EventsAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3974:1: ( ( ruleevent ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3975:1: ( ruleevent )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3975:1: ( ruleevent )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3976:1: ruleevent
            {
             before(grammarAccess.getMachineAccess().getEventsEventParserRuleCall_9_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleevent_in_rule__Machine__EventsAssignment_9_27893);
            ruleevent();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getEventsEventParserRuleCall_9_2_0()); 

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
    // $ANTLR end "rule__Machine__EventsAssignment_9_2"


    // $ANTLR start "rule__Variable__NameAssignment_1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3985:1: rule__Variable__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Variable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3989:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3990:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3990:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3991:1: ruleEString
            {
             before(grammarAccess.getVariableAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Variable__NameAssignment_17924);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Variable__NameAssignment_1"


    // $ANTLR start "rule__Variable__CommentAssignment_2_1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4000:1: rule__Variable__CommentAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Variable__CommentAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4004:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4005:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4005:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4006:1: ruleEString
            {
             before(grammarAccess.getVariableAccess().getCommentEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Variable__CommentAssignment_2_17955);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getCommentEStringParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Variable__CommentAssignment_2_1"


    // $ANTLR start "rule__Invariant__NameAssignment_1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4015:1: rule__Invariant__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Invariant__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4019:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4020:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4020:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4021:1: ruleEString
            {
             before(grammarAccess.getInvariantAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Invariant__NameAssignment_17986);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInvariantAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Invariant__NameAssignment_1"


    // $ANTLR start "rule__Invariant__PredicateAssignment_2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4030:1: rule__Invariant__PredicateAssignment_2 : ( ruleEString ) ;
    public final void rule__Invariant__PredicateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4034:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4035:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4035:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4036:1: ruleEString
            {
             before(grammarAccess.getInvariantAccess().getPredicateEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Invariant__PredicateAssignment_28017);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInvariantAccess().getPredicateEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Invariant__PredicateAssignment_2"


    // $ANTLR start "rule__Invariant__TheoremAssignment_3"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4045:1: rule__Invariant__TheoremAssignment_3 : ( ( 'theorem' ) ) ;
    public final void rule__Invariant__TheoremAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4049:1: ( ( ( 'theorem' ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4050:1: ( ( 'theorem' ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4050:1: ( ( 'theorem' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4051:1: ( 'theorem' )
            {
             before(grammarAccess.getInvariantAccess().getTheoremTheoremKeyword_3_0()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4052:1: ( 'theorem' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4053:1: 'theorem'
            {
             before(grammarAccess.getInvariantAccess().getTheoremTheoremKeyword_3_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Invariant__TheoremAssignment_38053); 
             after(grammarAccess.getInvariantAccess().getTheoremTheoremKeyword_3_0()); 

            }

             after(grammarAccess.getInvariantAccess().getTheoremTheoremKeyword_3_0()); 

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
    // $ANTLR end "rule__Invariant__TheoremAssignment_3"


    // $ANTLR start "rule__Invariant__CommentAssignment_4_1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4068:1: rule__Invariant__CommentAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Invariant__CommentAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4072:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4073:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4073:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4074:1: ruleEString
            {
             before(grammarAccess.getInvariantAccess().getCommentEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Invariant__CommentAssignment_4_18092);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInvariantAccess().getCommentEStringParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Invariant__CommentAssignment_4_1"


    // $ANTLR start "rule__Variant__ExpressionAssignment_2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4083:1: rule__Variant__ExpressionAssignment_2 : ( ruleEString ) ;
    public final void rule__Variant__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4087:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4088:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4088:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4089:1: ruleEString
            {
             before(grammarAccess.getVariantAccess().getExpressionEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Variant__ExpressionAssignment_28123);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVariantAccess().getExpressionEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Variant__ExpressionAssignment_2"


    // $ANTLR start "rule__Variant__CommentAssignment_3_1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4098:1: rule__Variant__CommentAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Variant__CommentAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4102:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4103:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4103:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4104:1: ruleEString
            {
             before(grammarAccess.getVariantAccess().getCommentEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Variant__CommentAssignment_3_18154);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVariantAccess().getCommentEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Variant__CommentAssignment_3_1"


    // $ANTLR start "rule__Event__NameAssignment_2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4113:1: rule__Event__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Event__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4117:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4118:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4118:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4119:1: ruleEString
            {
             before(grammarAccess.getEventAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Event__NameAssignment_28185);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEventAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Event__NameAssignment_2"


    // $ANTLR start "rule__Event__ExtendedAssignment_3"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4128:1: rule__Event__ExtendedAssignment_3 : ( ( 'extended' ) ) ;
    public final void rule__Event__ExtendedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4132:1: ( ( ( 'extended' ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4133:1: ( ( 'extended' ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4133:1: ( ( 'extended' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4134:1: ( 'extended' )
            {
             before(grammarAccess.getEventAccess().getExtendedExtendedKeyword_3_0()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4135:1: ( 'extended' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4136:1: 'extended'
            {
             before(grammarAccess.getEventAccess().getExtendedExtendedKeyword_3_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Event__ExtendedAssignment_38221); 
             after(grammarAccess.getEventAccess().getExtendedExtendedKeyword_3_0()); 

            }

             after(grammarAccess.getEventAccess().getExtendedExtendedKeyword_3_0()); 

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
    // $ANTLR end "rule__Event__ExtendedAssignment_3"


    // $ANTLR start "rule__Event__ConvergenceAssignment_4"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4151:1: rule__Event__ConvergenceAssignment_4 : ( ruleConvergence ) ;
    public final void rule__Event__ConvergenceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4155:1: ( ( ruleConvergence ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4156:1: ( ruleConvergence )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4156:1: ( ruleConvergence )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4157:1: ruleConvergence
            {
             before(grammarAccess.getEventAccess().getConvergenceConvergenceEnumRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConvergence_in_rule__Event__ConvergenceAssignment_48260);
            ruleConvergence();

            state._fsp--;

             after(grammarAccess.getEventAccess().getConvergenceConvergenceEnumRuleCall_4_0()); 

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
    // $ANTLR end "rule__Event__ConvergenceAssignment_4"


    // $ANTLR start "rule__Event__CommentAssignment_5_1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4166:1: rule__Event__CommentAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Event__CommentAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4170:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4171:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4171:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4172:1: ruleEString
            {
             before(grammarAccess.getEventAccess().getCommentEStringParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Event__CommentAssignment_5_18291);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEventAccess().getCommentEStringParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Event__CommentAssignment_5_1"


    // $ANTLR start "rule__Event__RefinesAssignment_6_1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4181:1: rule__Event__RefinesAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__Event__RefinesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4185:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4186:1: ( ( ruleEString ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4186:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4187:1: ( ruleEString )
            {
             before(grammarAccess.getEventAccess().getRefinesEventCrossReference_6_1_0()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4188:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4189:1: ruleEString
            {
             before(grammarAccess.getEventAccess().getRefinesEventEStringParserRuleCall_6_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Event__RefinesAssignment_6_18326);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEventAccess().getRefinesEventEStringParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getEventAccess().getRefinesEventCrossReference_6_1_0()); 

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
    // $ANTLR end "rule__Event__RefinesAssignment_6_1"


    // $ANTLR start "rule__Event__RefinesAssignment_6_2_1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4200:1: rule__Event__RefinesAssignment_6_2_1 : ( ( ruleEString ) ) ;
    public final void rule__Event__RefinesAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4204:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4205:1: ( ( ruleEString ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4205:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4206:1: ( ruleEString )
            {
             before(grammarAccess.getEventAccess().getRefinesEventCrossReference_6_2_1_0()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4207:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4208:1: ruleEString
            {
             before(grammarAccess.getEventAccess().getRefinesEventEStringParserRuleCall_6_2_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Event__RefinesAssignment_6_2_18365);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEventAccess().getRefinesEventEStringParserRuleCall_6_2_1_0_1()); 

            }

             after(grammarAccess.getEventAccess().getRefinesEventCrossReference_6_2_1_0()); 

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
    // $ANTLR end "rule__Event__RefinesAssignment_6_2_1"


    // $ANTLR start "rule__Event__GuardsAssignment_7_1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4219:1: rule__Event__GuardsAssignment_7_1 : ( ruleGuard ) ;
    public final void rule__Event__GuardsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4223:1: ( ( ruleGuard ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4224:1: ( ruleGuard )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4224:1: ( ruleGuard )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4225:1: ruleGuard
            {
             before(grammarAccess.getEventAccess().getGuardsGuardParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGuard_in_rule__Event__GuardsAssignment_7_18400);
            ruleGuard();

            state._fsp--;

             after(grammarAccess.getEventAccess().getGuardsGuardParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__Event__GuardsAssignment_7_1"


    // $ANTLR start "rule__Event__GuardsAssignment_7_2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4234:1: rule__Event__GuardsAssignment_7_2 : ( ruleGuard ) ;
    public final void rule__Event__GuardsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4238:1: ( ( ruleGuard ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4239:1: ( ruleGuard )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4239:1: ( ruleGuard )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4240:1: ruleGuard
            {
             before(grammarAccess.getEventAccess().getGuardsGuardParserRuleCall_7_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGuard_in_rule__Event__GuardsAssignment_7_28431);
            ruleGuard();

            state._fsp--;

             after(grammarAccess.getEventAccess().getGuardsGuardParserRuleCall_7_2_0()); 

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
    // $ANTLR end "rule__Event__GuardsAssignment_7_2"


    // $ANTLR start "rule__Event__ParametersAssignment_8_1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4249:1: rule__Event__ParametersAssignment_8_1 : ( ruleParameter ) ;
    public final void rule__Event__ParametersAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4253:1: ( ( ruleParameter ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4254:1: ( ruleParameter )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4254:1: ( ruleParameter )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4255:1: ruleParameter
            {
             before(grammarAccess.getEventAccess().getParametersParameterParserRuleCall_8_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleParameter_in_rule__Event__ParametersAssignment_8_18462);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getEventAccess().getParametersParameterParserRuleCall_8_1_0()); 

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
    // $ANTLR end "rule__Event__ParametersAssignment_8_1"


    // $ANTLR start "rule__Event__ParametersAssignment_8_2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4264:1: rule__Event__ParametersAssignment_8_2 : ( ruleParameter ) ;
    public final void rule__Event__ParametersAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4268:1: ( ( ruleParameter ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4269:1: ( ruleParameter )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4269:1: ( ruleParameter )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4270:1: ruleParameter
            {
             before(grammarAccess.getEventAccess().getParametersParameterParserRuleCall_8_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleParameter_in_rule__Event__ParametersAssignment_8_28493);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getEventAccess().getParametersParameterParserRuleCall_8_2_0()); 

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
    // $ANTLR end "rule__Event__ParametersAssignment_8_2"


    // $ANTLR start "rule__Event__GuardsAssignment_8_4"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4279:1: rule__Event__GuardsAssignment_8_4 : ( ruleGuard ) ;
    public final void rule__Event__GuardsAssignment_8_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4283:1: ( ( ruleGuard ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4284:1: ( ruleGuard )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4284:1: ( ruleGuard )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4285:1: ruleGuard
            {
             before(grammarAccess.getEventAccess().getGuardsGuardParserRuleCall_8_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGuard_in_rule__Event__GuardsAssignment_8_48524);
            ruleGuard();

            state._fsp--;

             after(grammarAccess.getEventAccess().getGuardsGuardParserRuleCall_8_4_0()); 

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
    // $ANTLR end "rule__Event__GuardsAssignment_8_4"


    // $ANTLR start "rule__Event__GuardsAssignment_8_5"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4294:1: rule__Event__GuardsAssignment_8_5 : ( ruleGuard ) ;
    public final void rule__Event__GuardsAssignment_8_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4298:1: ( ( ruleGuard ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4299:1: ( ruleGuard )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4299:1: ( ruleGuard )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4300:1: ruleGuard
            {
             before(grammarAccess.getEventAccess().getGuardsGuardParserRuleCall_8_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGuard_in_rule__Event__GuardsAssignment_8_58555);
            ruleGuard();

            state._fsp--;

             after(grammarAccess.getEventAccess().getGuardsGuardParserRuleCall_8_5_0()); 

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
    // $ANTLR end "rule__Event__GuardsAssignment_8_5"


    // $ANTLR start "rule__Event__WitnessesAssignment_9_1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4309:1: rule__Event__WitnessesAssignment_9_1 : ( ruleWitness ) ;
    public final void rule__Event__WitnessesAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4313:1: ( ( ruleWitness ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4314:1: ( ruleWitness )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4314:1: ( ruleWitness )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4315:1: ruleWitness
            {
             before(grammarAccess.getEventAccess().getWitnessesWitnessParserRuleCall_9_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleWitness_in_rule__Event__WitnessesAssignment_9_18586);
            ruleWitness();

            state._fsp--;

             after(grammarAccess.getEventAccess().getWitnessesWitnessParserRuleCall_9_1_0()); 

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
    // $ANTLR end "rule__Event__WitnessesAssignment_9_1"


    // $ANTLR start "rule__Event__WitnessesAssignment_9_2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4324:1: rule__Event__WitnessesAssignment_9_2 : ( ruleWitness ) ;
    public final void rule__Event__WitnessesAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4328:1: ( ( ruleWitness ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4329:1: ( ruleWitness )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4329:1: ( ruleWitness )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4330:1: ruleWitness
            {
             before(grammarAccess.getEventAccess().getWitnessesWitnessParserRuleCall_9_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleWitness_in_rule__Event__WitnessesAssignment_9_28617);
            ruleWitness();

            state._fsp--;

             after(grammarAccess.getEventAccess().getWitnessesWitnessParserRuleCall_9_2_0()); 

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
    // $ANTLR end "rule__Event__WitnessesAssignment_9_2"


    // $ANTLR start "rule__Event__ActionsAssignment_10_1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4339:1: rule__Event__ActionsAssignment_10_1 : ( ruleAction ) ;
    public final void rule__Event__ActionsAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4343:1: ( ( ruleAction ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4344:1: ( ruleAction )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4344:1: ( ruleAction )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4345:1: ruleAction
            {
             before(grammarAccess.getEventAccess().getActionsActionParserRuleCall_10_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAction_in_rule__Event__ActionsAssignment_10_18648);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getEventAccess().getActionsActionParserRuleCall_10_1_0()); 

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
    // $ANTLR end "rule__Event__ActionsAssignment_10_1"


    // $ANTLR start "rule__Event__ActionsAssignment_10_2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4354:1: rule__Event__ActionsAssignment_10_2 : ( ruleAction ) ;
    public final void rule__Event__ActionsAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4358:1: ( ( ruleAction ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4359:1: ( ruleAction )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4359:1: ( ruleAction )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4360:1: ruleAction
            {
             before(grammarAccess.getEventAccess().getActionsActionParserRuleCall_10_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAction_in_rule__Event__ActionsAssignment_10_28679);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getEventAccess().getActionsActionParserRuleCall_10_2_0()); 

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
    // $ANTLR end "rule__Event__ActionsAssignment_10_2"


    // $ANTLR start "rule__Parameter__NameAssignment_1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4369:1: rule__Parameter__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4373:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4374:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4374:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4375:1: ruleEString
            {
             before(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Parameter__NameAssignment_18710);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Parameter__NameAssignment_1"


    // $ANTLR start "rule__Parameter__CommentAssignment_2_1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4384:1: rule__Parameter__CommentAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Parameter__CommentAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4388:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4389:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4389:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4390:1: ruleEString
            {
             before(grammarAccess.getParameterAccess().getCommentEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Parameter__CommentAssignment_2_18741);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getCommentEStringParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Parameter__CommentAssignment_2_1"


    // $ANTLR start "rule__Guard__NameAssignment_1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4399:1: rule__Guard__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Guard__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4403:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4404:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4404:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4405:1: ruleEString
            {
             before(grammarAccess.getGuardAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Guard__NameAssignment_18772);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGuardAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Guard__NameAssignment_1"


    // $ANTLR start "rule__Guard__PredicateAssignment_2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4414:1: rule__Guard__PredicateAssignment_2 : ( ruleEString ) ;
    public final void rule__Guard__PredicateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4418:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4419:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4419:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4420:1: ruleEString
            {
             before(grammarAccess.getGuardAccess().getPredicateEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Guard__PredicateAssignment_28803);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGuardAccess().getPredicateEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Guard__PredicateAssignment_2"


    // $ANTLR start "rule__Guard__TheoremAssignment_3"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4429:1: rule__Guard__TheoremAssignment_3 : ( ( 'theorem' ) ) ;
    public final void rule__Guard__TheoremAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4433:1: ( ( ( 'theorem' ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4434:1: ( ( 'theorem' ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4434:1: ( ( 'theorem' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4435:1: ( 'theorem' )
            {
             before(grammarAccess.getGuardAccess().getTheoremTheoremKeyword_3_0()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4436:1: ( 'theorem' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4437:1: 'theorem'
            {
             before(grammarAccess.getGuardAccess().getTheoremTheoremKeyword_3_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Guard__TheoremAssignment_38839); 
             after(grammarAccess.getGuardAccess().getTheoremTheoremKeyword_3_0()); 

            }

             after(grammarAccess.getGuardAccess().getTheoremTheoremKeyword_3_0()); 

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
    // $ANTLR end "rule__Guard__TheoremAssignment_3"


    // $ANTLR start "rule__Guard__CommentAssignment_4_1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4452:1: rule__Guard__CommentAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Guard__CommentAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4456:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4457:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4457:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4458:1: ruleEString
            {
             before(grammarAccess.getGuardAccess().getCommentEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Guard__CommentAssignment_4_18878);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGuardAccess().getCommentEStringParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Guard__CommentAssignment_4_1"


    // $ANTLR start "rule__Witness__LocalGeneratedAssignment_0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4467:1: rule__Witness__LocalGeneratedAssignment_0 : ( ( 'localGenerated' ) ) ;
    public final void rule__Witness__LocalGeneratedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4471:1: ( ( ( 'localGenerated' ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4472:1: ( ( 'localGenerated' ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4472:1: ( ( 'localGenerated' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4473:1: ( 'localGenerated' )
            {
             before(grammarAccess.getWitnessAccess().getLocalGeneratedLocalGeneratedKeyword_0_0()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4474:1: ( 'localGenerated' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4475:1: 'localGenerated'
            {
             before(grammarAccess.getWitnessAccess().getLocalGeneratedLocalGeneratedKeyword_0_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Witness__LocalGeneratedAssignment_08914); 
             after(grammarAccess.getWitnessAccess().getLocalGeneratedLocalGeneratedKeyword_0_0()); 

            }

             after(grammarAccess.getWitnessAccess().getLocalGeneratedLocalGeneratedKeyword_0_0()); 

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
    // $ANTLR end "rule__Witness__LocalGeneratedAssignment_0"


    // $ANTLR start "rule__Witness__NameAssignment_2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4490:1: rule__Witness__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Witness__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4494:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4495:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4495:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4496:1: ruleEString
            {
             before(grammarAccess.getWitnessAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Witness__NameAssignment_28953);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWitnessAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Witness__NameAssignment_2"


    // $ANTLR start "rule__Witness__PredicateAssignment_3"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4505:1: rule__Witness__PredicateAssignment_3 : ( ruleEString ) ;
    public final void rule__Witness__PredicateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4509:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4510:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4510:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4511:1: ruleEString
            {
             before(grammarAccess.getWitnessAccess().getPredicateEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Witness__PredicateAssignment_38984);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWitnessAccess().getPredicateEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Witness__PredicateAssignment_3"


    // $ANTLR start "rule__Witness__CommentAssignment_4_1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4520:1: rule__Witness__CommentAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Witness__CommentAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4524:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4525:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4525:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4526:1: ruleEString
            {
             before(grammarAccess.getWitnessAccess().getCommentEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Witness__CommentAssignment_4_19015);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWitnessAccess().getCommentEStringParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Witness__CommentAssignment_4_1"


    // $ANTLR start "rule__Action__NameAssignment_1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4535:1: rule__Action__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Action__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4539:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4540:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4540:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4541:1: ruleEString
            {
             before(grammarAccess.getActionAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Action__NameAssignment_19046);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActionAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Action__NameAssignment_1"


    // $ANTLR start "rule__Action__ActionAssignment_2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4550:1: rule__Action__ActionAssignment_2 : ( ruleEString ) ;
    public final void rule__Action__ActionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4554:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4555:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4555:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4556:1: ruleEString
            {
             before(grammarAccess.getActionAccess().getActionEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Action__ActionAssignment_29077);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActionAccess().getActionEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Action__ActionAssignment_2"


    // $ANTLR start "rule__Action__CommentAssignment_3_1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4565:1: rule__Action__CommentAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Action__CommentAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4569:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4570:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4570:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4571:1: ruleEString
            {
             before(grammarAccess.getActionAccess().getCommentEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Action__CommentAssignment_3_19108);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActionAccess().getCommentEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Action__CommentAssignment_3_1"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleMachine_in_entryRuleMachine61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMachine68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group__0_in_ruleMachine94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariable188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group__0_in_ruleVariable214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvariant_in_entryRuleInvariant241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInvariant248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group__0_in_ruleInvariant274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariant_in_entryRuleVariant301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariant308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variant__Group__0_in_ruleVariant334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleevent_in_entryRuleevent361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleevent368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group__0_in_ruleevent394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameter428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group__0_in_ruleParameter454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGuard_in_entryRuleGuard481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGuard488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guard__Group__0_in_ruleGuard514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWitness_in_entryRuleWitness541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWitness548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Witness__Group__0_in_ruleWitness574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAction_in_entryRuleAction601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAction608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group__0_in_ruleAction634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Convergence__Alternatives_in_ruleConvergence671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Convergence__Alternatives756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Convergence__Alternatives777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Convergence__Alternatives798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group__0__Impl_in_rule__Machine__Group__0831 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Machine__Group__1_in_rule__Machine__Group__0834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group__1__Impl_in_rule__Machine__Group__1892 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Machine__Group__2_in_rule__Machine__Group__1895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Machine__Group__1__Impl923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group__2__Impl_in_rule__Machine__Group__2954 = new BitSet(new long[]{0x00000000007F8000L});
        public static final BitSet FOLLOW_rule__Machine__Group__3_in_rule__Machine__Group__2957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__NameAssignment_2_in_rule__Machine__Group__2__Impl984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group__3__Impl_in_rule__Machine__Group__31014 = new BitSet(new long[]{0x00000000007F8000L});
        public static final BitSet FOLLOW_rule__Machine__Group__4_in_rule__Machine__Group__31017 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_3__0_in_rule__Machine__Group__3__Impl1044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group__4__Impl_in_rule__Machine__Group__41075 = new BitSet(new long[]{0x00000000007F8000L});
        public static final BitSet FOLLOW_rule__Machine__Group__5_in_rule__Machine__Group__41078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_4__0_in_rule__Machine__Group__4__Impl1105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group__5__Impl_in_rule__Machine__Group__51136 = new BitSet(new long[]{0x00000000007F8000L});
        public static final BitSet FOLLOW_rule__Machine__Group__6_in_rule__Machine__Group__51139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_5__0_in_rule__Machine__Group__5__Impl1166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group__6__Impl_in_rule__Machine__Group__61197 = new BitSet(new long[]{0x00000000007F8000L});
        public static final BitSet FOLLOW_rule__Machine__Group__7_in_rule__Machine__Group__61200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_6__0_in_rule__Machine__Group__6__Impl1227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group__7__Impl_in_rule__Machine__Group__71258 = new BitSet(new long[]{0x00000000007F8000L});
        public static final BitSet FOLLOW_rule__Machine__Group__8_in_rule__Machine__Group__71261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_7__0_in_rule__Machine__Group__7__Impl1288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group__8__Impl_in_rule__Machine__Group__81319 = new BitSet(new long[]{0x00000000007F8000L});
        public static final BitSet FOLLOW_rule__Machine__Group__9_in_rule__Machine__Group__81322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_8__0_in_rule__Machine__Group__8__Impl1349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group__9__Impl_in_rule__Machine__Group__91380 = new BitSet(new long[]{0x00000000007F8000L});
        public static final BitSet FOLLOW_rule__Machine__Group__10_in_rule__Machine__Group__91383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_9__0_in_rule__Machine__Group__9__Impl1410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group__10__Impl_in_rule__Machine__Group__101441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Machine__Group__10__Impl1469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_3__0__Impl_in_rule__Machine__Group_3__01522 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Machine__Group_3__1_in_rule__Machine__Group_3__01525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Machine__Group_3__0__Impl1553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_3__1__Impl_in_rule__Machine__Group_3__11584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__CommentAssignment_3_1_in_rule__Machine__Group_3__1__Impl1611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_4__0__Impl_in_rule__Machine__Group_4__01645 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Machine__Group_4__1_in_rule__Machine__Group_4__01648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Machine__Group_4__0__Impl1676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_4__1__Impl_in_rule__Machine__Group_4__11707 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Machine__Group_4__2_in_rule__Machine__Group_4__11710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__RefinesAssignment_4_1_in_rule__Machine__Group_4__1__Impl1737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_4__2__Impl_in_rule__Machine__Group_4__21767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__RefinesAssignment_4_2_in_rule__Machine__Group_4__2__Impl1794 = new BitSet(new long[]{0x0000000000000032L});
        public static final BitSet FOLLOW_rule__Machine__Group_5__0__Impl_in_rule__Machine__Group_5__01831 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Machine__Group_5__1_in_rule__Machine__Group_5__01834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Machine__Group_5__0__Impl1862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_5__1__Impl_in_rule__Machine__Group_5__11893 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Machine__Group_5__2_in_rule__Machine__Group_5__11896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__SeesAssignment_5_1_in_rule__Machine__Group_5__1__Impl1923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_5__2__Impl_in_rule__Machine__Group_5__21953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__SeesAssignment_5_2_in_rule__Machine__Group_5__2__Impl1980 = new BitSet(new long[]{0x0000000000000032L});
        public static final BitSet FOLLOW_rule__Machine__Group_6__0__Impl_in_rule__Machine__Group_6__02017 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Machine__Group_6__1_in_rule__Machine__Group_6__02020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Machine__Group_6__0__Impl2048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_6__1__Impl_in_rule__Machine__Group_6__12079 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Machine__Group_6__2_in_rule__Machine__Group_6__12082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__VariablesAssignment_6_1_in_rule__Machine__Group_6__1__Impl2109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_6__2__Impl_in_rule__Machine__Group_6__22139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__VariablesAssignment_6_2_in_rule__Machine__Group_6__2__Impl2166 = new BitSet(new long[]{0x0000000000000032L});
        public static final BitSet FOLLOW_rule__Machine__Group_7__0__Impl_in_rule__Machine__Group_7__02203 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Machine__Group_7__1_in_rule__Machine__Group_7__02206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Machine__Group_7__0__Impl2234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_7__1__Impl_in_rule__Machine__Group_7__12265 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Machine__Group_7__2_in_rule__Machine__Group_7__12268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__InvariantsAssignment_7_1_in_rule__Machine__Group_7__1__Impl2295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_7__2__Impl_in_rule__Machine__Group_7__22325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__InvariantsAssignment_7_2_in_rule__Machine__Group_7__2__Impl2352 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_rule__Machine__Group_8__0__Impl_in_rule__Machine__Group_8__02389 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Machine__Group_8__1_in_rule__Machine__Group_8__02392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Machine__Group_8__0__Impl2420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_8__1__Impl_in_rule__Machine__Group_8__12451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__VariantAssignment_8_1_in_rule__Machine__Group_8__1__Impl2478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_9__0__Impl_in_rule__Machine__Group_9__02512 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Machine__Group_9__1_in_rule__Machine__Group_9__02515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Machine__Group_9__0__Impl2543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_9__1__Impl_in_rule__Machine__Group_9__12574 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Machine__Group_9__2_in_rule__Machine__Group_9__12577 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__EventsAssignment_9_1_in_rule__Machine__Group_9__1__Impl2604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_9__2__Impl_in_rule__Machine__Group_9__22634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__EventsAssignment_9_2_in_rule__Machine__Group_9__2__Impl2661 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__02698 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__02701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__12759 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Variable__Group__2_in_rule__Variable__Group__12762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__NameAssignment_1_in_rule__Variable__Group__1__Impl2789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group__2__Impl_in_rule__Variable__Group__22819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group_2__0_in_rule__Variable__Group__2__Impl2846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group_2__0__Impl_in_rule__Variable__Group_2__02883 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Variable__Group_2__1_in_rule__Variable__Group_2__02886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Variable__Group_2__0__Impl2914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group_2__1__Impl_in_rule__Variable__Group_2__12945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__CommentAssignment_2_1_in_rule__Variable__Group_2__1__Impl2972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group__0__Impl_in_rule__Invariant__Group__03006 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Invariant__Group__1_in_rule__Invariant__Group__03009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Invariant__Group__0__Impl3037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group__1__Impl_in_rule__Invariant__Group__13068 = new BitSet(new long[]{0x0000000200010030L});
        public static final BitSet FOLLOW_rule__Invariant__Group__2_in_rule__Invariant__Group__13071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__NameAssignment_1_in_rule__Invariant__Group__1__Impl3098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group__2__Impl_in_rule__Invariant__Group__23128 = new BitSet(new long[]{0x0000000200010030L});
        public static final BitSet FOLLOW_rule__Invariant__Group__3_in_rule__Invariant__Group__23131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__PredicateAssignment_2_in_rule__Invariant__Group__2__Impl3158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group__3__Impl_in_rule__Invariant__Group__33189 = new BitSet(new long[]{0x0000000200010030L});
        public static final BitSet FOLLOW_rule__Invariant__Group__4_in_rule__Invariant__Group__33192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__TheoremAssignment_3_in_rule__Invariant__Group__3__Impl3219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group__4__Impl_in_rule__Invariant__Group__43250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group_4__0_in_rule__Invariant__Group__4__Impl3277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group_4__0__Impl_in_rule__Invariant__Group_4__03318 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Invariant__Group_4__1_in_rule__Invariant__Group_4__03321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Invariant__Group_4__0__Impl3349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group_4__1__Impl_in_rule__Invariant__Group_4__13380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__CommentAssignment_4_1_in_rule__Invariant__Group_4__1__Impl3407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variant__Group__0__Impl_in_rule__Variant__Group__03441 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Variant__Group__1_in_rule__Variant__Group__03444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Variant__Group__0__Impl3472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variant__Group__1__Impl_in_rule__Variant__Group__13503 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_rule__Variant__Group__2_in_rule__Variant__Group__13506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Variant__Group__1__Impl3534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variant__Group__2__Impl_in_rule__Variant__Group__23565 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_rule__Variant__Group__3_in_rule__Variant__Group__23568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variant__ExpressionAssignment_2_in_rule__Variant__Group__2__Impl3595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variant__Group__3__Impl_in_rule__Variant__Group__33626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variant__Group_3__0_in_rule__Variant__Group__3__Impl3653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variant__Group_3__0__Impl_in_rule__Variant__Group_3__03692 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Variant__Group_3__1_in_rule__Variant__Group_3__03695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Variant__Group_3__0__Impl3723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variant__Group_3__1__Impl_in_rule__Variant__Group_3__13754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variant__CommentAssignment_3_1_in_rule__Variant__Group_3__1__Impl3781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__03815 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Event__Group__1_in_rule__Event__Group__03818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__13876 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Event__Group__2_in_rule__Event__Group__13879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Event__Group__1__Impl3907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group__2__Impl_in_rule__Event__Group__23938 = new BitSet(new long[]{0x00000005B003B800L});
        public static final BitSet FOLLOW_rule__Event__Group__3_in_rule__Event__Group__23941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__NameAssignment_2_in_rule__Event__Group__2__Impl3968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group__3__Impl_in_rule__Event__Group__33998 = new BitSet(new long[]{0x00000005B003B800L});
        public static final BitSet FOLLOW_rule__Event__Group__4_in_rule__Event__Group__34001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__ExtendedAssignment_3_in_rule__Event__Group__3__Impl4028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group__4__Impl_in_rule__Event__Group__44059 = new BitSet(new long[]{0x00000005B003B800L});
        public static final BitSet FOLLOW_rule__Event__Group__5_in_rule__Event__Group__44062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__ConvergenceAssignment_4_in_rule__Event__Group__4__Impl4089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group__5__Impl_in_rule__Event__Group__54120 = new BitSet(new long[]{0x00000005B003B800L});
        public static final BitSet FOLLOW_rule__Event__Group__6_in_rule__Event__Group__54123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_5__0_in_rule__Event__Group__5__Impl4150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group__6__Impl_in_rule__Event__Group__64181 = new BitSet(new long[]{0x00000005B003B800L});
        public static final BitSet FOLLOW_rule__Event__Group__7_in_rule__Event__Group__64184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_6__0_in_rule__Event__Group__6__Impl4211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group__7__Impl_in_rule__Event__Group__74242 = new BitSet(new long[]{0x00000005B003B800L});
        public static final BitSet FOLLOW_rule__Event__Group__8_in_rule__Event__Group__74245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_7__0_in_rule__Event__Group__7__Impl4272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group__8__Impl_in_rule__Event__Group__84303 = new BitSet(new long[]{0x00000005B003B800L});
        public static final BitSet FOLLOW_rule__Event__Group__9_in_rule__Event__Group__84306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_8__0_in_rule__Event__Group__8__Impl4333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group__9__Impl_in_rule__Event__Group__94364 = new BitSet(new long[]{0x00000005B003B800L});
        public static final BitSet FOLLOW_rule__Event__Group__10_in_rule__Event__Group__94367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_9__0_in_rule__Event__Group__9__Impl4394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group__10__Impl_in_rule__Event__Group__104425 = new BitSet(new long[]{0x00000005B003B800L});
        public static final BitSet FOLLOW_rule__Event__Group__11_in_rule__Event__Group__104428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_10__0_in_rule__Event__Group__10__Impl4455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group__11__Impl_in_rule__Event__Group__114486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Event__Group__11__Impl4514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_5__0__Impl_in_rule__Event__Group_5__04569 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Event__Group_5__1_in_rule__Event__Group_5__04572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Event__Group_5__0__Impl4600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_5__1__Impl_in_rule__Event__Group_5__14631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__CommentAssignment_5_1_in_rule__Event__Group_5__1__Impl4658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_6__0__Impl_in_rule__Event__Group_6__04692 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Event__Group_6__1_in_rule__Event__Group_6__04695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Event__Group_6__0__Impl4723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_6__1__Impl_in_rule__Event__Group_6__14754 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Event__Group_6__2_in_rule__Event__Group_6__14757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__RefinesAssignment_6_1_in_rule__Event__Group_6__1__Impl4784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_6__2__Impl_in_rule__Event__Group_6__24814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_6_2__0_in_rule__Event__Group_6__2__Impl4841 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__Event__Group_6_2__0__Impl_in_rule__Event__Group_6_2__04878 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Event__Group_6_2__1_in_rule__Event__Group_6_2__04881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Event__Group_6_2__0__Impl4909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_6_2__1__Impl_in_rule__Event__Group_6_2__14940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__RefinesAssignment_6_2_1_in_rule__Event__Group_6_2__1__Impl4967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_7__0__Impl_in_rule__Event__Group_7__05001 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Event__Group_7__1_in_rule__Event__Group_7__05004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Event__Group_7__0__Impl5032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_7__1__Impl_in_rule__Event__Group_7__15063 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Event__Group_7__2_in_rule__Event__Group_7__15066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__GuardsAssignment_7_1_in_rule__Event__Group_7__1__Impl5093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_7__2__Impl_in_rule__Event__Group_7__25123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__GuardsAssignment_7_2_in_rule__Event__Group_7__2__Impl5150 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_rule__Event__Group_8__0__Impl_in_rule__Event__Group_8__05187 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Event__Group_8__1_in_rule__Event__Group_8__05190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Event__Group_8__0__Impl5218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_8__1__Impl_in_rule__Event__Group_8__15249 = new BitSet(new long[]{0x0000000040000030L});
        public static final BitSet FOLLOW_rule__Event__Group_8__2_in_rule__Event__Group_8__15252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__ParametersAssignment_8_1_in_rule__Event__Group_8__1__Impl5279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_8__2__Impl_in_rule__Event__Group_8__25309 = new BitSet(new long[]{0x0000000040000030L});
        public static final BitSet FOLLOW_rule__Event__Group_8__3_in_rule__Event__Group_8__25312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__ParametersAssignment_8_2_in_rule__Event__Group_8__2__Impl5339 = new BitSet(new long[]{0x0000000000000032L});
        public static final BitSet FOLLOW_rule__Event__Group_8__3__Impl_in_rule__Event__Group_8__35370 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Event__Group_8__4_in_rule__Event__Group_8__35373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Event__Group_8__3__Impl5401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_8__4__Impl_in_rule__Event__Group_8__45432 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Event__Group_8__5_in_rule__Event__Group_8__45435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__GuardsAssignment_8_4_in_rule__Event__Group_8__4__Impl5462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_8__5__Impl_in_rule__Event__Group_8__55492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__GuardsAssignment_8_5_in_rule__Event__Group_8__5__Impl5519 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_rule__Event__Group_9__0__Impl_in_rule__Event__Group_9__05562 = new BitSet(new long[]{0x0000000800800000L});
        public static final BitSet FOLLOW_rule__Event__Group_9__1_in_rule__Event__Group_9__05565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Event__Group_9__0__Impl5593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_9__1__Impl_in_rule__Event__Group_9__15624 = new BitSet(new long[]{0x0000000800800000L});
        public static final BitSet FOLLOW_rule__Event__Group_9__2_in_rule__Event__Group_9__15627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__WitnessesAssignment_9_1_in_rule__Event__Group_9__1__Impl5654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_9__2__Impl_in_rule__Event__Group_9__25684 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__WitnessesAssignment_9_2_in_rule__Event__Group_9__2__Impl5711 = new BitSet(new long[]{0x0000000800800002L});
        public static final BitSet FOLLOW_rule__Event__Group_10__0__Impl_in_rule__Event__Group_10__05748 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Event__Group_10__1_in_rule__Event__Group_10__05751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Event__Group_10__0__Impl5779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_10__1__Impl_in_rule__Event__Group_10__15810 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Event__Group_10__2_in_rule__Event__Group_10__15813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__ActionsAssignment_10_1_in_rule__Event__Group_10__1__Impl5840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_10__2__Impl_in_rule__Event__Group_10__25870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__ActionsAssignment_10_2_in_rule__Event__Group_10__2__Impl5897 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__05934 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__05937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__15995 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__15998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__NameAssignment_1_in_rule__Parameter__Group__1__Impl6025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__26055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_2__0_in_rule__Parameter__Group__2__Impl6082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_2__0__Impl_in_rule__Parameter__Group_2__06119 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Parameter__Group_2__1_in_rule__Parameter__Group_2__06122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Parameter__Group_2__0__Impl6150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_2__1__Impl_in_rule__Parameter__Group_2__16181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__CommentAssignment_2_1_in_rule__Parameter__Group_2__1__Impl6208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guard__Group__0__Impl_in_rule__Guard__Group__06242 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Guard__Group__1_in_rule__Guard__Group__06245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Guard__Group__0__Impl6273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guard__Group__1__Impl_in_rule__Guard__Group__16304 = new BitSet(new long[]{0x0000000200010030L});
        public static final BitSet FOLLOW_rule__Guard__Group__2_in_rule__Guard__Group__16307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guard__NameAssignment_1_in_rule__Guard__Group__1__Impl6334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guard__Group__2__Impl_in_rule__Guard__Group__26364 = new BitSet(new long[]{0x0000000200010030L});
        public static final BitSet FOLLOW_rule__Guard__Group__3_in_rule__Guard__Group__26367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guard__PredicateAssignment_2_in_rule__Guard__Group__2__Impl6394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guard__Group__3__Impl_in_rule__Guard__Group__36425 = new BitSet(new long[]{0x0000000200010030L});
        public static final BitSet FOLLOW_rule__Guard__Group__4_in_rule__Guard__Group__36428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guard__TheoremAssignment_3_in_rule__Guard__Group__3__Impl6455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guard__Group__4__Impl_in_rule__Guard__Group__46486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guard__Group_4__0_in_rule__Guard__Group__4__Impl6513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guard__Group_4__0__Impl_in_rule__Guard__Group_4__06554 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Guard__Group_4__1_in_rule__Guard__Group_4__06557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Guard__Group_4__0__Impl6585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guard__Group_4__1__Impl_in_rule__Guard__Group_4__16616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guard__CommentAssignment_4_1_in_rule__Guard__Group_4__1__Impl6643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Witness__Group__0__Impl_in_rule__Witness__Group__06677 = new BitSet(new long[]{0x0000000800800000L});
        public static final BitSet FOLLOW_rule__Witness__Group__1_in_rule__Witness__Group__06680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Witness__LocalGeneratedAssignment_0_in_rule__Witness__Group__0__Impl6707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Witness__Group__1__Impl_in_rule__Witness__Group__16738 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Witness__Group__2_in_rule__Witness__Group__16741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Witness__Group__1__Impl6769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Witness__Group__2__Impl_in_rule__Witness__Group__26800 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_rule__Witness__Group__3_in_rule__Witness__Group__26803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Witness__NameAssignment_2_in_rule__Witness__Group__2__Impl6830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Witness__Group__3__Impl_in_rule__Witness__Group__36860 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_rule__Witness__Group__4_in_rule__Witness__Group__36863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Witness__PredicateAssignment_3_in_rule__Witness__Group__3__Impl6890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Witness__Group__4__Impl_in_rule__Witness__Group__46921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Witness__Group_4__0_in_rule__Witness__Group__4__Impl6948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Witness__Group_4__0__Impl_in_rule__Witness__Group_4__06989 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Witness__Group_4__1_in_rule__Witness__Group_4__06992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Witness__Group_4__0__Impl7020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Witness__Group_4__1__Impl_in_rule__Witness__Group_4__17051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Witness__CommentAssignment_4_1_in_rule__Witness__Group_4__1__Impl7078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group__0__Impl_in_rule__Action__Group__07112 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Action__Group__1_in_rule__Action__Group__07115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Action__Group__0__Impl7143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group__1__Impl_in_rule__Action__Group__17174 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_rule__Action__Group__2_in_rule__Action__Group__17177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__NameAssignment_1_in_rule__Action__Group__1__Impl7204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group__2__Impl_in_rule__Action__Group__27234 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_rule__Action__Group__3_in_rule__Action__Group__27237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__ActionAssignment_2_in_rule__Action__Group__2__Impl7264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group__3__Impl_in_rule__Action__Group__37295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group_3__0_in_rule__Action__Group__3__Impl7322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group_3__0__Impl_in_rule__Action__Group_3__07361 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Action__Group_3__1_in_rule__Action__Group_3__07364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Action__Group_3__0__Impl7392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group_3__1__Impl_in_rule__Action__Group_3__17423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__CommentAssignment_3_1_in_rule__Action__Group_3__1__Impl7450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Machine__NameAssignment_27489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Machine__CommentAssignment_3_17520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Machine__RefinesAssignment_4_17555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Machine__RefinesAssignment_4_27594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Machine__SeesAssignment_5_17633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Machine__SeesAssignment_5_27672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_rule__Machine__VariablesAssignment_6_17707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_rule__Machine__VariablesAssignment_6_27738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvariant_in_rule__Machine__InvariantsAssignment_7_17769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvariant_in_rule__Machine__InvariantsAssignment_7_27800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariant_in_rule__Machine__VariantAssignment_8_17831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleevent_in_rule__Machine__EventsAssignment_9_17862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleevent_in_rule__Machine__EventsAssignment_9_27893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Variable__NameAssignment_17924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Variable__CommentAssignment_2_17955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Invariant__NameAssignment_17986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Invariant__PredicateAssignment_28017 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Invariant__TheoremAssignment_38053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Invariant__CommentAssignment_4_18092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Variant__ExpressionAssignment_28123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Variant__CommentAssignment_3_18154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Event__NameAssignment_28185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Event__ExtendedAssignment_38221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConvergence_in_rule__Event__ConvergenceAssignment_48260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Event__CommentAssignment_5_18291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Event__RefinesAssignment_6_18326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Event__RefinesAssignment_6_2_18365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGuard_in_rule__Event__GuardsAssignment_7_18400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGuard_in_rule__Event__GuardsAssignment_7_28431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter_in_rule__Event__ParametersAssignment_8_18462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter_in_rule__Event__ParametersAssignment_8_28493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGuard_in_rule__Event__GuardsAssignment_8_48524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGuard_in_rule__Event__GuardsAssignment_8_58555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWitness_in_rule__Event__WitnessesAssignment_9_18586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWitness_in_rule__Event__WitnessesAssignment_9_28617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAction_in_rule__Event__ActionsAssignment_10_18648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAction_in_rule__Event__ActionsAssignment_10_28679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Parameter__NameAssignment_18710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Parameter__CommentAssignment_2_18741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Guard__NameAssignment_18772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Guard__PredicateAssignment_28803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Guard__TheoremAssignment_38839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Guard__CommentAssignment_4_18878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Witness__LocalGeneratedAssignment_08914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Witness__NameAssignment_28953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Witness__PredicateAssignment_38984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Witness__CommentAssignment_4_19015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Action__NameAssignment_19046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Action__ActionAssignment_29077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Action__CommentAssignment_3_19108 = new BitSet(new long[]{0x0000000000000002L});
    }


}