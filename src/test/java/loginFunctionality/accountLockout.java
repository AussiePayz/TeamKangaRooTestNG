package loginFunctionality;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.commonMethods;
import utilities.configReader;
import utilities.driver;

public class accountLockout extends commonMethods {

	@BeforeMethod
	public void setup() {
		driver.getDriver();
	}

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

	@AfterMethod(enabled = true)
	public void closeBrowser() {
		driver.tearDown();
	}

}
