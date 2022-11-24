package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class prac_Selectclass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.get("https://demowebshop.tricentis.com/");
				driver.manage().window().maximize();
				WebElement computer=driver.findElement(By.xpath(("(//a[contains(text(),'Computers')])[1]")));
				Actions action=new Actions(driver);
				action.moveToElement(computer).build().perform();
				driver.findElement(By.xpath(("(//a[contains(text(),'Notebooks')])[1]"))).click();
				WebElement Position=driver.findElement(By.cssSelector("select[id='products-orderby']"));
				Select sel=new Select(Position);
				sel.selectByIndex(5);
			
				
	}
}


