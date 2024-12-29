package seleniumPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationForm {
	
static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//for labels
	By Firstname_lable = By.xpath("//*[@id=\"account\"]/div[2]/label");
	By lastname_lable = By.xpath("//*[@id=\"account\"]/div[3]/label");
	By Email_lable = By.xpath("//*[@id=\"account\"]/div[4]/label");
	By Telipjone_lable = By.xpath("//*[@id=\"account\"]/div[5]/label");
	By password_lable = By.xpath("//*[@id=\"content\"]/form/fieldset[2]/div[1]/label");
	By confirmpassword_lable = By.xpath("//*[@id=\"content\"]/form/fieldset[2]/div[2]/label");
		
	// for input and attribute value	
		By firstname = By.id("input-firstname");
		By lastname = By.id("input-lastname");
		By emailid = By.id("input-email");
		By telephone = By.id("input-telephone");
		By password = By.id("input-password");
		By confirmpassword = By.id("input-confirm");
		
		ElementUtil etl=new ElementUtil(driver);
		
	etl.doSendKeys(firstname, "manju");
	String firstnametext=etl.doGetElementtext(Firstname_lable);
	String firstnameAttribute =etl.doGetElementAttribute(firstname, "placeholder");
		System.out.println(firstnametext);
		System.out.println(firstnameAttribute);
		
		etl.doSendKeys(lastname, "Tyagi");
		String lastnameText = etl.doGetElementtext(lastname_lable);
	String lastnameAttribute=	etl.doGetElementAttribute(lastname, "placeholder");
		System.out.println(lastnameText);
		System.out.println(lastnameAttribute);
		
		
		etl.doSendKeys(emailid, "manju@gmail.com");
		String emailText = etl.doGetElementtext(Email_lable);
		String emailAttribute=	etl.doGetElementAttribute(emailid, "placeholder");
			System.out.println(emailText);
			System.out.println(emailAttribute);
			
			etl.doSendKeys(telephone, "9015192564");
			String teliphoneText = etl.doGetElementtext(Telipjone_lable);
			String teliphoneAttribute=	etl.doGetElementAttribute(telephone, "placeholder");
				System.out.println(teliphoneText);
				System.out.println(teliphoneAttribute);
			
				etl.doSendKeys(password, "manju@123");
				String passwordText = etl.doGetElementtext(password_lable);
				String passwordAttribute=	etl.doGetElementAttribute(password, "placeholder");
					System.out.println(passwordText);
					System.out.println(passwordAttribute);
					
					etl.doSendKeys(confirmpassword, "manju@123");
					String confirmPasswordText = etl.doGetElementtext(confirmpassword_lable);
					String confirmPasswordAttribute=	etl.doGetElementAttribute(confirmpassword, "placeholder");
						System.out.println(confirmPasswordText);
						System.out.println(confirmPasswordAttribute);
		
	}

}
