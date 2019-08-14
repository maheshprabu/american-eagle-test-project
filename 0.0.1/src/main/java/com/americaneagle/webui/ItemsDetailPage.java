package com.americaneagle.webui;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.americaneagle.uiutils.Constants;
import com.americaneagle.uiutils.LoadProperties;

public class ItemsDetailPage {

	WebDriver driver;
	final static Logger logger = Logger.getLogger(ItemsDetailPage.class);

	public ItemsDetailPage(WebDriver driver) {
		this.driver = driver;
		this.driver.manage().timeouts().implicitlyWait(LoadProperties.getConfiguration().getTimeOut(),
				TimeUnit.SECONDS);
	}
	
	@FindBy(xpath = Constants.SelectSize)
	WebElement selectSize;
	
	@FindBy(name = Constants.AddToBag)
	WebElement addtoBag;
	
	@FindBy(name = Constants.ViewBag)
	WebElement viewBag;
	

	@FindBy(xpath = Constants.ProceedToCheckout)
	WebElement proceedtoCheckout;
	
	
	@FindBy(xpath = Constants.SelectItemSize)
	WebElement selectItemSize;
	
	public CheckOutPage selectItem() 
	{
		PageUtils.waitForPage(driver, By.xpath(Constants.SelectSize));
		
		selectSize.click();
		
		
		selectItemSize.click();
		addtoBag.click();
		viewBag.click();
		
		proceedtoCheckout.click();
		
		return PageFactory.initElements(driver,CheckOutPage.class);
	}
	
	
}
