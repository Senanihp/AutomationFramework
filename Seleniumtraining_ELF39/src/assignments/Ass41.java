package assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass41 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	//make a note of parent window
			String Parent=driver.getWindowHandle();
			System.out.println(Parent);
			
			//identify_the__facbook_link
			driver.findElement(By.xpath("//a[contains(text(),'Facebook')]")).click();
			Thread.sleep(2000);
			Set<String>total=driver.getWindowHandles();
			System.out.println(total);
			for(String tot:total) {
				driver.switchTo().window(tot);
				String title=driver.getTitle();
				System.out.println(driver.getTitle());
				if(title.equalsIgnoreCase("NopCommerce - Home | Facebook")) {
					driver.close();
				}
				
			}
			driver.switchTo().window(Parent);
			Thread.sleep(2000);
			driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
			Thread.sleep(2000);
			driver.close();	
			
}
}
