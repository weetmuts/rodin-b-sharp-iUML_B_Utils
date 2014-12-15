machine m1 // a machine comment

variables a  b

invariants	
 @inv1 "a:INT" 
 @inv2 "b: BOOL"

events
 
event evt1 ordinary 
any p q
where 
@qgrd "q : NAT"
@pgrd "p : BOOL"
@grd1 "a > 0" 
@grd2 "b = FALSE"
then
@act1 "a := a + q"
end
 
event evt2 ordinary // comment
when
@grd3 "b=True" // comment 2
@act3 "b:=FALSE"
then  
@act4 "a := 0"
end		
		
end			
		
	
	

	
 
		
 
 