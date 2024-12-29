package seleniumPackage1;

public class AmazonTest {

	public static void main(String[] args) {
       
		BrowserUtil brutil=new BrowserUtil();
		brutil.initDriver("chrome");
		brutil.launchUrl("https://www.amazon.com");
		
		if(brutil.isUrlFractionExist("amazon")){
			System.out.println("Url is having amazon....test pass");
			
		}
		else {
			System.out.println("test fail");
		}
		
		if(brutil.isInfoExistPageSorrce("nav-upnav")) {
			System.out.println("url is having fraction..........test pass");
		}
		else {
			System.out.println("test fail");
		}
		
		if(brutil.getPageTitle().contains("Amazon.com. Spend less. Smile more.")) {
			System.out.println("correct title.........test pass");
		}
		else {
			System.out.println("incorrect title............test fail");
		}
	}
	

}
