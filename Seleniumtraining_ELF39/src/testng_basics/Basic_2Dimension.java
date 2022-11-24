package testng_basics;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Basic_2Dimension {
	@DataProvider(name="TestData")
	public Object[][] testData(){
		Object[][] data=new Object[5][2];
		data[0][0]="Senani";
		data[0][1]="HP";
		data[1][0]="zohra";
		data[1][1]="Tasir";
		data[2][0]="call me ";
		data[2][1]="Raghu";
		data[3][0]="Virat";
		data[3][1]="Kohli";
		data[4][0]="Basavaraj";
		data[4][1]="s";
		return data;
	}
	@Test(dataProvider="TestData")
	public void testdatademo(String Firstname,String Lastname) {
		System.out.println(Firstname);
		System.out.println(Lastname);
				
	}

}
