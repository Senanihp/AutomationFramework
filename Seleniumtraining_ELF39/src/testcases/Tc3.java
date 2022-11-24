package testcases;
	import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import framework_Utility.Base_Test;
import framework_Utility.Utility_Methods;

	public class Tc3 extends Base_Test {
		@DataProvider(name="Testdata")
		public Object[][] testdata() throws IOException{
			Object[][]data=Utility_Methods.GetTestData("Search");
			//Object [][] data=new Object[1][1];
			//data[0][0]="books";
			return data;
		}
		@Test(dataProvider="Testdata")
		public void Demo(String Books) {
			
			WebElement Search=driver.findElement(By.cssSelector("input[id=\"small-searchterms\"]"));
			Utility_Methods.Enter_value_in_editfield(Search,Books );
			WebElement Done=driver.findElement(By.cssSelector("input[value=\"Search\"]"));
			Utility_Methods.clicked(Done);
		}
	}


