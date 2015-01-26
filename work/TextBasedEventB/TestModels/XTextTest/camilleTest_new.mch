machine camilleTest_new > "a comment on a machine"
variables 
 a > "a variable comment"
 b > "b variable comment"
 c 
invariants 
 @aa "a ∈ ℕ"  > "aa invariant comment"
 @bb "b ∈ BOOL"  > "bb invariant comment"
 @cc "a ≥ 0"  
 @dd "c ∈ 0‥10"  
events 
 event INITIALISATION  ordinary 
 then
  @ll "a ≔ 0" 
  @jh "b ≔ TRUE" 
  @kjc "c ≔  10" 
 end
 event kjh  ordinary > "nnnnn"
 any
  p > "p parameter comment"
  q 
 where 
  @lkjh "p ∈ ℕ"  > "p guard comment"
  @jhhgjgh "q ∈ ℤ"  
 then
  @kjhk "a ≔ 0" > "a action comment"
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
  @mmm "a = 0"  
 then
  @nnn "b ≔ TRUE" 
  @ppp "a ≔ x" 
 end
end
