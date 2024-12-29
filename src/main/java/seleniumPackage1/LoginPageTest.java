package seleniumPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageTest {

	public static void main(String[] args) {
		
		BrowserUtil brutil=new BrowserUtil();
		WebDriver driver = brutil.initDriver("chrome");
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		System.out.println(brutil.getPageTitle());
		System.out.println(brutil.getPageUrl());
		
		ElementUtil etlUtil=new ElementUtil(driver);
		By Emailid = By.id("input-email");
   	    By Password= By.id("input-password");
		
		etlUtil.doSendKeys(Emailid, "manju@gmail.com");
		etlUtil.doSendKeys(Password, "manju@123");
		
		brutil.quitBrowser();
		
		

	}

}
