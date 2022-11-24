package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass12 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://demowebshop.tricentis.com/");
		 driver.manage().window().maximize();
		 driver.findElement(By.linkText("Log in")).click();
		 driver.findElement(By.id("Email")).sendKeys("senaniesh@gmail.com");
		 driver.findElement(By.id("Password")).sendKeys("senan@12");
		 driver.findElement(By.cssSelector("input[class='button-1 login-button']")).click();
		 //validation
		 String actual=driver.findElement(By.className("account")).getText();
		 System.out.println(actual);
		 String expected="senaniesh@gmail.com";
		 if(actual.equalsIgnoreCase(expected)) {
			 System.out.println("Logged in");
		 }
		 else {
			 System.out.println("Fail");
		 }
}
}