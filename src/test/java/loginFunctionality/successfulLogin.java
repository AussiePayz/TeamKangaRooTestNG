package loginFunctionality;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.commonMethods;
import utilities.configReader;
import utilities.driver;

public class successfulLogin extends commonMethods {

	@Test
	public void testLogin() {
		lp.myAccountButton.click();
		lp.loginOption.click();
		lp.emailField.sendKeys("tech@circle.com");
		lp.passwordField.sendKeys("Selenium123!");
		lp.loginButton.click();
		String expectedRedirectUrl = configReader.getProperty("accountPage"),
				actualRedirectUrl = driver.getDriver().getCurrentUrl();
		Assert.assertEquals(actualRedirectUrl, expectedRedirectUrl, "User was not redirected to the correct page");
	}

}
