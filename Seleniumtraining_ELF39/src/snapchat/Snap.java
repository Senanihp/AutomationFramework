package snapchat;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import framework_Utility.Base_Test;
import framework_Utility.Utility_Methods;

public class Snap  extends Base_Test{
	@DataProvider(name="login")

	public Object[]testlog() throws IOException{
		Object[][]data=Utility_Methods.GetTestData("Login");
		return data;
		
	}
	@Test(dataProvider="login",priority=2)
	public void login(String Email, String Password) {
		
		WebElement Log_Click=driver.findElement(By.xpath("(//p[contains(text(),'Log in to chat')])[1]"));
		Utility_Methods.clicked(Log_Click);
}
}