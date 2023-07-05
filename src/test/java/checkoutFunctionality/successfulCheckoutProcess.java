package checkoutFunctionality;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.commonMethods;
import utilities.configReader;
import utilities.retryAnalyzer;

public class successfulCheckoutProcess extends commonMethods{
	
	@Test(enabled = true, retryAnalyzer = retryAnalyzer.class, groups = "smokeTest")
	public void test1() {
		
		cp.successfulLogin();
		cp.searchBar.sendKeys(configReader.getProperty("search"));
		cp.searchBarEnter.click();
		cp.ipodShuffle.click();
		cp.addToCartButton.click();
		Assert.assertTrue(cp.addToCartSuccessMessage.isDisplayed());
		cp.checkoutButton.click();
		Assert.assertTrue(cp.checkoutLogo.isDisplayed());
		cp.addressContinue.click();
		cp.deliveryContinue.click();
		cp.shippingContinue.click();
		cp.commentArea.sendKeys(configReader.getProperty("commentTest"));
		cp.termsAndConditionsCheckBox.click();
		cp.paymentContinue.click();
		Assert.assertTrue(cp.paymentContinue.isDisplayed());
		cp.confirmOrderButton.click();
		Assert.assertTrue(cp.orderHasBeenPlacedHeader.isDisplayed());
		cp.orderPageContinue.click();
	
		
	}
	
	
	
	}


	
	
	


