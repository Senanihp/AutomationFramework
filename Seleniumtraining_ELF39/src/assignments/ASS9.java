package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ASS9 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://demowebshop.tricentis.com/");
		 driver.manage().window().maximize();
		 driver.findElement(By.linkText("Register")).click();
		 driver.findElement(By.id("FirstName")).sendKeys("Senani");
		 driver.findElement(By.id("LastName")).sendKeys("HP");
		 driver.findElement(By.id("Email")).sendKeys("senaniparamesh@gmail.com");
		 driver.findElement(By.id("Password")).sendKeys("senani@123");
		 driver.findElement(By.id("ConfirmPassword")).sendKeys("senani@123");
		 driver.findElement(By.cssSelector("input[value=M]")).click();
		 driver.findElement(By.cssSelector("input[name=register-button]")).click();
}
}