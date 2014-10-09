
package body mwImplPkg is 
	protected body mwImpl is 
		procedure send(srcAmount_p:  in Integer; srcCommand_p:  in activity) is 
		begin 
			mwAmount := srcAmount_p;
			mwCommand := srcCommand_p;
		end send;
		procedure recv(mwAmount_p:  out Integer; mwCommand_p:  out activity) is 
		begin 
			mwAmount_p := mwAmount;
			mwCommand_p := mwCommand;
		end recv;
	end mwImpl;
end mwImplPkg;
