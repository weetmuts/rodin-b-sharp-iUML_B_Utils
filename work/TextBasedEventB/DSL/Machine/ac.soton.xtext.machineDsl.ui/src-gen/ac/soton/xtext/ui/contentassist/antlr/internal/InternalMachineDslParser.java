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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:230:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:231:1: ( ruleParameter EOF )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:232:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParameter_in_entryRuleParameter423);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameter430); 

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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:239:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:243:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:244:1: ( ( rule__Parameter__Group__0 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:244:1: ( ( rule__Parameter__Group__0 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:245:1: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:246:1: ( rule__Parameter__Group__0 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:246:2: rule__Parameter__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__0_in_ruleParameter456);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:258:1: entryRuleGuard : ruleGuard EOF ;
    public final void entryRuleGuard() throws RecognitionException {
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:259:1: ( ruleGuard EOF )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:260:1: ruleGuard EOF
            {
             before(grammarAccess.getGuardRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGuard_in_entryRuleGuard483);
            ruleGuard();

            state._fsp--;

             after(grammarAccess.getGuardRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGuard490); 

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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:267:1: ruleGuard : ( ( rule__Guard__Group__0 ) ) ;
    public final void ruleGuard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:271:2: ( ( ( rule__Guard__Group__0 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:272:1: ( ( rule__Guard__Group__0 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:272:1: ( ( rule__Guard__Group__0 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:273:1: ( rule__Guard__Group__0 )
            {
             before(grammarAccess.getGuardAccess().getGroup()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:274:1: ( rule__Guard__Group__0 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:274:2: rule__Guard__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group__0_in_ruleGuard516);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:286:1: entryRuleWitness : ruleWitness EOF ;
    public final void entryRuleWitness() throws RecognitionException {
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:287:1: ( ruleWitness EOF )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:288:1: ruleWitness EOF
            {
             before(grammarAccess.getWitnessRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWitness_in_entryRuleWitness543);
            ruleWitness();

            state._fsp--;

             after(grammarAccess.getWitnessRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWitness550); 

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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:295:1: ruleWitness : ( ( rule__Witness__Group__0 ) ) ;
    public final void ruleWitness() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:299:2: ( ( ( rule__Witness__Group__0 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:300:1: ( ( rule__Witness__Group__0 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:300:1: ( ( rule__Witness__Group__0 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:301:1: ( rule__Witness__Group__0 )
            {
             before(grammarAccess.getWitnessAccess().getGroup()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:302:1: ( rule__Witness__Group__0 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:302:2: rule__Witness__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Witness__Group__0_in_ruleWitness576);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:314:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:315:1: ( ruleAction EOF )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:316:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAction_in_entryRuleAction603);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAction610); 

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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:323:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:327:2: ( ( ( rule__Action__Group__0 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:328:1: ( ( rule__Action__Group__0 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:328:1: ( ( rule__Action__Group__0 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:329:1: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:330:1: ( rule__Action__Group__0 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:330:2: rule__Action__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__0_in_ruleAction636);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:343:1: ruleConvergence : ( ( rule__Convergence__Alternatives ) ) ;
    public final void ruleConvergence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:347:1: ( ( ( rule__Convergence__Alternatives ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:348:1: ( ( rule__Convergence__Alternatives ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:348:1: ( ( rule__Convergence__Alternatives ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:349:1: ( rule__Convergence__Alternatives )
            {
             before(grammarAccess.getConvergenceAccess().getAlternatives()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:350:1: ( rule__Convergence__Alternatives )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:350:2: rule__Convergence__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Convergence__Alternatives_in_ruleConvergence673);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:361:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:365:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:366:1: ( RULE_STRING )
                    {
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:366:1: ( RULE_STRING )
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:367:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives708); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:372:6: ( RULE_ID )
                    {
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:372:6: ( RULE_ID )
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:373:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives725); 
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:383:1: rule__Convergence__Alternatives : ( ( ( 'ordinary' ) ) | ( ( 'convergent' ) ) | ( ( 'anticipated' ) ) );
    public final void rule__Convergence__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:387:1: ( ( ( 'ordinary' ) ) | ( ( 'convergent' ) ) | ( ( 'anticipated' ) ) )
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
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:388:1: ( ( 'ordinary' ) )
                    {
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:388:1: ( ( 'ordinary' ) )
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:389:1: ( 'ordinary' )
                    {
                     before(grammarAccess.getConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0()); 
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:390:1: ( 'ordinary' )
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:390:3: 'ordinary'
                    {
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__Convergence__Alternatives758); 

                    }

                     after(grammarAccess.getConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:395:6: ( ( 'convergent' ) )
                    {
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:395:6: ( ( 'convergent' ) )
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:396:1: ( 'convergent' )
                    {
                     before(grammarAccess.getConvergenceAccess().getConvergentEnumLiteralDeclaration_1()); 
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:397:1: ( 'convergent' )
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:397:3: 'convergent'
                    {
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__Convergence__Alternatives779); 

                    }

                     after(grammarAccess.getConvergenceAccess().getConvergentEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:402:6: ( ( 'anticipated' ) )
                    {
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:402:6: ( ( 'anticipated' ) )
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:403:1: ( 'anticipated' )
                    {
                     before(grammarAccess.getConvergenceAccess().getAnticipatedEnumLiteralDeclaration_2()); 
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:404:1: ( 'anticipated' )
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:404:3: 'anticipated'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__Convergence__Alternatives800); 

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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:416:1: rule__Machine__Group__0 : rule__Machine__Group__0__Impl rule__Machine__Group__1 ;
    public final void rule__Machine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:420:1: ( rule__Machine__Group__0__Impl rule__Machine__Group__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:421:2: rule__Machine__Group__0__Impl rule__Machine__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__0__Impl_in_rule__Machine__Group__0833);
            rule__Machine__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__1_in_rule__Machine__Group__0836);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:428:1: rule__Machine__Group__0__Impl : ( () ) ;
    public final void rule__Machine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:432:1: ( ( () ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:433:1: ( () )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:433:1: ( () )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:434:1: ()
            {
             before(grammarAccess.getMachineAccess().getMachineAction_0()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:435:1: ()
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:437:1: 
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:447:1: rule__Machine__Group__1 : rule__Machine__Group__1__Impl rule__Machine__Group__2 ;
    public final void rule__Machine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:451:1: ( rule__Machine__Group__1__Impl rule__Machine__Group__2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:452:2: rule__Machine__Group__1__Impl rule__Machine__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__1__Impl_in_rule__Machine__Group__1894);
            rule__Machine__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__2_in_rule__Machine__Group__1897);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:459:1: rule__Machine__Group__1__Impl : ( 'machine' ) ;
    public final void rule__Machine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:463:1: ( ( 'machine' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:464:1: ( 'machine' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:464:1: ( 'machine' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:465:1: 'machine'
            {
             before(grammarAccess.getMachineAccess().getMachineKeyword_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Machine__Group__1__Impl925); 
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:478:1: rule__Machine__Group__2 : rule__Machine__Group__2__Impl rule__Machine__Group__3 ;
    public final void rule__Machine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:482:1: ( rule__Machine__Group__2__Impl rule__Machine__Group__3 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:483:2: rule__Machine__Group__2__Impl rule__Machine__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__2__Impl_in_rule__Machine__Group__2956);
            rule__Machine__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__3_in_rule__Machine__Group__2959);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:490:1: rule__Machine__Group__2__Impl : ( ( rule__Machine__NameAssignment_2 ) ) ;
    public final void rule__Machine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:494:1: ( ( ( rule__Machine__NameAssignment_2 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:495:1: ( ( rule__Machine__NameAssignment_2 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:495:1: ( ( rule__Machine__NameAssignment_2 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:496:1: ( rule__Machine__NameAssignment_2 )
            {
             before(grammarAccess.getMachineAccess().getNameAssignment_2()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:497:1: ( rule__Machine__NameAssignment_2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:497:2: rule__Machine__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__NameAssignment_2_in_rule__Machine__Group__2__Impl986);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:507:1: rule__Machine__Group__3 : rule__Machine__Group__3__Impl rule__Machine__Group__4 ;
    public final void rule__Machine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:511:1: ( rule__Machine__Group__3__Impl rule__Machine__Group__4 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:512:2: rule__Machine__Group__3__Impl rule__Machine__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__3__Impl_in_rule__Machine__Group__31016);
            rule__Machine__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__4_in_rule__Machine__Group__31019);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:519:1: rule__Machine__Group__3__Impl : ( ( rule__Machine__Group_3__0 )? ) ;
    public final void rule__Machine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:523:1: ( ( ( rule__Machine__Group_3__0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:524:1: ( ( rule__Machine__Group_3__0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:524:1: ( ( rule__Machine__Group_3__0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:525:1: ( rule__Machine__Group_3__0 )?
            {
             before(grammarAccess.getMachineAccess().getGroup_3()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:526:1: ( rule__Machine__Group_3__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:526:2: rule__Machine__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_3__0_in_rule__Machine__Group__3__Impl1046);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:536:1: rule__Machine__Group__4 : rule__Machine__Group__4__Impl rule__Machine__Group__5 ;
    public final void rule__Machine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:540:1: ( rule__Machine__Group__4__Impl rule__Machine__Group__5 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:541:2: rule__Machine__Group__4__Impl rule__Machine__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__4__Impl_in_rule__Machine__Group__41077);
            rule__Machine__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__5_in_rule__Machine__Group__41080);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:548:1: rule__Machine__Group__4__Impl : ( ( rule__Machine__Group_4__0 )? ) ;
    public final void rule__Machine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:552:1: ( ( ( rule__Machine__Group_4__0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:553:1: ( ( rule__Machine__Group_4__0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:553:1: ( ( rule__Machine__Group_4__0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:554:1: ( rule__Machine__Group_4__0 )?
            {
             before(grammarAccess.getMachineAccess().getGroup_4()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:555:1: ( rule__Machine__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:555:2: rule__Machine__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_4__0_in_rule__Machine__Group__4__Impl1107);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:565:1: rule__Machine__Group__5 : rule__Machine__Group__5__Impl rule__Machine__Group__6 ;
    public final void rule__Machine__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:569:1: ( rule__Machine__Group__5__Impl rule__Machine__Group__6 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:570:2: rule__Machine__Group__5__Impl rule__Machine__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__5__Impl_in_rule__Machine__Group__51138);
            rule__Machine__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__6_in_rule__Machine__Group__51141);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:577:1: rule__Machine__Group__5__Impl : ( ( rule__Machine__Group_5__0 )? ) ;
    public final void rule__Machine__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:581:1: ( ( ( rule__Machine__Group_5__0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:582:1: ( ( rule__Machine__Group_5__0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:582:1: ( ( rule__Machine__Group_5__0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:583:1: ( rule__Machine__Group_5__0 )?
            {
             before(grammarAccess.getMachineAccess().getGroup_5()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:584:1: ( rule__Machine__Group_5__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:584:2: rule__Machine__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_5__0_in_rule__Machine__Group__5__Impl1168);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:594:1: rule__Machine__Group__6 : rule__Machine__Group__6__Impl rule__Machine__Group__7 ;
    public final void rule__Machine__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:598:1: ( rule__Machine__Group__6__Impl rule__Machine__Group__7 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:599:2: rule__Machine__Group__6__Impl rule__Machine__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__6__Impl_in_rule__Machine__Group__61199);
            rule__Machine__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__7_in_rule__Machine__Group__61202);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:606:1: rule__Machine__Group__6__Impl : ( ( rule__Machine__Group_6__0 )? ) ;
    public final void rule__Machine__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:610:1: ( ( ( rule__Machine__Group_6__0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:611:1: ( ( rule__Machine__Group_6__0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:611:1: ( ( rule__Machine__Group_6__0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:612:1: ( rule__Machine__Group_6__0 )?
            {
             before(grammarAccess.getMachineAccess().getGroup_6()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:613:1: ( rule__Machine__Group_6__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:613:2: rule__Machine__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_6__0_in_rule__Machine__Group__6__Impl1229);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:623:1: rule__Machine__Group__7 : rule__Machine__Group__7__Impl rule__Machine__Group__8 ;
    public final void rule__Machine__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:627:1: ( rule__Machine__Group__7__Impl rule__Machine__Group__8 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:628:2: rule__Machine__Group__7__Impl rule__Machine__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__7__Impl_in_rule__Machine__Group__71260);
            rule__Machine__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__8_in_rule__Machine__Group__71263);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:635:1: rule__Machine__Group__7__Impl : ( ( rule__Machine__Group_7__0 )? ) ;
    public final void rule__Machine__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:639:1: ( ( ( rule__Machine__Group_7__0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:640:1: ( ( rule__Machine__Group_7__0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:640:1: ( ( rule__Machine__Group_7__0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:641:1: ( rule__Machine__Group_7__0 )?
            {
             before(grammarAccess.getMachineAccess().getGroup_7()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:642:1: ( rule__Machine__Group_7__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:642:2: rule__Machine__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_7__0_in_rule__Machine__Group__7__Impl1290);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:652:1: rule__Machine__Group__8 : rule__Machine__Group__8__Impl rule__Machine__Group__9 ;
    public final void rule__Machine__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:656:1: ( rule__Machine__Group__8__Impl rule__Machine__Group__9 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:657:2: rule__Machine__Group__8__Impl rule__Machine__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__8__Impl_in_rule__Machine__Group__81321);
            rule__Machine__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__9_in_rule__Machine__Group__81324);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:664:1: rule__Machine__Group__8__Impl : ( ( rule__Machine__Group_8__0 )? ) ;
    public final void rule__Machine__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:668:1: ( ( ( rule__Machine__Group_8__0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:669:1: ( ( rule__Machine__Group_8__0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:669:1: ( ( rule__Machine__Group_8__0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:670:1: ( rule__Machine__Group_8__0 )?
            {
             before(grammarAccess.getMachineAccess().getGroup_8()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:671:1: ( rule__Machine__Group_8__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:671:2: rule__Machine__Group_8__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_8__0_in_rule__Machine__Group__8__Impl1351);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:681:1: rule__Machine__Group__9 : rule__Machine__Group__9__Impl rule__Machine__Group__10 ;
    public final void rule__Machine__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:685:1: ( rule__Machine__Group__9__Impl rule__Machine__Group__10 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:686:2: rule__Machine__Group__9__Impl rule__Machine__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__9__Impl_in_rule__Machine__Group__91382);
            rule__Machine__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__10_in_rule__Machine__Group__91385);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:693:1: rule__Machine__Group__9__Impl : ( ( rule__Machine__Group_9__0 )? ) ;
    public final void rule__Machine__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:697:1: ( ( ( rule__Machine__Group_9__0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:698:1: ( ( rule__Machine__Group_9__0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:698:1: ( ( rule__Machine__Group_9__0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:699:1: ( rule__Machine__Group_9__0 )?
            {
             before(grammarAccess.getMachineAccess().getGroup_9()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:700:1: ( rule__Machine__Group_9__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:700:2: rule__Machine__Group_9__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_9__0_in_rule__Machine__Group__9__Impl1412);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:710:1: rule__Machine__Group__10 : rule__Machine__Group__10__Impl ;
    public final void rule__Machine__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:714:1: ( rule__Machine__Group__10__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:715:2: rule__Machine__Group__10__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__10__Impl_in_rule__Machine__Group__101443);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:721:1: rule__Machine__Group__10__Impl : ( 'end' ) ;
    public final void rule__Machine__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:725:1: ( ( 'end' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:726:1: ( 'end' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:726:1: ( 'end' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:727:1: 'end'
            {
             before(grammarAccess.getMachineAccess().getEndKeyword_10()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Machine__Group__10__Impl1471); 
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:762:1: rule__Machine__Group_3__0 : rule__Machine__Group_3__0__Impl rule__Machine__Group_3__1 ;
    public final void rule__Machine__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:766:1: ( rule__Machine__Group_3__0__Impl rule__Machine__Group_3__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:767:2: rule__Machine__Group_3__0__Impl rule__Machine__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_3__0__Impl_in_rule__Machine__Group_3__01524);
            rule__Machine__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_3__1_in_rule__Machine__Group_3__01527);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:774:1: rule__Machine__Group_3__0__Impl : ( '//' ) ;
    public final void rule__Machine__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:778:1: ( ( '//' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:779:1: ( '//' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:779:1: ( '//' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:780:1: '//'
            {
             before(grammarAccess.getMachineAccess().getSolidusSolidusKeyword_3_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Machine__Group_3__0__Impl1555); 
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:793:1: rule__Machine__Group_3__1 : rule__Machine__Group_3__1__Impl ;
    public final void rule__Machine__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:797:1: ( rule__Machine__Group_3__1__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:798:2: rule__Machine__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_3__1__Impl_in_rule__Machine__Group_3__11586);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:804:1: rule__Machine__Group_3__1__Impl : ( ( rule__Machine__CommentAssignment_3_1 ) ) ;
    public final void rule__Machine__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:808:1: ( ( ( rule__Machine__CommentAssignment_3_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:809:1: ( ( rule__Machine__CommentAssignment_3_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:809:1: ( ( rule__Machine__CommentAssignment_3_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:810:1: ( rule__Machine__CommentAssignment_3_1 )
            {
             before(grammarAccess.getMachineAccess().getCommentAssignment_3_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:811:1: ( rule__Machine__CommentAssignment_3_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:811:2: rule__Machine__CommentAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__CommentAssignment_3_1_in_rule__Machine__Group_3__1__Impl1613);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:825:1: rule__Machine__Group_4__0 : rule__Machine__Group_4__0__Impl rule__Machine__Group_4__1 ;
    public final void rule__Machine__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:829:1: ( rule__Machine__Group_4__0__Impl rule__Machine__Group_4__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:830:2: rule__Machine__Group_4__0__Impl rule__Machine__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_4__0__Impl_in_rule__Machine__Group_4__01647);
            rule__Machine__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_4__1_in_rule__Machine__Group_4__01650);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:837:1: rule__Machine__Group_4__0__Impl : ( 'refines' ) ;
    public final void rule__Machine__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:841:1: ( ( 'refines' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:842:1: ( 'refines' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:842:1: ( 'refines' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:843:1: 'refines'
            {
             before(grammarAccess.getMachineAccess().getRefinesKeyword_4_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Machine__Group_4__0__Impl1678); 
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:856:1: rule__Machine__Group_4__1 : rule__Machine__Group_4__1__Impl rule__Machine__Group_4__2 ;
    public final void rule__Machine__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:860:1: ( rule__Machine__Group_4__1__Impl rule__Machine__Group_4__2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:861:2: rule__Machine__Group_4__1__Impl rule__Machine__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_4__1__Impl_in_rule__Machine__Group_4__11709);
            rule__Machine__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_4__2_in_rule__Machine__Group_4__11712);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:868:1: rule__Machine__Group_4__1__Impl : ( ( rule__Machine__RefinesAssignment_4_1 ) ) ;
    public final void rule__Machine__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:872:1: ( ( ( rule__Machine__RefinesAssignment_4_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:873:1: ( ( rule__Machine__RefinesAssignment_4_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:873:1: ( ( rule__Machine__RefinesAssignment_4_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:874:1: ( rule__Machine__RefinesAssignment_4_1 )
            {
             before(grammarAccess.getMachineAccess().getRefinesAssignment_4_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:875:1: ( rule__Machine__RefinesAssignment_4_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:875:2: rule__Machine__RefinesAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__RefinesAssignment_4_1_in_rule__Machine__Group_4__1__Impl1739);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:885:1: rule__Machine__Group_4__2 : rule__Machine__Group_4__2__Impl ;
    public final void rule__Machine__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:889:1: ( rule__Machine__Group_4__2__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:890:2: rule__Machine__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_4__2__Impl_in_rule__Machine__Group_4__21769);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:896:1: rule__Machine__Group_4__2__Impl : ( ( rule__Machine__RefinesAssignment_4_2 )* ) ;
    public final void rule__Machine__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:900:1: ( ( ( rule__Machine__RefinesAssignment_4_2 )* ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:901:1: ( ( rule__Machine__RefinesAssignment_4_2 )* )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:901:1: ( ( rule__Machine__RefinesAssignment_4_2 )* )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:902:1: ( rule__Machine__RefinesAssignment_4_2 )*
            {
             before(grammarAccess.getMachineAccess().getRefinesAssignment_4_2()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:903:1: ( rule__Machine__RefinesAssignment_4_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_ID)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:903:2: rule__Machine__RefinesAssignment_4_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Machine__RefinesAssignment_4_2_in_rule__Machine__Group_4__2__Impl1796);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:919:1: rule__Machine__Group_5__0 : rule__Machine__Group_5__0__Impl rule__Machine__Group_5__1 ;
    public final void rule__Machine__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:923:1: ( rule__Machine__Group_5__0__Impl rule__Machine__Group_5__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:924:2: rule__Machine__Group_5__0__Impl rule__Machine__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_5__0__Impl_in_rule__Machine__Group_5__01833);
            rule__Machine__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_5__1_in_rule__Machine__Group_5__01836);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:931:1: rule__Machine__Group_5__0__Impl : ( 'sees' ) ;
    public final void rule__Machine__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:935:1: ( ( 'sees' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:936:1: ( 'sees' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:936:1: ( 'sees' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:937:1: 'sees'
            {
             before(grammarAccess.getMachineAccess().getSeesKeyword_5_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Machine__Group_5__0__Impl1864); 
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:950:1: rule__Machine__Group_5__1 : rule__Machine__Group_5__1__Impl rule__Machine__Group_5__2 ;
    public final void rule__Machine__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:954:1: ( rule__Machine__Group_5__1__Impl rule__Machine__Group_5__2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:955:2: rule__Machine__Group_5__1__Impl rule__Machine__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_5__1__Impl_in_rule__Machine__Group_5__11895);
            rule__Machine__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_5__2_in_rule__Machine__Group_5__11898);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:962:1: rule__Machine__Group_5__1__Impl : ( ( rule__Machine__SeesAssignment_5_1 ) ) ;
    public final void rule__Machine__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:966:1: ( ( ( rule__Machine__SeesAssignment_5_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:967:1: ( ( rule__Machine__SeesAssignment_5_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:967:1: ( ( rule__Machine__SeesAssignment_5_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:968:1: ( rule__Machine__SeesAssignment_5_1 )
            {
             before(grammarAccess.getMachineAccess().getSeesAssignment_5_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:969:1: ( rule__Machine__SeesAssignment_5_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:969:2: rule__Machine__SeesAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__SeesAssignment_5_1_in_rule__Machine__Group_5__1__Impl1925);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:979:1: rule__Machine__Group_5__2 : rule__Machine__Group_5__2__Impl ;
    public final void rule__Machine__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:983:1: ( rule__Machine__Group_5__2__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:984:2: rule__Machine__Group_5__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_5__2__Impl_in_rule__Machine__Group_5__21955);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:990:1: rule__Machine__Group_5__2__Impl : ( ( rule__Machine__SeesAssignment_5_2 )* ) ;
    public final void rule__Machine__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:994:1: ( ( ( rule__Machine__SeesAssignment_5_2 )* ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:995:1: ( ( rule__Machine__SeesAssignment_5_2 )* )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:995:1: ( ( rule__Machine__SeesAssignment_5_2 )* )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:996:1: ( rule__Machine__SeesAssignment_5_2 )*
            {
             before(grammarAccess.getMachineAccess().getSeesAssignment_5_2()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:997:1: ( rule__Machine__SeesAssignment_5_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_ID)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:997:2: rule__Machine__SeesAssignment_5_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Machine__SeesAssignment_5_2_in_rule__Machine__Group_5__2__Impl1982);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1013:1: rule__Machine__Group_6__0 : rule__Machine__Group_6__0__Impl rule__Machine__Group_6__1 ;
    public final void rule__Machine__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1017:1: ( rule__Machine__Group_6__0__Impl rule__Machine__Group_6__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1018:2: rule__Machine__Group_6__0__Impl rule__Machine__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_6__0__Impl_in_rule__Machine__Group_6__02019);
            rule__Machine__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_6__1_in_rule__Machine__Group_6__02022);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1025:1: rule__Machine__Group_6__0__Impl : ( 'variables' ) ;
    public final void rule__Machine__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1029:1: ( ( 'variables' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1030:1: ( 'variables' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1030:1: ( 'variables' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1031:1: 'variables'
            {
             before(grammarAccess.getMachineAccess().getVariablesKeyword_6_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Machine__Group_6__0__Impl2050); 
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1044:1: rule__Machine__Group_6__1 : rule__Machine__Group_6__1__Impl rule__Machine__Group_6__2 ;
    public final void rule__Machine__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1048:1: ( rule__Machine__Group_6__1__Impl rule__Machine__Group_6__2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1049:2: rule__Machine__Group_6__1__Impl rule__Machine__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_6__1__Impl_in_rule__Machine__Group_6__12081);
            rule__Machine__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_6__2_in_rule__Machine__Group_6__12084);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1056:1: rule__Machine__Group_6__1__Impl : ( ( rule__Machine__VariablesAssignment_6_1 ) ) ;
    public final void rule__Machine__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1060:1: ( ( ( rule__Machine__VariablesAssignment_6_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1061:1: ( ( rule__Machine__VariablesAssignment_6_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1061:1: ( ( rule__Machine__VariablesAssignment_6_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1062:1: ( rule__Machine__VariablesAssignment_6_1 )
            {
             before(grammarAccess.getMachineAccess().getVariablesAssignment_6_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1063:1: ( rule__Machine__VariablesAssignment_6_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1063:2: rule__Machine__VariablesAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__VariablesAssignment_6_1_in_rule__Machine__Group_6__1__Impl2111);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1073:1: rule__Machine__Group_6__2 : rule__Machine__Group_6__2__Impl ;
    public final void rule__Machine__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1077:1: ( rule__Machine__Group_6__2__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1078:2: rule__Machine__Group_6__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_6__2__Impl_in_rule__Machine__Group_6__22141);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1084:1: rule__Machine__Group_6__2__Impl : ( ( rule__Machine__VariablesAssignment_6_2 )* ) ;
    public final void rule__Machine__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1088:1: ( ( ( rule__Machine__VariablesAssignment_6_2 )* ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1089:1: ( ( rule__Machine__VariablesAssignment_6_2 )* )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1089:1: ( ( rule__Machine__VariablesAssignment_6_2 )* )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1090:1: ( rule__Machine__VariablesAssignment_6_2 )*
            {
             before(grammarAccess.getMachineAccess().getVariablesAssignment_6_2()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1091:1: ( rule__Machine__VariablesAssignment_6_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_ID)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1091:2: rule__Machine__VariablesAssignment_6_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Machine__VariablesAssignment_6_2_in_rule__Machine__Group_6__2__Impl2168);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1107:1: rule__Machine__Group_7__0 : rule__Machine__Group_7__0__Impl rule__Machine__Group_7__1 ;
    public final void rule__Machine__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1111:1: ( rule__Machine__Group_7__0__Impl rule__Machine__Group_7__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1112:2: rule__Machine__Group_7__0__Impl rule__Machine__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_7__0__Impl_in_rule__Machine__Group_7__02205);
            rule__Machine__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_7__1_in_rule__Machine__Group_7__02208);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1119:1: rule__Machine__Group_7__0__Impl : ( 'invariants' ) ;
    public final void rule__Machine__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1123:1: ( ( 'invariants' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1124:1: ( 'invariants' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1124:1: ( 'invariants' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1125:1: 'invariants'
            {
             before(grammarAccess.getMachineAccess().getInvariantsKeyword_7_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Machine__Group_7__0__Impl2236); 
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1138:1: rule__Machine__Group_7__1 : rule__Machine__Group_7__1__Impl rule__Machine__Group_7__2 ;
    public final void rule__Machine__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1142:1: ( rule__Machine__Group_7__1__Impl rule__Machine__Group_7__2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1143:2: rule__Machine__Group_7__1__Impl rule__Machine__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_7__1__Impl_in_rule__Machine__Group_7__12267);
            rule__Machine__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_7__2_in_rule__Machine__Group_7__12270);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1150:1: rule__Machine__Group_7__1__Impl : ( ( rule__Machine__InvariantsAssignment_7_1 ) ) ;
    public final void rule__Machine__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1154:1: ( ( ( rule__Machine__InvariantsAssignment_7_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1155:1: ( ( rule__Machine__InvariantsAssignment_7_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1155:1: ( ( rule__Machine__InvariantsAssignment_7_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1156:1: ( rule__Machine__InvariantsAssignment_7_1 )
            {
             before(grammarAccess.getMachineAccess().getInvariantsAssignment_7_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1157:1: ( rule__Machine__InvariantsAssignment_7_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1157:2: rule__Machine__InvariantsAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__InvariantsAssignment_7_1_in_rule__Machine__Group_7__1__Impl2297);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1167:1: rule__Machine__Group_7__2 : rule__Machine__Group_7__2__Impl ;
    public final void rule__Machine__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1171:1: ( rule__Machine__Group_7__2__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1172:2: rule__Machine__Group_7__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_7__2__Impl_in_rule__Machine__Group_7__22327);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1178:1: rule__Machine__Group_7__2__Impl : ( ( rule__Machine__InvariantsAssignment_7_2 )* ) ;
    public final void rule__Machine__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1182:1: ( ( ( rule__Machine__InvariantsAssignment_7_2 )* ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1183:1: ( ( rule__Machine__InvariantsAssignment_7_2 )* )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1183:1: ( ( rule__Machine__InvariantsAssignment_7_2 )* )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1184:1: ( rule__Machine__InvariantsAssignment_7_2 )*
            {
             before(grammarAccess.getMachineAccess().getInvariantsAssignment_7_2()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1185:1: ( rule__Machine__InvariantsAssignment_7_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==23) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1185:2: rule__Machine__InvariantsAssignment_7_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Machine__InvariantsAssignment_7_2_in_rule__Machine__Group_7__2__Impl2354);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1201:1: rule__Machine__Group_8__0 : rule__Machine__Group_8__0__Impl rule__Machine__Group_8__1 ;
    public final void rule__Machine__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1205:1: ( rule__Machine__Group_8__0__Impl rule__Machine__Group_8__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1206:2: rule__Machine__Group_8__0__Impl rule__Machine__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_8__0__Impl_in_rule__Machine__Group_8__02391);
            rule__Machine__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_8__1_in_rule__Machine__Group_8__02394);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1213:1: rule__Machine__Group_8__0__Impl : ( 'variant' ) ;
    public final void rule__Machine__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1217:1: ( ( 'variant' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1218:1: ( 'variant' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1218:1: ( 'variant' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1219:1: 'variant'
            {
             before(grammarAccess.getMachineAccess().getVariantKeyword_8_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Machine__Group_8__0__Impl2422); 
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1232:1: rule__Machine__Group_8__1 : rule__Machine__Group_8__1__Impl ;
    public final void rule__Machine__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1236:1: ( rule__Machine__Group_8__1__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1237:2: rule__Machine__Group_8__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_8__1__Impl_in_rule__Machine__Group_8__12453);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1243:1: rule__Machine__Group_8__1__Impl : ( ( rule__Machine__VariantAssignment_8_1 ) ) ;
    public final void rule__Machine__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1247:1: ( ( ( rule__Machine__VariantAssignment_8_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1248:1: ( ( rule__Machine__VariantAssignment_8_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1248:1: ( ( rule__Machine__VariantAssignment_8_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1249:1: ( rule__Machine__VariantAssignment_8_1 )
            {
             before(grammarAccess.getMachineAccess().getVariantAssignment_8_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1250:1: ( rule__Machine__VariantAssignment_8_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1250:2: rule__Machine__VariantAssignment_8_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__VariantAssignment_8_1_in_rule__Machine__Group_8__1__Impl2480);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1264:1: rule__Machine__Group_9__0 : rule__Machine__Group_9__0__Impl rule__Machine__Group_9__1 ;
    public final void rule__Machine__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1268:1: ( rule__Machine__Group_9__0__Impl rule__Machine__Group_9__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1269:2: rule__Machine__Group_9__0__Impl rule__Machine__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_9__0__Impl_in_rule__Machine__Group_9__02514);
            rule__Machine__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_9__1_in_rule__Machine__Group_9__02517);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1276:1: rule__Machine__Group_9__0__Impl : ( 'events' ) ;
    public final void rule__Machine__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1280:1: ( ( 'events' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1281:1: ( 'events' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1281:1: ( 'events' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1282:1: 'events'
            {
             before(grammarAccess.getMachineAccess().getEventsKeyword_9_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Machine__Group_9__0__Impl2545); 
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1295:1: rule__Machine__Group_9__1 : rule__Machine__Group_9__1__Impl rule__Machine__Group_9__2 ;
    public final void rule__Machine__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1299:1: ( rule__Machine__Group_9__1__Impl rule__Machine__Group_9__2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1300:2: rule__Machine__Group_9__1__Impl rule__Machine__Group_9__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_9__1__Impl_in_rule__Machine__Group_9__12576);
            rule__Machine__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_9__2_in_rule__Machine__Group_9__12579);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1307:1: rule__Machine__Group_9__1__Impl : ( ( rule__Machine__EventsAssignment_9_1 ) ) ;
    public final void rule__Machine__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1311:1: ( ( ( rule__Machine__EventsAssignment_9_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1312:1: ( ( rule__Machine__EventsAssignment_9_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1312:1: ( ( rule__Machine__EventsAssignment_9_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1313:1: ( rule__Machine__EventsAssignment_9_1 )
            {
             before(grammarAccess.getMachineAccess().getEventsAssignment_9_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1314:1: ( rule__Machine__EventsAssignment_9_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1314:2: rule__Machine__EventsAssignment_9_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__EventsAssignment_9_1_in_rule__Machine__Group_9__1__Impl2606);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1324:1: rule__Machine__Group_9__2 : rule__Machine__Group_9__2__Impl ;
    public final void rule__Machine__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1328:1: ( rule__Machine__Group_9__2__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1329:2: rule__Machine__Group_9__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_9__2__Impl_in_rule__Machine__Group_9__22636);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1335:1: rule__Machine__Group_9__2__Impl : ( ( rule__Machine__EventsAssignment_9_2 )* ) ;
    public final void rule__Machine__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1339:1: ( ( ( rule__Machine__EventsAssignment_9_2 )* ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1340:1: ( ( rule__Machine__EventsAssignment_9_2 )* )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1340:1: ( ( rule__Machine__EventsAssignment_9_2 )* )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1341:1: ( rule__Machine__EventsAssignment_9_2 )*
            {
             before(grammarAccess.getMachineAccess().getEventsAssignment_9_2()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1342:1: ( rule__Machine__EventsAssignment_9_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==26) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1342:2: rule__Machine__EventsAssignment_9_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Machine__EventsAssignment_9_2_in_rule__Machine__Group_9__2__Impl2663);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1358:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1362:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1363:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__02700);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__02703);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1370:1: rule__Variable__Group__0__Impl : ( () ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1374:1: ( ( () ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1375:1: ( () )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1375:1: ( () )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1376:1: ()
            {
             before(grammarAccess.getVariableAccess().getVariableAction_0()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1377:1: ()
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1379:1: 
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1389:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1393:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1394:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__12761);
            rule__Variable__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__2_in_rule__Variable__Group__12764);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1401:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__NameAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1405:1: ( ( ( rule__Variable__NameAssignment_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1406:1: ( ( rule__Variable__NameAssignment_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1406:1: ( ( rule__Variable__NameAssignment_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1407:1: ( rule__Variable__NameAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1408:1: ( rule__Variable__NameAssignment_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1408:2: rule__Variable__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__NameAssignment_1_in_rule__Variable__Group__1__Impl2791);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1418:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1422:1: ( rule__Variable__Group__2__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1423:2: rule__Variable__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__2__Impl_in_rule__Variable__Group__22821);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1429:1: rule__Variable__Group__2__Impl : ( ( rule__Variable__Group_2__0 )? ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1433:1: ( ( ( rule__Variable__Group_2__0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1434:1: ( ( rule__Variable__Group_2__0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1434:1: ( ( rule__Variable__Group_2__0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1435:1: ( rule__Variable__Group_2__0 )?
            {
             before(grammarAccess.getVariableAccess().getGroup_2()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1436:1: ( rule__Variable__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==16) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1436:2: rule__Variable__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Variable__Group_2__0_in_rule__Variable__Group__2__Impl2848);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1452:1: rule__Variable__Group_2__0 : rule__Variable__Group_2__0__Impl rule__Variable__Group_2__1 ;
    public final void rule__Variable__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1456:1: ( rule__Variable__Group_2__0__Impl rule__Variable__Group_2__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1457:2: rule__Variable__Group_2__0__Impl rule__Variable__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group_2__0__Impl_in_rule__Variable__Group_2__02885);
            rule__Variable__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group_2__1_in_rule__Variable__Group_2__02888);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1464:1: rule__Variable__Group_2__0__Impl : ( '//' ) ;
    public final void rule__Variable__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1468:1: ( ( '//' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1469:1: ( '//' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1469:1: ( '//' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1470:1: '//'
            {
             before(grammarAccess.getVariableAccess().getSolidusSolidusKeyword_2_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Variable__Group_2__0__Impl2916); 
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1483:1: rule__Variable__Group_2__1 : rule__Variable__Group_2__1__Impl ;
    public final void rule__Variable__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1487:1: ( rule__Variable__Group_2__1__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1488:2: rule__Variable__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group_2__1__Impl_in_rule__Variable__Group_2__12947);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1494:1: rule__Variable__Group_2__1__Impl : ( ( rule__Variable__CommentAssignment_2_1 ) ) ;
    public final void rule__Variable__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1498:1: ( ( ( rule__Variable__CommentAssignment_2_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1499:1: ( ( rule__Variable__CommentAssignment_2_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1499:1: ( ( rule__Variable__CommentAssignment_2_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1500:1: ( rule__Variable__CommentAssignment_2_1 )
            {
             before(grammarAccess.getVariableAccess().getCommentAssignment_2_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1501:1: ( rule__Variable__CommentAssignment_2_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1501:2: rule__Variable__CommentAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__CommentAssignment_2_1_in_rule__Variable__Group_2__1__Impl2974);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1515:1: rule__Invariant__Group__0 : rule__Invariant__Group__0__Impl rule__Invariant__Group__1 ;
    public final void rule__Invariant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1519:1: ( rule__Invariant__Group__0__Impl rule__Invariant__Group__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1520:2: rule__Invariant__Group__0__Impl rule__Invariant__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__0__Impl_in_rule__Invariant__Group__03008);
            rule__Invariant__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__1_in_rule__Invariant__Group__03011);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1527:1: rule__Invariant__Group__0__Impl : ( '@' ) ;
    public final void rule__Invariant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1531:1: ( ( '@' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1532:1: ( '@' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1532:1: ( '@' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1533:1: '@'
            {
             before(grammarAccess.getInvariantAccess().getCommercialAtKeyword_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Invariant__Group__0__Impl3039); 
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1546:1: rule__Invariant__Group__1 : rule__Invariant__Group__1__Impl rule__Invariant__Group__2 ;
    public final void rule__Invariant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1550:1: ( rule__Invariant__Group__1__Impl rule__Invariant__Group__2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1551:2: rule__Invariant__Group__1__Impl rule__Invariant__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__1__Impl_in_rule__Invariant__Group__13070);
            rule__Invariant__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__2_in_rule__Invariant__Group__13073);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1558:1: rule__Invariant__Group__1__Impl : ( ( rule__Invariant__NameAssignment_1 ) ) ;
    public final void rule__Invariant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1562:1: ( ( ( rule__Invariant__NameAssignment_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1563:1: ( ( rule__Invariant__NameAssignment_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1563:1: ( ( rule__Invariant__NameAssignment_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1564:1: ( rule__Invariant__NameAssignment_1 )
            {
             before(grammarAccess.getInvariantAccess().getNameAssignment_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1565:1: ( rule__Invariant__NameAssignment_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1565:2: rule__Invariant__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__NameAssignment_1_in_rule__Invariant__Group__1__Impl3100);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1575:1: rule__Invariant__Group__2 : rule__Invariant__Group__2__Impl rule__Invariant__Group__3 ;
    public final void rule__Invariant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1579:1: ( rule__Invariant__Group__2__Impl rule__Invariant__Group__3 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1580:2: rule__Invariant__Group__2__Impl rule__Invariant__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__2__Impl_in_rule__Invariant__Group__23130);
            rule__Invariant__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__3_in_rule__Invariant__Group__23133);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1587:1: rule__Invariant__Group__2__Impl : ( ( rule__Invariant__TheoremAssignment_2 )? ) ;
    public final void rule__Invariant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1591:1: ( ( ( rule__Invariant__TheoremAssignment_2 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1592:1: ( ( rule__Invariant__TheoremAssignment_2 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1592:1: ( ( rule__Invariant__TheoremAssignment_2 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1593:1: ( rule__Invariant__TheoremAssignment_2 )?
            {
             before(grammarAccess.getInvariantAccess().getTheoremAssignment_2()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1594:1: ( rule__Invariant__TheoremAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1594:2: rule__Invariant__TheoremAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Invariant__TheoremAssignment_2_in_rule__Invariant__Group__2__Impl3160);
                    rule__Invariant__TheoremAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInvariantAccess().getTheoremAssignment_2()); 

            }


            }

        }
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1604:1: rule__Invariant__Group__3 : rule__Invariant__Group__3__Impl rule__Invariant__Group__4 ;
    public final void rule__Invariant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1608:1: ( rule__Invariant__Group__3__Impl rule__Invariant__Group__4 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1609:2: rule__Invariant__Group__3__Impl rule__Invariant__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__3__Impl_in_rule__Invariant__Group__33191);
            rule__Invariant__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__4_in_rule__Invariant__Group__33194);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1616:1: rule__Invariant__Group__3__Impl : ( ( rule__Invariant__PredicateAssignment_3 )? ) ;
    public final void rule__Invariant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1620:1: ( ( ( rule__Invariant__PredicateAssignment_3 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1621:1: ( ( rule__Invariant__PredicateAssignment_3 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1621:1: ( ( rule__Invariant__PredicateAssignment_3 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1622:1: ( rule__Invariant__PredicateAssignment_3 )?
            {
             before(grammarAccess.getInvariantAccess().getPredicateAssignment_3()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1623:1: ( rule__Invariant__PredicateAssignment_3 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_STRING && LA17_0<=RULE_ID)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1623:2: rule__Invariant__PredicateAssignment_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Invariant__PredicateAssignment_3_in_rule__Invariant__Group__3__Impl3221);
                    rule__Invariant__PredicateAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInvariantAccess().getPredicateAssignment_3()); 

            }


            }

        }
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1633:1: rule__Invariant__Group__4 : rule__Invariant__Group__4__Impl ;
    public final void rule__Invariant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1637:1: ( rule__Invariant__Group__4__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1638:2: rule__Invariant__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__4__Impl_in_rule__Invariant__Group__43252);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1644:1: rule__Invariant__Group__4__Impl : ( ( rule__Invariant__Group_4__0 )? ) ;
    public final void rule__Invariant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1648:1: ( ( ( rule__Invariant__Group_4__0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1649:1: ( ( rule__Invariant__Group_4__0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1649:1: ( ( rule__Invariant__Group_4__0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1650:1: ( rule__Invariant__Group_4__0 )?
            {
             before(grammarAccess.getInvariantAccess().getGroup_4()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1651:1: ( rule__Invariant__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==16) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1651:2: rule__Invariant__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group_4__0_in_rule__Invariant__Group__4__Impl3279);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1671:1: rule__Invariant__Group_4__0 : rule__Invariant__Group_4__0__Impl rule__Invariant__Group_4__1 ;
    public final void rule__Invariant__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1675:1: ( rule__Invariant__Group_4__0__Impl rule__Invariant__Group_4__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1676:2: rule__Invariant__Group_4__0__Impl rule__Invariant__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group_4__0__Impl_in_rule__Invariant__Group_4__03320);
            rule__Invariant__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group_4__1_in_rule__Invariant__Group_4__03323);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1683:1: rule__Invariant__Group_4__0__Impl : ( '//' ) ;
    public final void rule__Invariant__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1687:1: ( ( '//' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1688:1: ( '//' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1688:1: ( '//' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1689:1: '//'
            {
             before(grammarAccess.getInvariantAccess().getSolidusSolidusKeyword_4_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Invariant__Group_4__0__Impl3351); 
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1702:1: rule__Invariant__Group_4__1 : rule__Invariant__Group_4__1__Impl ;
    public final void rule__Invariant__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1706:1: ( rule__Invariant__Group_4__1__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1707:2: rule__Invariant__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group_4__1__Impl_in_rule__Invariant__Group_4__13382);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1713:1: rule__Invariant__Group_4__1__Impl : ( ( rule__Invariant__CommentAssignment_4_1 ) ) ;
    public final void rule__Invariant__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1717:1: ( ( ( rule__Invariant__CommentAssignment_4_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1718:1: ( ( rule__Invariant__CommentAssignment_4_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1718:1: ( ( rule__Invariant__CommentAssignment_4_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1719:1: ( rule__Invariant__CommentAssignment_4_1 )
            {
             before(grammarAccess.getInvariantAccess().getCommentAssignment_4_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1720:1: ( rule__Invariant__CommentAssignment_4_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1720:2: rule__Invariant__CommentAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__CommentAssignment_4_1_in_rule__Invariant__Group_4__1__Impl3409);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1734:1: rule__Variant__Group__0 : rule__Variant__Group__0__Impl rule__Variant__Group__1 ;
    public final void rule__Variant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1738:1: ( rule__Variant__Group__0__Impl rule__Variant__Group__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1739:2: rule__Variant__Group__0__Impl rule__Variant__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variant__Group__0__Impl_in_rule__Variant__Group__03443);
            rule__Variant__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Variant__Group__1_in_rule__Variant__Group__03446);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1746:1: rule__Variant__Group__0__Impl : ( 'Variant' ) ;
    public final void rule__Variant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1750:1: ( ( 'Variant' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1751:1: ( 'Variant' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1751:1: ( 'Variant' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1752:1: 'Variant'
            {
             before(grammarAccess.getVariantAccess().getVariantKeyword_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Variant__Group__0__Impl3474); 
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1765:1: rule__Variant__Group__1 : rule__Variant__Group__1__Impl rule__Variant__Group__2 ;
    public final void rule__Variant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1769:1: ( rule__Variant__Group__1__Impl rule__Variant__Group__2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1770:2: rule__Variant__Group__1__Impl rule__Variant__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variant__Group__1__Impl_in_rule__Variant__Group__13505);
            rule__Variant__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Variant__Group__2_in_rule__Variant__Group__13508);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1777:1: rule__Variant__Group__1__Impl : ( 'expression' ) ;
    public final void rule__Variant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1781:1: ( ( 'expression' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1782:1: ( 'expression' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1782:1: ( 'expression' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1783:1: 'expression'
            {
             before(grammarAccess.getVariantAccess().getExpressionKeyword_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Variant__Group__1__Impl3536); 
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1796:1: rule__Variant__Group__2 : rule__Variant__Group__2__Impl rule__Variant__Group__3 ;
    public final void rule__Variant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1800:1: ( rule__Variant__Group__2__Impl rule__Variant__Group__3 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1801:2: rule__Variant__Group__2__Impl rule__Variant__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variant__Group__2__Impl_in_rule__Variant__Group__23567);
            rule__Variant__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Variant__Group__3_in_rule__Variant__Group__23570);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1808:1: rule__Variant__Group__2__Impl : ( ( rule__Variant__ExpressionAssignment_2 )? ) ;
    public final void rule__Variant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1812:1: ( ( ( rule__Variant__ExpressionAssignment_2 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1813:1: ( ( rule__Variant__ExpressionAssignment_2 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1813:1: ( ( rule__Variant__ExpressionAssignment_2 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1814:1: ( rule__Variant__ExpressionAssignment_2 )?
            {
             before(grammarAccess.getVariantAccess().getExpressionAssignment_2()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1815:1: ( rule__Variant__ExpressionAssignment_2 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_STRING && LA19_0<=RULE_ID)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1815:2: rule__Variant__ExpressionAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Variant__ExpressionAssignment_2_in_rule__Variant__Group__2__Impl3597);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1825:1: rule__Variant__Group__3 : rule__Variant__Group__3__Impl ;
    public final void rule__Variant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1829:1: ( rule__Variant__Group__3__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1830:2: rule__Variant__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variant__Group__3__Impl_in_rule__Variant__Group__33628);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1836:1: rule__Variant__Group__3__Impl : ( ( rule__Variant__Group_3__0 ) ) ;
    public final void rule__Variant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1840:1: ( ( ( rule__Variant__Group_3__0 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1841:1: ( ( rule__Variant__Group_3__0 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1841:1: ( ( rule__Variant__Group_3__0 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1842:1: ( rule__Variant__Group_3__0 )
            {
             before(grammarAccess.getVariantAccess().getGroup_3()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1843:1: ( rule__Variant__Group_3__0 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1843:2: rule__Variant__Group_3__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variant__Group_3__0_in_rule__Variant__Group__3__Impl3655);
            rule__Variant__Group_3__0();

            state._fsp--;


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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1861:1: rule__Variant__Group_3__0 : rule__Variant__Group_3__0__Impl rule__Variant__Group_3__1 ;
    public final void rule__Variant__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1865:1: ( rule__Variant__Group_3__0__Impl rule__Variant__Group_3__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1866:2: rule__Variant__Group_3__0__Impl rule__Variant__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variant__Group_3__0__Impl_in_rule__Variant__Group_3__03693);
            rule__Variant__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Variant__Group_3__1_in_rule__Variant__Group_3__03696);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1873:1: rule__Variant__Group_3__0__Impl : ( '//' ) ;
    public final void rule__Variant__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1877:1: ( ( '//' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1878:1: ( '//' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1878:1: ( '//' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1879:1: '//'
            {
             before(grammarAccess.getVariantAccess().getSolidusSolidusKeyword_3_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Variant__Group_3__0__Impl3724); 
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1892:1: rule__Variant__Group_3__1 : rule__Variant__Group_3__1__Impl ;
    public final void rule__Variant__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1896:1: ( rule__Variant__Group_3__1__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1897:2: rule__Variant__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variant__Group_3__1__Impl_in_rule__Variant__Group_3__13755);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1903:1: rule__Variant__Group_3__1__Impl : ( ( rule__Variant__CommentAssignment_3_1 ) ) ;
    public final void rule__Variant__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1907:1: ( ( ( rule__Variant__CommentAssignment_3_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1908:1: ( ( rule__Variant__CommentAssignment_3_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1908:1: ( ( rule__Variant__CommentAssignment_3_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1909:1: ( rule__Variant__CommentAssignment_3_1 )
            {
             before(grammarAccess.getVariantAccess().getCommentAssignment_3_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1910:1: ( rule__Variant__CommentAssignment_3_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1910:2: rule__Variant__CommentAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variant__CommentAssignment_3_1_in_rule__Variant__Group_3__1__Impl3782);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1924:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1928:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1929:2: rule__Event__Group__0__Impl rule__Event__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__03816);
            rule__Event__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__1_in_rule__Event__Group__03819);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1936:1: rule__Event__Group__0__Impl : ( () ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1940:1: ( ( () ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1941:1: ( () )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1941:1: ( () )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1942:1: ()
            {
             before(grammarAccess.getEventAccess().getEventAction_0()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1943:1: ()
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1945:1: 
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1955:1: rule__Event__Group__1 : rule__Event__Group__1__Impl rule__Event__Group__2 ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1959:1: ( rule__Event__Group__1__Impl rule__Event__Group__2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1960:2: rule__Event__Group__1__Impl rule__Event__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__13877);
            rule__Event__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__2_in_rule__Event__Group__13880);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1967:1: rule__Event__Group__1__Impl : ( 'event' ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1971:1: ( ( 'event' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1972:1: ( 'event' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1972:1: ( 'event' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1973:1: 'event'
            {
             before(grammarAccess.getEventAccess().getEventKeyword_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Event__Group__1__Impl3908); 
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1986:1: rule__Event__Group__2 : rule__Event__Group__2__Impl rule__Event__Group__3 ;
    public final void rule__Event__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1990:1: ( rule__Event__Group__2__Impl rule__Event__Group__3 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1991:2: rule__Event__Group__2__Impl rule__Event__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__2__Impl_in_rule__Event__Group__23939);
            rule__Event__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__3_in_rule__Event__Group__23942);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1998:1: rule__Event__Group__2__Impl : ( ( rule__Event__NameAssignment_2 ) ) ;
    public final void rule__Event__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2002:1: ( ( ( rule__Event__NameAssignment_2 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2003:1: ( ( rule__Event__NameAssignment_2 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2003:1: ( ( rule__Event__NameAssignment_2 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2004:1: ( rule__Event__NameAssignment_2 )
            {
             before(grammarAccess.getEventAccess().getNameAssignment_2()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2005:1: ( rule__Event__NameAssignment_2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2005:2: rule__Event__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__NameAssignment_2_in_rule__Event__Group__2__Impl3969);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2015:1: rule__Event__Group__3 : rule__Event__Group__3__Impl rule__Event__Group__4 ;
    public final void rule__Event__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2019:1: ( rule__Event__Group__3__Impl rule__Event__Group__4 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2020:2: rule__Event__Group__3__Impl rule__Event__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__3__Impl_in_rule__Event__Group__33999);
            rule__Event__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__4_in_rule__Event__Group__34002);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2027:1: rule__Event__Group__3__Impl : ( ( rule__Event__ExtendedAssignment_3 )? ) ;
    public final void rule__Event__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2031:1: ( ( ( rule__Event__ExtendedAssignment_3 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2032:1: ( ( rule__Event__ExtendedAssignment_3 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2032:1: ( ( rule__Event__ExtendedAssignment_3 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2033:1: ( rule__Event__ExtendedAssignment_3 )?
            {
             before(grammarAccess.getEventAccess().getExtendedAssignment_3()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2034:1: ( rule__Event__ExtendedAssignment_3 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==34) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2034:2: rule__Event__ExtendedAssignment_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Event__ExtendedAssignment_3_in_rule__Event__Group__3__Impl4029);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2044:1: rule__Event__Group__4 : rule__Event__Group__4__Impl rule__Event__Group__5 ;
    public final void rule__Event__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2048:1: ( rule__Event__Group__4__Impl rule__Event__Group__5 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2049:2: rule__Event__Group__4__Impl rule__Event__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__4__Impl_in_rule__Event__Group__44060);
            rule__Event__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__5_in_rule__Event__Group__44063);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2056:1: rule__Event__Group__4__Impl : ( ( rule__Event__ConvergenceAssignment_4 )? ) ;
    public final void rule__Event__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2060:1: ( ( ( rule__Event__ConvergenceAssignment_4 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2061:1: ( ( rule__Event__ConvergenceAssignment_4 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2061:1: ( ( rule__Event__ConvergenceAssignment_4 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2062:1: ( rule__Event__ConvergenceAssignment_4 )?
            {
             before(grammarAccess.getEventAccess().getConvergenceAssignment_4()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2063:1: ( rule__Event__ConvergenceAssignment_4 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=11 && LA21_0<=13)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2063:2: rule__Event__ConvergenceAssignment_4
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Event__ConvergenceAssignment_4_in_rule__Event__Group__4__Impl4090);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2073:1: rule__Event__Group__5 : rule__Event__Group__5__Impl rule__Event__Group__6 ;
    public final void rule__Event__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2077:1: ( rule__Event__Group__5__Impl rule__Event__Group__6 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2078:2: rule__Event__Group__5__Impl rule__Event__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__5__Impl_in_rule__Event__Group__54121);
            rule__Event__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__6_in_rule__Event__Group__54124);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2085:1: rule__Event__Group__5__Impl : ( ( rule__Event__Group_5__0 )? ) ;
    public final void rule__Event__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2089:1: ( ( ( rule__Event__Group_5__0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2090:1: ( ( rule__Event__Group_5__0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2090:1: ( ( rule__Event__Group_5__0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2091:1: ( rule__Event__Group_5__0 )?
            {
             before(grammarAccess.getEventAccess().getGroup_5()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2092:1: ( rule__Event__Group_5__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==16) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2092:2: rule__Event__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Event__Group_5__0_in_rule__Event__Group__5__Impl4151);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2102:1: rule__Event__Group__6 : rule__Event__Group__6__Impl rule__Event__Group__7 ;
    public final void rule__Event__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2106:1: ( rule__Event__Group__6__Impl rule__Event__Group__7 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2107:2: rule__Event__Group__6__Impl rule__Event__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__6__Impl_in_rule__Event__Group__64182);
            rule__Event__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__7_in_rule__Event__Group__64185);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2114:1: rule__Event__Group__6__Impl : ( ( rule__Event__Group_6__0 )? ) ;
    public final void rule__Event__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2118:1: ( ( ( rule__Event__Group_6__0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2119:1: ( ( rule__Event__Group_6__0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2119:1: ( ( rule__Event__Group_6__0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2120:1: ( rule__Event__Group_6__0 )?
            {
             before(grammarAccess.getEventAccess().getGroup_6()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2121:1: ( rule__Event__Group_6__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==17) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2121:2: rule__Event__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Event__Group_6__0_in_rule__Event__Group__6__Impl4212);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2131:1: rule__Event__Group__7 : rule__Event__Group__7__Impl rule__Event__Group__8 ;
    public final void rule__Event__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2135:1: ( rule__Event__Group__7__Impl rule__Event__Group__8 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2136:2: rule__Event__Group__7__Impl rule__Event__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__7__Impl_in_rule__Event__Group__74243);
            rule__Event__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__8_in_rule__Event__Group__74246);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2143:1: rule__Event__Group__7__Impl : ( ( rule__Event__Group_7__0 )? ) ;
    public final void rule__Event__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2147:1: ( ( ( rule__Event__Group_7__0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2148:1: ( ( rule__Event__Group_7__0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2148:1: ( ( rule__Event__Group_7__0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2149:1: ( rule__Event__Group_7__0 )?
            {
             before(grammarAccess.getEventAccess().getGroup_7()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2150:1: ( rule__Event__Group_7__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==28) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2150:2: rule__Event__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Event__Group_7__0_in_rule__Event__Group__7__Impl4273);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2160:1: rule__Event__Group__8 : rule__Event__Group__8__Impl rule__Event__Group__9 ;
    public final void rule__Event__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2164:1: ( rule__Event__Group__8__Impl rule__Event__Group__9 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2165:2: rule__Event__Group__8__Impl rule__Event__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__8__Impl_in_rule__Event__Group__84304);
            rule__Event__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__9_in_rule__Event__Group__84307);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2172:1: rule__Event__Group__8__Impl : ( ( rule__Event__Group_8__0 )? ) ;
    public final void rule__Event__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2176:1: ( ( ( rule__Event__Group_8__0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2177:1: ( ( rule__Event__Group_8__0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2177:1: ( ( rule__Event__Group_8__0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2178:1: ( rule__Event__Group_8__0 )?
            {
             before(grammarAccess.getEventAccess().getGroup_8()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2179:1: ( rule__Event__Group_8__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==29) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2179:2: rule__Event__Group_8__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Event__Group_8__0_in_rule__Event__Group__8__Impl4334);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2189:1: rule__Event__Group__9 : rule__Event__Group__9__Impl rule__Event__Group__10 ;
    public final void rule__Event__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2193:1: ( rule__Event__Group__9__Impl rule__Event__Group__10 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2194:2: rule__Event__Group__9__Impl rule__Event__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__9__Impl_in_rule__Event__Group__94365);
            rule__Event__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__10_in_rule__Event__Group__94368);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2201:1: rule__Event__Group__9__Impl : ( ( rule__Event__Group_9__0 )? ) ;
    public final void rule__Event__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2205:1: ( ( ( rule__Event__Group_9__0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2206:1: ( ( rule__Event__Group_9__0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2206:1: ( ( rule__Event__Group_9__0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2207:1: ( rule__Event__Group_9__0 )?
            {
             before(grammarAccess.getEventAccess().getGroup_9()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2208:1: ( rule__Event__Group_9__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==31) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2208:2: rule__Event__Group_9__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Event__Group_9__0_in_rule__Event__Group__9__Impl4395);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2218:1: rule__Event__Group__10 : rule__Event__Group__10__Impl rule__Event__Group__11 ;
    public final void rule__Event__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2222:1: ( rule__Event__Group__10__Impl rule__Event__Group__11 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2223:2: rule__Event__Group__10__Impl rule__Event__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__10__Impl_in_rule__Event__Group__104426);
            rule__Event__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__11_in_rule__Event__Group__104429);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2230:1: rule__Event__Group__10__Impl : ( ( rule__Event__Group_10__0 )? ) ;
    public final void rule__Event__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2234:1: ( ( ( rule__Event__Group_10__0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2235:1: ( ( rule__Event__Group_10__0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2235:1: ( ( rule__Event__Group_10__0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2236:1: ( rule__Event__Group_10__0 )?
            {
             before(grammarAccess.getEventAccess().getGroup_10()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2237:1: ( rule__Event__Group_10__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==32) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2237:2: rule__Event__Group_10__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Event__Group_10__0_in_rule__Event__Group__10__Impl4456);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2247:1: rule__Event__Group__11 : rule__Event__Group__11__Impl ;
    public final void rule__Event__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2251:1: ( rule__Event__Group__11__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2252:2: rule__Event__Group__11__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__11__Impl_in_rule__Event__Group__114487);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2258:1: rule__Event__Group__11__Impl : ( 'end' ) ;
    public final void rule__Event__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2262:1: ( ( 'end' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2263:1: ( 'end' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2263:1: ( 'end' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2264:1: 'end'
            {
             before(grammarAccess.getEventAccess().getEndKeyword_11()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Event__Group__11__Impl4515); 
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2301:1: rule__Event__Group_5__0 : rule__Event__Group_5__0__Impl rule__Event__Group_5__1 ;
    public final void rule__Event__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2305:1: ( rule__Event__Group_5__0__Impl rule__Event__Group_5__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2306:2: rule__Event__Group_5__0__Impl rule__Event__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_5__0__Impl_in_rule__Event__Group_5__04570);
            rule__Event__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_5__1_in_rule__Event__Group_5__04573);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2313:1: rule__Event__Group_5__0__Impl : ( '//' ) ;
    public final void rule__Event__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2317:1: ( ( '//' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2318:1: ( '//' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2318:1: ( '//' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2319:1: '//'
            {
             before(grammarAccess.getEventAccess().getSolidusSolidusKeyword_5_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Event__Group_5__0__Impl4601); 
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2332:1: rule__Event__Group_5__1 : rule__Event__Group_5__1__Impl ;
    public final void rule__Event__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2336:1: ( rule__Event__Group_5__1__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2337:2: rule__Event__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_5__1__Impl_in_rule__Event__Group_5__14632);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2343:1: rule__Event__Group_5__1__Impl : ( ( rule__Event__CommentAssignment_5_1 ) ) ;
    public final void rule__Event__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2347:1: ( ( ( rule__Event__CommentAssignment_5_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2348:1: ( ( rule__Event__CommentAssignment_5_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2348:1: ( ( rule__Event__CommentAssignment_5_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2349:1: ( rule__Event__CommentAssignment_5_1 )
            {
             before(grammarAccess.getEventAccess().getCommentAssignment_5_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2350:1: ( rule__Event__CommentAssignment_5_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2350:2: rule__Event__CommentAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__CommentAssignment_5_1_in_rule__Event__Group_5__1__Impl4659);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2364:1: rule__Event__Group_6__0 : rule__Event__Group_6__0__Impl rule__Event__Group_6__1 ;
    public final void rule__Event__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2368:1: ( rule__Event__Group_6__0__Impl rule__Event__Group_6__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2369:2: rule__Event__Group_6__0__Impl rule__Event__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_6__0__Impl_in_rule__Event__Group_6__04693);
            rule__Event__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_6__1_in_rule__Event__Group_6__04696);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2376:1: rule__Event__Group_6__0__Impl : ( 'refines' ) ;
    public final void rule__Event__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2380:1: ( ( 'refines' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2381:1: ( 'refines' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2381:1: ( 'refines' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2382:1: 'refines'
            {
             before(grammarAccess.getEventAccess().getRefinesKeyword_6_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Event__Group_6__0__Impl4724); 
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2395:1: rule__Event__Group_6__1 : rule__Event__Group_6__1__Impl rule__Event__Group_6__2 ;
    public final void rule__Event__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2399:1: ( rule__Event__Group_6__1__Impl rule__Event__Group_6__2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2400:2: rule__Event__Group_6__1__Impl rule__Event__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_6__1__Impl_in_rule__Event__Group_6__14755);
            rule__Event__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_6__2_in_rule__Event__Group_6__14758);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2407:1: rule__Event__Group_6__1__Impl : ( ( rule__Event__RefinesAssignment_6_1 ) ) ;
    public final void rule__Event__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2411:1: ( ( ( rule__Event__RefinesAssignment_6_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2412:1: ( ( rule__Event__RefinesAssignment_6_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2412:1: ( ( rule__Event__RefinesAssignment_6_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2413:1: ( rule__Event__RefinesAssignment_6_1 )
            {
             before(grammarAccess.getEventAccess().getRefinesAssignment_6_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2414:1: ( rule__Event__RefinesAssignment_6_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2414:2: rule__Event__RefinesAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__RefinesAssignment_6_1_in_rule__Event__Group_6__1__Impl4785);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2424:1: rule__Event__Group_6__2 : rule__Event__Group_6__2__Impl ;
    public final void rule__Event__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2428:1: ( rule__Event__Group_6__2__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2429:2: rule__Event__Group_6__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_6__2__Impl_in_rule__Event__Group_6__24815);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2435:1: rule__Event__Group_6__2__Impl : ( ( rule__Event__Group_6_2__0 )* ) ;
    public final void rule__Event__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2439:1: ( ( ( rule__Event__Group_6_2__0 )* ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2440:1: ( ( rule__Event__Group_6_2__0 )* )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2440:1: ( ( rule__Event__Group_6_2__0 )* )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2441:1: ( rule__Event__Group_6_2__0 )*
            {
             before(grammarAccess.getEventAccess().getGroup_6_2()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2442:1: ( rule__Event__Group_6_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==27) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2442:2: rule__Event__Group_6_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Event__Group_6_2__0_in_rule__Event__Group_6__2__Impl4842);
            	    rule__Event__Group_6_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2458:1: rule__Event__Group_6_2__0 : rule__Event__Group_6_2__0__Impl rule__Event__Group_6_2__1 ;
    public final void rule__Event__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2462:1: ( rule__Event__Group_6_2__0__Impl rule__Event__Group_6_2__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2463:2: rule__Event__Group_6_2__0__Impl rule__Event__Group_6_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_6_2__0__Impl_in_rule__Event__Group_6_2__04879);
            rule__Event__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_6_2__1_in_rule__Event__Group_6_2__04882);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2470:1: rule__Event__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__Event__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2474:1: ( ( ',' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2475:1: ( ',' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2475:1: ( ',' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2476:1: ','
            {
             before(grammarAccess.getEventAccess().getCommaKeyword_6_2_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Event__Group_6_2__0__Impl4910); 
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2489:1: rule__Event__Group_6_2__1 : rule__Event__Group_6_2__1__Impl ;
    public final void rule__Event__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2493:1: ( rule__Event__Group_6_2__1__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2494:2: rule__Event__Group_6_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_6_2__1__Impl_in_rule__Event__Group_6_2__14941);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2500:1: rule__Event__Group_6_2__1__Impl : ( ( rule__Event__RefinesAssignment_6_2_1 ) ) ;
    public final void rule__Event__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2504:1: ( ( ( rule__Event__RefinesAssignment_6_2_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2505:1: ( ( rule__Event__RefinesAssignment_6_2_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2505:1: ( ( rule__Event__RefinesAssignment_6_2_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2506:1: ( rule__Event__RefinesAssignment_6_2_1 )
            {
             before(grammarAccess.getEventAccess().getRefinesAssignment_6_2_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2507:1: ( rule__Event__RefinesAssignment_6_2_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2507:2: rule__Event__RefinesAssignment_6_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__RefinesAssignment_6_2_1_in_rule__Event__Group_6_2__1__Impl4968);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2521:1: rule__Event__Group_7__0 : rule__Event__Group_7__0__Impl rule__Event__Group_7__1 ;
    public final void rule__Event__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2525:1: ( rule__Event__Group_7__0__Impl rule__Event__Group_7__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2526:2: rule__Event__Group_7__0__Impl rule__Event__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_7__0__Impl_in_rule__Event__Group_7__05002);
            rule__Event__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_7__1_in_rule__Event__Group_7__05005);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2533:1: rule__Event__Group_7__0__Impl : ( 'when' ) ;
    public final void rule__Event__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2537:1: ( ( 'when' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2538:1: ( 'when' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2538:1: ( 'when' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2539:1: 'when'
            {
             before(grammarAccess.getEventAccess().getWhenKeyword_7_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Event__Group_7__0__Impl5033); 
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2552:1: rule__Event__Group_7__1 : rule__Event__Group_7__1__Impl rule__Event__Group_7__2 ;
    public final void rule__Event__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2556:1: ( rule__Event__Group_7__1__Impl rule__Event__Group_7__2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2557:2: rule__Event__Group_7__1__Impl rule__Event__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_7__1__Impl_in_rule__Event__Group_7__15064);
            rule__Event__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_7__2_in_rule__Event__Group_7__15067);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2564:1: rule__Event__Group_7__1__Impl : ( ( rule__Event__GuardsAssignment_7_1 ) ) ;
    public final void rule__Event__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2568:1: ( ( ( rule__Event__GuardsAssignment_7_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2569:1: ( ( rule__Event__GuardsAssignment_7_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2569:1: ( ( rule__Event__GuardsAssignment_7_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2570:1: ( rule__Event__GuardsAssignment_7_1 )
            {
             before(grammarAccess.getEventAccess().getGuardsAssignment_7_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2571:1: ( rule__Event__GuardsAssignment_7_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2571:2: rule__Event__GuardsAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__GuardsAssignment_7_1_in_rule__Event__Group_7__1__Impl5094);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2581:1: rule__Event__Group_7__2 : rule__Event__Group_7__2__Impl ;
    public final void rule__Event__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2585:1: ( rule__Event__Group_7__2__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2586:2: rule__Event__Group_7__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_7__2__Impl_in_rule__Event__Group_7__25124);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2592:1: rule__Event__Group_7__2__Impl : ( ( rule__Event__GuardsAssignment_7_2 )* ) ;
    public final void rule__Event__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2596:1: ( ( ( rule__Event__GuardsAssignment_7_2 )* ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2597:1: ( ( rule__Event__GuardsAssignment_7_2 )* )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2597:1: ( ( rule__Event__GuardsAssignment_7_2 )* )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2598:1: ( rule__Event__GuardsAssignment_7_2 )*
            {
             before(grammarAccess.getEventAccess().getGuardsAssignment_7_2()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2599:1: ( rule__Event__GuardsAssignment_7_2 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==23) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2599:2: rule__Event__GuardsAssignment_7_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Event__GuardsAssignment_7_2_in_rule__Event__Group_7__2__Impl5151);
            	    rule__Event__GuardsAssignment_7_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2615:1: rule__Event__Group_8__0 : rule__Event__Group_8__0__Impl rule__Event__Group_8__1 ;
    public final void rule__Event__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2619:1: ( rule__Event__Group_8__0__Impl rule__Event__Group_8__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2620:2: rule__Event__Group_8__0__Impl rule__Event__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_8__0__Impl_in_rule__Event__Group_8__05188);
            rule__Event__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_8__1_in_rule__Event__Group_8__05191);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2627:1: rule__Event__Group_8__0__Impl : ( 'any' ) ;
    public final void rule__Event__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2631:1: ( ( 'any' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2632:1: ( 'any' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2632:1: ( 'any' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2633:1: 'any'
            {
             before(grammarAccess.getEventAccess().getAnyKeyword_8_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Event__Group_8__0__Impl5219); 
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2646:1: rule__Event__Group_8__1 : rule__Event__Group_8__1__Impl rule__Event__Group_8__2 ;
    public final void rule__Event__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2650:1: ( rule__Event__Group_8__1__Impl rule__Event__Group_8__2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2651:2: rule__Event__Group_8__1__Impl rule__Event__Group_8__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_8__1__Impl_in_rule__Event__Group_8__15250);
            rule__Event__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_8__2_in_rule__Event__Group_8__15253);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2658:1: rule__Event__Group_8__1__Impl : ( ( rule__Event__ParametersAssignment_8_1 ) ) ;
    public final void rule__Event__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2662:1: ( ( ( rule__Event__ParametersAssignment_8_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2663:1: ( ( rule__Event__ParametersAssignment_8_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2663:1: ( ( rule__Event__ParametersAssignment_8_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2664:1: ( rule__Event__ParametersAssignment_8_1 )
            {
             before(grammarAccess.getEventAccess().getParametersAssignment_8_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2665:1: ( rule__Event__ParametersAssignment_8_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2665:2: rule__Event__ParametersAssignment_8_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__ParametersAssignment_8_1_in_rule__Event__Group_8__1__Impl5280);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2675:1: rule__Event__Group_8__2 : rule__Event__Group_8__2__Impl rule__Event__Group_8__3 ;
    public final void rule__Event__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2679:1: ( rule__Event__Group_8__2__Impl rule__Event__Group_8__3 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2680:2: rule__Event__Group_8__2__Impl rule__Event__Group_8__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_8__2__Impl_in_rule__Event__Group_8__25310);
            rule__Event__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_8__3_in_rule__Event__Group_8__25313);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2687:1: rule__Event__Group_8__2__Impl : ( ( rule__Event__ParametersAssignment_8_2 )* ) ;
    public final void rule__Event__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2691:1: ( ( ( rule__Event__ParametersAssignment_8_2 )* ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2692:1: ( ( rule__Event__ParametersAssignment_8_2 )* )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2692:1: ( ( rule__Event__ParametersAssignment_8_2 )* )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2693:1: ( rule__Event__ParametersAssignment_8_2 )*
            {
             before(grammarAccess.getEventAccess().getParametersAssignment_8_2()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2694:1: ( rule__Event__ParametersAssignment_8_2 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=RULE_STRING && LA30_0<=RULE_ID)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2694:2: rule__Event__ParametersAssignment_8_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Event__ParametersAssignment_8_2_in_rule__Event__Group_8__2__Impl5340);
            	    rule__Event__ParametersAssignment_8_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2704:1: rule__Event__Group_8__3 : rule__Event__Group_8__3__Impl rule__Event__Group_8__4 ;
    public final void rule__Event__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2708:1: ( rule__Event__Group_8__3__Impl rule__Event__Group_8__4 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2709:2: rule__Event__Group_8__3__Impl rule__Event__Group_8__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_8__3__Impl_in_rule__Event__Group_8__35371);
            rule__Event__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_8__4_in_rule__Event__Group_8__35374);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2716:1: rule__Event__Group_8__3__Impl : ( 'where' ) ;
    public final void rule__Event__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2720:1: ( ( 'where' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2721:1: ( 'where' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2721:1: ( 'where' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2722:1: 'where'
            {
             before(grammarAccess.getEventAccess().getWhereKeyword_8_3()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Event__Group_8__3__Impl5402); 
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2735:1: rule__Event__Group_8__4 : rule__Event__Group_8__4__Impl rule__Event__Group_8__5 ;
    public final void rule__Event__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2739:1: ( rule__Event__Group_8__4__Impl rule__Event__Group_8__5 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2740:2: rule__Event__Group_8__4__Impl rule__Event__Group_8__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_8__4__Impl_in_rule__Event__Group_8__45433);
            rule__Event__Group_8__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_8__5_in_rule__Event__Group_8__45436);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2747:1: rule__Event__Group_8__4__Impl : ( ( rule__Event__GuardsAssignment_8_4 ) ) ;
    public final void rule__Event__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2751:1: ( ( ( rule__Event__GuardsAssignment_8_4 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2752:1: ( ( rule__Event__GuardsAssignment_8_4 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2752:1: ( ( rule__Event__GuardsAssignment_8_4 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2753:1: ( rule__Event__GuardsAssignment_8_4 )
            {
             before(grammarAccess.getEventAccess().getGuardsAssignment_8_4()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2754:1: ( rule__Event__GuardsAssignment_8_4 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2754:2: rule__Event__GuardsAssignment_8_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__GuardsAssignment_8_4_in_rule__Event__Group_8__4__Impl5463);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2764:1: rule__Event__Group_8__5 : rule__Event__Group_8__5__Impl ;
    public final void rule__Event__Group_8__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2768:1: ( rule__Event__Group_8__5__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2769:2: rule__Event__Group_8__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_8__5__Impl_in_rule__Event__Group_8__55493);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2775:1: rule__Event__Group_8__5__Impl : ( ( rule__Event__GuardsAssignment_8_5 )* ) ;
    public final void rule__Event__Group_8__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2779:1: ( ( ( rule__Event__GuardsAssignment_8_5 )* ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2780:1: ( ( rule__Event__GuardsAssignment_8_5 )* )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2780:1: ( ( rule__Event__GuardsAssignment_8_5 )* )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2781:1: ( rule__Event__GuardsAssignment_8_5 )*
            {
             before(grammarAccess.getEventAccess().getGuardsAssignment_8_5()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2782:1: ( rule__Event__GuardsAssignment_8_5 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==23) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2782:2: rule__Event__GuardsAssignment_8_5
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Event__GuardsAssignment_8_5_in_rule__Event__Group_8__5__Impl5520);
            	    rule__Event__GuardsAssignment_8_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2804:1: rule__Event__Group_9__0 : rule__Event__Group_9__0__Impl rule__Event__Group_9__1 ;
    public final void rule__Event__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2808:1: ( rule__Event__Group_9__0__Impl rule__Event__Group_9__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2809:2: rule__Event__Group_9__0__Impl rule__Event__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_9__0__Impl_in_rule__Event__Group_9__05563);
            rule__Event__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_9__1_in_rule__Event__Group_9__05566);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2816:1: rule__Event__Group_9__0__Impl : ( 'with' ) ;
    public final void rule__Event__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2820:1: ( ( 'with' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2821:1: ( 'with' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2821:1: ( 'with' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2822:1: 'with'
            {
             before(grammarAccess.getEventAccess().getWithKeyword_9_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Event__Group_9__0__Impl5594); 
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2835:1: rule__Event__Group_9__1 : rule__Event__Group_9__1__Impl rule__Event__Group_9__2 ;
    public final void rule__Event__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2839:1: ( rule__Event__Group_9__1__Impl rule__Event__Group_9__2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2840:2: rule__Event__Group_9__1__Impl rule__Event__Group_9__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_9__1__Impl_in_rule__Event__Group_9__15625);
            rule__Event__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_9__2_in_rule__Event__Group_9__15628);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2847:1: rule__Event__Group_9__1__Impl : ( ( rule__Event__WitnessesAssignment_9_1 ) ) ;
    public final void rule__Event__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2851:1: ( ( ( rule__Event__WitnessesAssignment_9_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2852:1: ( ( rule__Event__WitnessesAssignment_9_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2852:1: ( ( rule__Event__WitnessesAssignment_9_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2853:1: ( rule__Event__WitnessesAssignment_9_1 )
            {
             before(grammarAccess.getEventAccess().getWitnessesAssignment_9_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2854:1: ( rule__Event__WitnessesAssignment_9_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2854:2: rule__Event__WitnessesAssignment_9_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__WitnessesAssignment_9_1_in_rule__Event__Group_9__1__Impl5655);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2864:1: rule__Event__Group_9__2 : rule__Event__Group_9__2__Impl ;
    public final void rule__Event__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2868:1: ( rule__Event__Group_9__2__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2869:2: rule__Event__Group_9__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_9__2__Impl_in_rule__Event__Group_9__25685);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2875:1: rule__Event__Group_9__2__Impl : ( ( rule__Event__WitnessesAssignment_9_2 )* ) ;
    public final void rule__Event__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2879:1: ( ( ( rule__Event__WitnessesAssignment_9_2 )* ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2880:1: ( ( rule__Event__WitnessesAssignment_9_2 )* )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2880:1: ( ( rule__Event__WitnessesAssignment_9_2 )* )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2881:1: ( rule__Event__WitnessesAssignment_9_2 )*
            {
             before(grammarAccess.getEventAccess().getWitnessesAssignment_9_2()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2882:1: ( rule__Event__WitnessesAssignment_9_2 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==23||LA32_0==35) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2882:2: rule__Event__WitnessesAssignment_9_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Event__WitnessesAssignment_9_2_in_rule__Event__Group_9__2__Impl5712);
            	    rule__Event__WitnessesAssignment_9_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2898:1: rule__Event__Group_10__0 : rule__Event__Group_10__0__Impl rule__Event__Group_10__1 ;
    public final void rule__Event__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2902:1: ( rule__Event__Group_10__0__Impl rule__Event__Group_10__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2903:2: rule__Event__Group_10__0__Impl rule__Event__Group_10__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_10__0__Impl_in_rule__Event__Group_10__05749);
            rule__Event__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_10__1_in_rule__Event__Group_10__05752);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2910:1: rule__Event__Group_10__0__Impl : ( 'then' ) ;
    public final void rule__Event__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2914:1: ( ( 'then' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2915:1: ( 'then' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2915:1: ( 'then' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2916:1: 'then'
            {
             before(grammarAccess.getEventAccess().getThenKeyword_10_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Event__Group_10__0__Impl5780); 
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2929:1: rule__Event__Group_10__1 : rule__Event__Group_10__1__Impl rule__Event__Group_10__2 ;
    public final void rule__Event__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2933:1: ( rule__Event__Group_10__1__Impl rule__Event__Group_10__2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2934:2: rule__Event__Group_10__1__Impl rule__Event__Group_10__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_10__1__Impl_in_rule__Event__Group_10__15811);
            rule__Event__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_10__2_in_rule__Event__Group_10__15814);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2941:1: rule__Event__Group_10__1__Impl : ( ( rule__Event__ActionsAssignment_10_1 ) ) ;
    public final void rule__Event__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2945:1: ( ( ( rule__Event__ActionsAssignment_10_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2946:1: ( ( rule__Event__ActionsAssignment_10_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2946:1: ( ( rule__Event__ActionsAssignment_10_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2947:1: ( rule__Event__ActionsAssignment_10_1 )
            {
             before(grammarAccess.getEventAccess().getActionsAssignment_10_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2948:1: ( rule__Event__ActionsAssignment_10_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2948:2: rule__Event__ActionsAssignment_10_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__ActionsAssignment_10_1_in_rule__Event__Group_10__1__Impl5841);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2958:1: rule__Event__Group_10__2 : rule__Event__Group_10__2__Impl ;
    public final void rule__Event__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2962:1: ( rule__Event__Group_10__2__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2963:2: rule__Event__Group_10__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_10__2__Impl_in_rule__Event__Group_10__25871);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2969:1: rule__Event__Group_10__2__Impl : ( ( rule__Event__ActionsAssignment_10_2 )* ) ;
    public final void rule__Event__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2973:1: ( ( ( rule__Event__ActionsAssignment_10_2 )* ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2974:1: ( ( rule__Event__ActionsAssignment_10_2 )* )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2974:1: ( ( rule__Event__ActionsAssignment_10_2 )* )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2975:1: ( rule__Event__ActionsAssignment_10_2 )*
            {
             before(grammarAccess.getEventAccess().getActionsAssignment_10_2()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2976:1: ( rule__Event__ActionsAssignment_10_2 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==23) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2976:2: rule__Event__ActionsAssignment_10_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Event__ActionsAssignment_10_2_in_rule__Event__Group_10__2__Impl5898);
            	    rule__Event__ActionsAssignment_10_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2992:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2996:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2997:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__05935);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__05938);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3004:1: rule__Parameter__Group__0__Impl : ( () ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3008:1: ( ( () ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3009:1: ( () )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3009:1: ( () )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3010:1: ()
            {
             before(grammarAccess.getParameterAccess().getParameterAction_0()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3011:1: ()
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3013:1: 
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3023:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3027:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3028:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__15996);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__15999);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3035:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3039:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3040:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3040:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3041:1: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3042:1: ( rule__Parameter__NameAssignment_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3042:2: rule__Parameter__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__NameAssignment_1_in_rule__Parameter__Group__1__Impl6026);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3052:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3056:1: ( rule__Parameter__Group__2__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3057:2: rule__Parameter__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__26056);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3063:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__Group_2__0 )? ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3067:1: ( ( ( rule__Parameter__Group_2__0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3068:1: ( ( rule__Parameter__Group_2__0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3068:1: ( ( rule__Parameter__Group_2__0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3069:1: ( rule__Parameter__Group_2__0 )?
            {
             before(grammarAccess.getParameterAccess().getGroup_2()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3070:1: ( rule__Parameter__Group_2__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==16) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3070:2: rule__Parameter__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_2__0_in_rule__Parameter__Group__2__Impl6083);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3086:1: rule__Parameter__Group_2__0 : rule__Parameter__Group_2__0__Impl rule__Parameter__Group_2__1 ;
    public final void rule__Parameter__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3090:1: ( rule__Parameter__Group_2__0__Impl rule__Parameter__Group_2__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3091:2: rule__Parameter__Group_2__0__Impl rule__Parameter__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_2__0__Impl_in_rule__Parameter__Group_2__06120);
            rule__Parameter__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_2__1_in_rule__Parameter__Group_2__06123);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3098:1: rule__Parameter__Group_2__0__Impl : ( '//' ) ;
    public final void rule__Parameter__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3102:1: ( ( '//' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3103:1: ( '//' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3103:1: ( '//' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3104:1: '//'
            {
             before(grammarAccess.getParameterAccess().getSolidusSolidusKeyword_2_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Parameter__Group_2__0__Impl6151); 
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3117:1: rule__Parameter__Group_2__1 : rule__Parameter__Group_2__1__Impl ;
    public final void rule__Parameter__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3121:1: ( rule__Parameter__Group_2__1__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3122:2: rule__Parameter__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_2__1__Impl_in_rule__Parameter__Group_2__16182);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3128:1: rule__Parameter__Group_2__1__Impl : ( ( rule__Parameter__CommentAssignment_2_1 ) ) ;
    public final void rule__Parameter__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3132:1: ( ( ( rule__Parameter__CommentAssignment_2_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3133:1: ( ( rule__Parameter__CommentAssignment_2_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3133:1: ( ( rule__Parameter__CommentAssignment_2_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3134:1: ( rule__Parameter__CommentAssignment_2_1 )
            {
             before(grammarAccess.getParameterAccess().getCommentAssignment_2_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3135:1: ( rule__Parameter__CommentAssignment_2_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3135:2: rule__Parameter__CommentAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__CommentAssignment_2_1_in_rule__Parameter__Group_2__1__Impl6209);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3149:1: rule__Guard__Group__0 : rule__Guard__Group__0__Impl rule__Guard__Group__1 ;
    public final void rule__Guard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3153:1: ( rule__Guard__Group__0__Impl rule__Guard__Group__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3154:2: rule__Guard__Group__0__Impl rule__Guard__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group__0__Impl_in_rule__Guard__Group__06243);
            rule__Guard__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group__1_in_rule__Guard__Group__06246);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3161:1: rule__Guard__Group__0__Impl : ( '@' ) ;
    public final void rule__Guard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3165:1: ( ( '@' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3166:1: ( '@' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3166:1: ( '@' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3167:1: '@'
            {
             before(grammarAccess.getGuardAccess().getCommercialAtKeyword_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Guard__Group__0__Impl6274); 
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3180:1: rule__Guard__Group__1 : rule__Guard__Group__1__Impl rule__Guard__Group__2 ;
    public final void rule__Guard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3184:1: ( rule__Guard__Group__1__Impl rule__Guard__Group__2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3185:2: rule__Guard__Group__1__Impl rule__Guard__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group__1__Impl_in_rule__Guard__Group__16305);
            rule__Guard__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group__2_in_rule__Guard__Group__16308);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3192:1: rule__Guard__Group__1__Impl : ( ( rule__Guard__NameAssignment_1 ) ) ;
    public final void rule__Guard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3196:1: ( ( ( rule__Guard__NameAssignment_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3197:1: ( ( rule__Guard__NameAssignment_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3197:1: ( ( rule__Guard__NameAssignment_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3198:1: ( rule__Guard__NameAssignment_1 )
            {
             before(grammarAccess.getGuardAccess().getNameAssignment_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3199:1: ( rule__Guard__NameAssignment_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3199:2: rule__Guard__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Guard__NameAssignment_1_in_rule__Guard__Group__1__Impl6335);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3209:1: rule__Guard__Group__2 : rule__Guard__Group__2__Impl rule__Guard__Group__3 ;
    public final void rule__Guard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3213:1: ( rule__Guard__Group__2__Impl rule__Guard__Group__3 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3214:2: rule__Guard__Group__2__Impl rule__Guard__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group__2__Impl_in_rule__Guard__Group__26365);
            rule__Guard__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group__3_in_rule__Guard__Group__26368);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3221:1: rule__Guard__Group__2__Impl : ( ( rule__Guard__TheoremAssignment_2 )? ) ;
    public final void rule__Guard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3225:1: ( ( ( rule__Guard__TheoremAssignment_2 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3226:1: ( ( rule__Guard__TheoremAssignment_2 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3226:1: ( ( rule__Guard__TheoremAssignment_2 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3227:1: ( rule__Guard__TheoremAssignment_2 )?
            {
             before(grammarAccess.getGuardAccess().getTheoremAssignment_2()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3228:1: ( rule__Guard__TheoremAssignment_2 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==33) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3228:2: rule__Guard__TheoremAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Guard__TheoremAssignment_2_in_rule__Guard__Group__2__Impl6395);
                    rule__Guard__TheoremAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGuardAccess().getTheoremAssignment_2()); 

            }


            }

        }
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3238:1: rule__Guard__Group__3 : rule__Guard__Group__3__Impl rule__Guard__Group__4 ;
    public final void rule__Guard__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3242:1: ( rule__Guard__Group__3__Impl rule__Guard__Group__4 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3243:2: rule__Guard__Group__3__Impl rule__Guard__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group__3__Impl_in_rule__Guard__Group__36426);
            rule__Guard__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group__4_in_rule__Guard__Group__36429);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3250:1: rule__Guard__Group__3__Impl : ( ( rule__Guard__PredicateAssignment_3 ) ) ;
    public final void rule__Guard__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3254:1: ( ( ( rule__Guard__PredicateAssignment_3 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3255:1: ( ( rule__Guard__PredicateAssignment_3 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3255:1: ( ( rule__Guard__PredicateAssignment_3 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3256:1: ( rule__Guard__PredicateAssignment_3 )
            {
             before(grammarAccess.getGuardAccess().getPredicateAssignment_3()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3257:1: ( rule__Guard__PredicateAssignment_3 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3257:2: rule__Guard__PredicateAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Guard__PredicateAssignment_3_in_rule__Guard__Group__3__Impl6456);
            rule__Guard__PredicateAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGuardAccess().getPredicateAssignment_3()); 

            }


            }

        }
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3267:1: rule__Guard__Group__4 : rule__Guard__Group__4__Impl ;
    public final void rule__Guard__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3271:1: ( rule__Guard__Group__4__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3272:2: rule__Guard__Group__4__Impl
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3278:1: rule__Guard__Group__4__Impl : ( ( rule__Guard__Group_4__0 )? ) ;
    public final void rule__Guard__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3282:1: ( ( ( rule__Guard__Group_4__0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3283:1: ( ( rule__Guard__Group_4__0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3283:1: ( ( rule__Guard__Group_4__0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3284:1: ( rule__Guard__Group_4__0 )?
            {
             before(grammarAccess.getGuardAccess().getGroup_4()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3285:1: ( rule__Guard__Group_4__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==16) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3285:2: rule__Guard__Group_4__0
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3305:1: rule__Guard__Group_4__0 : rule__Guard__Group_4__0__Impl rule__Guard__Group_4__1 ;
    public final void rule__Guard__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3309:1: ( rule__Guard__Group_4__0__Impl rule__Guard__Group_4__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3310:2: rule__Guard__Group_4__0__Impl rule__Guard__Group_4__1
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3317:1: rule__Guard__Group_4__0__Impl : ( '//' ) ;
    public final void rule__Guard__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3321:1: ( ( '//' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3322:1: ( '//' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3322:1: ( '//' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3323:1: '//'
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3336:1: rule__Guard__Group_4__1 : rule__Guard__Group_4__1__Impl ;
    public final void rule__Guard__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3340:1: ( rule__Guard__Group_4__1__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3341:2: rule__Guard__Group_4__1__Impl
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3347:1: rule__Guard__Group_4__1__Impl : ( ( rule__Guard__CommentAssignment_4_1 ) ) ;
    public final void rule__Guard__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3351:1: ( ( ( rule__Guard__CommentAssignment_4_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3352:1: ( ( rule__Guard__CommentAssignment_4_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3352:1: ( ( rule__Guard__CommentAssignment_4_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3353:1: ( rule__Guard__CommentAssignment_4_1 )
            {
             before(grammarAccess.getGuardAccess().getCommentAssignment_4_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3354:1: ( rule__Guard__CommentAssignment_4_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3354:2: rule__Guard__CommentAssignment_4_1
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3368:1: rule__Witness__Group__0 : rule__Witness__Group__0__Impl rule__Witness__Group__1 ;
    public final void rule__Witness__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3372:1: ( rule__Witness__Group__0__Impl rule__Witness__Group__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3373:2: rule__Witness__Group__0__Impl rule__Witness__Group__1
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3380:1: rule__Witness__Group__0__Impl : ( ( rule__Witness__LocalGeneratedAssignment_0 )? ) ;
    public final void rule__Witness__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3384:1: ( ( ( rule__Witness__LocalGeneratedAssignment_0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3385:1: ( ( rule__Witness__LocalGeneratedAssignment_0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3385:1: ( ( rule__Witness__LocalGeneratedAssignment_0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3386:1: ( rule__Witness__LocalGeneratedAssignment_0 )?
            {
             before(grammarAccess.getWitnessAccess().getLocalGeneratedAssignment_0()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3387:1: ( rule__Witness__LocalGeneratedAssignment_0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==35) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3387:2: rule__Witness__LocalGeneratedAssignment_0
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3397:1: rule__Witness__Group__1 : rule__Witness__Group__1__Impl rule__Witness__Group__2 ;
    public final void rule__Witness__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3401:1: ( rule__Witness__Group__1__Impl rule__Witness__Group__2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3402:2: rule__Witness__Group__1__Impl rule__Witness__Group__2
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3409:1: rule__Witness__Group__1__Impl : ( '@' ) ;
    public final void rule__Witness__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3413:1: ( ( '@' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3414:1: ( '@' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3414:1: ( '@' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3415:1: '@'
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3428:1: rule__Witness__Group__2 : rule__Witness__Group__2__Impl rule__Witness__Group__3 ;
    public final void rule__Witness__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3432:1: ( rule__Witness__Group__2__Impl rule__Witness__Group__3 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3433:2: rule__Witness__Group__2__Impl rule__Witness__Group__3
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3440:1: rule__Witness__Group__2__Impl : ( ( rule__Witness__NameAssignment_2 ) ) ;
    public final void rule__Witness__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3444:1: ( ( ( rule__Witness__NameAssignment_2 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3445:1: ( ( rule__Witness__NameAssignment_2 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3445:1: ( ( rule__Witness__NameAssignment_2 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3446:1: ( rule__Witness__NameAssignment_2 )
            {
             before(grammarAccess.getWitnessAccess().getNameAssignment_2()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3447:1: ( rule__Witness__NameAssignment_2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3447:2: rule__Witness__NameAssignment_2
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3457:1: rule__Witness__Group__3 : rule__Witness__Group__3__Impl rule__Witness__Group__4 ;
    public final void rule__Witness__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3461:1: ( rule__Witness__Group__3__Impl rule__Witness__Group__4 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3462:2: rule__Witness__Group__3__Impl rule__Witness__Group__4
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3469:1: rule__Witness__Group__3__Impl : ( ( rule__Witness__PredicateAssignment_3 )? ) ;
    public final void rule__Witness__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3473:1: ( ( ( rule__Witness__PredicateAssignment_3 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3474:1: ( ( rule__Witness__PredicateAssignment_3 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3474:1: ( ( rule__Witness__PredicateAssignment_3 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3475:1: ( rule__Witness__PredicateAssignment_3 )?
            {
             before(grammarAccess.getWitnessAccess().getPredicateAssignment_3()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3476:1: ( rule__Witness__PredicateAssignment_3 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=RULE_STRING && LA38_0<=RULE_ID)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3476:2: rule__Witness__PredicateAssignment_3
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3486:1: rule__Witness__Group__4 : rule__Witness__Group__4__Impl ;
    public final void rule__Witness__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3490:1: ( rule__Witness__Group__4__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3491:2: rule__Witness__Group__4__Impl
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3497:1: rule__Witness__Group__4__Impl : ( ( rule__Witness__Group_4__0 )? ) ;
    public final void rule__Witness__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3501:1: ( ( ( rule__Witness__Group_4__0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3502:1: ( ( rule__Witness__Group_4__0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3502:1: ( ( rule__Witness__Group_4__0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3503:1: ( rule__Witness__Group_4__0 )?
            {
             before(grammarAccess.getWitnessAccess().getGroup_4()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3504:1: ( rule__Witness__Group_4__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==16) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3504:2: rule__Witness__Group_4__0
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3524:1: rule__Witness__Group_4__0 : rule__Witness__Group_4__0__Impl rule__Witness__Group_4__1 ;
    public final void rule__Witness__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3528:1: ( rule__Witness__Group_4__0__Impl rule__Witness__Group_4__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3529:2: rule__Witness__Group_4__0__Impl rule__Witness__Group_4__1
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3536:1: rule__Witness__Group_4__0__Impl : ( '//' ) ;
    public final void rule__Witness__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3540:1: ( ( '//' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3541:1: ( '//' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3541:1: ( '//' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3542:1: '//'
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3555:1: rule__Witness__Group_4__1 : rule__Witness__Group_4__1__Impl ;
    public final void rule__Witness__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3559:1: ( rule__Witness__Group_4__1__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3560:2: rule__Witness__Group_4__1__Impl
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3566:1: rule__Witness__Group_4__1__Impl : ( ( rule__Witness__CommentAssignment_4_1 ) ) ;
    public final void rule__Witness__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3570:1: ( ( ( rule__Witness__CommentAssignment_4_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3571:1: ( ( rule__Witness__CommentAssignment_4_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3571:1: ( ( rule__Witness__CommentAssignment_4_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3572:1: ( rule__Witness__CommentAssignment_4_1 )
            {
             before(grammarAccess.getWitnessAccess().getCommentAssignment_4_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3573:1: ( rule__Witness__CommentAssignment_4_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3573:2: rule__Witness__CommentAssignment_4_1
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3587:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3591:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3592:2: rule__Action__Group__0__Impl rule__Action__Group__1
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3599:1: rule__Action__Group__0__Impl : ( '@' ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3603:1: ( ( '@' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3604:1: ( '@' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3604:1: ( '@' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3605:1: '@'
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3618:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3622:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3623:2: rule__Action__Group__1__Impl rule__Action__Group__2
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3630:1: rule__Action__Group__1__Impl : ( ( rule__Action__NameAssignment_1 ) ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3634:1: ( ( ( rule__Action__NameAssignment_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3635:1: ( ( rule__Action__NameAssignment_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3635:1: ( ( rule__Action__NameAssignment_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3636:1: ( rule__Action__NameAssignment_1 )
            {
             before(grammarAccess.getActionAccess().getNameAssignment_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3637:1: ( rule__Action__NameAssignment_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3637:2: rule__Action__NameAssignment_1
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3647:1: rule__Action__Group__2 : rule__Action__Group__2__Impl rule__Action__Group__3 ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3651:1: ( rule__Action__Group__2__Impl rule__Action__Group__3 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3652:2: rule__Action__Group__2__Impl rule__Action__Group__3
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3659:1: rule__Action__Group__2__Impl : ( ( rule__Action__ActionAssignment_2 )? ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3663:1: ( ( ( rule__Action__ActionAssignment_2 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3664:1: ( ( rule__Action__ActionAssignment_2 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3664:1: ( ( rule__Action__ActionAssignment_2 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3665:1: ( rule__Action__ActionAssignment_2 )?
            {
             before(grammarAccess.getActionAccess().getActionAssignment_2()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3666:1: ( rule__Action__ActionAssignment_2 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=RULE_STRING && LA40_0<=RULE_ID)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3666:2: rule__Action__ActionAssignment_2
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3676:1: rule__Action__Group__3 : rule__Action__Group__3__Impl ;
    public final void rule__Action__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3680:1: ( rule__Action__Group__3__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3681:2: rule__Action__Group__3__Impl
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3687:1: rule__Action__Group__3__Impl : ( ( rule__Action__Group_3__0 )? ) ;
    public final void rule__Action__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3691:1: ( ( ( rule__Action__Group_3__0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3692:1: ( ( rule__Action__Group_3__0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3692:1: ( ( rule__Action__Group_3__0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3693:1: ( rule__Action__Group_3__0 )?
            {
             before(grammarAccess.getActionAccess().getGroup_3()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3694:1: ( rule__Action__Group_3__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==16) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3694:2: rule__Action__Group_3__0
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3712:1: rule__Action__Group_3__0 : rule__Action__Group_3__0__Impl rule__Action__Group_3__1 ;
    public final void rule__Action__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3716:1: ( rule__Action__Group_3__0__Impl rule__Action__Group_3__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3717:2: rule__Action__Group_3__0__Impl rule__Action__Group_3__1
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3724:1: rule__Action__Group_3__0__Impl : ( '//' ) ;
    public final void rule__Action__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3728:1: ( ( '//' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3729:1: ( '//' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3729:1: ( '//' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3730:1: '//'
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3743:1: rule__Action__Group_3__1 : rule__Action__Group_3__1__Impl ;
    public final void rule__Action__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3747:1: ( rule__Action__Group_3__1__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3748:2: rule__Action__Group_3__1__Impl
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3754:1: rule__Action__Group_3__1__Impl : ( ( rule__Action__CommentAssignment_3_1 ) ) ;
    public final void rule__Action__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3758:1: ( ( ( rule__Action__CommentAssignment_3_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3759:1: ( ( rule__Action__CommentAssignment_3_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3759:1: ( ( rule__Action__CommentAssignment_3_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3760:1: ( rule__Action__CommentAssignment_3_1 )
            {
             before(grammarAccess.getActionAccess().getCommentAssignment_3_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3761:1: ( rule__Action__CommentAssignment_3_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3761:2: rule__Action__CommentAssignment_3_1
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3776:1: rule__Machine__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Machine__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3780:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3781:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3781:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3782:1: ruleEString
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3791:1: rule__Machine__CommentAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Machine__CommentAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3795:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3796:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3796:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3797:1: ruleEString
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3806:1: rule__Machine__RefinesAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Machine__RefinesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3810:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3811:1: ( ( ruleEString ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3811:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3812:1: ( ruleEString )
            {
             before(grammarAccess.getMachineAccess().getRefinesMachineCrossReference_4_1_0()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3813:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3814:1: ruleEString
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3825:1: rule__Machine__RefinesAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__Machine__RefinesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3829:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3830:1: ( ( ruleEString ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3830:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3831:1: ( ruleEString )
            {
             before(grammarAccess.getMachineAccess().getRefinesMachineCrossReference_4_2_0()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3832:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3833:1: ruleEString
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3844:1: rule__Machine__SeesAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__Machine__SeesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3848:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3849:1: ( ( ruleEString ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3849:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3850:1: ( ruleEString )
            {
             before(grammarAccess.getMachineAccess().getSeesContextCrossReference_5_1_0()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3851:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3852:1: ruleEString
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3863:1: rule__Machine__SeesAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__Machine__SeesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3867:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3868:1: ( ( ruleEString ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3868:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3869:1: ( ruleEString )
            {
             before(grammarAccess.getMachineAccess().getSeesContextCrossReference_5_2_0()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3870:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3871:1: ruleEString
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3882:1: rule__Machine__VariablesAssignment_6_1 : ( ruleVariable ) ;
    public final void rule__Machine__VariablesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3886:1: ( ( ruleVariable ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3887:1: ( ruleVariable )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3887:1: ( ruleVariable )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3888:1: ruleVariable
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3897:1: rule__Machine__VariablesAssignment_6_2 : ( ruleVariable ) ;
    public final void rule__Machine__VariablesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3901:1: ( ( ruleVariable ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3902:1: ( ruleVariable )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3902:1: ( ruleVariable )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3903:1: ruleVariable
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3912:1: rule__Machine__InvariantsAssignment_7_1 : ( ruleInvariant ) ;
    public final void rule__Machine__InvariantsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3916:1: ( ( ruleInvariant ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3917:1: ( ruleInvariant )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3917:1: ( ruleInvariant )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3918:1: ruleInvariant
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3927:1: rule__Machine__InvariantsAssignment_7_2 : ( ruleInvariant ) ;
    public final void rule__Machine__InvariantsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3931:1: ( ( ruleInvariant ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3932:1: ( ruleInvariant )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3932:1: ( ruleInvariant )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3933:1: ruleInvariant
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3942:1: rule__Machine__VariantAssignment_8_1 : ( ruleVariant ) ;
    public final void rule__Machine__VariantAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3946:1: ( ( ruleVariant ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3947:1: ( ruleVariant )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3947:1: ( ruleVariant )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3948:1: ruleVariant
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3957:1: rule__Machine__EventsAssignment_9_1 : ( ruleevent ) ;
    public final void rule__Machine__EventsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3961:1: ( ( ruleevent ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3962:1: ( ruleevent )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3962:1: ( ruleevent )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3963:1: ruleevent
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3972:1: rule__Machine__EventsAssignment_9_2 : ( ruleevent ) ;
    public final void rule__Machine__EventsAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3976:1: ( ( ruleevent ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3977:1: ( ruleevent )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3977:1: ( ruleevent )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3978:1: ruleevent
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3987:1: rule__Variable__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Variable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3991:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3992:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3992:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3993:1: ruleEString
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4002:1: rule__Variable__CommentAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Variable__CommentAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4006:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4007:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4007:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4008:1: ruleEString
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4017:1: rule__Invariant__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Invariant__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4021:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4022:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4022:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4023:1: ruleEString
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


    // $ANTLR start "rule__Invariant__TheoremAssignment_2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4032:1: rule__Invariant__TheoremAssignment_2 : ( ( 'theorem' ) ) ;
    public final void rule__Invariant__TheoremAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4036:1: ( ( ( 'theorem' ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4037:1: ( ( 'theorem' ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4037:1: ( ( 'theorem' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4038:1: ( 'theorem' )
            {
             before(grammarAccess.getInvariantAccess().getTheoremTheoremKeyword_2_0()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4039:1: ( 'theorem' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4040:1: 'theorem'
            {
             before(grammarAccess.getInvariantAccess().getTheoremTheoremKeyword_2_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Invariant__TheoremAssignment_28022); 
             after(grammarAccess.getInvariantAccess().getTheoremTheoremKeyword_2_0()); 

            }

             after(grammarAccess.getInvariantAccess().getTheoremTheoremKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__TheoremAssignment_2"


    // $ANTLR start "rule__Invariant__PredicateAssignment_3"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4055:1: rule__Invariant__PredicateAssignment_3 : ( ruleEString ) ;
    public final void rule__Invariant__PredicateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4059:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4060:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4060:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4061:1: ruleEString
            {
             before(grammarAccess.getInvariantAccess().getPredicateEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Invariant__PredicateAssignment_38061);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInvariantAccess().getPredicateEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__PredicateAssignment_3"


    // $ANTLR start "rule__Invariant__CommentAssignment_4_1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4070:1: rule__Invariant__CommentAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Invariant__CommentAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4074:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4075:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4075:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4076:1: ruleEString
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4085:1: rule__Variant__ExpressionAssignment_2 : ( ruleEString ) ;
    public final void rule__Variant__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4089:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4090:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4090:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4091:1: ruleEString
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4100:1: rule__Variant__CommentAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Variant__CommentAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4104:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4105:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4105:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4106:1: ruleEString
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4115:1: rule__Event__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Event__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4119:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4120:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4120:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4121:1: ruleEString
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4130:1: rule__Event__ExtendedAssignment_3 : ( ( 'extended' ) ) ;
    public final void rule__Event__ExtendedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4134:1: ( ( ( 'extended' ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4135:1: ( ( 'extended' ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4135:1: ( ( 'extended' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4136:1: ( 'extended' )
            {
             before(grammarAccess.getEventAccess().getExtendedExtendedKeyword_3_0()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4137:1: ( 'extended' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4138:1: 'extended'
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4153:1: rule__Event__ConvergenceAssignment_4 : ( ruleConvergence ) ;
    public final void rule__Event__ConvergenceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4157:1: ( ( ruleConvergence ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4158:1: ( ruleConvergence )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4158:1: ( ruleConvergence )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4159:1: ruleConvergence
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4168:1: rule__Event__CommentAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Event__CommentAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4172:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4173:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4173:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4174:1: ruleEString
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4183:1: rule__Event__RefinesAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__Event__RefinesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4187:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4188:1: ( ( ruleEString ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4188:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4189:1: ( ruleEString )
            {
             before(grammarAccess.getEventAccess().getRefinesEventCrossReference_6_1_0()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4190:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4191:1: ruleEString
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4202:1: rule__Event__RefinesAssignment_6_2_1 : ( ( ruleEString ) ) ;
    public final void rule__Event__RefinesAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4206:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4207:1: ( ( ruleEString ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4207:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4208:1: ( ruleEString )
            {
             before(grammarAccess.getEventAccess().getRefinesEventCrossReference_6_2_1_0()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4209:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4210:1: ruleEString
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4221:1: rule__Event__GuardsAssignment_7_1 : ( ruleGuard ) ;
    public final void rule__Event__GuardsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4225:1: ( ( ruleGuard ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4226:1: ( ruleGuard )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4226:1: ( ruleGuard )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4227:1: ruleGuard
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4236:1: rule__Event__GuardsAssignment_7_2 : ( ruleGuard ) ;
    public final void rule__Event__GuardsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4240:1: ( ( ruleGuard ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4241:1: ( ruleGuard )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4241:1: ( ruleGuard )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4242:1: ruleGuard
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4251:1: rule__Event__ParametersAssignment_8_1 : ( ruleParameter ) ;
    public final void rule__Event__ParametersAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4255:1: ( ( ruleParameter ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4256:1: ( ruleParameter )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4256:1: ( ruleParameter )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4257:1: ruleParameter
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4266:1: rule__Event__ParametersAssignment_8_2 : ( ruleParameter ) ;
    public final void rule__Event__ParametersAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4270:1: ( ( ruleParameter ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4271:1: ( ruleParameter )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4271:1: ( ruleParameter )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4272:1: ruleParameter
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4281:1: rule__Event__GuardsAssignment_8_4 : ( ruleGuard ) ;
    public final void rule__Event__GuardsAssignment_8_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4285:1: ( ( ruleGuard ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4286:1: ( ruleGuard )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4286:1: ( ruleGuard )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4287:1: ruleGuard
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4296:1: rule__Event__GuardsAssignment_8_5 : ( ruleGuard ) ;
    public final void rule__Event__GuardsAssignment_8_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4300:1: ( ( ruleGuard ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4301:1: ( ruleGuard )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4301:1: ( ruleGuard )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4302:1: ruleGuard
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4311:1: rule__Event__WitnessesAssignment_9_1 : ( ruleWitness ) ;
    public final void rule__Event__WitnessesAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4315:1: ( ( ruleWitness ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4316:1: ( ruleWitness )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4316:1: ( ruleWitness )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4317:1: ruleWitness
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4326:1: rule__Event__WitnessesAssignment_9_2 : ( ruleWitness ) ;
    public final void rule__Event__WitnessesAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4330:1: ( ( ruleWitness ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4331:1: ( ruleWitness )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4331:1: ( ruleWitness )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4332:1: ruleWitness
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4341:1: rule__Event__ActionsAssignment_10_1 : ( ruleAction ) ;
    public final void rule__Event__ActionsAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4345:1: ( ( ruleAction ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4346:1: ( ruleAction )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4346:1: ( ruleAction )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4347:1: ruleAction
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4356:1: rule__Event__ActionsAssignment_10_2 : ( ruleAction ) ;
    public final void rule__Event__ActionsAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4360:1: ( ( ruleAction ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4361:1: ( ruleAction )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4361:1: ( ruleAction )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4362:1: ruleAction
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4371:1: rule__Parameter__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4375:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4376:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4376:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4377:1: ruleEString
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4386:1: rule__Parameter__CommentAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Parameter__CommentAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4390:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4391:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4391:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4392:1: ruleEString
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4401:1: rule__Guard__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Guard__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4405:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4406:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4406:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4407:1: ruleEString
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


    // $ANTLR start "rule__Guard__TheoremAssignment_2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4416:1: rule__Guard__TheoremAssignment_2 : ( ( 'theorem' ) ) ;
    public final void rule__Guard__TheoremAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4420:1: ( ( ( 'theorem' ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4421:1: ( ( 'theorem' ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4421:1: ( ( 'theorem' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4422:1: ( 'theorem' )
            {
             before(grammarAccess.getGuardAccess().getTheoremTheoremKeyword_2_0()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4423:1: ( 'theorem' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4424:1: 'theorem'
            {
             before(grammarAccess.getGuardAccess().getTheoremTheoremKeyword_2_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Guard__TheoremAssignment_28808); 
             after(grammarAccess.getGuardAccess().getTheoremTheoremKeyword_2_0()); 

            }

             after(grammarAccess.getGuardAccess().getTheoremTheoremKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__TheoremAssignment_2"


    // $ANTLR start "rule__Guard__PredicateAssignment_3"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4439:1: rule__Guard__PredicateAssignment_3 : ( ruleEString ) ;
    public final void rule__Guard__PredicateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4443:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4444:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4444:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4445:1: ruleEString
            {
             before(grammarAccess.getGuardAccess().getPredicateEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Guard__PredicateAssignment_38847);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGuardAccess().getPredicateEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__PredicateAssignment_3"


    // $ANTLR start "rule__Guard__CommentAssignment_4_1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4454:1: rule__Guard__CommentAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Guard__CommentAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4458:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4459:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4459:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4460:1: ruleEString
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4469:1: rule__Witness__LocalGeneratedAssignment_0 : ( ( 'localGenerated' ) ) ;
    public final void rule__Witness__LocalGeneratedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4473:1: ( ( ( 'localGenerated' ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4474:1: ( ( 'localGenerated' ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4474:1: ( ( 'localGenerated' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4475:1: ( 'localGenerated' )
            {
             before(grammarAccess.getWitnessAccess().getLocalGeneratedLocalGeneratedKeyword_0_0()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4476:1: ( 'localGenerated' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4477:1: 'localGenerated'
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4492:1: rule__Witness__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Witness__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4496:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4497:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4497:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4498:1: ruleEString
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4507:1: rule__Witness__PredicateAssignment_3 : ( ruleEString ) ;
    public final void rule__Witness__PredicateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4511:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4512:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4512:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4513:1: ruleEString
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4522:1: rule__Witness__CommentAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Witness__CommentAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4526:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4527:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4527:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4528:1: ruleEString
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4537:1: rule__Action__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Action__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4541:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4542:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4542:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4543:1: ruleEString
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4552:1: rule__Action__ActionAssignment_2 : ( ruleEString ) ;
    public final void rule__Action__ActionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4556:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4557:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4557:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4558:1: ruleEString
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4567:1: rule__Action__CommentAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Action__CommentAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4571:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4572:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4572:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4573:1: ruleEString
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
        public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter423 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameter430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group__0_in_ruleParameter456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGuard_in_entryRuleGuard483 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGuard490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guard__Group__0_in_ruleGuard516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWitness_in_entryRuleWitness543 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWitness550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Witness__Group__0_in_ruleWitness576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAction_in_entryRuleAction603 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAction610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group__0_in_ruleAction636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Convergence__Alternatives_in_ruleConvergence673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Convergence__Alternatives758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Convergence__Alternatives779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Convergence__Alternatives800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group__0__Impl_in_rule__Machine__Group__0833 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Machine__Group__1_in_rule__Machine__Group__0836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group__1__Impl_in_rule__Machine__Group__1894 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Machine__Group__2_in_rule__Machine__Group__1897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Machine__Group__1__Impl925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group__2__Impl_in_rule__Machine__Group__2956 = new BitSet(new long[]{0x00000000007F8000L});
        public static final BitSet FOLLOW_rule__Machine__Group__3_in_rule__Machine__Group__2959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__NameAssignment_2_in_rule__Machine__Group__2__Impl986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group__3__Impl_in_rule__Machine__Group__31016 = new BitSet(new long[]{0x00000000007F8000L});
        public static final BitSet FOLLOW_rule__Machine__Group__4_in_rule__Machine__Group__31019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_3__0_in_rule__Machine__Group__3__Impl1046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group__4__Impl_in_rule__Machine__Group__41077 = new BitSet(new long[]{0x00000000007F8000L});
        public static final BitSet FOLLOW_rule__Machine__Group__5_in_rule__Machine__Group__41080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_4__0_in_rule__Machine__Group__4__Impl1107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group__5__Impl_in_rule__Machine__Group__51138 = new BitSet(new long[]{0x00000000007F8000L});
        public static final BitSet FOLLOW_rule__Machine__Group__6_in_rule__Machine__Group__51141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_5__0_in_rule__Machine__Group__5__Impl1168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group__6__Impl_in_rule__Machine__Group__61199 = new BitSet(new long[]{0x00000000007F8000L});
        public static final BitSet FOLLOW_rule__Machine__Group__7_in_rule__Machine__Group__61202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_6__0_in_rule__Machine__Group__6__Impl1229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group__7__Impl_in_rule__Machine__Group__71260 = new BitSet(new long[]{0x00000000007F8000L});
        public static final BitSet FOLLOW_rule__Machine__Group__8_in_rule__Machine__Group__71263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_7__0_in_rule__Machine__Group__7__Impl1290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group__8__Impl_in_rule__Machine__Group__81321 = new BitSet(new long[]{0x00000000007F8000L});
        public static final BitSet FOLLOW_rule__Machine__Group__9_in_rule__Machine__Group__81324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_8__0_in_rule__Machine__Group__8__Impl1351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group__9__Impl_in_rule__Machine__Group__91382 = new BitSet(new long[]{0x00000000007F8000L});
        public static final BitSet FOLLOW_rule__Machine__Group__10_in_rule__Machine__Group__91385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_9__0_in_rule__Machine__Group__9__Impl1412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group__10__Impl_in_rule__Machine__Group__101443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Machine__Group__10__Impl1471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_3__0__Impl_in_rule__Machine__Group_3__01524 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Machine__Group_3__1_in_rule__Machine__Group_3__01527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Machine__Group_3__0__Impl1555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_3__1__Impl_in_rule__Machine__Group_3__11586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__CommentAssignment_3_1_in_rule__Machine__Group_3__1__Impl1613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_4__0__Impl_in_rule__Machine__Group_4__01647 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Machine__Group_4__1_in_rule__Machine__Group_4__01650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Machine__Group_4__0__Impl1678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_4__1__Impl_in_rule__Machine__Group_4__11709 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Machine__Group_4__2_in_rule__Machine__Group_4__11712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__RefinesAssignment_4_1_in_rule__Machine__Group_4__1__Impl1739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_4__2__Impl_in_rule__Machine__Group_4__21769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__RefinesAssignment_4_2_in_rule__Machine__Group_4__2__Impl1796 = new BitSet(new long[]{0x0000000000000032L});
        public static final BitSet FOLLOW_rule__Machine__Group_5__0__Impl_in_rule__Machine__Group_5__01833 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Machine__Group_5__1_in_rule__Machine__Group_5__01836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Machine__Group_5__0__Impl1864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_5__1__Impl_in_rule__Machine__Group_5__11895 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Machine__Group_5__2_in_rule__Machine__Group_5__11898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__SeesAssignment_5_1_in_rule__Machine__Group_5__1__Impl1925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_5__2__Impl_in_rule__Machine__Group_5__21955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__SeesAssignment_5_2_in_rule__Machine__Group_5__2__Impl1982 = new BitSet(new long[]{0x0000000000000032L});
        public static final BitSet FOLLOW_rule__Machine__Group_6__0__Impl_in_rule__Machine__Group_6__02019 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Machine__Group_6__1_in_rule__Machine__Group_6__02022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Machine__Group_6__0__Impl2050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_6__1__Impl_in_rule__Machine__Group_6__12081 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Machine__Group_6__2_in_rule__Machine__Group_6__12084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__VariablesAssignment_6_1_in_rule__Machine__Group_6__1__Impl2111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_6__2__Impl_in_rule__Machine__Group_6__22141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__VariablesAssignment_6_2_in_rule__Machine__Group_6__2__Impl2168 = new BitSet(new long[]{0x0000000000000032L});
        public static final BitSet FOLLOW_rule__Machine__Group_7__0__Impl_in_rule__Machine__Group_7__02205 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Machine__Group_7__1_in_rule__Machine__Group_7__02208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Machine__Group_7__0__Impl2236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_7__1__Impl_in_rule__Machine__Group_7__12267 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Machine__Group_7__2_in_rule__Machine__Group_7__12270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__InvariantsAssignment_7_1_in_rule__Machine__Group_7__1__Impl2297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_7__2__Impl_in_rule__Machine__Group_7__22327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__InvariantsAssignment_7_2_in_rule__Machine__Group_7__2__Impl2354 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_rule__Machine__Group_8__0__Impl_in_rule__Machine__Group_8__02391 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Machine__Group_8__1_in_rule__Machine__Group_8__02394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Machine__Group_8__0__Impl2422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_8__1__Impl_in_rule__Machine__Group_8__12453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__VariantAssignment_8_1_in_rule__Machine__Group_8__1__Impl2480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_9__0__Impl_in_rule__Machine__Group_9__02514 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Machine__Group_9__1_in_rule__Machine__Group_9__02517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Machine__Group_9__0__Impl2545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_9__1__Impl_in_rule__Machine__Group_9__12576 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Machine__Group_9__2_in_rule__Machine__Group_9__12579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__EventsAssignment_9_1_in_rule__Machine__Group_9__1__Impl2606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_9__2__Impl_in_rule__Machine__Group_9__22636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__EventsAssignment_9_2_in_rule__Machine__Group_9__2__Impl2663 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__02700 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__02703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__12761 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Variable__Group__2_in_rule__Variable__Group__12764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__NameAssignment_1_in_rule__Variable__Group__1__Impl2791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group__2__Impl_in_rule__Variable__Group__22821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group_2__0_in_rule__Variable__Group__2__Impl2848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group_2__0__Impl_in_rule__Variable__Group_2__02885 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Variable__Group_2__1_in_rule__Variable__Group_2__02888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Variable__Group_2__0__Impl2916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group_2__1__Impl_in_rule__Variable__Group_2__12947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__CommentAssignment_2_1_in_rule__Variable__Group_2__1__Impl2974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group__0__Impl_in_rule__Invariant__Group__03008 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Invariant__Group__1_in_rule__Invariant__Group__03011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Invariant__Group__0__Impl3039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group__1__Impl_in_rule__Invariant__Group__13070 = new BitSet(new long[]{0x0000000200010030L});
        public static final BitSet FOLLOW_rule__Invariant__Group__2_in_rule__Invariant__Group__13073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__NameAssignment_1_in_rule__Invariant__Group__1__Impl3100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group__2__Impl_in_rule__Invariant__Group__23130 = new BitSet(new long[]{0x0000000200010030L});
        public static final BitSet FOLLOW_rule__Invariant__Group__3_in_rule__Invariant__Group__23133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__TheoremAssignment_2_in_rule__Invariant__Group__2__Impl3160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group__3__Impl_in_rule__Invariant__Group__33191 = new BitSet(new long[]{0x0000000200010030L});
        public static final BitSet FOLLOW_rule__Invariant__Group__4_in_rule__Invariant__Group__33194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__PredicateAssignment_3_in_rule__Invariant__Group__3__Impl3221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group__4__Impl_in_rule__Invariant__Group__43252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group_4__0_in_rule__Invariant__Group__4__Impl3279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group_4__0__Impl_in_rule__Invariant__Group_4__03320 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Invariant__Group_4__1_in_rule__Invariant__Group_4__03323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Invariant__Group_4__0__Impl3351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group_4__1__Impl_in_rule__Invariant__Group_4__13382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__CommentAssignment_4_1_in_rule__Invariant__Group_4__1__Impl3409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variant__Group__0__Impl_in_rule__Variant__Group__03443 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Variant__Group__1_in_rule__Variant__Group__03446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Variant__Group__0__Impl3474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variant__Group__1__Impl_in_rule__Variant__Group__13505 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_rule__Variant__Group__2_in_rule__Variant__Group__13508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Variant__Group__1__Impl3536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variant__Group__2__Impl_in_rule__Variant__Group__23567 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_rule__Variant__Group__3_in_rule__Variant__Group__23570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variant__ExpressionAssignment_2_in_rule__Variant__Group__2__Impl3597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variant__Group__3__Impl_in_rule__Variant__Group__33628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variant__Group_3__0_in_rule__Variant__Group__3__Impl3655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variant__Group_3__0__Impl_in_rule__Variant__Group_3__03693 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Variant__Group_3__1_in_rule__Variant__Group_3__03696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Variant__Group_3__0__Impl3724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variant__Group_3__1__Impl_in_rule__Variant__Group_3__13755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variant__CommentAssignment_3_1_in_rule__Variant__Group_3__1__Impl3782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__03816 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Event__Group__1_in_rule__Event__Group__03819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__13877 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Event__Group__2_in_rule__Event__Group__13880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Event__Group__1__Impl3908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group__2__Impl_in_rule__Event__Group__23939 = new BitSet(new long[]{0x00000005B003B800L});
        public static final BitSet FOLLOW_rule__Event__Group__3_in_rule__Event__Group__23942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__NameAssignment_2_in_rule__Event__Group__2__Impl3969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group__3__Impl_in_rule__Event__Group__33999 = new BitSet(new long[]{0x00000005B003B800L});
        public static final BitSet FOLLOW_rule__Event__Group__4_in_rule__Event__Group__34002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__ExtendedAssignment_3_in_rule__Event__Group__3__Impl4029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group__4__Impl_in_rule__Event__Group__44060 = new BitSet(new long[]{0x00000005B003B800L});
        public static final BitSet FOLLOW_rule__Event__Group__5_in_rule__Event__Group__44063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__ConvergenceAssignment_4_in_rule__Event__Group__4__Impl4090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group__5__Impl_in_rule__Event__Group__54121 = new BitSet(new long[]{0x00000005B003B800L});
        public static final BitSet FOLLOW_rule__Event__Group__6_in_rule__Event__Group__54124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_5__0_in_rule__Event__Group__5__Impl4151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group__6__Impl_in_rule__Event__Group__64182 = new BitSet(new long[]{0x00000005B003B800L});
        public static final BitSet FOLLOW_rule__Event__Group__7_in_rule__Event__Group__64185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_6__0_in_rule__Event__Group__6__Impl4212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group__7__Impl_in_rule__Event__Group__74243 = new BitSet(new long[]{0x00000005B003B800L});
        public static final BitSet FOLLOW_rule__Event__Group__8_in_rule__Event__Group__74246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_7__0_in_rule__Event__Group__7__Impl4273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group__8__Impl_in_rule__Event__Group__84304 = new BitSet(new long[]{0x00000005B003B800L});
        public static final BitSet FOLLOW_rule__Event__Group__9_in_rule__Event__Group__84307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_8__0_in_rule__Event__Group__8__Impl4334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group__9__Impl_in_rule__Event__Group__94365 = new BitSet(new long[]{0x00000005B003B800L});
        public static final BitSet FOLLOW_rule__Event__Group__10_in_rule__Event__Group__94368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_9__0_in_rule__Event__Group__9__Impl4395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group__10__Impl_in_rule__Event__Group__104426 = new BitSet(new long[]{0x00000005B003B800L});
        public static final BitSet FOLLOW_rule__Event__Group__11_in_rule__Event__Group__104429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_10__0_in_rule__Event__Group__10__Impl4456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group__11__Impl_in_rule__Event__Group__114487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Event__Group__11__Impl4515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_5__0__Impl_in_rule__Event__Group_5__04570 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Event__Group_5__1_in_rule__Event__Group_5__04573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Event__Group_5__0__Impl4601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_5__1__Impl_in_rule__Event__Group_5__14632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__CommentAssignment_5_1_in_rule__Event__Group_5__1__Impl4659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_6__0__Impl_in_rule__Event__Group_6__04693 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Event__Group_6__1_in_rule__Event__Group_6__04696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Event__Group_6__0__Impl4724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_6__1__Impl_in_rule__Event__Group_6__14755 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Event__Group_6__2_in_rule__Event__Group_6__14758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__RefinesAssignment_6_1_in_rule__Event__Group_6__1__Impl4785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_6__2__Impl_in_rule__Event__Group_6__24815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_6_2__0_in_rule__Event__Group_6__2__Impl4842 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__Event__Group_6_2__0__Impl_in_rule__Event__Group_6_2__04879 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Event__Group_6_2__1_in_rule__Event__Group_6_2__04882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Event__Group_6_2__0__Impl4910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_6_2__1__Impl_in_rule__Event__Group_6_2__14941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__RefinesAssignment_6_2_1_in_rule__Event__Group_6_2__1__Impl4968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_7__0__Impl_in_rule__Event__Group_7__05002 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Event__Group_7__1_in_rule__Event__Group_7__05005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Event__Group_7__0__Impl5033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_7__1__Impl_in_rule__Event__Group_7__15064 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Event__Group_7__2_in_rule__Event__Group_7__15067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__GuardsAssignment_7_1_in_rule__Event__Group_7__1__Impl5094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_7__2__Impl_in_rule__Event__Group_7__25124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__GuardsAssignment_7_2_in_rule__Event__Group_7__2__Impl5151 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_rule__Event__Group_8__0__Impl_in_rule__Event__Group_8__05188 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Event__Group_8__1_in_rule__Event__Group_8__05191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Event__Group_8__0__Impl5219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_8__1__Impl_in_rule__Event__Group_8__15250 = new BitSet(new long[]{0x0000000040000030L});
        public static final BitSet FOLLOW_rule__Event__Group_8__2_in_rule__Event__Group_8__15253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__ParametersAssignment_8_1_in_rule__Event__Group_8__1__Impl5280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_8__2__Impl_in_rule__Event__Group_8__25310 = new BitSet(new long[]{0x0000000040000030L});
        public static final BitSet FOLLOW_rule__Event__Group_8__3_in_rule__Event__Group_8__25313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__ParametersAssignment_8_2_in_rule__Event__Group_8__2__Impl5340 = new BitSet(new long[]{0x0000000000000032L});
        public static final BitSet FOLLOW_rule__Event__Group_8__3__Impl_in_rule__Event__Group_8__35371 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Event__Group_8__4_in_rule__Event__Group_8__35374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Event__Group_8__3__Impl5402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_8__4__Impl_in_rule__Event__Group_8__45433 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Event__Group_8__5_in_rule__Event__Group_8__45436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__GuardsAssignment_8_4_in_rule__Event__Group_8__4__Impl5463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_8__5__Impl_in_rule__Event__Group_8__55493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__GuardsAssignment_8_5_in_rule__Event__Group_8__5__Impl5520 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_rule__Event__Group_9__0__Impl_in_rule__Event__Group_9__05563 = new BitSet(new long[]{0x0000000800800000L});
        public static final BitSet FOLLOW_rule__Event__Group_9__1_in_rule__Event__Group_9__05566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Event__Group_9__0__Impl5594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_9__1__Impl_in_rule__Event__Group_9__15625 = new BitSet(new long[]{0x0000000800800000L});
        public static final BitSet FOLLOW_rule__Event__Group_9__2_in_rule__Event__Group_9__15628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__WitnessesAssignment_9_1_in_rule__Event__Group_9__1__Impl5655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_9__2__Impl_in_rule__Event__Group_9__25685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__WitnessesAssignment_9_2_in_rule__Event__Group_9__2__Impl5712 = new BitSet(new long[]{0x0000000800800002L});
        public static final BitSet FOLLOW_rule__Event__Group_10__0__Impl_in_rule__Event__Group_10__05749 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Event__Group_10__1_in_rule__Event__Group_10__05752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Event__Group_10__0__Impl5780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_10__1__Impl_in_rule__Event__Group_10__15811 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Event__Group_10__2_in_rule__Event__Group_10__15814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__ActionsAssignment_10_1_in_rule__Event__Group_10__1__Impl5841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_10__2__Impl_in_rule__Event__Group_10__25871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__ActionsAssignment_10_2_in_rule__Event__Group_10__2__Impl5898 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__05935 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__05938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__15996 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__15999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__NameAssignment_1_in_rule__Parameter__Group__1__Impl6026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__26056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_2__0_in_rule__Parameter__Group__2__Impl6083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_2__0__Impl_in_rule__Parameter__Group_2__06120 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Parameter__Group_2__1_in_rule__Parameter__Group_2__06123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Parameter__Group_2__0__Impl6151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_2__1__Impl_in_rule__Parameter__Group_2__16182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__CommentAssignment_2_1_in_rule__Parameter__Group_2__1__Impl6209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guard__Group__0__Impl_in_rule__Guard__Group__06243 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Guard__Group__1_in_rule__Guard__Group__06246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Guard__Group__0__Impl6274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guard__Group__1__Impl_in_rule__Guard__Group__16305 = new BitSet(new long[]{0x0000000200000030L});
        public static final BitSet FOLLOW_rule__Guard__Group__2_in_rule__Guard__Group__16308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guard__NameAssignment_1_in_rule__Guard__Group__1__Impl6335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guard__Group__2__Impl_in_rule__Guard__Group__26365 = new BitSet(new long[]{0x0000000200000030L});
        public static final BitSet FOLLOW_rule__Guard__Group__3_in_rule__Guard__Group__26368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guard__TheoremAssignment_2_in_rule__Guard__Group__2__Impl6395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guard__Group__3__Impl_in_rule__Guard__Group__36426 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Guard__Group__4_in_rule__Guard__Group__36429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guard__PredicateAssignment_3_in_rule__Guard__Group__3__Impl6456 = new BitSet(new long[]{0x0000000000000002L});
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
        public static final BitSet FOLLOW_33_in_rule__Invariant__TheoremAssignment_28022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Invariant__PredicateAssignment_38061 = new BitSet(new long[]{0x0000000000000002L});
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
        public static final BitSet FOLLOW_33_in_rule__Guard__TheoremAssignment_28808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Guard__PredicateAssignment_38847 = new BitSet(new long[]{0x0000000000000002L});
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