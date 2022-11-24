package assignments;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Ass_Screenshot {
public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://demowebshop.tricentis.com/");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//a[@class=\"ico-register\"]")).click();
		 driver.findElement(By.xpath("//input[@id=\"FirstName\"]")).sendKeys("Safgi");
		 driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("Senanhja@gmail.com");
		 driver.findElement(By.xpath("//input[@id=\"LastName\"]")).sendKeys("Phkl");
		 driver.findElement(By.xpath("(//input[@class=\"text-box single-line password\"])[1]")).sendKeys("hgkfdhrt@");
		 driver.findElement(By.xpath("(//input[@class=\"text-box single-line password\"])[2]")).sendKeys("hgkfdhrt@");
		 driver.findElement(By.xpath("//input[@id=\"gender-male\"]")).click();
		 driver.findElement(By.xpath("//input[@id=\"register-button\"]")).click();
		 //take a screenshot type casting with driver instance
		 TakesScreenshot ts=(TakesScreenshot)driver;
		 File ss=ts.getScreenshotAs(OutputType.FILE);
		 File destination=new File("./ScreenShot/screenshot1.png");
		 FileHandler.copy(ss, destination);
		 driver.close();
}	 
		
}
