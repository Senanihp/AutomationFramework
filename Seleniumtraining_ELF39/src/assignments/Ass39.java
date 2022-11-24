package assignments;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Ass39 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebElement Computers=driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]"));
		Actions action=new Actions(driver);
		action.moveToElement(Computers).build().perform();
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),'Desktops')])[1]"))).click().perform();
		Thread.sleep(2000);
		WebElement Dropdown=driver.findElement(By.xpath("//select[@id='products-orderby']"));
		Select sel=new Select(Dropdown);
		sel.selectByIndex(5);
		
		
	}
}
