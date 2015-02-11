package ac.soton.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ac.soton.xtext.services.MachineDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMachineDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'machine'", "'>'", "'refines'", "'sees'", "'extensions'", "'{'", "','", "'}'", "'variables'", "'invariants'", "'variant'", "'events'", "'end'", "'@'", "'theorem'", "'Variant'", "'expression'", "'event'", "'extended'", "'when'", "'any'", "'where'", "'with'", "'then'", "'\\u00B7'", "'localGenerated'", "'Statemachine'", "'translation'", "'elaborates'", "'nodes'", "'transitions'", "'Transition'", "'target'", "'source'", "'State'", "'statemachines'", "'Initial'", "'internalId'", "'Final'", "'Any'", "'Junction'", "'Fork'", "'TypedParameter'", "'type'", "'ordinary'", "'convergent'", "'anticipated'", "'MULTIVAR'", "'SINGLEVAR'", "'REFINEDVAR'"
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
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
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


        public InternalMachineDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMachineDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMachineDslParser.tokenNames; }
    public String getGrammarFileName() { return "../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g"; }



     	private MachineDslGrammarAccess grammarAccess;
     	
        public InternalMachineDslParser(TokenStream input, MachineDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Machine";	
       	}
       	
       	@Override
       	protected MachineDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleMachine"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:68:1: entryRuleMachine returns [EObject current=null] : iv_ruleMachine= ruleMachine EOF ;
    public final EObject entryRuleMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMachine = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:69:2: (iv_ruleMachine= ruleMachine EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:70:2: iv_ruleMachine= ruleMachine EOF
            {
             newCompositeNode(grammarAccess.getMachineRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMachine_in_entryRuleMachine75);
            iv_ruleMachine=ruleMachine();

            state._fsp--;

             current =iv_ruleMachine; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMachine85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMachine"


    // $ANTLR start "ruleMachine"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:77:1: ruleMachine returns [EObject current=null] : ( () otherlv_1= 'machine' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) ) )? (otherlv_5= 'refines' ( ( ruleEString ) ) ( ( ruleEString ) )* )? (otherlv_8= 'sees' ( ( ruleEString ) ) ( ( ruleEString ) )* )? (otherlv_11= 'extensions' otherlv_12= '{' ( (lv_extensions_13_0= ruleAbstractExtension ) ) (otherlv_14= ',' ( (lv_extensions_15_0= ruleAbstractExtension ) ) )* otherlv_16= '}' )? (otherlv_17= 'variables' ( (lv_variables_18_0= ruleVariable ) ) ( (lv_variables_19_0= ruleVariable ) )* )? (otherlv_20= 'invariants' ( (lv_invariants_21_0= ruleInvariant ) ) ( (lv_invariants_22_0= ruleInvariant ) )* )? (otherlv_23= 'variant' ( (lv_variant_24_0= ruleVariant ) ) )? (otherlv_25= 'events' ( (lv_events_26_0= ruleevent ) ) ( (lv_events_27_0= ruleevent ) )* )? otherlv_28= 'end' ) ;
    public final EObject ruleMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_20=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_28=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_comment_4_0 = null;

        EObject lv_extensions_13_0 = null;

        EObject lv_extensions_15_0 = null;

        EObject lv_variables_18_0 = null;

        EObject lv_variables_19_0 = null;

        EObject lv_invariants_21_0 = null;

        EObject lv_invariants_22_0 = null;

        EObject lv_variant_24_0 = null;

        EObject lv_events_26_0 = null;

        EObject lv_events_27_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:80:28: ( ( () otherlv_1= 'machine' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) ) )? (otherlv_5= 'refines' ( ( ruleEString ) ) ( ( ruleEString ) )* )? (otherlv_8= 'sees' ( ( ruleEString ) ) ( ( ruleEString ) )* )? (otherlv_11= 'extensions' otherlv_12= '{' ( (lv_extensions_13_0= ruleAbstractExtension ) ) (otherlv_14= ',' ( (lv_extensions_15_0= ruleAbstractExtension ) ) )* otherlv_16= '}' )? (otherlv_17= 'variables' ( (lv_variables_18_0= ruleVariable ) ) ( (lv_variables_19_0= ruleVariable ) )* )? (otherlv_20= 'invariants' ( (lv_invariants_21_0= ruleInvariant ) ) ( (lv_invariants_22_0= ruleInvariant ) )* )? (otherlv_23= 'variant' ( (lv_variant_24_0= ruleVariant ) ) )? (otherlv_25= 'events' ( (lv_events_26_0= ruleevent ) ) ( (lv_events_27_0= ruleevent ) )* )? otherlv_28= 'end' ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:81:1: ( () otherlv_1= 'machine' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) ) )? (otherlv_5= 'refines' ( ( ruleEString ) ) ( ( ruleEString ) )* )? (otherlv_8= 'sees' ( ( ruleEString ) ) ( ( ruleEString ) )* )? (otherlv_11= 'extensions' otherlv_12= '{' ( (lv_extensions_13_0= ruleAbstractExtension ) ) (otherlv_14= ',' ( (lv_extensions_15_0= ruleAbstractExtension ) ) )* otherlv_16= '}' )? (otherlv_17= 'variables' ( (lv_variables_18_0= ruleVariable ) ) ( (lv_variables_19_0= ruleVariable ) )* )? (otherlv_20= 'invariants' ( (lv_invariants_21_0= ruleInvariant ) ) ( (lv_invariants_22_0= ruleInvariant ) )* )? (otherlv_23= 'variant' ( (lv_variant_24_0= ruleVariant ) ) )? (otherlv_25= 'events' ( (lv_events_26_0= ruleevent ) ) ( (lv_events_27_0= ruleevent ) )* )? otherlv_28= 'end' )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:81:1: ( () otherlv_1= 'machine' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) ) )? (otherlv_5= 'refines' ( ( ruleEString ) ) ( ( ruleEString ) )* )? (otherlv_8= 'sees' ( ( ruleEString ) ) ( ( ruleEString ) )* )? (otherlv_11= 'extensions' otherlv_12= '{' ( (lv_extensions_13_0= ruleAbstractExtension ) ) (otherlv_14= ',' ( (lv_extensions_15_0= ruleAbstractExtension ) ) )* otherlv_16= '}' )? (otherlv_17= 'variables' ( (lv_variables_18_0= ruleVariable ) ) ( (lv_variables_19_0= ruleVariable ) )* )? (otherlv_20= 'invariants' ( (lv_invariants_21_0= ruleInvariant ) ) ( (lv_invariants_22_0= ruleInvariant ) )* )? (otherlv_23= 'variant' ( (lv_variant_24_0= ruleVariant ) ) )? (otherlv_25= 'events' ( (lv_events_26_0= ruleevent ) ) ( (lv_events_27_0= ruleevent ) )* )? otherlv_28= 'end' )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:81:2: () otherlv_1= 'machine' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) ) )? (otherlv_5= 'refines' ( ( ruleEString ) ) ( ( ruleEString ) )* )? (otherlv_8= 'sees' ( ( ruleEString ) ) ( ( ruleEString ) )* )? (otherlv_11= 'extensions' otherlv_12= '{' ( (lv_extensions_13_0= ruleAbstractExtension ) ) (otherlv_14= ',' ( (lv_extensions_15_0= ruleAbstractExtension ) ) )* otherlv_16= '}' )? (otherlv_17= 'variables' ( (lv_variables_18_0= ruleVariable ) ) ( (lv_variables_19_0= ruleVariable ) )* )? (otherlv_20= 'invariants' ( (lv_invariants_21_0= ruleInvariant ) ) ( (lv_invariants_22_0= ruleInvariant ) )* )? (otherlv_23= 'variant' ( (lv_variant_24_0= ruleVariant ) ) )? (otherlv_25= 'events' ( (lv_events_26_0= ruleevent ) ) ( (lv_events_27_0= ruleevent ) )* )? otherlv_28= 'end'
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:81:2: ()
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMachineAccess().getMachineAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleMachine131); 

                	newLeafNode(otherlv_1, grammarAccess.getMachineAccess().getMachineKeyword_1());
                
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:91:1: ( (lv_name_2_0= ruleEString ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:92:1: (lv_name_2_0= ruleEString )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:92:1: (lv_name_2_0= ruleEString )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:93:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMachineAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMachine152);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMachineRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:109:2: (otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:109:4: otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMachine165); 

                        	newLeafNode(otherlv_3, grammarAccess.getMachineAccess().getGreaterThanSignKeyword_3_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:113:1: ( (lv_comment_4_0= ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:114:1: (lv_comment_4_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:114:1: (lv_comment_4_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:115:3: lv_comment_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMachineAccess().getCommentEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMachine186);
                    lv_comment_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	        }
                           		set(
                           			current, 
                           			"comment",
                            		lv_comment_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:131:4: (otherlv_5= 'refines' ( ( ruleEString ) ) ( ( ruleEString ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:131:6: otherlv_5= 'refines' ( ( ruleEString ) ) ( ( ruleEString ) )*
                    {
                    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMachine201); 

                        	newLeafNode(otherlv_5, grammarAccess.getMachineAccess().getRefinesKeyword_4_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:135:1: ( ( ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:136:1: ( ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:136:1: ( ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:137:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMachineRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getMachineAccess().getRefinesMachineCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMachine224);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:150:2: ( ( ruleEString ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_ID)) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:151:1: ( ruleEString )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:151:1: ( ruleEString )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:152:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getMachineRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getMachineAccess().getRefinesMachineCrossReference_4_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMachine247);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:165:5: (otherlv_8= 'sees' ( ( ruleEString ) ) ( ( ruleEString ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:165:7: otherlv_8= 'sees' ( ( ruleEString ) ) ( ( ruleEString ) )*
                    {
                    otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMachine263); 

                        	newLeafNode(otherlv_8, grammarAccess.getMachineAccess().getSeesKeyword_5_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:169:1: ( ( ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:170:1: ( ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:170:1: ( ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:171:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMachineRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getMachineAccess().getSeesContextCrossReference_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMachine286);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:184:2: ( ( ruleEString ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_ID)) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:185:1: ( ruleEString )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:185:1: ( ruleEString )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:186:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getMachineRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getMachineAccess().getSeesContextCrossReference_5_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMachine309);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:199:5: (otherlv_11= 'extensions' otherlv_12= '{' ( (lv_extensions_13_0= ruleAbstractExtension ) ) (otherlv_14= ',' ( (lv_extensions_15_0= ruleAbstractExtension ) ) )* otherlv_16= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:199:7: otherlv_11= 'extensions' otherlv_12= '{' ( (lv_extensions_13_0= ruleAbstractExtension ) ) (otherlv_14= ',' ( (lv_extensions_15_0= ruleAbstractExtension ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMachine325); 

                        	newLeafNode(otherlv_11, grammarAccess.getMachineAccess().getExtensionsKeyword_6_0());
                        
                    otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMachine337); 

                        	newLeafNode(otherlv_12, grammarAccess.getMachineAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:207:1: ( (lv_extensions_13_0= ruleAbstractExtension ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:208:1: (lv_extensions_13_0= ruleAbstractExtension )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:208:1: (lv_extensions_13_0= ruleAbstractExtension )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:209:3: lv_extensions_13_0= ruleAbstractExtension
                    {
                     
                    	        newCompositeNode(grammarAccess.getMachineAccess().getExtensionsAbstractExtensionParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleMachine358);
                    lv_extensions_13_0=ruleAbstractExtension();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	        }
                           		add(
                           			current, 
                           			"extensions",
                            		lv_extensions_13_0, 
                            		"AbstractExtension");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:225:2: (otherlv_14= ',' ( (lv_extensions_15_0= ruleAbstractExtension ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==17) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:225:4: otherlv_14= ',' ( (lv_extensions_15_0= ruleAbstractExtension ) )
                    	    {
                    	    otherlv_14=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMachine371); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getMachineAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:229:1: ( (lv_extensions_15_0= ruleAbstractExtension ) )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:230:1: (lv_extensions_15_0= ruleAbstractExtension )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:230:1: (lv_extensions_15_0= ruleAbstractExtension )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:231:3: lv_extensions_15_0= ruleAbstractExtension
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMachineAccess().getExtensionsAbstractExtensionParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleMachine392);
                    	    lv_extensions_15_0=ruleAbstractExtension();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"extensions",
                    	            		lv_extensions_15_0, 
                    	            		"AbstractExtension");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMachine406); 

                        	newLeafNode(otherlv_16, grammarAccess.getMachineAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:251:3: (otherlv_17= 'variables' ( (lv_variables_18_0= ruleVariable ) ) ( (lv_variables_19_0= ruleVariable ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:251:5: otherlv_17= 'variables' ( (lv_variables_18_0= ruleVariable ) ) ( (lv_variables_19_0= ruleVariable ) )*
                    {
                    otherlv_17=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMachine421); 

                        	newLeafNode(otherlv_17, grammarAccess.getMachineAccess().getVariablesKeyword_7_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:255:1: ( (lv_variables_18_0= ruleVariable ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:256:1: (lv_variables_18_0= ruleVariable )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:256:1: (lv_variables_18_0= ruleVariable )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:257:3: lv_variables_18_0= ruleVariable
                    {
                     
                    	        newCompositeNode(grammarAccess.getMachineAccess().getVariablesVariableParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleMachine442);
                    lv_variables_18_0=ruleVariable();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	        }
                           		add(
                           			current, 
                           			"variables",
                            		lv_variables_18_0, 
                            		"Variable");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:273:2: ( (lv_variables_19_0= ruleVariable ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_ID)) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:274:1: (lv_variables_19_0= ruleVariable )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:274:1: (lv_variables_19_0= ruleVariable )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:275:3: lv_variables_19_0= ruleVariable
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMachineAccess().getVariablesVariableParserRuleCall_7_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleMachine463);
                    	    lv_variables_19_0=ruleVariable();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"variables",
                    	            		lv_variables_19_0, 
                    	            		"Variable");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:291:5: (otherlv_20= 'invariants' ( (lv_invariants_21_0= ruleInvariant ) ) ( (lv_invariants_22_0= ruleInvariant ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:291:7: otherlv_20= 'invariants' ( (lv_invariants_21_0= ruleInvariant ) ) ( (lv_invariants_22_0= ruleInvariant ) )*
                    {
                    otherlv_20=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleMachine479); 

                        	newLeafNode(otherlv_20, grammarAccess.getMachineAccess().getInvariantsKeyword_8_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:295:1: ( (lv_invariants_21_0= ruleInvariant ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:296:1: (lv_invariants_21_0= ruleInvariant )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:296:1: (lv_invariants_21_0= ruleInvariant )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:297:3: lv_invariants_21_0= ruleInvariant
                    {
                     
                    	        newCompositeNode(grammarAccess.getMachineAccess().getInvariantsInvariantParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInvariant_in_ruleMachine500);
                    lv_invariants_21_0=ruleInvariant();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	        }
                           		add(
                           			current, 
                           			"invariants",
                            		lv_invariants_21_0, 
                            		"Invariant");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:313:2: ( (lv_invariants_22_0= ruleInvariant ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==24) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:314:1: (lv_invariants_22_0= ruleInvariant )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:314:1: (lv_invariants_22_0= ruleInvariant )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:315:3: lv_invariants_22_0= ruleInvariant
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMachineAccess().getInvariantsInvariantParserRuleCall_8_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInvariant_in_ruleMachine521);
                    	    lv_invariants_22_0=ruleInvariant();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"invariants",
                    	            		lv_invariants_22_0, 
                    	            		"Invariant");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:331:5: (otherlv_23= 'variant' ( (lv_variant_24_0= ruleVariant ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:331:7: otherlv_23= 'variant' ( (lv_variant_24_0= ruleVariant ) )
                    {
                    otherlv_23=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleMachine537); 

                        	newLeafNode(otherlv_23, grammarAccess.getMachineAccess().getVariantKeyword_9_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:335:1: ( (lv_variant_24_0= ruleVariant ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:336:1: (lv_variant_24_0= ruleVariant )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:336:1: (lv_variant_24_0= ruleVariant )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:337:3: lv_variant_24_0= ruleVariant
                    {
                     
                    	        newCompositeNode(grammarAccess.getMachineAccess().getVariantVariantParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVariant_in_ruleMachine558);
                    lv_variant_24_0=ruleVariant();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	        }
                           		set(
                           			current, 
                           			"variant",
                            		lv_variant_24_0, 
                            		"Variant");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:353:4: (otherlv_25= 'events' ( (lv_events_26_0= ruleevent ) ) ( (lv_events_27_0= ruleevent ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:353:6: otherlv_25= 'events' ( (lv_events_26_0= ruleevent ) ) ( (lv_events_27_0= ruleevent ) )*
                    {
                    otherlv_25=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMachine573); 

                        	newLeafNode(otherlv_25, grammarAccess.getMachineAccess().getEventsKeyword_10_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:357:1: ( (lv_events_26_0= ruleevent ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:358:1: (lv_events_26_0= ruleevent )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:358:1: (lv_events_26_0= ruleevent )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:359:3: lv_events_26_0= ruleevent
                    {
                     
                    	        newCompositeNode(grammarAccess.getMachineAccess().getEventsEventParserRuleCall_10_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleevent_in_ruleMachine594);
                    lv_events_26_0=ruleevent();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	        }
                           		add(
                           			current, 
                           			"events",
                            		lv_events_26_0, 
                            		"event");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:375:2: ( (lv_events_27_0= ruleevent ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==28) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:376:1: (lv_events_27_0= ruleevent )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:376:1: (lv_events_27_0= ruleevent )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:377:3: lv_events_27_0= ruleevent
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMachineAccess().getEventsEventParserRuleCall_10_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleevent_in_ruleMachine615);
                    	    lv_events_27_0=ruleevent();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"events",
                    	            		lv_events_27_0, 
                    	            		"event");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_28=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMachine630); 

                	newLeafNode(otherlv_28, grammarAccess.getMachineAccess().getEndKeyword_11());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMachine"


    // $ANTLR start "entryRuleAbstractExtension"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:405:1: entryRuleAbstractExtension returns [EObject current=null] : iv_ruleAbstractExtension= ruleAbstractExtension EOF ;
    public final EObject entryRuleAbstractExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractExtension = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:406:2: (iv_ruleAbstractExtension= ruleAbstractExtension EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:407:2: iv_ruleAbstractExtension= ruleAbstractExtension EOF
            {
             newCompositeNode(grammarAccess.getAbstractExtensionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_entryRuleAbstractExtension666);
            iv_ruleAbstractExtension=ruleAbstractExtension();

            state._fsp--;

             current =iv_ruleAbstractExtension; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractExtension676); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractExtension"


    // $ANTLR start "ruleAbstractExtension"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:414:1: ruleAbstractExtension returns [EObject current=null] : this_Extension_0= ruleExtension ;
    public final EObject ruleAbstractExtension() throws RecognitionException {
        EObject current = null;

        EObject this_Extension_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:417:28: (this_Extension_0= ruleExtension )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:419:5: this_Extension_0= ruleExtension
            {
             
                    newCompositeNode(grammarAccess.getAbstractExtensionAccess().getExtensionParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleExtension_in_ruleAbstractExtension722);
            this_Extension_0=ruleExtension();

            state._fsp--;

             
                    current = this_Extension_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractExtension"


    // $ANTLR start "entryRuleEString"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:435:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:436:2: (iv_ruleEString= ruleEString EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:437:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString757);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString768); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:444:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:447:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:448:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:448:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_ID) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:448:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString808); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:456:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString834); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleVariable"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:471:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:472:2: (iv_ruleVariable= ruleVariable EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:473:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_entryRuleVariable879);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariable889); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:480:1: ruleVariable returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '>' ( (lv_comment_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_comment_3_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:483:28: ( ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '>' ( (lv_comment_3_0= ruleEString ) ) )? ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:484:1: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '>' ( (lv_comment_3_0= ruleEString ) ) )? )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:484:1: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '>' ( (lv_comment_3_0= ruleEString ) ) )? )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:484:2: () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '>' ( (lv_comment_3_0= ruleEString ) ) )?
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:484:2: ()
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:485:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableAccess().getVariableAction_0(),
                        current);
                

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:490:2: ( (lv_name_1_0= ruleEString ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:491:1: (lv_name_1_0= ruleEString )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:491:1: (lv_name_1_0= ruleEString )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:492:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getVariableAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariable944);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:508:2: (otherlv_2= '>' ( (lv_comment_3_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==12) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:508:4: otherlv_2= '>' ( (lv_comment_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleVariable957); 

                        	newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getGreaterThanSignKeyword_2_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:512:1: ( (lv_comment_3_0= ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:513:1: (lv_comment_3_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:513:1: (lv_comment_3_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:514:3: lv_comment_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableAccess().getCommentEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariable978);
                    lv_comment_3_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariableRule());
                    	        }
                           		set(
                           			current, 
                           			"comment",
                            		lv_comment_3_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleInvariant"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:538:1: entryRuleInvariant returns [EObject current=null] : iv_ruleInvariant= ruleInvariant EOF ;
    public final EObject entryRuleInvariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvariant = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:539:2: (iv_ruleInvariant= ruleInvariant EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:540:2: iv_ruleInvariant= ruleInvariant EOF
            {
             newCompositeNode(grammarAccess.getInvariantRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInvariant_in_entryRuleInvariant1016);
            iv_ruleInvariant=ruleInvariant();

            state._fsp--;

             current =iv_ruleInvariant; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInvariant1026); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInvariant"


    // $ANTLR start "ruleInvariant"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:547:1: ruleInvariant returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_predicate_2_0= ruleEString ) )? ( (lv_theorem_3_0= 'theorem' ) )? (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? ) ;
    public final EObject ruleInvariant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_theorem_3_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_predicate_2_0 = null;

        AntlrDatatypeRuleToken lv_comment_5_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:550:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_predicate_2_0= ruleEString ) )? ( (lv_theorem_3_0= 'theorem' ) )? (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:551:1: (otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_predicate_2_0= ruleEString ) )? ( (lv_theorem_3_0= 'theorem' ) )? (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:551:1: (otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_predicate_2_0= ruleEString ) )? ( (lv_theorem_3_0= 'theorem' ) )? (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:551:3: otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_predicate_2_0= ruleEString ) )? ( (lv_theorem_3_0= 'theorem' ) )? (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleInvariant1063); 

                	newLeafNode(otherlv_0, grammarAccess.getInvariantAccess().getCommercialAtKeyword_0());
                
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:555:1: ( (lv_name_1_0= ruleEString ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:556:1: (lv_name_1_0= ruleEString )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:556:1: (lv_name_1_0= ruleEString )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:557:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInvariantAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInvariant1084);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInvariantRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:573:2: ( (lv_predicate_2_0= ruleEString ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_STRING && LA17_0<=RULE_ID)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:574:1: (lv_predicate_2_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:574:1: (lv_predicate_2_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:575:3: lv_predicate_2_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInvariantAccess().getPredicateEStringParserRuleCall_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInvariant1105);
                    lv_predicate_2_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInvariantRule());
                    	        }
                           		set(
                           			current, 
                           			"predicate",
                            		lv_predicate_2_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:591:3: ( (lv_theorem_3_0= 'theorem' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==25) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:592:1: (lv_theorem_3_0= 'theorem' )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:592:1: (lv_theorem_3_0= 'theorem' )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:593:3: lv_theorem_3_0= 'theorem'
                    {
                    lv_theorem_3_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleInvariant1124); 

                            newLeafNode(lv_theorem_3_0, grammarAccess.getInvariantAccess().getTheoremTheoremKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInvariantRule());
                    	        }
                           		setWithLastConsumed(current, "theorem", true, "theorem");
                    	    

                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:606:3: (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==12) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:606:5: otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleInvariant1151); 

                        	newLeafNode(otherlv_4, grammarAccess.getInvariantAccess().getGreaterThanSignKeyword_4_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:610:1: ( (lv_comment_5_0= ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:611:1: (lv_comment_5_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:611:1: (lv_comment_5_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:612:3: lv_comment_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInvariantAccess().getCommentEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInvariant1172);
                    lv_comment_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInvariantRule());
                    	        }
                           		set(
                           			current, 
                           			"comment",
                            		lv_comment_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInvariant"


    // $ANTLR start "entryRuleVariant"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:636:1: entryRuleVariant returns [EObject current=null] : iv_ruleVariant= ruleVariant EOF ;
    public final EObject entryRuleVariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariant = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:637:2: (iv_ruleVariant= ruleVariant EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:638:2: iv_ruleVariant= ruleVariant EOF
            {
             newCompositeNode(grammarAccess.getVariantRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariant_in_entryRuleVariant1210);
            iv_ruleVariant=ruleVariant();

            state._fsp--;

             current =iv_ruleVariant; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariant1220); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariant"


    // $ANTLR start "ruleVariant"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:645:1: ruleVariant returns [EObject current=null] : ( () otherlv_1= 'Variant' otherlv_2= 'expression' ( (lv_expression_3_0= ruleEString ) )? (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? ) ;
    public final EObject ruleVariant() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_expression_3_0 = null;

        AntlrDatatypeRuleToken lv_comment_5_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:648:28: ( ( () otherlv_1= 'Variant' otherlv_2= 'expression' ( (lv_expression_3_0= ruleEString ) )? (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:649:1: ( () otherlv_1= 'Variant' otherlv_2= 'expression' ( (lv_expression_3_0= ruleEString ) )? (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:649:1: ( () otherlv_1= 'Variant' otherlv_2= 'expression' ( (lv_expression_3_0= ruleEString ) )? (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:649:2: () otherlv_1= 'Variant' otherlv_2= 'expression' ( (lv_expression_3_0= ruleEString ) )? (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )?
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:649:2: ()
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:650:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariantAccess().getVariantAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleVariant1266); 

                	newLeafNode(otherlv_1, grammarAccess.getVariantAccess().getVariantKeyword_1());
                
            otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleVariant1278); 

                	newLeafNode(otherlv_2, grammarAccess.getVariantAccess().getExpressionKeyword_2());
                
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:663:1: ( (lv_expression_3_0= ruleEString ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_STRING && LA20_0<=RULE_ID)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:664:1: (lv_expression_3_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:664:1: (lv_expression_3_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:665:3: lv_expression_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariantAccess().getExpressionEStringParserRuleCall_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariant1299);
                    lv_expression_3_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariantRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_3_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:681:3: (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==12) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:681:5: otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleVariant1313); 

                        	newLeafNode(otherlv_4, grammarAccess.getVariantAccess().getGreaterThanSignKeyword_4_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:685:1: ( (lv_comment_5_0= ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:686:1: (lv_comment_5_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:686:1: (lv_comment_5_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:687:3: lv_comment_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariantAccess().getCommentEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariant1334);
                    lv_comment_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariantRule());
                    	        }
                           		set(
                           			current, 
                           			"comment",
                            		lv_comment_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariant"


    // $ANTLR start "entryRuleevent"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:711:1: entryRuleevent returns [EObject current=null] : iv_ruleevent= ruleevent EOF ;
    public final EObject entryRuleevent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleevent = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:712:2: (iv_ruleevent= ruleevent EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:713:2: iv_ruleevent= ruleevent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleevent_in_entryRuleevent1372);
            iv_ruleevent=ruleevent();

            state._fsp--;

             current =iv_ruleevent; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleevent1382); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleevent"


    // $ANTLR start "ruleevent"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:720:1: ruleevent returns [EObject current=null] : ( () otherlv_1= 'event' ( (lv_name_2_0= ruleEString ) ) ( (lv_extended_3_0= 'extended' ) )? ( (lv_convergence_4_0= ruleConvergence ) )? (otherlv_5= '>' ( (lv_comment_6_0= ruleEString ) ) )? (otherlv_7= 'refines' ( ( ruleQString ) ) ( ( ruleEString ) )* )? (otherlv_10= 'when' ( (lv_guards_11_0= ruleGuard ) ) ( (lv_guards_12_0= ruleGuard ) )* )? (otherlv_13= 'any' ( (lv_parameters_14_0= ruleParameter ) ) ( (lv_parameters_15_0= ruleParameter ) )* otherlv_16= 'where' ( (lv_guards_17_0= ruleGuard ) ) ( (lv_guards_18_0= ruleGuard ) )* )? (otherlv_19= 'with' ( (lv_witnesses_20_0= ruleWitness ) ) ( (lv_witnesses_21_0= ruleWitness ) )* )? (otherlv_22= 'then' ( (lv_actions_23_0= ruleAction ) ) ( (lv_actions_24_0= ruleAction ) )* )? otherlv_25= 'end' ) ;
    public final EObject ruleevent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_extended_3_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        Token otherlv_16=null;
        Token otherlv_19=null;
        Token otherlv_22=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_convergence_4_0 = null;

        AntlrDatatypeRuleToken lv_comment_6_0 = null;

        EObject lv_guards_11_0 = null;

        EObject lv_guards_12_0 = null;

        EObject lv_parameters_14_0 = null;

        EObject lv_parameters_15_0 = null;

        EObject lv_guards_17_0 = null;

        EObject lv_guards_18_0 = null;

        EObject lv_witnesses_20_0 = null;

        EObject lv_witnesses_21_0 = null;

        EObject lv_actions_23_0 = null;

        EObject lv_actions_24_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:723:28: ( ( () otherlv_1= 'event' ( (lv_name_2_0= ruleEString ) ) ( (lv_extended_3_0= 'extended' ) )? ( (lv_convergence_4_0= ruleConvergence ) )? (otherlv_5= '>' ( (lv_comment_6_0= ruleEString ) ) )? (otherlv_7= 'refines' ( ( ruleQString ) ) ( ( ruleEString ) )* )? (otherlv_10= 'when' ( (lv_guards_11_0= ruleGuard ) ) ( (lv_guards_12_0= ruleGuard ) )* )? (otherlv_13= 'any' ( (lv_parameters_14_0= ruleParameter ) ) ( (lv_parameters_15_0= ruleParameter ) )* otherlv_16= 'where' ( (lv_guards_17_0= ruleGuard ) ) ( (lv_guards_18_0= ruleGuard ) )* )? (otherlv_19= 'with' ( (lv_witnesses_20_0= ruleWitness ) ) ( (lv_witnesses_21_0= ruleWitness ) )* )? (otherlv_22= 'then' ( (lv_actions_23_0= ruleAction ) ) ( (lv_actions_24_0= ruleAction ) )* )? otherlv_25= 'end' ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:724:1: ( () otherlv_1= 'event' ( (lv_name_2_0= ruleEString ) ) ( (lv_extended_3_0= 'extended' ) )? ( (lv_convergence_4_0= ruleConvergence ) )? (otherlv_5= '>' ( (lv_comment_6_0= ruleEString ) ) )? (otherlv_7= 'refines' ( ( ruleQString ) ) ( ( ruleEString ) )* )? (otherlv_10= 'when' ( (lv_guards_11_0= ruleGuard ) ) ( (lv_guards_12_0= ruleGuard ) )* )? (otherlv_13= 'any' ( (lv_parameters_14_0= ruleParameter ) ) ( (lv_parameters_15_0= ruleParameter ) )* otherlv_16= 'where' ( (lv_guards_17_0= ruleGuard ) ) ( (lv_guards_18_0= ruleGuard ) )* )? (otherlv_19= 'with' ( (lv_witnesses_20_0= ruleWitness ) ) ( (lv_witnesses_21_0= ruleWitness ) )* )? (otherlv_22= 'then' ( (lv_actions_23_0= ruleAction ) ) ( (lv_actions_24_0= ruleAction ) )* )? otherlv_25= 'end' )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:724:1: ( () otherlv_1= 'event' ( (lv_name_2_0= ruleEString ) ) ( (lv_extended_3_0= 'extended' ) )? ( (lv_convergence_4_0= ruleConvergence ) )? (otherlv_5= '>' ( (lv_comment_6_0= ruleEString ) ) )? (otherlv_7= 'refines' ( ( ruleQString ) ) ( ( ruleEString ) )* )? (otherlv_10= 'when' ( (lv_guards_11_0= ruleGuard ) ) ( (lv_guards_12_0= ruleGuard ) )* )? (otherlv_13= 'any' ( (lv_parameters_14_0= ruleParameter ) ) ( (lv_parameters_15_0= ruleParameter ) )* otherlv_16= 'where' ( (lv_guards_17_0= ruleGuard ) ) ( (lv_guards_18_0= ruleGuard ) )* )? (otherlv_19= 'with' ( (lv_witnesses_20_0= ruleWitness ) ) ( (lv_witnesses_21_0= ruleWitness ) )* )? (otherlv_22= 'then' ( (lv_actions_23_0= ruleAction ) ) ( (lv_actions_24_0= ruleAction ) )* )? otherlv_25= 'end' )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:724:2: () otherlv_1= 'event' ( (lv_name_2_0= ruleEString ) ) ( (lv_extended_3_0= 'extended' ) )? ( (lv_convergence_4_0= ruleConvergence ) )? (otherlv_5= '>' ( (lv_comment_6_0= ruleEString ) ) )? (otherlv_7= 'refines' ( ( ruleQString ) ) ( ( ruleEString ) )* )? (otherlv_10= 'when' ( (lv_guards_11_0= ruleGuard ) ) ( (lv_guards_12_0= ruleGuard ) )* )? (otherlv_13= 'any' ( (lv_parameters_14_0= ruleParameter ) ) ( (lv_parameters_15_0= ruleParameter ) )* otherlv_16= 'where' ( (lv_guards_17_0= ruleGuard ) ) ( (lv_guards_18_0= ruleGuard ) )* )? (otherlv_19= 'with' ( (lv_witnesses_20_0= ruleWitness ) ) ( (lv_witnesses_21_0= ruleWitness ) )* )? (otherlv_22= 'then' ( (lv_actions_23_0= ruleAction ) ) ( (lv_actions_24_0= ruleAction ) )* )? otherlv_25= 'end'
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:724:2: ()
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:725:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEventAccess().getEventAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleevent1428); 

                	newLeafNode(otherlv_1, grammarAccess.getEventAccess().getEventKeyword_1());
                
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:734:1: ( (lv_name_2_0= ruleEString ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:735:1: (lv_name_2_0= ruleEString )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:735:1: (lv_name_2_0= ruleEString )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:736:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEventAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleevent1449);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEventRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:752:2: ( (lv_extended_3_0= 'extended' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==29) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:753:1: (lv_extended_3_0= 'extended' )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:753:1: (lv_extended_3_0= 'extended' )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:754:3: lv_extended_3_0= 'extended'
                    {
                    lv_extended_3_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleevent1467); 

                            newLeafNode(lv_extended_3_0, grammarAccess.getEventAccess().getExtendedExtendedKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEventRule());
                    	        }
                           		setWithLastConsumed(current, "extended", true, "extended");
                    	    

                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:767:3: ( (lv_convergence_4_0= ruleConvergence ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=55 && LA23_0<=57)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:768:1: (lv_convergence_4_0= ruleConvergence )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:768:1: (lv_convergence_4_0= ruleConvergence )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:769:3: lv_convergence_4_0= ruleConvergence
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getConvergenceConvergenceEnumRuleCall_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleConvergence_in_ruleevent1502);
                    lv_convergence_4_0=ruleConvergence();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	        }
                           		set(
                           			current, 
                           			"convergence",
                            		lv_convergence_4_0, 
                            		"Convergence");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:785:3: (otherlv_5= '>' ( (lv_comment_6_0= ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==12) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:785:5: otherlv_5= '>' ( (lv_comment_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleevent1516); 

                        	newLeafNode(otherlv_5, grammarAccess.getEventAccess().getGreaterThanSignKeyword_5_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:789:1: ( (lv_comment_6_0= ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:790:1: (lv_comment_6_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:790:1: (lv_comment_6_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:791:3: lv_comment_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getCommentEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleevent1537);
                    lv_comment_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	        }
                           		set(
                           			current, 
                           			"comment",
                            		lv_comment_6_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:807:4: (otherlv_7= 'refines' ( ( ruleQString ) ) ( ( ruleEString ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==13) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:807:6: otherlv_7= 'refines' ( ( ruleQString ) ) ( ( ruleEString ) )*
                    {
                    otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleevent1552); 

                        	newLeafNode(otherlv_7, grammarAccess.getEventAccess().getRefinesKeyword_6_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:811:1: ( ( ruleQString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:812:1: ( ruleQString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:812:1: ( ruleQString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:813:3: ruleQString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEventRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getRefinesEventCrossReference_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQString_in_ruleevent1575);
                    ruleQString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:826:2: ( ( ruleEString ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( ((LA25_0>=RULE_STRING && LA25_0<=RULE_ID)) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:827:1: ( ruleEString )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:827:1: ( ruleEString )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:828:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getEventRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getEventAccess().getRefinesEventCrossReference_6_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleevent1598);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:841:5: (otherlv_10= 'when' ( (lv_guards_11_0= ruleGuard ) ) ( (lv_guards_12_0= ruleGuard ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==30) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:841:7: otherlv_10= 'when' ( (lv_guards_11_0= ruleGuard ) ) ( (lv_guards_12_0= ruleGuard ) )*
                    {
                    otherlv_10=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleevent1614); 

                        	newLeafNode(otherlv_10, grammarAccess.getEventAccess().getWhenKeyword_7_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:845:1: ( (lv_guards_11_0= ruleGuard ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:846:1: (lv_guards_11_0= ruleGuard )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:846:1: (lv_guards_11_0= ruleGuard )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:847:3: lv_guards_11_0= ruleGuard
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getGuardsGuardParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleGuard_in_ruleevent1635);
                    lv_guards_11_0=ruleGuard();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	        }
                           		add(
                           			current, 
                           			"guards",
                            		lv_guards_11_0, 
                            		"Guard");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:863:2: ( (lv_guards_12_0= ruleGuard ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==24) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:864:1: (lv_guards_12_0= ruleGuard )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:864:1: (lv_guards_12_0= ruleGuard )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:865:3: lv_guards_12_0= ruleGuard
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEventAccess().getGuardsGuardParserRuleCall_7_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleGuard_in_ruleevent1656);
                    	    lv_guards_12_0=ruleGuard();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"guards",
                    	            		lv_guards_12_0, 
                    	            		"Guard");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:881:5: (otherlv_13= 'any' ( (lv_parameters_14_0= ruleParameter ) ) ( (lv_parameters_15_0= ruleParameter ) )* otherlv_16= 'where' ( (lv_guards_17_0= ruleGuard ) ) ( (lv_guards_18_0= ruleGuard ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==31) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:881:7: otherlv_13= 'any' ( (lv_parameters_14_0= ruleParameter ) ) ( (lv_parameters_15_0= ruleParameter ) )* otherlv_16= 'where' ( (lv_guards_17_0= ruleGuard ) ) ( (lv_guards_18_0= ruleGuard ) )*
                    {
                    otherlv_13=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleevent1672); 

                        	newLeafNode(otherlv_13, grammarAccess.getEventAccess().getAnyKeyword_8_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:885:1: ( (lv_parameters_14_0= ruleParameter ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:886:1: (lv_parameters_14_0= ruleParameter )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:886:1: (lv_parameters_14_0= ruleParameter )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:887:3: lv_parameters_14_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getParametersParameterParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleevent1693);
                    lv_parameters_14_0=ruleParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	        }
                           		add(
                           			current, 
                           			"parameters",
                            		lv_parameters_14_0, 
                            		"Parameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:903:2: ( (lv_parameters_15_0= ruleParameter ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( ((LA29_0>=RULE_STRING && LA29_0<=RULE_ID)) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:904:1: (lv_parameters_15_0= ruleParameter )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:904:1: (lv_parameters_15_0= ruleParameter )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:905:3: lv_parameters_15_0= ruleParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEventAccess().getParametersParameterParserRuleCall_8_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleevent1714);
                    	    lv_parameters_15_0=ruleParameter();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameters",
                    	            		lv_parameters_15_0, 
                    	            		"Parameter");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleevent1727); 

                        	newLeafNode(otherlv_16, grammarAccess.getEventAccess().getWhereKeyword_8_3());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:925:1: ( (lv_guards_17_0= ruleGuard ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:926:1: (lv_guards_17_0= ruleGuard )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:926:1: (lv_guards_17_0= ruleGuard )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:927:3: lv_guards_17_0= ruleGuard
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getGuardsGuardParserRuleCall_8_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleGuard_in_ruleevent1748);
                    lv_guards_17_0=ruleGuard();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	        }
                           		add(
                           			current, 
                           			"guards",
                            		lv_guards_17_0, 
                            		"Guard");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:943:2: ( (lv_guards_18_0= ruleGuard ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==24) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:944:1: (lv_guards_18_0= ruleGuard )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:944:1: (lv_guards_18_0= ruleGuard )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:945:3: lv_guards_18_0= ruleGuard
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEventAccess().getGuardsGuardParserRuleCall_8_5_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleGuard_in_ruleevent1769);
                    	    lv_guards_18_0=ruleGuard();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"guards",
                    	            		lv_guards_18_0, 
                    	            		"Guard");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:961:5: (otherlv_19= 'with' ( (lv_witnesses_20_0= ruleWitness ) ) ( (lv_witnesses_21_0= ruleWitness ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==33) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:961:7: otherlv_19= 'with' ( (lv_witnesses_20_0= ruleWitness ) ) ( (lv_witnesses_21_0= ruleWitness ) )*
                    {
                    otherlv_19=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleevent1785); 

                        	newLeafNode(otherlv_19, grammarAccess.getEventAccess().getWithKeyword_9_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:965:1: ( (lv_witnesses_20_0= ruleWitness ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:966:1: (lv_witnesses_20_0= ruleWitness )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:966:1: (lv_witnesses_20_0= ruleWitness )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:967:3: lv_witnesses_20_0= ruleWitness
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getWitnessesWitnessParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleWitness_in_ruleevent1806);
                    lv_witnesses_20_0=ruleWitness();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	        }
                           		add(
                           			current, 
                           			"witnesses",
                            		lv_witnesses_20_0, 
                            		"Witness");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:983:2: ( (lv_witnesses_21_0= ruleWitness ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==24||LA32_0==36) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:984:1: (lv_witnesses_21_0= ruleWitness )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:984:1: (lv_witnesses_21_0= ruleWitness )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:985:3: lv_witnesses_21_0= ruleWitness
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEventAccess().getWitnessesWitnessParserRuleCall_9_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleWitness_in_ruleevent1827);
                    	    lv_witnesses_21_0=ruleWitness();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"witnesses",
                    	            		lv_witnesses_21_0, 
                    	            		"Witness");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1001:5: (otherlv_22= 'then' ( (lv_actions_23_0= ruleAction ) ) ( (lv_actions_24_0= ruleAction ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==34) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1001:7: otherlv_22= 'then' ( (lv_actions_23_0= ruleAction ) ) ( (lv_actions_24_0= ruleAction ) )*
                    {
                    otherlv_22=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleevent1843); 

                        	newLeafNode(otherlv_22, grammarAccess.getEventAccess().getThenKeyword_10_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1005:1: ( (lv_actions_23_0= ruleAction ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1006:1: (lv_actions_23_0= ruleAction )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1006:1: (lv_actions_23_0= ruleAction )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1007:3: lv_actions_23_0= ruleAction
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getActionsActionParserRuleCall_10_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAction_in_ruleevent1864);
                    lv_actions_23_0=ruleAction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	        }
                           		add(
                           			current, 
                           			"actions",
                            		lv_actions_23_0, 
                            		"Action");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1023:2: ( (lv_actions_24_0= ruleAction ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==24) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1024:1: (lv_actions_24_0= ruleAction )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1024:1: (lv_actions_24_0= ruleAction )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1025:3: lv_actions_24_0= ruleAction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEventAccess().getActionsActionParserRuleCall_10_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAction_in_ruleevent1885);
                    	    lv_actions_24_0=ruleAction();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"actions",
                    	            		lv_actions_24_0, 
                    	            		"Action");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_25=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleevent1900); 

                	newLeafNode(otherlv_25, grammarAccess.getEventAccess().getEndKeyword_11());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleevent"


    // $ANTLR start "entryRuleQString"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1053:1: entryRuleQString returns [String current=null] : iv_ruleQString= ruleQString EOF ;
    public final String entryRuleQString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQString = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1054:2: (iv_ruleQString= ruleQString EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1055:2: iv_ruleQString= ruleQString EOF
            {
             newCompositeNode(grammarAccess.getQStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQString_in_entryRuleQString1937);
            iv_ruleQString=ruleQString();

            state._fsp--;

             current =iv_ruleQString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQString1948); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQString"


    // $ANTLR start "ruleQString"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1062:1: ruleQString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | (this_ID_1= RULE_ID (kw= '\\u00B7' this_ID_3= RULE_ID )* ) ) ;
    public final AntlrDatatypeRuleToken ruleQString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;
        Token kw=null;
        Token this_ID_3=null;

         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1065:28: ( (this_STRING_0= RULE_STRING | (this_ID_1= RULE_ID (kw= '\\u00B7' this_ID_3= RULE_ID )* ) ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1066:1: (this_STRING_0= RULE_STRING | (this_ID_1= RULE_ID (kw= '\\u00B7' this_ID_3= RULE_ID )* ) )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1066:1: (this_STRING_0= RULE_STRING | (this_ID_1= RULE_ID (kw= '\\u00B7' this_ID_3= RULE_ID )* ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_STRING) ) {
                alt37=1;
            }
            else if ( (LA37_0==RULE_ID) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1066:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleQString1988); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getQStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1074:6: (this_ID_1= RULE_ID (kw= '\\u00B7' this_ID_3= RULE_ID )* )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1074:6: (this_ID_1= RULE_ID (kw= '\\u00B7' this_ID_3= RULE_ID )* )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1074:11: this_ID_1= RULE_ID (kw= '\\u00B7' this_ID_3= RULE_ID )*
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQString2015); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getQStringAccess().getIDTerminalRuleCall_1_0()); 
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1081:1: (kw= '\\u00B7' this_ID_3= RULE_ID )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==35) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1082:2: kw= '\\u00B7' this_ID_3= RULE_ID
                    	    {
                    	    kw=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleQString2034); 

                    	            current.merge(kw);
                    	            newLeafNode(kw, grammarAccess.getQStringAccess().getMiddleDotKeyword_1_1_0()); 
                    	        
                    	    this_ID_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQString2049); 

                    	    		current.merge(this_ID_3);
                    	        
                    	     
                    	        newLeafNode(this_ID_3, grammarAccess.getQStringAccess().getIDTerminalRuleCall_1_1_1()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQString"


    // $ANTLR start "entryRuleExtension"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1102:1: entryRuleExtension returns [EObject current=null] : iv_ruleExtension= ruleExtension EOF ;
    public final EObject entryRuleExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtension = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1103:2: (iv_ruleExtension= ruleExtension EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1104:2: iv_ruleExtension= ruleExtension EOF
            {
             newCompositeNode(grammarAccess.getExtensionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtension_in_entryRuleExtension2097);
            iv_ruleExtension=ruleExtension();

            state._fsp--;

             current =iv_ruleExtension; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExtension2107); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExtension"


    // $ANTLR start "ruleExtension"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1111:1: ruleExtension returns [EObject current=null] : () ;
    public final EObject ruleExtension() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1114:28: ( () )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1115:1: ()
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1115:1: ()
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1116:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getExtensionAccess().getExtensionAction(),
                        current);
                

            }


            }

             leaveRule(); 
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExtension"


    // $ANTLR start "entryRuleParameter"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1129:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1130:2: (iv_ruleParameter= ruleParameter EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1131:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParameter_in_entryRuleParameter2175);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameter2185); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1138:1: ruleParameter returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '>' ( (lv_comment_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_comment_3_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1141:28: ( ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '>' ( (lv_comment_3_0= ruleEString ) ) )? ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1142:1: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '>' ( (lv_comment_3_0= ruleEString ) ) )? )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1142:1: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '>' ( (lv_comment_3_0= ruleEString ) ) )? )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1142:2: () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '>' ( (lv_comment_3_0= ruleEString ) ) )?
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1142:2: ()
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1143:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getParameterAccess().getParameterAction_0(),
                        current);
                

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1148:2: ( (lv_name_1_0= ruleEString ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1149:1: (lv_name_1_0= ruleEString )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1149:1: (lv_name_1_0= ruleEString )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1150:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleParameter2240);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParameterRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1166:2: (otherlv_2= '>' ( (lv_comment_3_0= ruleEString ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==12) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1166:4: otherlv_2= '>' ( (lv_comment_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleParameter2253); 

                        	newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getGreaterThanSignKeyword_2_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1170:1: ( (lv_comment_3_0= ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1171:1: (lv_comment_3_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1171:1: (lv_comment_3_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1172:3: lv_comment_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterAccess().getCommentEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleParameter2274);
                    lv_comment_3_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameterRule());
                    	        }
                           		set(
                           			current, 
                           			"comment",
                            		lv_comment_3_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleGuard"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1196:1: entryRuleGuard returns [EObject current=null] : iv_ruleGuard= ruleGuard EOF ;
    public final EObject entryRuleGuard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuard = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1197:2: (iv_ruleGuard= ruleGuard EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1198:2: iv_ruleGuard= ruleGuard EOF
            {
             newCompositeNode(grammarAccess.getGuardRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGuard_in_entryRuleGuard2312);
            iv_ruleGuard=ruleGuard();

            state._fsp--;

             current =iv_ruleGuard; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGuard2322); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGuard"


    // $ANTLR start "ruleGuard"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1205:1: ruleGuard returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_predicate_2_0= ruleEString ) )? ( (lv_theorem_3_0= 'theorem' ) )? (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? ) ;
    public final EObject ruleGuard() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_theorem_3_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_predicate_2_0 = null;

        AntlrDatatypeRuleToken lv_comment_5_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1208:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_predicate_2_0= ruleEString ) )? ( (lv_theorem_3_0= 'theorem' ) )? (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1209:1: (otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_predicate_2_0= ruleEString ) )? ( (lv_theorem_3_0= 'theorem' ) )? (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1209:1: (otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_predicate_2_0= ruleEString ) )? ( (lv_theorem_3_0= 'theorem' ) )? (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1209:3: otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_predicate_2_0= ruleEString ) )? ( (lv_theorem_3_0= 'theorem' ) )? (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleGuard2359); 

                	newLeafNode(otherlv_0, grammarAccess.getGuardAccess().getCommercialAtKeyword_0());
                
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1213:1: ( (lv_name_1_0= ruleEString ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1214:1: (lv_name_1_0= ruleEString )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1214:1: (lv_name_1_0= ruleEString )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1215:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getGuardAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGuard2380);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGuardRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1231:2: ( (lv_predicate_2_0= ruleEString ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=RULE_STRING && LA39_0<=RULE_ID)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1232:1: (lv_predicate_2_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1232:1: (lv_predicate_2_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1233:3: lv_predicate_2_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getGuardAccess().getPredicateEStringParserRuleCall_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGuard2401);
                    lv_predicate_2_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGuardRule());
                    	        }
                           		set(
                           			current, 
                           			"predicate",
                            		lv_predicate_2_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1249:3: ( (lv_theorem_3_0= 'theorem' ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==25) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1250:1: (lv_theorem_3_0= 'theorem' )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1250:1: (lv_theorem_3_0= 'theorem' )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1251:3: lv_theorem_3_0= 'theorem'
                    {
                    lv_theorem_3_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleGuard2420); 

                            newLeafNode(lv_theorem_3_0, grammarAccess.getGuardAccess().getTheoremTheoremKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGuardRule());
                    	        }
                           		setWithLastConsumed(current, "theorem", true, "theorem");
                    	    

                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1264:3: (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==12) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1264:5: otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleGuard2447); 

                        	newLeafNode(otherlv_4, grammarAccess.getGuardAccess().getGreaterThanSignKeyword_4_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1268:1: ( (lv_comment_5_0= ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1269:1: (lv_comment_5_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1269:1: (lv_comment_5_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1270:3: lv_comment_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getGuardAccess().getCommentEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGuard2468);
                    lv_comment_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGuardRule());
                    	        }
                           		set(
                           			current, 
                           			"comment",
                            		lv_comment_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGuard"


    // $ANTLR start "entryRuleWitness"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1294:1: entryRuleWitness returns [EObject current=null] : iv_ruleWitness= ruleWitness EOF ;
    public final EObject entryRuleWitness() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWitness = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1295:2: (iv_ruleWitness= ruleWitness EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1296:2: iv_ruleWitness= ruleWitness EOF
            {
             newCompositeNode(grammarAccess.getWitnessRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWitness_in_entryRuleWitness2506);
            iv_ruleWitness=ruleWitness();

            state._fsp--;

             current =iv_ruleWitness; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWitness2516); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWitness"


    // $ANTLR start "ruleWitness"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1303:1: ruleWitness returns [EObject current=null] : ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= '@' ( (lv_name_2_0= ruleEString ) ) ( (lv_predicate_3_0= ruleEString ) )? (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? ) ;
    public final EObject ruleWitness() throws RecognitionException {
        EObject current = null;

        Token lv_localGenerated_0_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_predicate_3_0 = null;

        AntlrDatatypeRuleToken lv_comment_5_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1306:28: ( ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= '@' ( (lv_name_2_0= ruleEString ) ) ( (lv_predicate_3_0= ruleEString ) )? (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1307:1: ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= '@' ( (lv_name_2_0= ruleEString ) ) ( (lv_predicate_3_0= ruleEString ) )? (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1307:1: ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= '@' ( (lv_name_2_0= ruleEString ) ) ( (lv_predicate_3_0= ruleEString ) )? (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1307:2: ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= '@' ( (lv_name_2_0= ruleEString ) ) ( (lv_predicate_3_0= ruleEString ) )? (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )?
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1307:2: ( (lv_localGenerated_0_0= 'localGenerated' ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==36) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1308:1: (lv_localGenerated_0_0= 'localGenerated' )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1308:1: (lv_localGenerated_0_0= 'localGenerated' )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1309:3: lv_localGenerated_0_0= 'localGenerated'
                    {
                    lv_localGenerated_0_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleWitness2559); 

                            newLeafNode(lv_localGenerated_0_0, grammarAccess.getWitnessAccess().getLocalGeneratedLocalGeneratedKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWitnessRule());
                    	        }
                           		setWithLastConsumed(current, "localGenerated", true, "localGenerated");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleWitness2585); 

                	newLeafNode(otherlv_1, grammarAccess.getWitnessAccess().getCommercialAtKeyword_1());
                
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1326:1: ( (lv_name_2_0= ruleEString ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1327:1: (lv_name_2_0= ruleEString )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1327:1: (lv_name_2_0= ruleEString )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1328:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getWitnessAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleWitness2606);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWitnessRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1344:2: ( (lv_predicate_3_0= ruleEString ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=RULE_STRING && LA43_0<=RULE_ID)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1345:1: (lv_predicate_3_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1345:1: (lv_predicate_3_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1346:3: lv_predicate_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getWitnessAccess().getPredicateEStringParserRuleCall_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleWitness2627);
                    lv_predicate_3_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWitnessRule());
                    	        }
                           		set(
                           			current, 
                           			"predicate",
                            		lv_predicate_3_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1362:3: (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==12) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1362:5: otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleWitness2641); 

                        	newLeafNode(otherlv_4, grammarAccess.getWitnessAccess().getGreaterThanSignKeyword_4_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1366:1: ( (lv_comment_5_0= ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1367:1: (lv_comment_5_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1367:1: (lv_comment_5_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1368:3: lv_comment_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getWitnessAccess().getCommentEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleWitness2662);
                    lv_comment_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWitnessRule());
                    	        }
                           		set(
                           			current, 
                           			"comment",
                            		lv_comment_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWitness"


    // $ANTLR start "entryRuleAction"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1392:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1393:2: (iv_ruleAction= ruleAction EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1394:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAction_in_entryRuleAction2700);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAction2710); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1401:1: ruleAction returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_action_2_0= ruleEString ) )? (otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) ) )? ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_action_2_0 = null;

        AntlrDatatypeRuleToken lv_comment_4_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1404:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_action_2_0= ruleEString ) )? (otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) ) )? ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1405:1: (otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_action_2_0= ruleEString ) )? (otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) ) )? )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1405:1: (otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_action_2_0= ruleEString ) )? (otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) ) )? )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1405:3: otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_action_2_0= ruleEString ) )? (otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleAction2747); 

                	newLeafNode(otherlv_0, grammarAccess.getActionAccess().getCommercialAtKeyword_0());
                
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1409:1: ( (lv_name_1_0= ruleEString ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1410:1: (lv_name_1_0= ruleEString )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1410:1: (lv_name_1_0= ruleEString )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1411:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getActionAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAction2768);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActionRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1427:2: ( (lv_action_2_0= ruleEString ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=RULE_STRING && LA45_0<=RULE_ID)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1428:1: (lv_action_2_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1428:1: (lv_action_2_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1429:3: lv_action_2_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getActionEStringParserRuleCall_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAction2789);
                    lv_action_2_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionRule());
                    	        }
                           		set(
                           			current, 
                           			"action",
                            		lv_action_2_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1445:3: (otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==12) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1445:5: otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAction2803); 

                        	newLeafNode(otherlv_3, grammarAccess.getActionAccess().getGreaterThanSignKeyword_3_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1449:1: ( (lv_comment_4_0= ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1450:1: (lv_comment_4_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1450:1: (lv_comment_4_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1451:3: lv_comment_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getCommentEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAction2824);
                    lv_comment_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionRule());
                    	        }
                           		set(
                           			current, 
                           			"comment",
                            		lv_comment_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleStatemachine"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1475:1: entryRuleStatemachine returns [EObject current=null] : iv_ruleStatemachine= ruleStatemachine EOF ;
    public final EObject entryRuleStatemachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatemachine = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1476:2: (iv_ruleStatemachine= ruleStatemachine EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1477:2: iv_ruleStatemachine= ruleStatemachine EOF
            {
             newCompositeNode(grammarAccess.getStatemachineRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStatemachine_in_entryRuleStatemachine2862);
            iv_ruleStatemachine=ruleStatemachine();

            state._fsp--;

             current =iv_ruleStatemachine; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStatemachine2872); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatemachine"


    // $ANTLR start "ruleStatemachine"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1484:1: ruleStatemachine returns [EObject current=null] : (otherlv_0= 'Statemachine' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '>' ( (lv_comment_3_0= ruleEString ) ) )? (otherlv_4= 'translation' ( (lv_translation_5_0= ruleTranslationKind ) ) )? (otherlv_6= 'elaborates' ( ( ruleEString ) ) )? (otherlv_8= 'refines' ( ( ruleEString ) ) )? (otherlv_10= 'nodes' ( (lv_nodes_11_0= ruleAbstractNode ) ) (otherlv_12= ',' ( (lv_nodes_13_0= ruleAbstractNode ) ) )* )? (otherlv_14= 'transitions' ( (lv_transitions_15_0= ruleTransition ) ) ( (lv_transitions_16_0= ruleTransition ) )* )? otherlv_17= 'end' ) ;
    public final EObject ruleStatemachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_comment_3_0 = null;

        Enumerator lv_translation_5_0 = null;

        EObject lv_nodes_11_0 = null;

        EObject lv_nodes_13_0 = null;

        EObject lv_transitions_15_0 = null;

        EObject lv_transitions_16_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1487:28: ( (otherlv_0= 'Statemachine' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '>' ( (lv_comment_3_0= ruleEString ) ) )? (otherlv_4= 'translation' ( (lv_translation_5_0= ruleTranslationKind ) ) )? (otherlv_6= 'elaborates' ( ( ruleEString ) ) )? (otherlv_8= 'refines' ( ( ruleEString ) ) )? (otherlv_10= 'nodes' ( (lv_nodes_11_0= ruleAbstractNode ) ) (otherlv_12= ',' ( (lv_nodes_13_0= ruleAbstractNode ) ) )* )? (otherlv_14= 'transitions' ( (lv_transitions_15_0= ruleTransition ) ) ( (lv_transitions_16_0= ruleTransition ) )* )? otherlv_17= 'end' ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1488:1: (otherlv_0= 'Statemachine' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '>' ( (lv_comment_3_0= ruleEString ) ) )? (otherlv_4= 'translation' ( (lv_translation_5_0= ruleTranslationKind ) ) )? (otherlv_6= 'elaborates' ( ( ruleEString ) ) )? (otherlv_8= 'refines' ( ( ruleEString ) ) )? (otherlv_10= 'nodes' ( (lv_nodes_11_0= ruleAbstractNode ) ) (otherlv_12= ',' ( (lv_nodes_13_0= ruleAbstractNode ) ) )* )? (otherlv_14= 'transitions' ( (lv_transitions_15_0= ruleTransition ) ) ( (lv_transitions_16_0= ruleTransition ) )* )? otherlv_17= 'end' )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1488:1: (otherlv_0= 'Statemachine' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '>' ( (lv_comment_3_0= ruleEString ) ) )? (otherlv_4= 'translation' ( (lv_translation_5_0= ruleTranslationKind ) ) )? (otherlv_6= 'elaborates' ( ( ruleEString ) ) )? (otherlv_8= 'refines' ( ( ruleEString ) ) )? (otherlv_10= 'nodes' ( (lv_nodes_11_0= ruleAbstractNode ) ) (otherlv_12= ',' ( (lv_nodes_13_0= ruleAbstractNode ) ) )* )? (otherlv_14= 'transitions' ( (lv_transitions_15_0= ruleTransition ) ) ( (lv_transitions_16_0= ruleTransition ) )* )? otherlv_17= 'end' )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1488:3: otherlv_0= 'Statemachine' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '>' ( (lv_comment_3_0= ruleEString ) ) )? (otherlv_4= 'translation' ( (lv_translation_5_0= ruleTranslationKind ) ) )? (otherlv_6= 'elaborates' ( ( ruleEString ) ) )? (otherlv_8= 'refines' ( ( ruleEString ) ) )? (otherlv_10= 'nodes' ( (lv_nodes_11_0= ruleAbstractNode ) ) (otherlv_12= ',' ( (lv_nodes_13_0= ruleAbstractNode ) ) )* )? (otherlv_14= 'transitions' ( (lv_transitions_15_0= ruleTransition ) ) ( (lv_transitions_16_0= ruleTransition ) )* )? otherlv_17= 'end'
            {
            otherlv_0=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleStatemachine2909); 

                	newLeafNode(otherlv_0, grammarAccess.getStatemachineAccess().getStatemachineKeyword_0());
                
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1492:1: ( (lv_name_1_0= ruleEString ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1493:1: (lv_name_1_0= ruleEString )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1493:1: (lv_name_1_0= ruleEString )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1494:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStatemachineAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStatemachine2930);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStatemachineRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1510:2: (otherlv_2= '>' ( (lv_comment_3_0= ruleEString ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==12) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1510:4: otherlv_2= '>' ( (lv_comment_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleStatemachine2943); 

                        	newLeafNode(otherlv_2, grammarAccess.getStatemachineAccess().getGreaterThanSignKeyword_2_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1514:1: ( (lv_comment_3_0= ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1515:1: (lv_comment_3_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1515:1: (lv_comment_3_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1516:3: lv_comment_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getStatemachineAccess().getCommentEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStatemachine2964);
                    lv_comment_3_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStatemachineRule());
                    	        }
                           		set(
                           			current, 
                           			"comment",
                            		lv_comment_3_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1532:4: (otherlv_4= 'translation' ( (lv_translation_5_0= ruleTranslationKind ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==38) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1532:6: otherlv_4= 'translation' ( (lv_translation_5_0= ruleTranslationKind ) )
                    {
                    otherlv_4=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleStatemachine2979); 

                        	newLeafNode(otherlv_4, grammarAccess.getStatemachineAccess().getTranslationKeyword_3_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1536:1: ( (lv_translation_5_0= ruleTranslationKind ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1537:1: (lv_translation_5_0= ruleTranslationKind )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1537:1: (lv_translation_5_0= ruleTranslationKind )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1538:3: lv_translation_5_0= ruleTranslationKind
                    {
                     
                    	        newCompositeNode(grammarAccess.getStatemachineAccess().getTranslationTranslationKindEnumRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTranslationKind_in_ruleStatemachine3000);
                    lv_translation_5_0=ruleTranslationKind();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStatemachineRule());
                    	        }
                           		set(
                           			current, 
                           			"translation",
                            		lv_translation_5_0, 
                            		"TranslationKind");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1554:4: (otherlv_6= 'elaborates' ( ( ruleEString ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==39) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1554:6: otherlv_6= 'elaborates' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleStatemachine3015); 

                        	newLeafNode(otherlv_6, grammarAccess.getStatemachineAccess().getElaboratesKeyword_4_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1558:1: ( ( ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1559:1: ( ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1559:1: ( ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1560:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStatemachineRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getStatemachineAccess().getElaboratesEventBNamedCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStatemachine3038);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1573:4: (otherlv_8= 'refines' ( ( ruleEString ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==13) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1573:6: otherlv_8= 'refines' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleStatemachine3053); 

                        	newLeafNode(otherlv_8, grammarAccess.getStatemachineAccess().getRefinesKeyword_5_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1577:1: ( ( ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1578:1: ( ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1578:1: ( ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1579:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStatemachineRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getStatemachineAccess().getRefinesStatemachineCrossReference_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStatemachine3076);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1592:4: (otherlv_10= 'nodes' ( (lv_nodes_11_0= ruleAbstractNode ) ) (otherlv_12= ',' ( (lv_nodes_13_0= ruleAbstractNode ) ) )* )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==40) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1592:6: otherlv_10= 'nodes' ( (lv_nodes_11_0= ruleAbstractNode ) ) (otherlv_12= ',' ( (lv_nodes_13_0= ruleAbstractNode ) ) )*
                    {
                    otherlv_10=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleStatemachine3091); 

                        	newLeafNode(otherlv_10, grammarAccess.getStatemachineAccess().getNodesKeyword_6_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1596:1: ( (lv_nodes_11_0= ruleAbstractNode ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1597:1: (lv_nodes_11_0= ruleAbstractNode )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1597:1: (lv_nodes_11_0= ruleAbstractNode )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1598:3: lv_nodes_11_0= ruleAbstractNode
                    {
                     
                    	        newCompositeNode(grammarAccess.getStatemachineAccess().getNodesAbstractNodeParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractNode_in_ruleStatemachine3112);
                    lv_nodes_11_0=ruleAbstractNode();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStatemachineRule());
                    	        }
                           		add(
                           			current, 
                           			"nodes",
                            		lv_nodes_11_0, 
                            		"AbstractNode");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1614:2: (otherlv_12= ',' ( (lv_nodes_13_0= ruleAbstractNode ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==17) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1614:4: otherlv_12= ',' ( (lv_nodes_13_0= ruleAbstractNode ) )
                    	    {
                    	    otherlv_12=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleStatemachine3125); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getStatemachineAccess().getCommaKeyword_6_2_0());
                    	        
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1618:1: ( (lv_nodes_13_0= ruleAbstractNode ) )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1619:1: (lv_nodes_13_0= ruleAbstractNode )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1619:1: (lv_nodes_13_0= ruleAbstractNode )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1620:3: lv_nodes_13_0= ruleAbstractNode
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStatemachineAccess().getNodesAbstractNodeParserRuleCall_6_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractNode_in_ruleStatemachine3146);
                    	    lv_nodes_13_0=ruleAbstractNode();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStatemachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"nodes",
                    	            		lv_nodes_13_0, 
                    	            		"AbstractNode");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1636:6: (otherlv_14= 'transitions' ( (lv_transitions_15_0= ruleTransition ) ) ( (lv_transitions_16_0= ruleTransition ) )* )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==41) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1636:8: otherlv_14= 'transitions' ( (lv_transitions_15_0= ruleTransition ) ) ( (lv_transitions_16_0= ruleTransition ) )*
                    {
                    otherlv_14=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleStatemachine3163); 

                        	newLeafNode(otherlv_14, grammarAccess.getStatemachineAccess().getTransitionsKeyword_7_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1640:1: ( (lv_transitions_15_0= ruleTransition ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1641:1: (lv_transitions_15_0= ruleTransition )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1641:1: (lv_transitions_15_0= ruleTransition )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1642:3: lv_transitions_15_0= ruleTransition
                    {
                     
                    	        newCompositeNode(grammarAccess.getStatemachineAccess().getTransitionsTransitionParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTransition_in_ruleStatemachine3184);
                    lv_transitions_15_0=ruleTransition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStatemachineRule());
                    	        }
                           		add(
                           			current, 
                           			"transitions",
                            		lv_transitions_15_0, 
                            		"Transition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1658:2: ( (lv_transitions_16_0= ruleTransition ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==29||LA53_0==42) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1659:1: (lv_transitions_16_0= ruleTransition )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1659:1: (lv_transitions_16_0= ruleTransition )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1660:3: lv_transitions_16_0= ruleTransition
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStatemachineAccess().getTransitionsTransitionParserRuleCall_7_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTransition_in_ruleStatemachine3205);
                    	    lv_transitions_16_0=ruleTransition();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStatemachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"transitions",
                    	            		lv_transitions_16_0, 
                    	            		"Transition");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_17=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleStatemachine3220); 

                	newLeafNode(otherlv_17, grammarAccess.getStatemachineAccess().getEndKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatemachine"


    // $ANTLR start "entryRuleTransition"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1688:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1689:2: (iv_ruleTransition= ruleTransition EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1690:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransition_in_entryRuleTransition3256);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransition3266); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1697:1: ruleTransition returns [EObject current=null] : ( () ( (lv_extended_1_0= 'extended' ) )? otherlv_2= 'Transition' (otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) ) )? (otherlv_5= 'elaborates' ( ( ruleEString ) ) ( ( ruleEString ) )* )? (otherlv_8= 'target' ( ( ruleEString ) ) )? (otherlv_10= 'source' ( ( ruleEString ) ) )? (otherlv_12= 'when' ( (lv_guards_13_0= ruleGuard ) ) ( (lv_guards_14_0= ruleGuard ) )* )? (otherlv_15= 'any' ( (lv_parameters_16_0= ruleTypedParameter ) ) ( (lv_parameters_17_0= ruleTypedParameter ) )* otherlv_18= 'where' ( (lv_guards_19_0= ruleGuard ) ) ( (lv_guards_20_0= ruleGuard ) )* )? (otherlv_21= 'with' ( (lv_witnesses_22_0= ruleWitness ) ) ( (lv_witnesses_23_0= ruleWitness ) )* )? (otherlv_24= 'then' ( (lv_actions_25_0= ruleAction ) ) ( (lv_actions_26_0= ruleAction ) )* )? otherlv_27= 'end' ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token lv_extended_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        Token otherlv_18=null;
        Token otherlv_21=null;
        Token otherlv_24=null;
        Token otherlv_27=null;
        AntlrDatatypeRuleToken lv_comment_4_0 = null;

        EObject lv_guards_13_0 = null;

        EObject lv_guards_14_0 = null;

        EObject lv_parameters_16_0 = null;

        EObject lv_parameters_17_0 = null;

        EObject lv_guards_19_0 = null;

        EObject lv_guards_20_0 = null;

        EObject lv_witnesses_22_0 = null;

        EObject lv_witnesses_23_0 = null;

        EObject lv_actions_25_0 = null;

        EObject lv_actions_26_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1700:28: ( ( () ( (lv_extended_1_0= 'extended' ) )? otherlv_2= 'Transition' (otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) ) )? (otherlv_5= 'elaborates' ( ( ruleEString ) ) ( ( ruleEString ) )* )? (otherlv_8= 'target' ( ( ruleEString ) ) )? (otherlv_10= 'source' ( ( ruleEString ) ) )? (otherlv_12= 'when' ( (lv_guards_13_0= ruleGuard ) ) ( (lv_guards_14_0= ruleGuard ) )* )? (otherlv_15= 'any' ( (lv_parameters_16_0= ruleTypedParameter ) ) ( (lv_parameters_17_0= ruleTypedParameter ) )* otherlv_18= 'where' ( (lv_guards_19_0= ruleGuard ) ) ( (lv_guards_20_0= ruleGuard ) )* )? (otherlv_21= 'with' ( (lv_witnesses_22_0= ruleWitness ) ) ( (lv_witnesses_23_0= ruleWitness ) )* )? (otherlv_24= 'then' ( (lv_actions_25_0= ruleAction ) ) ( (lv_actions_26_0= ruleAction ) )* )? otherlv_27= 'end' ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1701:1: ( () ( (lv_extended_1_0= 'extended' ) )? otherlv_2= 'Transition' (otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) ) )? (otherlv_5= 'elaborates' ( ( ruleEString ) ) ( ( ruleEString ) )* )? (otherlv_8= 'target' ( ( ruleEString ) ) )? (otherlv_10= 'source' ( ( ruleEString ) ) )? (otherlv_12= 'when' ( (lv_guards_13_0= ruleGuard ) ) ( (lv_guards_14_0= ruleGuard ) )* )? (otherlv_15= 'any' ( (lv_parameters_16_0= ruleTypedParameter ) ) ( (lv_parameters_17_0= ruleTypedParameter ) )* otherlv_18= 'where' ( (lv_guards_19_0= ruleGuard ) ) ( (lv_guards_20_0= ruleGuard ) )* )? (otherlv_21= 'with' ( (lv_witnesses_22_0= ruleWitness ) ) ( (lv_witnesses_23_0= ruleWitness ) )* )? (otherlv_24= 'then' ( (lv_actions_25_0= ruleAction ) ) ( (lv_actions_26_0= ruleAction ) )* )? otherlv_27= 'end' )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1701:1: ( () ( (lv_extended_1_0= 'extended' ) )? otherlv_2= 'Transition' (otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) ) )? (otherlv_5= 'elaborates' ( ( ruleEString ) ) ( ( ruleEString ) )* )? (otherlv_8= 'target' ( ( ruleEString ) ) )? (otherlv_10= 'source' ( ( ruleEString ) ) )? (otherlv_12= 'when' ( (lv_guards_13_0= ruleGuard ) ) ( (lv_guards_14_0= ruleGuard ) )* )? (otherlv_15= 'any' ( (lv_parameters_16_0= ruleTypedParameter ) ) ( (lv_parameters_17_0= ruleTypedParameter ) )* otherlv_18= 'where' ( (lv_guards_19_0= ruleGuard ) ) ( (lv_guards_20_0= ruleGuard ) )* )? (otherlv_21= 'with' ( (lv_witnesses_22_0= ruleWitness ) ) ( (lv_witnesses_23_0= ruleWitness ) )* )? (otherlv_24= 'then' ( (lv_actions_25_0= ruleAction ) ) ( (lv_actions_26_0= ruleAction ) )* )? otherlv_27= 'end' )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1701:2: () ( (lv_extended_1_0= 'extended' ) )? otherlv_2= 'Transition' (otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) ) )? (otherlv_5= 'elaborates' ( ( ruleEString ) ) ( ( ruleEString ) )* )? (otherlv_8= 'target' ( ( ruleEString ) ) )? (otherlv_10= 'source' ( ( ruleEString ) ) )? (otherlv_12= 'when' ( (lv_guards_13_0= ruleGuard ) ) ( (lv_guards_14_0= ruleGuard ) )* )? (otherlv_15= 'any' ( (lv_parameters_16_0= ruleTypedParameter ) ) ( (lv_parameters_17_0= ruleTypedParameter ) )* otherlv_18= 'where' ( (lv_guards_19_0= ruleGuard ) ) ( (lv_guards_20_0= ruleGuard ) )* )? (otherlv_21= 'with' ( (lv_witnesses_22_0= ruleWitness ) ) ( (lv_witnesses_23_0= ruleWitness ) )* )? (otherlv_24= 'then' ( (lv_actions_25_0= ruleAction ) ) ( (lv_actions_26_0= ruleAction ) )* )? otherlv_27= 'end'
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1701:2: ()
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1702:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTransitionAccess().getTransitionAction_0(),
                        current);
                

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1707:2: ( (lv_extended_1_0= 'extended' ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==29) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1708:1: (lv_extended_1_0= 'extended' )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1708:1: (lv_extended_1_0= 'extended' )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1709:3: lv_extended_1_0= 'extended'
                    {
                    lv_extended_1_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleTransition3318); 

                            newLeafNode(lv_extended_1_0, grammarAccess.getTransitionAccess().getExtendedExtendedKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                           		setWithLastConsumed(current, "extended", true, "extended");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleTransition3344); 

                	newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getTransitionKeyword_2());
                
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1726:1: (otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==12) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1726:3: otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTransition3357); 

                        	newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getGreaterThanSignKeyword_3_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1730:1: ( (lv_comment_4_0= ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1731:1: (lv_comment_4_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1731:1: (lv_comment_4_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1732:3: lv_comment_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getTransitionAccess().getCommentEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransition3378);
                    lv_comment_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                    	        }
                           		set(
                           			current, 
                           			"comment",
                            		lv_comment_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1748:4: (otherlv_5= 'elaborates' ( ( ruleEString ) ) ( ( ruleEString ) )* )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==39) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1748:6: otherlv_5= 'elaborates' ( ( ruleEString ) ) ( ( ruleEString ) )*
                    {
                    otherlv_5=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleTransition3393); 

                        	newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getElaboratesKeyword_4_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1752:1: ( ( ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1753:1: ( ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1753:1: ( ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1754:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getTransitionAccess().getElaboratesEventCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransition3416);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1767:2: ( ( ruleEString ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( ((LA57_0>=RULE_STRING && LA57_0<=RULE_ID)) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1768:1: ( ruleEString )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1768:1: ( ruleEString )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1769:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getTransitionAccess().getElaboratesEventCrossReference_4_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransition3439);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1782:5: (otherlv_8= 'target' ( ( ruleEString ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==43) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1782:7: otherlv_8= 'target' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleTransition3455); 

                        	newLeafNode(otherlv_8, grammarAccess.getTransitionAccess().getTargetKeyword_5_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1786:1: ( ( ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1787:1: ( ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1787:1: ( ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1788:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getTransitionAccess().getTargetAbstractNodeCrossReference_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransition3478);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1801:4: (otherlv_10= 'source' ( ( ruleEString ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==44) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1801:6: otherlv_10= 'source' ( ( ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleTransition3493); 

                        	newLeafNode(otherlv_10, grammarAccess.getTransitionAccess().getSourceKeyword_6_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1805:1: ( ( ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1806:1: ( ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1806:1: ( ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1807:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getTransitionAccess().getSourceAbstractNodeCrossReference_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransition3516);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1820:4: (otherlv_12= 'when' ( (lv_guards_13_0= ruleGuard ) ) ( (lv_guards_14_0= ruleGuard ) )* )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==30) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1820:6: otherlv_12= 'when' ( (lv_guards_13_0= ruleGuard ) ) ( (lv_guards_14_0= ruleGuard ) )*
                    {
                    otherlv_12=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleTransition3531); 

                        	newLeafNode(otherlv_12, grammarAccess.getTransitionAccess().getWhenKeyword_7_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1824:1: ( (lv_guards_13_0= ruleGuard ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1825:1: (lv_guards_13_0= ruleGuard )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1825:1: (lv_guards_13_0= ruleGuard )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1826:3: lv_guards_13_0= ruleGuard
                    {
                     
                    	        newCompositeNode(grammarAccess.getTransitionAccess().getGuardsGuardParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleGuard_in_ruleTransition3552);
                    lv_guards_13_0=ruleGuard();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                    	        }
                           		add(
                           			current, 
                           			"guards",
                            		lv_guards_13_0, 
                            		"Guard");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1842:2: ( (lv_guards_14_0= ruleGuard ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==24) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1843:1: (lv_guards_14_0= ruleGuard )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1843:1: (lv_guards_14_0= ruleGuard )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1844:3: lv_guards_14_0= ruleGuard
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTransitionAccess().getGuardsGuardParserRuleCall_7_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleGuard_in_ruleTransition3573);
                    	    lv_guards_14_0=ruleGuard();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"guards",
                    	            		lv_guards_14_0, 
                    	            		"Guard");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1860:5: (otherlv_15= 'any' ( (lv_parameters_16_0= ruleTypedParameter ) ) ( (lv_parameters_17_0= ruleTypedParameter ) )* otherlv_18= 'where' ( (lv_guards_19_0= ruleGuard ) ) ( (lv_guards_20_0= ruleGuard ) )* )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==31) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1860:7: otherlv_15= 'any' ( (lv_parameters_16_0= ruleTypedParameter ) ) ( (lv_parameters_17_0= ruleTypedParameter ) )* otherlv_18= 'where' ( (lv_guards_19_0= ruleGuard ) ) ( (lv_guards_20_0= ruleGuard ) )*
                    {
                    otherlv_15=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleTransition3589); 

                        	newLeafNode(otherlv_15, grammarAccess.getTransitionAccess().getAnyKeyword_8_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1864:1: ( (lv_parameters_16_0= ruleTypedParameter ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1865:1: (lv_parameters_16_0= ruleTypedParameter )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1865:1: (lv_parameters_16_0= ruleTypedParameter )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1866:3: lv_parameters_16_0= ruleTypedParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getTransitionAccess().getParametersTypedParameterParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTypedParameter_in_ruleTransition3610);
                    lv_parameters_16_0=ruleTypedParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                    	        }
                           		add(
                           			current, 
                           			"parameters",
                            		lv_parameters_16_0, 
                            		"TypedParameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1882:2: ( (lv_parameters_17_0= ruleTypedParameter ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==53) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1883:1: (lv_parameters_17_0= ruleTypedParameter )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1883:1: (lv_parameters_17_0= ruleTypedParameter )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1884:3: lv_parameters_17_0= ruleTypedParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTransitionAccess().getParametersTypedParameterParserRuleCall_8_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTypedParameter_in_ruleTransition3631);
                    	    lv_parameters_17_0=ruleTypedParameter();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameters",
                    	            		lv_parameters_17_0, 
                    	            		"TypedParameter");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop63;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleTransition3644); 

                        	newLeafNode(otherlv_18, grammarAccess.getTransitionAccess().getWhereKeyword_8_3());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1904:1: ( (lv_guards_19_0= ruleGuard ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1905:1: (lv_guards_19_0= ruleGuard )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1905:1: (lv_guards_19_0= ruleGuard )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1906:3: lv_guards_19_0= ruleGuard
                    {
                     
                    	        newCompositeNode(grammarAccess.getTransitionAccess().getGuardsGuardParserRuleCall_8_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleGuard_in_ruleTransition3665);
                    lv_guards_19_0=ruleGuard();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                    	        }
                           		add(
                           			current, 
                           			"guards",
                            		lv_guards_19_0, 
                            		"Guard");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1922:2: ( (lv_guards_20_0= ruleGuard ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==24) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1923:1: (lv_guards_20_0= ruleGuard )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1923:1: (lv_guards_20_0= ruleGuard )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1924:3: lv_guards_20_0= ruleGuard
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTransitionAccess().getGuardsGuardParserRuleCall_8_5_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleGuard_in_ruleTransition3686);
                    	    lv_guards_20_0=ruleGuard();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"guards",
                    	            		lv_guards_20_0, 
                    	            		"Guard");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop64;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1940:5: (otherlv_21= 'with' ( (lv_witnesses_22_0= ruleWitness ) ) ( (lv_witnesses_23_0= ruleWitness ) )* )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==33) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1940:7: otherlv_21= 'with' ( (lv_witnesses_22_0= ruleWitness ) ) ( (lv_witnesses_23_0= ruleWitness ) )*
                    {
                    otherlv_21=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleTransition3702); 

                        	newLeafNode(otherlv_21, grammarAccess.getTransitionAccess().getWithKeyword_9_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1944:1: ( (lv_witnesses_22_0= ruleWitness ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1945:1: (lv_witnesses_22_0= ruleWitness )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1945:1: (lv_witnesses_22_0= ruleWitness )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1946:3: lv_witnesses_22_0= ruleWitness
                    {
                     
                    	        newCompositeNode(grammarAccess.getTransitionAccess().getWitnessesWitnessParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleWitness_in_ruleTransition3723);
                    lv_witnesses_22_0=ruleWitness();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                    	        }
                           		add(
                           			current, 
                           			"witnesses",
                            		lv_witnesses_22_0, 
                            		"Witness");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1962:2: ( (lv_witnesses_23_0= ruleWitness ) )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==24||LA66_0==36) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1963:1: (lv_witnesses_23_0= ruleWitness )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1963:1: (lv_witnesses_23_0= ruleWitness )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1964:3: lv_witnesses_23_0= ruleWitness
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTransitionAccess().getWitnessesWitnessParserRuleCall_9_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleWitness_in_ruleTransition3744);
                    	    lv_witnesses_23_0=ruleWitness();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"witnesses",
                    	            		lv_witnesses_23_0, 
                    	            		"Witness");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop66;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1980:5: (otherlv_24= 'then' ( (lv_actions_25_0= ruleAction ) ) ( (lv_actions_26_0= ruleAction ) )* )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==34) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1980:7: otherlv_24= 'then' ( (lv_actions_25_0= ruleAction ) ) ( (lv_actions_26_0= ruleAction ) )*
                    {
                    otherlv_24=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleTransition3760); 

                        	newLeafNode(otherlv_24, grammarAccess.getTransitionAccess().getThenKeyword_10_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1984:1: ( (lv_actions_25_0= ruleAction ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1985:1: (lv_actions_25_0= ruleAction )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1985:1: (lv_actions_25_0= ruleAction )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1986:3: lv_actions_25_0= ruleAction
                    {
                     
                    	        newCompositeNode(grammarAccess.getTransitionAccess().getActionsActionParserRuleCall_10_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAction_in_ruleTransition3781);
                    lv_actions_25_0=ruleAction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                    	        }
                           		add(
                           			current, 
                           			"actions",
                            		lv_actions_25_0, 
                            		"Action");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2002:2: ( (lv_actions_26_0= ruleAction ) )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==24) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2003:1: (lv_actions_26_0= ruleAction )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2003:1: (lv_actions_26_0= ruleAction )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2004:3: lv_actions_26_0= ruleAction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTransitionAccess().getActionsActionParserRuleCall_10_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAction_in_ruleTransition3802);
                    	    lv_actions_26_0=ruleAction();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"actions",
                    	            		lv_actions_26_0, 
                    	            		"Action");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop68;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_27=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleTransition3817); 

                	newLeafNode(otherlv_27, grammarAccess.getTransitionAccess().getEndKeyword_11());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleState"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2032:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2033:2: (iv_ruleState= ruleState EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2034:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleState_in_entryRuleState3853);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleState3863); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2041:1: ruleState returns [EObject current=null] : ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'refines' ( ( ruleEString ) ) )? (otherlv_5= 'statemachines' ( (lv_statemachines_6_0= ruleStatemachine ) ) ( (lv_statemachines_7_0= ruleStatemachine ) )* otherlv_8= 'end' )? (otherlv_9= 'invariants' ( (lv_invariants_10_0= ruleInvariant ) ) ( (lv_invariants_11_0= ruleInvariant ) )* )? ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_statemachines_6_0 = null;

        EObject lv_statemachines_7_0 = null;

        EObject lv_invariants_10_0 = null;

        EObject lv_invariants_11_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2044:28: ( ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'refines' ( ( ruleEString ) ) )? (otherlv_5= 'statemachines' ( (lv_statemachines_6_0= ruleStatemachine ) ) ( (lv_statemachines_7_0= ruleStatemachine ) )* otherlv_8= 'end' )? (otherlv_9= 'invariants' ( (lv_invariants_10_0= ruleInvariant ) ) ( (lv_invariants_11_0= ruleInvariant ) )* )? ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2045:1: ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'refines' ( ( ruleEString ) ) )? (otherlv_5= 'statemachines' ( (lv_statemachines_6_0= ruleStatemachine ) ) ( (lv_statemachines_7_0= ruleStatemachine ) )* otherlv_8= 'end' )? (otherlv_9= 'invariants' ( (lv_invariants_10_0= ruleInvariant ) ) ( (lv_invariants_11_0= ruleInvariant ) )* )? )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2045:1: ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'refines' ( ( ruleEString ) ) )? (otherlv_5= 'statemachines' ( (lv_statemachines_6_0= ruleStatemachine ) ) ( (lv_statemachines_7_0= ruleStatemachine ) )* otherlv_8= 'end' )? (otherlv_9= 'invariants' ( (lv_invariants_10_0= ruleInvariant ) ) ( (lv_invariants_11_0= ruleInvariant ) )* )? )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2045:2: () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'refines' ( ( ruleEString ) ) )? (otherlv_5= 'statemachines' ( (lv_statemachines_6_0= ruleStatemachine ) ) ( (lv_statemachines_7_0= ruleStatemachine ) )* otherlv_8= 'end' )? (otherlv_9= 'invariants' ( (lv_invariants_10_0= ruleInvariant ) ) ( (lv_invariants_11_0= ruleInvariant ) )* )?
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2045:2: ()
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2046:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStateAccess().getStateAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleState3909); 

                	newLeafNode(otherlv_1, grammarAccess.getStateAccess().getStateKeyword_1());
                
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2055:1: ( (lv_name_2_0= ruleEString ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2056:1: (lv_name_2_0= ruleEString )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2056:1: (lv_name_2_0= ruleEString )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2057:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleState3930);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStateRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2073:2: (otherlv_3= 'refines' ( ( ruleEString ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==13) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2073:4: otherlv_3= 'refines' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleState3943); 

                        	newLeafNode(otherlv_3, grammarAccess.getStateAccess().getRefinesKeyword_3_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2077:1: ( ( ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2078:1: ( ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2078:1: ( ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2079:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStateRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getStateAccess().getRefinesStateCrossReference_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleState3966);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2092:4: (otherlv_5= 'statemachines' ( (lv_statemachines_6_0= ruleStatemachine ) ) ( (lv_statemachines_7_0= ruleStatemachine ) )* otherlv_8= 'end' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==46) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2092:6: otherlv_5= 'statemachines' ( (lv_statemachines_6_0= ruleStatemachine ) ) ( (lv_statemachines_7_0= ruleStatemachine ) )* otherlv_8= 'end'
                    {
                    otherlv_5=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleState3981); 

                        	newLeafNode(otherlv_5, grammarAccess.getStateAccess().getStatemachinesKeyword_4_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2096:1: ( (lv_statemachines_6_0= ruleStatemachine ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2097:1: (lv_statemachines_6_0= ruleStatemachine )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2097:1: (lv_statemachines_6_0= ruleStatemachine )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2098:3: lv_statemachines_6_0= ruleStatemachine
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateAccess().getStatemachinesStatemachineParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStatemachine_in_ruleState4002);
                    lv_statemachines_6_0=ruleStatemachine();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStateRule());
                    	        }
                           		add(
                           			current, 
                           			"statemachines",
                            		lv_statemachines_6_0, 
                            		"Statemachine");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2114:2: ( (lv_statemachines_7_0= ruleStatemachine ) )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==37) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2115:1: (lv_statemachines_7_0= ruleStatemachine )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2115:1: (lv_statemachines_7_0= ruleStatemachine )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2116:3: lv_statemachines_7_0= ruleStatemachine
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStateAccess().getStatemachinesStatemachineParserRuleCall_4_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleStatemachine_in_ruleState4023);
                    	    lv_statemachines_7_0=ruleStatemachine();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStateRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"statemachines",
                    	            		lv_statemachines_7_0, 
                    	            		"Statemachine");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop71;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleState4036); 

                        	newLeafNode(otherlv_8, grammarAccess.getStateAccess().getEndKeyword_4_3());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2136:3: (otherlv_9= 'invariants' ( (lv_invariants_10_0= ruleInvariant ) ) ( (lv_invariants_11_0= ruleInvariant ) )* )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==20) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2136:5: otherlv_9= 'invariants' ( (lv_invariants_10_0= ruleInvariant ) ) ( (lv_invariants_11_0= ruleInvariant ) )*
                    {
                    otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleState4051); 

                        	newLeafNode(otherlv_9, grammarAccess.getStateAccess().getInvariantsKeyword_5_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2140:1: ( (lv_invariants_10_0= ruleInvariant ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2141:1: (lv_invariants_10_0= ruleInvariant )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2141:1: (lv_invariants_10_0= ruleInvariant )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2142:3: lv_invariants_10_0= ruleInvariant
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateAccess().getInvariantsInvariantParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInvariant_in_ruleState4072);
                    lv_invariants_10_0=ruleInvariant();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStateRule());
                    	        }
                           		add(
                           			current, 
                           			"invariants",
                            		lv_invariants_10_0, 
                            		"Invariant");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2158:2: ( (lv_invariants_11_0= ruleInvariant ) )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==24) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2159:1: (lv_invariants_11_0= ruleInvariant )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2159:1: (lv_invariants_11_0= ruleInvariant )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2160:3: lv_invariants_11_0= ruleInvariant
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStateAccess().getInvariantsInvariantParserRuleCall_5_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInvariant_in_ruleState4093);
                    	    lv_invariants_11_0=ruleInvariant();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStateRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"invariants",
                    	            		lv_invariants_11_0, 
                    	            		"Invariant");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop73;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleInitial"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2184:1: entryRuleInitial returns [EObject current=null] : iv_ruleInitial= ruleInitial EOF ;
    public final EObject entryRuleInitial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitial = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2185:2: (iv_ruleInitial= ruleInitial EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2186:2: iv_ruleInitial= ruleInitial EOF
            {
             newCompositeNode(grammarAccess.getInitialRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInitial_in_entryRuleInitial4132);
            iv_ruleInitial=ruleInitial();

            state._fsp--;

             current =iv_ruleInitial; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInitial4142); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitial"


    // $ANTLR start "ruleInitial"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2193:1: ruleInitial returns [EObject current=null] : ( () otherlv_1= 'Initial' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleInitial() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_internalId_3_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2196:28: ( ( () otherlv_1= 'Initial' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2197:1: ( () otherlv_1= 'Initial' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2197:1: ( () otherlv_1= 'Initial' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2197:2: () otherlv_1= 'Initial' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2197:2: ()
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2198:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInitialAccess().getInitialAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleInitial4188); 

                	newLeafNode(otherlv_1, grammarAccess.getInitialAccess().getInitialKeyword_1());
                
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2207:1: (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==48) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2207:3: otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleInitial4201); 

                        	newLeafNode(otherlv_2, grammarAccess.getInitialAccess().getInternalIdKeyword_2_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2211:1: ( (lv_internalId_3_0= ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2212:1: (lv_internalId_3_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2212:1: (lv_internalId_3_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2213:3: lv_internalId_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInitialAccess().getInternalIdEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInitial4222);
                    lv_internalId_3_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInitialRule());
                    	        }
                           		set(
                           			current, 
                           			"internalId",
                            		lv_internalId_3_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitial"


    // $ANTLR start "entryRuleFinal"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2237:1: entryRuleFinal returns [EObject current=null] : iv_ruleFinal= ruleFinal EOF ;
    public final EObject entryRuleFinal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFinal = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2238:2: (iv_ruleFinal= ruleFinal EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2239:2: iv_ruleFinal= ruleFinal EOF
            {
             newCompositeNode(grammarAccess.getFinalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFinal_in_entryRuleFinal4260);
            iv_ruleFinal=ruleFinal();

            state._fsp--;

             current =iv_ruleFinal; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFinal4270); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFinal"


    // $ANTLR start "ruleFinal"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2246:1: ruleFinal returns [EObject current=null] : ( () otherlv_1= 'Final' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleFinal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_internalId_3_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2249:28: ( ( () otherlv_1= 'Final' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2250:1: ( () otherlv_1= 'Final' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2250:1: ( () otherlv_1= 'Final' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2250:2: () otherlv_1= 'Final' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2250:2: ()
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2251:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFinalAccess().getFinalAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleFinal4316); 

                	newLeafNode(otherlv_1, grammarAccess.getFinalAccess().getFinalKeyword_1());
                
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2260:1: (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==48) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2260:3: otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleFinal4329); 

                        	newLeafNode(otherlv_2, grammarAccess.getFinalAccess().getInternalIdKeyword_2_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2264:1: ( (lv_internalId_3_0= ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2265:1: (lv_internalId_3_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2265:1: (lv_internalId_3_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2266:3: lv_internalId_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getFinalAccess().getInternalIdEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFinal4350);
                    lv_internalId_3_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFinalRule());
                    	        }
                           		set(
                           			current, 
                           			"internalId",
                            		lv_internalId_3_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFinal"


    // $ANTLR start "entryRuleAny"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2290:1: entryRuleAny returns [EObject current=null] : iv_ruleAny= ruleAny EOF ;
    public final EObject entryRuleAny() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAny = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2291:2: (iv_ruleAny= ruleAny EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2292:2: iv_ruleAny= ruleAny EOF
            {
             newCompositeNode(grammarAccess.getAnyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAny_in_entryRuleAny4388);
            iv_ruleAny=ruleAny();

            state._fsp--;

             current =iv_ruleAny; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAny4398); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAny"


    // $ANTLR start "ruleAny"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2299:1: ruleAny returns [EObject current=null] : ( () otherlv_1= 'Any' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleAny() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_internalId_3_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2302:28: ( ( () otherlv_1= 'Any' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2303:1: ( () otherlv_1= 'Any' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2303:1: ( () otherlv_1= 'Any' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2303:2: () otherlv_1= 'Any' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2303:2: ()
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2304:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAnyAccess().getAnyAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleAny4444); 

                	newLeafNode(otherlv_1, grammarAccess.getAnyAccess().getAnyKeyword_1());
                
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2313:1: (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==48) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2313:3: otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleAny4457); 

                        	newLeafNode(otherlv_2, grammarAccess.getAnyAccess().getInternalIdKeyword_2_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2317:1: ( (lv_internalId_3_0= ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2318:1: (lv_internalId_3_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2318:1: (lv_internalId_3_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2319:3: lv_internalId_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnyAccess().getInternalIdEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAny4478);
                    lv_internalId_3_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAnyRule());
                    	        }
                           		set(
                           			current, 
                           			"internalId",
                            		lv_internalId_3_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAny"


    // $ANTLR start "entryRuleJunction"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2343:1: entryRuleJunction returns [EObject current=null] : iv_ruleJunction= ruleJunction EOF ;
    public final EObject entryRuleJunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJunction = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2344:2: (iv_ruleJunction= ruleJunction EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2345:2: iv_ruleJunction= ruleJunction EOF
            {
             newCompositeNode(grammarAccess.getJunctionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleJunction_in_entryRuleJunction4516);
            iv_ruleJunction=ruleJunction();

            state._fsp--;

             current =iv_ruleJunction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleJunction4526); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJunction"


    // $ANTLR start "ruleJunction"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2352:1: ruleJunction returns [EObject current=null] : ( () otherlv_1= 'Junction' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleJunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_internalId_3_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2355:28: ( ( () otherlv_1= 'Junction' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2356:1: ( () otherlv_1= 'Junction' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2356:1: ( () otherlv_1= 'Junction' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2356:2: () otherlv_1= 'Junction' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2356:2: ()
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2357:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getJunctionAccess().getJunctionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleJunction4572); 

                	newLeafNode(otherlv_1, grammarAccess.getJunctionAccess().getJunctionKeyword_1());
                
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2366:1: (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==48) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2366:3: otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleJunction4585); 

                        	newLeafNode(otherlv_2, grammarAccess.getJunctionAccess().getInternalIdKeyword_2_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2370:1: ( (lv_internalId_3_0= ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2371:1: (lv_internalId_3_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2371:1: (lv_internalId_3_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2372:3: lv_internalId_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getJunctionAccess().getInternalIdEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleJunction4606);
                    lv_internalId_3_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getJunctionRule());
                    	        }
                           		set(
                           			current, 
                           			"internalId",
                            		lv_internalId_3_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJunction"


    // $ANTLR start "entryRuleFork"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2396:1: entryRuleFork returns [EObject current=null] : iv_ruleFork= ruleFork EOF ;
    public final EObject entryRuleFork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFork = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2397:2: (iv_ruleFork= ruleFork EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2398:2: iv_ruleFork= ruleFork EOF
            {
             newCompositeNode(grammarAccess.getForkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFork_in_entryRuleFork4644);
            iv_ruleFork=ruleFork();

            state._fsp--;

             current =iv_ruleFork; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFork4654); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFork"


    // $ANTLR start "ruleFork"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2405:1: ruleFork returns [EObject current=null] : ( () otherlv_1= 'Fork' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleFork() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_internalId_3_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2408:28: ( ( () otherlv_1= 'Fork' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2409:1: ( () otherlv_1= 'Fork' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2409:1: ( () otherlv_1= 'Fork' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2409:2: () otherlv_1= 'Fork' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2409:2: ()
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2410:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getForkAccess().getForkAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleFork4700); 

                	newLeafNode(otherlv_1, grammarAccess.getForkAccess().getForkKeyword_1());
                
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2419:1: (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==48) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2419:3: otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleFork4713); 

                        	newLeafNode(otherlv_2, grammarAccess.getForkAccess().getInternalIdKeyword_2_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2423:1: ( (lv_internalId_3_0= ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2424:1: (lv_internalId_3_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2424:1: (lv_internalId_3_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2425:3: lv_internalId_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getForkAccess().getInternalIdEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFork4734);
                    lv_internalId_3_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getForkRule());
                    	        }
                           		set(
                           			current, 
                           			"internalId",
                            		lv_internalId_3_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFork"


    // $ANTLR start "entryRuleTypedParameter"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2449:1: entryRuleTypedParameter returns [EObject current=null] : iv_ruleTypedParameter= ruleTypedParameter EOF ;
    public final EObject entryRuleTypedParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedParameter = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2450:2: (iv_ruleTypedParameter= ruleTypedParameter EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2451:2: iv_ruleTypedParameter= ruleTypedParameter EOF
            {
             newCompositeNode(grammarAccess.getTypedParameterRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTypedParameter_in_entryRuleTypedParameter4772);
            iv_ruleTypedParameter=ruleTypedParameter();

            state._fsp--;

             current =iv_ruleTypedParameter; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypedParameter4782); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypedParameter"


    // $ANTLR start "ruleTypedParameter"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2458:1: ruleTypedParameter returns [EObject current=null] : (otherlv_0= 'TypedParameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleEString ) ) (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? ) ;
    public final EObject ruleTypedParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_comment_5_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2461:28: ( (otherlv_0= 'TypedParameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleEString ) ) (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2462:1: (otherlv_0= 'TypedParameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleEString ) ) (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2462:1: (otherlv_0= 'TypedParameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleEString ) ) (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2462:3: otherlv_0= 'TypedParameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleEString ) ) (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleTypedParameter4819); 

                	newLeafNode(otherlv_0, grammarAccess.getTypedParameterAccess().getTypedParameterKeyword_0());
                
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2466:1: ( (lv_name_1_0= ruleEString ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2467:1: (lv_name_1_0= ruleEString )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2467:1: (lv_name_1_0= ruleEString )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2468:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTypedParameterAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTypedParameter4840);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTypedParameterRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleTypedParameter4852); 

                	newLeafNode(otherlv_2, grammarAccess.getTypedParameterAccess().getTypeKeyword_2());
                
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2488:1: ( (lv_type_3_0= ruleEString ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2489:1: (lv_type_3_0= ruleEString )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2489:1: (lv_type_3_0= ruleEString )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2490:3: lv_type_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTypedParameterAccess().getTypeEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTypedParameter4873);
            lv_type_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTypedParameterRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2506:2: (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==12) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2506:4: otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTypedParameter4886); 

                        	newLeafNode(otherlv_4, grammarAccess.getTypedParameterAccess().getGreaterThanSignKeyword_4_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2510:1: ( (lv_comment_5_0= ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2511:1: (lv_comment_5_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2511:1: (lv_comment_5_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2512:3: lv_comment_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypedParameterAccess().getCommentEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTypedParameter4907);
                    lv_comment_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTypedParameterRule());
                    	        }
                           		set(
                           			current, 
                           			"comment",
                            		lv_comment_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypedParameter"


    // $ANTLR start "entryRuleAbstractNode"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2536:1: entryRuleAbstractNode returns [EObject current=null] : iv_ruleAbstractNode= ruleAbstractNode EOF ;
    public final EObject entryRuleAbstractNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractNode = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2537:2: (iv_ruleAbstractNode= ruleAbstractNode EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2538:2: iv_ruleAbstractNode= ruleAbstractNode EOF
            {
             newCompositeNode(grammarAccess.getAbstractNodeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractNode_in_entryRuleAbstractNode4945);
            iv_ruleAbstractNode=ruleAbstractNode();

            state._fsp--;

             current =iv_ruleAbstractNode; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractNode4955); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractNode"


    // $ANTLR start "ruleAbstractNode"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2545:1: ruleAbstractNode returns [EObject current=null] : (this_State_0= ruleState | this_Initial_1= ruleInitial | this_Final_2= ruleFinal | this_Any_3= ruleAny | this_Junction_4= ruleJunction | this_Fork_5= ruleFork ) ;
    public final EObject ruleAbstractNode() throws RecognitionException {
        EObject current = null;

        EObject this_State_0 = null;

        EObject this_Initial_1 = null;

        EObject this_Final_2 = null;

        EObject this_Any_3 = null;

        EObject this_Junction_4 = null;

        EObject this_Fork_5 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2548:28: ( (this_State_0= ruleState | this_Initial_1= ruleInitial | this_Final_2= ruleFinal | this_Any_3= ruleAny | this_Junction_4= ruleJunction | this_Fork_5= ruleFork ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2549:1: (this_State_0= ruleState | this_Initial_1= ruleInitial | this_Final_2= ruleFinal | this_Any_3= ruleAny | this_Junction_4= ruleJunction | this_Fork_5= ruleFork )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2549:1: (this_State_0= ruleState | this_Initial_1= ruleInitial | this_Final_2= ruleFinal | this_Any_3= ruleAny | this_Junction_4= ruleJunction | this_Fork_5= ruleFork )
            int alt81=6;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt81=1;
                }
                break;
            case 47:
                {
                alt81=2;
                }
                break;
            case 49:
                {
                alt81=3;
                }
                break;
            case 50:
                {
                alt81=4;
                }
                break;
            case 51:
                {
                alt81=5;
                }
                break;
            case 52:
                {
                alt81=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2550:5: this_State_0= ruleState
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNodeAccess().getStateParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleState_in_ruleAbstractNode5002);
                    this_State_0=ruleState();

                    state._fsp--;

                     
                            current = this_State_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2560:5: this_Initial_1= ruleInitial
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNodeAccess().getInitialParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInitial_in_ruleAbstractNode5029);
                    this_Initial_1=ruleInitial();

                    state._fsp--;

                     
                            current = this_Initial_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2570:5: this_Final_2= ruleFinal
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNodeAccess().getFinalParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFinal_in_ruleAbstractNode5056);
                    this_Final_2=ruleFinal();

                    state._fsp--;

                     
                            current = this_Final_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2580:5: this_Any_3= ruleAny
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNodeAccess().getAnyParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAny_in_ruleAbstractNode5083);
                    this_Any_3=ruleAny();

                    state._fsp--;

                     
                            current = this_Any_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2590:5: this_Junction_4= ruleJunction
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNodeAccess().getJunctionParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleJunction_in_ruleAbstractNode5110);
                    this_Junction_4=ruleJunction();

                    state._fsp--;

                     
                            current = this_Junction_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2600:5: this_Fork_5= ruleFork
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNodeAccess().getForkParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFork_in_ruleAbstractNode5137);
                    this_Fork_5=ruleFork();

                    state._fsp--;

                     
                            current = this_Fork_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractNode"


    // $ANTLR start "ruleConvergence"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2616:1: ruleConvergence returns [Enumerator current=null] : ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) ) ;
    public final Enumerator ruleConvergence() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2618:28: ( ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2619:1: ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2619:1: ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) )
            int alt82=3;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt82=1;
                }
                break;
            case 56:
                {
                alt82=2;
                }
                break;
            case 57:
                {
                alt82=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2619:2: (enumLiteral_0= 'ordinary' )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2619:2: (enumLiteral_0= 'ordinary' )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2619:4: enumLiteral_0= 'ordinary'
                    {
                    enumLiteral_0=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleConvergence5186); 

                            current = grammarAccess.getConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2625:6: (enumLiteral_1= 'convergent' )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2625:6: (enumLiteral_1= 'convergent' )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2625:8: enumLiteral_1= 'convergent'
                    {
                    enumLiteral_1=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleConvergence5203); 

                            current = grammarAccess.getConvergenceAccess().getConvergentEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getConvergenceAccess().getConvergentEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2631:6: (enumLiteral_2= 'anticipated' )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2631:6: (enumLiteral_2= 'anticipated' )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2631:8: enumLiteral_2= 'anticipated'
                    {
                    enumLiteral_2=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleConvergence5220); 

                            current = grammarAccess.getConvergenceAccess().getAnticipatedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getConvergenceAccess().getAnticipatedEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConvergence"


    // $ANTLR start "ruleTranslationKind"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2641:1: ruleTranslationKind returns [Enumerator current=null] : ( (enumLiteral_0= 'MULTIVAR' ) | (enumLiteral_1= 'SINGLEVAR' ) | (enumLiteral_2= 'REFINEDVAR' ) ) ;
    public final Enumerator ruleTranslationKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2643:28: ( ( (enumLiteral_0= 'MULTIVAR' ) | (enumLiteral_1= 'SINGLEVAR' ) | (enumLiteral_2= 'REFINEDVAR' ) ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2644:1: ( (enumLiteral_0= 'MULTIVAR' ) | (enumLiteral_1= 'SINGLEVAR' ) | (enumLiteral_2= 'REFINEDVAR' ) )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2644:1: ( (enumLiteral_0= 'MULTIVAR' ) | (enumLiteral_1= 'SINGLEVAR' ) | (enumLiteral_2= 'REFINEDVAR' ) )
            int alt83=3;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt83=1;
                }
                break;
            case 59:
                {
                alt83=2;
                }
                break;
            case 60:
                {
                alt83=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }

            switch (alt83) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2644:2: (enumLiteral_0= 'MULTIVAR' )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2644:2: (enumLiteral_0= 'MULTIVAR' )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2644:4: enumLiteral_0= 'MULTIVAR'
                    {
                    enumLiteral_0=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleTranslationKind5265); 

                            current = grammarAccess.getTranslationKindAccess().getMULTIVAREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTranslationKindAccess().getMULTIVAREnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2650:6: (enumLiteral_1= 'SINGLEVAR' )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2650:6: (enumLiteral_1= 'SINGLEVAR' )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2650:8: enumLiteral_1= 'SINGLEVAR'
                    {
                    enumLiteral_1=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleTranslationKind5282); 

                            current = grammarAccess.getTranslationKindAccess().getSINGLEVAREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTranslationKindAccess().getSINGLEVAREnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2656:6: (enumLiteral_2= 'REFINEDVAR' )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2656:6: (enumLiteral_2= 'REFINEDVAR' )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2656:8: enumLiteral_2= 'REFINEDVAR'
                    {
                    enumLiteral_2=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleTranslationKind5299); 

                            current = grammarAccess.getTranslationKindAccess().getREFINEDVAREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getTranslationKindAccess().getREFINEDVAREnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTranslationKind"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleMachine_in_entryRuleMachine75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMachine85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleMachine131 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMachine152 = new BitSet(new long[]{0x0000000000F8F000L});
        public static final BitSet FOLLOW_12_in_ruleMachine165 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMachine186 = new BitSet(new long[]{0x0000000000F8E000L});
        public static final BitSet FOLLOW_13_in_ruleMachine201 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMachine224 = new BitSet(new long[]{0x0000000000F8C030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMachine247 = new BitSet(new long[]{0x0000000000F8C030L});
        public static final BitSet FOLLOW_14_in_ruleMachine263 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMachine286 = new BitSet(new long[]{0x0000000000F88030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMachine309 = new BitSet(new long[]{0x0000000000F88030L});
        public static final BitSet FOLLOW_15_in_ruleMachine325 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleMachine337 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleMachine358 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleMachine371 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleMachine392 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleMachine406 = new BitSet(new long[]{0x0000000000F80000L});
        public static final BitSet FOLLOW_19_in_ruleMachine421 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleMachine442 = new BitSet(new long[]{0x0000000000F00030L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleMachine463 = new BitSet(new long[]{0x0000000000F00030L});
        public static final BitSet FOLLOW_20_in_ruleMachine479 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleInvariant_in_ruleMachine500 = new BitSet(new long[]{0x0000000001E00000L});
        public static final BitSet FOLLOW_ruleInvariant_in_ruleMachine521 = new BitSet(new long[]{0x0000000001E00000L});
        public static final BitSet FOLLOW_21_in_ruleMachine537 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleVariant_in_ruleMachine558 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_22_in_ruleMachine573 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_ruleevent_in_ruleMachine594 = new BitSet(new long[]{0x0000000010800000L});
        public static final BitSet FOLLOW_ruleevent_in_ruleMachine615 = new BitSet(new long[]{0x0000000010800000L});
        public static final BitSet FOLLOW_23_in_ruleMachine630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_entryRuleAbstractExtension666 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractExtension676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtension_in_ruleAbstractExtension722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString757 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable879 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariable889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariable944 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_ruleVariable957 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariable978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvariant_in_entryRuleInvariant1016 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInvariant1026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleInvariant1063 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInvariant1084 = new BitSet(new long[]{0x0000000002001032L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInvariant1105 = new BitSet(new long[]{0x0000000002001002L});
        public static final BitSet FOLLOW_25_in_ruleInvariant1124 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_ruleInvariant1151 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInvariant1172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariant_in_entryRuleVariant1210 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariant1220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleVariant1266 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleVariant1278 = new BitSet(new long[]{0x0000000000001032L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariant1299 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_ruleVariant1313 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariant1334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleevent_in_entryRuleevent1372 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleevent1382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleevent1428 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleevent1449 = new BitSet(new long[]{0x03800006E0803000L});
        public static final BitSet FOLLOW_29_in_ruleevent1467 = new BitSet(new long[]{0x03800006C0803000L});
        public static final BitSet FOLLOW_ruleConvergence_in_ruleevent1502 = new BitSet(new long[]{0x00000006C0803000L});
        public static final BitSet FOLLOW_12_in_ruleevent1516 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleevent1537 = new BitSet(new long[]{0x00000006C0802000L});
        public static final BitSet FOLLOW_13_in_ruleevent1552 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleQString_in_ruleevent1575 = new BitSet(new long[]{0x00000006C0800030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleevent1598 = new BitSet(new long[]{0x00000006C0800030L});
        public static final BitSet FOLLOW_30_in_ruleevent1614 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleGuard_in_ruleevent1635 = new BitSet(new long[]{0x0000000681800000L});
        public static final BitSet FOLLOW_ruleGuard_in_ruleevent1656 = new BitSet(new long[]{0x0000000681800000L});
        public static final BitSet FOLLOW_31_in_ruleevent1672 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleevent1693 = new BitSet(new long[]{0x0000000100000030L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleevent1714 = new BitSet(new long[]{0x0000000100000030L});
        public static final BitSet FOLLOW_32_in_ruleevent1727 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleGuard_in_ruleevent1748 = new BitSet(new long[]{0x0000000601800000L});
        public static final BitSet FOLLOW_ruleGuard_in_ruleevent1769 = new BitSet(new long[]{0x0000000601800000L});
        public static final BitSet FOLLOW_33_in_ruleevent1785 = new BitSet(new long[]{0x0000001001000000L});
        public static final BitSet FOLLOW_ruleWitness_in_ruleevent1806 = new BitSet(new long[]{0x0000001401800000L});
        public static final BitSet FOLLOW_ruleWitness_in_ruleevent1827 = new BitSet(new long[]{0x0000001401800000L});
        public static final BitSet FOLLOW_34_in_ruleevent1843 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleAction_in_ruleevent1864 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_ruleAction_in_ruleevent1885 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_23_in_ruleevent1900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQString_in_entryRuleQString1937 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQString1948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleQString1988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQString2015 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_35_in_ruleQString2034 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQString2049 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_ruleExtension_in_entryRuleExtension2097 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExtension2107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter2175 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameter2185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleParameter2240 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_ruleParameter2253 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleParameter2274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGuard_in_entryRuleGuard2312 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGuard2322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleGuard2359 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGuard2380 = new BitSet(new long[]{0x0000000002001032L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGuard2401 = new BitSet(new long[]{0x0000000002001002L});
        public static final BitSet FOLLOW_25_in_ruleGuard2420 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_ruleGuard2447 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGuard2468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWitness_in_entryRuleWitness2506 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWitness2516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleWitness2559 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleWitness2585 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleWitness2606 = new BitSet(new long[]{0x0000000000001032L});
        public static final BitSet FOLLOW_ruleEString_in_ruleWitness2627 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_ruleWitness2641 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleWitness2662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAction_in_entryRuleAction2700 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAction2710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleAction2747 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAction2768 = new BitSet(new long[]{0x0000000000001032L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAction2789 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_ruleAction2803 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAction2824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStatemachine_in_entryRuleStatemachine2862 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStatemachine2872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleStatemachine2909 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStatemachine2930 = new BitSet(new long[]{0x000003C000803000L});
        public static final BitSet FOLLOW_12_in_ruleStatemachine2943 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStatemachine2964 = new BitSet(new long[]{0x000003C000802000L});
        public static final BitSet FOLLOW_38_in_ruleStatemachine2979 = new BitSet(new long[]{0x1C00000000000000L});
        public static final BitSet FOLLOW_ruleTranslationKind_in_ruleStatemachine3000 = new BitSet(new long[]{0x0000038000802000L});
        public static final BitSet FOLLOW_39_in_ruleStatemachine3015 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStatemachine3038 = new BitSet(new long[]{0x0000030000802000L});
        public static final BitSet FOLLOW_13_in_ruleStatemachine3053 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStatemachine3076 = new BitSet(new long[]{0x0000030000800000L});
        public static final BitSet FOLLOW_40_in_ruleStatemachine3091 = new BitSet(new long[]{0x001EA00000000000L});
        public static final BitSet FOLLOW_ruleAbstractNode_in_ruleStatemachine3112 = new BitSet(new long[]{0x0000020000820000L});
        public static final BitSet FOLLOW_17_in_ruleStatemachine3125 = new BitSet(new long[]{0x001EA00000000000L});
        public static final BitSet FOLLOW_ruleAbstractNode_in_ruleStatemachine3146 = new BitSet(new long[]{0x0000020000820000L});
        public static final BitSet FOLLOW_41_in_ruleStatemachine3163 = new BitSet(new long[]{0x0000040020000000L});
        public static final BitSet FOLLOW_ruleTransition_in_ruleStatemachine3184 = new BitSet(new long[]{0x0000040020800000L});
        public static final BitSet FOLLOW_ruleTransition_in_ruleStatemachine3205 = new BitSet(new long[]{0x0000040020800000L});
        public static final BitSet FOLLOW_23_in_ruleStatemachine3220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition3256 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransition3266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleTransition3318 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleTransition3344 = new BitSet(new long[]{0x00001886C0801000L});
        public static final BitSet FOLLOW_12_in_ruleTransition3357 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransition3378 = new BitSet(new long[]{0x00001886C0800000L});
        public static final BitSet FOLLOW_39_in_ruleTransition3393 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransition3416 = new BitSet(new long[]{0x00001806C0800030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransition3439 = new BitSet(new long[]{0x00001806C0800030L});
        public static final BitSet FOLLOW_43_in_ruleTransition3455 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransition3478 = new BitSet(new long[]{0x00001006C0800000L});
        public static final BitSet FOLLOW_44_in_ruleTransition3493 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransition3516 = new BitSet(new long[]{0x00000006C0800000L});
        public static final BitSet FOLLOW_30_in_ruleTransition3531 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleGuard_in_ruleTransition3552 = new BitSet(new long[]{0x0000000681800000L});
        public static final BitSet FOLLOW_ruleGuard_in_ruleTransition3573 = new BitSet(new long[]{0x0000000681800000L});
        public static final BitSet FOLLOW_31_in_ruleTransition3589 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_ruleTypedParameter_in_ruleTransition3610 = new BitSet(new long[]{0x0020000100000000L});
        public static final BitSet FOLLOW_ruleTypedParameter_in_ruleTransition3631 = new BitSet(new long[]{0x0020000100000000L});
        public static final BitSet FOLLOW_32_in_ruleTransition3644 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleGuard_in_ruleTransition3665 = new BitSet(new long[]{0x0000000601800000L});
        public static final BitSet FOLLOW_ruleGuard_in_ruleTransition3686 = new BitSet(new long[]{0x0000000601800000L});
        public static final BitSet FOLLOW_33_in_ruleTransition3702 = new BitSet(new long[]{0x0000001001000000L});
        public static final BitSet FOLLOW_ruleWitness_in_ruleTransition3723 = new BitSet(new long[]{0x0000001401800000L});
        public static final BitSet FOLLOW_ruleWitness_in_ruleTransition3744 = new BitSet(new long[]{0x0000001401800000L});
        public static final BitSet FOLLOW_34_in_ruleTransition3760 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleAction_in_ruleTransition3781 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_ruleAction_in_ruleTransition3802 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_23_in_ruleTransition3817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleState_in_entryRuleState3853 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleState3863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleState3909 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleState3930 = new BitSet(new long[]{0x0000400000102002L});
        public static final BitSet FOLLOW_13_in_ruleState3943 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleState3966 = new BitSet(new long[]{0x0000400000100002L});
        public static final BitSet FOLLOW_46_in_ruleState3981 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_ruleStatemachine_in_ruleState4002 = new BitSet(new long[]{0x0000002000800000L});
        public static final BitSet FOLLOW_ruleStatemachine_in_ruleState4023 = new BitSet(new long[]{0x0000002000800000L});
        public static final BitSet FOLLOW_23_in_ruleState4036 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_20_in_ruleState4051 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleInvariant_in_ruleState4072 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_ruleInvariant_in_ruleState4093 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_ruleInitial_in_entryRuleInitial4132 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInitial4142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleInitial4188 = new BitSet(new long[]{0x0001000000000002L});
        public static final BitSet FOLLOW_48_in_ruleInitial4201 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInitial4222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFinal_in_entryRuleFinal4260 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFinal4270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleFinal4316 = new BitSet(new long[]{0x0001000000000002L});
        public static final BitSet FOLLOW_48_in_ruleFinal4329 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFinal4350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAny_in_entryRuleAny4388 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAny4398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleAny4444 = new BitSet(new long[]{0x0001000000000002L});
        public static final BitSet FOLLOW_48_in_ruleAny4457 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAny4478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleJunction_in_entryRuleJunction4516 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleJunction4526 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleJunction4572 = new BitSet(new long[]{0x0001000000000002L});
        public static final BitSet FOLLOW_48_in_ruleJunction4585 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleJunction4606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFork_in_entryRuleFork4644 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFork4654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleFork4700 = new BitSet(new long[]{0x0001000000000002L});
        public static final BitSet FOLLOW_48_in_ruleFork4713 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFork4734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedParameter_in_entryRuleTypedParameter4772 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypedParameter4782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleTypedParameter4819 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTypedParameter4840 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_54_in_ruleTypedParameter4852 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTypedParameter4873 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_ruleTypedParameter4886 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTypedParameter4907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractNode_in_entryRuleAbstractNode4945 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractNode4955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleState_in_ruleAbstractNode5002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInitial_in_ruleAbstractNode5029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFinal_in_ruleAbstractNode5056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAny_in_ruleAbstractNode5083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleJunction_in_ruleAbstractNode5110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFork_in_ruleAbstractNode5137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleConvergence5186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleConvergence5203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleConvergence5220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_ruleTranslationKind5265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleTranslationKind5282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleTranslationKind5299 = new BitSet(new long[]{0x0000000000000002L});
    }


}