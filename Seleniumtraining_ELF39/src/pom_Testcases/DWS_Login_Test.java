package pom_Testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import framework_Utility.Base_Test;
import framework_Utility.Utility_Methods;
import pom_pages.DWS_HomePage;
import pom_pages.DWS_loginpage;

public class DWS_Login_Test extends Base_Test{
	@DataProvider(name="loginpom")
	public Object[][] testdata() throws IOException {
		Object[][] data=Utility_Methods.GetTestData("Login");
		return data;
	}
	
	
	@Test(dataProvider = "loginpom")
	public void TC01(String Email,String password) {
		DWS_HomePage hp=new DWS_HomePage(driver);
		hp.click_login();
		
		DWS_loginpage lp=new DWS_loginpage(driver);
		lp.Enter_email(Email);
		lp.Enter_pswd(password);
		lp.click_login();
	}

}
