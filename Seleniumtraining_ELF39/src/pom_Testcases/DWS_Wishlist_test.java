package pom_Testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import framework_Utility.Base_Test;
import framework_Utility.Utility_Methods;
import pom_pages.DWS_Wishlist;

public class DWS_Wishlist_test extends Base_Test {
	@DataProvider(name="TestData")
	public Object[][] testdata() throws IOException{
	Object[][] data=Utility_Methods.GetTestData("Wishlist");
	return data;

	}
	@Test
	public void TC04() {
	DWS_Wishlist wp=new DWS_Wishlist(driver);
	wp.wishlist();


	}



	}

