package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass15 {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("file:///C:/Users/senan/Downloads/HTML%20Path/xpath1.html");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("/html/body/div[1]/input[1]")).sendKeys("senani");
		 driver.findElement(By.xpath("/html/body/div[1]/input[2]")).sendKeys("hp");
}

}
