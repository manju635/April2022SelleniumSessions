package seleniumPackage1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlert {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		//driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		
		Thread.sleep(4000);
		
		Alert alert=driver.switchTo().alert();
		
		System.out.println(alert.getText());
		alert.sendKeys("testing");
		
		alert.accept();
		//alert.dismiss();
		
		
		
		

	}

}
