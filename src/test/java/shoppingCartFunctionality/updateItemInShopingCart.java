package shoppingCartFunctionality;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.commonMethods;
import utilities.configReader;
import utilities.driver;

public class updateItemInShopingCart extends commonMethods {

	@Test(enabled = true)
	public void updateShoppingCart() {
		scp.LoginWithValidCredentials();
		Assert.assertEquals(commonMethods.currentURL(), configReader.getProperty("accountPage"));
		scp.navigateToHomePageButton.click();
		Assert.assertEquals(commonMethods.currentURL(), configReader.getProperty("homePage"));
		scp.shoppingCartButton.click();
		List<WebElement> list = driver.getDriver().findElements(By.xpath(scp.pageContainsItemXPath));
		Assert.assertTrue(list.size() > 0, "There are no Items in the Shoppig Cart!");
		int initialAmountOfItems = scp.getNumberFromString(scp.amountOfFirstItemInShoppingCart.getAttribute("value"));
		scp.findByStringXpath(scp.pageContainsItemXPath).click();
		Assert.assertEquals(commonMethods.currentURL(), configReader.getProperty("HTCTouchHDItemPage"));
		scp.addNumberOfItemToShoppingCart(configReader.getProperty("amountToAdd"));
		int amountAdded = scp.getNumberFromString(configReader.getProperty("amountToAdd"));
		scp.shoppingCartButton.click();
		Assert.assertEquals(scp.getNumberFromString(scp.amountOfFirstItemInShoppingCart.getAttribute("value")),
				initialAmountOfItems + amountAdded);
	}

}
