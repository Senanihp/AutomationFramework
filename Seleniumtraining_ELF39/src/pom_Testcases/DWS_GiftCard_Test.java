package pom_Testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import framework_Utility.Base_Test;
import framework_Utility.Utility_Methods;
import pom_pages.DWS_GiftCard;
import pom_pages.DWS_HomePage;

public class DWS_GiftCard_Test extends Base_Test {
	@DataProvider(name="comppom")
	public Object[][] testdata() throws IOException {
		Object[][] data=Utility_Methods.GetTestData("giftcard");
		return data;
	}
	
	@Test(dataProvider = "comppom")
	public void tc05(String val1,String val2,String val3) {
		DWS_HomePage hp=new DWS_HomePage(driver);
		hp.click_gift();
		
		DWS_GiftCard ct=new DWS_GiftCard(driver);
		ct.click_low_high(val1);
		ct.sel_page(val2);
		ct.sel_grid(val3);
	
}


}

