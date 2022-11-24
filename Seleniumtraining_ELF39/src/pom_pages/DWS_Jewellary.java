package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework_Utility.Utility_Methods;

public class DWS_Jewellary extends Utility_Methods {
	public DWS_Jewellary(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}


	@FindBy(xpath="//select[@id='products-orderby']")
	WebElement low_h;
	
	@FindBy(xpath="//select[@id='products-pagesize']")
	WebElement sel;
	
	@FindBy(xpath="//select[@id='products-viewmode']")
	WebElement sel_v;
	
	
	
	// Methods
	public void click_low_high(String value) {
		Utility_Methods.select_by_VisibleText(low_h, value);
	}
	
	public void select_page(String value) {
		Utility_Methods.select_by_VisibleText(sel, value);
	}
	
	public void select_grid(String value) {
		Utility_Methods.select_by_VisibleText(sel_v, value);
	}
	
	

}

