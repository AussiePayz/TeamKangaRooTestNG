package checkoutFunctionality;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.commonMethods;
import utilities.configReader;

public class successfulCheckoutProcess extends commonMethods{
	
	@Test(enabled = true)
	public void test1() {
		
		cp.successfulLogin();
		cp.phonePdaButton.click();
		cp.htcButton.click();
		cp.addToCartButton.click();
		Assert.assertTrue(cp.addToCartSuccessMessage.isDisplayed());
		cp.checkoutButton.click();
		Assert.assertTrue(cp.checkoutLogo.isDisplayed());
		cp.addressContinue.click();
		cp.shippingContinue.click();
		cp.commentArea.sendKeys(configReader.getProperty("commentTest"));
		cp.deliveryContinue.click();
		cp.termsAndConditionsCheckBox.click();
		cp.paymentContinue.click();
		Assert.assertTrue(cp.paymentContinue.isDisplayed());
		cp.confirmOrderButton.click();
		Assert.assertTrue(cp.orderHasBeenPlacedHeader.isDisplayed());
		cp.orderPageContinue.click();
		
		
	}
	
	
	
	}


	
	
	


