package assignments;


    import org.openqa.selenium.By;
    import org.openqa.selenium.Keys;
    import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	public class Ass38 {
			public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.get("https://demowebshop.tricentis.com/");
				driver.manage().window().maximize();
				WebElement search=driver.findElement(By.id("small-searchterms"));
				Actions action=new Actions(driver);
				action.moveToElement(search).click().perform();
				Thread.sleep(2000);
				action.keyDown(Keys.LEFT_SHIFT).sendKeys("mobiles").keyUp(Keys.LEFT_SHIFT).perform();
			}
	
				
}
