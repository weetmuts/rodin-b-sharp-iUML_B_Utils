
with SimpleDecomposition_Globals;
use SimpleDecomposition_Globals;
package mwImplPkg is 
	protected type mwImpl is 
		procedure send(srcAmount_p:  in Integer; srcCommand_p:  in activity);
		procedure recv(mwAmount_p:  out Integer; mwCommand_p:  out activity);
	end mwImpl;
end mwImplPkg;
