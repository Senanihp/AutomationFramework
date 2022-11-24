package testng_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Adv_Search {
	@DataProvider(name="advancesearch")
	public Object[]testadvancesearch(){
	Object[][]data=new Object[1][3];
	data[0][0]="computers";
	data[0][1]="1000";
	data[0][2]="90000";

	return data;
	}
	@Test(dataProvider="advancesearch",priority=4)
	public void AdvanceSearch(String search, String from, String to ) {
	System.setProperty("webdriver.chrome.driver","./Drivers/ChromeDriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys(search);
	driver.findElement(By.xpath("//input[@value='Search']")).click();
	driver.findElement(By.xpath("//input[@id=\'As\']")).click();
	WebElement category=driver.findElement(By.id("Cid"));
	Select sel=new Select(category);
	sel.selectByVisibleText("Computers");
	driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[2]")).click();
	WebElement mfr=driver.findElement(By.id("Mid"));
	Select sel1=new Select(mfr);
	sel1.selectByVisibleText("Tricentis");
	driver.findElement(By.xpath("(//input[@type=\"text\"])[4]")).sendKeys(from);
	driver.findElement(By.xpath("(//input[@type=\"text\"])[5]")).sendKeys(to);
	driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[3]")).click();
	driver.close();
	}
	@Test(priority = 5)
	public void MouseHover() {
	System.setProperty("webdriver.chrome.driver","./Drivers/ChromeDriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	Actions action=new Actions(driver);
	WebElement mouse_hover=driver.findElement(By.xpath("(//a[@href=\"/computers\"])[1]"));
	action.moveToElement(mouse_hover).build().perform();
	driver.findElement(By.xpath("(//a[@href=\"/accessories\"])[1]")).click();
	driver.close();
	}
	}

