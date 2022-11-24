package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass_Iframes1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.get("C:/Users/senan/Downloads/HTML%20Path/iframe.html");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
				WebElement frame1=driver.findElement(By.xpath("//iframe[1]"));
				 driver.switchTo().frame(frame1);
				driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
				driver.findElement(By.cssSelector("input[id=\"small-searchterms\"]")).sendKeys("Books");
			
}
}