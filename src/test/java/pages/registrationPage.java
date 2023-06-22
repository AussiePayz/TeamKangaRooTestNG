package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.driver;

public class registrationPage {
	
	public registrationPage() {
		
		PageFactory.initElements(driver.getDriver(), this);
	}
	@FindBy(xpath="//*[contains (@ title, 'My Account')]")	
	public WebElement myaccount;
	
	@FindBy(xpath="//ul[contains (@ class, 'dropdown-menu dropdown-menu-right')]/li[1]/a")	
	public WebElement register;
	
	
	@FindBy(xpath="//*[@id=\"input-firstname\"]")	
	// or this xpath  //*[contains(@id, 'account')]/div[2]/div
	public WebElement firstname;
	
	
	@FindBy(xpath="//*[contains(@id, 'account')]/div[3]/div/input")	
	public WebElement lastname;
	
	@FindBy(xpath="//*[contains(@id, 'account')]/div[4]/div/input")	
	public WebElement email;
	
	@FindBy(xpath="//input[@id=\"input-telephone\"]")	
	public WebElement telephone;
	
	@FindBy(xpath="//*[@name='password']")	
	public WebElement password;
	
	@FindBy(xpath="//*[@id='input-confirm']")	
	public WebElement confirmpassword;
	
	
	
	@FindBy(xpath="//a[contains(@class, 'agree')]")	
	public WebElement privacypolicy;
	
	
	@FindBy(xpath="//input[@type= 'checkbox']")	
	public WebElement checkbox;
	
	
	@FindBy(xpath="//input[@type= 'submit']")	
	public WebElement continueButton;
	
	@FindBy(xpath="//*[@id='content']/p[1]")
	public WebElement successfullMessage; 
	
	@FindBy(xpath="//div[@id=\"account-register\"]/div[1]/i")
	public WebElement emailExistingMessage;
	
	
	

}
