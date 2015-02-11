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
 event evt1  ordinary 
 end
 event evt2  ordinary 
 end
 
Statemachine "sm1" translation SINGLEVAR
nodes
 Initial,
 State "aa" ,
 State "bb"
transitions
 Transition elaborates "mch1·evt1" source "mch1·sm1·aa" target "mch1·sm1·bb"
  any p where "p ∈ ℕ"
  then @a1 "a ≔ p" 
  end
 
 Transition elaborates "mch1·evt2" source "mch1·sm1·bb" target "mch1·sm1·bb"  end
end	
 
end
