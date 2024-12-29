package package2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngBasics {
	
	// Testng: java unit testing fremwork
	// global pre conditions
	// pre conditions
	// Test steps (test cases)+ expected result v/s Actual result-------pass/fail
	//Post steps
	
//	BS-connect with db
//	BT-CreateUser
//	BC-launchbrowser
         //	BM-login
         //	add To Cart Test
         //	BM-logout
	
         //	BM-login
         //	home Page Test
         //	BM-logout
	
         //	BM-login
         //	search test
         //	BM-logout
	
//	AC- close the Browser
//	AT- delete the user
	
	
	
	@BeforeSuite
	public void connectDB() {
		System.out.println("BS-connect with db");
	}
	
	@BeforeTest
	public void createUser() {
		System.out.println("BT-CreateUser");
		
	}
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC-launchbrowser");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("BM-login");
	}
	@Test
	public void homePageTest() {
		System.out.println("home Page Test");
		
	}
	@Test
	public void searchTest() {
		System.out.println("search test");
	}
	@Test
	public void addToCartTest() {
		System.out.println("add To Cart Test");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("logout");
	}

	
	@AfterClass
	public void closeBrowser() {
		System.out.println("close the Browser");
	}
	
	@AfterTest
	public void deleteuser() {
		System.out.println("delete the user");
	}
	@AfterSuite
	public void disconnectWithDB() {
		System.out.println("disconnectWithDB");
	}
}
