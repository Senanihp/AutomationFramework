package assignments;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class Ass30 {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
					
					WebDriver driver = new ChromeDriver();
					driver.get("https://demowebshop.tricentis.com/");
					driver.findElement(By.xpath("//a[text()='Build your own cheap computer']/../../../..")).click();
					driver.findElement(By.xpath("//input[@id='add-to-cart-button-72']/../..")).click();
		}
}
	