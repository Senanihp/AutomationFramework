package snapchat;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import framework_Utility.Base_Test;
import framework_Utility.Utility_Methods;

public class Snap_Login extends Base_Test {
	@DataProvider(name="login")

	public Object[]testlog() throws IOException{
		Object[][]data=Utility_Methods.GetTestData("Snapchat");
		return data;
		
	}
	@Test(dataProvider="login",priority=2)
	public void login(String Username, String Password) {
		
		WebElement Log_Click=driver.findElement(By.xpath("(//p[contains(text(),'Log in to chat')])[1]"));
		Utility_Methods.clicked(Log_Click);
		WebElement Email=driver.findElement(By.cssSelector("input[id=\"username\"]"));
		Utility_Methods.Enter_value_in_editfield(Email, Username);
}
}

