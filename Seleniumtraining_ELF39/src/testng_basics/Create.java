package testng_basics;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.testng.annotations.Test;

import framework_Utility.Base_Test;
import framework_Utility.Utility_Methods;


	public class Create extends Base_Test {
		
		WebElement dropdown;
		@Test
		public void drop_down() throws InterruptedException {
		
				WebElement books= driver.findElement(By.linkText("Books"));
				Utility_Methods.clicked(books)
	;
				Thread.sleep(2000);
				
			  Utility_Methods.select_by_index(driver.findElement(By.id("products-orderby")), 3);
			    
			
				
	}
		


	}

