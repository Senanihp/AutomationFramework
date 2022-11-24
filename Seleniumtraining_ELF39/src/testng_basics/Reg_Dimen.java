package testng_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Reg_Dimen {
	@DataProvider(name="Testdata")
	public Object[][] test_data(){
		Object[][] data=new Object[5][5];
		data[0][0]="Senani";
		data[0][1]="HP";
		data[0][2]="senanihp@gmail.com";
		data[0][3]="123456";
		data[0][4]="123456";
		data[1][0]="zohra";
		data[1][1]="Patil";
		data[1][2]="zohra@gmail.com";
		data[1][3]="23456";
		data[1][4]="23456";
		data[2][0]="Ragh";
		data[2][1]="vendra";
		data[2][2]="Ragh@gmail.com";
		data[2][3]="123456";
		data[2][4]="123456";
		data[3][0]="Raaju";
		data[3][1]="Joshi";
		data[3][2]="raaju@gmail.com";
		data[3][3]="123456";
		data[3][4]="123456";
		data[4][0]="Anand";
		data[4][1]="Jiral";
		data[4][2]="anand@gmail.com";
		data[4][3]="123456";
		data[4][4]="123456";
			
		return data;
	}
	@Test(dataProvider = "Testdata")
	public void register(String firstname,String Lastname,String email,String pwd,String cpwd) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com");
		driver.findElement(By.className("ico-register")).click();
		driver.findElement(By.id("FirstName")).sendKeys(firstname);
		driver.findElement(By.id("LastName")).sendKeys(Lastname);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(cpwd);
		driver.findElement(By.id("register-button")).click();
		driver.close();
	}
	}

