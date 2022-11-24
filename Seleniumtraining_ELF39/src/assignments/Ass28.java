package assignments;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ass28 {

		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			 WebDriver driver=new ChromeDriver();
			 driver.get("https://demowebshop.tricentis.com/");
			 driver.manage().window().maximize();
			 driver.findElement(By.linkText("Books")).click();
			 WebElement buttons=driver.findElement(By.id("product-orderby"));
			 Select books=new Select(buttons);
			 List<WebElement>driver1=books.getOptions();
			 for(int i=0;i<=driver1.size()-1;i++) {
				 System.out.println(driver1.get(i).getText());
			 }
		}
			 


}

