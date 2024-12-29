package seleniumPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PraticeAutomationSearch {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		
//		By Search = By.id("search_query_top");
//		By Even_sugg = By.xpath("//div[@class='ac_results']//li[@class='ac_even']");
//		By Odd_sugg = By.xpath("//div[@class='ac_results']//li[@class='ac_odd']");
//		ElementUtil etl=new ElementUtil(driver);
//		
//		etl.performSearch(Search, "dress", Even_sugg, "Casual Dresses > Printed ");
//		etl.performSearch(Search, "dress", Odd_sugg, "T-shirts > Faded Short Sleeve T-shirts");

		
		driver.findElement(By.id("search_query_top")).sendKeys("dress");
		Thread.sleep(3000);
		
		selectItem("T-shirts > Faded Short Sleeve T-shirts");
		
		
	}
	
	public static void selectItem(String productname) {
		driver.findElement(By.xpath("//li[text()='"+productname+"']")).click();
		
	}

}
