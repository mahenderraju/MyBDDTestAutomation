package com.mktrip.utilities;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class ReadConfig {
	public static String readProjectConfig(String key) throws Exception {
		FileReader file = new FileReader(new File("ConfigFiles/ProjectConfig.properties"));
		Properties property = new Properties();
		property.load(file);
		return property.getProperty(key);
	}

}
