package wishListFunctionality;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import org.testng.annotations.Test;

import utilities.commonMethods;
import utilities.configReader;


public class verifyWishlistPersistence extends commonMethods {

	@Test
	public void test3() {
		wp.heartIcon.click();
		Assert.assertTrue(wp.successMessage.isDisplayed());
		utilities.driver.tearDown();
		utilities.driver.getDriver();
		wp.wishListButton.click();
		wp.emailField.sendKeys(configReader.getProperty("validEmail"));
		wp.passwordField.sendKeys(configReader.getProperty("validPassword"));
		wp.loginButton.click();
		wp.myWishListPage();
		Assert.assertTrue(wp.productTable.isDisplayed());
		
    }
	
	
	
}