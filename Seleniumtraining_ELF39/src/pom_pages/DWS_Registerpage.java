package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework_Utility.Utility_Methods;

public class DWS_Registerpage extends Utility_Methods{
	public DWS_Registerpage(WebDriver driver) {
		PageFactory.initElements(driver,this);

		}
		@FindBy(id="gender-female")
		WebElement gender;

		@FindBy(id="FirstName")
		WebElement firstname;

		@FindBy(id="LastName")
		WebElement lastname;

		@FindBy(id="Email")
		WebElement email;

		@FindBy(id="Password")
		WebElement password;

		@FindBy(id="ConfirmPassword")
		WebElement confirmpassword;


		public void Enter_gender() {
		clicked(gender);
		}
		public void Enter_first_name(String value) {
			Enter_value_in_editfield(firstname, value);
		}
		public void Enter_second_name(String value) {
			Enter_value_in_editfield(lastname, value);
		}
		public void Enter_Email(String value) {
			Enter_value_in_editfield(email, value);
		}
		public void Enter_Password(String value) {
			Enter_value_in_editfield(password, value);
		}
		public void Enter_cpwd(String value) {
			Enter_value_in_editfield(confirmpassword, value);
		}
		}

