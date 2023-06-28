package loginFunctionality;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.commonMethods;
import utilities.configReader;
import utilities.driver;

public class successfulLogin extends commonMethods {

	@BeforeMethod
	public void setup() {
		driver.getDriver();
	}

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

	@AfterMethod
	public void closeBrowser() {
		driver.tearDown();
	}
}
