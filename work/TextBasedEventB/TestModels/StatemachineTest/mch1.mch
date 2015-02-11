machine mch1
extensions
{
	
} 
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
end
