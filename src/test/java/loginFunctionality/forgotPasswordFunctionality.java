package loginFunctionality;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.commonMethods;
import utilities.configReader;
import utilities.driver;

public class forgotPasswordFunctionality extends commonMethods {

	@Test(enabled = true)
	public void testLogin() {
		lp.myAccountButton.click();
		lp.loginOption.click();
		lp.ForgetPasswordButton.click();
		String expectedTitle = configReader.getProperty("forgotPassword"),
				actualTitle = driver.getDriver().getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		lp.ForgetPasswordEmail.sendKeys(configReader.getProperty("validEmail"));
		lp.ContinueButton.click();
		String expectedErrorMessage = configReader.getProperty("ForgetPasswordEmailSent"),
				actualErrorMessage = lp.ForgetEmailSuccessMessage.getText();
		Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
	}

}
