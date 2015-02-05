package ac.soton.uk.iumlb.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Statemachine'", "'elaborates'", "'refines'", "'nodes'", "','", "'transitions'", "'extended'", "'Transition'", "'comment'", "'target'", "'source'", "'State'", "'statemachines'", "'{'", "'}'", "'invariants'", "'Initial'", "'internalId'", "'Final'", "'Any'", "'Junction'", "'Fork'", "'Invariant'", "'@'", "'theorem'", "'predicate'"
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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:67:1: entryRuleStatemachine returns [EObject current=null] : iv_ruleStatemachine= ruleStatemachine EOF ;
    public final EObject entryRuleStatemachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatemachine = null;


        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:68:2: (iv_ruleStatemachine= ruleStatemachine EOF )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:69:2: iv_ruleStatemachine= ruleStatemachine EOF
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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:76:1: ruleStatemachine returns [EObject current=null] : (otherlv_0= 'Statemachine' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'elaborates' ( ( ruleEString ) ) )? (otherlv_4= 'refines' ( ( ruleEString ) ) )? (otherlv_6= 'nodes' ( (lv_nodes_7_0= ruleAbstractNode ) ) (otherlv_8= ',' ( (lv_nodes_9_0= ruleAbstractNode ) ) )* )? (otherlv_10= 'transitions' ( (lv_transitions_11_0= ruleTransition ) ) (otherlv_12= ',' ( (lv_transitions_13_0= ruleTransition ) ) )* )? ) ;
    public final EObject ruleStatemachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_nodes_7_0 = null;

        EObject lv_nodes_9_0 = null;

        EObject lv_transitions_11_0 = null;

        EObject lv_transitions_13_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:79:28: ( (otherlv_0= 'Statemachine' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'elaborates' ( ( ruleEString ) ) )? (otherlv_4= 'refines' ( ( ruleEString ) ) )? (otherlv_6= 'nodes' ( (lv_nodes_7_0= ruleAbstractNode ) ) (otherlv_8= ',' ( (lv_nodes_9_0= ruleAbstractNode ) ) )* )? (otherlv_10= 'transitions' ( (lv_transitions_11_0= ruleTransition ) ) (otherlv_12= ',' ( (lv_transitions_13_0= ruleTransition ) ) )* )? ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:80:1: (otherlv_0= 'Statemachine' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'elaborates' ( ( ruleEString ) ) )? (otherlv_4= 'refines' ( ( ruleEString ) ) )? (otherlv_6= 'nodes' ( (lv_nodes_7_0= ruleAbstractNode ) ) (otherlv_8= ',' ( (lv_nodes_9_0= ruleAbstractNode ) ) )* )? (otherlv_10= 'transitions' ( (lv_transitions_11_0= ruleTransition ) ) (otherlv_12= ',' ( (lv_transitions_13_0= ruleTransition ) ) )* )? )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:80:1: (otherlv_0= 'Statemachine' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'elaborates' ( ( ruleEString ) ) )? (otherlv_4= 'refines' ( ( ruleEString ) ) )? (otherlv_6= 'nodes' ( (lv_nodes_7_0= ruleAbstractNode ) ) (otherlv_8= ',' ( (lv_nodes_9_0= ruleAbstractNode ) ) )* )? (otherlv_10= 'transitions' ( (lv_transitions_11_0= ruleTransition ) ) (otherlv_12= ',' ( (lv_transitions_13_0= ruleTransition ) ) )* )? )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:80:3: otherlv_0= 'Statemachine' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'elaborates' ( ( ruleEString ) ) )? (otherlv_4= 'refines' ( ( ruleEString ) ) )? (otherlv_6= 'nodes' ( (lv_nodes_7_0= ruleAbstractNode ) ) (otherlv_8= ',' ( (lv_nodes_9_0= ruleAbstractNode ) ) )* )? (otherlv_10= 'transitions' ( (lv_transitions_11_0= ruleTransition ) ) (otherlv_12= ',' ( (lv_transitions_13_0= ruleTransition ) ) )* )?
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleStatemachine122); 

                	newLeafNode(otherlv_0, grammarAccess.getStatemachineAccess().getStatemachineKeyword_0());
                
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:84:1: ( (lv_name_1_0= ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:85:1: (lv_name_1_0= ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:85:1: (lv_name_1_0= ruleEString )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:86:3: lv_name_1_0= ruleEString
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

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:102:2: (otherlv_2= 'elaborates' ( ( ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:102:4: otherlv_2= 'elaborates' ( ( ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleStatemachine156); 

                        	newLeafNode(otherlv_2, grammarAccess.getStatemachineAccess().getElaboratesKeyword_2_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:106:1: ( ( ruleEString ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:107:1: ( ruleEString )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:107:1: ( ruleEString )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:108:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStatemachineRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getStatemachineAccess().getElaboratesEventBNamedCrossReference_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStatemachine179);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:121:4: (otherlv_4= 'refines' ( ( ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:121:6: otherlv_4= 'refines' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleStatemachine194); 

                        	newLeafNode(otherlv_4, grammarAccess.getStatemachineAccess().getRefinesKeyword_3_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:125:1: ( ( ruleEString ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:126:1: ( ruleEString )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:126:1: ( ruleEString )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:127:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStatemachineRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getStatemachineAccess().getRefinesStatemachineCrossReference_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStatemachine217);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:140:4: (otherlv_6= 'nodes' ( (lv_nodes_7_0= ruleAbstractNode ) ) (otherlv_8= ',' ( (lv_nodes_9_0= ruleAbstractNode ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:140:6: otherlv_6= 'nodes' ( (lv_nodes_7_0= ruleAbstractNode ) ) (otherlv_8= ',' ( (lv_nodes_9_0= ruleAbstractNode ) ) )*
                    {
                    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleStatemachine232); 

                        	newLeafNode(otherlv_6, grammarAccess.getStatemachineAccess().getNodesKeyword_4_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:144:1: ( (lv_nodes_7_0= ruleAbstractNode ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:145:1: (lv_nodes_7_0= ruleAbstractNode )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:145:1: (lv_nodes_7_0= ruleAbstractNode )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:146:3: lv_nodes_7_0= ruleAbstractNode
                    {
                     
                    	        newCompositeNode(grammarAccess.getStatemachineAccess().getNodesAbstractNodeParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractNode_in_ruleStatemachine253);
                    lv_nodes_7_0=ruleAbstractNode();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStatemachineRule());
                    	        }
                           		add(
                           			current, 
                           			"nodes",
                            		lv_nodes_7_0, 
                            		"AbstractNode");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:162:2: (otherlv_8= ',' ( (lv_nodes_9_0= ruleAbstractNode ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==15) ) {
                            int LA3_2 = input.LA(2);

                            if ( (LA3_2==22||LA3_2==27||(LA3_2>=29 && LA3_2<=32)) ) {
                                alt3=1;
                            }


                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:162:4: otherlv_8= ',' ( (lv_nodes_9_0= ruleAbstractNode ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleStatemachine266); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getStatemachineAccess().getCommaKeyword_4_2_0());
                    	        
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:166:1: ( (lv_nodes_9_0= ruleAbstractNode ) )
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:167:1: (lv_nodes_9_0= ruleAbstractNode )
                    	    {
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:167:1: (lv_nodes_9_0= ruleAbstractNode )
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:168:3: lv_nodes_9_0= ruleAbstractNode
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStatemachineAccess().getNodesAbstractNodeParserRuleCall_4_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractNode_in_ruleStatemachine287);
                    	    lv_nodes_9_0=ruleAbstractNode();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStatemachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"nodes",
                    	            		lv_nodes_9_0, 
                    	            		"AbstractNode");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:184:6: (otherlv_10= 'transitions' ( (lv_transitions_11_0= ruleTransition ) ) (otherlv_12= ',' ( (lv_transitions_13_0= ruleTransition ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:184:8: otherlv_10= 'transitions' ( (lv_transitions_11_0= ruleTransition ) ) (otherlv_12= ',' ( (lv_transitions_13_0= ruleTransition ) ) )*
                    {
                    otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleStatemachine304); 

                        	newLeafNode(otherlv_10, grammarAccess.getStatemachineAccess().getTransitionsKeyword_5_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:188:1: ( (lv_transitions_11_0= ruleTransition ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:189:1: (lv_transitions_11_0= ruleTransition )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:189:1: (lv_transitions_11_0= ruleTransition )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:190:3: lv_transitions_11_0= ruleTransition
                    {
                     
                    	        newCompositeNode(grammarAccess.getStatemachineAccess().getTransitionsTransitionParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTransition_in_ruleStatemachine325);
                    lv_transitions_11_0=ruleTransition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStatemachineRule());
                    	        }
                           		add(
                           			current, 
                           			"transitions",
                            		lv_transitions_11_0, 
                            		"Transition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:206:2: (otherlv_12= ',' ( (lv_transitions_13_0= ruleTransition ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==15) ) {
                            int LA5_2 = input.LA(2);

                            if ( ((LA5_2>=17 && LA5_2<=18)) ) {
                                alt5=1;
                            }


                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:206:4: otherlv_12= ',' ( (lv_transitions_13_0= ruleTransition ) )
                    	    {
                    	    otherlv_12=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleStatemachine338); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getStatemachineAccess().getCommaKeyword_5_2_0());
                    	        
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:210:1: ( (lv_transitions_13_0= ruleTransition ) )
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:211:1: (lv_transitions_13_0= ruleTransition )
                    	    {
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:211:1: (lv_transitions_13_0= ruleTransition )
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:212:3: lv_transitions_13_0= ruleTransition
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStatemachineAccess().getTransitionsTransitionParserRuleCall_5_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTransition_in_ruleStatemachine359);
                    	    lv_transitions_13_0=ruleTransition();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStatemachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"transitions",
                    	            		lv_transitions_13_0, 
                    	            		"Transition");
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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:236:1: entryRuleAbstractNode returns [EObject current=null] : iv_ruleAbstractNode= ruleAbstractNode EOF ;
    public final EObject entryRuleAbstractNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractNode = null;


        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:237:2: (iv_ruleAbstractNode= ruleAbstractNode EOF )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:238:2: iv_ruleAbstractNode= ruleAbstractNode EOF
            {
             newCompositeNode(grammarAccess.getAbstractNodeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractNode_in_entryRuleAbstractNode399);
            iv_ruleAbstractNode=ruleAbstractNode();

            state._fsp--;

             current =iv_ruleAbstractNode; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractNode409); 

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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:245:1: ruleAbstractNode returns [EObject current=null] : (this_State_0= ruleState | this_Initial_1= ruleInitial | this_Final_2= ruleFinal | this_Any_3= ruleAny | this_Junction_4= ruleJunction | this_Fork_5= ruleFork ) ;
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
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:248:28: ( (this_State_0= ruleState | this_Initial_1= ruleInitial | this_Final_2= ruleFinal | this_Any_3= ruleAny | this_Junction_4= ruleJunction | this_Fork_5= ruleFork ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:249:1: (this_State_0= ruleState | this_Initial_1= ruleInitial | this_Final_2= ruleFinal | this_Any_3= ruleAny | this_Junction_4= ruleJunction | this_Fork_5= ruleFork )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:249:1: (this_State_0= ruleState | this_Initial_1= ruleInitial | this_Final_2= ruleFinal | this_Any_3= ruleAny | this_Junction_4= ruleJunction | this_Fork_5= ruleFork )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt7=1;
                }
                break;
            case 27:
                {
                alt7=2;
                }
                break;
            case 29:
                {
                alt7=3;
                }
                break;
            case 30:
                {
                alt7=4;
                }
                break;
            case 31:
                {
                alt7=5;
                }
                break;
            case 32:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:250:5: this_State_0= ruleState
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNodeAccess().getStateParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleState_in_ruleAbstractNode456);
                    this_State_0=ruleState();

                    state._fsp--;

                     
                            current = this_State_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:260:5: this_Initial_1= ruleInitial
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNodeAccess().getInitialParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInitial_in_ruleAbstractNode483);
                    this_Initial_1=ruleInitial();

                    state._fsp--;

                     
                            current = this_Initial_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:270:5: this_Final_2= ruleFinal
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNodeAccess().getFinalParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFinal_in_ruleAbstractNode510);
                    this_Final_2=ruleFinal();

                    state._fsp--;

                     
                            current = this_Final_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:280:5: this_Any_3= ruleAny
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNodeAccess().getAnyParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAny_in_ruleAbstractNode537);
                    this_Any_3=ruleAny();

                    state._fsp--;

                     
                            current = this_Any_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:290:5: this_Junction_4= ruleJunction
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNodeAccess().getJunctionParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleJunction_in_ruleAbstractNode564);
                    this_Junction_4=ruleJunction();

                    state._fsp--;

                     
                            current = this_Junction_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:300:5: this_Fork_5= ruleFork
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNodeAccess().getForkParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFork_in_ruleAbstractNode591);
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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:318:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:319:2: (iv_ruleEString= ruleEString EOF )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:320:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString629);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString640); 

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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:327:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:330:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:331:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:331:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:331:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString680); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:339:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString706); 

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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:354:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:355:2: (iv_ruleTransition= ruleTransition EOF )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:356:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransition_in_entryRuleTransition751);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransition761); 

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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:363:1: ruleTransition returns [EObject current=null] : ( () ( (lv_extended_1_0= 'extended' ) )? otherlv_2= 'Transition' (otherlv_3= 'comment' ( (lv_comment_4_0= ruleEString ) ) )? (otherlv_5= 'elaborates' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'target' ( ( ruleEString ) ) )? (otherlv_11= 'source' ( ( ruleEString ) ) )? ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token lv_extended_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_comment_4_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:366:28: ( ( () ( (lv_extended_1_0= 'extended' ) )? otherlv_2= 'Transition' (otherlv_3= 'comment' ( (lv_comment_4_0= ruleEString ) ) )? (otherlv_5= 'elaborates' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'target' ( ( ruleEString ) ) )? (otherlv_11= 'source' ( ( ruleEString ) ) )? ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:367:1: ( () ( (lv_extended_1_0= 'extended' ) )? otherlv_2= 'Transition' (otherlv_3= 'comment' ( (lv_comment_4_0= ruleEString ) ) )? (otherlv_5= 'elaborates' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'target' ( ( ruleEString ) ) )? (otherlv_11= 'source' ( ( ruleEString ) ) )? )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:367:1: ( () ( (lv_extended_1_0= 'extended' ) )? otherlv_2= 'Transition' (otherlv_3= 'comment' ( (lv_comment_4_0= ruleEString ) ) )? (otherlv_5= 'elaborates' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'target' ( ( ruleEString ) ) )? (otherlv_11= 'source' ( ( ruleEString ) ) )? )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:367:2: () ( (lv_extended_1_0= 'extended' ) )? otherlv_2= 'Transition' (otherlv_3= 'comment' ( (lv_comment_4_0= ruleEString ) ) )? (otherlv_5= 'elaborates' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'target' ( ( ruleEString ) ) )? (otherlv_11= 'source' ( ( ruleEString ) ) )?
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:367:2: ()
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:368:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTransitionAccess().getTransitionAction_0(),
                        current);
                

            }

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:373:2: ( (lv_extended_1_0= 'extended' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:374:1: (lv_extended_1_0= 'extended' )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:374:1: (lv_extended_1_0= 'extended' )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:375:3: lv_extended_1_0= 'extended'
                    {
                    lv_extended_1_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleTransition813); 

                            newLeafNode(lv_extended_1_0, grammarAccess.getTransitionAccess().getExtendedExtendedKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                           		setWithLastConsumed(current, "extended", true, "extended");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleTransition839); 

                	newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getTransitionKeyword_2());
                
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:392:1: (otherlv_3= 'comment' ( (lv_comment_4_0= ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:392:3: otherlv_3= 'comment' ( (lv_comment_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleTransition852); 

                        	newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getCommentKeyword_3_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:396:1: ( (lv_comment_4_0= ruleEString ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:397:1: (lv_comment_4_0= ruleEString )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:397:1: (lv_comment_4_0= ruleEString )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:398:3: lv_comment_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getTransitionAccess().getCommentEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransition873);
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

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:414:4: (otherlv_5= 'elaborates' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==12) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:414:6: otherlv_5= 'elaborates' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTransition888); 

                        	newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getElaboratesKeyword_4_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:418:1: ( ( ruleEString ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:419:1: ( ruleEString )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:419:1: ( ruleEString )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:420:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getTransitionAccess().getElaboratesEventCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransition911);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:433:2: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==15) ) {
                            int LA11_2 = input.LA(2);

                            if ( ((LA11_2>=RULE_STRING && LA11_2<=RULE_ID)) ) {
                                alt11=1;
                            }


                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:433:4: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTransition924); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getCommaKeyword_4_2_0());
                    	        
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:437:1: ( ( ruleEString ) )
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:438:1: ( ruleEString )
                    	    {
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:438:1: ( ruleEString )
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:439:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getTransitionAccess().getElaboratesEventCrossReference_4_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransition947);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


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

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:452:6: (otherlv_9= 'target' ( ( ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:452:8: otherlv_9= 'target' ( ( ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleTransition964); 

                        	newLeafNode(otherlv_9, grammarAccess.getTransitionAccess().getTargetKeyword_5_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:456:1: ( ( ruleEString ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:457:1: ( ruleEString )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:457:1: ( ruleEString )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:458:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getTransitionAccess().getTargetAbstractNodeCrossReference_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransition987);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:471:4: (otherlv_11= 'source' ( ( ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:471:6: otherlv_11= 'source' ( ( ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleTransition1002); 

                        	newLeafNode(otherlv_11, grammarAccess.getTransitionAccess().getSourceKeyword_6_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:475:1: ( ( ruleEString ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:476:1: ( ruleEString )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:476:1: ( ruleEString )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:477:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getTransitionAccess().getSourceAbstractNodeCrossReference_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransition1025);
                    ruleEString();

                    state._fsp--;

                     
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
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleState"
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:500:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:501:2: (iv_ruleState= ruleState EOF )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:502:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleState_in_entryRuleState1065);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleState1075); 

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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:509:1: ruleState returns [EObject current=null] : ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'statemachines' otherlv_4= '{' ( (lv_statemachines_5_0= ruleStatemachine ) ) (otherlv_6= ',' ( (lv_statemachines_7_0= ruleStatemachine ) ) )* otherlv_8= '}' )? (otherlv_9= 'invariants' otherlv_10= '{' ( (lv_invariants_11_0= ruleInvariant ) ) (otherlv_12= ',' ( (lv_invariants_13_0= ruleInvariant ) ) )* otherlv_14= '}' )? ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_statemachines_5_0 = null;

        EObject lv_statemachines_7_0 = null;

        EObject lv_invariants_11_0 = null;

        EObject lv_invariants_13_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:512:28: ( ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'statemachines' otherlv_4= '{' ( (lv_statemachines_5_0= ruleStatemachine ) ) (otherlv_6= ',' ( (lv_statemachines_7_0= ruleStatemachine ) ) )* otherlv_8= '}' )? (otherlv_9= 'invariants' otherlv_10= '{' ( (lv_invariants_11_0= ruleInvariant ) ) (otherlv_12= ',' ( (lv_invariants_13_0= ruleInvariant ) ) )* otherlv_14= '}' )? ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:513:1: ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'statemachines' otherlv_4= '{' ( (lv_statemachines_5_0= ruleStatemachine ) ) (otherlv_6= ',' ( (lv_statemachines_7_0= ruleStatemachine ) ) )* otherlv_8= '}' )? (otherlv_9= 'invariants' otherlv_10= '{' ( (lv_invariants_11_0= ruleInvariant ) ) (otherlv_12= ',' ( (lv_invariants_13_0= ruleInvariant ) ) )* otherlv_14= '}' )? )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:513:1: ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'statemachines' otherlv_4= '{' ( (lv_statemachines_5_0= ruleStatemachine ) ) (otherlv_6= ',' ( (lv_statemachines_7_0= ruleStatemachine ) ) )* otherlv_8= '}' )? (otherlv_9= 'invariants' otherlv_10= '{' ( (lv_invariants_11_0= ruleInvariant ) ) (otherlv_12= ',' ( (lv_invariants_13_0= ruleInvariant ) ) )* otherlv_14= '}' )? )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:513:2: () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'statemachines' otherlv_4= '{' ( (lv_statemachines_5_0= ruleStatemachine ) ) (otherlv_6= ',' ( (lv_statemachines_7_0= ruleStatemachine ) ) )* otherlv_8= '}' )? (otherlv_9= 'invariants' otherlv_10= '{' ( (lv_invariants_11_0= ruleInvariant ) ) (otherlv_12= ',' ( (lv_invariants_13_0= ruleInvariant ) ) )* otherlv_14= '}' )?
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:513:2: ()
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:514:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStateAccess().getStateAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleState1121); 

                	newLeafNode(otherlv_1, grammarAccess.getStateAccess().getStateKeyword_1());
                
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:523:1: ( (lv_name_2_0= ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:524:1: (lv_name_2_0= ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:524:1: (lv_name_2_0= ruleEString )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:525:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleState1142);
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

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:541:2: (otherlv_3= 'statemachines' otherlv_4= '{' ( (lv_statemachines_5_0= ruleStatemachine ) ) (otherlv_6= ',' ( (lv_statemachines_7_0= ruleStatemachine ) ) )* otherlv_8= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:541:4: otherlv_3= 'statemachines' otherlv_4= '{' ( (lv_statemachines_5_0= ruleStatemachine ) ) (otherlv_6= ',' ( (lv_statemachines_7_0= ruleStatemachine ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleState1155); 

                        	newLeafNode(otherlv_3, grammarAccess.getStateAccess().getStatemachinesKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleState1167); 

                        	newLeafNode(otherlv_4, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:549:1: ( (lv_statemachines_5_0= ruleStatemachine ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:550:1: (lv_statemachines_5_0= ruleStatemachine )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:550:1: (lv_statemachines_5_0= ruleStatemachine )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:551:3: lv_statemachines_5_0= ruleStatemachine
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateAccess().getStatemachinesStatemachineParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStatemachine_in_ruleState1188);
                    lv_statemachines_5_0=ruleStatemachine();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStateRule());
                    	        }
                           		add(
                           			current, 
                           			"statemachines",
                            		lv_statemachines_5_0, 
                            		"Statemachine");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:567:2: (otherlv_6= ',' ( (lv_statemachines_7_0= ruleStatemachine ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==15) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:567:4: otherlv_6= ',' ( (lv_statemachines_7_0= ruleStatemachine ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleState1201); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getStateAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:571:1: ( (lv_statemachines_7_0= ruleStatemachine ) )
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:572:1: (lv_statemachines_7_0= ruleStatemachine )
                    	    {
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:572:1: (lv_statemachines_7_0= ruleStatemachine )
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:573:3: lv_statemachines_7_0= ruleStatemachine
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStateAccess().getStatemachinesStatemachineParserRuleCall_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleStatemachine_in_ruleState1222);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleState1236); 

                        	newLeafNode(otherlv_8, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_3_4());
                        

                    }
                    break;

            }

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:593:3: (otherlv_9= 'invariants' otherlv_10= '{' ( (lv_invariants_11_0= ruleInvariant ) ) (otherlv_12= ',' ( (lv_invariants_13_0= ruleInvariant ) ) )* otherlv_14= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:593:5: otherlv_9= 'invariants' otherlv_10= '{' ( (lv_invariants_11_0= ruleInvariant ) ) (otherlv_12= ',' ( (lv_invariants_13_0= ruleInvariant ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleState1251); 

                        	newLeafNode(otherlv_9, grammarAccess.getStateAccess().getInvariantsKeyword_4_0());
                        
                    otherlv_10=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleState1263); 

                        	newLeafNode(otherlv_10, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:601:1: ( (lv_invariants_11_0= ruleInvariant ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:602:1: (lv_invariants_11_0= ruleInvariant )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:602:1: (lv_invariants_11_0= ruleInvariant )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:603:3: lv_invariants_11_0= ruleInvariant
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateAccess().getInvariantsInvariantParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInvariant_in_ruleState1284);
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

                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:619:2: (otherlv_12= ',' ( (lv_invariants_13_0= ruleInvariant ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==15) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:619:4: otherlv_12= ',' ( (lv_invariants_13_0= ruleInvariant ) )
                    	    {
                    	    otherlv_12=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleState1297); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getStateAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:623:1: ( (lv_invariants_13_0= ruleInvariant ) )
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:624:1: (lv_invariants_13_0= ruleInvariant )
                    	    {
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:624:1: (lv_invariants_13_0= ruleInvariant )
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:625:3: lv_invariants_13_0= ruleInvariant
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStateAccess().getInvariantsInvariantParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInvariant_in_ruleState1318);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleState1332); 

                        	newLeafNode(otherlv_14, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_4_4());
                        

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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:653:1: entryRuleInitial returns [EObject current=null] : iv_ruleInitial= ruleInitial EOF ;
    public final EObject entryRuleInitial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitial = null;


        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:654:2: (iv_ruleInitial= ruleInitial EOF )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:655:2: iv_ruleInitial= ruleInitial EOF
            {
             newCompositeNode(grammarAccess.getInitialRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInitial_in_entryRuleInitial1370);
            iv_ruleInitial=ruleInitial();

            state._fsp--;

             current =iv_ruleInitial; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInitial1380); 

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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:662:1: ruleInitial returns [EObject current=null] : ( () otherlv_1= 'Initial' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleInitial() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_internalId_3_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:665:28: ( ( () otherlv_1= 'Initial' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:666:1: ( () otherlv_1= 'Initial' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:666:1: ( () otherlv_1= 'Initial' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:666:2: () otherlv_1= 'Initial' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:666:2: ()
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:667:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInitialAccess().getInitialAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleInitial1426); 

                	newLeafNode(otherlv_1, grammarAccess.getInitialAccess().getInitialKeyword_1());
                
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:676:1: (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==28) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:676:3: otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleInitial1439); 

                        	newLeafNode(otherlv_2, grammarAccess.getInitialAccess().getInternalIdKeyword_2_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:680:1: ( (lv_internalId_3_0= ruleEString ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:681:1: (lv_internalId_3_0= ruleEString )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:681:1: (lv_internalId_3_0= ruleEString )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:682:3: lv_internalId_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInitialAccess().getInternalIdEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInitial1460);
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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:706:1: entryRuleFinal returns [EObject current=null] : iv_ruleFinal= ruleFinal EOF ;
    public final EObject entryRuleFinal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFinal = null;


        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:707:2: (iv_ruleFinal= ruleFinal EOF )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:708:2: iv_ruleFinal= ruleFinal EOF
            {
             newCompositeNode(grammarAccess.getFinalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFinal_in_entryRuleFinal1498);
            iv_ruleFinal=ruleFinal();

            state._fsp--;

             current =iv_ruleFinal; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFinal1508); 

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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:715:1: ruleFinal returns [EObject current=null] : ( () otherlv_1= 'Final' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleFinal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_internalId_3_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:718:28: ( ( () otherlv_1= 'Final' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:719:1: ( () otherlv_1= 'Final' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:719:1: ( () otherlv_1= 'Final' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:719:2: () otherlv_1= 'Final' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:719:2: ()
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:720:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFinalAccess().getFinalAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleFinal1554); 

                	newLeafNode(otherlv_1, grammarAccess.getFinalAccess().getFinalKeyword_1());
                
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:729:1: (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:729:3: otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleFinal1567); 

                        	newLeafNode(otherlv_2, grammarAccess.getFinalAccess().getInternalIdKeyword_2_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:733:1: ( (lv_internalId_3_0= ruleEString ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:734:1: (lv_internalId_3_0= ruleEString )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:734:1: (lv_internalId_3_0= ruleEString )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:735:3: lv_internalId_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getFinalAccess().getInternalIdEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFinal1588);
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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:759:1: entryRuleAny returns [EObject current=null] : iv_ruleAny= ruleAny EOF ;
    public final EObject entryRuleAny() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAny = null;


        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:760:2: (iv_ruleAny= ruleAny EOF )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:761:2: iv_ruleAny= ruleAny EOF
            {
             newCompositeNode(grammarAccess.getAnyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAny_in_entryRuleAny1626);
            iv_ruleAny=ruleAny();

            state._fsp--;

             current =iv_ruleAny; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAny1636); 

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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:768:1: ruleAny returns [EObject current=null] : ( () otherlv_1= 'Any' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleAny() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_internalId_3_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:771:28: ( ( () otherlv_1= 'Any' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:772:1: ( () otherlv_1= 'Any' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:772:1: ( () otherlv_1= 'Any' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:772:2: () otherlv_1= 'Any' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:772:2: ()
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:773:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAnyAccess().getAnyAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleAny1682); 

                	newLeafNode(otherlv_1, grammarAccess.getAnyAccess().getAnyKeyword_1());
                
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:782:1: (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==28) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:782:3: otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleAny1695); 

                        	newLeafNode(otherlv_2, grammarAccess.getAnyAccess().getInternalIdKeyword_2_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:786:1: ( (lv_internalId_3_0= ruleEString ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:787:1: (lv_internalId_3_0= ruleEString )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:787:1: (lv_internalId_3_0= ruleEString )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:788:3: lv_internalId_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnyAccess().getInternalIdEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAny1716);
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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:812:1: entryRuleJunction returns [EObject current=null] : iv_ruleJunction= ruleJunction EOF ;
    public final EObject entryRuleJunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJunction = null;


        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:813:2: (iv_ruleJunction= ruleJunction EOF )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:814:2: iv_ruleJunction= ruleJunction EOF
            {
             newCompositeNode(grammarAccess.getJunctionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleJunction_in_entryRuleJunction1754);
            iv_ruleJunction=ruleJunction();

            state._fsp--;

             current =iv_ruleJunction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleJunction1764); 

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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:821:1: ruleJunction returns [EObject current=null] : ( () otherlv_1= 'Junction' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleJunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_internalId_3_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:824:28: ( ( () otherlv_1= 'Junction' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:825:1: ( () otherlv_1= 'Junction' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:825:1: ( () otherlv_1= 'Junction' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:825:2: () otherlv_1= 'Junction' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:825:2: ()
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:826:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getJunctionAccess().getJunctionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleJunction1810); 

                	newLeafNode(otherlv_1, grammarAccess.getJunctionAccess().getJunctionKeyword_1());
                
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:835:1: (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==28) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:835:3: otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleJunction1823); 

                        	newLeafNode(otherlv_2, grammarAccess.getJunctionAccess().getInternalIdKeyword_2_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:839:1: ( (lv_internalId_3_0= ruleEString ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:840:1: (lv_internalId_3_0= ruleEString )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:840:1: (lv_internalId_3_0= ruleEString )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:841:3: lv_internalId_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getJunctionAccess().getInternalIdEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleJunction1844);
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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:865:1: entryRuleFork returns [EObject current=null] : iv_ruleFork= ruleFork EOF ;
    public final EObject entryRuleFork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFork = null;


        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:866:2: (iv_ruleFork= ruleFork EOF )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:867:2: iv_ruleFork= ruleFork EOF
            {
             newCompositeNode(grammarAccess.getForkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFork_in_entryRuleFork1882);
            iv_ruleFork=ruleFork();

            state._fsp--;

             current =iv_ruleFork; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFork1892); 

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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:874:1: ruleFork returns [EObject current=null] : ( () otherlv_1= 'Fork' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleFork() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_internalId_3_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:877:28: ( ( () otherlv_1= 'Fork' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:878:1: ( () otherlv_1= 'Fork' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:878:1: ( () otherlv_1= 'Fork' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:878:2: () otherlv_1= 'Fork' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:878:2: ()
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:879:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getForkAccess().getForkAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleFork1938); 

                	newLeafNode(otherlv_1, grammarAccess.getForkAccess().getForkKeyword_1());
                
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:888:1: (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==28) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:888:3: otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleFork1951); 

                        	newLeafNode(otherlv_2, grammarAccess.getForkAccess().getInternalIdKeyword_2_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:892:1: ( (lv_internalId_3_0= ruleEString ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:893:1: (lv_internalId_3_0= ruleEString )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:893:1: (lv_internalId_3_0= ruleEString )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:894:3: lv_internalId_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getForkAccess().getInternalIdEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFork1972);
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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:918:1: entryRuleInvariant returns [EObject current=null] : iv_ruleInvariant= ruleInvariant EOF ;
    public final EObject entryRuleInvariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvariant = null;


        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:919:2: (iv_ruleInvariant= ruleInvariant EOF )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:920:2: iv_ruleInvariant= ruleInvariant EOF
            {
             newCompositeNode(grammarAccess.getInvariantRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInvariant_in_entryRuleInvariant2010);
            iv_ruleInvariant=ruleInvariant();

            state._fsp--;

             current =iv_ruleInvariant; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInvariant2020); 

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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:927:1: ruleInvariant returns [EObject current=null] : (otherlv_0= 'Invariant' otherlv_1= '@' ( (lv_name_2_0= ruleEString ) ) ( (lv_theorem_3_0= 'theorem' ) )? (otherlv_4= 'comment' ( (lv_comment_5_0= ruleEString ) ) )? otherlv_6= 'predicate' ( (lv_predicate_7_0= ruleEString ) ) ) ;
    public final EObject ruleInvariant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_theorem_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_comment_5_0 = null;

        AntlrDatatypeRuleToken lv_predicate_7_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:930:28: ( (otherlv_0= 'Invariant' otherlv_1= '@' ( (lv_name_2_0= ruleEString ) ) ( (lv_theorem_3_0= 'theorem' ) )? (otherlv_4= 'comment' ( (lv_comment_5_0= ruleEString ) ) )? otherlv_6= 'predicate' ( (lv_predicate_7_0= ruleEString ) ) ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:931:1: (otherlv_0= 'Invariant' otherlv_1= '@' ( (lv_name_2_0= ruleEString ) ) ( (lv_theorem_3_0= 'theorem' ) )? (otherlv_4= 'comment' ( (lv_comment_5_0= ruleEString ) ) )? otherlv_6= 'predicate' ( (lv_predicate_7_0= ruleEString ) ) )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:931:1: (otherlv_0= 'Invariant' otherlv_1= '@' ( (lv_name_2_0= ruleEString ) ) ( (lv_theorem_3_0= 'theorem' ) )? (otherlv_4= 'comment' ( (lv_comment_5_0= ruleEString ) ) )? otherlv_6= 'predicate' ( (lv_predicate_7_0= ruleEString ) ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:931:3: otherlv_0= 'Invariant' otherlv_1= '@' ( (lv_name_2_0= ruleEString ) ) ( (lv_theorem_3_0= 'theorem' ) )? (otherlv_4= 'comment' ( (lv_comment_5_0= ruleEString ) ) )? otherlv_6= 'predicate' ( (lv_predicate_7_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleInvariant2057); 

                	newLeafNode(otherlv_0, grammarAccess.getInvariantAccess().getInvariantKeyword_0());
                
            otherlv_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleInvariant2069); 

                	newLeafNode(otherlv_1, grammarAccess.getInvariantAccess().getCommercialAtKeyword_1());
                
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:939:1: ( (lv_name_2_0= ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:940:1: (lv_name_2_0= ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:940:1: (lv_name_2_0= ruleEString )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:941:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInvariantAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInvariant2090);
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

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:957:2: ( (lv_theorem_3_0= 'theorem' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==35) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:958:1: (lv_theorem_3_0= 'theorem' )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:958:1: (lv_theorem_3_0= 'theorem' )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:959:3: lv_theorem_3_0= 'theorem'
                    {
                    lv_theorem_3_0=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleInvariant2108); 

                            newLeafNode(lv_theorem_3_0, grammarAccess.getInvariantAccess().getTheoremTheoremKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInvariantRule());
                    	        }
                           		setWithLastConsumed(current, "theorem", true, "theorem");
                    	    

                    }


                    }
                    break;

            }

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:972:3: (otherlv_4= 'comment' ( (lv_comment_5_0= ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==19) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:972:5: otherlv_4= 'comment' ( (lv_comment_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleInvariant2135); 

                        	newLeafNode(otherlv_4, grammarAccess.getInvariantAccess().getCommentKeyword_4_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:976:1: ( (lv_comment_5_0= ruleEString ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:977:1: (lv_comment_5_0= ruleEString )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:977:1: (lv_comment_5_0= ruleEString )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:978:3: lv_comment_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInvariantAccess().getCommentEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInvariant2156);
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

            otherlv_6=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleInvariant2170); 

                	newLeafNode(otherlv_6, grammarAccess.getInvariantAccess().getPredicateKeyword_5());
                
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:998:1: ( (lv_predicate_7_0= ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:999:1: (lv_predicate_7_0= ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:999:1: (lv_predicate_7_0= ruleEString )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:1000:3: lv_predicate_7_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInvariantAccess().getPredicateEStringParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInvariant2191);
            lv_predicate_7_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInvariantRule());
            	        }
                   		set(
                   			current, 
                   			"predicate",
                    		lv_predicate_7_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


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

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleStatemachine_in_entryRuleStatemachine75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStatemachine85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleStatemachine122 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStatemachine143 = new BitSet(new long[]{0x0000000000017002L});
        public static final BitSet FOLLOW_12_in_ruleStatemachine156 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStatemachine179 = new BitSet(new long[]{0x0000000000016002L});
        public static final BitSet FOLLOW_13_in_ruleStatemachine194 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStatemachine217 = new BitSet(new long[]{0x0000000000014002L});
        public static final BitSet FOLLOW_14_in_ruleStatemachine232 = new BitSet(new long[]{0x00000001E8400000L});
        public static final BitSet FOLLOW_ruleAbstractNode_in_ruleStatemachine253 = new BitSet(new long[]{0x0000000000018002L});
        public static final BitSet FOLLOW_15_in_ruleStatemachine266 = new BitSet(new long[]{0x00000001E8400000L});
        public static final BitSet FOLLOW_ruleAbstractNode_in_ruleStatemachine287 = new BitSet(new long[]{0x0000000000018002L});
        public static final BitSet FOLLOW_16_in_ruleStatemachine304 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_ruleTransition_in_ruleStatemachine325 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_15_in_ruleStatemachine338 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_ruleTransition_in_ruleStatemachine359 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_ruleAbstractNode_in_entryRuleAbstractNode399 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractNode409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleState_in_ruleAbstractNode456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInitial_in_ruleAbstractNode483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFinal_in_ruleAbstractNode510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAny_in_ruleAbstractNode537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleJunction_in_ruleAbstractNode564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFork_in_ruleAbstractNode591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString629 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition751 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransition761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleTransition813 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleTransition839 = new BitSet(new long[]{0x0000000000381002L});
        public static final BitSet FOLLOW_19_in_ruleTransition852 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransition873 = new BitSet(new long[]{0x0000000000301002L});
        public static final BitSet FOLLOW_12_in_ruleTransition888 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransition911 = new BitSet(new long[]{0x0000000000308002L});
        public static final BitSet FOLLOW_15_in_ruleTransition924 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransition947 = new BitSet(new long[]{0x0000000000308002L});
        public static final BitSet FOLLOW_20_in_ruleTransition964 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransition987 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_21_in_ruleTransition1002 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransition1025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleState_in_entryRuleState1065 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleState1075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleState1121 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleState1142 = new BitSet(new long[]{0x0000000004800002L});
        public static final BitSet FOLLOW_23_in_ruleState1155 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleState1167 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_ruleStatemachine_in_ruleState1188 = new BitSet(new long[]{0x0000000002008000L});
        public static final BitSet FOLLOW_15_in_ruleState1201 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_ruleStatemachine_in_ruleState1222 = new BitSet(new long[]{0x0000000002008000L});
        public static final BitSet FOLLOW_25_in_ruleState1236 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleState1251 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleState1263 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_ruleInvariant_in_ruleState1284 = new BitSet(new long[]{0x0000000002008000L});
        public static final BitSet FOLLOW_15_in_ruleState1297 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_ruleInvariant_in_ruleState1318 = new BitSet(new long[]{0x0000000002008000L});
        public static final BitSet FOLLOW_25_in_ruleState1332 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInitial_in_entryRuleInitial1370 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInitial1380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleInitial1426 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_ruleInitial1439 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInitial1460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFinal_in_entryRuleFinal1498 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFinal1508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleFinal1554 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_ruleFinal1567 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFinal1588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAny_in_entryRuleAny1626 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAny1636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleAny1682 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_ruleAny1695 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAny1716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleJunction_in_entryRuleJunction1754 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleJunction1764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleJunction1810 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_ruleJunction1823 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleJunction1844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFork_in_entryRuleFork1882 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFork1892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleFork1938 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_ruleFork1951 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFork1972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvariant_in_entryRuleInvariant2010 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInvariant2020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleInvariant2057 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleInvariant2069 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInvariant2090 = new BitSet(new long[]{0x0000001800080000L});
        public static final BitSet FOLLOW_35_in_ruleInvariant2108 = new BitSet(new long[]{0x0000001000080000L});
        public static final BitSet FOLLOW_19_in_ruleInvariant2135 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInvariant2156 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleInvariant2170 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInvariant2191 = new BitSet(new long[]{0x0000000000000002L});
    }


}