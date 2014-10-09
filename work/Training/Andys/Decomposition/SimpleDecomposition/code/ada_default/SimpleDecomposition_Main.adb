with SimpleDecomposition_Globals, mwImplPkg, mwImplPkg;
use SimpleDecomposition_Globals, mwImplPkg, mwImplPkg;
procedure SimpleDecomposition_Main is 
	mwImplInst: mwImpl;
	task srcImpl is 
		pragma priority(5);
	end srcImpl;
	task body srcImpl is 
	begin 
		mwImplInst.send(srcAmount, srcCommand);
	end srcImpl;
	task targetImpl is 
		pragma priority(5);
	end targetImpl;
	task body targetImpl is 
	begin 
		mwImplInst.recv(destAmount, destCommand);
	end targetImpl;
begin 
	null; 
end SimpleDecomposition_Main;
