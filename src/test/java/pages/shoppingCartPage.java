package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.commonMethods;
import utilities.configReader;
import utilities.driver;

public class shoppingCartPage extends commonMethods{
	
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
	
	@FindBy(xpath = "//div[@class='product-thumb']/div/a")
	public WebElement firstItemThumbnail;
	
	@FindBy(xpath = "//input[@name='quantity']")
	public WebElement quantityBar;
	
	@FindBy(xpath = "//button[@id='button-cart']")
	public WebElement addToCartButton;
	
	@FindBy(xpath = "//ul[@class='list-inline']/li[4]/a")
	public WebElement shoppingCartButton;
	
	@FindBy(xpath = "//button[@class='btn btn-danger']")
	public WebElement deleteItemsFromShoppingCartButton;
	
	public static void LoginWithValidCredentials() {
//		  click on "My Account" button
		scp.MyAccount.click();
//		driver.getDriver().findElement(By.xpath("//*[@title='My Account']")).click(); //commonMethod selectDropDownValue
//		  click on "Login " button
		scp.MyAccountLogin.click();
//		driver.getDriver().findElement(By.xpath("//*[@href=\"https://tutorialsninja.com/demo/index.php?route=account/login\"]")).click(); // commonMethod selectDropDownValue
//		  enter valid credentials
//		driver.getDriver().findElement(By.xpath("//input[@name='email']")).sendKeys(configReader.getProperty("validEmail")); // email input
		scp.emailField.sendKeys(configReader.getProperty("validEmail"));
//		driver.getDriver().findElement(By.xpath("//input[@name='password']")).sendKeys(configReader.getProperty("validPassword")); // password input
		scp.passwordField.sendKeys(configReader.getProperty("validPassword"));
//		  click login button
//		driver.getDriver().findElement(By.xpath("//input[@type='submit']")).click(); //login button
//		  home page open up
		scp.loginButton.click();
//		String expectedURL = "https://tutorialsninja.com/demo/index.php?route=account/account"; //URL after logging in account page
//		String actualURL = driver.getDriver().getCurrentUrl();
	}
	
	public static void SearchItem(String item) {
//		  click on search bar
//		driver.getDriver().findElement(By.xpath("//input[@name='search']")).sendKeys("HTC"); //search bar
		scp.searchBar.sendKeys(item);
//		driver.getDriver().findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click(); //search button
		scp.searchButton.click();
	}
	
	public static void addNumberOfItemToShoppingCart(String number) {
//		  click on quantity Bar
//		driver.getDriver().findElement(By.xpath("//input[@name='quantity']")).clear();
		scp.quantityBar.clear();
//		driver.getDriver().findElement(By.xpath("//input[@name='quantity']")).sendKeys("2");//quantity bar//changes quantity to 2
		scp.quantityBar.sendKeys(number);
//		  click on "Add To Shopping Cart"
//		driver.getDriver().findElement(By.xpath("//button[@id='button-cart']")).click();//add to cart button// clicks add to cart
		scp.addToCartButton.click();
	}
}
