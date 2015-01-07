package ac.soton.xtext;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IFragmentProvider;

public class CustomFragmentProvider implements IFragmentProvider {

	@Override
	public String getFragment(EObject obj, Fallback fallback) {
		String fragment = fallback.getFragment(obj);
		return fragment;
	}

	@Override
	public EObject getEObject(Resource resource, String fragment,
			Fallback fallback) {
		EObject eObject = fallback.getEObject(fragment);
		return eObject;
	}

}
