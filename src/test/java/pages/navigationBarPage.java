package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.driver;

public class navigationBarPage {
	
	public navigationBarPage() {
		
		PageFactory.initElements(driver.getDriver(), this);
	}
//	@FindBy(xpath="//button[text()=' Login ']")
//    public WebElement loginButton;
//	
//	driver.findElement(By.xpath("//*[text()='Desktops']")).click();
//    
//	driver.findElement(By.xpath("//*[text()='Mac (1)']")).click();
//	
	
	@FindBy(xpath="//*[text()='Desktops']")
	public WebElement desktops;
	
	@FindBy(xpath="//*[text()='Mac (1)']")
	public WebElement mac;
	
	
//	driver.findElement(By.xpath("//*[@class='dropdown'] /*[text()='Components']")).click();
//	driver.findElement(By.xpath("//*[text()='Monitors (2)']")).click();
//	driver.findElement(By.xpath("//*[@id='input-sort']")).click();
//	driver.findElement(By.xpath("//*[text()='Name (A - Z)']")).click();
	
	
	
	@FindBy(xpath="//*[@class='dropdown'] /*[text()='Components']")
	public WebElement components ;
	
	@FindBy(xpath="//*[text()='Monitors (2)']")
	public WebElement monitors;
	
	@FindBy(xpath="//*[@id='input-sort']")
	public WebElement option;
	@FindBy(xpath="//*[text()='Name (A - Z)']")
	public WebElement nameAZ;
	
//	driver.findElement(By.xpath("//*[@class='dropdown'] /*[text()='Components']")).click();
//    driver.findElement(By.xpath("//*[text()='Monitors (2)']")).click();
//    driver.findElement(By.xpath("//*[@alt='Apple Cinema 30\"']")).click();

	@FindBy(xpath="//*[@class='dropdown'] /*[text()='Components']")
	public WebElement Components;
	@FindBy(xpath="//*[text()='Monitors (2)']")
	public WebElement Monitors;
	@FindBy(xpath="//*[@alt='Apple Cinema 30\\\"']")
	public WebElement AppleCinema;
	
	
	
	@FindBy(xpath="//h2[text()='Mac']")
	public WebElement macText;
	
	
	@FindBy(xpath="//*[text()='Show AllDesktops']")
	public WebElement  showAllDesktopsText;
	
}

