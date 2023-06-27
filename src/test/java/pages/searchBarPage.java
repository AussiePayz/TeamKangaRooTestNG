package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.commonMethods;
import utilities.driver;

public class searchBarPage  extends commonMethods {
	
	public searchBarPage() {
		
		PageFactory.initElements(driver.getDriver(), this);
		
	}
	@FindBy(xpath = "//*[@title='My Account']")
	public WebElement MyAccount;
		
	@FindBy(xpath = "//input[@name='search']")
	public WebElement searchBar;	
		
	@FindBy(xpath = "//button[@class='btn btn-default btn-lg']")
	public WebElement searchButton;	
		
	@FindBy(xpath = "//div[@class='product-thumb']/div/a")
	public WebElement firstItemThumbnail;
	
	@FindBy(xpath = "//button[@id='button-cart']")
	public WebElement addToCartButton;
	@FindBy(xpath = "//div[@id='content']/p[2]")
	public WebElement pageMessage;
			
		}

