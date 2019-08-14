package com.americaneagle.uiutils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;



public class Utils {
	final static Logger logger = Logger.getLogger(Utils.class);

	public static String appUrl = null;

	static {
		getConfiguration();
	}

	private static void getConfiguration() {
		Properties properties = new Properties();
		properties = readConfigFile(Constants.CONFIG_FILE_PATH);
		appUrl = (String) properties.get("loginUrl");
	}

	public static Properties readConfigFile(String file) {
		InputStream input = null;
		Properties properties = new Properties();
		try {
			input = new FileInputStream(file);
			properties.load(input);
		} catch (IOException ex) {
			logger.error("Error occured while reading property file" + ex.getMessage());
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					logger.error("Error occured while reading property file" + e.getMessage());
				}
			}
		}
		return properties;
	}
}
