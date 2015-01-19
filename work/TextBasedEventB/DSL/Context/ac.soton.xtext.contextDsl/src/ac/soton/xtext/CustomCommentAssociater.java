package ac.soton.xtext;

import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.parsetree.reconstr.impl.AbstractCommentAssociater;

public class CustomCommentAssociater extends AbstractCommentAssociater {

	@Override
	public Map<ILeafNode, EObject> associateCommentsWithSemanticEObjects(
			EObject model, Set<ICompositeNode> roots) {
		
		return null;
	}

}
