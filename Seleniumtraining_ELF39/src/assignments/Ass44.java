package assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ass44 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.get("https://demo.guru99.com/test/simple_context_menu.html");
				driver.manage().window().maximize();
				WebElement Double_Click=driver.findElement(By.xpath(("//button[contains(text(),'Double-Click Me To See Alert')]")));
				Actions action=new Actions(driver);
				action.doubleClick(Double_Click).build().perform();
				Thread.sleep(2000);
				//Switching the Alert
				Alert ale=driver.switchTo().alert();
				//Handling the Alert
				ale.accept();
	}

}
