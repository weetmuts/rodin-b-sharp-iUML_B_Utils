package ac.soton.eventb.textout.core;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

/**
 * A Filter to hide all resource files, except for projects
 *
 */
public class HideDefaultResourcesFilter  extends ViewerFilter {

	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		if (element instanceof IResource) {
			if(element instanceof IFile){
				IFile file = (IFile) element;
				if(file.getFileExtension().equals("mch") || file.getFileExtension().equals("ctx")){
					return true;
				}
			}
			if (!(element instanceof IProject)) {
				return false;
			}
			
		}
		return true;
	}

}
