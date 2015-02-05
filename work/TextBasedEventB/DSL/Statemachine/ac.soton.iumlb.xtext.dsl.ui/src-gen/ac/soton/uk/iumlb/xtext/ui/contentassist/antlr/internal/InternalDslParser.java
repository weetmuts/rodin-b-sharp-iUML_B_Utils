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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Statemachine'", "'elaborates'", "'refines'", "'nodes'", "','", "'transitions'", "'Transition'", "'comment'", "'target'", "'source'", "'State'", "'statemachines'", "'{'", "'}'", "'invariants'", "'Initial'", "'internalId'", "'Final'", "'Any'", "'Junction'", "'Fork'", "'Invariant'", "'@'", "'predicate'", "'extended'", "'theorem'"
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
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
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


    // $ANTLR start "rule__AbstractNode__Alternatives"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:372:1: rule__AbstractNode__Alternatives : ( ( ruleState ) | ( ruleInitial ) | ( ruleFinal ) | ( ruleAny ) | ( ruleJunction ) | ( ruleFork ) );
    public final void rule__AbstractNode__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:376:1: ( ( ruleState ) | ( ruleInitial ) | ( ruleFinal ) | ( ruleAny ) | ( ruleJunction ) | ( ruleFork ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt1=1;
                }
                break;
            case 26:
                {
                alt1=2;
                }
                break;
            case 28:
                {
                alt1=3;
                }
                break;
            case 29:
                {
                alt1=4;
                }
                break;
            case 30:
                {
                alt1=5;
                }
                break;
            case 31:
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
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:377:1: ( ruleState )
                    {
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:377:1: ( ruleState )
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:378:1: ruleState
                    {
                     before(grammarAccess.getAbstractNodeAccess().getStateParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleState_in_rule__AbstractNode__Alternatives734);
                    ruleState();

                    state._fsp--;

                     after(grammarAccess.getAbstractNodeAccess().getStateParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:383:6: ( ruleInitial )
                    {
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:383:6: ( ruleInitial )
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:384:1: ruleInitial
                    {
                     before(grammarAccess.getAbstractNodeAccess().getInitialParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleInitial_in_rule__AbstractNode__Alternatives751);
                    ruleInitial();

                    state._fsp--;

                     after(grammarAccess.getAbstractNodeAccess().getInitialParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:389:6: ( ruleFinal )
                    {
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:389:6: ( ruleFinal )
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:390:1: ruleFinal
                    {
                     before(grammarAccess.getAbstractNodeAccess().getFinalParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleFinal_in_rule__AbstractNode__Alternatives768);
                    ruleFinal();

                    state._fsp--;

                     after(grammarAccess.getAbstractNodeAccess().getFinalParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:395:6: ( ruleAny )
                    {
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:395:6: ( ruleAny )
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:396:1: ruleAny
                    {
                     before(grammarAccess.getAbstractNodeAccess().getAnyParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleAny_in_rule__AbstractNode__Alternatives785);
                    ruleAny();

                    state._fsp--;

                     after(grammarAccess.getAbstractNodeAccess().getAnyParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:401:6: ( ruleJunction )
                    {
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:401:6: ( ruleJunction )
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:402:1: ruleJunction
                    {
                     before(grammarAccess.getAbstractNodeAccess().getJunctionParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleJunction_in_rule__AbstractNode__Alternatives802);
                    ruleJunction();

                    state._fsp--;

                     after(grammarAccess.getAbstractNodeAccess().getJunctionParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:407:6: ( ruleFork )
                    {
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:407:6: ( ruleFork )
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:408:1: ruleFork
                    {
                     before(grammarAccess.getAbstractNodeAccess().getForkParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_ruleFork_in_rule__AbstractNode__Alternatives819);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:419:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:423:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:424:1: ( RULE_STRING )
                    {
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:424:1: ( RULE_STRING )
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:425:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives852); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:430:6: ( RULE_ID )
                    {
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:430:6: ( RULE_ID )
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:431:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives869); 
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


    // $ANTLR start "rule__Statemachine__Group__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:443:1: rule__Statemachine__Group__0 : rule__Statemachine__Group__0__Impl rule__Statemachine__Group__1 ;
    public final void rule__Statemachine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:447:1: ( rule__Statemachine__Group__0__Impl rule__Statemachine__Group__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:448:2: rule__Statemachine__Group__0__Impl rule__Statemachine__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group__0__Impl_in_rule__Statemachine__Group__0899);
            rule__Statemachine__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group__1_in_rule__Statemachine__Group__0902);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:455:1: rule__Statemachine__Group__0__Impl : ( 'Statemachine' ) ;
    public final void rule__Statemachine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:459:1: ( ( 'Statemachine' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:460:1: ( 'Statemachine' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:460:1: ( 'Statemachine' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:461:1: 'Statemachine'
            {
             before(grammarAccess.getStatemachineAccess().getStatemachineKeyword_0()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__Statemachine__Group__0__Impl930); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:474:1: rule__Statemachine__Group__1 : rule__Statemachine__Group__1__Impl rule__Statemachine__Group__2 ;
    public final void rule__Statemachine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:478:1: ( rule__Statemachine__Group__1__Impl rule__Statemachine__Group__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:479:2: rule__Statemachine__Group__1__Impl rule__Statemachine__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group__1__Impl_in_rule__Statemachine__Group__1961);
            rule__Statemachine__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group__2_in_rule__Statemachine__Group__1964);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:486:1: rule__Statemachine__Group__1__Impl : ( ( rule__Statemachine__NameAssignment_1 ) ) ;
    public final void rule__Statemachine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:490:1: ( ( ( rule__Statemachine__NameAssignment_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:491:1: ( ( rule__Statemachine__NameAssignment_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:491:1: ( ( rule__Statemachine__NameAssignment_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:492:1: ( rule__Statemachine__NameAssignment_1 )
            {
             before(grammarAccess.getStatemachineAccess().getNameAssignment_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:493:1: ( rule__Statemachine__NameAssignment_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:493:2: rule__Statemachine__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__NameAssignment_1_in_rule__Statemachine__Group__1__Impl991);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:503:1: rule__Statemachine__Group__2 : rule__Statemachine__Group__2__Impl rule__Statemachine__Group__3 ;
    public final void rule__Statemachine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:507:1: ( rule__Statemachine__Group__2__Impl rule__Statemachine__Group__3 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:508:2: rule__Statemachine__Group__2__Impl rule__Statemachine__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group__2__Impl_in_rule__Statemachine__Group__21021);
            rule__Statemachine__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group__3_in_rule__Statemachine__Group__21024);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:515:1: rule__Statemachine__Group__2__Impl : ( ( rule__Statemachine__Group_2__0 )? ) ;
    public final void rule__Statemachine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:519:1: ( ( ( rule__Statemachine__Group_2__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:520:1: ( ( rule__Statemachine__Group_2__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:520:1: ( ( rule__Statemachine__Group_2__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:521:1: ( rule__Statemachine__Group_2__0 )?
            {
             before(grammarAccess.getStatemachineAccess().getGroup_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:522:1: ( rule__Statemachine__Group_2__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:522:2: rule__Statemachine__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_2__0_in_rule__Statemachine__Group__2__Impl1051);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:532:1: rule__Statemachine__Group__3 : rule__Statemachine__Group__3__Impl rule__Statemachine__Group__4 ;
    public final void rule__Statemachine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:536:1: ( rule__Statemachine__Group__3__Impl rule__Statemachine__Group__4 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:537:2: rule__Statemachine__Group__3__Impl rule__Statemachine__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group__3__Impl_in_rule__Statemachine__Group__31082);
            rule__Statemachine__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group__4_in_rule__Statemachine__Group__31085);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:544:1: rule__Statemachine__Group__3__Impl : ( ( rule__Statemachine__Group_3__0 )? ) ;
    public final void rule__Statemachine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:548:1: ( ( ( rule__Statemachine__Group_3__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:549:1: ( ( rule__Statemachine__Group_3__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:549:1: ( ( rule__Statemachine__Group_3__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:550:1: ( rule__Statemachine__Group_3__0 )?
            {
             before(grammarAccess.getStatemachineAccess().getGroup_3()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:551:1: ( rule__Statemachine__Group_3__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:551:2: rule__Statemachine__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_3__0_in_rule__Statemachine__Group__3__Impl1112);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:561:1: rule__Statemachine__Group__4 : rule__Statemachine__Group__4__Impl rule__Statemachine__Group__5 ;
    public final void rule__Statemachine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:565:1: ( rule__Statemachine__Group__4__Impl rule__Statemachine__Group__5 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:566:2: rule__Statemachine__Group__4__Impl rule__Statemachine__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group__4__Impl_in_rule__Statemachine__Group__41143);
            rule__Statemachine__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group__5_in_rule__Statemachine__Group__41146);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:573:1: rule__Statemachine__Group__4__Impl : ( ( rule__Statemachine__Group_4__0 )? ) ;
    public final void rule__Statemachine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:577:1: ( ( ( rule__Statemachine__Group_4__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:578:1: ( ( rule__Statemachine__Group_4__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:578:1: ( ( rule__Statemachine__Group_4__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:579:1: ( rule__Statemachine__Group_4__0 )?
            {
             before(grammarAccess.getStatemachineAccess().getGroup_4()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:580:1: ( rule__Statemachine__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:580:2: rule__Statemachine__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_4__0_in_rule__Statemachine__Group__4__Impl1173);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:590:1: rule__Statemachine__Group__5 : rule__Statemachine__Group__5__Impl ;
    public final void rule__Statemachine__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:594:1: ( rule__Statemachine__Group__5__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:595:2: rule__Statemachine__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group__5__Impl_in_rule__Statemachine__Group__51204);
            rule__Statemachine__Group__5__Impl();

            state._fsp--;


            }

        }
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:601:1: rule__Statemachine__Group__5__Impl : ( ( rule__Statemachine__Group_5__0 )? ) ;
    public final void rule__Statemachine__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:605:1: ( ( ( rule__Statemachine__Group_5__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:606:1: ( ( rule__Statemachine__Group_5__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:606:1: ( ( rule__Statemachine__Group_5__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:607:1: ( rule__Statemachine__Group_5__0 )?
            {
             before(grammarAccess.getStatemachineAccess().getGroup_5()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:608:1: ( rule__Statemachine__Group_5__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:608:2: rule__Statemachine__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_5__0_in_rule__Statemachine__Group__5__Impl1231);
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


    // $ANTLR start "rule__Statemachine__Group_2__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:630:1: rule__Statemachine__Group_2__0 : rule__Statemachine__Group_2__0__Impl rule__Statemachine__Group_2__1 ;
    public final void rule__Statemachine__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:634:1: ( rule__Statemachine__Group_2__0__Impl rule__Statemachine__Group_2__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:635:2: rule__Statemachine__Group_2__0__Impl rule__Statemachine__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_2__0__Impl_in_rule__Statemachine__Group_2__01274);
            rule__Statemachine__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_2__1_in_rule__Statemachine__Group_2__01277);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:642:1: rule__Statemachine__Group_2__0__Impl : ( 'elaborates' ) ;
    public final void rule__Statemachine__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:646:1: ( ( 'elaborates' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:647:1: ( 'elaborates' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:647:1: ( 'elaborates' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:648:1: 'elaborates'
            {
             before(grammarAccess.getStatemachineAccess().getElaboratesKeyword_2_0()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Statemachine__Group_2__0__Impl1305); 
             after(grammarAccess.getStatemachineAccess().getElaboratesKeyword_2_0()); 

            }


            }

        }
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:661:1: rule__Statemachine__Group_2__1 : rule__Statemachine__Group_2__1__Impl ;
    public final void rule__Statemachine__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:665:1: ( rule__Statemachine__Group_2__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:666:2: rule__Statemachine__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_2__1__Impl_in_rule__Statemachine__Group_2__11336);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:672:1: rule__Statemachine__Group_2__1__Impl : ( ( rule__Statemachine__ElaboratesAssignment_2_1 ) ) ;
    public final void rule__Statemachine__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:676:1: ( ( ( rule__Statemachine__ElaboratesAssignment_2_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:677:1: ( ( rule__Statemachine__ElaboratesAssignment_2_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:677:1: ( ( rule__Statemachine__ElaboratesAssignment_2_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:678:1: ( rule__Statemachine__ElaboratesAssignment_2_1 )
            {
             before(grammarAccess.getStatemachineAccess().getElaboratesAssignment_2_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:679:1: ( rule__Statemachine__ElaboratesAssignment_2_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:679:2: rule__Statemachine__ElaboratesAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__ElaboratesAssignment_2_1_in_rule__Statemachine__Group_2__1__Impl1363);
            rule__Statemachine__ElaboratesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStatemachineAccess().getElaboratesAssignment_2_1()); 

            }


            }

        }
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:693:1: rule__Statemachine__Group_3__0 : rule__Statemachine__Group_3__0__Impl rule__Statemachine__Group_3__1 ;
    public final void rule__Statemachine__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:697:1: ( rule__Statemachine__Group_3__0__Impl rule__Statemachine__Group_3__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:698:2: rule__Statemachine__Group_3__0__Impl rule__Statemachine__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_3__0__Impl_in_rule__Statemachine__Group_3__01397);
            rule__Statemachine__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_3__1_in_rule__Statemachine__Group_3__01400);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:705:1: rule__Statemachine__Group_3__0__Impl : ( 'refines' ) ;
    public final void rule__Statemachine__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:709:1: ( ( 'refines' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:710:1: ( 'refines' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:710:1: ( 'refines' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:711:1: 'refines'
            {
             before(grammarAccess.getStatemachineAccess().getRefinesKeyword_3_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Statemachine__Group_3__0__Impl1428); 
             after(grammarAccess.getStatemachineAccess().getRefinesKeyword_3_0()); 

            }


            }

        }
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:724:1: rule__Statemachine__Group_3__1 : rule__Statemachine__Group_3__1__Impl ;
    public final void rule__Statemachine__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:728:1: ( rule__Statemachine__Group_3__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:729:2: rule__Statemachine__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_3__1__Impl_in_rule__Statemachine__Group_3__11459);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:735:1: rule__Statemachine__Group_3__1__Impl : ( ( rule__Statemachine__RefinesAssignment_3_1 ) ) ;
    public final void rule__Statemachine__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:739:1: ( ( ( rule__Statemachine__RefinesAssignment_3_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:740:1: ( ( rule__Statemachine__RefinesAssignment_3_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:740:1: ( ( rule__Statemachine__RefinesAssignment_3_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:741:1: ( rule__Statemachine__RefinesAssignment_3_1 )
            {
             before(grammarAccess.getStatemachineAccess().getRefinesAssignment_3_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:742:1: ( rule__Statemachine__RefinesAssignment_3_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:742:2: rule__Statemachine__RefinesAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__RefinesAssignment_3_1_in_rule__Statemachine__Group_3__1__Impl1486);
            rule__Statemachine__RefinesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStatemachineAccess().getRefinesAssignment_3_1()); 

            }


            }

        }
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:756:1: rule__Statemachine__Group_4__0 : rule__Statemachine__Group_4__0__Impl rule__Statemachine__Group_4__1 ;
    public final void rule__Statemachine__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:760:1: ( rule__Statemachine__Group_4__0__Impl rule__Statemachine__Group_4__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:761:2: rule__Statemachine__Group_4__0__Impl rule__Statemachine__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_4__0__Impl_in_rule__Statemachine__Group_4__01520);
            rule__Statemachine__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_4__1_in_rule__Statemachine__Group_4__01523);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:768:1: rule__Statemachine__Group_4__0__Impl : ( 'nodes' ) ;
    public final void rule__Statemachine__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:772:1: ( ( 'nodes' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:773:1: ( 'nodes' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:773:1: ( 'nodes' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:774:1: 'nodes'
            {
             before(grammarAccess.getStatemachineAccess().getNodesKeyword_4_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Statemachine__Group_4__0__Impl1551); 
             after(grammarAccess.getStatemachineAccess().getNodesKeyword_4_0()); 

            }


            }

        }
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:787:1: rule__Statemachine__Group_4__1 : rule__Statemachine__Group_4__1__Impl rule__Statemachine__Group_4__2 ;
    public final void rule__Statemachine__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:791:1: ( rule__Statemachine__Group_4__1__Impl rule__Statemachine__Group_4__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:792:2: rule__Statemachine__Group_4__1__Impl rule__Statemachine__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_4__1__Impl_in_rule__Statemachine__Group_4__11582);
            rule__Statemachine__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_4__2_in_rule__Statemachine__Group_4__11585);
            rule__Statemachine__Group_4__2();

            state._fsp--;


            }

        }
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:799:1: rule__Statemachine__Group_4__1__Impl : ( ( rule__Statemachine__NodesAssignment_4_1 ) ) ;
    public final void rule__Statemachine__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:803:1: ( ( ( rule__Statemachine__NodesAssignment_4_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:804:1: ( ( rule__Statemachine__NodesAssignment_4_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:804:1: ( ( rule__Statemachine__NodesAssignment_4_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:805:1: ( rule__Statemachine__NodesAssignment_4_1 )
            {
             before(grammarAccess.getStatemachineAccess().getNodesAssignment_4_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:806:1: ( rule__Statemachine__NodesAssignment_4_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:806:2: rule__Statemachine__NodesAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__NodesAssignment_4_1_in_rule__Statemachine__Group_4__1__Impl1612);
            rule__Statemachine__NodesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getStatemachineAccess().getNodesAssignment_4_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Statemachine__Group_4__2"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:816:1: rule__Statemachine__Group_4__2 : rule__Statemachine__Group_4__2__Impl ;
    public final void rule__Statemachine__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:820:1: ( rule__Statemachine__Group_4__2__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:821:2: rule__Statemachine__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_4__2__Impl_in_rule__Statemachine__Group_4__21642);
            rule__Statemachine__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_4__2"


    // $ANTLR start "rule__Statemachine__Group_4__2__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:827:1: rule__Statemachine__Group_4__2__Impl : ( ( rule__Statemachine__Group_4_2__0 )* ) ;
    public final void rule__Statemachine__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:831:1: ( ( ( rule__Statemachine__Group_4_2__0 )* ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:832:1: ( ( rule__Statemachine__Group_4_2__0 )* )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:832:1: ( ( rule__Statemachine__Group_4_2__0 )* )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:833:1: ( rule__Statemachine__Group_4_2__0 )*
            {
             before(grammarAccess.getStatemachineAccess().getGroup_4_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:834:1: ( rule__Statemachine__Group_4_2__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    int LA7_2 = input.LA(2);

                    if ( (LA7_2==21||LA7_2==26||(LA7_2>=28 && LA7_2<=31)) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:834:2: rule__Statemachine__Group_4_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_4_2__0_in_rule__Statemachine__Group_4__2__Impl1669);
            	    rule__Statemachine__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getStatemachineAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_4__2__Impl"


    // $ANTLR start "rule__Statemachine__Group_4_2__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:850:1: rule__Statemachine__Group_4_2__0 : rule__Statemachine__Group_4_2__0__Impl rule__Statemachine__Group_4_2__1 ;
    public final void rule__Statemachine__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:854:1: ( rule__Statemachine__Group_4_2__0__Impl rule__Statemachine__Group_4_2__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:855:2: rule__Statemachine__Group_4_2__0__Impl rule__Statemachine__Group_4_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_4_2__0__Impl_in_rule__Statemachine__Group_4_2__01706);
            rule__Statemachine__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_4_2__1_in_rule__Statemachine__Group_4_2__01709);
            rule__Statemachine__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_4_2__0"


    // $ANTLR start "rule__Statemachine__Group_4_2__0__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:862:1: rule__Statemachine__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__Statemachine__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:866:1: ( ( ',' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:867:1: ( ',' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:867:1: ( ',' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:868:1: ','
            {
             before(grammarAccess.getStatemachineAccess().getCommaKeyword_4_2_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Statemachine__Group_4_2__0__Impl1737); 
             after(grammarAccess.getStatemachineAccess().getCommaKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_4_2__0__Impl"


    // $ANTLR start "rule__Statemachine__Group_4_2__1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:881:1: rule__Statemachine__Group_4_2__1 : rule__Statemachine__Group_4_2__1__Impl ;
    public final void rule__Statemachine__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:885:1: ( rule__Statemachine__Group_4_2__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:886:2: rule__Statemachine__Group_4_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_4_2__1__Impl_in_rule__Statemachine__Group_4_2__11768);
            rule__Statemachine__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_4_2__1"


    // $ANTLR start "rule__Statemachine__Group_4_2__1__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:892:1: rule__Statemachine__Group_4_2__1__Impl : ( ( rule__Statemachine__NodesAssignment_4_2_1 ) ) ;
    public final void rule__Statemachine__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:896:1: ( ( ( rule__Statemachine__NodesAssignment_4_2_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:897:1: ( ( rule__Statemachine__NodesAssignment_4_2_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:897:1: ( ( rule__Statemachine__NodesAssignment_4_2_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:898:1: ( rule__Statemachine__NodesAssignment_4_2_1 )
            {
             before(grammarAccess.getStatemachineAccess().getNodesAssignment_4_2_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:899:1: ( rule__Statemachine__NodesAssignment_4_2_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:899:2: rule__Statemachine__NodesAssignment_4_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__NodesAssignment_4_2_1_in_rule__Statemachine__Group_4_2__1__Impl1795);
            rule__Statemachine__NodesAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStatemachineAccess().getNodesAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_4_2__1__Impl"


    // $ANTLR start "rule__Statemachine__Group_5__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:913:1: rule__Statemachine__Group_5__0 : rule__Statemachine__Group_5__0__Impl rule__Statemachine__Group_5__1 ;
    public final void rule__Statemachine__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:917:1: ( rule__Statemachine__Group_5__0__Impl rule__Statemachine__Group_5__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:918:2: rule__Statemachine__Group_5__0__Impl rule__Statemachine__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_5__0__Impl_in_rule__Statemachine__Group_5__01829);
            rule__Statemachine__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_5__1_in_rule__Statemachine__Group_5__01832);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:925:1: rule__Statemachine__Group_5__0__Impl : ( 'transitions' ) ;
    public final void rule__Statemachine__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:929:1: ( ( 'transitions' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:930:1: ( 'transitions' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:930:1: ( 'transitions' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:931:1: 'transitions'
            {
             before(grammarAccess.getStatemachineAccess().getTransitionsKeyword_5_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Statemachine__Group_5__0__Impl1860); 
             after(grammarAccess.getStatemachineAccess().getTransitionsKeyword_5_0()); 

            }


            }

        }
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:944:1: rule__Statemachine__Group_5__1 : rule__Statemachine__Group_5__1__Impl rule__Statemachine__Group_5__2 ;
    public final void rule__Statemachine__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:948:1: ( rule__Statemachine__Group_5__1__Impl rule__Statemachine__Group_5__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:949:2: rule__Statemachine__Group_5__1__Impl rule__Statemachine__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_5__1__Impl_in_rule__Statemachine__Group_5__11891);
            rule__Statemachine__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_5__2_in_rule__Statemachine__Group_5__11894);
            rule__Statemachine__Group_5__2();

            state._fsp--;


            }

        }
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:956:1: rule__Statemachine__Group_5__1__Impl : ( ( rule__Statemachine__TransitionsAssignment_5_1 ) ) ;
    public final void rule__Statemachine__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:960:1: ( ( ( rule__Statemachine__TransitionsAssignment_5_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:961:1: ( ( rule__Statemachine__TransitionsAssignment_5_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:961:1: ( ( rule__Statemachine__TransitionsAssignment_5_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:962:1: ( rule__Statemachine__TransitionsAssignment_5_1 )
            {
             before(grammarAccess.getStatemachineAccess().getTransitionsAssignment_5_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:963:1: ( rule__Statemachine__TransitionsAssignment_5_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:963:2: rule__Statemachine__TransitionsAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__TransitionsAssignment_5_1_in_rule__Statemachine__Group_5__1__Impl1921);
            rule__Statemachine__TransitionsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getStatemachineAccess().getTransitionsAssignment_5_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Statemachine__Group_5__2"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:973:1: rule__Statemachine__Group_5__2 : rule__Statemachine__Group_5__2__Impl ;
    public final void rule__Statemachine__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:977:1: ( rule__Statemachine__Group_5__2__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:978:2: rule__Statemachine__Group_5__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_5__2__Impl_in_rule__Statemachine__Group_5__21951);
            rule__Statemachine__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_5__2"


    // $ANTLR start "rule__Statemachine__Group_5__2__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:984:1: rule__Statemachine__Group_5__2__Impl : ( ( rule__Statemachine__Group_5_2__0 )* ) ;
    public final void rule__Statemachine__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:988:1: ( ( ( rule__Statemachine__Group_5_2__0 )* ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:989:1: ( ( rule__Statemachine__Group_5_2__0 )* )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:989:1: ( ( rule__Statemachine__Group_5_2__0 )* )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:990:1: ( rule__Statemachine__Group_5_2__0 )*
            {
             before(grammarAccess.getStatemachineAccess().getGroup_5_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:991:1: ( rule__Statemachine__Group_5_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    int LA8_2 = input.LA(2);

                    if ( (LA8_2==17||LA8_2==35) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:991:2: rule__Statemachine__Group_5_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_5_2__0_in_rule__Statemachine__Group_5__2__Impl1978);
            	    rule__Statemachine__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getStatemachineAccess().getGroup_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_5__2__Impl"


    // $ANTLR start "rule__Statemachine__Group_5_2__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1007:1: rule__Statemachine__Group_5_2__0 : rule__Statemachine__Group_5_2__0__Impl rule__Statemachine__Group_5_2__1 ;
    public final void rule__Statemachine__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1011:1: ( rule__Statemachine__Group_5_2__0__Impl rule__Statemachine__Group_5_2__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1012:2: rule__Statemachine__Group_5_2__0__Impl rule__Statemachine__Group_5_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_5_2__0__Impl_in_rule__Statemachine__Group_5_2__02015);
            rule__Statemachine__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_5_2__1_in_rule__Statemachine__Group_5_2__02018);
            rule__Statemachine__Group_5_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_5_2__0"


    // $ANTLR start "rule__Statemachine__Group_5_2__0__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1019:1: rule__Statemachine__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__Statemachine__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1023:1: ( ( ',' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1024:1: ( ',' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1024:1: ( ',' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1025:1: ','
            {
             before(grammarAccess.getStatemachineAccess().getCommaKeyword_5_2_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Statemachine__Group_5_2__0__Impl2046); 
             after(grammarAccess.getStatemachineAccess().getCommaKeyword_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_5_2__0__Impl"


    // $ANTLR start "rule__Statemachine__Group_5_2__1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1038:1: rule__Statemachine__Group_5_2__1 : rule__Statemachine__Group_5_2__1__Impl ;
    public final void rule__Statemachine__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1042:1: ( rule__Statemachine__Group_5_2__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1043:2: rule__Statemachine__Group_5_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_5_2__1__Impl_in_rule__Statemachine__Group_5_2__12077);
            rule__Statemachine__Group_5_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_5_2__1"


    // $ANTLR start "rule__Statemachine__Group_5_2__1__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1049:1: rule__Statemachine__Group_5_2__1__Impl : ( ( rule__Statemachine__TransitionsAssignment_5_2_1 ) ) ;
    public final void rule__Statemachine__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1053:1: ( ( ( rule__Statemachine__TransitionsAssignment_5_2_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1054:1: ( ( rule__Statemachine__TransitionsAssignment_5_2_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1054:1: ( ( rule__Statemachine__TransitionsAssignment_5_2_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1055:1: ( rule__Statemachine__TransitionsAssignment_5_2_1 )
            {
             before(grammarAccess.getStatemachineAccess().getTransitionsAssignment_5_2_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1056:1: ( rule__Statemachine__TransitionsAssignment_5_2_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1056:2: rule__Statemachine__TransitionsAssignment_5_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__TransitionsAssignment_5_2_1_in_rule__Statemachine__Group_5_2__1__Impl2104);
            rule__Statemachine__TransitionsAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStatemachineAccess().getTransitionsAssignment_5_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_5_2__1__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1070:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1074:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1075:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__02138);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__02141);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1082:1: rule__Transition__Group__0__Impl : ( () ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1086:1: ( ( () ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1087:1: ( () )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1087:1: ( () )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1088:1: ()
            {
             before(grammarAccess.getTransitionAccess().getTransitionAction_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1089:1: ()
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1091:1: 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1101:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1105:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1106:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__12199);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__12202);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1113:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__ExtendedAssignment_1 )? ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1117:1: ( ( ( rule__Transition__ExtendedAssignment_1 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1118:1: ( ( rule__Transition__ExtendedAssignment_1 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1118:1: ( ( rule__Transition__ExtendedAssignment_1 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1119:1: ( rule__Transition__ExtendedAssignment_1 )?
            {
             before(grammarAccess.getTransitionAccess().getExtendedAssignment_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1120:1: ( rule__Transition__ExtendedAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==35) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1120:2: rule__Transition__ExtendedAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Transition__ExtendedAssignment_1_in_rule__Transition__Group__1__Impl2229);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1130:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1134:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1135:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__22260);
            rule__Transition__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__22263);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1142:1: rule__Transition__Group__2__Impl : ( 'Transition' ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1146:1: ( ( 'Transition' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1147:1: ( 'Transition' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1147:1: ( 'Transition' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1148:1: 'Transition'
            {
             before(grammarAccess.getTransitionAccess().getTransitionKeyword_2()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Transition__Group__2__Impl2291); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1161:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1165:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1166:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__32322);
            rule__Transition__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__4_in_rule__Transition__Group__32325);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1173:1: rule__Transition__Group__3__Impl : ( ( rule__Transition__Group_3__0 )? ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1177:1: ( ( ( rule__Transition__Group_3__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1178:1: ( ( rule__Transition__Group_3__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1178:1: ( ( rule__Transition__Group_3__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1179:1: ( rule__Transition__Group_3__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_3()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1180:1: ( rule__Transition__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1180:2: rule__Transition__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_3__0_in_rule__Transition__Group__3__Impl2352);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1190:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl rule__Transition__Group__5 ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1194:1: ( rule__Transition__Group__4__Impl rule__Transition__Group__5 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1195:2: rule__Transition__Group__4__Impl rule__Transition__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__4__Impl_in_rule__Transition__Group__42383);
            rule__Transition__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__5_in_rule__Transition__Group__42386);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1202:1: rule__Transition__Group__4__Impl : ( ( rule__Transition__Group_4__0 )? ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1206:1: ( ( ( rule__Transition__Group_4__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1207:1: ( ( rule__Transition__Group_4__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1207:1: ( ( rule__Transition__Group_4__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1208:1: ( rule__Transition__Group_4__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_4()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1209:1: ( rule__Transition__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==12) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1209:2: rule__Transition__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4__0_in_rule__Transition__Group__4__Impl2413);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1219:1: rule__Transition__Group__5 : rule__Transition__Group__5__Impl rule__Transition__Group__6 ;
    public final void rule__Transition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1223:1: ( rule__Transition__Group__5__Impl rule__Transition__Group__6 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1224:2: rule__Transition__Group__5__Impl rule__Transition__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__5__Impl_in_rule__Transition__Group__52444);
            rule__Transition__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__6_in_rule__Transition__Group__52447);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1231:1: rule__Transition__Group__5__Impl : ( ( rule__Transition__Group_5__0 )? ) ;
    public final void rule__Transition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1235:1: ( ( ( rule__Transition__Group_5__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1236:1: ( ( rule__Transition__Group_5__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1236:1: ( ( rule__Transition__Group_5__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1237:1: ( rule__Transition__Group_5__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_5()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1238:1: ( rule__Transition__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1238:2: rule__Transition__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_5__0_in_rule__Transition__Group__5__Impl2474);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1248:1: rule__Transition__Group__6 : rule__Transition__Group__6__Impl ;
    public final void rule__Transition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1252:1: ( rule__Transition__Group__6__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1253:2: rule__Transition__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__6__Impl_in_rule__Transition__Group__62505);
            rule__Transition__Group__6__Impl();

            state._fsp--;


            }

        }
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1259:1: rule__Transition__Group__6__Impl : ( ( rule__Transition__Group_6__0 )? ) ;
    public final void rule__Transition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1263:1: ( ( ( rule__Transition__Group_6__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1264:1: ( ( rule__Transition__Group_6__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1264:1: ( ( rule__Transition__Group_6__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1265:1: ( rule__Transition__Group_6__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_6()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1266:1: ( rule__Transition__Group_6__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1266:2: rule__Transition__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_6__0_in_rule__Transition__Group__6__Impl2532);
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


    // $ANTLR start "rule__Transition__Group_3__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1290:1: rule__Transition__Group_3__0 : rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1 ;
    public final void rule__Transition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1294:1: ( rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1295:2: rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_3__0__Impl_in_rule__Transition__Group_3__02577);
            rule__Transition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_3__1_in_rule__Transition__Group_3__02580);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1302:1: rule__Transition__Group_3__0__Impl : ( 'comment' ) ;
    public final void rule__Transition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1306:1: ( ( 'comment' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1307:1: ( 'comment' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1307:1: ( 'comment' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1308:1: 'comment'
            {
             before(grammarAccess.getTransitionAccess().getCommentKeyword_3_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Transition__Group_3__0__Impl2608); 
             after(grammarAccess.getTransitionAccess().getCommentKeyword_3_0()); 

            }


            }

        }
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1321:1: rule__Transition__Group_3__1 : rule__Transition__Group_3__1__Impl ;
    public final void rule__Transition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1325:1: ( rule__Transition__Group_3__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1326:2: rule__Transition__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_3__1__Impl_in_rule__Transition__Group_3__12639);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1332:1: rule__Transition__Group_3__1__Impl : ( ( rule__Transition__CommentAssignment_3_1 ) ) ;
    public final void rule__Transition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1336:1: ( ( ( rule__Transition__CommentAssignment_3_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1337:1: ( ( rule__Transition__CommentAssignment_3_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1337:1: ( ( rule__Transition__CommentAssignment_3_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1338:1: ( rule__Transition__CommentAssignment_3_1 )
            {
             before(grammarAccess.getTransitionAccess().getCommentAssignment_3_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1339:1: ( rule__Transition__CommentAssignment_3_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1339:2: rule__Transition__CommentAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__CommentAssignment_3_1_in_rule__Transition__Group_3__1__Impl2666);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1353:1: rule__Transition__Group_4__0 : rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1 ;
    public final void rule__Transition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1357:1: ( rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1358:2: rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4__0__Impl_in_rule__Transition__Group_4__02700);
            rule__Transition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4__1_in_rule__Transition__Group_4__02703);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1365:1: rule__Transition__Group_4__0__Impl : ( 'elaborates' ) ;
    public final void rule__Transition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1369:1: ( ( 'elaborates' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1370:1: ( 'elaborates' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1370:1: ( 'elaborates' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1371:1: 'elaborates'
            {
             before(grammarAccess.getTransitionAccess().getElaboratesKeyword_4_0()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Transition__Group_4__0__Impl2731); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1384:1: rule__Transition__Group_4__1 : rule__Transition__Group_4__1__Impl rule__Transition__Group_4__2 ;
    public final void rule__Transition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1388:1: ( rule__Transition__Group_4__1__Impl rule__Transition__Group_4__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1389:2: rule__Transition__Group_4__1__Impl rule__Transition__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4__1__Impl_in_rule__Transition__Group_4__12762);
            rule__Transition__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4__2_in_rule__Transition__Group_4__12765);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1396:1: rule__Transition__Group_4__1__Impl : ( ( rule__Transition__ElaboratesAssignment_4_1 ) ) ;
    public final void rule__Transition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1400:1: ( ( ( rule__Transition__ElaboratesAssignment_4_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1401:1: ( ( rule__Transition__ElaboratesAssignment_4_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1401:1: ( ( rule__Transition__ElaboratesAssignment_4_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1402:1: ( rule__Transition__ElaboratesAssignment_4_1 )
            {
             before(grammarAccess.getTransitionAccess().getElaboratesAssignment_4_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1403:1: ( rule__Transition__ElaboratesAssignment_4_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1403:2: rule__Transition__ElaboratesAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__ElaboratesAssignment_4_1_in_rule__Transition__Group_4__1__Impl2792);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1413:1: rule__Transition__Group_4__2 : rule__Transition__Group_4__2__Impl ;
    public final void rule__Transition__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1417:1: ( rule__Transition__Group_4__2__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1418:2: rule__Transition__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4__2__Impl_in_rule__Transition__Group_4__22822);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1424:1: rule__Transition__Group_4__2__Impl : ( ( rule__Transition__Group_4_2__0 )* ) ;
    public final void rule__Transition__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1428:1: ( ( ( rule__Transition__Group_4_2__0 )* ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1429:1: ( ( rule__Transition__Group_4_2__0 )* )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1429:1: ( ( rule__Transition__Group_4_2__0 )* )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1430:1: ( rule__Transition__Group_4_2__0 )*
            {
             before(grammarAccess.getTransitionAccess().getGroup_4_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1431:1: ( rule__Transition__Group_4_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==15) ) {
                    int LA14_2 = input.LA(2);

                    if ( ((LA14_2>=RULE_STRING && LA14_2<=RULE_ID)) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1431:2: rule__Transition__Group_4_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4_2__0_in_rule__Transition__Group_4__2__Impl2849);
            	    rule__Transition__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1447:1: rule__Transition__Group_4_2__0 : rule__Transition__Group_4_2__0__Impl rule__Transition__Group_4_2__1 ;
    public final void rule__Transition__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1451:1: ( rule__Transition__Group_4_2__0__Impl rule__Transition__Group_4_2__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1452:2: rule__Transition__Group_4_2__0__Impl rule__Transition__Group_4_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4_2__0__Impl_in_rule__Transition__Group_4_2__02886);
            rule__Transition__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4_2__1_in_rule__Transition__Group_4_2__02889);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1459:1: rule__Transition__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__Transition__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1463:1: ( ( ',' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1464:1: ( ',' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1464:1: ( ',' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1465:1: ','
            {
             before(grammarAccess.getTransitionAccess().getCommaKeyword_4_2_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Transition__Group_4_2__0__Impl2917); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1478:1: rule__Transition__Group_4_2__1 : rule__Transition__Group_4_2__1__Impl ;
    public final void rule__Transition__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1482:1: ( rule__Transition__Group_4_2__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1483:2: rule__Transition__Group_4_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4_2__1__Impl_in_rule__Transition__Group_4_2__12948);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1489:1: rule__Transition__Group_4_2__1__Impl : ( ( rule__Transition__ElaboratesAssignment_4_2_1 ) ) ;
    public final void rule__Transition__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1493:1: ( ( ( rule__Transition__ElaboratesAssignment_4_2_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1494:1: ( ( rule__Transition__ElaboratesAssignment_4_2_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1494:1: ( ( rule__Transition__ElaboratesAssignment_4_2_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1495:1: ( rule__Transition__ElaboratesAssignment_4_2_1 )
            {
             before(grammarAccess.getTransitionAccess().getElaboratesAssignment_4_2_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1496:1: ( rule__Transition__ElaboratesAssignment_4_2_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1496:2: rule__Transition__ElaboratesAssignment_4_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__ElaboratesAssignment_4_2_1_in_rule__Transition__Group_4_2__1__Impl2975);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1510:1: rule__Transition__Group_5__0 : rule__Transition__Group_5__0__Impl rule__Transition__Group_5__1 ;
    public final void rule__Transition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1514:1: ( rule__Transition__Group_5__0__Impl rule__Transition__Group_5__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1515:2: rule__Transition__Group_5__0__Impl rule__Transition__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_5__0__Impl_in_rule__Transition__Group_5__03009);
            rule__Transition__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_5__1_in_rule__Transition__Group_5__03012);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1522:1: rule__Transition__Group_5__0__Impl : ( 'target' ) ;
    public final void rule__Transition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1526:1: ( ( 'target' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1527:1: ( 'target' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1527:1: ( 'target' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1528:1: 'target'
            {
             before(grammarAccess.getTransitionAccess().getTargetKeyword_5_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Transition__Group_5__0__Impl3040); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1541:1: rule__Transition__Group_5__1 : rule__Transition__Group_5__1__Impl ;
    public final void rule__Transition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1545:1: ( rule__Transition__Group_5__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1546:2: rule__Transition__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_5__1__Impl_in_rule__Transition__Group_5__13071);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1552:1: rule__Transition__Group_5__1__Impl : ( ( rule__Transition__TargetAssignment_5_1 ) ) ;
    public final void rule__Transition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1556:1: ( ( ( rule__Transition__TargetAssignment_5_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1557:1: ( ( rule__Transition__TargetAssignment_5_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1557:1: ( ( rule__Transition__TargetAssignment_5_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1558:1: ( rule__Transition__TargetAssignment_5_1 )
            {
             before(grammarAccess.getTransitionAccess().getTargetAssignment_5_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1559:1: ( rule__Transition__TargetAssignment_5_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1559:2: rule__Transition__TargetAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__TargetAssignment_5_1_in_rule__Transition__Group_5__1__Impl3098);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1573:1: rule__Transition__Group_6__0 : rule__Transition__Group_6__0__Impl rule__Transition__Group_6__1 ;
    public final void rule__Transition__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1577:1: ( rule__Transition__Group_6__0__Impl rule__Transition__Group_6__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1578:2: rule__Transition__Group_6__0__Impl rule__Transition__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_6__0__Impl_in_rule__Transition__Group_6__03132);
            rule__Transition__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_6__1_in_rule__Transition__Group_6__03135);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1585:1: rule__Transition__Group_6__0__Impl : ( 'source' ) ;
    public final void rule__Transition__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1589:1: ( ( 'source' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1590:1: ( 'source' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1590:1: ( 'source' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1591:1: 'source'
            {
             before(grammarAccess.getTransitionAccess().getSourceKeyword_6_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Transition__Group_6__0__Impl3163); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1604:1: rule__Transition__Group_6__1 : rule__Transition__Group_6__1__Impl ;
    public final void rule__Transition__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1608:1: ( rule__Transition__Group_6__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1609:2: rule__Transition__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_6__1__Impl_in_rule__Transition__Group_6__13194);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1615:1: rule__Transition__Group_6__1__Impl : ( ( rule__Transition__SourceAssignment_6_1 ) ) ;
    public final void rule__Transition__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1619:1: ( ( ( rule__Transition__SourceAssignment_6_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1620:1: ( ( rule__Transition__SourceAssignment_6_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1620:1: ( ( rule__Transition__SourceAssignment_6_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1621:1: ( rule__Transition__SourceAssignment_6_1 )
            {
             before(grammarAccess.getTransitionAccess().getSourceAssignment_6_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1622:1: ( rule__Transition__SourceAssignment_6_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1622:2: rule__Transition__SourceAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__SourceAssignment_6_1_in_rule__Transition__Group_6__1__Impl3221);
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


    // $ANTLR start "rule__State__Group__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1637:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1641:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1642:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__03256);
            rule__State__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group__1_in_rule__State__Group__03259);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1649:1: rule__State__Group__0__Impl : ( () ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1653:1: ( ( () ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1654:1: ( () )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1654:1: ( () )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1655:1: ()
            {
             before(grammarAccess.getStateAccess().getStateAction_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1656:1: ()
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1658:1: 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1668:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1672:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1673:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__13317);
            rule__State__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group__2_in_rule__State__Group__13320);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1680:1: rule__State__Group__1__Impl : ( 'State' ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1684:1: ( ( 'State' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1685:1: ( 'State' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1685:1: ( 'State' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1686:1: 'State'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_1()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__State__Group__1__Impl3348); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1699:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1703:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1704:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__23379);
            rule__State__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group__3_in_rule__State__Group__23382);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1711:1: rule__State__Group__2__Impl : ( ( rule__State__NameAssignment_2 ) ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1715:1: ( ( ( rule__State__NameAssignment_2 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1716:1: ( ( rule__State__NameAssignment_2 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1716:1: ( ( rule__State__NameAssignment_2 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1717:1: ( rule__State__NameAssignment_2 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1718:1: ( rule__State__NameAssignment_2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1718:2: rule__State__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__NameAssignment_2_in_rule__State__Group__2__Impl3409);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1728:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1732:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1733:2: rule__State__Group__3__Impl rule__State__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group__3__Impl_in_rule__State__Group__33439);
            rule__State__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group__4_in_rule__State__Group__33442);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1740:1: rule__State__Group__3__Impl : ( ( rule__State__Group_3__0 )? ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1744:1: ( ( ( rule__State__Group_3__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1745:1: ( ( rule__State__Group_3__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1745:1: ( ( rule__State__Group_3__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1746:1: ( rule__State__Group_3__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_3()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1747:1: ( rule__State__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1747:2: rule__State__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__State__Group_3__0_in_rule__State__Group__3__Impl3469);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1757:1: rule__State__Group__4 : rule__State__Group__4__Impl ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1761:1: ( rule__State__Group__4__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1762:2: rule__State__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group__4__Impl_in_rule__State__Group__43500);
            rule__State__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1768:1: rule__State__Group__4__Impl : ( ( rule__State__Group_4__0 )? ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1772:1: ( ( ( rule__State__Group_4__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1773:1: ( ( rule__State__Group_4__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1773:1: ( ( rule__State__Group_4__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1774:1: ( rule__State__Group_4__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_4()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1775:1: ( rule__State__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1775:2: rule__State__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__State__Group_4__0_in_rule__State__Group__4__Impl3527);
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


    // $ANTLR start "rule__State__Group_3__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1795:1: rule__State__Group_3__0 : rule__State__Group_3__0__Impl rule__State__Group_3__1 ;
    public final void rule__State__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1799:1: ( rule__State__Group_3__0__Impl rule__State__Group_3__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1800:2: rule__State__Group_3__0__Impl rule__State__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_3__0__Impl_in_rule__State__Group_3__03568);
            rule__State__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_3__1_in_rule__State__Group_3__03571);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1807:1: rule__State__Group_3__0__Impl : ( 'statemachines' ) ;
    public final void rule__State__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1811:1: ( ( 'statemachines' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1812:1: ( 'statemachines' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1812:1: ( 'statemachines' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1813:1: 'statemachines'
            {
             before(grammarAccess.getStateAccess().getStatemachinesKeyword_3_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__State__Group_3__0__Impl3599); 
             after(grammarAccess.getStateAccess().getStatemachinesKeyword_3_0()); 

            }


            }

        }
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1826:1: rule__State__Group_3__1 : rule__State__Group_3__1__Impl rule__State__Group_3__2 ;
    public final void rule__State__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1830:1: ( rule__State__Group_3__1__Impl rule__State__Group_3__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1831:2: rule__State__Group_3__1__Impl rule__State__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_3__1__Impl_in_rule__State__Group_3__13630);
            rule__State__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_3__2_in_rule__State__Group_3__13633);
            rule__State__Group_3__2();

            state._fsp--;


            }

        }
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1838:1: rule__State__Group_3__1__Impl : ( '{' ) ;
    public final void rule__State__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1842:1: ( ( '{' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1843:1: ( '{' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1843:1: ( '{' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1844:1: '{'
            {
             before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__State__Group_3__1__Impl3661); 
             after(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__State__Group_3__2"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1857:1: rule__State__Group_3__2 : rule__State__Group_3__2__Impl rule__State__Group_3__3 ;
    public final void rule__State__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1861:1: ( rule__State__Group_3__2__Impl rule__State__Group_3__3 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1862:2: rule__State__Group_3__2__Impl rule__State__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_3__2__Impl_in_rule__State__Group_3__23692);
            rule__State__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_3__3_in_rule__State__Group_3__23695);
            rule__State__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3__2"


    // $ANTLR start "rule__State__Group_3__2__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1869:1: rule__State__Group_3__2__Impl : ( ( rule__State__StatemachinesAssignment_3_2 ) ) ;
    public final void rule__State__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1873:1: ( ( ( rule__State__StatemachinesAssignment_3_2 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1874:1: ( ( rule__State__StatemachinesAssignment_3_2 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1874:1: ( ( rule__State__StatemachinesAssignment_3_2 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1875:1: ( rule__State__StatemachinesAssignment_3_2 )
            {
             before(grammarAccess.getStateAccess().getStatemachinesAssignment_3_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1876:1: ( rule__State__StatemachinesAssignment_3_2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1876:2: rule__State__StatemachinesAssignment_3_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__StatemachinesAssignment_3_2_in_rule__State__Group_3__2__Impl3722);
            rule__State__StatemachinesAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getStatemachinesAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3__2__Impl"


    // $ANTLR start "rule__State__Group_3__3"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1886:1: rule__State__Group_3__3 : rule__State__Group_3__3__Impl rule__State__Group_3__4 ;
    public final void rule__State__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1890:1: ( rule__State__Group_3__3__Impl rule__State__Group_3__4 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1891:2: rule__State__Group_3__3__Impl rule__State__Group_3__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_3__3__Impl_in_rule__State__Group_3__33752);
            rule__State__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_3__4_in_rule__State__Group_3__33755);
            rule__State__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3__3"


    // $ANTLR start "rule__State__Group_3__3__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1898:1: rule__State__Group_3__3__Impl : ( ( rule__State__Group_3_3__0 )* ) ;
    public final void rule__State__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1902:1: ( ( ( rule__State__Group_3_3__0 )* ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1903:1: ( ( rule__State__Group_3_3__0 )* )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1903:1: ( ( rule__State__Group_3_3__0 )* )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1904:1: ( rule__State__Group_3_3__0 )*
            {
             before(grammarAccess.getStateAccess().getGroup_3_3()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1905:1: ( rule__State__Group_3_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==15) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1905:2: rule__State__Group_3_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__State__Group_3_3__0_in_rule__State__Group_3__3__Impl3782);
            	    rule__State__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3__3__Impl"


    // $ANTLR start "rule__State__Group_3__4"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1915:1: rule__State__Group_3__4 : rule__State__Group_3__4__Impl ;
    public final void rule__State__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1919:1: ( rule__State__Group_3__4__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1920:2: rule__State__Group_3__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_3__4__Impl_in_rule__State__Group_3__43813);
            rule__State__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3__4"


    // $ANTLR start "rule__State__Group_3__4__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1926:1: rule__State__Group_3__4__Impl : ( '}' ) ;
    public final void rule__State__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1930:1: ( ( '}' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1931:1: ( '}' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1931:1: ( '}' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1932:1: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__State__Group_3__4__Impl3841); 
             after(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3__4__Impl"


    // $ANTLR start "rule__State__Group_3_3__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1955:1: rule__State__Group_3_3__0 : rule__State__Group_3_3__0__Impl rule__State__Group_3_3__1 ;
    public final void rule__State__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1959:1: ( rule__State__Group_3_3__0__Impl rule__State__Group_3_3__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1960:2: rule__State__Group_3_3__0__Impl rule__State__Group_3_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_3_3__0__Impl_in_rule__State__Group_3_3__03882);
            rule__State__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_3_3__1_in_rule__State__Group_3_3__03885);
            rule__State__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3_3__0"


    // $ANTLR start "rule__State__Group_3_3__0__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1967:1: rule__State__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__State__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1971:1: ( ( ',' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1972:1: ( ',' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1972:1: ( ',' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1973:1: ','
            {
             before(grammarAccess.getStateAccess().getCommaKeyword_3_3_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__State__Group_3_3__0__Impl3913); 
             after(grammarAccess.getStateAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3_3__0__Impl"


    // $ANTLR start "rule__State__Group_3_3__1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1986:1: rule__State__Group_3_3__1 : rule__State__Group_3_3__1__Impl ;
    public final void rule__State__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1990:1: ( rule__State__Group_3_3__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1991:2: rule__State__Group_3_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_3_3__1__Impl_in_rule__State__Group_3_3__13944);
            rule__State__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3_3__1"


    // $ANTLR start "rule__State__Group_3_3__1__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1997:1: rule__State__Group_3_3__1__Impl : ( ( rule__State__StatemachinesAssignment_3_3_1 ) ) ;
    public final void rule__State__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2001:1: ( ( ( rule__State__StatemachinesAssignment_3_3_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2002:1: ( ( rule__State__StatemachinesAssignment_3_3_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2002:1: ( ( rule__State__StatemachinesAssignment_3_3_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2003:1: ( rule__State__StatemachinesAssignment_3_3_1 )
            {
             before(grammarAccess.getStateAccess().getStatemachinesAssignment_3_3_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2004:1: ( rule__State__StatemachinesAssignment_3_3_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2004:2: rule__State__StatemachinesAssignment_3_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__StatemachinesAssignment_3_3_1_in_rule__State__Group_3_3__1__Impl3971);
            rule__State__StatemachinesAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getStatemachinesAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3_3__1__Impl"


    // $ANTLR start "rule__State__Group_4__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2018:1: rule__State__Group_4__0 : rule__State__Group_4__0__Impl rule__State__Group_4__1 ;
    public final void rule__State__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2022:1: ( rule__State__Group_4__0__Impl rule__State__Group_4__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2023:2: rule__State__Group_4__0__Impl rule__State__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_4__0__Impl_in_rule__State__Group_4__04005);
            rule__State__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_4__1_in_rule__State__Group_4__04008);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2030:1: rule__State__Group_4__0__Impl : ( 'invariants' ) ;
    public final void rule__State__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2034:1: ( ( 'invariants' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2035:1: ( 'invariants' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2035:1: ( 'invariants' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2036:1: 'invariants'
            {
             before(grammarAccess.getStateAccess().getInvariantsKeyword_4_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__State__Group_4__0__Impl4036); 
             after(grammarAccess.getStateAccess().getInvariantsKeyword_4_0()); 

            }


            }

        }
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2049:1: rule__State__Group_4__1 : rule__State__Group_4__1__Impl rule__State__Group_4__2 ;
    public final void rule__State__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2053:1: ( rule__State__Group_4__1__Impl rule__State__Group_4__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2054:2: rule__State__Group_4__1__Impl rule__State__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_4__1__Impl_in_rule__State__Group_4__14067);
            rule__State__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_4__2_in_rule__State__Group_4__14070);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2061:1: rule__State__Group_4__1__Impl : ( '{' ) ;
    public final void rule__State__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2065:1: ( ( '{' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2066:1: ( '{' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2066:1: ( '{' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2067:1: '{'
            {
             before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__State__Group_4__1__Impl4098); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2080:1: rule__State__Group_4__2 : rule__State__Group_4__2__Impl rule__State__Group_4__3 ;
    public final void rule__State__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2084:1: ( rule__State__Group_4__2__Impl rule__State__Group_4__3 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2085:2: rule__State__Group_4__2__Impl rule__State__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_4__2__Impl_in_rule__State__Group_4__24129);
            rule__State__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_4__3_in_rule__State__Group_4__24132);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2092:1: rule__State__Group_4__2__Impl : ( ( rule__State__InvariantsAssignment_4_2 ) ) ;
    public final void rule__State__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2096:1: ( ( ( rule__State__InvariantsAssignment_4_2 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2097:1: ( ( rule__State__InvariantsAssignment_4_2 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2097:1: ( ( rule__State__InvariantsAssignment_4_2 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2098:1: ( rule__State__InvariantsAssignment_4_2 )
            {
             before(grammarAccess.getStateAccess().getInvariantsAssignment_4_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2099:1: ( rule__State__InvariantsAssignment_4_2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2099:2: rule__State__InvariantsAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__InvariantsAssignment_4_2_in_rule__State__Group_4__2__Impl4159);
            rule__State__InvariantsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getInvariantsAssignment_4_2()); 

            }


            }

        }
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2109:1: rule__State__Group_4__3 : rule__State__Group_4__3__Impl rule__State__Group_4__4 ;
    public final void rule__State__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2113:1: ( rule__State__Group_4__3__Impl rule__State__Group_4__4 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2114:2: rule__State__Group_4__3__Impl rule__State__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_4__3__Impl_in_rule__State__Group_4__34189);
            rule__State__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_4__4_in_rule__State__Group_4__34192);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2121:1: rule__State__Group_4__3__Impl : ( ( rule__State__Group_4_3__0 )* ) ;
    public final void rule__State__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2125:1: ( ( ( rule__State__Group_4_3__0 )* ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2126:1: ( ( rule__State__Group_4_3__0 )* )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2126:1: ( ( rule__State__Group_4_3__0 )* )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2127:1: ( rule__State__Group_4_3__0 )*
            {
             before(grammarAccess.getStateAccess().getGroup_4_3()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2128:1: ( rule__State__Group_4_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==15) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2128:2: rule__State__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__State__Group_4_3__0_in_rule__State__Group_4__3__Impl4219);
            	    rule__State__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2138:1: rule__State__Group_4__4 : rule__State__Group_4__4__Impl ;
    public final void rule__State__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2142:1: ( rule__State__Group_4__4__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2143:2: rule__State__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_4__4__Impl_in_rule__State__Group_4__44250);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2149:1: rule__State__Group_4__4__Impl : ( '}' ) ;
    public final void rule__State__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2153:1: ( ( '}' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2154:1: ( '}' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2154:1: ( '}' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2155:1: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__State__Group_4__4__Impl4278); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2178:1: rule__State__Group_4_3__0 : rule__State__Group_4_3__0__Impl rule__State__Group_4_3__1 ;
    public final void rule__State__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2182:1: ( rule__State__Group_4_3__0__Impl rule__State__Group_4_3__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2183:2: rule__State__Group_4_3__0__Impl rule__State__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_4_3__0__Impl_in_rule__State__Group_4_3__04319);
            rule__State__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_4_3__1_in_rule__State__Group_4_3__04322);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2190:1: rule__State__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__State__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2194:1: ( ( ',' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2195:1: ( ',' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2195:1: ( ',' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2196:1: ','
            {
             before(grammarAccess.getStateAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__State__Group_4_3__0__Impl4350); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2209:1: rule__State__Group_4_3__1 : rule__State__Group_4_3__1__Impl ;
    public final void rule__State__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2213:1: ( rule__State__Group_4_3__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2214:2: rule__State__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_4_3__1__Impl_in_rule__State__Group_4_3__14381);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2220:1: rule__State__Group_4_3__1__Impl : ( ( rule__State__InvariantsAssignment_4_3_1 ) ) ;
    public final void rule__State__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2224:1: ( ( ( rule__State__InvariantsAssignment_4_3_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2225:1: ( ( rule__State__InvariantsAssignment_4_3_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2225:1: ( ( rule__State__InvariantsAssignment_4_3_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2226:1: ( rule__State__InvariantsAssignment_4_3_1 )
            {
             before(grammarAccess.getStateAccess().getInvariantsAssignment_4_3_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2227:1: ( rule__State__InvariantsAssignment_4_3_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2227:2: rule__State__InvariantsAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__InvariantsAssignment_4_3_1_in_rule__State__Group_4_3__1__Impl4408);
            rule__State__InvariantsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getInvariantsAssignment_4_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Initial__Group__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2241:1: rule__Initial__Group__0 : rule__Initial__Group__0__Impl rule__Initial__Group__1 ;
    public final void rule__Initial__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2245:1: ( rule__Initial__Group__0__Impl rule__Initial__Group__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2246:2: rule__Initial__Group__0__Impl rule__Initial__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Initial__Group__0__Impl_in_rule__Initial__Group__04442);
            rule__Initial__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Initial__Group__1_in_rule__Initial__Group__04445);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2253:1: rule__Initial__Group__0__Impl : ( () ) ;
    public final void rule__Initial__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2257:1: ( ( () ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2258:1: ( () )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2258:1: ( () )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2259:1: ()
            {
             before(grammarAccess.getInitialAccess().getInitialAction_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2260:1: ()
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2262:1: 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2272:1: rule__Initial__Group__1 : rule__Initial__Group__1__Impl rule__Initial__Group__2 ;
    public final void rule__Initial__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2276:1: ( rule__Initial__Group__1__Impl rule__Initial__Group__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2277:2: rule__Initial__Group__1__Impl rule__Initial__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Initial__Group__1__Impl_in_rule__Initial__Group__14503);
            rule__Initial__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Initial__Group__2_in_rule__Initial__Group__14506);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2284:1: rule__Initial__Group__1__Impl : ( 'Initial' ) ;
    public final void rule__Initial__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2288:1: ( ( 'Initial' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2289:1: ( 'Initial' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2289:1: ( 'Initial' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2290:1: 'Initial'
            {
             before(grammarAccess.getInitialAccess().getInitialKeyword_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Initial__Group__1__Impl4534); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2303:1: rule__Initial__Group__2 : rule__Initial__Group__2__Impl ;
    public final void rule__Initial__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2307:1: ( rule__Initial__Group__2__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2308:2: rule__Initial__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Initial__Group__2__Impl_in_rule__Initial__Group__24565);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2314:1: rule__Initial__Group__2__Impl : ( ( rule__Initial__Group_2__0 )? ) ;
    public final void rule__Initial__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2318:1: ( ( ( rule__Initial__Group_2__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2319:1: ( ( rule__Initial__Group_2__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2319:1: ( ( rule__Initial__Group_2__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2320:1: ( rule__Initial__Group_2__0 )?
            {
             before(grammarAccess.getInitialAccess().getGroup_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2321:1: ( rule__Initial__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2321:2: rule__Initial__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Initial__Group_2__0_in_rule__Initial__Group__2__Impl4592);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2337:1: rule__Initial__Group_2__0 : rule__Initial__Group_2__0__Impl rule__Initial__Group_2__1 ;
    public final void rule__Initial__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2341:1: ( rule__Initial__Group_2__0__Impl rule__Initial__Group_2__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2342:2: rule__Initial__Group_2__0__Impl rule__Initial__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Initial__Group_2__0__Impl_in_rule__Initial__Group_2__04629);
            rule__Initial__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Initial__Group_2__1_in_rule__Initial__Group_2__04632);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2349:1: rule__Initial__Group_2__0__Impl : ( 'internalId' ) ;
    public final void rule__Initial__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2353:1: ( ( 'internalId' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2354:1: ( 'internalId' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2354:1: ( 'internalId' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2355:1: 'internalId'
            {
             before(grammarAccess.getInitialAccess().getInternalIdKeyword_2_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Initial__Group_2__0__Impl4660); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2368:1: rule__Initial__Group_2__1 : rule__Initial__Group_2__1__Impl ;
    public final void rule__Initial__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2372:1: ( rule__Initial__Group_2__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2373:2: rule__Initial__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Initial__Group_2__1__Impl_in_rule__Initial__Group_2__14691);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2379:1: rule__Initial__Group_2__1__Impl : ( ( rule__Initial__InternalIdAssignment_2_1 ) ) ;
    public final void rule__Initial__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2383:1: ( ( ( rule__Initial__InternalIdAssignment_2_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2384:1: ( ( rule__Initial__InternalIdAssignment_2_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2384:1: ( ( rule__Initial__InternalIdAssignment_2_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2385:1: ( rule__Initial__InternalIdAssignment_2_1 )
            {
             before(grammarAccess.getInitialAccess().getInternalIdAssignment_2_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2386:1: ( rule__Initial__InternalIdAssignment_2_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2386:2: rule__Initial__InternalIdAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Initial__InternalIdAssignment_2_1_in_rule__Initial__Group_2__1__Impl4718);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2400:1: rule__Final__Group__0 : rule__Final__Group__0__Impl rule__Final__Group__1 ;
    public final void rule__Final__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2404:1: ( rule__Final__Group__0__Impl rule__Final__Group__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2405:2: rule__Final__Group__0__Impl rule__Final__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Final__Group__0__Impl_in_rule__Final__Group__04752);
            rule__Final__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Final__Group__1_in_rule__Final__Group__04755);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2412:1: rule__Final__Group__0__Impl : ( () ) ;
    public final void rule__Final__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2416:1: ( ( () ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2417:1: ( () )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2417:1: ( () )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2418:1: ()
            {
             before(grammarAccess.getFinalAccess().getFinalAction_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2419:1: ()
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2421:1: 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2431:1: rule__Final__Group__1 : rule__Final__Group__1__Impl rule__Final__Group__2 ;
    public final void rule__Final__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2435:1: ( rule__Final__Group__1__Impl rule__Final__Group__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2436:2: rule__Final__Group__1__Impl rule__Final__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Final__Group__1__Impl_in_rule__Final__Group__14813);
            rule__Final__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Final__Group__2_in_rule__Final__Group__14816);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2443:1: rule__Final__Group__1__Impl : ( 'Final' ) ;
    public final void rule__Final__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2447:1: ( ( 'Final' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2448:1: ( 'Final' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2448:1: ( 'Final' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2449:1: 'Final'
            {
             before(grammarAccess.getFinalAccess().getFinalKeyword_1()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Final__Group__1__Impl4844); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2462:1: rule__Final__Group__2 : rule__Final__Group__2__Impl ;
    public final void rule__Final__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2466:1: ( rule__Final__Group__2__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2467:2: rule__Final__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Final__Group__2__Impl_in_rule__Final__Group__24875);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2473:1: rule__Final__Group__2__Impl : ( ( rule__Final__Group_2__0 )? ) ;
    public final void rule__Final__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2477:1: ( ( ( rule__Final__Group_2__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2478:1: ( ( rule__Final__Group_2__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2478:1: ( ( rule__Final__Group_2__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2479:1: ( rule__Final__Group_2__0 )?
            {
             before(grammarAccess.getFinalAccess().getGroup_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2480:1: ( rule__Final__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==27) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2480:2: rule__Final__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Final__Group_2__0_in_rule__Final__Group__2__Impl4902);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2496:1: rule__Final__Group_2__0 : rule__Final__Group_2__0__Impl rule__Final__Group_2__1 ;
    public final void rule__Final__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2500:1: ( rule__Final__Group_2__0__Impl rule__Final__Group_2__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2501:2: rule__Final__Group_2__0__Impl rule__Final__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Final__Group_2__0__Impl_in_rule__Final__Group_2__04939);
            rule__Final__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Final__Group_2__1_in_rule__Final__Group_2__04942);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2508:1: rule__Final__Group_2__0__Impl : ( 'internalId' ) ;
    public final void rule__Final__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2512:1: ( ( 'internalId' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2513:1: ( 'internalId' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2513:1: ( 'internalId' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2514:1: 'internalId'
            {
             before(grammarAccess.getFinalAccess().getInternalIdKeyword_2_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Final__Group_2__0__Impl4970); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2527:1: rule__Final__Group_2__1 : rule__Final__Group_2__1__Impl ;
    public final void rule__Final__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2531:1: ( rule__Final__Group_2__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2532:2: rule__Final__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Final__Group_2__1__Impl_in_rule__Final__Group_2__15001);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2538:1: rule__Final__Group_2__1__Impl : ( ( rule__Final__InternalIdAssignment_2_1 ) ) ;
    public final void rule__Final__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2542:1: ( ( ( rule__Final__InternalIdAssignment_2_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2543:1: ( ( rule__Final__InternalIdAssignment_2_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2543:1: ( ( rule__Final__InternalIdAssignment_2_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2544:1: ( rule__Final__InternalIdAssignment_2_1 )
            {
             before(grammarAccess.getFinalAccess().getInternalIdAssignment_2_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2545:1: ( rule__Final__InternalIdAssignment_2_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2545:2: rule__Final__InternalIdAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Final__InternalIdAssignment_2_1_in_rule__Final__Group_2__1__Impl5028);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2559:1: rule__Any__Group__0 : rule__Any__Group__0__Impl rule__Any__Group__1 ;
    public final void rule__Any__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2563:1: ( rule__Any__Group__0__Impl rule__Any__Group__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2564:2: rule__Any__Group__0__Impl rule__Any__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Any__Group__0__Impl_in_rule__Any__Group__05062);
            rule__Any__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Any__Group__1_in_rule__Any__Group__05065);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2571:1: rule__Any__Group__0__Impl : ( () ) ;
    public final void rule__Any__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2575:1: ( ( () ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2576:1: ( () )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2576:1: ( () )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2577:1: ()
            {
             before(grammarAccess.getAnyAccess().getAnyAction_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2578:1: ()
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2580:1: 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2590:1: rule__Any__Group__1 : rule__Any__Group__1__Impl rule__Any__Group__2 ;
    public final void rule__Any__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2594:1: ( rule__Any__Group__1__Impl rule__Any__Group__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2595:2: rule__Any__Group__1__Impl rule__Any__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Any__Group__1__Impl_in_rule__Any__Group__15123);
            rule__Any__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Any__Group__2_in_rule__Any__Group__15126);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2602:1: rule__Any__Group__1__Impl : ( 'Any' ) ;
    public final void rule__Any__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2606:1: ( ( 'Any' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2607:1: ( 'Any' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2607:1: ( 'Any' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2608:1: 'Any'
            {
             before(grammarAccess.getAnyAccess().getAnyKeyword_1()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Any__Group__1__Impl5154); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2621:1: rule__Any__Group__2 : rule__Any__Group__2__Impl ;
    public final void rule__Any__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2625:1: ( rule__Any__Group__2__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2626:2: rule__Any__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Any__Group__2__Impl_in_rule__Any__Group__25185);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2632:1: rule__Any__Group__2__Impl : ( ( rule__Any__Group_2__0 )? ) ;
    public final void rule__Any__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2636:1: ( ( ( rule__Any__Group_2__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2637:1: ( ( rule__Any__Group_2__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2637:1: ( ( rule__Any__Group_2__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2638:1: ( rule__Any__Group_2__0 )?
            {
             before(grammarAccess.getAnyAccess().getGroup_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2639:1: ( rule__Any__Group_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==27) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2639:2: rule__Any__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Any__Group_2__0_in_rule__Any__Group__2__Impl5212);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2655:1: rule__Any__Group_2__0 : rule__Any__Group_2__0__Impl rule__Any__Group_2__1 ;
    public final void rule__Any__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2659:1: ( rule__Any__Group_2__0__Impl rule__Any__Group_2__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2660:2: rule__Any__Group_2__0__Impl rule__Any__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Any__Group_2__0__Impl_in_rule__Any__Group_2__05249);
            rule__Any__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Any__Group_2__1_in_rule__Any__Group_2__05252);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2667:1: rule__Any__Group_2__0__Impl : ( 'internalId' ) ;
    public final void rule__Any__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2671:1: ( ( 'internalId' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2672:1: ( 'internalId' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2672:1: ( 'internalId' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2673:1: 'internalId'
            {
             before(grammarAccess.getAnyAccess().getInternalIdKeyword_2_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Any__Group_2__0__Impl5280); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2686:1: rule__Any__Group_2__1 : rule__Any__Group_2__1__Impl ;
    public final void rule__Any__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2690:1: ( rule__Any__Group_2__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2691:2: rule__Any__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Any__Group_2__1__Impl_in_rule__Any__Group_2__15311);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2697:1: rule__Any__Group_2__1__Impl : ( ( rule__Any__InternalIdAssignment_2_1 ) ) ;
    public final void rule__Any__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2701:1: ( ( ( rule__Any__InternalIdAssignment_2_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2702:1: ( ( rule__Any__InternalIdAssignment_2_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2702:1: ( ( rule__Any__InternalIdAssignment_2_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2703:1: ( rule__Any__InternalIdAssignment_2_1 )
            {
             before(grammarAccess.getAnyAccess().getInternalIdAssignment_2_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2704:1: ( rule__Any__InternalIdAssignment_2_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2704:2: rule__Any__InternalIdAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Any__InternalIdAssignment_2_1_in_rule__Any__Group_2__1__Impl5338);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2718:1: rule__Junction__Group__0 : rule__Junction__Group__0__Impl rule__Junction__Group__1 ;
    public final void rule__Junction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2722:1: ( rule__Junction__Group__0__Impl rule__Junction__Group__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2723:2: rule__Junction__Group__0__Impl rule__Junction__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Junction__Group__0__Impl_in_rule__Junction__Group__05372);
            rule__Junction__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Junction__Group__1_in_rule__Junction__Group__05375);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2730:1: rule__Junction__Group__0__Impl : ( () ) ;
    public final void rule__Junction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2734:1: ( ( () ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2735:1: ( () )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2735:1: ( () )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2736:1: ()
            {
             before(grammarAccess.getJunctionAccess().getJunctionAction_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2737:1: ()
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2739:1: 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2749:1: rule__Junction__Group__1 : rule__Junction__Group__1__Impl rule__Junction__Group__2 ;
    public final void rule__Junction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2753:1: ( rule__Junction__Group__1__Impl rule__Junction__Group__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2754:2: rule__Junction__Group__1__Impl rule__Junction__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Junction__Group__1__Impl_in_rule__Junction__Group__15433);
            rule__Junction__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Junction__Group__2_in_rule__Junction__Group__15436);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2761:1: rule__Junction__Group__1__Impl : ( 'Junction' ) ;
    public final void rule__Junction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2765:1: ( ( 'Junction' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2766:1: ( 'Junction' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2766:1: ( 'Junction' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2767:1: 'Junction'
            {
             before(grammarAccess.getJunctionAccess().getJunctionKeyword_1()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Junction__Group__1__Impl5464); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2780:1: rule__Junction__Group__2 : rule__Junction__Group__2__Impl ;
    public final void rule__Junction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2784:1: ( rule__Junction__Group__2__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2785:2: rule__Junction__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Junction__Group__2__Impl_in_rule__Junction__Group__25495);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2791:1: rule__Junction__Group__2__Impl : ( ( rule__Junction__Group_2__0 )? ) ;
    public final void rule__Junction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2795:1: ( ( ( rule__Junction__Group_2__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2796:1: ( ( rule__Junction__Group_2__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2796:1: ( ( rule__Junction__Group_2__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2797:1: ( rule__Junction__Group_2__0 )?
            {
             before(grammarAccess.getJunctionAccess().getGroup_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2798:1: ( rule__Junction__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==27) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2798:2: rule__Junction__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Junction__Group_2__0_in_rule__Junction__Group__2__Impl5522);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2814:1: rule__Junction__Group_2__0 : rule__Junction__Group_2__0__Impl rule__Junction__Group_2__1 ;
    public final void rule__Junction__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2818:1: ( rule__Junction__Group_2__0__Impl rule__Junction__Group_2__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2819:2: rule__Junction__Group_2__0__Impl rule__Junction__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Junction__Group_2__0__Impl_in_rule__Junction__Group_2__05559);
            rule__Junction__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Junction__Group_2__1_in_rule__Junction__Group_2__05562);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2826:1: rule__Junction__Group_2__0__Impl : ( 'internalId' ) ;
    public final void rule__Junction__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2830:1: ( ( 'internalId' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2831:1: ( 'internalId' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2831:1: ( 'internalId' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2832:1: 'internalId'
            {
             before(grammarAccess.getJunctionAccess().getInternalIdKeyword_2_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Junction__Group_2__0__Impl5590); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2845:1: rule__Junction__Group_2__1 : rule__Junction__Group_2__1__Impl ;
    public final void rule__Junction__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2849:1: ( rule__Junction__Group_2__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2850:2: rule__Junction__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Junction__Group_2__1__Impl_in_rule__Junction__Group_2__15621);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2856:1: rule__Junction__Group_2__1__Impl : ( ( rule__Junction__InternalIdAssignment_2_1 ) ) ;
    public final void rule__Junction__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2860:1: ( ( ( rule__Junction__InternalIdAssignment_2_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2861:1: ( ( rule__Junction__InternalIdAssignment_2_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2861:1: ( ( rule__Junction__InternalIdAssignment_2_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2862:1: ( rule__Junction__InternalIdAssignment_2_1 )
            {
             before(grammarAccess.getJunctionAccess().getInternalIdAssignment_2_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2863:1: ( rule__Junction__InternalIdAssignment_2_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2863:2: rule__Junction__InternalIdAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Junction__InternalIdAssignment_2_1_in_rule__Junction__Group_2__1__Impl5648);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2877:1: rule__Fork__Group__0 : rule__Fork__Group__0__Impl rule__Fork__Group__1 ;
    public final void rule__Fork__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2881:1: ( rule__Fork__Group__0__Impl rule__Fork__Group__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2882:2: rule__Fork__Group__0__Impl rule__Fork__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fork__Group__0__Impl_in_rule__Fork__Group__05682);
            rule__Fork__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fork__Group__1_in_rule__Fork__Group__05685);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2889:1: rule__Fork__Group__0__Impl : ( () ) ;
    public final void rule__Fork__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2893:1: ( ( () ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2894:1: ( () )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2894:1: ( () )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2895:1: ()
            {
             before(grammarAccess.getForkAccess().getForkAction_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2896:1: ()
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2898:1: 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2908:1: rule__Fork__Group__1 : rule__Fork__Group__1__Impl rule__Fork__Group__2 ;
    public final void rule__Fork__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2912:1: ( rule__Fork__Group__1__Impl rule__Fork__Group__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2913:2: rule__Fork__Group__1__Impl rule__Fork__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fork__Group__1__Impl_in_rule__Fork__Group__15743);
            rule__Fork__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fork__Group__2_in_rule__Fork__Group__15746);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2920:1: rule__Fork__Group__1__Impl : ( 'Fork' ) ;
    public final void rule__Fork__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2924:1: ( ( 'Fork' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2925:1: ( 'Fork' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2925:1: ( 'Fork' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2926:1: 'Fork'
            {
             before(grammarAccess.getForkAccess().getForkKeyword_1()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Fork__Group__1__Impl5774); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2939:1: rule__Fork__Group__2 : rule__Fork__Group__2__Impl ;
    public final void rule__Fork__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2943:1: ( rule__Fork__Group__2__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2944:2: rule__Fork__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fork__Group__2__Impl_in_rule__Fork__Group__25805);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2950:1: rule__Fork__Group__2__Impl : ( ( rule__Fork__Group_2__0 )? ) ;
    public final void rule__Fork__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2954:1: ( ( ( rule__Fork__Group_2__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2955:1: ( ( rule__Fork__Group_2__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2955:1: ( ( rule__Fork__Group_2__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2956:1: ( rule__Fork__Group_2__0 )?
            {
             before(grammarAccess.getForkAccess().getGroup_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2957:1: ( rule__Fork__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==27) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2957:2: rule__Fork__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Fork__Group_2__0_in_rule__Fork__Group__2__Impl5832);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2973:1: rule__Fork__Group_2__0 : rule__Fork__Group_2__0__Impl rule__Fork__Group_2__1 ;
    public final void rule__Fork__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2977:1: ( rule__Fork__Group_2__0__Impl rule__Fork__Group_2__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2978:2: rule__Fork__Group_2__0__Impl rule__Fork__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fork__Group_2__0__Impl_in_rule__Fork__Group_2__05869);
            rule__Fork__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fork__Group_2__1_in_rule__Fork__Group_2__05872);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2985:1: rule__Fork__Group_2__0__Impl : ( 'internalId' ) ;
    public final void rule__Fork__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2989:1: ( ( 'internalId' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2990:1: ( 'internalId' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2990:1: ( 'internalId' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2991:1: 'internalId'
            {
             before(grammarAccess.getForkAccess().getInternalIdKeyword_2_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Fork__Group_2__0__Impl5900); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3004:1: rule__Fork__Group_2__1 : rule__Fork__Group_2__1__Impl ;
    public final void rule__Fork__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3008:1: ( rule__Fork__Group_2__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3009:2: rule__Fork__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fork__Group_2__1__Impl_in_rule__Fork__Group_2__15931);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3015:1: rule__Fork__Group_2__1__Impl : ( ( rule__Fork__InternalIdAssignment_2_1 ) ) ;
    public final void rule__Fork__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3019:1: ( ( ( rule__Fork__InternalIdAssignment_2_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3020:1: ( ( rule__Fork__InternalIdAssignment_2_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3020:1: ( ( rule__Fork__InternalIdAssignment_2_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3021:1: ( rule__Fork__InternalIdAssignment_2_1 )
            {
             before(grammarAccess.getForkAccess().getInternalIdAssignment_2_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3022:1: ( rule__Fork__InternalIdAssignment_2_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3022:2: rule__Fork__InternalIdAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fork__InternalIdAssignment_2_1_in_rule__Fork__Group_2__1__Impl5958);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3036:1: rule__Invariant__Group__0 : rule__Invariant__Group__0__Impl rule__Invariant__Group__1 ;
    public final void rule__Invariant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3040:1: ( rule__Invariant__Group__0__Impl rule__Invariant__Group__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3041:2: rule__Invariant__Group__0__Impl rule__Invariant__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__0__Impl_in_rule__Invariant__Group__05992);
            rule__Invariant__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__1_in_rule__Invariant__Group__05995);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3048:1: rule__Invariant__Group__0__Impl : ( 'Invariant' ) ;
    public final void rule__Invariant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3052:1: ( ( 'Invariant' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3053:1: ( 'Invariant' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3053:1: ( 'Invariant' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3054:1: 'Invariant'
            {
             before(grammarAccess.getInvariantAccess().getInvariantKeyword_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Invariant__Group__0__Impl6023); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3067:1: rule__Invariant__Group__1 : rule__Invariant__Group__1__Impl rule__Invariant__Group__2 ;
    public final void rule__Invariant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3071:1: ( rule__Invariant__Group__1__Impl rule__Invariant__Group__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3072:2: rule__Invariant__Group__1__Impl rule__Invariant__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__1__Impl_in_rule__Invariant__Group__16054);
            rule__Invariant__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__2_in_rule__Invariant__Group__16057);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3079:1: rule__Invariant__Group__1__Impl : ( '@' ) ;
    public final void rule__Invariant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3083:1: ( ( '@' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3084:1: ( '@' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3084:1: ( '@' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3085:1: '@'
            {
             before(grammarAccess.getInvariantAccess().getCommercialAtKeyword_1()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Invariant__Group__1__Impl6085); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3098:1: rule__Invariant__Group__2 : rule__Invariant__Group__2__Impl rule__Invariant__Group__3 ;
    public final void rule__Invariant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3102:1: ( rule__Invariant__Group__2__Impl rule__Invariant__Group__3 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3103:2: rule__Invariant__Group__2__Impl rule__Invariant__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__2__Impl_in_rule__Invariant__Group__26116);
            rule__Invariant__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__3_in_rule__Invariant__Group__26119);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3110:1: rule__Invariant__Group__2__Impl : ( ( rule__Invariant__NameAssignment_2 ) ) ;
    public final void rule__Invariant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3114:1: ( ( ( rule__Invariant__NameAssignment_2 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3115:1: ( ( rule__Invariant__NameAssignment_2 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3115:1: ( ( rule__Invariant__NameAssignment_2 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3116:1: ( rule__Invariant__NameAssignment_2 )
            {
             before(grammarAccess.getInvariantAccess().getNameAssignment_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3117:1: ( rule__Invariant__NameAssignment_2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3117:2: rule__Invariant__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__NameAssignment_2_in_rule__Invariant__Group__2__Impl6146);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3127:1: rule__Invariant__Group__3 : rule__Invariant__Group__3__Impl rule__Invariant__Group__4 ;
    public final void rule__Invariant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3131:1: ( rule__Invariant__Group__3__Impl rule__Invariant__Group__4 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3132:2: rule__Invariant__Group__3__Impl rule__Invariant__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__3__Impl_in_rule__Invariant__Group__36176);
            rule__Invariant__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__4_in_rule__Invariant__Group__36179);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3139:1: rule__Invariant__Group__3__Impl : ( ( rule__Invariant__TheoremAssignment_3 )? ) ;
    public final void rule__Invariant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3143:1: ( ( ( rule__Invariant__TheoremAssignment_3 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3144:1: ( ( rule__Invariant__TheoremAssignment_3 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3144:1: ( ( rule__Invariant__TheoremAssignment_3 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3145:1: ( rule__Invariant__TheoremAssignment_3 )?
            {
             before(grammarAccess.getInvariantAccess().getTheoremAssignment_3()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3146:1: ( rule__Invariant__TheoremAssignment_3 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==36) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3146:2: rule__Invariant__TheoremAssignment_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Invariant__TheoremAssignment_3_in_rule__Invariant__Group__3__Impl6206);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3156:1: rule__Invariant__Group__4 : rule__Invariant__Group__4__Impl rule__Invariant__Group__5 ;
    public final void rule__Invariant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3160:1: ( rule__Invariant__Group__4__Impl rule__Invariant__Group__5 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3161:2: rule__Invariant__Group__4__Impl rule__Invariant__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__4__Impl_in_rule__Invariant__Group__46237);
            rule__Invariant__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__5_in_rule__Invariant__Group__46240);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3168:1: rule__Invariant__Group__4__Impl : ( ( rule__Invariant__Group_4__0 )? ) ;
    public final void rule__Invariant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3172:1: ( ( ( rule__Invariant__Group_4__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3173:1: ( ( rule__Invariant__Group_4__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3173:1: ( ( rule__Invariant__Group_4__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3174:1: ( rule__Invariant__Group_4__0 )?
            {
             before(grammarAccess.getInvariantAccess().getGroup_4()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3175:1: ( rule__Invariant__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==18) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3175:2: rule__Invariant__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group_4__0_in_rule__Invariant__Group__4__Impl6267);
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


    // $ANTLR start "rule__Invariant__Group__5"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3185:1: rule__Invariant__Group__5 : rule__Invariant__Group__5__Impl rule__Invariant__Group__6 ;
    public final void rule__Invariant__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3189:1: ( rule__Invariant__Group__5__Impl rule__Invariant__Group__6 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3190:2: rule__Invariant__Group__5__Impl rule__Invariant__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__5__Impl_in_rule__Invariant__Group__56298);
            rule__Invariant__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__6_in_rule__Invariant__Group__56301);
            rule__Invariant__Group__6();

            state._fsp--;


            }

        }
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3197:1: rule__Invariant__Group__5__Impl : ( 'predicate' ) ;
    public final void rule__Invariant__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3201:1: ( ( 'predicate' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3202:1: ( 'predicate' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3202:1: ( 'predicate' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3203:1: 'predicate'
            {
             before(grammarAccess.getInvariantAccess().getPredicateKeyword_5()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Invariant__Group__5__Impl6329); 
             after(grammarAccess.getInvariantAccess().getPredicateKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__Invariant__Group__6"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3216:1: rule__Invariant__Group__6 : rule__Invariant__Group__6__Impl ;
    public final void rule__Invariant__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3220:1: ( rule__Invariant__Group__6__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3221:2: rule__Invariant__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__6__Impl_in_rule__Invariant__Group__66360);
            rule__Invariant__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__Group__6"


    // $ANTLR start "rule__Invariant__Group__6__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3227:1: rule__Invariant__Group__6__Impl : ( ( rule__Invariant__PredicateAssignment_6 ) ) ;
    public final void rule__Invariant__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3231:1: ( ( ( rule__Invariant__PredicateAssignment_6 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3232:1: ( ( rule__Invariant__PredicateAssignment_6 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3232:1: ( ( rule__Invariant__PredicateAssignment_6 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3233:1: ( rule__Invariant__PredicateAssignment_6 )
            {
             before(grammarAccess.getInvariantAccess().getPredicateAssignment_6()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3234:1: ( rule__Invariant__PredicateAssignment_6 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3234:2: rule__Invariant__PredicateAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__PredicateAssignment_6_in_rule__Invariant__Group__6__Impl6387);
            rule__Invariant__PredicateAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getInvariantAccess().getPredicateAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__Group__6__Impl"


    // $ANTLR start "rule__Invariant__Group_4__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3258:1: rule__Invariant__Group_4__0 : rule__Invariant__Group_4__0__Impl rule__Invariant__Group_4__1 ;
    public final void rule__Invariant__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3262:1: ( rule__Invariant__Group_4__0__Impl rule__Invariant__Group_4__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3263:2: rule__Invariant__Group_4__0__Impl rule__Invariant__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group_4__0__Impl_in_rule__Invariant__Group_4__06431);
            rule__Invariant__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group_4__1_in_rule__Invariant__Group_4__06434);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3270:1: rule__Invariant__Group_4__0__Impl : ( 'comment' ) ;
    public final void rule__Invariant__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3274:1: ( ( 'comment' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3275:1: ( 'comment' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3275:1: ( 'comment' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3276:1: 'comment'
            {
             before(grammarAccess.getInvariantAccess().getCommentKeyword_4_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Invariant__Group_4__0__Impl6462); 
             after(grammarAccess.getInvariantAccess().getCommentKeyword_4_0()); 

            }


            }

        }
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3289:1: rule__Invariant__Group_4__1 : rule__Invariant__Group_4__1__Impl ;
    public final void rule__Invariant__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3293:1: ( rule__Invariant__Group_4__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3294:2: rule__Invariant__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group_4__1__Impl_in_rule__Invariant__Group_4__16493);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3300:1: rule__Invariant__Group_4__1__Impl : ( ( rule__Invariant__CommentAssignment_4_1 ) ) ;
    public final void rule__Invariant__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3304:1: ( ( ( rule__Invariant__CommentAssignment_4_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3305:1: ( ( rule__Invariant__CommentAssignment_4_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3305:1: ( ( rule__Invariant__CommentAssignment_4_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3306:1: ( rule__Invariant__CommentAssignment_4_1 )
            {
             before(grammarAccess.getInvariantAccess().getCommentAssignment_4_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3307:1: ( rule__Invariant__CommentAssignment_4_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3307:2: rule__Invariant__CommentAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__CommentAssignment_4_1_in_rule__Invariant__Group_4__1__Impl6520);
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


    // $ANTLR start "rule__Statemachine__NameAssignment_1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3322:1: rule__Statemachine__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Statemachine__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3326:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3327:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3327:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3328:1: ruleEString
            {
             before(grammarAccess.getStatemachineAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Statemachine__NameAssignment_16559);
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


    // $ANTLR start "rule__Statemachine__ElaboratesAssignment_2_1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3337:1: rule__Statemachine__ElaboratesAssignment_2_1 : ( ( ruleEString ) ) ;
    public final void rule__Statemachine__ElaboratesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3341:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3342:1: ( ( ruleEString ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3342:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3343:1: ( ruleEString )
            {
             before(grammarAccess.getStatemachineAccess().getElaboratesEventBNamedCrossReference_2_1_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3344:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3345:1: ruleEString
            {
             before(grammarAccess.getStatemachineAccess().getElaboratesEventBNamedEStringParserRuleCall_2_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Statemachine__ElaboratesAssignment_2_16594);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStatemachineAccess().getElaboratesEventBNamedEStringParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getStatemachineAccess().getElaboratesEventBNamedCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__ElaboratesAssignment_2_1"


    // $ANTLR start "rule__Statemachine__RefinesAssignment_3_1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3356:1: rule__Statemachine__RefinesAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Statemachine__RefinesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3360:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3361:1: ( ( ruleEString ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3361:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3362:1: ( ruleEString )
            {
             before(grammarAccess.getStatemachineAccess().getRefinesStatemachineCrossReference_3_1_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3363:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3364:1: ruleEString
            {
             before(grammarAccess.getStatemachineAccess().getRefinesStatemachineEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Statemachine__RefinesAssignment_3_16633);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStatemachineAccess().getRefinesStatemachineEStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getStatemachineAccess().getRefinesStatemachineCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__RefinesAssignment_3_1"


    // $ANTLR start "rule__Statemachine__NodesAssignment_4_1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3375:1: rule__Statemachine__NodesAssignment_4_1 : ( ruleAbstractNode ) ;
    public final void rule__Statemachine__NodesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3379:1: ( ( ruleAbstractNode ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3380:1: ( ruleAbstractNode )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3380:1: ( ruleAbstractNode )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3381:1: ruleAbstractNode
            {
             before(grammarAccess.getStatemachineAccess().getNodesAbstractNodeParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractNode_in_rule__Statemachine__NodesAssignment_4_16668);
            ruleAbstractNode();

            state._fsp--;

             after(grammarAccess.getStatemachineAccess().getNodesAbstractNodeParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__NodesAssignment_4_1"


    // $ANTLR start "rule__Statemachine__NodesAssignment_4_2_1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3390:1: rule__Statemachine__NodesAssignment_4_2_1 : ( ruleAbstractNode ) ;
    public final void rule__Statemachine__NodesAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3394:1: ( ( ruleAbstractNode ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3395:1: ( ruleAbstractNode )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3395:1: ( ruleAbstractNode )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3396:1: ruleAbstractNode
            {
             before(grammarAccess.getStatemachineAccess().getNodesAbstractNodeParserRuleCall_4_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractNode_in_rule__Statemachine__NodesAssignment_4_2_16699);
            ruleAbstractNode();

            state._fsp--;

             after(grammarAccess.getStatemachineAccess().getNodesAbstractNodeParserRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__NodesAssignment_4_2_1"


    // $ANTLR start "rule__Statemachine__TransitionsAssignment_5_1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3405:1: rule__Statemachine__TransitionsAssignment_5_1 : ( ruleTransition ) ;
    public final void rule__Statemachine__TransitionsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3409:1: ( ( ruleTransition ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3410:1: ( ruleTransition )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3410:1: ( ruleTransition )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3411:1: ruleTransition
            {
             before(grammarAccess.getStatemachineAccess().getTransitionsTransitionParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransition_in_rule__Statemachine__TransitionsAssignment_5_16730);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getStatemachineAccess().getTransitionsTransitionParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__TransitionsAssignment_5_1"


    // $ANTLR start "rule__Statemachine__TransitionsAssignment_5_2_1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3420:1: rule__Statemachine__TransitionsAssignment_5_2_1 : ( ruleTransition ) ;
    public final void rule__Statemachine__TransitionsAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3424:1: ( ( ruleTransition ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3425:1: ( ruleTransition )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3425:1: ( ruleTransition )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3426:1: ruleTransition
            {
             before(grammarAccess.getStatemachineAccess().getTransitionsTransitionParserRuleCall_5_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransition_in_rule__Statemachine__TransitionsAssignment_5_2_16761);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getStatemachineAccess().getTransitionsTransitionParserRuleCall_5_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__TransitionsAssignment_5_2_1"


    // $ANTLR start "rule__Transition__ExtendedAssignment_1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3435:1: rule__Transition__ExtendedAssignment_1 : ( ( 'extended' ) ) ;
    public final void rule__Transition__ExtendedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3439:1: ( ( ( 'extended' ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3440:1: ( ( 'extended' ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3440:1: ( ( 'extended' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3441:1: ( 'extended' )
            {
             before(grammarAccess.getTransitionAccess().getExtendedExtendedKeyword_1_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3442:1: ( 'extended' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3443:1: 'extended'
            {
             before(grammarAccess.getTransitionAccess().getExtendedExtendedKeyword_1_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Transition__ExtendedAssignment_16797); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3458:1: rule__Transition__CommentAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Transition__CommentAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3462:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3463:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3463:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3464:1: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getCommentEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Transition__CommentAssignment_3_16836);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3473:1: rule__Transition__ElaboratesAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Transition__ElaboratesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3477:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3478:1: ( ( ruleEString ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3478:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3479:1: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getElaboratesEventCrossReference_4_1_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3480:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3481:1: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getElaboratesEventEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Transition__ElaboratesAssignment_4_16871);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3492:1: rule__Transition__ElaboratesAssignment_4_2_1 : ( ( ruleEString ) ) ;
    public final void rule__Transition__ElaboratesAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3496:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3497:1: ( ( ruleEString ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3497:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3498:1: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getElaboratesEventCrossReference_4_2_1_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3499:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3500:1: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getElaboratesEventEStringParserRuleCall_4_2_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Transition__ElaboratesAssignment_4_2_16910);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3511:1: rule__Transition__TargetAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__Transition__TargetAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3515:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3516:1: ( ( ruleEString ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3516:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3517:1: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getTargetAbstractNodeCrossReference_5_1_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3518:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3519:1: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getTargetAbstractNodeEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Transition__TargetAssignment_5_16949);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3530:1: rule__Transition__SourceAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__Transition__SourceAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3534:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3535:1: ( ( ruleEString ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3535:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3536:1: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getSourceAbstractNodeCrossReference_6_1_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3537:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3538:1: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getSourceAbstractNodeEStringParserRuleCall_6_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Transition__SourceAssignment_6_16988);
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


    // $ANTLR start "rule__State__NameAssignment_2"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3549:1: rule__State__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__State__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3553:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3554:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3554:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3555:1: ruleEString
            {
             before(grammarAccess.getStateAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__State__NameAssignment_27023);
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


    // $ANTLR start "rule__State__StatemachinesAssignment_3_2"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3564:1: rule__State__StatemachinesAssignment_3_2 : ( ruleStatemachine ) ;
    public final void rule__State__StatemachinesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3568:1: ( ( ruleStatemachine ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3569:1: ( ruleStatemachine )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3569:1: ( ruleStatemachine )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3570:1: ruleStatemachine
            {
             before(grammarAccess.getStateAccess().getStatemachinesStatemachineParserRuleCall_3_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleStatemachine_in_rule__State__StatemachinesAssignment_3_27054);
            ruleStatemachine();

            state._fsp--;

             after(grammarAccess.getStateAccess().getStatemachinesStatemachineParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__StatemachinesAssignment_3_2"


    // $ANTLR start "rule__State__StatemachinesAssignment_3_3_1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3579:1: rule__State__StatemachinesAssignment_3_3_1 : ( ruleStatemachine ) ;
    public final void rule__State__StatemachinesAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3583:1: ( ( ruleStatemachine ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3584:1: ( ruleStatemachine )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3584:1: ( ruleStatemachine )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3585:1: ruleStatemachine
            {
             before(grammarAccess.getStateAccess().getStatemachinesStatemachineParserRuleCall_3_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleStatemachine_in_rule__State__StatemachinesAssignment_3_3_17085);
            ruleStatemachine();

            state._fsp--;

             after(grammarAccess.getStateAccess().getStatemachinesStatemachineParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__StatemachinesAssignment_3_3_1"


    // $ANTLR start "rule__State__InvariantsAssignment_4_2"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3594:1: rule__State__InvariantsAssignment_4_2 : ( ruleInvariant ) ;
    public final void rule__State__InvariantsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3598:1: ( ( ruleInvariant ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3599:1: ( ruleInvariant )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3599:1: ( ruleInvariant )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3600:1: ruleInvariant
            {
             before(grammarAccess.getStateAccess().getInvariantsInvariantParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInvariant_in_rule__State__InvariantsAssignment_4_27116);
            ruleInvariant();

            state._fsp--;

             after(grammarAccess.getStateAccess().getInvariantsInvariantParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__InvariantsAssignment_4_2"


    // $ANTLR start "rule__State__InvariantsAssignment_4_3_1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3609:1: rule__State__InvariantsAssignment_4_3_1 : ( ruleInvariant ) ;
    public final void rule__State__InvariantsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3613:1: ( ( ruleInvariant ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3614:1: ( ruleInvariant )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3614:1: ( ruleInvariant )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3615:1: ruleInvariant
            {
             before(grammarAccess.getStateAccess().getInvariantsInvariantParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInvariant_in_rule__State__InvariantsAssignment_4_3_17147);
            ruleInvariant();

            state._fsp--;

             after(grammarAccess.getStateAccess().getInvariantsInvariantParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__InvariantsAssignment_4_3_1"


    // $ANTLR start "rule__Initial__InternalIdAssignment_2_1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3624:1: rule__Initial__InternalIdAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Initial__InternalIdAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3628:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3629:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3629:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3630:1: ruleEString
            {
             before(grammarAccess.getInitialAccess().getInternalIdEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Initial__InternalIdAssignment_2_17178);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3639:1: rule__Final__InternalIdAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Final__InternalIdAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3643:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3644:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3644:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3645:1: ruleEString
            {
             before(grammarAccess.getFinalAccess().getInternalIdEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Final__InternalIdAssignment_2_17209);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3654:1: rule__Any__InternalIdAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Any__InternalIdAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3658:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3659:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3659:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3660:1: ruleEString
            {
             before(grammarAccess.getAnyAccess().getInternalIdEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Any__InternalIdAssignment_2_17240);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3669:1: rule__Junction__InternalIdAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Junction__InternalIdAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3673:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3674:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3674:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3675:1: ruleEString
            {
             before(grammarAccess.getJunctionAccess().getInternalIdEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Junction__InternalIdAssignment_2_17271);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3684:1: rule__Fork__InternalIdAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Fork__InternalIdAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3688:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3689:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3689:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3690:1: ruleEString
            {
             before(grammarAccess.getForkAccess().getInternalIdEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Fork__InternalIdAssignment_2_17302);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3699:1: rule__Invariant__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Invariant__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3703:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3704:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3704:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3705:1: ruleEString
            {
             before(grammarAccess.getInvariantAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Invariant__NameAssignment_27333);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3714:1: rule__Invariant__TheoremAssignment_3 : ( ( 'theorem' ) ) ;
    public final void rule__Invariant__TheoremAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3718:1: ( ( ( 'theorem' ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3719:1: ( ( 'theorem' ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3719:1: ( ( 'theorem' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3720:1: ( 'theorem' )
            {
             before(grammarAccess.getInvariantAccess().getTheoremTheoremKeyword_3_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3721:1: ( 'theorem' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3722:1: 'theorem'
            {
             before(grammarAccess.getInvariantAccess().getTheoremTheoremKeyword_3_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__Invariant__TheoremAssignment_37369); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3737:1: rule__Invariant__CommentAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Invariant__CommentAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3741:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3742:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3742:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3743:1: ruleEString
            {
             before(grammarAccess.getInvariantAccess().getCommentEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Invariant__CommentAssignment_4_17408);
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


    // $ANTLR start "rule__Invariant__PredicateAssignment_6"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3752:1: rule__Invariant__PredicateAssignment_6 : ( ruleEString ) ;
    public final void rule__Invariant__PredicateAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3756:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3757:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3757:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3758:1: ruleEString
            {
             before(grammarAccess.getInvariantAccess().getPredicateEStringParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Invariant__PredicateAssignment_67439);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInvariantAccess().getPredicateEStringParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__PredicateAssignment_6"

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
        public static final BitSet FOLLOW_ruleState_in_rule__AbstractNode__Alternatives734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInitial_in_rule__AbstractNode__Alternatives751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFinal_in_rule__AbstractNode__Alternatives768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAny_in_rule__AbstractNode__Alternatives785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleJunction_in_rule__AbstractNode__Alternatives802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFork_in_rule__AbstractNode__Alternatives819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group__0__Impl_in_rule__Statemachine__Group__0899 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Statemachine__Group__1_in_rule__Statemachine__Group__0902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Statemachine__Group__0__Impl930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group__1__Impl_in_rule__Statemachine__Group__1961 = new BitSet(new long[]{0x0000000000017000L});
        public static final BitSet FOLLOW_rule__Statemachine__Group__2_in_rule__Statemachine__Group__1964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__NameAssignment_1_in_rule__Statemachine__Group__1__Impl991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group__2__Impl_in_rule__Statemachine__Group__21021 = new BitSet(new long[]{0x0000000000017000L});
        public static final BitSet FOLLOW_rule__Statemachine__Group__3_in_rule__Statemachine__Group__21024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_2__0_in_rule__Statemachine__Group__2__Impl1051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group__3__Impl_in_rule__Statemachine__Group__31082 = new BitSet(new long[]{0x0000000000017000L});
        public static final BitSet FOLLOW_rule__Statemachine__Group__4_in_rule__Statemachine__Group__31085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_3__0_in_rule__Statemachine__Group__3__Impl1112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group__4__Impl_in_rule__Statemachine__Group__41143 = new BitSet(new long[]{0x0000000000017000L});
        public static final BitSet FOLLOW_rule__Statemachine__Group__5_in_rule__Statemachine__Group__41146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_4__0_in_rule__Statemachine__Group__4__Impl1173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group__5__Impl_in_rule__Statemachine__Group__51204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_5__0_in_rule__Statemachine__Group__5__Impl1231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_2__0__Impl_in_rule__Statemachine__Group_2__01274 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_2__1_in_rule__Statemachine__Group_2__01277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Statemachine__Group_2__0__Impl1305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_2__1__Impl_in_rule__Statemachine__Group_2__11336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__ElaboratesAssignment_2_1_in_rule__Statemachine__Group_2__1__Impl1363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_3__0__Impl_in_rule__Statemachine__Group_3__01397 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_3__1_in_rule__Statemachine__Group_3__01400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Statemachine__Group_3__0__Impl1428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_3__1__Impl_in_rule__Statemachine__Group_3__11459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__RefinesAssignment_3_1_in_rule__Statemachine__Group_3__1__Impl1486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_4__0__Impl_in_rule__Statemachine__Group_4__01520 = new BitSet(new long[]{0x00000000F4200000L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_4__1_in_rule__Statemachine__Group_4__01523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Statemachine__Group_4__0__Impl1551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_4__1__Impl_in_rule__Statemachine__Group_4__11582 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_4__2_in_rule__Statemachine__Group_4__11585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__NodesAssignment_4_1_in_rule__Statemachine__Group_4__1__Impl1612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_4__2__Impl_in_rule__Statemachine__Group_4__21642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_4_2__0_in_rule__Statemachine__Group_4__2__Impl1669 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_4_2__0__Impl_in_rule__Statemachine__Group_4_2__01706 = new BitSet(new long[]{0x00000000F4200000L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_4_2__1_in_rule__Statemachine__Group_4_2__01709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Statemachine__Group_4_2__0__Impl1737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_4_2__1__Impl_in_rule__Statemachine__Group_4_2__11768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__NodesAssignment_4_2_1_in_rule__Statemachine__Group_4_2__1__Impl1795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_5__0__Impl_in_rule__Statemachine__Group_5__01829 = new BitSet(new long[]{0x0000000800020000L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_5__1_in_rule__Statemachine__Group_5__01832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Statemachine__Group_5__0__Impl1860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_5__1__Impl_in_rule__Statemachine__Group_5__11891 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_5__2_in_rule__Statemachine__Group_5__11894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__TransitionsAssignment_5_1_in_rule__Statemachine__Group_5__1__Impl1921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_5__2__Impl_in_rule__Statemachine__Group_5__21951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_5_2__0_in_rule__Statemachine__Group_5__2__Impl1978 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_5_2__0__Impl_in_rule__Statemachine__Group_5_2__02015 = new BitSet(new long[]{0x0000000800020000L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_5_2__1_in_rule__Statemachine__Group_5_2__02018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Statemachine__Group_5_2__0__Impl2046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_5_2__1__Impl_in_rule__Statemachine__Group_5_2__12077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__TransitionsAssignment_5_2_1_in_rule__Statemachine__Group_5_2__1__Impl2104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__02138 = new BitSet(new long[]{0x0000000800020000L});
        public static final BitSet FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__02141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__12199 = new BitSet(new long[]{0x0000000800020000L});
        public static final BitSet FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__12202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__ExtendedAssignment_1_in_rule__Transition__Group__1__Impl2229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__22260 = new BitSet(new long[]{0x00000000001C1000L});
        public static final BitSet FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__22263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Transition__Group__2__Impl2291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__32322 = new BitSet(new long[]{0x00000000001C1000L});
        public static final BitSet FOLLOW_rule__Transition__Group__4_in_rule__Transition__Group__32325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_3__0_in_rule__Transition__Group__3__Impl2352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__4__Impl_in_rule__Transition__Group__42383 = new BitSet(new long[]{0x00000000001C1000L});
        public static final BitSet FOLLOW_rule__Transition__Group__5_in_rule__Transition__Group__42386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_4__0_in_rule__Transition__Group__4__Impl2413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__5__Impl_in_rule__Transition__Group__52444 = new BitSet(new long[]{0x00000000001C1000L});
        public static final BitSet FOLLOW_rule__Transition__Group__6_in_rule__Transition__Group__52447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_5__0_in_rule__Transition__Group__5__Impl2474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__6__Impl_in_rule__Transition__Group__62505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_6__0_in_rule__Transition__Group__6__Impl2532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_3__0__Impl_in_rule__Transition__Group_3__02577 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Transition__Group_3__1_in_rule__Transition__Group_3__02580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Transition__Group_3__0__Impl2608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_3__1__Impl_in_rule__Transition__Group_3__12639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__CommentAssignment_3_1_in_rule__Transition__Group_3__1__Impl2666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_4__0__Impl_in_rule__Transition__Group_4__02700 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Transition__Group_4__1_in_rule__Transition__Group_4__02703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Transition__Group_4__0__Impl2731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_4__1__Impl_in_rule__Transition__Group_4__12762 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Transition__Group_4__2_in_rule__Transition__Group_4__12765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__ElaboratesAssignment_4_1_in_rule__Transition__Group_4__1__Impl2792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_4__2__Impl_in_rule__Transition__Group_4__22822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_4_2__0_in_rule__Transition__Group_4__2__Impl2849 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__Transition__Group_4_2__0__Impl_in_rule__Transition__Group_4_2__02886 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Transition__Group_4_2__1_in_rule__Transition__Group_4_2__02889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Transition__Group_4_2__0__Impl2917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_4_2__1__Impl_in_rule__Transition__Group_4_2__12948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__ElaboratesAssignment_4_2_1_in_rule__Transition__Group_4_2__1__Impl2975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_5__0__Impl_in_rule__Transition__Group_5__03009 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Transition__Group_5__1_in_rule__Transition__Group_5__03012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Transition__Group_5__0__Impl3040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_5__1__Impl_in_rule__Transition__Group_5__13071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__TargetAssignment_5_1_in_rule__Transition__Group_5__1__Impl3098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_6__0__Impl_in_rule__Transition__Group_6__03132 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Transition__Group_6__1_in_rule__Transition__Group_6__03135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Transition__Group_6__0__Impl3163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_6__1__Impl_in_rule__Transition__Group_6__13194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__SourceAssignment_6_1_in_rule__Transition__Group_6__1__Impl3221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__03256 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__State__Group__1_in_rule__State__Group__03259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__13317 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__State__Group__2_in_rule__State__Group__13320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__State__Group__1__Impl3348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__23379 = new BitSet(new long[]{0x0000000002400000L});
        public static final BitSet FOLLOW_rule__State__Group__3_in_rule__State__Group__23382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__NameAssignment_2_in_rule__State__Group__2__Impl3409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group__3__Impl_in_rule__State__Group__33439 = new BitSet(new long[]{0x0000000002400000L});
        public static final BitSet FOLLOW_rule__State__Group__4_in_rule__State__Group__33442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_3__0_in_rule__State__Group__3__Impl3469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group__4__Impl_in_rule__State__Group__43500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_4__0_in_rule__State__Group__4__Impl3527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_3__0__Impl_in_rule__State__Group_3__03568 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__State__Group_3__1_in_rule__State__Group_3__03571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__State__Group_3__0__Impl3599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_3__1__Impl_in_rule__State__Group_3__13630 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__State__Group_3__2_in_rule__State__Group_3__13633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__State__Group_3__1__Impl3661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_3__2__Impl_in_rule__State__Group_3__23692 = new BitSet(new long[]{0x0000000001008000L});
        public static final BitSet FOLLOW_rule__State__Group_3__3_in_rule__State__Group_3__23695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__StatemachinesAssignment_3_2_in_rule__State__Group_3__2__Impl3722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_3__3__Impl_in_rule__State__Group_3__33752 = new BitSet(new long[]{0x0000000001008000L});
        public static final BitSet FOLLOW_rule__State__Group_3__4_in_rule__State__Group_3__33755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_3_3__0_in_rule__State__Group_3__3__Impl3782 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__State__Group_3__4__Impl_in_rule__State__Group_3__43813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__State__Group_3__4__Impl3841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_3_3__0__Impl_in_rule__State__Group_3_3__03882 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__State__Group_3_3__1_in_rule__State__Group_3_3__03885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__State__Group_3_3__0__Impl3913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_3_3__1__Impl_in_rule__State__Group_3_3__13944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__StatemachinesAssignment_3_3_1_in_rule__State__Group_3_3__1__Impl3971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_4__0__Impl_in_rule__State__Group_4__04005 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__State__Group_4__1_in_rule__State__Group_4__04008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__State__Group_4__0__Impl4036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_4__1__Impl_in_rule__State__Group_4__14067 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__State__Group_4__2_in_rule__State__Group_4__14070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__State__Group_4__1__Impl4098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_4__2__Impl_in_rule__State__Group_4__24129 = new BitSet(new long[]{0x0000000001008000L});
        public static final BitSet FOLLOW_rule__State__Group_4__3_in_rule__State__Group_4__24132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__InvariantsAssignment_4_2_in_rule__State__Group_4__2__Impl4159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_4__3__Impl_in_rule__State__Group_4__34189 = new BitSet(new long[]{0x0000000001008000L});
        public static final BitSet FOLLOW_rule__State__Group_4__4_in_rule__State__Group_4__34192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_4_3__0_in_rule__State__Group_4__3__Impl4219 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__State__Group_4__4__Impl_in_rule__State__Group_4__44250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__State__Group_4__4__Impl4278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_4_3__0__Impl_in_rule__State__Group_4_3__04319 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__State__Group_4_3__1_in_rule__State__Group_4_3__04322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__State__Group_4_3__0__Impl4350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_4_3__1__Impl_in_rule__State__Group_4_3__14381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__InvariantsAssignment_4_3_1_in_rule__State__Group_4_3__1__Impl4408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Initial__Group__0__Impl_in_rule__Initial__Group__04442 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Initial__Group__1_in_rule__Initial__Group__04445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Initial__Group__1__Impl_in_rule__Initial__Group__14503 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Initial__Group__2_in_rule__Initial__Group__14506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Initial__Group__1__Impl4534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Initial__Group__2__Impl_in_rule__Initial__Group__24565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Initial__Group_2__0_in_rule__Initial__Group__2__Impl4592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Initial__Group_2__0__Impl_in_rule__Initial__Group_2__04629 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Initial__Group_2__1_in_rule__Initial__Group_2__04632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Initial__Group_2__0__Impl4660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Initial__Group_2__1__Impl_in_rule__Initial__Group_2__14691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Initial__InternalIdAssignment_2_1_in_rule__Initial__Group_2__1__Impl4718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Final__Group__0__Impl_in_rule__Final__Group__04752 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Final__Group__1_in_rule__Final__Group__04755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Final__Group__1__Impl_in_rule__Final__Group__14813 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Final__Group__2_in_rule__Final__Group__14816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Final__Group__1__Impl4844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Final__Group__2__Impl_in_rule__Final__Group__24875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Final__Group_2__0_in_rule__Final__Group__2__Impl4902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Final__Group_2__0__Impl_in_rule__Final__Group_2__04939 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Final__Group_2__1_in_rule__Final__Group_2__04942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Final__Group_2__0__Impl4970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Final__Group_2__1__Impl_in_rule__Final__Group_2__15001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Final__InternalIdAssignment_2_1_in_rule__Final__Group_2__1__Impl5028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Any__Group__0__Impl_in_rule__Any__Group__05062 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Any__Group__1_in_rule__Any__Group__05065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Any__Group__1__Impl_in_rule__Any__Group__15123 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Any__Group__2_in_rule__Any__Group__15126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Any__Group__1__Impl5154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Any__Group__2__Impl_in_rule__Any__Group__25185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Any__Group_2__0_in_rule__Any__Group__2__Impl5212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Any__Group_2__0__Impl_in_rule__Any__Group_2__05249 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Any__Group_2__1_in_rule__Any__Group_2__05252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Any__Group_2__0__Impl5280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Any__Group_2__1__Impl_in_rule__Any__Group_2__15311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Any__InternalIdAssignment_2_1_in_rule__Any__Group_2__1__Impl5338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Junction__Group__0__Impl_in_rule__Junction__Group__05372 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__Junction__Group__1_in_rule__Junction__Group__05375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Junction__Group__1__Impl_in_rule__Junction__Group__15433 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Junction__Group__2_in_rule__Junction__Group__15436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Junction__Group__1__Impl5464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Junction__Group__2__Impl_in_rule__Junction__Group__25495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Junction__Group_2__0_in_rule__Junction__Group__2__Impl5522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Junction__Group_2__0__Impl_in_rule__Junction__Group_2__05559 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Junction__Group_2__1_in_rule__Junction__Group_2__05562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Junction__Group_2__0__Impl5590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Junction__Group_2__1__Impl_in_rule__Junction__Group_2__15621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Junction__InternalIdAssignment_2_1_in_rule__Junction__Group_2__1__Impl5648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fork__Group__0__Impl_in_rule__Fork__Group__05682 = new BitSet(new long[]{0x00000000F4200000L});
        public static final BitSet FOLLOW_rule__Fork__Group__1_in_rule__Fork__Group__05685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fork__Group__1__Impl_in_rule__Fork__Group__15743 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Fork__Group__2_in_rule__Fork__Group__15746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Fork__Group__1__Impl5774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fork__Group__2__Impl_in_rule__Fork__Group__25805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fork__Group_2__0_in_rule__Fork__Group__2__Impl5832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fork__Group_2__0__Impl_in_rule__Fork__Group_2__05869 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Fork__Group_2__1_in_rule__Fork__Group_2__05872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Fork__Group_2__0__Impl5900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fork__Group_2__1__Impl_in_rule__Fork__Group_2__15931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fork__InternalIdAssignment_2_1_in_rule__Fork__Group_2__1__Impl5958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group__0__Impl_in_rule__Invariant__Group__05992 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__Invariant__Group__1_in_rule__Invariant__Group__05995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Invariant__Group__0__Impl6023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group__1__Impl_in_rule__Invariant__Group__16054 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Invariant__Group__2_in_rule__Invariant__Group__16057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Invariant__Group__1__Impl6085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group__2__Impl_in_rule__Invariant__Group__26116 = new BitSet(new long[]{0x0000001400040000L});
        public static final BitSet FOLLOW_rule__Invariant__Group__3_in_rule__Invariant__Group__26119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__NameAssignment_2_in_rule__Invariant__Group__2__Impl6146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group__3__Impl_in_rule__Invariant__Group__36176 = new BitSet(new long[]{0x0000001400040000L});
        public static final BitSet FOLLOW_rule__Invariant__Group__4_in_rule__Invariant__Group__36179 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__TheoremAssignment_3_in_rule__Invariant__Group__3__Impl6206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group__4__Impl_in_rule__Invariant__Group__46237 = new BitSet(new long[]{0x0000001400040000L});
        public static final BitSet FOLLOW_rule__Invariant__Group__5_in_rule__Invariant__Group__46240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group_4__0_in_rule__Invariant__Group__4__Impl6267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group__5__Impl_in_rule__Invariant__Group__56298 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Invariant__Group__6_in_rule__Invariant__Group__56301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Invariant__Group__5__Impl6329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group__6__Impl_in_rule__Invariant__Group__66360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__PredicateAssignment_6_in_rule__Invariant__Group__6__Impl6387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group_4__0__Impl_in_rule__Invariant__Group_4__06431 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Invariant__Group_4__1_in_rule__Invariant__Group_4__06434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Invariant__Group_4__0__Impl6462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group_4__1__Impl_in_rule__Invariant__Group_4__16493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__CommentAssignment_4_1_in_rule__Invariant__Group_4__1__Impl6520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Statemachine__NameAssignment_16559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Statemachine__ElaboratesAssignment_2_16594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Statemachine__RefinesAssignment_3_16633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractNode_in_rule__Statemachine__NodesAssignment_4_16668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractNode_in_rule__Statemachine__NodesAssignment_4_2_16699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransition_in_rule__Statemachine__TransitionsAssignment_5_16730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransition_in_rule__Statemachine__TransitionsAssignment_5_2_16761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Transition__ExtendedAssignment_16797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Transition__CommentAssignment_3_16836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Transition__ElaboratesAssignment_4_16871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Transition__ElaboratesAssignment_4_2_16910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Transition__TargetAssignment_5_16949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Transition__SourceAssignment_6_16988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__State__NameAssignment_27023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStatemachine_in_rule__State__StatemachinesAssignment_3_27054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStatemachine_in_rule__State__StatemachinesAssignment_3_3_17085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvariant_in_rule__State__InvariantsAssignment_4_27116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvariant_in_rule__State__InvariantsAssignment_4_3_17147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Initial__InternalIdAssignment_2_17178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Final__InternalIdAssignment_2_17209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Any__InternalIdAssignment_2_17240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Junction__InternalIdAssignment_2_17271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Fork__InternalIdAssignment_2_17302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Invariant__NameAssignment_27333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__Invariant__TheoremAssignment_37369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Invariant__CommentAssignment_4_17408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Invariant__PredicateAssignment_67439 = new BitSet(new long[]{0x0000000000000002L});
    }


}