package assignments;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Ass25 {

	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			 WebDriver driver=new ChromeDriver();
			 driver.get("file:///C:/Users/senan/Downloads/HTML%20Path/demo.html");
			 driver.manage().window().maximize();
			 List<WebElement>radiobuttons=driver.findElements(By.xpath("//input[@type='text']"));
	
			 for(int i=0;i<=radiobuttons.size()-1;i++) {
	
				radiobuttons.get(i).sendKeys("Senani");
			 }
			
			 }
	
}
