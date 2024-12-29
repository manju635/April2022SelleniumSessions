package seleniumPackage1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
	
	private WebDriver driver;
	
	public ElementUtil(WebDriver driver) {
		this.driver=driver;
	}
	
	public void  doClick(String locatorType, String selector) {
		By locator = getByLocator(locatorType,selector);
		getElement(locator).click();
		
	} 
	
	
	public void  doClick(By locator) {
		getElement(locator).click();
		
	} 
	
	public   WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
		
		
		
		public  void doSendKeys(By locator, String Value) {
			getElement(locator).sendKeys(Value);
		
		}
		
		public  void doSendKeys(String locatorType, String Selector, String value){
			By locator = getByLocator(locatorType,Selector);
			getElement(locator).sendKeys(value);
			
		}
		
		public String doGetElementtext(By locator) {
			String eletext=getElement(locator).getText();
			
			return eletext;
			
		}
		
		public String doGetElementAttribute(By locator, String attributename) {
			String eleAttribute=getElement(locator).getAttribute( attributename);
			
			return eleAttribute;
			
		}
		
		
		public  By getByLocator(String locatorType,String Selector ) {
			
	        By	locator = null;

	    switch(locatorType.toLowerCase()) {
	    case"id":
	    	locator=By.id(Selector);
	    	break;
	    	
	    case"name":
	    	locator=By.name(Selector);
	    	break;
	    	
	    case"classname":
	    	locator=By.className(Selector);
	    	break;
	    	
	    case"xpath":
	    	locator=By.xpath(Selector);
	    	break;
	    case"cssSelector":
	    	locator=By.cssSelector(Selector);
	    	break;
	    case"linktext":
	    	locator=By.linkText(Selector);
	    	break;
	    case"partiallinktext":
	    	locator=By.partialLinkText(Selector);
	    	break;
	    case"tagname":
	    	locator=By.name(Selector);
	    	break;
	    	
	    	default:
	    		break;
	    }
	    return locator;
			
		}
		
		public List<String> GetEleAttributeList(By locator, String Attributename) {
			List<WebElement> eleList = getElements(locator);
			List<String> eleAttriValueList= new ArrayList<String>();
			for(WebElement e:eleList) {
				String attributevalue=e.getAttribute(Attributename);
				eleAttriValueList.add(attributevalue);
			}
			return eleAttriValueList;
		}

		public List<WebElement> getElements(By locator) {
			return driver.findElements(locator);
		
		
		
			}
		public  void performSearch(By search,String SearchKey,By SuggListLocator,String suggNam) throws InterruptedException {
			doSendKeys(search,SearchKey);
				Thread.sleep(3000);
				
				List<WebElement> suggList = getElements(SuggListLocator);
				System.out.println("count of suggestion: "+suggList.size());
				
				for(WebElement e:suggList) {
					String SuggText = e.getText();
					System.out.println(SuggText);
					
					if(SuggText.contains(suggNam)) {
						e.click();
						break;
					}
			}
		}}
