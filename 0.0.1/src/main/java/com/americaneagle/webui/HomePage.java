package com.americaneagle.webui;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.americaneagle.uiutils.Constants;
import com.americaneagle.uiutils.LoadProperties;


public class HomePage {

	WebDriver driver;
	final static Logger logger = Logger.getLogger(HomePage.class);

	public HomePage(WebDriver driver) {
		this.driver = driver;
		this.driver.manage().timeouts().implicitlyWait(LoadProperties.getConfiguration().getTimeOut(),
				TimeUnit.SECONDS);
	}
	
	@FindBy(linkText = Constants.MensPageLink)
	WebElement menlink;
	

	
	public MensPage shopMens() 
	{
		PageUtils.waitForPage(driver, By.linkText(Constants.MensPageLink));
		menlink.click();
		return PageFactory.initElements(driver,MensPage.class);
	}
}
