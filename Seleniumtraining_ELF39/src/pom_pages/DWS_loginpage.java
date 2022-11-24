package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework_Utility.Utility_Methods;


	public class DWS_loginpage extends Utility_Methods{
		
		public DWS_loginpage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}

		// WebElements
		@FindBy(id="Email")
		WebElement username;
		
		@FindBy(id="Password")
		WebElement password;
		
		@FindBy(xpath="(//input[@type='submit'])[2]")
		WebElement login_btn;
		
		// Methods
		public void Enter_email(String value) {
			//username.sendKeys(value);
			Utility_Methods.Enter_value_in_editfield(login_btn, value);
		}
		
		public void Enter_pswd(String value) {
			//password.sendKeys(value);
			Utility_Methods.Enter_value_in_editfield(login_btn, value);
		}
		public void click_login() {
			//login_btn.click();
			Utility_Methods.clicked(login_btn);
		}
		
		
		
		
		}


