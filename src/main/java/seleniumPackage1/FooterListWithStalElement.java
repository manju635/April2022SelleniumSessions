package seleniumPackage1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FooterListWithStalElement {

public static void main(String args[]) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		List<WebElement> footerlist = driver.findElements(By.cssSelector("footer a"));
		for(WebElement e:footerlist) {
			e.click();
			driver.navigate().back();
			footerlist = driver.findElements(By.cssSelector("footer a"));
		}

	}

}
