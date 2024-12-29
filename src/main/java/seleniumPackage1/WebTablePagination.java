package seleniumPackage1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTablePagination {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
     
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		Thread.sleep(3000);
		//singleselection
//		while(true) {
//			if(driver.findElements(By.xpath("//td[text()='Naveen']")).size()>0) {
//				
//				selectCountry("Naveen");
//				break;
//			}
//			else {
//				WebElement next = driver.findElement(By.id("tablepress-1_next"));	
//			if(next.getAttribute("class").contains("disabled")) {
//				System.out.println("Pagination is over..........country is not found");
//				break;
//			}
//			next.click();
//			Thread.sleep(1000);
			
			//}
					
		
		//}
		// multiplecheckboxselection
		while(true) {
			if(driver.findElements(By.xpath("//td[text()='India']")).size()>0) {
				selectmultiplecgeckbox("India");
			}
			//pagination logic
			WebElement next = driver.findElement(By.linkText("Next"));	
			if(next.getAttribute("class").contains("disabled")) {
				System.out.println("Pagination is over..........country is not found");
				break;
			}
		next.click();
			Thread.sleep(1000);
			
			}
		}
	
			public static void selectmultiplecgeckbox(String country) {
			List<WebElement> elelist = driver.findElements(By.xpath("(//td[text()='"+country+"'])/preceding-sibling::td/input[@type='checkbox']"));
				for(WebElement e:elelist) {
					e.click();
				}
			}
				
		public static void selectCountry(String country) {
			driver.findElement(By.xpath("//td[text()='"+country+"']/preceding-sibling::td/input[@type='checkbox']")).click();
			
		}	
		
	}


