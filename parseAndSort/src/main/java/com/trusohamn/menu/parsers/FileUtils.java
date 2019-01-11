package com.trusohamn.menu.parsers;

import java.io.File;

public class FileUtils {
	/**
	 * @param fileName
	 * @return File from resourses folder
	 */
	public File getFileFromResources(String fileName) {
		File file = new File(getClass().getClassLoader().getResource(fileName).getFile());
		return file;
	}

	/**
	 * @param file
	 * @return extension of the File
	 */
	public static String getFileExtension(File file) {
		String filename = file.getName();
		int lastIndexOf = filename.lastIndexOf(".");
		if (lastIndexOf == -1) return "";
		return filename.substring(lastIndexOf);
	}


}
