package selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Firefox {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.yahoo.co.in");
	driver.get("https://www.google.co.in");
	driver.get("https://www.snapchat.co.in");
}
}
