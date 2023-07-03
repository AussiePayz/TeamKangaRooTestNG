package loginFunctionality;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.commonMethods;
import utilities.configReader;

public class accountLockout extends commonMethods {

	@Test(enabled = true)
	public void lockOutOfAccountAfterFiveTrys() {
		lp.myAccountButton.click();
		lp.loginOption.click();
		for (int i = 1; i <= 5; i++) {
			lp.emailField.sendKeys(configReader.getProperty("invalidEmail"));
			lp.passwordField.sendKeys(configReader.getProperty("invalidPassword"));
			lp.loginButton.click();
		}
		String expectedErrorMessage = configReader.getProperty("AcountLockoutWarning"),
				actualErrorMessage = lp.actualErrorMessage.getText();
		Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
	}

}
