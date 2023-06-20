package shoppingCartFunctionality;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.shoppingCartPage;
import utilities.listenersTestNG;
import utilities.commonMethods;
import utilities.configReader;
import utilities.driver;

@Listeners(listenersTestNG.class)
public class addItemToShoppingCart extends commonMethods {

	@BeforeTest(enabled = true)
	public void openBrowser() {
		driver.getDriver();
	}

	@Test(enabled = true)
	public void addAnItemToShoppingCart() {
		shoppingCartPage.LoginWithValidCredentials();
		Assert.assertEquals(commonMethods.currentURL(),configReader.getProperty("accountPage"));
		shoppingCartPage.SearchItem("HTC Touch HD");
		scp.firstItemThumbnail.click();
		shoppingCartPage.addNumberOfItemToShoppingCart("2");
		scp.shoppingCartButton.click();
		List<WebElement> list = driver.getDriver().findElements(By.xpath("//a[contains(text(),'"+"HTC Touch HD"+"')]"));
		Assert.assertTrue(list.size() > 0, "Text not found!"); 
		scp.deleteItemsFromShoppingCartButton.click();
	}

	@AfterTest(enabled = true)
	public void closeBrowser() {
		driver.tearDown();
	}

}
