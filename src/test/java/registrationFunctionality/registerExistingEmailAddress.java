package registrationFunctionality;

import org.testng.annotations.Test;
import org.testng.Assert;
import utilities.commonMethods;
import utilities.configReader;

public class registerExistingEmailAddress extends commonMethods {

		@Test
		public void testcase2() {
			rp.myaccount.click();
			rp.register.click();
			Assert.assertTrue(rp.RegisterAccountPage.isDisplayed());
			rp.firstname.sendKeys(configReader.getProperty("firstname"));
			rp.lastname.sendKeys(configReader.getProperty("lastname"));
		    rp.email.sendKeys(configReader.getProperty("validEmail"));
		    rp.telephone.sendKeys(configReader.getProperty("Telephone"));
		    rp.password.sendKeys(configReader.getProperty("validPassword"));
		    rp.confirmpassword.sendKeys(configReader.getProperty("validPassword"));
		    
		    rp.privacypolicy.click();
		    rp.checkbox.click();
		    rp.continueButton.click();
		    Assert.assertTrue(rp.emailExistingMessage.isDisplayed());
		}
}
