package ac.soton.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ac.soton.xtext.services.ContextDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalContextDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'context'", "'comment'", "'extends'", "'sets'", "'constants'", "'axioms'", "'//'", "'theorem'", "'@'"
    };
    public static final int T__19=19;
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalContextDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalContextDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalContextDslParser.tokenNames; }
    public String getGrammarFileName() { return "../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g"; }



     	private ContextDslGrammarAccess grammarAccess;
     	
        public InternalContextDslParser(TokenStream input, ContextDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Context";	
       	}
       	
       	@Override
       	protected ContextDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleContext"
    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:67:1: entryRuleContext returns [EObject current=null] : iv_ruleContext= ruleContext EOF ;
    public final EObject entryRuleContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContext = null;


        try {
            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:68:2: (iv_ruleContext= ruleContext EOF )
            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:69:2: iv_ruleContext= ruleContext EOF
            {
             newCompositeNode(grammarAccess.getContextRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleContext_in_entryRuleContext75);
            iv_ruleContext=ruleContext();

            state._fsp--;

             current =iv_ruleContext; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleContext85); 

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
    // $ANTLR end "entryRuleContext"


    // $ANTLR start "ruleContext"
    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:76:1: ruleContext returns [EObject current=null] : ( () otherlv_1= 'context' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'comment' ( (lv_comment_4_0= ruleEString ) ) )? (otherlv_5= 'extends' ( ( ruleEString ) ) ( ( ruleEString ) )* )? (otherlv_8= 'sets' ( (lv_sets_9_0= ruleCarrierSet ) ) ( (lv_sets_10_0= ruleCarrierSet ) )* )? (otherlv_11= 'constants' ( (lv_constants_12_0= ruleConstant ) ) ( (lv_constants_13_0= ruleConstant ) )* )? (otherlv_14= 'axioms' ( (lv_axioms_15_0= ruleAxiom ) ) ( (lv_axioms_16_0= ruleAxiom ) )* )? ) ;
    public final EObject ruleContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_comment_4_0 = null;

        EObject lv_sets_9_0 = null;

        EObject lv_sets_10_0 = null;

        EObject lv_constants_12_0 = null;

        EObject lv_constants_13_0 = null;

        EObject lv_axioms_15_0 = null;

        EObject lv_axioms_16_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:79:28: ( ( () otherlv_1= 'context' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'comment' ( (lv_comment_4_0= ruleEString ) ) )? (otherlv_5= 'extends' ( ( ruleEString ) ) ( ( ruleEString ) )* )? (otherlv_8= 'sets' ( (lv_sets_9_0= ruleCarrierSet ) ) ( (lv_sets_10_0= ruleCarrierSet ) )* )? (otherlv_11= 'constants' ( (lv_constants_12_0= ruleConstant ) ) ( (lv_constants_13_0= ruleConstant ) )* )? (otherlv_14= 'axioms' ( (lv_axioms_15_0= ruleAxiom ) ) ( (lv_axioms_16_0= ruleAxiom ) )* )? ) )
            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:80:1: ( () otherlv_1= 'context' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'comment' ( (lv_comment_4_0= ruleEString ) ) )? (otherlv_5= 'extends' ( ( ruleEString ) ) ( ( ruleEString ) )* )? (otherlv_8= 'sets' ( (lv_sets_9_0= ruleCarrierSet ) ) ( (lv_sets_10_0= ruleCarrierSet ) )* )? (otherlv_11= 'constants' ( (lv_constants_12_0= ruleConstant ) ) ( (lv_constants_13_0= ruleConstant ) )* )? (otherlv_14= 'axioms' ( (lv_axioms_15_0= ruleAxiom ) ) ( (lv_axioms_16_0= ruleAxiom ) )* )? )
            {
            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:80:1: ( () otherlv_1= 'context' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'comment' ( (lv_comment_4_0= ruleEString ) ) )? (otherlv_5= 'extends' ( ( ruleEString ) ) ( ( ruleEString ) )* )? (otherlv_8= 'sets' ( (lv_sets_9_0= ruleCarrierSet ) ) ( (lv_sets_10_0= ruleCarrierSet ) )* )? (otherlv_11= 'constants' ( (lv_constants_12_0= ruleConstant ) ) ( (lv_constants_13_0= ruleConstant ) )* )? (otherlv_14= 'axioms' ( (lv_axioms_15_0= ruleAxiom ) ) ( (lv_axioms_16_0= ruleAxiom ) )* )? )
            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:80:2: () otherlv_1= 'context' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'comment' ( (lv_comment_4_0= ruleEString ) ) )? (otherlv_5= 'extends' ( ( ruleEString ) ) ( ( ruleEString ) )* )? (otherlv_8= 'sets' ( (lv_sets_9_0= ruleCarrierSet ) ) ( (lv_sets_10_0= ruleCarrierSet ) )* )? (otherlv_11= 'constants' ( (lv_constants_12_0= ruleConstant ) ) ( (lv_constants_13_0= ruleConstant ) )* )? (otherlv_14= 'axioms' ( (lv_axioms_15_0= ruleAxiom ) ) ( (lv_axioms_16_0= ruleAxiom ) )* )?
            {
            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:80:2: ()
            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getContextAccess().getContextAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleContext131); 

                	newLeafNode(otherlv_1, grammarAccess.getContextAccess().getContextKeyword_1());
                
            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:90:1: ( (lv_name_2_0= ruleEString ) )
            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:91:1: (lv_name_2_0= ruleEString )
            {
            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:91:1: (lv_name_2_0= ruleEString )
            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:92:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getContextAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleContext152);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getContextRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:108:2: (otherlv_3= 'comment' ( (lv_comment_4_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:108:4: otherlv_3= 'comment' ( (lv_comment_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleContext165); 

                        	newLeafNode(otherlv_3, grammarAccess.getContextAccess().getCommentKeyword_3_0());
                        
                    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:112:1: ( (lv_comment_4_0= ruleEString ) )
                    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:113:1: (lv_comment_4_0= ruleEString )
                    {
                    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:113:1: (lv_comment_4_0= ruleEString )
                    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:114:3: lv_comment_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getContextAccess().getCommentEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleContext186);
                    lv_comment_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContextRule());
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

            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:130:4: (otherlv_5= 'extends' ( ( ruleEString ) ) ( ( ruleEString ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:130:6: otherlv_5= 'extends' ( ( ruleEString ) ) ( ( ruleEString ) )*
                    {
                    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleContext201); 

                        	newLeafNode(otherlv_5, grammarAccess.getContextAccess().getExtendsKeyword_4_0());
                        
                    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:134:1: ( ( ruleEString ) )
                    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:135:1: ( ruleEString )
                    {
                    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:135:1: ( ruleEString )
                    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:136:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getContextRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getContextAccess().getExtendsContextCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleContext224);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:149:2: ( ( ruleEString ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_ID)) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:150:1: ( ruleEString )
                    	    {
                    	    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:150:1: ( ruleEString )
                    	    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:151:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getContextRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getContextAccess().getExtendsContextCrossReference_4_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleContext247);
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

            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:164:5: (otherlv_8= 'sets' ( (lv_sets_9_0= ruleCarrierSet ) ) ( (lv_sets_10_0= ruleCarrierSet ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:164:7: otherlv_8= 'sets' ( (lv_sets_9_0= ruleCarrierSet ) ) ( (lv_sets_10_0= ruleCarrierSet ) )*
                    {
                    otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleContext263); 

                        	newLeafNode(otherlv_8, grammarAccess.getContextAccess().getSetsKeyword_5_0());
                        
                    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:168:1: ( (lv_sets_9_0= ruleCarrierSet ) )
                    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:169:1: (lv_sets_9_0= ruleCarrierSet )
                    {
                    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:169:1: (lv_sets_9_0= ruleCarrierSet )
                    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:170:3: lv_sets_9_0= ruleCarrierSet
                    {
                     
                    	        newCompositeNode(grammarAccess.getContextAccess().getSetsCarrierSetParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCarrierSet_in_ruleContext284);
                    lv_sets_9_0=ruleCarrierSet();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContextRule());
                    	        }
                           		add(
                           			current, 
                           			"sets",
                            		lv_sets_9_0, 
                            		"CarrierSet");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:186:2: ( (lv_sets_10_0= ruleCarrierSet ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_ID)) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:187:1: (lv_sets_10_0= ruleCarrierSet )
                    	    {
                    	    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:187:1: (lv_sets_10_0= ruleCarrierSet )
                    	    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:188:3: lv_sets_10_0= ruleCarrierSet
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getContextAccess().getSetsCarrierSetParserRuleCall_5_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleCarrierSet_in_ruleContext305);
                    	    lv_sets_10_0=ruleCarrierSet();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getContextRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"sets",
                    	            		lv_sets_10_0, 
                    	            		"CarrierSet");
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

            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:204:5: (otherlv_11= 'constants' ( (lv_constants_12_0= ruleConstant ) ) ( (lv_constants_13_0= ruleConstant ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:204:7: otherlv_11= 'constants' ( (lv_constants_12_0= ruleConstant ) ) ( (lv_constants_13_0= ruleConstant ) )*
                    {
                    otherlv_11=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleContext321); 

                        	newLeafNode(otherlv_11, grammarAccess.getContextAccess().getConstantsKeyword_6_0());
                        
                    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:208:1: ( (lv_constants_12_0= ruleConstant ) )
                    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:209:1: (lv_constants_12_0= ruleConstant )
                    {
                    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:209:1: (lv_constants_12_0= ruleConstant )
                    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:210:3: lv_constants_12_0= ruleConstant
                    {
                     
                    	        newCompositeNode(grammarAccess.getContextAccess().getConstantsConstantParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleConstant_in_ruleContext342);
                    lv_constants_12_0=ruleConstant();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContextRule());
                    	        }
                           		add(
                           			current, 
                           			"constants",
                            		lv_constants_12_0, 
                            		"Constant");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:226:2: ( (lv_constants_13_0= ruleConstant ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:227:1: (lv_constants_13_0= ruleConstant )
                    	    {
                    	    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:227:1: (lv_constants_13_0= ruleConstant )
                    	    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:228:3: lv_constants_13_0= ruleConstant
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getContextAccess().getConstantsConstantParserRuleCall_6_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleConstant_in_ruleContext363);
                    	    lv_constants_13_0=ruleConstant();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getContextRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"constants",
                    	            		lv_constants_13_0, 
                    	            		"Constant");
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

            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:244:5: (otherlv_14= 'axioms' ( (lv_axioms_15_0= ruleAxiom ) ) ( (lv_axioms_16_0= ruleAxiom ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:244:7: otherlv_14= 'axioms' ( (lv_axioms_15_0= ruleAxiom ) ) ( (lv_axioms_16_0= ruleAxiom ) )*
                    {
                    otherlv_14=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleContext379); 

                        	newLeafNode(otherlv_14, grammarAccess.getContextAccess().getAxiomsKeyword_7_0());
                        
                    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:248:1: ( (lv_axioms_15_0= ruleAxiom ) )
                    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:249:1: (lv_axioms_15_0= ruleAxiom )
                    {
                    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:249:1: (lv_axioms_15_0= ruleAxiom )
                    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:250:3: lv_axioms_15_0= ruleAxiom
                    {
                     
                    	        newCompositeNode(grammarAccess.getContextAccess().getAxiomsAxiomParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAxiom_in_ruleContext400);
                    lv_axioms_15_0=ruleAxiom();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContextRule());
                    	        }
                           		add(
                           			current, 
                           			"axioms",
                            		lv_axioms_15_0, 
                            		"Axiom");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:266:2: ( (lv_axioms_16_0= ruleAxiom ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>=18 && LA8_0<=19)) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:267:1: (lv_axioms_16_0= ruleAxiom )
                    	    {
                    	    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:267:1: (lv_axioms_16_0= ruleAxiom )
                    	    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:268:3: lv_axioms_16_0= ruleAxiom
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getContextAccess().getAxiomsAxiomParserRuleCall_7_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAxiom_in_ruleContext421);
                    	    lv_axioms_16_0=ruleAxiom();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getContextRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"axioms",
                    	            		lv_axioms_16_0, 
                    	            		"Axiom");
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
    // $ANTLR end "ruleContext"


    // $ANTLR start "entryRuleEString"
    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:292:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:293:2: (iv_ruleEString= ruleEString EOF )
            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:294:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString461);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString472); 

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
    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:301:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:304:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:305:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:305:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:305:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString512); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:313:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString538); 

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


    // $ANTLR start "entryRuleCarrierSet"
    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:328:1: entryRuleCarrierSet returns [EObject current=null] : iv_ruleCarrierSet= ruleCarrierSet EOF ;
    public final EObject entryRuleCarrierSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCarrierSet = null;


        try {
            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:329:2: (iv_ruleCarrierSet= ruleCarrierSet EOF )
            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:330:2: iv_ruleCarrierSet= ruleCarrierSet EOF
            {
             newCompositeNode(grammarAccess.getCarrierSetRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCarrierSet_in_entryRuleCarrierSet583);
            iv_ruleCarrierSet=ruleCarrierSet();

            state._fsp--;

             current =iv_ruleCarrierSet; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCarrierSet593); 

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
    // $ANTLR end "entryRuleCarrierSet"


    // $ANTLR start "ruleCarrierSet"
    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:337:1: ruleCarrierSet returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '//' ( (lv_comment_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleCarrierSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_comment_3_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:340:28: ( ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '//' ( (lv_comment_3_0= ruleEString ) ) )? ) )
            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:341:1: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '//' ( (lv_comment_3_0= ruleEString ) ) )? )
            {
            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:341:1: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '//' ( (lv_comment_3_0= ruleEString ) ) )? )
            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:341:2: () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '//' ( (lv_comment_3_0= ruleEString ) ) )?
            {
            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:341:2: ()
            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:342:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCarrierSetAccess().getCarrierSetAction_0(),
                        current);
                

            }

            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:347:2: ( (lv_name_1_0= ruleEString ) )
            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:348:1: (lv_name_1_0= ruleEString )
            {
            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:348:1: (lv_name_1_0= ruleEString )
            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:349:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCarrierSetAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCarrierSet648);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCarrierSetRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:365:2: (otherlv_2= '//' ( (lv_comment_3_0= ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:365:4: otherlv_2= '//' ( (lv_comment_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleCarrierSet661); 

                        	newLeafNode(otherlv_2, grammarAccess.getCarrierSetAccess().getSolidusSolidusKeyword_2_0());
                        
                    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:369:1: ( (lv_comment_3_0= ruleEString ) )
                    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:370:1: (lv_comment_3_0= ruleEString )
                    {
                    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:370:1: (lv_comment_3_0= ruleEString )
                    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:371:3: lv_comment_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getCarrierSetAccess().getCommentEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCarrierSet682);
                    lv_comment_3_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCarrierSetRule());
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
    // $ANTLR end "ruleCarrierSet"


    // $ANTLR start "entryRuleConstant"
    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:395:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:396:2: (iv_ruleConstant= ruleConstant EOF )
            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:397:2: iv_ruleConstant= ruleConstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstant_in_entryRuleConstant720);
            iv_ruleConstant=ruleConstant();

            state._fsp--;

             current =iv_ruleConstant; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstant730); 

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
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:404:1: ruleConstant returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '//' ( (lv_comment_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_comment_3_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:407:28: ( ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '//' ( (lv_comment_3_0= ruleEString ) ) )? ) )
            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:408:1: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '//' ( (lv_comment_3_0= ruleEString ) ) )? )
            {
            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:408:1: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '//' ( (lv_comment_3_0= ruleEString ) ) )? )
            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:408:2: () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '//' ( (lv_comment_3_0= ruleEString ) ) )?
            {
            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:408:2: ()
            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:409:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getConstantAccess().getConstantAction_0(),
                        current);
                

            }

            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:414:2: ( (lv_name_1_0= ruleEString ) )
            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:415:1: (lv_name_1_0= ruleEString )
            {
            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:415:1: (lv_name_1_0= ruleEString )
            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:416:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getConstantAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleConstant785);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstantRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:432:2: (otherlv_2= '//' ( (lv_comment_3_0= ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==17) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:432:4: otherlv_2= '//' ( (lv_comment_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleConstant798); 

                        	newLeafNode(otherlv_2, grammarAccess.getConstantAccess().getSolidusSolidusKeyword_2_0());
                        
                    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:436:1: ( (lv_comment_3_0= ruleEString ) )
                    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:437:1: (lv_comment_3_0= ruleEString )
                    {
                    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:437:1: (lv_comment_3_0= ruleEString )
                    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:438:3: lv_comment_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstantAccess().getCommentEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleConstant819);
                    lv_comment_3_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConstantRule());
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
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleAxiom"
    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:462:1: entryRuleAxiom returns [EObject current=null] : iv_ruleAxiom= ruleAxiom EOF ;
    public final EObject entryRuleAxiom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAxiom = null;


        try {
            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:463:2: (iv_ruleAxiom= ruleAxiom EOF )
            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:464:2: iv_ruleAxiom= ruleAxiom EOF
            {
             newCompositeNode(grammarAccess.getAxiomRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAxiom_in_entryRuleAxiom857);
            iv_ruleAxiom=ruleAxiom();

            state._fsp--;

             current =iv_ruleAxiom; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAxiom867); 

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
    // $ANTLR end "entryRuleAxiom"


    // $ANTLR start "ruleAxiom"
    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:471:1: ruleAxiom returns [EObject current=null] : ( ( (lv_theorem_0_0= 'theorem' ) )? otherlv_1= '@' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '//' ( (lv_comment_4_0= ruleEString ) ) )? ( (lv_predicate_5_0= ruleEString ) ) ) ;
    public final EObject ruleAxiom() throws RecognitionException {
        EObject current = null;

        Token lv_theorem_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_comment_4_0 = null;

        AntlrDatatypeRuleToken lv_predicate_5_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:474:28: ( ( ( (lv_theorem_0_0= 'theorem' ) )? otherlv_1= '@' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '//' ( (lv_comment_4_0= ruleEString ) ) )? ( (lv_predicate_5_0= ruleEString ) ) ) )
            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:475:1: ( ( (lv_theorem_0_0= 'theorem' ) )? otherlv_1= '@' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '//' ( (lv_comment_4_0= ruleEString ) ) )? ( (lv_predicate_5_0= ruleEString ) ) )
            {
            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:475:1: ( ( (lv_theorem_0_0= 'theorem' ) )? otherlv_1= '@' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '//' ( (lv_comment_4_0= ruleEString ) ) )? ( (lv_predicate_5_0= ruleEString ) ) )
            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:475:2: ( (lv_theorem_0_0= 'theorem' ) )? otherlv_1= '@' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '//' ( (lv_comment_4_0= ruleEString ) ) )? ( (lv_predicate_5_0= ruleEString ) )
            {
            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:475:2: ( (lv_theorem_0_0= 'theorem' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:476:1: (lv_theorem_0_0= 'theorem' )
                    {
                    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:476:1: (lv_theorem_0_0= 'theorem' )
                    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:477:3: lv_theorem_0_0= 'theorem'
                    {
                    lv_theorem_0_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAxiom910); 

                            newLeafNode(lv_theorem_0_0, grammarAccess.getAxiomAccess().getTheoremTheoremKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAxiomRule());
                    	        }
                           		setWithLastConsumed(current, "theorem", true, "theorem");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAxiom936); 

                	newLeafNode(otherlv_1, grammarAccess.getAxiomAccess().getCommercialAtKeyword_1());
                
            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:494:1: ( (lv_name_2_0= ruleEString ) )
            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:495:1: (lv_name_2_0= ruleEString )
            {
            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:495:1: (lv_name_2_0= ruleEString )
            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:496:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAxiomAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAxiom957);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAxiomRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:512:2: (otherlv_3= '//' ( (lv_comment_4_0= ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==17) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:512:4: otherlv_3= '//' ( (lv_comment_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAxiom970); 

                        	newLeafNode(otherlv_3, grammarAccess.getAxiomAccess().getSolidusSolidusKeyword_3_0());
                        
                    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:516:1: ( (lv_comment_4_0= ruleEString ) )
                    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:517:1: (lv_comment_4_0= ruleEString )
                    {
                    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:517:1: (lv_comment_4_0= ruleEString )
                    // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:518:3: lv_comment_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAxiomAccess().getCommentEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAxiom991);
                    lv_comment_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAxiomRule());
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

            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:534:4: ( (lv_predicate_5_0= ruleEString ) )
            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:535:1: (lv_predicate_5_0= ruleEString )
            {
            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:535:1: (lv_predicate_5_0= ruleEString )
            // ../ac.soton.xtext.contextDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalContextDsl.g:536:3: lv_predicate_5_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAxiomAccess().getPredicateEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAxiom1014);
            lv_predicate_5_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAxiomRule());
            	        }
                   		set(
                   			current, 
                   			"predicate",
                    		lv_predicate_5_0, 
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
    // $ANTLR end "ruleAxiom"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleContext_in_entryRuleContext75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleContext85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleContext131 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleContext152 = new BitSet(new long[]{0x000000000001F002L});
        public static final BitSet FOLLOW_12_in_ruleContext165 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleContext186 = new BitSet(new long[]{0x000000000001E002L});
        public static final BitSet FOLLOW_13_in_ruleContext201 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleContext224 = new BitSet(new long[]{0x000000000001C032L});
        public static final BitSet FOLLOW_ruleEString_in_ruleContext247 = new BitSet(new long[]{0x000000000001C032L});
        public static final BitSet FOLLOW_14_in_ruleContext263 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleCarrierSet_in_ruleContext284 = new BitSet(new long[]{0x0000000000018032L});
        public static final BitSet FOLLOW_ruleCarrierSet_in_ruleContext305 = new BitSet(new long[]{0x0000000000018032L});
        public static final BitSet FOLLOW_15_in_ruleContext321 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleConstant_in_ruleContext342 = new BitSet(new long[]{0x0000000000010032L});
        public static final BitSet FOLLOW_ruleConstant_in_ruleContext363 = new BitSet(new long[]{0x0000000000010032L});
        public static final BitSet FOLLOW_16_in_ruleContext379 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_ruleAxiom_in_ruleContext400 = new BitSet(new long[]{0x00000000000C0002L});
        public static final BitSet FOLLOW_ruleAxiom_in_ruleContext421 = new BitSet(new long[]{0x00000000000C0002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString461 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCarrierSet_in_entryRuleCarrierSet583 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCarrierSet593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCarrierSet648 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_17_in_ruleCarrierSet661 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCarrierSet682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant720 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstant730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleConstant785 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_17_in_ruleConstant798 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleConstant819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAxiom_in_entryRuleAxiom857 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAxiom867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleAxiom910 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleAxiom936 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAxiom957 = new BitSet(new long[]{0x0000000000020030L});
        public static final BitSet FOLLOW_17_in_ruleAxiom970 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAxiom991 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAxiom1014 = new BitSet(new long[]{0x0000000000000002L});
    }


}