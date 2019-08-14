package com.americaneagle.webui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.americaneagle.uiutils.LoadProperties;


public class PageUtils {
	
	public static void waitForPage(WebDriver driver, By object) {
		WebDriverWait wait = new WebDriverWait(driver, LoadProperties.getConfiguration().getTimeOut());
		wait.until(ExpectedConditions.elementToBeClickable(object));
	}
}
	