package testcases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;
import framework_Utility.Base_Test;
import framework_Utility.Utility_Methods;

public class Computers_MouseOver extends Base_Test {
	

	@Test
	public void access() {

	WebElement target = driver.findElement(By.xpath("(//a[@href='/computers'])[1]"));
	Utility_Methods.ActionsUtility(driver).moveToElement(target);
	WebElement accesories=driver.findElement(By.xpath("(//a[@href='/accessories'])[1]"));
	Utility_Methods.clicked(accesories);
	}
}

