package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework_Utility.Utility_Methods;

public class DWS_Wishlist extends Utility_Methods{
	public DWS_Wishlist(WebDriver driver) {
		PageFactory.initElements(driver,this);
		}
		@FindBy(id="topcartlink")
		WebElement wishlist;

		public void wishlist() {
		clicked(wishlist);
		}


		}


