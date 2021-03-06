/*
* generated by Xtext
*/
package ac.soton.xtext.ui.labeling

import com.google.inject.Inject
import org.eventb.emf.core.machine.Machine

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
class MachineDslLabelProvider extends org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider {

	@Inject
	new(org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	// Labels and icons can be computed like this:
	
	 def text(Machine ele) {
		ele.name
	}

	def image(Machine ele) {
		'Machine.gif'
	}
}
