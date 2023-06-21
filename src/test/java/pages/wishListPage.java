package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.commonMethods;
import utilities.configReader;
import utilities.driver;

public class wishListPage {

	public wishListPage() {

		PageFactory.initElements(driver.getDriver(), this);

	}

	@FindBy(xpath = "//span[contains(@class,'caret')]")
	public WebElement myAccountButton;

	@FindBy(xpath = "//*[contains(@class,'dropdown-menu dropdown-menu-right')]/li[2]/a")
	public WebElement loginOption;

	@FindBy(id = "input-email")
	public WebElement emailField;

	@FindBy(id = "input-password")
	public WebElement passwordField;

	@FindBy(xpath = "//input[contains(@type, 'submit')]")
	public WebElement loginButton;

	public void myAccountPage() {
		String expectedTitle = "My Account";
		String actualTitle = driver.getDriver().getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}
	
	public void myWishListPage() {
		String expectedTitle = "My Wish List";
		String actualTitle = driver.getDriver().getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@FindBy(xpath = "//a[@href='https://tutorialsninja.com/demo/index.php?route=common/home']")
	public WebElement homeButton;

	@FindBy(xpath = "//*[@id=\"content\"]/div[2]")
	public WebElement featuredContent;

	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[1]/div/div[3]/button[2]")
	public WebElement heartIcon;

	@FindBy(xpath = "//div[contains(@class, 'alert alert-success alert-dismissible')]")
	public WebElement successMessage;

	@FindBy(xpath = "//*[@id=\"wishlist-total\"]")
	public WebElement wishListButton;

	@FindBy(xpath = "//*[@class='table-responsive']")
	public WebElement productTable;   //*[@id=\"content\"]/div[1]/table

	@FindBy(xpath = "//td[contains(@class,'text-right')]/a")
	public WebElement removeButton;

	@FindBy(xpath = "//*[@id=\"account-wishlist\"]/div[1]")
	public WebElement youHaveModifiedYourWishList;

}
