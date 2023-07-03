package loginFunctionality;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.commonMethods;
import utilities.configReader;
import utilities.driver;

public class loginInvalidPassword extends commonMethods {

	@BeforeMethod
	public void setup() {
		driver.getDriver();
	}

	@Test
	public void testLogin() {
		lp.myAccountButton.click();
		lp.loginOption.click();
		lp.emailField.sendKeys(configReader.getProperty("validEmail"));
		lp.passwordField.sendKeys(configReader.getProperty("invalidPassword"));
		lp.loginButton.click();
		String expectedErrorMessage = configReader.getProperty("ErrorMessage"),
				actualErrorMessage = lp.actualErrorMessage.getText();
		Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
	}

	@AfterMethod
	public void closeBrowser() {
		driver.tearDown();
	}

}
