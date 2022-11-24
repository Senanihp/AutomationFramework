package pom_Testcases;



import java.io.IOException;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import framework_Utility.Base_Test;
import framework_Utility.Utility_Methods;
import pom_pages.DWS_HomePage;
import pom_pages.DWS_Registerpage;

public class DWS_Register_test extends Base_Test {
	@DataProvider(name="Testdata")
	public Object[][] testdata() throws IOException {
	Object[][] data=Utility_Methods.GetTestData("Register");
	return data;
	}
	@Test
	public void TC02() {
	DWS_HomePage hp=new DWS_HomePage(driver);
	hp.click_register();

	DWS_Registerpage rp=new DWS_Registerpage(driver);
	rp.Enter_gender();
	rp.Enter_first_name("Senaani");
	rp.Enter_second_name("hppp");
	rp.Enter_Email("senhpgmail.com");
	rp.Enter_Password("sen123");
	rp.Enter_cpwd("sen123");
	}

	}

	
