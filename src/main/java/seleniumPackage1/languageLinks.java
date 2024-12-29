package seleniumPackage1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class languageLinks {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		
//		String text = driver.findElement(By.id("SIvCob")).getText();
//		System.out.println(text);
             // or
		
//		List<WebElement> langlinks = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
//		System.out.println(langlinks.size());
//		for(WebElement e:langlinks) {
//			String text = e.getText();
//			System.out.println(text);
//			if(text.contains("मराठी")) {
//				e.click();
//				break;
//			}
//		}
		
		
//		String text1 = driver.findElement(By.xpath("//div[@class='KxwPGc SSwjIe']")).getText();
//		System.out.println(text1);
		
		//or
		
		List<WebElement> footer_links = driver.findElements(By.xpath("//div[@class='KxwPGc SSwjIe']//a"));
	System.out.println(footer_links.size());
	for(WebElement e:footer_links) {
		String text = e.getText();
		System.out.println(text);
		if(text.contains("settings")) {
			e.click();
			break;
		}
		
	}
	
	
	
	}

}
