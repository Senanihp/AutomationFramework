package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework_Utility.Utility_Methods;

public class DWS_NewsLetter extends Utility_Methods {
	public DWS_NewsLetter(WebDriver driver) {
		PageFactory.initElements(driver,this);
		}
		@FindBy(id="newsletter-email")
		WebElement newsletter;

		@FindBy(id="newsletter-subscribe-button")
		WebElement subscribe;

		public void Enter_into_newletter(String value) {
			Enter_value_in_editfield(newsletter, value);
		}
		public void Click_subscribe() {
		clicked(subscribe);
		}

		}
