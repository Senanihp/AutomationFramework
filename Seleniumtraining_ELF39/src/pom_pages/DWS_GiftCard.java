package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework_Utility.Utility_Methods;

public class DWS_GiftCard extends Utility_Methods {
	public DWS_GiftCard(WebDriver driver){
		PageFactory.initElements(driver,this);

		}
		@FindBy(id="products-orderby")
		WebElement low_high;

		@FindBy(name="products-pagesize")
		WebElement sel_page;

		@FindBy(name="products-viewmode")
		WebElement sel_view;


		public void click_low_high(String value) {
		Utility_Methods.select_by_VisibleText(low_high, value);
		}

		public void sel_page(String value) {
		Utility_Methods.select_by_VisibleText(sel_page, value);
		}
		public void sel_grid(String value) {
		Utility_Methods.select_by_VisibleText(sel_view, value);
		

		}
}
