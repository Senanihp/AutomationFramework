package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitwait {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.get("https://demowebshop.tricentis.com/");
				driver.manage().window().maximize();
				//Implicit wait
				driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
			  driver.findElement(By.cssSelector(("a[class='ico-register']"))).click();
			   driver.findElement(By.xpath("//input[@id=\"FirstName\"]")).sendKeys("Senai");
				 driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("Senanipa@gmail.com");
				 driver.findElement(By.xpath("//input[@id=\"LastName\"]")).sendKeys("P");
				 driver.findElement(By.xpath("//input[@id=\"LastName\"]")).sendKeys("P");
				 driver.findElement(By.xpath("(//input[@class=\"text-box single-line password\"])[1]")).sendKeys("hgfdhrt@");
				 driver.findElement(By.xpath("(//input[@class=\"text-box single-line password\"])[2]")).sendKeys("hgfdhrt@");
				 driver.findElement(By.xpath("//input[@id=\"gender-male\"]")).click();
				 driver.findElement(By.xpath("//input[@id=\"register-button\"]")).click();		
				
	}

}


