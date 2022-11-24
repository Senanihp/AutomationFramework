package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass17 {
		public static void main(String[] args) {
				
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				 WebDriver driver=new ChromeDriver();
				 driver.get("file:///C:/Users/senan/Downloads/HTML%20Path/xpath1.html");
				 driver.manage().window().maximize();
				 driver.findElement(By.xpath("(//input)[1]")).sendKeys("Senani");
				 driver.findElement(By.xpath("(//input)[2]")).sendKeys("HP");
				 driver.findElement(By.xpath("(//input)[3]")).sendKeys("TY");
				 driver.findElement(By.xpath("(//input)[4]")).sendKeys("Bengaluru");
}
}