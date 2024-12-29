package seleniumPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com/");
		
	//	System.out.println("convert small letters to capital letters---------");
//		WebElement search = driver.findElement(By.name("q"));
//		
//		Actions act=new Actions(driver);
//		act.keyDown(search, Keys.SHIFT).sendKeys("naveen automation labs").build().perform();

//		System.out.println("copy paste -----------------");
//		
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		
//		WebElement email = driver.findElement(By.id("input-email"));
//		
//	WebElement password = driver.findElement(By.id("input-password"));
//	
//	email.sendKeys("manju");
//	
//	Actions act=new Actions(driver);
//	act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
//	act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
//	
//	password.click();
//	act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
//	
		driver.get("https://www.amazon.com/");
		
		Actions act=new Actions(driver);
		// scroll down using actions class
		//act.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		
	//	Thread.sleep(1000);
		// scroll Up using actions class.
	//	act.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
		
		
		// Refresh the page-----
		//act.keyDown(Keys.CONTROL).sendKeys("r").keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.CONTROL).sendKeys(Keys.F5).keyUp(Keys.CONTROL).perform();
		
		
		
	
		
	}

}
