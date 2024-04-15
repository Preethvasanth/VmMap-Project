package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {
	public static FileInputStream fis;

	public static Properties getAPropertyFiles() {
		File file = new File(
				"C:\\Users\\Lenovo\\eclipse-workspace\\new workspace\\VmmapProject\\src\\main\\java\\com\\utility\\Vmmap.properties");
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties property = new Properties();
		try {
			property.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return property;
	}


}
