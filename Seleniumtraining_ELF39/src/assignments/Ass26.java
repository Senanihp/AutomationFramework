package assignments;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Ass26 {
	

		
			public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				 WebDriver driver=new ChromeDriver();
				 driver.get("file:///C:/Users/senan/Downloads/HTML%20Path/demo.html");
				 driver.manage().window().maximize();
				 //Identify the web Element of Select type
				 WebElement select_car=driver.findElement(By.id("standard_cars"));
				 Select sel=new Select(select_car);
				 //Select by visible text
				 sel.selectByVisibleText("Ford");
				 
				 Thread.sleep(2000);
				 
				 //Select by value
				 sel.selectByValue("toy");
				 
				 //Select by Index
				 sel.selectByIndex(1);
				 
					 
}
}