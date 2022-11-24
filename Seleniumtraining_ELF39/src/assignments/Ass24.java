package assignments;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Ass24 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://demowebshop.tricentis.com/");
		 driver.manage().window().maximize();
		 List<WebElement>radiobuttons=driver.findElements(By.xpath("//a"));
		 int c=0;
		 for(int i=0;i<=radiobuttons.size()-1;i++) {
			 c++;
			 System.out.println(radiobuttons.get(i).getText());
		 }
		 System.out.println("total"+c);
		 }
}
