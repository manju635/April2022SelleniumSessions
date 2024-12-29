package seleniumPackage1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		
		By Search = By.name("q");
		By SuggListLocator = By.xpath("//ul[@role='listbox']//div[@class='wM6W7d']");
		performSearch(Search,"naveen automation labs",SuggListLocator,"youtube");
		
			}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendkeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static void performSearch(By search,String SearchKey,By SuggListLocator,String suggNam) throws InterruptedException {
		doSendkeys(search,SearchKey);
			Thread.sleep(3000);
			
			List<WebElement> suggList = driver.findElements(SuggListLocator);
			System.out.println("count of suggestion: "+suggList.size());
			
			for(WebElement e:suggList) {
				String SuggText = e.getText();
				System.out.println(SuggText);
				
				if(SuggText.contains(suggNam)) {
					e.click();
					break;
				}
		}
		
	}

}
