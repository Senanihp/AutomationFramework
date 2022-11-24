package pom_Testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import framework_Utility.Base_Test;
import framework_Utility.Utility_Methods;
import pom_pages.DWS_HomePage;
import pom_pages.DWS_Jewellary;

public class DWS_Jewellary_test extends Base_Test {
	@DataProvider(name="comppom")
	public Object[][] testdata() throws IOException {
		Object[][] data=Utility_Methods.GetTestData("Jewellary");
		return data;
	}
	
	@Test(dataProvider = "comppom")
	public void tc05(String val1,String val2,String val3) {
		DWS_HomePage hp=new DWS_HomePage(driver);
		hp.click_jewelry();
		
		DWS_Jewellary ct=new DWS_Jewellary(driver);
		ct.click_low_high(val1);
		ct.select_page(val2);
		ct.select_grid(val3);
	
}



}

