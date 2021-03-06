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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'MULTIVAR'", "'SINGLEVAR'", "'REFINEDVAR'", "'Statemachine'", "'end'", "'>'", "'translation'", "'elaborates'", "'refines'", "'nodes'", "','", "'transitions'", "'Transition'", "'target'", "'source'", "'when'", "'any'", "'where'", "'with'", "'then'", "'State'", "'statemachines'", "'invariants'", "'Initial'", "'Final'", "'Any'", "'Junction'", "'Fork'", "'Invariant'", "'@'", "'TypedParameter'", "'type'", "'Witness'", "'extended'", "'theorem'"
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
            case 35:
                {
                alt1=3;
                }
                break;
            case 36:
                {
                alt1=4;
                }
                break;
            case 37:
                {
                alt1=5;
                }
                break;
            case 38:
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

            if ( (LA4_0==16) ) {
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

            if ( (LA5_0==17) ) {
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

            if ( (LA6_0==18) ) {
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

            if ( (LA7_0==19) ) {
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

            if ( (LA8_0==20) ) {
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:810:1: rule__Statemachine__Group__7 : rule__Statemachine__Group__7__Impl rule__Statemachine__Group__8 ;
    public final void rule__Statemachine__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:814:1: ( rule__Statemachine__Group__7__Impl rule__Statemachine__Group__8 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:815:2: rule__Statemachine__Group__7__Impl rule__Statemachine__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group__7__Impl_in_rule__Statemachine__Group__71680);
            rule__Statemachine__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group__8_in_rule__Statemachine__Group__71683);
            rule__Statemachine__Group__8();

            state._fsp--;


            }

        }
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:822:1: rule__Statemachine__Group__7__Impl : ( ( rule__Statemachine__Group_7__0 )? ) ;
    public final void rule__Statemachine__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:826:1: ( ( ( rule__Statemachine__Group_7__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:827:1: ( ( rule__Statemachine__Group_7__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:827:1: ( ( rule__Statemachine__Group_7__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:828:1: ( rule__Statemachine__Group_7__0 )?
            {
             before(grammarAccess.getStatemachineAccess().getGroup_7()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:829:1: ( rule__Statemachine__Group_7__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:829:2: rule__Statemachine__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_7__0_in_rule__Statemachine__Group__7__Impl1710);
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


    // $ANTLR start "rule__Statemachine__Group__8"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:839:1: rule__Statemachine__Group__8 : rule__Statemachine__Group__8__Impl ;
    public final void rule__Statemachine__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:843:1: ( rule__Statemachine__Group__8__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:844:2: rule__Statemachine__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group__8__Impl_in_rule__Statemachine__Group__81741);
            rule__Statemachine__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__8"


    // $ANTLR start "rule__Statemachine__Group__8__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:850:1: rule__Statemachine__Group__8__Impl : ( 'end' ) ;
    public final void rule__Statemachine__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:854:1: ( ( 'end' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:855:1: ( 'end' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:855:1: ( 'end' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:856:1: 'end'
            {
             before(grammarAccess.getStatemachineAccess().getEndKeyword_8()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Statemachine__Group__8__Impl1769); 
             after(grammarAccess.getStatemachineAccess().getEndKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__8__Impl"


    // $ANTLR start "rule__Statemachine__Group_2__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:887:1: rule__Statemachine__Group_2__0 : rule__Statemachine__Group_2__0__Impl rule__Statemachine__Group_2__1 ;
    public final void rule__Statemachine__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:891:1: ( rule__Statemachine__Group_2__0__Impl rule__Statemachine__Group_2__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:892:2: rule__Statemachine__Group_2__0__Impl rule__Statemachine__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_2__0__Impl_in_rule__Statemachine__Group_2__01818);
            rule__Statemachine__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_2__1_in_rule__Statemachine__Group_2__01821);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:899:1: rule__Statemachine__Group_2__0__Impl : ( '>' ) ;
    public final void rule__Statemachine__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:903:1: ( ( '>' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:904:1: ( '>' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:904:1: ( '>' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:905:1: '>'
            {
             before(grammarAccess.getStatemachineAccess().getGreaterThanSignKeyword_2_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Statemachine__Group_2__0__Impl1849); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:918:1: rule__Statemachine__Group_2__1 : rule__Statemachine__Group_2__1__Impl ;
    public final void rule__Statemachine__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:922:1: ( rule__Statemachine__Group_2__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:923:2: rule__Statemachine__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_2__1__Impl_in_rule__Statemachine__Group_2__11880);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:929:1: rule__Statemachine__Group_2__1__Impl : ( ( rule__Statemachine__CommentAssignment_2_1 ) ) ;
    public final void rule__Statemachine__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:933:1: ( ( ( rule__Statemachine__CommentAssignment_2_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:934:1: ( ( rule__Statemachine__CommentAssignment_2_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:934:1: ( ( rule__Statemachine__CommentAssignment_2_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:935:1: ( rule__Statemachine__CommentAssignment_2_1 )
            {
             before(grammarAccess.getStatemachineAccess().getCommentAssignment_2_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:936:1: ( rule__Statemachine__CommentAssignment_2_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:936:2: rule__Statemachine__CommentAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__CommentAssignment_2_1_in_rule__Statemachine__Group_2__1__Impl1907);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:950:1: rule__Statemachine__Group_3__0 : rule__Statemachine__Group_3__0__Impl rule__Statemachine__Group_3__1 ;
    public final void rule__Statemachine__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:954:1: ( rule__Statemachine__Group_3__0__Impl rule__Statemachine__Group_3__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:955:2: rule__Statemachine__Group_3__0__Impl rule__Statemachine__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_3__0__Impl_in_rule__Statemachine__Group_3__01941);
            rule__Statemachine__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_3__1_in_rule__Statemachine__Group_3__01944);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:962:1: rule__Statemachine__Group_3__0__Impl : ( 'translation' ) ;
    public final void rule__Statemachine__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:966:1: ( ( 'translation' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:967:1: ( 'translation' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:967:1: ( 'translation' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:968:1: 'translation'
            {
             before(grammarAccess.getStatemachineAccess().getTranslationKeyword_3_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Statemachine__Group_3__0__Impl1972); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:981:1: rule__Statemachine__Group_3__1 : rule__Statemachine__Group_3__1__Impl ;
    public final void rule__Statemachine__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:985:1: ( rule__Statemachine__Group_3__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:986:2: rule__Statemachine__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_3__1__Impl_in_rule__Statemachine__Group_3__12003);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:992:1: rule__Statemachine__Group_3__1__Impl : ( ( rule__Statemachine__TranslationAssignment_3_1 ) ) ;
    public final void rule__Statemachine__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:996:1: ( ( ( rule__Statemachine__TranslationAssignment_3_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:997:1: ( ( rule__Statemachine__TranslationAssignment_3_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:997:1: ( ( rule__Statemachine__TranslationAssignment_3_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:998:1: ( rule__Statemachine__TranslationAssignment_3_1 )
            {
             before(grammarAccess.getStatemachineAccess().getTranslationAssignment_3_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:999:1: ( rule__Statemachine__TranslationAssignment_3_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:999:2: rule__Statemachine__TranslationAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__TranslationAssignment_3_1_in_rule__Statemachine__Group_3__1__Impl2030);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1013:1: rule__Statemachine__Group_4__0 : rule__Statemachine__Group_4__0__Impl rule__Statemachine__Group_4__1 ;
    public final void rule__Statemachine__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1017:1: ( rule__Statemachine__Group_4__0__Impl rule__Statemachine__Group_4__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1018:2: rule__Statemachine__Group_4__0__Impl rule__Statemachine__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_4__0__Impl_in_rule__Statemachine__Group_4__02064);
            rule__Statemachine__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_4__1_in_rule__Statemachine__Group_4__02067);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1025:1: rule__Statemachine__Group_4__0__Impl : ( 'elaborates' ) ;
    public final void rule__Statemachine__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1029:1: ( ( 'elaborates' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1030:1: ( 'elaborates' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1030:1: ( 'elaborates' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1031:1: 'elaborates'
            {
             before(grammarAccess.getStatemachineAccess().getElaboratesKeyword_4_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Statemachine__Group_4__0__Impl2095); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1044:1: rule__Statemachine__Group_4__1 : rule__Statemachine__Group_4__1__Impl ;
    public final void rule__Statemachine__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1048:1: ( rule__Statemachine__Group_4__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1049:2: rule__Statemachine__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_4__1__Impl_in_rule__Statemachine__Group_4__12126);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1055:1: rule__Statemachine__Group_4__1__Impl : ( ( rule__Statemachine__ElaboratesAssignment_4_1 ) ) ;
    public final void rule__Statemachine__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1059:1: ( ( ( rule__Statemachine__ElaboratesAssignment_4_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1060:1: ( ( rule__Statemachine__ElaboratesAssignment_4_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1060:1: ( ( rule__Statemachine__ElaboratesAssignment_4_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1061:1: ( rule__Statemachine__ElaboratesAssignment_4_1 )
            {
             before(grammarAccess.getStatemachineAccess().getElaboratesAssignment_4_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1062:1: ( rule__Statemachine__ElaboratesAssignment_4_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1062:2: rule__Statemachine__ElaboratesAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__ElaboratesAssignment_4_1_in_rule__Statemachine__Group_4__1__Impl2153);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1076:1: rule__Statemachine__Group_5__0 : rule__Statemachine__Group_5__0__Impl rule__Statemachine__Group_5__1 ;
    public final void rule__Statemachine__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1080:1: ( rule__Statemachine__Group_5__0__Impl rule__Statemachine__Group_5__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1081:2: rule__Statemachine__Group_5__0__Impl rule__Statemachine__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_5__0__Impl_in_rule__Statemachine__Group_5__02187);
            rule__Statemachine__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_5__1_in_rule__Statemachine__Group_5__02190);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1088:1: rule__Statemachine__Group_5__0__Impl : ( 'refines' ) ;
    public final void rule__Statemachine__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1092:1: ( ( 'refines' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1093:1: ( 'refines' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1093:1: ( 'refines' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1094:1: 'refines'
            {
             before(grammarAccess.getStatemachineAccess().getRefinesKeyword_5_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Statemachine__Group_5__0__Impl2218); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1107:1: rule__Statemachine__Group_5__1 : rule__Statemachine__Group_5__1__Impl ;
    public final void rule__Statemachine__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1111:1: ( rule__Statemachine__Group_5__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1112:2: rule__Statemachine__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_5__1__Impl_in_rule__Statemachine__Group_5__12249);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1118:1: rule__Statemachine__Group_5__1__Impl : ( ( rule__Statemachine__RefinesAssignment_5_1 ) ) ;
    public final void rule__Statemachine__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1122:1: ( ( ( rule__Statemachine__RefinesAssignment_5_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1123:1: ( ( rule__Statemachine__RefinesAssignment_5_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1123:1: ( ( rule__Statemachine__RefinesAssignment_5_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1124:1: ( rule__Statemachine__RefinesAssignment_5_1 )
            {
             before(grammarAccess.getStatemachineAccess().getRefinesAssignment_5_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1125:1: ( rule__Statemachine__RefinesAssignment_5_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1125:2: rule__Statemachine__RefinesAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__RefinesAssignment_5_1_in_rule__Statemachine__Group_5__1__Impl2276);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1139:1: rule__Statemachine__Group_6__0 : rule__Statemachine__Group_6__0__Impl rule__Statemachine__Group_6__1 ;
    public final void rule__Statemachine__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1143:1: ( rule__Statemachine__Group_6__0__Impl rule__Statemachine__Group_6__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1144:2: rule__Statemachine__Group_6__0__Impl rule__Statemachine__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_6__0__Impl_in_rule__Statemachine__Group_6__02310);
            rule__Statemachine__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_6__1_in_rule__Statemachine__Group_6__02313);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1151:1: rule__Statemachine__Group_6__0__Impl : ( 'nodes' ) ;
    public final void rule__Statemachine__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1155:1: ( ( 'nodes' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1156:1: ( 'nodes' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1156:1: ( 'nodes' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1157:1: 'nodes'
            {
             before(grammarAccess.getStatemachineAccess().getNodesKeyword_6_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Statemachine__Group_6__0__Impl2341); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1170:1: rule__Statemachine__Group_6__1 : rule__Statemachine__Group_6__1__Impl rule__Statemachine__Group_6__2 ;
    public final void rule__Statemachine__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1174:1: ( rule__Statemachine__Group_6__1__Impl rule__Statemachine__Group_6__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1175:2: rule__Statemachine__Group_6__1__Impl rule__Statemachine__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_6__1__Impl_in_rule__Statemachine__Group_6__12372);
            rule__Statemachine__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_6__2_in_rule__Statemachine__Group_6__12375);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1182:1: rule__Statemachine__Group_6__1__Impl : ( ( rule__Statemachine__NodesAssignment_6_1 ) ) ;
    public final void rule__Statemachine__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1186:1: ( ( ( rule__Statemachine__NodesAssignment_6_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1187:1: ( ( rule__Statemachine__NodesAssignment_6_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1187:1: ( ( rule__Statemachine__NodesAssignment_6_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1188:1: ( rule__Statemachine__NodesAssignment_6_1 )
            {
             before(grammarAccess.getStatemachineAccess().getNodesAssignment_6_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1189:1: ( rule__Statemachine__NodesAssignment_6_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1189:2: rule__Statemachine__NodesAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__NodesAssignment_6_1_in_rule__Statemachine__Group_6__1__Impl2402);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1199:1: rule__Statemachine__Group_6__2 : rule__Statemachine__Group_6__2__Impl ;
    public final void rule__Statemachine__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1203:1: ( rule__Statemachine__Group_6__2__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1204:2: rule__Statemachine__Group_6__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_6__2__Impl_in_rule__Statemachine__Group_6__22432);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1210:1: rule__Statemachine__Group_6__2__Impl : ( ( rule__Statemachine__Group_6_2__0 )* ) ;
    public final void rule__Statemachine__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1214:1: ( ( ( rule__Statemachine__Group_6_2__0 )* ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1215:1: ( ( rule__Statemachine__Group_6_2__0 )* )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1215:1: ( ( rule__Statemachine__Group_6_2__0 )* )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1216:1: ( rule__Statemachine__Group_6_2__0 )*
            {
             before(grammarAccess.getStatemachineAccess().getGroup_6_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1217:1: ( rule__Statemachine__Group_6_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1217:2: rule__Statemachine__Group_6_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_6_2__0_in_rule__Statemachine__Group_6__2__Impl2459);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1233:1: rule__Statemachine__Group_6_2__0 : rule__Statemachine__Group_6_2__0__Impl rule__Statemachine__Group_6_2__1 ;
    public final void rule__Statemachine__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1237:1: ( rule__Statemachine__Group_6_2__0__Impl rule__Statemachine__Group_6_2__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1238:2: rule__Statemachine__Group_6_2__0__Impl rule__Statemachine__Group_6_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_6_2__0__Impl_in_rule__Statemachine__Group_6_2__02496);
            rule__Statemachine__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_6_2__1_in_rule__Statemachine__Group_6_2__02499);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1245:1: rule__Statemachine__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__Statemachine__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1249:1: ( ( ',' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1250:1: ( ',' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1250:1: ( ',' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1251:1: ','
            {
             before(grammarAccess.getStatemachineAccess().getCommaKeyword_6_2_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Statemachine__Group_6_2__0__Impl2527); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1264:1: rule__Statemachine__Group_6_2__1 : rule__Statemachine__Group_6_2__1__Impl ;
    public final void rule__Statemachine__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1268:1: ( rule__Statemachine__Group_6_2__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1269:2: rule__Statemachine__Group_6_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_6_2__1__Impl_in_rule__Statemachine__Group_6_2__12558);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1275:1: rule__Statemachine__Group_6_2__1__Impl : ( ( rule__Statemachine__NodesAssignment_6_2_1 ) ) ;
    public final void rule__Statemachine__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1279:1: ( ( ( rule__Statemachine__NodesAssignment_6_2_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1280:1: ( ( rule__Statemachine__NodesAssignment_6_2_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1280:1: ( ( rule__Statemachine__NodesAssignment_6_2_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1281:1: ( rule__Statemachine__NodesAssignment_6_2_1 )
            {
             before(grammarAccess.getStatemachineAccess().getNodesAssignment_6_2_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1282:1: ( rule__Statemachine__NodesAssignment_6_2_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1282:2: rule__Statemachine__NodesAssignment_6_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__NodesAssignment_6_2_1_in_rule__Statemachine__Group_6_2__1__Impl2585);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1296:1: rule__Statemachine__Group_7__0 : rule__Statemachine__Group_7__0__Impl rule__Statemachine__Group_7__1 ;
    public final void rule__Statemachine__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1300:1: ( rule__Statemachine__Group_7__0__Impl rule__Statemachine__Group_7__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1301:2: rule__Statemachine__Group_7__0__Impl rule__Statemachine__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_7__0__Impl_in_rule__Statemachine__Group_7__02619);
            rule__Statemachine__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_7__1_in_rule__Statemachine__Group_7__02622);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1308:1: rule__Statemachine__Group_7__0__Impl : ( 'transitions' ) ;
    public final void rule__Statemachine__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1312:1: ( ( 'transitions' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1313:1: ( 'transitions' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1313:1: ( 'transitions' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1314:1: 'transitions'
            {
             before(grammarAccess.getStatemachineAccess().getTransitionsKeyword_7_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Statemachine__Group_7__0__Impl2650); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1327:1: rule__Statemachine__Group_7__1 : rule__Statemachine__Group_7__1__Impl rule__Statemachine__Group_7__2 ;
    public final void rule__Statemachine__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1331:1: ( rule__Statemachine__Group_7__1__Impl rule__Statemachine__Group_7__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1332:2: rule__Statemachine__Group_7__1__Impl rule__Statemachine__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_7__1__Impl_in_rule__Statemachine__Group_7__12681);
            rule__Statemachine__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_7__2_in_rule__Statemachine__Group_7__12684);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1339:1: rule__Statemachine__Group_7__1__Impl : ( ( rule__Statemachine__TransitionsAssignment_7_1 ) ) ;
    public final void rule__Statemachine__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1343:1: ( ( ( rule__Statemachine__TransitionsAssignment_7_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1344:1: ( ( rule__Statemachine__TransitionsAssignment_7_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1344:1: ( ( rule__Statemachine__TransitionsAssignment_7_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1345:1: ( rule__Statemachine__TransitionsAssignment_7_1 )
            {
             before(grammarAccess.getStatemachineAccess().getTransitionsAssignment_7_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1346:1: ( rule__Statemachine__TransitionsAssignment_7_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1346:2: rule__Statemachine__TransitionsAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__TransitionsAssignment_7_1_in_rule__Statemachine__Group_7__1__Impl2711);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1356:1: rule__Statemachine__Group_7__2 : rule__Statemachine__Group_7__2__Impl ;
    public final void rule__Statemachine__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1360:1: ( rule__Statemachine__Group_7__2__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1361:2: rule__Statemachine__Group_7__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_7__2__Impl_in_rule__Statemachine__Group_7__22741);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1367:1: rule__Statemachine__Group_7__2__Impl : ( ( rule__Statemachine__TransitionsAssignment_7_2 )* ) ;
    public final void rule__Statemachine__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1371:1: ( ( ( rule__Statemachine__TransitionsAssignment_7_2 )* ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1372:1: ( ( rule__Statemachine__TransitionsAssignment_7_2 )* )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1372:1: ( ( rule__Statemachine__TransitionsAssignment_7_2 )* )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1373:1: ( rule__Statemachine__TransitionsAssignment_7_2 )*
            {
             before(grammarAccess.getStatemachineAccess().getTransitionsAssignment_7_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1374:1: ( rule__Statemachine__TransitionsAssignment_7_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23||LA11_0==44) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1374:2: rule__Statemachine__TransitionsAssignment_7_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Statemachine__TransitionsAssignment_7_2_in_rule__Statemachine__Group_7__2__Impl2768);
            	    rule__Statemachine__TransitionsAssignment_7_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getStatemachineAccess().getTransitionsAssignment_7_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Transition__Group__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1390:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1394:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1395:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__02805);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__02808);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1402:1: rule__Transition__Group__0__Impl : ( () ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1406:1: ( ( () ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1407:1: ( () )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1407:1: ( () )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1408:1: ()
            {
             before(grammarAccess.getTransitionAccess().getTransitionAction_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1409:1: ()
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1411:1: 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1421:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1425:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1426:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__12866);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__12869);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1433:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__ExtendedAssignment_1 )? ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1437:1: ( ( ( rule__Transition__ExtendedAssignment_1 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1438:1: ( ( rule__Transition__ExtendedAssignment_1 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1438:1: ( ( rule__Transition__ExtendedAssignment_1 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1439:1: ( rule__Transition__ExtendedAssignment_1 )?
            {
             before(grammarAccess.getTransitionAccess().getExtendedAssignment_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1440:1: ( rule__Transition__ExtendedAssignment_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==44) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1440:2: rule__Transition__ExtendedAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Transition__ExtendedAssignment_1_in_rule__Transition__Group__1__Impl2896);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1450:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1454:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1455:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__22927);
            rule__Transition__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__22930);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1462:1: rule__Transition__Group__2__Impl : ( 'Transition' ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1466:1: ( ( 'Transition' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1467:1: ( 'Transition' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1467:1: ( 'Transition' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1468:1: 'Transition'
            {
             before(grammarAccess.getTransitionAccess().getTransitionKeyword_2()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Transition__Group__2__Impl2958); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1481:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1485:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1486:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__32989);
            rule__Transition__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__4_in_rule__Transition__Group__32992);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1493:1: rule__Transition__Group__3__Impl : ( ( rule__Transition__Group_3__0 )? ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1497:1: ( ( ( rule__Transition__Group_3__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1498:1: ( ( rule__Transition__Group_3__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1498:1: ( ( rule__Transition__Group_3__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1499:1: ( rule__Transition__Group_3__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_3()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1500:1: ( rule__Transition__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==16) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1500:2: rule__Transition__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_3__0_in_rule__Transition__Group__3__Impl3019);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1510:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl rule__Transition__Group__5 ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1514:1: ( rule__Transition__Group__4__Impl rule__Transition__Group__5 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1515:2: rule__Transition__Group__4__Impl rule__Transition__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__4__Impl_in_rule__Transition__Group__43050);
            rule__Transition__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__5_in_rule__Transition__Group__43053);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1522:1: rule__Transition__Group__4__Impl : ( ( rule__Transition__Group_4__0 )? ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1526:1: ( ( ( rule__Transition__Group_4__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1527:1: ( ( rule__Transition__Group_4__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1527:1: ( ( rule__Transition__Group_4__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1528:1: ( rule__Transition__Group_4__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_4()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1529:1: ( rule__Transition__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==18) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1529:2: rule__Transition__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4__0_in_rule__Transition__Group__4__Impl3080);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1539:1: rule__Transition__Group__5 : rule__Transition__Group__5__Impl rule__Transition__Group__6 ;
    public final void rule__Transition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1543:1: ( rule__Transition__Group__5__Impl rule__Transition__Group__6 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1544:2: rule__Transition__Group__5__Impl rule__Transition__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__5__Impl_in_rule__Transition__Group__53111);
            rule__Transition__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__6_in_rule__Transition__Group__53114);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1551:1: rule__Transition__Group__5__Impl : ( ( rule__Transition__Group_5__0 )? ) ;
    public final void rule__Transition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1555:1: ( ( ( rule__Transition__Group_5__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1556:1: ( ( rule__Transition__Group_5__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1556:1: ( ( rule__Transition__Group_5__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1557:1: ( rule__Transition__Group_5__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_5()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1558:1: ( rule__Transition__Group_5__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1558:2: rule__Transition__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_5__0_in_rule__Transition__Group__5__Impl3141);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1568:1: rule__Transition__Group__6 : rule__Transition__Group__6__Impl rule__Transition__Group__7 ;
    public final void rule__Transition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1572:1: ( rule__Transition__Group__6__Impl rule__Transition__Group__7 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1573:2: rule__Transition__Group__6__Impl rule__Transition__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__6__Impl_in_rule__Transition__Group__63172);
            rule__Transition__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__7_in_rule__Transition__Group__63175);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1580:1: rule__Transition__Group__6__Impl : ( ( rule__Transition__Group_6__0 )? ) ;
    public final void rule__Transition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1584:1: ( ( ( rule__Transition__Group_6__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1585:1: ( ( rule__Transition__Group_6__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1585:1: ( ( rule__Transition__Group_6__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1586:1: ( rule__Transition__Group_6__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_6()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1587:1: ( rule__Transition__Group_6__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1587:2: rule__Transition__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_6__0_in_rule__Transition__Group__6__Impl3202);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1597:1: rule__Transition__Group__7 : rule__Transition__Group__7__Impl rule__Transition__Group__8 ;
    public final void rule__Transition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1601:1: ( rule__Transition__Group__7__Impl rule__Transition__Group__8 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1602:2: rule__Transition__Group__7__Impl rule__Transition__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__7__Impl_in_rule__Transition__Group__73233);
            rule__Transition__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__8_in_rule__Transition__Group__73236);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1609:1: rule__Transition__Group__7__Impl : ( ( rule__Transition__Group_7__0 )? ) ;
    public final void rule__Transition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1613:1: ( ( ( rule__Transition__Group_7__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1614:1: ( ( rule__Transition__Group_7__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1614:1: ( ( rule__Transition__Group_7__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1615:1: ( rule__Transition__Group_7__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_7()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1616:1: ( rule__Transition__Group_7__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1616:2: rule__Transition__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_7__0_in_rule__Transition__Group__7__Impl3263);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1626:1: rule__Transition__Group__8 : rule__Transition__Group__8__Impl rule__Transition__Group__9 ;
    public final void rule__Transition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1630:1: ( rule__Transition__Group__8__Impl rule__Transition__Group__9 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1631:2: rule__Transition__Group__8__Impl rule__Transition__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__8__Impl_in_rule__Transition__Group__83294);
            rule__Transition__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__9_in_rule__Transition__Group__83297);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1638:1: rule__Transition__Group__8__Impl : ( ( rule__Transition__Group_8__0 )? ) ;
    public final void rule__Transition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1642:1: ( ( ( rule__Transition__Group_8__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1643:1: ( ( rule__Transition__Group_8__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1643:1: ( ( rule__Transition__Group_8__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1644:1: ( rule__Transition__Group_8__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_8()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1645:1: ( rule__Transition__Group_8__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1645:2: rule__Transition__Group_8__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_8__0_in_rule__Transition__Group__8__Impl3324);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1655:1: rule__Transition__Group__9 : rule__Transition__Group__9__Impl rule__Transition__Group__10 ;
    public final void rule__Transition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1659:1: ( rule__Transition__Group__9__Impl rule__Transition__Group__10 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1660:2: rule__Transition__Group__9__Impl rule__Transition__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__9__Impl_in_rule__Transition__Group__93355);
            rule__Transition__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__10_in_rule__Transition__Group__93358);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1667:1: rule__Transition__Group__9__Impl : ( ( rule__Transition__Group_9__0 )? ) ;
    public final void rule__Transition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1671:1: ( ( ( rule__Transition__Group_9__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1672:1: ( ( rule__Transition__Group_9__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1672:1: ( ( rule__Transition__Group_9__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1673:1: ( rule__Transition__Group_9__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_9()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1674:1: ( rule__Transition__Group_9__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1674:2: rule__Transition__Group_9__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_9__0_in_rule__Transition__Group__9__Impl3385);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1684:1: rule__Transition__Group__10 : rule__Transition__Group__10__Impl rule__Transition__Group__11 ;
    public final void rule__Transition__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1688:1: ( rule__Transition__Group__10__Impl rule__Transition__Group__11 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1689:2: rule__Transition__Group__10__Impl rule__Transition__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__10__Impl_in_rule__Transition__Group__103416);
            rule__Transition__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__11_in_rule__Transition__Group__103419);
            rule__Transition__Group__11();

            state._fsp--;


            }

        }
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1696:1: rule__Transition__Group__10__Impl : ( ( rule__Transition__Group_10__0 )? ) ;
    public final void rule__Transition__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1700:1: ( ( ( rule__Transition__Group_10__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1701:1: ( ( rule__Transition__Group_10__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1701:1: ( ( rule__Transition__Group_10__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1702:1: ( rule__Transition__Group_10__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_10()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1703:1: ( rule__Transition__Group_10__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1703:2: rule__Transition__Group_10__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_10__0_in_rule__Transition__Group__10__Impl3446);
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


    // $ANTLR start "rule__Transition__Group__11"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1713:1: rule__Transition__Group__11 : rule__Transition__Group__11__Impl ;
    public final void rule__Transition__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1717:1: ( rule__Transition__Group__11__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1718:2: rule__Transition__Group__11__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__11__Impl_in_rule__Transition__Group__113477);
            rule__Transition__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__11"


    // $ANTLR start "rule__Transition__Group__11__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1724:1: rule__Transition__Group__11__Impl : ( 'end' ) ;
    public final void rule__Transition__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1728:1: ( ( 'end' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1729:1: ( 'end' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1729:1: ( 'end' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1730:1: 'end'
            {
             before(grammarAccess.getTransitionAccess().getEndKeyword_11()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Transition__Group__11__Impl3505); 
             after(grammarAccess.getTransitionAccess().getEndKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__11__Impl"


    // $ANTLR start "rule__Transition__Group_3__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1767:1: rule__Transition__Group_3__0 : rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1 ;
    public final void rule__Transition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1771:1: ( rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1772:2: rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_3__0__Impl_in_rule__Transition__Group_3__03560);
            rule__Transition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_3__1_in_rule__Transition__Group_3__03563);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1779:1: rule__Transition__Group_3__0__Impl : ( '>' ) ;
    public final void rule__Transition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1783:1: ( ( '>' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1784:1: ( '>' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1784:1: ( '>' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1785:1: '>'
            {
             before(grammarAccess.getTransitionAccess().getGreaterThanSignKeyword_3_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Transition__Group_3__0__Impl3591); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1798:1: rule__Transition__Group_3__1 : rule__Transition__Group_3__1__Impl ;
    public final void rule__Transition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1802:1: ( rule__Transition__Group_3__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1803:2: rule__Transition__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_3__1__Impl_in_rule__Transition__Group_3__13622);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1809:1: rule__Transition__Group_3__1__Impl : ( ( rule__Transition__CommentAssignment_3_1 ) ) ;
    public final void rule__Transition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1813:1: ( ( ( rule__Transition__CommentAssignment_3_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1814:1: ( ( rule__Transition__CommentAssignment_3_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1814:1: ( ( rule__Transition__CommentAssignment_3_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1815:1: ( rule__Transition__CommentAssignment_3_1 )
            {
             before(grammarAccess.getTransitionAccess().getCommentAssignment_3_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1816:1: ( rule__Transition__CommentAssignment_3_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1816:2: rule__Transition__CommentAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__CommentAssignment_3_1_in_rule__Transition__Group_3__1__Impl3649);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1830:1: rule__Transition__Group_4__0 : rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1 ;
    public final void rule__Transition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1834:1: ( rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1835:2: rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4__0__Impl_in_rule__Transition__Group_4__03683);
            rule__Transition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4__1_in_rule__Transition__Group_4__03686);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1842:1: rule__Transition__Group_4__0__Impl : ( 'elaborates' ) ;
    public final void rule__Transition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1846:1: ( ( 'elaborates' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1847:1: ( 'elaborates' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1847:1: ( 'elaborates' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1848:1: 'elaborates'
            {
             before(grammarAccess.getTransitionAccess().getElaboratesKeyword_4_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Transition__Group_4__0__Impl3714); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1861:1: rule__Transition__Group_4__1 : rule__Transition__Group_4__1__Impl rule__Transition__Group_4__2 ;
    public final void rule__Transition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1865:1: ( rule__Transition__Group_4__1__Impl rule__Transition__Group_4__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1866:2: rule__Transition__Group_4__1__Impl rule__Transition__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4__1__Impl_in_rule__Transition__Group_4__13745);
            rule__Transition__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4__2_in_rule__Transition__Group_4__13748);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1873:1: rule__Transition__Group_4__1__Impl : ( ( rule__Transition__ElaboratesAssignment_4_1 ) ) ;
    public final void rule__Transition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1877:1: ( ( ( rule__Transition__ElaboratesAssignment_4_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1878:1: ( ( rule__Transition__ElaboratesAssignment_4_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1878:1: ( ( rule__Transition__ElaboratesAssignment_4_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1879:1: ( rule__Transition__ElaboratesAssignment_4_1 )
            {
             before(grammarAccess.getTransitionAccess().getElaboratesAssignment_4_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1880:1: ( rule__Transition__ElaboratesAssignment_4_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1880:2: rule__Transition__ElaboratesAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__ElaboratesAssignment_4_1_in_rule__Transition__Group_4__1__Impl3775);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1890:1: rule__Transition__Group_4__2 : rule__Transition__Group_4__2__Impl ;
    public final void rule__Transition__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1894:1: ( rule__Transition__Group_4__2__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1895:2: rule__Transition__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4__2__Impl_in_rule__Transition__Group_4__23805);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1901:1: rule__Transition__Group_4__2__Impl : ( ( rule__Transition__ElaboratesAssignment_4_2 )* ) ;
    public final void rule__Transition__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1905:1: ( ( ( rule__Transition__ElaboratesAssignment_4_2 )* ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1906:1: ( ( rule__Transition__ElaboratesAssignment_4_2 )* )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1906:1: ( ( rule__Transition__ElaboratesAssignment_4_2 )* )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1907:1: ( rule__Transition__ElaboratesAssignment_4_2 )*
            {
             before(grammarAccess.getTransitionAccess().getElaboratesAssignment_4_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1908:1: ( rule__Transition__ElaboratesAssignment_4_2 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_ID)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1908:2: rule__Transition__ElaboratesAssignment_4_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Transition__ElaboratesAssignment_4_2_in_rule__Transition__Group_4__2__Impl3832);
            	    rule__Transition__ElaboratesAssignment_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getTransitionAccess().getElaboratesAssignment_4_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Transition__Group_5__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1924:1: rule__Transition__Group_5__0 : rule__Transition__Group_5__0__Impl rule__Transition__Group_5__1 ;
    public final void rule__Transition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1928:1: ( rule__Transition__Group_5__0__Impl rule__Transition__Group_5__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1929:2: rule__Transition__Group_5__0__Impl rule__Transition__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_5__0__Impl_in_rule__Transition__Group_5__03869);
            rule__Transition__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_5__1_in_rule__Transition__Group_5__03872);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1936:1: rule__Transition__Group_5__0__Impl : ( 'target' ) ;
    public final void rule__Transition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1940:1: ( ( 'target' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1941:1: ( 'target' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1941:1: ( 'target' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1942:1: 'target'
            {
             before(grammarAccess.getTransitionAccess().getTargetKeyword_5_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Transition__Group_5__0__Impl3900); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1955:1: rule__Transition__Group_5__1 : rule__Transition__Group_5__1__Impl ;
    public final void rule__Transition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1959:1: ( rule__Transition__Group_5__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1960:2: rule__Transition__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_5__1__Impl_in_rule__Transition__Group_5__13931);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1966:1: rule__Transition__Group_5__1__Impl : ( ( rule__Transition__TargetAssignment_5_1 ) ) ;
    public final void rule__Transition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1970:1: ( ( ( rule__Transition__TargetAssignment_5_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1971:1: ( ( rule__Transition__TargetAssignment_5_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1971:1: ( ( rule__Transition__TargetAssignment_5_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1972:1: ( rule__Transition__TargetAssignment_5_1 )
            {
             before(grammarAccess.getTransitionAccess().getTargetAssignment_5_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1973:1: ( rule__Transition__TargetAssignment_5_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1973:2: rule__Transition__TargetAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__TargetAssignment_5_1_in_rule__Transition__Group_5__1__Impl3958);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1987:1: rule__Transition__Group_6__0 : rule__Transition__Group_6__0__Impl rule__Transition__Group_6__1 ;
    public final void rule__Transition__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1991:1: ( rule__Transition__Group_6__0__Impl rule__Transition__Group_6__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1992:2: rule__Transition__Group_6__0__Impl rule__Transition__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_6__0__Impl_in_rule__Transition__Group_6__03992);
            rule__Transition__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_6__1_in_rule__Transition__Group_6__03995);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:1999:1: rule__Transition__Group_6__0__Impl : ( 'source' ) ;
    public final void rule__Transition__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2003:1: ( ( 'source' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2004:1: ( 'source' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2004:1: ( 'source' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2005:1: 'source'
            {
             before(grammarAccess.getTransitionAccess().getSourceKeyword_6_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Transition__Group_6__0__Impl4023); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2018:1: rule__Transition__Group_6__1 : rule__Transition__Group_6__1__Impl ;
    public final void rule__Transition__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2022:1: ( rule__Transition__Group_6__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2023:2: rule__Transition__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_6__1__Impl_in_rule__Transition__Group_6__14054);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2029:1: rule__Transition__Group_6__1__Impl : ( ( rule__Transition__SourceAssignment_6_1 ) ) ;
    public final void rule__Transition__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2033:1: ( ( ( rule__Transition__SourceAssignment_6_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2034:1: ( ( rule__Transition__SourceAssignment_6_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2034:1: ( ( rule__Transition__SourceAssignment_6_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2035:1: ( rule__Transition__SourceAssignment_6_1 )
            {
             before(grammarAccess.getTransitionAccess().getSourceAssignment_6_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2036:1: ( rule__Transition__SourceAssignment_6_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2036:2: rule__Transition__SourceAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__SourceAssignment_6_1_in_rule__Transition__Group_6__1__Impl4081);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2050:1: rule__Transition__Group_7__0 : rule__Transition__Group_7__0__Impl rule__Transition__Group_7__1 ;
    public final void rule__Transition__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2054:1: ( rule__Transition__Group_7__0__Impl rule__Transition__Group_7__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2055:2: rule__Transition__Group_7__0__Impl rule__Transition__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_7__0__Impl_in_rule__Transition__Group_7__04115);
            rule__Transition__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_7__1_in_rule__Transition__Group_7__04118);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2062:1: rule__Transition__Group_7__0__Impl : ( 'when' ) ;
    public final void rule__Transition__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2066:1: ( ( 'when' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2067:1: ( 'when' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2067:1: ( 'when' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2068:1: 'when'
            {
             before(grammarAccess.getTransitionAccess().getWhenKeyword_7_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Transition__Group_7__0__Impl4146); 
             after(grammarAccess.getTransitionAccess().getWhenKeyword_7_0()); 

            }


            }

        }
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2081:1: rule__Transition__Group_7__1 : rule__Transition__Group_7__1__Impl rule__Transition__Group_7__2 ;
    public final void rule__Transition__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2085:1: ( rule__Transition__Group_7__1__Impl rule__Transition__Group_7__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2086:2: rule__Transition__Group_7__1__Impl rule__Transition__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_7__1__Impl_in_rule__Transition__Group_7__14177);
            rule__Transition__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_7__2_in_rule__Transition__Group_7__14180);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2093:1: rule__Transition__Group_7__1__Impl : ( ( rule__Transition__GuardsAssignment_7_1 ) ) ;
    public final void rule__Transition__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2097:1: ( ( ( rule__Transition__GuardsAssignment_7_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2098:1: ( ( rule__Transition__GuardsAssignment_7_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2098:1: ( ( rule__Transition__GuardsAssignment_7_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2099:1: ( rule__Transition__GuardsAssignment_7_1 )
            {
             before(grammarAccess.getTransitionAccess().getGuardsAssignment_7_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2100:1: ( rule__Transition__GuardsAssignment_7_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2100:2: rule__Transition__GuardsAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__GuardsAssignment_7_1_in_rule__Transition__Group_7__1__Impl4207);
            rule__Transition__GuardsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGuardsAssignment_7_1()); 

            }


            }

        }
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2110:1: rule__Transition__Group_7__2 : rule__Transition__Group_7__2__Impl ;
    public final void rule__Transition__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2114:1: ( rule__Transition__Group_7__2__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2115:2: rule__Transition__Group_7__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_7__2__Impl_in_rule__Transition__Group_7__24237);
            rule__Transition__Group_7__2__Impl();

            state._fsp--;


            }

        }
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2121:1: rule__Transition__Group_7__2__Impl : ( ( rule__Transition__GuardsAssignment_7_2 )* ) ;
    public final void rule__Transition__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2125:1: ( ( ( rule__Transition__GuardsAssignment_7_2 )* ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2126:1: ( ( rule__Transition__GuardsAssignment_7_2 )* )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2126:1: ( ( rule__Transition__GuardsAssignment_7_2 )* )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2127:1: ( rule__Transition__GuardsAssignment_7_2 )*
            {
             before(grammarAccess.getTransitionAccess().getGuardsAssignment_7_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2128:1: ( rule__Transition__GuardsAssignment_7_2 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==40||LA22_0==45) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2128:2: rule__Transition__GuardsAssignment_7_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Transition__GuardsAssignment_7_2_in_rule__Transition__Group_7__2__Impl4264);
            	    rule__Transition__GuardsAssignment_7_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getTransitionAccess().getGuardsAssignment_7_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Transition__Group_8__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2144:1: rule__Transition__Group_8__0 : rule__Transition__Group_8__0__Impl rule__Transition__Group_8__1 ;
    public final void rule__Transition__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2148:1: ( rule__Transition__Group_8__0__Impl rule__Transition__Group_8__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2149:2: rule__Transition__Group_8__0__Impl rule__Transition__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_8__0__Impl_in_rule__Transition__Group_8__04301);
            rule__Transition__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_8__1_in_rule__Transition__Group_8__04304);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2156:1: rule__Transition__Group_8__0__Impl : ( 'any' ) ;
    public final void rule__Transition__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2160:1: ( ( 'any' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2161:1: ( 'any' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2161:1: ( 'any' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2162:1: 'any'
            {
             before(grammarAccess.getTransitionAccess().getAnyKeyword_8_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Transition__Group_8__0__Impl4332); 
             after(grammarAccess.getTransitionAccess().getAnyKeyword_8_0()); 

            }


            }

        }
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2175:1: rule__Transition__Group_8__1 : rule__Transition__Group_8__1__Impl rule__Transition__Group_8__2 ;
    public final void rule__Transition__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2179:1: ( rule__Transition__Group_8__1__Impl rule__Transition__Group_8__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2180:2: rule__Transition__Group_8__1__Impl rule__Transition__Group_8__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_8__1__Impl_in_rule__Transition__Group_8__14363);
            rule__Transition__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_8__2_in_rule__Transition__Group_8__14366);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2187:1: rule__Transition__Group_8__1__Impl : ( ( rule__Transition__ParametersAssignment_8_1 ) ) ;
    public final void rule__Transition__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2191:1: ( ( ( rule__Transition__ParametersAssignment_8_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2192:1: ( ( rule__Transition__ParametersAssignment_8_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2192:1: ( ( rule__Transition__ParametersAssignment_8_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2193:1: ( rule__Transition__ParametersAssignment_8_1 )
            {
             before(grammarAccess.getTransitionAccess().getParametersAssignment_8_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2194:1: ( rule__Transition__ParametersAssignment_8_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2194:2: rule__Transition__ParametersAssignment_8_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__ParametersAssignment_8_1_in_rule__Transition__Group_8__1__Impl4393);
            rule__Transition__ParametersAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getParametersAssignment_8_1()); 

            }


            }

        }
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2204:1: rule__Transition__Group_8__2 : rule__Transition__Group_8__2__Impl rule__Transition__Group_8__3 ;
    public final void rule__Transition__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2208:1: ( rule__Transition__Group_8__2__Impl rule__Transition__Group_8__3 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2209:2: rule__Transition__Group_8__2__Impl rule__Transition__Group_8__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_8__2__Impl_in_rule__Transition__Group_8__24423);
            rule__Transition__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_8__3_in_rule__Transition__Group_8__24426);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2216:1: rule__Transition__Group_8__2__Impl : ( ( rule__Transition__ParametersAssignment_8_2 )* ) ;
    public final void rule__Transition__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2220:1: ( ( ( rule__Transition__ParametersAssignment_8_2 )* ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2221:1: ( ( rule__Transition__ParametersAssignment_8_2 )* )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2221:1: ( ( rule__Transition__ParametersAssignment_8_2 )* )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2222:1: ( rule__Transition__ParametersAssignment_8_2 )*
            {
             before(grammarAccess.getTransitionAccess().getParametersAssignment_8_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2223:1: ( rule__Transition__ParametersAssignment_8_2 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==41) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2223:2: rule__Transition__ParametersAssignment_8_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Transition__ParametersAssignment_8_2_in_rule__Transition__Group_8__2__Impl4453);
            	    rule__Transition__ParametersAssignment_8_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getTransitionAccess().getParametersAssignment_8_2()); 

            }


            }

        }
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2233:1: rule__Transition__Group_8__3 : rule__Transition__Group_8__3__Impl rule__Transition__Group_8__4 ;
    public final void rule__Transition__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2237:1: ( rule__Transition__Group_8__3__Impl rule__Transition__Group_8__4 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2238:2: rule__Transition__Group_8__3__Impl rule__Transition__Group_8__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_8__3__Impl_in_rule__Transition__Group_8__34484);
            rule__Transition__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_8__4_in_rule__Transition__Group_8__34487);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2245:1: rule__Transition__Group_8__3__Impl : ( 'where' ) ;
    public final void rule__Transition__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2249:1: ( ( 'where' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2250:1: ( 'where' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2250:1: ( 'where' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2251:1: 'where'
            {
             before(grammarAccess.getTransitionAccess().getWhereKeyword_8_3()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Transition__Group_8__3__Impl4515); 
             after(grammarAccess.getTransitionAccess().getWhereKeyword_8_3()); 

            }


            }

        }
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2264:1: rule__Transition__Group_8__4 : rule__Transition__Group_8__4__Impl rule__Transition__Group_8__5 ;
    public final void rule__Transition__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2268:1: ( rule__Transition__Group_8__4__Impl rule__Transition__Group_8__5 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2269:2: rule__Transition__Group_8__4__Impl rule__Transition__Group_8__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_8__4__Impl_in_rule__Transition__Group_8__44546);
            rule__Transition__Group_8__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_8__5_in_rule__Transition__Group_8__44549);
            rule__Transition__Group_8__5();

            state._fsp--;


            }

        }
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2276:1: rule__Transition__Group_8__4__Impl : ( ( rule__Transition__GuardsAssignment_8_4 ) ) ;
    public final void rule__Transition__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2280:1: ( ( ( rule__Transition__GuardsAssignment_8_4 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2281:1: ( ( rule__Transition__GuardsAssignment_8_4 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2281:1: ( ( rule__Transition__GuardsAssignment_8_4 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2282:1: ( rule__Transition__GuardsAssignment_8_4 )
            {
             before(grammarAccess.getTransitionAccess().getGuardsAssignment_8_4()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2283:1: ( rule__Transition__GuardsAssignment_8_4 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2283:2: rule__Transition__GuardsAssignment_8_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__GuardsAssignment_8_4_in_rule__Transition__Group_8__4__Impl4576);
            rule__Transition__GuardsAssignment_8_4();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGuardsAssignment_8_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Transition__Group_8__5"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2293:1: rule__Transition__Group_8__5 : rule__Transition__Group_8__5__Impl ;
    public final void rule__Transition__Group_8__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2297:1: ( rule__Transition__Group_8__5__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2298:2: rule__Transition__Group_8__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_8__5__Impl_in_rule__Transition__Group_8__54606);
            rule__Transition__Group_8__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_8__5"


    // $ANTLR start "rule__Transition__Group_8__5__Impl"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2304:1: rule__Transition__Group_8__5__Impl : ( ( rule__Transition__GuardsAssignment_8_5 )* ) ;
    public final void rule__Transition__Group_8__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2308:1: ( ( ( rule__Transition__GuardsAssignment_8_5 )* ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2309:1: ( ( rule__Transition__GuardsAssignment_8_5 )* )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2309:1: ( ( rule__Transition__GuardsAssignment_8_5 )* )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2310:1: ( rule__Transition__GuardsAssignment_8_5 )*
            {
             before(grammarAccess.getTransitionAccess().getGuardsAssignment_8_5()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2311:1: ( rule__Transition__GuardsAssignment_8_5 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==40||LA24_0==45) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2311:2: rule__Transition__GuardsAssignment_8_5
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Transition__GuardsAssignment_8_5_in_rule__Transition__Group_8__5__Impl4633);
            	    rule__Transition__GuardsAssignment_8_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getTransitionAccess().getGuardsAssignment_8_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_8__5__Impl"


    // $ANTLR start "rule__Transition__Group_9__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2333:1: rule__Transition__Group_9__0 : rule__Transition__Group_9__0__Impl rule__Transition__Group_9__1 ;
    public final void rule__Transition__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2337:1: ( rule__Transition__Group_9__0__Impl rule__Transition__Group_9__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2338:2: rule__Transition__Group_9__0__Impl rule__Transition__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_9__0__Impl_in_rule__Transition__Group_9__04676);
            rule__Transition__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_9__1_in_rule__Transition__Group_9__04679);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2345:1: rule__Transition__Group_9__0__Impl : ( 'with' ) ;
    public final void rule__Transition__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2349:1: ( ( 'with' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2350:1: ( 'with' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2350:1: ( 'with' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2351:1: 'with'
            {
             before(grammarAccess.getTransitionAccess().getWithKeyword_9_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Transition__Group_9__0__Impl4707); 
             after(grammarAccess.getTransitionAccess().getWithKeyword_9_0()); 

            }


            }

        }
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2364:1: rule__Transition__Group_9__1 : rule__Transition__Group_9__1__Impl rule__Transition__Group_9__2 ;
    public final void rule__Transition__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2368:1: ( rule__Transition__Group_9__1__Impl rule__Transition__Group_9__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2369:2: rule__Transition__Group_9__1__Impl rule__Transition__Group_9__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_9__1__Impl_in_rule__Transition__Group_9__14738);
            rule__Transition__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_9__2_in_rule__Transition__Group_9__14741);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2376:1: rule__Transition__Group_9__1__Impl : ( ( rule__Transition__WitnessesAssignment_9_1 ) ) ;
    public final void rule__Transition__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2380:1: ( ( ( rule__Transition__WitnessesAssignment_9_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2381:1: ( ( rule__Transition__WitnessesAssignment_9_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2381:1: ( ( rule__Transition__WitnessesAssignment_9_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2382:1: ( rule__Transition__WitnessesAssignment_9_1 )
            {
             before(grammarAccess.getTransitionAccess().getWitnessesAssignment_9_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2383:1: ( rule__Transition__WitnessesAssignment_9_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2383:2: rule__Transition__WitnessesAssignment_9_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__WitnessesAssignment_9_1_in_rule__Transition__Group_9__1__Impl4768);
            rule__Transition__WitnessesAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getWitnessesAssignment_9_1()); 

            }


            }

        }
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2393:1: rule__Transition__Group_9__2 : rule__Transition__Group_9__2__Impl ;
    public final void rule__Transition__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2397:1: ( rule__Transition__Group_9__2__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2398:2: rule__Transition__Group_9__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_9__2__Impl_in_rule__Transition__Group_9__24798);
            rule__Transition__Group_9__2__Impl();

            state._fsp--;


            }

        }
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2404:1: rule__Transition__Group_9__2__Impl : ( ( rule__Transition__WitnessesAssignment_9_2 )* ) ;
    public final void rule__Transition__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2408:1: ( ( ( rule__Transition__WitnessesAssignment_9_2 )* ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2409:1: ( ( rule__Transition__WitnessesAssignment_9_2 )* )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2409:1: ( ( rule__Transition__WitnessesAssignment_9_2 )* )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2410:1: ( rule__Transition__WitnessesAssignment_9_2 )*
            {
             before(grammarAccess.getTransitionAccess().getWitnessesAssignment_9_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2411:1: ( rule__Transition__WitnessesAssignment_9_2 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==43) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2411:2: rule__Transition__WitnessesAssignment_9_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Transition__WitnessesAssignment_9_2_in_rule__Transition__Group_9__2__Impl4825);
            	    rule__Transition__WitnessesAssignment_9_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getTransitionAccess().getWitnessesAssignment_9_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Transition__Group_10__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2427:1: rule__Transition__Group_10__0 : rule__Transition__Group_10__0__Impl rule__Transition__Group_10__1 ;
    public final void rule__Transition__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2431:1: ( rule__Transition__Group_10__0__Impl rule__Transition__Group_10__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2432:2: rule__Transition__Group_10__0__Impl rule__Transition__Group_10__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_10__0__Impl_in_rule__Transition__Group_10__04862);
            rule__Transition__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_10__1_in_rule__Transition__Group_10__04865);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2439:1: rule__Transition__Group_10__0__Impl : ( 'then' ) ;
    public final void rule__Transition__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2443:1: ( ( 'then' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2444:1: ( 'then' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2444:1: ( 'then' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2445:1: 'then'
            {
             before(grammarAccess.getTransitionAccess().getThenKeyword_10_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Transition__Group_10__0__Impl4893); 
             after(grammarAccess.getTransitionAccess().getThenKeyword_10_0()); 

            }


            }

        }
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2458:1: rule__Transition__Group_10__1 : rule__Transition__Group_10__1__Impl rule__Transition__Group_10__2 ;
    public final void rule__Transition__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2462:1: ( rule__Transition__Group_10__1__Impl rule__Transition__Group_10__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2463:2: rule__Transition__Group_10__1__Impl rule__Transition__Group_10__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_10__1__Impl_in_rule__Transition__Group_10__14924);
            rule__Transition__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_10__2_in_rule__Transition__Group_10__14927);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2470:1: rule__Transition__Group_10__1__Impl : ( ( rule__Transition__ActionsAssignment_10_1 ) ) ;
    public final void rule__Transition__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2474:1: ( ( ( rule__Transition__ActionsAssignment_10_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2475:1: ( ( rule__Transition__ActionsAssignment_10_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2475:1: ( ( rule__Transition__ActionsAssignment_10_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2476:1: ( rule__Transition__ActionsAssignment_10_1 )
            {
             before(grammarAccess.getTransitionAccess().getActionsAssignment_10_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2477:1: ( rule__Transition__ActionsAssignment_10_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2477:2: rule__Transition__ActionsAssignment_10_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__ActionsAssignment_10_1_in_rule__Transition__Group_10__1__Impl4954);
            rule__Transition__ActionsAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getActionsAssignment_10_1()); 

            }


            }

        }
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2487:1: rule__Transition__Group_10__2 : rule__Transition__Group_10__2__Impl ;
    public final void rule__Transition__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2491:1: ( rule__Transition__Group_10__2__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2492:2: rule__Transition__Group_10__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_10__2__Impl_in_rule__Transition__Group_10__24984);
            rule__Transition__Group_10__2__Impl();

            state._fsp--;


            }

        }
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2498:1: rule__Transition__Group_10__2__Impl : ( ( rule__Transition__ActionsAssignment_10_2 )* ) ;
    public final void rule__Transition__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2502:1: ( ( ( rule__Transition__ActionsAssignment_10_2 )* ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2503:1: ( ( rule__Transition__ActionsAssignment_10_2 )* )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2503:1: ( ( rule__Transition__ActionsAssignment_10_2 )* )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2504:1: ( rule__Transition__ActionsAssignment_10_2 )*
            {
             before(grammarAccess.getTransitionAccess().getActionsAssignment_10_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2505:1: ( rule__Transition__ActionsAssignment_10_2 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==40) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2505:2: rule__Transition__ActionsAssignment_10_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Transition__ActionsAssignment_10_2_in_rule__Transition__Group_10__2__Impl5011);
            	    rule__Transition__ActionsAssignment_10_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getTransitionAccess().getActionsAssignment_10_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__State__Group__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2522:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2526:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2527:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__05049);
            rule__State__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group__1_in_rule__State__Group__05052);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2534:1: rule__State__Group__0__Impl : ( () ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2538:1: ( ( () ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2539:1: ( () )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2539:1: ( () )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2540:1: ()
            {
             before(grammarAccess.getStateAccess().getStateAction_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2541:1: ()
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2543:1: 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2553:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2557:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2558:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__15110);
            rule__State__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group__2_in_rule__State__Group__15113);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2565:1: rule__State__Group__1__Impl : ( 'State' ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2569:1: ( ( 'State' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2570:1: ( 'State' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2570:1: ( 'State' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2571:1: 'State'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_1()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__State__Group__1__Impl5141); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2584:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2588:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2589:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__25172);
            rule__State__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group__3_in_rule__State__Group__25175);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2596:1: rule__State__Group__2__Impl : ( ( rule__State__NameAssignment_2 ) ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2600:1: ( ( ( rule__State__NameAssignment_2 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2601:1: ( ( rule__State__NameAssignment_2 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2601:1: ( ( rule__State__NameAssignment_2 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2602:1: ( rule__State__NameAssignment_2 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2603:1: ( rule__State__NameAssignment_2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2603:2: rule__State__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__NameAssignment_2_in_rule__State__Group__2__Impl5202);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2613:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2617:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2618:2: rule__State__Group__3__Impl rule__State__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group__3__Impl_in_rule__State__Group__35232);
            rule__State__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group__4_in_rule__State__Group__35235);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2625:1: rule__State__Group__3__Impl : ( ( rule__State__Group_3__0 )? ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2629:1: ( ( ( rule__State__Group_3__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2630:1: ( ( rule__State__Group_3__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2630:1: ( ( rule__State__Group_3__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2631:1: ( rule__State__Group_3__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_3()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2632:1: ( rule__State__Group_3__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==19) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2632:2: rule__State__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__State__Group_3__0_in_rule__State__Group__3__Impl5262);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2642:1: rule__State__Group__4 : rule__State__Group__4__Impl rule__State__Group__5 ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2646:1: ( rule__State__Group__4__Impl rule__State__Group__5 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2647:2: rule__State__Group__4__Impl rule__State__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group__4__Impl_in_rule__State__Group__45293);
            rule__State__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group__5_in_rule__State__Group__45296);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2654:1: rule__State__Group__4__Impl : ( ( rule__State__Group_4__0 )? ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2658:1: ( ( ( rule__State__Group_4__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2659:1: ( ( rule__State__Group_4__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2659:1: ( ( rule__State__Group_4__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2660:1: ( rule__State__Group_4__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_4()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2661:1: ( rule__State__Group_4__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==32) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2661:2: rule__State__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__State__Group_4__0_in_rule__State__Group__4__Impl5323);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2671:1: rule__State__Group__5 : rule__State__Group__5__Impl ;
    public final void rule__State__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2675:1: ( rule__State__Group__5__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2676:2: rule__State__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group__5__Impl_in_rule__State__Group__55354);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2682:1: rule__State__Group__5__Impl : ( ( rule__State__Group_5__0 )? ) ;
    public final void rule__State__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2686:1: ( ( ( rule__State__Group_5__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2687:1: ( ( rule__State__Group_5__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2687:1: ( ( rule__State__Group_5__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2688:1: ( rule__State__Group_5__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_5()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2689:1: ( rule__State__Group_5__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==33) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2689:2: rule__State__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__State__Group_5__0_in_rule__State__Group__5__Impl5381);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2711:1: rule__State__Group_3__0 : rule__State__Group_3__0__Impl rule__State__Group_3__1 ;
    public final void rule__State__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2715:1: ( rule__State__Group_3__0__Impl rule__State__Group_3__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2716:2: rule__State__Group_3__0__Impl rule__State__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_3__0__Impl_in_rule__State__Group_3__05424);
            rule__State__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_3__1_in_rule__State__Group_3__05427);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2723:1: rule__State__Group_3__0__Impl : ( 'refines' ) ;
    public final void rule__State__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2727:1: ( ( 'refines' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2728:1: ( 'refines' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2728:1: ( 'refines' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2729:1: 'refines'
            {
             before(grammarAccess.getStateAccess().getRefinesKeyword_3_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__State__Group_3__0__Impl5455); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2742:1: rule__State__Group_3__1 : rule__State__Group_3__1__Impl ;
    public final void rule__State__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2746:1: ( rule__State__Group_3__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2747:2: rule__State__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_3__1__Impl_in_rule__State__Group_3__15486);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2753:1: rule__State__Group_3__1__Impl : ( ( rule__State__RefinesAssignment_3_1 ) ) ;
    public final void rule__State__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2757:1: ( ( ( rule__State__RefinesAssignment_3_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2758:1: ( ( rule__State__RefinesAssignment_3_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2758:1: ( ( rule__State__RefinesAssignment_3_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2759:1: ( rule__State__RefinesAssignment_3_1 )
            {
             before(grammarAccess.getStateAccess().getRefinesAssignment_3_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2760:1: ( rule__State__RefinesAssignment_3_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2760:2: rule__State__RefinesAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__RefinesAssignment_3_1_in_rule__State__Group_3__1__Impl5513);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2774:1: rule__State__Group_4__0 : rule__State__Group_4__0__Impl rule__State__Group_4__1 ;
    public final void rule__State__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2778:1: ( rule__State__Group_4__0__Impl rule__State__Group_4__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2779:2: rule__State__Group_4__0__Impl rule__State__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_4__0__Impl_in_rule__State__Group_4__05547);
            rule__State__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_4__1_in_rule__State__Group_4__05550);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2786:1: rule__State__Group_4__0__Impl : ( 'statemachines' ) ;
    public final void rule__State__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2790:1: ( ( 'statemachines' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2791:1: ( 'statemachines' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2791:1: ( 'statemachines' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2792:1: 'statemachines'
            {
             before(grammarAccess.getStateAccess().getStatemachinesKeyword_4_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__State__Group_4__0__Impl5578); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2805:1: rule__State__Group_4__1 : rule__State__Group_4__1__Impl rule__State__Group_4__2 ;
    public final void rule__State__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2809:1: ( rule__State__Group_4__1__Impl rule__State__Group_4__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2810:2: rule__State__Group_4__1__Impl rule__State__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_4__1__Impl_in_rule__State__Group_4__15609);
            rule__State__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_4__2_in_rule__State__Group_4__15612);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2817:1: rule__State__Group_4__1__Impl : ( ( rule__State__StatemachinesAssignment_4_1 ) ) ;
    public final void rule__State__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2821:1: ( ( ( rule__State__StatemachinesAssignment_4_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2822:1: ( ( rule__State__StatemachinesAssignment_4_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2822:1: ( ( rule__State__StatemachinesAssignment_4_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2823:1: ( rule__State__StatemachinesAssignment_4_1 )
            {
             before(grammarAccess.getStateAccess().getStatemachinesAssignment_4_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2824:1: ( rule__State__StatemachinesAssignment_4_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2824:2: rule__State__StatemachinesAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__StatemachinesAssignment_4_1_in_rule__State__Group_4__1__Impl5639);
            rule__State__StatemachinesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getStatemachinesAssignment_4_1()); 

            }


            }

        }
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2834:1: rule__State__Group_4__2 : rule__State__Group_4__2__Impl rule__State__Group_4__3 ;
    public final void rule__State__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2838:1: ( rule__State__Group_4__2__Impl rule__State__Group_4__3 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2839:2: rule__State__Group_4__2__Impl rule__State__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_4__2__Impl_in_rule__State__Group_4__25669);
            rule__State__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_4__3_in_rule__State__Group_4__25672);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2846:1: rule__State__Group_4__2__Impl : ( ( rule__State__StatemachinesAssignment_4_2 )* ) ;
    public final void rule__State__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2850:1: ( ( ( rule__State__StatemachinesAssignment_4_2 )* ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2851:1: ( ( rule__State__StatemachinesAssignment_4_2 )* )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2851:1: ( ( rule__State__StatemachinesAssignment_4_2 )* )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2852:1: ( rule__State__StatemachinesAssignment_4_2 )*
            {
             before(grammarAccess.getStateAccess().getStatemachinesAssignment_4_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2853:1: ( rule__State__StatemachinesAssignment_4_2 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==14) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2853:2: rule__State__StatemachinesAssignment_4_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__State__StatemachinesAssignment_4_2_in_rule__State__Group_4__2__Impl5699);
            	    rule__State__StatemachinesAssignment_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2863:1: rule__State__Group_4__3 : rule__State__Group_4__3__Impl ;
    public final void rule__State__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2867:1: ( rule__State__Group_4__3__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2868:2: rule__State__Group_4__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_4__3__Impl_in_rule__State__Group_4__35730);
            rule__State__Group_4__3__Impl();

            state._fsp--;


            }

        }
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2874:1: rule__State__Group_4__3__Impl : ( 'end' ) ;
    public final void rule__State__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2878:1: ( ( 'end' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2879:1: ( 'end' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2879:1: ( 'end' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2880:1: 'end'
            {
             before(grammarAccess.getStateAccess().getEndKeyword_4_3()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__State__Group_4__3__Impl5758); 
             after(grammarAccess.getStateAccess().getEndKeyword_4_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__State__Group_5__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2901:1: rule__State__Group_5__0 : rule__State__Group_5__0__Impl rule__State__Group_5__1 ;
    public final void rule__State__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2905:1: ( rule__State__Group_5__0__Impl rule__State__Group_5__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2906:2: rule__State__Group_5__0__Impl rule__State__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_5__0__Impl_in_rule__State__Group_5__05797);
            rule__State__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_5__1_in_rule__State__Group_5__05800);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2913:1: rule__State__Group_5__0__Impl : ( 'invariants' ) ;
    public final void rule__State__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2917:1: ( ( 'invariants' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2918:1: ( 'invariants' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2918:1: ( 'invariants' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2919:1: 'invariants'
            {
             before(grammarAccess.getStateAccess().getInvariantsKeyword_5_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__State__Group_5__0__Impl5828); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2932:1: rule__State__Group_5__1 : rule__State__Group_5__1__Impl rule__State__Group_5__2 ;
    public final void rule__State__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2936:1: ( rule__State__Group_5__1__Impl rule__State__Group_5__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2937:2: rule__State__Group_5__1__Impl rule__State__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_5__1__Impl_in_rule__State__Group_5__15859);
            rule__State__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_5__2_in_rule__State__Group_5__15862);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2944:1: rule__State__Group_5__1__Impl : ( ( rule__State__InvariantsAssignment_5_1 ) ) ;
    public final void rule__State__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2948:1: ( ( ( rule__State__InvariantsAssignment_5_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2949:1: ( ( rule__State__InvariantsAssignment_5_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2949:1: ( ( rule__State__InvariantsAssignment_5_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2950:1: ( rule__State__InvariantsAssignment_5_1 )
            {
             before(grammarAccess.getStateAccess().getInvariantsAssignment_5_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2951:1: ( rule__State__InvariantsAssignment_5_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2951:2: rule__State__InvariantsAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__InvariantsAssignment_5_1_in_rule__State__Group_5__1__Impl5889);
            rule__State__InvariantsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getInvariantsAssignment_5_1()); 

            }


            }

        }
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2961:1: rule__State__Group_5__2 : rule__State__Group_5__2__Impl ;
    public final void rule__State__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2965:1: ( rule__State__Group_5__2__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2966:2: rule__State__Group_5__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_5__2__Impl_in_rule__State__Group_5__25919);
            rule__State__Group_5__2__Impl();

            state._fsp--;


            }

        }
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2972:1: rule__State__Group_5__2__Impl : ( ( rule__State__InvariantsAssignment_5_2 )* ) ;
    public final void rule__State__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2976:1: ( ( ( rule__State__InvariantsAssignment_5_2 )* ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2977:1: ( ( rule__State__InvariantsAssignment_5_2 )* )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2977:1: ( ( rule__State__InvariantsAssignment_5_2 )* )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2978:1: ( rule__State__InvariantsAssignment_5_2 )*
            {
             before(grammarAccess.getStateAccess().getInvariantsAssignment_5_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2979:1: ( rule__State__InvariantsAssignment_5_2 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==39) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2979:2: rule__State__InvariantsAssignment_5_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__State__InvariantsAssignment_5_2_in_rule__State__Group_5__2__Impl5946);
            	    rule__State__InvariantsAssignment_5_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

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


    // $ANTLR start "rule__Initial__Group__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2995:1: rule__Initial__Group__0 : rule__Initial__Group__0__Impl rule__Initial__Group__1 ;
    public final void rule__Initial__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:2999:1: ( rule__Initial__Group__0__Impl rule__Initial__Group__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3000:2: rule__Initial__Group__0__Impl rule__Initial__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Initial__Group__0__Impl_in_rule__Initial__Group__05983);
            rule__Initial__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Initial__Group__1_in_rule__Initial__Group__05986);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3007:1: rule__Initial__Group__0__Impl : ( () ) ;
    public final void rule__Initial__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3011:1: ( ( () ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3012:1: ( () )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3012:1: ( () )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3013:1: ()
            {
             before(grammarAccess.getInitialAccess().getInitialAction_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3014:1: ()
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3016:1: 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3026:1: rule__Initial__Group__1 : rule__Initial__Group__1__Impl rule__Initial__Group__2 ;
    public final void rule__Initial__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3030:1: ( rule__Initial__Group__1__Impl rule__Initial__Group__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3031:2: rule__Initial__Group__1__Impl rule__Initial__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Initial__Group__1__Impl_in_rule__Initial__Group__16044);
            rule__Initial__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Initial__Group__2_in_rule__Initial__Group__16047);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3038:1: rule__Initial__Group__1__Impl : ( 'Initial' ) ;
    public final void rule__Initial__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3042:1: ( ( 'Initial' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3043:1: ( 'Initial' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3043:1: ( 'Initial' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3044:1: 'Initial'
            {
             before(grammarAccess.getInitialAccess().getInitialKeyword_1()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Initial__Group__1__Impl6075); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3057:1: rule__Initial__Group__2 : rule__Initial__Group__2__Impl ;
    public final void rule__Initial__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3061:1: ( rule__Initial__Group__2__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3062:2: rule__Initial__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Initial__Group__2__Impl_in_rule__Initial__Group__26106);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3068:1: rule__Initial__Group__2__Impl : ( ( rule__Initial__NameAssignment_2 ) ) ;
    public final void rule__Initial__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3072:1: ( ( ( rule__Initial__NameAssignment_2 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3073:1: ( ( rule__Initial__NameAssignment_2 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3073:1: ( ( rule__Initial__NameAssignment_2 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3074:1: ( rule__Initial__NameAssignment_2 )
            {
             before(grammarAccess.getInitialAccess().getNameAssignment_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3075:1: ( rule__Initial__NameAssignment_2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3075:2: rule__Initial__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Initial__NameAssignment_2_in_rule__Initial__Group__2__Impl6133);
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


    // $ANTLR start "rule__Final__Group__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3091:1: rule__Final__Group__0 : rule__Final__Group__0__Impl rule__Final__Group__1 ;
    public final void rule__Final__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3095:1: ( rule__Final__Group__0__Impl rule__Final__Group__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3096:2: rule__Final__Group__0__Impl rule__Final__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Final__Group__0__Impl_in_rule__Final__Group__06169);
            rule__Final__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Final__Group__1_in_rule__Final__Group__06172);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3103:1: rule__Final__Group__0__Impl : ( () ) ;
    public final void rule__Final__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3107:1: ( ( () ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3108:1: ( () )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3108:1: ( () )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3109:1: ()
            {
             before(grammarAccess.getFinalAccess().getFinalAction_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3110:1: ()
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3112:1: 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3122:1: rule__Final__Group__1 : rule__Final__Group__1__Impl rule__Final__Group__2 ;
    public final void rule__Final__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3126:1: ( rule__Final__Group__1__Impl rule__Final__Group__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3127:2: rule__Final__Group__1__Impl rule__Final__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Final__Group__1__Impl_in_rule__Final__Group__16230);
            rule__Final__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Final__Group__2_in_rule__Final__Group__16233);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3134:1: rule__Final__Group__1__Impl : ( 'Final' ) ;
    public final void rule__Final__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3138:1: ( ( 'Final' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3139:1: ( 'Final' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3139:1: ( 'Final' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3140:1: 'Final'
            {
             before(grammarAccess.getFinalAccess().getFinalKeyword_1()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Final__Group__1__Impl6261); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3153:1: rule__Final__Group__2 : rule__Final__Group__2__Impl ;
    public final void rule__Final__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3157:1: ( rule__Final__Group__2__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3158:2: rule__Final__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Final__Group__2__Impl_in_rule__Final__Group__26292);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3164:1: rule__Final__Group__2__Impl : ( ( rule__Final__NameAssignment_2 ) ) ;
    public final void rule__Final__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3168:1: ( ( ( rule__Final__NameAssignment_2 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3169:1: ( ( rule__Final__NameAssignment_2 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3169:1: ( ( rule__Final__NameAssignment_2 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3170:1: ( rule__Final__NameAssignment_2 )
            {
             before(grammarAccess.getFinalAccess().getNameAssignment_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3171:1: ( rule__Final__NameAssignment_2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3171:2: rule__Final__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Final__NameAssignment_2_in_rule__Final__Group__2__Impl6319);
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


    // $ANTLR start "rule__Any__Group__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3187:1: rule__Any__Group__0 : rule__Any__Group__0__Impl rule__Any__Group__1 ;
    public final void rule__Any__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3191:1: ( rule__Any__Group__0__Impl rule__Any__Group__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3192:2: rule__Any__Group__0__Impl rule__Any__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Any__Group__0__Impl_in_rule__Any__Group__06355);
            rule__Any__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Any__Group__1_in_rule__Any__Group__06358);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3199:1: rule__Any__Group__0__Impl : ( () ) ;
    public final void rule__Any__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3203:1: ( ( () ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3204:1: ( () )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3204:1: ( () )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3205:1: ()
            {
             before(grammarAccess.getAnyAccess().getAnyAction_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3206:1: ()
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3208:1: 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3218:1: rule__Any__Group__1 : rule__Any__Group__1__Impl rule__Any__Group__2 ;
    public final void rule__Any__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3222:1: ( rule__Any__Group__1__Impl rule__Any__Group__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3223:2: rule__Any__Group__1__Impl rule__Any__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Any__Group__1__Impl_in_rule__Any__Group__16416);
            rule__Any__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Any__Group__2_in_rule__Any__Group__16419);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3230:1: rule__Any__Group__1__Impl : ( 'Any' ) ;
    public final void rule__Any__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3234:1: ( ( 'Any' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3235:1: ( 'Any' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3235:1: ( 'Any' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3236:1: 'Any'
            {
             before(grammarAccess.getAnyAccess().getAnyKeyword_1()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__Any__Group__1__Impl6447); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3249:1: rule__Any__Group__2 : rule__Any__Group__2__Impl ;
    public final void rule__Any__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3253:1: ( rule__Any__Group__2__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3254:2: rule__Any__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Any__Group__2__Impl_in_rule__Any__Group__26478);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3260:1: rule__Any__Group__2__Impl : ( ( rule__Any__NameAssignment_2 ) ) ;
    public final void rule__Any__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3264:1: ( ( ( rule__Any__NameAssignment_2 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3265:1: ( ( rule__Any__NameAssignment_2 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3265:1: ( ( rule__Any__NameAssignment_2 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3266:1: ( rule__Any__NameAssignment_2 )
            {
             before(grammarAccess.getAnyAccess().getNameAssignment_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3267:1: ( rule__Any__NameAssignment_2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3267:2: rule__Any__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Any__NameAssignment_2_in_rule__Any__Group__2__Impl6505);
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


    // $ANTLR start "rule__Junction__Group__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3283:1: rule__Junction__Group__0 : rule__Junction__Group__0__Impl rule__Junction__Group__1 ;
    public final void rule__Junction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3287:1: ( rule__Junction__Group__0__Impl rule__Junction__Group__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3288:2: rule__Junction__Group__0__Impl rule__Junction__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Junction__Group__0__Impl_in_rule__Junction__Group__06541);
            rule__Junction__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Junction__Group__1_in_rule__Junction__Group__06544);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3295:1: rule__Junction__Group__0__Impl : ( () ) ;
    public final void rule__Junction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3299:1: ( ( () ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3300:1: ( () )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3300:1: ( () )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3301:1: ()
            {
             before(grammarAccess.getJunctionAccess().getJunctionAction_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3302:1: ()
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3304:1: 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3314:1: rule__Junction__Group__1 : rule__Junction__Group__1__Impl rule__Junction__Group__2 ;
    public final void rule__Junction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3318:1: ( rule__Junction__Group__1__Impl rule__Junction__Group__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3319:2: rule__Junction__Group__1__Impl rule__Junction__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Junction__Group__1__Impl_in_rule__Junction__Group__16602);
            rule__Junction__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Junction__Group__2_in_rule__Junction__Group__16605);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3326:1: rule__Junction__Group__1__Impl : ( 'Junction' ) ;
    public final void rule__Junction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3330:1: ( ( 'Junction' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3331:1: ( 'Junction' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3331:1: ( 'Junction' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3332:1: 'Junction'
            {
             before(grammarAccess.getJunctionAccess().getJunctionKeyword_1()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__Junction__Group__1__Impl6633); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3345:1: rule__Junction__Group__2 : rule__Junction__Group__2__Impl ;
    public final void rule__Junction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3349:1: ( rule__Junction__Group__2__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3350:2: rule__Junction__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Junction__Group__2__Impl_in_rule__Junction__Group__26664);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3356:1: rule__Junction__Group__2__Impl : ( ( rule__Junction__NameAssignment_2 ) ) ;
    public final void rule__Junction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3360:1: ( ( ( rule__Junction__NameAssignment_2 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3361:1: ( ( rule__Junction__NameAssignment_2 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3361:1: ( ( rule__Junction__NameAssignment_2 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3362:1: ( rule__Junction__NameAssignment_2 )
            {
             before(grammarAccess.getJunctionAccess().getNameAssignment_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3363:1: ( rule__Junction__NameAssignment_2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3363:2: rule__Junction__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Junction__NameAssignment_2_in_rule__Junction__Group__2__Impl6691);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3379:1: rule__Fork__Group__0 : rule__Fork__Group__0__Impl rule__Fork__Group__1 ;
    public final void rule__Fork__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3383:1: ( rule__Fork__Group__0__Impl rule__Fork__Group__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3384:2: rule__Fork__Group__0__Impl rule__Fork__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fork__Group__0__Impl_in_rule__Fork__Group__06727);
            rule__Fork__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fork__Group__1_in_rule__Fork__Group__06730);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3391:1: rule__Fork__Group__0__Impl : ( () ) ;
    public final void rule__Fork__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3395:1: ( ( () ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3396:1: ( () )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3396:1: ( () )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3397:1: ()
            {
             before(grammarAccess.getForkAccess().getForkAction_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3398:1: ()
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3400:1: 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3410:1: rule__Fork__Group__1 : rule__Fork__Group__1__Impl rule__Fork__Group__2 ;
    public final void rule__Fork__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3414:1: ( rule__Fork__Group__1__Impl rule__Fork__Group__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3415:2: rule__Fork__Group__1__Impl rule__Fork__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fork__Group__1__Impl_in_rule__Fork__Group__16788);
            rule__Fork__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fork__Group__2_in_rule__Fork__Group__16791);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3422:1: rule__Fork__Group__1__Impl : ( 'Fork' ) ;
    public final void rule__Fork__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3426:1: ( ( 'Fork' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3427:1: ( 'Fork' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3427:1: ( 'Fork' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3428:1: 'Fork'
            {
             before(grammarAccess.getForkAccess().getForkKeyword_1()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Fork__Group__1__Impl6819); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3441:1: rule__Fork__Group__2 : rule__Fork__Group__2__Impl ;
    public final void rule__Fork__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3445:1: ( rule__Fork__Group__2__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3446:2: rule__Fork__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fork__Group__2__Impl_in_rule__Fork__Group__26850);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3452:1: rule__Fork__Group__2__Impl : ( ( rule__Fork__NameAssignment_2 ) ) ;
    public final void rule__Fork__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3456:1: ( ( ( rule__Fork__NameAssignment_2 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3457:1: ( ( rule__Fork__NameAssignment_2 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3457:1: ( ( rule__Fork__NameAssignment_2 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3458:1: ( rule__Fork__NameAssignment_2 )
            {
             before(grammarAccess.getForkAccess().getNameAssignment_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3459:1: ( rule__Fork__NameAssignment_2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3459:2: rule__Fork__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fork__NameAssignment_2_in_rule__Fork__Group__2__Impl6877);
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


    // $ANTLR start "rule__Invariant__Group__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3475:1: rule__Invariant__Group__0 : rule__Invariant__Group__0__Impl rule__Invariant__Group__1 ;
    public final void rule__Invariant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3479:1: ( rule__Invariant__Group__0__Impl rule__Invariant__Group__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3480:2: rule__Invariant__Group__0__Impl rule__Invariant__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__0__Impl_in_rule__Invariant__Group__06913);
            rule__Invariant__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__1_in_rule__Invariant__Group__06916);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3487:1: rule__Invariant__Group__0__Impl : ( 'Invariant' ) ;
    public final void rule__Invariant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3491:1: ( ( 'Invariant' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3492:1: ( 'Invariant' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3492:1: ( 'Invariant' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3493:1: 'Invariant'
            {
             before(grammarAccess.getInvariantAccess().getInvariantKeyword_0()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__Invariant__Group__0__Impl6944); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3506:1: rule__Invariant__Group__1 : rule__Invariant__Group__1__Impl rule__Invariant__Group__2 ;
    public final void rule__Invariant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3510:1: ( rule__Invariant__Group__1__Impl rule__Invariant__Group__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3511:2: rule__Invariant__Group__1__Impl rule__Invariant__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__1__Impl_in_rule__Invariant__Group__16975);
            rule__Invariant__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__2_in_rule__Invariant__Group__16978);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3518:1: rule__Invariant__Group__1__Impl : ( '@' ) ;
    public final void rule__Invariant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3522:1: ( ( '@' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3523:1: ( '@' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3523:1: ( '@' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3524:1: '@'
            {
             before(grammarAccess.getInvariantAccess().getCommercialAtKeyword_1()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__Invariant__Group__1__Impl7006); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3537:1: rule__Invariant__Group__2 : rule__Invariant__Group__2__Impl rule__Invariant__Group__3 ;
    public final void rule__Invariant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3541:1: ( rule__Invariant__Group__2__Impl rule__Invariant__Group__3 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3542:2: rule__Invariant__Group__2__Impl rule__Invariant__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__2__Impl_in_rule__Invariant__Group__27037);
            rule__Invariant__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__3_in_rule__Invariant__Group__27040);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3549:1: rule__Invariant__Group__2__Impl : ( ( rule__Invariant__NameAssignment_2 ) ) ;
    public final void rule__Invariant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3553:1: ( ( ( rule__Invariant__NameAssignment_2 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3554:1: ( ( rule__Invariant__NameAssignment_2 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3554:1: ( ( rule__Invariant__NameAssignment_2 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3555:1: ( rule__Invariant__NameAssignment_2 )
            {
             before(grammarAccess.getInvariantAccess().getNameAssignment_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3556:1: ( rule__Invariant__NameAssignment_2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3556:2: rule__Invariant__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__NameAssignment_2_in_rule__Invariant__Group__2__Impl7067);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3566:1: rule__Invariant__Group__3 : rule__Invariant__Group__3__Impl rule__Invariant__Group__4 ;
    public final void rule__Invariant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3570:1: ( rule__Invariant__Group__3__Impl rule__Invariant__Group__4 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3571:2: rule__Invariant__Group__3__Impl rule__Invariant__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__3__Impl_in_rule__Invariant__Group__37097);
            rule__Invariant__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__4_in_rule__Invariant__Group__37100);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3578:1: rule__Invariant__Group__3__Impl : ( ( rule__Invariant__TheoremAssignment_3 )? ) ;
    public final void rule__Invariant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3582:1: ( ( ( rule__Invariant__TheoremAssignment_3 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3583:1: ( ( rule__Invariant__TheoremAssignment_3 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3583:1: ( ( rule__Invariant__TheoremAssignment_3 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3584:1: ( rule__Invariant__TheoremAssignment_3 )?
            {
             before(grammarAccess.getInvariantAccess().getTheoremAssignment_3()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3585:1: ( rule__Invariant__TheoremAssignment_3 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==45) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3585:2: rule__Invariant__TheoremAssignment_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Invariant__TheoremAssignment_3_in_rule__Invariant__Group__3__Impl7127);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3595:1: rule__Invariant__Group__4 : rule__Invariant__Group__4__Impl rule__Invariant__Group__5 ;
    public final void rule__Invariant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3599:1: ( rule__Invariant__Group__4__Impl rule__Invariant__Group__5 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3600:2: rule__Invariant__Group__4__Impl rule__Invariant__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__4__Impl_in_rule__Invariant__Group__47158);
            rule__Invariant__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__5_in_rule__Invariant__Group__47161);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3607:1: rule__Invariant__Group__4__Impl : ( ( rule__Invariant__PredicateAssignment_4 ) ) ;
    public final void rule__Invariant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3611:1: ( ( ( rule__Invariant__PredicateAssignment_4 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3612:1: ( ( rule__Invariant__PredicateAssignment_4 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3612:1: ( ( rule__Invariant__PredicateAssignment_4 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3613:1: ( rule__Invariant__PredicateAssignment_4 )
            {
             before(grammarAccess.getInvariantAccess().getPredicateAssignment_4()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3614:1: ( rule__Invariant__PredicateAssignment_4 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3614:2: rule__Invariant__PredicateAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__PredicateAssignment_4_in_rule__Invariant__Group__4__Impl7188);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3624:1: rule__Invariant__Group__5 : rule__Invariant__Group__5__Impl ;
    public final void rule__Invariant__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3628:1: ( rule__Invariant__Group__5__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3629:2: rule__Invariant__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__5__Impl_in_rule__Invariant__Group__57218);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3635:1: rule__Invariant__Group__5__Impl : ( ( rule__Invariant__Group_5__0 )? ) ;
    public final void rule__Invariant__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3639:1: ( ( ( rule__Invariant__Group_5__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3640:1: ( ( rule__Invariant__Group_5__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3640:1: ( ( rule__Invariant__Group_5__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3641:1: ( rule__Invariant__Group_5__0 )?
            {
             before(grammarAccess.getInvariantAccess().getGroup_5()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3642:1: ( rule__Invariant__Group_5__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==16) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3642:2: rule__Invariant__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group_5__0_in_rule__Invariant__Group__5__Impl7245);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3664:1: rule__Invariant__Group_5__0 : rule__Invariant__Group_5__0__Impl rule__Invariant__Group_5__1 ;
    public final void rule__Invariant__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3668:1: ( rule__Invariant__Group_5__0__Impl rule__Invariant__Group_5__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3669:2: rule__Invariant__Group_5__0__Impl rule__Invariant__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group_5__0__Impl_in_rule__Invariant__Group_5__07288);
            rule__Invariant__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group_5__1_in_rule__Invariant__Group_5__07291);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3676:1: rule__Invariant__Group_5__0__Impl : ( '>' ) ;
    public final void rule__Invariant__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3680:1: ( ( '>' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3681:1: ( '>' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3681:1: ( '>' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3682:1: '>'
            {
             before(grammarAccess.getInvariantAccess().getGreaterThanSignKeyword_5_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Invariant__Group_5__0__Impl7319); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3695:1: rule__Invariant__Group_5__1 : rule__Invariant__Group_5__1__Impl ;
    public final void rule__Invariant__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3699:1: ( rule__Invariant__Group_5__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3700:2: rule__Invariant__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group_5__1__Impl_in_rule__Invariant__Group_5__17350);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3706:1: rule__Invariant__Group_5__1__Impl : ( ( rule__Invariant__CommentAssignment_5_1 ) ) ;
    public final void rule__Invariant__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3710:1: ( ( ( rule__Invariant__CommentAssignment_5_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3711:1: ( ( rule__Invariant__CommentAssignment_5_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3711:1: ( ( rule__Invariant__CommentAssignment_5_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3712:1: ( rule__Invariant__CommentAssignment_5_1 )
            {
             before(grammarAccess.getInvariantAccess().getCommentAssignment_5_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3713:1: ( rule__Invariant__CommentAssignment_5_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3713:2: rule__Invariant__CommentAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__CommentAssignment_5_1_in_rule__Invariant__Group_5__1__Impl7377);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3727:1: rule__TypedParameter__Group__0 : rule__TypedParameter__Group__0__Impl rule__TypedParameter__Group__1 ;
    public final void rule__TypedParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3731:1: ( rule__TypedParameter__Group__0__Impl rule__TypedParameter__Group__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3732:2: rule__TypedParameter__Group__0__Impl rule__TypedParameter__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedParameter__Group__0__Impl_in_rule__TypedParameter__Group__07411);
            rule__TypedParameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TypedParameter__Group__1_in_rule__TypedParameter__Group__07414);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3739:1: rule__TypedParameter__Group__0__Impl : ( 'TypedParameter' ) ;
    public final void rule__TypedParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3743:1: ( ( 'TypedParameter' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3744:1: ( 'TypedParameter' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3744:1: ( 'TypedParameter' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3745:1: 'TypedParameter'
            {
             before(grammarAccess.getTypedParameterAccess().getTypedParameterKeyword_0()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__TypedParameter__Group__0__Impl7442); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3758:1: rule__TypedParameter__Group__1 : rule__TypedParameter__Group__1__Impl rule__TypedParameter__Group__2 ;
    public final void rule__TypedParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3762:1: ( rule__TypedParameter__Group__1__Impl rule__TypedParameter__Group__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3763:2: rule__TypedParameter__Group__1__Impl rule__TypedParameter__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedParameter__Group__1__Impl_in_rule__TypedParameter__Group__17473);
            rule__TypedParameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TypedParameter__Group__2_in_rule__TypedParameter__Group__17476);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3770:1: rule__TypedParameter__Group__1__Impl : ( ( rule__TypedParameter__NameAssignment_1 ) ) ;
    public final void rule__TypedParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3774:1: ( ( ( rule__TypedParameter__NameAssignment_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3775:1: ( ( rule__TypedParameter__NameAssignment_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3775:1: ( ( rule__TypedParameter__NameAssignment_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3776:1: ( rule__TypedParameter__NameAssignment_1 )
            {
             before(grammarAccess.getTypedParameterAccess().getNameAssignment_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3777:1: ( rule__TypedParameter__NameAssignment_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3777:2: rule__TypedParameter__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedParameter__NameAssignment_1_in_rule__TypedParameter__Group__1__Impl7503);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3787:1: rule__TypedParameter__Group__2 : rule__TypedParameter__Group__2__Impl rule__TypedParameter__Group__3 ;
    public final void rule__TypedParameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3791:1: ( rule__TypedParameter__Group__2__Impl rule__TypedParameter__Group__3 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3792:2: rule__TypedParameter__Group__2__Impl rule__TypedParameter__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedParameter__Group__2__Impl_in_rule__TypedParameter__Group__27533);
            rule__TypedParameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TypedParameter__Group__3_in_rule__TypedParameter__Group__27536);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3799:1: rule__TypedParameter__Group__2__Impl : ( 'type' ) ;
    public final void rule__TypedParameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3803:1: ( ( 'type' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3804:1: ( 'type' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3804:1: ( 'type' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3805:1: 'type'
            {
             before(grammarAccess.getTypedParameterAccess().getTypeKeyword_2()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__TypedParameter__Group__2__Impl7564); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3818:1: rule__TypedParameter__Group__3 : rule__TypedParameter__Group__3__Impl rule__TypedParameter__Group__4 ;
    public final void rule__TypedParameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3822:1: ( rule__TypedParameter__Group__3__Impl rule__TypedParameter__Group__4 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3823:2: rule__TypedParameter__Group__3__Impl rule__TypedParameter__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedParameter__Group__3__Impl_in_rule__TypedParameter__Group__37595);
            rule__TypedParameter__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TypedParameter__Group__4_in_rule__TypedParameter__Group__37598);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3830:1: rule__TypedParameter__Group__3__Impl : ( ( rule__TypedParameter__TypeAssignment_3 ) ) ;
    public final void rule__TypedParameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3834:1: ( ( ( rule__TypedParameter__TypeAssignment_3 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3835:1: ( ( rule__TypedParameter__TypeAssignment_3 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3835:1: ( ( rule__TypedParameter__TypeAssignment_3 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3836:1: ( rule__TypedParameter__TypeAssignment_3 )
            {
             before(grammarAccess.getTypedParameterAccess().getTypeAssignment_3()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3837:1: ( rule__TypedParameter__TypeAssignment_3 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3837:2: rule__TypedParameter__TypeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedParameter__TypeAssignment_3_in_rule__TypedParameter__Group__3__Impl7625);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3847:1: rule__TypedParameter__Group__4 : rule__TypedParameter__Group__4__Impl ;
    public final void rule__TypedParameter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3851:1: ( rule__TypedParameter__Group__4__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3852:2: rule__TypedParameter__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedParameter__Group__4__Impl_in_rule__TypedParameter__Group__47655);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3858:1: rule__TypedParameter__Group__4__Impl : ( ( rule__TypedParameter__Group_4__0 )? ) ;
    public final void rule__TypedParameter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3862:1: ( ( ( rule__TypedParameter__Group_4__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3863:1: ( ( rule__TypedParameter__Group_4__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3863:1: ( ( rule__TypedParameter__Group_4__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3864:1: ( rule__TypedParameter__Group_4__0 )?
            {
             before(grammarAccess.getTypedParameterAccess().getGroup_4()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3865:1: ( rule__TypedParameter__Group_4__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==16) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3865:2: rule__TypedParameter__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TypedParameter__Group_4__0_in_rule__TypedParameter__Group__4__Impl7682);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3885:1: rule__TypedParameter__Group_4__0 : rule__TypedParameter__Group_4__0__Impl rule__TypedParameter__Group_4__1 ;
    public final void rule__TypedParameter__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3889:1: ( rule__TypedParameter__Group_4__0__Impl rule__TypedParameter__Group_4__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3890:2: rule__TypedParameter__Group_4__0__Impl rule__TypedParameter__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedParameter__Group_4__0__Impl_in_rule__TypedParameter__Group_4__07723);
            rule__TypedParameter__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TypedParameter__Group_4__1_in_rule__TypedParameter__Group_4__07726);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3897:1: rule__TypedParameter__Group_4__0__Impl : ( '>' ) ;
    public final void rule__TypedParameter__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3901:1: ( ( '>' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3902:1: ( '>' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3902:1: ( '>' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3903:1: '>'
            {
             before(grammarAccess.getTypedParameterAccess().getGreaterThanSignKeyword_4_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__TypedParameter__Group_4__0__Impl7754); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3916:1: rule__TypedParameter__Group_4__1 : rule__TypedParameter__Group_4__1__Impl ;
    public final void rule__TypedParameter__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3920:1: ( rule__TypedParameter__Group_4__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3921:2: rule__TypedParameter__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedParameter__Group_4__1__Impl_in_rule__TypedParameter__Group_4__17785);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3927:1: rule__TypedParameter__Group_4__1__Impl : ( ( rule__TypedParameter__CommentAssignment_4_1 ) ) ;
    public final void rule__TypedParameter__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3931:1: ( ( ( rule__TypedParameter__CommentAssignment_4_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3932:1: ( ( rule__TypedParameter__CommentAssignment_4_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3932:1: ( ( rule__TypedParameter__CommentAssignment_4_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3933:1: ( rule__TypedParameter__CommentAssignment_4_1 )
            {
             before(grammarAccess.getTypedParameterAccess().getCommentAssignment_4_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3934:1: ( rule__TypedParameter__CommentAssignment_4_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3934:2: rule__TypedParameter__CommentAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedParameter__CommentAssignment_4_1_in_rule__TypedParameter__Group_4__1__Impl7812);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3948:1: rule__Guard__Group__0 : rule__Guard__Group__0__Impl rule__Guard__Group__1 ;
    public final void rule__Guard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3952:1: ( rule__Guard__Group__0__Impl rule__Guard__Group__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3953:2: rule__Guard__Group__0__Impl rule__Guard__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group__0__Impl_in_rule__Guard__Group__07846);
            rule__Guard__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group__1_in_rule__Guard__Group__07849);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3960:1: rule__Guard__Group__0__Impl : ( ( rule__Guard__TheoremAssignment_0 )? ) ;
    public final void rule__Guard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3964:1: ( ( ( rule__Guard__TheoremAssignment_0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3965:1: ( ( rule__Guard__TheoremAssignment_0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3965:1: ( ( rule__Guard__TheoremAssignment_0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3966:1: ( rule__Guard__TheoremAssignment_0 )?
            {
             before(grammarAccess.getGuardAccess().getTheoremAssignment_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3967:1: ( rule__Guard__TheoremAssignment_0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==45) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3967:2: rule__Guard__TheoremAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Guard__TheoremAssignment_0_in_rule__Guard__Group__0__Impl7876);
                    rule__Guard__TheoremAssignment_0();

                    state._fsp--;


                    }
                    break;

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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3977:1: rule__Guard__Group__1 : rule__Guard__Group__1__Impl rule__Guard__Group__2 ;
    public final void rule__Guard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3981:1: ( rule__Guard__Group__1__Impl rule__Guard__Group__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3982:2: rule__Guard__Group__1__Impl rule__Guard__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group__1__Impl_in_rule__Guard__Group__17907);
            rule__Guard__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group__2_in_rule__Guard__Group__17910);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3989:1: rule__Guard__Group__1__Impl : ( '@' ) ;
    public final void rule__Guard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3993:1: ( ( '@' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3994:1: ( '@' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3994:1: ( '@' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:3995:1: '@'
            {
             before(grammarAccess.getGuardAccess().getCommercialAtKeyword_1()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__Guard__Group__1__Impl7938); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4008:1: rule__Guard__Group__2 : rule__Guard__Group__2__Impl rule__Guard__Group__3 ;
    public final void rule__Guard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4012:1: ( rule__Guard__Group__2__Impl rule__Guard__Group__3 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4013:2: rule__Guard__Group__2__Impl rule__Guard__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group__2__Impl_in_rule__Guard__Group__27969);
            rule__Guard__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group__3_in_rule__Guard__Group__27972);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4020:1: rule__Guard__Group__2__Impl : ( ( rule__Guard__NameAssignment_2 ) ) ;
    public final void rule__Guard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4024:1: ( ( ( rule__Guard__NameAssignment_2 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4025:1: ( ( rule__Guard__NameAssignment_2 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4025:1: ( ( rule__Guard__NameAssignment_2 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4026:1: ( rule__Guard__NameAssignment_2 )
            {
             before(grammarAccess.getGuardAccess().getNameAssignment_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4027:1: ( rule__Guard__NameAssignment_2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4027:2: rule__Guard__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Guard__NameAssignment_2_in_rule__Guard__Group__2__Impl7999);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4037:1: rule__Guard__Group__3 : rule__Guard__Group__3__Impl rule__Guard__Group__4 ;
    public final void rule__Guard__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4041:1: ( rule__Guard__Group__3__Impl rule__Guard__Group__4 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4042:2: rule__Guard__Group__3__Impl rule__Guard__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group__3__Impl_in_rule__Guard__Group__38029);
            rule__Guard__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group__4_in_rule__Guard__Group__38032);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4049:1: rule__Guard__Group__3__Impl : ( ( rule__Guard__PredicateAssignment_3 ) ) ;
    public final void rule__Guard__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4053:1: ( ( ( rule__Guard__PredicateAssignment_3 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4054:1: ( ( rule__Guard__PredicateAssignment_3 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4054:1: ( ( rule__Guard__PredicateAssignment_3 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4055:1: ( rule__Guard__PredicateAssignment_3 )
            {
             before(grammarAccess.getGuardAccess().getPredicateAssignment_3()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4056:1: ( rule__Guard__PredicateAssignment_3 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4056:2: rule__Guard__PredicateAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Guard__PredicateAssignment_3_in_rule__Guard__Group__3__Impl8059);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4066:1: rule__Guard__Group__4 : rule__Guard__Group__4__Impl ;
    public final void rule__Guard__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4070:1: ( rule__Guard__Group__4__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4071:2: rule__Guard__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group__4__Impl_in_rule__Guard__Group__48089);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4077:1: rule__Guard__Group__4__Impl : ( ( rule__Guard__Group_4__0 )? ) ;
    public final void rule__Guard__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4081:1: ( ( ( rule__Guard__Group_4__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4082:1: ( ( rule__Guard__Group_4__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4082:1: ( ( rule__Guard__Group_4__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4083:1: ( rule__Guard__Group_4__0 )?
            {
             before(grammarAccess.getGuardAccess().getGroup_4()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4084:1: ( rule__Guard__Group_4__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==16) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4084:2: rule__Guard__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Guard__Group_4__0_in_rule__Guard__Group__4__Impl8116);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4104:1: rule__Guard__Group_4__0 : rule__Guard__Group_4__0__Impl rule__Guard__Group_4__1 ;
    public final void rule__Guard__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4108:1: ( rule__Guard__Group_4__0__Impl rule__Guard__Group_4__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4109:2: rule__Guard__Group_4__0__Impl rule__Guard__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group_4__0__Impl_in_rule__Guard__Group_4__08157);
            rule__Guard__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group_4__1_in_rule__Guard__Group_4__08160);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4116:1: rule__Guard__Group_4__0__Impl : ( '>' ) ;
    public final void rule__Guard__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4120:1: ( ( '>' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4121:1: ( '>' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4121:1: ( '>' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4122:1: '>'
            {
             before(grammarAccess.getGuardAccess().getGreaterThanSignKeyword_4_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Guard__Group_4__0__Impl8188); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4135:1: rule__Guard__Group_4__1 : rule__Guard__Group_4__1__Impl ;
    public final void rule__Guard__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4139:1: ( rule__Guard__Group_4__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4140:2: rule__Guard__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group_4__1__Impl_in_rule__Guard__Group_4__18219);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4146:1: rule__Guard__Group_4__1__Impl : ( ( rule__Guard__CommentAssignment_4_1 ) ) ;
    public final void rule__Guard__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4150:1: ( ( ( rule__Guard__CommentAssignment_4_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4151:1: ( ( rule__Guard__CommentAssignment_4_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4151:1: ( ( rule__Guard__CommentAssignment_4_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4152:1: ( rule__Guard__CommentAssignment_4_1 )
            {
             before(grammarAccess.getGuardAccess().getCommentAssignment_4_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4153:1: ( rule__Guard__CommentAssignment_4_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4153:2: rule__Guard__CommentAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Guard__CommentAssignment_4_1_in_rule__Guard__Group_4__1__Impl8246);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4167:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4171:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4172:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__0__Impl_in_rule__Action__Group__08280);
            rule__Action__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__1_in_rule__Action__Group__08283);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4179:1: rule__Action__Group__0__Impl : ( '@' ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4183:1: ( ( '@' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4184:1: ( '@' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4184:1: ( '@' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4185:1: '@'
            {
             before(grammarAccess.getActionAccess().getCommercialAtKeyword_0()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__Action__Group__0__Impl8311); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4198:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4202:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4203:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__1__Impl_in_rule__Action__Group__18342);
            rule__Action__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__2_in_rule__Action__Group__18345);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4210:1: rule__Action__Group__1__Impl : ( ( rule__Action__NameAssignment_1 ) ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4214:1: ( ( ( rule__Action__NameAssignment_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4215:1: ( ( rule__Action__NameAssignment_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4215:1: ( ( rule__Action__NameAssignment_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4216:1: ( rule__Action__NameAssignment_1 )
            {
             before(grammarAccess.getActionAccess().getNameAssignment_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4217:1: ( rule__Action__NameAssignment_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4217:2: rule__Action__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__NameAssignment_1_in_rule__Action__Group__1__Impl8372);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4227:1: rule__Action__Group__2 : rule__Action__Group__2__Impl rule__Action__Group__3 ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4231:1: ( rule__Action__Group__2__Impl rule__Action__Group__3 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4232:2: rule__Action__Group__2__Impl rule__Action__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__2__Impl_in_rule__Action__Group__28402);
            rule__Action__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__3_in_rule__Action__Group__28405);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4239:1: rule__Action__Group__2__Impl : ( ( rule__Action__ActionAssignment_2 ) ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4243:1: ( ( ( rule__Action__ActionAssignment_2 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4244:1: ( ( rule__Action__ActionAssignment_2 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4244:1: ( ( rule__Action__ActionAssignment_2 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4245:1: ( rule__Action__ActionAssignment_2 )
            {
             before(grammarAccess.getActionAccess().getActionAssignment_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4246:1: ( rule__Action__ActionAssignment_2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4246:2: rule__Action__ActionAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__ActionAssignment_2_in_rule__Action__Group__2__Impl8432);
            rule__Action__ActionAssignment_2();

            state._fsp--;


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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4256:1: rule__Action__Group__3 : rule__Action__Group__3__Impl ;
    public final void rule__Action__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4260:1: ( rule__Action__Group__3__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4261:2: rule__Action__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__3__Impl_in_rule__Action__Group__38462);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4267:1: rule__Action__Group__3__Impl : ( ( rule__Action__Group_3__0 )? ) ;
    public final void rule__Action__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4271:1: ( ( ( rule__Action__Group_3__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4272:1: ( ( rule__Action__Group_3__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4272:1: ( ( rule__Action__Group_3__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4273:1: ( rule__Action__Group_3__0 )?
            {
             before(grammarAccess.getActionAccess().getGroup_3()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4274:1: ( rule__Action__Group_3__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==16) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4274:2: rule__Action__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Action__Group_3__0_in_rule__Action__Group__3__Impl8489);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4292:1: rule__Action__Group_3__0 : rule__Action__Group_3__0__Impl rule__Action__Group_3__1 ;
    public final void rule__Action__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4296:1: ( rule__Action__Group_3__0__Impl rule__Action__Group_3__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4297:2: rule__Action__Group_3__0__Impl rule__Action__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__Group_3__0__Impl_in_rule__Action__Group_3__08528);
            rule__Action__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Action__Group_3__1_in_rule__Action__Group_3__08531);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4304:1: rule__Action__Group_3__0__Impl : ( '>' ) ;
    public final void rule__Action__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4308:1: ( ( '>' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4309:1: ( '>' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4309:1: ( '>' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4310:1: '>'
            {
             before(grammarAccess.getActionAccess().getGreaterThanSignKeyword_3_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Action__Group_3__0__Impl8559); 
             after(grammarAccess.getActionAccess().getGreaterThanSignKeyword_3_0()); 

            }


            }

        }
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4323:1: rule__Action__Group_3__1 : rule__Action__Group_3__1__Impl ;
    public final void rule__Action__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4327:1: ( rule__Action__Group_3__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4328:2: rule__Action__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__Group_3__1__Impl_in_rule__Action__Group_3__18590);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4334:1: rule__Action__Group_3__1__Impl : ( ( rule__Action__CommentAssignment_3_1 ) ) ;
    public final void rule__Action__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4338:1: ( ( ( rule__Action__CommentAssignment_3_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4339:1: ( ( rule__Action__CommentAssignment_3_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4339:1: ( ( rule__Action__CommentAssignment_3_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4340:1: ( rule__Action__CommentAssignment_3_1 )
            {
             before(grammarAccess.getActionAccess().getCommentAssignment_3_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4341:1: ( rule__Action__CommentAssignment_3_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4341:2: rule__Action__CommentAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__CommentAssignment_3_1_in_rule__Action__Group_3__1__Impl8617);
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


    // $ANTLR start "rule__Witness__Group__0"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4355:1: rule__Witness__Group__0 : rule__Witness__Group__0__Impl rule__Witness__Group__1 ;
    public final void rule__Witness__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4359:1: ( rule__Witness__Group__0__Impl rule__Witness__Group__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4360:2: rule__Witness__Group__0__Impl rule__Witness__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Witness__Group__0__Impl_in_rule__Witness__Group__08651);
            rule__Witness__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Witness__Group__1_in_rule__Witness__Group__08654);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4367:1: rule__Witness__Group__0__Impl : ( 'Witness' ) ;
    public final void rule__Witness__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4371:1: ( ( 'Witness' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4372:1: ( 'Witness' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4372:1: ( 'Witness' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4373:1: 'Witness'
            {
             before(grammarAccess.getWitnessAccess().getWitnessKeyword_0()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__Witness__Group__0__Impl8682); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4386:1: rule__Witness__Group__1 : rule__Witness__Group__1__Impl rule__Witness__Group__2 ;
    public final void rule__Witness__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4390:1: ( rule__Witness__Group__1__Impl rule__Witness__Group__2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4391:2: rule__Witness__Group__1__Impl rule__Witness__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Witness__Group__1__Impl_in_rule__Witness__Group__18713);
            rule__Witness__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Witness__Group__2_in_rule__Witness__Group__18716);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4398:1: rule__Witness__Group__1__Impl : ( '@' ) ;
    public final void rule__Witness__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4402:1: ( ( '@' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4403:1: ( '@' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4403:1: ( '@' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4404:1: '@'
            {
             before(grammarAccess.getWitnessAccess().getCommercialAtKeyword_1()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__Witness__Group__1__Impl8744); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4417:1: rule__Witness__Group__2 : rule__Witness__Group__2__Impl rule__Witness__Group__3 ;
    public final void rule__Witness__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4421:1: ( rule__Witness__Group__2__Impl rule__Witness__Group__3 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4422:2: rule__Witness__Group__2__Impl rule__Witness__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Witness__Group__2__Impl_in_rule__Witness__Group__28775);
            rule__Witness__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Witness__Group__3_in_rule__Witness__Group__28778);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4429:1: rule__Witness__Group__2__Impl : ( ( rule__Witness__NameAssignment_2 ) ) ;
    public final void rule__Witness__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4433:1: ( ( ( rule__Witness__NameAssignment_2 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4434:1: ( ( rule__Witness__NameAssignment_2 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4434:1: ( ( rule__Witness__NameAssignment_2 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4435:1: ( rule__Witness__NameAssignment_2 )
            {
             before(grammarAccess.getWitnessAccess().getNameAssignment_2()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4436:1: ( rule__Witness__NameAssignment_2 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4436:2: rule__Witness__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Witness__NameAssignment_2_in_rule__Witness__Group__2__Impl8805);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4446:1: rule__Witness__Group__3 : rule__Witness__Group__3__Impl rule__Witness__Group__4 ;
    public final void rule__Witness__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4450:1: ( rule__Witness__Group__3__Impl rule__Witness__Group__4 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4451:2: rule__Witness__Group__3__Impl rule__Witness__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Witness__Group__3__Impl_in_rule__Witness__Group__38835);
            rule__Witness__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Witness__Group__4_in_rule__Witness__Group__38838);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4458:1: rule__Witness__Group__3__Impl : ( ( rule__Witness__PredicateAssignment_3 ) ) ;
    public final void rule__Witness__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4462:1: ( ( ( rule__Witness__PredicateAssignment_3 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4463:1: ( ( rule__Witness__PredicateAssignment_3 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4463:1: ( ( rule__Witness__PredicateAssignment_3 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4464:1: ( rule__Witness__PredicateAssignment_3 )
            {
             before(grammarAccess.getWitnessAccess().getPredicateAssignment_3()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4465:1: ( rule__Witness__PredicateAssignment_3 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4465:2: rule__Witness__PredicateAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Witness__PredicateAssignment_3_in_rule__Witness__Group__3__Impl8865);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4475:1: rule__Witness__Group__4 : rule__Witness__Group__4__Impl ;
    public final void rule__Witness__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4479:1: ( rule__Witness__Group__4__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4480:2: rule__Witness__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Witness__Group__4__Impl_in_rule__Witness__Group__48895);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4486:1: rule__Witness__Group__4__Impl : ( ( rule__Witness__Group_4__0 )? ) ;
    public final void rule__Witness__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4490:1: ( ( ( rule__Witness__Group_4__0 )? ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4491:1: ( ( rule__Witness__Group_4__0 )? )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4491:1: ( ( rule__Witness__Group_4__0 )? )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4492:1: ( rule__Witness__Group_4__0 )?
            {
             before(grammarAccess.getWitnessAccess().getGroup_4()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4493:1: ( rule__Witness__Group_4__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==16) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4493:2: rule__Witness__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Witness__Group_4__0_in_rule__Witness__Group__4__Impl8922);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4513:1: rule__Witness__Group_4__0 : rule__Witness__Group_4__0__Impl rule__Witness__Group_4__1 ;
    public final void rule__Witness__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4517:1: ( rule__Witness__Group_4__0__Impl rule__Witness__Group_4__1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4518:2: rule__Witness__Group_4__0__Impl rule__Witness__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Witness__Group_4__0__Impl_in_rule__Witness__Group_4__08963);
            rule__Witness__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Witness__Group_4__1_in_rule__Witness__Group_4__08966);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4525:1: rule__Witness__Group_4__0__Impl : ( '>' ) ;
    public final void rule__Witness__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4529:1: ( ( '>' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4530:1: ( '>' )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4530:1: ( '>' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4531:1: '>'
            {
             before(grammarAccess.getWitnessAccess().getGreaterThanSignKeyword_4_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Witness__Group_4__0__Impl8994); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4544:1: rule__Witness__Group_4__1 : rule__Witness__Group_4__1__Impl ;
    public final void rule__Witness__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4548:1: ( rule__Witness__Group_4__1__Impl )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4549:2: rule__Witness__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Witness__Group_4__1__Impl_in_rule__Witness__Group_4__19025);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4555:1: rule__Witness__Group_4__1__Impl : ( ( rule__Witness__CommentAssignment_4_1 ) ) ;
    public final void rule__Witness__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4559:1: ( ( ( rule__Witness__CommentAssignment_4_1 ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4560:1: ( ( rule__Witness__CommentAssignment_4_1 ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4560:1: ( ( rule__Witness__CommentAssignment_4_1 ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4561:1: ( rule__Witness__CommentAssignment_4_1 )
            {
             before(grammarAccess.getWitnessAccess().getCommentAssignment_4_1()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4562:1: ( rule__Witness__CommentAssignment_4_1 )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4562:2: rule__Witness__CommentAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Witness__CommentAssignment_4_1_in_rule__Witness__Group_4__1__Impl9052);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4577:1: rule__Statemachine__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Statemachine__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4581:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4582:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4582:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4583:1: ruleEString
            {
             before(grammarAccess.getStatemachineAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Statemachine__NameAssignment_19091);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4592:1: rule__Statemachine__CommentAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Statemachine__CommentAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4596:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4597:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4597:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4598:1: ruleEString
            {
             before(grammarAccess.getStatemachineAccess().getCommentEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Statemachine__CommentAssignment_2_19122);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4607:1: rule__Statemachine__TranslationAssignment_3_1 : ( ruleTranslationKind ) ;
    public final void rule__Statemachine__TranslationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4611:1: ( ( ruleTranslationKind ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4612:1: ( ruleTranslationKind )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4612:1: ( ruleTranslationKind )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4613:1: ruleTranslationKind
            {
             before(grammarAccess.getStatemachineAccess().getTranslationTranslationKindEnumRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTranslationKind_in_rule__Statemachine__TranslationAssignment_3_19153);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4622:1: rule__Statemachine__ElaboratesAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Statemachine__ElaboratesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4626:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4627:1: ( ( ruleEString ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4627:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4628:1: ( ruleEString )
            {
             before(grammarAccess.getStatemachineAccess().getElaboratesEventBNamedCrossReference_4_1_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4629:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4630:1: ruleEString
            {
             before(grammarAccess.getStatemachineAccess().getElaboratesEventBNamedEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Statemachine__ElaboratesAssignment_4_19188);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4641:1: rule__Statemachine__RefinesAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__Statemachine__RefinesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4645:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4646:1: ( ( ruleEString ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4646:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4647:1: ( ruleEString )
            {
             before(grammarAccess.getStatemachineAccess().getRefinesStatemachineCrossReference_5_1_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4648:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4649:1: ruleEString
            {
             before(grammarAccess.getStatemachineAccess().getRefinesStatemachineEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Statemachine__RefinesAssignment_5_19227);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4660:1: rule__Statemachine__NodesAssignment_6_1 : ( ruleAbstractNode ) ;
    public final void rule__Statemachine__NodesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4664:1: ( ( ruleAbstractNode ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4665:1: ( ruleAbstractNode )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4665:1: ( ruleAbstractNode )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4666:1: ruleAbstractNode
            {
             before(grammarAccess.getStatemachineAccess().getNodesAbstractNodeParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractNode_in_rule__Statemachine__NodesAssignment_6_19262);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4675:1: rule__Statemachine__NodesAssignment_6_2_1 : ( ruleAbstractNode ) ;
    public final void rule__Statemachine__NodesAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4679:1: ( ( ruleAbstractNode ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4680:1: ( ruleAbstractNode )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4680:1: ( ruleAbstractNode )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4681:1: ruleAbstractNode
            {
             before(grammarAccess.getStatemachineAccess().getNodesAbstractNodeParserRuleCall_6_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractNode_in_rule__Statemachine__NodesAssignment_6_2_19293);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4690:1: rule__Statemachine__TransitionsAssignment_7_1 : ( ruleTransition ) ;
    public final void rule__Statemachine__TransitionsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4694:1: ( ( ruleTransition ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4695:1: ( ruleTransition )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4695:1: ( ruleTransition )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4696:1: ruleTransition
            {
             before(grammarAccess.getStatemachineAccess().getTransitionsTransitionParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransition_in_rule__Statemachine__TransitionsAssignment_7_19324);
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


    // $ANTLR start "rule__Statemachine__TransitionsAssignment_7_2"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4705:1: rule__Statemachine__TransitionsAssignment_7_2 : ( ruleTransition ) ;
    public final void rule__Statemachine__TransitionsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4709:1: ( ( ruleTransition ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4710:1: ( ruleTransition )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4710:1: ( ruleTransition )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4711:1: ruleTransition
            {
             before(grammarAccess.getStatemachineAccess().getTransitionsTransitionParserRuleCall_7_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransition_in_rule__Statemachine__TransitionsAssignment_7_29355);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getStatemachineAccess().getTransitionsTransitionParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__TransitionsAssignment_7_2"


    // $ANTLR start "rule__Transition__ExtendedAssignment_1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4720:1: rule__Transition__ExtendedAssignment_1 : ( ( 'extended' ) ) ;
    public final void rule__Transition__ExtendedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4724:1: ( ( ( 'extended' ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4725:1: ( ( 'extended' ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4725:1: ( ( 'extended' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4726:1: ( 'extended' )
            {
             before(grammarAccess.getTransitionAccess().getExtendedExtendedKeyword_1_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4727:1: ( 'extended' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4728:1: 'extended'
            {
             before(grammarAccess.getTransitionAccess().getExtendedExtendedKeyword_1_0()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__Transition__ExtendedAssignment_19391); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4743:1: rule__Transition__CommentAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Transition__CommentAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4747:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4748:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4748:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4749:1: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getCommentEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Transition__CommentAssignment_3_19430);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4758:1: rule__Transition__ElaboratesAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Transition__ElaboratesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4762:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4763:1: ( ( ruleEString ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4763:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4764:1: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getElaboratesEventCrossReference_4_1_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4765:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4766:1: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getElaboratesEventEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Transition__ElaboratesAssignment_4_19465);
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


    // $ANTLR start "rule__Transition__ElaboratesAssignment_4_2"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4777:1: rule__Transition__ElaboratesAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__Transition__ElaboratesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4781:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4782:1: ( ( ruleEString ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4782:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4783:1: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getElaboratesEventCrossReference_4_2_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4784:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4785:1: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getElaboratesEventEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Transition__ElaboratesAssignment_4_29504);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getElaboratesEventEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getElaboratesEventCrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__ElaboratesAssignment_4_2"


    // $ANTLR start "rule__Transition__TargetAssignment_5_1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4796:1: rule__Transition__TargetAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__Transition__TargetAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4800:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4801:1: ( ( ruleEString ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4801:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4802:1: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getTargetAbstractNodeCrossReference_5_1_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4803:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4804:1: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getTargetAbstractNodeEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Transition__TargetAssignment_5_19543);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4815:1: rule__Transition__SourceAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__Transition__SourceAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4819:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4820:1: ( ( ruleEString ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4820:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4821:1: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getSourceAbstractNodeCrossReference_6_1_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4822:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4823:1: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getSourceAbstractNodeEStringParserRuleCall_6_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Transition__SourceAssignment_6_19582);
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


    // $ANTLR start "rule__Transition__GuardsAssignment_7_1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4834:1: rule__Transition__GuardsAssignment_7_1 : ( ruleGuard ) ;
    public final void rule__Transition__GuardsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4838:1: ( ( ruleGuard ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4839:1: ( ruleGuard )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4839:1: ( ruleGuard )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4840:1: ruleGuard
            {
             before(grammarAccess.getTransitionAccess().getGuardsGuardParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGuard_in_rule__Transition__GuardsAssignment_7_19617);
            ruleGuard();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getGuardsGuardParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__GuardsAssignment_7_1"


    // $ANTLR start "rule__Transition__GuardsAssignment_7_2"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4849:1: rule__Transition__GuardsAssignment_7_2 : ( ruleGuard ) ;
    public final void rule__Transition__GuardsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4853:1: ( ( ruleGuard ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4854:1: ( ruleGuard )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4854:1: ( ruleGuard )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4855:1: ruleGuard
            {
             before(grammarAccess.getTransitionAccess().getGuardsGuardParserRuleCall_7_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGuard_in_rule__Transition__GuardsAssignment_7_29648);
            ruleGuard();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getGuardsGuardParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__GuardsAssignment_7_2"


    // $ANTLR start "rule__Transition__ParametersAssignment_8_1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4864:1: rule__Transition__ParametersAssignment_8_1 : ( ruleTypedParameter ) ;
    public final void rule__Transition__ParametersAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4868:1: ( ( ruleTypedParameter ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4869:1: ( ruleTypedParameter )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4869:1: ( ruleTypedParameter )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4870:1: ruleTypedParameter
            {
             before(grammarAccess.getTransitionAccess().getParametersTypedParameterParserRuleCall_8_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTypedParameter_in_rule__Transition__ParametersAssignment_8_19679);
            ruleTypedParameter();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getParametersTypedParameterParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__ParametersAssignment_8_1"


    // $ANTLR start "rule__Transition__ParametersAssignment_8_2"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4879:1: rule__Transition__ParametersAssignment_8_2 : ( ruleTypedParameter ) ;
    public final void rule__Transition__ParametersAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4883:1: ( ( ruleTypedParameter ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4884:1: ( ruleTypedParameter )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4884:1: ( ruleTypedParameter )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4885:1: ruleTypedParameter
            {
             before(grammarAccess.getTransitionAccess().getParametersTypedParameterParserRuleCall_8_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTypedParameter_in_rule__Transition__ParametersAssignment_8_29710);
            ruleTypedParameter();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getParametersTypedParameterParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__ParametersAssignment_8_2"


    // $ANTLR start "rule__Transition__GuardsAssignment_8_4"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4894:1: rule__Transition__GuardsAssignment_8_4 : ( ruleGuard ) ;
    public final void rule__Transition__GuardsAssignment_8_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4898:1: ( ( ruleGuard ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4899:1: ( ruleGuard )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4899:1: ( ruleGuard )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4900:1: ruleGuard
            {
             before(grammarAccess.getTransitionAccess().getGuardsGuardParserRuleCall_8_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGuard_in_rule__Transition__GuardsAssignment_8_49741);
            ruleGuard();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getGuardsGuardParserRuleCall_8_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__GuardsAssignment_8_4"


    // $ANTLR start "rule__Transition__GuardsAssignment_8_5"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4909:1: rule__Transition__GuardsAssignment_8_5 : ( ruleGuard ) ;
    public final void rule__Transition__GuardsAssignment_8_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4913:1: ( ( ruleGuard ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4914:1: ( ruleGuard )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4914:1: ( ruleGuard )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4915:1: ruleGuard
            {
             before(grammarAccess.getTransitionAccess().getGuardsGuardParserRuleCall_8_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGuard_in_rule__Transition__GuardsAssignment_8_59772);
            ruleGuard();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getGuardsGuardParserRuleCall_8_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__GuardsAssignment_8_5"


    // $ANTLR start "rule__Transition__WitnessesAssignment_9_1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4924:1: rule__Transition__WitnessesAssignment_9_1 : ( ruleWitness ) ;
    public final void rule__Transition__WitnessesAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4928:1: ( ( ruleWitness ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4929:1: ( ruleWitness )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4929:1: ( ruleWitness )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4930:1: ruleWitness
            {
             before(grammarAccess.getTransitionAccess().getWitnessesWitnessParserRuleCall_9_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleWitness_in_rule__Transition__WitnessesAssignment_9_19803);
            ruleWitness();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getWitnessesWitnessParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__WitnessesAssignment_9_1"


    // $ANTLR start "rule__Transition__WitnessesAssignment_9_2"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4939:1: rule__Transition__WitnessesAssignment_9_2 : ( ruleWitness ) ;
    public final void rule__Transition__WitnessesAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4943:1: ( ( ruleWitness ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4944:1: ( ruleWitness )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4944:1: ( ruleWitness )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4945:1: ruleWitness
            {
             before(grammarAccess.getTransitionAccess().getWitnessesWitnessParserRuleCall_9_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleWitness_in_rule__Transition__WitnessesAssignment_9_29834);
            ruleWitness();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getWitnessesWitnessParserRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__WitnessesAssignment_9_2"


    // $ANTLR start "rule__Transition__ActionsAssignment_10_1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4954:1: rule__Transition__ActionsAssignment_10_1 : ( ruleAction ) ;
    public final void rule__Transition__ActionsAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4958:1: ( ( ruleAction ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4959:1: ( ruleAction )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4959:1: ( ruleAction )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4960:1: ruleAction
            {
             before(grammarAccess.getTransitionAccess().getActionsActionParserRuleCall_10_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAction_in_rule__Transition__ActionsAssignment_10_19865);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getActionsActionParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__ActionsAssignment_10_1"


    // $ANTLR start "rule__Transition__ActionsAssignment_10_2"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4969:1: rule__Transition__ActionsAssignment_10_2 : ( ruleAction ) ;
    public final void rule__Transition__ActionsAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4973:1: ( ( ruleAction ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4974:1: ( ruleAction )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4974:1: ( ruleAction )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4975:1: ruleAction
            {
             before(grammarAccess.getTransitionAccess().getActionsActionParserRuleCall_10_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAction_in_rule__Transition__ActionsAssignment_10_29896);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getActionsActionParserRuleCall_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__ActionsAssignment_10_2"


    // $ANTLR start "rule__State__NameAssignment_2"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4984:1: rule__State__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__State__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4988:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4989:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4989:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4990:1: ruleEString
            {
             before(grammarAccess.getStateAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__State__NameAssignment_29927);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:4999:1: rule__State__RefinesAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__State__RefinesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5003:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5004:1: ( ( ruleEString ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5004:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5005:1: ( ruleEString )
            {
             before(grammarAccess.getStateAccess().getRefinesStateCrossReference_3_1_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5006:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5007:1: ruleEString
            {
             before(grammarAccess.getStateAccess().getRefinesStateEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__State__RefinesAssignment_3_19962);
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


    // $ANTLR start "rule__State__StatemachinesAssignment_4_1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5018:1: rule__State__StatemachinesAssignment_4_1 : ( ruleStatemachine ) ;
    public final void rule__State__StatemachinesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5022:1: ( ( ruleStatemachine ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5023:1: ( ruleStatemachine )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5023:1: ( ruleStatemachine )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5024:1: ruleStatemachine
            {
             before(grammarAccess.getStateAccess().getStatemachinesStatemachineParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleStatemachine_in_rule__State__StatemachinesAssignment_4_19997);
            ruleStatemachine();

            state._fsp--;

             after(grammarAccess.getStateAccess().getStatemachinesStatemachineParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__StatemachinesAssignment_4_1"


    // $ANTLR start "rule__State__StatemachinesAssignment_4_2"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5033:1: rule__State__StatemachinesAssignment_4_2 : ( ruleStatemachine ) ;
    public final void rule__State__StatemachinesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5037:1: ( ( ruleStatemachine ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5038:1: ( ruleStatemachine )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5038:1: ( ruleStatemachine )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5039:1: ruleStatemachine
            {
             before(grammarAccess.getStateAccess().getStatemachinesStatemachineParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleStatemachine_in_rule__State__StatemachinesAssignment_4_210028);
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


    // $ANTLR start "rule__State__InvariantsAssignment_5_1"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5048:1: rule__State__InvariantsAssignment_5_1 : ( ruleInvariant ) ;
    public final void rule__State__InvariantsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5052:1: ( ( ruleInvariant ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5053:1: ( ruleInvariant )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5053:1: ( ruleInvariant )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5054:1: ruleInvariant
            {
             before(grammarAccess.getStateAccess().getInvariantsInvariantParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInvariant_in_rule__State__InvariantsAssignment_5_110059);
            ruleInvariant();

            state._fsp--;

             after(grammarAccess.getStateAccess().getInvariantsInvariantParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__InvariantsAssignment_5_1"


    // $ANTLR start "rule__State__InvariantsAssignment_5_2"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5063:1: rule__State__InvariantsAssignment_5_2 : ( ruleInvariant ) ;
    public final void rule__State__InvariantsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5067:1: ( ( ruleInvariant ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5068:1: ( ruleInvariant )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5068:1: ( ruleInvariant )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5069:1: ruleInvariant
            {
             before(grammarAccess.getStateAccess().getInvariantsInvariantParserRuleCall_5_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInvariant_in_rule__State__InvariantsAssignment_5_210090);
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


    // $ANTLR start "rule__Initial__NameAssignment_2"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5078:1: rule__Initial__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Initial__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5082:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5083:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5083:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5084:1: ruleEString
            {
             before(grammarAccess.getInitialAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Initial__NameAssignment_210121);
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


    // $ANTLR start "rule__Final__NameAssignment_2"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5093:1: rule__Final__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Final__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5097:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5098:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5098:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5099:1: ruleEString
            {
             before(grammarAccess.getFinalAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Final__NameAssignment_210152);
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


    // $ANTLR start "rule__Any__NameAssignment_2"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5108:1: rule__Any__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Any__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5112:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5113:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5113:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5114:1: ruleEString
            {
             before(grammarAccess.getAnyAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Any__NameAssignment_210183);
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


    // $ANTLR start "rule__Junction__NameAssignment_2"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5123:1: rule__Junction__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Junction__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5127:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5128:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5128:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5129:1: ruleEString
            {
             before(grammarAccess.getJunctionAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Junction__NameAssignment_210214);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5138:1: rule__Fork__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Fork__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5142:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5143:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5143:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5144:1: ruleEString
            {
             before(grammarAccess.getForkAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Fork__NameAssignment_210245);
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


    // $ANTLR start "rule__Invariant__NameAssignment_2"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5153:1: rule__Invariant__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Invariant__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5157:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5158:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5158:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5159:1: ruleEString
            {
             before(grammarAccess.getInvariantAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Invariant__NameAssignment_210276);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5168:1: rule__Invariant__TheoremAssignment_3 : ( ( 'theorem' ) ) ;
    public final void rule__Invariant__TheoremAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5172:1: ( ( ( 'theorem' ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5173:1: ( ( 'theorem' ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5173:1: ( ( 'theorem' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5174:1: ( 'theorem' )
            {
             before(grammarAccess.getInvariantAccess().getTheoremTheoremKeyword_3_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5175:1: ( 'theorem' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5176:1: 'theorem'
            {
             before(grammarAccess.getInvariantAccess().getTheoremTheoremKeyword_3_0()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__Invariant__TheoremAssignment_310312); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5191:1: rule__Invariant__PredicateAssignment_4 : ( ruleEString ) ;
    public final void rule__Invariant__PredicateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5195:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5196:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5196:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5197:1: ruleEString
            {
             before(grammarAccess.getInvariantAccess().getPredicateEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Invariant__PredicateAssignment_410351);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5206:1: rule__Invariant__CommentAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Invariant__CommentAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5210:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5211:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5211:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5212:1: ruleEString
            {
             before(grammarAccess.getInvariantAccess().getCommentEStringParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Invariant__CommentAssignment_5_110382);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5221:1: rule__TypedParameter__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__TypedParameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5225:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5226:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5226:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5227:1: ruleEString
            {
             before(grammarAccess.getTypedParameterAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TypedParameter__NameAssignment_110413);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5236:1: rule__TypedParameter__TypeAssignment_3 : ( ruleEString ) ;
    public final void rule__TypedParameter__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5240:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5241:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5241:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5242:1: ruleEString
            {
             before(grammarAccess.getTypedParameterAccess().getTypeEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TypedParameter__TypeAssignment_310444);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5251:1: rule__TypedParameter__CommentAssignment_4_1 : ( ruleEString ) ;
    public final void rule__TypedParameter__CommentAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5255:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5256:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5256:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5257:1: ruleEString
            {
             before(grammarAccess.getTypedParameterAccess().getCommentEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TypedParameter__CommentAssignment_4_110475);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5266:1: rule__Guard__TheoremAssignment_0 : ( ( 'theorem' ) ) ;
    public final void rule__Guard__TheoremAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5270:1: ( ( ( 'theorem' ) ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5271:1: ( ( 'theorem' ) )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5271:1: ( ( 'theorem' ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5272:1: ( 'theorem' )
            {
             before(grammarAccess.getGuardAccess().getTheoremTheoremKeyword_0_0()); 
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5273:1: ( 'theorem' )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5274:1: 'theorem'
            {
             before(grammarAccess.getGuardAccess().getTheoremTheoremKeyword_0_0()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__Guard__TheoremAssignment_010511); 
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5289:1: rule__Guard__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Guard__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5293:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5294:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5294:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5295:1: ruleEString
            {
             before(grammarAccess.getGuardAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Guard__NameAssignment_210550);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5304:1: rule__Guard__PredicateAssignment_3 : ( ruleEString ) ;
    public final void rule__Guard__PredicateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5308:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5309:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5309:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5310:1: ruleEString
            {
             before(grammarAccess.getGuardAccess().getPredicateEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Guard__PredicateAssignment_310581);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5319:1: rule__Guard__CommentAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Guard__CommentAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5323:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5324:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5324:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5325:1: ruleEString
            {
             before(grammarAccess.getGuardAccess().getCommentEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Guard__CommentAssignment_4_110612);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5334:1: rule__Action__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Action__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5338:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5339:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5339:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5340:1: ruleEString
            {
             before(grammarAccess.getActionAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Action__NameAssignment_110643);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5349:1: rule__Action__ActionAssignment_2 : ( ruleEString ) ;
    public final void rule__Action__ActionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5353:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5354:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5354:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5355:1: ruleEString
            {
             before(grammarAccess.getActionAccess().getActionEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Action__ActionAssignment_210674);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5364:1: rule__Action__CommentAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Action__CommentAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5368:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5369:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5369:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5370:1: ruleEString
            {
             before(grammarAccess.getActionAccess().getCommentEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Action__CommentAssignment_3_110705);
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


    // $ANTLR start "rule__Witness__NameAssignment_2"
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5379:1: rule__Witness__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Witness__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5383:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5384:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5384:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5385:1: ruleEString
            {
             before(grammarAccess.getWitnessAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Witness__NameAssignment_210736);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5394:1: rule__Witness__PredicateAssignment_3 : ( ruleEString ) ;
    public final void rule__Witness__PredicateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5398:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5399:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5399:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5400:1: ruleEString
            {
             before(grammarAccess.getWitnessAccess().getPredicateEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Witness__PredicateAssignment_310767);
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
    // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5409:1: rule__Witness__CommentAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Witness__CommentAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5413:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5414:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5414:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl.ui/src-gen/ac/soton/uk/iumlb/xtext/ui/contentassist/antlr/internal/InternalDsl.g:5415:1: ruleEString
            {
             before(grammarAccess.getWitnessAccess().getCommentEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Witness__CommentAssignment_4_110798);
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
        public static final BitSet FOLLOW_rule__Statemachine__Group__1__Impl_in_rule__Statemachine__Group__11315 = new BitSet(new long[]{0x00000000005F8000L});
        public static final BitSet FOLLOW_rule__Statemachine__Group__2_in_rule__Statemachine__Group__11318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__NameAssignment_1_in_rule__Statemachine__Group__1__Impl1345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group__2__Impl_in_rule__Statemachine__Group__21375 = new BitSet(new long[]{0x00000000005F8000L});
        public static final BitSet FOLLOW_rule__Statemachine__Group__3_in_rule__Statemachine__Group__21378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_2__0_in_rule__Statemachine__Group__2__Impl1405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group__3__Impl_in_rule__Statemachine__Group__31436 = new BitSet(new long[]{0x00000000005F8000L});
        public static final BitSet FOLLOW_rule__Statemachine__Group__4_in_rule__Statemachine__Group__31439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_3__0_in_rule__Statemachine__Group__3__Impl1466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group__4__Impl_in_rule__Statemachine__Group__41497 = new BitSet(new long[]{0x00000000005F8000L});
        public static final BitSet FOLLOW_rule__Statemachine__Group__5_in_rule__Statemachine__Group__41500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_4__0_in_rule__Statemachine__Group__4__Impl1527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group__5__Impl_in_rule__Statemachine__Group__51558 = new BitSet(new long[]{0x00000000005F8000L});
        public static final BitSet FOLLOW_rule__Statemachine__Group__6_in_rule__Statemachine__Group__51561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_5__0_in_rule__Statemachine__Group__5__Impl1588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group__6__Impl_in_rule__Statemachine__Group__61619 = new BitSet(new long[]{0x00000000005F8000L});
        public static final BitSet FOLLOW_rule__Statemachine__Group__7_in_rule__Statemachine__Group__61622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_6__0_in_rule__Statemachine__Group__6__Impl1649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group__7__Impl_in_rule__Statemachine__Group__71680 = new BitSet(new long[]{0x00000000005F8000L});
        public static final BitSet FOLLOW_rule__Statemachine__Group__8_in_rule__Statemachine__Group__71683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_7__0_in_rule__Statemachine__Group__7__Impl1710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group__8__Impl_in_rule__Statemachine__Group__81741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Statemachine__Group__8__Impl1769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_2__0__Impl_in_rule__Statemachine__Group_2__01818 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_2__1_in_rule__Statemachine__Group_2__01821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Statemachine__Group_2__0__Impl1849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_2__1__Impl_in_rule__Statemachine__Group_2__11880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__CommentAssignment_2_1_in_rule__Statemachine__Group_2__1__Impl1907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_3__0__Impl_in_rule__Statemachine__Group_3__01941 = new BitSet(new long[]{0x0000000000003800L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_3__1_in_rule__Statemachine__Group_3__01944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Statemachine__Group_3__0__Impl1972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_3__1__Impl_in_rule__Statemachine__Group_3__12003 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__TranslationAssignment_3_1_in_rule__Statemachine__Group_3__1__Impl2030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_4__0__Impl_in_rule__Statemachine__Group_4__02064 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_4__1_in_rule__Statemachine__Group_4__02067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Statemachine__Group_4__0__Impl2095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_4__1__Impl_in_rule__Statemachine__Group_4__12126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__ElaboratesAssignment_4_1_in_rule__Statemachine__Group_4__1__Impl2153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_5__0__Impl_in_rule__Statemachine__Group_5__02187 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_5__1_in_rule__Statemachine__Group_5__02190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Statemachine__Group_5__0__Impl2218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_5__1__Impl_in_rule__Statemachine__Group_5__12249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__RefinesAssignment_5_1_in_rule__Statemachine__Group_5__1__Impl2276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_6__0__Impl_in_rule__Statemachine__Group_6__02310 = new BitSet(new long[]{0x0000007C80000000L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_6__1_in_rule__Statemachine__Group_6__02313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Statemachine__Group_6__0__Impl2341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_6__1__Impl_in_rule__Statemachine__Group_6__12372 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_6__2_in_rule__Statemachine__Group_6__12375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__NodesAssignment_6_1_in_rule__Statemachine__Group_6__1__Impl2402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_6__2__Impl_in_rule__Statemachine__Group_6__22432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_6_2__0_in_rule__Statemachine__Group_6__2__Impl2459 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_6_2__0__Impl_in_rule__Statemachine__Group_6_2__02496 = new BitSet(new long[]{0x0000007C80000000L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_6_2__1_in_rule__Statemachine__Group_6_2__02499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Statemachine__Group_6_2__0__Impl2527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_6_2__1__Impl_in_rule__Statemachine__Group_6_2__12558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__NodesAssignment_6_2_1_in_rule__Statemachine__Group_6_2__1__Impl2585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_7__0__Impl_in_rule__Statemachine__Group_7__02619 = new BitSet(new long[]{0x0000100000800000L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_7__1_in_rule__Statemachine__Group_7__02622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Statemachine__Group_7__0__Impl2650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_7__1__Impl_in_rule__Statemachine__Group_7__12681 = new BitSet(new long[]{0x0000100000800000L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_7__2_in_rule__Statemachine__Group_7__12684 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__TransitionsAssignment_7_1_in_rule__Statemachine__Group_7__1__Impl2711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_7__2__Impl_in_rule__Statemachine__Group_7__22741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__TransitionsAssignment_7_2_in_rule__Statemachine__Group_7__2__Impl2768 = new BitSet(new long[]{0x0000100000800002L});
        public static final BitSet FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__02805 = new BitSet(new long[]{0x0000100000800000L});
        public static final BitSet FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__02808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__12866 = new BitSet(new long[]{0x0000100000800000L});
        public static final BitSet FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__12869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__ExtendedAssignment_1_in_rule__Transition__Group__1__Impl2896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__22927 = new BitSet(new long[]{0x000000006F058000L});
        public static final BitSet FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__22930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Transition__Group__2__Impl2958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__32989 = new BitSet(new long[]{0x000000006F058000L});
        public static final BitSet FOLLOW_rule__Transition__Group__4_in_rule__Transition__Group__32992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_3__0_in_rule__Transition__Group__3__Impl3019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__4__Impl_in_rule__Transition__Group__43050 = new BitSet(new long[]{0x000000006F058000L});
        public static final BitSet FOLLOW_rule__Transition__Group__5_in_rule__Transition__Group__43053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_4__0_in_rule__Transition__Group__4__Impl3080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__5__Impl_in_rule__Transition__Group__53111 = new BitSet(new long[]{0x000000006F058000L});
        public static final BitSet FOLLOW_rule__Transition__Group__6_in_rule__Transition__Group__53114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_5__0_in_rule__Transition__Group__5__Impl3141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__6__Impl_in_rule__Transition__Group__63172 = new BitSet(new long[]{0x000000006F058000L});
        public static final BitSet FOLLOW_rule__Transition__Group__7_in_rule__Transition__Group__63175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_6__0_in_rule__Transition__Group__6__Impl3202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__7__Impl_in_rule__Transition__Group__73233 = new BitSet(new long[]{0x000000006F058000L});
        public static final BitSet FOLLOW_rule__Transition__Group__8_in_rule__Transition__Group__73236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_7__0_in_rule__Transition__Group__7__Impl3263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__8__Impl_in_rule__Transition__Group__83294 = new BitSet(new long[]{0x000000006F058000L});
        public static final BitSet FOLLOW_rule__Transition__Group__9_in_rule__Transition__Group__83297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_8__0_in_rule__Transition__Group__8__Impl3324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__9__Impl_in_rule__Transition__Group__93355 = new BitSet(new long[]{0x000000006F058000L});
        public static final BitSet FOLLOW_rule__Transition__Group__10_in_rule__Transition__Group__93358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_9__0_in_rule__Transition__Group__9__Impl3385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__10__Impl_in_rule__Transition__Group__103416 = new BitSet(new long[]{0x000000006F058000L});
        public static final BitSet FOLLOW_rule__Transition__Group__11_in_rule__Transition__Group__103419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_10__0_in_rule__Transition__Group__10__Impl3446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__11__Impl_in_rule__Transition__Group__113477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Transition__Group__11__Impl3505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_3__0__Impl_in_rule__Transition__Group_3__03560 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Transition__Group_3__1_in_rule__Transition__Group_3__03563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Transition__Group_3__0__Impl3591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_3__1__Impl_in_rule__Transition__Group_3__13622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__CommentAssignment_3_1_in_rule__Transition__Group_3__1__Impl3649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_4__0__Impl_in_rule__Transition__Group_4__03683 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Transition__Group_4__1_in_rule__Transition__Group_4__03686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Transition__Group_4__0__Impl3714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_4__1__Impl_in_rule__Transition__Group_4__13745 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Transition__Group_4__2_in_rule__Transition__Group_4__13748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__ElaboratesAssignment_4_1_in_rule__Transition__Group_4__1__Impl3775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_4__2__Impl_in_rule__Transition__Group_4__23805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__ElaboratesAssignment_4_2_in_rule__Transition__Group_4__2__Impl3832 = new BitSet(new long[]{0x0000000000000032L});
        public static final BitSet FOLLOW_rule__Transition__Group_5__0__Impl_in_rule__Transition__Group_5__03869 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Transition__Group_5__1_in_rule__Transition__Group_5__03872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Transition__Group_5__0__Impl3900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_5__1__Impl_in_rule__Transition__Group_5__13931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__TargetAssignment_5_1_in_rule__Transition__Group_5__1__Impl3958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_6__0__Impl_in_rule__Transition__Group_6__03992 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Transition__Group_6__1_in_rule__Transition__Group_6__03995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Transition__Group_6__0__Impl4023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_6__1__Impl_in_rule__Transition__Group_6__14054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__SourceAssignment_6_1_in_rule__Transition__Group_6__1__Impl4081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_7__0__Impl_in_rule__Transition__Group_7__04115 = new BitSet(new long[]{0x0000210000000000L});
        public static final BitSet FOLLOW_rule__Transition__Group_7__1_in_rule__Transition__Group_7__04118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Transition__Group_7__0__Impl4146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_7__1__Impl_in_rule__Transition__Group_7__14177 = new BitSet(new long[]{0x0000210000000000L});
        public static final BitSet FOLLOW_rule__Transition__Group_7__2_in_rule__Transition__Group_7__14180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__GuardsAssignment_7_1_in_rule__Transition__Group_7__1__Impl4207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_7__2__Impl_in_rule__Transition__Group_7__24237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__GuardsAssignment_7_2_in_rule__Transition__Group_7__2__Impl4264 = new BitSet(new long[]{0x0000210000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_8__0__Impl_in_rule__Transition__Group_8__04301 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__Transition__Group_8__1_in_rule__Transition__Group_8__04304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Transition__Group_8__0__Impl4332 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_8__1__Impl_in_rule__Transition__Group_8__14363 = new BitSet(new long[]{0x0000020010000000L});
        public static final BitSet FOLLOW_rule__Transition__Group_8__2_in_rule__Transition__Group_8__14366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__ParametersAssignment_8_1_in_rule__Transition__Group_8__1__Impl4393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_8__2__Impl_in_rule__Transition__Group_8__24423 = new BitSet(new long[]{0x0000020010000000L});
        public static final BitSet FOLLOW_rule__Transition__Group_8__3_in_rule__Transition__Group_8__24426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__ParametersAssignment_8_2_in_rule__Transition__Group_8__2__Impl4453 = new BitSet(new long[]{0x0000020000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_8__3__Impl_in_rule__Transition__Group_8__34484 = new BitSet(new long[]{0x0000210000000000L});
        public static final BitSet FOLLOW_rule__Transition__Group_8__4_in_rule__Transition__Group_8__34487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Transition__Group_8__3__Impl4515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_8__4__Impl_in_rule__Transition__Group_8__44546 = new BitSet(new long[]{0x0000210000000000L});
        public static final BitSet FOLLOW_rule__Transition__Group_8__5_in_rule__Transition__Group_8__44549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__GuardsAssignment_8_4_in_rule__Transition__Group_8__4__Impl4576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_8__5__Impl_in_rule__Transition__Group_8__54606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__GuardsAssignment_8_5_in_rule__Transition__Group_8__5__Impl4633 = new BitSet(new long[]{0x0000210000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_9__0__Impl_in_rule__Transition__Group_9__04676 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_rule__Transition__Group_9__1_in_rule__Transition__Group_9__04679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Transition__Group_9__0__Impl4707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_9__1__Impl_in_rule__Transition__Group_9__14738 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_rule__Transition__Group_9__2_in_rule__Transition__Group_9__14741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__WitnessesAssignment_9_1_in_rule__Transition__Group_9__1__Impl4768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_9__2__Impl_in_rule__Transition__Group_9__24798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__WitnessesAssignment_9_2_in_rule__Transition__Group_9__2__Impl4825 = new BitSet(new long[]{0x0000080000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_10__0__Impl_in_rule__Transition__Group_10__04862 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__Transition__Group_10__1_in_rule__Transition__Group_10__04865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Transition__Group_10__0__Impl4893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_10__1__Impl_in_rule__Transition__Group_10__14924 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__Transition__Group_10__2_in_rule__Transition__Group_10__14927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__ActionsAssignment_10_1_in_rule__Transition__Group_10__1__Impl4954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_10__2__Impl_in_rule__Transition__Group_10__24984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__ActionsAssignment_10_2_in_rule__Transition__Group_10__2__Impl5011 = new BitSet(new long[]{0x0000010000000002L});
        public static final BitSet FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__05049 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__State__Group__1_in_rule__State__Group__05052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__15110 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__State__Group__2_in_rule__State__Group__15113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__State__Group__1__Impl5141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__25172 = new BitSet(new long[]{0x0000000300080000L});
        public static final BitSet FOLLOW_rule__State__Group__3_in_rule__State__Group__25175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__NameAssignment_2_in_rule__State__Group__2__Impl5202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group__3__Impl_in_rule__State__Group__35232 = new BitSet(new long[]{0x0000000300080000L});
        public static final BitSet FOLLOW_rule__State__Group__4_in_rule__State__Group__35235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_3__0_in_rule__State__Group__3__Impl5262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group__4__Impl_in_rule__State__Group__45293 = new BitSet(new long[]{0x0000000300080000L});
        public static final BitSet FOLLOW_rule__State__Group__5_in_rule__State__Group__45296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_4__0_in_rule__State__Group__4__Impl5323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group__5__Impl_in_rule__State__Group__55354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_5__0_in_rule__State__Group__5__Impl5381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_3__0__Impl_in_rule__State__Group_3__05424 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__State__Group_3__1_in_rule__State__Group_3__05427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__State__Group_3__0__Impl5455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_3__1__Impl_in_rule__State__Group_3__15486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__RefinesAssignment_3_1_in_rule__State__Group_3__1__Impl5513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_4__0__Impl_in_rule__State__Group_4__05547 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__State__Group_4__1_in_rule__State__Group_4__05550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__State__Group_4__0__Impl5578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_4__1__Impl_in_rule__State__Group_4__15609 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_rule__State__Group_4__2_in_rule__State__Group_4__15612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__StatemachinesAssignment_4_1_in_rule__State__Group_4__1__Impl5639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_4__2__Impl_in_rule__State__Group_4__25669 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_rule__State__Group_4__3_in_rule__State__Group_4__25672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__StatemachinesAssignment_4_2_in_rule__State__Group_4__2__Impl5699 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rule__State__Group_4__3__Impl_in_rule__State__Group_4__35730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__State__Group_4__3__Impl5758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_5__0__Impl_in_rule__State__Group_5__05797 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__State__Group_5__1_in_rule__State__Group_5__05800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__State__Group_5__0__Impl5828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_5__1__Impl_in_rule__State__Group_5__15859 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__State__Group_5__2_in_rule__State__Group_5__15862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__InvariantsAssignment_5_1_in_rule__State__Group_5__1__Impl5889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_5__2__Impl_in_rule__State__Group_5__25919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__InvariantsAssignment_5_2_in_rule__State__Group_5__2__Impl5946 = new BitSet(new long[]{0x0000008000000002L});
        public static final BitSet FOLLOW_rule__Initial__Group__0__Impl_in_rule__Initial__Group__05983 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__Initial__Group__1_in_rule__Initial__Group__05986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Initial__Group__1__Impl_in_rule__Initial__Group__16044 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Initial__Group__2_in_rule__Initial__Group__16047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Initial__Group__1__Impl6075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Initial__Group__2__Impl_in_rule__Initial__Group__26106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Initial__NameAssignment_2_in_rule__Initial__Group__2__Impl6133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Final__Group__0__Impl_in_rule__Final__Group__06169 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__Final__Group__1_in_rule__Final__Group__06172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Final__Group__1__Impl_in_rule__Final__Group__16230 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Final__Group__2_in_rule__Final__Group__16233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Final__Group__1__Impl6261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Final__Group__2__Impl_in_rule__Final__Group__26292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Final__NameAssignment_2_in_rule__Final__Group__2__Impl6319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Any__Group__0__Impl_in_rule__Any__Group__06355 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__Any__Group__1_in_rule__Any__Group__06358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Any__Group__1__Impl_in_rule__Any__Group__16416 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Any__Group__2_in_rule__Any__Group__16419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__Any__Group__1__Impl6447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Any__Group__2__Impl_in_rule__Any__Group__26478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Any__NameAssignment_2_in_rule__Any__Group__2__Impl6505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Junction__Group__0__Impl_in_rule__Junction__Group__06541 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__Junction__Group__1_in_rule__Junction__Group__06544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Junction__Group__1__Impl_in_rule__Junction__Group__16602 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Junction__Group__2_in_rule__Junction__Group__16605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__Junction__Group__1__Impl6633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Junction__Group__2__Impl_in_rule__Junction__Group__26664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Junction__NameAssignment_2_in_rule__Junction__Group__2__Impl6691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fork__Group__0__Impl_in_rule__Fork__Group__06727 = new BitSet(new long[]{0x0000007C80000000L});
        public static final BitSet FOLLOW_rule__Fork__Group__1_in_rule__Fork__Group__06730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fork__Group__1__Impl_in_rule__Fork__Group__16788 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Fork__Group__2_in_rule__Fork__Group__16791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Fork__Group__1__Impl6819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fork__Group__2__Impl_in_rule__Fork__Group__26850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fork__NameAssignment_2_in_rule__Fork__Group__2__Impl6877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group__0__Impl_in_rule__Invariant__Group__06913 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__Invariant__Group__1_in_rule__Invariant__Group__06916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__Invariant__Group__0__Impl6944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group__1__Impl_in_rule__Invariant__Group__16975 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Invariant__Group__2_in_rule__Invariant__Group__16978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__Invariant__Group__1__Impl7006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group__2__Impl_in_rule__Invariant__Group__27037 = new BitSet(new long[]{0x0000200000000030L});
        public static final BitSet FOLLOW_rule__Invariant__Group__3_in_rule__Invariant__Group__27040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__NameAssignment_2_in_rule__Invariant__Group__2__Impl7067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group__3__Impl_in_rule__Invariant__Group__37097 = new BitSet(new long[]{0x0000200000000030L});
        public static final BitSet FOLLOW_rule__Invariant__Group__4_in_rule__Invariant__Group__37100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__TheoremAssignment_3_in_rule__Invariant__Group__3__Impl7127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group__4__Impl_in_rule__Invariant__Group__47158 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Invariant__Group__5_in_rule__Invariant__Group__47161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__PredicateAssignment_4_in_rule__Invariant__Group__4__Impl7188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group__5__Impl_in_rule__Invariant__Group__57218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group_5__0_in_rule__Invariant__Group__5__Impl7245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group_5__0__Impl_in_rule__Invariant__Group_5__07288 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Invariant__Group_5__1_in_rule__Invariant__Group_5__07291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Invariant__Group_5__0__Impl7319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group_5__1__Impl_in_rule__Invariant__Group_5__17350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__CommentAssignment_5_1_in_rule__Invariant__Group_5__1__Impl7377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedParameter__Group__0__Impl_in_rule__TypedParameter__Group__07411 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TypedParameter__Group__1_in_rule__TypedParameter__Group__07414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__TypedParameter__Group__0__Impl7442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedParameter__Group__1__Impl_in_rule__TypedParameter__Group__17473 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__TypedParameter__Group__2_in_rule__TypedParameter__Group__17476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedParameter__NameAssignment_1_in_rule__TypedParameter__Group__1__Impl7503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedParameter__Group__2__Impl_in_rule__TypedParameter__Group__27533 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TypedParameter__Group__3_in_rule__TypedParameter__Group__27536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__TypedParameter__Group__2__Impl7564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedParameter__Group__3__Impl_in_rule__TypedParameter__Group__37595 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__TypedParameter__Group__4_in_rule__TypedParameter__Group__37598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedParameter__TypeAssignment_3_in_rule__TypedParameter__Group__3__Impl7625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedParameter__Group__4__Impl_in_rule__TypedParameter__Group__47655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedParameter__Group_4__0_in_rule__TypedParameter__Group__4__Impl7682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedParameter__Group_4__0__Impl_in_rule__TypedParameter__Group_4__07723 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TypedParameter__Group_4__1_in_rule__TypedParameter__Group_4__07726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__TypedParameter__Group_4__0__Impl7754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedParameter__Group_4__1__Impl_in_rule__TypedParameter__Group_4__17785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedParameter__CommentAssignment_4_1_in_rule__TypedParameter__Group_4__1__Impl7812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guard__Group__0__Impl_in_rule__Guard__Group__07846 = new BitSet(new long[]{0x0000210000000000L});
        public static final BitSet FOLLOW_rule__Guard__Group__1_in_rule__Guard__Group__07849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guard__TheoremAssignment_0_in_rule__Guard__Group__0__Impl7876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guard__Group__1__Impl_in_rule__Guard__Group__17907 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Guard__Group__2_in_rule__Guard__Group__17910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__Guard__Group__1__Impl7938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guard__Group__2__Impl_in_rule__Guard__Group__27969 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Guard__Group__3_in_rule__Guard__Group__27972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guard__NameAssignment_2_in_rule__Guard__Group__2__Impl7999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guard__Group__3__Impl_in_rule__Guard__Group__38029 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Guard__Group__4_in_rule__Guard__Group__38032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guard__PredicateAssignment_3_in_rule__Guard__Group__3__Impl8059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guard__Group__4__Impl_in_rule__Guard__Group__48089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guard__Group_4__0_in_rule__Guard__Group__4__Impl8116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guard__Group_4__0__Impl_in_rule__Guard__Group_4__08157 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Guard__Group_4__1_in_rule__Guard__Group_4__08160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Guard__Group_4__0__Impl8188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guard__Group_4__1__Impl_in_rule__Guard__Group_4__18219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guard__CommentAssignment_4_1_in_rule__Guard__Group_4__1__Impl8246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group__0__Impl_in_rule__Action__Group__08280 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Action__Group__1_in_rule__Action__Group__08283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__Action__Group__0__Impl8311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group__1__Impl_in_rule__Action__Group__18342 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Action__Group__2_in_rule__Action__Group__18345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__NameAssignment_1_in_rule__Action__Group__1__Impl8372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group__2__Impl_in_rule__Action__Group__28402 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Action__Group__3_in_rule__Action__Group__28405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__ActionAssignment_2_in_rule__Action__Group__2__Impl8432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group__3__Impl_in_rule__Action__Group__38462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group_3__0_in_rule__Action__Group__3__Impl8489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group_3__0__Impl_in_rule__Action__Group_3__08528 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Action__Group_3__1_in_rule__Action__Group_3__08531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Action__Group_3__0__Impl8559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group_3__1__Impl_in_rule__Action__Group_3__18590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__CommentAssignment_3_1_in_rule__Action__Group_3__1__Impl8617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Witness__Group__0__Impl_in_rule__Witness__Group__08651 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__Witness__Group__1_in_rule__Witness__Group__08654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__Witness__Group__0__Impl8682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Witness__Group__1__Impl_in_rule__Witness__Group__18713 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Witness__Group__2_in_rule__Witness__Group__18716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__Witness__Group__1__Impl8744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Witness__Group__2__Impl_in_rule__Witness__Group__28775 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Witness__Group__3_in_rule__Witness__Group__28778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Witness__NameAssignment_2_in_rule__Witness__Group__2__Impl8805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Witness__Group__3__Impl_in_rule__Witness__Group__38835 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Witness__Group__4_in_rule__Witness__Group__38838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Witness__PredicateAssignment_3_in_rule__Witness__Group__3__Impl8865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Witness__Group__4__Impl_in_rule__Witness__Group__48895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Witness__Group_4__0_in_rule__Witness__Group__4__Impl8922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Witness__Group_4__0__Impl_in_rule__Witness__Group_4__08963 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Witness__Group_4__1_in_rule__Witness__Group_4__08966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Witness__Group_4__0__Impl8994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Witness__Group_4__1__Impl_in_rule__Witness__Group_4__19025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Witness__CommentAssignment_4_1_in_rule__Witness__Group_4__1__Impl9052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Statemachine__NameAssignment_19091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Statemachine__CommentAssignment_2_19122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTranslationKind_in_rule__Statemachine__TranslationAssignment_3_19153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Statemachine__ElaboratesAssignment_4_19188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Statemachine__RefinesAssignment_5_19227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractNode_in_rule__Statemachine__NodesAssignment_6_19262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractNode_in_rule__Statemachine__NodesAssignment_6_2_19293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransition_in_rule__Statemachine__TransitionsAssignment_7_19324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransition_in_rule__Statemachine__TransitionsAssignment_7_29355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__Transition__ExtendedAssignment_19391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Transition__CommentAssignment_3_19430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Transition__ElaboratesAssignment_4_19465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Transition__ElaboratesAssignment_4_29504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Transition__TargetAssignment_5_19543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Transition__SourceAssignment_6_19582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGuard_in_rule__Transition__GuardsAssignment_7_19617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGuard_in_rule__Transition__GuardsAssignment_7_29648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedParameter_in_rule__Transition__ParametersAssignment_8_19679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedParameter_in_rule__Transition__ParametersAssignment_8_29710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGuard_in_rule__Transition__GuardsAssignment_8_49741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGuard_in_rule__Transition__GuardsAssignment_8_59772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWitness_in_rule__Transition__WitnessesAssignment_9_19803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWitness_in_rule__Transition__WitnessesAssignment_9_29834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAction_in_rule__Transition__ActionsAssignment_10_19865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAction_in_rule__Transition__ActionsAssignment_10_29896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__State__NameAssignment_29927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__State__RefinesAssignment_3_19962 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStatemachine_in_rule__State__StatemachinesAssignment_4_19997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStatemachine_in_rule__State__StatemachinesAssignment_4_210028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvariant_in_rule__State__InvariantsAssignment_5_110059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvariant_in_rule__State__InvariantsAssignment_5_210090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Initial__NameAssignment_210121 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Final__NameAssignment_210152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Any__NameAssignment_210183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Junction__NameAssignment_210214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Fork__NameAssignment_210245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Invariant__NameAssignment_210276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__Invariant__TheoremAssignment_310312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Invariant__PredicateAssignment_410351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Invariant__CommentAssignment_5_110382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TypedParameter__NameAssignment_110413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TypedParameter__TypeAssignment_310444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TypedParameter__CommentAssignment_4_110475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__Guard__TheoremAssignment_010511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Guard__NameAssignment_210550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Guard__PredicateAssignment_310581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Guard__CommentAssignment_4_110612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Action__NameAssignment_110643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Action__ActionAssignment_210674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Action__CommentAssignment_3_110705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Witness__NameAssignment_210736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Witness__PredicateAssignment_310767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Witness__CommentAssignment_4_110798 = new BitSet(new long[]{0x0000000000000002L});
    }


}