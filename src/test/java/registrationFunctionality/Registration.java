package registrationFunctionality;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.commonMethods;
import utilities.configReader;

public class Registration extends commonMethods{
	
	@Test
	public void test1() {
		
		rp.myaccount.click();
		
		
		rp.register.click();
		Assert.assertTrue(rp.RegisterAccountPage.isDisplayed());
		
		rp.firstname.sendKeys(configReader.getProperty("firstname"));
		rp.lastname.sendKeys(configReader.getProperty("lastname"));
	    rp.newEmailGeneration();
	    //rp.email.sendKeys(configReader.getProperty("validEmail"));
	    rp.telephone.sendKeys(configReader.getProperty("Telephone"));
	    rp.password.sendKeys(configReader.getProperty("validPassword"));
	    rp.confirmpassword.sendKeys(configReader.getProperty("validPassword"));
	    
	    rp.privacypolicy.click();
	    rp.checkbox.click();
	
	    rp.continueButton.click();
	    
	    Assert.assertTrue(rp.successfullMessage.isDisplayed());
	}
	
	
		
		

	}

	




