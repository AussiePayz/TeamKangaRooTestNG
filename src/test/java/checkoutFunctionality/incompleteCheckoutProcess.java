package checkoutFunctionality;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.commonMethods;

public class incompleteCheckoutProcess extends commonMethods{
	
	@Test
	public void test2() {
		
		cp.successfulLogin();
		cp.laptopsAndNoteBooks.click();
		cp.showAllLaptopsOption.click();
		cp.hp3065Image.click();
		cp.addToCartButton.click();
		Assert.assertTrue(cp.addToCartSuccessMessage.isDisplayed());
		cp.checkoutButton.click();
		Assert.assertTrue(cp.checkoutLogo.isDisplayed());
		
	}

}
