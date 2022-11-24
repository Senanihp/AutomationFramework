package assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ass27 {

		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			 WebDriver driver=new ChromeDriver();
			 driver.get("https://demowebshop.tricentis.com/");
			 driver.manage().window().maximize();
			 driver.findElement(By.xpath("(//a[@href='/books'])[1]")).click();
			 //position_dropdown
			 WebElement position=driver.findElement(By.id("products-orderby"));
			 Select sel=new Select(position);
			 sel.selectByIndex(1);
			 
			 //display_dropdown
			 WebElement display=driver.findElement(By.id("products-pagesize"));
			 Select sel1=new Select(display);
			 sel1.selectByIndex(1);
			 
			 //view_as_dropdown
			 WebElement view=driver.findElement(By.id("products-viewmode"));
			 Select sel2=new Select(view);
			 sel2.selectByIndex(1);
			 
}
}