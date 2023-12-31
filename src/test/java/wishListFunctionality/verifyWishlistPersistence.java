package wishListFunctionality;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.commonMethods;
import utilities.configReader;


public class verifyWishlistPersistence extends commonMethods {

	@Test(enabled=true)
	public void test3() {
		wp.myAccountButton.click();
		wp.loginOption.click();
		wp.emailField.sendKeys(configReader.getProperty("validEmail"));
		wp.passwordField.sendKeys(configReader.getProperty("validPassword"));
		wp.loginButton.click();
		wp.myAccountPage();
		wp.homeButton.click();
		wp.itemName.click();
		wp.addToWishList.click();
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

    }
}