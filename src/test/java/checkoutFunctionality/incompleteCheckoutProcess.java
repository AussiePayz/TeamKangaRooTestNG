package checkoutFunctionality;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.commonMethods;
import utilities.configReader;
import utilities.retryAnalyzer;

public class incompleteCheckoutProcess extends commonMethods{
	
	@Test(retryAnalyzer = retryAnalyzer.class, priority = 2)
	public void test2() {
		
		cp.successfulLogin();
		cp.laptopsAndNoteBooks.click();
		cp.showAllLaptopsOption.click();
		cp.hp3065Image.click();
		cp.addToCartButton.click();
		Assert.assertTrue(cp.addToCartSuccessMessage.isDisplayed());
		cp.checkoutButton.click();
		Assert.assertTrue(cp.checkoutLogo.isDisplayed());
		cp.addressContinue.click();
		cp.deliveryContinue.click();
		cp.commentArea.sendKeys(configReader.getProperty("commentTest"));
		cp.shippingContinue.click();
		cp.paymentContinue.click();
		Assert.assertTrue(cp.termsAndConditionsErrorMessage.isDisplayed());
		
		
	}

}
