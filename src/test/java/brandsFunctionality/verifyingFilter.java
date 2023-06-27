package brandsFunctionality;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.commonMethods;

public class verifyingFilter extends commonMethods{
	@Test
	public void test3() {
		
	Assert.assertTrue(bp.homepage.isDisplayed());	
		
	bp.brandsbutton.click();
	
	Assert.assertTrue(bp.brandspage.isDisplayed());
	
	bp.Applebutton.click();
	
	Assert.assertTrue(bp.AppleLogo.isDisplayed());
	
	bp.OptionsBylowToHigh.click();
	
	Assert.assertTrue(bp.pricePage.isDisplayed());
		
		
		
		
		
		
	}

}
