package com.test.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Util {
	
	public static String getProperty (String value) {
		String path = System.getProperty ("user.dir") + "/config.properties";
		Properties prop = new Properties();
		try {
			FileInputStream fs = new FileInputStream(path);
			prop.load(fs);
			value = prop.getProperty(value).trim();
			return value;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}
