/*
* generated by Xtext
*/
grammar InternalDsl;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package ac.soton.xtext.statemachine.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleStateMachine
entryRuleStateMachine returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getStateMachineRule()); }
	 iv_ruleStateMachine=ruleStateMachine 
	 { $current=$iv_ruleStateMachine.current; } 
	 EOF 
;

// Rule StateMachine
ruleStateMachine returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getStateMachineAccess().getStateMachineAction_0(),
            $current);
    }
)	otherlv_1='StateMachine' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getStateMachineAccess().getStateMachineKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getStateMachineAccess().getNameEStringParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStateMachineRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_3='Nodes' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getStateMachineAccess().getNodesKeyword_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getStateMachineAccess().getNodesAbstractNodeParserRuleCall_3_1_0()); 
	    }
		lv_Nodes_4_0=ruleAbstractNode		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStateMachineRule());
	        }
       		add(
       			$current, 
       			"Nodes",
        		lv_Nodes_4_0, 
        		"AbstractNode");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_5=',' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getStateMachineAccess().getCommaKeyword_3_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getStateMachineAccess().getNodesAbstractNodeParserRuleCall_3_2_1_0()); 
	    }
		lv_Nodes_6_0=ruleAbstractNode		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStateMachineRule());
	        }
       		add(
       			$current, 
       			"Nodes",
        		lv_Nodes_6_0, 
        		"AbstractNode");
	        afterParserOrEnumRuleCall();
	    }

)
))*)?(	otherlv_7='Transitions' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getStateMachineAccess().getTransitionsKeyword_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getStateMachineAccess().getTransitionsTransitionParserRuleCall_4_1_0()); 
	    }
		lv_Transitions_8_0=ruleTransition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStateMachineRule());
	        }
       		add(
       			$current, 
       			"Transitions",
        		lv_Transitions_8_0, 
        		"Transition");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_9=',' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getStateMachineAccess().getCommaKeyword_4_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getStateMachineAccess().getTransitionsTransitionParserRuleCall_4_2_1_0()); 
	    }
		lv_Transitions_10_0=ruleTransition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStateMachineRule());
	        }
       		add(
       			$current, 
       			"Transitions",
        		lv_Transitions_10_0, 
        		"Transition");
	        afterParserOrEnumRuleCall();
	    }

)
))*)?(	otherlv_11='StateMachines' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getStateMachineAccess().getStateMachinesKeyword_5_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getStateMachineAccess().getStateMachinesStateMachineParserRuleCall_5_1_0()); 
	    }
		lv_StateMachines_12_0=ruleStateMachine		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStateMachineRule());
	        }
       		add(
       			$current, 
       			"StateMachines",
        		lv_StateMachines_12_0, 
        		"StateMachine");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_13=',' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getStateMachineAccess().getCommaKeyword_5_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getStateMachineAccess().getStateMachinesStateMachineParserRuleCall_5_2_1_0()); 
	    }
		lv_StateMachines_14_0=ruleStateMachine		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStateMachineRule());
	        }
       		add(
       			$current, 
       			"StateMachines",
        		lv_StateMachines_14_0, 
        		"StateMachine");
	        afterParserOrEnumRuleCall();
	    }

)
))*)?	otherlv_15='End StateMachine' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getStateMachineAccess().getEndStateMachineKeyword_6());
    }
)
;





// Entry rule entryRuleAbstractNode
entryRuleAbstractNode returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAbstractNodeRule()); }
	 iv_ruleAbstractNode=ruleAbstractNode 
	 { $current=$iv_ruleAbstractNode.current; } 
	 EOF 
;

// Rule AbstractNode
ruleAbstractNode returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getAbstractNodeAccess().getStateParserRuleCall_0()); 
    }
    this_State_0=ruleState
    { 
        $current = $this_State_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAbstractNodeAccess().getInitialParserRuleCall_1()); 
    }
    this_Initial_1=ruleInitial
    { 
        $current = $this_Initial_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAbstractNodeAccess().getJunctionParserRuleCall_2()); 
    }
    this_Junction_2=ruleJunction
    { 
        $current = $this_Junction_2.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAbstractNodeAccess().getForkParserRuleCall_3()); 
    }
    this_Fork_3=ruleFork
    { 
        $current = $this_Fork_3.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAbstractNodeAccess().getJoinParserRuleCall_4()); 
    }
    this_Join_4=ruleJoin
    { 
        $current = $this_Join_4.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAbstractNodeAccess().getAnyParserRuleCall_5()); 
    }
    this_Any_5=ruleAny
    { 
        $current = $this_Any_5.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAbstractNodeAccess().getFinalParserRuleCall_6()); 
    }
    this_Final_6=ruleFinal
    { 
        $current = $this_Final_6.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleEString
entryRuleEString returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getEStringRule()); } 
	 iv_ruleEString=ruleEString 
	 { $current=$iv_ruleEString.current.getText(); }  
	 EOF 
;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_STRING_0=RULE_STRING    {
		$current.merge(this_STRING_0);
    }

    { 
    newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
    }

    |    this_ID_1=RULE_ID    {
		$current.merge(this_ID_1);
    }

    { 
    newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
    }
)
    ;





// Entry rule entryRuleTransition
entryRuleTransition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTransitionRule()); }
	 iv_ruleTransition=ruleTransition 
	 { $current=$iv_ruleTransition.current; } 
	 EOF 
;

// Rule Transition
ruleTransition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getTransitionAccess().getTransitionAction_0(),
            $current);
    }
)	otherlv_1='Transition' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getTransitionKeyword_1());
    }
(	otherlv_2='event' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getEventKeyword_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getTransitionAccess().getEventEStringParserRuleCall_2_1_0()); 
	    }
		lv_event_3_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTransitionRule());
	        }
       		set(
       			$current, 
       			"event",
        		lv_event_3_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_4='source' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getSourceKeyword_3_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getTransitionRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getTransitionAccess().getSourceAbstractNodeCrossReference_3_1_0()); 
	    }
		ruleEString		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_6='target' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getTargetKeyword_4_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getTransitionRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getTransitionAccess().getTargetAbstractNodeCrossReference_4_1_0()); 
	    }
		ruleEString		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))?)
;





// Entry rule entryRuleState
entryRuleState returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getStateRule()); }
	 iv_ruleState=ruleState 
	 { $current=$iv_ruleState.current; } 
	 EOF 
;

// Rule State
ruleState returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getStateAccess().getStateAction_0(),
            $current);
    }
)	otherlv_1='State' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getStateAccess().getStateKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStateRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_3='nested' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getStateAccess().getNestedKeyword_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getStateAccess().getNestedStateMachineParserRuleCall_3_1_0()); 
	    }
		lv_nested_4_0=ruleStateMachine		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStateRule());
	        }
       		set(
       			$current, 
       			"nested",
        		lv_nested_4_0, 
        		"StateMachine");
	        afterParserOrEnumRuleCall();
	    }

)
))?)
;





// Entry rule entryRuleInitial
entryRuleInitial returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getInitialRule()); }
	 iv_ruleInitial=ruleInitial 
	 { $current=$iv_ruleInitial.current; } 
	 EOF 
;

// Rule Initial
ruleInitial returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getInitialAccess().getInitialAction_0(),
            $current);
    }
)	otherlv_1='Initial' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getInitialAccess().getInitialKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getInitialAccess().getNameEStringParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getInitialRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleJunction
entryRuleJunction returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getJunctionRule()); }
	 iv_ruleJunction=ruleJunction 
	 { $current=$iv_ruleJunction.current; } 
	 EOF 
;

// Rule Junction
ruleJunction returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getJunctionAccess().getJunctionAction_0(),
            $current);
    }
)	otherlv_1='Junction' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getJunctionAccess().getJunctionKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getJunctionAccess().getNameEStringParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getJunctionRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleFork
entryRuleFork returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getForkRule()); }
	 iv_ruleFork=ruleFork 
	 { $current=$iv_ruleFork.current; } 
	 EOF 
;

// Rule Fork
ruleFork returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getForkAccess().getForkAction_0(),
            $current);
    }
)	otherlv_1='Fork' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getForkAccess().getForkKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getForkAccess().getNameEStringParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getForkRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleJoin
entryRuleJoin returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getJoinRule()); }
	 iv_ruleJoin=ruleJoin 
	 { $current=$iv_ruleJoin.current; } 
	 EOF 
;

// Rule Join
ruleJoin returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getJoinAccess().getJoinAction_0(),
            $current);
    }
)	otherlv_1='Join' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getJoinAccess().getJoinKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getJoinAccess().getNameEStringParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getJoinRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleAny
entryRuleAny returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAnyRule()); }
	 iv_ruleAny=ruleAny 
	 { $current=$iv_ruleAny.current; } 
	 EOF 
;

// Rule Any
ruleAny returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getAnyAccess().getAnyAction_0(),
            $current);
    }
)	otherlv_1='Any' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getAnyAccess().getAnyKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAnyAccess().getNameEStringParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAnyRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleFinal
entryRuleFinal returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFinalRule()); }
	 iv_ruleFinal=ruleFinal 
	 { $current=$iv_ruleFinal.current; } 
	 EOF 
;

// Rule Final
ruleFinal returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getFinalAccess().getFinalAction_0(),
            $current);
    }
)	otherlv_1='Final' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getFinalAccess().getFinalKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getFinalAccess().getNameEStringParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFinalRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


