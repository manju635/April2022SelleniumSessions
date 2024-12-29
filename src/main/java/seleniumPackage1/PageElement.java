package seleniumPackage1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageElement {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	 
		//driver.findElement(By.name("search11")).sendKeys("mackbook");
		//No such element exception.
		
//		List<WebElement> links = driver.findElements(By.xpath("//aside[@id='column-right']//a11"));
//	     System.out.println(links.size());
       // Empty list exception
	     
//	     List<WebElement> searchlist = driver.findElements(By.name("search"));
//	     if(searchlist.size()==1) {
//	    	 System.out.println("search is present on the page");
//	     }
//	
//	     boolean flag = driver.findElement(By.name("search")).isDisplayed();
//	     System.out.println(flag);
//	

	By search = By.name("search");
	if(singleElementExist(search)) {
		System.out.println("Search exist one time on the page");
	}
	
	By forgotpwd = By.linkText("Forgotten Password");
	if(isElementExistMultipleTime(forgotpwd)){
		System.out.println("forgot password is having multiple display");
		if(getElementCount(forgotpwd)==2) {
			System.out.println("forgot password link is coming 2 times");
		}
		
	}
	
	
	
	
	}
 
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static int getElementCount(By locator) {
		int eleCount = getElements(locator).size();
		return eleCount;
	}
	
	public static boolean singleElementExist(By locator) {
		if(getElementCount(locator)==1) {
			return true;
		}
		return false;
	}
	
	public static boolean isElementExistMultipleTime(By locator) {
		if(getElementCount(locator)>1) {
			return true;
		}
		return false;
	}
}
