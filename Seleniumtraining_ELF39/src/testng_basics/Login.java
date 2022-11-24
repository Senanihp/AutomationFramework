package testng_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login {
	@DataProvider(name="login")

	public Object[]testlog(){

	Object[][]data=new Object[1][2];

	data[0][0]="senani@gmail.com";
	data[0][1]="senani12";

	return data;
	}
	@Test(dataProvider="login",priority=2)

	public void login(String Email, String Password) {

	System.setProperty("webdriver.chrome.driver","./Drivers/ChromeDriver.exe");

	WebDriver driver=new ChromeDriver();

	driver.get("https://demowebshop.tricentis.com/");

	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	driver.findElement(By.linkText("Log in")).click();

	driver.findElement(By.id("Email")).sendKeys(Email);

	driver.findElement(By.id("Password")).sendKeys(Password);

	driver.findElement(By.id("RememberMe")).click();

	driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();

	driver.findElement(By.xpath("//a[@href=\"/logout\"]")).click();

	driver.close();
	}
}
