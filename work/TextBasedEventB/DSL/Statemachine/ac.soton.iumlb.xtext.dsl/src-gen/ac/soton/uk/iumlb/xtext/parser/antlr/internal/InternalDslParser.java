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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:363:1: ruleTransition returns [EObject current=null] : ( ( (lv_extended_0_0= 'extended' ) )? otherlv_1= 'Transition' (otherlv_2= 'comment' ( (lv_comment_3_0= ruleEString ) ) )? (otherlv_4= 'elaborates' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )? otherlv_8= 'target' ( ( ruleEString ) ) otherlv_10= 'source' ( ( ruleEString ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token lv_extended_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_comment_3_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:366:28: ( ( ( (lv_extended_0_0= 'extended' ) )? otherlv_1= 'Transition' (otherlv_2= 'comment' ( (lv_comment_3_0= ruleEString ) ) )? (otherlv_4= 'elaborates' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )? otherlv_8= 'target' ( ( ruleEString ) ) otherlv_10= 'source' ( ( ruleEString ) ) ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:367:1: ( ( (lv_extended_0_0= 'extended' ) )? otherlv_1= 'Transition' (otherlv_2= 'comment' ( (lv_comment_3_0= ruleEString ) ) )? (otherlv_4= 'elaborates' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )? otherlv_8= 'target' ( ( ruleEString ) ) otherlv_10= 'source' ( ( ruleEString ) ) )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:367:1: ( ( (lv_extended_0_0= 'extended' ) )? otherlv_1= 'Transition' (otherlv_2= 'comment' ( (lv_comment_3_0= ruleEString ) ) )? (otherlv_4= 'elaborates' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )? otherlv_8= 'target' ( ( ruleEString ) ) otherlv_10= 'source' ( ( ruleEString ) ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:367:2: ( (lv_extended_0_0= 'extended' ) )? otherlv_1= 'Transition' (otherlv_2= 'comment' ( (lv_comment_3_0= ruleEString ) ) )? (otherlv_4= 'elaborates' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )? otherlv_8= 'target' ( ( ruleEString ) ) otherlv_10= 'source' ( ( ruleEString ) )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:367:2: ( (lv_extended_0_0= 'extended' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:368:1: (lv_extended_0_0= 'extended' )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:368:1: (lv_extended_0_0= 'extended' )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:369:3: lv_extended_0_0= 'extended'
                    {
                    lv_extended_0_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleTransition804); 

                            newLeafNode(lv_extended_0_0, grammarAccess.getTransitionAccess().getExtendedExtendedKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                           		setWithLastConsumed(current, "extended", true, "extended");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleTransition830); 

                	newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getTransitionKeyword_1());
                
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:386:1: (otherlv_2= 'comment' ( (lv_comment_3_0= ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:386:3: otherlv_2= 'comment' ( (lv_comment_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleTransition843); 

                        	newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getCommentKeyword_2_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:390:1: ( (lv_comment_3_0= ruleEString ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:391:1: (lv_comment_3_0= ruleEString )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:391:1: (lv_comment_3_0= ruleEString )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:392:3: lv_comment_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getTransitionAccess().getCommentEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransition864);
                    lv_comment_3_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTransitionRule());
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

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:408:4: (otherlv_4= 'elaborates' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==12) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:408:6: otherlv_4= 'elaborates' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTransition879); 

                        	newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getElaboratesKeyword_3_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:412:1: ( ( ruleEString ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:413:1: ( ruleEString )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:413:1: ( ruleEString )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:414:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getTransitionAccess().getElaboratesEventCrossReference_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransition902);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:427:2: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==15) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:427:4: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTransition915); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:431:1: ( ( ruleEString ) )
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:432:1: ( ruleEString )
                    	    {
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:432:1: ( ruleEString )
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:433:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getTransitionAccess().getElaboratesEventCrossReference_3_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransition938);
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

            otherlv_8=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleTransition954); 

                	newLeafNode(otherlv_8, grammarAccess.getTransitionAccess().getTargetKeyword_4());
                
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:450:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:451:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:451:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:452:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTransitionAccess().getTargetAbstractNodeCrossReference_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransition977);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_10=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleTransition989); 

                	newLeafNode(otherlv_10, grammarAccess.getTransitionAccess().getSourceKeyword_6());
                
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:469:1: ( ( ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:470:1: ( ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:470:1: ( ruleEString )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:471:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTransitionAccess().getSourceAbstractNodeCrossReference_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransition1012);
            ruleEString();

            state._fsp--;

             
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
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleState"
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:494:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:495:2: (iv_ruleState= ruleState EOF )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:496:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleState_in_entryRuleState1050);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleState1060); 

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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:503:1: ruleState returns [EObject current=null] : ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'statemachines' otherlv_4= '{' ( (lv_statemachines_5_0= ruleStatemachine ) ) (otherlv_6= ',' ( (lv_statemachines_7_0= ruleStatemachine ) ) )* otherlv_8= '}' )? (otherlv_9= 'invariants' otherlv_10= '{' ( (lv_invariants_11_0= ruleInvariant ) ) (otherlv_12= ',' ( (lv_invariants_13_0= ruleInvariant ) ) )* otherlv_14= '}' )? ) ;
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
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:506:28: ( ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'statemachines' otherlv_4= '{' ( (lv_statemachines_5_0= ruleStatemachine ) ) (otherlv_6= ',' ( (lv_statemachines_7_0= ruleStatemachine ) ) )* otherlv_8= '}' )? (otherlv_9= 'invariants' otherlv_10= '{' ( (lv_invariants_11_0= ruleInvariant ) ) (otherlv_12= ',' ( (lv_invariants_13_0= ruleInvariant ) ) )* otherlv_14= '}' )? ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:507:1: ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'statemachines' otherlv_4= '{' ( (lv_statemachines_5_0= ruleStatemachine ) ) (otherlv_6= ',' ( (lv_statemachines_7_0= ruleStatemachine ) ) )* otherlv_8= '}' )? (otherlv_9= 'invariants' otherlv_10= '{' ( (lv_invariants_11_0= ruleInvariant ) ) (otherlv_12= ',' ( (lv_invariants_13_0= ruleInvariant ) ) )* otherlv_14= '}' )? )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:507:1: ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'statemachines' otherlv_4= '{' ( (lv_statemachines_5_0= ruleStatemachine ) ) (otherlv_6= ',' ( (lv_statemachines_7_0= ruleStatemachine ) ) )* otherlv_8= '}' )? (otherlv_9= 'invariants' otherlv_10= '{' ( (lv_invariants_11_0= ruleInvariant ) ) (otherlv_12= ',' ( (lv_invariants_13_0= ruleInvariant ) ) )* otherlv_14= '}' )? )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:507:2: () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'statemachines' otherlv_4= '{' ( (lv_statemachines_5_0= ruleStatemachine ) ) (otherlv_6= ',' ( (lv_statemachines_7_0= ruleStatemachine ) ) )* otherlv_8= '}' )? (otherlv_9= 'invariants' otherlv_10= '{' ( (lv_invariants_11_0= ruleInvariant ) ) (otherlv_12= ',' ( (lv_invariants_13_0= ruleInvariant ) ) )* otherlv_14= '}' )?
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:507:2: ()
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:508:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStateAccess().getStateAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleState1106); 

                	newLeafNode(otherlv_1, grammarAccess.getStateAccess().getStateKeyword_1());
                
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:517:1: ( (lv_name_2_0= ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:518:1: (lv_name_2_0= ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:518:1: (lv_name_2_0= ruleEString )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:519:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleState1127);
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

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:535:2: (otherlv_3= 'statemachines' otherlv_4= '{' ( (lv_statemachines_5_0= ruleStatemachine ) ) (otherlv_6= ',' ( (lv_statemachines_7_0= ruleStatemachine ) ) )* otherlv_8= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:535:4: otherlv_3= 'statemachines' otherlv_4= '{' ( (lv_statemachines_5_0= ruleStatemachine ) ) (otherlv_6= ',' ( (lv_statemachines_7_0= ruleStatemachine ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleState1140); 

                        	newLeafNode(otherlv_3, grammarAccess.getStateAccess().getStatemachinesKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleState1152); 

                        	newLeafNode(otherlv_4, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:543:1: ( (lv_statemachines_5_0= ruleStatemachine ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:544:1: (lv_statemachines_5_0= ruleStatemachine )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:544:1: (lv_statemachines_5_0= ruleStatemachine )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:545:3: lv_statemachines_5_0= ruleStatemachine
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateAccess().getStatemachinesStatemachineParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStatemachine_in_ruleState1173);
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

                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:561:2: (otherlv_6= ',' ( (lv_statemachines_7_0= ruleStatemachine ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==15) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:561:4: otherlv_6= ',' ( (lv_statemachines_7_0= ruleStatemachine ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleState1186); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getStateAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:565:1: ( (lv_statemachines_7_0= ruleStatemachine ) )
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:566:1: (lv_statemachines_7_0= ruleStatemachine )
                    	    {
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:566:1: (lv_statemachines_7_0= ruleStatemachine )
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:567:3: lv_statemachines_7_0= ruleStatemachine
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStateAccess().getStatemachinesStatemachineParserRuleCall_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleStatemachine_in_ruleState1207);
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
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleState1221); 

                        	newLeafNode(otherlv_8, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_3_4());
                        

                    }
                    break;

            }

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:587:3: (otherlv_9= 'invariants' otherlv_10= '{' ( (lv_invariants_11_0= ruleInvariant ) ) (otherlv_12= ',' ( (lv_invariants_13_0= ruleInvariant ) ) )* otherlv_14= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:587:5: otherlv_9= 'invariants' otherlv_10= '{' ( (lv_invariants_11_0= ruleInvariant ) ) (otherlv_12= ',' ( (lv_invariants_13_0= ruleInvariant ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleState1236); 

                        	newLeafNode(otherlv_9, grammarAccess.getStateAccess().getInvariantsKeyword_4_0());
                        
                    otherlv_10=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleState1248); 

                        	newLeafNode(otherlv_10, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:595:1: ( (lv_invariants_11_0= ruleInvariant ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:596:1: (lv_invariants_11_0= ruleInvariant )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:596:1: (lv_invariants_11_0= ruleInvariant )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:597:3: lv_invariants_11_0= ruleInvariant
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateAccess().getInvariantsInvariantParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInvariant_in_ruleState1269);
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

                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:613:2: (otherlv_12= ',' ( (lv_invariants_13_0= ruleInvariant ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==15) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:613:4: otherlv_12= ',' ( (lv_invariants_13_0= ruleInvariant ) )
                    	    {
                    	    otherlv_12=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleState1282); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getStateAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:617:1: ( (lv_invariants_13_0= ruleInvariant ) )
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:618:1: (lv_invariants_13_0= ruleInvariant )
                    	    {
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:618:1: (lv_invariants_13_0= ruleInvariant )
                    	    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:619:3: lv_invariants_13_0= ruleInvariant
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStateAccess().getInvariantsInvariantParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInvariant_in_ruleState1303);
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
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleState1317); 

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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:647:1: entryRuleInitial returns [EObject current=null] : iv_ruleInitial= ruleInitial EOF ;
    public final EObject entryRuleInitial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitial = null;


        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:648:2: (iv_ruleInitial= ruleInitial EOF )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:649:2: iv_ruleInitial= ruleInitial EOF
            {
             newCompositeNode(grammarAccess.getInitialRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInitial_in_entryRuleInitial1355);
            iv_ruleInitial=ruleInitial();

            state._fsp--;

             current =iv_ruleInitial; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInitial1365); 

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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:656:1: ruleInitial returns [EObject current=null] : ( () otherlv_1= 'Initial' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleInitial() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_internalId_3_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:659:28: ( ( () otherlv_1= 'Initial' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:660:1: ( () otherlv_1= 'Initial' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:660:1: ( () otherlv_1= 'Initial' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:660:2: () otherlv_1= 'Initial' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:660:2: ()
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:661:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInitialAccess().getInitialAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleInitial1411); 

                	newLeafNode(otherlv_1, grammarAccess.getInitialAccess().getInitialKeyword_1());
                
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:670:1: (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:670:3: otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleInitial1424); 

                        	newLeafNode(otherlv_2, grammarAccess.getInitialAccess().getInternalIdKeyword_2_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:674:1: ( (lv_internalId_3_0= ruleEString ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:675:1: (lv_internalId_3_0= ruleEString )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:675:1: (lv_internalId_3_0= ruleEString )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:676:3: lv_internalId_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInitialAccess().getInternalIdEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInitial1445);
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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:700:1: entryRuleFinal returns [EObject current=null] : iv_ruleFinal= ruleFinal EOF ;
    public final EObject entryRuleFinal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFinal = null;


        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:701:2: (iv_ruleFinal= ruleFinal EOF )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:702:2: iv_ruleFinal= ruleFinal EOF
            {
             newCompositeNode(grammarAccess.getFinalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFinal_in_entryRuleFinal1483);
            iv_ruleFinal=ruleFinal();

            state._fsp--;

             current =iv_ruleFinal; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFinal1493); 

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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:709:1: ruleFinal returns [EObject current=null] : ( () otherlv_1= 'Final' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleFinal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_internalId_3_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:712:28: ( ( () otherlv_1= 'Final' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:713:1: ( () otherlv_1= 'Final' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:713:1: ( () otherlv_1= 'Final' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:713:2: () otherlv_1= 'Final' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:713:2: ()
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:714:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFinalAccess().getFinalAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleFinal1539); 

                	newLeafNode(otherlv_1, grammarAccess.getFinalAccess().getFinalKeyword_1());
                
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:723:1: (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:723:3: otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleFinal1552); 

                        	newLeafNode(otherlv_2, grammarAccess.getFinalAccess().getInternalIdKeyword_2_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:727:1: ( (lv_internalId_3_0= ruleEString ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:728:1: (lv_internalId_3_0= ruleEString )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:728:1: (lv_internalId_3_0= ruleEString )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:729:3: lv_internalId_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getFinalAccess().getInternalIdEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFinal1573);
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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:753:1: entryRuleAny returns [EObject current=null] : iv_ruleAny= ruleAny EOF ;
    public final EObject entryRuleAny() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAny = null;


        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:754:2: (iv_ruleAny= ruleAny EOF )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:755:2: iv_ruleAny= ruleAny EOF
            {
             newCompositeNode(grammarAccess.getAnyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAny_in_entryRuleAny1611);
            iv_ruleAny=ruleAny();

            state._fsp--;

             current =iv_ruleAny; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAny1621); 

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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:762:1: ruleAny returns [EObject current=null] : ( () otherlv_1= 'Any' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleAny() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_internalId_3_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:765:28: ( ( () otherlv_1= 'Any' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:766:1: ( () otherlv_1= 'Any' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:766:1: ( () otherlv_1= 'Any' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:766:2: () otherlv_1= 'Any' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:766:2: ()
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:767:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAnyAccess().getAnyAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleAny1667); 

                	newLeafNode(otherlv_1, grammarAccess.getAnyAccess().getAnyKeyword_1());
                
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:776:1: (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==28) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:776:3: otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleAny1680); 

                        	newLeafNode(otherlv_2, grammarAccess.getAnyAccess().getInternalIdKeyword_2_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:780:1: ( (lv_internalId_3_0= ruleEString ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:781:1: (lv_internalId_3_0= ruleEString )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:781:1: (lv_internalId_3_0= ruleEString )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:782:3: lv_internalId_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnyAccess().getInternalIdEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAny1701);
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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:806:1: entryRuleJunction returns [EObject current=null] : iv_ruleJunction= ruleJunction EOF ;
    public final EObject entryRuleJunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJunction = null;


        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:807:2: (iv_ruleJunction= ruleJunction EOF )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:808:2: iv_ruleJunction= ruleJunction EOF
            {
             newCompositeNode(grammarAccess.getJunctionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleJunction_in_entryRuleJunction1739);
            iv_ruleJunction=ruleJunction();

            state._fsp--;

             current =iv_ruleJunction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleJunction1749); 

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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:815:1: ruleJunction returns [EObject current=null] : ( () otherlv_1= 'Junction' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleJunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_internalId_3_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:818:28: ( ( () otherlv_1= 'Junction' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:819:1: ( () otherlv_1= 'Junction' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:819:1: ( () otherlv_1= 'Junction' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:819:2: () otherlv_1= 'Junction' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:819:2: ()
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:820:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getJunctionAccess().getJunctionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleJunction1795); 

                	newLeafNode(otherlv_1, grammarAccess.getJunctionAccess().getJunctionKeyword_1());
                
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:829:1: (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:829:3: otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleJunction1808); 

                        	newLeafNode(otherlv_2, grammarAccess.getJunctionAccess().getInternalIdKeyword_2_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:833:1: ( (lv_internalId_3_0= ruleEString ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:834:1: (lv_internalId_3_0= ruleEString )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:834:1: (lv_internalId_3_0= ruleEString )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:835:3: lv_internalId_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getJunctionAccess().getInternalIdEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleJunction1829);
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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:859:1: entryRuleFork returns [EObject current=null] : iv_ruleFork= ruleFork EOF ;
    public final EObject entryRuleFork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFork = null;


        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:860:2: (iv_ruleFork= ruleFork EOF )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:861:2: iv_ruleFork= ruleFork EOF
            {
             newCompositeNode(grammarAccess.getForkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFork_in_entryRuleFork1867);
            iv_ruleFork=ruleFork();

            state._fsp--;

             current =iv_ruleFork; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFork1877); 

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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:868:1: ruleFork returns [EObject current=null] : ( () otherlv_1= 'Fork' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleFork() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_internalId_3_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:871:28: ( ( () otherlv_1= 'Fork' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:872:1: ( () otherlv_1= 'Fork' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:872:1: ( () otherlv_1= 'Fork' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:872:2: () otherlv_1= 'Fork' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:872:2: ()
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:873:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getForkAccess().getForkAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleFork1923); 

                	newLeafNode(otherlv_1, grammarAccess.getForkAccess().getForkKeyword_1());
                
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:882:1: (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==28) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:882:3: otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleFork1936); 

                        	newLeafNode(otherlv_2, grammarAccess.getForkAccess().getInternalIdKeyword_2_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:886:1: ( (lv_internalId_3_0= ruleEString ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:887:1: (lv_internalId_3_0= ruleEString )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:887:1: (lv_internalId_3_0= ruleEString )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:888:3: lv_internalId_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getForkAccess().getInternalIdEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFork1957);
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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:912:1: entryRuleInvariant returns [EObject current=null] : iv_ruleInvariant= ruleInvariant EOF ;
    public final EObject entryRuleInvariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvariant = null;


        try {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:913:2: (iv_ruleInvariant= ruleInvariant EOF )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:914:2: iv_ruleInvariant= ruleInvariant EOF
            {
             newCompositeNode(grammarAccess.getInvariantRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInvariant_in_entryRuleInvariant1995);
            iv_ruleInvariant=ruleInvariant();

            state._fsp--;

             current =iv_ruleInvariant; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInvariant2005); 

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
    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:921:1: ruleInvariant returns [EObject current=null] : (otherlv_0= 'Invariant' otherlv_1= '@' ( (lv_name_2_0= ruleEString ) ) ( (lv_theorem_3_0= 'theorem' ) )? (otherlv_4= 'comment' ( (lv_comment_5_0= ruleEString ) ) )? otherlv_6= 'predicate' ( (lv_predicate_7_0= ruleEString ) ) ) ;
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
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:924:28: ( (otherlv_0= 'Invariant' otherlv_1= '@' ( (lv_name_2_0= ruleEString ) ) ( (lv_theorem_3_0= 'theorem' ) )? (otherlv_4= 'comment' ( (lv_comment_5_0= ruleEString ) ) )? otherlv_6= 'predicate' ( (lv_predicate_7_0= ruleEString ) ) ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:925:1: (otherlv_0= 'Invariant' otherlv_1= '@' ( (lv_name_2_0= ruleEString ) ) ( (lv_theorem_3_0= 'theorem' ) )? (otherlv_4= 'comment' ( (lv_comment_5_0= ruleEString ) ) )? otherlv_6= 'predicate' ( (lv_predicate_7_0= ruleEString ) ) )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:925:1: (otherlv_0= 'Invariant' otherlv_1= '@' ( (lv_name_2_0= ruleEString ) ) ( (lv_theorem_3_0= 'theorem' ) )? (otherlv_4= 'comment' ( (lv_comment_5_0= ruleEString ) ) )? otherlv_6= 'predicate' ( (lv_predicate_7_0= ruleEString ) ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:925:3: otherlv_0= 'Invariant' otherlv_1= '@' ( (lv_name_2_0= ruleEString ) ) ( (lv_theorem_3_0= 'theorem' ) )? (otherlv_4= 'comment' ( (lv_comment_5_0= ruleEString ) ) )? otherlv_6= 'predicate' ( (lv_predicate_7_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleInvariant2042); 

                	newLeafNode(otherlv_0, grammarAccess.getInvariantAccess().getInvariantKeyword_0());
                
            otherlv_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleInvariant2054); 

                	newLeafNode(otherlv_1, grammarAccess.getInvariantAccess().getCommercialAtKeyword_1());
                
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:933:1: ( (lv_name_2_0= ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:934:1: (lv_name_2_0= ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:934:1: (lv_name_2_0= ruleEString )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:935:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInvariantAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInvariant2075);
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

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:951:2: ( (lv_theorem_3_0= 'theorem' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==35) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:952:1: (lv_theorem_3_0= 'theorem' )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:952:1: (lv_theorem_3_0= 'theorem' )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:953:3: lv_theorem_3_0= 'theorem'
                    {
                    lv_theorem_3_0=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleInvariant2093); 

                            newLeafNode(lv_theorem_3_0, grammarAccess.getInvariantAccess().getTheoremTheoremKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInvariantRule());
                    	        }
                           		setWithLastConsumed(current, "theorem", true, "theorem");
                    	    

                    }


                    }
                    break;

            }

            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:966:3: (otherlv_4= 'comment' ( (lv_comment_5_0= ruleEString ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==19) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:966:5: otherlv_4= 'comment' ( (lv_comment_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleInvariant2120); 

                        	newLeafNode(otherlv_4, grammarAccess.getInvariantAccess().getCommentKeyword_4_0());
                        
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:970:1: ( (lv_comment_5_0= ruleEString ) )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:971:1: (lv_comment_5_0= ruleEString )
                    {
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:971:1: (lv_comment_5_0= ruleEString )
                    // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:972:3: lv_comment_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInvariantAccess().getCommentEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInvariant2141);
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

            otherlv_6=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleInvariant2155); 

                	newLeafNode(otherlv_6, grammarAccess.getInvariantAccess().getPredicateKeyword_5());
                
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:992:1: ( (lv_predicate_7_0= ruleEString ) )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:993:1: (lv_predicate_7_0= ruleEString )
            {
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:993:1: (lv_predicate_7_0= ruleEString )
            // ../ac.soton.iumlb.xtext.dsl/src-gen/ac/soton/uk/iumlb/xtext/parser/antlr/internal/InternalDsl.g:994:3: lv_predicate_7_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInvariantAccess().getPredicateEStringParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInvariant2176);
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
        public static final BitSet FOLLOW_17_in_ruleTransition804 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleTransition830 = new BitSet(new long[]{0x0000000000181000L});
        public static final BitSet FOLLOW_19_in_ruleTransition843 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransition864 = new BitSet(new long[]{0x0000000000101000L});
        public static final BitSet FOLLOW_12_in_ruleTransition879 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransition902 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_15_in_ruleTransition915 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransition938 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_20_in_ruleTransition954 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransition977 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleTransition989 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransition1012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleState_in_entryRuleState1050 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleState1060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleState1106 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleState1127 = new BitSet(new long[]{0x0000000004800002L});
        public static final BitSet FOLLOW_23_in_ruleState1140 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleState1152 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_ruleStatemachine_in_ruleState1173 = new BitSet(new long[]{0x0000000002008000L});
        public static final BitSet FOLLOW_15_in_ruleState1186 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_ruleStatemachine_in_ruleState1207 = new BitSet(new long[]{0x0000000002008000L});
        public static final BitSet FOLLOW_25_in_ruleState1221 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleState1236 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleState1248 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_ruleInvariant_in_ruleState1269 = new BitSet(new long[]{0x0000000002008000L});
        public static final BitSet FOLLOW_15_in_ruleState1282 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_ruleInvariant_in_ruleState1303 = new BitSet(new long[]{0x0000000002008000L});
        public static final BitSet FOLLOW_25_in_ruleState1317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInitial_in_entryRuleInitial1355 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInitial1365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleInitial1411 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_ruleInitial1424 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInitial1445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFinal_in_entryRuleFinal1483 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFinal1493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleFinal1539 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_ruleFinal1552 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFinal1573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAny_in_entryRuleAny1611 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAny1621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleAny1667 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_ruleAny1680 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAny1701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleJunction_in_entryRuleJunction1739 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleJunction1749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleJunction1795 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_ruleJunction1808 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleJunction1829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFork_in_entryRuleFork1867 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFork1877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleFork1923 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_ruleFork1936 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFork1957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvariant_in_entryRuleInvariant1995 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInvariant2005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleInvariant2042 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleInvariant2054 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInvariant2075 = new BitSet(new long[]{0x0000001800080000L});
        public static final BitSet FOLLOW_35_in_ruleInvariant2093 = new BitSet(new long[]{0x0000001000080000L});
        public static final BitSet FOLLOW_19_in_ruleInvariant2120 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInvariant2141 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleInvariant2155 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInvariant2176 = new BitSet(new long[]{0x0000000000000002L});
    }


}