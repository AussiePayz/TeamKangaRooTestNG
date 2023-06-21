package wishListFunctionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import org.testng.annotations.Test;

import utilities.commonMethods;
import utilities.configReader;


public class verifyWishlistPersistence extends commonMethods {

	@Test
	public void test3() {
		wp.myAccountButton.click();
		wp.loginOption.click();
		wp.emailField.sendKeys(configReader.getProperty("validEmail"));
		wp.passwordField.sendKeys(configReader.getProperty("validPassword"));
		wp.loginButton.click();
		wp.myAccountPage();
		wp.homeButton.click();
		wp.heartIcon.click();
		Assert.assertTrue(wp.successMessage.isDisplayed());
		tearDown();
		getDriver();
		wp.myAccountButton.click();
		wp.loginOption.click();
		wp.emailField.sendKeys(configReader.getProperty("validEmail"));
		wp.passwordField.sendKeys(configReader.getProperty("validPassword"));
		wp.loginButton.click();
		wp.wishListButton.click();
		wp.myWishListPage();
		wp.wishListItemValidation();

		
		
    }
	
	
	
}