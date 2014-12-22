machine aa
variables a b c
invariants
 @aa "a : NAT"
 @bb "b : BOOL"
 @cc "a >= 0" theorem
 @dd "c : 0..10"
 
events 
event INITIALISATION
then @ll "a := 0"
@jh "b:= TRUE"
@kjc "c :=  10"
end

event kjh //nnnnn
any p q
where @lkjh "p : NAT" @jhhgjgh "q: INT" 
then @kjhk "a := 0"
@jjj "c := 0"
end

event evt 
when
@hhh "a /= 0" 
@jjj "a = 0"
then 
@opui "b := FALSE" 
end

event evt2 
any x 
where
@lll "x: INT"
@mmm "a = 0"
then
@nnn "b := TRUE"
@ppp "a :=x "
end

end
