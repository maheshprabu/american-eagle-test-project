package com.americaneagle.uiutils;

public interface Constants {
	//Config Path
    public static final String CONFIG_FILE_PATH = System.getProperty("user.dir") + "/config/config.properties";
    public static final String Account="test";
    public static final String RecordType ="Donation";    
   
    // Driver locations 
    public static final String ChromeDriverLocation="drivers/chromedriver";
    public static final String GeckoFirefoxLocation="drivers/geckodriver";
    public static final String IEDriverLocation="drivers/IEDriverServer.exe";
    public static final String IEDriver="webdriver.ie.driver";
    public static final String ChromeDriver="webdriver.chrome.driver";
   
   
    //Home Page
    public static final String homeLink="//span[@class='slds-truncate'][contains(.,'Home')]";
    
    
    //Men apparels 
    public static final String MensPageLink="Men";
    
    public static final String ShopTops="//p[contains(text(),'TOPS')]";
    
    public static final String ImageSelectTops="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/a[1]/img[2]";
    
    public static final String SelectSize="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]";
    
    public static final String SelectItemSize = "(//a[@role='menuitem'])[3]";
    
    public static final String AddToBag="addToBag";
    
    public static final String ViewBag="viewBag";
    
    public static final String ProceedToCheckout="//div[contains(@class,'cart-buttons col-unpadded')]//button[text()='PROCEED TO CHECKOUT']";
    
    
    //Shipping Info 
    
    public static final String fName="firstname";
    
    public static final String lName="lastname";
    
    public static final String streetAddress="streetAddress";
    
    public static final String houseNo="//input[@id='ember8501-input']";
    
    public static final String city ="city";
    
    public static final String states ="states";
    
    public static final String zipCode="postalCode";
    
    
    
    //Payment Page 
    
    public static final String creditCardNo="cardNumber";
    
    public static final String creditExpiry="expirationDate";
    
    public static final String securityCode="securityCode";
    
    public static final String phoneNo="phoneNumber";
    
    public static final String contactEmail="email";
    
    //place order
    
    public static final String placeOrder="place-order";
  
    public static final String ThanksForYourOrder="//*[contains(text(),'THANKS FOR YOUR ORDER!')]";
    
  
}
