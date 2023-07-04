package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.commonMethods;
import utilities.configReader;
import utilities.driver;

public class shoppingCartPage extends commonMethods {

	public shoppingCartPage() {

		PageFactory.initElements(driver.getDriver(), this);
	}

	@FindBy(xpath = "//input[@name='email']")
	public WebElement emailField;

	@FindBy(xpath = "//input[@name='password']")
	public WebElement passwordField;

	@FindBy(xpath = "//input[@type='submit']")
	public WebElement loginButton;

	@FindBy(xpath = "//*[@title='My Account']")
	public WebElement MyAccount;

	@FindBy(xpath = "//*[@href=\"https://tutorialsninja.com/demo/index.php?route=account/login\"]")
	public WebElement MyAccountLogin;

	@FindBy(xpath = "//input[@name='search']")
	public WebElement searchBar;

	@FindBy(xpath = "//button[@class='btn btn-default btn-lg']")
	public WebElement searchButton;
	
	@FindBy(xpath = "//div[@class='product-thumb']/div[2]/div/h4/a")
	public WebElement firstItemThumbnail;

	@FindBy(xpath = "//input[@name='quantity']")
	public WebElement quantityBar;

	@FindBy(xpath = "//button[@id='button-cart']")
	public WebElement addToCartButton;

	@FindBy(xpath = "//ul[@class='list-inline']/li[4]/a")
	public WebElement shoppingCartButton;

	@FindBy(xpath = "//button[@class='btn btn-danger']")
	public WebElement deleteItemsFromShoppingCartButton;

	@FindBy(xpath = "//a[@href='https://tutorialsninja.com/demo/index.php?route=common/home']")
	public WebElement navigateToHomePageButton;

	@FindBy(xpath = "//div[@class='col-sm-12']/p")
	public WebElement containsEmptyShoppingCartMessageXPath;
	
	@FindBy(xpath = "//div[@class='input-group btn-block']/input")
	public WebElement amountOfFirstItemInShoppingCart;

	public String pageContainsItemXPath = "(//a[contains(text(),'" + configReader.getProperty("searchItem") + "')])[2]";

	public WebElement findByStringXpath(String xpath) {
		WebElement findBy = driver.getDriver().findElement(By.xpath(xpath));
		return findBy;
	}
	public String getTextFromXpath(WebElement xpath) {
		WebElement XPathWithTextInIt = xpath;
		String messageText = XPathWithTextInIt.getText();
		return messageText;
	}
	public int getNumberFromString(String messageText) {
		int number = Integer.parseInt(messageText);
		return number;
	}
	

	public void LoginWithValidCredentials() {
//		  click on "My Account" button
		scp.MyAccount.click();
//		  click on "Login " button
		scp.MyAccountLogin.click();
//		  enter valid credentials
		scp.emailField.sendKeys(configReader.getProperty("validEmail"));
		scp.passwordField.sendKeys(configReader.getProperty("validPassword"));
//		  click login button
//		  home page open up
		scp.loginButton.click();
	}

	public void SearchItem(String item) {
//		  click on search bar
		scp.searchBar.sendKeys(item);
		scp.searchButton.click();
	}

	public void addNumberOfItemToShoppingCart(String number) {
//		  click on quantity Bar
		scp.quantityBar.clear();
//		  choose amount to add
		scp.quantityBar.sendKeys(number);
//		  click on "Add To Shopping Cart"
		scp.addToCartButton.click();
	}

}
