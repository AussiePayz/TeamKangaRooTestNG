package shoppingCartFunctionality;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilities.commonMethods;
import utilities.configReader;
import utilities.driver;
import utilities.listenersTestNG;

@Listeners(listenersTestNG.class)
public class removeItemFromShoppingCart extends commonMethods {

	@Test
	public void deleteItemFromShoppingCart() {
	scp.LoginWithValidCredentials();
	Assert.assertEquals(currentURL(), configReader.getProperty("accountPage"));
	scp.navigateToHomePageButton.click();
	Assert.assertEquals(currentURL(), configReader.getProperty("homePage"));
	scp.shoppingCartButton.click();
	List<WebElement> list = driver.getDriver().findElements(By.xpath(scp.pageContainsItemXPath));
	Assert.assertTrue(list.size() > 0, "Text not found!");
	scp.deleteItemsFromShoppingCartButton.click();
	wait(1);
	list.clear();
	list = driver.getDriver().findElements(By.xpath(scp.pageContainsItemXPath));
	Assert.assertEquals(list.size(),0, "XPath still exists!");
	String messageText = scp.getTextFromXpath(scp.containsEmptyShoppingCartMessageXPath);
	Assert.assertEquals(messageText,configReader.getProperty("emptyShoppingCartMessage"), "Empty cart message not found!");
	}

}
