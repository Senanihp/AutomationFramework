package testng_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Parameter_Basics {
	@Parameters ({"URL","product"})
	@Test
	public void Demo1 (String variable,String value){
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get(variable);
		 driver.manage().window().maximize();
		 driver.findElement(By.cssSelector("input[id='small-searchterms']")).sendKeys(value);
		 driver.findElement(By.cssSelector("input[type='submit']")).click();	
}
}