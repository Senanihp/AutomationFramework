package pom_Testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import framework_Utility.Base_Test;
import framework_Utility.Utility_Methods;
import pom_pages.DWS_Searchpage;

public class DWS_Searchpage_test extends Base_Test {
	
		@DataProvider(name="Testdata")
		public Object[][] testdata() throws IOException{
		Object[][] data=Utility_Methods.GetTestData("Search");
		return data;
		}
		@Test
		public void TC03() {
		DWS_Searchpage sp=new DWS_Searchpage(driver);
		sp.seach();
		}

		}


