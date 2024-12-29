package seleniumPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		 driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//1. id
	//	driver.findElement(By.id("input-email")).sendKeys("manju@gmail.com");
	//	driver.findElement(By.id("input-password")).sendKeys("manju@123");
		
		//2nd 
		
	//	WebElement emailid = driver.findElement(By.id("input-email"));
	//	WebElement password = driver.findElement(By.id("input-password"));
		
	//	emailid.sendKeys("manju@gmail.com");
	//	password.sendKeys("manju@123");
		
		//3rd.---By locator approch ----OR(object repository)
		
//		By Emailid = By.id("input-email");
//		By Password= By.id("input-password");
//		
//	WebElement emailele = driver.findElement(Emailid);
//		WebElement passwordele = driver.findElement(Password);
//		
//		emailele.sendKeys("manju@gmail.com");
//		passwordele.sendKeys("manju@123");
//		
		
		
		// 4th approch----By locator+generic function of get webelement
		
//		By Emailid = By.id("input-email");
//     	By Password= By.id("input-password");
//		
//     	getElement(Emailid).sendKeys("manju@gmail.com");
//		getElement(Password).sendKeys("manju@123");
		
		//5th approch---By locator and generic function for webelement and actions
		
//				By Emailid = By.id("input-email");
//		     	By Password= By.id("input-password");
//				
//		doSendKeys(Emailid,"manju@gmail.com");
//		doSendKeys(Password,"manju@123");
//		
		
		//6th approch---By locator and generic function for webelement and actions in other util.
//		By Emailid = By.id("input-email");
//   	    By Password= By.id("input-password");
//   	
//   	    ElementUtil etl=new ElementUtil(driver);
//   	    etl.doSendKeys(Emailid, "manju@gmail.com");
//   	    etl.doSendKeys(Password, "manju@123");
   	
		
		//7th approch--Using utils in different class
		
		// 8th approch:  String locator+generic function for webelement and actions in other util.
		
              String email_id="input-email";
		      String Password_id="input-password";
		
		      
		      doSendKeys("id", email_id,"manju@gmail.com");
		      doSendKeys("id", Password_id,"manju@123");
		      
		      
		      
		      
}
	
	public static void doSendKeys(String locatorType, String Selector, String value){
		By locator = getByLocator(locatorType,Selector);
		getElement(locator).sendKeys(value);
		
	}
	
	
	public static By getByLocator(String locatorType,String Selector ) {
		
        By	locator = null;

    switch(locatorType.toLowerCase()) {
    case"id":
    	locator=By.id(Selector);
    	break;
    case"name":
    	locator=By.id(Selector);
    	break;
    case"classname":
    	locator=By.id(Selector);
    	break;
    	
    	default:
    		break;
    }
    return locator;
		
	}
	
	
	public static  WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
		
		
		
		public static void doSendKeys(By locator, String Value) {
			getElement(locator).sendKeys(Value);
		
		
		
		
	}

}
