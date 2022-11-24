package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass10 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://demowebshop.tricentis.com/");
		 driver.manage().window().maximize();
		 String text_value=driver.findElement(By.linkText("Register")).getText();
		 System.out.println(text_value);
		 String text_value1=driver.findElement(By.linkText("Log in")).getText();
		 System.out.println(text_value1);
		 String text_value2=driver.findElement(By.linkText("Wishlist")).getText();
		 System.out.println(text_value2);
		 String text_value3=driver.findElement(By.linkText("Shopping cart")).getText();
		 System.out.println(text_value3);
		 
}
}