package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.commonMethods;
import utilities.configReader;
import utilities.driver;

public class checkoutPage extends commonMethods{
	
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
	
	@FindBy(xpath = "//*[@id=\"menu\"]/div[2]/ul/li[6]/a")
	public WebElement phonePdaButton;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[1]/div/div[1]/a/img")
	public WebElement htcButton;
	
	@FindBy(xpath = "//a[contains(@title,'Checkout')]/i")
	public WebElement checkoutButton;
	
	@FindBy(xpath = "//button[contains(@id,'button-cart')]")
	public WebElement addToCartButton;
	
	@FindBy(xpath = "//*[@id=\"button-payment-address\"]")
	public WebElement addressContinue;
	
	@FindBy(xpath = "//*[@id=\"content\"]/h1")
	public WebElement checkoutLogo;
	
	@FindBy(xpath = "//*[@id=\"button-shipping-address\"]")
	public WebElement shippingContinue;
	
	@FindBy(xpath = "//textarea[@name=\"comment\"]")
	public WebElement commentArea;
	
	@FindBy(xpath = "//*[@id=\"button-shipping-method\"]")
	public WebElement deliveryContinue;
	
	@FindBy(xpath = "//input[@name=\"agree\"]")
	public WebElement termsAndConditionsCheckBox;
	
	@FindBy(xpath = "//input[@id=\"button-payment-method\"]")
	public WebElement paymentContinue;
	
	@FindBy(xpath = "//div[@class=\"panel-body\"]")
	public WebElement orderDetails;
	
	@FindBy(xpath = "//input[@id=\"button-confirm\"]")
	public WebElement confirmOrderButton;
	
	@FindBy(xpath = "//div[@id=\"content\"]/h1")
	public WebElement orderHasBeenPlacedHeader;
	
	@FindBy(xpath = "//a[@class=\"btn btn-primary\"]")
	public WebElement orderPageContinue;
	
	public void successfulLogin() {
		cp.myAccountButton.click();
		cp.loginOption.click();
		cp.emailAddressField.sendKeys(configReader.getProperty("validEmail"));
		cp.passwordField.sendKeys(configReader.getProperty("validPassword"));
		cp.loginButton.click();
		cp.homeButton.click();
		
	}
	@FindBy(xpath = "//ul[@class=\"nav navbar-nav\"]/li[2]/a")
	public WebElement laptopsAndNoteBooks;
	
	@FindBy(xpath = "//*[@id=\"menu\"]/div[2]/ul/li[2]/div/a")
	public WebElement showAllLaptopsOption;
	
	@FindBy(xpath = "//img[@alt=\"HP LP3065\"]")
	public WebElement hp3065Image;
	
	@FindBy(xpath = "//div[@class=\"alert alert-success alert-dismissible\"]")
	public WebElement addToCartSuccessMessage;

	
	

}
