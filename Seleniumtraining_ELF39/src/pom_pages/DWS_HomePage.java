package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework_Utility.Utility_Methods;

//classname
public class DWS_HomePage extends Utility_Methods{
	
	public DWS_HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		}
		@FindBy(xpath = "//a[text()='Log in']")
		WebElement login_link;

		public void click_login() {
		login_link.click();
		}
		@FindBy(xpath = "//a[text()='Register']")
		WebElement reg_link;

		public void click_register() {
		reg_link.click();
		}
		@FindBy(xpath = "//span[text()='Shopping cart']")
		WebElement shopping_link;

		public void click_shop() {
		shopping_link.click();
		}

		@FindBy(xpath = "//span[text()='Wishlist']")
		WebElement wishlist;

		public void wishlist_click() {
		wishlist.click();
		}
		@FindBy(xpath = "(//a[contains(text(),'Computers')])[1]")
		WebElement comp;
		@FindBy(xpath = "(//a[@href='/accessories'])[1]")
		WebElement acc;
		@FindBy(xpath = "(//a[@href='/notebooks'])[1]")
		WebElement notebook;
		@FindBy(xpath = "(//a[contains(text(),'Desktops')])[1]")
		WebElement desktop;
		@FindBy(xpath = "(//a[contains(text(),'Electronics')])[1]")
		WebElement electronics;
		@FindBy(xpath = "(//a[contains(text(),'Camera, photo')])[1]")
		WebElement camera;
		@FindBy(xpath = "(//a[contains(text(),'Cell phones')])[1]")
		WebElement cellphones;
		@FindBy(xpath = "(//a[contains(text(),'Books')])[1]")
		WebElement books;

		public void comp_acc() {
		actions(comp).moveToElement(comp).perform();
		actions(acc).moveToElement(acc).click().perform();
		}
		public void comp_notebook() {
		actions(comp).moveToElement(comp).perform();
		actions(notebook).moveToElement(notebook).click().perform();
		}
		public void comp_desktop() {
		actions(comp).moveToElement(comp).perform();
		actions(desktop).moveToElement(desktop).click().perform();
		}
		public void elec_camera() {
		actions(electronics).moveToElement(electronics).perform();
		actions(camera).moveToElement(camera).click().perform();
		}
		public void elec_cell() {
		actions(electronics).moveToElement(electronics).perform();
		actions(cellphones).moveToElement(cellphones).click().perform();
		}
		public void book_click() {
		actions(books).moveToElement(books).click().perform();
		}
		@FindBy(xpath = "(//a[contains(text(),'Apparel & Shoes')])[1]")
		WebElement apparel;

		public void apparel_click() {
		apparel.click();
		}
		@FindBy(xpath="(//a[@href='/jewelry'])[1]")
	    WebElement click_jewelry; 
		public void click_jewelry() {
			Utility_Methods.clicked(click_jewelry);
		}
		@FindBy(xpath="(//a[@href='/gift-cards'])[1]")
	    WebElement click_gift; 
		public void click_gift() {
			Utility_Methods.clicked(click_gift);
		}
		@FindBy(xpath="(//a[@href='/digital-downloads'])[1]")
	    WebElement click_digital; 
		public void click_digital() {
			Utility_Methods.clicked(click_digital);
}
}