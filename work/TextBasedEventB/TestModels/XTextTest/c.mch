machine c 
variables 
 var1 
invariants 
 @inv1 "var1 ∈ ℕ"  
events 
 event INITIALISATION  ordinary 
 then
  @act1 "var1 ≔ 0" 
 end
 event evt1  ordinary 
 any
  q 
 where 
  @grd1 "q > 5"  
 then
  @act1 "var1 ≔ q + 1" 
 end
end
