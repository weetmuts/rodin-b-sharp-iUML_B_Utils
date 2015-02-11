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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Statemachine'", "'>'", "'translation'", "'elaborates'", "'refines'", "'nodes'", "','", "'transitions'", "'extended'", "'Transition'", "'target'", "'source'", "'parameters'", "'{'", "'}'", "'guards'", "'actions'", "'witnesses'", "'State'", "'statemachines'", "'invariants'", "'Initial'", "'internalId'", "'Final'", "'Any'", "'Junction'", "'Fork'", "'Invariant'", "'@'", "'theorem'", "'TypedParameter'", "'type'", "'action'", "'Witness'", "'MULTIVAR'", "'SINGLEVAR'", "'REFINEDVAR'"
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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:77:1: ruleStatemachine returns [EObject current=null] : (otherlv_0= 'Statemachine' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '>' ( (lv_comment_3_0= ruleEString ) ) )? (otherlv_4= 'translation' ( (lv_translation_5_0= ruleTranslationKind ) ) )? (otherlv_6= 'elaborates' ( ( ruleEString ) ) )? (otherlv_8= 'refines' ( ( ruleEString ) ) )? (otherlv_10= 'nodes' ( (lv_nodes_11_0= ruleAbstractNode ) ) (otherlv_12= ',' ( (lv_nodes_13_0= ruleAbstractNode ) ) )* )? (otherlv_14= 'transitions' ( (lv_transitions_15_0= ruleTransition ) ) (otherlv_16= ',' ( (lv_transitions_17_0= ruleTransition ) ) )* )? ) ;
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
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_comment_3_0 = null;

        Enumerator lv_translation_5_0 = null;

        EObject lv_nodes_11_0 = null;

        EObject lv_nodes_13_0 = null;

        EObject lv_transitions_15_0 = null;

        EObject lv_transitions_17_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:80:28: ( (otherlv_0= 'Statemachine' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '>' ( (lv_comment_3_0= ruleEString ) ) )? (otherlv_4= 'translation' ( (lv_translation_5_0= ruleTranslationKind ) ) )? (otherlv_6= 'elaborates' ( ( ruleEString ) ) )? (otherlv_8= 'refines' ( ( ruleEString ) ) )? (otherlv_10= 'nodes' ( (lv_nodes_11_0= ruleAbstractNode ) ) (otherlv_12= ',' ( (lv_nodes_13_0= ruleAbstractNode ) ) )* )? (otherlv_14= 'transitions' ( (lv_transitions_15_0= ruleTransition ) ) (otherlv_16= ',' ( (lv_transitions_17_0= ruleTransition ) ) )* )? ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:81:1: (otherlv_0= 'Statemachine' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '>' ( (lv_comment_3_0= ruleEString ) ) )? (otherlv_4= 'translation' ( (lv_translation_5_0= ruleTranslationKind ) ) )? (otherlv_6= 'elaborates' ( ( ruleEString ) ) )? (otherlv_8= 'refines' ( ( ruleEString ) ) )? (otherlv_10= 'nodes' ( (lv_nodes_11_0= ruleAbstractNode ) ) (otherlv_12= ',' ( (lv_nodes_13_0= ruleAbstractNode ) ) )* )? (otherlv_14= 'transitions' ( (lv_transitions_15_0= ruleTransition ) ) (otherlv_16= ',' ( (lv_transitions_17_0= ruleTransition ) ) )* )? )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:81:1: (otherlv_0= 'Statemachine' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '>' ( (lv_comment_3_0= ruleEString ) ) )? (otherlv_4= 'translation' ( (lv_translation_5_0= ruleTranslationKind ) ) )? (otherlv_6= 'elaborates' ( ( ruleEString ) ) )? (otherlv_8= 'refines' ( ( ruleEString ) ) )? (otherlv_10= 'nodes' ( (lv_nodes_11_0= ruleAbstractNode ) ) (otherlv_12= ',' ( (lv_nodes_13_0= ruleAbstractNode ) ) )* )? (otherlv_14= 'transitions' ( (lv_transitions_15_0= ruleTransition ) ) (otherlv_16= ',' ( (lv_transitions_17_0= ruleTransition ) ) )* )? )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:81:3: otherlv_0= 'Statemachine' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '>' ( (lv_comment_3_0= ruleEString ) ) )? (otherlv_4= 'translation' ( (lv_translation_5_0= ruleTranslationKind ) ) )? (otherlv_6= 'elaborates' ( ( ruleEString ) ) )? (otherlv_8= 'refines' ( ( ruleEString ) ) )? (otherlv_10= 'nodes' ( (lv_nodes_11_0= ruleAbstractNode ) ) (otherlv_12= ',' ( (lv_nodes_13_0= ruleAbstractNode ) ) )* )? (otherlv_14= 'transitions' ( (lv_transitions_15_0= ruleTransition ) ) (otherlv_16= ',' ( (lv_transitions_17_0= ruleTransition ) ) )* )?
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
                            int LA5_2 = input.LA(2);

                            if ( (LA5_2==29||LA5_2==32||(LA5_2>=34 && LA5_2<=37)) ) {
                                alt5=1;
                            }


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

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:229:6: (otherlv_14= 'transitions' ( (lv_transitions_15_0= ruleTransition ) ) (otherlv_16= ',' ( (lv_transitions_17_0= ruleTransition ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:229:8: otherlv_14= 'transitions' ( (lv_transitions_15_0= ruleTransition ) ) (otherlv_16= ',' ( (lv_transitions_17_0= ruleTransition ) ) )*
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

                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:251:2: (otherlv_16= ',' ( (lv_transitions_17_0= ruleTransition ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==17) ) {
                            int LA7_2 = input.LA(2);

                            if ( ((LA7_2>=19 && LA7_2<=20)) ) {
                                alt7=1;
                            }


                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:251:4: otherlv_16= ',' ( (lv_transitions_17_0= ruleTransition ) )
                    	    {
                    	    otherlv_16=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleStatemachine410); 

                    	        	newLeafNode(otherlv_16, grammarAccess.getStatemachineAccess().getCommaKeyword_7_2_0());
                    	        
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:255:1: ( (lv_transitions_17_0= ruleTransition ) )
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:256:1: (lv_transitions_17_0= ruleTransition )
                    	    {
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:256:1: (lv_transitions_17_0= ruleTransition )
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:257:3: lv_transitions_17_0= ruleTransition
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStatemachineAccess().getTransitionsTransitionParserRuleCall_7_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTransition_in_ruleStatemachine431);
                    	    lv_transitions_17_0=ruleTransition();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStatemachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"transitions",
                    	            		lv_transitions_17_0, 
                    	            		"Transition");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


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
            pushFollow(FollowSets000.FOLLOW_ruleAbstractNode_in_entryRuleAbstractNode471);
            iv_ruleAbstractNode=ruleAbstractNode();

            state._fsp--;

             current =iv_ruleAbstractNode; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractNode481); 

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
                        
                    pushFollow(FollowSets000.FOLLOW_ruleState_in_ruleAbstractNode528);
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
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInitial_in_ruleAbstractNode555);
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
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFinal_in_ruleAbstractNode582);
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
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAny_in_ruleAbstractNode609);
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
                        
                    pushFollow(FollowSets000.FOLLOW_ruleJunction_in_ruleAbstractNode636);
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
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFork_in_ruleAbstractNode663);
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
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString701);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString712); 

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
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString752); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:384:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString778); 

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
            pushFollow(FollowSets000.FOLLOW_ruleTransition_in_entryRuleTransition823);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransition833); 

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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:408:1: ruleTransition returns [EObject current=null] : ( () ( (lv_extended_1_0= 'extended' ) )? otherlv_2= 'Transition' (otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) ) )? (otherlv_5= 'elaborates' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'target' ( ( ruleEString ) ) )? (otherlv_11= 'source' ( ( ruleEString ) ) )? (otherlv_13= 'parameters' otherlv_14= '{' ( (lv_parameters_15_0= ruleTypedParameter ) ) (otherlv_16= ',' ( (lv_parameters_17_0= ruleTypedParameter ) ) )* otherlv_18= '}' )? (otherlv_19= 'guards' otherlv_20= '{' ( (lv_guards_21_0= ruleGuard ) ) (otherlv_22= ',' ( (lv_guards_23_0= ruleGuard ) ) )* otherlv_24= '}' )? (otherlv_25= 'actions' otherlv_26= '{' ( (lv_actions_27_0= ruleAction ) ) (otherlv_28= ',' ( (lv_actions_29_0= ruleAction ) ) )* otherlv_30= '}' )? (otherlv_31= 'witnesses' otherlv_32= '{' ( (lv_witnesses_33_0= ruleWitness ) ) (otherlv_34= ',' ( (lv_witnesses_35_0= ruleWitness ) ) )* otherlv_36= '}' )? ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token lv_extended_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        AntlrDatatypeRuleToken lv_comment_4_0 = null;

        EObject lv_parameters_15_0 = null;

        EObject lv_parameters_17_0 = null;

        EObject lv_guards_21_0 = null;

        EObject lv_guards_23_0 = null;

        EObject lv_actions_27_0 = null;

        EObject lv_actions_29_0 = null;

        EObject lv_witnesses_33_0 = null;

        EObject lv_witnesses_35_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:411:28: ( ( () ( (lv_extended_1_0= 'extended' ) )? otherlv_2= 'Transition' (otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) ) )? (otherlv_5= 'elaborates' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'target' ( ( ruleEString ) ) )? (otherlv_11= 'source' ( ( ruleEString ) ) )? (otherlv_13= 'parameters' otherlv_14= '{' ( (lv_parameters_15_0= ruleTypedParameter ) ) (otherlv_16= ',' ( (lv_parameters_17_0= ruleTypedParameter ) ) )* otherlv_18= '}' )? (otherlv_19= 'guards' otherlv_20= '{' ( (lv_guards_21_0= ruleGuard ) ) (otherlv_22= ',' ( (lv_guards_23_0= ruleGuard ) ) )* otherlv_24= '}' )? (otherlv_25= 'actions' otherlv_26= '{' ( (lv_actions_27_0= ruleAction ) ) (otherlv_28= ',' ( (lv_actions_29_0= ruleAction ) ) )* otherlv_30= '}' )? (otherlv_31= 'witnesses' otherlv_32= '{' ( (lv_witnesses_33_0= ruleWitness ) ) (otherlv_34= ',' ( (lv_witnesses_35_0= ruleWitness ) ) )* otherlv_36= '}' )? ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:412:1: ( () ( (lv_extended_1_0= 'extended' ) )? otherlv_2= 'Transition' (otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) ) )? (otherlv_5= 'elaborates' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'target' ( ( ruleEString ) ) )? (otherlv_11= 'source' ( ( ruleEString ) ) )? (otherlv_13= 'parameters' otherlv_14= '{' ( (lv_parameters_15_0= ruleTypedParameter ) ) (otherlv_16= ',' ( (lv_parameters_17_0= ruleTypedParameter ) ) )* otherlv_18= '}' )? (otherlv_19= 'guards' otherlv_20= '{' ( (lv_guards_21_0= ruleGuard ) ) (otherlv_22= ',' ( (lv_guards_23_0= ruleGuard ) ) )* otherlv_24= '}' )? (otherlv_25= 'actions' otherlv_26= '{' ( (lv_actions_27_0= ruleAction ) ) (otherlv_28= ',' ( (lv_actions_29_0= ruleAction ) ) )* otherlv_30= '}' )? (otherlv_31= 'witnesses' otherlv_32= '{' ( (lv_witnesses_33_0= ruleWitness ) ) (otherlv_34= ',' ( (lv_witnesses_35_0= ruleWitness ) ) )* otherlv_36= '}' )? )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:412:1: ( () ( (lv_extended_1_0= 'extended' ) )? otherlv_2= 'Transition' (otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) ) )? (otherlv_5= 'elaborates' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'target' ( ( ruleEString ) ) )? (otherlv_11= 'source' ( ( ruleEString ) ) )? (otherlv_13= 'parameters' otherlv_14= '{' ( (lv_parameters_15_0= ruleTypedParameter ) ) (otherlv_16= ',' ( (lv_parameters_17_0= ruleTypedParameter ) ) )* otherlv_18= '}' )? (otherlv_19= 'guards' otherlv_20= '{' ( (lv_guards_21_0= ruleGuard ) ) (otherlv_22= ',' ( (lv_guards_23_0= ruleGuard ) ) )* otherlv_24= '}' )? (otherlv_25= 'actions' otherlv_26= '{' ( (lv_actions_27_0= ruleAction ) ) (otherlv_28= ',' ( (lv_actions_29_0= ruleAction ) ) )* otherlv_30= '}' )? (otherlv_31= 'witnesses' otherlv_32= '{' ( (lv_witnesses_33_0= ruleWitness ) ) (otherlv_34= ',' ( (lv_witnesses_35_0= ruleWitness ) ) )* otherlv_36= '}' )? )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:412:2: () ( (lv_extended_1_0= 'extended' ) )? otherlv_2= 'Transition' (otherlv_3= '>' ( (lv_comment_4_0= ruleEString ) ) )? (otherlv_5= 'elaborates' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'target' ( ( ruleEString ) ) )? (otherlv_11= 'source' ( ( ruleEString ) ) )? (otherlv_13= 'parameters' otherlv_14= '{' ( (lv_parameters_15_0= ruleTypedParameter ) ) (otherlv_16= ',' ( (lv_parameters_17_0= ruleTypedParameter ) ) )* otherlv_18= '}' )? (otherlv_19= 'guards' otherlv_20= '{' ( (lv_guards_21_0= ruleGuard ) ) (otherlv_22= ',' ( (lv_guards_23_0= ruleGuard ) ) )* otherlv_24= '}' )? (otherlv_25= 'actions' otherlv_26= '{' ( (lv_actions_27_0= ruleAction ) ) (otherlv_28= ',' ( (lv_actions_29_0= ruleAction ) ) )* otherlv_30= '}' )? (otherlv_31= 'witnesses' otherlv_32= '{' ( (lv_witnesses_33_0= ruleWitness ) ) (otherlv_34= ',' ( (lv_witnesses_35_0= ruleWitness ) ) )* otherlv_36= '}' )?
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

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:419:1: (lv_extended_1_0= 'extended' )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:419:1: (lv_extended_1_0= 'extended' )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:420:3: lv_extended_1_0= 'extended'
                    {
                    lv_extended_1_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleTransition885); 

                            newLeafNode(lv_extended_1_0, grammarAccess.getTransitionAccess().getExtendedExtendedKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                           		setWithLastConsumed(current, "extended", true, "extended");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleTransition911); 

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
                    otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTransition924); 

                        	newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getGreaterThanSignKeyword_3_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:441:1: ( (lv_comment_4_0= ruleEString ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:442:1: (lv_comment_4_0= ruleEString )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:442:1: (lv_comment_4_0= ruleEString )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:443:3: lv_comment_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getTransitionAccess().getCommentEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransition945);
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

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:459:4: (otherlv_5= 'elaborates' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==14) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:459:6: otherlv_5= 'elaborates' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTransition960); 

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
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransition983);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:478:2: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==17) ) {
                            int LA13_2 = input.LA(2);

                            if ( ((LA13_2>=RULE_STRING && LA13_2<=RULE_ID)) ) {
                                alt13=1;
                            }


                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:478:4: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleTransition996); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getCommaKeyword_4_2_0());
                    	        
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:482:1: ( ( ruleEString ) )
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:483:1: ( ruleEString )
                    	    {
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:483:1: ( ruleEString )
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:484:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getTransitionAccess().getElaboratesEventCrossReference_4_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransition1019);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


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

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:497:6: (otherlv_9= 'target' ( ( ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==21) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:497:8: otherlv_9= 'target' ( ( ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleTransition1036); 

                        	newLeafNode(otherlv_9, grammarAccess.getTransitionAccess().getTargetKeyword_5_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:501:1: ( ( ruleEString ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:502:1: ( ruleEString )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:502:1: ( ruleEString )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:503:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getTransitionAccess().getTargetAbstractNodeCrossReference_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransition1059);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:516:4: (otherlv_11= 'source' ( ( ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:516:6: otherlv_11= 'source' ( ( ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleTransition1074); 

                        	newLeafNode(otherlv_11, grammarAccess.getTransitionAccess().getSourceKeyword_6_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:520:1: ( ( ruleEString ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:521:1: ( ruleEString )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:521:1: ( ruleEString )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:522:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getTransitionAccess().getSourceAbstractNodeCrossReference_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransition1097);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:535:4: (otherlv_13= 'parameters' otherlv_14= '{' ( (lv_parameters_15_0= ruleTypedParameter ) ) (otherlv_16= ',' ( (lv_parameters_17_0= ruleTypedParameter ) ) )* otherlv_18= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:535:6: otherlv_13= 'parameters' otherlv_14= '{' ( (lv_parameters_15_0= ruleTypedParameter ) ) (otherlv_16= ',' ( (lv_parameters_17_0= ruleTypedParameter ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleTransition1112); 

                        	newLeafNode(otherlv_13, grammarAccess.getTransitionAccess().getParametersKeyword_7_0());
                        
                    otherlv_14=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleTransition1124); 

                        	newLeafNode(otherlv_14, grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:543:1: ( (lv_parameters_15_0= ruleTypedParameter ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:544:1: (lv_parameters_15_0= ruleTypedParameter )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:544:1: (lv_parameters_15_0= ruleTypedParameter )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:545:3: lv_parameters_15_0= ruleTypedParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getTransitionAccess().getParametersTypedParameterParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTypedParameter_in_ruleTransition1145);
                    lv_parameters_15_0=ruleTypedParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                    	        }
                           		add(
                           			current, 
                           			"parameters",
                            		lv_parameters_15_0, 
                            		"TypedParameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:561:2: (otherlv_16= ',' ( (lv_parameters_17_0= ruleTypedParameter ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==17) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:561:4: otherlv_16= ',' ( (lv_parameters_17_0= ruleTypedParameter ) )
                    	    {
                    	    otherlv_16=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleTransition1158); 

                    	        	newLeafNode(otherlv_16, grammarAccess.getTransitionAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:565:1: ( (lv_parameters_17_0= ruleTypedParameter ) )
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:566:1: (lv_parameters_17_0= ruleTypedParameter )
                    	    {
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:566:1: (lv_parameters_17_0= ruleTypedParameter )
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:567:3: lv_parameters_17_0= ruleTypedParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTransitionAccess().getParametersTypedParameterParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTypedParameter_in_ruleTransition1179);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleTransition1193); 

                        	newLeafNode(otherlv_18, grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:587:3: (otherlv_19= 'guards' otherlv_20= '{' ( (lv_guards_21_0= ruleGuard ) ) (otherlv_22= ',' ( (lv_guards_23_0= ruleGuard ) ) )* otherlv_24= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==26) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:587:5: otherlv_19= 'guards' otherlv_20= '{' ( (lv_guards_21_0= ruleGuard ) ) (otherlv_22= ',' ( (lv_guards_23_0= ruleGuard ) ) )* otherlv_24= '}'
                    {
                    otherlv_19=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleTransition1208); 

                        	newLeafNode(otherlv_19, grammarAccess.getTransitionAccess().getGuardsKeyword_8_0());
                        
                    otherlv_20=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleTransition1220); 

                        	newLeafNode(otherlv_20, grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:595:1: ( (lv_guards_21_0= ruleGuard ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:596:1: (lv_guards_21_0= ruleGuard )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:596:1: (lv_guards_21_0= ruleGuard )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:597:3: lv_guards_21_0= ruleGuard
                    {
                     
                    	        newCompositeNode(grammarAccess.getTransitionAccess().getGuardsGuardParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleGuard_in_ruleTransition1241);
                    lv_guards_21_0=ruleGuard();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                    	        }
                           		add(
                           			current, 
                           			"guards",
                            		lv_guards_21_0, 
                            		"Guard");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:613:2: (otherlv_22= ',' ( (lv_guards_23_0= ruleGuard ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==17) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:613:4: otherlv_22= ',' ( (lv_guards_23_0= ruleGuard ) )
                    	    {
                    	    otherlv_22=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleTransition1254); 

                    	        	newLeafNode(otherlv_22, grammarAccess.getTransitionAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:617:1: ( (lv_guards_23_0= ruleGuard ) )
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:618:1: (lv_guards_23_0= ruleGuard )
                    	    {
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:618:1: (lv_guards_23_0= ruleGuard )
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:619:3: lv_guards_23_0= ruleGuard
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTransitionAccess().getGuardsGuardParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleGuard_in_ruleTransition1275);
                    	    lv_guards_23_0=ruleGuard();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"guards",
                    	            		lv_guards_23_0, 
                    	            		"Guard");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_24=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleTransition1289); 

                        	newLeafNode(otherlv_24, grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:639:3: (otherlv_25= 'actions' otherlv_26= '{' ( (lv_actions_27_0= ruleAction ) ) (otherlv_28= ',' ( (lv_actions_29_0= ruleAction ) ) )* otherlv_30= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==27) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:639:5: otherlv_25= 'actions' otherlv_26= '{' ( (lv_actions_27_0= ruleAction ) ) (otherlv_28= ',' ( (lv_actions_29_0= ruleAction ) ) )* otherlv_30= '}'
                    {
                    otherlv_25=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleTransition1304); 

                        	newLeafNode(otherlv_25, grammarAccess.getTransitionAccess().getActionsKeyword_9_0());
                        
                    otherlv_26=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleTransition1316); 

                        	newLeafNode(otherlv_26, grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:647:1: ( (lv_actions_27_0= ruleAction ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:648:1: (lv_actions_27_0= ruleAction )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:648:1: (lv_actions_27_0= ruleAction )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:649:3: lv_actions_27_0= ruleAction
                    {
                     
                    	        newCompositeNode(grammarAccess.getTransitionAccess().getActionsActionParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAction_in_ruleTransition1337);
                    lv_actions_27_0=ruleAction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                    	        }
                           		add(
                           			current, 
                           			"actions",
                            		lv_actions_27_0, 
                            		"Action");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:665:2: (otherlv_28= ',' ( (lv_actions_29_0= ruleAction ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==17) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:665:4: otherlv_28= ',' ( (lv_actions_29_0= ruleAction ) )
                    	    {
                    	    otherlv_28=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleTransition1350); 

                    	        	newLeafNode(otherlv_28, grammarAccess.getTransitionAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:669:1: ( (lv_actions_29_0= ruleAction ) )
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:670:1: (lv_actions_29_0= ruleAction )
                    	    {
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:670:1: (lv_actions_29_0= ruleAction )
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:671:3: lv_actions_29_0= ruleAction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTransitionAccess().getActionsActionParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAction_in_ruleTransition1371);
                    	    lv_actions_29_0=ruleAction();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"actions",
                    	            		lv_actions_29_0, 
                    	            		"Action");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_30=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleTransition1385); 

                        	newLeafNode(otherlv_30, grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:691:3: (otherlv_31= 'witnesses' otherlv_32= '{' ( (lv_witnesses_33_0= ruleWitness ) ) (otherlv_34= ',' ( (lv_witnesses_35_0= ruleWitness ) ) )* otherlv_36= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==28) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:691:5: otherlv_31= 'witnesses' otherlv_32= '{' ( (lv_witnesses_33_0= ruleWitness ) ) (otherlv_34= ',' ( (lv_witnesses_35_0= ruleWitness ) ) )* otherlv_36= '}'
                    {
                    otherlv_31=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleTransition1400); 

                        	newLeafNode(otherlv_31, grammarAccess.getTransitionAccess().getWitnessesKeyword_10_0());
                        
                    otherlv_32=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleTransition1412); 

                        	newLeafNode(otherlv_32, grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_10_1());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:699:1: ( (lv_witnesses_33_0= ruleWitness ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:700:1: (lv_witnesses_33_0= ruleWitness )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:700:1: (lv_witnesses_33_0= ruleWitness )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:701:3: lv_witnesses_33_0= ruleWitness
                    {
                     
                    	        newCompositeNode(grammarAccess.getTransitionAccess().getWitnessesWitnessParserRuleCall_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleWitness_in_ruleTransition1433);
                    lv_witnesses_33_0=ruleWitness();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                    	        }
                           		add(
                           			current, 
                           			"witnesses",
                            		lv_witnesses_33_0, 
                            		"Witness");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:717:2: (otherlv_34= ',' ( (lv_witnesses_35_0= ruleWitness ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==17) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:717:4: otherlv_34= ',' ( (lv_witnesses_35_0= ruleWitness ) )
                    	    {
                    	    otherlv_34=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleTransition1446); 

                    	        	newLeafNode(otherlv_34, grammarAccess.getTransitionAccess().getCommaKeyword_10_3_0());
                    	        
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:721:1: ( (lv_witnesses_35_0= ruleWitness ) )
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:722:1: (lv_witnesses_35_0= ruleWitness )
                    	    {
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:722:1: (lv_witnesses_35_0= ruleWitness )
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:723:3: lv_witnesses_35_0= ruleWitness
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTransitionAccess().getWitnessesWitnessParserRuleCall_10_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleWitness_in_ruleTransition1467);
                    	    lv_witnesses_35_0=ruleWitness();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"witnesses",
                    	            		lv_witnesses_35_0, 
                    	            		"Witness");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_36=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleTransition1481); 

                        	newLeafNode(otherlv_36, grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_10_4());
                        

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
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleState"
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:753:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:754:2: (iv_ruleState= ruleState EOF )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:755:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleState_in_entryRuleState1521);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleState1531); 

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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:762:1: ruleState returns [EObject current=null] : ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'refines' ( ( ruleEString ) ) )? (otherlv_5= 'statemachines' otherlv_6= '{' ( (lv_statemachines_7_0= ruleStatemachine ) ) (otherlv_8= ',' ( (lv_statemachines_9_0= ruleStatemachine ) ) )* otherlv_10= '}' )? (otherlv_11= 'invariants' otherlv_12= '{' ( (lv_invariants_13_0= ruleInvariant ) ) (otherlv_14= ',' ( (lv_invariants_15_0= ruleInvariant ) ) )* otherlv_16= '}' )? ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_statemachines_7_0 = null;

        EObject lv_statemachines_9_0 = null;

        EObject lv_invariants_13_0 = null;

        EObject lv_invariants_15_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:765:28: ( ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'refines' ( ( ruleEString ) ) )? (otherlv_5= 'statemachines' otherlv_6= '{' ( (lv_statemachines_7_0= ruleStatemachine ) ) (otherlv_8= ',' ( (lv_statemachines_9_0= ruleStatemachine ) ) )* otherlv_10= '}' )? (otherlv_11= 'invariants' otherlv_12= '{' ( (lv_invariants_13_0= ruleInvariant ) ) (otherlv_14= ',' ( (lv_invariants_15_0= ruleInvariant ) ) )* otherlv_16= '}' )? ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:766:1: ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'refines' ( ( ruleEString ) ) )? (otherlv_5= 'statemachines' otherlv_6= '{' ( (lv_statemachines_7_0= ruleStatemachine ) ) (otherlv_8= ',' ( (lv_statemachines_9_0= ruleStatemachine ) ) )* otherlv_10= '}' )? (otherlv_11= 'invariants' otherlv_12= '{' ( (lv_invariants_13_0= ruleInvariant ) ) (otherlv_14= ',' ( (lv_invariants_15_0= ruleInvariant ) ) )* otherlv_16= '}' )? )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:766:1: ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'refines' ( ( ruleEString ) ) )? (otherlv_5= 'statemachines' otherlv_6= '{' ( (lv_statemachines_7_0= ruleStatemachine ) ) (otherlv_8= ',' ( (lv_statemachines_9_0= ruleStatemachine ) ) )* otherlv_10= '}' )? (otherlv_11= 'invariants' otherlv_12= '{' ( (lv_invariants_13_0= ruleInvariant ) ) (otherlv_14= ',' ( (lv_invariants_15_0= ruleInvariant ) ) )* otherlv_16= '}' )? )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:766:2: () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'refines' ( ( ruleEString ) ) )? (otherlv_5= 'statemachines' otherlv_6= '{' ( (lv_statemachines_7_0= ruleStatemachine ) ) (otherlv_8= ',' ( (lv_statemachines_9_0= ruleStatemachine ) ) )* otherlv_10= '}' )? (otherlv_11= 'invariants' otherlv_12= '{' ( (lv_invariants_13_0= ruleInvariant ) ) (otherlv_14= ',' ( (lv_invariants_15_0= ruleInvariant ) ) )* otherlv_16= '}' )?
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:766:2: ()
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:767:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStateAccess().getStateAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleState1577); 

                	newLeafNode(otherlv_1, grammarAccess.getStateAccess().getStateKeyword_1());
                
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:776:1: ( (lv_name_2_0= ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:777:1: (lv_name_2_0= ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:777:1: (lv_name_2_0= ruleEString )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:778:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleState1598);
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

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:794:2: (otherlv_3= 'refines' ( ( ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==15) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:794:4: otherlv_3= 'refines' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleState1611); 

                        	newLeafNode(otherlv_3, grammarAccess.getStateAccess().getRefinesKeyword_3_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:798:1: ( ( ruleEString ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:799:1: ( ruleEString )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:799:1: ( ruleEString )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:800:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStateRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getStateAccess().getRefinesStateCrossReference_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleState1634);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:813:4: (otherlv_5= 'statemachines' otherlv_6= '{' ( (lv_statemachines_7_0= ruleStatemachine ) ) (otherlv_8= ',' ( (lv_statemachines_9_0= ruleStatemachine ) ) )* otherlv_10= '}' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==30) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:813:6: otherlv_5= 'statemachines' otherlv_6= '{' ( (lv_statemachines_7_0= ruleStatemachine ) ) (otherlv_8= ',' ( (lv_statemachines_9_0= ruleStatemachine ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleState1649); 

                        	newLeafNode(otherlv_5, grammarAccess.getStateAccess().getStatemachinesKeyword_4_0());
                        
                    otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleState1661); 

                        	newLeafNode(otherlv_6, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:821:1: ( (lv_statemachines_7_0= ruleStatemachine ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:822:1: (lv_statemachines_7_0= ruleStatemachine )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:822:1: (lv_statemachines_7_0= ruleStatemachine )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:823:3: lv_statemachines_7_0= ruleStatemachine
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateAccess().getStatemachinesStatemachineParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStatemachine_in_ruleState1682);
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

                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:839:2: (otherlv_8= ',' ( (lv_statemachines_9_0= ruleStatemachine ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==17) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:839:4: otherlv_8= ',' ( (lv_statemachines_9_0= ruleStatemachine ) )
                    	    {
                    	    otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleState1695); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getStateAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:843:1: ( (lv_statemachines_9_0= ruleStatemachine ) )
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:844:1: (lv_statemachines_9_0= ruleStatemachine )
                    	    {
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:844:1: (lv_statemachines_9_0= ruleStatemachine )
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:845:3: lv_statemachines_9_0= ruleStatemachine
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStateAccess().getStatemachinesStatemachineParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleStatemachine_in_ruleState1716);
                    	    lv_statemachines_9_0=ruleStatemachine();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStateRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"statemachines",
                    	            		lv_statemachines_9_0, 
                    	            		"Statemachine");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleState1730); 

                        	newLeafNode(otherlv_10, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:865:3: (otherlv_11= 'invariants' otherlv_12= '{' ( (lv_invariants_13_0= ruleInvariant ) ) (otherlv_14= ',' ( (lv_invariants_15_0= ruleInvariant ) ) )* otherlv_16= '}' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==31) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:865:5: otherlv_11= 'invariants' otherlv_12= '{' ( (lv_invariants_13_0= ruleInvariant ) ) (otherlv_14= ',' ( (lv_invariants_15_0= ruleInvariant ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleState1745); 

                        	newLeafNode(otherlv_11, grammarAccess.getStateAccess().getInvariantsKeyword_5_0());
                        
                    otherlv_12=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleState1757); 

                        	newLeafNode(otherlv_12, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:873:1: ( (lv_invariants_13_0= ruleInvariant ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:874:1: (lv_invariants_13_0= ruleInvariant )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:874:1: (lv_invariants_13_0= ruleInvariant )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:875:3: lv_invariants_13_0= ruleInvariant
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateAccess().getInvariantsInvariantParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInvariant_in_ruleState1778);
                    lv_invariants_13_0=ruleInvariant();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStateRule());
                    	        }
                           		add(
                           			current, 
                           			"invariants",
                            		lv_invariants_13_0, 
                            		"Invariant");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:891:2: (otherlv_14= ',' ( (lv_invariants_15_0= ruleInvariant ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==17) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:891:4: otherlv_14= ',' ( (lv_invariants_15_0= ruleInvariant ) )
                    	    {
                    	    otherlv_14=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleState1791); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getStateAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:895:1: ( (lv_invariants_15_0= ruleInvariant ) )
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:896:1: (lv_invariants_15_0= ruleInvariant )
                    	    {
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:896:1: (lv_invariants_15_0= ruleInvariant )
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:897:3: lv_invariants_15_0= ruleInvariant
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStateAccess().getInvariantsInvariantParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInvariant_in_ruleState1812);
                    	    lv_invariants_15_0=ruleInvariant();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStateRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"invariants",
                    	            		lv_invariants_15_0, 
                    	            		"Invariant");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleState1826); 

                        	newLeafNode(otherlv_16, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_5_4());
                        

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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:925:1: entryRuleInitial returns [EObject current=null] : iv_ruleInitial= ruleInitial EOF ;
    public final EObject entryRuleInitial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitial = null;


        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:926:2: (iv_ruleInitial= ruleInitial EOF )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:927:2: iv_ruleInitial= ruleInitial EOF
            {
             newCompositeNode(grammarAccess.getInitialRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInitial_in_entryRuleInitial1864);
            iv_ruleInitial=ruleInitial();

            state._fsp--;

             current =iv_ruleInitial; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInitial1874); 

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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:934:1: ruleInitial returns [EObject current=null] : ( () otherlv_1= 'Initial' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleInitial() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_internalId_3_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:937:28: ( ( () otherlv_1= 'Initial' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:938:1: ( () otherlv_1= 'Initial' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:938:1: ( () otherlv_1= 'Initial' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:938:2: () otherlv_1= 'Initial' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:938:2: ()
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:939:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInitialAccess().getInitialAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleInitial1920); 

                	newLeafNode(otherlv_1, grammarAccess.getInitialAccess().getInitialKeyword_1());
                
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:948:1: (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==33) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:948:3: otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleInitial1933); 

                        	newLeafNode(otherlv_2, grammarAccess.getInitialAccess().getInternalIdKeyword_2_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:952:1: ( (lv_internalId_3_0= ruleEString ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:953:1: (lv_internalId_3_0= ruleEString )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:953:1: (lv_internalId_3_0= ruleEString )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:954:3: lv_internalId_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInitialAccess().getInternalIdEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInitial1954);
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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:978:1: entryRuleFinal returns [EObject current=null] : iv_ruleFinal= ruleFinal EOF ;
    public final EObject entryRuleFinal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFinal = null;


        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:979:2: (iv_ruleFinal= ruleFinal EOF )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:980:2: iv_ruleFinal= ruleFinal EOF
            {
             newCompositeNode(grammarAccess.getFinalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFinal_in_entryRuleFinal1992);
            iv_ruleFinal=ruleFinal();

            state._fsp--;

             current =iv_ruleFinal; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFinal2002); 

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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:987:1: ruleFinal returns [EObject current=null] : ( () otherlv_1= 'Final' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleFinal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_internalId_3_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:990:28: ( ( () otherlv_1= 'Final' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:991:1: ( () otherlv_1= 'Final' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:991:1: ( () otherlv_1= 'Final' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:991:2: () otherlv_1= 'Final' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:991:2: ()
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:992:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFinalAccess().getFinalAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleFinal2048); 

                	newLeafNode(otherlv_1, grammarAccess.getFinalAccess().getFinalKeyword_1());
                
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1001:1: (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==33) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1001:3: otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleFinal2061); 

                        	newLeafNode(otherlv_2, grammarAccess.getFinalAccess().getInternalIdKeyword_2_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1005:1: ( (lv_internalId_3_0= ruleEString ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1006:1: (lv_internalId_3_0= ruleEString )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1006:1: (lv_internalId_3_0= ruleEString )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1007:3: lv_internalId_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getFinalAccess().getInternalIdEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFinal2082);
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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1031:1: entryRuleAny returns [EObject current=null] : iv_ruleAny= ruleAny EOF ;
    public final EObject entryRuleAny() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAny = null;


        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1032:2: (iv_ruleAny= ruleAny EOF )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1033:2: iv_ruleAny= ruleAny EOF
            {
             newCompositeNode(grammarAccess.getAnyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAny_in_entryRuleAny2120);
            iv_ruleAny=ruleAny();

            state._fsp--;

             current =iv_ruleAny; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAny2130); 

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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1040:1: ruleAny returns [EObject current=null] : ( () otherlv_1= 'Any' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleAny() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_internalId_3_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1043:28: ( ( () otherlv_1= 'Any' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1044:1: ( () otherlv_1= 'Any' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1044:1: ( () otherlv_1= 'Any' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1044:2: () otherlv_1= 'Any' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1044:2: ()
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1045:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAnyAccess().getAnyAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleAny2176); 

                	newLeafNode(otherlv_1, grammarAccess.getAnyAccess().getAnyKeyword_1());
                
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1054:1: (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==33) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1054:3: otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleAny2189); 

                        	newLeafNode(otherlv_2, grammarAccess.getAnyAccess().getInternalIdKeyword_2_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1058:1: ( (lv_internalId_3_0= ruleEString ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1059:1: (lv_internalId_3_0= ruleEString )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1059:1: (lv_internalId_3_0= ruleEString )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1060:3: lv_internalId_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnyAccess().getInternalIdEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAny2210);
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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1084:1: entryRuleJunction returns [EObject current=null] : iv_ruleJunction= ruleJunction EOF ;
    public final EObject entryRuleJunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJunction = null;


        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1085:2: (iv_ruleJunction= ruleJunction EOF )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1086:2: iv_ruleJunction= ruleJunction EOF
            {
             newCompositeNode(grammarAccess.getJunctionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleJunction_in_entryRuleJunction2248);
            iv_ruleJunction=ruleJunction();

            state._fsp--;

             current =iv_ruleJunction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleJunction2258); 

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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1093:1: ruleJunction returns [EObject current=null] : ( () otherlv_1= 'Junction' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleJunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_internalId_3_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1096:28: ( ( () otherlv_1= 'Junction' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1097:1: ( () otherlv_1= 'Junction' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1097:1: ( () otherlv_1= 'Junction' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1097:2: () otherlv_1= 'Junction' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1097:2: ()
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1098:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getJunctionAccess().getJunctionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleJunction2304); 

                	newLeafNode(otherlv_1, grammarAccess.getJunctionAccess().getJunctionKeyword_1());
                
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1107:1: (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==33) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1107:3: otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleJunction2317); 

                        	newLeafNode(otherlv_2, grammarAccess.getJunctionAccess().getInternalIdKeyword_2_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1111:1: ( (lv_internalId_3_0= ruleEString ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1112:1: (lv_internalId_3_0= ruleEString )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1112:1: (lv_internalId_3_0= ruleEString )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1113:3: lv_internalId_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getJunctionAccess().getInternalIdEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleJunction2338);
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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1137:1: entryRuleFork returns [EObject current=null] : iv_ruleFork= ruleFork EOF ;
    public final EObject entryRuleFork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFork = null;


        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1138:2: (iv_ruleFork= ruleFork EOF )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1139:2: iv_ruleFork= ruleFork EOF
            {
             newCompositeNode(grammarAccess.getForkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFork_in_entryRuleFork2376);
            iv_ruleFork=ruleFork();

            state._fsp--;

             current =iv_ruleFork; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFork2386); 

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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1146:1: ruleFork returns [EObject current=null] : ( () otherlv_1= 'Fork' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleFork() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_internalId_3_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1149:28: ( ( () otherlv_1= 'Fork' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1150:1: ( () otherlv_1= 'Fork' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1150:1: ( () otherlv_1= 'Fork' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1150:2: () otherlv_1= 'Fork' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1150:2: ()
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1151:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getForkAccess().getForkAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleFork2432); 

                	newLeafNode(otherlv_1, grammarAccess.getForkAccess().getForkKeyword_1());
                
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1160:1: (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==33) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1160:3: otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleFork2445); 

                        	newLeafNode(otherlv_2, grammarAccess.getForkAccess().getInternalIdKeyword_2_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1164:1: ( (lv_internalId_3_0= ruleEString ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1165:1: (lv_internalId_3_0= ruleEString )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1165:1: (lv_internalId_3_0= ruleEString )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1166:3: lv_internalId_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getForkAccess().getInternalIdEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFork2466);
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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1190:1: entryRuleInvariant returns [EObject current=null] : iv_ruleInvariant= ruleInvariant EOF ;
    public final EObject entryRuleInvariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvariant = null;


        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1191:2: (iv_ruleInvariant= ruleInvariant EOF )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1192:2: iv_ruleInvariant= ruleInvariant EOF
            {
             newCompositeNode(grammarAccess.getInvariantRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInvariant_in_entryRuleInvariant2504);
            iv_ruleInvariant=ruleInvariant();

            state._fsp--;

             current =iv_ruleInvariant; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInvariant2514); 

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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1199:1: ruleInvariant returns [EObject current=null] : (otherlv_0= 'Invariant' otherlv_1= '@' ( (lv_name_2_0= ruleEString ) ) ( (lv_theorem_3_0= 'theorem' ) )? ( (lv_predicate_4_0= ruleEString ) ) (otherlv_5= '>' ( (lv_comment_6_0= ruleEString ) ) )? ) ;
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
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1202:28: ( (otherlv_0= 'Invariant' otherlv_1= '@' ( (lv_name_2_0= ruleEString ) ) ( (lv_theorem_3_0= 'theorem' ) )? ( (lv_predicate_4_0= ruleEString ) ) (otherlv_5= '>' ( (lv_comment_6_0= ruleEString ) ) )? ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1203:1: (otherlv_0= 'Invariant' otherlv_1= '@' ( (lv_name_2_0= ruleEString ) ) ( (lv_theorem_3_0= 'theorem' ) )? ( (lv_predicate_4_0= ruleEString ) ) (otherlv_5= '>' ( (lv_comment_6_0= ruleEString ) ) )? )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1203:1: (otherlv_0= 'Invariant' otherlv_1= '@' ( (lv_name_2_0= ruleEString ) ) ( (lv_theorem_3_0= 'theorem' ) )? ( (lv_predicate_4_0= ruleEString ) ) (otherlv_5= '>' ( (lv_comment_6_0= ruleEString ) ) )? )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1203:3: otherlv_0= 'Invariant' otherlv_1= '@' ( (lv_name_2_0= ruleEString ) ) ( (lv_theorem_3_0= 'theorem' ) )? ( (lv_predicate_4_0= ruleEString ) ) (otherlv_5= '>' ( (lv_comment_6_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleInvariant2551); 

                	newLeafNode(otherlv_0, grammarAccess.getInvariantAccess().getInvariantKeyword_0());
                
            otherlv_1=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleInvariant2563); 

                	newLeafNode(otherlv_1, grammarAccess.getInvariantAccess().getCommercialAtKeyword_1());
                
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1211:1: ( (lv_name_2_0= ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1212:1: (lv_name_2_0= ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1212:1: (lv_name_2_0= ruleEString )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1213:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInvariantAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInvariant2584);
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

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1229:2: ( (lv_theorem_3_0= 'theorem' ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==40) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1230:1: (lv_theorem_3_0= 'theorem' )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1230:1: (lv_theorem_3_0= 'theorem' )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1231:3: lv_theorem_3_0= 'theorem'
                    {
                    lv_theorem_3_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleInvariant2602); 

                            newLeafNode(lv_theorem_3_0, grammarAccess.getInvariantAccess().getTheoremTheoremKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInvariantRule());
                    	        }
                           		setWithLastConsumed(current, "theorem", true, "theorem");
                    	    

                    }


                    }
                    break;

            }

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1244:3: ( (lv_predicate_4_0= ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1245:1: (lv_predicate_4_0= ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1245:1: (lv_predicate_4_0= ruleEString )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1246:3: lv_predicate_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInvariantAccess().getPredicateEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInvariant2637);
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

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1262:2: (otherlv_5= '>' ( (lv_comment_6_0= ruleEString ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==12) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1262:4: otherlv_5= '>' ( (lv_comment_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleInvariant2650); 

                        	newLeafNode(otherlv_5, grammarAccess.getInvariantAccess().getGreaterThanSignKeyword_5_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1266:1: ( (lv_comment_6_0= ruleEString ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1267:1: (lv_comment_6_0= ruleEString )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1267:1: (lv_comment_6_0= ruleEString )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1268:3: lv_comment_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInvariantAccess().getCommentEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInvariant2671);
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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1292:1: entryRuleTypedParameter returns [EObject current=null] : iv_ruleTypedParameter= ruleTypedParameter EOF ;
    public final EObject entryRuleTypedParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedParameter = null;


        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1293:2: (iv_ruleTypedParameter= ruleTypedParameter EOF )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1294:2: iv_ruleTypedParameter= ruleTypedParameter EOF
            {
             newCompositeNode(grammarAccess.getTypedParameterRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTypedParameter_in_entryRuleTypedParameter2709);
            iv_ruleTypedParameter=ruleTypedParameter();

            state._fsp--;

             current =iv_ruleTypedParameter; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypedParameter2719); 

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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1301:1: ruleTypedParameter returns [EObject current=null] : (otherlv_0= 'TypedParameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleEString ) ) (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? ) ;
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
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1304:28: ( (otherlv_0= 'TypedParameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleEString ) ) (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1305:1: (otherlv_0= 'TypedParameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleEString ) ) (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1305:1: (otherlv_0= 'TypedParameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleEString ) ) (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1305:3: otherlv_0= 'TypedParameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleEString ) ) (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleTypedParameter2756); 

                	newLeafNode(otherlv_0, grammarAccess.getTypedParameterAccess().getTypedParameterKeyword_0());
                
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1309:1: ( (lv_name_1_0= ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1310:1: (lv_name_1_0= ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1310:1: (lv_name_1_0= ruleEString )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1311:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTypedParameterAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTypedParameter2777);
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

            otherlv_2=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleTypedParameter2789); 

                	newLeafNode(otherlv_2, grammarAccess.getTypedParameterAccess().getTypeKeyword_2());
                
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1331:1: ( (lv_type_3_0= ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1332:1: (lv_type_3_0= ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1332:1: (lv_type_3_0= ruleEString )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1333:3: lv_type_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTypedParameterAccess().getTypeEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTypedParameter2810);
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

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1349:2: (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==12) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1349:4: otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTypedParameter2823); 

                        	newLeafNode(otherlv_4, grammarAccess.getTypedParameterAccess().getGreaterThanSignKeyword_4_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1353:1: ( (lv_comment_5_0= ruleEString ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1354:1: (lv_comment_5_0= ruleEString )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1354:1: (lv_comment_5_0= ruleEString )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1355:3: lv_comment_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypedParameterAccess().getCommentEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTypedParameter2844);
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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1379:1: entryRuleGuard returns [EObject current=null] : iv_ruleGuard= ruleGuard EOF ;
    public final EObject entryRuleGuard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuard = null;


        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1380:2: (iv_ruleGuard= ruleGuard EOF )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1381:2: iv_ruleGuard= ruleGuard EOF
            {
             newCompositeNode(grammarAccess.getGuardRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGuard_in_entryRuleGuard2882);
            iv_ruleGuard=ruleGuard();

            state._fsp--;

             current =iv_ruleGuard; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGuard2892); 

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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1388:1: ruleGuard returns [EObject current=null] : ( ( (lv_theorem_0_0= 'theorem' ) ) otherlv_1= '@' ( (lv_name_2_0= ruleEString ) ) ( (lv_predicate_3_0= ruleEString ) ) (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? ) ;
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
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1391:28: ( ( ( (lv_theorem_0_0= 'theorem' ) ) otherlv_1= '@' ( (lv_name_2_0= ruleEString ) ) ( (lv_predicate_3_0= ruleEString ) ) (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1392:1: ( ( (lv_theorem_0_0= 'theorem' ) ) otherlv_1= '@' ( (lv_name_2_0= ruleEString ) ) ( (lv_predicate_3_0= ruleEString ) ) (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1392:1: ( ( (lv_theorem_0_0= 'theorem' ) ) otherlv_1= '@' ( (lv_name_2_0= ruleEString ) ) ( (lv_predicate_3_0= ruleEString ) ) (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1392:2: ( (lv_theorem_0_0= 'theorem' ) ) otherlv_1= '@' ( (lv_name_2_0= ruleEString ) ) ( (lv_predicate_3_0= ruleEString ) ) (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )?
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1392:2: ( (lv_theorem_0_0= 'theorem' ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1393:1: (lv_theorem_0_0= 'theorem' )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1393:1: (lv_theorem_0_0= 'theorem' )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1394:3: lv_theorem_0_0= 'theorem'
            {
            lv_theorem_0_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleGuard2935); 

                    newLeafNode(lv_theorem_0_0, grammarAccess.getGuardAccess().getTheoremTheoremKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGuardRule());
            	        }
                   		setWithLastConsumed(current, "theorem", true, "theorem");
            	    

            }


            }

            otherlv_1=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleGuard2960); 

                	newLeafNode(otherlv_1, grammarAccess.getGuardAccess().getCommercialAtKeyword_1());
                
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1411:1: ( (lv_name_2_0= ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1412:1: (lv_name_2_0= ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1412:1: (lv_name_2_0= ruleEString )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1413:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getGuardAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGuard2981);
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

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1429:2: ( (lv_predicate_3_0= ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1430:1: (lv_predicate_3_0= ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1430:1: (lv_predicate_3_0= ruleEString )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1431:3: lv_predicate_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getGuardAccess().getPredicateEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGuard3002);
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

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1447:2: (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==12) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1447:4: otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleGuard3015); 

                        	newLeafNode(otherlv_4, grammarAccess.getGuardAccess().getGreaterThanSignKeyword_4_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1451:1: ( (lv_comment_5_0= ruleEString ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1452:1: (lv_comment_5_0= ruleEString )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1452:1: (lv_comment_5_0= ruleEString )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1453:3: lv_comment_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getGuardAccess().getCommentEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGuard3036);
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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1477:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1478:2: (iv_ruleAction= ruleAction EOF )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1479:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAction_in_entryRuleAction3074);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAction3084); 

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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1486:1: ruleAction returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'action' ( (lv_action_3_0= ruleEString ) ) (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_action_3_0 = null;

        AntlrDatatypeRuleToken lv_comment_5_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1489:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'action' ( (lv_action_3_0= ruleEString ) ) (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1490:1: (otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'action' ( (lv_action_3_0= ruleEString ) ) (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1490:1: (otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'action' ( (lv_action_3_0= ruleEString ) ) (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1490:3: otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'action' ( (lv_action_3_0= ruleEString ) ) (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleAction3121); 

                	newLeafNode(otherlv_0, grammarAccess.getActionAccess().getCommercialAtKeyword_0());
                
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1494:1: ( (lv_name_1_0= ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1495:1: (lv_name_1_0= ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1495:1: (lv_name_1_0= ruleEString )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1496:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getActionAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAction3142);
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

            otherlv_2=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleAction3154); 

                	newLeafNode(otherlv_2, grammarAccess.getActionAccess().getActionKeyword_2());
                
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1516:1: ( (lv_action_3_0= ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1517:1: (lv_action_3_0= ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1517:1: (lv_action_3_0= ruleEString )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1518:3: lv_action_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getActionAccess().getActionEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAction3175);
            lv_action_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActionRule());
            	        }
                   		set(
                   			current, 
                   			"action",
                    		lv_action_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1534:2: (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==12) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1534:4: otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAction3188); 

                        	newLeafNode(otherlv_4, grammarAccess.getActionAccess().getGreaterThanSignKeyword_4_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1538:1: ( (lv_comment_5_0= ruleEString ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1539:1: (lv_comment_5_0= ruleEString )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1539:1: (lv_comment_5_0= ruleEString )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1540:3: lv_comment_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getCommentEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAction3209);
                    lv_comment_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionRule());
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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleWitness"
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1564:1: entryRuleWitness returns [EObject current=null] : iv_ruleWitness= ruleWitness EOF ;
    public final EObject entryRuleWitness() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWitness = null;


        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1565:2: (iv_ruleWitness= ruleWitness EOF )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1566:2: iv_ruleWitness= ruleWitness EOF
            {
             newCompositeNode(grammarAccess.getWitnessRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWitness_in_entryRuleWitness3247);
            iv_ruleWitness=ruleWitness();

            state._fsp--;

             current =iv_ruleWitness; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWitness3257); 

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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1573:1: ruleWitness returns [EObject current=null] : (otherlv_0= 'Witness' otherlv_1= '@' ( (lv_name_2_0= ruleEString ) ) ( (lv_predicate_3_0= ruleEString ) ) (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? ) ;
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
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1576:28: ( (otherlv_0= 'Witness' otherlv_1= '@' ( (lv_name_2_0= ruleEString ) ) ( (lv_predicate_3_0= ruleEString ) ) (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1577:1: (otherlv_0= 'Witness' otherlv_1= '@' ( (lv_name_2_0= ruleEString ) ) ( (lv_predicate_3_0= ruleEString ) ) (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1577:1: (otherlv_0= 'Witness' otherlv_1= '@' ( (lv_name_2_0= ruleEString ) ) ( (lv_predicate_3_0= ruleEString ) ) (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )? )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1577:3: otherlv_0= 'Witness' otherlv_1= '@' ( (lv_name_2_0= ruleEString ) ) ( (lv_predicate_3_0= ruleEString ) ) (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleWitness3294); 

                	newLeafNode(otherlv_0, grammarAccess.getWitnessAccess().getWitnessKeyword_0());
                
            otherlv_1=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleWitness3306); 

                	newLeafNode(otherlv_1, grammarAccess.getWitnessAccess().getCommercialAtKeyword_1());
                
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1585:1: ( (lv_name_2_0= ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1586:1: (lv_name_2_0= ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1586:1: (lv_name_2_0= ruleEString )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1587:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getWitnessAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleWitness3327);
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

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1603:2: ( (lv_predicate_3_0= ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1604:1: (lv_predicate_3_0= ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1604:1: (lv_predicate_3_0= ruleEString )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1605:3: lv_predicate_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getWitnessAccess().getPredicateEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleWitness3348);
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

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1621:2: (otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==12) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1621:4: otherlv_4= '>' ( (lv_comment_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleWitness3361); 

                        	newLeafNode(otherlv_4, grammarAccess.getWitnessAccess().getGreaterThanSignKeyword_4_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1625:1: ( (lv_comment_5_0= ruleEString ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1626:1: (lv_comment_5_0= ruleEString )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1626:1: (lv_comment_5_0= ruleEString )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1627:3: lv_comment_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getWitnessAccess().getCommentEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleWitness3382);
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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1651:1: ruleTranslationKind returns [Enumerator current=null] : ( (enumLiteral_0= 'MULTIVAR' ) | (enumLiteral_1= 'SINGLEVAR' ) | (enumLiteral_2= 'REFINEDVAR' ) ) ;
    public final Enumerator ruleTranslationKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1653:28: ( ( (enumLiteral_0= 'MULTIVAR' ) | (enumLiteral_1= 'SINGLEVAR' ) | (enumLiteral_2= 'REFINEDVAR' ) ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1654:1: ( (enumLiteral_0= 'MULTIVAR' ) | (enumLiteral_1= 'SINGLEVAR' ) | (enumLiteral_2= 'REFINEDVAR' ) )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1654:1: ( (enumLiteral_0= 'MULTIVAR' ) | (enumLiteral_1= 'SINGLEVAR' ) | (enumLiteral_2= 'REFINEDVAR' ) )
            int alt41=3;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt41=1;
                }
                break;
            case 46:
                {
                alt41=2;
                }
                break;
            case 47:
                {
                alt41=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1654:2: (enumLiteral_0= 'MULTIVAR' )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1654:2: (enumLiteral_0= 'MULTIVAR' )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1654:4: enumLiteral_0= 'MULTIVAR'
                    {
                    enumLiteral_0=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleTranslationKind3434); 

                            current = grammarAccess.getTranslationKindAccess().getMULTIVAREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTranslationKindAccess().getMULTIVAREnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1660:6: (enumLiteral_1= 'SINGLEVAR' )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1660:6: (enumLiteral_1= 'SINGLEVAR' )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1660:8: enumLiteral_1= 'SINGLEVAR'
                    {
                    enumLiteral_1=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleTranslationKind3451); 

                            current = grammarAccess.getTranslationKindAccess().getSINGLEVAREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTranslationKindAccess().getSINGLEVAREnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1666:6: (enumLiteral_2= 'REFINEDVAR' )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1666:6: (enumLiteral_2= 'REFINEDVAR' )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1666:8: enumLiteral_2= 'REFINEDVAR'
                    {
                    enumLiteral_2=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleTranslationKind3468); 

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
        public static final BitSet FOLLOW_ruleEString_in_ruleStatemachine143 = new BitSet(new long[]{0x000000000005F002L});
        public static final BitSet FOLLOW_12_in_ruleStatemachine156 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStatemachine177 = new BitSet(new long[]{0x000000000005E002L});
        public static final BitSet FOLLOW_13_in_ruleStatemachine192 = new BitSet(new long[]{0x0000E00000000000L});
        public static final BitSet FOLLOW_ruleTranslationKind_in_ruleStatemachine213 = new BitSet(new long[]{0x000000000005C002L});
        public static final BitSet FOLLOW_14_in_ruleStatemachine228 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStatemachine251 = new BitSet(new long[]{0x0000000000058002L});
        public static final BitSet FOLLOW_15_in_ruleStatemachine266 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStatemachine289 = new BitSet(new long[]{0x0000000000050002L});
        public static final BitSet FOLLOW_16_in_ruleStatemachine304 = new BitSet(new long[]{0x0000003D20000000L});
        public static final BitSet FOLLOW_ruleAbstractNode_in_ruleStatemachine325 = new BitSet(new long[]{0x0000000000060002L});
        public static final BitSet FOLLOW_17_in_ruleStatemachine338 = new BitSet(new long[]{0x0000003D20000000L});
        public static final BitSet FOLLOW_ruleAbstractNode_in_ruleStatemachine359 = new BitSet(new long[]{0x0000000000060002L});
        public static final BitSet FOLLOW_18_in_ruleStatemachine376 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_ruleTransition_in_ruleStatemachine397 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_17_in_ruleStatemachine410 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_ruleTransition_in_ruleStatemachine431 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_ruleAbstractNode_in_entryRuleAbstractNode471 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractNode481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleState_in_ruleAbstractNode528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInitial_in_ruleAbstractNode555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFinal_in_ruleAbstractNode582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAny_in_ruleAbstractNode609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleJunction_in_ruleAbstractNode636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFork_in_ruleAbstractNode663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString701 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition823 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransition833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleTransition885 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleTransition911 = new BitSet(new long[]{0x000000001CE05002L});
        public static final BitSet FOLLOW_12_in_ruleTransition924 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransition945 = new BitSet(new long[]{0x000000001CE04002L});
        public static final BitSet FOLLOW_14_in_ruleTransition960 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransition983 = new BitSet(new long[]{0x000000001CE20002L});
        public static final BitSet FOLLOW_17_in_ruleTransition996 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransition1019 = new BitSet(new long[]{0x000000001CE20002L});
        public static final BitSet FOLLOW_21_in_ruleTransition1036 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransition1059 = new BitSet(new long[]{0x000000001CC00002L});
        public static final BitSet FOLLOW_22_in_ruleTransition1074 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransition1097 = new BitSet(new long[]{0x000000001C800002L});
        public static final BitSet FOLLOW_23_in_ruleTransition1112 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleTransition1124 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_ruleTypedParameter_in_ruleTransition1145 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_17_in_ruleTransition1158 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_ruleTypedParameter_in_ruleTransition1179 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_25_in_ruleTransition1193 = new BitSet(new long[]{0x000000001C000002L});
        public static final BitSet FOLLOW_26_in_ruleTransition1208 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleTransition1220 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_ruleGuard_in_ruleTransition1241 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_17_in_ruleTransition1254 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_ruleGuard_in_ruleTransition1275 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_25_in_ruleTransition1289 = new BitSet(new long[]{0x0000000018000002L});
        public static final BitSet FOLLOW_27_in_ruleTransition1304 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleTransition1316 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_ruleAction_in_ruleTransition1337 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_17_in_ruleTransition1350 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_ruleAction_in_ruleTransition1371 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_25_in_ruleTransition1385 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_ruleTransition1400 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleTransition1412 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_ruleWitness_in_ruleTransition1433 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_17_in_ruleTransition1446 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_ruleWitness_in_ruleTransition1467 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_25_in_ruleTransition1481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleState_in_entryRuleState1521 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleState1531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleState1577 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleState1598 = new BitSet(new long[]{0x00000000C0008002L});
        public static final BitSet FOLLOW_15_in_ruleState1611 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleState1634 = new BitSet(new long[]{0x00000000C0000002L});
        public static final BitSet FOLLOW_30_in_ruleState1649 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleState1661 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_ruleStatemachine_in_ruleState1682 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_17_in_ruleState1695 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_ruleStatemachine_in_ruleState1716 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_25_in_ruleState1730 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_31_in_ruleState1745 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleState1757 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_ruleInvariant_in_ruleState1778 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_17_in_ruleState1791 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_ruleInvariant_in_ruleState1812 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_25_in_ruleState1826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInitial_in_entryRuleInitial1864 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInitial1874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleInitial1920 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_33_in_ruleInitial1933 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInitial1954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFinal_in_entryRuleFinal1992 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFinal2002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleFinal2048 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_33_in_ruleFinal2061 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFinal2082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAny_in_entryRuleAny2120 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAny2130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleAny2176 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_33_in_ruleAny2189 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAny2210 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleJunction_in_entryRuleJunction2248 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleJunction2258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleJunction2304 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_33_in_ruleJunction2317 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleJunction2338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFork_in_entryRuleFork2376 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFork2386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleFork2432 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_33_in_ruleFork2445 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFork2466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvariant_in_entryRuleInvariant2504 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInvariant2514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleInvariant2551 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleInvariant2563 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInvariant2584 = new BitSet(new long[]{0x0000010000000030L});
        public static final BitSet FOLLOW_40_in_ruleInvariant2602 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInvariant2637 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_ruleInvariant2650 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInvariant2671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedParameter_in_entryRuleTypedParameter2709 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypedParameter2719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleTypedParameter2756 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTypedParameter2777 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleTypedParameter2789 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTypedParameter2810 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_ruleTypedParameter2823 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTypedParameter2844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGuard_in_entryRuleGuard2882 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGuard2892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleGuard2935 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleGuard2960 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGuard2981 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGuard3002 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_ruleGuard3015 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGuard3036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAction_in_entryRuleAction3074 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAction3084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleAction3121 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAction3142 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_ruleAction3154 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAction3175 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_ruleAction3188 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAction3209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWitness_in_entryRuleWitness3247 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWitness3257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleWitness3294 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleWitness3306 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleWitness3327 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleWitness3348 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_ruleWitness3361 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleWitness3382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleTranslationKind3434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleTranslationKind3451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleTranslationKind3468 = new BitSet(new long[]{0x0000000000000002L});
    }


}