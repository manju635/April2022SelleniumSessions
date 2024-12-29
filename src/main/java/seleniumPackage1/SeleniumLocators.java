package seleniumPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumLocators {
	
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
		//1. id
		
		//2nd. Name
	//	driver.findElement(By.id("email")).sendKeys("manju@gmail.com");
	//	driver.findElement(By.id("password")).sendKeys("manju@123");
		
//	By emial = By.name("email");
//	String Email_name="email";
//	
//	By password = By.name("password");
//	String password_name ="password";
//	
//	ElementUtil etl=new ElementUtil(driver);
//	etl.doSendKeys(emial, "manju@gmail.com");
//	etl.doSendKeys("name", password_name, "manju@123");
	
	
	
	//3d. Class name: it can be duplicate for multiple elements, so use if it is unique.
	//driver.findElement(By.className(""));
	
	
	//4. Xpath:  it is not a attribut. it is a address of an element in HTML dom.
	
//	driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("manju@gmail.com");
//	
//	driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("manju@123");
	
	
//		By email = By.xpath("//*[@id=\"input-email\"]");
//		String password_xpath="//*[@id=\"input-password\"]";
//		By loginbtn = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
//		
//		
//		ElementUtil etl=new ElementUtil(driver);
//		etl.doSendKeys(email, "manju@gmail.com");
//		etl.doSendKeys("xpath", password_xpath, "manju@123");
//		etl.doClick(loginbtn);
//		
		
		//6th : cssSelector-
		
		//driver.findElement(By.cssSelector("#input-email")).sendKeys("manju@gmail.com");
		//driver.findElement(By.cssSelector("#input-password")).sendKeys("manju@123");
		
		By email = By.cssSelector("#input-email");
		ElementUtil etl=new ElementUtil(driver);
		etl.doSendKeys(email, "manju@gmail.com");
		
	
	}

}
