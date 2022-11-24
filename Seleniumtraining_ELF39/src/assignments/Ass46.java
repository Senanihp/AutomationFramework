package assignments;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ass46 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.get("https://demowebshop.tricentis.com/");
				driver.manage().window().maximize();
				//create an object of Web driver wait
				WebDriverWait wait=new WebDriverWait(driver,25);
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("a[class='ico-register']"))));
				
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
