package pom_Testcases;

import org.testng.annotations.Test;

import framework_Utility.Base_Test;
import pom_pages.DWS_HomePage;

public class DWS_Notebook_test extends Base_Test {
	@Test
	public void TC07(){
	DWS_HomePage hp=new DWS_HomePage(driver);
	hp.comp_notebook();

	}

	}

