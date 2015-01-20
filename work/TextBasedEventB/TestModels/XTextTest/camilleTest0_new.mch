machine camilleTest0_new // My Comment
refines 
 camilleTest_new 
sees 
 ctx2_new
variables 
 a  b  c  refVar 
invariants 
 @inv1 "refVar ∈ ℕ"  
events 
 event INITIALISATION  extended ordinary 
 then
  @act1 "refVar ≔ 99" 
 end
 event kjh  extended ordinary // nnnnn
 refines
  camilleTest_new.kjh
 any
  r 
 where 
  @grd1 "r ∈ ℕ"  
 then
  @act1 "refVar ≔ r" 
 end
 event evt  extended ordinary 
 refines
 camilleTest_new.evt
 end
 event evt2b  extended ordinary 
 refines
 camilleTest_new.evt2
 end
end
