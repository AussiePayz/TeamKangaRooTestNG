package brandsFunctionality;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.commonMethods;

public class openBrandsPage extends commonMethods {
	
	@Test
	public void test1() {
		Assert.assertTrue(bp.homepage.isDisplayed());	
		
		bp.brandsbutton.click();
		
		Assert.assertTrue(bp.brandspage.isDisplayed());
		
		bp.Applebutton.click();
		
		Assert.assertTrue(bp.AppleLogo.isDisplayed());
		
		Assert.assertTrue(bp.ApplePageInfo.isDisplayed());
	
		
	}

}
