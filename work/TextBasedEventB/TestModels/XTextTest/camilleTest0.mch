machine camilleTest0 
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
  @act1 "refVar ≔ 99" 
 end
 event kjh  extended ordinary // nnnnn
 any
  r 
 where 
  @grd1 "r ∈ ℕ"  
 with
  @wit1 "⊤" 
 then
  @act1 "refVar ≔ r" 
 end
 event evt  extended ordinary 
 end
 event evtr  extended ordinary
 refines "camilleTest.evt2" 
 end
end
