package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.driver;

public class brandsPage {
	
public brandsPage() {
		
PageFactory.initElements(driver.getDriver(), this);

}
	
@FindBy(xpath="//div[@id='logo']")	
 public WebElement homepage;

@FindBy(xpath="//div[@class='row']/div[3]/ul/li[1]/a")	
public WebElement brandsbutton;

@FindBy(xpath="//div[@id='content']/h1")	
public WebElement brandspage;

@FindBy(xpath="//*[@id=\"content\"]/div[1]/div/a")	
public WebElement Applebutton;

@FindBy(xpath="//*[@id='content']/h2")	
public WebElement AppleLogo;

@FindBy(xpath="//*[@id='product-manufacturer']")
public WebElement ApplePageInfo;

@FindBy(xpath="//*[@id='input-sort']/option[4]")	
public WebElement OptionsBylowToHigh;

@FindBy(xpath="//*[@id='product-manufacturer']")
public WebElement pricePage;

@FindBy(xpath="//*[@id=\"content\"]/div[2]/div[3]/div/div[1]/a")
public WebElement iphone;

@FindBy(xpath="//*[@id='button-cart']")
public WebElement AddToCartbutton;

@FindBy(xpath="//*[@id='product-product']/div/a[1]")
public WebElement Success;






















}
