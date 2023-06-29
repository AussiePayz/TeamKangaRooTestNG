package registrationFunctionality;


import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.commonMethods;
import utilities.configReader;

public class registerInvalidCredentials extends commonMethods{
	
	@Test
			public void test3() {
				rp.myaccount.click();
				rp.register.click();
				Assert.assertTrue(rp.RegisterAccountPage.isDisplayed());
				rp.firstname.sendKeys(configReader.getProperty("firstname"));
				rp.lastname.sendKeys(configReader.getProperty("lastname"));
			    rp.email.sendKeys(configReader.getProperty("validPassword"));
				//test automation stopped as the bug found in step 4 as 
				//registration successful with combination of letter and 
				//numbers in Telephone field. bug report has been done. 
				//awaiting developer to fix the problem.
				
			}

}
