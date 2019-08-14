package com.americaneagle.uiutils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class BrowserFactory {

	 

	public static WebDriver startBrowser()
	{
		
		WebDriver driver=null;
		
		

		
		Configuration config = LoadProperties.getConfiguration();
		driver= config.getDriver();
		driver.manage().window().maximize();
		driver.get(config.getBaseURL());
		return driver;
	}
}
