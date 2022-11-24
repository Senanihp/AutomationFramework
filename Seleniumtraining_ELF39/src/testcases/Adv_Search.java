package testcases;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import framework_Utility.Base_Test;
import framework_Utility.Utility_Methods;

public class Adv_Search extends Base_Test{
	@DataProvider(name="advancesearch")
	public Object[]testadvancesearch() throws IOException{
		Object[][]data=Utility_Methods.GetTestData("Advance search");
	//Object[][]data=new Object[1][3];
	//data[0][0]="computers";
	//data[0][1]="1000";
	//data[0][2]="90000";

	return data;
	}
		@Test(dataProvider="advancesearch")
		public void AdvanceSearch(String search, String from, String to ) {
			WebElement Search=driver.findElement(By.cssSelector("input[id=\"small-searchterms\"]"));
			Utility_Methods.Enter_value_in_editfield(Search,search );
			WebElement Click=driver.findElement(By.cssSelector("input[value=\"Search\"]"));
			Utility_Methods.clicked(Click);
			WebElement Click1=driver.findElement(By.id("As"));
			Utility_Methods.clicked(Click1);
			WebElement dropdown1=driver.findElement(By.id("Cid"));
			//Select sel=new Select(dropdown1);
			Utility_Methods.select_by_index(dropdown1, 6);
			//Manufacturer dropdown
			WebElement dropdown2=driver.findElement(By.id("Mid"));
			//Select sel1=new Select(dropdown2);
			Utility_Methods.select_by_VisibleText(dropdown2,"Tricentis");
			//
			WebElement Bas1=driver.findElement(By.id("Pf"));
			Utility_Methods.Enter_value_in_editfield(Bas1,from );
			WebElement Bas2=driver.findElement(By.id("Pt"));
			Utility_Methods.Enter_value_in_editfield(Bas2,to);
}
}
