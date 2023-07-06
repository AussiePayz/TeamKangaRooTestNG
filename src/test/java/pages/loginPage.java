package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.driver;

public class loginPage {
	
	public loginPage() {
		
		PageFactory.initElements(driver.getDriver(), this);
	}
	@FindBy(xpath = "//span[text()='My Account']")
    public WebElement myAccountButton;
    
    @FindBy(xpath="//a[text()='Login']")
    public  WebElement loginOption;
    
    @FindBy(id="input-email")
    public WebElement emailField;
    
    @FindBy(id="input-password")
    public WebElement passwordField;
    
    @FindBy(xpath = "//input[@type='submit' ]")
    public WebElement loginButton;
    
    @FindBy(xpath = "//a[text()='Forgotten Password']")
    public WebElement ForgetPasswordButton;
    
    @FindBy(css = ".alert.alert-danger")
    public WebElement actualErrorMessage;
    
    @FindBy(xpath = "//input[@id='input-email']")
    public WebElement ForgetPasswordEmail;
   
    @FindBy(xpath = "//input[@type='submit' and @value='Continue' and contains(@class, 'btn')]")
    public WebElement ContinueButton;
    
    @FindBy(xpath= "//div[contains(@class, 'alert-success')]")
    public WebElement ForgetEmailSuccessMessage;
    
 
}
