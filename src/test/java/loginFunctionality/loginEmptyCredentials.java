package loginFunctionality;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.commonMethods;
import utilities.configReader;
import utilities.driver;

public class loginEmptyCredentials extends commonMethods {

	@BeforeMethod
	public void setup() {
		driver.getDriver();
	}

	@Test(enabled = true)
	public void testLogin() {

		lp.myAccountButton.click();
		lp.loginOption.click();
		lp.emailField.clear();
		lp.passwordField.clear();
		lp.loginButton.click();
		String expectedErrorMessage = configReader.getProperty("ErrorMessage"),
				actualErrorMessage = lp.actualErrorMessage.getText();
		Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
	}

	@AfterMethod(enabled = true)
	public void closeBrowser() {
		driver.tearDown();
	}

}
