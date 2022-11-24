package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass14 {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://demowebshop.tricentis.com/");
		 driver.manage().window().maximize();
		 String a=driver.findElement(By.partialLinkText("Register")).getCssValue("color");
		 System.out.println(a);
		 String b=driver.findElement(By.id("small-searchterms")).getCssValue("font-size");
		 System.out.println(b);
		 String c=driver.findElement(By.id("small-searchterms")).getCssValue("font-weight");
		 System.out.println(c);
}
}