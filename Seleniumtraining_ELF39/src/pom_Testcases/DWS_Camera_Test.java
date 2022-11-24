package pom_Testcases;

import org.testng.annotations.Test;

import framework_Utility.Base_Test;
import pom_pages.DWS_HomePage;

public class DWS_Camera_Test extends Base_Test{
	@Test
	public void TC08() {
	DWS_HomePage hp=new DWS_HomePage(driver);
	hp.elec_camera();
	}

	}


