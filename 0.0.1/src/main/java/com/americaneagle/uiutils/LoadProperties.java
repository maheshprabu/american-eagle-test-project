package com.americaneagle.uiutils;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LoadProperties {
	public static Configuration config = new Configuration();
	static Properties properties = new Properties();
	final static Logger logger = Logger.getLogger(LoadProperties.class);
	static {
		setConfiguration();
	}

	private static void setConfiguration() {
		properties =Utils.readConfigFile(Constants.CONFIG_FILE_PATH);
		
	    config.setTimeOut(Integer.parseInt(properties.getProperty("timeout")));
		config.setDriver(getWebDriver(properties.getProperty("browser")));
		config.setBaseURL(properties.getProperty("baseUrl"));
		
	}

	public static Configuration getConfiguration() {
		return config;
	}

	private static WebDriver getWebDriver(String browser) {
		if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",Constants.GeckoFirefoxLocation);
			logger.debug("selecting firefox driver for operation");
			return new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty(Constants.ChromeDriver,Constants.ChromeDriverLocation);
			logger.debug("selecting chrome driver for operation");
			return new ChromeDriver();
		}
		return null;
	}

}
