package testng_basics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Configure_Annotation {
	@Test
	public void gobi() {
		System.out.println("Welcome to gobi shop");
	}
	@Test
	public void chats() {
		System.out.println("Welcome to Chats angdi");
	}
    @BeforeSuite
    public void beforesuite() {
    	System.out.println("Executing Before Suite");
    }
    @AfterSuite
    public void aftersuite() {
    	System.out.println("Executing After Suite");
    }
    @BeforeTest
    public void beforeTest() {
    	System.out.println("Executing Before Test");
    }
    @AfterTest
    public void afterTest() {
    	System.out.println("Executing After Test");
    }
    @BeforeClass
    public void beforeclass() {
    	System.out.println("Executing Before Class");
    }
    @AfterClass
    public void afterclass() {
    	System.out.println("Executing After Class");
    }
    @BeforeMethod
    public void beforeMethod() {
    	System.out.println("Executing Before Method");
    }
    @AfterMethod
    public void afterMethod() {
    	System.out.println("Executing After Method");
    }
}
