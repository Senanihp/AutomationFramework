package assignments;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class Ass35 {
			public static void main(String[] args)  {
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.get("https://demo.guru99.com/test/simple_context_menu.html");
				driver.manage().window().maximize();
				WebElement Doubleclick1=driver.findElement(By.cssSelector("button[ondblclick='myFunction()']"));
				Actions action=new Actions(driver);
				action.doubleClick(Doubleclick1).build().perform();
			}
}
