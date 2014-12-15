machine changeMe 			// My comment

variables var1 var2 var3 		// Some variables

invariants
@inv1 "var1 ∈ ℕ"
@lkmj "var2 ∈ ℕ"
@kuhf "var3 ∈ INT" 

events
event INITIALISATION
then
@act1 "var1 ≔ 0"
@kuh "var2 :∈ ℕ"
end

event evt1 					// an event
any q
where @grd1 "q > 5" @jhh "q < var1"
then
@act1 "var1 ≔ q + 1" @jyu "var2 :∈ ℕ"
end

end