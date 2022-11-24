package assignments;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass43 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/senan/Downloads/HTML%20Path/MultipleWindow.html");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='button']")).click();
	Thread.sleep(5000);
	Set<String>total=driver.getWindowHandles();
	System.out.println(total);
	for(String tot:total) {
		driver.switchTo().window(tot);
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equalsIgnoreCase("Olive Garden Italian Restaurant | Family Style Dining | Italian Food")) {
			Thread.sleep(2000);
			driver.close();
		}
	}
}
}
