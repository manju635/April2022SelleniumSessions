package seleniumPackage1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {

static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		List<WebElement> links = driver.findElements(By.xpath("//aside[@id='column-right']//a"));
		System.out.println(links.size());
		for(WebElement e:links) {
			String linksText = e.getText();
			System.out.println(linksText);
		}
		
		By Login = By.linkText("Login");
		By Registration = By.linkText("Register");
		By ForgottenPassword = By.linkText("Forgotten Password");
		By MyAccount = By.linkText("My Account");
		By AddressBook = By.linkText("Address Book");
		By WishList = By.linkText("Wish List");
		By OrderHistory = By.linkText("Order History");
		
		ElementUtil etl=new ElementUtil(driver);
		System.out.println(etl.doGetElementAttribute(Login, "href"));
		System.out.println(etl.doGetElementAttribute(Registration, "href"));
		System.out.println(etl.doGetElementAttribute(ForgottenPassword, "href"));
		System.out.println(etl.doGetElementAttribute(MyAccount, "href"));
		System.out.println(etl.doGetElementAttribute(AddressBook, "href"));
		System.out.println(etl.doGetElementAttribute(WishList, "href"));
		System.out.println(etl.doGetElementAttribute(OrderHistory, "href"));
		
		

		List<WebElement> footerLinks = driver.findElements(By.xpath("//div[@class='col-sm-3']//a"));
		
		System.out.println(footerLinks.size());
		for(WebElement e:footerLinks) {
		String footerLinksText = e.getText();
		System.out.println(footerLinksText);
			
		}
	}

}
