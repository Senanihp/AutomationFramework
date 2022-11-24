package assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ass_robo {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.get("file:///C:/Users/senan/Downloads/HTML%20Path/demo.html");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
				WebElement file_upload=driver.findElement(By.cssSelector("input[id=\"resume\"]"));
				Actions action=new Actions(driver);
				action.moveToElement(file_upload).click().perform();
				
				Thread.sleep(2000);
				Robot robot=new Robot();
				robot.keyPress(KeyEvent.VK_T);
				
				for(int i=0;i<=2;i++) {
				Thread.sleep(2000);
				robot.keyPress(KeyEvent.VK_TAB);
	}
	          robot.keyPress(KeyEvent.VK_ENTER);
	          
}
}