package assignments;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ass45 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.get("https://demo.guru99.com/test/simple_context_menu.html");
				driver.manage().window().maximize();
				WebElement Right_Click=driver.findElement(By.xpath(("//span[contains(text(),'right click me')]")));
				Actions action=new Actions(driver);
			
				List<WebElement>options=driver.findElements(By.xpath("//span[text()='Edit']/../../li/span"));
				for(int i=0;i<=options.size()-1;i++) {
				action.contextClick(Right_Click).perform();
				Thread.sleep(2000);
				options.get(i).click();
				Thread.sleep(2000);
				Alert ale=driver.switchTo().alert();
				ale.accept();
	}
}
}		
				
				
				


