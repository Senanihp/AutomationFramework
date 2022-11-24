package testng_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Paralle_exec2 {
	@Test
	public void Demo1 (){
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://demowebshop.tricentis.com/");
		 driver.manage().window().maximize();
		 driver.findElement(By.cssSelector("input[id='small-searchterms']")).sendKeys("Computers");
		 driver.findElement(By.cssSelector("input[type='submit']")).click();	
}
}

