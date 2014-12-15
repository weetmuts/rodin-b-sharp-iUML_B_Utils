package ac.soton.xtext.statemachine.ui.contentassist.antlr.internal; 

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
import ac.soton.xtext.statemachine.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'StateMachine'", "'End StateMachine'", "'Nodes'", "','", "'Transitions'", "'StateMachines'", "'Transition'", "'event'", "'source'", "'target'", "'State'", "'nested'", "'Initial'", "'Junction'", "'Fork'", "'Join'", "'Any'", "'Final'"
    };
    public static final int RULE_ID=5;
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
    public static final int T__19=19;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
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


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g"; }


     
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




    // $ANTLR start "entryRuleStateMachine"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:60:1: entryRuleStateMachine : ruleStateMachine EOF ;
    public final void entryRuleStateMachine() throws RecognitionException {
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:61:1: ( ruleStateMachine EOF )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:62:1: ruleStateMachine EOF
            {
             before(grammarAccess.getStateMachineRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStateMachine_in_entryRuleStateMachine61);
            ruleStateMachine();

            state._fsp--;

             after(grammarAccess.getStateMachineRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStateMachine68); 

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
    // $ANTLR end "entryRuleStateMachine"


    // $ANTLR start "ruleStateMachine"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:69:1: ruleStateMachine : ( ( rule__StateMachine__Group__0 ) ) ;
    public final void ruleStateMachine() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:73:2: ( ( ( rule__StateMachine__Group__0 ) ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:74:1: ( ( rule__StateMachine__Group__0 ) )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:74:1: ( ( rule__StateMachine__Group__0 ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:75:1: ( rule__StateMachine__Group__0 )
            {
             before(grammarAccess.getStateMachineAccess().getGroup()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:76:1: ( rule__StateMachine__Group__0 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:76:2: rule__StateMachine__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__0_in_ruleStateMachine94);
            rule__StateMachine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStateMachine"


    // $ANTLR start "entryRuleAbstractNode"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:88:1: entryRuleAbstractNode : ruleAbstractNode EOF ;
    public final void entryRuleAbstractNode() throws RecognitionException {
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:89:1: ( ruleAbstractNode EOF )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:90:1: ruleAbstractNode EOF
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:97:1: ruleAbstractNode : ( ( rule__AbstractNode__Alternatives ) ) ;
    public final void ruleAbstractNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:101:2: ( ( ( rule__AbstractNode__Alternatives ) ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:102:1: ( ( rule__AbstractNode__Alternatives ) )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:102:1: ( ( rule__AbstractNode__Alternatives ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:103:1: ( rule__AbstractNode__Alternatives )
            {
             before(grammarAccess.getAbstractNodeAccess().getAlternatives()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:104:1: ( rule__AbstractNode__Alternatives )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:104:2: rule__AbstractNode__Alternatives
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:116:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:117:1: ( ruleEString EOF )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:118:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString181);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString188); 

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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:125:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:129:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:130:1: ( ( rule__EString__Alternatives ) )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:130:1: ( ( rule__EString__Alternatives ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:131:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:132:1: ( rule__EString__Alternatives )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:132:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString214);
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:144:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:145:1: ( ruleTransition EOF )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:146:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransition_in_entryRuleTransition241);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransition248); 

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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:153:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:157:2: ( ( ( rule__Transition__Group__0 ) ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:158:1: ( ( rule__Transition__Group__0 ) )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:158:1: ( ( rule__Transition__Group__0 ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:159:1: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:160:1: ( rule__Transition__Group__0 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:160:2: rule__Transition__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__0_in_ruleTransition274);
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:172:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:173:1: ( ruleState EOF )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:174:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleState_in_entryRuleState301);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleState308); 

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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:181:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:185:2: ( ( ( rule__State__Group__0 ) ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:186:1: ( ( rule__State__Group__0 ) )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:186:1: ( ( rule__State__Group__0 ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:187:1: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:188:1: ( rule__State__Group__0 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:188:2: rule__State__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group__0_in_ruleState334);
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:200:1: entryRuleInitial : ruleInitial EOF ;
    public final void entryRuleInitial() throws RecognitionException {
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:201:1: ( ruleInitial EOF )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:202:1: ruleInitial EOF
            {
             before(grammarAccess.getInitialRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInitial_in_entryRuleInitial361);
            ruleInitial();

            state._fsp--;

             after(grammarAccess.getInitialRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInitial368); 

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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:209:1: ruleInitial : ( ( rule__Initial__Group__0 ) ) ;
    public final void ruleInitial() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:213:2: ( ( ( rule__Initial__Group__0 ) ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:214:1: ( ( rule__Initial__Group__0 ) )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:214:1: ( ( rule__Initial__Group__0 ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:215:1: ( rule__Initial__Group__0 )
            {
             before(grammarAccess.getInitialAccess().getGroup()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:216:1: ( rule__Initial__Group__0 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:216:2: rule__Initial__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Initial__Group__0_in_ruleInitial394);
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


    // $ANTLR start "entryRuleJunction"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:228:1: entryRuleJunction : ruleJunction EOF ;
    public final void entryRuleJunction() throws RecognitionException {
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:229:1: ( ruleJunction EOF )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:230:1: ruleJunction EOF
            {
             before(grammarAccess.getJunctionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleJunction_in_entryRuleJunction421);
            ruleJunction();

            state._fsp--;

             after(grammarAccess.getJunctionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleJunction428); 

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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:237:1: ruleJunction : ( ( rule__Junction__Group__0 ) ) ;
    public final void ruleJunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:241:2: ( ( ( rule__Junction__Group__0 ) ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:242:1: ( ( rule__Junction__Group__0 ) )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:242:1: ( ( rule__Junction__Group__0 ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:243:1: ( rule__Junction__Group__0 )
            {
             before(grammarAccess.getJunctionAccess().getGroup()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:244:1: ( rule__Junction__Group__0 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:244:2: rule__Junction__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Junction__Group__0_in_ruleJunction454);
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:256:1: entryRuleFork : ruleFork EOF ;
    public final void entryRuleFork() throws RecognitionException {
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:257:1: ( ruleFork EOF )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:258:1: ruleFork EOF
            {
             before(grammarAccess.getForkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFork_in_entryRuleFork481);
            ruleFork();

            state._fsp--;

             after(grammarAccess.getForkRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFork488); 

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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:265:1: ruleFork : ( ( rule__Fork__Group__0 ) ) ;
    public final void ruleFork() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:269:2: ( ( ( rule__Fork__Group__0 ) ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:270:1: ( ( rule__Fork__Group__0 ) )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:270:1: ( ( rule__Fork__Group__0 ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:271:1: ( rule__Fork__Group__0 )
            {
             before(grammarAccess.getForkAccess().getGroup()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:272:1: ( rule__Fork__Group__0 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:272:2: rule__Fork__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fork__Group__0_in_ruleFork514);
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


    // $ANTLR start "entryRuleJoin"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:284:1: entryRuleJoin : ruleJoin EOF ;
    public final void entryRuleJoin() throws RecognitionException {
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:285:1: ( ruleJoin EOF )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:286:1: ruleJoin EOF
            {
             before(grammarAccess.getJoinRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleJoin_in_entryRuleJoin541);
            ruleJoin();

            state._fsp--;

             after(grammarAccess.getJoinRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleJoin548); 

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
    // $ANTLR end "entryRuleJoin"


    // $ANTLR start "ruleJoin"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:293:1: ruleJoin : ( ( rule__Join__Group__0 ) ) ;
    public final void ruleJoin() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:297:2: ( ( ( rule__Join__Group__0 ) ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:298:1: ( ( rule__Join__Group__0 ) )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:298:1: ( ( rule__Join__Group__0 ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:299:1: ( rule__Join__Group__0 )
            {
             before(grammarAccess.getJoinAccess().getGroup()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:300:1: ( rule__Join__Group__0 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:300:2: rule__Join__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Join__Group__0_in_ruleJoin574);
            rule__Join__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJoinAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJoin"


    // $ANTLR start "entryRuleAny"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:312:1: entryRuleAny : ruleAny EOF ;
    public final void entryRuleAny() throws RecognitionException {
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:313:1: ( ruleAny EOF )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:314:1: ruleAny EOF
            {
             before(grammarAccess.getAnyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAny_in_entryRuleAny601);
            ruleAny();

            state._fsp--;

             after(grammarAccess.getAnyRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAny608); 

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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:321:1: ruleAny : ( ( rule__Any__Group__0 ) ) ;
    public final void ruleAny() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:325:2: ( ( ( rule__Any__Group__0 ) ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:326:1: ( ( rule__Any__Group__0 ) )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:326:1: ( ( rule__Any__Group__0 ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:327:1: ( rule__Any__Group__0 )
            {
             before(grammarAccess.getAnyAccess().getGroup()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:328:1: ( rule__Any__Group__0 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:328:2: rule__Any__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Any__Group__0_in_ruleAny634);
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


    // $ANTLR start "entryRuleFinal"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:340:1: entryRuleFinal : ruleFinal EOF ;
    public final void entryRuleFinal() throws RecognitionException {
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:341:1: ( ruleFinal EOF )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:342:1: ruleFinal EOF
            {
             before(grammarAccess.getFinalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFinal_in_entryRuleFinal661);
            ruleFinal();

            state._fsp--;

             after(grammarAccess.getFinalRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFinal668); 

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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:349:1: ruleFinal : ( ( rule__Final__Group__0 ) ) ;
    public final void ruleFinal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:353:2: ( ( ( rule__Final__Group__0 ) ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:354:1: ( ( rule__Final__Group__0 ) )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:354:1: ( ( rule__Final__Group__0 ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:355:1: ( rule__Final__Group__0 )
            {
             before(grammarAccess.getFinalAccess().getGroup()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:356:1: ( rule__Final__Group__0 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:356:2: rule__Final__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Final__Group__0_in_ruleFinal694);
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


    // $ANTLR start "rule__AbstractNode__Alternatives"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:368:1: rule__AbstractNode__Alternatives : ( ( ruleState ) | ( ruleInitial ) | ( ruleJunction ) | ( ruleFork ) | ( ruleJoin ) | ( ruleAny ) | ( ruleFinal ) );
    public final void rule__AbstractNode__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:372:1: ( ( ruleState ) | ( ruleInitial ) | ( ruleJunction ) | ( ruleFork ) | ( ruleJoin ) | ( ruleAny ) | ( ruleFinal ) )
            int alt1=7;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt1=1;
                }
                break;
            case 23:
                {
                alt1=2;
                }
                break;
            case 24:
                {
                alt1=3;
                }
                break;
            case 25:
                {
                alt1=4;
                }
                break;
            case 26:
                {
                alt1=5;
                }
                break;
            case 27:
                {
                alt1=6;
                }
                break;
            case 28:
                {
                alt1=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:373:1: ( ruleState )
                    {
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:373:1: ( ruleState )
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:374:1: ruleState
                    {
                     before(grammarAccess.getAbstractNodeAccess().getStateParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleState_in_rule__AbstractNode__Alternatives730);
                    ruleState();

                    state._fsp--;

                     after(grammarAccess.getAbstractNodeAccess().getStateParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:379:6: ( ruleInitial )
                    {
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:379:6: ( ruleInitial )
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:380:1: ruleInitial
                    {
                     before(grammarAccess.getAbstractNodeAccess().getInitialParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleInitial_in_rule__AbstractNode__Alternatives747);
                    ruleInitial();

                    state._fsp--;

                     after(grammarAccess.getAbstractNodeAccess().getInitialParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:385:6: ( ruleJunction )
                    {
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:385:6: ( ruleJunction )
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:386:1: ruleJunction
                    {
                     before(grammarAccess.getAbstractNodeAccess().getJunctionParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleJunction_in_rule__AbstractNode__Alternatives764);
                    ruleJunction();

                    state._fsp--;

                     after(grammarAccess.getAbstractNodeAccess().getJunctionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:391:6: ( ruleFork )
                    {
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:391:6: ( ruleFork )
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:392:1: ruleFork
                    {
                     before(grammarAccess.getAbstractNodeAccess().getForkParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleFork_in_rule__AbstractNode__Alternatives781);
                    ruleFork();

                    state._fsp--;

                     after(grammarAccess.getAbstractNodeAccess().getForkParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:397:6: ( ruleJoin )
                    {
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:397:6: ( ruleJoin )
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:398:1: ruleJoin
                    {
                     before(grammarAccess.getAbstractNodeAccess().getJoinParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleJoin_in_rule__AbstractNode__Alternatives798);
                    ruleJoin();

                    state._fsp--;

                     after(grammarAccess.getAbstractNodeAccess().getJoinParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:403:6: ( ruleAny )
                    {
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:403:6: ( ruleAny )
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:404:1: ruleAny
                    {
                     before(grammarAccess.getAbstractNodeAccess().getAnyParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_ruleAny_in_rule__AbstractNode__Alternatives815);
                    ruleAny();

                    state._fsp--;

                     after(grammarAccess.getAbstractNodeAccess().getAnyParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:409:6: ( ruleFinal )
                    {
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:409:6: ( ruleFinal )
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:410:1: ruleFinal
                    {
                     before(grammarAccess.getAbstractNodeAccess().getFinalParserRuleCall_6()); 
                    pushFollow(FollowSets000.FOLLOW_ruleFinal_in_rule__AbstractNode__Alternatives832);
                    ruleFinal();

                    state._fsp--;

                     after(grammarAccess.getAbstractNodeAccess().getFinalParserRuleCall_6()); 

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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:420:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:424:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:425:1: ( RULE_STRING )
                    {
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:425:1: ( RULE_STRING )
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:426:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives864); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:431:6: ( RULE_ID )
                    {
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:431:6: ( RULE_ID )
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:432:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives881); 
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


    // $ANTLR start "rule__StateMachine__Group__0"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:444:1: rule__StateMachine__Group__0 : rule__StateMachine__Group__0__Impl rule__StateMachine__Group__1 ;
    public final void rule__StateMachine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:448:1: ( rule__StateMachine__Group__0__Impl rule__StateMachine__Group__1 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:449:2: rule__StateMachine__Group__0__Impl rule__StateMachine__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__0__Impl_in_rule__StateMachine__Group__0911);
            rule__StateMachine__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__1_in_rule__StateMachine__Group__0914);
            rule__StateMachine__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__0"


    // $ANTLR start "rule__StateMachine__Group__0__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:456:1: rule__StateMachine__Group__0__Impl : ( () ) ;
    public final void rule__StateMachine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:460:1: ( ( () ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:461:1: ( () )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:461:1: ( () )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:462:1: ()
            {
             before(grammarAccess.getStateMachineAccess().getStateMachineAction_0()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:463:1: ()
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:465:1: 
            {
            }

             after(grammarAccess.getStateMachineAccess().getStateMachineAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__0__Impl"


    // $ANTLR start "rule__StateMachine__Group__1"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:475:1: rule__StateMachine__Group__1 : rule__StateMachine__Group__1__Impl rule__StateMachine__Group__2 ;
    public final void rule__StateMachine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:479:1: ( rule__StateMachine__Group__1__Impl rule__StateMachine__Group__2 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:480:2: rule__StateMachine__Group__1__Impl rule__StateMachine__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__1__Impl_in_rule__StateMachine__Group__1972);
            rule__StateMachine__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__2_in_rule__StateMachine__Group__1975);
            rule__StateMachine__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__1"


    // $ANTLR start "rule__StateMachine__Group__1__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:487:1: rule__StateMachine__Group__1__Impl : ( 'StateMachine' ) ;
    public final void rule__StateMachine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:491:1: ( ( 'StateMachine' ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:492:1: ( 'StateMachine' )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:492:1: ( 'StateMachine' )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:493:1: 'StateMachine'
            {
             before(grammarAccess.getStateMachineAccess().getStateMachineKeyword_1()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__StateMachine__Group__1__Impl1003); 
             after(grammarAccess.getStateMachineAccess().getStateMachineKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__1__Impl"


    // $ANTLR start "rule__StateMachine__Group__2"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:506:1: rule__StateMachine__Group__2 : rule__StateMachine__Group__2__Impl rule__StateMachine__Group__3 ;
    public final void rule__StateMachine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:510:1: ( rule__StateMachine__Group__2__Impl rule__StateMachine__Group__3 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:511:2: rule__StateMachine__Group__2__Impl rule__StateMachine__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__2__Impl_in_rule__StateMachine__Group__21034);
            rule__StateMachine__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__3_in_rule__StateMachine__Group__21037);
            rule__StateMachine__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__2"


    // $ANTLR start "rule__StateMachine__Group__2__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:518:1: rule__StateMachine__Group__2__Impl : ( ( rule__StateMachine__NameAssignment_2 ) ) ;
    public final void rule__StateMachine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:522:1: ( ( ( rule__StateMachine__NameAssignment_2 ) ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:523:1: ( ( rule__StateMachine__NameAssignment_2 ) )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:523:1: ( ( rule__StateMachine__NameAssignment_2 ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:524:1: ( rule__StateMachine__NameAssignment_2 )
            {
             before(grammarAccess.getStateMachineAccess().getNameAssignment_2()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:525:1: ( rule__StateMachine__NameAssignment_2 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:525:2: rule__StateMachine__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__NameAssignment_2_in_rule__StateMachine__Group__2__Impl1064);
            rule__StateMachine__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__2__Impl"


    // $ANTLR start "rule__StateMachine__Group__3"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:535:1: rule__StateMachine__Group__3 : rule__StateMachine__Group__3__Impl rule__StateMachine__Group__4 ;
    public final void rule__StateMachine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:539:1: ( rule__StateMachine__Group__3__Impl rule__StateMachine__Group__4 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:540:2: rule__StateMachine__Group__3__Impl rule__StateMachine__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__3__Impl_in_rule__StateMachine__Group__31094);
            rule__StateMachine__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__4_in_rule__StateMachine__Group__31097);
            rule__StateMachine__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__3"


    // $ANTLR start "rule__StateMachine__Group__3__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:547:1: rule__StateMachine__Group__3__Impl : ( ( rule__StateMachine__Group_3__0 )? ) ;
    public final void rule__StateMachine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:551:1: ( ( ( rule__StateMachine__Group_3__0 )? ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:552:1: ( ( rule__StateMachine__Group_3__0 )? )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:552:1: ( ( rule__StateMachine__Group_3__0 )? )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:553:1: ( rule__StateMachine__Group_3__0 )?
            {
             before(grammarAccess.getStateMachineAccess().getGroup_3()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:554:1: ( rule__StateMachine__Group_3__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:554:2: rule__StateMachine__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_3__0_in_rule__StateMachine__Group__3__Impl1124);
                    rule__StateMachine__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateMachineAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__3__Impl"


    // $ANTLR start "rule__StateMachine__Group__4"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:564:1: rule__StateMachine__Group__4 : rule__StateMachine__Group__4__Impl rule__StateMachine__Group__5 ;
    public final void rule__StateMachine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:568:1: ( rule__StateMachine__Group__4__Impl rule__StateMachine__Group__5 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:569:2: rule__StateMachine__Group__4__Impl rule__StateMachine__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__4__Impl_in_rule__StateMachine__Group__41155);
            rule__StateMachine__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__5_in_rule__StateMachine__Group__41158);
            rule__StateMachine__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__4"


    // $ANTLR start "rule__StateMachine__Group__4__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:576:1: rule__StateMachine__Group__4__Impl : ( ( rule__StateMachine__Group_4__0 )? ) ;
    public final void rule__StateMachine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:580:1: ( ( ( rule__StateMachine__Group_4__0 )? ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:581:1: ( ( rule__StateMachine__Group_4__0 )? )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:581:1: ( ( rule__StateMachine__Group_4__0 )? )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:582:1: ( rule__StateMachine__Group_4__0 )?
            {
             before(grammarAccess.getStateMachineAccess().getGroup_4()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:583:1: ( rule__StateMachine__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:583:2: rule__StateMachine__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_4__0_in_rule__StateMachine__Group__4__Impl1185);
                    rule__StateMachine__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateMachineAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__4__Impl"


    // $ANTLR start "rule__StateMachine__Group__5"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:593:1: rule__StateMachine__Group__5 : rule__StateMachine__Group__5__Impl rule__StateMachine__Group__6 ;
    public final void rule__StateMachine__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:597:1: ( rule__StateMachine__Group__5__Impl rule__StateMachine__Group__6 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:598:2: rule__StateMachine__Group__5__Impl rule__StateMachine__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__5__Impl_in_rule__StateMachine__Group__51216);
            rule__StateMachine__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__6_in_rule__StateMachine__Group__51219);
            rule__StateMachine__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__5"


    // $ANTLR start "rule__StateMachine__Group__5__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:605:1: rule__StateMachine__Group__5__Impl : ( ( rule__StateMachine__Group_5__0 )? ) ;
    public final void rule__StateMachine__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:609:1: ( ( ( rule__StateMachine__Group_5__0 )? ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:610:1: ( ( rule__StateMachine__Group_5__0 )? )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:610:1: ( ( rule__StateMachine__Group_5__0 )? )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:611:1: ( rule__StateMachine__Group_5__0 )?
            {
             before(grammarAccess.getStateMachineAccess().getGroup_5()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:612:1: ( rule__StateMachine__Group_5__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:612:2: rule__StateMachine__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_5__0_in_rule__StateMachine__Group__5__Impl1246);
                    rule__StateMachine__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateMachineAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__5__Impl"


    // $ANTLR start "rule__StateMachine__Group__6"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:622:1: rule__StateMachine__Group__6 : rule__StateMachine__Group__6__Impl ;
    public final void rule__StateMachine__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:626:1: ( rule__StateMachine__Group__6__Impl )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:627:2: rule__StateMachine__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__6__Impl_in_rule__StateMachine__Group__61277);
            rule__StateMachine__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__6"


    // $ANTLR start "rule__StateMachine__Group__6__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:633:1: rule__StateMachine__Group__6__Impl : ( 'End StateMachine' ) ;
    public final void rule__StateMachine__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:637:1: ( ( 'End StateMachine' ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:638:1: ( 'End StateMachine' )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:638:1: ( 'End StateMachine' )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:639:1: 'End StateMachine'
            {
             before(grammarAccess.getStateMachineAccess().getEndStateMachineKeyword_6()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__StateMachine__Group__6__Impl1305); 
             after(grammarAccess.getStateMachineAccess().getEndStateMachineKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__6__Impl"


    // $ANTLR start "rule__StateMachine__Group_3__0"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:666:1: rule__StateMachine__Group_3__0 : rule__StateMachine__Group_3__0__Impl rule__StateMachine__Group_3__1 ;
    public final void rule__StateMachine__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:670:1: ( rule__StateMachine__Group_3__0__Impl rule__StateMachine__Group_3__1 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:671:2: rule__StateMachine__Group_3__0__Impl rule__StateMachine__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_3__0__Impl_in_rule__StateMachine__Group_3__01350);
            rule__StateMachine__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_3__1_in_rule__StateMachine__Group_3__01353);
            rule__StateMachine__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_3__0"


    // $ANTLR start "rule__StateMachine__Group_3__0__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:678:1: rule__StateMachine__Group_3__0__Impl : ( 'Nodes' ) ;
    public final void rule__StateMachine__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:682:1: ( ( 'Nodes' ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:683:1: ( 'Nodes' )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:683:1: ( 'Nodes' )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:684:1: 'Nodes'
            {
             before(grammarAccess.getStateMachineAccess().getNodesKeyword_3_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__StateMachine__Group_3__0__Impl1381); 
             after(grammarAccess.getStateMachineAccess().getNodesKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_3__0__Impl"


    // $ANTLR start "rule__StateMachine__Group_3__1"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:697:1: rule__StateMachine__Group_3__1 : rule__StateMachine__Group_3__1__Impl rule__StateMachine__Group_3__2 ;
    public final void rule__StateMachine__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:701:1: ( rule__StateMachine__Group_3__1__Impl rule__StateMachine__Group_3__2 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:702:2: rule__StateMachine__Group_3__1__Impl rule__StateMachine__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_3__1__Impl_in_rule__StateMachine__Group_3__11412);
            rule__StateMachine__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_3__2_in_rule__StateMachine__Group_3__11415);
            rule__StateMachine__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_3__1"


    // $ANTLR start "rule__StateMachine__Group_3__1__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:709:1: rule__StateMachine__Group_3__1__Impl : ( ( rule__StateMachine__NodesAssignment_3_1 ) ) ;
    public final void rule__StateMachine__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:713:1: ( ( ( rule__StateMachine__NodesAssignment_3_1 ) ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:714:1: ( ( rule__StateMachine__NodesAssignment_3_1 ) )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:714:1: ( ( rule__StateMachine__NodesAssignment_3_1 ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:715:1: ( rule__StateMachine__NodesAssignment_3_1 )
            {
             before(grammarAccess.getStateMachineAccess().getNodesAssignment_3_1()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:716:1: ( rule__StateMachine__NodesAssignment_3_1 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:716:2: rule__StateMachine__NodesAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__NodesAssignment_3_1_in_rule__StateMachine__Group_3__1__Impl1442);
            rule__StateMachine__NodesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getNodesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_3__1__Impl"


    // $ANTLR start "rule__StateMachine__Group_3__2"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:726:1: rule__StateMachine__Group_3__2 : rule__StateMachine__Group_3__2__Impl ;
    public final void rule__StateMachine__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:730:1: ( rule__StateMachine__Group_3__2__Impl )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:731:2: rule__StateMachine__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_3__2__Impl_in_rule__StateMachine__Group_3__21472);
            rule__StateMachine__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_3__2"


    // $ANTLR start "rule__StateMachine__Group_3__2__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:737:1: rule__StateMachine__Group_3__2__Impl : ( ( rule__StateMachine__Group_3_2__0 )* ) ;
    public final void rule__StateMachine__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:741:1: ( ( ( rule__StateMachine__Group_3_2__0 )* ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:742:1: ( ( rule__StateMachine__Group_3_2__0 )* )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:742:1: ( ( rule__StateMachine__Group_3_2__0 )* )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:743:1: ( rule__StateMachine__Group_3_2__0 )*
            {
             before(grammarAccess.getStateMachineAccess().getGroup_3_2()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:744:1: ( rule__StateMachine__Group_3_2__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:744:2: rule__StateMachine__Group_3_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_3_2__0_in_rule__StateMachine__Group_3__2__Impl1499);
            	    rule__StateMachine__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getStateMachineAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_3__2__Impl"


    // $ANTLR start "rule__StateMachine__Group_3_2__0"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:760:1: rule__StateMachine__Group_3_2__0 : rule__StateMachine__Group_3_2__0__Impl rule__StateMachine__Group_3_2__1 ;
    public final void rule__StateMachine__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:764:1: ( rule__StateMachine__Group_3_2__0__Impl rule__StateMachine__Group_3_2__1 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:765:2: rule__StateMachine__Group_3_2__0__Impl rule__StateMachine__Group_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_3_2__0__Impl_in_rule__StateMachine__Group_3_2__01536);
            rule__StateMachine__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_3_2__1_in_rule__StateMachine__Group_3_2__01539);
            rule__StateMachine__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_3_2__0"


    // $ANTLR start "rule__StateMachine__Group_3_2__0__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:772:1: rule__StateMachine__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__StateMachine__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:776:1: ( ( ',' ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:777:1: ( ',' )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:777:1: ( ',' )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:778:1: ','
            {
             before(grammarAccess.getStateMachineAccess().getCommaKeyword_3_2_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__StateMachine__Group_3_2__0__Impl1567); 
             after(grammarAccess.getStateMachineAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_3_2__0__Impl"


    // $ANTLR start "rule__StateMachine__Group_3_2__1"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:791:1: rule__StateMachine__Group_3_2__1 : rule__StateMachine__Group_3_2__1__Impl ;
    public final void rule__StateMachine__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:795:1: ( rule__StateMachine__Group_3_2__1__Impl )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:796:2: rule__StateMachine__Group_3_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_3_2__1__Impl_in_rule__StateMachine__Group_3_2__11598);
            rule__StateMachine__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_3_2__1"


    // $ANTLR start "rule__StateMachine__Group_3_2__1__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:802:1: rule__StateMachine__Group_3_2__1__Impl : ( ( rule__StateMachine__NodesAssignment_3_2_1 ) ) ;
    public final void rule__StateMachine__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:806:1: ( ( ( rule__StateMachine__NodesAssignment_3_2_1 ) ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:807:1: ( ( rule__StateMachine__NodesAssignment_3_2_1 ) )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:807:1: ( ( rule__StateMachine__NodesAssignment_3_2_1 ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:808:1: ( rule__StateMachine__NodesAssignment_3_2_1 )
            {
             before(grammarAccess.getStateMachineAccess().getNodesAssignment_3_2_1()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:809:1: ( rule__StateMachine__NodesAssignment_3_2_1 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:809:2: rule__StateMachine__NodesAssignment_3_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__NodesAssignment_3_2_1_in_rule__StateMachine__Group_3_2__1__Impl1625);
            rule__StateMachine__NodesAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getNodesAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_3_2__1__Impl"


    // $ANTLR start "rule__StateMachine__Group_4__0"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:823:1: rule__StateMachine__Group_4__0 : rule__StateMachine__Group_4__0__Impl rule__StateMachine__Group_4__1 ;
    public final void rule__StateMachine__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:827:1: ( rule__StateMachine__Group_4__0__Impl rule__StateMachine__Group_4__1 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:828:2: rule__StateMachine__Group_4__0__Impl rule__StateMachine__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_4__0__Impl_in_rule__StateMachine__Group_4__01659);
            rule__StateMachine__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_4__1_in_rule__StateMachine__Group_4__01662);
            rule__StateMachine__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_4__0"


    // $ANTLR start "rule__StateMachine__Group_4__0__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:835:1: rule__StateMachine__Group_4__0__Impl : ( 'Transitions' ) ;
    public final void rule__StateMachine__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:839:1: ( ( 'Transitions' ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:840:1: ( 'Transitions' )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:840:1: ( 'Transitions' )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:841:1: 'Transitions'
            {
             before(grammarAccess.getStateMachineAccess().getTransitionsKeyword_4_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__StateMachine__Group_4__0__Impl1690); 
             after(grammarAccess.getStateMachineAccess().getTransitionsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_4__0__Impl"


    // $ANTLR start "rule__StateMachine__Group_4__1"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:854:1: rule__StateMachine__Group_4__1 : rule__StateMachine__Group_4__1__Impl rule__StateMachine__Group_4__2 ;
    public final void rule__StateMachine__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:858:1: ( rule__StateMachine__Group_4__1__Impl rule__StateMachine__Group_4__2 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:859:2: rule__StateMachine__Group_4__1__Impl rule__StateMachine__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_4__1__Impl_in_rule__StateMachine__Group_4__11721);
            rule__StateMachine__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_4__2_in_rule__StateMachine__Group_4__11724);
            rule__StateMachine__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_4__1"


    // $ANTLR start "rule__StateMachine__Group_4__1__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:866:1: rule__StateMachine__Group_4__1__Impl : ( ( rule__StateMachine__TransitionsAssignment_4_1 ) ) ;
    public final void rule__StateMachine__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:870:1: ( ( ( rule__StateMachine__TransitionsAssignment_4_1 ) ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:871:1: ( ( rule__StateMachine__TransitionsAssignment_4_1 ) )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:871:1: ( ( rule__StateMachine__TransitionsAssignment_4_1 ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:872:1: ( rule__StateMachine__TransitionsAssignment_4_1 )
            {
             before(grammarAccess.getStateMachineAccess().getTransitionsAssignment_4_1()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:873:1: ( rule__StateMachine__TransitionsAssignment_4_1 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:873:2: rule__StateMachine__TransitionsAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__TransitionsAssignment_4_1_in_rule__StateMachine__Group_4__1__Impl1751);
            rule__StateMachine__TransitionsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getTransitionsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_4__1__Impl"


    // $ANTLR start "rule__StateMachine__Group_4__2"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:883:1: rule__StateMachine__Group_4__2 : rule__StateMachine__Group_4__2__Impl ;
    public final void rule__StateMachine__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:887:1: ( rule__StateMachine__Group_4__2__Impl )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:888:2: rule__StateMachine__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_4__2__Impl_in_rule__StateMachine__Group_4__21781);
            rule__StateMachine__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_4__2"


    // $ANTLR start "rule__StateMachine__Group_4__2__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:894:1: rule__StateMachine__Group_4__2__Impl : ( ( rule__StateMachine__Group_4_2__0 )* ) ;
    public final void rule__StateMachine__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:898:1: ( ( ( rule__StateMachine__Group_4_2__0 )* ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:899:1: ( ( rule__StateMachine__Group_4_2__0 )* )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:899:1: ( ( rule__StateMachine__Group_4_2__0 )* )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:900:1: ( rule__StateMachine__Group_4_2__0 )*
            {
             before(grammarAccess.getStateMachineAccess().getGroup_4_2()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:901:1: ( rule__StateMachine__Group_4_2__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==14) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:901:2: rule__StateMachine__Group_4_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_4_2__0_in_rule__StateMachine__Group_4__2__Impl1808);
            	    rule__StateMachine__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getStateMachineAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_4__2__Impl"


    // $ANTLR start "rule__StateMachine__Group_4_2__0"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:917:1: rule__StateMachine__Group_4_2__0 : rule__StateMachine__Group_4_2__0__Impl rule__StateMachine__Group_4_2__1 ;
    public final void rule__StateMachine__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:921:1: ( rule__StateMachine__Group_4_2__0__Impl rule__StateMachine__Group_4_2__1 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:922:2: rule__StateMachine__Group_4_2__0__Impl rule__StateMachine__Group_4_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_4_2__0__Impl_in_rule__StateMachine__Group_4_2__01845);
            rule__StateMachine__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_4_2__1_in_rule__StateMachine__Group_4_2__01848);
            rule__StateMachine__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_4_2__0"


    // $ANTLR start "rule__StateMachine__Group_4_2__0__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:929:1: rule__StateMachine__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__StateMachine__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:933:1: ( ( ',' ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:934:1: ( ',' )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:934:1: ( ',' )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:935:1: ','
            {
             before(grammarAccess.getStateMachineAccess().getCommaKeyword_4_2_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__StateMachine__Group_4_2__0__Impl1876); 
             after(grammarAccess.getStateMachineAccess().getCommaKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_4_2__0__Impl"


    // $ANTLR start "rule__StateMachine__Group_4_2__1"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:948:1: rule__StateMachine__Group_4_2__1 : rule__StateMachine__Group_4_2__1__Impl ;
    public final void rule__StateMachine__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:952:1: ( rule__StateMachine__Group_4_2__1__Impl )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:953:2: rule__StateMachine__Group_4_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_4_2__1__Impl_in_rule__StateMachine__Group_4_2__11907);
            rule__StateMachine__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_4_2__1"


    // $ANTLR start "rule__StateMachine__Group_4_2__1__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:959:1: rule__StateMachine__Group_4_2__1__Impl : ( ( rule__StateMachine__TransitionsAssignment_4_2_1 ) ) ;
    public final void rule__StateMachine__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:963:1: ( ( ( rule__StateMachine__TransitionsAssignment_4_2_1 ) ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:964:1: ( ( rule__StateMachine__TransitionsAssignment_4_2_1 ) )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:964:1: ( ( rule__StateMachine__TransitionsAssignment_4_2_1 ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:965:1: ( rule__StateMachine__TransitionsAssignment_4_2_1 )
            {
             before(grammarAccess.getStateMachineAccess().getTransitionsAssignment_4_2_1()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:966:1: ( rule__StateMachine__TransitionsAssignment_4_2_1 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:966:2: rule__StateMachine__TransitionsAssignment_4_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__TransitionsAssignment_4_2_1_in_rule__StateMachine__Group_4_2__1__Impl1934);
            rule__StateMachine__TransitionsAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getTransitionsAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_4_2__1__Impl"


    // $ANTLR start "rule__StateMachine__Group_5__0"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:980:1: rule__StateMachine__Group_5__0 : rule__StateMachine__Group_5__0__Impl rule__StateMachine__Group_5__1 ;
    public final void rule__StateMachine__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:984:1: ( rule__StateMachine__Group_5__0__Impl rule__StateMachine__Group_5__1 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:985:2: rule__StateMachine__Group_5__0__Impl rule__StateMachine__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_5__0__Impl_in_rule__StateMachine__Group_5__01968);
            rule__StateMachine__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_5__1_in_rule__StateMachine__Group_5__01971);
            rule__StateMachine__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_5__0"


    // $ANTLR start "rule__StateMachine__Group_5__0__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:992:1: rule__StateMachine__Group_5__0__Impl : ( 'StateMachines' ) ;
    public final void rule__StateMachine__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:996:1: ( ( 'StateMachines' ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:997:1: ( 'StateMachines' )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:997:1: ( 'StateMachines' )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:998:1: 'StateMachines'
            {
             before(grammarAccess.getStateMachineAccess().getStateMachinesKeyword_5_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__StateMachine__Group_5__0__Impl1999); 
             after(grammarAccess.getStateMachineAccess().getStateMachinesKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_5__0__Impl"


    // $ANTLR start "rule__StateMachine__Group_5__1"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1011:1: rule__StateMachine__Group_5__1 : rule__StateMachine__Group_5__1__Impl rule__StateMachine__Group_5__2 ;
    public final void rule__StateMachine__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1015:1: ( rule__StateMachine__Group_5__1__Impl rule__StateMachine__Group_5__2 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1016:2: rule__StateMachine__Group_5__1__Impl rule__StateMachine__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_5__1__Impl_in_rule__StateMachine__Group_5__12030);
            rule__StateMachine__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_5__2_in_rule__StateMachine__Group_5__12033);
            rule__StateMachine__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_5__1"


    // $ANTLR start "rule__StateMachine__Group_5__1__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1023:1: rule__StateMachine__Group_5__1__Impl : ( ( rule__StateMachine__StateMachinesAssignment_5_1 ) ) ;
    public final void rule__StateMachine__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1027:1: ( ( ( rule__StateMachine__StateMachinesAssignment_5_1 ) ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1028:1: ( ( rule__StateMachine__StateMachinesAssignment_5_1 ) )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1028:1: ( ( rule__StateMachine__StateMachinesAssignment_5_1 ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1029:1: ( rule__StateMachine__StateMachinesAssignment_5_1 )
            {
             before(grammarAccess.getStateMachineAccess().getStateMachinesAssignment_5_1()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1030:1: ( rule__StateMachine__StateMachinesAssignment_5_1 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1030:2: rule__StateMachine__StateMachinesAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__StateMachinesAssignment_5_1_in_rule__StateMachine__Group_5__1__Impl2060);
            rule__StateMachine__StateMachinesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getStateMachinesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_5__1__Impl"


    // $ANTLR start "rule__StateMachine__Group_5__2"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1040:1: rule__StateMachine__Group_5__2 : rule__StateMachine__Group_5__2__Impl ;
    public final void rule__StateMachine__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1044:1: ( rule__StateMachine__Group_5__2__Impl )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1045:2: rule__StateMachine__Group_5__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_5__2__Impl_in_rule__StateMachine__Group_5__22090);
            rule__StateMachine__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_5__2"


    // $ANTLR start "rule__StateMachine__Group_5__2__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1051:1: rule__StateMachine__Group_5__2__Impl : ( ( rule__StateMachine__Group_5_2__0 )* ) ;
    public final void rule__StateMachine__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1055:1: ( ( ( rule__StateMachine__Group_5_2__0 )* ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1056:1: ( ( rule__StateMachine__Group_5_2__0 )* )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1056:1: ( ( rule__StateMachine__Group_5_2__0 )* )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1057:1: ( rule__StateMachine__Group_5_2__0 )*
            {
             before(grammarAccess.getStateMachineAccess().getGroup_5_2()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1058:1: ( rule__StateMachine__Group_5_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==14) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1058:2: rule__StateMachine__Group_5_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_5_2__0_in_rule__StateMachine__Group_5__2__Impl2117);
            	    rule__StateMachine__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getStateMachineAccess().getGroup_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_5__2__Impl"


    // $ANTLR start "rule__StateMachine__Group_5_2__0"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1074:1: rule__StateMachine__Group_5_2__0 : rule__StateMachine__Group_5_2__0__Impl rule__StateMachine__Group_5_2__1 ;
    public final void rule__StateMachine__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1078:1: ( rule__StateMachine__Group_5_2__0__Impl rule__StateMachine__Group_5_2__1 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1079:2: rule__StateMachine__Group_5_2__0__Impl rule__StateMachine__Group_5_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_5_2__0__Impl_in_rule__StateMachine__Group_5_2__02154);
            rule__StateMachine__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_5_2__1_in_rule__StateMachine__Group_5_2__02157);
            rule__StateMachine__Group_5_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_5_2__0"


    // $ANTLR start "rule__StateMachine__Group_5_2__0__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1086:1: rule__StateMachine__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__StateMachine__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1090:1: ( ( ',' ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1091:1: ( ',' )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1091:1: ( ',' )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1092:1: ','
            {
             before(grammarAccess.getStateMachineAccess().getCommaKeyword_5_2_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__StateMachine__Group_5_2__0__Impl2185); 
             after(grammarAccess.getStateMachineAccess().getCommaKeyword_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_5_2__0__Impl"


    // $ANTLR start "rule__StateMachine__Group_5_2__1"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1105:1: rule__StateMachine__Group_5_2__1 : rule__StateMachine__Group_5_2__1__Impl ;
    public final void rule__StateMachine__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1109:1: ( rule__StateMachine__Group_5_2__1__Impl )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1110:2: rule__StateMachine__Group_5_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_5_2__1__Impl_in_rule__StateMachine__Group_5_2__12216);
            rule__StateMachine__Group_5_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_5_2__1"


    // $ANTLR start "rule__StateMachine__Group_5_2__1__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1116:1: rule__StateMachine__Group_5_2__1__Impl : ( ( rule__StateMachine__StateMachinesAssignment_5_2_1 ) ) ;
    public final void rule__StateMachine__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1120:1: ( ( ( rule__StateMachine__StateMachinesAssignment_5_2_1 ) ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1121:1: ( ( rule__StateMachine__StateMachinesAssignment_5_2_1 ) )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1121:1: ( ( rule__StateMachine__StateMachinesAssignment_5_2_1 ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1122:1: ( rule__StateMachine__StateMachinesAssignment_5_2_1 )
            {
             before(grammarAccess.getStateMachineAccess().getStateMachinesAssignment_5_2_1()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1123:1: ( rule__StateMachine__StateMachinesAssignment_5_2_1 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1123:2: rule__StateMachine__StateMachinesAssignment_5_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__StateMachinesAssignment_5_2_1_in_rule__StateMachine__Group_5_2__1__Impl2243);
            rule__StateMachine__StateMachinesAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getStateMachinesAssignment_5_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_5_2__1__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1137:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1141:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1142:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__02277);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__02280);
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1149:1: rule__Transition__Group__0__Impl : ( () ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1153:1: ( ( () ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1154:1: ( () )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1154:1: ( () )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1155:1: ()
            {
             before(grammarAccess.getTransitionAccess().getTransitionAction_0()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1156:1: ()
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1158:1: 
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1168:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1172:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1173:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__12338);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__12341);
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1180:1: rule__Transition__Group__1__Impl : ( 'Transition' ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1184:1: ( ( 'Transition' ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1185:1: ( 'Transition' )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1185:1: ( 'Transition' )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1186:1: 'Transition'
            {
             before(grammarAccess.getTransitionAccess().getTransitionKeyword_1()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Transition__Group__1__Impl2369); 
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1199:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1203:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1204:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__22400);
            rule__Transition__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__22403);
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1211:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__Group_2__0 )? ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1215:1: ( ( ( rule__Transition__Group_2__0 )? ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1216:1: ( ( rule__Transition__Group_2__0 )? )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1216:1: ( ( rule__Transition__Group_2__0 )? )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1217:1: ( rule__Transition__Group_2__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_2()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1218:1: ( rule__Transition__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1218:2: rule__Transition__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_2__0_in_rule__Transition__Group__2__Impl2430);
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1228:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1232:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1233:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__32461);
            rule__Transition__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__4_in_rule__Transition__Group__32464);
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1240:1: rule__Transition__Group__3__Impl : ( ( rule__Transition__Group_3__0 )? ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1244:1: ( ( ( rule__Transition__Group_3__0 )? ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1245:1: ( ( rule__Transition__Group_3__0 )? )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1245:1: ( ( rule__Transition__Group_3__0 )? )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1246:1: ( rule__Transition__Group_3__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_3()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1247:1: ( rule__Transition__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1247:2: rule__Transition__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_3__0_in_rule__Transition__Group__3__Impl2491);
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1257:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1261:1: ( rule__Transition__Group__4__Impl )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1262:2: rule__Transition__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__4__Impl_in_rule__Transition__Group__42522);
            rule__Transition__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1268:1: rule__Transition__Group__4__Impl : ( ( rule__Transition__Group_4__0 )? ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1272:1: ( ( ( rule__Transition__Group_4__0 )? ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1273:1: ( ( rule__Transition__Group_4__0 )? )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1273:1: ( ( rule__Transition__Group_4__0 )? )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1274:1: ( rule__Transition__Group_4__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_4()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1275:1: ( rule__Transition__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1275:2: rule__Transition__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4__0_in_rule__Transition__Group__4__Impl2549);
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


    // $ANTLR start "rule__Transition__Group_2__0"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1295:1: rule__Transition__Group_2__0 : rule__Transition__Group_2__0__Impl rule__Transition__Group_2__1 ;
    public final void rule__Transition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1299:1: ( rule__Transition__Group_2__0__Impl rule__Transition__Group_2__1 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1300:2: rule__Transition__Group_2__0__Impl rule__Transition__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_2__0__Impl_in_rule__Transition__Group_2__02590);
            rule__Transition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_2__1_in_rule__Transition__Group_2__02593);
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1307:1: rule__Transition__Group_2__0__Impl : ( 'event' ) ;
    public final void rule__Transition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1311:1: ( ( 'event' ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1312:1: ( 'event' )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1312:1: ( 'event' )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1313:1: 'event'
            {
             before(grammarAccess.getTransitionAccess().getEventKeyword_2_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Transition__Group_2__0__Impl2621); 
             after(grammarAccess.getTransitionAccess().getEventKeyword_2_0()); 

            }


            }

        }
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1326:1: rule__Transition__Group_2__1 : rule__Transition__Group_2__1__Impl ;
    public final void rule__Transition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1330:1: ( rule__Transition__Group_2__1__Impl )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1331:2: rule__Transition__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_2__1__Impl_in_rule__Transition__Group_2__12652);
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1337:1: rule__Transition__Group_2__1__Impl : ( ( rule__Transition__EventAssignment_2_1 ) ) ;
    public final void rule__Transition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1341:1: ( ( ( rule__Transition__EventAssignment_2_1 ) ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1342:1: ( ( rule__Transition__EventAssignment_2_1 ) )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1342:1: ( ( rule__Transition__EventAssignment_2_1 ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1343:1: ( rule__Transition__EventAssignment_2_1 )
            {
             before(grammarAccess.getTransitionAccess().getEventAssignment_2_1()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1344:1: ( rule__Transition__EventAssignment_2_1 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1344:2: rule__Transition__EventAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__EventAssignment_2_1_in_rule__Transition__Group_2__1__Impl2679);
            rule__Transition__EventAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getEventAssignment_2_1()); 

            }


            }

        }
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1358:1: rule__Transition__Group_3__0 : rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1 ;
    public final void rule__Transition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1362:1: ( rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1363:2: rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_3__0__Impl_in_rule__Transition__Group_3__02713);
            rule__Transition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_3__1_in_rule__Transition__Group_3__02716);
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1370:1: rule__Transition__Group_3__0__Impl : ( 'source' ) ;
    public final void rule__Transition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1374:1: ( ( 'source' ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1375:1: ( 'source' )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1375:1: ( 'source' )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1376:1: 'source'
            {
             before(grammarAccess.getTransitionAccess().getSourceKeyword_3_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Transition__Group_3__0__Impl2744); 
             after(grammarAccess.getTransitionAccess().getSourceKeyword_3_0()); 

            }


            }

        }
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1389:1: rule__Transition__Group_3__1 : rule__Transition__Group_3__1__Impl ;
    public final void rule__Transition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1393:1: ( rule__Transition__Group_3__1__Impl )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1394:2: rule__Transition__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_3__1__Impl_in_rule__Transition__Group_3__12775);
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1400:1: rule__Transition__Group_3__1__Impl : ( ( rule__Transition__SourceAssignment_3_1 ) ) ;
    public final void rule__Transition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1404:1: ( ( ( rule__Transition__SourceAssignment_3_1 ) ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1405:1: ( ( rule__Transition__SourceAssignment_3_1 ) )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1405:1: ( ( rule__Transition__SourceAssignment_3_1 ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1406:1: ( rule__Transition__SourceAssignment_3_1 )
            {
             before(grammarAccess.getTransitionAccess().getSourceAssignment_3_1()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1407:1: ( rule__Transition__SourceAssignment_3_1 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1407:2: rule__Transition__SourceAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__SourceAssignment_3_1_in_rule__Transition__Group_3__1__Impl2802);
            rule__Transition__SourceAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getSourceAssignment_3_1()); 

            }


            }

        }
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1421:1: rule__Transition__Group_4__0 : rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1 ;
    public final void rule__Transition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1425:1: ( rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1426:2: rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4__0__Impl_in_rule__Transition__Group_4__02836);
            rule__Transition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4__1_in_rule__Transition__Group_4__02839);
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1433:1: rule__Transition__Group_4__0__Impl : ( 'target' ) ;
    public final void rule__Transition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1437:1: ( ( 'target' ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1438:1: ( 'target' )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1438:1: ( 'target' )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1439:1: 'target'
            {
             before(grammarAccess.getTransitionAccess().getTargetKeyword_4_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Transition__Group_4__0__Impl2867); 
             after(grammarAccess.getTransitionAccess().getTargetKeyword_4_0()); 

            }


            }

        }
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1452:1: rule__Transition__Group_4__1 : rule__Transition__Group_4__1__Impl ;
    public final void rule__Transition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1456:1: ( rule__Transition__Group_4__1__Impl )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1457:2: rule__Transition__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4__1__Impl_in_rule__Transition__Group_4__12898);
            rule__Transition__Group_4__1__Impl();

            state._fsp--;


            }

        }
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1463:1: rule__Transition__Group_4__1__Impl : ( ( rule__Transition__TargetAssignment_4_1 ) ) ;
    public final void rule__Transition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1467:1: ( ( ( rule__Transition__TargetAssignment_4_1 ) ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1468:1: ( ( rule__Transition__TargetAssignment_4_1 ) )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1468:1: ( ( rule__Transition__TargetAssignment_4_1 ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1469:1: ( rule__Transition__TargetAssignment_4_1 )
            {
             before(grammarAccess.getTransitionAccess().getTargetAssignment_4_1()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1470:1: ( rule__Transition__TargetAssignment_4_1 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1470:2: rule__Transition__TargetAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__TargetAssignment_4_1_in_rule__Transition__Group_4__1__Impl2925);
            rule__Transition__TargetAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getTargetAssignment_4_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__State__Group__0"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1484:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1488:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1489:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__02959);
            rule__State__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group__1_in_rule__State__Group__02962);
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1496:1: rule__State__Group__0__Impl : ( () ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1500:1: ( ( () ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1501:1: ( () )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1501:1: ( () )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1502:1: ()
            {
             before(grammarAccess.getStateAccess().getStateAction_0()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1503:1: ()
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1505:1: 
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1515:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1519:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1520:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__13020);
            rule__State__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group__2_in_rule__State__Group__13023);
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1527:1: rule__State__Group__1__Impl : ( 'State' ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1531:1: ( ( 'State' ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1532:1: ( 'State' )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1532:1: ( 'State' )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1533:1: 'State'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_1()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__State__Group__1__Impl3051); 
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1546:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1550:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1551:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__23082);
            rule__State__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group__3_in_rule__State__Group__23085);
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1558:1: rule__State__Group__2__Impl : ( ( rule__State__NameAssignment_2 ) ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1562:1: ( ( ( rule__State__NameAssignment_2 ) ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1563:1: ( ( rule__State__NameAssignment_2 ) )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1563:1: ( ( rule__State__NameAssignment_2 ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1564:1: ( rule__State__NameAssignment_2 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_2()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1565:1: ( rule__State__NameAssignment_2 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1565:2: rule__State__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__NameAssignment_2_in_rule__State__Group__2__Impl3112);
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1575:1: rule__State__Group__3 : rule__State__Group__3__Impl ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1579:1: ( rule__State__Group__3__Impl )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1580:2: rule__State__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group__3__Impl_in_rule__State__Group__33142);
            rule__State__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1586:1: rule__State__Group__3__Impl : ( ( rule__State__Group_3__0 )? ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1590:1: ( ( ( rule__State__Group_3__0 )? ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1591:1: ( ( rule__State__Group_3__0 )? )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1591:1: ( ( rule__State__Group_3__0 )? )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1592:1: ( rule__State__Group_3__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_3()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1593:1: ( rule__State__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1593:2: rule__State__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__State__Group_3__0_in_rule__State__Group__3__Impl3169);
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


    // $ANTLR start "rule__State__Group_3__0"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1611:1: rule__State__Group_3__0 : rule__State__Group_3__0__Impl rule__State__Group_3__1 ;
    public final void rule__State__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1615:1: ( rule__State__Group_3__0__Impl rule__State__Group_3__1 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1616:2: rule__State__Group_3__0__Impl rule__State__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_3__0__Impl_in_rule__State__Group_3__03208);
            rule__State__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_3__1_in_rule__State__Group_3__03211);
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1623:1: rule__State__Group_3__0__Impl : ( 'nested' ) ;
    public final void rule__State__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1627:1: ( ( 'nested' ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1628:1: ( 'nested' )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1628:1: ( 'nested' )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1629:1: 'nested'
            {
             before(grammarAccess.getStateAccess().getNestedKeyword_3_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__State__Group_3__0__Impl3239); 
             after(grammarAccess.getStateAccess().getNestedKeyword_3_0()); 

            }


            }

        }
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1642:1: rule__State__Group_3__1 : rule__State__Group_3__1__Impl ;
    public final void rule__State__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1646:1: ( rule__State__Group_3__1__Impl )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1647:2: rule__State__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_3__1__Impl_in_rule__State__Group_3__13270);
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1653:1: rule__State__Group_3__1__Impl : ( ( rule__State__NestedAssignment_3_1 ) ) ;
    public final void rule__State__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1657:1: ( ( ( rule__State__NestedAssignment_3_1 ) ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1658:1: ( ( rule__State__NestedAssignment_3_1 ) )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1658:1: ( ( rule__State__NestedAssignment_3_1 ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1659:1: ( rule__State__NestedAssignment_3_1 )
            {
             before(grammarAccess.getStateAccess().getNestedAssignment_3_1()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1660:1: ( rule__State__NestedAssignment_3_1 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1660:2: rule__State__NestedAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__NestedAssignment_3_1_in_rule__State__Group_3__1__Impl3297);
            rule__State__NestedAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNestedAssignment_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Initial__Group__0"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1674:1: rule__Initial__Group__0 : rule__Initial__Group__0__Impl rule__Initial__Group__1 ;
    public final void rule__Initial__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1678:1: ( rule__Initial__Group__0__Impl rule__Initial__Group__1 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1679:2: rule__Initial__Group__0__Impl rule__Initial__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Initial__Group__0__Impl_in_rule__Initial__Group__03331);
            rule__Initial__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Initial__Group__1_in_rule__Initial__Group__03334);
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1686:1: rule__Initial__Group__0__Impl : ( () ) ;
    public final void rule__Initial__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1690:1: ( ( () ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1691:1: ( () )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1691:1: ( () )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1692:1: ()
            {
             before(grammarAccess.getInitialAccess().getInitialAction_0()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1693:1: ()
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1695:1: 
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1705:1: rule__Initial__Group__1 : rule__Initial__Group__1__Impl rule__Initial__Group__2 ;
    public final void rule__Initial__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1709:1: ( rule__Initial__Group__1__Impl rule__Initial__Group__2 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1710:2: rule__Initial__Group__1__Impl rule__Initial__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Initial__Group__1__Impl_in_rule__Initial__Group__13392);
            rule__Initial__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Initial__Group__2_in_rule__Initial__Group__13395);
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1717:1: rule__Initial__Group__1__Impl : ( 'Initial' ) ;
    public final void rule__Initial__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1721:1: ( ( 'Initial' ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1722:1: ( 'Initial' )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1722:1: ( 'Initial' )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1723:1: 'Initial'
            {
             before(grammarAccess.getInitialAccess().getInitialKeyword_1()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Initial__Group__1__Impl3423); 
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1736:1: rule__Initial__Group__2 : rule__Initial__Group__2__Impl ;
    public final void rule__Initial__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1740:1: ( rule__Initial__Group__2__Impl )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1741:2: rule__Initial__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Initial__Group__2__Impl_in_rule__Initial__Group__23454);
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1747:1: rule__Initial__Group__2__Impl : ( ( rule__Initial__NameAssignment_2 ) ) ;
    public final void rule__Initial__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1751:1: ( ( ( rule__Initial__NameAssignment_2 ) ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1752:1: ( ( rule__Initial__NameAssignment_2 ) )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1752:1: ( ( rule__Initial__NameAssignment_2 ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1753:1: ( rule__Initial__NameAssignment_2 )
            {
             before(grammarAccess.getInitialAccess().getNameAssignment_2()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1754:1: ( rule__Initial__NameAssignment_2 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1754:2: rule__Initial__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Initial__NameAssignment_2_in_rule__Initial__Group__2__Impl3481);
            rule__Initial__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInitialAccess().getNameAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Junction__Group__0"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1770:1: rule__Junction__Group__0 : rule__Junction__Group__0__Impl rule__Junction__Group__1 ;
    public final void rule__Junction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1774:1: ( rule__Junction__Group__0__Impl rule__Junction__Group__1 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1775:2: rule__Junction__Group__0__Impl rule__Junction__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Junction__Group__0__Impl_in_rule__Junction__Group__03517);
            rule__Junction__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Junction__Group__1_in_rule__Junction__Group__03520);
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1782:1: rule__Junction__Group__0__Impl : ( () ) ;
    public final void rule__Junction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1786:1: ( ( () ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1787:1: ( () )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1787:1: ( () )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1788:1: ()
            {
             before(grammarAccess.getJunctionAccess().getJunctionAction_0()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1789:1: ()
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1791:1: 
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1801:1: rule__Junction__Group__1 : rule__Junction__Group__1__Impl rule__Junction__Group__2 ;
    public final void rule__Junction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1805:1: ( rule__Junction__Group__1__Impl rule__Junction__Group__2 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1806:2: rule__Junction__Group__1__Impl rule__Junction__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Junction__Group__1__Impl_in_rule__Junction__Group__13578);
            rule__Junction__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Junction__Group__2_in_rule__Junction__Group__13581);
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1813:1: rule__Junction__Group__1__Impl : ( 'Junction' ) ;
    public final void rule__Junction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1817:1: ( ( 'Junction' ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1818:1: ( 'Junction' )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1818:1: ( 'Junction' )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1819:1: 'Junction'
            {
             before(grammarAccess.getJunctionAccess().getJunctionKeyword_1()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Junction__Group__1__Impl3609); 
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1832:1: rule__Junction__Group__2 : rule__Junction__Group__2__Impl ;
    public final void rule__Junction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1836:1: ( rule__Junction__Group__2__Impl )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1837:2: rule__Junction__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Junction__Group__2__Impl_in_rule__Junction__Group__23640);
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1843:1: rule__Junction__Group__2__Impl : ( ( rule__Junction__NameAssignment_2 ) ) ;
    public final void rule__Junction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1847:1: ( ( ( rule__Junction__NameAssignment_2 ) ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1848:1: ( ( rule__Junction__NameAssignment_2 ) )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1848:1: ( ( rule__Junction__NameAssignment_2 ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1849:1: ( rule__Junction__NameAssignment_2 )
            {
             before(grammarAccess.getJunctionAccess().getNameAssignment_2()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1850:1: ( rule__Junction__NameAssignment_2 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1850:2: rule__Junction__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Junction__NameAssignment_2_in_rule__Junction__Group__2__Impl3667);
            rule__Junction__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getJunctionAccess().getNameAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Fork__Group__0"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1866:1: rule__Fork__Group__0 : rule__Fork__Group__0__Impl rule__Fork__Group__1 ;
    public final void rule__Fork__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1870:1: ( rule__Fork__Group__0__Impl rule__Fork__Group__1 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1871:2: rule__Fork__Group__0__Impl rule__Fork__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fork__Group__0__Impl_in_rule__Fork__Group__03703);
            rule__Fork__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fork__Group__1_in_rule__Fork__Group__03706);
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1878:1: rule__Fork__Group__0__Impl : ( () ) ;
    public final void rule__Fork__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1882:1: ( ( () ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1883:1: ( () )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1883:1: ( () )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1884:1: ()
            {
             before(grammarAccess.getForkAccess().getForkAction_0()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1885:1: ()
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1887:1: 
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1897:1: rule__Fork__Group__1 : rule__Fork__Group__1__Impl rule__Fork__Group__2 ;
    public final void rule__Fork__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1901:1: ( rule__Fork__Group__1__Impl rule__Fork__Group__2 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1902:2: rule__Fork__Group__1__Impl rule__Fork__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fork__Group__1__Impl_in_rule__Fork__Group__13764);
            rule__Fork__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fork__Group__2_in_rule__Fork__Group__13767);
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1909:1: rule__Fork__Group__1__Impl : ( 'Fork' ) ;
    public final void rule__Fork__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1913:1: ( ( 'Fork' ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1914:1: ( 'Fork' )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1914:1: ( 'Fork' )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1915:1: 'Fork'
            {
             before(grammarAccess.getForkAccess().getForkKeyword_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Fork__Group__1__Impl3795); 
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1928:1: rule__Fork__Group__2 : rule__Fork__Group__2__Impl ;
    public final void rule__Fork__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1932:1: ( rule__Fork__Group__2__Impl )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1933:2: rule__Fork__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fork__Group__2__Impl_in_rule__Fork__Group__23826);
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1939:1: rule__Fork__Group__2__Impl : ( ( rule__Fork__NameAssignment_2 ) ) ;
    public final void rule__Fork__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1943:1: ( ( ( rule__Fork__NameAssignment_2 ) ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1944:1: ( ( rule__Fork__NameAssignment_2 ) )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1944:1: ( ( rule__Fork__NameAssignment_2 ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1945:1: ( rule__Fork__NameAssignment_2 )
            {
             before(grammarAccess.getForkAccess().getNameAssignment_2()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1946:1: ( rule__Fork__NameAssignment_2 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1946:2: rule__Fork__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fork__NameAssignment_2_in_rule__Fork__Group__2__Impl3853);
            rule__Fork__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getForkAccess().getNameAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Join__Group__0"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1962:1: rule__Join__Group__0 : rule__Join__Group__0__Impl rule__Join__Group__1 ;
    public final void rule__Join__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1966:1: ( rule__Join__Group__0__Impl rule__Join__Group__1 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1967:2: rule__Join__Group__0__Impl rule__Join__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Join__Group__0__Impl_in_rule__Join__Group__03889);
            rule__Join__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Join__Group__1_in_rule__Join__Group__03892);
            rule__Join__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__Group__0"


    // $ANTLR start "rule__Join__Group__0__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1974:1: rule__Join__Group__0__Impl : ( () ) ;
    public final void rule__Join__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1978:1: ( ( () ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1979:1: ( () )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1979:1: ( () )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1980:1: ()
            {
             before(grammarAccess.getJoinAccess().getJoinAction_0()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1981:1: ()
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1983:1: 
            {
            }

             after(grammarAccess.getJoinAccess().getJoinAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__Group__0__Impl"


    // $ANTLR start "rule__Join__Group__1"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1993:1: rule__Join__Group__1 : rule__Join__Group__1__Impl rule__Join__Group__2 ;
    public final void rule__Join__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1997:1: ( rule__Join__Group__1__Impl rule__Join__Group__2 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1998:2: rule__Join__Group__1__Impl rule__Join__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Join__Group__1__Impl_in_rule__Join__Group__13950);
            rule__Join__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Join__Group__2_in_rule__Join__Group__13953);
            rule__Join__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__Group__1"


    // $ANTLR start "rule__Join__Group__1__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2005:1: rule__Join__Group__1__Impl : ( 'Join' ) ;
    public final void rule__Join__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2009:1: ( ( 'Join' ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2010:1: ( 'Join' )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2010:1: ( 'Join' )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2011:1: 'Join'
            {
             before(grammarAccess.getJoinAccess().getJoinKeyword_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Join__Group__1__Impl3981); 
             after(grammarAccess.getJoinAccess().getJoinKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__Group__1__Impl"


    // $ANTLR start "rule__Join__Group__2"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2024:1: rule__Join__Group__2 : rule__Join__Group__2__Impl ;
    public final void rule__Join__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2028:1: ( rule__Join__Group__2__Impl )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2029:2: rule__Join__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Join__Group__2__Impl_in_rule__Join__Group__24012);
            rule__Join__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__Group__2"


    // $ANTLR start "rule__Join__Group__2__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2035:1: rule__Join__Group__2__Impl : ( ( rule__Join__NameAssignment_2 ) ) ;
    public final void rule__Join__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2039:1: ( ( ( rule__Join__NameAssignment_2 ) ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2040:1: ( ( rule__Join__NameAssignment_2 ) )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2040:1: ( ( rule__Join__NameAssignment_2 ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2041:1: ( rule__Join__NameAssignment_2 )
            {
             before(grammarAccess.getJoinAccess().getNameAssignment_2()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2042:1: ( rule__Join__NameAssignment_2 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2042:2: rule__Join__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Join__NameAssignment_2_in_rule__Join__Group__2__Impl4039);
            rule__Join__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getJoinAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__Group__2__Impl"


    // $ANTLR start "rule__Any__Group__0"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2058:1: rule__Any__Group__0 : rule__Any__Group__0__Impl rule__Any__Group__1 ;
    public final void rule__Any__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2062:1: ( rule__Any__Group__0__Impl rule__Any__Group__1 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2063:2: rule__Any__Group__0__Impl rule__Any__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Any__Group__0__Impl_in_rule__Any__Group__04075);
            rule__Any__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Any__Group__1_in_rule__Any__Group__04078);
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2070:1: rule__Any__Group__0__Impl : ( () ) ;
    public final void rule__Any__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2074:1: ( ( () ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2075:1: ( () )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2075:1: ( () )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2076:1: ()
            {
             before(grammarAccess.getAnyAccess().getAnyAction_0()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2077:1: ()
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2079:1: 
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2089:1: rule__Any__Group__1 : rule__Any__Group__1__Impl rule__Any__Group__2 ;
    public final void rule__Any__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2093:1: ( rule__Any__Group__1__Impl rule__Any__Group__2 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2094:2: rule__Any__Group__1__Impl rule__Any__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Any__Group__1__Impl_in_rule__Any__Group__14136);
            rule__Any__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Any__Group__2_in_rule__Any__Group__14139);
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2101:1: rule__Any__Group__1__Impl : ( 'Any' ) ;
    public final void rule__Any__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2105:1: ( ( 'Any' ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2106:1: ( 'Any' )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2106:1: ( 'Any' )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2107:1: 'Any'
            {
             before(grammarAccess.getAnyAccess().getAnyKeyword_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Any__Group__1__Impl4167); 
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2120:1: rule__Any__Group__2 : rule__Any__Group__2__Impl ;
    public final void rule__Any__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2124:1: ( rule__Any__Group__2__Impl )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2125:2: rule__Any__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Any__Group__2__Impl_in_rule__Any__Group__24198);
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2131:1: rule__Any__Group__2__Impl : ( ( rule__Any__NameAssignment_2 ) ) ;
    public final void rule__Any__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2135:1: ( ( ( rule__Any__NameAssignment_2 ) ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2136:1: ( ( rule__Any__NameAssignment_2 ) )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2136:1: ( ( rule__Any__NameAssignment_2 ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2137:1: ( rule__Any__NameAssignment_2 )
            {
             before(grammarAccess.getAnyAccess().getNameAssignment_2()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2138:1: ( rule__Any__NameAssignment_2 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2138:2: rule__Any__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Any__NameAssignment_2_in_rule__Any__Group__2__Impl4225);
            rule__Any__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAnyAccess().getNameAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Final__Group__0"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2154:1: rule__Final__Group__0 : rule__Final__Group__0__Impl rule__Final__Group__1 ;
    public final void rule__Final__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2158:1: ( rule__Final__Group__0__Impl rule__Final__Group__1 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2159:2: rule__Final__Group__0__Impl rule__Final__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Final__Group__0__Impl_in_rule__Final__Group__04261);
            rule__Final__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Final__Group__1_in_rule__Final__Group__04264);
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2166:1: rule__Final__Group__0__Impl : ( () ) ;
    public final void rule__Final__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2170:1: ( ( () ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2171:1: ( () )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2171:1: ( () )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2172:1: ()
            {
             before(grammarAccess.getFinalAccess().getFinalAction_0()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2173:1: ()
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2175:1: 
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2185:1: rule__Final__Group__1 : rule__Final__Group__1__Impl rule__Final__Group__2 ;
    public final void rule__Final__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2189:1: ( rule__Final__Group__1__Impl rule__Final__Group__2 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2190:2: rule__Final__Group__1__Impl rule__Final__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Final__Group__1__Impl_in_rule__Final__Group__14322);
            rule__Final__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Final__Group__2_in_rule__Final__Group__14325);
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2197:1: rule__Final__Group__1__Impl : ( 'Final' ) ;
    public final void rule__Final__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2201:1: ( ( 'Final' ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2202:1: ( 'Final' )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2202:1: ( 'Final' )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2203:1: 'Final'
            {
             before(grammarAccess.getFinalAccess().getFinalKeyword_1()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Final__Group__1__Impl4353); 
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2216:1: rule__Final__Group__2 : rule__Final__Group__2__Impl ;
    public final void rule__Final__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2220:1: ( rule__Final__Group__2__Impl )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2221:2: rule__Final__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Final__Group__2__Impl_in_rule__Final__Group__24384);
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2227:1: rule__Final__Group__2__Impl : ( ( rule__Final__NameAssignment_2 ) ) ;
    public final void rule__Final__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2231:1: ( ( ( rule__Final__NameAssignment_2 ) ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2232:1: ( ( rule__Final__NameAssignment_2 ) )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2232:1: ( ( rule__Final__NameAssignment_2 ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2233:1: ( rule__Final__NameAssignment_2 )
            {
             before(grammarAccess.getFinalAccess().getNameAssignment_2()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2234:1: ( rule__Final__NameAssignment_2 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2234:2: rule__Final__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Final__NameAssignment_2_in_rule__Final__Group__2__Impl4411);
            rule__Final__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFinalAccess().getNameAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__StateMachine__NameAssignment_2"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2251:1: rule__StateMachine__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__StateMachine__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2255:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2256:1: ( ruleEString )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2256:1: ( ruleEString )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2257:1: ruleEString
            {
             before(grammarAccess.getStateMachineAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__StateMachine__NameAssignment_24452);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__NameAssignment_2"


    // $ANTLR start "rule__StateMachine__NodesAssignment_3_1"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2266:1: rule__StateMachine__NodesAssignment_3_1 : ( ruleAbstractNode ) ;
    public final void rule__StateMachine__NodesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2270:1: ( ( ruleAbstractNode ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2271:1: ( ruleAbstractNode )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2271:1: ( ruleAbstractNode )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2272:1: ruleAbstractNode
            {
             before(grammarAccess.getStateMachineAccess().getNodesAbstractNodeParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractNode_in_rule__StateMachine__NodesAssignment_3_14483);
            ruleAbstractNode();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getNodesAbstractNodeParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__NodesAssignment_3_1"


    // $ANTLR start "rule__StateMachine__NodesAssignment_3_2_1"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2281:1: rule__StateMachine__NodesAssignment_3_2_1 : ( ruleAbstractNode ) ;
    public final void rule__StateMachine__NodesAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2285:1: ( ( ruleAbstractNode ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2286:1: ( ruleAbstractNode )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2286:1: ( ruleAbstractNode )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2287:1: ruleAbstractNode
            {
             before(grammarAccess.getStateMachineAccess().getNodesAbstractNodeParserRuleCall_3_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractNode_in_rule__StateMachine__NodesAssignment_3_2_14514);
            ruleAbstractNode();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getNodesAbstractNodeParserRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__NodesAssignment_3_2_1"


    // $ANTLR start "rule__StateMachine__TransitionsAssignment_4_1"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2296:1: rule__StateMachine__TransitionsAssignment_4_1 : ( ruleTransition ) ;
    public final void rule__StateMachine__TransitionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2300:1: ( ( ruleTransition ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2301:1: ( ruleTransition )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2301:1: ( ruleTransition )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2302:1: ruleTransition
            {
             before(grammarAccess.getStateMachineAccess().getTransitionsTransitionParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransition_in_rule__StateMachine__TransitionsAssignment_4_14545);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getTransitionsTransitionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__TransitionsAssignment_4_1"


    // $ANTLR start "rule__StateMachine__TransitionsAssignment_4_2_1"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2311:1: rule__StateMachine__TransitionsAssignment_4_2_1 : ( ruleTransition ) ;
    public final void rule__StateMachine__TransitionsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2315:1: ( ( ruleTransition ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2316:1: ( ruleTransition )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2316:1: ( ruleTransition )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2317:1: ruleTransition
            {
             before(grammarAccess.getStateMachineAccess().getTransitionsTransitionParserRuleCall_4_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransition_in_rule__StateMachine__TransitionsAssignment_4_2_14576);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getTransitionsTransitionParserRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__TransitionsAssignment_4_2_1"


    // $ANTLR start "rule__StateMachine__StateMachinesAssignment_5_1"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2326:1: rule__StateMachine__StateMachinesAssignment_5_1 : ( ruleStateMachine ) ;
    public final void rule__StateMachine__StateMachinesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2330:1: ( ( ruleStateMachine ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2331:1: ( ruleStateMachine )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2331:1: ( ruleStateMachine )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2332:1: ruleStateMachine
            {
             before(grammarAccess.getStateMachineAccess().getStateMachinesStateMachineParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleStateMachine_in_rule__StateMachine__StateMachinesAssignment_5_14607);
            ruleStateMachine();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getStateMachinesStateMachineParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__StateMachinesAssignment_5_1"


    // $ANTLR start "rule__StateMachine__StateMachinesAssignment_5_2_1"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2341:1: rule__StateMachine__StateMachinesAssignment_5_2_1 : ( ruleStateMachine ) ;
    public final void rule__StateMachine__StateMachinesAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2345:1: ( ( ruleStateMachine ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2346:1: ( ruleStateMachine )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2346:1: ( ruleStateMachine )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2347:1: ruleStateMachine
            {
             before(grammarAccess.getStateMachineAccess().getStateMachinesStateMachineParserRuleCall_5_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleStateMachine_in_rule__StateMachine__StateMachinesAssignment_5_2_14638);
            ruleStateMachine();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getStateMachinesStateMachineParserRuleCall_5_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__StateMachinesAssignment_5_2_1"


    // $ANTLR start "rule__Transition__EventAssignment_2_1"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2356:1: rule__Transition__EventAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Transition__EventAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2360:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2361:1: ( ruleEString )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2361:1: ( ruleEString )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2362:1: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getEventEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Transition__EventAssignment_2_14669);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getEventEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__EventAssignment_2_1"


    // $ANTLR start "rule__Transition__SourceAssignment_3_1"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2371:1: rule__Transition__SourceAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Transition__SourceAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2375:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2376:1: ( ( ruleEString ) )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2376:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2377:1: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getSourceAbstractNodeCrossReference_3_1_0()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2378:1: ( ruleEString )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2379:1: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getSourceAbstractNodeEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Transition__SourceAssignment_3_14704);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getSourceAbstractNodeEStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getSourceAbstractNodeCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__SourceAssignment_3_1"


    // $ANTLR start "rule__Transition__TargetAssignment_4_1"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2390:1: rule__Transition__TargetAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Transition__TargetAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2394:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2395:1: ( ( ruleEString ) )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2395:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2396:1: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getTargetAbstractNodeCrossReference_4_1_0()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2397:1: ( ruleEString )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2398:1: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getTargetAbstractNodeEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Transition__TargetAssignment_4_14743);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getTargetAbstractNodeEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getTargetAbstractNodeCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__TargetAssignment_4_1"


    // $ANTLR start "rule__State__NameAssignment_2"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2409:1: rule__State__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__State__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2413:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2414:1: ( ruleEString )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2414:1: ( ruleEString )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2415:1: ruleEString
            {
             before(grammarAccess.getStateAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__State__NameAssignment_24778);
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


    // $ANTLR start "rule__State__NestedAssignment_3_1"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2424:1: rule__State__NestedAssignment_3_1 : ( ruleStateMachine ) ;
    public final void rule__State__NestedAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2428:1: ( ( ruleStateMachine ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2429:1: ( ruleStateMachine )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2429:1: ( ruleStateMachine )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2430:1: ruleStateMachine
            {
             before(grammarAccess.getStateAccess().getNestedStateMachineParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleStateMachine_in_rule__State__NestedAssignment_3_14809);
            ruleStateMachine();

            state._fsp--;

             after(grammarAccess.getStateAccess().getNestedStateMachineParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__NestedAssignment_3_1"


    // $ANTLR start "rule__Initial__NameAssignment_2"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2439:1: rule__Initial__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Initial__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2443:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2444:1: ( ruleEString )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2444:1: ( ruleEString )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2445:1: ruleEString
            {
             before(grammarAccess.getInitialAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Initial__NameAssignment_24840);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInitialAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__NameAssignment_2"


    // $ANTLR start "rule__Junction__NameAssignment_2"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2454:1: rule__Junction__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Junction__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2458:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2459:1: ( ruleEString )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2459:1: ( ruleEString )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2460:1: ruleEString
            {
             before(grammarAccess.getJunctionAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Junction__NameAssignment_24871);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getJunctionAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Junction__NameAssignment_2"


    // $ANTLR start "rule__Fork__NameAssignment_2"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2469:1: rule__Fork__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Fork__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2473:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2474:1: ( ruleEString )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2474:1: ( ruleEString )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2475:1: ruleEString
            {
             before(grammarAccess.getForkAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Fork__NameAssignment_24902);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getForkAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fork__NameAssignment_2"


    // $ANTLR start "rule__Join__NameAssignment_2"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2484:1: rule__Join__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Join__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2488:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2489:1: ( ruleEString )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2489:1: ( ruleEString )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2490:1: ruleEString
            {
             before(grammarAccess.getJoinAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Join__NameAssignment_24933);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getJoinAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__NameAssignment_2"


    // $ANTLR start "rule__Any__NameAssignment_2"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2499:1: rule__Any__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Any__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2503:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2504:1: ( ruleEString )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2504:1: ( ruleEString )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2505:1: ruleEString
            {
             before(grammarAccess.getAnyAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Any__NameAssignment_24964);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAnyAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Any__NameAssignment_2"


    // $ANTLR start "rule__Final__NameAssignment_2"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2514:1: rule__Final__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Final__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2518:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2519:1: ( ruleEString )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2519:1: ( ruleEString )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2520:1: ruleEString
            {
             before(grammarAccess.getFinalAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Final__NameAssignment_24995);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFinalAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__NameAssignment_2"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleStateMachine_in_entryRuleStateMachine61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStateMachine68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__0_in_ruleStateMachine94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractNode_in_entryRuleAbstractNode121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractNode128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AbstractNode__Alternatives_in_ruleAbstractNode154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransition248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__0_in_ruleTransition274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleState_in_entryRuleState301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleState308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group__0_in_ruleState334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInitial_in_entryRuleInitial361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInitial368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Initial__Group__0_in_ruleInitial394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleJunction_in_entryRuleJunction421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleJunction428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Junction__Group__0_in_ruleJunction454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFork_in_entryRuleFork481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFork488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fork__Group__0_in_ruleFork514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleJoin_in_entryRuleJoin541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleJoin548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Join__Group__0_in_ruleJoin574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAny_in_entryRuleAny601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAny608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Any__Group__0_in_ruleAny634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFinal_in_entryRuleFinal661 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFinal668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Final__Group__0_in_ruleFinal694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleState_in_rule__AbstractNode__Alternatives730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInitial_in_rule__AbstractNode__Alternatives747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleJunction_in_rule__AbstractNode__Alternatives764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFork_in_rule__AbstractNode__Alternatives781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleJoin_in_rule__AbstractNode__Alternatives798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAny_in_rule__AbstractNode__Alternatives815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFinal_in_rule__AbstractNode__Alternatives832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__0__Impl_in_rule__StateMachine__Group__0911 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__1_in_rule__StateMachine__Group__0914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__1__Impl_in_rule__StateMachine__Group__1972 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__2_in_rule__StateMachine__Group__1975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__StateMachine__Group__1__Impl1003 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__2__Impl_in_rule__StateMachine__Group__21034 = new BitSet(new long[]{0x000000000001B000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__3_in_rule__StateMachine__Group__21037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__NameAssignment_2_in_rule__StateMachine__Group__2__Impl1064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__3__Impl_in_rule__StateMachine__Group__31094 = new BitSet(new long[]{0x000000000001B000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__4_in_rule__StateMachine__Group__31097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_3__0_in_rule__StateMachine__Group__3__Impl1124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__4__Impl_in_rule__StateMachine__Group__41155 = new BitSet(new long[]{0x000000000001B000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__5_in_rule__StateMachine__Group__41158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_4__0_in_rule__StateMachine__Group__4__Impl1185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__5__Impl_in_rule__StateMachine__Group__51216 = new BitSet(new long[]{0x000000000001B000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__6_in_rule__StateMachine__Group__51219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_5__0_in_rule__StateMachine__Group__5__Impl1246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__6__Impl_in_rule__StateMachine__Group__61277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__StateMachine__Group__6__Impl1305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_3__0__Impl_in_rule__StateMachine__Group_3__01350 = new BitSet(new long[]{0x000000001FA00000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_3__1_in_rule__StateMachine__Group_3__01353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__StateMachine__Group_3__0__Impl1381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_3__1__Impl_in_rule__StateMachine__Group_3__11412 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_3__2_in_rule__StateMachine__Group_3__11415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__NodesAssignment_3_1_in_rule__StateMachine__Group_3__1__Impl1442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_3__2__Impl_in_rule__StateMachine__Group_3__21472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_3_2__0_in_rule__StateMachine__Group_3__2__Impl1499 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_3_2__0__Impl_in_rule__StateMachine__Group_3_2__01536 = new BitSet(new long[]{0x000000001FA00000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_3_2__1_in_rule__StateMachine__Group_3_2__01539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__StateMachine__Group_3_2__0__Impl1567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_3_2__1__Impl_in_rule__StateMachine__Group_3_2__11598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__NodesAssignment_3_2_1_in_rule__StateMachine__Group_3_2__1__Impl1625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_4__0__Impl_in_rule__StateMachine__Group_4__01659 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_4__1_in_rule__StateMachine__Group_4__01662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__StateMachine__Group_4__0__Impl1690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_4__1__Impl_in_rule__StateMachine__Group_4__11721 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_4__2_in_rule__StateMachine__Group_4__11724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__TransitionsAssignment_4_1_in_rule__StateMachine__Group_4__1__Impl1751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_4__2__Impl_in_rule__StateMachine__Group_4__21781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_4_2__0_in_rule__StateMachine__Group_4__2__Impl1808 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_4_2__0__Impl_in_rule__StateMachine__Group_4_2__01845 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_4_2__1_in_rule__StateMachine__Group_4_2__01848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__StateMachine__Group_4_2__0__Impl1876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_4_2__1__Impl_in_rule__StateMachine__Group_4_2__11907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__TransitionsAssignment_4_2_1_in_rule__StateMachine__Group_4_2__1__Impl1934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_5__0__Impl_in_rule__StateMachine__Group_5__01968 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_5__1_in_rule__StateMachine__Group_5__01971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__StateMachine__Group_5__0__Impl1999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_5__1__Impl_in_rule__StateMachine__Group_5__12030 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_5__2_in_rule__StateMachine__Group_5__12033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__StateMachinesAssignment_5_1_in_rule__StateMachine__Group_5__1__Impl2060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_5__2__Impl_in_rule__StateMachine__Group_5__22090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_5_2__0_in_rule__StateMachine__Group_5__2__Impl2117 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_5_2__0__Impl_in_rule__StateMachine__Group_5_2__02154 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_5_2__1_in_rule__StateMachine__Group_5_2__02157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__StateMachine__Group_5_2__0__Impl2185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_5_2__1__Impl_in_rule__StateMachine__Group_5_2__12216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__StateMachinesAssignment_5_2_1_in_rule__StateMachine__Group_5_2__1__Impl2243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__02277 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__02280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__12338 = new BitSet(new long[]{0x00000000001C0000L});
        public static final BitSet FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__12341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Transition__Group__1__Impl2369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__22400 = new BitSet(new long[]{0x00000000001C0000L});
        public static final BitSet FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__22403 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_2__0_in_rule__Transition__Group__2__Impl2430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__32461 = new BitSet(new long[]{0x00000000001C0000L});
        public static final BitSet FOLLOW_rule__Transition__Group__4_in_rule__Transition__Group__32464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_3__0_in_rule__Transition__Group__3__Impl2491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__4__Impl_in_rule__Transition__Group__42522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_4__0_in_rule__Transition__Group__4__Impl2549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_2__0__Impl_in_rule__Transition__Group_2__02590 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Transition__Group_2__1_in_rule__Transition__Group_2__02593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Transition__Group_2__0__Impl2621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_2__1__Impl_in_rule__Transition__Group_2__12652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__EventAssignment_2_1_in_rule__Transition__Group_2__1__Impl2679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_3__0__Impl_in_rule__Transition__Group_3__02713 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Transition__Group_3__1_in_rule__Transition__Group_3__02716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Transition__Group_3__0__Impl2744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_3__1__Impl_in_rule__Transition__Group_3__12775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__SourceAssignment_3_1_in_rule__Transition__Group_3__1__Impl2802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_4__0__Impl_in_rule__Transition__Group_4__02836 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Transition__Group_4__1_in_rule__Transition__Group_4__02839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Transition__Group_4__0__Impl2867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_4__1__Impl_in_rule__Transition__Group_4__12898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__TargetAssignment_4_1_in_rule__Transition__Group_4__1__Impl2925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__02959 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__State__Group__1_in_rule__State__Group__02962 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__13020 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__State__Group__2_in_rule__State__Group__13023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__State__Group__1__Impl3051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__23082 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__State__Group__3_in_rule__State__Group__23085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__NameAssignment_2_in_rule__State__Group__2__Impl3112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group__3__Impl_in_rule__State__Group__33142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_3__0_in_rule__State__Group__3__Impl3169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_3__0__Impl_in_rule__State__Group_3__03208 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__State__Group_3__1_in_rule__State__Group_3__03211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__State__Group_3__0__Impl3239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_3__1__Impl_in_rule__State__Group_3__13270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__NestedAssignment_3_1_in_rule__State__Group_3__1__Impl3297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Initial__Group__0__Impl_in_rule__Initial__Group__03331 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Initial__Group__1_in_rule__Initial__Group__03334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Initial__Group__1__Impl_in_rule__Initial__Group__13392 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Initial__Group__2_in_rule__Initial__Group__13395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Initial__Group__1__Impl3423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Initial__Group__2__Impl_in_rule__Initial__Group__23454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Initial__NameAssignment_2_in_rule__Initial__Group__2__Impl3481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Junction__Group__0__Impl_in_rule__Junction__Group__03517 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Junction__Group__1_in_rule__Junction__Group__03520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Junction__Group__1__Impl_in_rule__Junction__Group__13578 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Junction__Group__2_in_rule__Junction__Group__13581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Junction__Group__1__Impl3609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Junction__Group__2__Impl_in_rule__Junction__Group__23640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Junction__NameAssignment_2_in_rule__Junction__Group__2__Impl3667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fork__Group__0__Impl_in_rule__Fork__Group__03703 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Fork__Group__1_in_rule__Fork__Group__03706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fork__Group__1__Impl_in_rule__Fork__Group__13764 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Fork__Group__2_in_rule__Fork__Group__13767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Fork__Group__1__Impl3795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fork__Group__2__Impl_in_rule__Fork__Group__23826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fork__NameAssignment_2_in_rule__Fork__Group__2__Impl3853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Join__Group__0__Impl_in_rule__Join__Group__03889 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Join__Group__1_in_rule__Join__Group__03892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Join__Group__1__Impl_in_rule__Join__Group__13950 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Join__Group__2_in_rule__Join__Group__13953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Join__Group__1__Impl3981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Join__Group__2__Impl_in_rule__Join__Group__24012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Join__NameAssignment_2_in_rule__Join__Group__2__Impl4039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Any__Group__0__Impl_in_rule__Any__Group__04075 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Any__Group__1_in_rule__Any__Group__04078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Any__Group__1__Impl_in_rule__Any__Group__14136 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Any__Group__2_in_rule__Any__Group__14139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Any__Group__1__Impl4167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Any__Group__2__Impl_in_rule__Any__Group__24198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Any__NameAssignment_2_in_rule__Any__Group__2__Impl4225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Final__Group__0__Impl_in_rule__Final__Group__04261 = new BitSet(new long[]{0x000000001FA00000L});
        public static final BitSet FOLLOW_rule__Final__Group__1_in_rule__Final__Group__04264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Final__Group__1__Impl_in_rule__Final__Group__14322 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Final__Group__2_in_rule__Final__Group__14325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Final__Group__1__Impl4353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Final__Group__2__Impl_in_rule__Final__Group__24384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Final__NameAssignment_2_in_rule__Final__Group__2__Impl4411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__StateMachine__NameAssignment_24452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractNode_in_rule__StateMachine__NodesAssignment_3_14483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractNode_in_rule__StateMachine__NodesAssignment_3_2_14514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransition_in_rule__StateMachine__TransitionsAssignment_4_14545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransition_in_rule__StateMachine__TransitionsAssignment_4_2_14576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStateMachine_in_rule__StateMachine__StateMachinesAssignment_5_14607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStateMachine_in_rule__StateMachine__StateMachinesAssignment_5_2_14638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Transition__EventAssignment_2_14669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Transition__SourceAssignment_3_14704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Transition__TargetAssignment_4_14743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__State__NameAssignment_24778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStateMachine_in_rule__State__NestedAssignment_3_14809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Initial__NameAssignment_24840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Junction__NameAssignment_24871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Fork__NameAssignment_24902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Join__NameAssignment_24933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Any__NameAssignment_24964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Final__NameAssignment_24995 = new BitSet(new long[]{0x0000000000000002L});
    }


}