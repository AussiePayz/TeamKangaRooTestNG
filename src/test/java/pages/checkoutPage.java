package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

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
	
	@FindBy(xpath = "//a[@href='https://tutorialsninja.com/demo/index.php?route=common/home']")
	public WebElement homeButton;
	
	@FindBy(xpath = "//img[@src=\"https://tutorialsninja.com/demo/image/cache/catalog/demo/ipod_shuffle_1-228x228.jpg\"]")
	public WebElement ipodShuffle;
	
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
	
	@FindBy(xpath = "//*[@id=\"button-shipping-method\"]")
	public WebElement shippingContinue;
	
	@FindBy(xpath = "//textarea[@name=\"comment\"]")
	public WebElement commentArea;
	
	@FindBy(xpath = "//*[@id=\"button-shipping-address\"]")
	public WebElement deliveryContinue;
	
	@FindBy(xpath = "//input[@name=\"agree\"]")
	public WebElement termsAndConditionsCheckBox;
	
	@FindBy(xpath = "//input[contains(@id,'button-payment-method')]")
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
	
	@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[1]/div/div[1]/a/img")
	public WebElement hp3065Image;
	
	@FindBy(xpath = "//div[@class=\"alert alert-success alert-dismissible\"]")
	public WebElement addToCartSuccessMessage;
	
	@FindBy(xpath = "//div[@class=\"alert alert-danger alert-dismissible\"]")
	public WebElement termsAndConditionsErrorMessage;
	
	
	@FindBy(xpath = "//input[contains(@name,'search')]")
	public WebElement searchBar;
	
	@FindBy(xpath = "//*[@class=\"btn btn-default btn-lg\"]")
	public WebElement searchBarEnter;
	
	@FindBy(xpath = "//img[contains(@src,'https://tutorialsninja.com/demo/image/cache/catalog/demo/macbook_1-228x228.jpg')]")
	public WebElement macBookItem;
	
	public void checkoutPageAssertion() {
		String expectedResult = "Checkout";
		String actualResult = getTitle();
		Assert.assertEquals(expectedResult, actualResult);
	}
	@FindBy(xpath = "//input[contains(@value,'guest')]")
	public WebElement guestUserCheckBox;
	
	@FindBy(xpath = "//*[@id=\"button-account\"]")
	public WebElement checkoutContinue;
	
	@FindBy(xpath = "//*[@id=\"accordion\"]/div[2]/div[1]/h4/a")
	public WebElement billingDetailsField;
	
	@FindBy(xpath = "//input[contains(@name,'firstname')]")
	public WebElement firstNameField;
	
	@FindBy(xpath = "//input[contains(@name,'lastname')]")
	public WebElement lastNameField;
	
	@FindBy(xpath = "//*[@id=\"input-payment-email\"]")
	public WebElement emailField;
	
	@FindBy(xpath = "//input[contains(@name,'telephone')]")
	public WebElement telephoneField;
	
	@FindBy(xpath = "//*[@id=\"input-payment-address-1\"]")
	public WebElement addressField;
	
	@FindBy(xpath = "//input[contains(@name,'city')]")
	public WebElement cityField;
	
	@FindBy(xpath = "//input[contains(@name,'postcode')]")
	public WebElement postCodeField;
	
	@FindBy(xpath = "//*[@id=\"input-payment-country\"]")
	public WebElement countryDropDown;
	
	@FindBy(xpath = "//*[@id=\"input-payment-zone\"]")
	public WebElement regionDropDown;
	
	@FindBy(xpath = "//*[@id=\"button-guest\"]")
	public WebElement billingDetailsContinue;
	
	@FindBy(xpath = "//*[@class=\"alert alert-warning alert-dismissible\"]")
	public WebElement noPaymentMethodErrorMessage;
	
	@FindBy(xpath = "//*[@href=\"https://tutorialsninja.com/demo/index.php?route=information/contact\"]  ")
	public WebElement contactUsLink;
	
	public void AssertionOfContactUsPage() {
		
		String expectedUrl = "https://tutorialsninja.com/demo/index.php?route=information/contact";
		String actualUrl = driver.getDriver().getCurrentUrl();
		
		Assert.assertEquals(expectedUrl, actualUrl);
	}
	
	@FindBy(xpath = "//*[contains(@ id,'input-name')]")
	public WebElement contactUsNameField;
	
	@FindBy(xpath = "//*[contains(@ id,'input-email')]")
	public WebElement contactUsEmail;
	
	@FindBy(xpath = "//*[contains(@ id,'input-enquiry')]")
	public WebElement contactUsEnquiryField;
	
	@FindBy(xpath = "//*[contains(@ type,'submit')]")
	public WebElement contactUsSubmitButton;
	
	@FindBy(xpath = "//*[contains(@ id,'content')]/h1")
	public WebElement contactUsHeader;
	
	public void contactUsPageAssertion() {
		
		String expectedText = "Contact Us";
		String actualText = cp.contactUsHeader.getText();
		
		Assert.assertEquals(expectedText, actualText);
		
	}
	
	public void homePageAssertion() {
		
		String expectedTitle = "Your Store";
		String actualTitle = getTitle();
		
		Assert.assertEquals(expectedTitle, actualTitle);
	}
	
	@FindBy(xpath = "//*[contains(@ class,'btn btn-primary')]")
	public WebElement contactUsContinue;
	
	
	}
	
	
	
	
	



