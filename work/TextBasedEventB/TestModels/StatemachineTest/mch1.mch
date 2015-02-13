machine mch1 
variables 
 a  b 
invariants 
 @i1 "a ∈ ℤ"  
 @i2 "b ∈ ℕ"  
events 
 event INITIALISATION  ordinary 
 then
  @act1 "a :∈ ℤ" 
  @act2 "b ≔ 0" 
 end
 event evt1  ordinary > "event1"
 end
 event evt2  ordinary > "event2"
 end
 event evt3  ordinary > "event3"
 end
end
