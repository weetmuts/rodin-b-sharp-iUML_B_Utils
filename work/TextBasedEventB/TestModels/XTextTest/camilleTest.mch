machine camilleTest // comment  1
variables 
 a // comment 2
 b 
 c // comment 3
invariants 
 @aa "a ∈ ℕ"  // comment 4
 @bb "b ∈ BOOL"  
 @cc "a ≥ 0"  
 @dd "c ∈ 0‥10"  
events 
 event INITIALISATION  ordinary 
 then
  @ll "a ≔ 0" 
  @jh "b≔ TRUE" 
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
  @lll "x∈ ℤ"  
  @mmm "a = 0"  
 then
  @nnn "b ≔ TRUE" 
  @ppp "a ≔x" 
 end
end
