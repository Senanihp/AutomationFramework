package testcases;




import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import framework_Utility.Base_Test;
import framework_Utility.Utility_Methods;

public class Tc2 extends Base_Test {
	@DataProvider(name="login")

	public Object[]testlog() throws IOException{

	Object[][]data=Utility_Methods.GetTestData("Login");


	//data[0][0]="senani@gmail.com";
	//data[0][1]="senani12";

	return data;
	}
		
		@Test(dataProvider="login",priority=2)
		public void login(String Email, String Password) {
			
			WebElement Log_Click=driver.findElement(By.xpath("//a[contains(text(),'Log in')]"));
			//clicked(Log_Click);
			Utility_Methods.clicked(Log_Click);
			
			//driver.findElement(By.cssSelector("input[id=\"Email\"]")).sendKeys("Sanipa@gmail.com");
			WebElement username=driver.findElement(By.cssSelector("input[id=\"Email\"]"));
		    //Enter_value_in_editfield(username,"Sanipa@gmail.com" );
			Utility_Methods.Enter_value_in_editfield(username,Email );
			//driver.findElement(By.cssSelector("input[id=\"Password\"]")).sendKeys("hgfdfhrt@");
		    WebElement password=driver.findElement(By.cssSelector("input[id=\"Password\"]"));
		    //Enter_value_in_editfield(password,"hgfdfhrt@" );
		    Utility_Methods.Enter_value_in_editfield(password,Password );
		    
			WebElement Submit=driver.findElement(By.xpath("(//input[@class=\"button-1 login-button\"])"));
			//clicked(Submit);
			Utility_Methods.clicked(Submit);
		}
	   
}