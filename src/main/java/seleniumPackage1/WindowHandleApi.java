package seleniumPackage1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleApi {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
     
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentWindow = it.next();
		System.out.println(parentWindow);
		
		String childWindow = it.next();
		System.out.println(childWindow);
		
		driver.switchTo().window(childWindow);
		String twitterUrl = driver.getCurrentUrl();
		System.out.println(twitterUrl);
		
		String TwitterTitle = driver.getTitle();
		System.out.println(TwitterTitle);
		
		
		driver.close();
		
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
		
		
	}

}
