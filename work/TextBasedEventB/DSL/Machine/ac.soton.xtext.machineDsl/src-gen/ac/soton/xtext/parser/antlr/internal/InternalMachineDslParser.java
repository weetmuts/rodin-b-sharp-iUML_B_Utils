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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'machine'", "'>'", "'refines'", "'sees'", "'variables'", "'invariants'", "'variant'", "'events'", "'end'", "'@'", "'theorem'", "'Variant'", "'expression'", "'event'", "'extended'", "'when'", "'any'", "'where'", "'with'", "'then'", "'\\u00B7'", "'localGenerated'", "'Statemachine'", "'translation'", "'elaborates'", "'nodes'", "','", "'transitions'", "'Transition'", "'source'", "'target'", "'State'", "'statemachines'", "'Initial'", "'internalId'", "'Final'", "'Any'", "'Junction'", "'Fork'", "'ordinary'", "'convergent'", "'anticipated'", "'MULTIVAR'", "'SINGLEVAR'", "'REFINEDVAR'"
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
    public static final int T__55=55;
    public static final int T__19=19;
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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:77:1: ruleMachine returns [EObject current=null] : ( () otherlv_1= 'machine' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) ) )? (otherlv_5= 'refines' ( ( ruleEString ) ) ( ( ruleEString ) )* )? (otherlv_8= 'sees' ( ( ruleEString ) ) ( ( ruleEString ) )* )? (otherlv_11= 'variables' ( (lv_variables_12_0= ruleVariable ) ) ( (lv_variables_13_0= ruleVariable ) )* )? (otherlv_14= 'invariants' ( (lv_invariants_15_0= ruleInvariant ) ) ( (lv_invariants_16_0= ruleInvariant ) )* )? (otherlv_17= 'variant' ( (lv_variant_18_0= ruleVariant ) ) )? (otherlv_19= 'events' ( (lv_events_20_0= ruleevent ) ) ( (lv_events_21_0= ruleevent ) )* )? ( ( (lv_extensions_22_0= ruleAbstractExtension ) ) ( (lv_extensions_23_0= ruleAbstractExtension ) )* )? otherlv_24= 'end' ) ;
    public final EObject ruleMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_comment_4_0 = null;

        EObject lv_variables_12_0 = null;

        EObject lv_variables_13_0 = null;

        EObject lv_invariants_15_0 = null;

        EObject lv_invariants_16_0 = null;

        EObject lv_variant_18_0 = null;

        EObject lv_events_20_0 = null;

        EObject lv_events_21_0 = null;

        EObject lv_extensions_22_0 = null;

        EObject lv_extensions_23_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:80:28: ( ( () otherlv_1= 'machine' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) ) )? (otherlv_5= 'refines' ( ( ruleEString ) ) ( ( ruleEString ) )* )? (otherlv_8= 'sees' ( ( ruleEString ) ) ( ( ruleEString ) )* )? (otherlv_11= 'variables' ( (lv_variables_12_0= ruleVariable ) ) ( (lv_variables_13_0= ruleVariable ) )* )? (otherlv_14= 'invariants' ( (lv_invariants_15_0= ruleInvariant ) ) ( (lv_invariants_16_0= ruleInvariant ) )* )? (otherlv_17= 'variant' ( (lv_variant_18_0= ruleVariant ) ) )? (otherlv_19= 'events' ( (lv_events_20_0= ruleevent ) ) ( (lv_events_21_0= ruleevent ) )* )? ( ( (lv_extensions_22_0= ruleAbstractExtension ) ) ( (lv_extensions_23_0= ruleAbstractExtension ) )* )? otherlv_24= 'end' ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:81:1: ( () otherlv_1= 'machine' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) ) )? (otherlv_5= 'refines' ( ( ruleEString ) ) ( ( ruleEString ) )* )? (otherlv_8= 'sees' ( ( ruleEString ) ) ( ( ruleEString ) )* )? (otherlv_11= 'variables' ( (lv_variables_12_0= ruleVariable ) ) ( (lv_variables_13_0= ruleVariable ) )* )? (otherlv_14= 'invariants' ( (lv_invariants_15_0= ruleInvariant ) ) ( (lv_invariants_16_0= ruleInvariant ) )* )? (otherlv_17= 'variant' ( (lv_variant_18_0= ruleVariant ) ) )? (otherlv_19= 'events' ( (lv_events_20_0= ruleevent ) ) ( (lv_events_21_0= ruleevent ) )* )? ( ( (lv_extensions_22_0= ruleAbstractExtension ) ) ( (lv_extensions_23_0= ruleAbstractExtension ) )* )? otherlv_24= 'end' )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:81:1: ( () otherlv_1= 'machine' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) ) )? (otherlv_5= 'refines' ( ( ruleEString ) ) ( ( ruleEString ) )* )? (otherlv_8= 'sees' ( ( ruleEString ) ) ( ( ruleEString ) )* )? (otherlv_11= 'variables' ( (lv_variables_12_0= ruleVariable ) ) ( (lv_variables_13_0= ruleVariable ) )* )? (otherlv_14= 'invariants' ( (lv_invariants_15_0= ruleInvariant ) ) ( (lv_invariants_16_0= ruleInvariant ) )* )? (otherlv_17= 'variant' ( (lv_variant_18_0= ruleVariant ) ) )? (otherlv_19= 'events' ( (lv_events_20_0= ruleevent ) ) ( (lv_events_21_0= ruleevent ) )* )? ( ( (lv_extensions_22_0= ruleAbstractExtension ) ) ( (lv_extensions_23_0= ruleAbstractExtension ) )* )? otherlv_24= 'end' )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:81:2: () otherlv_1= 'machine' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) ) )? (otherlv_5= 'refines' ( ( ruleEString ) ) ( ( ruleEString ) )* )? (otherlv_8= 'sees' ( ( ruleEString ) ) ( ( ruleEString ) )* )? (otherlv_11= 'variables' ( (lv_variables_12_0= ruleVariable ) ) ( (lv_variables_13_0= ruleVariable ) )* )? (otherlv_14= 'invariants' ( (lv_invariants_15_0= ruleInvariant ) ) ( (lv_invariants_16_0= ruleInvariant ) )* )? (otherlv_17= 'variant' ( (lv_variant_18_0= ruleVariant ) ) )? (otherlv_19= 'events' ( (lv_events_20_0= ruleevent ) ) ( (lv_events_21_0= ruleevent ) )* )? ( ( (lv_extensions_22_0= ruleAbstractExtension ) ) ( (lv_extensions_23_0= ruleAbstractExtension ) )* )? otherlv_24= 'end'
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

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:199:5: (otherlv_11= 'variables' ( (lv_variables_12_0= ruleVariable ) ) ( (lv_variables_13_0= ruleVariable ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:199:7: otherlv_11= 'variables' ( (lv_variables_12_0= ruleVariable ) ) ( (lv_variables_13_0= ruleVariable ) )*
                    {
                    otherlv_11=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMachine325); 

                        	newLeafNode(otherlv_11, grammarAccess.getMachineAccess().getVariablesKeyword_6_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:203:1: ( (lv_variables_12_0= ruleVariable ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:204:1: (lv_variables_12_0= ruleVariable )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:204:1: (lv_variables_12_0= ruleVariable )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:205:3: lv_variables_12_0= ruleVariable
                    {
                     
                    	        newCompositeNode(grammarAccess.getMachineAccess().getVariablesVariableParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleMachine346);
                    lv_variables_12_0=ruleVariable();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	        }
                           		add(
                           			current, 
                           			"variables",
                            		lv_variables_12_0, 
                            		"Variable");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:221:2: ( (lv_variables_13_0= ruleVariable ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:222:1: (lv_variables_13_0= ruleVariable )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:222:1: (lv_variables_13_0= ruleVariable )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:223:3: lv_variables_13_0= ruleVariable
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMachineAccess().getVariablesVariableParserRuleCall_6_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleMachine367);
                    	    lv_variables_13_0=ruleVariable();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"variables",
                    	            		lv_variables_13_0, 
                    	            		"Variable");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:239:5: (otherlv_14= 'invariants' ( (lv_invariants_15_0= ruleInvariant ) ) ( (lv_invariants_16_0= ruleInvariant ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:239:7: otherlv_14= 'invariants' ( (lv_invariants_15_0= ruleInvariant ) ) ( (lv_invariants_16_0= ruleInvariant ) )*
                    {
                    otherlv_14=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMachine383); 

                        	newLeafNode(otherlv_14, grammarAccess.getMachineAccess().getInvariantsKeyword_7_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:243:1: ( (lv_invariants_15_0= ruleInvariant ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:244:1: (lv_invariants_15_0= ruleInvariant )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:244:1: (lv_invariants_15_0= ruleInvariant )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:245:3: lv_invariants_15_0= ruleInvariant
                    {
                     
                    	        newCompositeNode(grammarAccess.getMachineAccess().getInvariantsInvariantParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInvariant_in_ruleMachine404);
                    lv_invariants_15_0=ruleInvariant();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	        }
                           		add(
                           			current, 
                           			"invariants",
                            		lv_invariants_15_0, 
                            		"Invariant");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:261:2: ( (lv_invariants_16_0= ruleInvariant ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==20) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:262:1: (lv_invariants_16_0= ruleInvariant )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:262:1: (lv_invariants_16_0= ruleInvariant )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:263:3: lv_invariants_16_0= ruleInvariant
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMachineAccess().getInvariantsInvariantParserRuleCall_7_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInvariant_in_ruleMachine425);
                    	    lv_invariants_16_0=ruleInvariant();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"invariants",
                    	            		lv_invariants_16_0, 
                    	            		"Invariant");
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

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:279:5: (otherlv_17= 'variant' ( (lv_variant_18_0= ruleVariant ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:279:7: otherlv_17= 'variant' ( (lv_variant_18_0= ruleVariant ) )
                    {
                    otherlv_17=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMachine441); 

                        	newLeafNode(otherlv_17, grammarAccess.getMachineAccess().getVariantKeyword_8_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:283:1: ( (lv_variant_18_0= ruleVariant ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:284:1: (lv_variant_18_0= ruleVariant )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:284:1: (lv_variant_18_0= ruleVariant )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:285:3: lv_variant_18_0= ruleVariant
                    {
                     
                    	        newCompositeNode(grammarAccess.getMachineAccess().getVariantVariantParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVariant_in_ruleMachine462);
                    lv_variant_18_0=ruleVariant();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	        }
                           		set(
                           			current, 
                           			"variant",
                            		lv_variant_18_0, 
                            		"Variant");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:301:4: (otherlv_19= 'events' ( (lv_events_20_0= ruleevent ) ) ( (lv_events_21_0= ruleevent ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:301:6: otherlv_19= 'events' ( (lv_events_20_0= ruleevent ) ) ( (lv_events_21_0= ruleevent ) )*
                    {
                    otherlv_19=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMachine477); 

                        	newLeafNode(otherlv_19, grammarAccess.getMachineAccess().getEventsKeyword_9_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:305:1: ( (lv_events_20_0= ruleevent ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:306:1: (lv_events_20_0= ruleevent )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:306:1: (lv_events_20_0= ruleevent )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:307:3: lv_events_20_0= ruleevent
                    {
                     
                    	        newCompositeNode(grammarAccess.getMachineAccess().getEventsEventParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleevent_in_ruleMachine498);
                    lv_events_20_0=ruleevent();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	        }
                           		add(
                           			current, 
                           			"events",
                            		lv_events_20_0, 
                            		"event");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:323:2: ( (lv_events_21_0= ruleevent ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==24) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:324:1: (lv_events_21_0= ruleevent )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:324:1: (lv_events_21_0= ruleevent )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:325:3: lv_events_21_0= ruleevent
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMachineAccess().getEventsEventParserRuleCall_9_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleevent_in_ruleMachine519);
                    	    lv_events_21_0=ruleevent();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"events",
                    	            		lv_events_21_0, 
                    	            		"event");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:341:5: ( ( (lv_extensions_22_0= ruleAbstractExtension ) ) ( (lv_extensions_23_0= ruleAbstractExtension ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==33) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:341:6: ( (lv_extensions_22_0= ruleAbstractExtension ) ) ( (lv_extensions_23_0= ruleAbstractExtension ) )*
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:341:6: ( (lv_extensions_22_0= ruleAbstractExtension ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:342:1: (lv_extensions_22_0= ruleAbstractExtension )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:342:1: (lv_extensions_22_0= ruleAbstractExtension )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:343:3: lv_extensions_22_0= ruleAbstractExtension
                    {
                     
                    	        newCompositeNode(grammarAccess.getMachineAccess().getExtensionsAbstractExtensionParserRuleCall_10_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleMachine544);
                    lv_extensions_22_0=ruleAbstractExtension();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	        }
                           		add(
                           			current, 
                           			"extensions",
                            		lv_extensions_22_0, 
                            		"AbstractExtension");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:359:2: ( (lv_extensions_23_0= ruleAbstractExtension ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==33) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:360:1: (lv_extensions_23_0= ruleAbstractExtension )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:360:1: (lv_extensions_23_0= ruleAbstractExtension )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:361:3: lv_extensions_23_0= ruleAbstractExtension
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMachineAccess().getExtensionsAbstractExtensionParserRuleCall_10_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleMachine565);
                    	    lv_extensions_23_0=ruleAbstractExtension();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"extensions",
                    	            		lv_extensions_23_0, 
                    	            		"AbstractExtension");
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

            otherlv_24=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMachine580); 

                	newLeafNode(otherlv_24, grammarAccess.getMachineAccess().getEndKeyword_11());
                

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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:389:1: entryRuleAbstractExtension returns [EObject current=null] : iv_ruleAbstractExtension= ruleAbstractExtension EOF ;
    public final EObject entryRuleAbstractExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractExtension = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:390:2: (iv_ruleAbstractExtension= ruleAbstractExtension EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:391:2: iv_ruleAbstractExtension= ruleAbstractExtension EOF
            {
             newCompositeNode(grammarAccess.getAbstractExtensionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_entryRuleAbstractExtension616);
            iv_ruleAbstractExtension=ruleAbstractExtension();

            state._fsp--;

             current =iv_ruleAbstractExtension; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractExtension626); 

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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:398:1: ruleAbstractExtension returns [EObject current=null] : this_Statemachine_0= ruleStatemachine ;
    public final EObject ruleAbstractExtension() throws RecognitionException {
        EObject current = null;

        EObject this_Statemachine_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:401:28: (this_Statemachine_0= ruleStatemachine )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:403:5: this_Statemachine_0= ruleStatemachine
            {
             
                    newCompositeNode(grammarAccess.getAbstractExtensionAccess().getStatemachineParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleStatemachine_in_ruleAbstractExtension672);
            this_Statemachine_0=ruleStatemachine();

            state._fsp--;

             
                    current = this_Statemachine_0; 
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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:419:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:420:2: (iv_ruleEString= ruleEString EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:421:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString707);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString718); 

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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:428:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:431:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:432:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:432:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:432:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString758); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:440:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString784); 

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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:455:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:456:2: (iv_ruleVariable= ruleVariable EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:457:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_entryRuleVariable829);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariable839); 

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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:464:1: ruleVariable returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '>' ( (lv_comment_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_comment_3_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:467:28: ( ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '>' ( (lv_comment_3_0= ruleEString ) ) )? ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:468:1: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '>' ( (lv_comment_3_0= ruleEString ) ) )? )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:468:1: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '>' ( (lv_comment_3_0= ruleEString ) ) )? )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:468:2: () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '>' ( (lv_comment_3_0= ruleEString ) ) )?
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:468:2: ()
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:469:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableAccess().getVariableAction_0(),
                        current);
                

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:474:2: ( (lv_name_1_0= ruleEString ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:475:1: (lv_name_1_0= ruleEString )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:475:1: (lv_name_1_0= ruleEString )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:476:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getVariableAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariable894);
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

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:492:2: (otherlv_2= '>' ( (lv_comment_3_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==12) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:492:4: otherlv_2= '>' ( (lv_comment_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleVariable907); 

                        	newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getGreaterThanSignKeyword_2_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:496:1: ( (lv_comment_3_0= ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:497:1: (lv_comment_3_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:497:1: (lv_comment_3_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:498:3: lv_comment_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableAccess().getCommentEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariable928);
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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:522:1: entryRuleInvariant returns [EObject current=null] : iv_ruleInvariant= ruleInvariant EOF ;
    public final EObject entryRuleInvariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvariant = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:523:2: (iv_ruleInvariant= ruleInvariant EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:524:2: iv_ruleInvariant= ruleInvariant EOF
            {
             newCompositeNode(grammarAccess.getInvariantRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInvariant_in_entryRuleInvariant966);
            iv_ruleInvariant=ruleInvariant();

            state._fsp--;

             current =iv_ruleInvariant; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInvariant976); 

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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:531:1: ruleInvariant returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_predicate_2_0= ruleEString ) )? ( (lv_theorem_3_0= 'theorem' ) )? (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? ) ;
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
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:534:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_predicate_2_0= ruleEString ) )? ( (lv_theorem_3_0= 'theorem' ) )? (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:535:1: (otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_predicate_2_0= ruleEString ) )? ( (lv_theorem_3_0= 'theorem' ) )? (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:535:1: (otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_predicate_2_0= ruleEString ) )? ( (lv_theorem_3_0= 'theorem' ) )? (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:535:3: otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_predicate_2_0= ruleEString ) )? ( (lv_theorem_3_0= 'theorem' ) )? (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleInvariant1013); 

                	newLeafNode(otherlv_0, grammarAccess.getInvariantAccess().getCommercialAtKeyword_0());
                
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:539:1: ( (lv_name_1_0= ruleEString ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:540:1: (lv_name_1_0= ruleEString )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:540:1: (lv_name_1_0= ruleEString )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:541:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInvariantAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInvariant1034);
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

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:557:2: ( (lv_predicate_2_0= ruleEString ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_STRING && LA17_0<=RULE_ID)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:558:1: (lv_predicate_2_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:558:1: (lv_predicate_2_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:559:3: lv_predicate_2_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInvariantAccess().getPredicateEStringParserRuleCall_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInvariant1055);
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

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:575:3: ( (lv_theorem_3_0= 'theorem' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==21) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:576:1: (lv_theorem_3_0= 'theorem' )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:576:1: (lv_theorem_3_0= 'theorem' )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:577:3: lv_theorem_3_0= 'theorem'
                    {
                    lv_theorem_3_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleInvariant1074); 

                            newLeafNode(lv_theorem_3_0, grammarAccess.getInvariantAccess().getTheoremTheoremKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInvariantRule());
                    	        }
                           		setWithLastConsumed(current, "theorem", true, "theorem");
                    	    

                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:590:3: (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==12) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:590:5: otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleInvariant1101); 

                        	newLeafNode(otherlv_4, grammarAccess.getInvariantAccess().getGreaterThanSignKeyword_4_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:594:1: ( (lv_comment_5_0= ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:595:1: (lv_comment_5_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:595:1: (lv_comment_5_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:596:3: lv_comment_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInvariantAccess().getCommentEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInvariant1122);
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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:620:1: entryRuleVariant returns [EObject current=null] : iv_ruleVariant= ruleVariant EOF ;
    public final EObject entryRuleVariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariant = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:621:2: (iv_ruleVariant= ruleVariant EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:622:2: iv_ruleVariant= ruleVariant EOF
            {
             newCompositeNode(grammarAccess.getVariantRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariant_in_entryRuleVariant1160);
            iv_ruleVariant=ruleVariant();

            state._fsp--;

             current =iv_ruleVariant; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariant1170); 

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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:629:1: ruleVariant returns [EObject current=null] : ( () otherlv_1= 'Variant' otherlv_2= 'expression' ( (lv_expression_3_0= ruleEString ) )? (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? ) ;
    public final EObject ruleVariant() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_expression_3_0 = null;

        AntlrDatatypeRuleToken lv_comment_5_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:632:28: ( ( () otherlv_1= 'Variant' otherlv_2= 'expression' ( (lv_expression_3_0= ruleEString ) )? (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:633:1: ( () otherlv_1= 'Variant' otherlv_2= 'expression' ( (lv_expression_3_0= ruleEString ) )? (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:633:1: ( () otherlv_1= 'Variant' otherlv_2= 'expression' ( (lv_expression_3_0= ruleEString ) )? (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:633:2: () otherlv_1= 'Variant' otherlv_2= 'expression' ( (lv_expression_3_0= ruleEString ) )? (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )?
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:633:2: ()
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:634:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariantAccess().getVariantAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleVariant1216); 

                	newLeafNode(otherlv_1, grammarAccess.getVariantAccess().getVariantKeyword_1());
                
            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleVariant1228); 

                	newLeafNode(otherlv_2, grammarAccess.getVariantAccess().getExpressionKeyword_2());
                
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:647:1: ( (lv_expression_3_0= ruleEString ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_STRING && LA20_0<=RULE_ID)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:648:1: (lv_expression_3_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:648:1: (lv_expression_3_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:649:3: lv_expression_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariantAccess().getExpressionEStringParserRuleCall_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariant1249);
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

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:665:3: (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==12) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:665:5: otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleVariant1263); 

                        	newLeafNode(otherlv_4, grammarAccess.getVariantAccess().getGreaterThanSignKeyword_4_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:669:1: ( (lv_comment_5_0= ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:670:1: (lv_comment_5_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:670:1: (lv_comment_5_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:671:3: lv_comment_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariantAccess().getCommentEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariant1284);
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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:695:1: entryRuleevent returns [EObject current=null] : iv_ruleevent= ruleevent EOF ;
    public final EObject entryRuleevent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleevent = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:696:2: (iv_ruleevent= ruleevent EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:697:2: iv_ruleevent= ruleevent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleevent_in_entryRuleevent1322);
            iv_ruleevent=ruleevent();

            state._fsp--;

             current =iv_ruleevent; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleevent1332); 

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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:704:1: ruleevent returns [EObject current=null] : ( () otherlv_1= 'event' ( (lv_name_2_0= ruleEString ) ) ( (lv_extended_3_0= 'extended' ) )? ( (lv_convergence_4_0= ruleConvergence ) )? (otherlv_5= '>' ( (lv_comment_6_0= ruleEString ) ) )? (otherlv_7= 'refines' ( ( ruleQString ) ) ( ( ruleEString ) )* )? (otherlv_10= 'when' ( (lv_guards_11_0= ruleGuard ) ) ( (lv_guards_12_0= ruleGuard ) )* )? (otherlv_13= 'any' ( (lv_parameters_14_0= ruleParameter ) ) ( (lv_parameters_15_0= ruleParameter ) )* otherlv_16= 'where' ( (lv_guards_17_0= ruleGuard ) ) ( (lv_guards_18_0= ruleGuard ) )* )? (otherlv_19= 'with' ( (lv_witnesses_20_0= ruleWitness ) ) ( (lv_witnesses_21_0= ruleWitness ) )* )? (otherlv_22= 'then' ( (lv_actions_23_0= ruleAction ) ) ( (lv_actions_24_0= ruleAction ) )* )? otherlv_25= 'end' ) ;
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
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:707:28: ( ( () otherlv_1= 'event' ( (lv_name_2_0= ruleEString ) ) ( (lv_extended_3_0= 'extended' ) )? ( (lv_convergence_4_0= ruleConvergence ) )? (otherlv_5= '>' ( (lv_comment_6_0= ruleEString ) ) )? (otherlv_7= 'refines' ( ( ruleQString ) ) ( ( ruleEString ) )* )? (otherlv_10= 'when' ( (lv_guards_11_0= ruleGuard ) ) ( (lv_guards_12_0= ruleGuard ) )* )? (otherlv_13= 'any' ( (lv_parameters_14_0= ruleParameter ) ) ( (lv_parameters_15_0= ruleParameter ) )* otherlv_16= 'where' ( (lv_guards_17_0= ruleGuard ) ) ( (lv_guards_18_0= ruleGuard ) )* )? (otherlv_19= 'with' ( (lv_witnesses_20_0= ruleWitness ) ) ( (lv_witnesses_21_0= ruleWitness ) )* )? (otherlv_22= 'then' ( (lv_actions_23_0= ruleAction ) ) ( (lv_actions_24_0= ruleAction ) )* )? otherlv_25= 'end' ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:708:1: ( () otherlv_1= 'event' ( (lv_name_2_0= ruleEString ) ) ( (lv_extended_3_0= 'extended' ) )? ( (lv_convergence_4_0= ruleConvergence ) )? (otherlv_5= '>' ( (lv_comment_6_0= ruleEString ) ) )? (otherlv_7= 'refines' ( ( ruleQString ) ) ( ( ruleEString ) )* )? (otherlv_10= 'when' ( (lv_guards_11_0= ruleGuard ) ) ( (lv_guards_12_0= ruleGuard ) )* )? (otherlv_13= 'any' ( (lv_parameters_14_0= ruleParameter ) ) ( (lv_parameters_15_0= ruleParameter ) )* otherlv_16= 'where' ( (lv_guards_17_0= ruleGuard ) ) ( (lv_guards_18_0= ruleGuard ) )* )? (otherlv_19= 'with' ( (lv_witnesses_20_0= ruleWitness ) ) ( (lv_witnesses_21_0= ruleWitness ) )* )? (otherlv_22= 'then' ( (lv_actions_23_0= ruleAction ) ) ( (lv_actions_24_0= ruleAction ) )* )? otherlv_25= 'end' )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:708:1: ( () otherlv_1= 'event' ( (lv_name_2_0= ruleEString ) ) ( (lv_extended_3_0= 'extended' ) )? ( (lv_convergence_4_0= ruleConvergence ) )? (otherlv_5= '>' ( (lv_comment_6_0= ruleEString ) ) )? (otherlv_7= 'refines' ( ( ruleQString ) ) ( ( ruleEString ) )* )? (otherlv_10= 'when' ( (lv_guards_11_0= ruleGuard ) ) ( (lv_guards_12_0= ruleGuard ) )* )? (otherlv_13= 'any' ( (lv_parameters_14_0= ruleParameter ) ) ( (lv_parameters_15_0= ruleParameter ) )* otherlv_16= 'where' ( (lv_guards_17_0= ruleGuard ) ) ( (lv_guards_18_0= ruleGuard ) )* )? (otherlv_19= 'with' ( (lv_witnesses_20_0= ruleWitness ) ) ( (lv_witnesses_21_0= ruleWitness ) )* )? (otherlv_22= 'then' ( (lv_actions_23_0= ruleAction ) ) ( (lv_actions_24_0= ruleAction ) )* )? otherlv_25= 'end' )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:708:2: () otherlv_1= 'event' ( (lv_name_2_0= ruleEString ) ) ( (lv_extended_3_0= 'extended' ) )? ( (lv_convergence_4_0= ruleConvergence ) )? (otherlv_5= '>' ( (lv_comment_6_0= ruleEString ) ) )? (otherlv_7= 'refines' ( ( ruleQString ) ) ( ( ruleEString ) )* )? (otherlv_10= 'when' ( (lv_guards_11_0= ruleGuard ) ) ( (lv_guards_12_0= ruleGuard ) )* )? (otherlv_13= 'any' ( (lv_parameters_14_0= ruleParameter ) ) ( (lv_parameters_15_0= ruleParameter ) )* otherlv_16= 'where' ( (lv_guards_17_0= ruleGuard ) ) ( (lv_guards_18_0= ruleGuard ) )* )? (otherlv_19= 'with' ( (lv_witnesses_20_0= ruleWitness ) ) ( (lv_witnesses_21_0= ruleWitness ) )* )? (otherlv_22= 'then' ( (lv_actions_23_0= ruleAction ) ) ( (lv_actions_24_0= ruleAction ) )* )? otherlv_25= 'end'
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:708:2: ()
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:709:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEventAccess().getEventAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleevent1378); 

                	newLeafNode(otherlv_1, grammarAccess.getEventAccess().getEventKeyword_1());
                
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:718:1: ( (lv_name_2_0= ruleEString ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:719:1: (lv_name_2_0= ruleEString )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:719:1: (lv_name_2_0= ruleEString )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:720:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEventAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleevent1399);
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

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:736:2: ( (lv_extended_3_0= 'extended' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==25) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:737:1: (lv_extended_3_0= 'extended' )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:737:1: (lv_extended_3_0= 'extended' )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:738:3: lv_extended_3_0= 'extended'
                    {
                    lv_extended_3_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleevent1417); 

                            newLeafNode(lv_extended_3_0, grammarAccess.getEventAccess().getExtendedExtendedKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEventRule());
                    	        }
                           		setWithLastConsumed(current, "extended", true, "extended");
                    	    

                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:751:3: ( (lv_convergence_4_0= ruleConvergence ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=50 && LA23_0<=52)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:752:1: (lv_convergence_4_0= ruleConvergence )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:752:1: (lv_convergence_4_0= ruleConvergence )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:753:3: lv_convergence_4_0= ruleConvergence
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getConvergenceConvergenceEnumRuleCall_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleConvergence_in_ruleevent1452);
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

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:769:3: (otherlv_5= '>' ( (lv_comment_6_0= ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==12) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:769:5: otherlv_5= '>' ( (lv_comment_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleevent1466); 

                        	newLeafNode(otherlv_5, grammarAccess.getEventAccess().getGreaterThanSignKeyword_5_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:773:1: ( (lv_comment_6_0= ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:774:1: (lv_comment_6_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:774:1: (lv_comment_6_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:775:3: lv_comment_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getCommentEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleevent1487);
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

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:791:4: (otherlv_7= 'refines' ( ( ruleQString ) ) ( ( ruleEString ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==13) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:791:6: otherlv_7= 'refines' ( ( ruleQString ) ) ( ( ruleEString ) )*
                    {
                    otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleevent1502); 

                        	newLeafNode(otherlv_7, grammarAccess.getEventAccess().getRefinesKeyword_6_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:795:1: ( ( ruleQString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:796:1: ( ruleQString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:796:1: ( ruleQString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:797:3: ruleQString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEventRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getRefinesEventCrossReference_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQString_in_ruleevent1525);
                    ruleQString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:810:2: ( ( ruleEString ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( ((LA25_0>=RULE_STRING && LA25_0<=RULE_ID)) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:811:1: ( ruleEString )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:811:1: ( ruleEString )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:812:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getEventRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getEventAccess().getRefinesEventCrossReference_6_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleevent1548);
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

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:825:5: (otherlv_10= 'when' ( (lv_guards_11_0= ruleGuard ) ) ( (lv_guards_12_0= ruleGuard ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==26) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:825:7: otherlv_10= 'when' ( (lv_guards_11_0= ruleGuard ) ) ( (lv_guards_12_0= ruleGuard ) )*
                    {
                    otherlv_10=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleevent1564); 

                        	newLeafNode(otherlv_10, grammarAccess.getEventAccess().getWhenKeyword_7_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:829:1: ( (lv_guards_11_0= ruleGuard ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:830:1: (lv_guards_11_0= ruleGuard )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:830:1: (lv_guards_11_0= ruleGuard )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:831:3: lv_guards_11_0= ruleGuard
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getGuardsGuardParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleGuard_in_ruleevent1585);
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

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:847:2: ( (lv_guards_12_0= ruleGuard ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==20) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:848:1: (lv_guards_12_0= ruleGuard )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:848:1: (lv_guards_12_0= ruleGuard )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:849:3: lv_guards_12_0= ruleGuard
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEventAccess().getGuardsGuardParserRuleCall_7_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleGuard_in_ruleevent1606);
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

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:865:5: (otherlv_13= 'any' ( (lv_parameters_14_0= ruleParameter ) ) ( (lv_parameters_15_0= ruleParameter ) )* otherlv_16= 'where' ( (lv_guards_17_0= ruleGuard ) ) ( (lv_guards_18_0= ruleGuard ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==27) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:865:7: otherlv_13= 'any' ( (lv_parameters_14_0= ruleParameter ) ) ( (lv_parameters_15_0= ruleParameter ) )* otherlv_16= 'where' ( (lv_guards_17_0= ruleGuard ) ) ( (lv_guards_18_0= ruleGuard ) )*
                    {
                    otherlv_13=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleevent1622); 

                        	newLeafNode(otherlv_13, grammarAccess.getEventAccess().getAnyKeyword_8_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:869:1: ( (lv_parameters_14_0= ruleParameter ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:870:1: (lv_parameters_14_0= ruleParameter )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:870:1: (lv_parameters_14_0= ruleParameter )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:871:3: lv_parameters_14_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getParametersParameterParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleevent1643);
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

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:887:2: ( (lv_parameters_15_0= ruleParameter ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( ((LA29_0>=RULE_STRING && LA29_0<=RULE_ID)) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:888:1: (lv_parameters_15_0= ruleParameter )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:888:1: (lv_parameters_15_0= ruleParameter )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:889:3: lv_parameters_15_0= ruleParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEventAccess().getParametersParameterParserRuleCall_8_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleevent1664);
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

                    otherlv_16=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleevent1677); 

                        	newLeafNode(otherlv_16, grammarAccess.getEventAccess().getWhereKeyword_8_3());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:909:1: ( (lv_guards_17_0= ruleGuard ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:910:1: (lv_guards_17_0= ruleGuard )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:910:1: (lv_guards_17_0= ruleGuard )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:911:3: lv_guards_17_0= ruleGuard
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getGuardsGuardParserRuleCall_8_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleGuard_in_ruleevent1698);
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

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:927:2: ( (lv_guards_18_0= ruleGuard ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==20) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:928:1: (lv_guards_18_0= ruleGuard )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:928:1: (lv_guards_18_0= ruleGuard )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:929:3: lv_guards_18_0= ruleGuard
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEventAccess().getGuardsGuardParserRuleCall_8_5_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleGuard_in_ruleevent1719);
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

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:945:5: (otherlv_19= 'with' ( (lv_witnesses_20_0= ruleWitness ) ) ( (lv_witnesses_21_0= ruleWitness ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==29) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:945:7: otherlv_19= 'with' ( (lv_witnesses_20_0= ruleWitness ) ) ( (lv_witnesses_21_0= ruleWitness ) )*
                    {
                    otherlv_19=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleevent1735); 

                        	newLeafNode(otherlv_19, grammarAccess.getEventAccess().getWithKeyword_9_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:949:1: ( (lv_witnesses_20_0= ruleWitness ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:950:1: (lv_witnesses_20_0= ruleWitness )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:950:1: (lv_witnesses_20_0= ruleWitness )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:951:3: lv_witnesses_20_0= ruleWitness
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getWitnessesWitnessParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleWitness_in_ruleevent1756);
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

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:967:2: ( (lv_witnesses_21_0= ruleWitness ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==20||LA32_0==32) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:968:1: (lv_witnesses_21_0= ruleWitness )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:968:1: (lv_witnesses_21_0= ruleWitness )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:969:3: lv_witnesses_21_0= ruleWitness
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEventAccess().getWitnessesWitnessParserRuleCall_9_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleWitness_in_ruleevent1777);
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

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:985:5: (otherlv_22= 'then' ( (lv_actions_23_0= ruleAction ) ) ( (lv_actions_24_0= ruleAction ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==30) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:985:7: otherlv_22= 'then' ( (lv_actions_23_0= ruleAction ) ) ( (lv_actions_24_0= ruleAction ) )*
                    {
                    otherlv_22=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleevent1793); 

                        	newLeafNode(otherlv_22, grammarAccess.getEventAccess().getThenKeyword_10_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:989:1: ( (lv_actions_23_0= ruleAction ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:990:1: (lv_actions_23_0= ruleAction )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:990:1: (lv_actions_23_0= ruleAction )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:991:3: lv_actions_23_0= ruleAction
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getActionsActionParserRuleCall_10_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAction_in_ruleevent1814);
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

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1007:2: ( (lv_actions_24_0= ruleAction ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==20) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1008:1: (lv_actions_24_0= ruleAction )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1008:1: (lv_actions_24_0= ruleAction )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1009:3: lv_actions_24_0= ruleAction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEventAccess().getActionsActionParserRuleCall_10_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAction_in_ruleevent1835);
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

            otherlv_25=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleevent1850); 

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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1037:1: entryRuleQString returns [String current=null] : iv_ruleQString= ruleQString EOF ;
    public final String entryRuleQString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQString = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1038:2: (iv_ruleQString= ruleQString EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1039:2: iv_ruleQString= ruleQString EOF
            {
             newCompositeNode(grammarAccess.getQStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQString_in_entryRuleQString1887);
            iv_ruleQString=ruleQString();

            state._fsp--;

             current =iv_ruleQString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQString1898); 

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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1046:1: ruleQString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | (this_ID_1= RULE_ID (kw= '\\u00B7' this_ID_3= RULE_ID )* ) ) ;
    public final AntlrDatatypeRuleToken ruleQString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;
        Token kw=null;
        Token this_ID_3=null;

         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1049:28: ( (this_STRING_0= RULE_STRING | (this_ID_1= RULE_ID (kw= '\\u00B7' this_ID_3= RULE_ID )* ) ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1050:1: (this_STRING_0= RULE_STRING | (this_ID_1= RULE_ID (kw= '\\u00B7' this_ID_3= RULE_ID )* ) )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1050:1: (this_STRING_0= RULE_STRING | (this_ID_1= RULE_ID (kw= '\\u00B7' this_ID_3= RULE_ID )* ) )
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
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1050:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleQString1938); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getQStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1058:6: (this_ID_1= RULE_ID (kw= '\\u00B7' this_ID_3= RULE_ID )* )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1058:6: (this_ID_1= RULE_ID (kw= '\\u00B7' this_ID_3= RULE_ID )* )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1058:11: this_ID_1= RULE_ID (kw= '\\u00B7' this_ID_3= RULE_ID )*
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQString1965); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getQStringAccess().getIDTerminalRuleCall_1_0()); 
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1065:1: (kw= '\\u00B7' this_ID_3= RULE_ID )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==31) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1066:2: kw= '\\u00B7' this_ID_3= RULE_ID
                    	    {
                    	    kw=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleQString1984); 

                    	            current.merge(kw);
                    	            newLeafNode(kw, grammarAccess.getQStringAccess().getMiddleDotKeyword_1_1_0()); 
                    	        
                    	    this_ID_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQString1999); 

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


    // $ANTLR start "entryRuleParameter"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1086:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1087:2: (iv_ruleParameter= ruleParameter EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1088:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParameter_in_entryRuleParameter2047);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameter2057); 

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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1095:1: ruleParameter returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '>' ( (lv_comment_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_comment_3_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1098:28: ( ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '>' ( (lv_comment_3_0= ruleEString ) ) )? ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1099:1: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '>' ( (lv_comment_3_0= ruleEString ) ) )? )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1099:1: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '>' ( (lv_comment_3_0= ruleEString ) ) )? )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1099:2: () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '>' ( (lv_comment_3_0= ruleEString ) ) )?
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1099:2: ()
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1100:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getParameterAccess().getParameterAction_0(),
                        current);
                

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1105:2: ( (lv_name_1_0= ruleEString ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1106:1: (lv_name_1_0= ruleEString )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1106:1: (lv_name_1_0= ruleEString )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1107:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleParameter2112);
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

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1123:2: (otherlv_2= '>' ( (lv_comment_3_0= ruleEString ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==12) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1123:4: otherlv_2= '>' ( (lv_comment_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleParameter2125); 

                        	newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getGreaterThanSignKeyword_2_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1127:1: ( (lv_comment_3_0= ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1128:1: (lv_comment_3_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1128:1: (lv_comment_3_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1129:3: lv_comment_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterAccess().getCommentEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleParameter2146);
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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1153:1: entryRuleGuard returns [EObject current=null] : iv_ruleGuard= ruleGuard EOF ;
    public final EObject entryRuleGuard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuard = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1154:2: (iv_ruleGuard= ruleGuard EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1155:2: iv_ruleGuard= ruleGuard EOF
            {
             newCompositeNode(grammarAccess.getGuardRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGuard_in_entryRuleGuard2184);
            iv_ruleGuard=ruleGuard();

            state._fsp--;

             current =iv_ruleGuard; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGuard2194); 

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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1162:1: ruleGuard returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_predicate_2_0= ruleEString ) )? ( (lv_theorem_3_0= 'theorem' ) )? (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? ) ;
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
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1165:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_predicate_2_0= ruleEString ) )? ( (lv_theorem_3_0= 'theorem' ) )? (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1166:1: (otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_predicate_2_0= ruleEString ) )? ( (lv_theorem_3_0= 'theorem' ) )? (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1166:1: (otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_predicate_2_0= ruleEString ) )? ( (lv_theorem_3_0= 'theorem' ) )? (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1166:3: otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_predicate_2_0= ruleEString ) )? ( (lv_theorem_3_0= 'theorem' ) )? (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleGuard2231); 

                	newLeafNode(otherlv_0, grammarAccess.getGuardAccess().getCommercialAtKeyword_0());
                
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1170:1: ( (lv_name_1_0= ruleEString ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1171:1: (lv_name_1_0= ruleEString )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1171:1: (lv_name_1_0= ruleEString )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1172:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getGuardAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGuard2252);
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

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1188:2: ( (lv_predicate_2_0= ruleEString ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=RULE_STRING && LA39_0<=RULE_ID)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1189:1: (lv_predicate_2_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1189:1: (lv_predicate_2_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1190:3: lv_predicate_2_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getGuardAccess().getPredicateEStringParserRuleCall_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGuard2273);
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

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1206:3: ( (lv_theorem_3_0= 'theorem' ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==21) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1207:1: (lv_theorem_3_0= 'theorem' )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1207:1: (lv_theorem_3_0= 'theorem' )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1208:3: lv_theorem_3_0= 'theorem'
                    {
                    lv_theorem_3_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleGuard2292); 

                            newLeafNode(lv_theorem_3_0, grammarAccess.getGuardAccess().getTheoremTheoremKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGuardRule());
                    	        }
                           		setWithLastConsumed(current, "theorem", true, "theorem");
                    	    

                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1221:3: (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==12) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1221:5: otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleGuard2319); 

                        	newLeafNode(otherlv_4, grammarAccess.getGuardAccess().getGreaterThanSignKeyword_4_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1225:1: ( (lv_comment_5_0= ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1226:1: (lv_comment_5_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1226:1: (lv_comment_5_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1227:3: lv_comment_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getGuardAccess().getCommentEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGuard2340);
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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1251:1: entryRuleWitness returns [EObject current=null] : iv_ruleWitness= ruleWitness EOF ;
    public final EObject entryRuleWitness() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWitness = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1252:2: (iv_ruleWitness= ruleWitness EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1253:2: iv_ruleWitness= ruleWitness EOF
            {
             newCompositeNode(grammarAccess.getWitnessRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWitness_in_entryRuleWitness2378);
            iv_ruleWitness=ruleWitness();

            state._fsp--;

             current =iv_ruleWitness; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWitness2388); 

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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1260:1: ruleWitness returns [EObject current=null] : ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= '@' ( (lv_name_2_0= ruleEString ) ) ( (lv_predicate_3_0= ruleEString ) )? (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? ) ;
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
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1263:28: ( ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= '@' ( (lv_name_2_0= ruleEString ) ) ( (lv_predicate_3_0= ruleEString ) )? (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1264:1: ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= '@' ( (lv_name_2_0= ruleEString ) ) ( (lv_predicate_3_0= ruleEString ) )? (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1264:1: ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= '@' ( (lv_name_2_0= ruleEString ) ) ( (lv_predicate_3_0= ruleEString ) )? (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1264:2: ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= '@' ( (lv_name_2_0= ruleEString ) ) ( (lv_predicate_3_0= ruleEString ) )? (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )?
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1264:2: ( (lv_localGenerated_0_0= 'localGenerated' ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==32) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1265:1: (lv_localGenerated_0_0= 'localGenerated' )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1265:1: (lv_localGenerated_0_0= 'localGenerated' )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1266:3: lv_localGenerated_0_0= 'localGenerated'
                    {
                    lv_localGenerated_0_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleWitness2431); 

                            newLeafNode(lv_localGenerated_0_0, grammarAccess.getWitnessAccess().getLocalGeneratedLocalGeneratedKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWitnessRule());
                    	        }
                           		setWithLastConsumed(current, "localGenerated", true, "localGenerated");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleWitness2457); 

                	newLeafNode(otherlv_1, grammarAccess.getWitnessAccess().getCommercialAtKeyword_1());
                
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1283:1: ( (lv_name_2_0= ruleEString ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1284:1: (lv_name_2_0= ruleEString )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1284:1: (lv_name_2_0= ruleEString )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1285:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getWitnessAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleWitness2478);
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

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1301:2: ( (lv_predicate_3_0= ruleEString ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=RULE_STRING && LA43_0<=RULE_ID)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1302:1: (lv_predicate_3_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1302:1: (lv_predicate_3_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1303:3: lv_predicate_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getWitnessAccess().getPredicateEStringParserRuleCall_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleWitness2499);
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

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1319:3: (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==12) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1319:5: otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleWitness2513); 

                        	newLeafNode(otherlv_4, grammarAccess.getWitnessAccess().getGreaterThanSignKeyword_4_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1323:1: ( (lv_comment_5_0= ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1324:1: (lv_comment_5_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1324:1: (lv_comment_5_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1325:3: lv_comment_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getWitnessAccess().getCommentEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleWitness2534);
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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1349:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1350:2: (iv_ruleAction= ruleAction EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1351:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAction_in_entryRuleAction2572);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAction2582); 

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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1358:1: ruleAction returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_action_2_0= ruleEString ) )? (otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) ) )? ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_action_2_0 = null;

        AntlrDatatypeRuleToken lv_comment_4_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1361:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_action_2_0= ruleEString ) )? (otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) ) )? ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1362:1: (otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_action_2_0= ruleEString ) )? (otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) ) )? )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1362:1: (otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_action_2_0= ruleEString ) )? (otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) ) )? )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1362:3: otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_action_2_0= ruleEString ) )? (otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAction2619); 

                	newLeafNode(otherlv_0, grammarAccess.getActionAccess().getCommercialAtKeyword_0());
                
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1366:1: ( (lv_name_1_0= ruleEString ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1367:1: (lv_name_1_0= ruleEString )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1367:1: (lv_name_1_0= ruleEString )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1368:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getActionAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAction2640);
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

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1384:2: ( (lv_action_2_0= ruleEString ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=RULE_STRING && LA45_0<=RULE_ID)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1385:1: (lv_action_2_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1385:1: (lv_action_2_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1386:3: lv_action_2_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getActionEStringParserRuleCall_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAction2661);
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

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1402:3: (otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==12) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1402:5: otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAction2675); 

                        	newLeafNode(otherlv_3, grammarAccess.getActionAccess().getGreaterThanSignKeyword_3_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1406:1: ( (lv_comment_4_0= ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1407:1: (lv_comment_4_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1407:1: (lv_comment_4_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1408:3: lv_comment_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getCommentEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAction2696);
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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1432:1: entryRuleStatemachine returns [EObject current=null] : iv_ruleStatemachine= ruleStatemachine EOF ;
    public final EObject entryRuleStatemachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatemachine = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1433:2: (iv_ruleStatemachine= ruleStatemachine EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1434:2: iv_ruleStatemachine= ruleStatemachine EOF
            {
             newCompositeNode(grammarAccess.getStatemachineRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStatemachine_in_entryRuleStatemachine2734);
            iv_ruleStatemachine=ruleStatemachine();

            state._fsp--;

             current =iv_ruleStatemachine; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStatemachine2744); 

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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1441:1: ruleStatemachine returns [EObject current=null] : (otherlv_0= 'Statemachine' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '>' ( (lv_comment_3_0= ruleEString ) ) )? (otherlv_4= 'translation' ( (lv_translation_5_0= ruleTranslationKind ) ) )? (otherlv_6= 'elaborates' ( ( ruleEString ) ) )? (otherlv_8= 'refines' ( ( ruleEString ) ) )? (otherlv_10= 'nodes' ( (lv_nodes_11_0= ruleAbstractNode ) ) (otherlv_12= ',' ( (lv_nodes_13_0= ruleAbstractNode ) ) )* )? (otherlv_14= 'transitions' ( (lv_transitions_15_0= ruleTransition ) ) ( (lv_transitions_16_0= ruleTransition ) )* )? otherlv_17= 'end' ) ;
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
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1444:28: ( (otherlv_0= 'Statemachine' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '>' ( (lv_comment_3_0= ruleEString ) ) )? (otherlv_4= 'translation' ( (lv_translation_5_0= ruleTranslationKind ) ) )? (otherlv_6= 'elaborates' ( ( ruleEString ) ) )? (otherlv_8= 'refines' ( ( ruleEString ) ) )? (otherlv_10= 'nodes' ( (lv_nodes_11_0= ruleAbstractNode ) ) (otherlv_12= ',' ( (lv_nodes_13_0= ruleAbstractNode ) ) )* )? (otherlv_14= 'transitions' ( (lv_transitions_15_0= ruleTransition ) ) ( (lv_transitions_16_0= ruleTransition ) )* )? otherlv_17= 'end' ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1445:1: (otherlv_0= 'Statemachine' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '>' ( (lv_comment_3_0= ruleEString ) ) )? (otherlv_4= 'translation' ( (lv_translation_5_0= ruleTranslationKind ) ) )? (otherlv_6= 'elaborates' ( ( ruleEString ) ) )? (otherlv_8= 'refines' ( ( ruleEString ) ) )? (otherlv_10= 'nodes' ( (lv_nodes_11_0= ruleAbstractNode ) ) (otherlv_12= ',' ( (lv_nodes_13_0= ruleAbstractNode ) ) )* )? (otherlv_14= 'transitions' ( (lv_transitions_15_0= ruleTransition ) ) ( (lv_transitions_16_0= ruleTransition ) )* )? otherlv_17= 'end' )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1445:1: (otherlv_0= 'Statemachine' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '>' ( (lv_comment_3_0= ruleEString ) ) )? (otherlv_4= 'translation' ( (lv_translation_5_0= ruleTranslationKind ) ) )? (otherlv_6= 'elaborates' ( ( ruleEString ) ) )? (otherlv_8= 'refines' ( ( ruleEString ) ) )? (otherlv_10= 'nodes' ( (lv_nodes_11_0= ruleAbstractNode ) ) (otherlv_12= ',' ( (lv_nodes_13_0= ruleAbstractNode ) ) )* )? (otherlv_14= 'transitions' ( (lv_transitions_15_0= ruleTransition ) ) ( (lv_transitions_16_0= ruleTransition ) )* )? otherlv_17= 'end' )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1445:3: otherlv_0= 'Statemachine' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '>' ( (lv_comment_3_0= ruleEString ) ) )? (otherlv_4= 'translation' ( (lv_translation_5_0= ruleTranslationKind ) ) )? (otherlv_6= 'elaborates' ( ( ruleEString ) ) )? (otherlv_8= 'refines' ( ( ruleEString ) ) )? (otherlv_10= 'nodes' ( (lv_nodes_11_0= ruleAbstractNode ) ) (otherlv_12= ',' ( (lv_nodes_13_0= ruleAbstractNode ) ) )* )? (otherlv_14= 'transitions' ( (lv_transitions_15_0= ruleTransition ) ) ( (lv_transitions_16_0= ruleTransition ) )* )? otherlv_17= 'end'
            {
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleStatemachine2781); 

                	newLeafNode(otherlv_0, grammarAccess.getStatemachineAccess().getStatemachineKeyword_0());
                
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1449:1: ( (lv_name_1_0= ruleEString ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1450:1: (lv_name_1_0= ruleEString )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1450:1: (lv_name_1_0= ruleEString )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1451:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStatemachineAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStatemachine2802);
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

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1467:2: (otherlv_2= '>' ( (lv_comment_3_0= ruleEString ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==12) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1467:4: otherlv_2= '>' ( (lv_comment_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleStatemachine2815); 

                        	newLeafNode(otherlv_2, grammarAccess.getStatemachineAccess().getGreaterThanSignKeyword_2_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1471:1: ( (lv_comment_3_0= ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1472:1: (lv_comment_3_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1472:1: (lv_comment_3_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1473:3: lv_comment_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getStatemachineAccess().getCommentEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStatemachine2836);
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

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1489:4: (otherlv_4= 'translation' ( (lv_translation_5_0= ruleTranslationKind ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==34) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1489:6: otherlv_4= 'translation' ( (lv_translation_5_0= ruleTranslationKind ) )
                    {
                    otherlv_4=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleStatemachine2851); 

                        	newLeafNode(otherlv_4, grammarAccess.getStatemachineAccess().getTranslationKeyword_3_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1493:1: ( (lv_translation_5_0= ruleTranslationKind ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1494:1: (lv_translation_5_0= ruleTranslationKind )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1494:1: (lv_translation_5_0= ruleTranslationKind )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1495:3: lv_translation_5_0= ruleTranslationKind
                    {
                     
                    	        newCompositeNode(grammarAccess.getStatemachineAccess().getTranslationTranslationKindEnumRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTranslationKind_in_ruleStatemachine2872);
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

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1511:4: (otherlv_6= 'elaborates' ( ( ruleEString ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==35) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1511:6: otherlv_6= 'elaborates' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleStatemachine2887); 

                        	newLeafNode(otherlv_6, grammarAccess.getStatemachineAccess().getElaboratesKeyword_4_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1515:1: ( ( ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1516:1: ( ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1516:1: ( ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1517:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStatemachineRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getStatemachineAccess().getElaboratesEventBNamedCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStatemachine2910);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1530:4: (otherlv_8= 'refines' ( ( ruleEString ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==13) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1530:6: otherlv_8= 'refines' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleStatemachine2925); 

                        	newLeafNode(otherlv_8, grammarAccess.getStatemachineAccess().getRefinesKeyword_5_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1534:1: ( ( ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1535:1: ( ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1535:1: ( ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1536:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStatemachineRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getStatemachineAccess().getRefinesStatemachineCrossReference_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStatemachine2948);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1549:4: (otherlv_10= 'nodes' ( (lv_nodes_11_0= ruleAbstractNode ) ) (otherlv_12= ',' ( (lv_nodes_13_0= ruleAbstractNode ) ) )* )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==36) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1549:6: otherlv_10= 'nodes' ( (lv_nodes_11_0= ruleAbstractNode ) ) (otherlv_12= ',' ( (lv_nodes_13_0= ruleAbstractNode ) ) )*
                    {
                    otherlv_10=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleStatemachine2963); 

                        	newLeafNode(otherlv_10, grammarAccess.getStatemachineAccess().getNodesKeyword_6_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1553:1: ( (lv_nodes_11_0= ruleAbstractNode ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1554:1: (lv_nodes_11_0= ruleAbstractNode )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1554:1: (lv_nodes_11_0= ruleAbstractNode )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1555:3: lv_nodes_11_0= ruleAbstractNode
                    {
                     
                    	        newCompositeNode(grammarAccess.getStatemachineAccess().getNodesAbstractNodeParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractNode_in_ruleStatemachine2984);
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

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1571:2: (otherlv_12= ',' ( (lv_nodes_13_0= ruleAbstractNode ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==37) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1571:4: otherlv_12= ',' ( (lv_nodes_13_0= ruleAbstractNode ) )
                    	    {
                    	    otherlv_12=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleStatemachine2997); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getStatemachineAccess().getCommaKeyword_6_2_0());
                    	        
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1575:1: ( (lv_nodes_13_0= ruleAbstractNode ) )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1576:1: (lv_nodes_13_0= ruleAbstractNode )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1576:1: (lv_nodes_13_0= ruleAbstractNode )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1577:3: lv_nodes_13_0= ruleAbstractNode
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStatemachineAccess().getNodesAbstractNodeParserRuleCall_6_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractNode_in_ruleStatemachine3018);
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

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1593:6: (otherlv_14= 'transitions' ( (lv_transitions_15_0= ruleTransition ) ) ( (lv_transitions_16_0= ruleTransition ) )* )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==38) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1593:8: otherlv_14= 'transitions' ( (lv_transitions_15_0= ruleTransition ) ) ( (lv_transitions_16_0= ruleTransition ) )*
                    {
                    otherlv_14=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleStatemachine3035); 

                        	newLeafNode(otherlv_14, grammarAccess.getStatemachineAccess().getTransitionsKeyword_7_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1597:1: ( (lv_transitions_15_0= ruleTransition ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1598:1: (lv_transitions_15_0= ruleTransition )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1598:1: (lv_transitions_15_0= ruleTransition )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1599:3: lv_transitions_15_0= ruleTransition
                    {
                     
                    	        newCompositeNode(grammarAccess.getStatemachineAccess().getTransitionsTransitionParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTransition_in_ruleStatemachine3056);
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

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1615:2: ( (lv_transitions_16_0= ruleTransition ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==25||LA53_0==39) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1616:1: (lv_transitions_16_0= ruleTransition )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1616:1: (lv_transitions_16_0= ruleTransition )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1617:3: lv_transitions_16_0= ruleTransition
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStatemachineAccess().getTransitionsTransitionParserRuleCall_7_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTransition_in_ruleStatemachine3077);
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

            otherlv_17=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleStatemachine3092); 

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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1645:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1646:2: (iv_ruleTransition= ruleTransition EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1647:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransition_in_entryRuleTransition3128);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransition3138); 

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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1654:1: ruleTransition returns [EObject current=null] : ( () ( (lv_extended_1_0= 'extended' ) )? otherlv_2= 'Transition' (otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) ) )? (otherlv_5= 'elaborates' ( ( ruleEString ) ) ( ( ruleEString ) )* )? (otherlv_8= 'source' ( ( ruleEString ) ) )? (otherlv_10= 'target' ( ( ruleEString ) ) )? (otherlv_12= 'when' ( (lv_guards_13_0= ruleGuard ) ) ( (lv_guards_14_0= ruleGuard ) )* )? (otherlv_15= 'any' ( (lv_parameters_16_0= ruleTypedParameter ) ) ( (lv_parameters_17_0= ruleTypedParameter ) )* )? (otherlv_18= 'with' ( (lv_witnesses_19_0= ruleWitness ) ) ( (lv_witnesses_20_0= ruleWitness ) )* )? (otherlv_21= 'then' ( (lv_actions_22_0= ruleAction ) ) ( (lv_actions_23_0= ruleAction ) )* )? otherlv_24= 'end' ) ;
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
        AntlrDatatypeRuleToken lv_comment_4_0 = null;

        EObject lv_guards_13_0 = null;

        EObject lv_guards_14_0 = null;

        EObject lv_parameters_16_0 = null;

        EObject lv_parameters_17_0 = null;

        EObject lv_witnesses_19_0 = null;

        EObject lv_witnesses_20_0 = null;

        EObject lv_actions_22_0 = null;

        EObject lv_actions_23_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1657:28: ( ( () ( (lv_extended_1_0= 'extended' ) )? otherlv_2= 'Transition' (otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) ) )? (otherlv_5= 'elaborates' ( ( ruleEString ) ) ( ( ruleEString ) )* )? (otherlv_8= 'source' ( ( ruleEString ) ) )? (otherlv_10= 'target' ( ( ruleEString ) ) )? (otherlv_12= 'when' ( (lv_guards_13_0= ruleGuard ) ) ( (lv_guards_14_0= ruleGuard ) )* )? (otherlv_15= 'any' ( (lv_parameters_16_0= ruleTypedParameter ) ) ( (lv_parameters_17_0= ruleTypedParameter ) )* )? (otherlv_18= 'with' ( (lv_witnesses_19_0= ruleWitness ) ) ( (lv_witnesses_20_0= ruleWitness ) )* )? (otherlv_21= 'then' ( (lv_actions_22_0= ruleAction ) ) ( (lv_actions_23_0= ruleAction ) )* )? otherlv_24= 'end' ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1658:1: ( () ( (lv_extended_1_0= 'extended' ) )? otherlv_2= 'Transition' (otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) ) )? (otherlv_5= 'elaborates' ( ( ruleEString ) ) ( ( ruleEString ) )* )? (otherlv_8= 'source' ( ( ruleEString ) ) )? (otherlv_10= 'target' ( ( ruleEString ) ) )? (otherlv_12= 'when' ( (lv_guards_13_0= ruleGuard ) ) ( (lv_guards_14_0= ruleGuard ) )* )? (otherlv_15= 'any' ( (lv_parameters_16_0= ruleTypedParameter ) ) ( (lv_parameters_17_0= ruleTypedParameter ) )* )? (otherlv_18= 'with' ( (lv_witnesses_19_0= ruleWitness ) ) ( (lv_witnesses_20_0= ruleWitness ) )* )? (otherlv_21= 'then' ( (lv_actions_22_0= ruleAction ) ) ( (lv_actions_23_0= ruleAction ) )* )? otherlv_24= 'end' )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1658:1: ( () ( (lv_extended_1_0= 'extended' ) )? otherlv_2= 'Transition' (otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) ) )? (otherlv_5= 'elaborates' ( ( ruleEString ) ) ( ( ruleEString ) )* )? (otherlv_8= 'source' ( ( ruleEString ) ) )? (otherlv_10= 'target' ( ( ruleEString ) ) )? (otherlv_12= 'when' ( (lv_guards_13_0= ruleGuard ) ) ( (lv_guards_14_0= ruleGuard ) )* )? (otherlv_15= 'any' ( (lv_parameters_16_0= ruleTypedParameter ) ) ( (lv_parameters_17_0= ruleTypedParameter ) )* )? (otherlv_18= 'with' ( (lv_witnesses_19_0= ruleWitness ) ) ( (lv_witnesses_20_0= ruleWitness ) )* )? (otherlv_21= 'then' ( (lv_actions_22_0= ruleAction ) ) ( (lv_actions_23_0= ruleAction ) )* )? otherlv_24= 'end' )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1658:2: () ( (lv_extended_1_0= 'extended' ) )? otherlv_2= 'Transition' (otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) ) )? (otherlv_5= 'elaborates' ( ( ruleEString ) ) ( ( ruleEString ) )* )? (otherlv_8= 'source' ( ( ruleEString ) ) )? (otherlv_10= 'target' ( ( ruleEString ) ) )? (otherlv_12= 'when' ( (lv_guards_13_0= ruleGuard ) ) ( (lv_guards_14_0= ruleGuard ) )* )? (otherlv_15= 'any' ( (lv_parameters_16_0= ruleTypedParameter ) ) ( (lv_parameters_17_0= ruleTypedParameter ) )* )? (otherlv_18= 'with' ( (lv_witnesses_19_0= ruleWitness ) ) ( (lv_witnesses_20_0= ruleWitness ) )* )? (otherlv_21= 'then' ( (lv_actions_22_0= ruleAction ) ) ( (lv_actions_23_0= ruleAction ) )* )? otherlv_24= 'end'
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1658:2: ()
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1659:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTransitionAccess().getTransitionAction_0(),
                        current);
                

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1664:2: ( (lv_extended_1_0= 'extended' ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==25) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1665:1: (lv_extended_1_0= 'extended' )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1665:1: (lv_extended_1_0= 'extended' )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1666:3: lv_extended_1_0= 'extended'
                    {
                    lv_extended_1_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleTransition3190); 

                            newLeafNode(lv_extended_1_0, grammarAccess.getTransitionAccess().getExtendedExtendedKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                           		setWithLastConsumed(current, "extended", true, "extended");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleTransition3216); 

                	newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getTransitionKeyword_2());
                
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1683:1: (otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==12) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1683:3: otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTransition3229); 

                        	newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getGreaterThanSignKeyword_3_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1687:1: ( (lv_comment_4_0= ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1688:1: (lv_comment_4_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1688:1: (lv_comment_4_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1689:3: lv_comment_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getTransitionAccess().getCommentEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransition3250);
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

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1705:4: (otherlv_5= 'elaborates' ( ( ruleEString ) ) ( ( ruleEString ) )* )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==35) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1705:6: otherlv_5= 'elaborates' ( ( ruleEString ) ) ( ( ruleEString ) )*
                    {
                    otherlv_5=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleTransition3265); 

                        	newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getElaboratesKeyword_4_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1709:1: ( ( ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1710:1: ( ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1710:1: ( ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1711:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getTransitionAccess().getElaboratesEventCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransition3288);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1724:2: ( ( ruleEString ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( ((LA57_0>=RULE_STRING && LA57_0<=RULE_ID)) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1725:1: ( ruleEString )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1725:1: ( ruleEString )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1726:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getTransitionAccess().getElaboratesEventCrossReference_4_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransition3311);
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

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1739:5: (otherlv_8= 'source' ( ( ruleEString ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==40) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1739:7: otherlv_8= 'source' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleTransition3327); 

                        	newLeafNode(otherlv_8, grammarAccess.getTransitionAccess().getSourceKeyword_5_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1743:1: ( ( ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1744:1: ( ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1744:1: ( ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1745:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getTransitionAccess().getSourceAbstractNodeCrossReference_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransition3350);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1758:4: (otherlv_10= 'target' ( ( ruleEString ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==41) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1758:6: otherlv_10= 'target' ( ( ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleTransition3365); 

                        	newLeafNode(otherlv_10, grammarAccess.getTransitionAccess().getTargetKeyword_6_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1762:1: ( ( ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1763:1: ( ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1763:1: ( ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1764:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getTransitionAccess().getTargetAbstractNodeCrossReference_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransition3388);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1777:4: (otherlv_12= 'when' ( (lv_guards_13_0= ruleGuard ) ) ( (lv_guards_14_0= ruleGuard ) )* )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==26) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1777:6: otherlv_12= 'when' ( (lv_guards_13_0= ruleGuard ) ) ( (lv_guards_14_0= ruleGuard ) )*
                    {
                    otherlv_12=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleTransition3403); 

                        	newLeafNode(otherlv_12, grammarAccess.getTransitionAccess().getWhenKeyword_7_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1781:1: ( (lv_guards_13_0= ruleGuard ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1782:1: (lv_guards_13_0= ruleGuard )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1782:1: (lv_guards_13_0= ruleGuard )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1783:3: lv_guards_13_0= ruleGuard
                    {
                     
                    	        newCompositeNode(grammarAccess.getTransitionAccess().getGuardsGuardParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleGuard_in_ruleTransition3424);
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

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1799:2: ( (lv_guards_14_0= ruleGuard ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==20) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1800:1: (lv_guards_14_0= ruleGuard )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1800:1: (lv_guards_14_0= ruleGuard )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1801:3: lv_guards_14_0= ruleGuard
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTransitionAccess().getGuardsGuardParserRuleCall_7_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleGuard_in_ruleTransition3445);
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

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1817:5: (otherlv_15= 'any' ( (lv_parameters_16_0= ruleTypedParameter ) ) ( (lv_parameters_17_0= ruleTypedParameter ) )* )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==27) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1817:7: otherlv_15= 'any' ( (lv_parameters_16_0= ruleTypedParameter ) ) ( (lv_parameters_17_0= ruleTypedParameter ) )*
                    {
                    otherlv_15=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleTransition3461); 

                        	newLeafNode(otherlv_15, grammarAccess.getTransitionAccess().getAnyKeyword_8_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1821:1: ( (lv_parameters_16_0= ruleTypedParameter ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1822:1: (lv_parameters_16_0= ruleTypedParameter )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1822:1: (lv_parameters_16_0= ruleTypedParameter )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1823:3: lv_parameters_16_0= ruleTypedParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getTransitionAccess().getParametersTypedParameterParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTypedParameter_in_ruleTransition3482);
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

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1839:2: ( (lv_parameters_17_0= ruleTypedParameter ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( ((LA63_0>=RULE_STRING && LA63_0<=RULE_ID)) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1840:1: (lv_parameters_17_0= ruleTypedParameter )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1840:1: (lv_parameters_17_0= ruleTypedParameter )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1841:3: lv_parameters_17_0= ruleTypedParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTransitionAccess().getParametersTypedParameterParserRuleCall_8_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTypedParameter_in_ruleTransition3503);
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


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1857:5: (otherlv_18= 'with' ( (lv_witnesses_19_0= ruleWitness ) ) ( (lv_witnesses_20_0= ruleWitness ) )* )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==29) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1857:7: otherlv_18= 'with' ( (lv_witnesses_19_0= ruleWitness ) ) ( (lv_witnesses_20_0= ruleWitness ) )*
                    {
                    otherlv_18=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleTransition3519); 

                        	newLeafNode(otherlv_18, grammarAccess.getTransitionAccess().getWithKeyword_9_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1861:1: ( (lv_witnesses_19_0= ruleWitness ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1862:1: (lv_witnesses_19_0= ruleWitness )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1862:1: (lv_witnesses_19_0= ruleWitness )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1863:3: lv_witnesses_19_0= ruleWitness
                    {
                     
                    	        newCompositeNode(grammarAccess.getTransitionAccess().getWitnessesWitnessParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleWitness_in_ruleTransition3540);
                    lv_witnesses_19_0=ruleWitness();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                    	        }
                           		add(
                           			current, 
                           			"witnesses",
                            		lv_witnesses_19_0, 
                            		"Witness");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1879:2: ( (lv_witnesses_20_0= ruleWitness ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==20||LA65_0==32) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1880:1: (lv_witnesses_20_0= ruleWitness )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1880:1: (lv_witnesses_20_0= ruleWitness )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1881:3: lv_witnesses_20_0= ruleWitness
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTransitionAccess().getWitnessesWitnessParserRuleCall_9_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleWitness_in_ruleTransition3561);
                    	    lv_witnesses_20_0=ruleWitness();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"witnesses",
                    	            		lv_witnesses_20_0, 
                    	            		"Witness");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop65;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1897:5: (otherlv_21= 'then' ( (lv_actions_22_0= ruleAction ) ) ( (lv_actions_23_0= ruleAction ) )* )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==30) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1897:7: otherlv_21= 'then' ( (lv_actions_22_0= ruleAction ) ) ( (lv_actions_23_0= ruleAction ) )*
                    {
                    otherlv_21=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleTransition3577); 

                        	newLeafNode(otherlv_21, grammarAccess.getTransitionAccess().getThenKeyword_10_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1901:1: ( (lv_actions_22_0= ruleAction ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1902:1: (lv_actions_22_0= ruleAction )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1902:1: (lv_actions_22_0= ruleAction )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1903:3: lv_actions_22_0= ruleAction
                    {
                     
                    	        newCompositeNode(grammarAccess.getTransitionAccess().getActionsActionParserRuleCall_10_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAction_in_ruleTransition3598);
                    lv_actions_22_0=ruleAction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                    	        }
                           		add(
                           			current, 
                           			"actions",
                            		lv_actions_22_0, 
                            		"Action");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1919:2: ( (lv_actions_23_0= ruleAction ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==20) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1920:1: (lv_actions_23_0= ruleAction )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1920:1: (lv_actions_23_0= ruleAction )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1921:3: lv_actions_23_0= ruleAction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTransitionAccess().getActionsActionParserRuleCall_10_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAction_in_ruleTransition3619);
                    	    lv_actions_23_0=ruleAction();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"actions",
                    	            		lv_actions_23_0, 
                    	            		"Action");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop67;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_24=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleTransition3634); 

                	newLeafNode(otherlv_24, grammarAccess.getTransitionAccess().getEndKeyword_11());
                

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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1949:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1950:2: (iv_ruleState= ruleState EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1951:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleState_in_entryRuleState3670);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleState3680); 

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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1958:1: ruleState returns [EObject current=null] : ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'refines' ( ( ruleEString ) ) )? (otherlv_5= 'statemachines' ( (lv_statemachines_6_0= ruleStatemachine ) ) ( (lv_statemachines_7_0= ruleStatemachine ) )* otherlv_8= 'end' )? (otherlv_9= 'invariants' ( (lv_invariants_10_0= ruleInvariant ) ) ( (lv_invariants_11_0= ruleInvariant ) )* )? ) ;
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
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1961:28: ( ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'refines' ( ( ruleEString ) ) )? (otherlv_5= 'statemachines' ( (lv_statemachines_6_0= ruleStatemachine ) ) ( (lv_statemachines_7_0= ruleStatemachine ) )* otherlv_8= 'end' )? (otherlv_9= 'invariants' ( (lv_invariants_10_0= ruleInvariant ) ) ( (lv_invariants_11_0= ruleInvariant ) )* )? ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1962:1: ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'refines' ( ( ruleEString ) ) )? (otherlv_5= 'statemachines' ( (lv_statemachines_6_0= ruleStatemachine ) ) ( (lv_statemachines_7_0= ruleStatemachine ) )* otherlv_8= 'end' )? (otherlv_9= 'invariants' ( (lv_invariants_10_0= ruleInvariant ) ) ( (lv_invariants_11_0= ruleInvariant ) )* )? )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1962:1: ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'refines' ( ( ruleEString ) ) )? (otherlv_5= 'statemachines' ( (lv_statemachines_6_0= ruleStatemachine ) ) ( (lv_statemachines_7_0= ruleStatemachine ) )* otherlv_8= 'end' )? (otherlv_9= 'invariants' ( (lv_invariants_10_0= ruleInvariant ) ) ( (lv_invariants_11_0= ruleInvariant ) )* )? )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1962:2: () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'refines' ( ( ruleEString ) ) )? (otherlv_5= 'statemachines' ( (lv_statemachines_6_0= ruleStatemachine ) ) ( (lv_statemachines_7_0= ruleStatemachine ) )* otherlv_8= 'end' )? (otherlv_9= 'invariants' ( (lv_invariants_10_0= ruleInvariant ) ) ( (lv_invariants_11_0= ruleInvariant ) )* )?
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1962:2: ()
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1963:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStateAccess().getStateAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleState3726); 

                	newLeafNode(otherlv_1, grammarAccess.getStateAccess().getStateKeyword_1());
                
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1972:1: ( (lv_name_2_0= ruleEString ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1973:1: (lv_name_2_0= ruleEString )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1973:1: (lv_name_2_0= ruleEString )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1974:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleState3747);
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

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1990:2: (otherlv_3= 'refines' ( ( ruleEString ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==13) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1990:4: otherlv_3= 'refines' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleState3760); 

                        	newLeafNode(otherlv_3, grammarAccess.getStateAccess().getRefinesKeyword_3_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1994:1: ( ( ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1995:1: ( ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1995:1: ( ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1996:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStateRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getStateAccess().getRefinesStateCrossReference_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleState3783);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2009:4: (otherlv_5= 'statemachines' ( (lv_statemachines_6_0= ruleStatemachine ) ) ( (lv_statemachines_7_0= ruleStatemachine ) )* otherlv_8= 'end' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==43) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2009:6: otherlv_5= 'statemachines' ( (lv_statemachines_6_0= ruleStatemachine ) ) ( (lv_statemachines_7_0= ruleStatemachine ) )* otherlv_8= 'end'
                    {
                    otherlv_5=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleState3798); 

                        	newLeafNode(otherlv_5, grammarAccess.getStateAccess().getStatemachinesKeyword_4_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2013:1: ( (lv_statemachines_6_0= ruleStatemachine ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2014:1: (lv_statemachines_6_0= ruleStatemachine )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2014:1: (lv_statemachines_6_0= ruleStatemachine )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2015:3: lv_statemachines_6_0= ruleStatemachine
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateAccess().getStatemachinesStatemachineParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStatemachine_in_ruleState3819);
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

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2031:2: ( (lv_statemachines_7_0= ruleStatemachine ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==33) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2032:1: (lv_statemachines_7_0= ruleStatemachine )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2032:1: (lv_statemachines_7_0= ruleStatemachine )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2033:3: lv_statemachines_7_0= ruleStatemachine
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStateAccess().getStatemachinesStatemachineParserRuleCall_4_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleStatemachine_in_ruleState3840);
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
                    	    break loop70;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleState3853); 

                        	newLeafNode(otherlv_8, grammarAccess.getStateAccess().getEndKeyword_4_3());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2053:3: (otherlv_9= 'invariants' ( (lv_invariants_10_0= ruleInvariant ) ) ( (lv_invariants_11_0= ruleInvariant ) )* )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==16) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2053:5: otherlv_9= 'invariants' ( (lv_invariants_10_0= ruleInvariant ) ) ( (lv_invariants_11_0= ruleInvariant ) )*
                    {
                    otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleState3868); 

                        	newLeafNode(otherlv_9, grammarAccess.getStateAccess().getInvariantsKeyword_5_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2057:1: ( (lv_invariants_10_0= ruleInvariant ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2058:1: (lv_invariants_10_0= ruleInvariant )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2058:1: (lv_invariants_10_0= ruleInvariant )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2059:3: lv_invariants_10_0= ruleInvariant
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateAccess().getInvariantsInvariantParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInvariant_in_ruleState3889);
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

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2075:2: ( (lv_invariants_11_0= ruleInvariant ) )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==20) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2076:1: (lv_invariants_11_0= ruleInvariant )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2076:1: (lv_invariants_11_0= ruleInvariant )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2077:3: lv_invariants_11_0= ruleInvariant
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStateAccess().getInvariantsInvariantParserRuleCall_5_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInvariant_in_ruleState3910);
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
                    	    break loop72;
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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2101:1: entryRuleInitial returns [EObject current=null] : iv_ruleInitial= ruleInitial EOF ;
    public final EObject entryRuleInitial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitial = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2102:2: (iv_ruleInitial= ruleInitial EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2103:2: iv_ruleInitial= ruleInitial EOF
            {
             newCompositeNode(grammarAccess.getInitialRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInitial_in_entryRuleInitial3949);
            iv_ruleInitial=ruleInitial();

            state._fsp--;

             current =iv_ruleInitial; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInitial3959); 

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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2110:1: ruleInitial returns [EObject current=null] : ( () otherlv_1= 'Initial' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleInitial() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_internalId_3_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2113:28: ( ( () otherlv_1= 'Initial' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2114:1: ( () otherlv_1= 'Initial' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2114:1: ( () otherlv_1= 'Initial' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2114:2: () otherlv_1= 'Initial' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2114:2: ()
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2115:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInitialAccess().getInitialAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleInitial4005); 

                	newLeafNode(otherlv_1, grammarAccess.getInitialAccess().getInitialKeyword_1());
                
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2124:1: (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==45) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2124:3: otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleInitial4018); 

                        	newLeafNode(otherlv_2, grammarAccess.getInitialAccess().getInternalIdKeyword_2_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2128:1: ( (lv_internalId_3_0= ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2129:1: (lv_internalId_3_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2129:1: (lv_internalId_3_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2130:3: lv_internalId_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInitialAccess().getInternalIdEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInitial4039);
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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2154:1: entryRuleFinal returns [EObject current=null] : iv_ruleFinal= ruleFinal EOF ;
    public final EObject entryRuleFinal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFinal = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2155:2: (iv_ruleFinal= ruleFinal EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2156:2: iv_ruleFinal= ruleFinal EOF
            {
             newCompositeNode(grammarAccess.getFinalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFinal_in_entryRuleFinal4077);
            iv_ruleFinal=ruleFinal();

            state._fsp--;

             current =iv_ruleFinal; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFinal4087); 

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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2163:1: ruleFinal returns [EObject current=null] : ( () otherlv_1= 'Final' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleFinal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_internalId_3_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2166:28: ( ( () otherlv_1= 'Final' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2167:1: ( () otherlv_1= 'Final' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2167:1: ( () otherlv_1= 'Final' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2167:2: () otherlv_1= 'Final' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2167:2: ()
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2168:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFinalAccess().getFinalAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleFinal4133); 

                	newLeafNode(otherlv_1, grammarAccess.getFinalAccess().getFinalKeyword_1());
                
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2177:1: (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==45) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2177:3: otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleFinal4146); 

                        	newLeafNode(otherlv_2, grammarAccess.getFinalAccess().getInternalIdKeyword_2_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2181:1: ( (lv_internalId_3_0= ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2182:1: (lv_internalId_3_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2182:1: (lv_internalId_3_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2183:3: lv_internalId_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getFinalAccess().getInternalIdEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFinal4167);
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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2207:1: entryRuleAny returns [EObject current=null] : iv_ruleAny= ruleAny EOF ;
    public final EObject entryRuleAny() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAny = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2208:2: (iv_ruleAny= ruleAny EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2209:2: iv_ruleAny= ruleAny EOF
            {
             newCompositeNode(grammarAccess.getAnyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAny_in_entryRuleAny4205);
            iv_ruleAny=ruleAny();

            state._fsp--;

             current =iv_ruleAny; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAny4215); 

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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2216:1: ruleAny returns [EObject current=null] : ( () otherlv_1= 'Any' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleAny() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_internalId_3_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2219:28: ( ( () otherlv_1= 'Any' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2220:1: ( () otherlv_1= 'Any' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2220:1: ( () otherlv_1= 'Any' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2220:2: () otherlv_1= 'Any' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2220:2: ()
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2221:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAnyAccess().getAnyAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleAny4261); 

                	newLeafNode(otherlv_1, grammarAccess.getAnyAccess().getAnyKeyword_1());
                
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2230:1: (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==45) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2230:3: otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleAny4274); 

                        	newLeafNode(otherlv_2, grammarAccess.getAnyAccess().getInternalIdKeyword_2_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2234:1: ( (lv_internalId_3_0= ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2235:1: (lv_internalId_3_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2235:1: (lv_internalId_3_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2236:3: lv_internalId_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnyAccess().getInternalIdEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAny4295);
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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2260:1: entryRuleJunction returns [EObject current=null] : iv_ruleJunction= ruleJunction EOF ;
    public final EObject entryRuleJunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJunction = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2261:2: (iv_ruleJunction= ruleJunction EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2262:2: iv_ruleJunction= ruleJunction EOF
            {
             newCompositeNode(grammarAccess.getJunctionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleJunction_in_entryRuleJunction4333);
            iv_ruleJunction=ruleJunction();

            state._fsp--;

             current =iv_ruleJunction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleJunction4343); 

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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2269:1: ruleJunction returns [EObject current=null] : ( () otherlv_1= 'Junction' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleJunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_internalId_3_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2272:28: ( ( () otherlv_1= 'Junction' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2273:1: ( () otherlv_1= 'Junction' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2273:1: ( () otherlv_1= 'Junction' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2273:2: () otherlv_1= 'Junction' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2273:2: ()
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2274:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getJunctionAccess().getJunctionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleJunction4389); 

                	newLeafNode(otherlv_1, grammarAccess.getJunctionAccess().getJunctionKeyword_1());
                
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2283:1: (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==45) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2283:3: otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleJunction4402); 

                        	newLeafNode(otherlv_2, grammarAccess.getJunctionAccess().getInternalIdKeyword_2_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2287:1: ( (lv_internalId_3_0= ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2288:1: (lv_internalId_3_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2288:1: (lv_internalId_3_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2289:3: lv_internalId_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getJunctionAccess().getInternalIdEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleJunction4423);
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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2313:1: entryRuleFork returns [EObject current=null] : iv_ruleFork= ruleFork EOF ;
    public final EObject entryRuleFork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFork = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2314:2: (iv_ruleFork= ruleFork EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2315:2: iv_ruleFork= ruleFork EOF
            {
             newCompositeNode(grammarAccess.getForkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFork_in_entryRuleFork4461);
            iv_ruleFork=ruleFork();

            state._fsp--;

             current =iv_ruleFork; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFork4471); 

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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2322:1: ruleFork returns [EObject current=null] : ( () otherlv_1= 'Fork' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleFork() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_internalId_3_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2325:28: ( ( () otherlv_1= 'Fork' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2326:1: ( () otherlv_1= 'Fork' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2326:1: ( () otherlv_1= 'Fork' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2326:2: () otherlv_1= 'Fork' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2326:2: ()
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2327:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getForkAccess().getForkAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleFork4517); 

                	newLeafNode(otherlv_1, grammarAccess.getForkAccess().getForkKeyword_1());
                
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2336:1: (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==45) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2336:3: otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleFork4530); 

                        	newLeafNode(otherlv_2, grammarAccess.getForkAccess().getInternalIdKeyword_2_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2340:1: ( (lv_internalId_3_0= ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2341:1: (lv_internalId_3_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2341:1: (lv_internalId_3_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2342:3: lv_internalId_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getForkAccess().getInternalIdEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFork4551);
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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2366:1: entryRuleTypedParameter returns [EObject current=null] : iv_ruleTypedParameter= ruleTypedParameter EOF ;
    public final EObject entryRuleTypedParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedParameter = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2367:2: (iv_ruleTypedParameter= ruleTypedParameter EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2368:2: iv_ruleTypedParameter= ruleTypedParameter EOF
            {
             newCompositeNode(grammarAccess.getTypedParameterRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTypedParameter_in_entryRuleTypedParameter4589);
            iv_ruleTypedParameter=ruleTypedParameter();

            state._fsp--;

             current =iv_ruleTypedParameter; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypedParameter4599); 

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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2375:1: ruleTypedParameter returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= 'where' ( (lv_type_2_0= ruleEString ) ) (otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) ) )? ) ;
    public final EObject ruleTypedParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_type_2_0 = null;

        AntlrDatatypeRuleToken lv_comment_4_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2378:28: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= 'where' ( (lv_type_2_0= ruleEString ) ) (otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) ) )? ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2379:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= 'where' ( (lv_type_2_0= ruleEString ) ) (otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) ) )? )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2379:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= 'where' ( (lv_type_2_0= ruleEString ) ) (otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) ) )? )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2379:2: ( (lv_name_0_0= ruleEString ) ) otherlv_1= 'where' ( (lv_type_2_0= ruleEString ) ) (otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) ) )?
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2379:2: ( (lv_name_0_0= ruleEString ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2380:1: (lv_name_0_0= ruleEString )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2380:1: (lv_name_0_0= ruleEString )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2381:3: lv_name_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTypedParameterAccess().getNameEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTypedParameter4645);
            lv_name_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTypedParameterRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleTypedParameter4657); 

                	newLeafNode(otherlv_1, grammarAccess.getTypedParameterAccess().getWhereKeyword_1());
                
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2401:1: ( (lv_type_2_0= ruleEString ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2402:1: (lv_type_2_0= ruleEString )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2402:1: (lv_type_2_0= ruleEString )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2403:3: lv_type_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTypedParameterAccess().getTypeEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTypedParameter4678);
            lv_type_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTypedParameterRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2419:2: (otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==12) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2419:4: otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTypedParameter4691); 

                        	newLeafNode(otherlv_3, grammarAccess.getTypedParameterAccess().getGreaterThanSignKeyword_3_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2423:1: ( (lv_comment_4_0= ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2424:1: (lv_comment_4_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2424:1: (lv_comment_4_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2425:3: lv_comment_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypedParameterAccess().getCommentEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTypedParameter4712);
                    lv_comment_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTypedParameterRule());
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
    // $ANTLR end "ruleTypedParameter"


    // $ANTLR start "entryRuleAbstractNode"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2449:1: entryRuleAbstractNode returns [EObject current=null] : iv_ruleAbstractNode= ruleAbstractNode EOF ;
    public final EObject entryRuleAbstractNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractNode = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2450:2: (iv_ruleAbstractNode= ruleAbstractNode EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2451:2: iv_ruleAbstractNode= ruleAbstractNode EOF
            {
             newCompositeNode(grammarAccess.getAbstractNodeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractNode_in_entryRuleAbstractNode4750);
            iv_ruleAbstractNode=ruleAbstractNode();

            state._fsp--;

             current =iv_ruleAbstractNode; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractNode4760); 

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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2458:1: ruleAbstractNode returns [EObject current=null] : (this_State_0= ruleState | this_Initial_1= ruleInitial | this_Final_2= ruleFinal | this_Any_3= ruleAny | this_Junction_4= ruleJunction | this_Fork_5= ruleFork ) ;
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
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2461:28: ( (this_State_0= ruleState | this_Initial_1= ruleInitial | this_Final_2= ruleFinal | this_Any_3= ruleAny | this_Junction_4= ruleJunction | this_Fork_5= ruleFork ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2462:1: (this_State_0= ruleState | this_Initial_1= ruleInitial | this_Final_2= ruleFinal | this_Any_3= ruleAny | this_Junction_4= ruleJunction | this_Fork_5= ruleFork )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2462:1: (this_State_0= ruleState | this_Initial_1= ruleInitial | this_Final_2= ruleFinal | this_Any_3= ruleAny | this_Junction_4= ruleJunction | this_Fork_5= ruleFork )
            int alt80=6;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt80=1;
                }
                break;
            case 44:
                {
                alt80=2;
                }
                break;
            case 46:
                {
                alt80=3;
                }
                break;
            case 47:
                {
                alt80=4;
                }
                break;
            case 48:
                {
                alt80=5;
                }
                break;
            case 49:
                {
                alt80=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2463:5: this_State_0= ruleState
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNodeAccess().getStateParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleState_in_ruleAbstractNode4807);
                    this_State_0=ruleState();

                    state._fsp--;

                     
                            current = this_State_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2473:5: this_Initial_1= ruleInitial
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNodeAccess().getInitialParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInitial_in_ruleAbstractNode4834);
                    this_Initial_1=ruleInitial();

                    state._fsp--;

                     
                            current = this_Initial_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2483:5: this_Final_2= ruleFinal
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNodeAccess().getFinalParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFinal_in_ruleAbstractNode4861);
                    this_Final_2=ruleFinal();

                    state._fsp--;

                     
                            current = this_Final_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2493:5: this_Any_3= ruleAny
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNodeAccess().getAnyParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAny_in_ruleAbstractNode4888);
                    this_Any_3=ruleAny();

                    state._fsp--;

                     
                            current = this_Any_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2503:5: this_Junction_4= ruleJunction
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNodeAccess().getJunctionParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleJunction_in_ruleAbstractNode4915);
                    this_Junction_4=ruleJunction();

                    state._fsp--;

                     
                            current = this_Junction_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2513:5: this_Fork_5= ruleFork
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNodeAccess().getForkParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFork_in_ruleAbstractNode4942);
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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2529:1: ruleConvergence returns [Enumerator current=null] : ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) ) ;
    public final Enumerator ruleConvergence() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2531:28: ( ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2532:1: ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2532:1: ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) )
            int alt81=3;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt81=1;
                }
                break;
            case 51:
                {
                alt81=2;
                }
                break;
            case 52:
                {
                alt81=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2532:2: (enumLiteral_0= 'ordinary' )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2532:2: (enumLiteral_0= 'ordinary' )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2532:4: enumLiteral_0= 'ordinary'
                    {
                    enumLiteral_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleConvergence4991); 

                            current = grammarAccess.getConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2538:6: (enumLiteral_1= 'convergent' )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2538:6: (enumLiteral_1= 'convergent' )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2538:8: enumLiteral_1= 'convergent'
                    {
                    enumLiteral_1=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleConvergence5008); 

                            current = grammarAccess.getConvergenceAccess().getConvergentEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getConvergenceAccess().getConvergentEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2544:6: (enumLiteral_2= 'anticipated' )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2544:6: (enumLiteral_2= 'anticipated' )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2544:8: enumLiteral_2= 'anticipated'
                    {
                    enumLiteral_2=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleConvergence5025); 

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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2554:1: ruleTranslationKind returns [Enumerator current=null] : ( (enumLiteral_0= 'MULTIVAR' ) | (enumLiteral_1= 'SINGLEVAR' ) | (enumLiteral_2= 'REFINEDVAR' ) ) ;
    public final Enumerator ruleTranslationKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2556:28: ( ( (enumLiteral_0= 'MULTIVAR' ) | (enumLiteral_1= 'SINGLEVAR' ) | (enumLiteral_2= 'REFINEDVAR' ) ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2557:1: ( (enumLiteral_0= 'MULTIVAR' ) | (enumLiteral_1= 'SINGLEVAR' ) | (enumLiteral_2= 'REFINEDVAR' ) )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2557:1: ( (enumLiteral_0= 'MULTIVAR' ) | (enumLiteral_1= 'SINGLEVAR' ) | (enumLiteral_2= 'REFINEDVAR' ) )
            int alt82=3;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt82=1;
                }
                break;
            case 54:
                {
                alt82=2;
                }
                break;
            case 55:
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
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2557:2: (enumLiteral_0= 'MULTIVAR' )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2557:2: (enumLiteral_0= 'MULTIVAR' )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2557:4: enumLiteral_0= 'MULTIVAR'
                    {
                    enumLiteral_0=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleTranslationKind5070); 

                            current = grammarAccess.getTranslationKindAccess().getMULTIVAREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTranslationKindAccess().getMULTIVAREnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2563:6: (enumLiteral_1= 'SINGLEVAR' )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2563:6: (enumLiteral_1= 'SINGLEVAR' )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2563:8: enumLiteral_1= 'SINGLEVAR'
                    {
                    enumLiteral_1=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleTranslationKind5087); 

                            current = grammarAccess.getTranslationKindAccess().getSINGLEVAREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTranslationKindAccess().getSINGLEVAREnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2569:6: (enumLiteral_2= 'REFINEDVAR' )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2569:6: (enumLiteral_2= 'REFINEDVAR' )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2569:8: enumLiteral_2= 'REFINEDVAR'
                    {
                    enumLiteral_2=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleTranslationKind5104); 

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
        public static final BitSet FOLLOW_ruleEString_in_ruleMachine152 = new BitSet(new long[]{0x00000002000FF000L});
        public static final BitSet FOLLOW_12_in_ruleMachine165 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMachine186 = new BitSet(new long[]{0x00000002000FE000L});
        public static final BitSet FOLLOW_13_in_ruleMachine201 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMachine224 = new BitSet(new long[]{0x00000002000FC030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMachine247 = new BitSet(new long[]{0x00000002000FC030L});
        public static final BitSet FOLLOW_14_in_ruleMachine263 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMachine286 = new BitSet(new long[]{0x00000002000F8030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMachine309 = new BitSet(new long[]{0x00000002000F8030L});
        public static final BitSet FOLLOW_15_in_ruleMachine325 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleMachine346 = new BitSet(new long[]{0x00000002000F0030L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleMachine367 = new BitSet(new long[]{0x00000002000F0030L});
        public static final BitSet FOLLOW_16_in_ruleMachine383 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_ruleInvariant_in_ruleMachine404 = new BitSet(new long[]{0x00000002001E0000L});
        public static final BitSet FOLLOW_ruleInvariant_in_ruleMachine425 = new BitSet(new long[]{0x00000002001E0000L});
        public static final BitSet FOLLOW_17_in_ruleMachine441 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_ruleVariant_in_ruleMachine462 = new BitSet(new long[]{0x00000002000C0000L});
        public static final BitSet FOLLOW_18_in_ruleMachine477 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleevent_in_ruleMachine498 = new BitSet(new long[]{0x0000000201080000L});
        public static final BitSet FOLLOW_ruleevent_in_ruleMachine519 = new BitSet(new long[]{0x0000000201080000L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleMachine544 = new BitSet(new long[]{0x0000000200080000L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleMachine565 = new BitSet(new long[]{0x0000000200080000L});
        public static final BitSet FOLLOW_19_in_ruleMachine580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_entryRuleAbstractExtension616 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractExtension626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStatemachine_in_ruleAbstractExtension672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString707 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable829 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariable839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariable894 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_ruleVariable907 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariable928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvariant_in_entryRuleInvariant966 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInvariant976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleInvariant1013 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInvariant1034 = new BitSet(new long[]{0x0000000000201032L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInvariant1055 = new BitSet(new long[]{0x0000000000201002L});
        public static final BitSet FOLLOW_21_in_ruleInvariant1074 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_ruleInvariant1101 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInvariant1122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariant_in_entryRuleVariant1160 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariant1170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleVariant1216 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleVariant1228 = new BitSet(new long[]{0x0000000000001032L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariant1249 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_ruleVariant1263 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariant1284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleevent_in_entryRuleevent1322 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleevent1332 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleevent1378 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleevent1399 = new BitSet(new long[]{0x001C00006E083000L});
        public static final BitSet FOLLOW_25_in_ruleevent1417 = new BitSet(new long[]{0x001C00006C083000L});
        public static final BitSet FOLLOW_ruleConvergence_in_ruleevent1452 = new BitSet(new long[]{0x000000006C083000L});
        public static final BitSet FOLLOW_12_in_ruleevent1466 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleevent1487 = new BitSet(new long[]{0x000000006C082000L});
        public static final BitSet FOLLOW_13_in_ruleevent1502 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleQString_in_ruleevent1525 = new BitSet(new long[]{0x000000006C080030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleevent1548 = new BitSet(new long[]{0x000000006C080030L});
        public static final BitSet FOLLOW_26_in_ruleevent1564 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_ruleGuard_in_ruleevent1585 = new BitSet(new long[]{0x0000000068180000L});
        public static final BitSet FOLLOW_ruleGuard_in_ruleevent1606 = new BitSet(new long[]{0x0000000068180000L});
        public static final BitSet FOLLOW_27_in_ruleevent1622 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleevent1643 = new BitSet(new long[]{0x0000000010000030L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleevent1664 = new BitSet(new long[]{0x0000000010000030L});
        public static final BitSet FOLLOW_28_in_ruleevent1677 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_ruleGuard_in_ruleevent1698 = new BitSet(new long[]{0x0000000060180000L});
        public static final BitSet FOLLOW_ruleGuard_in_ruleevent1719 = new BitSet(new long[]{0x0000000060180000L});
        public static final BitSet FOLLOW_29_in_ruleevent1735 = new BitSet(new long[]{0x0000000100100000L});
        public static final BitSet FOLLOW_ruleWitness_in_ruleevent1756 = new BitSet(new long[]{0x0000000140180000L});
        public static final BitSet FOLLOW_ruleWitness_in_ruleevent1777 = new BitSet(new long[]{0x0000000140180000L});
        public static final BitSet FOLLOW_30_in_ruleevent1793 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_ruleAction_in_ruleevent1814 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_ruleAction_in_ruleevent1835 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleevent1850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQString_in_entryRuleQString1887 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQString1898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleQString1938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQString1965 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_31_in_ruleQString1984 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQString1999 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter2047 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameter2057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleParameter2112 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_ruleParameter2125 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleParameter2146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGuard_in_entryRuleGuard2184 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGuard2194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleGuard2231 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGuard2252 = new BitSet(new long[]{0x0000000000201032L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGuard2273 = new BitSet(new long[]{0x0000000000201002L});
        public static final BitSet FOLLOW_21_in_ruleGuard2292 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_ruleGuard2319 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGuard2340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWitness_in_entryRuleWitness2378 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWitness2388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleWitness2431 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleWitness2457 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleWitness2478 = new BitSet(new long[]{0x0000000000001032L});
        public static final BitSet FOLLOW_ruleEString_in_ruleWitness2499 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_ruleWitness2513 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleWitness2534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAction_in_entryRuleAction2572 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAction2582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleAction2619 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAction2640 = new BitSet(new long[]{0x0000000000001032L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAction2661 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_ruleAction2675 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAction2696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStatemachine_in_entryRuleStatemachine2734 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStatemachine2744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleStatemachine2781 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStatemachine2802 = new BitSet(new long[]{0x0000005C00083000L});
        public static final BitSet FOLLOW_12_in_ruleStatemachine2815 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStatemachine2836 = new BitSet(new long[]{0x0000005C00082000L});
        public static final BitSet FOLLOW_34_in_ruleStatemachine2851 = new BitSet(new long[]{0x00E0000000000000L});
        public static final BitSet FOLLOW_ruleTranslationKind_in_ruleStatemachine2872 = new BitSet(new long[]{0x0000005800082000L});
        public static final BitSet FOLLOW_35_in_ruleStatemachine2887 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStatemachine2910 = new BitSet(new long[]{0x0000005000082000L});
        public static final BitSet FOLLOW_13_in_ruleStatemachine2925 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStatemachine2948 = new BitSet(new long[]{0x0000005000080000L});
        public static final BitSet FOLLOW_36_in_ruleStatemachine2963 = new BitSet(new long[]{0x0003D40000000000L});
        public static final BitSet FOLLOW_ruleAbstractNode_in_ruleStatemachine2984 = new BitSet(new long[]{0x0000006000080000L});
        public static final BitSet FOLLOW_37_in_ruleStatemachine2997 = new BitSet(new long[]{0x0003D40000000000L});
        public static final BitSet FOLLOW_ruleAbstractNode_in_ruleStatemachine3018 = new BitSet(new long[]{0x0000006000080000L});
        public static final BitSet FOLLOW_38_in_ruleStatemachine3035 = new BitSet(new long[]{0x0000008002000000L});
        public static final BitSet FOLLOW_ruleTransition_in_ruleStatemachine3056 = new BitSet(new long[]{0x0000008002080000L});
        public static final BitSet FOLLOW_ruleTransition_in_ruleStatemachine3077 = new BitSet(new long[]{0x0000008002080000L});
        public static final BitSet FOLLOW_19_in_ruleStatemachine3092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition3128 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransition3138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleTransition3190 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleTransition3216 = new BitSet(new long[]{0x000003086C081000L});
        public static final BitSet FOLLOW_12_in_ruleTransition3229 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransition3250 = new BitSet(new long[]{0x000003086C080000L});
        public static final BitSet FOLLOW_35_in_ruleTransition3265 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransition3288 = new BitSet(new long[]{0x000003006C080030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransition3311 = new BitSet(new long[]{0x000003006C080030L});
        public static final BitSet FOLLOW_40_in_ruleTransition3327 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransition3350 = new BitSet(new long[]{0x000002006C080000L});
        public static final BitSet FOLLOW_41_in_ruleTransition3365 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransition3388 = new BitSet(new long[]{0x000000006C080000L});
        public static final BitSet FOLLOW_26_in_ruleTransition3403 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_ruleGuard_in_ruleTransition3424 = new BitSet(new long[]{0x0000000068180000L});
        public static final BitSet FOLLOW_ruleGuard_in_ruleTransition3445 = new BitSet(new long[]{0x0000000068180000L});
        public static final BitSet FOLLOW_27_in_ruleTransition3461 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleTypedParameter_in_ruleTransition3482 = new BitSet(new long[]{0x0000000060080030L});
        public static final BitSet FOLLOW_ruleTypedParameter_in_ruleTransition3503 = new BitSet(new long[]{0x0000000060080030L});
        public static final BitSet FOLLOW_29_in_ruleTransition3519 = new BitSet(new long[]{0x0000000100100000L});
        public static final BitSet FOLLOW_ruleWitness_in_ruleTransition3540 = new BitSet(new long[]{0x0000000140180000L});
        public static final BitSet FOLLOW_ruleWitness_in_ruleTransition3561 = new BitSet(new long[]{0x0000000140180000L});
        public static final BitSet FOLLOW_30_in_ruleTransition3577 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_ruleAction_in_ruleTransition3598 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_ruleAction_in_ruleTransition3619 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleTransition3634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleState_in_entryRuleState3670 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleState3680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleState3726 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleState3747 = new BitSet(new long[]{0x0000080000012002L});
        public static final BitSet FOLLOW_13_in_ruleState3760 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleState3783 = new BitSet(new long[]{0x0000080000010002L});
        public static final BitSet FOLLOW_43_in_ruleState3798 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_ruleStatemachine_in_ruleState3819 = new BitSet(new long[]{0x0000000200080000L});
        public static final BitSet FOLLOW_ruleStatemachine_in_ruleState3840 = new BitSet(new long[]{0x0000000200080000L});
        public static final BitSet FOLLOW_19_in_ruleState3853 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_16_in_ruleState3868 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_ruleInvariant_in_ruleState3889 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_ruleInvariant_in_ruleState3910 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_ruleInitial_in_entryRuleInitial3949 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInitial3959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleInitial4005 = new BitSet(new long[]{0x0000200000000002L});
        public static final BitSet FOLLOW_45_in_ruleInitial4018 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInitial4039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFinal_in_entryRuleFinal4077 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFinal4087 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleFinal4133 = new BitSet(new long[]{0x0000200000000002L});
        public static final BitSet FOLLOW_45_in_ruleFinal4146 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFinal4167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAny_in_entryRuleAny4205 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAny4215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleAny4261 = new BitSet(new long[]{0x0000200000000002L});
        public static final BitSet FOLLOW_45_in_ruleAny4274 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAny4295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleJunction_in_entryRuleJunction4333 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleJunction4343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleJunction4389 = new BitSet(new long[]{0x0000200000000002L});
        public static final BitSet FOLLOW_45_in_ruleJunction4402 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleJunction4423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFork_in_entryRuleFork4461 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFork4471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleFork4517 = new BitSet(new long[]{0x0000200000000002L});
        public static final BitSet FOLLOW_45_in_ruleFork4530 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFork4551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedParameter_in_entryRuleTypedParameter4589 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypedParameter4599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTypedParameter4645 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleTypedParameter4657 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTypedParameter4678 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_ruleTypedParameter4691 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTypedParameter4712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractNode_in_entryRuleAbstractNode4750 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractNode4760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleState_in_ruleAbstractNode4807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInitial_in_ruleAbstractNode4834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFinal_in_ruleAbstractNode4861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAny_in_ruleAbstractNode4888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleJunction_in_ruleAbstractNode4915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFork_in_ruleAbstractNode4942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleConvergence4991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleConvergence5008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleConvergence5025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleTranslationKind5070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleTranslationKind5087 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleTranslationKind5104 = new BitSet(new long[]{0x0000000000000002L});
    }


}