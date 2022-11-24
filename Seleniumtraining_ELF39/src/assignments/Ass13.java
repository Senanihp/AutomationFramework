package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass13 {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://demowebshop.tricentis.com/");
		 driver.manage().window().maximize();
		 String attribute_value=driver.findElement(By.linkText("Register")).getAttribute("class");
		 System.out.println(attribute_value);
		 String attribute_value1=driver.findElement(By.linkText("Wishlist")).getAttribute("class");
		 System.out.println(attribute_value1);
}
}