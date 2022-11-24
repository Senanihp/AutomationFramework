package testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import framework_Utility.Base_Test;
import framework_Utility.Utility_Methods;

public class Tc1 extends Base_Test{

		@DataProvider(name="Testdata")
		public Object[][] test_data() throws IOException{
			Object[][]data=Utility_Methods.GetTestData("Register");
			//Object[][] data=new Object[1][5];
			//data[0][0]="Senanii";
			//data[0][1]="HHP";
			//data[0][2]="Senanii@gmail.com";
			//data[0][3]="HtHP";
			//data[0][4]="HtHP";
			return data;
		}
	
	@Test(dataProvider = "Testdata")
		public void Demo(String FName,String LName,String Email,String Password,String CPassword) throws IOException {
		Utility_Methods.Test_config();
	 WebElement Register=driver.findElement(By.xpath("//a[@class=\"ico-register\"]"));
		Utility_Methods.clicked(Register);
		
	 WebElement FirstName=driver.findElement(By.xpath("//input[@id=\"FirstName\"]"));
	 Utility_Methods.Enter_value_in_editfield(FirstName,FName );
	 
	 WebElement LastName=driver.findElement(By.xpath("//input[@id=\"LastName\"]"));
	 Utility_Methods.Enter_value_in_editfield(LastName,LName);
	 
	 WebElement Email1=driver.findElement(By.xpath("//input[@id=\"Email\"]"));
	 Utility_Methods.Enter_value_in_editfield(Email1,Email);
	 
	
	 
	 WebElement Pass=driver.findElement(By.xpath("(//input[@class=\"text-box single-line password\"])[1]"));
	 Utility_Methods.Enter_value_in_editfield(Pass,Password );
	 
	 WebElement Pass1=driver.findElement(By.xpath("(//input[@class=\"text-box single-line password\"])[2]"));
	 Utility_Methods.Enter_value_in_editfield(Pass1,CPassword);
	 
	 WebElement Male=driver.findElement(By.xpath("//input[@id=\"gender-male\"]"));
	 Utility_Methods.clicked(Male);
	 
	 WebElement Reg=driver.findElement(By.xpath("//input[@id=\"register-button\"]"));
	 Utility_Methods.clicked(Reg);
}
}
