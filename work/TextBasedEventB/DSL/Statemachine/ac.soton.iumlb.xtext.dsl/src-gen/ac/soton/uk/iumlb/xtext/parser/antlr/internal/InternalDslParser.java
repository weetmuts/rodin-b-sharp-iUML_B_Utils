package ac.soton.uk.iumlb.xtext.parser.antlr.internal; 

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
import ac.soton.uk.iumlb.xtext.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Statemachine'", "'>'", "'translation'", "'elaborates'", "'refines'", "'nodes'", "','", "'transitions'", "'end'", "'extended'", "'Transition'", "'target'", "'source'", "'when'", "'any'", "'where'", "'with'", "'then'", "'State'", "'statemachines'", "'invariants'", "'Initial'", "'internalId'", "'Final'", "'Any'", "'Junction'", "'Fork'", "'Invariant'", "'@'", "'theorem'", "'TypedParameter'", "'type'", "'Witness'", "'MULTIVAR'", "'SINGLEVAR'", "'REFINEDVAR'"
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
    public String getGrammarFileName() { return "../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g"; }



     	private DslGrammarAccess grammarAccess;
     	
        public InternalDslParser(TokenStream input, DslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Statemachine";	
       	}
       	
       	@Override
       	protected DslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleStatemachine"
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:68:1: entryRuleStatemachine returns [EObject current=null] : iv_ruleStatemachine= ruleStatemachine EOF ;
    public final EObject entryRuleStatemachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatemachine = null;


        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:69:2: (iv_ruleStatemachine= ruleStatemachine EOF )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:70:2: iv_ruleStatemachine= ruleStatemachine EOF
            {
             newCompositeNode(grammarAccess.getStatemachineRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStatemachine_in_entryRuleStatemachine75);
            iv_ruleStatemachine=ruleStatemachine();

            state._fsp--;

             current =iv_ruleStatemachine; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStatemachine85); 

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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:77:1: ruleStatemachine returns [EObject current=null] : (otherlv_0= 'Statemachine' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '>' ( (lv_comment_3_0= ruleEString ) ) )? (otherlv_4= 'translation' ( (lv_translation_5_0= ruleTranslationKind ) ) )? (otherlv_6= 'elaborates' ( ( ruleEString ) ) )? (otherlv_8= 'refines' ( ( ruleEString ) ) )? (otherlv_10= 'nodes' ( (lv_nodes_11_0= ruleAbstractNode ) ) (otherlv_12= ',' ( (lv_nodes_13_0= ruleAbstractNode ) ) )* )? (otherlv_14= 'transitions' ( (lv_transitions_15_0= ruleTransition ) ) ( (lv_transitions_16_0= ruleTransition ) )* )? otherlv_17= 'end' ) ;
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
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:80:28: ( (otherlv_0= 'Statemachine' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '>' ( (lv_comment_3_0= ruleEString ) ) )? (otherlv_4= 'translation' ( (lv_translation_5_0= ruleTranslationKind ) ) )? (otherlv_6= 'elaborates' ( ( ruleEString ) ) )? (otherlv_8= 'refines' ( ( ruleEString ) ) )? (otherlv_10= 'nodes' ( (lv_nodes_11_0= ruleAbstractNode ) ) (otherlv_12= ',' ( (lv_nodes_13_0= ruleAbstractNode ) ) )* )? (otherlv_14= 'transitions' ( (lv_transitions_15_0= ruleTransition ) ) ( (lv_transitions_16_0= ruleTransition ) )* )? otherlv_17= 'end' ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:81:1: (otherlv_0= 'Statemachine' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '>' ( (lv_comment_3_0= ruleEString ) ) )? (otherlv_4= 'translation' ( (lv_translation_5_0= ruleTranslationKind ) ) )? (otherlv_6= 'elaborates' ( ( ruleEString ) ) )? (otherlv_8= 'refines' ( ( ruleEString ) ) )? (otherlv_10= 'nodes' ( (lv_nodes_11_0= ruleAbstractNode ) ) (otherlv_12= ',' ( (lv_nodes_13_0= ruleAbstractNode ) ) )* )? (otherlv_14= 'transitions' ( (lv_transitions_15_0= ruleTransition ) ) ( (lv_transitions_16_0= ruleTransition ) )* )? otherlv_17= 'end' )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:81:1: (otherlv_0= 'Statemachine' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '>' ( (lv_comment_3_0= ruleEString ) ) )? (otherlv_4= 'translation' ( (lv_translation_5_0= ruleTranslationKind ) ) )? (otherlv_6= 'elaborates' ( ( ruleEString ) ) )? (otherlv_8= 'refines' ( ( ruleEString ) ) )? (otherlv_10= 'nodes' ( (lv_nodes_11_0= ruleAbstractNode ) ) (otherlv_12= ',' ( (lv_nodes_13_0= ruleAbstractNode ) ) )* )? (otherlv_14= 'transitions' ( (lv_transitions_15_0= ruleTransition ) ) ( (lv_transitions_16_0= ruleTransition ) )* )? otherlv_17= 'end' )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:81:3: otherlv_0= 'Statemachine' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '>' ( (lv_comment_3_0= ruleEString ) ) )? (otherlv_4= 'translation' ( (lv_translation_5_0= ruleTranslationKind ) ) )? (otherlv_6= 'elaborates' ( ( ruleEString ) ) )? (otherlv_8= 'refines' ( ( ruleEString ) ) )? (otherlv_10= 'nodes' ( (lv_nodes_11_0= ruleAbstractNode ) ) (otherlv_12= ',' ( (lv_nodes_13_0= ruleAbstractNode ) ) )* )? (otherlv_14= 'transitions' ( (lv_transitions_15_0= ruleTransition ) ) ( (lv_transitions_16_0= ruleTransition ) )* )? otherlv_17= 'end'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleStatemachine122); 

                	newLeafNode(otherlv_0, grammarAccess.getStatemachineAccess().getStatemachineKeyword_0());
                
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:85:1: ( (lv_name_1_0= ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:86:1: (lv_name_1_0= ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:86:1: (lv_name_1_0= ruleEString )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:87:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStatemachineAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStatemachine143);
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

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:103:2: (otherlv_2= '>' ( (lv_comment_3_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:103:4: otherlv_2= '>' ( (lv_comment_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleStatemachine156); 

                        	newLeafNode(otherlv_2, grammarAccess.getStatemachineAccess().getGreaterThanSignKeyword_2_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:107:1: ( (lv_comment_3_0= ruleEString ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:108:1: (lv_comment_3_0= ruleEString )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:108:1: (lv_comment_3_0= ruleEString )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:109:3: lv_comment_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getStatemachineAccess().getCommentEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStatemachine177);
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

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:125:4: (otherlv_4= 'translation' ( (lv_translation_5_0= ruleTranslationKind ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:125:6: otherlv_4= 'translation' ( (lv_translation_5_0= ruleTranslationKind ) )
                    {
                    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleStatemachine192); 

                        	newLeafNode(otherlv_4, grammarAccess.getStatemachineAccess().getTranslationKeyword_3_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:129:1: ( (lv_translation_5_0= ruleTranslationKind ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:130:1: (lv_translation_5_0= ruleTranslationKind )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:130:1: (lv_translation_5_0= ruleTranslationKind )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:131:3: lv_translation_5_0= ruleTranslationKind
                    {
                     
                    	        newCompositeNode(grammarAccess.getStatemachineAccess().getTranslationTranslationKindEnumRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTranslationKind_in_ruleStatemachine213);
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

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:147:4: (otherlv_6= 'elaborates' ( ( ruleEString ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:147:6: otherlv_6= 'elaborates' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleStatemachine228); 

                        	newLeafNode(otherlv_6, grammarAccess.getStatemachineAccess().getElaboratesKeyword_4_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:151:1: ( ( ruleEString ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:152:1: ( ruleEString )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:152:1: ( ruleEString )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:153:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStatemachineRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getStatemachineAccess().getElaboratesEventBNamedCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStatemachine251);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:166:4: (otherlv_8= 'refines' ( ( ruleEString ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:166:6: otherlv_8= 'refines' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleStatemachine266); 

                        	newLeafNode(otherlv_8, grammarAccess.getStatemachineAccess().getRefinesKeyword_5_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:170:1: ( ( ruleEString ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:171:1: ( ruleEString )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:171:1: ( ruleEString )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:172:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStatemachineRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getStatemachineAccess().getRefinesStatemachineCrossReference_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStatemachine289);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:185:4: (otherlv_10= 'nodes' ( (lv_nodes_11_0= ruleAbstractNode ) ) (otherlv_12= ',' ( (lv_nodes_13_0= ruleAbstractNode ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:185:6: otherlv_10= 'nodes' ( (lv_nodes_11_0= ruleAbstractNode ) ) (otherlv_12= ',' ( (lv_nodes_13_0= ruleAbstractNode ) ) )*
                    {
                    otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleStatemachine304); 

                        	newLeafNode(otherlv_10, grammarAccess.getStatemachineAccess().getNodesKeyword_6_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:189:1: ( (lv_nodes_11_0= ruleAbstractNode ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:190:1: (lv_nodes_11_0= ruleAbstractNode )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:190:1: (lv_nodes_11_0= ruleAbstractNode )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:191:3: lv_nodes_11_0= ruleAbstractNode
                    {
                     
                    	        newCompositeNode(grammarAccess.getStatemachineAccess().getNodesAbstractNodeParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractNode_in_ruleStatemachine325);
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

                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:207:2: (otherlv_12= ',' ( (lv_nodes_13_0= ruleAbstractNode ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==17) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:207:4: otherlv_12= ',' ( (lv_nodes_13_0= ruleAbstractNode ) )
                    	    {
                    	    otherlv_12=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleStatemachine338); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getStatemachineAccess().getCommaKeyword_6_2_0());
                    	        
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:211:1: ( (lv_nodes_13_0= ruleAbstractNode ) )
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:212:1: (lv_nodes_13_0= ruleAbstractNode )
                    	    {
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:212:1: (lv_nodes_13_0= ruleAbstractNode )
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:213:3: lv_nodes_13_0= ruleAbstractNode
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStatemachineAccess().getNodesAbstractNodeParserRuleCall_6_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractNode_in_ruleStatemachine359);
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
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:229:6: (otherlv_14= 'transitions' ( (lv_transitions_15_0= ruleTransition ) ) ( (lv_transitions_16_0= ruleTransition ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:229:8: otherlv_14= 'transitions' ( (lv_transitions_15_0= ruleTransition ) ) ( (lv_transitions_16_0= ruleTransition ) )*
                    {
                    otherlv_14=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleStatemachine376); 

                        	newLeafNode(otherlv_14, grammarAccess.getStatemachineAccess().getTransitionsKeyword_7_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:233:1: ( (lv_transitions_15_0= ruleTransition ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:234:1: (lv_transitions_15_0= ruleTransition )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:234:1: (lv_transitions_15_0= ruleTransition )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:235:3: lv_transitions_15_0= ruleTransition
                    {
                     
                    	        newCompositeNode(grammarAccess.getStatemachineAccess().getTransitionsTransitionParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTransition_in_ruleStatemachine397);
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

                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:251:2: ( (lv_transitions_16_0= ruleTransition ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>=20 && LA7_0<=21)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:252:1: (lv_transitions_16_0= ruleTransition )
                    	    {
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:252:1: (lv_transitions_16_0= ruleTransition )
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:253:3: lv_transitions_16_0= ruleTransition
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStatemachineAccess().getTransitionsTransitionParserRuleCall_7_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTransition_in_ruleStatemachine418);
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
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_17=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleStatemachine433); 

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


    // $ANTLR start "entryRuleAbstractNode"
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:281:1: entryRuleAbstractNode returns [EObject current=null] : iv_ruleAbstractNode= ruleAbstractNode EOF ;
    public final EObject entryRuleAbstractNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractNode = null;


        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:282:2: (iv_ruleAbstractNode= ruleAbstractNode EOF )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:283:2: iv_ruleAbstractNode= ruleAbstractNode EOF
            {
             newCompositeNode(grammarAccess.getAbstractNodeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractNode_in_entryRuleAbstractNode469);
            iv_ruleAbstractNode=ruleAbstractNode();

            state._fsp--;

             current =iv_ruleAbstractNode; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractNode479); 

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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:290:1: ruleAbstractNode returns [EObject current=null] : (this_State_0= ruleState | this_Initial_1= ruleInitial | this_Final_2= ruleFinal | this_Any_3= ruleAny | this_Junction_4= ruleJunction | this_Fork_5= ruleFork ) ;
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
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:293:28: ( (this_State_0= ruleState | this_Initial_1= ruleInitial | this_Final_2= ruleFinal | this_Any_3= ruleAny | this_Junction_4= ruleJunction | this_Fork_5= ruleFork ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:294:1: (this_State_0= ruleState | this_Initial_1= ruleInitial | this_Final_2= ruleFinal | this_Any_3= ruleAny | this_Junction_4= ruleJunction | this_Fork_5= ruleFork )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:294:1: (this_State_0= ruleState | this_Initial_1= ruleInitial | this_Final_2= ruleFinal | this_Any_3= ruleAny | this_Junction_4= ruleJunction | this_Fork_5= ruleFork )
            int alt9=6;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt9=1;
                }
                break;
            case 32:
                {
                alt9=2;
                }
                break;
            case 34:
                {
                alt9=3;
                }
                break;
            case 35:
                {
                alt9=4;
                }
                break;
            case 36:
                {
                alt9=5;
                }
                break;
            case 37:
                {
                alt9=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:295:5: this_State_0= ruleState
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNodeAccess().getStateParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleState_in_ruleAbstractNode526);
                    this_State_0=ruleState();

                    state._fsp--;

                     
                            current = this_State_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:305:5: this_Initial_1= ruleInitial
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNodeAccess().getInitialParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInitial_in_ruleAbstractNode553);
                    this_Initial_1=ruleInitial();

                    state._fsp--;

                     
                            current = this_Initial_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:315:5: this_Final_2= ruleFinal
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNodeAccess().getFinalParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFinal_in_ruleAbstractNode580);
                    this_Final_2=ruleFinal();

                    state._fsp--;

                     
                            current = this_Final_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:325:5: this_Any_3= ruleAny
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNodeAccess().getAnyParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAny_in_ruleAbstractNode607);
                    this_Any_3=ruleAny();

                    state._fsp--;

                     
                            current = this_Any_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:335:5: this_Junction_4= ruleJunction
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNodeAccess().getJunctionParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleJunction_in_ruleAbstractNode634);
                    this_Junction_4=ruleJunction();

                    state._fsp--;

                     
                            current = this_Junction_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:345:5: this_Fork_5= ruleFork
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNodeAccess().getForkParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFork_in_ruleAbstractNode661);
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


    // $ANTLR start "entryRuleEString"
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:363:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:364:2: (iv_ruleEString= ruleEString EOF )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:365:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString699);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString710); 

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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:372:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:375:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:376:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:376:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:376:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString750); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:384:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString776); 

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


    // $ANTLR start "entryRuleTransition"
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:399:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:400:2: (iv_ruleTransition= ruleTransition EOF )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:401:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransition_in_entryRuleTransition821);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransition831); 

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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:408:1: ruleTransition returns [EObject current=null] : ( () ( (lv_extended_1_0= 'extended' ) )? otherlv_2= 'Transition' (otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) ) )? (otherlv_5= 'elaborates' ( ( ruleEString ) ) ( ( ruleEString ) )* )? (otherlv_8= 'target' ( ( ruleEString ) ) )? (otherlv_10= 'source' ( ( ruleEString ) ) )? (otherlv_12= 'when' ( (lv_guards_13_0= ruleGuard ) ) ( (lv_guards_14_0= ruleGuard ) )* )? (otherlv_15= 'any' ( (lv_parameters_16_0= ruleTypedParameter ) ) ( (lv_parameters_17_0= ruleTypedParameter ) )* otherlv_18= 'where' ( (lv_guards_19_0= ruleGuard ) ) ( (lv_guards_20_0= ruleGuard ) )* )? (otherlv_21= 'with' ( (lv_witnesses_22_0= ruleWitness ) ) ( (lv_witnesses_23_0= ruleWitness ) )* )? (otherlv_24= 'then' ( (lv_actions_25_0= ruleAction ) ) ( (lv_actions_26_0= ruleAction ) )* )? otherlv_27= 'end' ) ;
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
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:411:28: ( ( () ( (lv_extended_1_0= 'extended' ) )? otherlv_2= 'Transition' (otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) ) )? (otherlv_5= 'elaborates' ( ( ruleEString ) ) ( ( ruleEString ) )* )? (otherlv_8= 'target' ( ( ruleEString ) ) )? (otherlv_10= 'source' ( ( ruleEString ) ) )? (otherlv_12= 'when' ( (lv_guards_13_0= ruleGuard ) ) ( (lv_guards_14_0= ruleGuard ) )* )? (otherlv_15= 'any' ( (lv_parameters_16_0= ruleTypedParameter ) ) ( (lv_parameters_17_0= ruleTypedParameter ) )* otherlv_18= 'where' ( (lv_guards_19_0= ruleGuard ) ) ( (lv_guards_20_0= ruleGuard ) )* )? (otherlv_21= 'with' ( (lv_witnesses_22_0= ruleWitness ) ) ( (lv_witnesses_23_0= ruleWitness ) )* )? (otherlv_24= 'then' ( (lv_actions_25_0= ruleAction ) ) ( (lv_actions_26_0= ruleAction ) )* )? otherlv_27= 'end' ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:412:1: ( () ( (lv_extended_1_0= 'extended' ) )? otherlv_2= 'Transition' (otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) ) )? (otherlv_5= 'elaborates' ( ( ruleEString ) ) ( ( ruleEString ) )* )? (otherlv_8= 'target' ( ( ruleEString ) ) )? (otherlv_10= 'source' ( ( ruleEString ) ) )? (otherlv_12= 'when' ( (lv_guards_13_0= ruleGuard ) ) ( (lv_guards_14_0= ruleGuard ) )* )? (otherlv_15= 'any' ( (lv_parameters_16_0= ruleTypedParameter ) ) ( (lv_parameters_17_0= ruleTypedParameter ) )* otherlv_18= 'where' ( (lv_guards_19_0= ruleGuard ) ) ( (lv_guards_20_0= ruleGuard ) )* )? (otherlv_21= 'with' ( (lv_witnesses_22_0= ruleWitness ) ) ( (lv_witnesses_23_0= ruleWitness ) )* )? (otherlv_24= 'then' ( (lv_actions_25_0= ruleAction ) ) ( (lv_actions_26_0= ruleAction ) )* )? otherlv_27= 'end' )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:412:1: ( () ( (lv_extended_1_0= 'extended' ) )? otherlv_2= 'Transition' (otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) ) )? (otherlv_5= 'elaborates' ( ( ruleEString ) ) ( ( ruleEString ) )* )? (otherlv_8= 'target' ( ( ruleEString ) ) )? (otherlv_10= 'source' ( ( ruleEString ) ) )? (otherlv_12= 'when' ( (lv_guards_13_0= ruleGuard ) ) ( (lv_guards_14_0= ruleGuard ) )* )? (otherlv_15= 'any' ( (lv_parameters_16_0= ruleTypedParameter ) ) ( (lv_parameters_17_0= ruleTypedParameter ) )* otherlv_18= 'where' ( (lv_guards_19_0= ruleGuard ) ) ( (lv_guards_20_0= ruleGuard ) )* )? (otherlv_21= 'with' ( (lv_witnesses_22_0= ruleWitness ) ) ( (lv_witnesses_23_0= ruleWitness ) )* )? (otherlv_24= 'then' ( (lv_actions_25_0= ruleAction ) ) ( (lv_actions_26_0= ruleAction ) )* )? otherlv_27= 'end' )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:412:2: () ( (lv_extended_1_0= 'extended' ) )? otherlv_2= 'Transition' (otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) ) )? (otherlv_5= 'elaborates' ( ( ruleEString ) ) ( ( ruleEString ) )* )? (otherlv_8= 'target' ( ( ruleEString ) ) )? (otherlv_10= 'source' ( ( ruleEString ) ) )? (otherlv_12= 'when' ( (lv_guards_13_0= ruleGuard ) ) ( (lv_guards_14_0= ruleGuard ) )* )? (otherlv_15= 'any' ( (lv_parameters_16_0= ruleTypedParameter ) ) ( (lv_parameters_17_0= ruleTypedParameter ) )* otherlv_18= 'where' ( (lv_guards_19_0= ruleGuard ) ) ( (lv_guards_20_0= ruleGuard ) )* )? (otherlv_21= 'with' ( (lv_witnesses_22_0= ruleWitness ) ) ( (lv_witnesses_23_0= ruleWitness ) )* )? (otherlv_24= 'then' ( (lv_actions_25_0= ruleAction ) ) ( (lv_actions_26_0= ruleAction ) )* )? otherlv_27= 'end'
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:412:2: ()
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:413:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTransitionAccess().getTransitionAction_0(),
                        current);
                

            }

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:418:2: ( (lv_extended_1_0= 'extended' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:419:1: (lv_extended_1_0= 'extended' )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:419:1: (lv_extended_1_0= 'extended' )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:420:3: lv_extended_1_0= 'extended'
                    {
                    lv_extended_1_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleTransition883); 

                            newLeafNode(lv_extended_1_0, grammarAccess.getTransitionAccess().getExtendedExtendedKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                           		setWithLastConsumed(current, "extended", true, "extended");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleTransition909); 

                	newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getTransitionKeyword_2());
                
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:437:1: (otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==12) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:437:3: otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTransition922); 

                        	newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getGreaterThanSignKeyword_3_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:441:1: ( (lv_comment_4_0= ruleEString ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:442:1: (lv_comment_4_0= ruleEString )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:442:1: (lv_comment_4_0= ruleEString )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:443:3: lv_comment_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getTransitionAccess().getCommentEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransition943);
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

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:459:4: (otherlv_5= 'elaborates' ( ( ruleEString ) ) ( ( ruleEString ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==14) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:459:6: otherlv_5= 'elaborates' ( ( ruleEString ) ) ( ( ruleEString ) )*
                    {
                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTransition958); 

                        	newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getElaboratesKeyword_4_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:463:1: ( ( ruleEString ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:464:1: ( ruleEString )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:464:1: ( ruleEString )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:465:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getTransitionAccess().getElaboratesEventCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransition981);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:478:2: ( ( ruleEString ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_ID)) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:479:1: ( ruleEString )
                    	    {
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:479:1: ( ruleEString )
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:480:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getTransitionAccess().getElaboratesEventCrossReference_4_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransition1004);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
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

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:493:5: (otherlv_8= 'target' ( ( ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:493:7: otherlv_8= 'target' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleTransition1020); 

                        	newLeafNode(otherlv_8, grammarAccess.getTransitionAccess().getTargetKeyword_5_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:497:1: ( ( ruleEString ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:498:1: ( ruleEString )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:498:1: ( ruleEString )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:499:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getTransitionAccess().getTargetAbstractNodeCrossReference_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransition1043);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:512:4: (otherlv_10= 'source' ( ( ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:512:6: otherlv_10= 'source' ( ( ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleTransition1058); 

                        	newLeafNode(otherlv_10, grammarAccess.getTransitionAccess().getSourceKeyword_6_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:516:1: ( ( ruleEString ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:517:1: ( ruleEString )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:517:1: ( ruleEString )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:518:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getTransitionAccess().getSourceAbstractNodeCrossReference_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransition1081);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:531:4: (otherlv_12= 'when' ( (lv_guards_13_0= ruleGuard ) ) ( (lv_guards_14_0= ruleGuard ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==24) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:531:6: otherlv_12= 'when' ( (lv_guards_13_0= ruleGuard ) ) ( (lv_guards_14_0= ruleGuard ) )*
                    {
                    otherlv_12=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleTransition1096); 

                        	newLeafNode(otherlv_12, grammarAccess.getTransitionAccess().getWhenKeyword_7_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:535:1: ( (lv_guards_13_0= ruleGuard ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:536:1: (lv_guards_13_0= ruleGuard )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:536:1: (lv_guards_13_0= ruleGuard )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:537:3: lv_guards_13_0= ruleGuard
                    {
                     
                    	        newCompositeNode(grammarAccess.getTransitionAccess().getGuardsGuardParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleGuard_in_ruleTransition1117);
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

                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:553:2: ( (lv_guards_14_0= ruleGuard ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( ((LA17_0>=39 && LA17_0<=40)) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:554:1: (lv_guards_14_0= ruleGuard )
                    	    {
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:554:1: (lv_guards_14_0= ruleGuard )
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:555:3: lv_guards_14_0= ruleGuard
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTransitionAccess().getGuardsGuardParserRuleCall_7_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleGuard_in_ruleTransition1138);
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
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:571:5: (otherlv_15= 'any' ( (lv_parameters_16_0= ruleTypedParameter ) ) ( (lv_parameters_17_0= ruleTypedParameter ) )* otherlv_18= 'where' ( (lv_guards_19_0= ruleGuard ) ) ( (lv_guards_20_0= ruleGuard ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==25) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:571:7: otherlv_15= 'any' ( (lv_parameters_16_0= ruleTypedParameter ) ) ( (lv_parameters_17_0= ruleTypedParameter ) )* otherlv_18= 'where' ( (lv_guards_19_0= ruleGuard ) ) ( (lv_guards_20_0= ruleGuard ) )*
                    {
                    otherlv_15=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleTransition1154); 

                        	newLeafNode(otherlv_15, grammarAccess.getTransitionAccess().getAnyKeyword_8_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:575:1: ( (lv_parameters_16_0= ruleTypedParameter ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:576:1: (lv_parameters_16_0= ruleTypedParameter )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:576:1: (lv_parameters_16_0= ruleTypedParameter )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:577:3: lv_parameters_16_0= ruleTypedParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getTransitionAccess().getParametersTypedParameterParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTypedParameter_in_ruleTransition1175);
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

                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:593:2: ( (lv_parameters_17_0= ruleTypedParameter ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==41) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:594:1: (lv_parameters_17_0= ruleTypedParameter )
                    	    {
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:594:1: (lv_parameters_17_0= ruleTypedParameter )
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:595:3: lv_parameters_17_0= ruleTypedParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTransitionAccess().getParametersTypedParameterParserRuleCall_8_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTypedParameter_in_ruleTransition1196);
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
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleTransition1209); 

                        	newLeafNode(otherlv_18, grammarAccess.getTransitionAccess().getWhereKeyword_8_3());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:615:1: ( (lv_guards_19_0= ruleGuard ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:616:1: (lv_guards_19_0= ruleGuard )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:616:1: (lv_guards_19_0= ruleGuard )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:617:3: lv_guards_19_0= ruleGuard
                    {
                     
                    	        newCompositeNode(grammarAccess.getTransitionAccess().getGuardsGuardParserRuleCall_8_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleGuard_in_ruleTransition1230);
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

                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:633:2: ( (lv_guards_20_0= ruleGuard ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( ((LA20_0>=39 && LA20_0<=40)) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:634:1: (lv_guards_20_0= ruleGuard )
                    	    {
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:634:1: (lv_guards_20_0= ruleGuard )
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:635:3: lv_guards_20_0= ruleGuard
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTransitionAccess().getGuardsGuardParserRuleCall_8_5_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleGuard_in_ruleTransition1251);
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
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:651:5: (otherlv_21= 'with' ( (lv_witnesses_22_0= ruleWitness ) ) ( (lv_witnesses_23_0= ruleWitness ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==27) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:651:7: otherlv_21= 'with' ( (lv_witnesses_22_0= ruleWitness ) ) ( (lv_witnesses_23_0= ruleWitness ) )*
                    {
                    otherlv_21=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleTransition1267); 

                        	newLeafNode(otherlv_21, grammarAccess.getTransitionAccess().getWithKeyword_9_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:655:1: ( (lv_witnesses_22_0= ruleWitness ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:656:1: (lv_witnesses_22_0= ruleWitness )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:656:1: (lv_witnesses_22_0= ruleWitness )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:657:3: lv_witnesses_22_0= ruleWitness
                    {
                     
                    	        newCompositeNode(grammarAccess.getTransitionAccess().getWitnessesWitnessParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleWitness_in_ruleTransition1288);
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

                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:673:2: ( (lv_witnesses_23_0= ruleWitness ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==43) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:674:1: (lv_witnesses_23_0= ruleWitness )
                    	    {
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:674:1: (lv_witnesses_23_0= ruleWitness )
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:675:3: lv_witnesses_23_0= ruleWitness
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTransitionAccess().getWitnessesWitnessParserRuleCall_9_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleWitness_in_ruleTransition1309);
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
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:691:5: (otherlv_24= 'then' ( (lv_actions_25_0= ruleAction ) ) ( (lv_actions_26_0= ruleAction ) )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==28) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:691:7: otherlv_24= 'then' ( (lv_actions_25_0= ruleAction ) ) ( (lv_actions_26_0= ruleAction ) )*
                    {
                    otherlv_24=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleTransition1325); 

                        	newLeafNode(otherlv_24, grammarAccess.getTransitionAccess().getThenKeyword_10_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:695:1: ( (lv_actions_25_0= ruleAction ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:696:1: (lv_actions_25_0= ruleAction )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:696:1: (lv_actions_25_0= ruleAction )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:697:3: lv_actions_25_0= ruleAction
                    {
                     
                    	        newCompositeNode(grammarAccess.getTransitionAccess().getActionsActionParserRuleCall_10_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAction_in_ruleTransition1346);
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

                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:713:2: ( (lv_actions_26_0= ruleAction ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==39) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:714:1: (lv_actions_26_0= ruleAction )
                    	    {
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:714:1: (lv_actions_26_0= ruleAction )
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:715:3: lv_actions_26_0= ruleAction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTransitionAccess().getActionsActionParserRuleCall_10_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAction_in_ruleTransition1367);
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
                    	    break loop24;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_27=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleTransition1382); 

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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:745:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:746:2: (iv_ruleState= ruleState EOF )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:747:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleState_in_entryRuleState1420);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleState1430); 

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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:754:1: ruleState returns [EObject current=null] : ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'refines' ( ( ruleEString ) ) )? (otherlv_5= 'statemachines' ( (lv_statemachines_6_0= ruleStatemachine ) ) ( (lv_statemachines_7_0= ruleStatemachine ) )* otherlv_8= 'end' )? (otherlv_9= 'invariants' ( (lv_invariants_10_0= ruleInvariant ) ) ( (lv_invariants_11_0= ruleInvariant ) )* )? ) ;
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
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:757:28: ( ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'refines' ( ( ruleEString ) ) )? (otherlv_5= 'statemachines' ( (lv_statemachines_6_0= ruleStatemachine ) ) ( (lv_statemachines_7_0= ruleStatemachine ) )* otherlv_8= 'end' )? (otherlv_9= 'invariants' ( (lv_invariants_10_0= ruleInvariant ) ) ( (lv_invariants_11_0= ruleInvariant ) )* )? ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:758:1: ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'refines' ( ( ruleEString ) ) )? (otherlv_5= 'statemachines' ( (lv_statemachines_6_0= ruleStatemachine ) ) ( (lv_statemachines_7_0= ruleStatemachine ) )* otherlv_8= 'end' )? (otherlv_9= 'invariants' ( (lv_invariants_10_0= ruleInvariant ) ) ( (lv_invariants_11_0= ruleInvariant ) )* )? )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:758:1: ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'refines' ( ( ruleEString ) ) )? (otherlv_5= 'statemachines' ( (lv_statemachines_6_0= ruleStatemachine ) ) ( (lv_statemachines_7_0= ruleStatemachine ) )* otherlv_8= 'end' )? (otherlv_9= 'invariants' ( (lv_invariants_10_0= ruleInvariant ) ) ( (lv_invariants_11_0= ruleInvariant ) )* )? )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:758:2: () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'refines' ( ( ruleEString ) ) )? (otherlv_5= 'statemachines' ( (lv_statemachines_6_0= ruleStatemachine ) ) ( (lv_statemachines_7_0= ruleStatemachine ) )* otherlv_8= 'end' )? (otherlv_9= 'invariants' ( (lv_invariants_10_0= ruleInvariant ) ) ( (lv_invariants_11_0= ruleInvariant ) )* )?
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:758:2: ()
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:759:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStateAccess().getStateAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleState1476); 

                	newLeafNode(otherlv_1, grammarAccess.getStateAccess().getStateKeyword_1());
                
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:768:1: ( (lv_name_2_0= ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:769:1: (lv_name_2_0= ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:769:1: (lv_name_2_0= ruleEString )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:770:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleState1497);
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

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:786:2: (otherlv_3= 'refines' ( ( ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==15) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:786:4: otherlv_3= 'refines' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleState1510); 

                        	newLeafNode(otherlv_3, grammarAccess.getStateAccess().getRefinesKeyword_3_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:790:1: ( ( ruleEString ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:791:1: ( ruleEString )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:791:1: ( ruleEString )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:792:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStateRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getStateAccess().getRefinesStateCrossReference_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleState1533);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:805:4: (otherlv_5= 'statemachines' ( (lv_statemachines_6_0= ruleStatemachine ) ) ( (lv_statemachines_7_0= ruleStatemachine ) )* otherlv_8= 'end' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==30) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:805:6: otherlv_5= 'statemachines' ( (lv_statemachines_6_0= ruleStatemachine ) ) ( (lv_statemachines_7_0= ruleStatemachine ) )* otherlv_8= 'end'
                    {
                    otherlv_5=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleState1548); 

                        	newLeafNode(otherlv_5, grammarAccess.getStateAccess().getStatemachinesKeyword_4_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:809:1: ( (lv_statemachines_6_0= ruleStatemachine ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:810:1: (lv_statemachines_6_0= ruleStatemachine )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:810:1: (lv_statemachines_6_0= ruleStatemachine )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:811:3: lv_statemachines_6_0= ruleStatemachine
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateAccess().getStatemachinesStatemachineParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStatemachine_in_ruleState1569);
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

                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:827:2: ( (lv_statemachines_7_0= ruleStatemachine ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==11) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:828:1: (lv_statemachines_7_0= ruleStatemachine )
                    	    {
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:828:1: (lv_statemachines_7_0= ruleStatemachine )
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:829:3: lv_statemachines_7_0= ruleStatemachine
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStateAccess().getStatemachinesStatemachineParserRuleCall_4_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleStatemachine_in_ruleState1590);
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
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleState1603); 

                        	newLeafNode(otherlv_8, grammarAccess.getStateAccess().getEndKeyword_4_3());
                        

                    }
                    break;

            }

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:849:3: (otherlv_9= 'invariants' ( (lv_invariants_10_0= ruleInvariant ) ) ( (lv_invariants_11_0= ruleInvariant ) )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==31) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:849:5: otherlv_9= 'invariants' ( (lv_invariants_10_0= ruleInvariant ) ) ( (lv_invariants_11_0= ruleInvariant ) )*
                    {
                    otherlv_9=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleState1618); 

                        	newLeafNode(otherlv_9, grammarAccess.getStateAccess().getInvariantsKeyword_5_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:853:1: ( (lv_invariants_10_0= ruleInvariant ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:854:1: (lv_invariants_10_0= ruleInvariant )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:854:1: (lv_invariants_10_0= ruleInvariant )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:855:3: lv_invariants_10_0= ruleInvariant
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateAccess().getInvariantsInvariantParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInvariant_in_ruleState1639);
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

                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:871:2: ( (lv_invariants_11_0= ruleInvariant ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==38) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:872:1: (lv_invariants_11_0= ruleInvariant )
                    	    {
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:872:1: (lv_invariants_11_0= ruleInvariant )
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:873:3: lv_invariants_11_0= ruleInvariant
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStateAccess().getInvariantsInvariantParserRuleCall_5_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInvariant_in_ruleState1660);
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
                    	    break loop29;
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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:897:1: entryRuleInitial returns [EObject current=null] : iv_ruleInitial= ruleInitial EOF ;
    public final EObject entryRuleInitial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitial = null;


        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:898:2: (iv_ruleInitial= ruleInitial EOF )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:899:2: iv_ruleInitial= ruleInitial EOF
            {
             newCompositeNode(grammarAccess.getInitialRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInitial_in_entryRuleInitial1699);
            iv_ruleInitial=ruleInitial();

            state._fsp--;

             current =iv_ruleInitial; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInitial1709); 

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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:906:1: ruleInitial returns [EObject current=null] : ( () otherlv_1= 'Initial' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleInitial() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_internalId_3_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:909:28: ( ( () otherlv_1= 'Initial' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:910:1: ( () otherlv_1= 'Initial' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:910:1: ( () otherlv_1= 'Initial' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:910:2: () otherlv_1= 'Initial' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:910:2: ()
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:911:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInitialAccess().getInitialAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleInitial1755); 

                	newLeafNode(otherlv_1, grammarAccess.getInitialAccess().getInitialKeyword_1());
                
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:920:1: (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==33) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:920:3: otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleInitial1768); 

                        	newLeafNode(otherlv_2, grammarAccess.getInitialAccess().getInternalIdKeyword_2_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:924:1: ( (lv_internalId_3_0= ruleEString ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:925:1: (lv_internalId_3_0= ruleEString )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:925:1: (lv_internalId_3_0= ruleEString )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:926:3: lv_internalId_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInitialAccess().getInternalIdEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInitial1789);
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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:950:1: entryRuleFinal returns [EObject current=null] : iv_ruleFinal= ruleFinal EOF ;
    public final EObject entryRuleFinal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFinal = null;


        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:951:2: (iv_ruleFinal= ruleFinal EOF )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:952:2: iv_ruleFinal= ruleFinal EOF
            {
             newCompositeNode(grammarAccess.getFinalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFinal_in_entryRuleFinal1827);
            iv_ruleFinal=ruleFinal();

            state._fsp--;

             current =iv_ruleFinal; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFinal1837); 

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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:959:1: ruleFinal returns [EObject current=null] : ( () otherlv_1= 'Final' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleFinal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_internalId_3_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:962:28: ( ( () otherlv_1= 'Final' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:963:1: ( () otherlv_1= 'Final' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:963:1: ( () otherlv_1= 'Final' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:963:2: () otherlv_1= 'Final' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:963:2: ()
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:964:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFinalAccess().getFinalAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleFinal1883); 

                	newLeafNode(otherlv_1, grammarAccess.getFinalAccess().getFinalKeyword_1());
                
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:973:1: (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==33) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:973:3: otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleFinal1896); 

                        	newLeafNode(otherlv_2, grammarAccess.getFinalAccess().getInternalIdKeyword_2_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:977:1: ( (lv_internalId_3_0= ruleEString ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:978:1: (lv_internalId_3_0= ruleEString )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:978:1: (lv_internalId_3_0= ruleEString )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:979:3: lv_internalId_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getFinalAccess().getInternalIdEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFinal1917);
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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1003:1: entryRuleAny returns [EObject current=null] : iv_ruleAny= ruleAny EOF ;
    public final EObject entryRuleAny() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAny = null;


        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1004:2: (iv_ruleAny= ruleAny EOF )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1005:2: iv_ruleAny= ruleAny EOF
            {
             newCompositeNode(grammarAccess.getAnyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAny_in_entryRuleAny1955);
            iv_ruleAny=ruleAny();

            state._fsp--;

             current =iv_ruleAny; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAny1965); 

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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1012:1: ruleAny returns [EObject current=null] : ( () otherlv_1= 'Any' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleAny() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_internalId_3_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1015:28: ( ( () otherlv_1= 'Any' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1016:1: ( () otherlv_1= 'Any' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1016:1: ( () otherlv_1= 'Any' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1016:2: () otherlv_1= 'Any' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1016:2: ()
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1017:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAnyAccess().getAnyAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleAny2011); 

                	newLeafNode(otherlv_1, grammarAccess.getAnyAccess().getAnyKeyword_1());
                
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1026:1: (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==33) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1026:3: otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleAny2024); 

                        	newLeafNode(otherlv_2, grammarAccess.getAnyAccess().getInternalIdKeyword_2_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1030:1: ( (lv_internalId_3_0= ruleEString ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1031:1: (lv_internalId_3_0= ruleEString )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1031:1: (lv_internalId_3_0= ruleEString )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1032:3: lv_internalId_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnyAccess().getInternalIdEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAny2045);
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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1056:1: entryRuleJunction returns [EObject current=null] : iv_ruleJunction= ruleJunction EOF ;
    public final EObject entryRuleJunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJunction = null;


        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1057:2: (iv_ruleJunction= ruleJunction EOF )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1058:2: iv_ruleJunction= ruleJunction EOF
            {
             newCompositeNode(grammarAccess.getJunctionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleJunction_in_entryRuleJunction2083);
            iv_ruleJunction=ruleJunction();

            state._fsp--;

             current =iv_ruleJunction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleJunction2093); 

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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1065:1: ruleJunction returns [EObject current=null] : ( () otherlv_1= 'Junction' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleJunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_internalId_3_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1068:28: ( ( () otherlv_1= 'Junction' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1069:1: ( () otherlv_1= 'Junction' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1069:1: ( () otherlv_1= 'Junction' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1069:2: () otherlv_1= 'Junction' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1069:2: ()
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1070:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getJunctionAccess().getJunctionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleJunction2139); 

                	newLeafNode(otherlv_1, grammarAccess.getJunctionAccess().getJunctionKeyword_1());
                
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1079:1: (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==33) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1079:3: otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleJunction2152); 

                        	newLeafNode(otherlv_2, grammarAccess.getJunctionAccess().getInternalIdKeyword_2_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1083:1: ( (lv_internalId_3_0= ruleEString ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1084:1: (lv_internalId_3_0= ruleEString )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1084:1: (lv_internalId_3_0= ruleEString )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1085:3: lv_internalId_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getJunctionAccess().getInternalIdEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleJunction2173);
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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1109:1: entryRuleFork returns [EObject current=null] : iv_ruleFork= ruleFork EOF ;
    public final EObject entryRuleFork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFork = null;


        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1110:2: (iv_ruleFork= ruleFork EOF )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1111:2: iv_ruleFork= ruleFork EOF
            {
             newCompositeNode(grammarAccess.getForkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFork_in_entryRuleFork2211);
            iv_ruleFork=ruleFork();

            state._fsp--;

             current =iv_ruleFork; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFork2221); 

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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1118:1: ruleFork returns [EObject current=null] : ( () otherlv_1= 'Fork' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleFork() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_internalId_3_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1121:28: ( ( () otherlv_1= 'Fork' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1122:1: ( () otherlv_1= 'Fork' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1122:1: ( () otherlv_1= 'Fork' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1122:2: () otherlv_1= 'Fork' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1122:2: ()
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1123:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getForkAccess().getForkAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleFork2267); 

                	newLeafNode(otherlv_1, grammarAccess.getForkAccess().getForkKeyword_1());
                
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1132:1: (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==33) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1132:3: otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleFork2280); 

                        	newLeafNode(otherlv_2, grammarAccess.getForkAccess().getInternalIdKeyword_2_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1136:1: ( (lv_internalId_3_0= ruleEString ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1137:1: (lv_internalId_3_0= ruleEString )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1137:1: (lv_internalId_3_0= ruleEString )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1138:3: lv_internalId_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getForkAccess().getInternalIdEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFork2301);
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


    // $ANTLR start "entryRuleInvariant"
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1162:1: entryRuleInvariant returns [EObject current=null] : iv_ruleInvariant= ruleInvariant EOF ;
    public final EObject entryRuleInvariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvariant = null;


        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1163:2: (iv_ruleInvariant= ruleInvariant EOF )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1164:2: iv_ruleInvariant= ruleInvariant EOF
            {
             newCompositeNode(grammarAccess.getInvariantRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInvariant_in_entryRuleInvariant2339);
            iv_ruleInvariant=ruleInvariant();

            state._fsp--;

             current =iv_ruleInvariant; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInvariant2349); 

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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1171:1: ruleInvariant returns [EObject current=null] : (otherlv_0= 'Invariant' otherlv_1= '@' ( (lv_name_2_0= ruleEString ) ) ( (lv_theorem_3_0= 'theorem' ) )? ( (lv_predicate_4_0= ruleEString ) ) (otherlv_5= '>' ( (lv_comment_6_0= ruleEString ) ) )? ) ;
    public final EObject ruleInvariant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_theorem_3_0=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_predicate_4_0 = null;

        AntlrDatatypeRuleToken lv_comment_6_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1174:28: ( (otherlv_0= 'Invariant' otherlv_1= '@' ( (lv_name_2_0= ruleEString ) ) ( (lv_theorem_3_0= 'theorem' ) )? ( (lv_predicate_4_0= ruleEString ) ) (otherlv_5= '>' ( (lv_comment_6_0= ruleEString ) ) )? ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1175:1: (otherlv_0= 'Invariant' otherlv_1= '@' ( (lv_name_2_0= ruleEString ) ) ( (lv_theorem_3_0= 'theorem' ) )? ( (lv_predicate_4_0= ruleEString ) ) (otherlv_5= '>' ( (lv_comment_6_0= ruleEString ) ) )? )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1175:1: (otherlv_0= 'Invariant' otherlv_1= '@' ( (lv_name_2_0= ruleEString ) ) ( (lv_theorem_3_0= 'theorem' ) )? ( (lv_predicate_4_0= ruleEString ) ) (otherlv_5= '>' ( (lv_comment_6_0= ruleEString ) ) )? )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1175:3: otherlv_0= 'Invariant' otherlv_1= '@' ( (lv_name_2_0= ruleEString ) ) ( (lv_theorem_3_0= 'theorem' ) )? ( (lv_predicate_4_0= ruleEString ) ) (otherlv_5= '>' ( (lv_comment_6_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleInvariant2386); 

                	newLeafNode(otherlv_0, grammarAccess.getInvariantAccess().getInvariantKeyword_0());
                
            otherlv_1=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleInvariant2398); 

                	newLeafNode(otherlv_1, grammarAccess.getInvariantAccess().getCommercialAtKeyword_1());
                
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1183:1: ( (lv_name_2_0= ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1184:1: (lv_name_2_0= ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1184:1: (lv_name_2_0= ruleEString )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1185:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInvariantAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInvariant2419);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInvariantRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1201:2: ( (lv_theorem_3_0= 'theorem' ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==40) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1202:1: (lv_theorem_3_0= 'theorem' )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1202:1: (lv_theorem_3_0= 'theorem' )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1203:3: lv_theorem_3_0= 'theorem'
                    {
                    lv_theorem_3_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleInvariant2437); 

                            newLeafNode(lv_theorem_3_0, grammarAccess.getInvariantAccess().getTheoremTheoremKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInvariantRule());
                    	        }
                           		setWithLastConsumed(current, "theorem", true, "theorem");
                    	    

                    }


                    }
                    break;

            }

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1216:3: ( (lv_predicate_4_0= ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1217:1: (lv_predicate_4_0= ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1217:1: (lv_predicate_4_0= ruleEString )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1218:3: lv_predicate_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInvariantAccess().getPredicateEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInvariant2472);
            lv_predicate_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInvariantRule());
            	        }
                   		set(
                   			current, 
                   			"predicate",
                    		lv_predicate_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1234:2: (otherlv_5= '>' ( (lv_comment_6_0= ruleEString ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==12) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1234:4: otherlv_5= '>' ( (lv_comment_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleInvariant2485); 

                        	newLeafNode(otherlv_5, grammarAccess.getInvariantAccess().getGreaterThanSignKeyword_5_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1238:1: ( (lv_comment_6_0= ruleEString ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1239:1: (lv_comment_6_0= ruleEString )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1239:1: (lv_comment_6_0= ruleEString )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1240:3: lv_comment_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInvariantAccess().getCommentEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInvariant2506);
                    lv_comment_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInvariantRule());
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


    // $ANTLR start "entryRuleTypedParameter"
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1264:1: entryRuleTypedParameter returns [EObject current=null] : iv_ruleTypedParameter= ruleTypedParameter EOF ;
    public final EObject entryRuleTypedParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedParameter = null;


        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1265:2: (iv_ruleTypedParameter= ruleTypedParameter EOF )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1266:2: iv_ruleTypedParameter= ruleTypedParameter EOF
            {
             newCompositeNode(grammarAccess.getTypedParameterRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTypedParameter_in_entryRuleTypedParameter2544);
            iv_ruleTypedParameter=ruleTypedParameter();

            state._fsp--;

             current =iv_ruleTypedParameter; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypedParameter2554); 

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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1273:1: ruleTypedParameter returns [EObject current=null] : (otherlv_0= 'TypedParameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleEString ) ) (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? ) ;
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
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1276:28: ( (otherlv_0= 'TypedParameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleEString ) ) (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1277:1: (otherlv_0= 'TypedParameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleEString ) ) (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1277:1: (otherlv_0= 'TypedParameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleEString ) ) (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1277:3: otherlv_0= 'TypedParameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleEString ) ) (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleTypedParameter2591); 

                	newLeafNode(otherlv_0, grammarAccess.getTypedParameterAccess().getTypedParameterKeyword_0());
                
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1281:1: ( (lv_name_1_0= ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1282:1: (lv_name_1_0= ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1282:1: (lv_name_1_0= ruleEString )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1283:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTypedParameterAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTypedParameter2612);
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

            otherlv_2=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleTypedParameter2624); 

                	newLeafNode(otherlv_2, grammarAccess.getTypedParameterAccess().getTypeKeyword_2());
                
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1303:1: ( (lv_type_3_0= ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1304:1: (lv_type_3_0= ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1304:1: (lv_type_3_0= ruleEString )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1305:3: lv_type_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTypedParameterAccess().getTypeEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTypedParameter2645);
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

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1321:2: (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==12) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1321:4: otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTypedParameter2658); 

                        	newLeafNode(otherlv_4, grammarAccess.getTypedParameterAccess().getGreaterThanSignKeyword_4_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1325:1: ( (lv_comment_5_0= ruleEString ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1326:1: (lv_comment_5_0= ruleEString )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1326:1: (lv_comment_5_0= ruleEString )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1327:3: lv_comment_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypedParameterAccess().getCommentEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTypedParameter2679);
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


    // $ANTLR start "entryRuleGuard"
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1351:1: entryRuleGuard returns [EObject current=null] : iv_ruleGuard= ruleGuard EOF ;
    public final EObject entryRuleGuard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuard = null;


        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1352:2: (iv_ruleGuard= ruleGuard EOF )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1353:2: iv_ruleGuard= ruleGuard EOF
            {
             newCompositeNode(grammarAccess.getGuardRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGuard_in_entryRuleGuard2717);
            iv_ruleGuard=ruleGuard();

            state._fsp--;

             current =iv_ruleGuard; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGuard2727); 

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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1360:1: ruleGuard returns [EObject current=null] : ( ( (lv_theorem_0_0= 'theorem' ) )? otherlv_1= '@' ( (lv_name_2_0= ruleEString ) ) ( (lv_predicate_3_0= ruleEString ) ) (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? ) ;
    public final EObject ruleGuard() throws RecognitionException {
        EObject current = null;

        Token lv_theorem_0_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_predicate_3_0 = null;

        AntlrDatatypeRuleToken lv_comment_5_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1363:28: ( ( ( (lv_theorem_0_0= 'theorem' ) )? otherlv_1= '@' ( (lv_name_2_0= ruleEString ) ) ( (lv_predicate_3_0= ruleEString ) ) (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1364:1: ( ( (lv_theorem_0_0= 'theorem' ) )? otherlv_1= '@' ( (lv_name_2_0= ruleEString ) ) ( (lv_predicate_3_0= ruleEString ) ) (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1364:1: ( ( (lv_theorem_0_0= 'theorem' ) )? otherlv_1= '@' ( (lv_name_2_0= ruleEString ) ) ( (lv_predicate_3_0= ruleEString ) ) (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1364:2: ( (lv_theorem_0_0= 'theorem' ) )? otherlv_1= '@' ( (lv_name_2_0= ruleEString ) ) ( (lv_predicate_3_0= ruleEString ) ) (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )?
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1364:2: ( (lv_theorem_0_0= 'theorem' ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==40) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1365:1: (lv_theorem_0_0= 'theorem' )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1365:1: (lv_theorem_0_0= 'theorem' )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1366:3: lv_theorem_0_0= 'theorem'
                    {
                    lv_theorem_0_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleGuard2770); 

                            newLeafNode(lv_theorem_0_0, grammarAccess.getGuardAccess().getTheoremTheoremKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGuardRule());
                    	        }
                           		setWithLastConsumed(current, "theorem", true, "theorem");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleGuard2796); 

                	newLeafNode(otherlv_1, grammarAccess.getGuardAccess().getCommercialAtKeyword_1());
                
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1383:1: ( (lv_name_2_0= ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1384:1: (lv_name_2_0= ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1384:1: (lv_name_2_0= ruleEString )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1385:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getGuardAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGuard2817);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGuardRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1401:2: ( (lv_predicate_3_0= ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1402:1: (lv_predicate_3_0= ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1402:1: (lv_predicate_3_0= ruleEString )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1403:3: lv_predicate_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getGuardAccess().getPredicateEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGuard2838);
            lv_predicate_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGuardRule());
            	        }
                   		set(
                   			current, 
                   			"predicate",
                    		lv_predicate_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1419:2: (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==12) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1419:4: otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleGuard2851); 

                        	newLeafNode(otherlv_4, grammarAccess.getGuardAccess().getGreaterThanSignKeyword_4_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1423:1: ( (lv_comment_5_0= ruleEString ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1424:1: (lv_comment_5_0= ruleEString )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1424:1: (lv_comment_5_0= ruleEString )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1425:3: lv_comment_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getGuardAccess().getCommentEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGuard2872);
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


    // $ANTLR start "entryRuleAction"
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1449:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1450:2: (iv_ruleAction= ruleAction EOF )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1451:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAction_in_entryRuleAction2910);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAction2920); 

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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1458:1: ruleAction returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_action_2_0= ruleEString ) ) (otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) ) )? ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_action_2_0 = null;

        AntlrDatatypeRuleToken lv_comment_4_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1461:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_action_2_0= ruleEString ) ) (otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) ) )? ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1462:1: (otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_action_2_0= ruleEString ) ) (otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) ) )? )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1462:1: (otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_action_2_0= ruleEString ) ) (otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) ) )? )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1462:3: otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_action_2_0= ruleEString ) ) (otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleAction2957); 

                	newLeafNode(otherlv_0, grammarAccess.getActionAccess().getCommercialAtKeyword_0());
                
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1466:1: ( (lv_name_1_0= ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1467:1: (lv_name_1_0= ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1467:1: (lv_name_1_0= ruleEString )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1468:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getActionAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAction2978);
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

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1484:2: ( (lv_action_2_0= ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1485:1: (lv_action_2_0= ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1485:1: (lv_action_2_0= ruleEString )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1486:3: lv_action_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getActionAccess().getActionEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAction2999);
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

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1502:2: (otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==12) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1502:4: otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAction3012); 

                        	newLeafNode(otherlv_3, grammarAccess.getActionAccess().getGreaterThanSignKeyword_3_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1506:1: ( (lv_comment_4_0= ruleEString ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1507:1: (lv_comment_4_0= ruleEString )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1507:1: (lv_comment_4_0= ruleEString )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1508:3: lv_comment_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getCommentEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAction3033);
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


    // $ANTLR start "entryRuleWitness"
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1532:1: entryRuleWitness returns [EObject current=null] : iv_ruleWitness= ruleWitness EOF ;
    public final EObject entryRuleWitness() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWitness = null;


        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1533:2: (iv_ruleWitness= ruleWitness EOF )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1534:2: iv_ruleWitness= ruleWitness EOF
            {
             newCompositeNode(grammarAccess.getWitnessRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWitness_in_entryRuleWitness3071);
            iv_ruleWitness=ruleWitness();

            state._fsp--;

             current =iv_ruleWitness; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWitness3081); 

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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1541:1: ruleWitness returns [EObject current=null] : (otherlv_0= 'Witness' otherlv_1= '@' ( (lv_name_2_0= ruleEString ) ) ( (lv_predicate_3_0= ruleEString ) ) (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? ) ;
    public final EObject ruleWitness() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_predicate_3_0 = null;

        AntlrDatatypeRuleToken lv_comment_5_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1544:28: ( (otherlv_0= 'Witness' otherlv_1= '@' ( (lv_name_2_0= ruleEString ) ) ( (lv_predicate_3_0= ruleEString ) ) (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1545:1: (otherlv_0= 'Witness' otherlv_1= '@' ( (lv_name_2_0= ruleEString ) ) ( (lv_predicate_3_0= ruleEString ) ) (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1545:1: (otherlv_0= 'Witness' otherlv_1= '@' ( (lv_name_2_0= ruleEString ) ) ( (lv_predicate_3_0= ruleEString ) ) (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1545:3: otherlv_0= 'Witness' otherlv_1= '@' ( (lv_name_2_0= ruleEString ) ) ( (lv_predicate_3_0= ruleEString ) ) (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleWitness3118); 

                	newLeafNode(otherlv_0, grammarAccess.getWitnessAccess().getWitnessKeyword_0());
                
            otherlv_1=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleWitness3130); 

                	newLeafNode(otherlv_1, grammarAccess.getWitnessAccess().getCommercialAtKeyword_1());
                
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1553:1: ( (lv_name_2_0= ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1554:1: (lv_name_2_0= ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1554:1: (lv_name_2_0= ruleEString )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1555:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getWitnessAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleWitness3151);
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

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1571:2: ( (lv_predicate_3_0= ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1572:1: (lv_predicate_3_0= ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1572:1: (lv_predicate_3_0= ruleEString )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1573:3: lv_predicate_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getWitnessAccess().getPredicateEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleWitness3172);
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

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1589:2: (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==12) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1589:4: otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleWitness3185); 

                        	newLeafNode(otherlv_4, grammarAccess.getWitnessAccess().getGreaterThanSignKeyword_4_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1593:1: ( (lv_comment_5_0= ruleEString ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1594:1: (lv_comment_5_0= ruleEString )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1594:1: (lv_comment_5_0= ruleEString )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1595:3: lv_comment_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getWitnessAccess().getCommentEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleWitness3206);
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


    // $ANTLR start "ruleTranslationKind"
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1619:1: ruleTranslationKind returns [Enumerator current=null] : ( (enumLiteral_0= 'MULTIVAR' ) | (enumLiteral_1= 'SINGLEVAR' ) | (enumLiteral_2= 'REFINEDVAR' ) ) ;
    public final Enumerator ruleTranslationKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1621:28: ( ( (enumLiteral_0= 'MULTIVAR' ) | (enumLiteral_1= 'SINGLEVAR' ) | (enumLiteral_2= 'REFINEDVAR' ) ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1622:1: ( (enumLiteral_0= 'MULTIVAR' ) | (enumLiteral_1= 'SINGLEVAR' ) | (enumLiteral_2= 'REFINEDVAR' ) )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1622:1: ( (enumLiteral_0= 'MULTIVAR' ) | (enumLiteral_1= 'SINGLEVAR' ) | (enumLiteral_2= 'REFINEDVAR' ) )
            int alt43=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt43=1;
                }
                break;
            case 45:
                {
                alt43=2;
                }
                break;
            case 46:
                {
                alt43=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1622:2: (enumLiteral_0= 'MULTIVAR' )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1622:2: (enumLiteral_0= 'MULTIVAR' )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1622:4: enumLiteral_0= 'MULTIVAR'
                    {
                    enumLiteral_0=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleTranslationKind3258); 

                            current = grammarAccess.getTranslationKindAccess().getMULTIVAREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTranslationKindAccess().getMULTIVAREnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1628:6: (enumLiteral_1= 'SINGLEVAR' )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1628:6: (enumLiteral_1= 'SINGLEVAR' )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1628:8: enumLiteral_1= 'SINGLEVAR'
                    {
                    enumLiteral_1=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleTranslationKind3275); 

                            current = grammarAccess.getTranslationKindAccess().getSINGLEVAREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTranslationKindAccess().getSINGLEVAREnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1634:6: (enumLiteral_2= 'REFINEDVAR' )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1634:6: (enumLiteral_2= 'REFINEDVAR' )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1634:8: enumLiteral_2= 'REFINEDVAR'
                    {
                    enumLiteral_2=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleTranslationKind3292); 

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
        public static final BitSet FOLLOW_ruleStatemachine_in_entryRuleStatemachine75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStatemachine85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleStatemachine122 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStatemachine143 = new BitSet(new long[]{0x00000000000DF000L});
        public static final BitSet FOLLOW_12_in_ruleStatemachine156 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStatemachine177 = new BitSet(new long[]{0x00000000000DE000L});
        public static final BitSet FOLLOW_13_in_ruleStatemachine192 = new BitSet(new long[]{0x0000700000000000L});
        public static final BitSet FOLLOW_ruleTranslationKind_in_ruleStatemachine213 = new BitSet(new long[]{0x00000000000DC000L});
        public static final BitSet FOLLOW_14_in_ruleStatemachine228 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStatemachine251 = new BitSet(new long[]{0x00000000000D8000L});
        public static final BitSet FOLLOW_15_in_ruleStatemachine266 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStatemachine289 = new BitSet(new long[]{0x00000000000D0000L});
        public static final BitSet FOLLOW_16_in_ruleStatemachine304 = new BitSet(new long[]{0x0000003D20000000L});
        public static final BitSet FOLLOW_ruleAbstractNode_in_ruleStatemachine325 = new BitSet(new long[]{0x00000000000E0000L});
        public static final BitSet FOLLOW_17_in_ruleStatemachine338 = new BitSet(new long[]{0x0000003D20000000L});
        public static final BitSet FOLLOW_ruleAbstractNode_in_ruleStatemachine359 = new BitSet(new long[]{0x00000000000E0000L});
        public static final BitSet FOLLOW_18_in_ruleStatemachine376 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_ruleTransition_in_ruleStatemachine397 = new BitSet(new long[]{0x0000000000380000L});
        public static final BitSet FOLLOW_ruleTransition_in_ruleStatemachine418 = new BitSet(new long[]{0x0000000000380000L});
        public static final BitSet FOLLOW_19_in_ruleStatemachine433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractNode_in_entryRuleAbstractNode469 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractNode479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleState_in_ruleAbstractNode526 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInitial_in_ruleAbstractNode553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFinal_in_ruleAbstractNode580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAny_in_ruleAbstractNode607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleJunction_in_ruleAbstractNode634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFork_in_ruleAbstractNode661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString699 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition821 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransition831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleTransition883 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleTransition909 = new BitSet(new long[]{0x000000001BC85000L});
        public static final BitSet FOLLOW_12_in_ruleTransition922 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransition943 = new BitSet(new long[]{0x000000001BC84000L});
        public static final BitSet FOLLOW_14_in_ruleTransition958 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransition981 = new BitSet(new long[]{0x000000001BC80030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransition1004 = new BitSet(new long[]{0x000000001BC80030L});
        public static final BitSet FOLLOW_22_in_ruleTransition1020 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransition1043 = new BitSet(new long[]{0x000000001B880000L});
        public static final BitSet FOLLOW_23_in_ruleTransition1058 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransition1081 = new BitSet(new long[]{0x000000001B080000L});
        public static final BitSet FOLLOW_24_in_ruleTransition1096 = new BitSet(new long[]{0x0000018000000000L});
        public static final BitSet FOLLOW_ruleGuard_in_ruleTransition1117 = new BitSet(new long[]{0x000001801A080000L});
        public static final BitSet FOLLOW_ruleGuard_in_ruleTransition1138 = new BitSet(new long[]{0x000001801A080000L});
        public static final BitSet FOLLOW_25_in_ruleTransition1154 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_ruleTypedParameter_in_ruleTransition1175 = new BitSet(new long[]{0x0000020004000000L});
        public static final BitSet FOLLOW_ruleTypedParameter_in_ruleTransition1196 = new BitSet(new long[]{0x0000020004000000L});
        public static final BitSet FOLLOW_26_in_ruleTransition1209 = new BitSet(new long[]{0x0000018000000000L});
        public static final BitSet FOLLOW_ruleGuard_in_ruleTransition1230 = new BitSet(new long[]{0x0000018018080000L});
        public static final BitSet FOLLOW_ruleGuard_in_ruleTransition1251 = new BitSet(new long[]{0x0000018018080000L});
        public static final BitSet FOLLOW_27_in_ruleTransition1267 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_ruleWitness_in_ruleTransition1288 = new BitSet(new long[]{0x0000080010080000L});
        public static final BitSet FOLLOW_ruleWitness_in_ruleTransition1309 = new BitSet(new long[]{0x0000080010080000L});
        public static final BitSet FOLLOW_28_in_ruleTransition1325 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_ruleAction_in_ruleTransition1346 = new BitSet(new long[]{0x0000008000080000L});
        public static final BitSet FOLLOW_ruleAction_in_ruleTransition1367 = new BitSet(new long[]{0x0000008000080000L});
        public static final BitSet FOLLOW_19_in_ruleTransition1382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleState_in_entryRuleState1420 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleState1430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleState1476 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleState1497 = new BitSet(new long[]{0x00000000C0008002L});
        public static final BitSet FOLLOW_15_in_ruleState1510 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleState1533 = new BitSet(new long[]{0x00000000C0000002L});
        public static final BitSet FOLLOW_30_in_ruleState1548 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_ruleStatemachine_in_ruleState1569 = new BitSet(new long[]{0x0000000000080800L});
        public static final BitSet FOLLOW_ruleStatemachine_in_ruleState1590 = new BitSet(new long[]{0x0000000000080800L});
        public static final BitSet FOLLOW_19_in_ruleState1603 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_31_in_ruleState1618 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_ruleInvariant_in_ruleState1639 = new BitSet(new long[]{0x0000004000000002L});
        public static final BitSet FOLLOW_ruleInvariant_in_ruleState1660 = new BitSet(new long[]{0x0000004000000002L});
        public static final BitSet FOLLOW_ruleInitial_in_entryRuleInitial1699 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInitial1709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleInitial1755 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_33_in_ruleInitial1768 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInitial1789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFinal_in_entryRuleFinal1827 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFinal1837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleFinal1883 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_33_in_ruleFinal1896 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFinal1917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAny_in_entryRuleAny1955 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAny1965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleAny2011 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_33_in_ruleAny2024 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAny2045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleJunction_in_entryRuleJunction2083 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleJunction2093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleJunction2139 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_33_in_ruleJunction2152 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleJunction2173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFork_in_entryRuleFork2211 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFork2221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleFork2267 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_33_in_ruleFork2280 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFork2301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvariant_in_entryRuleInvariant2339 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInvariant2349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleInvariant2386 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleInvariant2398 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInvariant2419 = new BitSet(new long[]{0x0000010000000030L});
        public static final BitSet FOLLOW_40_in_ruleInvariant2437 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInvariant2472 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_ruleInvariant2485 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInvariant2506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedParameter_in_entryRuleTypedParameter2544 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypedParameter2554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleTypedParameter2591 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTypedParameter2612 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleTypedParameter2624 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTypedParameter2645 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_ruleTypedParameter2658 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTypedParameter2679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGuard_in_entryRuleGuard2717 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGuard2727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleGuard2770 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleGuard2796 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGuard2817 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGuard2838 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_ruleGuard2851 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGuard2872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAction_in_entryRuleAction2910 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAction2920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleAction2957 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAction2978 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAction2999 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_ruleAction3012 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAction3033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWitness_in_entryRuleWitness3071 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWitness3081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleWitness3118 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleWitness3130 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleWitness3151 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleWitness3172 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_ruleWitness3185 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleWitness3206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleTranslationKind3258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleTranslationKind3275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleTranslationKind3292 = new BitSet(new long[]{0x0000000000000002L});
    }


}