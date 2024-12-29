package seleniumPackage1;

import java.sql.DriverManager;

import org.bouncycastle.est.ESTSourceConnectionListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BrowserUtil {
	
	private WebDriver driver;
	/**
	 * this method is used to initialize the driver on the basis of browser name
	 * @param browsername
	 * @return driver
	 */
	public WebDriver initDriver(String browsername) {
		System.out.println("Browser name is :  "+browsername);
		if(browsername.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
         driver=new ChromeDriver();
		}
		
		else if(browsername.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
	         driver=new FirefoxDriver();
			}
		
		else if(browsername.equalsIgnoreCase("safari")) {
			
	         driver=new SafariDriver();
			}
		else if(browsername.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
	         driver=new ChromeDriver();
			}
		else {
			System.out.println("please pass the right browser......"+browsername);
		}
		return driver;
	}
	
	public void launchUrl(String url) {
		
		if(url==null) {
			System.out.println("url is null.......");
			return;
		}
		else if(url.indexOf("https")==-1) {
			System.out.println("https is  not present in url");
			return;
		}
		else if(url.indexOf("http")==-1) {
			System.out.println("http is  not present in url");
			return;
		}
		else if(url.isBlank()) {
			System.out.println("url is blank");
			return;
		}
		else if (url.length()==0) {
			System.out.println("url is blank");
			return;
		}
		driver.get(url);	}
	
	public String getPageTitle() {
		String title = driver.getTitle();
	   System.out.println("page title is :  "+title);
	   return title;
	}
	public String getPageUrl() {
		String url = driver.getCurrentUrl();
	   System.out.println("page title is :  "+url);
	   return url;
	}
	
	public boolean isUrlFractionExist(String fraction) {
		if(getPageUrl().contains(fraction)) {
			return true;
		}
		return false;
	}
	
	public String getPageSource() {
		String pagesource = driver.getPageSource();
	   System.out.println("page title is :  "+pagesource);
	   return pagesource;
	}
	
	public boolean isInfoExistPageSorrce(String info) {
		if(getPageSource().contains(info)) {
		return true;
	}
	return false;
	
	
}
	
	public void closeBrowser() {
		driver.close();
	}
	
	
	public void quitBrowser() {
		driver.quit();;
	}
	
	
	

}
