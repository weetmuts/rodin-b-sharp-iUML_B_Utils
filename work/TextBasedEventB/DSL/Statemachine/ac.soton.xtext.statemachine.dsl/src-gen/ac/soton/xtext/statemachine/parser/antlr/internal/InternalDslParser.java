package ac.soton.xtext.statemachine.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ac.soton.xtext.statemachine.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'StateMachine'", "'Nodes'", "','", "'Transitions'", "'StateMachines'", "'End StateMachine'", "'Transition'", "'event'", "'source'", "'target'", "'State'", "'nested'", "'Initial'", "'Junction'", "'Fork'", "'Join'", "'Any'", "'Final'"
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
    public String getGrammarFileName() { return "../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g"; }



     	private DslGrammarAccess grammarAccess;
     	
        public InternalDslParser(TokenStream input, DslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "StateMachine";	
       	}
       	
       	@Override
       	protected DslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleStateMachine"
    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:67:1: entryRuleStateMachine returns [EObject current=null] : iv_ruleStateMachine= ruleStateMachine EOF ;
    public final EObject entryRuleStateMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateMachine = null;


        try {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:68:2: (iv_ruleStateMachine= ruleStateMachine EOF )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:69:2: iv_ruleStateMachine= ruleStateMachine EOF
            {
             newCompositeNode(grammarAccess.getStateMachineRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStateMachine_in_entryRuleStateMachine75);
            iv_ruleStateMachine=ruleStateMachine();

            state._fsp--;

             current =iv_ruleStateMachine; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStateMachine85); 

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
    // $ANTLR end "entryRuleStateMachine"


    // $ANTLR start "ruleStateMachine"
    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:76:1: ruleStateMachine returns [EObject current=null] : ( () otherlv_1= 'StateMachine' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'Nodes' ( (lv_Nodes_4_0= ruleAbstractNode ) ) (otherlv_5= ',' ( (lv_Nodes_6_0= ruleAbstractNode ) ) )* )? (otherlv_7= 'Transitions' ( (lv_Transitions_8_0= ruleTransition ) ) (otherlv_9= ',' ( (lv_Transitions_10_0= ruleTransition ) ) )* )? (otherlv_11= 'StateMachines' ( (lv_StateMachines_12_0= ruleStateMachine ) ) (otherlv_13= ',' ( (lv_StateMachines_14_0= ruleStateMachine ) ) )* )? otherlv_15= 'End StateMachine' ) ;
    public final EObject ruleStateMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_Nodes_4_0 = null;

        EObject lv_Nodes_6_0 = null;

        EObject lv_Transitions_8_0 = null;

        EObject lv_Transitions_10_0 = null;

        EObject lv_StateMachines_12_0 = null;

        EObject lv_StateMachines_14_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:79:28: ( ( () otherlv_1= 'StateMachine' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'Nodes' ( (lv_Nodes_4_0= ruleAbstractNode ) ) (otherlv_5= ',' ( (lv_Nodes_6_0= ruleAbstractNode ) ) )* )? (otherlv_7= 'Transitions' ( (lv_Transitions_8_0= ruleTransition ) ) (otherlv_9= ',' ( (lv_Transitions_10_0= ruleTransition ) ) )* )? (otherlv_11= 'StateMachines' ( (lv_StateMachines_12_0= ruleStateMachine ) ) (otherlv_13= ',' ( (lv_StateMachines_14_0= ruleStateMachine ) ) )* )? otherlv_15= 'End StateMachine' ) )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:80:1: ( () otherlv_1= 'StateMachine' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'Nodes' ( (lv_Nodes_4_0= ruleAbstractNode ) ) (otherlv_5= ',' ( (lv_Nodes_6_0= ruleAbstractNode ) ) )* )? (otherlv_7= 'Transitions' ( (lv_Transitions_8_0= ruleTransition ) ) (otherlv_9= ',' ( (lv_Transitions_10_0= ruleTransition ) ) )* )? (otherlv_11= 'StateMachines' ( (lv_StateMachines_12_0= ruleStateMachine ) ) (otherlv_13= ',' ( (lv_StateMachines_14_0= ruleStateMachine ) ) )* )? otherlv_15= 'End StateMachine' )
            {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:80:1: ( () otherlv_1= 'StateMachine' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'Nodes' ( (lv_Nodes_4_0= ruleAbstractNode ) ) (otherlv_5= ',' ( (lv_Nodes_6_0= ruleAbstractNode ) ) )* )? (otherlv_7= 'Transitions' ( (lv_Transitions_8_0= ruleTransition ) ) (otherlv_9= ',' ( (lv_Transitions_10_0= ruleTransition ) ) )* )? (otherlv_11= 'StateMachines' ( (lv_StateMachines_12_0= ruleStateMachine ) ) (otherlv_13= ',' ( (lv_StateMachines_14_0= ruleStateMachine ) ) )* )? otherlv_15= 'End StateMachine' )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:80:2: () otherlv_1= 'StateMachine' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'Nodes' ( (lv_Nodes_4_0= ruleAbstractNode ) ) (otherlv_5= ',' ( (lv_Nodes_6_0= ruleAbstractNode ) ) )* )? (otherlv_7= 'Transitions' ( (lv_Transitions_8_0= ruleTransition ) ) (otherlv_9= ',' ( (lv_Transitions_10_0= ruleTransition ) ) )* )? (otherlv_11= 'StateMachines' ( (lv_StateMachines_12_0= ruleStateMachine ) ) (otherlv_13= ',' ( (lv_StateMachines_14_0= ruleStateMachine ) ) )* )? otherlv_15= 'End StateMachine'
            {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:80:2: ()
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStateMachineAccess().getStateMachineAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleStateMachine131); 

                	newLeafNode(otherlv_1, grammarAccess.getStateMachineAccess().getStateMachineKeyword_1());
                
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:90:1: ( (lv_name_2_0= ruleEString ) )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:91:1: (lv_name_2_0= ruleEString )
            {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:91:1: (lv_name_2_0= ruleEString )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:92:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStateMachineAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStateMachine152);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:108:2: (otherlv_3= 'Nodes' ( (lv_Nodes_4_0= ruleAbstractNode ) ) (otherlv_5= ',' ( (lv_Nodes_6_0= ruleAbstractNode ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:108:4: otherlv_3= 'Nodes' ( (lv_Nodes_4_0= ruleAbstractNode ) ) (otherlv_5= ',' ( (lv_Nodes_6_0= ruleAbstractNode ) ) )*
                    {
                    otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleStateMachine165); 

                        	newLeafNode(otherlv_3, grammarAccess.getStateMachineAccess().getNodesKeyword_3_0());
                        
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:112:1: ( (lv_Nodes_4_0= ruleAbstractNode ) )
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:113:1: (lv_Nodes_4_0= ruleAbstractNode )
                    {
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:113:1: (lv_Nodes_4_0= ruleAbstractNode )
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:114:3: lv_Nodes_4_0= ruleAbstractNode
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateMachineAccess().getNodesAbstractNodeParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractNode_in_ruleStateMachine186);
                    lv_Nodes_4_0=ruleAbstractNode();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStateMachineRule());
                    	        }
                           		add(
                           			current, 
                           			"Nodes",
                            		lv_Nodes_4_0, 
                            		"AbstractNode");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:130:2: (otherlv_5= ',' ( (lv_Nodes_6_0= ruleAbstractNode ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==13) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:130:4: otherlv_5= ',' ( (lv_Nodes_6_0= ruleAbstractNode ) )
                    	    {
                    	    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleStateMachine199); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getStateMachineAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:134:1: ( (lv_Nodes_6_0= ruleAbstractNode ) )
                    	    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:135:1: (lv_Nodes_6_0= ruleAbstractNode )
                    	    {
                    	    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:135:1: (lv_Nodes_6_0= ruleAbstractNode )
                    	    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:136:3: lv_Nodes_6_0= ruleAbstractNode
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStateMachineAccess().getNodesAbstractNodeParserRuleCall_3_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractNode_in_ruleStateMachine220);
                    	    lv_Nodes_6_0=ruleAbstractNode();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStateMachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"Nodes",
                    	            		lv_Nodes_6_0, 
                    	            		"AbstractNode");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:152:6: (otherlv_7= 'Transitions' ( (lv_Transitions_8_0= ruleTransition ) ) (otherlv_9= ',' ( (lv_Transitions_10_0= ruleTransition ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:152:8: otherlv_7= 'Transitions' ( (lv_Transitions_8_0= ruleTransition ) ) (otherlv_9= ',' ( (lv_Transitions_10_0= ruleTransition ) ) )*
                    {
                    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleStateMachine237); 

                        	newLeafNode(otherlv_7, grammarAccess.getStateMachineAccess().getTransitionsKeyword_4_0());
                        
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:156:1: ( (lv_Transitions_8_0= ruleTransition ) )
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:157:1: (lv_Transitions_8_0= ruleTransition )
                    {
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:157:1: (lv_Transitions_8_0= ruleTransition )
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:158:3: lv_Transitions_8_0= ruleTransition
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateMachineAccess().getTransitionsTransitionParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTransition_in_ruleStateMachine258);
                    lv_Transitions_8_0=ruleTransition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStateMachineRule());
                    	        }
                           		add(
                           			current, 
                           			"Transitions",
                            		lv_Transitions_8_0, 
                            		"Transition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:174:2: (otherlv_9= ',' ( (lv_Transitions_10_0= ruleTransition ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==13) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:174:4: otherlv_9= ',' ( (lv_Transitions_10_0= ruleTransition ) )
                    	    {
                    	    otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleStateMachine271); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getStateMachineAccess().getCommaKeyword_4_2_0());
                    	        
                    	    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:178:1: ( (lv_Transitions_10_0= ruleTransition ) )
                    	    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:179:1: (lv_Transitions_10_0= ruleTransition )
                    	    {
                    	    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:179:1: (lv_Transitions_10_0= ruleTransition )
                    	    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:180:3: lv_Transitions_10_0= ruleTransition
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStateMachineAccess().getTransitionsTransitionParserRuleCall_4_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTransition_in_ruleStateMachine292);
                    	    lv_Transitions_10_0=ruleTransition();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStateMachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"Transitions",
                    	            		lv_Transitions_10_0, 
                    	            		"Transition");
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

            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:196:6: (otherlv_11= 'StateMachines' ( (lv_StateMachines_12_0= ruleStateMachine ) ) (otherlv_13= ',' ( (lv_StateMachines_14_0= ruleStateMachine ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:196:8: otherlv_11= 'StateMachines' ( (lv_StateMachines_12_0= ruleStateMachine ) ) (otherlv_13= ',' ( (lv_StateMachines_14_0= ruleStateMachine ) ) )*
                    {
                    otherlv_11=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleStateMachine309); 

                        	newLeafNode(otherlv_11, grammarAccess.getStateMachineAccess().getStateMachinesKeyword_5_0());
                        
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:200:1: ( (lv_StateMachines_12_0= ruleStateMachine ) )
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:201:1: (lv_StateMachines_12_0= ruleStateMachine )
                    {
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:201:1: (lv_StateMachines_12_0= ruleStateMachine )
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:202:3: lv_StateMachines_12_0= ruleStateMachine
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateMachineAccess().getStateMachinesStateMachineParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStateMachine_in_ruleStateMachine330);
                    lv_StateMachines_12_0=ruleStateMachine();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStateMachineRule());
                    	        }
                           		add(
                           			current, 
                           			"StateMachines",
                            		lv_StateMachines_12_0, 
                            		"StateMachine");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:218:2: (otherlv_13= ',' ( (lv_StateMachines_14_0= ruleStateMachine ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==13) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:218:4: otherlv_13= ',' ( (lv_StateMachines_14_0= ruleStateMachine ) )
                    	    {
                    	    otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleStateMachine343); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getStateMachineAccess().getCommaKeyword_5_2_0());
                    	        
                    	    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:222:1: ( (lv_StateMachines_14_0= ruleStateMachine ) )
                    	    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:223:1: (lv_StateMachines_14_0= ruleStateMachine )
                    	    {
                    	    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:223:1: (lv_StateMachines_14_0= ruleStateMachine )
                    	    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:224:3: lv_StateMachines_14_0= ruleStateMachine
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStateMachineAccess().getStateMachinesStateMachineParserRuleCall_5_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleStateMachine_in_ruleStateMachine364);
                    	    lv_StateMachines_14_0=ruleStateMachine();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStateMachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"StateMachines",
                    	            		lv_StateMachines_14_0, 
                    	            		"StateMachine");
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

            otherlv_15=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleStateMachine380); 

                	newLeafNode(otherlv_15, grammarAccess.getStateMachineAccess().getEndStateMachineKeyword_6());
                

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
    // $ANTLR end "ruleStateMachine"


    // $ANTLR start "entryRuleAbstractNode"
    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:252:1: entryRuleAbstractNode returns [EObject current=null] : iv_ruleAbstractNode= ruleAbstractNode EOF ;
    public final EObject entryRuleAbstractNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractNode = null;


        try {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:253:2: (iv_ruleAbstractNode= ruleAbstractNode EOF )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:254:2: iv_ruleAbstractNode= ruleAbstractNode EOF
            {
             newCompositeNode(grammarAccess.getAbstractNodeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractNode_in_entryRuleAbstractNode416);
            iv_ruleAbstractNode=ruleAbstractNode();

            state._fsp--;

             current =iv_ruleAbstractNode; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractNode426); 

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
    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:261:1: ruleAbstractNode returns [EObject current=null] : (this_State_0= ruleState | this_Initial_1= ruleInitial | this_Junction_2= ruleJunction | this_Fork_3= ruleFork | this_Join_4= ruleJoin | this_Any_5= ruleAny | this_Final_6= ruleFinal ) ;
    public final EObject ruleAbstractNode() throws RecognitionException {
        EObject current = null;

        EObject this_State_0 = null;

        EObject this_Initial_1 = null;

        EObject this_Junction_2 = null;

        EObject this_Fork_3 = null;

        EObject this_Join_4 = null;

        EObject this_Any_5 = null;

        EObject this_Final_6 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:264:28: ( (this_State_0= ruleState | this_Initial_1= ruleInitial | this_Junction_2= ruleJunction | this_Fork_3= ruleFork | this_Join_4= ruleJoin | this_Any_5= ruleAny | this_Final_6= ruleFinal ) )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:265:1: (this_State_0= ruleState | this_Initial_1= ruleInitial | this_Junction_2= ruleJunction | this_Fork_3= ruleFork | this_Join_4= ruleJoin | this_Any_5= ruleAny | this_Final_6= ruleFinal )
            {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:265:1: (this_State_0= ruleState | this_Initial_1= ruleInitial | this_Junction_2= ruleJunction | this_Fork_3= ruleFork | this_Join_4= ruleJoin | this_Any_5= ruleAny | this_Final_6= ruleFinal )
            int alt7=7;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt7=1;
                }
                break;
            case 23:
                {
                alt7=2;
                }
                break;
            case 24:
                {
                alt7=3;
                }
                break;
            case 25:
                {
                alt7=4;
                }
                break;
            case 26:
                {
                alt7=5;
                }
                break;
            case 27:
                {
                alt7=6;
                }
                break;
            case 28:
                {
                alt7=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:266:5: this_State_0= ruleState
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNodeAccess().getStateParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleState_in_ruleAbstractNode473);
                    this_State_0=ruleState();

                    state._fsp--;

                     
                            current = this_State_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:276:5: this_Initial_1= ruleInitial
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNodeAccess().getInitialParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInitial_in_ruleAbstractNode500);
                    this_Initial_1=ruleInitial();

                    state._fsp--;

                     
                            current = this_Initial_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:286:5: this_Junction_2= ruleJunction
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNodeAccess().getJunctionParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleJunction_in_ruleAbstractNode527);
                    this_Junction_2=ruleJunction();

                    state._fsp--;

                     
                            current = this_Junction_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:296:5: this_Fork_3= ruleFork
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNodeAccess().getForkParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFork_in_ruleAbstractNode554);
                    this_Fork_3=ruleFork();

                    state._fsp--;

                     
                            current = this_Fork_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:306:5: this_Join_4= ruleJoin
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNodeAccess().getJoinParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleJoin_in_ruleAbstractNode581);
                    this_Join_4=ruleJoin();

                    state._fsp--;

                     
                            current = this_Join_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:316:5: this_Any_5= ruleAny
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNodeAccess().getAnyParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAny_in_ruleAbstractNode608);
                    this_Any_5=ruleAny();

                    state._fsp--;

                     
                            current = this_Any_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:326:5: this_Final_6= ruleFinal
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNodeAccess().getFinalParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFinal_in_ruleAbstractNode635);
                    this_Final_6=ruleFinal();

                    state._fsp--;

                     
                            current = this_Final_6; 
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
    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:342:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:343:2: (iv_ruleEString= ruleEString EOF )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:344:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString671);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString682); 

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
    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:351:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:354:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:355:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:355:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:355:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString722); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:363:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString748); 

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
    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:378:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:379:2: (iv_ruleTransition= ruleTransition EOF )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:380:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransition_in_entryRuleTransition793);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransition803); 

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
    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:387:1: ruleTransition returns [EObject current=null] : ( () otherlv_1= 'Transition' (otherlv_2= 'event' ( (lv_event_3_0= ruleEString ) ) )? (otherlv_4= 'source' ( ( ruleEString ) ) )? (otherlv_6= 'target' ( ( ruleEString ) ) )? ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_event_3_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:390:28: ( ( () otherlv_1= 'Transition' (otherlv_2= 'event' ( (lv_event_3_0= ruleEString ) ) )? (otherlv_4= 'source' ( ( ruleEString ) ) )? (otherlv_6= 'target' ( ( ruleEString ) ) )? ) )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:391:1: ( () otherlv_1= 'Transition' (otherlv_2= 'event' ( (lv_event_3_0= ruleEString ) ) )? (otherlv_4= 'source' ( ( ruleEString ) ) )? (otherlv_6= 'target' ( ( ruleEString ) ) )? )
            {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:391:1: ( () otherlv_1= 'Transition' (otherlv_2= 'event' ( (lv_event_3_0= ruleEString ) ) )? (otherlv_4= 'source' ( ( ruleEString ) ) )? (otherlv_6= 'target' ( ( ruleEString ) ) )? )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:391:2: () otherlv_1= 'Transition' (otherlv_2= 'event' ( (lv_event_3_0= ruleEString ) ) )? (otherlv_4= 'source' ( ( ruleEString ) ) )? (otherlv_6= 'target' ( ( ruleEString ) ) )?
            {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:391:2: ()
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:392:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTransitionAccess().getTransitionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleTransition849); 

                	newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getTransitionKeyword_1());
                
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:401:1: (otherlv_2= 'event' ( (lv_event_3_0= ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:401:3: otherlv_2= 'event' ( (lv_event_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleTransition862); 

                        	newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getEventKeyword_2_0());
                        
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:405:1: ( (lv_event_3_0= ruleEString ) )
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:406:1: (lv_event_3_0= ruleEString )
                    {
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:406:1: (lv_event_3_0= ruleEString )
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:407:3: lv_event_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getTransitionAccess().getEventEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransition883);
                    lv_event_3_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                    	        }
                           		set(
                           			current, 
                           			"event",
                            		lv_event_3_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:423:4: (otherlv_4= 'source' ( ( ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:423:6: otherlv_4= 'source' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleTransition898); 

                        	newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getSourceKeyword_3_0());
                        
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:427:1: ( ( ruleEString ) )
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:428:1: ( ruleEString )
                    {
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:428:1: ( ruleEString )
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:429:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getTransitionAccess().getSourceAbstractNodeCrossReference_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransition921);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:442:4: (otherlv_6= 'target' ( ( ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:442:6: otherlv_6= 'target' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleTransition936); 

                        	newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getTargetKeyword_4_0());
                        
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:446:1: ( ( ruleEString ) )
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:447:1: ( ruleEString )
                    {
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:447:1: ( ruleEString )
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:448:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getTransitionAccess().getTargetAbstractNodeCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransition959);
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
    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:469:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:470:2: (iv_ruleState= ruleState EOF )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:471:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleState_in_entryRuleState997);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleState1007); 

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
    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:478:1: ruleState returns [EObject current=null] : ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'nested' ( (lv_nested_4_0= ruleStateMachine ) ) )? ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_nested_4_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:481:28: ( ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'nested' ( (lv_nested_4_0= ruleStateMachine ) ) )? ) )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:482:1: ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'nested' ( (lv_nested_4_0= ruleStateMachine ) ) )? )
            {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:482:1: ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'nested' ( (lv_nested_4_0= ruleStateMachine ) ) )? )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:482:2: () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'nested' ( (lv_nested_4_0= ruleStateMachine ) ) )?
            {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:482:2: ()
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:483:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStateAccess().getStateAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleState1053); 

                	newLeafNode(otherlv_1, grammarAccess.getStateAccess().getStateKeyword_1());
                
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:492:1: ( (lv_name_2_0= ruleEString ) )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:493:1: (lv_name_2_0= ruleEString )
            {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:493:1: (lv_name_2_0= ruleEString )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:494:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleState1074);
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

            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:510:2: (otherlv_3= 'nested' ( (lv_nested_4_0= ruleStateMachine ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:510:4: otherlv_3= 'nested' ( (lv_nested_4_0= ruleStateMachine ) )
                    {
                    otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleState1087); 

                        	newLeafNode(otherlv_3, grammarAccess.getStateAccess().getNestedKeyword_3_0());
                        
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:514:1: ( (lv_nested_4_0= ruleStateMachine ) )
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:515:1: (lv_nested_4_0= ruleStateMachine )
                    {
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:515:1: (lv_nested_4_0= ruleStateMachine )
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:516:3: lv_nested_4_0= ruleStateMachine
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateAccess().getNestedStateMachineParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStateMachine_in_ruleState1108);
                    lv_nested_4_0=ruleStateMachine();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStateRule());
                    	        }
                           		set(
                           			current, 
                           			"nested",
                            		lv_nested_4_0, 
                            		"StateMachine");
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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleInitial"
    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:540:1: entryRuleInitial returns [EObject current=null] : iv_ruleInitial= ruleInitial EOF ;
    public final EObject entryRuleInitial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitial = null;


        try {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:541:2: (iv_ruleInitial= ruleInitial EOF )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:542:2: iv_ruleInitial= ruleInitial EOF
            {
             newCompositeNode(grammarAccess.getInitialRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInitial_in_entryRuleInitial1146);
            iv_ruleInitial=ruleInitial();

            state._fsp--;

             current =iv_ruleInitial; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInitial1156); 

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
    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:549:1: ruleInitial returns [EObject current=null] : ( () otherlv_1= 'Initial' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleInitial() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:552:28: ( ( () otherlv_1= 'Initial' ( (lv_name_2_0= ruleEString ) ) ) )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:553:1: ( () otherlv_1= 'Initial' ( (lv_name_2_0= ruleEString ) ) )
            {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:553:1: ( () otherlv_1= 'Initial' ( (lv_name_2_0= ruleEString ) ) )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:553:2: () otherlv_1= 'Initial' ( (lv_name_2_0= ruleEString ) )
            {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:553:2: ()
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:554:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInitialAccess().getInitialAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleInitial1202); 

                	newLeafNode(otherlv_1, grammarAccess.getInitialAccess().getInitialKeyword_1());
                
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:563:1: ( (lv_name_2_0= ruleEString ) )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:564:1: (lv_name_2_0= ruleEString )
            {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:564:1: (lv_name_2_0= ruleEString )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:565:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInitialAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInitial1223);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInitialRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
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
    // $ANTLR end "ruleInitial"


    // $ANTLR start "entryRuleJunction"
    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:589:1: entryRuleJunction returns [EObject current=null] : iv_ruleJunction= ruleJunction EOF ;
    public final EObject entryRuleJunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJunction = null;


        try {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:590:2: (iv_ruleJunction= ruleJunction EOF )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:591:2: iv_ruleJunction= ruleJunction EOF
            {
             newCompositeNode(grammarAccess.getJunctionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleJunction_in_entryRuleJunction1259);
            iv_ruleJunction=ruleJunction();

            state._fsp--;

             current =iv_ruleJunction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleJunction1269); 

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
    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:598:1: ruleJunction returns [EObject current=null] : ( () otherlv_1= 'Junction' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleJunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:601:28: ( ( () otherlv_1= 'Junction' ( (lv_name_2_0= ruleEString ) ) ) )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:602:1: ( () otherlv_1= 'Junction' ( (lv_name_2_0= ruleEString ) ) )
            {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:602:1: ( () otherlv_1= 'Junction' ( (lv_name_2_0= ruleEString ) ) )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:602:2: () otherlv_1= 'Junction' ( (lv_name_2_0= ruleEString ) )
            {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:602:2: ()
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:603:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getJunctionAccess().getJunctionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleJunction1315); 

                	newLeafNode(otherlv_1, grammarAccess.getJunctionAccess().getJunctionKeyword_1());
                
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:612:1: ( (lv_name_2_0= ruleEString ) )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:613:1: (lv_name_2_0= ruleEString )
            {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:613:1: (lv_name_2_0= ruleEString )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:614:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getJunctionAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleJunction1336);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJunctionRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
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
    // $ANTLR end "ruleJunction"


    // $ANTLR start "entryRuleFork"
    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:638:1: entryRuleFork returns [EObject current=null] : iv_ruleFork= ruleFork EOF ;
    public final EObject entryRuleFork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFork = null;


        try {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:639:2: (iv_ruleFork= ruleFork EOF )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:640:2: iv_ruleFork= ruleFork EOF
            {
             newCompositeNode(grammarAccess.getForkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFork_in_entryRuleFork1372);
            iv_ruleFork=ruleFork();

            state._fsp--;

             current =iv_ruleFork; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFork1382); 

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
    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:647:1: ruleFork returns [EObject current=null] : ( () otherlv_1= 'Fork' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleFork() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:650:28: ( ( () otherlv_1= 'Fork' ( (lv_name_2_0= ruleEString ) ) ) )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:651:1: ( () otherlv_1= 'Fork' ( (lv_name_2_0= ruleEString ) ) )
            {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:651:1: ( () otherlv_1= 'Fork' ( (lv_name_2_0= ruleEString ) ) )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:651:2: () otherlv_1= 'Fork' ( (lv_name_2_0= ruleEString ) )
            {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:651:2: ()
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:652:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getForkAccess().getForkAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleFork1428); 

                	newLeafNode(otherlv_1, grammarAccess.getForkAccess().getForkKeyword_1());
                
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:661:1: ( (lv_name_2_0= ruleEString ) )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:662:1: (lv_name_2_0= ruleEString )
            {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:662:1: (lv_name_2_0= ruleEString )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:663:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getForkAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFork1449);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getForkRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
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
    // $ANTLR end "ruleFork"


    // $ANTLR start "entryRuleJoin"
    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:687:1: entryRuleJoin returns [EObject current=null] : iv_ruleJoin= ruleJoin EOF ;
    public final EObject entryRuleJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoin = null;


        try {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:688:2: (iv_ruleJoin= ruleJoin EOF )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:689:2: iv_ruleJoin= ruleJoin EOF
            {
             newCompositeNode(grammarAccess.getJoinRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleJoin_in_entryRuleJoin1485);
            iv_ruleJoin=ruleJoin();

            state._fsp--;

             current =iv_ruleJoin; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleJoin1495); 

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
    // $ANTLR end "entryRuleJoin"


    // $ANTLR start "ruleJoin"
    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:696:1: ruleJoin returns [EObject current=null] : ( () otherlv_1= 'Join' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleJoin() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:699:28: ( ( () otherlv_1= 'Join' ( (lv_name_2_0= ruleEString ) ) ) )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:700:1: ( () otherlv_1= 'Join' ( (lv_name_2_0= ruleEString ) ) )
            {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:700:1: ( () otherlv_1= 'Join' ( (lv_name_2_0= ruleEString ) ) )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:700:2: () otherlv_1= 'Join' ( (lv_name_2_0= ruleEString ) )
            {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:700:2: ()
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:701:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getJoinAccess().getJoinAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleJoin1541); 

                	newLeafNode(otherlv_1, grammarAccess.getJoinAccess().getJoinKeyword_1());
                
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:710:1: ( (lv_name_2_0= ruleEString ) )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:711:1: (lv_name_2_0= ruleEString )
            {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:711:1: (lv_name_2_0= ruleEString )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:712:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getJoinAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleJoin1562);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJoinRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
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
    // $ANTLR end "ruleJoin"


    // $ANTLR start "entryRuleAny"
    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:736:1: entryRuleAny returns [EObject current=null] : iv_ruleAny= ruleAny EOF ;
    public final EObject entryRuleAny() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAny = null;


        try {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:737:2: (iv_ruleAny= ruleAny EOF )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:738:2: iv_ruleAny= ruleAny EOF
            {
             newCompositeNode(grammarAccess.getAnyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAny_in_entryRuleAny1598);
            iv_ruleAny=ruleAny();

            state._fsp--;

             current =iv_ruleAny; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAny1608); 

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
    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:745:1: ruleAny returns [EObject current=null] : ( () otherlv_1= 'Any' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleAny() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:748:28: ( ( () otherlv_1= 'Any' ( (lv_name_2_0= ruleEString ) ) ) )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:749:1: ( () otherlv_1= 'Any' ( (lv_name_2_0= ruleEString ) ) )
            {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:749:1: ( () otherlv_1= 'Any' ( (lv_name_2_0= ruleEString ) ) )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:749:2: () otherlv_1= 'Any' ( (lv_name_2_0= ruleEString ) )
            {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:749:2: ()
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:750:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAnyAccess().getAnyAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleAny1654); 

                	newLeafNode(otherlv_1, grammarAccess.getAnyAccess().getAnyKeyword_1());
                
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:759:1: ( (lv_name_2_0= ruleEString ) )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:760:1: (lv_name_2_0= ruleEString )
            {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:760:1: (lv_name_2_0= ruleEString )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:761:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAnyAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAny1675);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAnyRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
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
    // $ANTLR end "ruleAny"


    // $ANTLR start "entryRuleFinal"
    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:785:1: entryRuleFinal returns [EObject current=null] : iv_ruleFinal= ruleFinal EOF ;
    public final EObject entryRuleFinal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFinal = null;


        try {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:786:2: (iv_ruleFinal= ruleFinal EOF )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:787:2: iv_ruleFinal= ruleFinal EOF
            {
             newCompositeNode(grammarAccess.getFinalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFinal_in_entryRuleFinal1711);
            iv_ruleFinal=ruleFinal();

            state._fsp--;

             current =iv_ruleFinal; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFinal1721); 

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
    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:794:1: ruleFinal returns [EObject current=null] : ( () otherlv_1= 'Final' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleFinal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:797:28: ( ( () otherlv_1= 'Final' ( (lv_name_2_0= ruleEString ) ) ) )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:798:1: ( () otherlv_1= 'Final' ( (lv_name_2_0= ruleEString ) ) )
            {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:798:1: ( () otherlv_1= 'Final' ( (lv_name_2_0= ruleEString ) ) )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:798:2: () otherlv_1= 'Final' ( (lv_name_2_0= ruleEString ) )
            {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:798:2: ()
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:799:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFinalAccess().getFinalAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleFinal1767); 

                	newLeafNode(otherlv_1, grammarAccess.getFinalAccess().getFinalKeyword_1());
                
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:808:1: ( (lv_name_2_0= ruleEString ) )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:809:1: (lv_name_2_0= ruleEString )
            {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:809:1: (lv_name_2_0= ruleEString )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:810:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFinalAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFinal1788);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFinalRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
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
    // $ANTLR end "ruleFinal"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleStateMachine_in_entryRuleStateMachine75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStateMachine85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleStateMachine131 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStateMachine152 = new BitSet(new long[]{0x000000000001D000L});
        public static final BitSet FOLLOW_12_in_ruleStateMachine165 = new BitSet(new long[]{0x000000001FA00000L});
        public static final BitSet FOLLOW_ruleAbstractNode_in_ruleStateMachine186 = new BitSet(new long[]{0x000000000001E000L});
        public static final BitSet FOLLOW_13_in_ruleStateMachine199 = new BitSet(new long[]{0x000000001FA00000L});
        public static final BitSet FOLLOW_ruleAbstractNode_in_ruleStateMachine220 = new BitSet(new long[]{0x000000000001E000L});
        public static final BitSet FOLLOW_14_in_ruleStateMachine237 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_ruleTransition_in_ruleStateMachine258 = new BitSet(new long[]{0x000000000001A000L});
        public static final BitSet FOLLOW_13_in_ruleStateMachine271 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_ruleTransition_in_ruleStateMachine292 = new BitSet(new long[]{0x000000000001A000L});
        public static final BitSet FOLLOW_15_in_ruleStateMachine309 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_ruleStateMachine_in_ruleStateMachine330 = new BitSet(new long[]{0x0000000000012000L});
        public static final BitSet FOLLOW_13_in_ruleStateMachine343 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_ruleStateMachine_in_ruleStateMachine364 = new BitSet(new long[]{0x0000000000012000L});
        public static final BitSet FOLLOW_16_in_ruleStateMachine380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractNode_in_entryRuleAbstractNode416 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractNode426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleState_in_ruleAbstractNode473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInitial_in_ruleAbstractNode500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleJunction_in_ruleAbstractNode527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFork_in_ruleAbstractNode554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleJoin_in_ruleAbstractNode581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAny_in_ruleAbstractNode608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFinal_in_ruleAbstractNode635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString671 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition793 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransition803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleTransition849 = new BitSet(new long[]{0x00000000001C0002L});
        public static final BitSet FOLLOW_18_in_ruleTransition862 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransition883 = new BitSet(new long[]{0x0000000000180002L});
        public static final BitSet FOLLOW_19_in_ruleTransition898 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransition921 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_20_in_ruleTransition936 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransition959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleState_in_entryRuleState997 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleState1007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleState1053 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleState1074 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_22_in_ruleState1087 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_ruleStateMachine_in_ruleState1108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInitial_in_entryRuleInitial1146 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInitial1156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleInitial1202 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInitial1223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleJunction_in_entryRuleJunction1259 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleJunction1269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleJunction1315 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleJunction1336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFork_in_entryRuleFork1372 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFork1382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleFork1428 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFork1449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleJoin_in_entryRuleJoin1485 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleJoin1495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleJoin1541 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleJoin1562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAny_in_entryRuleAny1598 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAny1608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleAny1654 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAny1675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFinal_in_entryRuleFinal1711 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFinal1721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleFinal1767 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFinal1788 = new BitSet(new long[]{0x0000000000000002L});
    }


}