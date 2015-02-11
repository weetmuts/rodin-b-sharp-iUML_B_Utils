package ac.soton.uk.iumlb.xtext.ui.contentassist.antlr.internal; 

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
import ac.soton.uk.iumlb.xtext.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'MULTIVAR'", "'SINGLEVAR'", "'REFINEDVAR'", "'Statemachine'", "'>'", "'translation'", "'elaborates'", "'refines'", "'nodes'", "','", "'transitions'", "'Transition'", "'target'", "'source'", "'parameters'", "'{'", "'}'", "'guards'", "'actions'", "'witnesses'", "'State'", "'statemachines'", "'invariants'", "'Initial'", "'internalId'", "'Final'", "'Any'", "'Junction'", "'Fork'", "'Invariant'", "'@'", "'TypedParameter'", "'type'", "'action'", "'Witness'", "'extended'", "'theorem'"
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
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=4;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g"; }


     
     	private DslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(DslGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleStatemachine"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:60:1: entryRuleStatemachine : ruleStatemachine EOF ;
    public final void entryRuleStatemachine() throws RecognitionException {
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:61:1: ( ruleStatemachine EOF )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:62:1: ruleStatemachine EOF
            {
             before(grammarAccess.getStatemachineRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStatemachine_in_entryRuleStatemachine61);
            ruleStatemachine();

            state._fsp--;

             after(grammarAccess.getStatemachineRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStatemachine68); 

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
    // $ANTLR end "entryRuleStatemachine"


    // $ANTLR start "ruleStatemachine"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:69:1: ruleStatemachine : ( ( rule__Statemachine__Group__0 ) ) ;
    public final void ruleStatemachine() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:73:2: ( ( ( rule__Statemachine__Group__0 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:74:1: ( ( rule__Statemachine__Group__0 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:74:1: ( ( rule__Statemachine__Group__0 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:75:1: ( rule__Statemachine__Group__0 )
            {
             before(grammarAccess.getStatemachineAccess().getGroup()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:76:1: ( rule__Statemachine__Group__0 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:76:2: rule__Statemachine__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group__0_in_ruleStatemachine94);
            rule__Statemachine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatemachineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatemachine"


    // $ANTLR start "entryRuleAbstractNode"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:88:1: entryRuleAbstractNode : ruleAbstractNode EOF ;
    public final void entryRuleAbstractNode() throws RecognitionException {
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:89:1: ( ruleAbstractNode EOF )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:90:1: ruleAbstractNode EOF
            {
             before(grammarAccess.getAbstractNodeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractNode_in_entryRuleAbstractNode121);
            ruleAbstractNode();

            state._fsp--;

             after(grammarAccess.getAbstractNodeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractNode128); 

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
    // $ANTLR end "entryRuleAbstractNode"


    // $ANTLR start "ruleAbstractNode"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:97:1: ruleAbstractNode : ( ( rule__AbstractNode__Alternatives ) ) ;
    public final void ruleAbstractNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:101:2: ( ( ( rule__AbstractNode__Alternatives ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:102:1: ( ( rule__AbstractNode__Alternatives ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:102:1: ( ( rule__AbstractNode__Alternatives ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:103:1: ( rule__AbstractNode__Alternatives )
            {
             before(grammarAccess.getAbstractNodeAccess().getAlternatives()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:104:1: ( rule__AbstractNode__Alternatives )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:104:2: rule__AbstractNode__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__AbstractNode__Alternatives_in_ruleAbstractNode154);
            rule__AbstractNode__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractNodeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractNode"


    // $ANTLR start "entryRuleEString"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:118:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:119:1: ( ruleEString EOF )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:120:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString183);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString190); 

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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:127:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:131:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:132:1: ( ( rule__EString__Alternatives ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:132:1: ( ( rule__EString__Alternatives ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:133:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:134:1: ( rule__EString__Alternatives )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:134:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString216);
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


    // $ANTLR start "entryRuleTransition"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:146:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:147:1: ( ruleTransition EOF )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:148:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransition_in_entryRuleTransition243);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransition250); 

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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:155:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:159:2: ( ( ( rule__Transition__Group__0 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:160:1: ( ( rule__Transition__Group__0 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:160:1: ( ( rule__Transition__Group__0 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:161:1: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:162:1: ( rule__Transition__Group__0 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:162:2: rule__Transition__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__0_in_ruleTransition276);
            rule__Transition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleState"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:176:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:177:1: ( ruleState EOF )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:178:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleState_in_entryRuleState305);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleState312); 

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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:185:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:189:2: ( ( ( rule__State__Group__0 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:190:1: ( ( rule__State__Group__0 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:190:1: ( ( rule__State__Group__0 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:191:1: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:192:1: ( rule__State__Group__0 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:192:2: rule__State__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group__0_in_ruleState338);
            rule__State__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleInitial"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:204:1: entryRuleInitial : ruleInitial EOF ;
    public final void entryRuleInitial() throws RecognitionException {
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:205:1: ( ruleInitial EOF )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:206:1: ruleInitial EOF
            {
             before(grammarAccess.getInitialRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInitial_in_entryRuleInitial365);
            ruleInitial();

            state._fsp--;

             after(grammarAccess.getInitialRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInitial372); 

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
    // $ANTLR end "entryRuleInitial"


    // $ANTLR start "ruleInitial"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:213:1: ruleInitial : ( ( rule__Initial__Group__0 ) ) ;
    public final void ruleInitial() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:217:2: ( ( ( rule__Initial__Group__0 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:218:1: ( ( rule__Initial__Group__0 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:218:1: ( ( rule__Initial__Group__0 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:219:1: ( rule__Initial__Group__0 )
            {
             before(grammarAccess.getInitialAccess().getGroup()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:220:1: ( rule__Initial__Group__0 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:220:2: rule__Initial__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Initial__Group__0_in_ruleInitial398);
            rule__Initial__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInitialAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInitial"


    // $ANTLR start "entryRuleFinal"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:232:1: entryRuleFinal : ruleFinal EOF ;
    public final void entryRuleFinal() throws RecognitionException {
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:233:1: ( ruleFinal EOF )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:234:1: ruleFinal EOF
            {
             before(grammarAccess.getFinalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFinal_in_entryRuleFinal425);
            ruleFinal();

            state._fsp--;

             after(grammarAccess.getFinalRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFinal432); 

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
    // $ANTLR end "entryRuleFinal"


    // $ANTLR start "ruleFinal"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:241:1: ruleFinal : ( ( rule__Final__Group__0 ) ) ;
    public final void ruleFinal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:245:2: ( ( ( rule__Final__Group__0 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:246:1: ( ( rule__Final__Group__0 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:246:1: ( ( rule__Final__Group__0 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:247:1: ( rule__Final__Group__0 )
            {
             before(grammarAccess.getFinalAccess().getGroup()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:248:1: ( rule__Final__Group__0 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:248:2: rule__Final__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Final__Group__0_in_ruleFinal458);
            rule__Final__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFinalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFinal"


    // $ANTLR start "entryRuleAny"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:260:1: entryRuleAny : ruleAny EOF ;
    public final void entryRuleAny() throws RecognitionException {
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:261:1: ( ruleAny EOF )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:262:1: ruleAny EOF
            {
             before(grammarAccess.getAnyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAny_in_entryRuleAny485);
            ruleAny();

            state._fsp--;

             after(grammarAccess.getAnyRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAny492); 

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
    // $ANTLR end "entryRuleAny"


    // $ANTLR start "ruleAny"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:269:1: ruleAny : ( ( rule__Any__Group__0 ) ) ;
    public final void ruleAny() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:273:2: ( ( ( rule__Any__Group__0 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:274:1: ( ( rule__Any__Group__0 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:274:1: ( ( rule__Any__Group__0 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:275:1: ( rule__Any__Group__0 )
            {
             before(grammarAccess.getAnyAccess().getGroup()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:276:1: ( rule__Any__Group__0 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:276:2: rule__Any__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Any__Group__0_in_ruleAny518);
            rule__Any__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAny"


    // $ANTLR start "entryRuleJunction"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:288:1: entryRuleJunction : ruleJunction EOF ;
    public final void entryRuleJunction() throws RecognitionException {
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:289:1: ( ruleJunction EOF )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:290:1: ruleJunction EOF
            {
             before(grammarAccess.getJunctionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleJunction_in_entryRuleJunction545);
            ruleJunction();

            state._fsp--;

             after(grammarAccess.getJunctionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleJunction552); 

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
    // $ANTLR end "entryRuleJunction"


    // $ANTLR start "ruleJunction"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:297:1: ruleJunction : ( ( rule__Junction__Group__0 ) ) ;
    public final void ruleJunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:301:2: ( ( ( rule__Junction__Group__0 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:302:1: ( ( rule__Junction__Group__0 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:302:1: ( ( rule__Junction__Group__0 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:303:1: ( rule__Junction__Group__0 )
            {
             before(grammarAccess.getJunctionAccess().getGroup()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:304:1: ( rule__Junction__Group__0 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:304:2: rule__Junction__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Junction__Group__0_in_ruleJunction578);
            rule__Junction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJunction"


    // $ANTLR start "entryRuleFork"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:316:1: entryRuleFork : ruleFork EOF ;
    public final void entryRuleFork() throws RecognitionException {
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:317:1: ( ruleFork EOF )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:318:1: ruleFork EOF
            {
             before(grammarAccess.getForkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFork_in_entryRuleFork605);
            ruleFork();

            state._fsp--;

             after(grammarAccess.getForkRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFork612); 

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
    // $ANTLR end "entryRuleFork"


    // $ANTLR start "ruleFork"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:325:1: ruleFork : ( ( rule__Fork__Group__0 ) ) ;
    public final void ruleFork() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:329:2: ( ( ( rule__Fork__Group__0 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:330:1: ( ( rule__Fork__Group__0 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:330:1: ( ( rule__Fork__Group__0 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:331:1: ( rule__Fork__Group__0 )
            {
             before(grammarAccess.getForkAccess().getGroup()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:332:1: ( rule__Fork__Group__0 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:332:2: rule__Fork__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fork__Group__0_in_ruleFork638);
            rule__Fork__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFork"


    // $ANTLR start "entryRuleInvariant"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:344:1: entryRuleInvariant : ruleInvariant EOF ;
    public final void entryRuleInvariant() throws RecognitionException {
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:345:1: ( ruleInvariant EOF )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:346:1: ruleInvariant EOF
            {
             before(grammarAccess.getInvariantRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInvariant_in_entryRuleInvariant665);
            ruleInvariant();

            state._fsp--;

             after(grammarAccess.getInvariantRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInvariant672); 

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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:353:1: ruleInvariant : ( ( rule__Invariant__Group__0 ) ) ;
    public final void ruleInvariant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:357:2: ( ( ( rule__Invariant__Group__0 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:358:1: ( ( rule__Invariant__Group__0 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:358:1: ( ( rule__Invariant__Group__0 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:359:1: ( rule__Invariant__Group__0 )
            {
             before(grammarAccess.getInvariantAccess().getGroup()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:360:1: ( rule__Invariant__Group__0 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:360:2: rule__Invariant__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__0_in_ruleInvariant698);
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


    // $ANTLR start "entryRuleTypedParameter"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:372:1: entryRuleTypedParameter : ruleTypedParameter EOF ;
    public final void entryRuleTypedParameter() throws RecognitionException {
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:373:1: ( ruleTypedParameter EOF )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:374:1: ruleTypedParameter EOF
            {
             before(grammarAccess.getTypedParameterRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTypedParameter_in_entryRuleTypedParameter725);
            ruleTypedParameter();

            state._fsp--;

             after(grammarAccess.getTypedParameterRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypedParameter732); 

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
    // $ANTLR end "entryRuleTypedParameter"


    // $ANTLR start "ruleTypedParameter"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:381:1: ruleTypedParameter : ( ( rule__TypedParameter__Group__0 ) ) ;
    public final void ruleTypedParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:385:2: ( ( ( rule__TypedParameter__Group__0 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:386:1: ( ( rule__TypedParameter__Group__0 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:386:1: ( ( rule__TypedParameter__Group__0 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:387:1: ( rule__TypedParameter__Group__0 )
            {
             before(grammarAccess.getTypedParameterAccess().getGroup()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:388:1: ( rule__TypedParameter__Group__0 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:388:2: rule__TypedParameter__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedParameter__Group__0_in_ruleTypedParameter758);
            rule__TypedParameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypedParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypedParameter"


    // $ANTLR start "entryRuleGuard"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:400:1: entryRuleGuard : ruleGuard EOF ;
    public final void entryRuleGuard() throws RecognitionException {
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:401:1: ( ruleGuard EOF )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:402:1: ruleGuard EOF
            {
             before(grammarAccess.getGuardRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGuard_in_entryRuleGuard785);
            ruleGuard();

            state._fsp--;

             after(grammarAccess.getGuardRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGuard792); 

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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:409:1: ruleGuard : ( ( rule__Guard__Group__0 ) ) ;
    public final void ruleGuard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:413:2: ( ( ( rule__Guard__Group__0 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:414:1: ( ( rule__Guard__Group__0 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:414:1: ( ( rule__Guard__Group__0 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:415:1: ( rule__Guard__Group__0 )
            {
             before(grammarAccess.getGuardAccess().getGroup()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:416:1: ( rule__Guard__Group__0 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:416:2: rule__Guard__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group__0_in_ruleGuard818);
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


    // $ANTLR start "entryRuleAction"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:428:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:429:1: ( ruleAction EOF )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:430:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAction_in_entryRuleAction845);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAction852); 

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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:437:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:441:2: ( ( ( rule__Action__Group__0 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:442:1: ( ( rule__Action__Group__0 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:442:1: ( ( rule__Action__Group__0 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:443:1: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:444:1: ( rule__Action__Group__0 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:444:2: rule__Action__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__0_in_ruleAction878);
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


    // $ANTLR start "entryRuleWitness"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:456:1: entryRuleWitness : ruleWitness EOF ;
    public final void entryRuleWitness() throws RecognitionException {
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:457:1: ( ruleWitness EOF )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:458:1: ruleWitness EOF
            {
             before(grammarAccess.getWitnessRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWitness_in_entryRuleWitness905);
            ruleWitness();

            state._fsp--;

             after(grammarAccess.getWitnessRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWitness912); 

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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:465:1: ruleWitness : ( ( rule__Witness__Group__0 ) ) ;
    public final void ruleWitness() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:469:2: ( ( ( rule__Witness__Group__0 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:470:1: ( ( rule__Witness__Group__0 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:470:1: ( ( rule__Witness__Group__0 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:471:1: ( rule__Witness__Group__0 )
            {
             before(grammarAccess.getWitnessAccess().getGroup()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:472:1: ( rule__Witness__Group__0 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:472:2: rule__Witness__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Witness__Group__0_in_ruleWitness938);
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


    // $ANTLR start "ruleTranslationKind"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:485:1: ruleTranslationKind : ( ( rule__TranslationKind__Alternatives ) ) ;
    public final void ruleTranslationKind() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:489:1: ( ( ( rule__TranslationKind__Alternatives ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:490:1: ( ( rule__TranslationKind__Alternatives ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:490:1: ( ( rule__TranslationKind__Alternatives ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:491:1: ( rule__TranslationKind__Alternatives )
            {
             before(grammarAccess.getTranslationKindAccess().getAlternatives()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:492:1: ( rule__TranslationKind__Alternatives )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:492:2: rule__TranslationKind__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__TranslationKind__Alternatives_in_ruleTranslationKind975);
            rule__TranslationKind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTranslationKindAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTranslationKind"


    // $ANTLR start "rule__AbstractNode__Alternatives"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:503:1: rule__AbstractNode__Alternatives : ( ( ruleState ) | ( ruleInitial ) | ( ruleFinal ) | ( ruleAny ) | ( ruleJunction ) | ( ruleFork ) );
    public final void rule__AbstractNode__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:507:1: ( ( ruleState ) | ( ruleInitial ) | ( ruleFinal ) | ( ruleAny ) | ( ruleJunction ) | ( ruleFork ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt1=1;
                }
                break;
            case 34:
                {
                alt1=2;
                }
                break;
            case 36:
                {
                alt1=3;
                }
                break;
            case 37:
                {
                alt1=4;
                }
                break;
            case 38:
                {
                alt1=5;
                }
                break;
            case 39:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:508:1: ( ruleState )
                    {
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:508:1: ( ruleState )
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:509:1: ruleState
                    {
                     before(grammarAccess.getAbstractNodeAccess().getStateParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleState_in_rule__AbstractNode__Alternatives1010);
                    ruleState();

                    state._fsp--;

                     after(grammarAccess.getAbstractNodeAccess().getStateParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:514:6: ( ruleInitial )
                    {
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:514:6: ( ruleInitial )
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:515:1: ruleInitial
                    {
                     before(grammarAccess.getAbstractNodeAccess().getInitialParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleInitial_in_rule__AbstractNode__Alternatives1027);
                    ruleInitial();

                    state._fsp--;

                     after(grammarAccess.getAbstractNodeAccess().getInitialParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:520:6: ( ruleFinal )
                    {
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:520:6: ( ruleFinal )
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:521:1: ruleFinal
                    {
                     before(grammarAccess.getAbstractNodeAccess().getFinalParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleFinal_in_rule__AbstractNode__Alternatives1044);
                    ruleFinal();

                    state._fsp--;

                     after(grammarAccess.getAbstractNodeAccess().getFinalParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:526:6: ( ruleAny )
                    {
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:526:6: ( ruleAny )
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:527:1: ruleAny
                    {
                     before(grammarAccess.getAbstractNodeAccess().getAnyParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleAny_in_rule__AbstractNode__Alternatives1061);
                    ruleAny();

                    state._fsp--;

                     after(grammarAccess.getAbstractNodeAccess().getAnyParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:532:6: ( ruleJunction )
                    {
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:532:6: ( ruleJunction )
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:533:1: ruleJunction
                    {
                     before(grammarAccess.getAbstractNodeAccess().getJunctionParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleJunction_in_rule__AbstractNode__Alternatives1078);
                    ruleJunction();

                    state._fsp--;

                     after(grammarAccess.getAbstractNodeAccess().getJunctionParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:538:6: ( ruleFork )
                    {
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:538:6: ( ruleFork )
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:539:1: ruleFork
                    {
                     before(grammarAccess.getAbstractNodeAccess().getForkParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_ruleFork_in_rule__AbstractNode__Alternatives1095);
                    ruleFork();

                    state._fsp--;

                     after(grammarAccess.getAbstractNodeAccess().getForkParserRuleCall_5()); 

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
    // $ANTLR end "rule__AbstractNode__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:550:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:554:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:555:1: ( RULE_STRING )
                    {
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:555:1: ( RULE_STRING )
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:556:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives1128); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:561:6: ( RULE_ID )
                    {
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:561:6: ( RULE_ID )
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:562:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives1145); 
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


    // $ANTLR start "rule__TranslationKind__Alternatives"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:572:1: rule__TranslationKind__Alternatives : ( ( ( 'MULTIVAR' ) ) | ( ( 'SINGLEVAR' ) ) | ( ( 'REFINEDVAR' ) ) );
    public final void rule__TranslationKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:576:1: ( ( ( 'MULTIVAR' ) ) | ( ( 'SINGLEVAR' ) ) | ( ( 'REFINEDVAR' ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:577:1: ( ( 'MULTIVAR' ) )
                    {
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:577:1: ( ( 'MULTIVAR' ) )
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:578:1: ( 'MULTIVAR' )
                    {
                     before(grammarAccess.getTranslationKindAccess().getMULTIVAREnumLiteralDeclaration_0()); 
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:579:1: ( 'MULTIVAR' )
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:579:3: 'MULTIVAR'
                    {
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__TranslationKind__Alternatives1178); 

                    }

                     after(grammarAccess.getTranslationKindAccess().getMULTIVAREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:584:6: ( ( 'SINGLEVAR' ) )
                    {
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:584:6: ( ( 'SINGLEVAR' ) )
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:585:1: ( 'SINGLEVAR' )
                    {
                     before(grammarAccess.getTranslationKindAccess().getSINGLEVAREnumLiteralDeclaration_1()); 
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:586:1: ( 'SINGLEVAR' )
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:586:3: 'SINGLEVAR'
                    {
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__TranslationKind__Alternatives1199); 

                    }

                     after(grammarAccess.getTranslationKindAccess().getSINGLEVAREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:591:6: ( ( 'REFINEDVAR' ) )
                    {
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:591:6: ( ( 'REFINEDVAR' ) )
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:592:1: ( 'REFINEDVAR' )
                    {
                     before(grammarAccess.getTranslationKindAccess().getREFINEDVAREnumLiteralDeclaration_2()); 
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:593:1: ( 'REFINEDVAR' )
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:593:3: 'REFINEDVAR'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__TranslationKind__Alternatives1220); 

                    }

                     after(grammarAccess.getTranslationKindAccess().getREFINEDVAREnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__TranslationKind__Alternatives"


    // $ANTLR start "rule__Statemachine__Group__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:605:1: rule__Statemachine__Group__0 : rule__Statemachine__Group__0__Impl rule__Statemachine__Group__1 ;
    public final void rule__Statemachine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:609:1: ( rule__Statemachine__Group__0__Impl rule__Statemachine__Group__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:610:2: rule__Statemachine__Group__0__Impl rule__Statemachine__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group__0__Impl_in_rule__Statemachine__Group__01253);
            rule__Statemachine__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group__1_in_rule__Statemachine__Group__01256);
            rule__Statemachine__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__0"


    // $ANTLR start "rule__Statemachine__Group__0__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:617:1: rule__Statemachine__Group__0__Impl : ( 'Statemachine' ) ;
    public final void rule__Statemachine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:621:1: ( ( 'Statemachine' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:622:1: ( 'Statemachine' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:622:1: ( 'Statemachine' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:623:1: 'Statemachine'
            {
             before(grammarAccess.getStatemachineAccess().getStatemachineKeyword_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Statemachine__Group__0__Impl1284); 
             after(grammarAccess.getStatemachineAccess().getStatemachineKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__0__Impl"


    // $ANTLR start "rule__Statemachine__Group__1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:636:1: rule__Statemachine__Group__1 : rule__Statemachine__Group__1__Impl rule__Statemachine__Group__2 ;
    public final void rule__Statemachine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:640:1: ( rule__Statemachine__Group__1__Impl rule__Statemachine__Group__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:641:2: rule__Statemachine__Group__1__Impl rule__Statemachine__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group__1__Impl_in_rule__Statemachine__Group__11315);
            rule__Statemachine__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group__2_in_rule__Statemachine__Group__11318);
            rule__Statemachine__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__1"


    // $ANTLR start "rule__Statemachine__Group__1__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:648:1: rule__Statemachine__Group__1__Impl : ( ( rule__Statemachine__NameAssignment_1 ) ) ;
    public final void rule__Statemachine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:652:1: ( ( ( rule__Statemachine__NameAssignment_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:653:1: ( ( rule__Statemachine__NameAssignment_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:653:1: ( ( rule__Statemachine__NameAssignment_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:654:1: ( rule__Statemachine__NameAssignment_1 )
            {
             before(grammarAccess.getStatemachineAccess().getNameAssignment_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:655:1: ( rule__Statemachine__NameAssignment_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:655:2: rule__Statemachine__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__NameAssignment_1_in_rule__Statemachine__Group__1__Impl1345);
            rule__Statemachine__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStatemachineAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__1__Impl"


    // $ANTLR start "rule__Statemachine__Group__2"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:665:1: rule__Statemachine__Group__2 : rule__Statemachine__Group__2__Impl rule__Statemachine__Group__3 ;
    public final void rule__Statemachine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:669:1: ( rule__Statemachine__Group__2__Impl rule__Statemachine__Group__3 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:670:2: rule__Statemachine__Group__2__Impl rule__Statemachine__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group__2__Impl_in_rule__Statemachine__Group__21375);
            rule__Statemachine__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group__3_in_rule__Statemachine__Group__21378);
            rule__Statemachine__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__2"


    // $ANTLR start "rule__Statemachine__Group__2__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:677:1: rule__Statemachine__Group__2__Impl : ( ( rule__Statemachine__Group_2__0 )? ) ;
    public final void rule__Statemachine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:681:1: ( ( ( rule__Statemachine__Group_2__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:682:1: ( ( rule__Statemachine__Group_2__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:682:1: ( ( rule__Statemachine__Group_2__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:683:1: ( rule__Statemachine__Group_2__0 )?
            {
             before(grammarAccess.getStatemachineAccess().getGroup_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:684:1: ( rule__Statemachine__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:684:2: rule__Statemachine__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_2__0_in_rule__Statemachine__Group__2__Impl1405);
                    rule__Statemachine__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStatemachineAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__2__Impl"


    // $ANTLR start "rule__Statemachine__Group__3"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:694:1: rule__Statemachine__Group__3 : rule__Statemachine__Group__3__Impl rule__Statemachine__Group__4 ;
    public final void rule__Statemachine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:698:1: ( rule__Statemachine__Group__3__Impl rule__Statemachine__Group__4 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:699:2: rule__Statemachine__Group__3__Impl rule__Statemachine__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group__3__Impl_in_rule__Statemachine__Group__31436);
            rule__Statemachine__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group__4_in_rule__Statemachine__Group__31439);
            rule__Statemachine__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__3"


    // $ANTLR start "rule__Statemachine__Group__3__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:706:1: rule__Statemachine__Group__3__Impl : ( ( rule__Statemachine__Group_3__0 )? ) ;
    public final void rule__Statemachine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:710:1: ( ( ( rule__Statemachine__Group_3__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:711:1: ( ( rule__Statemachine__Group_3__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:711:1: ( ( rule__Statemachine__Group_3__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:712:1: ( rule__Statemachine__Group_3__0 )?
            {
             before(grammarAccess.getStatemachineAccess().getGroup_3()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:713:1: ( rule__Statemachine__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:713:2: rule__Statemachine__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_3__0_in_rule__Statemachine__Group__3__Impl1466);
                    rule__Statemachine__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStatemachineAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__3__Impl"


    // $ANTLR start "rule__Statemachine__Group__4"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:723:1: rule__Statemachine__Group__4 : rule__Statemachine__Group__4__Impl rule__Statemachine__Group__5 ;
    public final void rule__Statemachine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:727:1: ( rule__Statemachine__Group__4__Impl rule__Statemachine__Group__5 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:728:2: rule__Statemachine__Group__4__Impl rule__Statemachine__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group__4__Impl_in_rule__Statemachine__Group__41497);
            rule__Statemachine__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group__5_in_rule__Statemachine__Group__41500);
            rule__Statemachine__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__4"


    // $ANTLR start "rule__Statemachine__Group__4__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:735:1: rule__Statemachine__Group__4__Impl : ( ( rule__Statemachine__Group_4__0 )? ) ;
    public final void rule__Statemachine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:739:1: ( ( ( rule__Statemachine__Group_4__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:740:1: ( ( rule__Statemachine__Group_4__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:740:1: ( ( rule__Statemachine__Group_4__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:741:1: ( rule__Statemachine__Group_4__0 )?
            {
             before(grammarAccess.getStatemachineAccess().getGroup_4()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:742:1: ( rule__Statemachine__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:742:2: rule__Statemachine__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_4__0_in_rule__Statemachine__Group__4__Impl1527);
                    rule__Statemachine__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStatemachineAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__4__Impl"


    // $ANTLR start "rule__Statemachine__Group__5"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:752:1: rule__Statemachine__Group__5 : rule__Statemachine__Group__5__Impl rule__Statemachine__Group__6 ;
    public final void rule__Statemachine__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:756:1: ( rule__Statemachine__Group__5__Impl rule__Statemachine__Group__6 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:757:2: rule__Statemachine__Group__5__Impl rule__Statemachine__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group__5__Impl_in_rule__Statemachine__Group__51558);
            rule__Statemachine__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group__6_in_rule__Statemachine__Group__51561);
            rule__Statemachine__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__5"


    // $ANTLR start "rule__Statemachine__Group__5__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:764:1: rule__Statemachine__Group__5__Impl : ( ( rule__Statemachine__Group_5__0 )? ) ;
    public final void rule__Statemachine__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:768:1: ( ( ( rule__Statemachine__Group_5__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:769:1: ( ( rule__Statemachine__Group_5__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:769:1: ( ( rule__Statemachine__Group_5__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:770:1: ( rule__Statemachine__Group_5__0 )?
            {
             before(grammarAccess.getStatemachineAccess().getGroup_5()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:771:1: ( rule__Statemachine__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:771:2: rule__Statemachine__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_5__0_in_rule__Statemachine__Group__5__Impl1588);
                    rule__Statemachine__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStatemachineAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__5__Impl"


    // $ANTLR start "rule__Statemachine__Group__6"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:781:1: rule__Statemachine__Group__6 : rule__Statemachine__Group__6__Impl rule__Statemachine__Group__7 ;
    public final void rule__Statemachine__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:785:1: ( rule__Statemachine__Group__6__Impl rule__Statemachine__Group__7 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:786:2: rule__Statemachine__Group__6__Impl rule__Statemachine__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group__6__Impl_in_rule__Statemachine__Group__61619);
            rule__Statemachine__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group__7_in_rule__Statemachine__Group__61622);
            rule__Statemachine__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__6"


    // $ANTLR start "rule__Statemachine__Group__6__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:793:1: rule__Statemachine__Group__6__Impl : ( ( rule__Statemachine__Group_6__0 )? ) ;
    public final void rule__Statemachine__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:797:1: ( ( ( rule__Statemachine__Group_6__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:798:1: ( ( rule__Statemachine__Group_6__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:798:1: ( ( rule__Statemachine__Group_6__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:799:1: ( rule__Statemachine__Group_6__0 )?
            {
             before(grammarAccess.getStatemachineAccess().getGroup_6()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:800:1: ( rule__Statemachine__Group_6__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:800:2: rule__Statemachine__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_6__0_in_rule__Statemachine__Group__6__Impl1649);
                    rule__Statemachine__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStatemachineAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__6__Impl"


    // $ANTLR start "rule__Statemachine__Group__7"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:810:1: rule__Statemachine__Group__7 : rule__Statemachine__Group__7__Impl ;
    public final void rule__Statemachine__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:814:1: ( rule__Statemachine__Group__7__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:815:2: rule__Statemachine__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group__7__Impl_in_rule__Statemachine__Group__71680);
            rule__Statemachine__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__7"


    // $ANTLR start "rule__Statemachine__Group__7__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:821:1: rule__Statemachine__Group__7__Impl : ( ( rule__Statemachine__Group_7__0 )? ) ;
    public final void rule__Statemachine__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:825:1: ( ( ( rule__Statemachine__Group_7__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:826:1: ( ( rule__Statemachine__Group_7__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:826:1: ( ( rule__Statemachine__Group_7__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:827:1: ( rule__Statemachine__Group_7__0 )?
            {
             before(grammarAccess.getStatemachineAccess().getGroup_7()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:828:1: ( rule__Statemachine__Group_7__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:828:2: rule__Statemachine__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_7__0_in_rule__Statemachine__Group__7__Impl1707);
                    rule__Statemachine__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStatemachineAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__7__Impl"


    // $ANTLR start "rule__Statemachine__Group_2__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:854:1: rule__Statemachine__Group_2__0 : rule__Statemachine__Group_2__0__Impl rule__Statemachine__Group_2__1 ;
    public final void rule__Statemachine__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:858:1: ( rule__Statemachine__Group_2__0__Impl rule__Statemachine__Group_2__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:859:2: rule__Statemachine__Group_2__0__Impl rule__Statemachine__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_2__0__Impl_in_rule__Statemachine__Group_2__01754);
            rule__Statemachine__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_2__1_in_rule__Statemachine__Group_2__01757);
            rule__Statemachine__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_2__0"


    // $ANTLR start "rule__Statemachine__Group_2__0__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:866:1: rule__Statemachine__Group_2__0__Impl : ( '>' ) ;
    public final void rule__Statemachine__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:870:1: ( ( '>' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:871:1: ( '>' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:871:1: ( '>' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:872:1: '>'
            {
             before(grammarAccess.getStatemachineAccess().getGreaterThanSignKeyword_2_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Statemachine__Group_2__0__Impl1785); 
             after(grammarAccess.getStatemachineAccess().getGreaterThanSignKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_2__0__Impl"


    // $ANTLR start "rule__Statemachine__Group_2__1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:885:1: rule__Statemachine__Group_2__1 : rule__Statemachine__Group_2__1__Impl ;
    public final void rule__Statemachine__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:889:1: ( rule__Statemachine__Group_2__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:890:2: rule__Statemachine__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_2__1__Impl_in_rule__Statemachine__Group_2__11816);
            rule__Statemachine__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_2__1"


    // $ANTLR start "rule__Statemachine__Group_2__1__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:896:1: rule__Statemachine__Group_2__1__Impl : ( ( rule__Statemachine__CommentAssignment_2_1 ) ) ;
    public final void rule__Statemachine__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:900:1: ( ( ( rule__Statemachine__CommentAssignment_2_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:901:1: ( ( rule__Statemachine__CommentAssignment_2_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:901:1: ( ( rule__Statemachine__CommentAssignment_2_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:902:1: ( rule__Statemachine__CommentAssignment_2_1 )
            {
             before(grammarAccess.getStatemachineAccess().getCommentAssignment_2_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:903:1: ( rule__Statemachine__CommentAssignment_2_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:903:2: rule__Statemachine__CommentAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__CommentAssignment_2_1_in_rule__Statemachine__Group_2__1__Impl1843);
            rule__Statemachine__CommentAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStatemachineAccess().getCommentAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_2__1__Impl"


    // $ANTLR start "rule__Statemachine__Group_3__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:917:1: rule__Statemachine__Group_3__0 : rule__Statemachine__Group_3__0__Impl rule__Statemachine__Group_3__1 ;
    public final void rule__Statemachine__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:921:1: ( rule__Statemachine__Group_3__0__Impl rule__Statemachine__Group_3__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:922:2: rule__Statemachine__Group_3__0__Impl rule__Statemachine__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_3__0__Impl_in_rule__Statemachine__Group_3__01877);
            rule__Statemachine__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_3__1_in_rule__Statemachine__Group_3__01880);
            rule__Statemachine__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_3__0"


    // $ANTLR start "rule__Statemachine__Group_3__0__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:929:1: rule__Statemachine__Group_3__0__Impl : ( 'translation' ) ;
    public final void rule__Statemachine__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:933:1: ( ( 'translation' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:934:1: ( 'translation' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:934:1: ( 'translation' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:935:1: 'translation'
            {
             before(grammarAccess.getStatemachineAccess().getTranslationKeyword_3_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Statemachine__Group_3__0__Impl1908); 
             after(grammarAccess.getStatemachineAccess().getTranslationKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_3__0__Impl"


    // $ANTLR start "rule__Statemachine__Group_3__1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:948:1: rule__Statemachine__Group_3__1 : rule__Statemachine__Group_3__1__Impl ;
    public final void rule__Statemachine__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:952:1: ( rule__Statemachine__Group_3__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:953:2: rule__Statemachine__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_3__1__Impl_in_rule__Statemachine__Group_3__11939);
            rule__Statemachine__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_3__1"


    // $ANTLR start "rule__Statemachine__Group_3__1__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:959:1: rule__Statemachine__Group_3__1__Impl : ( ( rule__Statemachine__TranslationAssignment_3_1 ) ) ;
    public final void rule__Statemachine__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:963:1: ( ( ( rule__Statemachine__TranslationAssignment_3_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:964:1: ( ( rule__Statemachine__TranslationAssignment_3_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:964:1: ( ( rule__Statemachine__TranslationAssignment_3_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:965:1: ( rule__Statemachine__TranslationAssignment_3_1 )
            {
             before(grammarAccess.getStatemachineAccess().getTranslationAssignment_3_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:966:1: ( rule__Statemachine__TranslationAssignment_3_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:966:2: rule__Statemachine__TranslationAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__TranslationAssignment_3_1_in_rule__Statemachine__Group_3__1__Impl1966);
            rule__Statemachine__TranslationAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStatemachineAccess().getTranslationAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_3__1__Impl"


    // $ANTLR start "rule__Statemachine__Group_4__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:980:1: rule__Statemachine__Group_4__0 : rule__Statemachine__Group_4__0__Impl rule__Statemachine__Group_4__1 ;
    public final void rule__Statemachine__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:984:1: ( rule__Statemachine__Group_4__0__Impl rule__Statemachine__Group_4__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:985:2: rule__Statemachine__Group_4__0__Impl rule__Statemachine__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_4__0__Impl_in_rule__Statemachine__Group_4__02000);
            rule__Statemachine__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_4__1_in_rule__Statemachine__Group_4__02003);
            rule__Statemachine__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_4__0"


    // $ANTLR start "rule__Statemachine__Group_4__0__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:992:1: rule__Statemachine__Group_4__0__Impl : ( 'elaborates' ) ;
    public final void rule__Statemachine__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:996:1: ( ( 'elaborates' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:997:1: ( 'elaborates' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:997:1: ( 'elaborates' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:998:1: 'elaborates'
            {
             before(grammarAccess.getStatemachineAccess().getElaboratesKeyword_4_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Statemachine__Group_4__0__Impl2031); 
             after(grammarAccess.getStatemachineAccess().getElaboratesKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_4__0__Impl"


    // $ANTLR start "rule__Statemachine__Group_4__1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1011:1: rule__Statemachine__Group_4__1 : rule__Statemachine__Group_4__1__Impl ;
    public final void rule__Statemachine__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1015:1: ( rule__Statemachine__Group_4__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1016:2: rule__Statemachine__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_4__1__Impl_in_rule__Statemachine__Group_4__12062);
            rule__Statemachine__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_4__1"


    // $ANTLR start "rule__Statemachine__Group_4__1__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1022:1: rule__Statemachine__Group_4__1__Impl : ( ( rule__Statemachine__ElaboratesAssignment_4_1 ) ) ;
    public final void rule__Statemachine__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1026:1: ( ( ( rule__Statemachine__ElaboratesAssignment_4_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1027:1: ( ( rule__Statemachine__ElaboratesAssignment_4_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1027:1: ( ( rule__Statemachine__ElaboratesAssignment_4_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1028:1: ( rule__Statemachine__ElaboratesAssignment_4_1 )
            {
             before(grammarAccess.getStatemachineAccess().getElaboratesAssignment_4_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1029:1: ( rule__Statemachine__ElaboratesAssignment_4_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1029:2: rule__Statemachine__ElaboratesAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__ElaboratesAssignment_4_1_in_rule__Statemachine__Group_4__1__Impl2089);
            rule__Statemachine__ElaboratesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getStatemachineAccess().getElaboratesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_4__1__Impl"


    // $ANTLR start "rule__Statemachine__Group_5__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1043:1: rule__Statemachine__Group_5__0 : rule__Statemachine__Group_5__0__Impl rule__Statemachine__Group_5__1 ;
    public final void rule__Statemachine__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1047:1: ( rule__Statemachine__Group_5__0__Impl rule__Statemachine__Group_5__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1048:2: rule__Statemachine__Group_5__0__Impl rule__Statemachine__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_5__0__Impl_in_rule__Statemachine__Group_5__02123);
            rule__Statemachine__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_5__1_in_rule__Statemachine__Group_5__02126);
            rule__Statemachine__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_5__0"


    // $ANTLR start "rule__Statemachine__Group_5__0__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1055:1: rule__Statemachine__Group_5__0__Impl : ( 'refines' ) ;
    public final void rule__Statemachine__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1059:1: ( ( 'refines' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1060:1: ( 'refines' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1060:1: ( 'refines' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1061:1: 'refines'
            {
             before(grammarAccess.getStatemachineAccess().getRefinesKeyword_5_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Statemachine__Group_5__0__Impl2154); 
             after(grammarAccess.getStatemachineAccess().getRefinesKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_5__0__Impl"


    // $ANTLR start "rule__Statemachine__Group_5__1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1074:1: rule__Statemachine__Group_5__1 : rule__Statemachine__Group_5__1__Impl ;
    public final void rule__Statemachine__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1078:1: ( rule__Statemachine__Group_5__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1079:2: rule__Statemachine__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_5__1__Impl_in_rule__Statemachine__Group_5__12185);
            rule__Statemachine__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_5__1"


    // $ANTLR start "rule__Statemachine__Group_5__1__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1085:1: rule__Statemachine__Group_5__1__Impl : ( ( rule__Statemachine__RefinesAssignment_5_1 ) ) ;
    public final void rule__Statemachine__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1089:1: ( ( ( rule__Statemachine__RefinesAssignment_5_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1090:1: ( ( rule__Statemachine__RefinesAssignment_5_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1090:1: ( ( rule__Statemachine__RefinesAssignment_5_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1091:1: ( rule__Statemachine__RefinesAssignment_5_1 )
            {
             before(grammarAccess.getStatemachineAccess().getRefinesAssignment_5_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1092:1: ( rule__Statemachine__RefinesAssignment_5_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1092:2: rule__Statemachine__RefinesAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__RefinesAssignment_5_1_in_rule__Statemachine__Group_5__1__Impl2212);
            rule__Statemachine__RefinesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getStatemachineAccess().getRefinesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_5__1__Impl"


    // $ANTLR start "rule__Statemachine__Group_6__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1106:1: rule__Statemachine__Group_6__0 : rule__Statemachine__Group_6__0__Impl rule__Statemachine__Group_6__1 ;
    public final void rule__Statemachine__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1110:1: ( rule__Statemachine__Group_6__0__Impl rule__Statemachine__Group_6__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1111:2: rule__Statemachine__Group_6__0__Impl rule__Statemachine__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_6__0__Impl_in_rule__Statemachine__Group_6__02246);
            rule__Statemachine__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_6__1_in_rule__Statemachine__Group_6__02249);
            rule__Statemachine__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_6__0"


    // $ANTLR start "rule__Statemachine__Group_6__0__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1118:1: rule__Statemachine__Group_6__0__Impl : ( 'nodes' ) ;
    public final void rule__Statemachine__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1122:1: ( ( 'nodes' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1123:1: ( 'nodes' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1123:1: ( 'nodes' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1124:1: 'nodes'
            {
             before(grammarAccess.getStatemachineAccess().getNodesKeyword_6_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Statemachine__Group_6__0__Impl2277); 
             after(grammarAccess.getStatemachineAccess().getNodesKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_6__0__Impl"


    // $ANTLR start "rule__Statemachine__Group_6__1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1137:1: rule__Statemachine__Group_6__1 : rule__Statemachine__Group_6__1__Impl rule__Statemachine__Group_6__2 ;
    public final void rule__Statemachine__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1141:1: ( rule__Statemachine__Group_6__1__Impl rule__Statemachine__Group_6__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1142:2: rule__Statemachine__Group_6__1__Impl rule__Statemachine__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_6__1__Impl_in_rule__Statemachine__Group_6__12308);
            rule__Statemachine__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_6__2_in_rule__Statemachine__Group_6__12311);
            rule__Statemachine__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_6__1"


    // $ANTLR start "rule__Statemachine__Group_6__1__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1149:1: rule__Statemachine__Group_6__1__Impl : ( ( rule__Statemachine__NodesAssignment_6_1 ) ) ;
    public final void rule__Statemachine__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1153:1: ( ( ( rule__Statemachine__NodesAssignment_6_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1154:1: ( ( rule__Statemachine__NodesAssignment_6_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1154:1: ( ( rule__Statemachine__NodesAssignment_6_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1155:1: ( rule__Statemachine__NodesAssignment_6_1 )
            {
             before(grammarAccess.getStatemachineAccess().getNodesAssignment_6_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1156:1: ( rule__Statemachine__NodesAssignment_6_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1156:2: rule__Statemachine__NodesAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__NodesAssignment_6_1_in_rule__Statemachine__Group_6__1__Impl2338);
            rule__Statemachine__NodesAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getStatemachineAccess().getNodesAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_6__1__Impl"


    // $ANTLR start "rule__Statemachine__Group_6__2"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1166:1: rule__Statemachine__Group_6__2 : rule__Statemachine__Group_6__2__Impl ;
    public final void rule__Statemachine__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1170:1: ( rule__Statemachine__Group_6__2__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1171:2: rule__Statemachine__Group_6__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_6__2__Impl_in_rule__Statemachine__Group_6__22368);
            rule__Statemachine__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_6__2"


    // $ANTLR start "rule__Statemachine__Group_6__2__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1177:1: rule__Statemachine__Group_6__2__Impl : ( ( rule__Statemachine__Group_6_2__0 )* ) ;
    public final void rule__Statemachine__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1181:1: ( ( ( rule__Statemachine__Group_6_2__0 )* ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1182:1: ( ( rule__Statemachine__Group_6_2__0 )* )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1182:1: ( ( rule__Statemachine__Group_6_2__0 )* )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1183:1: ( rule__Statemachine__Group_6_2__0 )*
            {
             before(grammarAccess.getStatemachineAccess().getGroup_6_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1184:1: ( rule__Statemachine__Group_6_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20) ) {
                    int LA10_2 = input.LA(2);

                    if ( (LA10_2==31||LA10_2==34||(LA10_2>=36 && LA10_2<=39)) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1184:2: rule__Statemachine__Group_6_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_6_2__0_in_rule__Statemachine__Group_6__2__Impl2395);
            	    rule__Statemachine__Group_6_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getStatemachineAccess().getGroup_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_6__2__Impl"


    // $ANTLR start "rule__Statemachine__Group_6_2__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1200:1: rule__Statemachine__Group_6_2__0 : rule__Statemachine__Group_6_2__0__Impl rule__Statemachine__Group_6_2__1 ;
    public final void rule__Statemachine__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1204:1: ( rule__Statemachine__Group_6_2__0__Impl rule__Statemachine__Group_6_2__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1205:2: rule__Statemachine__Group_6_2__0__Impl rule__Statemachine__Group_6_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_6_2__0__Impl_in_rule__Statemachine__Group_6_2__02432);
            rule__Statemachine__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_6_2__1_in_rule__Statemachine__Group_6_2__02435);
            rule__Statemachine__Group_6_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_6_2__0"


    // $ANTLR start "rule__Statemachine__Group_6_2__0__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1212:1: rule__Statemachine__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__Statemachine__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1216:1: ( ( ',' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1217:1: ( ',' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1217:1: ( ',' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1218:1: ','
            {
             before(grammarAccess.getStatemachineAccess().getCommaKeyword_6_2_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Statemachine__Group_6_2__0__Impl2463); 
             after(grammarAccess.getStatemachineAccess().getCommaKeyword_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_6_2__0__Impl"


    // $ANTLR start "rule__Statemachine__Group_6_2__1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1231:1: rule__Statemachine__Group_6_2__1 : rule__Statemachine__Group_6_2__1__Impl ;
    public final void rule__Statemachine__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1235:1: ( rule__Statemachine__Group_6_2__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1236:2: rule__Statemachine__Group_6_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_6_2__1__Impl_in_rule__Statemachine__Group_6_2__12494);
            rule__Statemachine__Group_6_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_6_2__1"


    // $ANTLR start "rule__Statemachine__Group_6_2__1__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1242:1: rule__Statemachine__Group_6_2__1__Impl : ( ( rule__Statemachine__NodesAssignment_6_2_1 ) ) ;
    public final void rule__Statemachine__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1246:1: ( ( ( rule__Statemachine__NodesAssignment_6_2_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1247:1: ( ( rule__Statemachine__NodesAssignment_6_2_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1247:1: ( ( rule__Statemachine__NodesAssignment_6_2_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1248:1: ( rule__Statemachine__NodesAssignment_6_2_1 )
            {
             before(grammarAccess.getStatemachineAccess().getNodesAssignment_6_2_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1249:1: ( rule__Statemachine__NodesAssignment_6_2_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1249:2: rule__Statemachine__NodesAssignment_6_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__NodesAssignment_6_2_1_in_rule__Statemachine__Group_6_2__1__Impl2521);
            rule__Statemachine__NodesAssignment_6_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStatemachineAccess().getNodesAssignment_6_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_6_2__1__Impl"


    // $ANTLR start "rule__Statemachine__Group_7__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1263:1: rule__Statemachine__Group_7__0 : rule__Statemachine__Group_7__0__Impl rule__Statemachine__Group_7__1 ;
    public final void rule__Statemachine__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1267:1: ( rule__Statemachine__Group_7__0__Impl rule__Statemachine__Group_7__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1268:2: rule__Statemachine__Group_7__0__Impl rule__Statemachine__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_7__0__Impl_in_rule__Statemachine__Group_7__02555);
            rule__Statemachine__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_7__1_in_rule__Statemachine__Group_7__02558);
            rule__Statemachine__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_7__0"


    // $ANTLR start "rule__Statemachine__Group_7__0__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1275:1: rule__Statemachine__Group_7__0__Impl : ( 'transitions' ) ;
    public final void rule__Statemachine__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1279:1: ( ( 'transitions' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1280:1: ( 'transitions' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1280:1: ( 'transitions' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1281:1: 'transitions'
            {
             before(grammarAccess.getStatemachineAccess().getTransitionsKeyword_7_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Statemachine__Group_7__0__Impl2586); 
             after(grammarAccess.getStatemachineAccess().getTransitionsKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_7__0__Impl"


    // $ANTLR start "rule__Statemachine__Group_7__1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1294:1: rule__Statemachine__Group_7__1 : rule__Statemachine__Group_7__1__Impl rule__Statemachine__Group_7__2 ;
    public final void rule__Statemachine__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1298:1: ( rule__Statemachine__Group_7__1__Impl rule__Statemachine__Group_7__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1299:2: rule__Statemachine__Group_7__1__Impl rule__Statemachine__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_7__1__Impl_in_rule__Statemachine__Group_7__12617);
            rule__Statemachine__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_7__2_in_rule__Statemachine__Group_7__12620);
            rule__Statemachine__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_7__1"


    // $ANTLR start "rule__Statemachine__Group_7__1__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1306:1: rule__Statemachine__Group_7__1__Impl : ( ( rule__Statemachine__TransitionsAssignment_7_1 ) ) ;
    public final void rule__Statemachine__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1310:1: ( ( ( rule__Statemachine__TransitionsAssignment_7_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1311:1: ( ( rule__Statemachine__TransitionsAssignment_7_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1311:1: ( ( rule__Statemachine__TransitionsAssignment_7_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1312:1: ( rule__Statemachine__TransitionsAssignment_7_1 )
            {
             before(grammarAccess.getStatemachineAccess().getTransitionsAssignment_7_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1313:1: ( rule__Statemachine__TransitionsAssignment_7_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1313:2: rule__Statemachine__TransitionsAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__TransitionsAssignment_7_1_in_rule__Statemachine__Group_7__1__Impl2647);
            rule__Statemachine__TransitionsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getStatemachineAccess().getTransitionsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_7__1__Impl"


    // $ANTLR start "rule__Statemachine__Group_7__2"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1323:1: rule__Statemachine__Group_7__2 : rule__Statemachine__Group_7__2__Impl ;
    public final void rule__Statemachine__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1327:1: ( rule__Statemachine__Group_7__2__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1328:2: rule__Statemachine__Group_7__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_7__2__Impl_in_rule__Statemachine__Group_7__22677);
            rule__Statemachine__Group_7__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_7__2"


    // $ANTLR start "rule__Statemachine__Group_7__2__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1334:1: rule__Statemachine__Group_7__2__Impl : ( ( rule__Statemachine__Group_7_2__0 )* ) ;
    public final void rule__Statemachine__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1338:1: ( ( ( rule__Statemachine__Group_7_2__0 )* ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1339:1: ( ( rule__Statemachine__Group_7_2__0 )* )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1339:1: ( ( rule__Statemachine__Group_7_2__0 )* )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1340:1: ( rule__Statemachine__Group_7_2__0 )*
            {
             before(grammarAccess.getStatemachineAccess().getGroup_7_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1341:1: ( rule__Statemachine__Group_7_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20) ) {
                    int LA11_2 = input.LA(2);

                    if ( (LA11_2==22||LA11_2==46) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1341:2: rule__Statemachine__Group_7_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_7_2__0_in_rule__Statemachine__Group_7__2__Impl2704);
            	    rule__Statemachine__Group_7_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getStatemachineAccess().getGroup_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_7__2__Impl"


    // $ANTLR start "rule__Statemachine__Group_7_2__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1357:1: rule__Statemachine__Group_7_2__0 : rule__Statemachine__Group_7_2__0__Impl rule__Statemachine__Group_7_2__1 ;
    public final void rule__Statemachine__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1361:1: ( rule__Statemachine__Group_7_2__0__Impl rule__Statemachine__Group_7_2__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1362:2: rule__Statemachine__Group_7_2__0__Impl rule__Statemachine__Group_7_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_7_2__0__Impl_in_rule__Statemachine__Group_7_2__02741);
            rule__Statemachine__Group_7_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_7_2__1_in_rule__Statemachine__Group_7_2__02744);
            rule__Statemachine__Group_7_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_7_2__0"


    // $ANTLR start "rule__Statemachine__Group_7_2__0__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1369:1: rule__Statemachine__Group_7_2__0__Impl : ( ',' ) ;
    public final void rule__Statemachine__Group_7_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1373:1: ( ( ',' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1374:1: ( ',' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1374:1: ( ',' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1375:1: ','
            {
             before(grammarAccess.getStatemachineAccess().getCommaKeyword_7_2_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Statemachine__Group_7_2__0__Impl2772); 
             after(grammarAccess.getStatemachineAccess().getCommaKeyword_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_7_2__0__Impl"


    // $ANTLR start "rule__Statemachine__Group_7_2__1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1388:1: rule__Statemachine__Group_7_2__1 : rule__Statemachine__Group_7_2__1__Impl ;
    public final void rule__Statemachine__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1392:1: ( rule__Statemachine__Group_7_2__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1393:2: rule__Statemachine__Group_7_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_7_2__1__Impl_in_rule__Statemachine__Group_7_2__12803);
            rule__Statemachine__Group_7_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_7_2__1"


    // $ANTLR start "rule__Statemachine__Group_7_2__1__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1399:1: rule__Statemachine__Group_7_2__1__Impl : ( ( rule__Statemachine__TransitionsAssignment_7_2_1 ) ) ;
    public final void rule__Statemachine__Group_7_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1403:1: ( ( ( rule__Statemachine__TransitionsAssignment_7_2_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1404:1: ( ( rule__Statemachine__TransitionsAssignment_7_2_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1404:1: ( ( rule__Statemachine__TransitionsAssignment_7_2_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1405:1: ( rule__Statemachine__TransitionsAssignment_7_2_1 )
            {
             before(grammarAccess.getStatemachineAccess().getTransitionsAssignment_7_2_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1406:1: ( rule__Statemachine__TransitionsAssignment_7_2_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1406:2: rule__Statemachine__TransitionsAssignment_7_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__TransitionsAssignment_7_2_1_in_rule__Statemachine__Group_7_2__1__Impl2830);
            rule__Statemachine__TransitionsAssignment_7_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStatemachineAccess().getTransitionsAssignment_7_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_7_2__1__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1420:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1424:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1425:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__02864);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__02867);
            rule__Transition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0"


    // $ANTLR start "rule__Transition__Group__0__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1432:1: rule__Transition__Group__0__Impl : ( () ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1436:1: ( ( () ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1437:1: ( () )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1437:1: ( () )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1438:1: ()
            {
             before(grammarAccess.getTransitionAccess().getTransitionAction_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1439:1: ()
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1441:1: 
            {
            }

             after(grammarAccess.getTransitionAccess().getTransitionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1451:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1455:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1456:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__12925);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__12928);
            rule__Transition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1"


    // $ANTLR start "rule__Transition__Group__1__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1463:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__ExtendedAssignment_1 )? ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1467:1: ( ( ( rule__Transition__ExtendedAssignment_1 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1468:1: ( ( rule__Transition__ExtendedAssignment_1 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1468:1: ( ( rule__Transition__ExtendedAssignment_1 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1469:1: ( rule__Transition__ExtendedAssignment_1 )?
            {
             before(grammarAccess.getTransitionAccess().getExtendedAssignment_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1470:1: ( rule__Transition__ExtendedAssignment_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==46) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1470:2: rule__Transition__ExtendedAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Transition__ExtendedAssignment_1_in_rule__Transition__Group__1__Impl2955);
                    rule__Transition__ExtendedAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getExtendedAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__2"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1480:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1484:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1485:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__22986);
            rule__Transition__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__22989);
            rule__Transition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2"


    // $ANTLR start "rule__Transition__Group__2__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1492:1: rule__Transition__Group__2__Impl : ( 'Transition' ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1496:1: ( ( 'Transition' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1497:1: ( 'Transition' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1497:1: ( 'Transition' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1498:1: 'Transition'
            {
             before(grammarAccess.getTransitionAccess().getTransitionKeyword_2()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Transition__Group__2__Impl3017); 
             after(grammarAccess.getTransitionAccess().getTransitionKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2__Impl"


    // $ANTLR start "rule__Transition__Group__3"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1511:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1515:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1516:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__33048);
            rule__Transition__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__4_in_rule__Transition__Group__33051);
            rule__Transition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3"


    // $ANTLR start "rule__Transition__Group__3__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1523:1: rule__Transition__Group__3__Impl : ( ( rule__Transition__Group_3__0 )? ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1527:1: ( ( ( rule__Transition__Group_3__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1528:1: ( ( rule__Transition__Group_3__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1528:1: ( ( rule__Transition__Group_3__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1529:1: ( rule__Transition__Group_3__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_3()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1530:1: ( rule__Transition__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==15) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1530:2: rule__Transition__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_3__0_in_rule__Transition__Group__3__Impl3078);
                    rule__Transition__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3__Impl"


    // $ANTLR start "rule__Transition__Group__4"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1540:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl rule__Transition__Group__5 ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1544:1: ( rule__Transition__Group__4__Impl rule__Transition__Group__5 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1545:2: rule__Transition__Group__4__Impl rule__Transition__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__4__Impl_in_rule__Transition__Group__43109);
            rule__Transition__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__5_in_rule__Transition__Group__43112);
            rule__Transition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__4"


    // $ANTLR start "rule__Transition__Group__4__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1552:1: rule__Transition__Group__4__Impl : ( ( rule__Transition__Group_4__0 )? ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1556:1: ( ( ( rule__Transition__Group_4__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1557:1: ( ( rule__Transition__Group_4__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1557:1: ( ( rule__Transition__Group_4__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1558:1: ( rule__Transition__Group_4__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_4()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1559:1: ( rule__Transition__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==17) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1559:2: rule__Transition__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4__0_in_rule__Transition__Group__4__Impl3139);
                    rule__Transition__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__4__Impl"


    // $ANTLR start "rule__Transition__Group__5"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1569:1: rule__Transition__Group__5 : rule__Transition__Group__5__Impl rule__Transition__Group__6 ;
    public final void rule__Transition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1573:1: ( rule__Transition__Group__5__Impl rule__Transition__Group__6 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1574:2: rule__Transition__Group__5__Impl rule__Transition__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__5__Impl_in_rule__Transition__Group__53170);
            rule__Transition__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__6_in_rule__Transition__Group__53173);
            rule__Transition__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__5"


    // $ANTLR start "rule__Transition__Group__5__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1581:1: rule__Transition__Group__5__Impl : ( ( rule__Transition__Group_5__0 )? ) ;
    public final void rule__Transition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1585:1: ( ( ( rule__Transition__Group_5__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1586:1: ( ( rule__Transition__Group_5__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1586:1: ( ( rule__Transition__Group_5__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1587:1: ( rule__Transition__Group_5__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_5()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1588:1: ( rule__Transition__Group_5__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1588:2: rule__Transition__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_5__0_in_rule__Transition__Group__5__Impl3200);
                    rule__Transition__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__5__Impl"


    // $ANTLR start "rule__Transition__Group__6"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1598:1: rule__Transition__Group__6 : rule__Transition__Group__6__Impl rule__Transition__Group__7 ;
    public final void rule__Transition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1602:1: ( rule__Transition__Group__6__Impl rule__Transition__Group__7 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1603:2: rule__Transition__Group__6__Impl rule__Transition__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__6__Impl_in_rule__Transition__Group__63231);
            rule__Transition__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__7_in_rule__Transition__Group__63234);
            rule__Transition__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__6"


    // $ANTLR start "rule__Transition__Group__6__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1610:1: rule__Transition__Group__6__Impl : ( ( rule__Transition__Group_6__0 )? ) ;
    public final void rule__Transition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1614:1: ( ( ( rule__Transition__Group_6__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1615:1: ( ( rule__Transition__Group_6__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1615:1: ( ( rule__Transition__Group_6__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1616:1: ( rule__Transition__Group_6__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_6()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1617:1: ( rule__Transition__Group_6__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1617:2: rule__Transition__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_6__0_in_rule__Transition__Group__6__Impl3261);
                    rule__Transition__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__6__Impl"


    // $ANTLR start "rule__Transition__Group__7"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1627:1: rule__Transition__Group__7 : rule__Transition__Group__7__Impl rule__Transition__Group__8 ;
    public final void rule__Transition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1631:1: ( rule__Transition__Group__7__Impl rule__Transition__Group__8 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1632:2: rule__Transition__Group__7__Impl rule__Transition__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__7__Impl_in_rule__Transition__Group__73292);
            rule__Transition__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__8_in_rule__Transition__Group__73295);
            rule__Transition__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__7"


    // $ANTLR start "rule__Transition__Group__7__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1639:1: rule__Transition__Group__7__Impl : ( ( rule__Transition__Group_7__0 )? ) ;
    public final void rule__Transition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1643:1: ( ( ( rule__Transition__Group_7__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1644:1: ( ( rule__Transition__Group_7__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1644:1: ( ( rule__Transition__Group_7__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1645:1: ( rule__Transition__Group_7__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_7()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1646:1: ( rule__Transition__Group_7__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1646:2: rule__Transition__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_7__0_in_rule__Transition__Group__7__Impl3322);
                    rule__Transition__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__7__Impl"


    // $ANTLR start "rule__Transition__Group__8"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1656:1: rule__Transition__Group__8 : rule__Transition__Group__8__Impl rule__Transition__Group__9 ;
    public final void rule__Transition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1660:1: ( rule__Transition__Group__8__Impl rule__Transition__Group__9 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1661:2: rule__Transition__Group__8__Impl rule__Transition__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__8__Impl_in_rule__Transition__Group__83353);
            rule__Transition__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__9_in_rule__Transition__Group__83356);
            rule__Transition__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__8"


    // $ANTLR start "rule__Transition__Group__8__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1668:1: rule__Transition__Group__8__Impl : ( ( rule__Transition__Group_8__0 )? ) ;
    public final void rule__Transition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1672:1: ( ( ( rule__Transition__Group_8__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1673:1: ( ( rule__Transition__Group_8__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1673:1: ( ( rule__Transition__Group_8__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1674:1: ( rule__Transition__Group_8__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_8()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1675:1: ( rule__Transition__Group_8__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1675:2: rule__Transition__Group_8__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_8__0_in_rule__Transition__Group__8__Impl3383);
                    rule__Transition__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__8__Impl"


    // $ANTLR start "rule__Transition__Group__9"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1685:1: rule__Transition__Group__9 : rule__Transition__Group__9__Impl rule__Transition__Group__10 ;
    public final void rule__Transition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1689:1: ( rule__Transition__Group__9__Impl rule__Transition__Group__10 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1690:2: rule__Transition__Group__9__Impl rule__Transition__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__9__Impl_in_rule__Transition__Group__93414);
            rule__Transition__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__10_in_rule__Transition__Group__93417);
            rule__Transition__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__9"


    // $ANTLR start "rule__Transition__Group__9__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1697:1: rule__Transition__Group__9__Impl : ( ( rule__Transition__Group_9__0 )? ) ;
    public final void rule__Transition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1701:1: ( ( ( rule__Transition__Group_9__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1702:1: ( ( rule__Transition__Group_9__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1702:1: ( ( rule__Transition__Group_9__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1703:1: ( rule__Transition__Group_9__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_9()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1704:1: ( rule__Transition__Group_9__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1704:2: rule__Transition__Group_9__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_9__0_in_rule__Transition__Group__9__Impl3444);
                    rule__Transition__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__9__Impl"


    // $ANTLR start "rule__Transition__Group__10"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1714:1: rule__Transition__Group__10 : rule__Transition__Group__10__Impl ;
    public final void rule__Transition__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1718:1: ( rule__Transition__Group__10__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1719:2: rule__Transition__Group__10__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__10__Impl_in_rule__Transition__Group__103475);
            rule__Transition__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__10"


    // $ANTLR start "rule__Transition__Group__10__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1725:1: rule__Transition__Group__10__Impl : ( ( rule__Transition__Group_10__0 )? ) ;
    public final void rule__Transition__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1729:1: ( ( ( rule__Transition__Group_10__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1730:1: ( ( rule__Transition__Group_10__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1730:1: ( ( rule__Transition__Group_10__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1731:1: ( rule__Transition__Group_10__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_10()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1732:1: ( rule__Transition__Group_10__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1732:2: rule__Transition__Group_10__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_10__0_in_rule__Transition__Group__10__Impl3502);
                    rule__Transition__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__10__Impl"


    // $ANTLR start "rule__Transition__Group_3__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1764:1: rule__Transition__Group_3__0 : rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1 ;
    public final void rule__Transition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1768:1: ( rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1769:2: rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_3__0__Impl_in_rule__Transition__Group_3__03555);
            rule__Transition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_3__1_in_rule__Transition__Group_3__03558);
            rule__Transition__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_3__0"


    // $ANTLR start "rule__Transition__Group_3__0__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1776:1: rule__Transition__Group_3__0__Impl : ( '>' ) ;
    public final void rule__Transition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1780:1: ( ( '>' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1781:1: ( '>' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1781:1: ( '>' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1782:1: '>'
            {
             before(grammarAccess.getTransitionAccess().getGreaterThanSignKeyword_3_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Transition__Group_3__0__Impl3586); 
             after(grammarAccess.getTransitionAccess().getGreaterThanSignKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_3__0__Impl"


    // $ANTLR start "rule__Transition__Group_3__1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1795:1: rule__Transition__Group_3__1 : rule__Transition__Group_3__1__Impl ;
    public final void rule__Transition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1799:1: ( rule__Transition__Group_3__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1800:2: rule__Transition__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_3__1__Impl_in_rule__Transition__Group_3__13617);
            rule__Transition__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_3__1"


    // $ANTLR start "rule__Transition__Group_3__1__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1806:1: rule__Transition__Group_3__1__Impl : ( ( rule__Transition__CommentAssignment_3_1 ) ) ;
    public final void rule__Transition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1810:1: ( ( ( rule__Transition__CommentAssignment_3_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1811:1: ( ( rule__Transition__CommentAssignment_3_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1811:1: ( ( rule__Transition__CommentAssignment_3_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1812:1: ( rule__Transition__CommentAssignment_3_1 )
            {
             before(grammarAccess.getTransitionAccess().getCommentAssignment_3_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1813:1: ( rule__Transition__CommentAssignment_3_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1813:2: rule__Transition__CommentAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__CommentAssignment_3_1_in_rule__Transition__Group_3__1__Impl3644);
            rule__Transition__CommentAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getCommentAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_3__1__Impl"


    // $ANTLR start "rule__Transition__Group_4__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1827:1: rule__Transition__Group_4__0 : rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1 ;
    public final void rule__Transition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1831:1: ( rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1832:2: rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4__0__Impl_in_rule__Transition__Group_4__03678);
            rule__Transition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4__1_in_rule__Transition__Group_4__03681);
            rule__Transition__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__0"


    // $ANTLR start "rule__Transition__Group_4__0__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1839:1: rule__Transition__Group_4__0__Impl : ( 'elaborates' ) ;
    public final void rule__Transition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1843:1: ( ( 'elaborates' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1844:1: ( 'elaborates' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1844:1: ( 'elaborates' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1845:1: 'elaborates'
            {
             before(grammarAccess.getTransitionAccess().getElaboratesKeyword_4_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Transition__Group_4__0__Impl3709); 
             after(grammarAccess.getTransitionAccess().getElaboratesKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__0__Impl"


    // $ANTLR start "rule__Transition__Group_4__1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1858:1: rule__Transition__Group_4__1 : rule__Transition__Group_4__1__Impl rule__Transition__Group_4__2 ;
    public final void rule__Transition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1862:1: ( rule__Transition__Group_4__1__Impl rule__Transition__Group_4__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1863:2: rule__Transition__Group_4__1__Impl rule__Transition__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4__1__Impl_in_rule__Transition__Group_4__13740);
            rule__Transition__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4__2_in_rule__Transition__Group_4__13743);
            rule__Transition__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__1"


    // $ANTLR start "rule__Transition__Group_4__1__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1870:1: rule__Transition__Group_4__1__Impl : ( ( rule__Transition__ElaboratesAssignment_4_1 ) ) ;
    public final void rule__Transition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1874:1: ( ( ( rule__Transition__ElaboratesAssignment_4_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1875:1: ( ( rule__Transition__ElaboratesAssignment_4_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1875:1: ( ( rule__Transition__ElaboratesAssignment_4_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1876:1: ( rule__Transition__ElaboratesAssignment_4_1 )
            {
             before(grammarAccess.getTransitionAccess().getElaboratesAssignment_4_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1877:1: ( rule__Transition__ElaboratesAssignment_4_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1877:2: rule__Transition__ElaboratesAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__ElaboratesAssignment_4_1_in_rule__Transition__Group_4__1__Impl3770);
            rule__Transition__ElaboratesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getElaboratesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__1__Impl"


    // $ANTLR start "rule__Transition__Group_4__2"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1887:1: rule__Transition__Group_4__2 : rule__Transition__Group_4__2__Impl ;
    public final void rule__Transition__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1891:1: ( rule__Transition__Group_4__2__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1892:2: rule__Transition__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4__2__Impl_in_rule__Transition__Group_4__23800);
            rule__Transition__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__2"


    // $ANTLR start "rule__Transition__Group_4__2__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1898:1: rule__Transition__Group_4__2__Impl : ( ( rule__Transition__Group_4_2__0 )* ) ;
    public final void rule__Transition__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1902:1: ( ( ( rule__Transition__Group_4_2__0 )* ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1903:1: ( ( rule__Transition__Group_4_2__0 )* )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1903:1: ( ( rule__Transition__Group_4_2__0 )* )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1904:1: ( rule__Transition__Group_4_2__0 )*
            {
             before(grammarAccess.getTransitionAccess().getGroup_4_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1905:1: ( rule__Transition__Group_4_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==20) ) {
                    int LA21_2 = input.LA(2);

                    if ( ((LA21_2>=RULE_STRING && LA21_2<=RULE_ID)) ) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1905:2: rule__Transition__Group_4_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4_2__0_in_rule__Transition__Group_4__2__Impl3827);
            	    rule__Transition__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getTransitionAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__2__Impl"


    // $ANTLR start "rule__Transition__Group_4_2__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1921:1: rule__Transition__Group_4_2__0 : rule__Transition__Group_4_2__0__Impl rule__Transition__Group_4_2__1 ;
    public final void rule__Transition__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1925:1: ( rule__Transition__Group_4_2__0__Impl rule__Transition__Group_4_2__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1926:2: rule__Transition__Group_4_2__0__Impl rule__Transition__Group_4_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4_2__0__Impl_in_rule__Transition__Group_4_2__03864);
            rule__Transition__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4_2__1_in_rule__Transition__Group_4_2__03867);
            rule__Transition__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4_2__0"


    // $ANTLR start "rule__Transition__Group_4_2__0__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1933:1: rule__Transition__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__Transition__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1937:1: ( ( ',' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1938:1: ( ',' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1938:1: ( ',' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1939:1: ','
            {
             before(grammarAccess.getTransitionAccess().getCommaKeyword_4_2_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Transition__Group_4_2__0__Impl3895); 
             after(grammarAccess.getTransitionAccess().getCommaKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4_2__0__Impl"


    // $ANTLR start "rule__Transition__Group_4_2__1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1952:1: rule__Transition__Group_4_2__1 : rule__Transition__Group_4_2__1__Impl ;
    public final void rule__Transition__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1956:1: ( rule__Transition__Group_4_2__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1957:2: rule__Transition__Group_4_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4_2__1__Impl_in_rule__Transition__Group_4_2__13926);
            rule__Transition__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4_2__1"


    // $ANTLR start "rule__Transition__Group_4_2__1__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1963:1: rule__Transition__Group_4_2__1__Impl : ( ( rule__Transition__ElaboratesAssignment_4_2_1 ) ) ;
    public final void rule__Transition__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1967:1: ( ( ( rule__Transition__ElaboratesAssignment_4_2_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1968:1: ( ( rule__Transition__ElaboratesAssignment_4_2_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1968:1: ( ( rule__Transition__ElaboratesAssignment_4_2_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1969:1: ( rule__Transition__ElaboratesAssignment_4_2_1 )
            {
             before(grammarAccess.getTransitionAccess().getElaboratesAssignment_4_2_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1970:1: ( rule__Transition__ElaboratesAssignment_4_2_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1970:2: rule__Transition__ElaboratesAssignment_4_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__ElaboratesAssignment_4_2_1_in_rule__Transition__Group_4_2__1__Impl3953);
            rule__Transition__ElaboratesAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getElaboratesAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4_2__1__Impl"


    // $ANTLR start "rule__Transition__Group_5__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1984:1: rule__Transition__Group_5__0 : rule__Transition__Group_5__0__Impl rule__Transition__Group_5__1 ;
    public final void rule__Transition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1988:1: ( rule__Transition__Group_5__0__Impl rule__Transition__Group_5__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1989:2: rule__Transition__Group_5__0__Impl rule__Transition__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_5__0__Impl_in_rule__Transition__Group_5__03987);
            rule__Transition__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_5__1_in_rule__Transition__Group_5__03990);
            rule__Transition__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_5__0"


    // $ANTLR start "rule__Transition__Group_5__0__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1996:1: rule__Transition__Group_5__0__Impl : ( 'target' ) ;
    public final void rule__Transition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2000:1: ( ( 'target' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2001:1: ( 'target' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2001:1: ( 'target' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2002:1: 'target'
            {
             before(grammarAccess.getTransitionAccess().getTargetKeyword_5_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Transition__Group_5__0__Impl4018); 
             after(grammarAccess.getTransitionAccess().getTargetKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_5__0__Impl"


    // $ANTLR start "rule__Transition__Group_5__1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2015:1: rule__Transition__Group_5__1 : rule__Transition__Group_5__1__Impl ;
    public final void rule__Transition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2019:1: ( rule__Transition__Group_5__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2020:2: rule__Transition__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_5__1__Impl_in_rule__Transition__Group_5__14049);
            rule__Transition__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_5__1"


    // $ANTLR start "rule__Transition__Group_5__1__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2026:1: rule__Transition__Group_5__1__Impl : ( ( rule__Transition__TargetAssignment_5_1 ) ) ;
    public final void rule__Transition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2030:1: ( ( ( rule__Transition__TargetAssignment_5_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2031:1: ( ( rule__Transition__TargetAssignment_5_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2031:1: ( ( rule__Transition__TargetAssignment_5_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2032:1: ( rule__Transition__TargetAssignment_5_1 )
            {
             before(grammarAccess.getTransitionAccess().getTargetAssignment_5_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2033:1: ( rule__Transition__TargetAssignment_5_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2033:2: rule__Transition__TargetAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__TargetAssignment_5_1_in_rule__Transition__Group_5__1__Impl4076);
            rule__Transition__TargetAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getTargetAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_5__1__Impl"


    // $ANTLR start "rule__Transition__Group_6__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2047:1: rule__Transition__Group_6__0 : rule__Transition__Group_6__0__Impl rule__Transition__Group_6__1 ;
    public final void rule__Transition__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2051:1: ( rule__Transition__Group_6__0__Impl rule__Transition__Group_6__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2052:2: rule__Transition__Group_6__0__Impl rule__Transition__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_6__0__Impl_in_rule__Transition__Group_6__04110);
            rule__Transition__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_6__1_in_rule__Transition__Group_6__04113);
            rule__Transition__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_6__0"


    // $ANTLR start "rule__Transition__Group_6__0__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2059:1: rule__Transition__Group_6__0__Impl : ( 'source' ) ;
    public final void rule__Transition__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2063:1: ( ( 'source' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2064:1: ( 'source' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2064:1: ( 'source' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2065:1: 'source'
            {
             before(grammarAccess.getTransitionAccess().getSourceKeyword_6_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Transition__Group_6__0__Impl4141); 
             after(grammarAccess.getTransitionAccess().getSourceKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_6__0__Impl"


    // $ANTLR start "rule__Transition__Group_6__1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2078:1: rule__Transition__Group_6__1 : rule__Transition__Group_6__1__Impl ;
    public final void rule__Transition__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2082:1: ( rule__Transition__Group_6__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2083:2: rule__Transition__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_6__1__Impl_in_rule__Transition__Group_6__14172);
            rule__Transition__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_6__1"


    // $ANTLR start "rule__Transition__Group_6__1__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2089:1: rule__Transition__Group_6__1__Impl : ( ( rule__Transition__SourceAssignment_6_1 ) ) ;
    public final void rule__Transition__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2093:1: ( ( ( rule__Transition__SourceAssignment_6_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2094:1: ( ( rule__Transition__SourceAssignment_6_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2094:1: ( ( rule__Transition__SourceAssignment_6_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2095:1: ( rule__Transition__SourceAssignment_6_1 )
            {
             before(grammarAccess.getTransitionAccess().getSourceAssignment_6_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2096:1: ( rule__Transition__SourceAssignment_6_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2096:2: rule__Transition__SourceAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__SourceAssignment_6_1_in_rule__Transition__Group_6__1__Impl4199);
            rule__Transition__SourceAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getSourceAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_6__1__Impl"


    // $ANTLR start "rule__Transition__Group_7__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2110:1: rule__Transition__Group_7__0 : rule__Transition__Group_7__0__Impl rule__Transition__Group_7__1 ;
    public final void rule__Transition__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2114:1: ( rule__Transition__Group_7__0__Impl rule__Transition__Group_7__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2115:2: rule__Transition__Group_7__0__Impl rule__Transition__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_7__0__Impl_in_rule__Transition__Group_7__04233);
            rule__Transition__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_7__1_in_rule__Transition__Group_7__04236);
            rule__Transition__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_7__0"


    // $ANTLR start "rule__Transition__Group_7__0__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2122:1: rule__Transition__Group_7__0__Impl : ( 'parameters' ) ;
    public final void rule__Transition__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2126:1: ( ( 'parameters' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2127:1: ( 'parameters' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2127:1: ( 'parameters' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2128:1: 'parameters'
            {
             before(grammarAccess.getTransitionAccess().getParametersKeyword_7_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Transition__Group_7__0__Impl4264); 
             after(grammarAccess.getTransitionAccess().getParametersKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_7__0__Impl"


    // $ANTLR start "rule__Transition__Group_7__1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2141:1: rule__Transition__Group_7__1 : rule__Transition__Group_7__1__Impl rule__Transition__Group_7__2 ;
    public final void rule__Transition__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2145:1: ( rule__Transition__Group_7__1__Impl rule__Transition__Group_7__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2146:2: rule__Transition__Group_7__1__Impl rule__Transition__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_7__1__Impl_in_rule__Transition__Group_7__14295);
            rule__Transition__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_7__2_in_rule__Transition__Group_7__14298);
            rule__Transition__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_7__1"


    // $ANTLR start "rule__Transition__Group_7__1__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2153:1: rule__Transition__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Transition__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2157:1: ( ( '{' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2158:1: ( '{' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2158:1: ( '{' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2159:1: '{'
            {
             before(grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Transition__Group_7__1__Impl4326); 
             after(grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_7__1__Impl"


    // $ANTLR start "rule__Transition__Group_7__2"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2172:1: rule__Transition__Group_7__2 : rule__Transition__Group_7__2__Impl rule__Transition__Group_7__3 ;
    public final void rule__Transition__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2176:1: ( rule__Transition__Group_7__2__Impl rule__Transition__Group_7__3 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2177:2: rule__Transition__Group_7__2__Impl rule__Transition__Group_7__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_7__2__Impl_in_rule__Transition__Group_7__24357);
            rule__Transition__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_7__3_in_rule__Transition__Group_7__24360);
            rule__Transition__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_7__2"


    // $ANTLR start "rule__Transition__Group_7__2__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2184:1: rule__Transition__Group_7__2__Impl : ( ( rule__Transition__ParametersAssignment_7_2 ) ) ;
    public final void rule__Transition__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2188:1: ( ( ( rule__Transition__ParametersAssignment_7_2 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2189:1: ( ( rule__Transition__ParametersAssignment_7_2 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2189:1: ( ( rule__Transition__ParametersAssignment_7_2 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2190:1: ( rule__Transition__ParametersAssignment_7_2 )
            {
             before(grammarAccess.getTransitionAccess().getParametersAssignment_7_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2191:1: ( rule__Transition__ParametersAssignment_7_2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2191:2: rule__Transition__ParametersAssignment_7_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__ParametersAssignment_7_2_in_rule__Transition__Group_7__2__Impl4387);
            rule__Transition__ParametersAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getParametersAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_7__2__Impl"


    // $ANTLR start "rule__Transition__Group_7__3"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2201:1: rule__Transition__Group_7__3 : rule__Transition__Group_7__3__Impl rule__Transition__Group_7__4 ;
    public final void rule__Transition__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2205:1: ( rule__Transition__Group_7__3__Impl rule__Transition__Group_7__4 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2206:2: rule__Transition__Group_7__3__Impl rule__Transition__Group_7__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_7__3__Impl_in_rule__Transition__Group_7__34417);
            rule__Transition__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_7__4_in_rule__Transition__Group_7__34420);
            rule__Transition__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_7__3"


    // $ANTLR start "rule__Transition__Group_7__3__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2213:1: rule__Transition__Group_7__3__Impl : ( ( rule__Transition__Group_7_3__0 )* ) ;
    public final void rule__Transition__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2217:1: ( ( ( rule__Transition__Group_7_3__0 )* ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2218:1: ( ( rule__Transition__Group_7_3__0 )* )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2218:1: ( ( rule__Transition__Group_7_3__0 )* )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2219:1: ( rule__Transition__Group_7_3__0 )*
            {
             before(grammarAccess.getTransitionAccess().getGroup_7_3()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2220:1: ( rule__Transition__Group_7_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==20) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2220:2: rule__Transition__Group_7_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_7_3__0_in_rule__Transition__Group_7__3__Impl4447);
            	    rule__Transition__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getTransitionAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_7__3__Impl"


    // $ANTLR start "rule__Transition__Group_7__4"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2230:1: rule__Transition__Group_7__4 : rule__Transition__Group_7__4__Impl ;
    public final void rule__Transition__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2234:1: ( rule__Transition__Group_7__4__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2235:2: rule__Transition__Group_7__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_7__4__Impl_in_rule__Transition__Group_7__44478);
            rule__Transition__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_7__4"


    // $ANTLR start "rule__Transition__Group_7__4__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2241:1: rule__Transition__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Transition__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2245:1: ( ( '}' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2246:1: ( '}' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2246:1: ( '}' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2247:1: '}'
            {
             before(grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Transition__Group_7__4__Impl4506); 
             after(grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_7__4__Impl"


    // $ANTLR start "rule__Transition__Group_7_3__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2270:1: rule__Transition__Group_7_3__0 : rule__Transition__Group_7_3__0__Impl rule__Transition__Group_7_3__1 ;
    public final void rule__Transition__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2274:1: ( rule__Transition__Group_7_3__0__Impl rule__Transition__Group_7_3__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2275:2: rule__Transition__Group_7_3__0__Impl rule__Transition__Group_7_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_7_3__0__Impl_in_rule__Transition__Group_7_3__04547);
            rule__Transition__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_7_3__1_in_rule__Transition__Group_7_3__04550);
            rule__Transition__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_7_3__0"


    // $ANTLR start "rule__Transition__Group_7_3__0__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2282:1: rule__Transition__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Transition__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2286:1: ( ( ',' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2287:1: ( ',' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2287:1: ( ',' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2288:1: ','
            {
             before(grammarAccess.getTransitionAccess().getCommaKeyword_7_3_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Transition__Group_7_3__0__Impl4578); 
             after(grammarAccess.getTransitionAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_7_3__0__Impl"


    // $ANTLR start "rule__Transition__Group_7_3__1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2301:1: rule__Transition__Group_7_3__1 : rule__Transition__Group_7_3__1__Impl ;
    public final void rule__Transition__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2305:1: ( rule__Transition__Group_7_3__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2306:2: rule__Transition__Group_7_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_7_3__1__Impl_in_rule__Transition__Group_7_3__14609);
            rule__Transition__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_7_3__1"


    // $ANTLR start "rule__Transition__Group_7_3__1__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2312:1: rule__Transition__Group_7_3__1__Impl : ( ( rule__Transition__ParametersAssignment_7_3_1 ) ) ;
    public final void rule__Transition__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2316:1: ( ( ( rule__Transition__ParametersAssignment_7_3_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2317:1: ( ( rule__Transition__ParametersAssignment_7_3_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2317:1: ( ( rule__Transition__ParametersAssignment_7_3_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2318:1: ( rule__Transition__ParametersAssignment_7_3_1 )
            {
             before(grammarAccess.getTransitionAccess().getParametersAssignment_7_3_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2319:1: ( rule__Transition__ParametersAssignment_7_3_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2319:2: rule__Transition__ParametersAssignment_7_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__ParametersAssignment_7_3_1_in_rule__Transition__Group_7_3__1__Impl4636);
            rule__Transition__ParametersAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getParametersAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_7_3__1__Impl"


    // $ANTLR start "rule__Transition__Group_8__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2333:1: rule__Transition__Group_8__0 : rule__Transition__Group_8__0__Impl rule__Transition__Group_8__1 ;
    public final void rule__Transition__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2337:1: ( rule__Transition__Group_8__0__Impl rule__Transition__Group_8__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2338:2: rule__Transition__Group_8__0__Impl rule__Transition__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_8__0__Impl_in_rule__Transition__Group_8__04670);
            rule__Transition__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_8__1_in_rule__Transition__Group_8__04673);
            rule__Transition__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_8__0"


    // $ANTLR start "rule__Transition__Group_8__0__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2345:1: rule__Transition__Group_8__0__Impl : ( 'guards' ) ;
    public final void rule__Transition__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2349:1: ( ( 'guards' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2350:1: ( 'guards' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2350:1: ( 'guards' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2351:1: 'guards'
            {
             before(grammarAccess.getTransitionAccess().getGuardsKeyword_8_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Transition__Group_8__0__Impl4701); 
             after(grammarAccess.getTransitionAccess().getGuardsKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_8__0__Impl"


    // $ANTLR start "rule__Transition__Group_8__1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2364:1: rule__Transition__Group_8__1 : rule__Transition__Group_8__1__Impl rule__Transition__Group_8__2 ;
    public final void rule__Transition__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2368:1: ( rule__Transition__Group_8__1__Impl rule__Transition__Group_8__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2369:2: rule__Transition__Group_8__1__Impl rule__Transition__Group_8__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_8__1__Impl_in_rule__Transition__Group_8__14732);
            rule__Transition__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_8__2_in_rule__Transition__Group_8__14735);
            rule__Transition__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_8__1"


    // $ANTLR start "rule__Transition__Group_8__1__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2376:1: rule__Transition__Group_8__1__Impl : ( '{' ) ;
    public final void rule__Transition__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2380:1: ( ( '{' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2381:1: ( '{' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2381:1: ( '{' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2382:1: '{'
            {
             before(grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_8_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Transition__Group_8__1__Impl4763); 
             after(grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_8__1__Impl"


    // $ANTLR start "rule__Transition__Group_8__2"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2395:1: rule__Transition__Group_8__2 : rule__Transition__Group_8__2__Impl rule__Transition__Group_8__3 ;
    public final void rule__Transition__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2399:1: ( rule__Transition__Group_8__2__Impl rule__Transition__Group_8__3 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2400:2: rule__Transition__Group_8__2__Impl rule__Transition__Group_8__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_8__2__Impl_in_rule__Transition__Group_8__24794);
            rule__Transition__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_8__3_in_rule__Transition__Group_8__24797);
            rule__Transition__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_8__2"


    // $ANTLR start "rule__Transition__Group_8__2__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2407:1: rule__Transition__Group_8__2__Impl : ( ( rule__Transition__GuardsAssignment_8_2 ) ) ;
    public final void rule__Transition__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2411:1: ( ( ( rule__Transition__GuardsAssignment_8_2 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2412:1: ( ( rule__Transition__GuardsAssignment_8_2 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2412:1: ( ( rule__Transition__GuardsAssignment_8_2 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2413:1: ( rule__Transition__GuardsAssignment_8_2 )
            {
             before(grammarAccess.getTransitionAccess().getGuardsAssignment_8_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2414:1: ( rule__Transition__GuardsAssignment_8_2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2414:2: rule__Transition__GuardsAssignment_8_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__GuardsAssignment_8_2_in_rule__Transition__Group_8__2__Impl4824);
            rule__Transition__GuardsAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGuardsAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_8__2__Impl"


    // $ANTLR start "rule__Transition__Group_8__3"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2424:1: rule__Transition__Group_8__3 : rule__Transition__Group_8__3__Impl rule__Transition__Group_8__4 ;
    public final void rule__Transition__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2428:1: ( rule__Transition__Group_8__3__Impl rule__Transition__Group_8__4 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2429:2: rule__Transition__Group_8__3__Impl rule__Transition__Group_8__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_8__3__Impl_in_rule__Transition__Group_8__34854);
            rule__Transition__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_8__4_in_rule__Transition__Group_8__34857);
            rule__Transition__Group_8__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_8__3"


    // $ANTLR start "rule__Transition__Group_8__3__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2436:1: rule__Transition__Group_8__3__Impl : ( ( rule__Transition__Group_8_3__0 )* ) ;
    public final void rule__Transition__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2440:1: ( ( ( rule__Transition__Group_8_3__0 )* ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2441:1: ( ( rule__Transition__Group_8_3__0 )* )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2441:1: ( ( rule__Transition__Group_8_3__0 )* )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2442:1: ( rule__Transition__Group_8_3__0 )*
            {
             before(grammarAccess.getTransitionAccess().getGroup_8_3()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2443:1: ( rule__Transition__Group_8_3__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==20) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2443:2: rule__Transition__Group_8_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_8_3__0_in_rule__Transition__Group_8__3__Impl4884);
            	    rule__Transition__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getTransitionAccess().getGroup_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_8__3__Impl"


    // $ANTLR start "rule__Transition__Group_8__4"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2453:1: rule__Transition__Group_8__4 : rule__Transition__Group_8__4__Impl ;
    public final void rule__Transition__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2457:1: ( rule__Transition__Group_8__4__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2458:2: rule__Transition__Group_8__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_8__4__Impl_in_rule__Transition__Group_8__44915);
            rule__Transition__Group_8__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_8__4"


    // $ANTLR start "rule__Transition__Group_8__4__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2464:1: rule__Transition__Group_8__4__Impl : ( '}' ) ;
    public final void rule__Transition__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2468:1: ( ( '}' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2469:1: ( '}' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2469:1: ( '}' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2470:1: '}'
            {
             before(grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_8_4()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Transition__Group_8__4__Impl4943); 
             after(grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_8_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_8__4__Impl"


    // $ANTLR start "rule__Transition__Group_8_3__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2493:1: rule__Transition__Group_8_3__0 : rule__Transition__Group_8_3__0__Impl rule__Transition__Group_8_3__1 ;
    public final void rule__Transition__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2497:1: ( rule__Transition__Group_8_3__0__Impl rule__Transition__Group_8_3__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2498:2: rule__Transition__Group_8_3__0__Impl rule__Transition__Group_8_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_8_3__0__Impl_in_rule__Transition__Group_8_3__04984);
            rule__Transition__Group_8_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_8_3__1_in_rule__Transition__Group_8_3__04987);
            rule__Transition__Group_8_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_8_3__0"


    // $ANTLR start "rule__Transition__Group_8_3__0__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2505:1: rule__Transition__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__Transition__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2509:1: ( ( ',' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2510:1: ( ',' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2510:1: ( ',' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2511:1: ','
            {
             before(grammarAccess.getTransitionAccess().getCommaKeyword_8_3_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Transition__Group_8_3__0__Impl5015); 
             after(grammarAccess.getTransitionAccess().getCommaKeyword_8_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_8_3__0__Impl"


    // $ANTLR start "rule__Transition__Group_8_3__1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2524:1: rule__Transition__Group_8_3__1 : rule__Transition__Group_8_3__1__Impl ;
    public final void rule__Transition__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2528:1: ( rule__Transition__Group_8_3__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2529:2: rule__Transition__Group_8_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_8_3__1__Impl_in_rule__Transition__Group_8_3__15046);
            rule__Transition__Group_8_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_8_3__1"


    // $ANTLR start "rule__Transition__Group_8_3__1__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2535:1: rule__Transition__Group_8_3__1__Impl : ( ( rule__Transition__GuardsAssignment_8_3_1 ) ) ;
    public final void rule__Transition__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2539:1: ( ( ( rule__Transition__GuardsAssignment_8_3_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2540:1: ( ( rule__Transition__GuardsAssignment_8_3_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2540:1: ( ( rule__Transition__GuardsAssignment_8_3_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2541:1: ( rule__Transition__GuardsAssignment_8_3_1 )
            {
             before(grammarAccess.getTransitionAccess().getGuardsAssignment_8_3_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2542:1: ( rule__Transition__GuardsAssignment_8_3_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2542:2: rule__Transition__GuardsAssignment_8_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__GuardsAssignment_8_3_1_in_rule__Transition__Group_8_3__1__Impl5073);
            rule__Transition__GuardsAssignment_8_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGuardsAssignment_8_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_8_3__1__Impl"


    // $ANTLR start "rule__Transition__Group_9__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2556:1: rule__Transition__Group_9__0 : rule__Transition__Group_9__0__Impl rule__Transition__Group_9__1 ;
    public final void rule__Transition__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2560:1: ( rule__Transition__Group_9__0__Impl rule__Transition__Group_9__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2561:2: rule__Transition__Group_9__0__Impl rule__Transition__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_9__0__Impl_in_rule__Transition__Group_9__05107);
            rule__Transition__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_9__1_in_rule__Transition__Group_9__05110);
            rule__Transition__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_9__0"


    // $ANTLR start "rule__Transition__Group_9__0__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2568:1: rule__Transition__Group_9__0__Impl : ( 'actions' ) ;
    public final void rule__Transition__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2572:1: ( ( 'actions' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2573:1: ( 'actions' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2573:1: ( 'actions' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2574:1: 'actions'
            {
             before(grammarAccess.getTransitionAccess().getActionsKeyword_9_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Transition__Group_9__0__Impl5138); 
             after(grammarAccess.getTransitionAccess().getActionsKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_9__0__Impl"


    // $ANTLR start "rule__Transition__Group_9__1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2587:1: rule__Transition__Group_9__1 : rule__Transition__Group_9__1__Impl rule__Transition__Group_9__2 ;
    public final void rule__Transition__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2591:1: ( rule__Transition__Group_9__1__Impl rule__Transition__Group_9__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2592:2: rule__Transition__Group_9__1__Impl rule__Transition__Group_9__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_9__1__Impl_in_rule__Transition__Group_9__15169);
            rule__Transition__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_9__2_in_rule__Transition__Group_9__15172);
            rule__Transition__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_9__1"


    // $ANTLR start "rule__Transition__Group_9__1__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2599:1: rule__Transition__Group_9__1__Impl : ( '{' ) ;
    public final void rule__Transition__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2603:1: ( ( '{' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2604:1: ( '{' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2604:1: ( '{' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2605:1: '{'
            {
             before(grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_9_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Transition__Group_9__1__Impl5200); 
             after(grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_9__1__Impl"


    // $ANTLR start "rule__Transition__Group_9__2"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2618:1: rule__Transition__Group_9__2 : rule__Transition__Group_9__2__Impl rule__Transition__Group_9__3 ;
    public final void rule__Transition__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2622:1: ( rule__Transition__Group_9__2__Impl rule__Transition__Group_9__3 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2623:2: rule__Transition__Group_9__2__Impl rule__Transition__Group_9__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_9__2__Impl_in_rule__Transition__Group_9__25231);
            rule__Transition__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_9__3_in_rule__Transition__Group_9__25234);
            rule__Transition__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_9__2"


    // $ANTLR start "rule__Transition__Group_9__2__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2630:1: rule__Transition__Group_9__2__Impl : ( ( rule__Transition__ActionsAssignment_9_2 ) ) ;
    public final void rule__Transition__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2634:1: ( ( ( rule__Transition__ActionsAssignment_9_2 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2635:1: ( ( rule__Transition__ActionsAssignment_9_2 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2635:1: ( ( rule__Transition__ActionsAssignment_9_2 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2636:1: ( rule__Transition__ActionsAssignment_9_2 )
            {
             before(grammarAccess.getTransitionAccess().getActionsAssignment_9_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2637:1: ( rule__Transition__ActionsAssignment_9_2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2637:2: rule__Transition__ActionsAssignment_9_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__ActionsAssignment_9_2_in_rule__Transition__Group_9__2__Impl5261);
            rule__Transition__ActionsAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getActionsAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_9__2__Impl"


    // $ANTLR start "rule__Transition__Group_9__3"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2647:1: rule__Transition__Group_9__3 : rule__Transition__Group_9__3__Impl rule__Transition__Group_9__4 ;
    public final void rule__Transition__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2651:1: ( rule__Transition__Group_9__3__Impl rule__Transition__Group_9__4 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2652:2: rule__Transition__Group_9__3__Impl rule__Transition__Group_9__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_9__3__Impl_in_rule__Transition__Group_9__35291);
            rule__Transition__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_9__4_in_rule__Transition__Group_9__35294);
            rule__Transition__Group_9__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_9__3"


    // $ANTLR start "rule__Transition__Group_9__3__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2659:1: rule__Transition__Group_9__3__Impl : ( ( rule__Transition__Group_9_3__0 )* ) ;
    public final void rule__Transition__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2663:1: ( ( ( rule__Transition__Group_9_3__0 )* ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2664:1: ( ( rule__Transition__Group_9_3__0 )* )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2664:1: ( ( rule__Transition__Group_9_3__0 )* )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2665:1: ( rule__Transition__Group_9_3__0 )*
            {
             before(grammarAccess.getTransitionAccess().getGroup_9_3()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2666:1: ( rule__Transition__Group_9_3__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==20) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2666:2: rule__Transition__Group_9_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_9_3__0_in_rule__Transition__Group_9__3__Impl5321);
            	    rule__Transition__Group_9_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getTransitionAccess().getGroup_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_9__3__Impl"


    // $ANTLR start "rule__Transition__Group_9__4"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2676:1: rule__Transition__Group_9__4 : rule__Transition__Group_9__4__Impl ;
    public final void rule__Transition__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2680:1: ( rule__Transition__Group_9__4__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2681:2: rule__Transition__Group_9__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_9__4__Impl_in_rule__Transition__Group_9__45352);
            rule__Transition__Group_9__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_9__4"


    // $ANTLR start "rule__Transition__Group_9__4__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2687:1: rule__Transition__Group_9__4__Impl : ( '}' ) ;
    public final void rule__Transition__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2691:1: ( ( '}' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2692:1: ( '}' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2692:1: ( '}' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2693:1: '}'
            {
             before(grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_9_4()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Transition__Group_9__4__Impl5380); 
             after(grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_9_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_9__4__Impl"


    // $ANTLR start "rule__Transition__Group_9_3__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2716:1: rule__Transition__Group_9_3__0 : rule__Transition__Group_9_3__0__Impl rule__Transition__Group_9_3__1 ;
    public final void rule__Transition__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2720:1: ( rule__Transition__Group_9_3__0__Impl rule__Transition__Group_9_3__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2721:2: rule__Transition__Group_9_3__0__Impl rule__Transition__Group_9_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_9_3__0__Impl_in_rule__Transition__Group_9_3__05421);
            rule__Transition__Group_9_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_9_3__1_in_rule__Transition__Group_9_3__05424);
            rule__Transition__Group_9_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_9_3__0"


    // $ANTLR start "rule__Transition__Group_9_3__0__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2728:1: rule__Transition__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__Transition__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2732:1: ( ( ',' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2733:1: ( ',' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2733:1: ( ',' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2734:1: ','
            {
             before(grammarAccess.getTransitionAccess().getCommaKeyword_9_3_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Transition__Group_9_3__0__Impl5452); 
             after(grammarAccess.getTransitionAccess().getCommaKeyword_9_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_9_3__0__Impl"


    // $ANTLR start "rule__Transition__Group_9_3__1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2747:1: rule__Transition__Group_9_3__1 : rule__Transition__Group_9_3__1__Impl ;
    public final void rule__Transition__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2751:1: ( rule__Transition__Group_9_3__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2752:2: rule__Transition__Group_9_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_9_3__1__Impl_in_rule__Transition__Group_9_3__15483);
            rule__Transition__Group_9_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_9_3__1"


    // $ANTLR start "rule__Transition__Group_9_3__1__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2758:1: rule__Transition__Group_9_3__1__Impl : ( ( rule__Transition__ActionsAssignment_9_3_1 ) ) ;
    public final void rule__Transition__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2762:1: ( ( ( rule__Transition__ActionsAssignment_9_3_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2763:1: ( ( rule__Transition__ActionsAssignment_9_3_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2763:1: ( ( rule__Transition__ActionsAssignment_9_3_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2764:1: ( rule__Transition__ActionsAssignment_9_3_1 )
            {
             before(grammarAccess.getTransitionAccess().getActionsAssignment_9_3_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2765:1: ( rule__Transition__ActionsAssignment_9_3_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2765:2: rule__Transition__ActionsAssignment_9_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__ActionsAssignment_9_3_1_in_rule__Transition__Group_9_3__1__Impl5510);
            rule__Transition__ActionsAssignment_9_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getActionsAssignment_9_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_9_3__1__Impl"


    // $ANTLR start "rule__Transition__Group_10__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2779:1: rule__Transition__Group_10__0 : rule__Transition__Group_10__0__Impl rule__Transition__Group_10__1 ;
    public final void rule__Transition__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2783:1: ( rule__Transition__Group_10__0__Impl rule__Transition__Group_10__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2784:2: rule__Transition__Group_10__0__Impl rule__Transition__Group_10__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_10__0__Impl_in_rule__Transition__Group_10__05544);
            rule__Transition__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_10__1_in_rule__Transition__Group_10__05547);
            rule__Transition__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_10__0"


    // $ANTLR start "rule__Transition__Group_10__0__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2791:1: rule__Transition__Group_10__0__Impl : ( 'witnesses' ) ;
    public final void rule__Transition__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2795:1: ( ( 'witnesses' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2796:1: ( 'witnesses' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2796:1: ( 'witnesses' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2797:1: 'witnesses'
            {
             before(grammarAccess.getTransitionAccess().getWitnessesKeyword_10_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Transition__Group_10__0__Impl5575); 
             after(grammarAccess.getTransitionAccess().getWitnessesKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_10__0__Impl"


    // $ANTLR start "rule__Transition__Group_10__1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2810:1: rule__Transition__Group_10__1 : rule__Transition__Group_10__1__Impl rule__Transition__Group_10__2 ;
    public final void rule__Transition__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2814:1: ( rule__Transition__Group_10__1__Impl rule__Transition__Group_10__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2815:2: rule__Transition__Group_10__1__Impl rule__Transition__Group_10__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_10__1__Impl_in_rule__Transition__Group_10__15606);
            rule__Transition__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_10__2_in_rule__Transition__Group_10__15609);
            rule__Transition__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_10__1"


    // $ANTLR start "rule__Transition__Group_10__1__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2822:1: rule__Transition__Group_10__1__Impl : ( '{' ) ;
    public final void rule__Transition__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2826:1: ( ( '{' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2827:1: ( '{' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2827:1: ( '{' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2828:1: '{'
            {
             before(grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_10_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Transition__Group_10__1__Impl5637); 
             after(grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_10__1__Impl"


    // $ANTLR start "rule__Transition__Group_10__2"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2841:1: rule__Transition__Group_10__2 : rule__Transition__Group_10__2__Impl rule__Transition__Group_10__3 ;
    public final void rule__Transition__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2845:1: ( rule__Transition__Group_10__2__Impl rule__Transition__Group_10__3 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2846:2: rule__Transition__Group_10__2__Impl rule__Transition__Group_10__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_10__2__Impl_in_rule__Transition__Group_10__25668);
            rule__Transition__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_10__3_in_rule__Transition__Group_10__25671);
            rule__Transition__Group_10__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_10__2"


    // $ANTLR start "rule__Transition__Group_10__2__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2853:1: rule__Transition__Group_10__2__Impl : ( ( rule__Transition__WitnessesAssignment_10_2 ) ) ;
    public final void rule__Transition__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2857:1: ( ( ( rule__Transition__WitnessesAssignment_10_2 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2858:1: ( ( rule__Transition__WitnessesAssignment_10_2 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2858:1: ( ( rule__Transition__WitnessesAssignment_10_2 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2859:1: ( rule__Transition__WitnessesAssignment_10_2 )
            {
             before(grammarAccess.getTransitionAccess().getWitnessesAssignment_10_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2860:1: ( rule__Transition__WitnessesAssignment_10_2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2860:2: rule__Transition__WitnessesAssignment_10_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__WitnessesAssignment_10_2_in_rule__Transition__Group_10__2__Impl5698);
            rule__Transition__WitnessesAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getWitnessesAssignment_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_10__2__Impl"


    // $ANTLR start "rule__Transition__Group_10__3"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2870:1: rule__Transition__Group_10__3 : rule__Transition__Group_10__3__Impl rule__Transition__Group_10__4 ;
    public final void rule__Transition__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2874:1: ( rule__Transition__Group_10__3__Impl rule__Transition__Group_10__4 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2875:2: rule__Transition__Group_10__3__Impl rule__Transition__Group_10__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_10__3__Impl_in_rule__Transition__Group_10__35728);
            rule__Transition__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_10__4_in_rule__Transition__Group_10__35731);
            rule__Transition__Group_10__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_10__3"


    // $ANTLR start "rule__Transition__Group_10__3__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2882:1: rule__Transition__Group_10__3__Impl : ( ( rule__Transition__Group_10_3__0 )* ) ;
    public final void rule__Transition__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2886:1: ( ( ( rule__Transition__Group_10_3__0 )* ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2887:1: ( ( rule__Transition__Group_10_3__0 )* )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2887:1: ( ( rule__Transition__Group_10_3__0 )* )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2888:1: ( rule__Transition__Group_10_3__0 )*
            {
             before(grammarAccess.getTransitionAccess().getGroup_10_3()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2889:1: ( rule__Transition__Group_10_3__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==20) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2889:2: rule__Transition__Group_10_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_10_3__0_in_rule__Transition__Group_10__3__Impl5758);
            	    rule__Transition__Group_10_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getTransitionAccess().getGroup_10_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_10__3__Impl"


    // $ANTLR start "rule__Transition__Group_10__4"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2899:1: rule__Transition__Group_10__4 : rule__Transition__Group_10__4__Impl ;
    public final void rule__Transition__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2903:1: ( rule__Transition__Group_10__4__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2904:2: rule__Transition__Group_10__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_10__4__Impl_in_rule__Transition__Group_10__45789);
            rule__Transition__Group_10__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_10__4"


    // $ANTLR start "rule__Transition__Group_10__4__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2910:1: rule__Transition__Group_10__4__Impl : ( '}' ) ;
    public final void rule__Transition__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2914:1: ( ( '}' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2915:1: ( '}' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2915:1: ( '}' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2916:1: '}'
            {
             before(grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_10_4()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Transition__Group_10__4__Impl5817); 
             after(grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_10_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_10__4__Impl"


    // $ANTLR start "rule__Transition__Group_10_3__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2939:1: rule__Transition__Group_10_3__0 : rule__Transition__Group_10_3__0__Impl rule__Transition__Group_10_3__1 ;
    public final void rule__Transition__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2943:1: ( rule__Transition__Group_10_3__0__Impl rule__Transition__Group_10_3__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2944:2: rule__Transition__Group_10_3__0__Impl rule__Transition__Group_10_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_10_3__0__Impl_in_rule__Transition__Group_10_3__05858);
            rule__Transition__Group_10_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_10_3__1_in_rule__Transition__Group_10_3__05861);
            rule__Transition__Group_10_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_10_3__0"


    // $ANTLR start "rule__Transition__Group_10_3__0__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2951:1: rule__Transition__Group_10_3__0__Impl : ( ',' ) ;
    public final void rule__Transition__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2955:1: ( ( ',' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2956:1: ( ',' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2956:1: ( ',' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2957:1: ','
            {
             before(grammarAccess.getTransitionAccess().getCommaKeyword_10_3_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Transition__Group_10_3__0__Impl5889); 
             after(grammarAccess.getTransitionAccess().getCommaKeyword_10_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_10_3__0__Impl"


    // $ANTLR start "rule__Transition__Group_10_3__1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2970:1: rule__Transition__Group_10_3__1 : rule__Transition__Group_10_3__1__Impl ;
    public final void rule__Transition__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2974:1: ( rule__Transition__Group_10_3__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2975:2: rule__Transition__Group_10_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_10_3__1__Impl_in_rule__Transition__Group_10_3__15920);
            rule__Transition__Group_10_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_10_3__1"


    // $ANTLR start "rule__Transition__Group_10_3__1__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2981:1: rule__Transition__Group_10_3__1__Impl : ( ( rule__Transition__WitnessesAssignment_10_3_1 ) ) ;
    public final void rule__Transition__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2985:1: ( ( ( rule__Transition__WitnessesAssignment_10_3_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2986:1: ( ( rule__Transition__WitnessesAssignment_10_3_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2986:1: ( ( rule__Transition__WitnessesAssignment_10_3_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2987:1: ( rule__Transition__WitnessesAssignment_10_3_1 )
            {
             before(grammarAccess.getTransitionAccess().getWitnessesAssignment_10_3_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2988:1: ( rule__Transition__WitnessesAssignment_10_3_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2988:2: rule__Transition__WitnessesAssignment_10_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__WitnessesAssignment_10_3_1_in_rule__Transition__Group_10_3__1__Impl5947);
            rule__Transition__WitnessesAssignment_10_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getWitnessesAssignment_10_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_10_3__1__Impl"


    // $ANTLR start "rule__State__Group__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3003:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3007:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3008:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__05982);
            rule__State__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group__1_in_rule__State__Group__05985);
            rule__State__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0"


    // $ANTLR start "rule__State__Group__0__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3015:1: rule__State__Group__0__Impl : ( () ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3019:1: ( ( () ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3020:1: ( () )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3020:1: ( () )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3021:1: ()
            {
             before(grammarAccess.getStateAccess().getStateAction_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3022:1: ()
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3024:1: 
            {
            }

             after(grammarAccess.getStateAccess().getStateAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0__Impl"


    // $ANTLR start "rule__State__Group__1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3034:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3038:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3039:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__16043);
            rule__State__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group__2_in_rule__State__Group__16046);
            rule__State__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1"


    // $ANTLR start "rule__State__Group__1__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3046:1: rule__State__Group__1__Impl : ( 'State' ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3050:1: ( ( 'State' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3051:1: ( 'State' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3051:1: ( 'State' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3052:1: 'State'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_1()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__State__Group__1__Impl6074); 
             after(grammarAccess.getStateAccess().getStateKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1__Impl"


    // $ANTLR start "rule__State__Group__2"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3065:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3069:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3070:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__26105);
            rule__State__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group__3_in_rule__State__Group__26108);
            rule__State__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2"


    // $ANTLR start "rule__State__Group__2__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3077:1: rule__State__Group__2__Impl : ( ( rule__State__NameAssignment_2 ) ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3081:1: ( ( ( rule__State__NameAssignment_2 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3082:1: ( ( rule__State__NameAssignment_2 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3082:1: ( ( rule__State__NameAssignment_2 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3083:1: ( rule__State__NameAssignment_2 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3084:1: ( rule__State__NameAssignment_2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3084:2: rule__State__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__NameAssignment_2_in_rule__State__Group__2__Impl6135);
            rule__State__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2__Impl"


    // $ANTLR start "rule__State__Group__3"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3094:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3098:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3099:2: rule__State__Group__3__Impl rule__State__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group__3__Impl_in_rule__State__Group__36165);
            rule__State__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group__4_in_rule__State__Group__36168);
            rule__State__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__3"


    // $ANTLR start "rule__State__Group__3__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3106:1: rule__State__Group__3__Impl : ( ( rule__State__Group_3__0 )? ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3110:1: ( ( ( rule__State__Group_3__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3111:1: ( ( rule__State__Group_3__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3111:1: ( ( rule__State__Group_3__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3112:1: ( rule__State__Group_3__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_3()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3113:1: ( rule__State__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==18) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3113:2: rule__State__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__State__Group_3__0_in_rule__State__Group__3__Impl6195);
                    rule__State__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__3__Impl"


    // $ANTLR start "rule__State__Group__4"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3123:1: rule__State__Group__4 : rule__State__Group__4__Impl rule__State__Group__5 ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3127:1: ( rule__State__Group__4__Impl rule__State__Group__5 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3128:2: rule__State__Group__4__Impl rule__State__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group__4__Impl_in_rule__State__Group__46226);
            rule__State__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group__5_in_rule__State__Group__46229);
            rule__State__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__4"


    // $ANTLR start "rule__State__Group__4__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3135:1: rule__State__Group__4__Impl : ( ( rule__State__Group_4__0 )? ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3139:1: ( ( ( rule__State__Group_4__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3140:1: ( ( rule__State__Group_4__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3140:1: ( ( rule__State__Group_4__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3141:1: ( rule__State__Group_4__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_4()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3142:1: ( rule__State__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==32) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3142:2: rule__State__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__State__Group_4__0_in_rule__State__Group__4__Impl6256);
                    rule__State__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__4__Impl"


    // $ANTLR start "rule__State__Group__5"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3152:1: rule__State__Group__5 : rule__State__Group__5__Impl ;
    public final void rule__State__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3156:1: ( rule__State__Group__5__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3157:2: rule__State__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group__5__Impl_in_rule__State__Group__56287);
            rule__State__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__5"


    // $ANTLR start "rule__State__Group__5__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3163:1: rule__State__Group__5__Impl : ( ( rule__State__Group_5__0 )? ) ;
    public final void rule__State__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3167:1: ( ( ( rule__State__Group_5__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3168:1: ( ( rule__State__Group_5__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3168:1: ( ( rule__State__Group_5__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3169:1: ( rule__State__Group_5__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_5()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3170:1: ( rule__State__Group_5__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==33) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3170:2: rule__State__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__State__Group_5__0_in_rule__State__Group__5__Impl6314);
                    rule__State__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__5__Impl"


    // $ANTLR start "rule__State__Group_3__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3192:1: rule__State__Group_3__0 : rule__State__Group_3__0__Impl rule__State__Group_3__1 ;
    public final void rule__State__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3196:1: ( rule__State__Group_3__0__Impl rule__State__Group_3__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3197:2: rule__State__Group_3__0__Impl rule__State__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_3__0__Impl_in_rule__State__Group_3__06357);
            rule__State__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_3__1_in_rule__State__Group_3__06360);
            rule__State__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3__0"


    // $ANTLR start "rule__State__Group_3__0__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3204:1: rule__State__Group_3__0__Impl : ( 'refines' ) ;
    public final void rule__State__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3208:1: ( ( 'refines' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3209:1: ( 'refines' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3209:1: ( 'refines' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3210:1: 'refines'
            {
             before(grammarAccess.getStateAccess().getRefinesKeyword_3_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__State__Group_3__0__Impl6388); 
             after(grammarAccess.getStateAccess().getRefinesKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3__0__Impl"


    // $ANTLR start "rule__State__Group_3__1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3223:1: rule__State__Group_3__1 : rule__State__Group_3__1__Impl ;
    public final void rule__State__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3227:1: ( rule__State__Group_3__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3228:2: rule__State__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_3__1__Impl_in_rule__State__Group_3__16419);
            rule__State__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3__1"


    // $ANTLR start "rule__State__Group_3__1__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3234:1: rule__State__Group_3__1__Impl : ( ( rule__State__RefinesAssignment_3_1 ) ) ;
    public final void rule__State__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3238:1: ( ( ( rule__State__RefinesAssignment_3_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3239:1: ( ( rule__State__RefinesAssignment_3_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3239:1: ( ( rule__State__RefinesAssignment_3_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3240:1: ( rule__State__RefinesAssignment_3_1 )
            {
             before(grammarAccess.getStateAccess().getRefinesAssignment_3_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3241:1: ( rule__State__RefinesAssignment_3_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3241:2: rule__State__RefinesAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__RefinesAssignment_3_1_in_rule__State__Group_3__1__Impl6446);
            rule__State__RefinesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getRefinesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3__1__Impl"


    // $ANTLR start "rule__State__Group_4__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3255:1: rule__State__Group_4__0 : rule__State__Group_4__0__Impl rule__State__Group_4__1 ;
    public final void rule__State__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3259:1: ( rule__State__Group_4__0__Impl rule__State__Group_4__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3260:2: rule__State__Group_4__0__Impl rule__State__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_4__0__Impl_in_rule__State__Group_4__06480);
            rule__State__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_4__1_in_rule__State__Group_4__06483);
            rule__State__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_4__0"


    // $ANTLR start "rule__State__Group_4__0__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3267:1: rule__State__Group_4__0__Impl : ( 'statemachines' ) ;
    public final void rule__State__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3271:1: ( ( 'statemachines' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3272:1: ( 'statemachines' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3272:1: ( 'statemachines' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3273:1: 'statemachines'
            {
             before(grammarAccess.getStateAccess().getStatemachinesKeyword_4_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__State__Group_4__0__Impl6511); 
             after(grammarAccess.getStateAccess().getStatemachinesKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_4__0__Impl"


    // $ANTLR start "rule__State__Group_4__1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3286:1: rule__State__Group_4__1 : rule__State__Group_4__1__Impl rule__State__Group_4__2 ;
    public final void rule__State__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3290:1: ( rule__State__Group_4__1__Impl rule__State__Group_4__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3291:2: rule__State__Group_4__1__Impl rule__State__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_4__1__Impl_in_rule__State__Group_4__16542);
            rule__State__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_4__2_in_rule__State__Group_4__16545);
            rule__State__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_4__1"


    // $ANTLR start "rule__State__Group_4__1__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3298:1: rule__State__Group_4__1__Impl : ( '{' ) ;
    public final void rule__State__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3302:1: ( ( '{' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3303:1: ( '{' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3303:1: ( '{' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3304:1: '{'
            {
             before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__State__Group_4__1__Impl6573); 
             after(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_4__1__Impl"


    // $ANTLR start "rule__State__Group_4__2"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3317:1: rule__State__Group_4__2 : rule__State__Group_4__2__Impl rule__State__Group_4__3 ;
    public final void rule__State__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3321:1: ( rule__State__Group_4__2__Impl rule__State__Group_4__3 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3322:2: rule__State__Group_4__2__Impl rule__State__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_4__2__Impl_in_rule__State__Group_4__26604);
            rule__State__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_4__3_in_rule__State__Group_4__26607);
            rule__State__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_4__2"


    // $ANTLR start "rule__State__Group_4__2__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3329:1: rule__State__Group_4__2__Impl : ( ( rule__State__StatemachinesAssignment_4_2 ) ) ;
    public final void rule__State__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3333:1: ( ( ( rule__State__StatemachinesAssignment_4_2 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3334:1: ( ( rule__State__StatemachinesAssignment_4_2 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3334:1: ( ( rule__State__StatemachinesAssignment_4_2 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3335:1: ( rule__State__StatemachinesAssignment_4_2 )
            {
             before(grammarAccess.getStateAccess().getStatemachinesAssignment_4_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3336:1: ( rule__State__StatemachinesAssignment_4_2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3336:2: rule__State__StatemachinesAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__StatemachinesAssignment_4_2_in_rule__State__Group_4__2__Impl6634);
            rule__State__StatemachinesAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getStatemachinesAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_4__2__Impl"


    // $ANTLR start "rule__State__Group_4__3"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3346:1: rule__State__Group_4__3 : rule__State__Group_4__3__Impl rule__State__Group_4__4 ;
    public final void rule__State__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3350:1: ( rule__State__Group_4__3__Impl rule__State__Group_4__4 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3351:2: rule__State__Group_4__3__Impl rule__State__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_4__3__Impl_in_rule__State__Group_4__36664);
            rule__State__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_4__4_in_rule__State__Group_4__36667);
            rule__State__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_4__3"


    // $ANTLR start "rule__State__Group_4__3__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3358:1: rule__State__Group_4__3__Impl : ( ( rule__State__Group_4_3__0 )* ) ;
    public final void rule__State__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3362:1: ( ( ( rule__State__Group_4_3__0 )* ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3363:1: ( ( rule__State__Group_4_3__0 )* )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3363:1: ( ( rule__State__Group_4_3__0 )* )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3364:1: ( rule__State__Group_4_3__0 )*
            {
             before(grammarAccess.getStateAccess().getGroup_4_3()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3365:1: ( rule__State__Group_4_3__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==20) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3365:2: rule__State__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__State__Group_4_3__0_in_rule__State__Group_4__3__Impl6694);
            	    rule__State__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_4__3__Impl"


    // $ANTLR start "rule__State__Group_4__4"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3375:1: rule__State__Group_4__4 : rule__State__Group_4__4__Impl ;
    public final void rule__State__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3379:1: ( rule__State__Group_4__4__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3380:2: rule__State__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_4__4__Impl_in_rule__State__Group_4__46725);
            rule__State__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_4__4"


    // $ANTLR start "rule__State__Group_4__4__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3386:1: rule__State__Group_4__4__Impl : ( '}' ) ;
    public final void rule__State__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3390:1: ( ( '}' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3391:1: ( '}' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3391:1: ( '}' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3392:1: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__State__Group_4__4__Impl6753); 
             after(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_4__4__Impl"


    // $ANTLR start "rule__State__Group_4_3__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3415:1: rule__State__Group_4_3__0 : rule__State__Group_4_3__0__Impl rule__State__Group_4_3__1 ;
    public final void rule__State__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3419:1: ( rule__State__Group_4_3__0__Impl rule__State__Group_4_3__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3420:2: rule__State__Group_4_3__0__Impl rule__State__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_4_3__0__Impl_in_rule__State__Group_4_3__06794);
            rule__State__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_4_3__1_in_rule__State__Group_4_3__06797);
            rule__State__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_4_3__0"


    // $ANTLR start "rule__State__Group_4_3__0__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3427:1: rule__State__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__State__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3431:1: ( ( ',' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3432:1: ( ',' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3432:1: ( ',' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3433:1: ','
            {
             before(grammarAccess.getStateAccess().getCommaKeyword_4_3_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__State__Group_4_3__0__Impl6825); 
             after(grammarAccess.getStateAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_4_3__0__Impl"


    // $ANTLR start "rule__State__Group_4_3__1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3446:1: rule__State__Group_4_3__1 : rule__State__Group_4_3__1__Impl ;
    public final void rule__State__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3450:1: ( rule__State__Group_4_3__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3451:2: rule__State__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_4_3__1__Impl_in_rule__State__Group_4_3__16856);
            rule__State__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_4_3__1"


    // $ANTLR start "rule__State__Group_4_3__1__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3457:1: rule__State__Group_4_3__1__Impl : ( ( rule__State__StatemachinesAssignment_4_3_1 ) ) ;
    public final void rule__State__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3461:1: ( ( ( rule__State__StatemachinesAssignment_4_3_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3462:1: ( ( rule__State__StatemachinesAssignment_4_3_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3462:1: ( ( rule__State__StatemachinesAssignment_4_3_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3463:1: ( rule__State__StatemachinesAssignment_4_3_1 )
            {
             before(grammarAccess.getStateAccess().getStatemachinesAssignment_4_3_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3464:1: ( rule__State__StatemachinesAssignment_4_3_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3464:2: rule__State__StatemachinesAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__StatemachinesAssignment_4_3_1_in_rule__State__Group_4_3__1__Impl6883);
            rule__State__StatemachinesAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getStatemachinesAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_4_3__1__Impl"


    // $ANTLR start "rule__State__Group_5__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3478:1: rule__State__Group_5__0 : rule__State__Group_5__0__Impl rule__State__Group_5__1 ;
    public final void rule__State__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3482:1: ( rule__State__Group_5__0__Impl rule__State__Group_5__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3483:2: rule__State__Group_5__0__Impl rule__State__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_5__0__Impl_in_rule__State__Group_5__06917);
            rule__State__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_5__1_in_rule__State__Group_5__06920);
            rule__State__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5__0"


    // $ANTLR start "rule__State__Group_5__0__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3490:1: rule__State__Group_5__0__Impl : ( 'invariants' ) ;
    public final void rule__State__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3494:1: ( ( 'invariants' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3495:1: ( 'invariants' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3495:1: ( 'invariants' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3496:1: 'invariants'
            {
             before(grammarAccess.getStateAccess().getInvariantsKeyword_5_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__State__Group_5__0__Impl6948); 
             after(grammarAccess.getStateAccess().getInvariantsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5__0__Impl"


    // $ANTLR start "rule__State__Group_5__1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3509:1: rule__State__Group_5__1 : rule__State__Group_5__1__Impl rule__State__Group_5__2 ;
    public final void rule__State__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3513:1: ( rule__State__Group_5__1__Impl rule__State__Group_5__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3514:2: rule__State__Group_5__1__Impl rule__State__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_5__1__Impl_in_rule__State__Group_5__16979);
            rule__State__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_5__2_in_rule__State__Group_5__16982);
            rule__State__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5__1"


    // $ANTLR start "rule__State__Group_5__1__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3521:1: rule__State__Group_5__1__Impl : ( '{' ) ;
    public final void rule__State__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3525:1: ( ( '{' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3526:1: ( '{' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3526:1: ( '{' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3527:1: '{'
            {
             before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__State__Group_5__1__Impl7010); 
             after(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5__1__Impl"


    // $ANTLR start "rule__State__Group_5__2"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3540:1: rule__State__Group_5__2 : rule__State__Group_5__2__Impl rule__State__Group_5__3 ;
    public final void rule__State__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3544:1: ( rule__State__Group_5__2__Impl rule__State__Group_5__3 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3545:2: rule__State__Group_5__2__Impl rule__State__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_5__2__Impl_in_rule__State__Group_5__27041);
            rule__State__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_5__3_in_rule__State__Group_5__27044);
            rule__State__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5__2"


    // $ANTLR start "rule__State__Group_5__2__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3552:1: rule__State__Group_5__2__Impl : ( ( rule__State__InvariantsAssignment_5_2 ) ) ;
    public final void rule__State__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3556:1: ( ( ( rule__State__InvariantsAssignment_5_2 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3557:1: ( ( rule__State__InvariantsAssignment_5_2 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3557:1: ( ( rule__State__InvariantsAssignment_5_2 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3558:1: ( rule__State__InvariantsAssignment_5_2 )
            {
             before(grammarAccess.getStateAccess().getInvariantsAssignment_5_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3559:1: ( rule__State__InvariantsAssignment_5_2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3559:2: rule__State__InvariantsAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__InvariantsAssignment_5_2_in_rule__State__Group_5__2__Impl7071);
            rule__State__InvariantsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getInvariantsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5__2__Impl"


    // $ANTLR start "rule__State__Group_5__3"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3569:1: rule__State__Group_5__3 : rule__State__Group_5__3__Impl rule__State__Group_5__4 ;
    public final void rule__State__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3573:1: ( rule__State__Group_5__3__Impl rule__State__Group_5__4 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3574:2: rule__State__Group_5__3__Impl rule__State__Group_5__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_5__3__Impl_in_rule__State__Group_5__37101);
            rule__State__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_5__4_in_rule__State__Group_5__37104);
            rule__State__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5__3"


    // $ANTLR start "rule__State__Group_5__3__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3581:1: rule__State__Group_5__3__Impl : ( ( rule__State__Group_5_3__0 )* ) ;
    public final void rule__State__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3585:1: ( ( ( rule__State__Group_5_3__0 )* ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3586:1: ( ( rule__State__Group_5_3__0 )* )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3586:1: ( ( rule__State__Group_5_3__0 )* )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3587:1: ( rule__State__Group_5_3__0 )*
            {
             before(grammarAccess.getStateAccess().getGroup_5_3()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3588:1: ( rule__State__Group_5_3__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==20) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3588:2: rule__State__Group_5_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__State__Group_5_3__0_in_rule__State__Group_5__3__Impl7131);
            	    rule__State__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5__3__Impl"


    // $ANTLR start "rule__State__Group_5__4"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3598:1: rule__State__Group_5__4 : rule__State__Group_5__4__Impl ;
    public final void rule__State__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3602:1: ( rule__State__Group_5__4__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3603:2: rule__State__Group_5__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_5__4__Impl_in_rule__State__Group_5__47162);
            rule__State__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5__4"


    // $ANTLR start "rule__State__Group_5__4__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3609:1: rule__State__Group_5__4__Impl : ( '}' ) ;
    public final void rule__State__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3613:1: ( ( '}' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3614:1: ( '}' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3614:1: ( '}' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3615:1: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__State__Group_5__4__Impl7190); 
             after(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5__4__Impl"


    // $ANTLR start "rule__State__Group_5_3__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3638:1: rule__State__Group_5_3__0 : rule__State__Group_5_3__0__Impl rule__State__Group_5_3__1 ;
    public final void rule__State__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3642:1: ( rule__State__Group_5_3__0__Impl rule__State__Group_5_3__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3643:2: rule__State__Group_5_3__0__Impl rule__State__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_5_3__0__Impl_in_rule__State__Group_5_3__07231);
            rule__State__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_5_3__1_in_rule__State__Group_5_3__07234);
            rule__State__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5_3__0"


    // $ANTLR start "rule__State__Group_5_3__0__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3650:1: rule__State__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__State__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3654:1: ( ( ',' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3655:1: ( ',' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3655:1: ( ',' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3656:1: ','
            {
             before(grammarAccess.getStateAccess().getCommaKeyword_5_3_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__State__Group_5_3__0__Impl7262); 
             after(grammarAccess.getStateAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5_3__0__Impl"


    // $ANTLR start "rule__State__Group_5_3__1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3669:1: rule__State__Group_5_3__1 : rule__State__Group_5_3__1__Impl ;
    public final void rule__State__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3673:1: ( rule__State__Group_5_3__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3674:2: rule__State__Group_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_5_3__1__Impl_in_rule__State__Group_5_3__17293);
            rule__State__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5_3__1"


    // $ANTLR start "rule__State__Group_5_3__1__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3680:1: rule__State__Group_5_3__1__Impl : ( ( rule__State__InvariantsAssignment_5_3_1 ) ) ;
    public final void rule__State__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3684:1: ( ( ( rule__State__InvariantsAssignment_5_3_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3685:1: ( ( rule__State__InvariantsAssignment_5_3_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3685:1: ( ( rule__State__InvariantsAssignment_5_3_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3686:1: ( rule__State__InvariantsAssignment_5_3_1 )
            {
             before(grammarAccess.getStateAccess().getInvariantsAssignment_5_3_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3687:1: ( rule__State__InvariantsAssignment_5_3_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3687:2: rule__State__InvariantsAssignment_5_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__InvariantsAssignment_5_3_1_in_rule__State__Group_5_3__1__Impl7320);
            rule__State__InvariantsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getInvariantsAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5_3__1__Impl"


    // $ANTLR start "rule__Initial__Group__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3701:1: rule__Initial__Group__0 : rule__Initial__Group__0__Impl rule__Initial__Group__1 ;
    public final void rule__Initial__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3705:1: ( rule__Initial__Group__0__Impl rule__Initial__Group__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3706:2: rule__Initial__Group__0__Impl rule__Initial__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Initial__Group__0__Impl_in_rule__Initial__Group__07354);
            rule__Initial__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Initial__Group__1_in_rule__Initial__Group__07357);
            rule__Initial__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__Group__0"


    // $ANTLR start "rule__Initial__Group__0__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3713:1: rule__Initial__Group__0__Impl : ( () ) ;
    public final void rule__Initial__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3717:1: ( ( () ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3718:1: ( () )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3718:1: ( () )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3719:1: ()
            {
             before(grammarAccess.getInitialAccess().getInitialAction_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3720:1: ()
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3722:1: 
            {
            }

             after(grammarAccess.getInitialAccess().getInitialAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__Group__0__Impl"


    // $ANTLR start "rule__Initial__Group__1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3732:1: rule__Initial__Group__1 : rule__Initial__Group__1__Impl rule__Initial__Group__2 ;
    public final void rule__Initial__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3736:1: ( rule__Initial__Group__1__Impl rule__Initial__Group__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3737:2: rule__Initial__Group__1__Impl rule__Initial__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Initial__Group__1__Impl_in_rule__Initial__Group__17415);
            rule__Initial__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Initial__Group__2_in_rule__Initial__Group__17418);
            rule__Initial__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__Group__1"


    // $ANTLR start "rule__Initial__Group__1__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3744:1: rule__Initial__Group__1__Impl : ( 'Initial' ) ;
    public final void rule__Initial__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3748:1: ( ( 'Initial' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3749:1: ( 'Initial' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3749:1: ( 'Initial' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3750:1: 'Initial'
            {
             before(grammarAccess.getInitialAccess().getInitialKeyword_1()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Initial__Group__1__Impl7446); 
             after(grammarAccess.getInitialAccess().getInitialKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__Group__1__Impl"


    // $ANTLR start "rule__Initial__Group__2"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3763:1: rule__Initial__Group__2 : rule__Initial__Group__2__Impl ;
    public final void rule__Initial__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3767:1: ( rule__Initial__Group__2__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3768:2: rule__Initial__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Initial__Group__2__Impl_in_rule__Initial__Group__27477);
            rule__Initial__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__Group__2"


    // $ANTLR start "rule__Initial__Group__2__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3774:1: rule__Initial__Group__2__Impl : ( ( rule__Initial__Group_2__0 )? ) ;
    public final void rule__Initial__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3778:1: ( ( ( rule__Initial__Group_2__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3779:1: ( ( rule__Initial__Group_2__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3779:1: ( ( rule__Initial__Group_2__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3780:1: ( rule__Initial__Group_2__0 )?
            {
             before(grammarAccess.getInitialAccess().getGroup_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3781:1: ( rule__Initial__Group_2__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==35) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3781:2: rule__Initial__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Initial__Group_2__0_in_rule__Initial__Group__2__Impl7504);
                    rule__Initial__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInitialAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__Group__2__Impl"


    // $ANTLR start "rule__Initial__Group_2__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3797:1: rule__Initial__Group_2__0 : rule__Initial__Group_2__0__Impl rule__Initial__Group_2__1 ;
    public final void rule__Initial__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3801:1: ( rule__Initial__Group_2__0__Impl rule__Initial__Group_2__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3802:2: rule__Initial__Group_2__0__Impl rule__Initial__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Initial__Group_2__0__Impl_in_rule__Initial__Group_2__07541);
            rule__Initial__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Initial__Group_2__1_in_rule__Initial__Group_2__07544);
            rule__Initial__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__Group_2__0"


    // $ANTLR start "rule__Initial__Group_2__0__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3809:1: rule__Initial__Group_2__0__Impl : ( 'internalId' ) ;
    public final void rule__Initial__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3813:1: ( ( 'internalId' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3814:1: ( 'internalId' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3814:1: ( 'internalId' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3815:1: 'internalId'
            {
             before(grammarAccess.getInitialAccess().getInternalIdKeyword_2_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Initial__Group_2__0__Impl7572); 
             after(grammarAccess.getInitialAccess().getInternalIdKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__Group_2__0__Impl"


    // $ANTLR start "rule__Initial__Group_2__1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3828:1: rule__Initial__Group_2__1 : rule__Initial__Group_2__1__Impl ;
    public final void rule__Initial__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3832:1: ( rule__Initial__Group_2__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3833:2: rule__Initial__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Initial__Group_2__1__Impl_in_rule__Initial__Group_2__17603);
            rule__Initial__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__Group_2__1"


    // $ANTLR start "rule__Initial__Group_2__1__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3839:1: rule__Initial__Group_2__1__Impl : ( ( rule__Initial__InternalIdAssignment_2_1 ) ) ;
    public final void rule__Initial__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3843:1: ( ( ( rule__Initial__InternalIdAssignment_2_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3844:1: ( ( rule__Initial__InternalIdAssignment_2_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3844:1: ( ( rule__Initial__InternalIdAssignment_2_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3845:1: ( rule__Initial__InternalIdAssignment_2_1 )
            {
             before(grammarAccess.getInitialAccess().getInternalIdAssignment_2_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3846:1: ( rule__Initial__InternalIdAssignment_2_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3846:2: rule__Initial__InternalIdAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Initial__InternalIdAssignment_2_1_in_rule__Initial__Group_2__1__Impl7630);
            rule__Initial__InternalIdAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getInitialAccess().getInternalIdAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__Group_2__1__Impl"


    // $ANTLR start "rule__Final__Group__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3860:1: rule__Final__Group__0 : rule__Final__Group__0__Impl rule__Final__Group__1 ;
    public final void rule__Final__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3864:1: ( rule__Final__Group__0__Impl rule__Final__Group__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3865:2: rule__Final__Group__0__Impl rule__Final__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Final__Group__0__Impl_in_rule__Final__Group__07664);
            rule__Final__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Final__Group__1_in_rule__Final__Group__07667);
            rule__Final__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group__0"


    // $ANTLR start "rule__Final__Group__0__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3872:1: rule__Final__Group__0__Impl : ( () ) ;
    public final void rule__Final__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3876:1: ( ( () ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3877:1: ( () )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3877:1: ( () )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3878:1: ()
            {
             before(grammarAccess.getFinalAccess().getFinalAction_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3879:1: ()
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3881:1: 
            {
            }

             after(grammarAccess.getFinalAccess().getFinalAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group__0__Impl"


    // $ANTLR start "rule__Final__Group__1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3891:1: rule__Final__Group__1 : rule__Final__Group__1__Impl rule__Final__Group__2 ;
    public final void rule__Final__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3895:1: ( rule__Final__Group__1__Impl rule__Final__Group__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3896:2: rule__Final__Group__1__Impl rule__Final__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Final__Group__1__Impl_in_rule__Final__Group__17725);
            rule__Final__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Final__Group__2_in_rule__Final__Group__17728);
            rule__Final__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group__1"


    // $ANTLR start "rule__Final__Group__1__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3903:1: rule__Final__Group__1__Impl : ( 'Final' ) ;
    public final void rule__Final__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3907:1: ( ( 'Final' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3908:1: ( 'Final' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3908:1: ( 'Final' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3909:1: 'Final'
            {
             before(grammarAccess.getFinalAccess().getFinalKeyword_1()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__Final__Group__1__Impl7756); 
             after(grammarAccess.getFinalAccess().getFinalKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group__1__Impl"


    // $ANTLR start "rule__Final__Group__2"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3922:1: rule__Final__Group__2 : rule__Final__Group__2__Impl ;
    public final void rule__Final__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3926:1: ( rule__Final__Group__2__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3927:2: rule__Final__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Final__Group__2__Impl_in_rule__Final__Group__27787);
            rule__Final__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group__2"


    // $ANTLR start "rule__Final__Group__2__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3933:1: rule__Final__Group__2__Impl : ( ( rule__Final__Group_2__0 )? ) ;
    public final void rule__Final__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3937:1: ( ( ( rule__Final__Group_2__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3938:1: ( ( rule__Final__Group_2__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3938:1: ( ( rule__Final__Group_2__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3939:1: ( rule__Final__Group_2__0 )?
            {
             before(grammarAccess.getFinalAccess().getGroup_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3940:1: ( rule__Final__Group_2__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==35) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3940:2: rule__Final__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Final__Group_2__0_in_rule__Final__Group__2__Impl7814);
                    rule__Final__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFinalAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group__2__Impl"


    // $ANTLR start "rule__Final__Group_2__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3956:1: rule__Final__Group_2__0 : rule__Final__Group_2__0__Impl rule__Final__Group_2__1 ;
    public final void rule__Final__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3960:1: ( rule__Final__Group_2__0__Impl rule__Final__Group_2__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3961:2: rule__Final__Group_2__0__Impl rule__Final__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Final__Group_2__0__Impl_in_rule__Final__Group_2__07851);
            rule__Final__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Final__Group_2__1_in_rule__Final__Group_2__07854);
            rule__Final__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group_2__0"


    // $ANTLR start "rule__Final__Group_2__0__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3968:1: rule__Final__Group_2__0__Impl : ( 'internalId' ) ;
    public final void rule__Final__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3972:1: ( ( 'internalId' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3973:1: ( 'internalId' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3973:1: ( 'internalId' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3974:1: 'internalId'
            {
             before(grammarAccess.getFinalAccess().getInternalIdKeyword_2_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Final__Group_2__0__Impl7882); 
             after(grammarAccess.getFinalAccess().getInternalIdKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group_2__0__Impl"


    // $ANTLR start "rule__Final__Group_2__1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3987:1: rule__Final__Group_2__1 : rule__Final__Group_2__1__Impl ;
    public final void rule__Final__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3991:1: ( rule__Final__Group_2__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3992:2: rule__Final__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Final__Group_2__1__Impl_in_rule__Final__Group_2__17913);
            rule__Final__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group_2__1"


    // $ANTLR start "rule__Final__Group_2__1__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3998:1: rule__Final__Group_2__1__Impl : ( ( rule__Final__InternalIdAssignment_2_1 ) ) ;
    public final void rule__Final__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4002:1: ( ( ( rule__Final__InternalIdAssignment_2_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4003:1: ( ( rule__Final__InternalIdAssignment_2_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4003:1: ( ( rule__Final__InternalIdAssignment_2_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4004:1: ( rule__Final__InternalIdAssignment_2_1 )
            {
             before(grammarAccess.getFinalAccess().getInternalIdAssignment_2_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4005:1: ( rule__Final__InternalIdAssignment_2_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4005:2: rule__Final__InternalIdAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Final__InternalIdAssignment_2_1_in_rule__Final__Group_2__1__Impl7940);
            rule__Final__InternalIdAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFinalAccess().getInternalIdAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group_2__1__Impl"


    // $ANTLR start "rule__Any__Group__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4019:1: rule__Any__Group__0 : rule__Any__Group__0__Impl rule__Any__Group__1 ;
    public final void rule__Any__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4023:1: ( rule__Any__Group__0__Impl rule__Any__Group__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4024:2: rule__Any__Group__0__Impl rule__Any__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Any__Group__0__Impl_in_rule__Any__Group__07974);
            rule__Any__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Any__Group__1_in_rule__Any__Group__07977);
            rule__Any__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Any__Group__0"


    // $ANTLR start "rule__Any__Group__0__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4031:1: rule__Any__Group__0__Impl : ( () ) ;
    public final void rule__Any__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4035:1: ( ( () ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4036:1: ( () )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4036:1: ( () )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4037:1: ()
            {
             before(grammarAccess.getAnyAccess().getAnyAction_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4038:1: ()
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4040:1: 
            {
            }

             after(grammarAccess.getAnyAccess().getAnyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Any__Group__0__Impl"


    // $ANTLR start "rule__Any__Group__1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4050:1: rule__Any__Group__1 : rule__Any__Group__1__Impl rule__Any__Group__2 ;
    public final void rule__Any__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4054:1: ( rule__Any__Group__1__Impl rule__Any__Group__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4055:2: rule__Any__Group__1__Impl rule__Any__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Any__Group__1__Impl_in_rule__Any__Group__18035);
            rule__Any__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Any__Group__2_in_rule__Any__Group__18038);
            rule__Any__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Any__Group__1"


    // $ANTLR start "rule__Any__Group__1__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4062:1: rule__Any__Group__1__Impl : ( 'Any' ) ;
    public final void rule__Any__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4066:1: ( ( 'Any' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4067:1: ( 'Any' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4067:1: ( 'Any' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4068:1: 'Any'
            {
             before(grammarAccess.getAnyAccess().getAnyKeyword_1()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__Any__Group__1__Impl8066); 
             after(grammarAccess.getAnyAccess().getAnyKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Any__Group__1__Impl"


    // $ANTLR start "rule__Any__Group__2"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4081:1: rule__Any__Group__2 : rule__Any__Group__2__Impl ;
    public final void rule__Any__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4085:1: ( rule__Any__Group__2__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4086:2: rule__Any__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Any__Group__2__Impl_in_rule__Any__Group__28097);
            rule__Any__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Any__Group__2"


    // $ANTLR start "rule__Any__Group__2__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4092:1: rule__Any__Group__2__Impl : ( ( rule__Any__Group_2__0 )? ) ;
    public final void rule__Any__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4096:1: ( ( ( rule__Any__Group_2__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4097:1: ( ( rule__Any__Group_2__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4097:1: ( ( rule__Any__Group_2__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4098:1: ( rule__Any__Group_2__0 )?
            {
             before(grammarAccess.getAnyAccess().getGroup_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4099:1: ( rule__Any__Group_2__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==35) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4099:2: rule__Any__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Any__Group_2__0_in_rule__Any__Group__2__Impl8124);
                    rule__Any__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnyAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Any__Group__2__Impl"


    // $ANTLR start "rule__Any__Group_2__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4115:1: rule__Any__Group_2__0 : rule__Any__Group_2__0__Impl rule__Any__Group_2__1 ;
    public final void rule__Any__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4119:1: ( rule__Any__Group_2__0__Impl rule__Any__Group_2__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4120:2: rule__Any__Group_2__0__Impl rule__Any__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Any__Group_2__0__Impl_in_rule__Any__Group_2__08161);
            rule__Any__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Any__Group_2__1_in_rule__Any__Group_2__08164);
            rule__Any__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Any__Group_2__0"


    // $ANTLR start "rule__Any__Group_2__0__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4127:1: rule__Any__Group_2__0__Impl : ( 'internalId' ) ;
    public final void rule__Any__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4131:1: ( ( 'internalId' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4132:1: ( 'internalId' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4132:1: ( 'internalId' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4133:1: 'internalId'
            {
             before(grammarAccess.getAnyAccess().getInternalIdKeyword_2_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Any__Group_2__0__Impl8192); 
             after(grammarAccess.getAnyAccess().getInternalIdKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Any__Group_2__0__Impl"


    // $ANTLR start "rule__Any__Group_2__1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4146:1: rule__Any__Group_2__1 : rule__Any__Group_2__1__Impl ;
    public final void rule__Any__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4150:1: ( rule__Any__Group_2__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4151:2: rule__Any__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Any__Group_2__1__Impl_in_rule__Any__Group_2__18223);
            rule__Any__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Any__Group_2__1"


    // $ANTLR start "rule__Any__Group_2__1__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4157:1: rule__Any__Group_2__1__Impl : ( ( rule__Any__InternalIdAssignment_2_1 ) ) ;
    public final void rule__Any__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4161:1: ( ( ( rule__Any__InternalIdAssignment_2_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4162:1: ( ( rule__Any__InternalIdAssignment_2_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4162:1: ( ( rule__Any__InternalIdAssignment_2_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4163:1: ( rule__Any__InternalIdAssignment_2_1 )
            {
             before(grammarAccess.getAnyAccess().getInternalIdAssignment_2_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4164:1: ( rule__Any__InternalIdAssignment_2_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4164:2: rule__Any__InternalIdAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Any__InternalIdAssignment_2_1_in_rule__Any__Group_2__1__Impl8250);
            rule__Any__InternalIdAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAnyAccess().getInternalIdAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Any__Group_2__1__Impl"


    // $ANTLR start "rule__Junction__Group__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4178:1: rule__Junction__Group__0 : rule__Junction__Group__0__Impl rule__Junction__Group__1 ;
    public final void rule__Junction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4182:1: ( rule__Junction__Group__0__Impl rule__Junction__Group__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4183:2: rule__Junction__Group__0__Impl rule__Junction__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Junction__Group__0__Impl_in_rule__Junction__Group__08284);
            rule__Junction__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Junction__Group__1_in_rule__Junction__Group__08287);
            rule__Junction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Junction__Group__0"


    // $ANTLR start "rule__Junction__Group__0__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4190:1: rule__Junction__Group__0__Impl : ( () ) ;
    public final void rule__Junction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4194:1: ( ( () ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4195:1: ( () )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4195:1: ( () )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4196:1: ()
            {
             before(grammarAccess.getJunctionAccess().getJunctionAction_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4197:1: ()
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4199:1: 
            {
            }

             after(grammarAccess.getJunctionAccess().getJunctionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Junction__Group__0__Impl"


    // $ANTLR start "rule__Junction__Group__1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4209:1: rule__Junction__Group__1 : rule__Junction__Group__1__Impl rule__Junction__Group__2 ;
    public final void rule__Junction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4213:1: ( rule__Junction__Group__1__Impl rule__Junction__Group__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4214:2: rule__Junction__Group__1__Impl rule__Junction__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Junction__Group__1__Impl_in_rule__Junction__Group__18345);
            rule__Junction__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Junction__Group__2_in_rule__Junction__Group__18348);
            rule__Junction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Junction__Group__1"


    // $ANTLR start "rule__Junction__Group__1__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4221:1: rule__Junction__Group__1__Impl : ( 'Junction' ) ;
    public final void rule__Junction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4225:1: ( ( 'Junction' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4226:1: ( 'Junction' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4226:1: ( 'Junction' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4227:1: 'Junction'
            {
             before(grammarAccess.getJunctionAccess().getJunctionKeyword_1()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Junction__Group__1__Impl8376); 
             after(grammarAccess.getJunctionAccess().getJunctionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Junction__Group__1__Impl"


    // $ANTLR start "rule__Junction__Group__2"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4240:1: rule__Junction__Group__2 : rule__Junction__Group__2__Impl ;
    public final void rule__Junction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4244:1: ( rule__Junction__Group__2__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4245:2: rule__Junction__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Junction__Group__2__Impl_in_rule__Junction__Group__28407);
            rule__Junction__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Junction__Group__2"


    // $ANTLR start "rule__Junction__Group__2__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4251:1: rule__Junction__Group__2__Impl : ( ( rule__Junction__Group_2__0 )? ) ;
    public final void rule__Junction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4255:1: ( ( ( rule__Junction__Group_2__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4256:1: ( ( rule__Junction__Group_2__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4256:1: ( ( rule__Junction__Group_2__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4257:1: ( rule__Junction__Group_2__0 )?
            {
             before(grammarAccess.getJunctionAccess().getGroup_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4258:1: ( rule__Junction__Group_2__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==35) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4258:2: rule__Junction__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Junction__Group_2__0_in_rule__Junction__Group__2__Impl8434);
                    rule__Junction__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJunctionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Junction__Group__2__Impl"


    // $ANTLR start "rule__Junction__Group_2__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4274:1: rule__Junction__Group_2__0 : rule__Junction__Group_2__0__Impl rule__Junction__Group_2__1 ;
    public final void rule__Junction__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4278:1: ( rule__Junction__Group_2__0__Impl rule__Junction__Group_2__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4279:2: rule__Junction__Group_2__0__Impl rule__Junction__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Junction__Group_2__0__Impl_in_rule__Junction__Group_2__08471);
            rule__Junction__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Junction__Group_2__1_in_rule__Junction__Group_2__08474);
            rule__Junction__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Junction__Group_2__0"


    // $ANTLR start "rule__Junction__Group_2__0__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4286:1: rule__Junction__Group_2__0__Impl : ( 'internalId' ) ;
    public final void rule__Junction__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4290:1: ( ( 'internalId' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4291:1: ( 'internalId' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4291:1: ( 'internalId' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4292:1: 'internalId'
            {
             before(grammarAccess.getJunctionAccess().getInternalIdKeyword_2_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Junction__Group_2__0__Impl8502); 
             after(grammarAccess.getJunctionAccess().getInternalIdKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Junction__Group_2__0__Impl"


    // $ANTLR start "rule__Junction__Group_2__1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4305:1: rule__Junction__Group_2__1 : rule__Junction__Group_2__1__Impl ;
    public final void rule__Junction__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4309:1: ( rule__Junction__Group_2__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4310:2: rule__Junction__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Junction__Group_2__1__Impl_in_rule__Junction__Group_2__18533);
            rule__Junction__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Junction__Group_2__1"


    // $ANTLR start "rule__Junction__Group_2__1__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4316:1: rule__Junction__Group_2__1__Impl : ( ( rule__Junction__InternalIdAssignment_2_1 ) ) ;
    public final void rule__Junction__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4320:1: ( ( ( rule__Junction__InternalIdAssignment_2_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4321:1: ( ( rule__Junction__InternalIdAssignment_2_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4321:1: ( ( rule__Junction__InternalIdAssignment_2_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4322:1: ( rule__Junction__InternalIdAssignment_2_1 )
            {
             before(grammarAccess.getJunctionAccess().getInternalIdAssignment_2_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4323:1: ( rule__Junction__InternalIdAssignment_2_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4323:2: rule__Junction__InternalIdAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Junction__InternalIdAssignment_2_1_in_rule__Junction__Group_2__1__Impl8560);
            rule__Junction__InternalIdAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getJunctionAccess().getInternalIdAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Junction__Group_2__1__Impl"


    // $ANTLR start "rule__Fork__Group__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4337:1: rule__Fork__Group__0 : rule__Fork__Group__0__Impl rule__Fork__Group__1 ;
    public final void rule__Fork__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4341:1: ( rule__Fork__Group__0__Impl rule__Fork__Group__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4342:2: rule__Fork__Group__0__Impl rule__Fork__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fork__Group__0__Impl_in_rule__Fork__Group__08594);
            rule__Fork__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fork__Group__1_in_rule__Fork__Group__08597);
            rule__Fork__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fork__Group__0"


    // $ANTLR start "rule__Fork__Group__0__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4349:1: rule__Fork__Group__0__Impl : ( () ) ;
    public final void rule__Fork__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4353:1: ( ( () ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4354:1: ( () )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4354:1: ( () )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4355:1: ()
            {
             before(grammarAccess.getForkAccess().getForkAction_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4356:1: ()
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4358:1: 
            {
            }

             after(grammarAccess.getForkAccess().getForkAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fork__Group__0__Impl"


    // $ANTLR start "rule__Fork__Group__1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4368:1: rule__Fork__Group__1 : rule__Fork__Group__1__Impl rule__Fork__Group__2 ;
    public final void rule__Fork__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4372:1: ( rule__Fork__Group__1__Impl rule__Fork__Group__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4373:2: rule__Fork__Group__1__Impl rule__Fork__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fork__Group__1__Impl_in_rule__Fork__Group__18655);
            rule__Fork__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fork__Group__2_in_rule__Fork__Group__18658);
            rule__Fork__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fork__Group__1"


    // $ANTLR start "rule__Fork__Group__1__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4380:1: rule__Fork__Group__1__Impl : ( 'Fork' ) ;
    public final void rule__Fork__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4384:1: ( ( 'Fork' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4385:1: ( 'Fork' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4385:1: ( 'Fork' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4386:1: 'Fork'
            {
             before(grammarAccess.getForkAccess().getForkKeyword_1()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__Fork__Group__1__Impl8686); 
             after(grammarAccess.getForkAccess().getForkKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fork__Group__1__Impl"


    // $ANTLR start "rule__Fork__Group__2"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4399:1: rule__Fork__Group__2 : rule__Fork__Group__2__Impl ;
    public final void rule__Fork__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4403:1: ( rule__Fork__Group__2__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4404:2: rule__Fork__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fork__Group__2__Impl_in_rule__Fork__Group__28717);
            rule__Fork__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fork__Group__2"


    // $ANTLR start "rule__Fork__Group__2__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4410:1: rule__Fork__Group__2__Impl : ( ( rule__Fork__Group_2__0 )? ) ;
    public final void rule__Fork__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4414:1: ( ( ( rule__Fork__Group_2__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4415:1: ( ( rule__Fork__Group_2__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4415:1: ( ( rule__Fork__Group_2__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4416:1: ( rule__Fork__Group_2__0 )?
            {
             before(grammarAccess.getForkAccess().getGroup_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4417:1: ( rule__Fork__Group_2__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==35) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4417:2: rule__Fork__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Fork__Group_2__0_in_rule__Fork__Group__2__Impl8744);
                    rule__Fork__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getForkAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fork__Group__2__Impl"


    // $ANTLR start "rule__Fork__Group_2__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4433:1: rule__Fork__Group_2__0 : rule__Fork__Group_2__0__Impl rule__Fork__Group_2__1 ;
    public final void rule__Fork__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4437:1: ( rule__Fork__Group_2__0__Impl rule__Fork__Group_2__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4438:2: rule__Fork__Group_2__0__Impl rule__Fork__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fork__Group_2__0__Impl_in_rule__Fork__Group_2__08781);
            rule__Fork__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fork__Group_2__1_in_rule__Fork__Group_2__08784);
            rule__Fork__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fork__Group_2__0"


    // $ANTLR start "rule__Fork__Group_2__0__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4445:1: rule__Fork__Group_2__0__Impl : ( 'internalId' ) ;
    public final void rule__Fork__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4449:1: ( ( 'internalId' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4450:1: ( 'internalId' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4450:1: ( 'internalId' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4451:1: 'internalId'
            {
             before(grammarAccess.getForkAccess().getInternalIdKeyword_2_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Fork__Group_2__0__Impl8812); 
             after(grammarAccess.getForkAccess().getInternalIdKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fork__Group_2__0__Impl"


    // $ANTLR start "rule__Fork__Group_2__1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4464:1: rule__Fork__Group_2__1 : rule__Fork__Group_2__1__Impl ;
    public final void rule__Fork__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4468:1: ( rule__Fork__Group_2__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4469:2: rule__Fork__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fork__Group_2__1__Impl_in_rule__Fork__Group_2__18843);
            rule__Fork__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fork__Group_2__1"


    // $ANTLR start "rule__Fork__Group_2__1__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4475:1: rule__Fork__Group_2__1__Impl : ( ( rule__Fork__InternalIdAssignment_2_1 ) ) ;
    public final void rule__Fork__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4479:1: ( ( ( rule__Fork__InternalIdAssignment_2_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4480:1: ( ( rule__Fork__InternalIdAssignment_2_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4480:1: ( ( rule__Fork__InternalIdAssignment_2_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4481:1: ( rule__Fork__InternalIdAssignment_2_1 )
            {
             before(grammarAccess.getForkAccess().getInternalIdAssignment_2_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4482:1: ( rule__Fork__InternalIdAssignment_2_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4482:2: rule__Fork__InternalIdAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fork__InternalIdAssignment_2_1_in_rule__Fork__Group_2__1__Impl8870);
            rule__Fork__InternalIdAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getForkAccess().getInternalIdAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fork__Group_2__1__Impl"


    // $ANTLR start "rule__Invariant__Group__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4496:1: rule__Invariant__Group__0 : rule__Invariant__Group__0__Impl rule__Invariant__Group__1 ;
    public final void rule__Invariant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4500:1: ( rule__Invariant__Group__0__Impl rule__Invariant__Group__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4501:2: rule__Invariant__Group__0__Impl rule__Invariant__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__0__Impl_in_rule__Invariant__Group__08904);
            rule__Invariant__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__1_in_rule__Invariant__Group__08907);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4508:1: rule__Invariant__Group__0__Impl : ( 'Invariant' ) ;
    public final void rule__Invariant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4512:1: ( ( 'Invariant' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4513:1: ( 'Invariant' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4513:1: ( 'Invariant' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4514:1: 'Invariant'
            {
             before(grammarAccess.getInvariantAccess().getInvariantKeyword_0()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__Invariant__Group__0__Impl8935); 
             after(grammarAccess.getInvariantAccess().getInvariantKeyword_0()); 

            }


            }

        }
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4527:1: rule__Invariant__Group__1 : rule__Invariant__Group__1__Impl rule__Invariant__Group__2 ;
    public final void rule__Invariant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4531:1: ( rule__Invariant__Group__1__Impl rule__Invariant__Group__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4532:2: rule__Invariant__Group__1__Impl rule__Invariant__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__1__Impl_in_rule__Invariant__Group__18966);
            rule__Invariant__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__2_in_rule__Invariant__Group__18969);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4539:1: rule__Invariant__Group__1__Impl : ( '@' ) ;
    public final void rule__Invariant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4543:1: ( ( '@' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4544:1: ( '@' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4544:1: ( '@' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4545:1: '@'
            {
             before(grammarAccess.getInvariantAccess().getCommercialAtKeyword_1()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__Invariant__Group__1__Impl8997); 
             after(grammarAccess.getInvariantAccess().getCommercialAtKeyword_1()); 

            }


            }

        }
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4558:1: rule__Invariant__Group__2 : rule__Invariant__Group__2__Impl rule__Invariant__Group__3 ;
    public final void rule__Invariant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4562:1: ( rule__Invariant__Group__2__Impl rule__Invariant__Group__3 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4563:2: rule__Invariant__Group__2__Impl rule__Invariant__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__2__Impl_in_rule__Invariant__Group__29028);
            rule__Invariant__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__3_in_rule__Invariant__Group__29031);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4570:1: rule__Invariant__Group__2__Impl : ( ( rule__Invariant__NameAssignment_2 ) ) ;
    public final void rule__Invariant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4574:1: ( ( ( rule__Invariant__NameAssignment_2 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4575:1: ( ( rule__Invariant__NameAssignment_2 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4575:1: ( ( rule__Invariant__NameAssignment_2 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4576:1: ( rule__Invariant__NameAssignment_2 )
            {
             before(grammarAccess.getInvariantAccess().getNameAssignment_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4577:1: ( rule__Invariant__NameAssignment_2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4577:2: rule__Invariant__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__NameAssignment_2_in_rule__Invariant__Group__2__Impl9058);
            rule__Invariant__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInvariantAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4587:1: rule__Invariant__Group__3 : rule__Invariant__Group__3__Impl rule__Invariant__Group__4 ;
    public final void rule__Invariant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4591:1: ( rule__Invariant__Group__3__Impl rule__Invariant__Group__4 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4592:2: rule__Invariant__Group__3__Impl rule__Invariant__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__3__Impl_in_rule__Invariant__Group__39088);
            rule__Invariant__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__4_in_rule__Invariant__Group__39091);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4599:1: rule__Invariant__Group__3__Impl : ( ( rule__Invariant__TheoremAssignment_3 )? ) ;
    public final void rule__Invariant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4603:1: ( ( ( rule__Invariant__TheoremAssignment_3 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4604:1: ( ( rule__Invariant__TheoremAssignment_3 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4604:1: ( ( rule__Invariant__TheoremAssignment_3 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4605:1: ( rule__Invariant__TheoremAssignment_3 )?
            {
             before(grammarAccess.getInvariantAccess().getTheoremAssignment_3()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4606:1: ( rule__Invariant__TheoremAssignment_3 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==47) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4606:2: rule__Invariant__TheoremAssignment_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Invariant__TheoremAssignment_3_in_rule__Invariant__Group__3__Impl9118);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4616:1: rule__Invariant__Group__4 : rule__Invariant__Group__4__Impl rule__Invariant__Group__5 ;
    public final void rule__Invariant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4620:1: ( rule__Invariant__Group__4__Impl rule__Invariant__Group__5 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4621:2: rule__Invariant__Group__4__Impl rule__Invariant__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__4__Impl_in_rule__Invariant__Group__49149);
            rule__Invariant__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__5_in_rule__Invariant__Group__49152);
            rule__Invariant__Group__5();

            state._fsp--;


            }

        }
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4628:1: rule__Invariant__Group__4__Impl : ( ( rule__Invariant__PredicateAssignment_4 ) ) ;
    public final void rule__Invariant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4632:1: ( ( ( rule__Invariant__PredicateAssignment_4 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4633:1: ( ( rule__Invariant__PredicateAssignment_4 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4633:1: ( ( rule__Invariant__PredicateAssignment_4 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4634:1: ( rule__Invariant__PredicateAssignment_4 )
            {
             before(grammarAccess.getInvariantAccess().getPredicateAssignment_4()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4635:1: ( rule__Invariant__PredicateAssignment_4 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4635:2: rule__Invariant__PredicateAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__PredicateAssignment_4_in_rule__Invariant__Group__4__Impl9179);
            rule__Invariant__PredicateAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getInvariantAccess().getPredicateAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Invariant__Group__5"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4645:1: rule__Invariant__Group__5 : rule__Invariant__Group__5__Impl ;
    public final void rule__Invariant__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4649:1: ( rule__Invariant__Group__5__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4650:2: rule__Invariant__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__5__Impl_in_rule__Invariant__Group__59209);
            rule__Invariant__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__Group__5"


    // $ANTLR start "rule__Invariant__Group__5__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4656:1: rule__Invariant__Group__5__Impl : ( ( rule__Invariant__Group_5__0 )? ) ;
    public final void rule__Invariant__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4660:1: ( ( ( rule__Invariant__Group_5__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4661:1: ( ( rule__Invariant__Group_5__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4661:1: ( ( rule__Invariant__Group_5__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4662:1: ( rule__Invariant__Group_5__0 )?
            {
             before(grammarAccess.getInvariantAccess().getGroup_5()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4663:1: ( rule__Invariant__Group_5__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==15) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4663:2: rule__Invariant__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group_5__0_in_rule__Invariant__Group__5__Impl9236);
                    rule__Invariant__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInvariantAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__Group__5__Impl"


    // $ANTLR start "rule__Invariant__Group_5__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4685:1: rule__Invariant__Group_5__0 : rule__Invariant__Group_5__0__Impl rule__Invariant__Group_5__1 ;
    public final void rule__Invariant__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4689:1: ( rule__Invariant__Group_5__0__Impl rule__Invariant__Group_5__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4690:2: rule__Invariant__Group_5__0__Impl rule__Invariant__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group_5__0__Impl_in_rule__Invariant__Group_5__09279);
            rule__Invariant__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group_5__1_in_rule__Invariant__Group_5__09282);
            rule__Invariant__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__Group_5__0"


    // $ANTLR start "rule__Invariant__Group_5__0__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4697:1: rule__Invariant__Group_5__0__Impl : ( '>' ) ;
    public final void rule__Invariant__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4701:1: ( ( '>' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4702:1: ( '>' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4702:1: ( '>' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4703:1: '>'
            {
             before(grammarAccess.getInvariantAccess().getGreaterThanSignKeyword_5_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Invariant__Group_5__0__Impl9310); 
             after(grammarAccess.getInvariantAccess().getGreaterThanSignKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__Group_5__0__Impl"


    // $ANTLR start "rule__Invariant__Group_5__1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4716:1: rule__Invariant__Group_5__1 : rule__Invariant__Group_5__1__Impl ;
    public final void rule__Invariant__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4720:1: ( rule__Invariant__Group_5__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4721:2: rule__Invariant__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group_5__1__Impl_in_rule__Invariant__Group_5__19341);
            rule__Invariant__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__Group_5__1"


    // $ANTLR start "rule__Invariant__Group_5__1__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4727:1: rule__Invariant__Group_5__1__Impl : ( ( rule__Invariant__CommentAssignment_5_1 ) ) ;
    public final void rule__Invariant__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4731:1: ( ( ( rule__Invariant__CommentAssignment_5_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4732:1: ( ( rule__Invariant__CommentAssignment_5_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4732:1: ( ( rule__Invariant__CommentAssignment_5_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4733:1: ( rule__Invariant__CommentAssignment_5_1 )
            {
             before(grammarAccess.getInvariantAccess().getCommentAssignment_5_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4734:1: ( rule__Invariant__CommentAssignment_5_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4734:2: rule__Invariant__CommentAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__CommentAssignment_5_1_in_rule__Invariant__Group_5__1__Impl9368);
            rule__Invariant__CommentAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getInvariantAccess().getCommentAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__Group_5__1__Impl"


    // $ANTLR start "rule__TypedParameter__Group__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4748:1: rule__TypedParameter__Group__0 : rule__TypedParameter__Group__0__Impl rule__TypedParameter__Group__1 ;
    public final void rule__TypedParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4752:1: ( rule__TypedParameter__Group__0__Impl rule__TypedParameter__Group__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4753:2: rule__TypedParameter__Group__0__Impl rule__TypedParameter__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedParameter__Group__0__Impl_in_rule__TypedParameter__Group__09402);
            rule__TypedParameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TypedParameter__Group__1_in_rule__TypedParameter__Group__09405);
            rule__TypedParameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedParameter__Group__0"


    // $ANTLR start "rule__TypedParameter__Group__0__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4760:1: rule__TypedParameter__Group__0__Impl : ( 'TypedParameter' ) ;
    public final void rule__TypedParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4764:1: ( ( 'TypedParameter' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4765:1: ( 'TypedParameter' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4765:1: ( 'TypedParameter' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4766:1: 'TypedParameter'
            {
             before(grammarAccess.getTypedParameterAccess().getTypedParameterKeyword_0()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__TypedParameter__Group__0__Impl9433); 
             after(grammarAccess.getTypedParameterAccess().getTypedParameterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedParameter__Group__0__Impl"


    // $ANTLR start "rule__TypedParameter__Group__1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4779:1: rule__TypedParameter__Group__1 : rule__TypedParameter__Group__1__Impl rule__TypedParameter__Group__2 ;
    public final void rule__TypedParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4783:1: ( rule__TypedParameter__Group__1__Impl rule__TypedParameter__Group__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4784:2: rule__TypedParameter__Group__1__Impl rule__TypedParameter__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedParameter__Group__1__Impl_in_rule__TypedParameter__Group__19464);
            rule__TypedParameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TypedParameter__Group__2_in_rule__TypedParameter__Group__19467);
            rule__TypedParameter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedParameter__Group__1"


    // $ANTLR start "rule__TypedParameter__Group__1__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4791:1: rule__TypedParameter__Group__1__Impl : ( ( rule__TypedParameter__NameAssignment_1 ) ) ;
    public final void rule__TypedParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4795:1: ( ( ( rule__TypedParameter__NameAssignment_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4796:1: ( ( rule__TypedParameter__NameAssignment_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4796:1: ( ( rule__TypedParameter__NameAssignment_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4797:1: ( rule__TypedParameter__NameAssignment_1 )
            {
             before(grammarAccess.getTypedParameterAccess().getNameAssignment_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4798:1: ( rule__TypedParameter__NameAssignment_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4798:2: rule__TypedParameter__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedParameter__NameAssignment_1_in_rule__TypedParameter__Group__1__Impl9494);
            rule__TypedParameter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypedParameterAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedParameter__Group__1__Impl"


    // $ANTLR start "rule__TypedParameter__Group__2"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4808:1: rule__TypedParameter__Group__2 : rule__TypedParameter__Group__2__Impl rule__TypedParameter__Group__3 ;
    public final void rule__TypedParameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4812:1: ( rule__TypedParameter__Group__2__Impl rule__TypedParameter__Group__3 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4813:2: rule__TypedParameter__Group__2__Impl rule__TypedParameter__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedParameter__Group__2__Impl_in_rule__TypedParameter__Group__29524);
            rule__TypedParameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TypedParameter__Group__3_in_rule__TypedParameter__Group__29527);
            rule__TypedParameter__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedParameter__Group__2"


    // $ANTLR start "rule__TypedParameter__Group__2__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4820:1: rule__TypedParameter__Group__2__Impl : ( 'type' ) ;
    public final void rule__TypedParameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4824:1: ( ( 'type' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4825:1: ( 'type' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4825:1: ( 'type' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4826:1: 'type'
            {
             before(grammarAccess.getTypedParameterAccess().getTypeKeyword_2()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__TypedParameter__Group__2__Impl9555); 
             after(grammarAccess.getTypedParameterAccess().getTypeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedParameter__Group__2__Impl"


    // $ANTLR start "rule__TypedParameter__Group__3"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4839:1: rule__TypedParameter__Group__3 : rule__TypedParameter__Group__3__Impl rule__TypedParameter__Group__4 ;
    public final void rule__TypedParameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4843:1: ( rule__TypedParameter__Group__3__Impl rule__TypedParameter__Group__4 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4844:2: rule__TypedParameter__Group__3__Impl rule__TypedParameter__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedParameter__Group__3__Impl_in_rule__TypedParameter__Group__39586);
            rule__TypedParameter__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TypedParameter__Group__4_in_rule__TypedParameter__Group__39589);
            rule__TypedParameter__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedParameter__Group__3"


    // $ANTLR start "rule__TypedParameter__Group__3__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4851:1: rule__TypedParameter__Group__3__Impl : ( ( rule__TypedParameter__TypeAssignment_3 ) ) ;
    public final void rule__TypedParameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4855:1: ( ( ( rule__TypedParameter__TypeAssignment_3 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4856:1: ( ( rule__TypedParameter__TypeAssignment_3 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4856:1: ( ( rule__TypedParameter__TypeAssignment_3 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4857:1: ( rule__TypedParameter__TypeAssignment_3 )
            {
             before(grammarAccess.getTypedParameterAccess().getTypeAssignment_3()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4858:1: ( rule__TypedParameter__TypeAssignment_3 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4858:2: rule__TypedParameter__TypeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedParameter__TypeAssignment_3_in_rule__TypedParameter__Group__3__Impl9616);
            rule__TypedParameter__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTypedParameterAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedParameter__Group__3__Impl"


    // $ANTLR start "rule__TypedParameter__Group__4"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4868:1: rule__TypedParameter__Group__4 : rule__TypedParameter__Group__4__Impl ;
    public final void rule__TypedParameter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4872:1: ( rule__TypedParameter__Group__4__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4873:2: rule__TypedParameter__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedParameter__Group__4__Impl_in_rule__TypedParameter__Group__49646);
            rule__TypedParameter__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedParameter__Group__4"


    // $ANTLR start "rule__TypedParameter__Group__4__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4879:1: rule__TypedParameter__Group__4__Impl : ( ( rule__TypedParameter__Group_4__0 )? ) ;
    public final void rule__TypedParameter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4883:1: ( ( ( rule__TypedParameter__Group_4__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4884:1: ( ( rule__TypedParameter__Group_4__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4884:1: ( ( rule__TypedParameter__Group_4__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4885:1: ( rule__TypedParameter__Group_4__0 )?
            {
             before(grammarAccess.getTypedParameterAccess().getGroup_4()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4886:1: ( rule__TypedParameter__Group_4__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==15) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4886:2: rule__TypedParameter__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TypedParameter__Group_4__0_in_rule__TypedParameter__Group__4__Impl9673);
                    rule__TypedParameter__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypedParameterAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedParameter__Group__4__Impl"


    // $ANTLR start "rule__TypedParameter__Group_4__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4906:1: rule__TypedParameter__Group_4__0 : rule__TypedParameter__Group_4__0__Impl rule__TypedParameter__Group_4__1 ;
    public final void rule__TypedParameter__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4910:1: ( rule__TypedParameter__Group_4__0__Impl rule__TypedParameter__Group_4__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4911:2: rule__TypedParameter__Group_4__0__Impl rule__TypedParameter__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedParameter__Group_4__0__Impl_in_rule__TypedParameter__Group_4__09714);
            rule__TypedParameter__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TypedParameter__Group_4__1_in_rule__TypedParameter__Group_4__09717);
            rule__TypedParameter__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedParameter__Group_4__0"


    // $ANTLR start "rule__TypedParameter__Group_4__0__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4918:1: rule__TypedParameter__Group_4__0__Impl : ( '>' ) ;
    public final void rule__TypedParameter__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4922:1: ( ( '>' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4923:1: ( '>' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4923:1: ( '>' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4924:1: '>'
            {
             before(grammarAccess.getTypedParameterAccess().getGreaterThanSignKeyword_4_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__TypedParameter__Group_4__0__Impl9745); 
             after(grammarAccess.getTypedParameterAccess().getGreaterThanSignKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedParameter__Group_4__0__Impl"


    // $ANTLR start "rule__TypedParameter__Group_4__1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4937:1: rule__TypedParameter__Group_4__1 : rule__TypedParameter__Group_4__1__Impl ;
    public final void rule__TypedParameter__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4941:1: ( rule__TypedParameter__Group_4__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4942:2: rule__TypedParameter__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedParameter__Group_4__1__Impl_in_rule__TypedParameter__Group_4__19776);
            rule__TypedParameter__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedParameter__Group_4__1"


    // $ANTLR start "rule__TypedParameter__Group_4__1__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4948:1: rule__TypedParameter__Group_4__1__Impl : ( ( rule__TypedParameter__CommentAssignment_4_1 ) ) ;
    public final void rule__TypedParameter__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4952:1: ( ( ( rule__TypedParameter__CommentAssignment_4_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4953:1: ( ( rule__TypedParameter__CommentAssignment_4_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4953:1: ( ( rule__TypedParameter__CommentAssignment_4_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4954:1: ( rule__TypedParameter__CommentAssignment_4_1 )
            {
             before(grammarAccess.getTypedParameterAccess().getCommentAssignment_4_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4955:1: ( rule__TypedParameter__CommentAssignment_4_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4955:2: rule__TypedParameter__CommentAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedParameter__CommentAssignment_4_1_in_rule__TypedParameter__Group_4__1__Impl9803);
            rule__TypedParameter__CommentAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTypedParameterAccess().getCommentAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedParameter__Group_4__1__Impl"


    // $ANTLR start "rule__Guard__Group__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4969:1: rule__Guard__Group__0 : rule__Guard__Group__0__Impl rule__Guard__Group__1 ;
    public final void rule__Guard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4973:1: ( rule__Guard__Group__0__Impl rule__Guard__Group__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4974:2: rule__Guard__Group__0__Impl rule__Guard__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group__0__Impl_in_rule__Guard__Group__09837);
            rule__Guard__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group__1_in_rule__Guard__Group__09840);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4981:1: rule__Guard__Group__0__Impl : ( ( rule__Guard__TheoremAssignment_0 ) ) ;
    public final void rule__Guard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4985:1: ( ( ( rule__Guard__TheoremAssignment_0 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4986:1: ( ( rule__Guard__TheoremAssignment_0 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4986:1: ( ( rule__Guard__TheoremAssignment_0 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4987:1: ( rule__Guard__TheoremAssignment_0 )
            {
             before(grammarAccess.getGuardAccess().getTheoremAssignment_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4988:1: ( rule__Guard__TheoremAssignment_0 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4988:2: rule__Guard__TheoremAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Guard__TheoremAssignment_0_in_rule__Guard__Group__0__Impl9867);
            rule__Guard__TheoremAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGuardAccess().getTheoremAssignment_0()); 

            }


            }

        }
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4998:1: rule__Guard__Group__1 : rule__Guard__Group__1__Impl rule__Guard__Group__2 ;
    public final void rule__Guard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5002:1: ( rule__Guard__Group__1__Impl rule__Guard__Group__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5003:2: rule__Guard__Group__1__Impl rule__Guard__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group__1__Impl_in_rule__Guard__Group__19897);
            rule__Guard__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group__2_in_rule__Guard__Group__19900);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5010:1: rule__Guard__Group__1__Impl : ( '@' ) ;
    public final void rule__Guard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5014:1: ( ( '@' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5015:1: ( '@' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5015:1: ( '@' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5016:1: '@'
            {
             before(grammarAccess.getGuardAccess().getCommercialAtKeyword_1()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__Guard__Group__1__Impl9928); 
             after(grammarAccess.getGuardAccess().getCommercialAtKeyword_1()); 

            }


            }

        }
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5029:1: rule__Guard__Group__2 : rule__Guard__Group__2__Impl rule__Guard__Group__3 ;
    public final void rule__Guard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5033:1: ( rule__Guard__Group__2__Impl rule__Guard__Group__3 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5034:2: rule__Guard__Group__2__Impl rule__Guard__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group__2__Impl_in_rule__Guard__Group__29959);
            rule__Guard__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group__3_in_rule__Guard__Group__29962);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5041:1: rule__Guard__Group__2__Impl : ( ( rule__Guard__NameAssignment_2 ) ) ;
    public final void rule__Guard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5045:1: ( ( ( rule__Guard__NameAssignment_2 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5046:1: ( ( rule__Guard__NameAssignment_2 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5046:1: ( ( rule__Guard__NameAssignment_2 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5047:1: ( rule__Guard__NameAssignment_2 )
            {
             before(grammarAccess.getGuardAccess().getNameAssignment_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5048:1: ( rule__Guard__NameAssignment_2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5048:2: rule__Guard__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Guard__NameAssignment_2_in_rule__Guard__Group__2__Impl9989);
            rule__Guard__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGuardAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5058:1: rule__Guard__Group__3 : rule__Guard__Group__3__Impl rule__Guard__Group__4 ;
    public final void rule__Guard__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5062:1: ( rule__Guard__Group__3__Impl rule__Guard__Group__4 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5063:2: rule__Guard__Group__3__Impl rule__Guard__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group__3__Impl_in_rule__Guard__Group__310019);
            rule__Guard__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group__4_in_rule__Guard__Group__310022);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5070:1: rule__Guard__Group__3__Impl : ( ( rule__Guard__PredicateAssignment_3 ) ) ;
    public final void rule__Guard__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5074:1: ( ( ( rule__Guard__PredicateAssignment_3 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5075:1: ( ( rule__Guard__PredicateAssignment_3 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5075:1: ( ( rule__Guard__PredicateAssignment_3 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5076:1: ( rule__Guard__PredicateAssignment_3 )
            {
             before(grammarAccess.getGuardAccess().getPredicateAssignment_3()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5077:1: ( rule__Guard__PredicateAssignment_3 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5077:2: rule__Guard__PredicateAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Guard__PredicateAssignment_3_in_rule__Guard__Group__3__Impl10049);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5087:1: rule__Guard__Group__4 : rule__Guard__Group__4__Impl ;
    public final void rule__Guard__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5091:1: ( rule__Guard__Group__4__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5092:2: rule__Guard__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group__4__Impl_in_rule__Guard__Group__410079);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5098:1: rule__Guard__Group__4__Impl : ( ( rule__Guard__Group_4__0 )? ) ;
    public final void rule__Guard__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5102:1: ( ( ( rule__Guard__Group_4__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5103:1: ( ( rule__Guard__Group_4__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5103:1: ( ( rule__Guard__Group_4__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5104:1: ( rule__Guard__Group_4__0 )?
            {
             before(grammarAccess.getGuardAccess().getGroup_4()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5105:1: ( rule__Guard__Group_4__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==15) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5105:2: rule__Guard__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Guard__Group_4__0_in_rule__Guard__Group__4__Impl10106);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5125:1: rule__Guard__Group_4__0 : rule__Guard__Group_4__0__Impl rule__Guard__Group_4__1 ;
    public final void rule__Guard__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5129:1: ( rule__Guard__Group_4__0__Impl rule__Guard__Group_4__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5130:2: rule__Guard__Group_4__0__Impl rule__Guard__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group_4__0__Impl_in_rule__Guard__Group_4__010147);
            rule__Guard__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group_4__1_in_rule__Guard__Group_4__010150);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5137:1: rule__Guard__Group_4__0__Impl : ( '>' ) ;
    public final void rule__Guard__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5141:1: ( ( '>' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5142:1: ( '>' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5142:1: ( '>' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5143:1: '>'
            {
             before(grammarAccess.getGuardAccess().getGreaterThanSignKeyword_4_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Guard__Group_4__0__Impl10178); 
             after(grammarAccess.getGuardAccess().getGreaterThanSignKeyword_4_0()); 

            }


            }

        }
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5156:1: rule__Guard__Group_4__1 : rule__Guard__Group_4__1__Impl ;
    public final void rule__Guard__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5160:1: ( rule__Guard__Group_4__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5161:2: rule__Guard__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group_4__1__Impl_in_rule__Guard__Group_4__110209);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5167:1: rule__Guard__Group_4__1__Impl : ( ( rule__Guard__CommentAssignment_4_1 ) ) ;
    public final void rule__Guard__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5171:1: ( ( ( rule__Guard__CommentAssignment_4_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5172:1: ( ( rule__Guard__CommentAssignment_4_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5172:1: ( ( rule__Guard__CommentAssignment_4_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5173:1: ( rule__Guard__CommentAssignment_4_1 )
            {
             before(grammarAccess.getGuardAccess().getCommentAssignment_4_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5174:1: ( rule__Guard__CommentAssignment_4_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5174:2: rule__Guard__CommentAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Guard__CommentAssignment_4_1_in_rule__Guard__Group_4__1__Impl10236);
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


    // $ANTLR start "rule__Action__Group__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5188:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5192:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5193:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__0__Impl_in_rule__Action__Group__010270);
            rule__Action__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__1_in_rule__Action__Group__010273);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5200:1: rule__Action__Group__0__Impl : ( '@' ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5204:1: ( ( '@' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5205:1: ( '@' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5205:1: ( '@' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5206:1: '@'
            {
             before(grammarAccess.getActionAccess().getCommercialAtKeyword_0()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__Action__Group__0__Impl10301); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5219:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5223:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5224:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__1__Impl_in_rule__Action__Group__110332);
            rule__Action__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__2_in_rule__Action__Group__110335);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5231:1: rule__Action__Group__1__Impl : ( ( rule__Action__NameAssignment_1 ) ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5235:1: ( ( ( rule__Action__NameAssignment_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5236:1: ( ( rule__Action__NameAssignment_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5236:1: ( ( rule__Action__NameAssignment_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5237:1: ( rule__Action__NameAssignment_1 )
            {
             before(grammarAccess.getActionAccess().getNameAssignment_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5238:1: ( rule__Action__NameAssignment_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5238:2: rule__Action__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__NameAssignment_1_in_rule__Action__Group__1__Impl10362);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5248:1: rule__Action__Group__2 : rule__Action__Group__2__Impl rule__Action__Group__3 ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5252:1: ( rule__Action__Group__2__Impl rule__Action__Group__3 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5253:2: rule__Action__Group__2__Impl rule__Action__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__2__Impl_in_rule__Action__Group__210392);
            rule__Action__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__3_in_rule__Action__Group__210395);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5260:1: rule__Action__Group__2__Impl : ( 'action' ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5264:1: ( ( 'action' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5265:1: ( 'action' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5265:1: ( 'action' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5266:1: 'action'
            {
             before(grammarAccess.getActionAccess().getActionKeyword_2()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__Action__Group__2__Impl10423); 
             after(grammarAccess.getActionAccess().getActionKeyword_2()); 

            }


            }

        }
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5279:1: rule__Action__Group__3 : rule__Action__Group__3__Impl rule__Action__Group__4 ;
    public final void rule__Action__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5283:1: ( rule__Action__Group__3__Impl rule__Action__Group__4 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5284:2: rule__Action__Group__3__Impl rule__Action__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__3__Impl_in_rule__Action__Group__310454);
            rule__Action__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__4_in_rule__Action__Group__310457);
            rule__Action__Group__4();

            state._fsp--;


            }

        }
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5291:1: rule__Action__Group__3__Impl : ( ( rule__Action__ActionAssignment_3 ) ) ;
    public final void rule__Action__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5295:1: ( ( ( rule__Action__ActionAssignment_3 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5296:1: ( ( rule__Action__ActionAssignment_3 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5296:1: ( ( rule__Action__ActionAssignment_3 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5297:1: ( rule__Action__ActionAssignment_3 )
            {
             before(grammarAccess.getActionAccess().getActionAssignment_3()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5298:1: ( rule__Action__ActionAssignment_3 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5298:2: rule__Action__ActionAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__ActionAssignment_3_in_rule__Action__Group__3__Impl10484);
            rule__Action__ActionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getActionAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Action__Group__4"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5308:1: rule__Action__Group__4 : rule__Action__Group__4__Impl ;
    public final void rule__Action__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5312:1: ( rule__Action__Group__4__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5313:2: rule__Action__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__4__Impl_in_rule__Action__Group__410514);
            rule__Action__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__4"


    // $ANTLR start "rule__Action__Group__4__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5319:1: rule__Action__Group__4__Impl : ( ( rule__Action__Group_4__0 )? ) ;
    public final void rule__Action__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5323:1: ( ( ( rule__Action__Group_4__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5324:1: ( ( rule__Action__Group_4__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5324:1: ( ( rule__Action__Group_4__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5325:1: ( rule__Action__Group_4__0 )?
            {
             before(grammarAccess.getActionAccess().getGroup_4()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5326:1: ( rule__Action__Group_4__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==15) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5326:2: rule__Action__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Action__Group_4__0_in_rule__Action__Group__4__Impl10541);
                    rule__Action__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__4__Impl"


    // $ANTLR start "rule__Action__Group_4__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5346:1: rule__Action__Group_4__0 : rule__Action__Group_4__0__Impl rule__Action__Group_4__1 ;
    public final void rule__Action__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5350:1: ( rule__Action__Group_4__0__Impl rule__Action__Group_4__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5351:2: rule__Action__Group_4__0__Impl rule__Action__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__Group_4__0__Impl_in_rule__Action__Group_4__010582);
            rule__Action__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Action__Group_4__1_in_rule__Action__Group_4__010585);
            rule__Action__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_4__0"


    // $ANTLR start "rule__Action__Group_4__0__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5358:1: rule__Action__Group_4__0__Impl : ( '>' ) ;
    public final void rule__Action__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5362:1: ( ( '>' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5363:1: ( '>' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5363:1: ( '>' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5364:1: '>'
            {
             before(grammarAccess.getActionAccess().getGreaterThanSignKeyword_4_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Action__Group_4__0__Impl10613); 
             after(grammarAccess.getActionAccess().getGreaterThanSignKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_4__0__Impl"


    // $ANTLR start "rule__Action__Group_4__1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5377:1: rule__Action__Group_4__1 : rule__Action__Group_4__1__Impl ;
    public final void rule__Action__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5381:1: ( rule__Action__Group_4__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5382:2: rule__Action__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__Group_4__1__Impl_in_rule__Action__Group_4__110644);
            rule__Action__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_4__1"


    // $ANTLR start "rule__Action__Group_4__1__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5388:1: rule__Action__Group_4__1__Impl : ( ( rule__Action__CommentAssignment_4_1 ) ) ;
    public final void rule__Action__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5392:1: ( ( ( rule__Action__CommentAssignment_4_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5393:1: ( ( rule__Action__CommentAssignment_4_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5393:1: ( ( rule__Action__CommentAssignment_4_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5394:1: ( rule__Action__CommentAssignment_4_1 )
            {
             before(grammarAccess.getActionAccess().getCommentAssignment_4_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5395:1: ( rule__Action__CommentAssignment_4_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5395:2: rule__Action__CommentAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__CommentAssignment_4_1_in_rule__Action__Group_4__1__Impl10671);
            rule__Action__CommentAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getCommentAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_4__1__Impl"


    // $ANTLR start "rule__Witness__Group__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5409:1: rule__Witness__Group__0 : rule__Witness__Group__0__Impl rule__Witness__Group__1 ;
    public final void rule__Witness__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5413:1: ( rule__Witness__Group__0__Impl rule__Witness__Group__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5414:2: rule__Witness__Group__0__Impl rule__Witness__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Witness__Group__0__Impl_in_rule__Witness__Group__010705);
            rule__Witness__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Witness__Group__1_in_rule__Witness__Group__010708);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5421:1: rule__Witness__Group__0__Impl : ( 'Witness' ) ;
    public final void rule__Witness__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5425:1: ( ( 'Witness' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5426:1: ( 'Witness' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5426:1: ( 'Witness' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5427:1: 'Witness'
            {
             before(grammarAccess.getWitnessAccess().getWitnessKeyword_0()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__Witness__Group__0__Impl10736); 
             after(grammarAccess.getWitnessAccess().getWitnessKeyword_0()); 

            }


            }

        }
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5440:1: rule__Witness__Group__1 : rule__Witness__Group__1__Impl rule__Witness__Group__2 ;
    public final void rule__Witness__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5444:1: ( rule__Witness__Group__1__Impl rule__Witness__Group__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5445:2: rule__Witness__Group__1__Impl rule__Witness__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Witness__Group__1__Impl_in_rule__Witness__Group__110767);
            rule__Witness__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Witness__Group__2_in_rule__Witness__Group__110770);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5452:1: rule__Witness__Group__1__Impl : ( '@' ) ;
    public final void rule__Witness__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5456:1: ( ( '@' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5457:1: ( '@' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5457:1: ( '@' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5458:1: '@'
            {
             before(grammarAccess.getWitnessAccess().getCommercialAtKeyword_1()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__Witness__Group__1__Impl10798); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5471:1: rule__Witness__Group__2 : rule__Witness__Group__2__Impl rule__Witness__Group__3 ;
    public final void rule__Witness__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5475:1: ( rule__Witness__Group__2__Impl rule__Witness__Group__3 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5476:2: rule__Witness__Group__2__Impl rule__Witness__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Witness__Group__2__Impl_in_rule__Witness__Group__210829);
            rule__Witness__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Witness__Group__3_in_rule__Witness__Group__210832);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5483:1: rule__Witness__Group__2__Impl : ( ( rule__Witness__NameAssignment_2 ) ) ;
    public final void rule__Witness__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5487:1: ( ( ( rule__Witness__NameAssignment_2 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5488:1: ( ( rule__Witness__NameAssignment_2 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5488:1: ( ( rule__Witness__NameAssignment_2 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5489:1: ( rule__Witness__NameAssignment_2 )
            {
             before(grammarAccess.getWitnessAccess().getNameAssignment_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5490:1: ( rule__Witness__NameAssignment_2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5490:2: rule__Witness__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Witness__NameAssignment_2_in_rule__Witness__Group__2__Impl10859);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5500:1: rule__Witness__Group__3 : rule__Witness__Group__3__Impl rule__Witness__Group__4 ;
    public final void rule__Witness__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5504:1: ( rule__Witness__Group__3__Impl rule__Witness__Group__4 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5505:2: rule__Witness__Group__3__Impl rule__Witness__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Witness__Group__3__Impl_in_rule__Witness__Group__310889);
            rule__Witness__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Witness__Group__4_in_rule__Witness__Group__310892);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5512:1: rule__Witness__Group__3__Impl : ( ( rule__Witness__PredicateAssignment_3 ) ) ;
    public final void rule__Witness__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5516:1: ( ( ( rule__Witness__PredicateAssignment_3 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5517:1: ( ( rule__Witness__PredicateAssignment_3 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5517:1: ( ( rule__Witness__PredicateAssignment_3 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5518:1: ( rule__Witness__PredicateAssignment_3 )
            {
             before(grammarAccess.getWitnessAccess().getPredicateAssignment_3()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5519:1: ( rule__Witness__PredicateAssignment_3 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5519:2: rule__Witness__PredicateAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Witness__PredicateAssignment_3_in_rule__Witness__Group__3__Impl10919);
            rule__Witness__PredicateAssignment_3();

            state._fsp--;


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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5529:1: rule__Witness__Group__4 : rule__Witness__Group__4__Impl ;
    public final void rule__Witness__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5533:1: ( rule__Witness__Group__4__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5534:2: rule__Witness__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Witness__Group__4__Impl_in_rule__Witness__Group__410949);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5540:1: rule__Witness__Group__4__Impl : ( ( rule__Witness__Group_4__0 )? ) ;
    public final void rule__Witness__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5544:1: ( ( ( rule__Witness__Group_4__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5545:1: ( ( rule__Witness__Group_4__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5545:1: ( ( rule__Witness__Group_4__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5546:1: ( rule__Witness__Group_4__0 )?
            {
             before(grammarAccess.getWitnessAccess().getGroup_4()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5547:1: ( rule__Witness__Group_4__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==15) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5547:2: rule__Witness__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Witness__Group_4__0_in_rule__Witness__Group__4__Impl10976);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5567:1: rule__Witness__Group_4__0 : rule__Witness__Group_4__0__Impl rule__Witness__Group_4__1 ;
    public final void rule__Witness__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5571:1: ( rule__Witness__Group_4__0__Impl rule__Witness__Group_4__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5572:2: rule__Witness__Group_4__0__Impl rule__Witness__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Witness__Group_4__0__Impl_in_rule__Witness__Group_4__011017);
            rule__Witness__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Witness__Group_4__1_in_rule__Witness__Group_4__011020);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5579:1: rule__Witness__Group_4__0__Impl : ( '>' ) ;
    public final void rule__Witness__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5583:1: ( ( '>' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5584:1: ( '>' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5584:1: ( '>' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5585:1: '>'
            {
             before(grammarAccess.getWitnessAccess().getGreaterThanSignKeyword_4_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Witness__Group_4__0__Impl11048); 
             after(grammarAccess.getWitnessAccess().getGreaterThanSignKeyword_4_0()); 

            }


            }

        }
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5598:1: rule__Witness__Group_4__1 : rule__Witness__Group_4__1__Impl ;
    public final void rule__Witness__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5602:1: ( rule__Witness__Group_4__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5603:2: rule__Witness__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Witness__Group_4__1__Impl_in_rule__Witness__Group_4__111079);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5609:1: rule__Witness__Group_4__1__Impl : ( ( rule__Witness__CommentAssignment_4_1 ) ) ;
    public final void rule__Witness__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5613:1: ( ( ( rule__Witness__CommentAssignment_4_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5614:1: ( ( rule__Witness__CommentAssignment_4_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5614:1: ( ( rule__Witness__CommentAssignment_4_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5615:1: ( rule__Witness__CommentAssignment_4_1 )
            {
             before(grammarAccess.getWitnessAccess().getCommentAssignment_4_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5616:1: ( rule__Witness__CommentAssignment_4_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5616:2: rule__Witness__CommentAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Witness__CommentAssignment_4_1_in_rule__Witness__Group_4__1__Impl11106);
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


    // $ANTLR start "rule__Statemachine__NameAssignment_1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5631:1: rule__Statemachine__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Statemachine__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5635:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5636:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5636:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5637:1: ruleEString
            {
             before(grammarAccess.getStatemachineAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Statemachine__NameAssignment_111145);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStatemachineAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__NameAssignment_1"


    // $ANTLR start "rule__Statemachine__CommentAssignment_2_1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5646:1: rule__Statemachine__CommentAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Statemachine__CommentAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5650:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5651:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5651:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5652:1: ruleEString
            {
             before(grammarAccess.getStatemachineAccess().getCommentEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Statemachine__CommentAssignment_2_111176);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStatemachineAccess().getCommentEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__CommentAssignment_2_1"


    // $ANTLR start "rule__Statemachine__TranslationAssignment_3_1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5661:1: rule__Statemachine__TranslationAssignment_3_1 : ( ruleTranslationKind ) ;
    public final void rule__Statemachine__TranslationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5665:1: ( ( ruleTranslationKind ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5666:1: ( ruleTranslationKind )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5666:1: ( ruleTranslationKind )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5667:1: ruleTranslationKind
            {
             before(grammarAccess.getStatemachineAccess().getTranslationTranslationKindEnumRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTranslationKind_in_rule__Statemachine__TranslationAssignment_3_111207);
            ruleTranslationKind();

            state._fsp--;

             after(grammarAccess.getStatemachineAccess().getTranslationTranslationKindEnumRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__TranslationAssignment_3_1"


    // $ANTLR start "rule__Statemachine__ElaboratesAssignment_4_1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5676:1: rule__Statemachine__ElaboratesAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Statemachine__ElaboratesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5680:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5681:1: ( ( ruleEString ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5681:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5682:1: ( ruleEString )
            {
             before(grammarAccess.getStatemachineAccess().getElaboratesEventBNamedCrossReference_4_1_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5683:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5684:1: ruleEString
            {
             before(grammarAccess.getStatemachineAccess().getElaboratesEventBNamedEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Statemachine__ElaboratesAssignment_4_111242);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStatemachineAccess().getElaboratesEventBNamedEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getStatemachineAccess().getElaboratesEventBNamedCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__ElaboratesAssignment_4_1"


    // $ANTLR start "rule__Statemachine__RefinesAssignment_5_1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5695:1: rule__Statemachine__RefinesAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__Statemachine__RefinesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5699:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5700:1: ( ( ruleEString ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5700:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5701:1: ( ruleEString )
            {
             before(grammarAccess.getStatemachineAccess().getRefinesStatemachineCrossReference_5_1_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5702:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5703:1: ruleEString
            {
             before(grammarAccess.getStatemachineAccess().getRefinesStatemachineEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Statemachine__RefinesAssignment_5_111281);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStatemachineAccess().getRefinesStatemachineEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getStatemachineAccess().getRefinesStatemachineCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__RefinesAssignment_5_1"


    // $ANTLR start "rule__Statemachine__NodesAssignment_6_1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5714:1: rule__Statemachine__NodesAssignment_6_1 : ( ruleAbstractNode ) ;
    public final void rule__Statemachine__NodesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5718:1: ( ( ruleAbstractNode ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5719:1: ( ruleAbstractNode )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5719:1: ( ruleAbstractNode )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5720:1: ruleAbstractNode
            {
             before(grammarAccess.getStatemachineAccess().getNodesAbstractNodeParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractNode_in_rule__Statemachine__NodesAssignment_6_111316);
            ruleAbstractNode();

            state._fsp--;

             after(grammarAccess.getStatemachineAccess().getNodesAbstractNodeParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__NodesAssignment_6_1"


    // $ANTLR start "rule__Statemachine__NodesAssignment_6_2_1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5729:1: rule__Statemachine__NodesAssignment_6_2_1 : ( ruleAbstractNode ) ;
    public final void rule__Statemachine__NodesAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5733:1: ( ( ruleAbstractNode ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5734:1: ( ruleAbstractNode )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5734:1: ( ruleAbstractNode )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5735:1: ruleAbstractNode
            {
             before(grammarAccess.getStatemachineAccess().getNodesAbstractNodeParserRuleCall_6_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractNode_in_rule__Statemachine__NodesAssignment_6_2_111347);
            ruleAbstractNode();

            state._fsp--;

             after(grammarAccess.getStatemachineAccess().getNodesAbstractNodeParserRuleCall_6_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__NodesAssignment_6_2_1"


    // $ANTLR start "rule__Statemachine__TransitionsAssignment_7_1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5744:1: rule__Statemachine__TransitionsAssignment_7_1 : ( ruleTransition ) ;
    public final void rule__Statemachine__TransitionsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5748:1: ( ( ruleTransition ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5749:1: ( ruleTransition )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5749:1: ( ruleTransition )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5750:1: ruleTransition
            {
             before(grammarAccess.getStatemachineAccess().getTransitionsTransitionParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransition_in_rule__Statemachine__TransitionsAssignment_7_111378);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getStatemachineAccess().getTransitionsTransitionParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__TransitionsAssignment_7_1"


    // $ANTLR start "rule__Statemachine__TransitionsAssignment_7_2_1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5759:1: rule__Statemachine__TransitionsAssignment_7_2_1 : ( ruleTransition ) ;
    public final void rule__Statemachine__TransitionsAssignment_7_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5763:1: ( ( ruleTransition ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5764:1: ( ruleTransition )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5764:1: ( ruleTransition )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5765:1: ruleTransition
            {
             before(grammarAccess.getStatemachineAccess().getTransitionsTransitionParserRuleCall_7_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransition_in_rule__Statemachine__TransitionsAssignment_7_2_111409);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getStatemachineAccess().getTransitionsTransitionParserRuleCall_7_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__TransitionsAssignment_7_2_1"


    // $ANTLR start "rule__Transition__ExtendedAssignment_1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5774:1: rule__Transition__ExtendedAssignment_1 : ( ( 'extended' ) ) ;
    public final void rule__Transition__ExtendedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5778:1: ( ( ( 'extended' ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5779:1: ( ( 'extended' ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5779:1: ( ( 'extended' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5780:1: ( 'extended' )
            {
             before(grammarAccess.getTransitionAccess().getExtendedExtendedKeyword_1_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5781:1: ( 'extended' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5782:1: 'extended'
            {
             before(grammarAccess.getTransitionAccess().getExtendedExtendedKeyword_1_0()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__Transition__ExtendedAssignment_111445); 
             after(grammarAccess.getTransitionAccess().getExtendedExtendedKeyword_1_0()); 

            }

             after(grammarAccess.getTransitionAccess().getExtendedExtendedKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__ExtendedAssignment_1"


    // $ANTLR start "rule__Transition__CommentAssignment_3_1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5797:1: rule__Transition__CommentAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Transition__CommentAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5801:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5802:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5802:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5803:1: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getCommentEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Transition__CommentAssignment_3_111484);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getCommentEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__CommentAssignment_3_1"


    // $ANTLR start "rule__Transition__ElaboratesAssignment_4_1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5812:1: rule__Transition__ElaboratesAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Transition__ElaboratesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5816:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5817:1: ( ( ruleEString ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5817:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5818:1: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getElaboratesEventCrossReference_4_1_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5819:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5820:1: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getElaboratesEventEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Transition__ElaboratesAssignment_4_111519);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getElaboratesEventEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getElaboratesEventCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__ElaboratesAssignment_4_1"


    // $ANTLR start "rule__Transition__ElaboratesAssignment_4_2_1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5831:1: rule__Transition__ElaboratesAssignment_4_2_1 : ( ( ruleEString ) ) ;
    public final void rule__Transition__ElaboratesAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5835:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5836:1: ( ( ruleEString ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5836:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5837:1: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getElaboratesEventCrossReference_4_2_1_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5838:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5839:1: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getElaboratesEventEStringParserRuleCall_4_2_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Transition__ElaboratesAssignment_4_2_111558);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getElaboratesEventEStringParserRuleCall_4_2_1_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getElaboratesEventCrossReference_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__ElaboratesAssignment_4_2_1"


    // $ANTLR start "rule__Transition__TargetAssignment_5_1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5850:1: rule__Transition__TargetAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__Transition__TargetAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5854:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5855:1: ( ( ruleEString ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5855:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5856:1: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getTargetAbstractNodeCrossReference_5_1_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5857:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5858:1: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getTargetAbstractNodeEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Transition__TargetAssignment_5_111597);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getTargetAbstractNodeEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getTargetAbstractNodeCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__TargetAssignment_5_1"


    // $ANTLR start "rule__Transition__SourceAssignment_6_1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5869:1: rule__Transition__SourceAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__Transition__SourceAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5873:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5874:1: ( ( ruleEString ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5874:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5875:1: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getSourceAbstractNodeCrossReference_6_1_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5876:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5877:1: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getSourceAbstractNodeEStringParserRuleCall_6_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Transition__SourceAssignment_6_111636);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getSourceAbstractNodeEStringParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getSourceAbstractNodeCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__SourceAssignment_6_1"


    // $ANTLR start "rule__Transition__ParametersAssignment_7_2"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5888:1: rule__Transition__ParametersAssignment_7_2 : ( ruleTypedParameter ) ;
    public final void rule__Transition__ParametersAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5892:1: ( ( ruleTypedParameter ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5893:1: ( ruleTypedParameter )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5893:1: ( ruleTypedParameter )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5894:1: ruleTypedParameter
            {
             before(grammarAccess.getTransitionAccess().getParametersTypedParameterParserRuleCall_7_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTypedParameter_in_rule__Transition__ParametersAssignment_7_211671);
            ruleTypedParameter();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getParametersTypedParameterParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__ParametersAssignment_7_2"


    // $ANTLR start "rule__Transition__ParametersAssignment_7_3_1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5903:1: rule__Transition__ParametersAssignment_7_3_1 : ( ruleTypedParameter ) ;
    public final void rule__Transition__ParametersAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5907:1: ( ( ruleTypedParameter ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5908:1: ( ruleTypedParameter )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5908:1: ( ruleTypedParameter )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5909:1: ruleTypedParameter
            {
             before(grammarAccess.getTransitionAccess().getParametersTypedParameterParserRuleCall_7_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTypedParameter_in_rule__Transition__ParametersAssignment_7_3_111702);
            ruleTypedParameter();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getParametersTypedParameterParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__ParametersAssignment_7_3_1"


    // $ANTLR start "rule__Transition__GuardsAssignment_8_2"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5918:1: rule__Transition__GuardsAssignment_8_2 : ( ruleGuard ) ;
    public final void rule__Transition__GuardsAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5922:1: ( ( ruleGuard ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5923:1: ( ruleGuard )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5923:1: ( ruleGuard )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5924:1: ruleGuard
            {
             before(grammarAccess.getTransitionAccess().getGuardsGuardParserRuleCall_8_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGuard_in_rule__Transition__GuardsAssignment_8_211733);
            ruleGuard();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getGuardsGuardParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__GuardsAssignment_8_2"


    // $ANTLR start "rule__Transition__GuardsAssignment_8_3_1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5933:1: rule__Transition__GuardsAssignment_8_3_1 : ( ruleGuard ) ;
    public final void rule__Transition__GuardsAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5937:1: ( ( ruleGuard ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5938:1: ( ruleGuard )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5938:1: ( ruleGuard )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5939:1: ruleGuard
            {
             before(grammarAccess.getTransitionAccess().getGuardsGuardParserRuleCall_8_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGuard_in_rule__Transition__GuardsAssignment_8_3_111764);
            ruleGuard();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getGuardsGuardParserRuleCall_8_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__GuardsAssignment_8_3_1"


    // $ANTLR start "rule__Transition__ActionsAssignment_9_2"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5948:1: rule__Transition__ActionsAssignment_9_2 : ( ruleAction ) ;
    public final void rule__Transition__ActionsAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5952:1: ( ( ruleAction ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5953:1: ( ruleAction )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5953:1: ( ruleAction )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5954:1: ruleAction
            {
             before(grammarAccess.getTransitionAccess().getActionsActionParserRuleCall_9_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAction_in_rule__Transition__ActionsAssignment_9_211795);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getActionsActionParserRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__ActionsAssignment_9_2"


    // $ANTLR start "rule__Transition__ActionsAssignment_9_3_1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5963:1: rule__Transition__ActionsAssignment_9_3_1 : ( ruleAction ) ;
    public final void rule__Transition__ActionsAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5967:1: ( ( ruleAction ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5968:1: ( ruleAction )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5968:1: ( ruleAction )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5969:1: ruleAction
            {
             before(grammarAccess.getTransitionAccess().getActionsActionParserRuleCall_9_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAction_in_rule__Transition__ActionsAssignment_9_3_111826);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getActionsActionParserRuleCall_9_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__ActionsAssignment_9_3_1"


    // $ANTLR start "rule__Transition__WitnessesAssignment_10_2"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5978:1: rule__Transition__WitnessesAssignment_10_2 : ( ruleWitness ) ;
    public final void rule__Transition__WitnessesAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5982:1: ( ( ruleWitness ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5983:1: ( ruleWitness )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5983:1: ( ruleWitness )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5984:1: ruleWitness
            {
             before(grammarAccess.getTransitionAccess().getWitnessesWitnessParserRuleCall_10_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleWitness_in_rule__Transition__WitnessesAssignment_10_211857);
            ruleWitness();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getWitnessesWitnessParserRuleCall_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__WitnessesAssignment_10_2"


    // $ANTLR start "rule__Transition__WitnessesAssignment_10_3_1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5993:1: rule__Transition__WitnessesAssignment_10_3_1 : ( ruleWitness ) ;
    public final void rule__Transition__WitnessesAssignment_10_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5997:1: ( ( ruleWitness ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5998:1: ( ruleWitness )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5998:1: ( ruleWitness )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5999:1: ruleWitness
            {
             before(grammarAccess.getTransitionAccess().getWitnessesWitnessParserRuleCall_10_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleWitness_in_rule__Transition__WitnessesAssignment_10_3_111888);
            ruleWitness();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getWitnessesWitnessParserRuleCall_10_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__WitnessesAssignment_10_3_1"


    // $ANTLR start "rule__State__NameAssignment_2"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6008:1: rule__State__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__State__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6012:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6013:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6013:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6014:1: ruleEString
            {
             before(grammarAccess.getStateAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__State__NameAssignment_211919);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStateAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__NameAssignment_2"


    // $ANTLR start "rule__State__RefinesAssignment_3_1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6023:1: rule__State__RefinesAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__State__RefinesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6027:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6028:1: ( ( ruleEString ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6028:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6029:1: ( ruleEString )
            {
             before(grammarAccess.getStateAccess().getRefinesStateCrossReference_3_1_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6030:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6031:1: ruleEString
            {
             before(grammarAccess.getStateAccess().getRefinesStateEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__State__RefinesAssignment_3_111954);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStateAccess().getRefinesStateEStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getStateAccess().getRefinesStateCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__RefinesAssignment_3_1"


    // $ANTLR start "rule__State__StatemachinesAssignment_4_2"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6042:1: rule__State__StatemachinesAssignment_4_2 : ( ruleStatemachine ) ;
    public final void rule__State__StatemachinesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6046:1: ( ( ruleStatemachine ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6047:1: ( ruleStatemachine )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6047:1: ( ruleStatemachine )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6048:1: ruleStatemachine
            {
             before(grammarAccess.getStateAccess().getStatemachinesStatemachineParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleStatemachine_in_rule__State__StatemachinesAssignment_4_211989);
            ruleStatemachine();

            state._fsp--;

             after(grammarAccess.getStateAccess().getStatemachinesStatemachineParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__StatemachinesAssignment_4_2"


    // $ANTLR start "rule__State__StatemachinesAssignment_4_3_1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6057:1: rule__State__StatemachinesAssignment_4_3_1 : ( ruleStatemachine ) ;
    public final void rule__State__StatemachinesAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6061:1: ( ( ruleStatemachine ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6062:1: ( ruleStatemachine )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6062:1: ( ruleStatemachine )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6063:1: ruleStatemachine
            {
             before(grammarAccess.getStateAccess().getStatemachinesStatemachineParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleStatemachine_in_rule__State__StatemachinesAssignment_4_3_112020);
            ruleStatemachine();

            state._fsp--;

             after(grammarAccess.getStateAccess().getStatemachinesStatemachineParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__StatemachinesAssignment_4_3_1"


    // $ANTLR start "rule__State__InvariantsAssignment_5_2"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6072:1: rule__State__InvariantsAssignment_5_2 : ( ruleInvariant ) ;
    public final void rule__State__InvariantsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6076:1: ( ( ruleInvariant ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6077:1: ( ruleInvariant )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6077:1: ( ruleInvariant )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6078:1: ruleInvariant
            {
             before(grammarAccess.getStateAccess().getInvariantsInvariantParserRuleCall_5_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInvariant_in_rule__State__InvariantsAssignment_5_212051);
            ruleInvariant();

            state._fsp--;

             after(grammarAccess.getStateAccess().getInvariantsInvariantParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__InvariantsAssignment_5_2"


    // $ANTLR start "rule__State__InvariantsAssignment_5_3_1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6087:1: rule__State__InvariantsAssignment_5_3_1 : ( ruleInvariant ) ;
    public final void rule__State__InvariantsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6091:1: ( ( ruleInvariant ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6092:1: ( ruleInvariant )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6092:1: ( ruleInvariant )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6093:1: ruleInvariant
            {
             before(grammarAccess.getStateAccess().getInvariantsInvariantParserRuleCall_5_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInvariant_in_rule__State__InvariantsAssignment_5_3_112082);
            ruleInvariant();

            state._fsp--;

             after(grammarAccess.getStateAccess().getInvariantsInvariantParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__InvariantsAssignment_5_3_1"


    // $ANTLR start "rule__Initial__InternalIdAssignment_2_1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6102:1: rule__Initial__InternalIdAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Initial__InternalIdAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6106:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6107:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6107:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6108:1: ruleEString
            {
             before(grammarAccess.getInitialAccess().getInternalIdEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Initial__InternalIdAssignment_2_112113);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInitialAccess().getInternalIdEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__InternalIdAssignment_2_1"


    // $ANTLR start "rule__Final__InternalIdAssignment_2_1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6117:1: rule__Final__InternalIdAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Final__InternalIdAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6121:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6122:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6122:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6123:1: ruleEString
            {
             before(grammarAccess.getFinalAccess().getInternalIdEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Final__InternalIdAssignment_2_112144);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFinalAccess().getInternalIdEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__InternalIdAssignment_2_1"


    // $ANTLR start "rule__Any__InternalIdAssignment_2_1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6132:1: rule__Any__InternalIdAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Any__InternalIdAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6136:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6137:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6137:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6138:1: ruleEString
            {
             before(grammarAccess.getAnyAccess().getInternalIdEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Any__InternalIdAssignment_2_112175);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAnyAccess().getInternalIdEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Any__InternalIdAssignment_2_1"


    // $ANTLR start "rule__Junction__InternalIdAssignment_2_1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6147:1: rule__Junction__InternalIdAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Junction__InternalIdAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6151:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6152:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6152:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6153:1: ruleEString
            {
             before(grammarAccess.getJunctionAccess().getInternalIdEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Junction__InternalIdAssignment_2_112206);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getJunctionAccess().getInternalIdEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Junction__InternalIdAssignment_2_1"


    // $ANTLR start "rule__Fork__InternalIdAssignment_2_1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6162:1: rule__Fork__InternalIdAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Fork__InternalIdAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6166:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6167:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6167:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6168:1: ruleEString
            {
             before(grammarAccess.getForkAccess().getInternalIdEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Fork__InternalIdAssignment_2_112237);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getForkAccess().getInternalIdEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fork__InternalIdAssignment_2_1"


    // $ANTLR start "rule__Invariant__NameAssignment_2"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6177:1: rule__Invariant__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Invariant__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6181:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6182:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6182:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6183:1: ruleEString
            {
             before(grammarAccess.getInvariantAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Invariant__NameAssignment_212268);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInvariantAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__NameAssignment_2"


    // $ANTLR start "rule__Invariant__TheoremAssignment_3"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6192:1: rule__Invariant__TheoremAssignment_3 : ( ( 'theorem' ) ) ;
    public final void rule__Invariant__TheoremAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6196:1: ( ( ( 'theorem' ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6197:1: ( ( 'theorem' ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6197:1: ( ( 'theorem' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6198:1: ( 'theorem' )
            {
             before(grammarAccess.getInvariantAccess().getTheoremTheoremKeyword_3_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6199:1: ( 'theorem' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6200:1: 'theorem'
            {
             before(grammarAccess.getInvariantAccess().getTheoremTheoremKeyword_3_0()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__Invariant__TheoremAssignment_312304); 
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


    // $ANTLR start "rule__Invariant__PredicateAssignment_4"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6215:1: rule__Invariant__PredicateAssignment_4 : ( ruleEString ) ;
    public final void rule__Invariant__PredicateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6219:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6220:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6220:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6221:1: ruleEString
            {
             before(grammarAccess.getInvariantAccess().getPredicateEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Invariant__PredicateAssignment_412343);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInvariantAccess().getPredicateEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__PredicateAssignment_4"


    // $ANTLR start "rule__Invariant__CommentAssignment_5_1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6230:1: rule__Invariant__CommentAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Invariant__CommentAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6234:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6235:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6235:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6236:1: ruleEString
            {
             before(grammarAccess.getInvariantAccess().getCommentEStringParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Invariant__CommentAssignment_5_112374);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInvariantAccess().getCommentEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__CommentAssignment_5_1"


    // $ANTLR start "rule__TypedParameter__NameAssignment_1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6245:1: rule__TypedParameter__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__TypedParameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6249:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6250:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6250:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6251:1: ruleEString
            {
             before(grammarAccess.getTypedParameterAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TypedParameter__NameAssignment_112405);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTypedParameterAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedParameter__NameAssignment_1"


    // $ANTLR start "rule__TypedParameter__TypeAssignment_3"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6260:1: rule__TypedParameter__TypeAssignment_3 : ( ruleEString ) ;
    public final void rule__TypedParameter__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6264:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6265:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6265:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6266:1: ruleEString
            {
             before(grammarAccess.getTypedParameterAccess().getTypeEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TypedParameter__TypeAssignment_312436);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTypedParameterAccess().getTypeEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedParameter__TypeAssignment_3"


    // $ANTLR start "rule__TypedParameter__CommentAssignment_4_1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6275:1: rule__TypedParameter__CommentAssignment_4_1 : ( ruleEString ) ;
    public final void rule__TypedParameter__CommentAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6279:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6280:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6280:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6281:1: ruleEString
            {
             before(grammarAccess.getTypedParameterAccess().getCommentEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TypedParameter__CommentAssignment_4_112467);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTypedParameterAccess().getCommentEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedParameter__CommentAssignment_4_1"


    // $ANTLR start "rule__Guard__TheoremAssignment_0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6290:1: rule__Guard__TheoremAssignment_0 : ( ( 'theorem' ) ) ;
    public final void rule__Guard__TheoremAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6294:1: ( ( ( 'theorem' ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6295:1: ( ( 'theorem' ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6295:1: ( ( 'theorem' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6296:1: ( 'theorem' )
            {
             before(grammarAccess.getGuardAccess().getTheoremTheoremKeyword_0_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6297:1: ( 'theorem' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6298:1: 'theorem'
            {
             before(grammarAccess.getGuardAccess().getTheoremTheoremKeyword_0_0()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__Guard__TheoremAssignment_012503); 
             after(grammarAccess.getGuardAccess().getTheoremTheoremKeyword_0_0()); 

            }

             after(grammarAccess.getGuardAccess().getTheoremTheoremKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__TheoremAssignment_0"


    // $ANTLR start "rule__Guard__NameAssignment_2"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6313:1: rule__Guard__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Guard__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6317:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6318:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6318:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6319:1: ruleEString
            {
             before(grammarAccess.getGuardAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Guard__NameAssignment_212542);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGuardAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__NameAssignment_2"


    // $ANTLR start "rule__Guard__PredicateAssignment_3"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6328:1: rule__Guard__PredicateAssignment_3 : ( ruleEString ) ;
    public final void rule__Guard__PredicateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6332:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6333:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6333:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6334:1: ruleEString
            {
             before(grammarAccess.getGuardAccess().getPredicateEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Guard__PredicateAssignment_312573);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6343:1: rule__Guard__CommentAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Guard__CommentAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6347:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6348:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6348:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6349:1: ruleEString
            {
             before(grammarAccess.getGuardAccess().getCommentEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Guard__CommentAssignment_4_112604);
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


    // $ANTLR start "rule__Action__NameAssignment_1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6358:1: rule__Action__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Action__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6362:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6363:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6363:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6364:1: ruleEString
            {
             before(grammarAccess.getActionAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Action__NameAssignment_112635);
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


    // $ANTLR start "rule__Action__ActionAssignment_3"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6373:1: rule__Action__ActionAssignment_3 : ( ruleEString ) ;
    public final void rule__Action__ActionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6377:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6378:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6378:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6379:1: ruleEString
            {
             before(grammarAccess.getActionAccess().getActionEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Action__ActionAssignment_312666);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActionAccess().getActionEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__ActionAssignment_3"


    // $ANTLR start "rule__Action__CommentAssignment_4_1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6388:1: rule__Action__CommentAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Action__CommentAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6392:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6393:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6393:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6394:1: ruleEString
            {
             before(grammarAccess.getActionAccess().getCommentEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Action__CommentAssignment_4_112697);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActionAccess().getCommentEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__CommentAssignment_4_1"


    // $ANTLR start "rule__Witness__NameAssignment_2"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6403:1: rule__Witness__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Witness__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6407:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6408:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6408:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6409:1: ruleEString
            {
             before(grammarAccess.getWitnessAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Witness__NameAssignment_212728);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6418:1: rule__Witness__PredicateAssignment_3 : ( ruleEString ) ;
    public final void rule__Witness__PredicateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6422:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6423:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6423:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6424:1: ruleEString
            {
             before(grammarAccess.getWitnessAccess().getPredicateEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Witness__PredicateAssignment_312759);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6433:1: rule__Witness__CommentAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Witness__CommentAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6437:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6438:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6438:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:6439:1: ruleEString
            {
             before(grammarAccess.getWitnessAccess().getCommentEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Witness__CommentAssignment_4_112790);
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

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleStatemachine_in_entryRuleStatemachine61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStatemachine68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group__0_in_ruleStatemachine94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractNode_in_entryRuleAbstractNode121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractNode128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AbstractNode__Alternatives_in_ruleAbstractNode154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString183 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition243 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransition250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__0_in_ruleTransition276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleState_in_entryRuleState305 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleState312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group__0_in_ruleState338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInitial_in_entryRuleInitial365 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInitial372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Initial__Group__0_in_ruleInitial398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFinal_in_entryRuleFinal425 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFinal432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Final__Group__0_in_ruleFinal458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAny_in_entryRuleAny485 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAny492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Any__Group__0_in_ruleAny518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleJunction_in_entryRuleJunction545 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleJunction552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Junction__Group__0_in_ruleJunction578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFork_in_entryRuleFork605 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFork612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fork__Group__0_in_ruleFork638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvariant_in_entryRuleInvariant665 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInvariant672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group__0_in_ruleInvariant698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedParameter_in_entryRuleTypedParameter725 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypedParameter732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedParameter__Group__0_in_ruleTypedParameter758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGuard_in_entryRuleGuard785 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGuard792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guard__Group__0_in_ruleGuard818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAction_in_entryRuleAction845 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAction852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group__0_in_ruleAction878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWitness_in_entryRuleWitness905 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWitness912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Witness__Group__0_in_ruleWitness938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TranslationKind__Alternatives_in_ruleTranslationKind975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleState_in_rule__AbstractNode__Alternatives1010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInitial_in_rule__AbstractNode__Alternatives1027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFinal_in_rule__AbstractNode__Alternatives1044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAny_in_rule__AbstractNode__Alternatives1061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleJunction_in_rule__AbstractNode__Alternatives1078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFork_in_rule__AbstractNode__Alternatives1095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives1128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives1145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__TranslationKind__Alternatives1178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__TranslationKind__Alternatives1199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__TranslationKind__Alternatives1220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group__0__Impl_in_rule__Statemachine__Group__01253 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Statemachine__Group__1_in_rule__Statemachine__Group__01256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Statemachine__Group__0__Impl1284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group__1__Impl_in_rule__Statemachine__Group__11315 = new BitSet(new long[]{0x00000000002F8000L});
        public static final BitSet FOLLOW_rule__Statemachine__Group__2_in_rule__Statemachine__Group__11318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__NameAssignment_1_in_rule__Statemachine__Group__1__Impl1345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group__2__Impl_in_rule__Statemachine__Group__21375 = new BitSet(new long[]{0x00000000002F8000L});
        public static final BitSet FOLLOW_rule__Statemachine__Group__3_in_rule__Statemachine__Group__21378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_2__0_in_rule__Statemachine__Group__2__Impl1405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group__3__Impl_in_rule__Statemachine__Group__31436 = new BitSet(new long[]{0x00000000002F8000L});
        public static final BitSet FOLLOW_rule__Statemachine__Group__4_in_rule__Statemachine__Group__31439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_3__0_in_rule__Statemachine__Group__3__Impl1466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group__4__Impl_in_rule__Statemachine__Group__41497 = new BitSet(new long[]{0x00000000002F8000L});
        public static final BitSet FOLLOW_rule__Statemachine__Group__5_in_rule__Statemachine__Group__41500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_4__0_in_rule__Statemachine__Group__4__Impl1527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group__5__Impl_in_rule__Statemachine__Group__51558 = new BitSet(new long[]{0x00000000002F8000L});
        public static final BitSet FOLLOW_rule__Statemachine__Group__6_in_rule__Statemachine__Group__51561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_5__0_in_rule__Statemachine__Group__5__Impl1588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group__6__Impl_in_rule__Statemachine__Group__61619 = new BitSet(new long[]{0x00000000002F8000L});
        public static final BitSet FOLLOW_rule__Statemachine__Group__7_in_rule__Statemachine__Group__61622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_6__0_in_rule__Statemachine__Group__6__Impl1649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group__7__Impl_in_rule__Statemachine__Group__71680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_7__0_in_rule__Statemachine__Group__7__Impl1707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_2__0__Impl_in_rule__Statemachine__Group_2__01754 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_2__1_in_rule__Statemachine__Group_2__01757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Statemachine__Group_2__0__Impl1785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_2__1__Impl_in_rule__Statemachine__Group_2__11816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__CommentAssignment_2_1_in_rule__Statemachine__Group_2__1__Impl1843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_3__0__Impl_in_rule__Statemachine__Group_3__01877 = new BitSet(new long[]{0x0000000000003800L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_3__1_in_rule__Statemachine__Group_3__01880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Statemachine__Group_3__0__Impl1908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_3__1__Impl_in_rule__Statemachine__Group_3__11939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__TranslationAssignment_3_1_in_rule__Statemachine__Group_3__1__Impl1966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_4__0__Impl_in_rule__Statemachine__Group_4__02000 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_4__1_in_rule__Statemachine__Group_4__02003 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Statemachine__Group_4__0__Impl2031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_4__1__Impl_in_rule__Statemachine__Group_4__12062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__ElaboratesAssignment_4_1_in_rule__Statemachine__Group_4__1__Impl2089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_5__0__Impl_in_rule__Statemachine__Group_5__02123 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_5__1_in_rule__Statemachine__Group_5__02126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Statemachine__Group_5__0__Impl2154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_5__1__Impl_in_rule__Statemachine__Group_5__12185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__RefinesAssignment_5_1_in_rule__Statemachine__Group_5__1__Impl2212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_6__0__Impl_in_rule__Statemachine__Group_6__02246 = new BitSet(new long[]{0x000000F480000000L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_6__1_in_rule__Statemachine__Group_6__02249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Statemachine__Group_6__0__Impl2277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_6__1__Impl_in_rule__Statemachine__Group_6__12308 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_6__2_in_rule__Statemachine__Group_6__12311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__NodesAssignment_6_1_in_rule__Statemachine__Group_6__1__Impl2338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_6__2__Impl_in_rule__Statemachine__Group_6__22368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_6_2__0_in_rule__Statemachine__Group_6__2__Impl2395 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_6_2__0__Impl_in_rule__Statemachine__Group_6_2__02432 = new BitSet(new long[]{0x000000F480000000L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_6_2__1_in_rule__Statemachine__Group_6_2__02435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Statemachine__Group_6_2__0__Impl2463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_6_2__1__Impl_in_rule__Statemachine__Group_6_2__12494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__NodesAssignment_6_2_1_in_rule__Statemachine__Group_6_2__1__Impl2521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_7__0__Impl_in_rule__Statemachine__Group_7__02555 = new BitSet(new long[]{0x0000400000400000L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_7__1_in_rule__Statemachine__Group_7__02558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Statemachine__Group_7__0__Impl2586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_7__1__Impl_in_rule__Statemachine__Group_7__12617 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_7__2_in_rule__Statemachine__Group_7__12620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__TransitionsAssignment_7_1_in_rule__Statemachine__Group_7__1__Impl2647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_7__2__Impl_in_rule__Statemachine__Group_7__22677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_7_2__0_in_rule__Statemachine__Group_7__2__Impl2704 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_7_2__0__Impl_in_rule__Statemachine__Group_7_2__02741 = new BitSet(new long[]{0x0000400000400000L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_7_2__1_in_rule__Statemachine__Group_7_2__02744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Statemachine__Group_7_2__0__Impl2772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_7_2__1__Impl_in_rule__Statemachine__Group_7_2__12803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__TransitionsAssignment_7_2_1_in_rule__Statemachine__Group_7_2__1__Impl2830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__02864 = new BitSet(new long[]{0x0000400000400000L});
        public static final BitSet FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__02867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__12925 = new BitSet(new long[]{0x0000400000400000L});
        public static final BitSet FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__12928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__ExtendedAssignment_1_in_rule__Transition__Group__1__Impl2955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__22986 = new BitSet(new long[]{0x0000000073828000L});
        public static final BitSet FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__22989 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Transition__Group__2__Impl3017 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__33048 = new BitSet(new long[]{0x0000000073828000L});
        public static final BitSet FOLLOW_rule__Transition__Group__4_in_rule__Transition__Group__33051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_3__0_in_rule__Transition__Group__3__Impl3078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__4__Impl_in_rule__Transition__Group__43109 = new BitSet(new long[]{0x0000000073828000L});
        public static final BitSet FOLLOW_rule__Transition__Group__5_in_rule__Transition__Group__43112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_4__0_in_rule__Transition__Group__4__Impl3139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__5__Impl_in_rule__Transition__Group__53170 = new BitSet(new long[]{0x0000000073828000L});
        public static final BitSet FOLLOW_rule__Transition__Group__6_in_rule__Transition__Group__53173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_5__0_in_rule__Transition__Group__5__Impl3200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__6__Impl_in_rule__Transition__Group__63231 = new BitSet(new long[]{0x0000000073828000L});
        public static final BitSet FOLLOW_rule__Transition__Group__7_in_rule__Transition__Group__63234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_6__0_in_rule__Transition__Group__6__Impl3261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__7__Impl_in_rule__Transition__Group__73292 = new BitSet(new long[]{0x0000000073828000L});
        public static final BitSet FOLLOW_rule__Transition__Group__8_in_rule__Transition__Group__73295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_7__0_in_rule__Transition__Group__7__Impl3322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__8__Impl_in_rule__Transition__Group__83353 = new BitSet(new long[]{0x0000000073828000L});
        public static final BitSet FOLLOW_rule__Transition__Group__9_in_rule__Transition__Group__83356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_8__0_in_rule__Transition__Group__8__Impl3383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__9__Impl_in_rule__Transition__Group__93414 = new BitSet(new long[]{0x0000000073828000L});
        public static final BitSet FOLLOW_rule__Transition__Group__10_in_rule__Transition__Group__93417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_9__0_in_rule__Transition__Group__9__Impl3444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__10__Impl_in_rule__Transition__Group__103475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_10__0_in_rule__Transition__Group__10__Impl3502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_3__0__Impl_in_rule__Transition__Group_3__03555 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Transition__Group_3__1_in_rule__Transition__Group_3__03558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Transition__Group_3__0__Impl3586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_3__1__Impl_in_rule__Transition__Group_3__13617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__CommentAssignment_3_1_in_rule__Transition__Group_3__1__Impl3644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_4__0__Impl_in_rule__Transition__Group_4__03678 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Transition__Group_4__1_in_rule__Transition__Group_4__03681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Transition__Group_4__0__Impl3709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_4__1__Impl_in_rule__Transition__Group_4__13740 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Transition__Group_4__2_in_rule__Transition__Group_4__13743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__ElaboratesAssignment_4_1_in_rule__Transition__Group_4__1__Impl3770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_4__2__Impl_in_rule__Transition__Group_4__23800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_4_2__0_in_rule__Transition__Group_4__2__Impl3827 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_rule__Transition__Group_4_2__0__Impl_in_rule__Transition__Group_4_2__03864 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Transition__Group_4_2__1_in_rule__Transition__Group_4_2__03867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Transition__Group_4_2__0__Impl3895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_4_2__1__Impl_in_rule__Transition__Group_4_2__13926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__ElaboratesAssignment_4_2_1_in_rule__Transition__Group_4_2__1__Impl3953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_5__0__Impl_in_rule__Transition__Group_5__03987 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Transition__Group_5__1_in_rule__Transition__Group_5__03990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Transition__Group_5__0__Impl4018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_5__1__Impl_in_rule__Transition__Group_5__14049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__TargetAssignment_5_1_in_rule__Transition__Group_5__1__Impl4076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_6__0__Impl_in_rule__Transition__Group_6__04110 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Transition__Group_6__1_in_rule__Transition__Group_6__04113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Transition__Group_6__0__Impl4141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_6__1__Impl_in_rule__Transition__Group_6__14172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__SourceAssignment_6_1_in_rule__Transition__Group_6__1__Impl4199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_7__0__Impl_in_rule__Transition__Group_7__04233 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Transition__Group_7__1_in_rule__Transition__Group_7__04236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Transition__Group_7__0__Impl4264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_7__1__Impl_in_rule__Transition__Group_7__14295 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__Transition__Group_7__2_in_rule__Transition__Group_7__14298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Transition__Group_7__1__Impl4326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_7__2__Impl_in_rule__Transition__Group_7__24357 = new BitSet(new long[]{0x0000000008100000L});
        public static final BitSet FOLLOW_rule__Transition__Group_7__3_in_rule__Transition__Group_7__24360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__ParametersAssignment_7_2_in_rule__Transition__Group_7__2__Impl4387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_7__3__Impl_in_rule__Transition__Group_7__34417 = new BitSet(new long[]{0x0000000008100000L});
        public static final BitSet FOLLOW_rule__Transition__Group_7__4_in_rule__Transition__Group_7__34420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_7_3__0_in_rule__Transition__Group_7__3__Impl4447 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_rule__Transition__Group_7__4__Impl_in_rule__Transition__Group_7__44478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Transition__Group_7__4__Impl4506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_7_3__0__Impl_in_rule__Transition__Group_7_3__04547 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__Transition__Group_7_3__1_in_rule__Transition__Group_7_3__04550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Transition__Group_7_3__0__Impl4578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_7_3__1__Impl_in_rule__Transition__Group_7_3__14609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__ParametersAssignment_7_3_1_in_rule__Transition__Group_7_3__1__Impl4636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_8__0__Impl_in_rule__Transition__Group_8__04670 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Transition__Group_8__1_in_rule__Transition__Group_8__04673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Transition__Group_8__0__Impl4701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_8__1__Impl_in_rule__Transition__Group_8__14732 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_rule__Transition__Group_8__2_in_rule__Transition__Group_8__14735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Transition__Group_8__1__Impl4763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_8__2__Impl_in_rule__Transition__Group_8__24794 = new BitSet(new long[]{0x0000000008100000L});
        public static final BitSet FOLLOW_rule__Transition__Group_8__3_in_rule__Transition__Group_8__24797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__GuardsAssignment_8_2_in_rule__Transition__Group_8__2__Impl4824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_8__3__Impl_in_rule__Transition__Group_8__34854 = new BitSet(new long[]{0x0000000008100000L});
        public static final BitSet FOLLOW_rule__Transition__Group_8__4_in_rule__Transition__Group_8__34857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_8_3__0_in_rule__Transition__Group_8__3__Impl4884 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_rule__Transition__Group_8__4__Impl_in_rule__Transition__Group_8__44915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Transition__Group_8__4__Impl4943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_8_3__0__Impl_in_rule__Transition__Group_8_3__04984 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_rule__Transition__Group_8_3__1_in_rule__Transition__Group_8_3__04987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Transition__Group_8_3__0__Impl5015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_8_3__1__Impl_in_rule__Transition__Group_8_3__15046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__GuardsAssignment_8_3_1_in_rule__Transition__Group_8_3__1__Impl5073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_9__0__Impl_in_rule__Transition__Group_9__05107 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Transition__Group_9__1_in_rule__Transition__Group_9__05110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Transition__Group_9__0__Impl5138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_9__1__Impl_in_rule__Transition__Group_9__15169 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__Transition__Group_9__2_in_rule__Transition__Group_9__15172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Transition__Group_9__1__Impl5200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_9__2__Impl_in_rule__Transition__Group_9__25231 = new BitSet(new long[]{0x0000000008100000L});
        public static final BitSet FOLLOW_rule__Transition__Group_9__3_in_rule__Transition__Group_9__25234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__ActionsAssignment_9_2_in_rule__Transition__Group_9__2__Impl5261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_9__3__Impl_in_rule__Transition__Group_9__35291 = new BitSet(new long[]{0x0000000008100000L});
        public static final BitSet FOLLOW_rule__Transition__Group_9__4_in_rule__Transition__Group_9__35294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_9_3__0_in_rule__Transition__Group_9__3__Impl5321 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_rule__Transition__Group_9__4__Impl_in_rule__Transition__Group_9__45352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Transition__Group_9__4__Impl5380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_9_3__0__Impl_in_rule__Transition__Group_9_3__05421 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__Transition__Group_9_3__1_in_rule__Transition__Group_9_3__05424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Transition__Group_9_3__0__Impl5452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_9_3__1__Impl_in_rule__Transition__Group_9_3__15483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__ActionsAssignment_9_3_1_in_rule__Transition__Group_9_3__1__Impl5510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_10__0__Impl_in_rule__Transition__Group_10__05544 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Transition__Group_10__1_in_rule__Transition__Group_10__05547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Transition__Group_10__0__Impl5575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_10__1__Impl_in_rule__Transition__Group_10__15606 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_rule__Transition__Group_10__2_in_rule__Transition__Group_10__15609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Transition__Group_10__1__Impl5637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_10__2__Impl_in_rule__Transition__Group_10__25668 = new BitSet(new long[]{0x0000000008100000L});
        public static final BitSet FOLLOW_rule__Transition__Group_10__3_in_rule__Transition__Group_10__25671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__WitnessesAssignment_10_2_in_rule__Transition__Group_10__2__Impl5698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_10__3__Impl_in_rule__Transition__Group_10__35728 = new BitSet(new long[]{0x0000000008100000L});
        public static final BitSet FOLLOW_rule__Transition__Group_10__4_in_rule__Transition__Group_10__35731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_10_3__0_in_rule__Transition__Group_10__3__Impl5758 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_rule__Transition__Group_10__4__Impl_in_rule__Transition__Group_10__45789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Transition__Group_10__4__Impl5817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_10_3__0__Impl_in_rule__Transition__Group_10_3__05858 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_rule__Transition__Group_10_3__1_in_rule__Transition__Group_10_3__05861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Transition__Group_10_3__0__Impl5889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_10_3__1__Impl_in_rule__Transition__Group_10_3__15920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__WitnessesAssignment_10_3_1_in_rule__Transition__Group_10_3__1__Impl5947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__05982 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__State__Group__1_in_rule__State__Group__05985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__16043 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__State__Group__2_in_rule__State__Group__16046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__State__Group__1__Impl6074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__26105 = new BitSet(new long[]{0x0000000300040000L});
        public static final BitSet FOLLOW_rule__State__Group__3_in_rule__State__Group__26108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__NameAssignment_2_in_rule__State__Group__2__Impl6135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group__3__Impl_in_rule__State__Group__36165 = new BitSet(new long[]{0x0000000300040000L});
        public static final BitSet FOLLOW_rule__State__Group__4_in_rule__State__Group__36168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_3__0_in_rule__State__Group__3__Impl6195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group__4__Impl_in_rule__State__Group__46226 = new BitSet(new long[]{0x0000000300040000L});
        public static final BitSet FOLLOW_rule__State__Group__5_in_rule__State__Group__46229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_4__0_in_rule__State__Group__4__Impl6256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group__5__Impl_in_rule__State__Group__56287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_5__0_in_rule__State__Group__5__Impl6314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_3__0__Impl_in_rule__State__Group_3__06357 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__State__Group_3__1_in_rule__State__Group_3__06360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__State__Group_3__0__Impl6388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_3__1__Impl_in_rule__State__Group_3__16419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__RefinesAssignment_3_1_in_rule__State__Group_3__1__Impl6446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_4__0__Impl_in_rule__State__Group_4__06480 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__State__Group_4__1_in_rule__State__Group_4__06483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__State__Group_4__0__Impl6511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_4__1__Impl_in_rule__State__Group_4__16542 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__State__Group_4__2_in_rule__State__Group_4__16545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__State__Group_4__1__Impl6573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_4__2__Impl_in_rule__State__Group_4__26604 = new BitSet(new long[]{0x0000000008100000L});
        public static final BitSet FOLLOW_rule__State__Group_4__3_in_rule__State__Group_4__26607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__StatemachinesAssignment_4_2_in_rule__State__Group_4__2__Impl6634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_4__3__Impl_in_rule__State__Group_4__36664 = new BitSet(new long[]{0x0000000008100000L});
        public static final BitSet FOLLOW_rule__State__Group_4__4_in_rule__State__Group_4__36667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_4_3__0_in_rule__State__Group_4__3__Impl6694 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_rule__State__Group_4__4__Impl_in_rule__State__Group_4__46725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__State__Group_4__4__Impl6753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_4_3__0__Impl_in_rule__State__Group_4_3__06794 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__State__Group_4_3__1_in_rule__State__Group_4_3__06797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__State__Group_4_3__0__Impl6825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_4_3__1__Impl_in_rule__State__Group_4_3__16856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__StatemachinesAssignment_4_3_1_in_rule__State__Group_4_3__1__Impl6883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_5__0__Impl_in_rule__State__Group_5__06917 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__State__Group_5__1_in_rule__State__Group_5__06920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__State__Group_5__0__Impl6948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_5__1__Impl_in_rule__State__Group_5__16979 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__State__Group_5__2_in_rule__State__Group_5__16982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__State__Group_5__1__Impl7010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_5__2__Impl_in_rule__State__Group_5__27041 = new BitSet(new long[]{0x0000000008100000L});
        public static final BitSet FOLLOW_rule__State__Group_5__3_in_rule__State__Group_5__27044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__InvariantsAssignment_5_2_in_rule__State__Group_5__2__Impl7071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_5__3__Impl_in_rule__State__Group_5__37101 = new BitSet(new long[]{0x0000000008100000L});
        public static final BitSet FOLLOW_rule__State__Group_5__4_in_rule__State__Group_5__37104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_5_3__0_in_rule__State__Group_5__3__Impl7131 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_rule__State__Group_5__4__Impl_in_rule__State__Group_5__47162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__State__Group_5__4__Impl7190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_5_3__0__Impl_in_rule__State__Group_5_3__07231 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__State__Group_5_3__1_in_rule__State__Group_5_3__07234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__State__Group_5_3__0__Impl7262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_5_3__1__Impl_in_rule__State__Group_5_3__17293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__InvariantsAssignment_5_3_1_in_rule__State__Group_5_3__1__Impl7320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Initial__Group__0__Impl_in_rule__Initial__Group__07354 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__Initial__Group__1_in_rule__Initial__Group__07357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Initial__Group__1__Impl_in_rule__Initial__Group__17415 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__Initial__Group__2_in_rule__Initial__Group__17418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Initial__Group__1__Impl7446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Initial__Group__2__Impl_in_rule__Initial__Group__27477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Initial__Group_2__0_in_rule__Initial__Group__2__Impl7504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Initial__Group_2__0__Impl_in_rule__Initial__Group_2__07541 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Initial__Group_2__1_in_rule__Initial__Group_2__07544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Initial__Group_2__0__Impl7572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Initial__Group_2__1__Impl_in_rule__Initial__Group_2__17603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Initial__InternalIdAssignment_2_1_in_rule__Initial__Group_2__1__Impl7630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Final__Group__0__Impl_in_rule__Final__Group__07664 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__Final__Group__1_in_rule__Final__Group__07667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Final__Group__1__Impl_in_rule__Final__Group__17725 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__Final__Group__2_in_rule__Final__Group__17728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__Final__Group__1__Impl7756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Final__Group__2__Impl_in_rule__Final__Group__27787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Final__Group_2__0_in_rule__Final__Group__2__Impl7814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Final__Group_2__0__Impl_in_rule__Final__Group_2__07851 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Final__Group_2__1_in_rule__Final__Group_2__07854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Final__Group_2__0__Impl7882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Final__Group_2__1__Impl_in_rule__Final__Group_2__17913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Final__InternalIdAssignment_2_1_in_rule__Final__Group_2__1__Impl7940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Any__Group__0__Impl_in_rule__Any__Group__07974 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__Any__Group__1_in_rule__Any__Group__07977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Any__Group__1__Impl_in_rule__Any__Group__18035 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__Any__Group__2_in_rule__Any__Group__18038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__Any__Group__1__Impl8066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Any__Group__2__Impl_in_rule__Any__Group__28097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Any__Group_2__0_in_rule__Any__Group__2__Impl8124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Any__Group_2__0__Impl_in_rule__Any__Group_2__08161 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Any__Group_2__1_in_rule__Any__Group_2__08164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Any__Group_2__0__Impl8192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Any__Group_2__1__Impl_in_rule__Any__Group_2__18223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Any__InternalIdAssignment_2_1_in_rule__Any__Group_2__1__Impl8250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Junction__Group__0__Impl_in_rule__Junction__Group__08284 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__Junction__Group__1_in_rule__Junction__Group__08287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Junction__Group__1__Impl_in_rule__Junction__Group__18345 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__Junction__Group__2_in_rule__Junction__Group__18348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Junction__Group__1__Impl8376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Junction__Group__2__Impl_in_rule__Junction__Group__28407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Junction__Group_2__0_in_rule__Junction__Group__2__Impl8434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Junction__Group_2__0__Impl_in_rule__Junction__Group_2__08471 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Junction__Group_2__1_in_rule__Junction__Group_2__08474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Junction__Group_2__0__Impl8502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Junction__Group_2__1__Impl_in_rule__Junction__Group_2__18533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Junction__InternalIdAssignment_2_1_in_rule__Junction__Group_2__1__Impl8560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fork__Group__0__Impl_in_rule__Fork__Group__08594 = new BitSet(new long[]{0x000000F480000000L});
        public static final BitSet FOLLOW_rule__Fork__Group__1_in_rule__Fork__Group__08597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fork__Group__1__Impl_in_rule__Fork__Group__18655 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__Fork__Group__2_in_rule__Fork__Group__18658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__Fork__Group__1__Impl8686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fork__Group__2__Impl_in_rule__Fork__Group__28717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fork__Group_2__0_in_rule__Fork__Group__2__Impl8744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fork__Group_2__0__Impl_in_rule__Fork__Group_2__08781 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Fork__Group_2__1_in_rule__Fork__Group_2__08784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Fork__Group_2__0__Impl8812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fork__Group_2__1__Impl_in_rule__Fork__Group_2__18843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fork__InternalIdAssignment_2_1_in_rule__Fork__Group_2__1__Impl8870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group__0__Impl_in_rule__Invariant__Group__08904 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__Invariant__Group__1_in_rule__Invariant__Group__08907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__Invariant__Group__0__Impl8935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group__1__Impl_in_rule__Invariant__Group__18966 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Invariant__Group__2_in_rule__Invariant__Group__18969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Invariant__Group__1__Impl8997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group__2__Impl_in_rule__Invariant__Group__29028 = new BitSet(new long[]{0x0000800000000030L});
        public static final BitSet FOLLOW_rule__Invariant__Group__3_in_rule__Invariant__Group__29031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__NameAssignment_2_in_rule__Invariant__Group__2__Impl9058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group__3__Impl_in_rule__Invariant__Group__39088 = new BitSet(new long[]{0x0000800000000030L});
        public static final BitSet FOLLOW_rule__Invariant__Group__4_in_rule__Invariant__Group__39091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__TheoremAssignment_3_in_rule__Invariant__Group__3__Impl9118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group__4__Impl_in_rule__Invariant__Group__49149 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Invariant__Group__5_in_rule__Invariant__Group__49152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__PredicateAssignment_4_in_rule__Invariant__Group__4__Impl9179 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group__5__Impl_in_rule__Invariant__Group__59209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group_5__0_in_rule__Invariant__Group__5__Impl9236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group_5__0__Impl_in_rule__Invariant__Group_5__09279 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Invariant__Group_5__1_in_rule__Invariant__Group_5__09282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Invariant__Group_5__0__Impl9310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group_5__1__Impl_in_rule__Invariant__Group_5__19341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__CommentAssignment_5_1_in_rule__Invariant__Group_5__1__Impl9368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedParameter__Group__0__Impl_in_rule__TypedParameter__Group__09402 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TypedParameter__Group__1_in_rule__TypedParameter__Group__09405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__TypedParameter__Group__0__Impl9433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedParameter__Group__1__Impl_in_rule__TypedParameter__Group__19464 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_rule__TypedParameter__Group__2_in_rule__TypedParameter__Group__19467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedParameter__NameAssignment_1_in_rule__TypedParameter__Group__1__Impl9494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedParameter__Group__2__Impl_in_rule__TypedParameter__Group__29524 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TypedParameter__Group__3_in_rule__TypedParameter__Group__29527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__TypedParameter__Group__2__Impl9555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedParameter__Group__3__Impl_in_rule__TypedParameter__Group__39586 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__TypedParameter__Group__4_in_rule__TypedParameter__Group__39589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedParameter__TypeAssignment_3_in_rule__TypedParameter__Group__3__Impl9616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedParameter__Group__4__Impl_in_rule__TypedParameter__Group__49646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedParameter__Group_4__0_in_rule__TypedParameter__Group__4__Impl9673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedParameter__Group_4__0__Impl_in_rule__TypedParameter__Group_4__09714 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TypedParameter__Group_4__1_in_rule__TypedParameter__Group_4__09717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__TypedParameter__Group_4__0__Impl9745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedParameter__Group_4__1__Impl_in_rule__TypedParameter__Group_4__19776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedParameter__CommentAssignment_4_1_in_rule__TypedParameter__Group_4__1__Impl9803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guard__Group__0__Impl_in_rule__Guard__Group__09837 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__Guard__Group__1_in_rule__Guard__Group__09840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guard__TheoremAssignment_0_in_rule__Guard__Group__0__Impl9867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guard__Group__1__Impl_in_rule__Guard__Group__19897 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Guard__Group__2_in_rule__Guard__Group__19900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Guard__Group__1__Impl9928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guard__Group__2__Impl_in_rule__Guard__Group__29959 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Guard__Group__3_in_rule__Guard__Group__29962 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guard__NameAssignment_2_in_rule__Guard__Group__2__Impl9989 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guard__Group__3__Impl_in_rule__Guard__Group__310019 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Guard__Group__4_in_rule__Guard__Group__310022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guard__PredicateAssignment_3_in_rule__Guard__Group__3__Impl10049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guard__Group__4__Impl_in_rule__Guard__Group__410079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guard__Group_4__0_in_rule__Guard__Group__4__Impl10106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guard__Group_4__0__Impl_in_rule__Guard__Group_4__010147 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Guard__Group_4__1_in_rule__Guard__Group_4__010150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Guard__Group_4__0__Impl10178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guard__Group_4__1__Impl_in_rule__Guard__Group_4__110209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guard__CommentAssignment_4_1_in_rule__Guard__Group_4__1__Impl10236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group__0__Impl_in_rule__Action__Group__010270 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Action__Group__1_in_rule__Action__Group__010273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Action__Group__0__Impl10301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group__1__Impl_in_rule__Action__Group__110332 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_rule__Action__Group__2_in_rule__Action__Group__110335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__NameAssignment_1_in_rule__Action__Group__1__Impl10362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group__2__Impl_in_rule__Action__Group__210392 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Action__Group__3_in_rule__Action__Group__210395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__Action__Group__2__Impl10423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group__3__Impl_in_rule__Action__Group__310454 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Action__Group__4_in_rule__Action__Group__310457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__ActionAssignment_3_in_rule__Action__Group__3__Impl10484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group__4__Impl_in_rule__Action__Group__410514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group_4__0_in_rule__Action__Group__4__Impl10541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group_4__0__Impl_in_rule__Action__Group_4__010582 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Action__Group_4__1_in_rule__Action__Group_4__010585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Action__Group_4__0__Impl10613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group_4__1__Impl_in_rule__Action__Group_4__110644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__CommentAssignment_4_1_in_rule__Action__Group_4__1__Impl10671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Witness__Group__0__Impl_in_rule__Witness__Group__010705 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__Witness__Group__1_in_rule__Witness__Group__010708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__Witness__Group__0__Impl10736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Witness__Group__1__Impl_in_rule__Witness__Group__110767 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Witness__Group__2_in_rule__Witness__Group__110770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Witness__Group__1__Impl10798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Witness__Group__2__Impl_in_rule__Witness__Group__210829 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Witness__Group__3_in_rule__Witness__Group__210832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Witness__NameAssignment_2_in_rule__Witness__Group__2__Impl10859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Witness__Group__3__Impl_in_rule__Witness__Group__310889 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Witness__Group__4_in_rule__Witness__Group__310892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Witness__PredicateAssignment_3_in_rule__Witness__Group__3__Impl10919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Witness__Group__4__Impl_in_rule__Witness__Group__410949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Witness__Group_4__0_in_rule__Witness__Group__4__Impl10976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Witness__Group_4__0__Impl_in_rule__Witness__Group_4__011017 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Witness__Group_4__1_in_rule__Witness__Group_4__011020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Witness__Group_4__0__Impl11048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Witness__Group_4__1__Impl_in_rule__Witness__Group_4__111079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Witness__CommentAssignment_4_1_in_rule__Witness__Group_4__1__Impl11106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Statemachine__NameAssignment_111145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Statemachine__CommentAssignment_2_111176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTranslationKind_in_rule__Statemachine__TranslationAssignment_3_111207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Statemachine__ElaboratesAssignment_4_111242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Statemachine__RefinesAssignment_5_111281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractNode_in_rule__Statemachine__NodesAssignment_6_111316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractNode_in_rule__Statemachine__NodesAssignment_6_2_111347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransition_in_rule__Statemachine__TransitionsAssignment_7_111378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransition_in_rule__Statemachine__TransitionsAssignment_7_2_111409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__Transition__ExtendedAssignment_111445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Transition__CommentAssignment_3_111484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Transition__ElaboratesAssignment_4_111519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Transition__ElaboratesAssignment_4_2_111558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Transition__TargetAssignment_5_111597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Transition__SourceAssignment_6_111636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedParameter_in_rule__Transition__ParametersAssignment_7_211671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedParameter_in_rule__Transition__ParametersAssignment_7_3_111702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGuard_in_rule__Transition__GuardsAssignment_8_211733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGuard_in_rule__Transition__GuardsAssignment_8_3_111764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAction_in_rule__Transition__ActionsAssignment_9_211795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAction_in_rule__Transition__ActionsAssignment_9_3_111826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWitness_in_rule__Transition__WitnessesAssignment_10_211857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWitness_in_rule__Transition__WitnessesAssignment_10_3_111888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__State__NameAssignment_211919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__State__RefinesAssignment_3_111954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStatemachine_in_rule__State__StatemachinesAssignment_4_211989 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStatemachine_in_rule__State__StatemachinesAssignment_4_3_112020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvariant_in_rule__State__InvariantsAssignment_5_212051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvariant_in_rule__State__InvariantsAssignment_5_3_112082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Initial__InternalIdAssignment_2_112113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Final__InternalIdAssignment_2_112144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Any__InternalIdAssignment_2_112175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Junction__InternalIdAssignment_2_112206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Fork__InternalIdAssignment_2_112237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Invariant__NameAssignment_212268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__Invariant__TheoremAssignment_312304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Invariant__PredicateAssignment_412343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Invariant__CommentAssignment_5_112374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TypedParameter__NameAssignment_112405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TypedParameter__TypeAssignment_312436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TypedParameter__CommentAssignment_4_112467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__Guard__TheoremAssignment_012503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Guard__NameAssignment_212542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Guard__PredicateAssignment_312573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Guard__CommentAssignment_4_112604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Action__NameAssignment_112635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Action__ActionAssignment_312666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Action__CommentAssignment_4_112697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Witness__NameAssignment_212728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Witness__PredicateAssignment_312759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Witness__CommentAssignment_4_112790 = new BitSet(new long[]{0x0000000000000002L});
    }


}