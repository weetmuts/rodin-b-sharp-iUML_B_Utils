machine camilleTest0 > "got you
ljklk"
refines 
 camilleTest
sees 
 ctx2
variables 
 a  b  c  refVar 
invariants 
 @inv1 "refVar ∈ ℕ"  
events 
 event INITIALISATION  extended ordinary 
 then
  @act1 "refVar ≔ 99" > "here and"
 end
 event kjh  extended ordinary > "back"
 refines
 camilleTest.kjh
 any
  r 
 where 
  @grd1 "r ∈ ℕ"  
 then
  @act1 "refVar ≔ r" 
 end
 event evt  extended ordinary 
 refines
 camilleTest.evt
 end
 event evt2  extended ordinary 
 refines
 camilleTest.evt2
 end
end
