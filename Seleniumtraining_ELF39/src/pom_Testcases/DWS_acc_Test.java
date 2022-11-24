package pom_Testcases;

import org.testng.annotations.Test;

import framework_Utility.Base_Test;
import pom_pages.DWS_HomePage;

public class DWS_acc_Test extends Base_Test {
	@Test
	public void TC06() {
	DWS_HomePage hp=new DWS_HomePage(driver);
	hp.comp_acc();

	}
	}

