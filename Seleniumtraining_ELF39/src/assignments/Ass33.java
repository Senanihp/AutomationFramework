package assignments;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class Ass33 {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
					
					WebDriver driver = new ChromeDriver();
					driver.get("https://www.monsterindia.com/");
					driver.manage().window().maximize();
					WebElement electronics=driver.findElement(By.xpath(((//a[contains(text(),'All ')])[1])));
					Actions action=new Actions(driver);
					action.moveToElement(Job).build().perform();
					
					
}
}