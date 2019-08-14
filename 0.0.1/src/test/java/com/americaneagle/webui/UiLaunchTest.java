package com.americaneagle.webui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.americaneagle.uiutils.BrowserFactory;
import com.americaneagle.uiutils.Constants;

public class UiLaunchTest {

	WebDriver driver = null;

	@BeforeClass
	public void beforeClass() {
		driver = BrowserFactory.startBrowser();
	}


	@DataProvider(name = "ccdata")  
	public Object[][] dataProviderMethod() {  
	return new Object[][] { { "4111 1111 1111 1111","111" }, { "5111 1111 1111 1111","111" } };  
	}  
	
	
	
	@Test(dataProvider="ccdata")
	public void test(String ccNumber, String cvv) {

		
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);

		MensPage mp = homePage.shopMens();

		TopsPage tp = mp.shopTops();

		ItemsDetailPage itemsdetailpage = tp.itemsPage();

		CheckOutPage copage = itemsdetailpage.selectItem();

		copage.checkout(ccNumber,cvv);
		
		List<WebElement> list = driver.findElements(By.xpath(Constants.ThanksForYourOrder));  
		Assert.assertTrue( list.size() > 0,"Text not found!");
		
	}

	
	
	@AfterTest
	public void quitDriver() {

		driver.quit();
	}

}
