package testng_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel {
	@Test(invocationCount=3,threadPoolSize=3)
	public void Demo() {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://demowebshop.tricentis.com/");
	 driver.manage().window().maximize();
	 driver.close();
}
}