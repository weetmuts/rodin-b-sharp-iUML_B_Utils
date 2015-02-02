machine a 
variables 
 A  B  C  a  b  c 
invariants 
 @typeof_A "A ∈ BOOL"  
 @typeof_B "B ∈ BOOL"  
 @typeof_C "C ∈ BOOL"  
 @distinct_states_in_st1 "TRUE ∈ {A, B, C} ⇒ partition({TRUE}, {A} ∩ {TRUE}, {B} ∩ {TRUE}, {C} ∩ {TRUE})"  
 @aa "a ∈ ℕ"  
 @bb "b ∈ BOOL"  
 @cc "a ≥ 0"  theorem 
 @dd "c ∈ 0‥10"  
events 
 event INITIALISATION  ordinary 
 then
  @init_A "A ≔ TRUE" 
  @init_B "B ≔ FALSE" 
  @init_C "C ≔ FALSE" 
  @ll "a ≔ 0" 
  @jh "b ≔ TRUE" 
  @kjc "c ≔  10" 
 end
 event kjh  ordinary 
 any
  p  q 
 where 
  @lkjh "p ∈ ℕ"  
  @jhhgjgh "q∈ ℤ"  
 then
  @kjhk "a ≔ 0" 
  @jjj "c ≔ 0" 
 end
 event evt  ordinary 
 when 
  @hhh "a ≠ 0"  
  @jjj "a = 0"  
 then
  @opui "b ≔ FALSE" 
 end
 event evt2  ordinary 
 any
  x 
 where 
  @lll "x ∈ ℤ"  
  @mmm "	a = 0 "  
 then
  @nnn "b ≔ TRUE" 
  @ppp "c ≔ x  " 
 end
 event t1  ordinary 
 when 
  @st1_guards1 "⊤"  
  @isin_A "A = TRUE"  
 then
  @leave_A "A ≔ FALSE" 
  @st1_actions1 "a ≔ a + 1" 
  @enter_B "B ≔ TRUE" 
 end
 event t2  ordinary 
 when 
  @st1_guards2 "a > 100"  
  @isin_B "B = TRUE"  
 then
  @leave_B "B ≔ FALSE" 
  @st1_actions2 "b ≔ TRUE" 
  @enter_C "C ≔ TRUE" 
 end
 event t4  ordinary 
 when 
  @st1_guards3 "a ≤ 100"  
  @isin_B "B = TRUE"  
 then
  @leave_B "B ≔ FALSE" 
  @st1_actions3 "b ≔ FALSE" 
 end
 event t5  ordinary 
 when 
  @isin_C "C = TRUE"  
 then
  @leave_C "C ≔ FALSE" 
 end
end
