package brandsFunctionality;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.commonMethods;

public class verifyDescriptionInBrandspage extends commonMethods{
	@Test
	public void test2() {
		
	Assert.assertTrue(bp.homepage.isDisplayed());	
		
		bp.brandsbutton.click();
		
		Assert.assertTrue(bp.brandspage.isDisplayed());
		
		bp.Applebutton.click();
		
		Assert.assertTrue(bp.AppleLogo.isDisplayed());
		
		bp.iphone.click();
		
		bp.AddToCartbutton.click();
		
		Assert.assertTrue(bp.Success.isDisplayed());
		
		
	}

}
