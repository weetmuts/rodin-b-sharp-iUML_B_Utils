package ac.soton.codin.codegen.quickPrint;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eventb.codegen.templates.IGenerator;
import org.eventb.codegen.templates.IGeneratorData;

import ac.soton.codin.codegen.basic.VHDL_TranslationData;
import ac.soton.codin.codegen.ui.CodinCGPlugin;

public class ReplaceUnicode implements IGenerator {

	private VHDL_TranslationData translationData;
	private final CharSequence NAT = "\u2115";

	@Override
	public List<String> generate(IGeneratorData data) throws Exception {
		List<Object> dataList = data.getDataList();
		for (Object o : dataList) {
			if (o instanceof VHDL_TranslationData) {
				translationData = (VHDL_TranslationData) o;
				break;
			}
		}

		IProject project = translationData.parentProject.getProject();
		IFolder folder = project.getFolder(CodinCGPlugin.GENERATED_SRC_FOLDER);
		IResource[] fileResources = folder.members();

		for (int i = 0; i < fileResources.length; i++) {
			IResource resource = fileResources[i];
			List<String> tempStore = new ArrayList<>();
			String fileExtension = resource.getFileExtension();
			if (fileExtension != null
					&& fileExtension.equals(CodinCGPlugin.VHDL_EXT)) {
				return replaceUnicode(folder, resource, tempStore);
			}
		}
		return null;
	}

	private List<String> replaceUnicode(IFolder folder, IResource resource,
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
			return removeUnicode(tempStore);
		}
		return null;
	}

	private List<String> removeUnicode(List<String> tempStore) {
		List<String> newCodeArray = new ArrayList<>();
		for (String originalString : tempStore) {
			if (originalString.contains(NAT)) {
				newCodeArray.add(originalString.replace(NAT, "Integer"));
			} else {
				newCodeArray.add(originalString);
			}
		}
		return newCodeArray;
	}
}
