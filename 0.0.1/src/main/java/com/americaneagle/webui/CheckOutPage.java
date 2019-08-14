package com.americaneagle.webui;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.americaneagle.uiutils.Constants;
import com.americaneagle.uiutils.LoadProperties;

public class CheckOutPage {

	WebDriver driver;
	final static Logger logger = Logger.getLogger(CheckOutPage.class);

	public CheckOutPage(WebDriver driver) {
		this.driver = driver;
		this.driver.manage().timeouts().implicitlyWait(LoadProperties.getConfiguration().getTimeOut(),
				TimeUnit.SECONDS);
	}
	
	@FindBy(name = Constants.fName)
	WebElement fname;
	
	
	@FindBy(name = Constants.lName)
	WebElement lname;
	
	@FindBy(name = Constants.streetAddress)
	WebElement streetAddress;
	
	
	@FindBy(name = Constants.city)
	WebElement city;
	
	@FindBy(name = Constants.states)
	WebElement states;
	
	@FindBy(name = Constants.zipCode)
	WebElement postalCode;
	
	@FindBy(name = Constants.creditCardNo)
	WebElement cardNumber;
	
	
	@FindBy(name = Constants.creditExpiry)
	WebElement expirationDate;
	
	
	@FindBy(name = Constants.securityCode)
	WebElement securityCode;
	
	@FindBy(name = Constants.phoneNo)
	WebElement phoneNumber;
	
	@FindBy(name = Constants.contactEmail)
	WebElement email;
	
	@FindBy(name = Constants.placeOrder)
	WebElement placeOrder;
	
	
	
	public void checkout(String ccNumber, String cvv) 
	{
		PageUtils.waitForPage(driver, By.xpath(Constants.lName));
		
		fname.sendKeys("American");
		lname.sendKeys("eagle");
		streetAddress.sendKeys("7200 w . parmer ln ");
		city.sendKeys("Austin");
		
		Select stateList = new Select(states);
		stateList.selectByValue("TX");
		
		postalCode.sendKeys("78717");
	
		
		cardNumber.sendKeys(ccNumber);
		expirationDate.sendKeys("08/21");
		securityCode.sendKeys(cvv);
		phoneNumber.sendKeys("34323423345");
		email.sendKeys("test@test.com");
		placeOrder.click();
		
	}
	
	
	
}
