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

public class TopsPage {

	WebDriver driver;
	final static Logger logger = Logger.getLogger(TopsPage.class);

	public TopsPage(WebDriver driver) {
		this.driver = driver;
		this.driver.manage().timeouts().implicitlyWait(LoadProperties.getConfiguration().getTimeOut(),
				TimeUnit.SECONDS);
	}
	
	
	@FindBy(xpath = Constants.ImageSelectTops)
	WebElement imageSelectTops;
	
	public ItemsDetailPage itemsPage() 
	{
		PageUtils.waitForPage(driver, By.xpath(Constants.ImageSelectTops));
		imageSelectTops.click();
		return PageFactory.initElements(driver, ItemsDetailPage.class);
	}	
	
	
}
