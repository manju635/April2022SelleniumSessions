package seleniumPackage1;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SVGElements {

	public static void main(String[] args) throws InterruptedException {
		//   //*[local-name()='svg']/*[name()='g' and @fill-rule='evenodd']
		//  //*[name()='g' and @fill-rule='evenodd']
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map/#/");
		Thread.sleep(5000);
		
	List<WebElement> states = driver.findElements(By.xpath("//*[local-name()='svg' and @id='map-svg']//*[name()='g' and  @id='states']//*[name()='path']"));
	System.out.println(states.size());
	
	Actions act= new Actions(driver);
	for(WebElement e:states) {
		String name=e.getAttribute("name");
		System.out.println(name);
		if(name.equals("Texas")) {
			act.click(e).perform();
			System.out.println("done");
			break;
		}
	}

	}

}
