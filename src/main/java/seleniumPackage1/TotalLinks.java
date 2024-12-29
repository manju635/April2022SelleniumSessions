package seleniumPackage1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {

static WebDriver driver;
	
	public static void main(String[] args) {
	//1.  total no. of links of the page
		//2. print the text of each link.
		//3. print text of only those links having text with index no.
		// 4. find out the broken links?
		
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
//	List<WebElement> totalLinks = driver.findElements(By.tagName("a"));    // order based collection
//	System.out.println("total links:  "+totalLinks.size() );	
	
	//for(int i=0; i<totalLinks.size(); i++) {
//	String linktext=	totalLinks.get(i).getText();
//	//if(!linktext.isEmpty())
//	if(linktext.length()!=0){
//	System.out.println(i+" : "+linktext);
//		
//	}

//	int count=0;
//	for(WebElement e:totalLinks) {
//		String linktext=e.getText();
//		if(!linktext.isEmpty()) {
//			System.out.println(count+" : "+linktext);
//			
//		}
//		count++;
//	}
       By links = By.tagName("a");
//		int totallinks = getpageLinkCount(links);
//		System.out.println(totallinks);
		
		By images = By.tagName("img");
		int totalimages = getpageLinkCount(images);
		System.out.println(totalimages);
	
	
		List<String> linktextlist = getElementTextList(links);
		System.out.println(linktextlist);
	}
	
	// non blank links text list count
	public static int getElementTextCount(By locator) {
		return getElementTextList(locator).size();
	}
	
	// non blank links text list
	public static List<String> getElementTextList(By locator) {
		List<WebElement> eleList = getElement(locator);
		
		List<String> eletextList= new ArrayList<String>();
		
		for(WebElement e:eleList) {
			String text=e.getText();
			if(!text.isEmpty()) {
				eletextList.add(text);
			}
		}
		return eletextList;
	}
	
	public static List<WebElement> getElement(By locator) {
		return driver.findElements(locator);
	}
	
	// total no. of links(blank+non blank)
	public static int getpageLinkCount(By locator) {
		return getElement(locator).size();
		
	}
	public static int getTotalEmptyLinks(By locator) {
		int TotalLinks = getpageLinkCount(locator);
		int totalNonEmpltyLinks = getElementTextCount(locator);
		return TotalLinks-totalNonEmpltyLinks;
		
	}
}
