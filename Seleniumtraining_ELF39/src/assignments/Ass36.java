package assignments;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	public class Ass36 {
			public static void main(String[] args)  {
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.get("https://demo.guru99.com/test/simple_context_menu.html");
				driver.manage().window().maximize();
				WebElement Rightclick=driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
				Actions action=new Actions(driver);
				action.Rightclick(Rightclick).click().perform();
}
}