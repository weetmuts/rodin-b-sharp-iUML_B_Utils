/*
 * generated by Xtext
 */
package ac.soton.xtext.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.IXtextEditorCallback;

/**
 * Use this class to register components to be used within the IDE.
 */
public class MachineDslUiModule extends ac.soton.xtext.ui.AbstractMachineDslUiModule {
	public MachineDslUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	public Class<? extends IXtextEditorCallback> bindIXtextEditorCallback() {		
		return CustomXtextEditorCallback.class;
	}
	
}
