package shoppingCartFunctionality;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilities.commonMethods;
import utilities.configReader;
import utilities.driver;
import utilities.listenersTestNG;

@Listeners(listenersTestNG.class)
public class removeItemFromShoppingCart extends commonMethods {

	@BeforeTest(enabled = true)
	public void openBrowser() {
		driver.getDriver();
	}

	@Test
	public void deleteItemFromShoppingCart() {
	scp.LoginWithValidCredentials();
	Assert.assertEquals(commonMethods.currentURL(), configReader.getProperty("accountPage"));
	scp.navigateToHomePageButton.click();
	Assert.assertEquals(commonMethods.currentURL(), configReader.getProperty("homePage"));
	scp.shoppingCartButton.click();
	List<WebElement> list = driver.getDriver().findElements(By.xpath(scp.pageContainsItemXPath));
	Assert.assertTrue(list.size() > 0, "Text not found!");
	scp.deleteItemsFromShoppingCartButton.click();
	commonMethods.wait(1);
	list.clear();
	list = driver.getDriver().findElements(By.xpath(scp.pageContainsItemXPath));
	Assert.assertEquals(list.size(),0, "XPath still exists!");
	String messageText = scp.getTextFromXpath(scp.containsEmptyShoppingCartMessageXPath);
	Assert.assertEquals(messageText,"Your shopping cart is empty!", "Empty cart message not found!");
	}

	@AfterTest(enabled = false)
	public void closeBrowser() {
		driver.tearDown();
	}
}
