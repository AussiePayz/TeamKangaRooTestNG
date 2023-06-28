package registrationFunctionality;

import org.testng.Assert;

import utilities.commonMethods;
import utilities.configReader;

public class registerInvalidCredentials extends commonMethods{
	
	public void test2() {
		rp.myaccount.click();
		rp.register.click();
		Assert.assertTrue(rp.RegisterAccountPage.isDisplayed());
		rp.firstname.sendKeys(configReader.getProperty("firstname"));
		rp.lastname.sendKeys(configReader.getProperty("lastname"));
	    rp.email.sendKeys(configReader.getProperty("E-mail"));
		//test automation stopped as the bug found in step 4 as 
		//registration successful with combination of letter and 
		//numbers in Telephone field. bug report has been done. 
		//awaiting developer to fix the problem.
		
	}

}
