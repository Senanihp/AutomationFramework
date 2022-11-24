package assignments;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Ass40 {
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
		
		for(String child_window:total) {
			//System.out.println(child_window)
			
			//switch to child window
		driver.switchTo().window(child_window);
		System.out.println(driver.getTitle());
		if(driver.getTitle().equalsIgnoreCase("NopCommerce - Home | Facebook")) {
			driver.findElement(By.name("email")).sendKeys("www.sen.com");
		}
		}
		}
		
		


}
