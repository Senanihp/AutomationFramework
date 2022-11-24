package assignments;

	import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	public class Ass37 {
			public static void main(String[] args) {
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.get("https://demowebshop.tricentis.com/");
				driver.manage().window().maximize();
				WebElement search=driver.findElement(By.id("small-searchterms"));
				Actions action=new Actions(driver);
				action.sendKeys(search,"mobiles").perform();
				
				action.sendKeys(Keys.PAGE_DOWN).perform();
			}
}
