package wishListFunctionality;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.commonMethods;
import utilities.configReader;
import utilities.driver;

public class removeProductFromWishlist extends commonMethods {

	@Test
	public void test2() {

		wp.myAccountButton.click();
		wp.loginOption.click();
		wp.emailField.sendKeys(configReader.getProperty("validEmail"));
		wp.passwordField.sendKeys(configReader.getProperty("validPassword"));
		wp.loginButton.click();
		//cp.successfulLogin();
		wp.myAccountPage();
		wp.homeButton.click();
		Assert.assertTrue(wp.featuredContent.isDisplayed());
		wp.heartIcon.click();
		Assert.assertTrue(wp.successMessage.isDisplayed());
		wp.wishListButton.click();
		wp.wishListItemValidation();
		wp.removeButton.click();
		Assert.assertTrue(wp.youHaveModifiedYourWishList.isDisplayed());

	}

}
