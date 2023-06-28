package registrationFunctionality;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.commonMethods;
import utilities.configReader;

public class successfulRegistration extends commonMethods{
	
	@Test
	public void test1() {
		
		rp.myaccount.click();
		
		
		rp.register.click();
		Assert.assertTrue(rp.RegisterAccountPage.isDisplayed());
		rp.firstname.sendKeys(configReader.getProperty("firstname"));
		rp.lastname.sendKeys(configReader.getProperty("lastname"));
	    rp.email.sendKeys(configReader.getProperty("E-mail"));
	    rp.telephone.sendKeys(configReader.getProperty("Telephone"));
	    rp.password.sendKeys(configReader.getProperty("password"));
	    rp.confirmpassword.sendKeys(configReader.getProperty("confirmPassword"));
	    
	    rp.privacypolicy.click();
	    rp.checkbox.click();
	
	    rp.continueButton.click();
	    
	    Assert.assertTrue(rp.successfullMessage.isDisplayed());
	}
	
	
	

}
