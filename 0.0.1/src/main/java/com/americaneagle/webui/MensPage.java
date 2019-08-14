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

public class MensPage {

	
	WebDriver driver;
	final static Logger logger = Logger.getLogger(MensPage.class);

	public MensPage(WebDriver driver) {
		this.driver = driver;
		this.driver.manage().timeouts().implicitlyWait(LoadProperties.getConfiguration().getTimeOut(),
				TimeUnit.SECONDS);
	}
	
	@FindBy(xpath = Constants.ShopTops)
	WebElement shopTops;
	
	
	public TopsPage shopTops() 
	{
		PageUtils.waitForPage(driver, By.xpath(Constants.ShopTops));
		shopTops.click();
		return PageFactory.initElements(driver,TopsPage.class);
	}
	
	
	
	
}
