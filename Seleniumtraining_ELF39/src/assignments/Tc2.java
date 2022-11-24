package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc2 {
	@Test
	public void Demo() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		//Navigate to website
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
		driver.findElement(By.cssSelector("input[id=\"Email\"]")).sendKeys("Sanipa@gmail.com");
		driver.findElement(By.cssSelector("input[id=\"Password\"]")).sendKeys("hgfdfhrt@");
		driver.findElement(By.cssSelector("(//input[@type='submit'])[2]")).click();
	}
}
