package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public interface Ass11 {
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://demowebshop.tricentis.com/");
		 driver.manage().window().maximize();
		 driver.findElement(By.linkText("Register")).click();
		 driver.findElement(By.id("FirstName")).sendKeys("Snan");
		 driver.findElement(By.id("LastName")).sendKeys("H");
		 driver.findElement(By.id("Email")).sendKeys("senaniesh@gmail.com");
		 driver.findElement(By.id("Password")).sendKeys("senan@12");
		 driver.findElement(By.id("ConfirmPassword")).sendKeys("senan@12");
		 driver.findElement(By.cssSelector("input[value=M]")).click();
		 driver.findElement(By.cssSelector("input[name=register-button]")).click();
		 //validation
		String expected_value="Your registration completed";
		String actual_value=driver.findElement(By.className("result")).getText();
		if(actual_value.equalsIgnoreCase(expected_value)) {
			System.out.println("successfull");
		}
		else {
			System.out.println("unsuccessfull");
		}
		 }
}

