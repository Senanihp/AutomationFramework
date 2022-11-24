package pom_Testcases;

import org.testng.annotations.Test;

import framework_Utility.Base_Test;
import pom_pages.DWS_HomePage;

public class DWS_Books_Test extends Base_Test {
	@Test
	public void TC10() {
	DWS_HomePage hp=new DWS_HomePage(driver);
	hp.book_click();
	}
	}


