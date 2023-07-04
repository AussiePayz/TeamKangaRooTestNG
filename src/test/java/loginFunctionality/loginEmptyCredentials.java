package loginFunctionality;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.commonMethods;
import utilities.configReader;

public class loginEmptyCredentials extends commonMethods {

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


}
