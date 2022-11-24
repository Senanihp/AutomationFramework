package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass18 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://demowebshop.tricentis.com/");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//a[@class=\"ico-register\"]")).click();
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