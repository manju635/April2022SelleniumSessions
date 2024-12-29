package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
    WebDriverManager.chromedriver().setup();
    driver= new ChromeDriver();
    driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

}
	
	@Test
	public void logo() {
		driver.findElement(By.xpath("//img[@title='naveenopencart']")).isDisplayed();
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void forgotPasswordLinkExisttest() {
		Assert.assertTrue(driver.findElement(By.linkText("Forgotten Password")).isDisplayed());
	}
	
	@Test
	public void loginNagativeTest() {
		driver.findElement(By.id("input-email")).sendKeys("testselenium@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("test@123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		String errorMessage = driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).getText().trim();
		
	System.out.println(errorMessage);
	Assert.assertEquals(errorMessage, "Warning: No match for E-Mail Address and/or Password.");
		
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}