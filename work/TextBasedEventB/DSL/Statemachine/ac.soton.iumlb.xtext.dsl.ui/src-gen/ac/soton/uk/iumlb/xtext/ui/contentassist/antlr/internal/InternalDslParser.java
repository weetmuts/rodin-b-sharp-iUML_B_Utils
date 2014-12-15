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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Statemachine'", "'elaborates'", "'refines'", "'nodes'", "','", "'transitions'", "'Transition'", "'target'", "'source'", "'comment'", "'State'", "'statemachines'", "'{'", "'}'", "'invariants'", "'Initial'", "'internalId'", "'Final'", "'Any'", "'Junction'", "'Fork'", "'Invariant'", "'@'", "'predicate'", "'extended'", "'theorem'"
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1082:1: rule__Transition__Group__0__Impl : ( ( rule__Transition__ExtendedAssignment_0 )? ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1086:1: ( ( ( rule__Transition__ExtendedAssignment_0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1087:1: ( ( rule__Transition__ExtendedAssignment_0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1087:1: ( ( rule__Transition__ExtendedAssignment_0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1088:1: ( rule__Transition__ExtendedAssignment_0 )?
            {
             before(grammarAccess.getTransitionAccess().getExtendedAssignment_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1089:1: ( rule__Transition__ExtendedAssignment_0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==35) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1089:2: rule__Transition__ExtendedAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Transition__ExtendedAssignment_0_in_rule__Transition__Group__0__Impl2168);
                    rule__Transition__ExtendedAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getExtendedAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1099:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1103:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1104:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1111:1: rule__Transition__Group__1__Impl : ( 'Transition' ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1115:1: ( ( 'Transition' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1116:1: ( 'Transition' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1116:1: ( 'Transition' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1117:1: 'Transition'
            {
             before(grammarAccess.getTransitionAccess().getTransitionKeyword_1()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Transition__Group__1__Impl2230); 
             after(grammarAccess.getTransitionAccess().getTransitionKeyword_1()); 

            }


            }

        }
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
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__22261);
            rule__Transition__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__22264);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1142:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__Group_2__0 )? ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1146:1: ( ( ( rule__Transition__Group_2__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1147:1: ( ( rule__Transition__Group_2__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1147:1: ( ( rule__Transition__Group_2__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1148:1: ( rule__Transition__Group_2__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1149:1: ( rule__Transition__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1149:2: rule__Transition__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_2__0_in_rule__Transition__Group__2__Impl2291);
                    rule__Transition__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_2()); 

            }


            }

        }
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1159:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1163:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1164:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1171:1: rule__Transition__Group__3__Impl : ( ( rule__Transition__Group_3__0 )? ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1175:1: ( ( ( rule__Transition__Group_3__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1176:1: ( ( rule__Transition__Group_3__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1176:1: ( ( rule__Transition__Group_3__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1177:1: ( rule__Transition__Group_3__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_3()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1178:1: ( rule__Transition__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==12) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1178:2: rule__Transition__Group_3__0
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1188:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl rule__Transition__Group__5 ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1192:1: ( rule__Transition__Group__4__Impl rule__Transition__Group__5 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1193:2: rule__Transition__Group__4__Impl rule__Transition__Group__5
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1200:1: rule__Transition__Group__4__Impl : ( 'target' ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1204:1: ( ( 'target' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1205:1: ( 'target' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1205:1: ( 'target' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1206:1: 'target'
            {
             before(grammarAccess.getTransitionAccess().getTargetKeyword_4()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Transition__Group__4__Impl2414); 
             after(grammarAccess.getTransitionAccess().getTargetKeyword_4()); 

            }


            }

        }
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
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__5__Impl_in_rule__Transition__Group__52445);
            rule__Transition__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__6_in_rule__Transition__Group__52448);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1231:1: rule__Transition__Group__5__Impl : ( ( rule__Transition__TargetAssignment_5 ) ) ;
    public final void rule__Transition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1235:1: ( ( ( rule__Transition__TargetAssignment_5 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1236:1: ( ( rule__Transition__TargetAssignment_5 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1236:1: ( ( rule__Transition__TargetAssignment_5 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1237:1: ( rule__Transition__TargetAssignment_5 )
            {
             before(grammarAccess.getTransitionAccess().getTargetAssignment_5()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1238:1: ( rule__Transition__TargetAssignment_5 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1238:2: rule__Transition__TargetAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__TargetAssignment_5_in_rule__Transition__Group__5__Impl2475);
            rule__Transition__TargetAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getTargetAssignment_5()); 

            }


            }

        }
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1248:1: rule__Transition__Group__6 : rule__Transition__Group__6__Impl rule__Transition__Group__7 ;
    public final void rule__Transition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1252:1: ( rule__Transition__Group__6__Impl rule__Transition__Group__7 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1253:2: rule__Transition__Group__6__Impl rule__Transition__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__6__Impl_in_rule__Transition__Group__62505);
            rule__Transition__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__7_in_rule__Transition__Group__62508);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1260:1: rule__Transition__Group__6__Impl : ( 'source' ) ;
    public final void rule__Transition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1264:1: ( ( 'source' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1265:1: ( 'source' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1265:1: ( 'source' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1266:1: 'source'
            {
             before(grammarAccess.getTransitionAccess().getSourceKeyword_6()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Transition__Group__6__Impl2536); 
             after(grammarAccess.getTransitionAccess().getSourceKeyword_6()); 

            }


            }

        }
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1279:1: rule__Transition__Group__7 : rule__Transition__Group__7__Impl ;
    public final void rule__Transition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1283:1: ( rule__Transition__Group__7__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1284:2: rule__Transition__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__7__Impl_in_rule__Transition__Group__72567);
            rule__Transition__Group__7__Impl();

            state._fsp--;


            }

        }
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1290:1: rule__Transition__Group__7__Impl : ( ( rule__Transition__SourceAssignment_7 ) ) ;
    public final void rule__Transition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1294:1: ( ( ( rule__Transition__SourceAssignment_7 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1295:1: ( ( rule__Transition__SourceAssignment_7 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1295:1: ( ( rule__Transition__SourceAssignment_7 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1296:1: ( rule__Transition__SourceAssignment_7 )
            {
             before(grammarAccess.getTransitionAccess().getSourceAssignment_7()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1297:1: ( rule__Transition__SourceAssignment_7 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1297:2: rule__Transition__SourceAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__SourceAssignment_7_in_rule__Transition__Group__7__Impl2594);
            rule__Transition__SourceAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getSourceAssignment_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__Transition__Group_2__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1323:1: rule__Transition__Group_2__0 : rule__Transition__Group_2__0__Impl rule__Transition__Group_2__1 ;
    public final void rule__Transition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1327:1: ( rule__Transition__Group_2__0__Impl rule__Transition__Group_2__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1328:2: rule__Transition__Group_2__0__Impl rule__Transition__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_2__0__Impl_in_rule__Transition__Group_2__02640);
            rule__Transition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_2__1_in_rule__Transition__Group_2__02643);
            rule__Transition__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_2__0"


    // $ANTLR start "rule__Transition__Group_2__0__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1335:1: rule__Transition__Group_2__0__Impl : ( 'comment' ) ;
    public final void rule__Transition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1339:1: ( ( 'comment' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1340:1: ( 'comment' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1340:1: ( 'comment' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1341:1: 'comment'
            {
             before(grammarAccess.getTransitionAccess().getCommentKeyword_2_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Transition__Group_2__0__Impl2671); 
             after(grammarAccess.getTransitionAccess().getCommentKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_2__0__Impl"


    // $ANTLR start "rule__Transition__Group_2__1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1354:1: rule__Transition__Group_2__1 : rule__Transition__Group_2__1__Impl ;
    public final void rule__Transition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1358:1: ( rule__Transition__Group_2__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1359:2: rule__Transition__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_2__1__Impl_in_rule__Transition__Group_2__12702);
            rule__Transition__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_2__1"


    // $ANTLR start "rule__Transition__Group_2__1__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1365:1: rule__Transition__Group_2__1__Impl : ( ( rule__Transition__CommentAssignment_2_1 ) ) ;
    public final void rule__Transition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1369:1: ( ( ( rule__Transition__CommentAssignment_2_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1370:1: ( ( rule__Transition__CommentAssignment_2_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1370:1: ( ( rule__Transition__CommentAssignment_2_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1371:1: ( rule__Transition__CommentAssignment_2_1 )
            {
             before(grammarAccess.getTransitionAccess().getCommentAssignment_2_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1372:1: ( rule__Transition__CommentAssignment_2_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1372:2: rule__Transition__CommentAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__CommentAssignment_2_1_in_rule__Transition__Group_2__1__Impl2729);
            rule__Transition__CommentAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getCommentAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_2__1__Impl"


    // $ANTLR start "rule__Transition__Group_3__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1386:1: rule__Transition__Group_3__0 : rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1 ;
    public final void rule__Transition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1390:1: ( rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1391:2: rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_3__0__Impl_in_rule__Transition__Group_3__02763);
            rule__Transition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_3__1_in_rule__Transition__Group_3__02766);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1398:1: rule__Transition__Group_3__0__Impl : ( 'elaborates' ) ;
    public final void rule__Transition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1402:1: ( ( 'elaborates' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1403:1: ( 'elaborates' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1403:1: ( 'elaborates' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1404:1: 'elaborates'
            {
             before(grammarAccess.getTransitionAccess().getElaboratesKeyword_3_0()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Transition__Group_3__0__Impl2794); 
             after(grammarAccess.getTransitionAccess().getElaboratesKeyword_3_0()); 

            }


            }

        }
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1417:1: rule__Transition__Group_3__1 : rule__Transition__Group_3__1__Impl rule__Transition__Group_3__2 ;
    public final void rule__Transition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1421:1: ( rule__Transition__Group_3__1__Impl rule__Transition__Group_3__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1422:2: rule__Transition__Group_3__1__Impl rule__Transition__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_3__1__Impl_in_rule__Transition__Group_3__12825);
            rule__Transition__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_3__2_in_rule__Transition__Group_3__12828);
            rule__Transition__Group_3__2();

            state._fsp--;


            }

        }
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1429:1: rule__Transition__Group_3__1__Impl : ( ( rule__Transition__ElaboratesAssignment_3_1 ) ) ;
    public final void rule__Transition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1433:1: ( ( ( rule__Transition__ElaboratesAssignment_3_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1434:1: ( ( rule__Transition__ElaboratesAssignment_3_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1434:1: ( ( rule__Transition__ElaboratesAssignment_3_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1435:1: ( rule__Transition__ElaboratesAssignment_3_1 )
            {
             before(grammarAccess.getTransitionAccess().getElaboratesAssignment_3_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1436:1: ( rule__Transition__ElaboratesAssignment_3_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1436:2: rule__Transition__ElaboratesAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__ElaboratesAssignment_3_1_in_rule__Transition__Group_3__1__Impl2855);
            rule__Transition__ElaboratesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getElaboratesAssignment_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Transition__Group_3__2"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1446:1: rule__Transition__Group_3__2 : rule__Transition__Group_3__2__Impl ;
    public final void rule__Transition__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1450:1: ( rule__Transition__Group_3__2__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1451:2: rule__Transition__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_3__2__Impl_in_rule__Transition__Group_3__22885);
            rule__Transition__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_3__2"


    // $ANTLR start "rule__Transition__Group_3__2__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1457:1: rule__Transition__Group_3__2__Impl : ( ( rule__Transition__Group_3_2__0 )* ) ;
    public final void rule__Transition__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1461:1: ( ( ( rule__Transition__Group_3_2__0 )* ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1462:1: ( ( rule__Transition__Group_3_2__0 )* )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1462:1: ( ( rule__Transition__Group_3_2__0 )* )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1463:1: ( rule__Transition__Group_3_2__0 )*
            {
             before(grammarAccess.getTransitionAccess().getGroup_3_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1464:1: ( rule__Transition__Group_3_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==15) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1464:2: rule__Transition__Group_3_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_3_2__0_in_rule__Transition__Group_3__2__Impl2912);
            	    rule__Transition__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getTransitionAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_3__2__Impl"


    // $ANTLR start "rule__Transition__Group_3_2__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1480:1: rule__Transition__Group_3_2__0 : rule__Transition__Group_3_2__0__Impl rule__Transition__Group_3_2__1 ;
    public final void rule__Transition__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1484:1: ( rule__Transition__Group_3_2__0__Impl rule__Transition__Group_3_2__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1485:2: rule__Transition__Group_3_2__0__Impl rule__Transition__Group_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_3_2__0__Impl_in_rule__Transition__Group_3_2__02949);
            rule__Transition__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_3_2__1_in_rule__Transition__Group_3_2__02952);
            rule__Transition__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_3_2__0"


    // $ANTLR start "rule__Transition__Group_3_2__0__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1492:1: rule__Transition__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Transition__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1496:1: ( ( ',' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1497:1: ( ',' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1497:1: ( ',' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1498:1: ','
            {
             before(grammarAccess.getTransitionAccess().getCommaKeyword_3_2_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Transition__Group_3_2__0__Impl2980); 
             after(grammarAccess.getTransitionAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_3_2__0__Impl"


    // $ANTLR start "rule__Transition__Group_3_2__1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1511:1: rule__Transition__Group_3_2__1 : rule__Transition__Group_3_2__1__Impl ;
    public final void rule__Transition__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1515:1: ( rule__Transition__Group_3_2__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1516:2: rule__Transition__Group_3_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_3_2__1__Impl_in_rule__Transition__Group_3_2__13011);
            rule__Transition__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_3_2__1"


    // $ANTLR start "rule__Transition__Group_3_2__1__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1522:1: rule__Transition__Group_3_2__1__Impl : ( ( rule__Transition__ElaboratesAssignment_3_2_1 ) ) ;
    public final void rule__Transition__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1526:1: ( ( ( rule__Transition__ElaboratesAssignment_3_2_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1527:1: ( ( rule__Transition__ElaboratesAssignment_3_2_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1527:1: ( ( rule__Transition__ElaboratesAssignment_3_2_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1528:1: ( rule__Transition__ElaboratesAssignment_3_2_1 )
            {
             before(grammarAccess.getTransitionAccess().getElaboratesAssignment_3_2_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1529:1: ( rule__Transition__ElaboratesAssignment_3_2_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1529:2: rule__Transition__ElaboratesAssignment_3_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__ElaboratesAssignment_3_2_1_in_rule__Transition__Group_3_2__1__Impl3038);
            rule__Transition__ElaboratesAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getElaboratesAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_3_2__1__Impl"


    // $ANTLR start "rule__State__Group__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1544:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1548:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1549:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__03073);
            rule__State__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group__1_in_rule__State__Group__03076);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1556:1: rule__State__Group__0__Impl : ( () ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1560:1: ( ( () ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1561:1: ( () )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1561:1: ( () )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1562:1: ()
            {
             before(grammarAccess.getStateAccess().getStateAction_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1563:1: ()
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1565:1: 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1575:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1579:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1580:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__13134);
            rule__State__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group__2_in_rule__State__Group__13137);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1587:1: rule__State__Group__1__Impl : ( 'State' ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1591:1: ( ( 'State' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1592:1: ( 'State' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1592:1: ( 'State' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1593:1: 'State'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_1()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__State__Group__1__Impl3165); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1606:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1610:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1611:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__23196);
            rule__State__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group__3_in_rule__State__Group__23199);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1618:1: rule__State__Group__2__Impl : ( ( rule__State__NameAssignment_2 ) ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1622:1: ( ( ( rule__State__NameAssignment_2 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1623:1: ( ( rule__State__NameAssignment_2 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1623:1: ( ( rule__State__NameAssignment_2 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1624:1: ( rule__State__NameAssignment_2 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1625:1: ( rule__State__NameAssignment_2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1625:2: rule__State__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__NameAssignment_2_in_rule__State__Group__2__Impl3226);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1635:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1639:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1640:2: rule__State__Group__3__Impl rule__State__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group__3__Impl_in_rule__State__Group__33256);
            rule__State__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group__4_in_rule__State__Group__33259);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1647:1: rule__State__Group__3__Impl : ( ( rule__State__Group_3__0 )? ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1651:1: ( ( ( rule__State__Group_3__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1652:1: ( ( rule__State__Group_3__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1652:1: ( ( rule__State__Group_3__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1653:1: ( rule__State__Group_3__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_3()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1654:1: ( rule__State__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1654:2: rule__State__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__State__Group_3__0_in_rule__State__Group__3__Impl3286);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1664:1: rule__State__Group__4 : rule__State__Group__4__Impl ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1668:1: ( rule__State__Group__4__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1669:2: rule__State__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group__4__Impl_in_rule__State__Group__43317);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1675:1: rule__State__Group__4__Impl : ( ( rule__State__Group_4__0 )? ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1679:1: ( ( ( rule__State__Group_4__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1680:1: ( ( rule__State__Group_4__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1680:1: ( ( rule__State__Group_4__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1681:1: ( rule__State__Group_4__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_4()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1682:1: ( rule__State__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1682:2: rule__State__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__State__Group_4__0_in_rule__State__Group__4__Impl3344);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1702:1: rule__State__Group_3__0 : rule__State__Group_3__0__Impl rule__State__Group_3__1 ;
    public final void rule__State__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1706:1: ( rule__State__Group_3__0__Impl rule__State__Group_3__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1707:2: rule__State__Group_3__0__Impl rule__State__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_3__0__Impl_in_rule__State__Group_3__03385);
            rule__State__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_3__1_in_rule__State__Group_3__03388);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1714:1: rule__State__Group_3__0__Impl : ( 'statemachines' ) ;
    public final void rule__State__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1718:1: ( ( 'statemachines' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1719:1: ( 'statemachines' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1719:1: ( 'statemachines' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1720:1: 'statemachines'
            {
             before(grammarAccess.getStateAccess().getStatemachinesKeyword_3_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__State__Group_3__0__Impl3416); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1733:1: rule__State__Group_3__1 : rule__State__Group_3__1__Impl rule__State__Group_3__2 ;
    public final void rule__State__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1737:1: ( rule__State__Group_3__1__Impl rule__State__Group_3__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1738:2: rule__State__Group_3__1__Impl rule__State__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_3__1__Impl_in_rule__State__Group_3__13447);
            rule__State__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_3__2_in_rule__State__Group_3__13450);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1745:1: rule__State__Group_3__1__Impl : ( '{' ) ;
    public final void rule__State__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1749:1: ( ( '{' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1750:1: ( '{' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1750:1: ( '{' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1751:1: '{'
            {
             before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__State__Group_3__1__Impl3478); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1764:1: rule__State__Group_3__2 : rule__State__Group_3__2__Impl rule__State__Group_3__3 ;
    public final void rule__State__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1768:1: ( rule__State__Group_3__2__Impl rule__State__Group_3__3 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1769:2: rule__State__Group_3__2__Impl rule__State__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_3__2__Impl_in_rule__State__Group_3__23509);
            rule__State__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_3__3_in_rule__State__Group_3__23512);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1776:1: rule__State__Group_3__2__Impl : ( ( rule__State__StatemachinesAssignment_3_2 ) ) ;
    public final void rule__State__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1780:1: ( ( ( rule__State__StatemachinesAssignment_3_2 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1781:1: ( ( rule__State__StatemachinesAssignment_3_2 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1781:1: ( ( rule__State__StatemachinesAssignment_3_2 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1782:1: ( rule__State__StatemachinesAssignment_3_2 )
            {
             before(grammarAccess.getStateAccess().getStatemachinesAssignment_3_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1783:1: ( rule__State__StatemachinesAssignment_3_2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1783:2: rule__State__StatemachinesAssignment_3_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__StatemachinesAssignment_3_2_in_rule__State__Group_3__2__Impl3539);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1793:1: rule__State__Group_3__3 : rule__State__Group_3__3__Impl rule__State__Group_3__4 ;
    public final void rule__State__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1797:1: ( rule__State__Group_3__3__Impl rule__State__Group_3__4 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1798:2: rule__State__Group_3__3__Impl rule__State__Group_3__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_3__3__Impl_in_rule__State__Group_3__33569);
            rule__State__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_3__4_in_rule__State__Group_3__33572);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1805:1: rule__State__Group_3__3__Impl : ( ( rule__State__Group_3_3__0 )* ) ;
    public final void rule__State__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1809:1: ( ( ( rule__State__Group_3_3__0 )* ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1810:1: ( ( rule__State__Group_3_3__0 )* )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1810:1: ( ( rule__State__Group_3_3__0 )* )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1811:1: ( rule__State__Group_3_3__0 )*
            {
             before(grammarAccess.getStateAccess().getGroup_3_3()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1812:1: ( rule__State__Group_3_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==15) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1812:2: rule__State__Group_3_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__State__Group_3_3__0_in_rule__State__Group_3__3__Impl3599);
            	    rule__State__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1822:1: rule__State__Group_3__4 : rule__State__Group_3__4__Impl ;
    public final void rule__State__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1826:1: ( rule__State__Group_3__4__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1827:2: rule__State__Group_3__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_3__4__Impl_in_rule__State__Group_3__43630);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1833:1: rule__State__Group_3__4__Impl : ( '}' ) ;
    public final void rule__State__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1837:1: ( ( '}' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1838:1: ( '}' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1838:1: ( '}' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1839:1: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__State__Group_3__4__Impl3658); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1862:1: rule__State__Group_3_3__0 : rule__State__Group_3_3__0__Impl rule__State__Group_3_3__1 ;
    public final void rule__State__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1866:1: ( rule__State__Group_3_3__0__Impl rule__State__Group_3_3__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1867:2: rule__State__Group_3_3__0__Impl rule__State__Group_3_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_3_3__0__Impl_in_rule__State__Group_3_3__03699);
            rule__State__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_3_3__1_in_rule__State__Group_3_3__03702);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1874:1: rule__State__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__State__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1878:1: ( ( ',' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1879:1: ( ',' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1879:1: ( ',' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1880:1: ','
            {
             before(grammarAccess.getStateAccess().getCommaKeyword_3_3_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__State__Group_3_3__0__Impl3730); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1893:1: rule__State__Group_3_3__1 : rule__State__Group_3_3__1__Impl ;
    public final void rule__State__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1897:1: ( rule__State__Group_3_3__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1898:2: rule__State__Group_3_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_3_3__1__Impl_in_rule__State__Group_3_3__13761);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1904:1: rule__State__Group_3_3__1__Impl : ( ( rule__State__StatemachinesAssignment_3_3_1 ) ) ;
    public final void rule__State__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1908:1: ( ( ( rule__State__StatemachinesAssignment_3_3_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1909:1: ( ( rule__State__StatemachinesAssignment_3_3_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1909:1: ( ( rule__State__StatemachinesAssignment_3_3_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1910:1: ( rule__State__StatemachinesAssignment_3_3_1 )
            {
             before(grammarAccess.getStateAccess().getStatemachinesAssignment_3_3_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1911:1: ( rule__State__StatemachinesAssignment_3_3_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1911:2: rule__State__StatemachinesAssignment_3_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__StatemachinesAssignment_3_3_1_in_rule__State__Group_3_3__1__Impl3788);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1925:1: rule__State__Group_4__0 : rule__State__Group_4__0__Impl rule__State__Group_4__1 ;
    public final void rule__State__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1929:1: ( rule__State__Group_4__0__Impl rule__State__Group_4__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1930:2: rule__State__Group_4__0__Impl rule__State__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_4__0__Impl_in_rule__State__Group_4__03822);
            rule__State__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_4__1_in_rule__State__Group_4__03825);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1937:1: rule__State__Group_4__0__Impl : ( 'invariants' ) ;
    public final void rule__State__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1941:1: ( ( 'invariants' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1942:1: ( 'invariants' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1942:1: ( 'invariants' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1943:1: 'invariants'
            {
             before(grammarAccess.getStateAccess().getInvariantsKeyword_4_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__State__Group_4__0__Impl3853); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1956:1: rule__State__Group_4__1 : rule__State__Group_4__1__Impl rule__State__Group_4__2 ;
    public final void rule__State__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1960:1: ( rule__State__Group_4__1__Impl rule__State__Group_4__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1961:2: rule__State__Group_4__1__Impl rule__State__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_4__1__Impl_in_rule__State__Group_4__13884);
            rule__State__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_4__2_in_rule__State__Group_4__13887);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1968:1: rule__State__Group_4__1__Impl : ( '{' ) ;
    public final void rule__State__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1972:1: ( ( '{' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1973:1: ( '{' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1973:1: ( '{' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1974:1: '{'
            {
             before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__State__Group_4__1__Impl3915); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1987:1: rule__State__Group_4__2 : rule__State__Group_4__2__Impl rule__State__Group_4__3 ;
    public final void rule__State__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1991:1: ( rule__State__Group_4__2__Impl rule__State__Group_4__3 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1992:2: rule__State__Group_4__2__Impl rule__State__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_4__2__Impl_in_rule__State__Group_4__23946);
            rule__State__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_4__3_in_rule__State__Group_4__23949);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1999:1: rule__State__Group_4__2__Impl : ( ( rule__State__InvariantsAssignment_4_2 ) ) ;
    public final void rule__State__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2003:1: ( ( ( rule__State__InvariantsAssignment_4_2 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2004:1: ( ( rule__State__InvariantsAssignment_4_2 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2004:1: ( ( rule__State__InvariantsAssignment_4_2 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2005:1: ( rule__State__InvariantsAssignment_4_2 )
            {
             before(grammarAccess.getStateAccess().getInvariantsAssignment_4_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2006:1: ( rule__State__InvariantsAssignment_4_2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2006:2: rule__State__InvariantsAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__InvariantsAssignment_4_2_in_rule__State__Group_4__2__Impl3976);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2016:1: rule__State__Group_4__3 : rule__State__Group_4__3__Impl rule__State__Group_4__4 ;
    public final void rule__State__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2020:1: ( rule__State__Group_4__3__Impl rule__State__Group_4__4 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2021:2: rule__State__Group_4__3__Impl rule__State__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_4__3__Impl_in_rule__State__Group_4__34006);
            rule__State__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_4__4_in_rule__State__Group_4__34009);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2028:1: rule__State__Group_4__3__Impl : ( ( rule__State__Group_4_3__0 )* ) ;
    public final void rule__State__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2032:1: ( ( ( rule__State__Group_4_3__0 )* ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2033:1: ( ( rule__State__Group_4_3__0 )* )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2033:1: ( ( rule__State__Group_4_3__0 )* )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2034:1: ( rule__State__Group_4_3__0 )*
            {
             before(grammarAccess.getStateAccess().getGroup_4_3()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2035:1: ( rule__State__Group_4_3__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==15) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2035:2: rule__State__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__State__Group_4_3__0_in_rule__State__Group_4__3__Impl4036);
            	    rule__State__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2045:1: rule__State__Group_4__4 : rule__State__Group_4__4__Impl ;
    public final void rule__State__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2049:1: ( rule__State__Group_4__4__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2050:2: rule__State__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_4__4__Impl_in_rule__State__Group_4__44067);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2056:1: rule__State__Group_4__4__Impl : ( '}' ) ;
    public final void rule__State__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2060:1: ( ( '}' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2061:1: ( '}' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2061:1: ( '}' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2062:1: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__State__Group_4__4__Impl4095); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2085:1: rule__State__Group_4_3__0 : rule__State__Group_4_3__0__Impl rule__State__Group_4_3__1 ;
    public final void rule__State__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2089:1: ( rule__State__Group_4_3__0__Impl rule__State__Group_4_3__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2090:2: rule__State__Group_4_3__0__Impl rule__State__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_4_3__0__Impl_in_rule__State__Group_4_3__04136);
            rule__State__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_4_3__1_in_rule__State__Group_4_3__04139);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2097:1: rule__State__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__State__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2101:1: ( ( ',' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2102:1: ( ',' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2102:1: ( ',' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2103:1: ','
            {
             before(grammarAccess.getStateAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__State__Group_4_3__0__Impl4167); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2116:1: rule__State__Group_4_3__1 : rule__State__Group_4_3__1__Impl ;
    public final void rule__State__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2120:1: ( rule__State__Group_4_3__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2121:2: rule__State__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_4_3__1__Impl_in_rule__State__Group_4_3__14198);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2127:1: rule__State__Group_4_3__1__Impl : ( ( rule__State__InvariantsAssignment_4_3_1 ) ) ;
    public final void rule__State__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2131:1: ( ( ( rule__State__InvariantsAssignment_4_3_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2132:1: ( ( rule__State__InvariantsAssignment_4_3_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2132:1: ( ( rule__State__InvariantsAssignment_4_3_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2133:1: ( rule__State__InvariantsAssignment_4_3_1 )
            {
             before(grammarAccess.getStateAccess().getInvariantsAssignment_4_3_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2134:1: ( rule__State__InvariantsAssignment_4_3_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2134:2: rule__State__InvariantsAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__InvariantsAssignment_4_3_1_in_rule__State__Group_4_3__1__Impl4225);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2148:1: rule__Initial__Group__0 : rule__Initial__Group__0__Impl rule__Initial__Group__1 ;
    public final void rule__Initial__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2152:1: ( rule__Initial__Group__0__Impl rule__Initial__Group__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2153:2: rule__Initial__Group__0__Impl rule__Initial__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Initial__Group__0__Impl_in_rule__Initial__Group__04259);
            rule__Initial__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Initial__Group__1_in_rule__Initial__Group__04262);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2160:1: rule__Initial__Group__0__Impl : ( () ) ;
    public final void rule__Initial__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2164:1: ( ( () ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2165:1: ( () )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2165:1: ( () )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2166:1: ()
            {
             before(grammarAccess.getInitialAccess().getInitialAction_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2167:1: ()
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2169:1: 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2179:1: rule__Initial__Group__1 : rule__Initial__Group__1__Impl rule__Initial__Group__2 ;
    public final void rule__Initial__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2183:1: ( rule__Initial__Group__1__Impl rule__Initial__Group__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2184:2: rule__Initial__Group__1__Impl rule__Initial__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Initial__Group__1__Impl_in_rule__Initial__Group__14320);
            rule__Initial__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Initial__Group__2_in_rule__Initial__Group__14323);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2191:1: rule__Initial__Group__1__Impl : ( 'Initial' ) ;
    public final void rule__Initial__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2195:1: ( ( 'Initial' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2196:1: ( 'Initial' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2196:1: ( 'Initial' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2197:1: 'Initial'
            {
             before(grammarAccess.getInitialAccess().getInitialKeyword_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Initial__Group__1__Impl4351); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2210:1: rule__Initial__Group__2 : rule__Initial__Group__2__Impl ;
    public final void rule__Initial__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2214:1: ( rule__Initial__Group__2__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2215:2: rule__Initial__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Initial__Group__2__Impl_in_rule__Initial__Group__24382);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2221:1: rule__Initial__Group__2__Impl : ( ( rule__Initial__Group_2__0 )? ) ;
    public final void rule__Initial__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2225:1: ( ( ( rule__Initial__Group_2__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2226:1: ( ( rule__Initial__Group_2__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2226:1: ( ( rule__Initial__Group_2__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2227:1: ( rule__Initial__Group_2__0 )?
            {
             before(grammarAccess.getInitialAccess().getGroup_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2228:1: ( rule__Initial__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2228:2: rule__Initial__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Initial__Group_2__0_in_rule__Initial__Group__2__Impl4409);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2244:1: rule__Initial__Group_2__0 : rule__Initial__Group_2__0__Impl rule__Initial__Group_2__1 ;
    public final void rule__Initial__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2248:1: ( rule__Initial__Group_2__0__Impl rule__Initial__Group_2__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2249:2: rule__Initial__Group_2__0__Impl rule__Initial__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Initial__Group_2__0__Impl_in_rule__Initial__Group_2__04446);
            rule__Initial__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Initial__Group_2__1_in_rule__Initial__Group_2__04449);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2256:1: rule__Initial__Group_2__0__Impl : ( 'internalId' ) ;
    public final void rule__Initial__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2260:1: ( ( 'internalId' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2261:1: ( 'internalId' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2261:1: ( 'internalId' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2262:1: 'internalId'
            {
             before(grammarAccess.getInitialAccess().getInternalIdKeyword_2_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Initial__Group_2__0__Impl4477); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2275:1: rule__Initial__Group_2__1 : rule__Initial__Group_2__1__Impl ;
    public final void rule__Initial__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2279:1: ( rule__Initial__Group_2__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2280:2: rule__Initial__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Initial__Group_2__1__Impl_in_rule__Initial__Group_2__14508);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2286:1: rule__Initial__Group_2__1__Impl : ( ( rule__Initial__InternalIdAssignment_2_1 ) ) ;
    public final void rule__Initial__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2290:1: ( ( ( rule__Initial__InternalIdAssignment_2_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2291:1: ( ( rule__Initial__InternalIdAssignment_2_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2291:1: ( ( rule__Initial__InternalIdAssignment_2_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2292:1: ( rule__Initial__InternalIdAssignment_2_1 )
            {
             before(grammarAccess.getInitialAccess().getInternalIdAssignment_2_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2293:1: ( rule__Initial__InternalIdAssignment_2_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2293:2: rule__Initial__InternalIdAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Initial__InternalIdAssignment_2_1_in_rule__Initial__Group_2__1__Impl4535);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2307:1: rule__Final__Group__0 : rule__Final__Group__0__Impl rule__Final__Group__1 ;
    public final void rule__Final__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2311:1: ( rule__Final__Group__0__Impl rule__Final__Group__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2312:2: rule__Final__Group__0__Impl rule__Final__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Final__Group__0__Impl_in_rule__Final__Group__04569);
            rule__Final__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Final__Group__1_in_rule__Final__Group__04572);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2319:1: rule__Final__Group__0__Impl : ( () ) ;
    public final void rule__Final__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2323:1: ( ( () ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2324:1: ( () )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2324:1: ( () )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2325:1: ()
            {
             before(grammarAccess.getFinalAccess().getFinalAction_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2326:1: ()
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2328:1: 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2338:1: rule__Final__Group__1 : rule__Final__Group__1__Impl rule__Final__Group__2 ;
    public final void rule__Final__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2342:1: ( rule__Final__Group__1__Impl rule__Final__Group__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2343:2: rule__Final__Group__1__Impl rule__Final__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Final__Group__1__Impl_in_rule__Final__Group__14630);
            rule__Final__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Final__Group__2_in_rule__Final__Group__14633);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2350:1: rule__Final__Group__1__Impl : ( 'Final' ) ;
    public final void rule__Final__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2354:1: ( ( 'Final' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2355:1: ( 'Final' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2355:1: ( 'Final' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2356:1: 'Final'
            {
             before(grammarAccess.getFinalAccess().getFinalKeyword_1()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Final__Group__1__Impl4661); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2369:1: rule__Final__Group__2 : rule__Final__Group__2__Impl ;
    public final void rule__Final__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2373:1: ( rule__Final__Group__2__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2374:2: rule__Final__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Final__Group__2__Impl_in_rule__Final__Group__24692);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2380:1: rule__Final__Group__2__Impl : ( ( rule__Final__Group_2__0 )? ) ;
    public final void rule__Final__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2384:1: ( ( ( rule__Final__Group_2__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2385:1: ( ( rule__Final__Group_2__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2385:1: ( ( rule__Final__Group_2__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2386:1: ( rule__Final__Group_2__0 )?
            {
             before(grammarAccess.getFinalAccess().getGroup_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2387:1: ( rule__Final__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2387:2: rule__Final__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Final__Group_2__0_in_rule__Final__Group__2__Impl4719);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2403:1: rule__Final__Group_2__0 : rule__Final__Group_2__0__Impl rule__Final__Group_2__1 ;
    public final void rule__Final__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2407:1: ( rule__Final__Group_2__0__Impl rule__Final__Group_2__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2408:2: rule__Final__Group_2__0__Impl rule__Final__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Final__Group_2__0__Impl_in_rule__Final__Group_2__04756);
            rule__Final__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Final__Group_2__1_in_rule__Final__Group_2__04759);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2415:1: rule__Final__Group_2__0__Impl : ( 'internalId' ) ;
    public final void rule__Final__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2419:1: ( ( 'internalId' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2420:1: ( 'internalId' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2420:1: ( 'internalId' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2421:1: 'internalId'
            {
             before(grammarAccess.getFinalAccess().getInternalIdKeyword_2_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Final__Group_2__0__Impl4787); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2434:1: rule__Final__Group_2__1 : rule__Final__Group_2__1__Impl ;
    public final void rule__Final__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2438:1: ( rule__Final__Group_2__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2439:2: rule__Final__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Final__Group_2__1__Impl_in_rule__Final__Group_2__14818);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2445:1: rule__Final__Group_2__1__Impl : ( ( rule__Final__InternalIdAssignment_2_1 ) ) ;
    public final void rule__Final__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2449:1: ( ( ( rule__Final__InternalIdAssignment_2_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2450:1: ( ( rule__Final__InternalIdAssignment_2_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2450:1: ( ( rule__Final__InternalIdAssignment_2_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2451:1: ( rule__Final__InternalIdAssignment_2_1 )
            {
             before(grammarAccess.getFinalAccess().getInternalIdAssignment_2_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2452:1: ( rule__Final__InternalIdAssignment_2_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2452:2: rule__Final__InternalIdAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Final__InternalIdAssignment_2_1_in_rule__Final__Group_2__1__Impl4845);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2466:1: rule__Any__Group__0 : rule__Any__Group__0__Impl rule__Any__Group__1 ;
    public final void rule__Any__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2470:1: ( rule__Any__Group__0__Impl rule__Any__Group__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2471:2: rule__Any__Group__0__Impl rule__Any__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Any__Group__0__Impl_in_rule__Any__Group__04879);
            rule__Any__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Any__Group__1_in_rule__Any__Group__04882);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2478:1: rule__Any__Group__0__Impl : ( () ) ;
    public final void rule__Any__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2482:1: ( ( () ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2483:1: ( () )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2483:1: ( () )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2484:1: ()
            {
             before(grammarAccess.getAnyAccess().getAnyAction_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2485:1: ()
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2487:1: 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2497:1: rule__Any__Group__1 : rule__Any__Group__1__Impl rule__Any__Group__2 ;
    public final void rule__Any__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2501:1: ( rule__Any__Group__1__Impl rule__Any__Group__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2502:2: rule__Any__Group__1__Impl rule__Any__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Any__Group__1__Impl_in_rule__Any__Group__14940);
            rule__Any__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Any__Group__2_in_rule__Any__Group__14943);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2509:1: rule__Any__Group__1__Impl : ( 'Any' ) ;
    public final void rule__Any__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2513:1: ( ( 'Any' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2514:1: ( 'Any' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2514:1: ( 'Any' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2515:1: 'Any'
            {
             before(grammarAccess.getAnyAccess().getAnyKeyword_1()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Any__Group__1__Impl4971); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2528:1: rule__Any__Group__2 : rule__Any__Group__2__Impl ;
    public final void rule__Any__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2532:1: ( rule__Any__Group__2__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2533:2: rule__Any__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Any__Group__2__Impl_in_rule__Any__Group__25002);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2539:1: rule__Any__Group__2__Impl : ( ( rule__Any__Group_2__0 )? ) ;
    public final void rule__Any__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2543:1: ( ( ( rule__Any__Group_2__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2544:1: ( ( rule__Any__Group_2__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2544:1: ( ( rule__Any__Group_2__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2545:1: ( rule__Any__Group_2__0 )?
            {
             before(grammarAccess.getAnyAccess().getGroup_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2546:1: ( rule__Any__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2546:2: rule__Any__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Any__Group_2__0_in_rule__Any__Group__2__Impl5029);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2562:1: rule__Any__Group_2__0 : rule__Any__Group_2__0__Impl rule__Any__Group_2__1 ;
    public final void rule__Any__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2566:1: ( rule__Any__Group_2__0__Impl rule__Any__Group_2__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2567:2: rule__Any__Group_2__0__Impl rule__Any__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Any__Group_2__0__Impl_in_rule__Any__Group_2__05066);
            rule__Any__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Any__Group_2__1_in_rule__Any__Group_2__05069);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2574:1: rule__Any__Group_2__0__Impl : ( 'internalId' ) ;
    public final void rule__Any__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2578:1: ( ( 'internalId' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2579:1: ( 'internalId' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2579:1: ( 'internalId' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2580:1: 'internalId'
            {
             before(grammarAccess.getAnyAccess().getInternalIdKeyword_2_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Any__Group_2__0__Impl5097); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2593:1: rule__Any__Group_2__1 : rule__Any__Group_2__1__Impl ;
    public final void rule__Any__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2597:1: ( rule__Any__Group_2__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2598:2: rule__Any__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Any__Group_2__1__Impl_in_rule__Any__Group_2__15128);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2604:1: rule__Any__Group_2__1__Impl : ( ( rule__Any__InternalIdAssignment_2_1 ) ) ;
    public final void rule__Any__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2608:1: ( ( ( rule__Any__InternalIdAssignment_2_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2609:1: ( ( rule__Any__InternalIdAssignment_2_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2609:1: ( ( rule__Any__InternalIdAssignment_2_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2610:1: ( rule__Any__InternalIdAssignment_2_1 )
            {
             before(grammarAccess.getAnyAccess().getInternalIdAssignment_2_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2611:1: ( rule__Any__InternalIdAssignment_2_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2611:2: rule__Any__InternalIdAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Any__InternalIdAssignment_2_1_in_rule__Any__Group_2__1__Impl5155);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2625:1: rule__Junction__Group__0 : rule__Junction__Group__0__Impl rule__Junction__Group__1 ;
    public final void rule__Junction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2629:1: ( rule__Junction__Group__0__Impl rule__Junction__Group__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2630:2: rule__Junction__Group__0__Impl rule__Junction__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Junction__Group__0__Impl_in_rule__Junction__Group__05189);
            rule__Junction__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Junction__Group__1_in_rule__Junction__Group__05192);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2637:1: rule__Junction__Group__0__Impl : ( () ) ;
    public final void rule__Junction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2641:1: ( ( () ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2642:1: ( () )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2642:1: ( () )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2643:1: ()
            {
             before(grammarAccess.getJunctionAccess().getJunctionAction_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2644:1: ()
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2646:1: 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2656:1: rule__Junction__Group__1 : rule__Junction__Group__1__Impl rule__Junction__Group__2 ;
    public final void rule__Junction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2660:1: ( rule__Junction__Group__1__Impl rule__Junction__Group__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2661:2: rule__Junction__Group__1__Impl rule__Junction__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Junction__Group__1__Impl_in_rule__Junction__Group__15250);
            rule__Junction__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Junction__Group__2_in_rule__Junction__Group__15253);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2668:1: rule__Junction__Group__1__Impl : ( 'Junction' ) ;
    public final void rule__Junction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2672:1: ( ( 'Junction' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2673:1: ( 'Junction' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2673:1: ( 'Junction' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2674:1: 'Junction'
            {
             before(grammarAccess.getJunctionAccess().getJunctionKeyword_1()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Junction__Group__1__Impl5281); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2687:1: rule__Junction__Group__2 : rule__Junction__Group__2__Impl ;
    public final void rule__Junction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2691:1: ( rule__Junction__Group__2__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2692:2: rule__Junction__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Junction__Group__2__Impl_in_rule__Junction__Group__25312);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2698:1: rule__Junction__Group__2__Impl : ( ( rule__Junction__Group_2__0 )? ) ;
    public final void rule__Junction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2702:1: ( ( ( rule__Junction__Group_2__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2703:1: ( ( rule__Junction__Group_2__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2703:1: ( ( rule__Junction__Group_2__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2704:1: ( rule__Junction__Group_2__0 )?
            {
             before(grammarAccess.getJunctionAccess().getGroup_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2705:1: ( rule__Junction__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==27) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2705:2: rule__Junction__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Junction__Group_2__0_in_rule__Junction__Group__2__Impl5339);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2721:1: rule__Junction__Group_2__0 : rule__Junction__Group_2__0__Impl rule__Junction__Group_2__1 ;
    public final void rule__Junction__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2725:1: ( rule__Junction__Group_2__0__Impl rule__Junction__Group_2__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2726:2: rule__Junction__Group_2__0__Impl rule__Junction__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Junction__Group_2__0__Impl_in_rule__Junction__Group_2__05376);
            rule__Junction__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Junction__Group_2__1_in_rule__Junction__Group_2__05379);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2733:1: rule__Junction__Group_2__0__Impl : ( 'internalId' ) ;
    public final void rule__Junction__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2737:1: ( ( 'internalId' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2738:1: ( 'internalId' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2738:1: ( 'internalId' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2739:1: 'internalId'
            {
             before(grammarAccess.getJunctionAccess().getInternalIdKeyword_2_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Junction__Group_2__0__Impl5407); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2752:1: rule__Junction__Group_2__1 : rule__Junction__Group_2__1__Impl ;
    public final void rule__Junction__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2756:1: ( rule__Junction__Group_2__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2757:2: rule__Junction__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Junction__Group_2__1__Impl_in_rule__Junction__Group_2__15438);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2763:1: rule__Junction__Group_2__1__Impl : ( ( rule__Junction__InternalIdAssignment_2_1 ) ) ;
    public final void rule__Junction__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2767:1: ( ( ( rule__Junction__InternalIdAssignment_2_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2768:1: ( ( rule__Junction__InternalIdAssignment_2_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2768:1: ( ( rule__Junction__InternalIdAssignment_2_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2769:1: ( rule__Junction__InternalIdAssignment_2_1 )
            {
             before(grammarAccess.getJunctionAccess().getInternalIdAssignment_2_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2770:1: ( rule__Junction__InternalIdAssignment_2_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2770:2: rule__Junction__InternalIdAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Junction__InternalIdAssignment_2_1_in_rule__Junction__Group_2__1__Impl5465);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2784:1: rule__Fork__Group__0 : rule__Fork__Group__0__Impl rule__Fork__Group__1 ;
    public final void rule__Fork__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2788:1: ( rule__Fork__Group__0__Impl rule__Fork__Group__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2789:2: rule__Fork__Group__0__Impl rule__Fork__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fork__Group__0__Impl_in_rule__Fork__Group__05499);
            rule__Fork__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fork__Group__1_in_rule__Fork__Group__05502);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2796:1: rule__Fork__Group__0__Impl : ( () ) ;
    public final void rule__Fork__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2800:1: ( ( () ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2801:1: ( () )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2801:1: ( () )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2802:1: ()
            {
             before(grammarAccess.getForkAccess().getForkAction_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2803:1: ()
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2805:1: 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2815:1: rule__Fork__Group__1 : rule__Fork__Group__1__Impl rule__Fork__Group__2 ;
    public final void rule__Fork__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2819:1: ( rule__Fork__Group__1__Impl rule__Fork__Group__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2820:2: rule__Fork__Group__1__Impl rule__Fork__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fork__Group__1__Impl_in_rule__Fork__Group__15560);
            rule__Fork__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fork__Group__2_in_rule__Fork__Group__15563);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2827:1: rule__Fork__Group__1__Impl : ( 'Fork' ) ;
    public final void rule__Fork__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2831:1: ( ( 'Fork' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2832:1: ( 'Fork' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2832:1: ( 'Fork' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2833:1: 'Fork'
            {
             before(grammarAccess.getForkAccess().getForkKeyword_1()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Fork__Group__1__Impl5591); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2846:1: rule__Fork__Group__2 : rule__Fork__Group__2__Impl ;
    public final void rule__Fork__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2850:1: ( rule__Fork__Group__2__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2851:2: rule__Fork__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fork__Group__2__Impl_in_rule__Fork__Group__25622);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2857:1: rule__Fork__Group__2__Impl : ( ( rule__Fork__Group_2__0 )? ) ;
    public final void rule__Fork__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2861:1: ( ( ( rule__Fork__Group_2__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2862:1: ( ( rule__Fork__Group_2__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2862:1: ( ( rule__Fork__Group_2__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2863:1: ( rule__Fork__Group_2__0 )?
            {
             before(grammarAccess.getForkAccess().getGroup_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2864:1: ( rule__Fork__Group_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==27) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2864:2: rule__Fork__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Fork__Group_2__0_in_rule__Fork__Group__2__Impl5649);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2880:1: rule__Fork__Group_2__0 : rule__Fork__Group_2__0__Impl rule__Fork__Group_2__1 ;
    public final void rule__Fork__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2884:1: ( rule__Fork__Group_2__0__Impl rule__Fork__Group_2__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2885:2: rule__Fork__Group_2__0__Impl rule__Fork__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fork__Group_2__0__Impl_in_rule__Fork__Group_2__05686);
            rule__Fork__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fork__Group_2__1_in_rule__Fork__Group_2__05689);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2892:1: rule__Fork__Group_2__0__Impl : ( 'internalId' ) ;
    public final void rule__Fork__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2896:1: ( ( 'internalId' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2897:1: ( 'internalId' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2897:1: ( 'internalId' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2898:1: 'internalId'
            {
             before(grammarAccess.getForkAccess().getInternalIdKeyword_2_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Fork__Group_2__0__Impl5717); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2911:1: rule__Fork__Group_2__1 : rule__Fork__Group_2__1__Impl ;
    public final void rule__Fork__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2915:1: ( rule__Fork__Group_2__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2916:2: rule__Fork__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fork__Group_2__1__Impl_in_rule__Fork__Group_2__15748);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2922:1: rule__Fork__Group_2__1__Impl : ( ( rule__Fork__InternalIdAssignment_2_1 ) ) ;
    public final void rule__Fork__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2926:1: ( ( ( rule__Fork__InternalIdAssignment_2_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2927:1: ( ( rule__Fork__InternalIdAssignment_2_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2927:1: ( ( rule__Fork__InternalIdAssignment_2_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2928:1: ( rule__Fork__InternalIdAssignment_2_1 )
            {
             before(grammarAccess.getForkAccess().getInternalIdAssignment_2_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2929:1: ( rule__Fork__InternalIdAssignment_2_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2929:2: rule__Fork__InternalIdAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fork__InternalIdAssignment_2_1_in_rule__Fork__Group_2__1__Impl5775);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2943:1: rule__Invariant__Group__0 : rule__Invariant__Group__0__Impl rule__Invariant__Group__1 ;
    public final void rule__Invariant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2947:1: ( rule__Invariant__Group__0__Impl rule__Invariant__Group__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2948:2: rule__Invariant__Group__0__Impl rule__Invariant__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__0__Impl_in_rule__Invariant__Group__05809);
            rule__Invariant__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__1_in_rule__Invariant__Group__05812);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2955:1: rule__Invariant__Group__0__Impl : ( 'Invariant' ) ;
    public final void rule__Invariant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2959:1: ( ( 'Invariant' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2960:1: ( 'Invariant' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2960:1: ( 'Invariant' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2961:1: 'Invariant'
            {
             before(grammarAccess.getInvariantAccess().getInvariantKeyword_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Invariant__Group__0__Impl5840); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2974:1: rule__Invariant__Group__1 : rule__Invariant__Group__1__Impl rule__Invariant__Group__2 ;
    public final void rule__Invariant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2978:1: ( rule__Invariant__Group__1__Impl rule__Invariant__Group__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2979:2: rule__Invariant__Group__1__Impl rule__Invariant__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__1__Impl_in_rule__Invariant__Group__15871);
            rule__Invariant__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__2_in_rule__Invariant__Group__15874);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2986:1: rule__Invariant__Group__1__Impl : ( '@' ) ;
    public final void rule__Invariant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2990:1: ( ( '@' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2991:1: ( '@' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2991:1: ( '@' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2992:1: '@'
            {
             before(grammarAccess.getInvariantAccess().getCommercialAtKeyword_1()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Invariant__Group__1__Impl5902); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3005:1: rule__Invariant__Group__2 : rule__Invariant__Group__2__Impl rule__Invariant__Group__3 ;
    public final void rule__Invariant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3009:1: ( rule__Invariant__Group__2__Impl rule__Invariant__Group__3 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3010:2: rule__Invariant__Group__2__Impl rule__Invariant__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__2__Impl_in_rule__Invariant__Group__25933);
            rule__Invariant__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__3_in_rule__Invariant__Group__25936);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3017:1: rule__Invariant__Group__2__Impl : ( ( rule__Invariant__NameAssignment_2 ) ) ;
    public final void rule__Invariant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3021:1: ( ( ( rule__Invariant__NameAssignment_2 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3022:1: ( ( rule__Invariant__NameAssignment_2 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3022:1: ( ( rule__Invariant__NameAssignment_2 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3023:1: ( rule__Invariant__NameAssignment_2 )
            {
             before(grammarAccess.getInvariantAccess().getNameAssignment_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3024:1: ( rule__Invariant__NameAssignment_2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3024:2: rule__Invariant__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__NameAssignment_2_in_rule__Invariant__Group__2__Impl5963);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3034:1: rule__Invariant__Group__3 : rule__Invariant__Group__3__Impl rule__Invariant__Group__4 ;
    public final void rule__Invariant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3038:1: ( rule__Invariant__Group__3__Impl rule__Invariant__Group__4 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3039:2: rule__Invariant__Group__3__Impl rule__Invariant__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__3__Impl_in_rule__Invariant__Group__35993);
            rule__Invariant__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__4_in_rule__Invariant__Group__35996);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3046:1: rule__Invariant__Group__3__Impl : ( ( rule__Invariant__TheoremAssignment_3 )? ) ;
    public final void rule__Invariant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3050:1: ( ( ( rule__Invariant__TheoremAssignment_3 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3051:1: ( ( rule__Invariant__TheoremAssignment_3 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3051:1: ( ( rule__Invariant__TheoremAssignment_3 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3052:1: ( rule__Invariant__TheoremAssignment_3 )?
            {
             before(grammarAccess.getInvariantAccess().getTheoremAssignment_3()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3053:1: ( rule__Invariant__TheoremAssignment_3 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==36) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3053:2: rule__Invariant__TheoremAssignment_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Invariant__TheoremAssignment_3_in_rule__Invariant__Group__3__Impl6023);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3063:1: rule__Invariant__Group__4 : rule__Invariant__Group__4__Impl rule__Invariant__Group__5 ;
    public final void rule__Invariant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3067:1: ( rule__Invariant__Group__4__Impl rule__Invariant__Group__5 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3068:2: rule__Invariant__Group__4__Impl rule__Invariant__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__4__Impl_in_rule__Invariant__Group__46054);
            rule__Invariant__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__5_in_rule__Invariant__Group__46057);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3075:1: rule__Invariant__Group__4__Impl : ( ( rule__Invariant__Group_4__0 )? ) ;
    public final void rule__Invariant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3079:1: ( ( ( rule__Invariant__Group_4__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3080:1: ( ( rule__Invariant__Group_4__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3080:1: ( ( rule__Invariant__Group_4__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3081:1: ( rule__Invariant__Group_4__0 )?
            {
             before(grammarAccess.getInvariantAccess().getGroup_4()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3082:1: ( rule__Invariant__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==20) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3082:2: rule__Invariant__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group_4__0_in_rule__Invariant__Group__4__Impl6084);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3092:1: rule__Invariant__Group__5 : rule__Invariant__Group__5__Impl rule__Invariant__Group__6 ;
    public final void rule__Invariant__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3096:1: ( rule__Invariant__Group__5__Impl rule__Invariant__Group__6 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3097:2: rule__Invariant__Group__5__Impl rule__Invariant__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__5__Impl_in_rule__Invariant__Group__56115);
            rule__Invariant__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__6_in_rule__Invariant__Group__56118);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3104:1: rule__Invariant__Group__5__Impl : ( 'predicate' ) ;
    public final void rule__Invariant__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3108:1: ( ( 'predicate' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3109:1: ( 'predicate' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3109:1: ( 'predicate' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3110:1: 'predicate'
            {
             before(grammarAccess.getInvariantAccess().getPredicateKeyword_5()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Invariant__Group__5__Impl6146); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3123:1: rule__Invariant__Group__6 : rule__Invariant__Group__6__Impl ;
    public final void rule__Invariant__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3127:1: ( rule__Invariant__Group__6__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3128:2: rule__Invariant__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__6__Impl_in_rule__Invariant__Group__66177);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3134:1: rule__Invariant__Group__6__Impl : ( ( rule__Invariant__PredicateAssignment_6 ) ) ;
    public final void rule__Invariant__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3138:1: ( ( ( rule__Invariant__PredicateAssignment_6 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3139:1: ( ( rule__Invariant__PredicateAssignment_6 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3139:1: ( ( rule__Invariant__PredicateAssignment_6 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3140:1: ( rule__Invariant__PredicateAssignment_6 )
            {
             before(grammarAccess.getInvariantAccess().getPredicateAssignment_6()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3141:1: ( rule__Invariant__PredicateAssignment_6 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3141:2: rule__Invariant__PredicateAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__PredicateAssignment_6_in_rule__Invariant__Group__6__Impl6204);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3165:1: rule__Invariant__Group_4__0 : rule__Invariant__Group_4__0__Impl rule__Invariant__Group_4__1 ;
    public final void rule__Invariant__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3169:1: ( rule__Invariant__Group_4__0__Impl rule__Invariant__Group_4__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3170:2: rule__Invariant__Group_4__0__Impl rule__Invariant__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group_4__0__Impl_in_rule__Invariant__Group_4__06248);
            rule__Invariant__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group_4__1_in_rule__Invariant__Group_4__06251);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3177:1: rule__Invariant__Group_4__0__Impl : ( 'comment' ) ;
    public final void rule__Invariant__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3181:1: ( ( 'comment' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3182:1: ( 'comment' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3182:1: ( 'comment' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3183:1: 'comment'
            {
             before(grammarAccess.getInvariantAccess().getCommentKeyword_4_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Invariant__Group_4__0__Impl6279); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3196:1: rule__Invariant__Group_4__1 : rule__Invariant__Group_4__1__Impl ;
    public final void rule__Invariant__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3200:1: ( rule__Invariant__Group_4__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3201:2: rule__Invariant__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group_4__1__Impl_in_rule__Invariant__Group_4__16310);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3207:1: rule__Invariant__Group_4__1__Impl : ( ( rule__Invariant__CommentAssignment_4_1 ) ) ;
    public final void rule__Invariant__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3211:1: ( ( ( rule__Invariant__CommentAssignment_4_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3212:1: ( ( rule__Invariant__CommentAssignment_4_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3212:1: ( ( rule__Invariant__CommentAssignment_4_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3213:1: ( rule__Invariant__CommentAssignment_4_1 )
            {
             before(grammarAccess.getInvariantAccess().getCommentAssignment_4_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3214:1: ( rule__Invariant__CommentAssignment_4_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3214:2: rule__Invariant__CommentAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__CommentAssignment_4_1_in_rule__Invariant__Group_4__1__Impl6337);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3229:1: rule__Statemachine__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Statemachine__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3233:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3234:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3234:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3235:1: ruleEString
            {
             before(grammarAccess.getStatemachineAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Statemachine__NameAssignment_16376);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3244:1: rule__Statemachine__ElaboratesAssignment_2_1 : ( ( ruleEString ) ) ;
    public final void rule__Statemachine__ElaboratesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3248:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3249:1: ( ( ruleEString ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3249:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3250:1: ( ruleEString )
            {
             before(grammarAccess.getStatemachineAccess().getElaboratesEventBNamedCrossReference_2_1_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3251:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3252:1: ruleEString
            {
             before(grammarAccess.getStatemachineAccess().getElaboratesEventBNamedEStringParserRuleCall_2_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Statemachine__ElaboratesAssignment_2_16411);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3263:1: rule__Statemachine__RefinesAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Statemachine__RefinesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3267:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3268:1: ( ( ruleEString ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3268:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3269:1: ( ruleEString )
            {
             before(grammarAccess.getStatemachineAccess().getRefinesStatemachineCrossReference_3_1_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3270:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3271:1: ruleEString
            {
             before(grammarAccess.getStatemachineAccess().getRefinesStatemachineEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Statemachine__RefinesAssignment_3_16450);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3282:1: rule__Statemachine__NodesAssignment_4_1 : ( ruleAbstractNode ) ;
    public final void rule__Statemachine__NodesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3286:1: ( ( ruleAbstractNode ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3287:1: ( ruleAbstractNode )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3287:1: ( ruleAbstractNode )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3288:1: ruleAbstractNode
            {
             before(grammarAccess.getStatemachineAccess().getNodesAbstractNodeParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractNode_in_rule__Statemachine__NodesAssignment_4_16485);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3297:1: rule__Statemachine__NodesAssignment_4_2_1 : ( ruleAbstractNode ) ;
    public final void rule__Statemachine__NodesAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3301:1: ( ( ruleAbstractNode ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3302:1: ( ruleAbstractNode )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3302:1: ( ruleAbstractNode )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3303:1: ruleAbstractNode
            {
             before(grammarAccess.getStatemachineAccess().getNodesAbstractNodeParserRuleCall_4_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractNode_in_rule__Statemachine__NodesAssignment_4_2_16516);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3312:1: rule__Statemachine__TransitionsAssignment_5_1 : ( ruleTransition ) ;
    public final void rule__Statemachine__TransitionsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3316:1: ( ( ruleTransition ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3317:1: ( ruleTransition )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3317:1: ( ruleTransition )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3318:1: ruleTransition
            {
             before(grammarAccess.getStatemachineAccess().getTransitionsTransitionParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransition_in_rule__Statemachine__TransitionsAssignment_5_16547);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3327:1: rule__Statemachine__TransitionsAssignment_5_2_1 : ( ruleTransition ) ;
    public final void rule__Statemachine__TransitionsAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3331:1: ( ( ruleTransition ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3332:1: ( ruleTransition )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3332:1: ( ruleTransition )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3333:1: ruleTransition
            {
             before(grammarAccess.getStatemachineAccess().getTransitionsTransitionParserRuleCall_5_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransition_in_rule__Statemachine__TransitionsAssignment_5_2_16578);
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


    // $ANTLR start "rule__Transition__ExtendedAssignment_0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3342:1: rule__Transition__ExtendedAssignment_0 : ( ( 'extended' ) ) ;
    public final void rule__Transition__ExtendedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3346:1: ( ( ( 'extended' ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3347:1: ( ( 'extended' ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3347:1: ( ( 'extended' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3348:1: ( 'extended' )
            {
             before(grammarAccess.getTransitionAccess().getExtendedExtendedKeyword_0_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3349:1: ( 'extended' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3350:1: 'extended'
            {
             before(grammarAccess.getTransitionAccess().getExtendedExtendedKeyword_0_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Transition__ExtendedAssignment_06614); 
             after(grammarAccess.getTransitionAccess().getExtendedExtendedKeyword_0_0()); 

            }

             after(grammarAccess.getTransitionAccess().getExtendedExtendedKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__ExtendedAssignment_0"


    // $ANTLR start "rule__Transition__CommentAssignment_2_1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3365:1: rule__Transition__CommentAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Transition__CommentAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3369:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3370:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3370:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3371:1: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getCommentEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Transition__CommentAssignment_2_16653);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getCommentEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__CommentAssignment_2_1"


    // $ANTLR start "rule__Transition__ElaboratesAssignment_3_1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3380:1: rule__Transition__ElaboratesAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Transition__ElaboratesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3384:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3385:1: ( ( ruleEString ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3385:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3386:1: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getElaboratesEventCrossReference_3_1_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3387:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3388:1: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getElaboratesEventEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Transition__ElaboratesAssignment_3_16688);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getElaboratesEventEStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getElaboratesEventCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__ElaboratesAssignment_3_1"


    // $ANTLR start "rule__Transition__ElaboratesAssignment_3_2_1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3399:1: rule__Transition__ElaboratesAssignment_3_2_1 : ( ( ruleEString ) ) ;
    public final void rule__Transition__ElaboratesAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3403:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3404:1: ( ( ruleEString ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3404:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3405:1: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getElaboratesEventCrossReference_3_2_1_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3406:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3407:1: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getElaboratesEventEStringParserRuleCall_3_2_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Transition__ElaboratesAssignment_3_2_16727);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getElaboratesEventEStringParserRuleCall_3_2_1_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getElaboratesEventCrossReference_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__ElaboratesAssignment_3_2_1"


    // $ANTLR start "rule__Transition__TargetAssignment_5"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3418:1: rule__Transition__TargetAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Transition__TargetAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3422:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3423:1: ( ( ruleEString ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3423:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3424:1: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getTargetAbstractNodeCrossReference_5_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3425:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3426:1: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getTargetAbstractNodeEStringParserRuleCall_5_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Transition__TargetAssignment_56766);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getTargetAbstractNodeEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getTargetAbstractNodeCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__TargetAssignment_5"


    // $ANTLR start "rule__Transition__SourceAssignment_7"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3437:1: rule__Transition__SourceAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__Transition__SourceAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3441:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3442:1: ( ( ruleEString ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3442:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3443:1: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getSourceAbstractNodeCrossReference_7_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3444:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3445:1: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getSourceAbstractNodeEStringParserRuleCall_7_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Transition__SourceAssignment_76805);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getSourceAbstractNodeEStringParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getSourceAbstractNodeCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__SourceAssignment_7"


    // $ANTLR start "rule__State__NameAssignment_2"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3456:1: rule__State__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__State__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3460:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3461:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3461:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3462:1: ruleEString
            {
             before(grammarAccess.getStateAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__State__NameAssignment_26840);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3471:1: rule__State__StatemachinesAssignment_3_2 : ( ruleStatemachine ) ;
    public final void rule__State__StatemachinesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3475:1: ( ( ruleStatemachine ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3476:1: ( ruleStatemachine )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3476:1: ( ruleStatemachine )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3477:1: ruleStatemachine
            {
             before(grammarAccess.getStateAccess().getStatemachinesStatemachineParserRuleCall_3_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleStatemachine_in_rule__State__StatemachinesAssignment_3_26871);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3486:1: rule__State__StatemachinesAssignment_3_3_1 : ( ruleStatemachine ) ;
    public final void rule__State__StatemachinesAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3490:1: ( ( ruleStatemachine ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3491:1: ( ruleStatemachine )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3491:1: ( ruleStatemachine )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3492:1: ruleStatemachine
            {
             before(grammarAccess.getStateAccess().getStatemachinesStatemachineParserRuleCall_3_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleStatemachine_in_rule__State__StatemachinesAssignment_3_3_16902);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3501:1: rule__State__InvariantsAssignment_4_2 : ( ruleInvariant ) ;
    public final void rule__State__InvariantsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3505:1: ( ( ruleInvariant ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3506:1: ( ruleInvariant )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3506:1: ( ruleInvariant )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3507:1: ruleInvariant
            {
             before(grammarAccess.getStateAccess().getInvariantsInvariantParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInvariant_in_rule__State__InvariantsAssignment_4_26933);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3516:1: rule__State__InvariantsAssignment_4_3_1 : ( ruleInvariant ) ;
    public final void rule__State__InvariantsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3520:1: ( ( ruleInvariant ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3521:1: ( ruleInvariant )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3521:1: ( ruleInvariant )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3522:1: ruleInvariant
            {
             before(grammarAccess.getStateAccess().getInvariantsInvariantParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInvariant_in_rule__State__InvariantsAssignment_4_3_16964);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3531:1: rule__Initial__InternalIdAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Initial__InternalIdAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3535:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3536:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3536:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3537:1: ruleEString
            {
             before(grammarAccess.getInitialAccess().getInternalIdEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Initial__InternalIdAssignment_2_16995);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3546:1: rule__Final__InternalIdAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Final__InternalIdAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3550:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3551:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3551:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3552:1: ruleEString
            {
             before(grammarAccess.getFinalAccess().getInternalIdEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Final__InternalIdAssignment_2_17026);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3561:1: rule__Any__InternalIdAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Any__InternalIdAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3565:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3566:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3566:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3567:1: ruleEString
            {
             before(grammarAccess.getAnyAccess().getInternalIdEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Any__InternalIdAssignment_2_17057);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3576:1: rule__Junction__InternalIdAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Junction__InternalIdAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3580:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3581:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3581:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3582:1: ruleEString
            {
             before(grammarAccess.getJunctionAccess().getInternalIdEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Junction__InternalIdAssignment_2_17088);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3591:1: rule__Fork__InternalIdAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Fork__InternalIdAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3595:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3596:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3596:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3597:1: ruleEString
            {
             before(grammarAccess.getForkAccess().getInternalIdEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Fork__InternalIdAssignment_2_17119);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3606:1: rule__Invariant__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Invariant__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3610:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3611:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3611:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3612:1: ruleEString
            {
             before(grammarAccess.getInvariantAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Invariant__NameAssignment_27150);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3621:1: rule__Invariant__TheoremAssignment_3 : ( ( 'theorem' ) ) ;
    public final void rule__Invariant__TheoremAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3625:1: ( ( ( 'theorem' ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3626:1: ( ( 'theorem' ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3626:1: ( ( 'theorem' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3627:1: ( 'theorem' )
            {
             before(grammarAccess.getInvariantAccess().getTheoremTheoremKeyword_3_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3628:1: ( 'theorem' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3629:1: 'theorem'
            {
             before(grammarAccess.getInvariantAccess().getTheoremTheoremKeyword_3_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__Invariant__TheoremAssignment_37186); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3644:1: rule__Invariant__CommentAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Invariant__CommentAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3648:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3649:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3649:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3650:1: ruleEString
            {
             before(grammarAccess.getInvariantAccess().getCommentEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Invariant__CommentAssignment_4_17225);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3659:1: rule__Invariant__PredicateAssignment_6 : ( ruleEString ) ;
    public final void rule__Invariant__PredicateAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3663:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3664:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3664:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3665:1: ruleEString
            {
             before(grammarAccess.getInvariantAccess().getPredicateEStringParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Invariant__PredicateAssignment_67256);
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
        public static final BitSet FOLLOW_rule__Transition__ExtendedAssignment_0_in_rule__Transition__Group__0__Impl2168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__12199 = new BitSet(new long[]{0x0000000000141000L});
        public static final BitSet FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__12202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Transition__Group__1__Impl2230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__22261 = new BitSet(new long[]{0x0000000000141000L});
        public static final BitSet FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__22264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_2__0_in_rule__Transition__Group__2__Impl2291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__32322 = new BitSet(new long[]{0x0000000000141000L});
        public static final BitSet FOLLOW_rule__Transition__Group__4_in_rule__Transition__Group__32325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_3__0_in_rule__Transition__Group__3__Impl2352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__4__Impl_in_rule__Transition__Group__42383 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Transition__Group__5_in_rule__Transition__Group__42386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Transition__Group__4__Impl2414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__5__Impl_in_rule__Transition__Group__52445 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Transition__Group__6_in_rule__Transition__Group__52448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__TargetAssignment_5_in_rule__Transition__Group__5__Impl2475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__6__Impl_in_rule__Transition__Group__62505 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Transition__Group__7_in_rule__Transition__Group__62508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Transition__Group__6__Impl2536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__7__Impl_in_rule__Transition__Group__72567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__SourceAssignment_7_in_rule__Transition__Group__7__Impl2594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_2__0__Impl_in_rule__Transition__Group_2__02640 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Transition__Group_2__1_in_rule__Transition__Group_2__02643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Transition__Group_2__0__Impl2671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_2__1__Impl_in_rule__Transition__Group_2__12702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__CommentAssignment_2_1_in_rule__Transition__Group_2__1__Impl2729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_3__0__Impl_in_rule__Transition__Group_3__02763 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Transition__Group_3__1_in_rule__Transition__Group_3__02766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Transition__Group_3__0__Impl2794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_3__1__Impl_in_rule__Transition__Group_3__12825 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Transition__Group_3__2_in_rule__Transition__Group_3__12828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__ElaboratesAssignment_3_1_in_rule__Transition__Group_3__1__Impl2855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_3__2__Impl_in_rule__Transition__Group_3__22885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_3_2__0_in_rule__Transition__Group_3__2__Impl2912 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__Transition__Group_3_2__0__Impl_in_rule__Transition__Group_3_2__02949 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Transition__Group_3_2__1_in_rule__Transition__Group_3_2__02952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Transition__Group_3_2__0__Impl2980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_3_2__1__Impl_in_rule__Transition__Group_3_2__13011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__ElaboratesAssignment_3_2_1_in_rule__Transition__Group_3_2__1__Impl3038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__03073 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__State__Group__1_in_rule__State__Group__03076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__13134 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__State__Group__2_in_rule__State__Group__13137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__State__Group__1__Impl3165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__23196 = new BitSet(new long[]{0x0000000002400000L});
        public static final BitSet FOLLOW_rule__State__Group__3_in_rule__State__Group__23199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__NameAssignment_2_in_rule__State__Group__2__Impl3226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group__3__Impl_in_rule__State__Group__33256 = new BitSet(new long[]{0x0000000002400000L});
        public static final BitSet FOLLOW_rule__State__Group__4_in_rule__State__Group__33259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_3__0_in_rule__State__Group__3__Impl3286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group__4__Impl_in_rule__State__Group__43317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_4__0_in_rule__State__Group__4__Impl3344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_3__0__Impl_in_rule__State__Group_3__03385 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__State__Group_3__1_in_rule__State__Group_3__03388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__State__Group_3__0__Impl3416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_3__1__Impl_in_rule__State__Group_3__13447 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__State__Group_3__2_in_rule__State__Group_3__13450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__State__Group_3__1__Impl3478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_3__2__Impl_in_rule__State__Group_3__23509 = new BitSet(new long[]{0x0000000001008000L});
        public static final BitSet FOLLOW_rule__State__Group_3__3_in_rule__State__Group_3__23512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__StatemachinesAssignment_3_2_in_rule__State__Group_3__2__Impl3539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_3__3__Impl_in_rule__State__Group_3__33569 = new BitSet(new long[]{0x0000000001008000L});
        public static final BitSet FOLLOW_rule__State__Group_3__4_in_rule__State__Group_3__33572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_3_3__0_in_rule__State__Group_3__3__Impl3599 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__State__Group_3__4__Impl_in_rule__State__Group_3__43630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__State__Group_3__4__Impl3658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_3_3__0__Impl_in_rule__State__Group_3_3__03699 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__State__Group_3_3__1_in_rule__State__Group_3_3__03702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__State__Group_3_3__0__Impl3730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_3_3__1__Impl_in_rule__State__Group_3_3__13761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__StatemachinesAssignment_3_3_1_in_rule__State__Group_3_3__1__Impl3788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_4__0__Impl_in_rule__State__Group_4__03822 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__State__Group_4__1_in_rule__State__Group_4__03825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__State__Group_4__0__Impl3853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_4__1__Impl_in_rule__State__Group_4__13884 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__State__Group_4__2_in_rule__State__Group_4__13887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__State__Group_4__1__Impl3915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_4__2__Impl_in_rule__State__Group_4__23946 = new BitSet(new long[]{0x0000000001008000L});
        public static final BitSet FOLLOW_rule__State__Group_4__3_in_rule__State__Group_4__23949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__InvariantsAssignment_4_2_in_rule__State__Group_4__2__Impl3976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_4__3__Impl_in_rule__State__Group_4__34006 = new BitSet(new long[]{0x0000000001008000L});
        public static final BitSet FOLLOW_rule__State__Group_4__4_in_rule__State__Group_4__34009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_4_3__0_in_rule__State__Group_4__3__Impl4036 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__State__Group_4__4__Impl_in_rule__State__Group_4__44067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__State__Group_4__4__Impl4095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_4_3__0__Impl_in_rule__State__Group_4_3__04136 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__State__Group_4_3__1_in_rule__State__Group_4_3__04139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__State__Group_4_3__0__Impl4167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_4_3__1__Impl_in_rule__State__Group_4_3__14198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__InvariantsAssignment_4_3_1_in_rule__State__Group_4_3__1__Impl4225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Initial__Group__0__Impl_in_rule__Initial__Group__04259 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Initial__Group__1_in_rule__Initial__Group__04262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Initial__Group__1__Impl_in_rule__Initial__Group__14320 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Initial__Group__2_in_rule__Initial__Group__14323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Initial__Group__1__Impl4351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Initial__Group__2__Impl_in_rule__Initial__Group__24382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Initial__Group_2__0_in_rule__Initial__Group__2__Impl4409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Initial__Group_2__0__Impl_in_rule__Initial__Group_2__04446 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Initial__Group_2__1_in_rule__Initial__Group_2__04449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Initial__Group_2__0__Impl4477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Initial__Group_2__1__Impl_in_rule__Initial__Group_2__14508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Initial__InternalIdAssignment_2_1_in_rule__Initial__Group_2__1__Impl4535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Final__Group__0__Impl_in_rule__Final__Group__04569 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Final__Group__1_in_rule__Final__Group__04572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Final__Group__1__Impl_in_rule__Final__Group__14630 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Final__Group__2_in_rule__Final__Group__14633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Final__Group__1__Impl4661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Final__Group__2__Impl_in_rule__Final__Group__24692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Final__Group_2__0_in_rule__Final__Group__2__Impl4719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Final__Group_2__0__Impl_in_rule__Final__Group_2__04756 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Final__Group_2__1_in_rule__Final__Group_2__04759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Final__Group_2__0__Impl4787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Final__Group_2__1__Impl_in_rule__Final__Group_2__14818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Final__InternalIdAssignment_2_1_in_rule__Final__Group_2__1__Impl4845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Any__Group__0__Impl_in_rule__Any__Group__04879 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Any__Group__1_in_rule__Any__Group__04882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Any__Group__1__Impl_in_rule__Any__Group__14940 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Any__Group__2_in_rule__Any__Group__14943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Any__Group__1__Impl4971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Any__Group__2__Impl_in_rule__Any__Group__25002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Any__Group_2__0_in_rule__Any__Group__2__Impl5029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Any__Group_2__0__Impl_in_rule__Any__Group_2__05066 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Any__Group_2__1_in_rule__Any__Group_2__05069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Any__Group_2__0__Impl5097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Any__Group_2__1__Impl_in_rule__Any__Group_2__15128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Any__InternalIdAssignment_2_1_in_rule__Any__Group_2__1__Impl5155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Junction__Group__0__Impl_in_rule__Junction__Group__05189 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__Junction__Group__1_in_rule__Junction__Group__05192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Junction__Group__1__Impl_in_rule__Junction__Group__15250 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Junction__Group__2_in_rule__Junction__Group__15253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Junction__Group__1__Impl5281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Junction__Group__2__Impl_in_rule__Junction__Group__25312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Junction__Group_2__0_in_rule__Junction__Group__2__Impl5339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Junction__Group_2__0__Impl_in_rule__Junction__Group_2__05376 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Junction__Group_2__1_in_rule__Junction__Group_2__05379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Junction__Group_2__0__Impl5407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Junction__Group_2__1__Impl_in_rule__Junction__Group_2__15438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Junction__InternalIdAssignment_2_1_in_rule__Junction__Group_2__1__Impl5465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fork__Group__0__Impl_in_rule__Fork__Group__05499 = new BitSet(new long[]{0x00000000F4200000L});
        public static final BitSet FOLLOW_rule__Fork__Group__1_in_rule__Fork__Group__05502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fork__Group__1__Impl_in_rule__Fork__Group__15560 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Fork__Group__2_in_rule__Fork__Group__15563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Fork__Group__1__Impl5591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fork__Group__2__Impl_in_rule__Fork__Group__25622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fork__Group_2__0_in_rule__Fork__Group__2__Impl5649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fork__Group_2__0__Impl_in_rule__Fork__Group_2__05686 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Fork__Group_2__1_in_rule__Fork__Group_2__05689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Fork__Group_2__0__Impl5717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fork__Group_2__1__Impl_in_rule__Fork__Group_2__15748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fork__InternalIdAssignment_2_1_in_rule__Fork__Group_2__1__Impl5775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group__0__Impl_in_rule__Invariant__Group__05809 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__Invariant__Group__1_in_rule__Invariant__Group__05812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Invariant__Group__0__Impl5840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group__1__Impl_in_rule__Invariant__Group__15871 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Invariant__Group__2_in_rule__Invariant__Group__15874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Invariant__Group__1__Impl5902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group__2__Impl_in_rule__Invariant__Group__25933 = new BitSet(new long[]{0x0000001400100000L});
        public static final BitSet FOLLOW_rule__Invariant__Group__3_in_rule__Invariant__Group__25936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__NameAssignment_2_in_rule__Invariant__Group__2__Impl5963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group__3__Impl_in_rule__Invariant__Group__35993 = new BitSet(new long[]{0x0000001400100000L});
        public static final BitSet FOLLOW_rule__Invariant__Group__4_in_rule__Invariant__Group__35996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__TheoremAssignment_3_in_rule__Invariant__Group__3__Impl6023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group__4__Impl_in_rule__Invariant__Group__46054 = new BitSet(new long[]{0x0000001400100000L});
        public static final BitSet FOLLOW_rule__Invariant__Group__5_in_rule__Invariant__Group__46057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group_4__0_in_rule__Invariant__Group__4__Impl6084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group__5__Impl_in_rule__Invariant__Group__56115 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Invariant__Group__6_in_rule__Invariant__Group__56118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Invariant__Group__5__Impl6146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group__6__Impl_in_rule__Invariant__Group__66177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__PredicateAssignment_6_in_rule__Invariant__Group__6__Impl6204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group_4__0__Impl_in_rule__Invariant__Group_4__06248 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Invariant__Group_4__1_in_rule__Invariant__Group_4__06251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Invariant__Group_4__0__Impl6279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group_4__1__Impl_in_rule__Invariant__Group_4__16310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__CommentAssignment_4_1_in_rule__Invariant__Group_4__1__Impl6337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Statemachine__NameAssignment_16376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Statemachine__ElaboratesAssignment_2_16411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Statemachine__RefinesAssignment_3_16450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractNode_in_rule__Statemachine__NodesAssignment_4_16485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractNode_in_rule__Statemachine__NodesAssignment_4_2_16516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransition_in_rule__Statemachine__TransitionsAssignment_5_16547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransition_in_rule__Statemachine__TransitionsAssignment_5_2_16578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Transition__ExtendedAssignment_06614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Transition__CommentAssignment_2_16653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Transition__ElaboratesAssignment_3_16688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Transition__ElaboratesAssignment_3_2_16727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Transition__TargetAssignment_56766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Transition__SourceAssignment_76805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__State__NameAssignment_26840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStatemachine_in_rule__State__StatemachinesAssignment_3_26871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStatemachine_in_rule__State__StatemachinesAssignment_3_3_16902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvariant_in_rule__State__InvariantsAssignment_4_26933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvariant_in_rule__State__InvariantsAssignment_4_3_16964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Initial__InternalIdAssignment_2_16995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Final__InternalIdAssignment_2_17026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Any__InternalIdAssignment_2_17057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Junction__InternalIdAssignment_2_17088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Fork__InternalIdAssignment_2_17119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Invariant__NameAssignment_27150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__Invariant__TheoremAssignment_37186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Invariant__CommentAssignment_4_17225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Invariant__PredicateAssignment_67256 = new BitSet(new long[]{0x0000000000000002L});
    }


}