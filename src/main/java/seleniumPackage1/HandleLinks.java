package seleniumPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleLinks {
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
	//6th locator : linktext
		
		//driver.findElement(By.linkText("Register")).click();
		
//		By link = By.linkText("Register");
//		ElementUtil etl=new ElementUtil(driver);
//		etl.doClick(link);
//		
		String reg_linktext ="Register";
		ElementUtil etl=new ElementUtil(driver);
		etl.doClick("linktext", reg_linktext);
		
		
	//7th : partialLinkText
		
		
		
	}

}
