package pom_Testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import framework_Utility.Base_Test;
import framework_Utility.Utility_Methods;
import pom_pages.DWS_NewsLetter;

public class DWS_NewsLetter_test extends Base_Test{
	@DataProvider(name="Testdata")
	public Object[][]  testdata() throws IOException {
	Object[][] data=Utility_Methods.GetTestData("Newsletter");
	return data;
	}
	@Test
	public void TC05() {
	DWS_NewsLetter np=new DWS_NewsLetter(driver);
	np.Enter_into_newletter("senhpgmail.com");
	np.Click_subscribe();



	}

	}


