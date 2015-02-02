machine camilleTest0 > "got you
under my 
skin"
refines 
 camilleTest
sees 
 ctx2
variables 
 a > "aa"
 b > "bbb"
 c 
 refVar 
invariants 
 @inv1 "refVar ∈ ℕ"  
events 
 event INITIALISATION  extended ordinary 
 then
  @act1 "refVar ≔ 99" > "here and"
 end
 event kjh  extended ordinary > "back"
 refines
 camilleTest·kjh
 any
  r 
 where 
  @grd1 "r ∈ ℕ"  
 then
  @act1 "refVar ≔ r" 
 end
 event evt  extended ordinary 
 refines
 camilleTest·evt
 end
 event evt2b  extended ordinary 
 refines
 camilleTest·evt2
 end
end
