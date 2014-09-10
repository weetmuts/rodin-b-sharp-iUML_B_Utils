package SimpleDecomposition_Globals is 
	type activity is (credit, debit);
	for activity use 
	(credit => 0, debit=>1);
end SimpleDecomposition_Globals;
