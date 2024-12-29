package seleniumPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleTagName {

static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		
//	String text=	driver.findElement(By.tagName("h1")).getText();
//	System.out.println(text);

//	By text = By.tagName("h1");
//	
//	ElementUtil etl=new ElementUtil(driver);
//	 String productheader = etl.doGetElementtext(text);
//	if(productheader.equals("MackBook")) {
//		System.out.println("product name is correct----------pass");
//	}
//	
//	else {
//		System.out.println("test fail");
//	}
	
	
	 By linktext = By.linkText("Contact Sales");
	
	 ElementUtil etl=new ElementUtil(driver);
	 String buttontext = etl.doGetElementtext(linktext);
	 System.out.println(buttontext);
	}

}
