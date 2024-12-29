package seleniumPackage1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttributeListConcept {

static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		// find total no. of links and return href value.
		
		
//		List<WebElement> linksList = driver.findElements(By.tagName("a"));
//		
//		for(WebElement e:linksList) {
//			String hrefvalue = e.getAttribute("href");
//			System.out.println(hrefvalue);
//		}
		
		By linklist = By.tagName("a");
		By imageList = By.tagName("img");
		
		ElementUtil etl=new ElementUtil(driver);
		System.out.println(etl.GetEleAttributeList(linklist, "href"));
		System.out.println(etl.GetEleAttributeList(imageList, "alt"));
		
		
	}

}
