package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.driver;

public class checkoutPage {
	
	public checkoutPage() {
		
		PageFactory.initElements(driver.getDriver(), this);
	}
	@FindBy(xpath = "//span[contains(@class,'caret')]")
	public WebElement myAccountButton; 
	
	@FindBy(xpath = "//ul[contains(@class,'dropdown-menu dropdown-menu-right')]/li[2]/a")
	public WebElement loginOption;
	
	@FindBy(xpath = "//input[contains(@id,'input-email')]")
	public WebElement emailAddressField;
	
	@FindBy(xpath = "//input[contains(@id,'input-password')]")
	public WebElement passwordField;
	
	@FindBy(xpath = "//input[contains(@type,'submit')]")
	public WebElement loginButton;
	
	@FindBy(xpath = "//i[contains(@class,'fa fa-home')]")
	public WebElement homeButton;
	
	
	

}
