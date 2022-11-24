package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass20 {

		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			 WebDriver driver=new ChromeDriver();
			 driver.get("https://demowebshop.tricentis.com/");
			 driver.manage().window().maximize();
			 driver.findElement(By.xpath("(//a[contains(@class,'ico-cart')])[1]")).click();
}
}