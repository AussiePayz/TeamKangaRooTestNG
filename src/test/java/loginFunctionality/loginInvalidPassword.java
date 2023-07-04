package loginFunctionality;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.commonMethods;
import utilities.configReader;

public class loginInvalidPassword extends commonMethods {

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

}
