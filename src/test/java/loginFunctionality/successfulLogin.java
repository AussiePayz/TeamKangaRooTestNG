package loginFunctionality;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.commonMethods;
import utilities.configReader;
import utilities.driver;

public class successfulLogin extends commonMethods {

	@Test(enabled = true, groups = "smokeTest")
	public void testLogin() {
		lp.myAccountButton.click();
		lp.loginOption.click();
		lp.emailField.sendKeys(configReader.getProperty("validEmail"));
		lp.passwordField.sendKeys(configReader.getProperty("validPassword"));
		lp.loginButton.click();
		String expectedRedirectUrl = configReader.getProperty("accountPage"),
				actualRedirectUrl = currentURL();
		Assert.assertEquals(actualRedirectUrl, expectedRedirectUrl, "User was not redirected to the correct page");
	}

}
