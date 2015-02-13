machine mch1r 
refines 
 mch1
variables 
 a  b 
events 
 event INITIALISATION  extended ordinary 
 end
event "evt1"
refines mch1·evt1
end

event "evt2"
refines mch1·evt2
end

event "evt3"
refines mch1·evt3
end
end
