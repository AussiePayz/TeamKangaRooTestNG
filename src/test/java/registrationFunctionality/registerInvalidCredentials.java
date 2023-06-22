package registrationFunctionality;

import utilities.commonMethods;

public class registerInvalidCredentials extends commonMethods{
	
public void test2() {
	rp.myaccount.click();
	rp.register.click();
	//test automation stopped as the bug found in step 4 as 
	//registration successful with combination of letter and 
	//numbers in Telephone field. bug report has been done. 
	//awaiting developer to fix the problem.
	
}

}
