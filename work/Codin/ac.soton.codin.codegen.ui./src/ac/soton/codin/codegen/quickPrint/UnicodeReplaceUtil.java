package ac.soton.codin.codegen.quickPrint;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eventb.codegen.templates.IGeneratorData;

import ac.soton.codin.codegen.basic.VHDL_TranslationData;
import ac.soton.codin.codegen.ui.CodinCGPlugin;

public class UnicodeReplaceUtil{

	private VHDL_TranslationData translationData;
	private final CharSequence NAT = "\u2115";
	private final CharSequence INT = "\u2124";
	private final CharSequence LAND = "\u2227";
	private final CharSequence LOR = "\u2228";
	private final CharSequence LNOT = "\u00AC";
	private final CharSequence NEQ = "\u2260";
	private final CharSequence LEQ = "\u2264";
	private final CharSequence GEQ = "\u2265";
	private final CharSequence UPTO = "\u2025";
	private final CharSequence MINUS = "\u2212";
	private final CharSequence MULT = "\u2217";
	private final CharSequence BCMEQ = "\u2254";
	
	public void run(VHDL_TranslationData translationData_) throws Exception {
		translationData = translationData_;

		
		IProject project = translationData.parentProject.getProject();
		project.refreshLocal(IResource.DEPTH_INFINITE, null);
		IFolder folder = project.getFolder(CodinCGPlugin.GENERATED_SRC_FOLDER);
		IResource[] fileResources = folder.members();

		for (int i = 0; i < fileResources.length; i++) {
			IResource resource = fileResources[i];
			List<String> tempStore = new ArrayList<>();
			String fileExtension = resource.getFileExtension();
			if (fileExtension != null
					&& fileExtension.equals(CodinCGPlugin.VHDL_EXT)) {
				replaceUnicode(folder, resource, tempStore);
			}
		}
	}

	private void replaceUnicode(IFolder folder, IResource resource,
			List<String> tempStore) throws CoreException, IOException {
		if (resource.getType() == IResource.FILE) {
			IFile resourceFile = (IFile) resource;
			URI uri = resourceFile.getRawLocationURI();
			File vhdlFile = new File(uri);

			FileReader reader = new FileReader(vhdlFile);
			BufferedReader bufferedReader = new BufferedReader(reader);
			String line = bufferedReader.readLine();
			while (line != null) {
				tempStore.add(line);
				line = bufferedReader.readLine();
			}
			bufferedReader.close();			
			removeUnicode(tempStore, vhdlFile);
		}
	}

	private void removeUnicode(List<String> tempStore, File vhdlFile) throws IOException {
		List<String> newCodeArray = new ArrayList<>();
		for (String originalString : tempStore) {
			if (originalString.contains(NAT)) {
				newCodeArray.add(originalString.replace(NAT, "Integer"));
			}
			else if (originalString.contains(INT)) {
				newCodeArray.add(originalString.replace(INT, "Integer"));
			}
			else if (originalString.contains(LAND)) {
				newCodeArray.add(originalString.replace(LAND, "and"));
			}
			else if (originalString.contains(LOR)) {
				newCodeArray.add(originalString.replace(LOR, "or"));
			}
			else if (originalString.contains(LNOT)) {
				newCodeArray.add(originalString.replace(LNOT, "not"));
			}
			else if (originalString.contains(NEQ)) {
				newCodeArray.add(originalString.replace(NEQ, "/="));
			}
			else if (originalString.contains(LEQ)) {
				newCodeArray.add(originalString.replace(LEQ, "<="));
			}
			else if (originalString.contains(GEQ)) {
				newCodeArray.add(originalString.replace(GEQ, ">="));
			}
			else if (originalString.contains(UPTO)) {
				newCodeArray.add(originalString.replace(UPTO, ".."));
			}
			else if (originalString.contains(MINUS)) {
				newCodeArray.add(originalString.replace(MINUS, "-"));
			}
			else if (originalString.contains(MULT)) {
				newCodeArray.add(originalString.replace(MULT, "*"));
			}
			else if (originalString.contains(BCMEQ)) {
				newCodeArray.add(originalString.replace(BCMEQ, ":="));
			}
			else {
				newCodeArray.add(originalString);
			}
		}
		FileWriter fw = new FileWriter(vhdlFile);
		BufferedWriter bw = new BufferedWriter(fw);
		for(String s: newCodeArray){
			bw.write(s+"\n");
		}
		
		bw.flush();
		bw.close();
		
	}
}
