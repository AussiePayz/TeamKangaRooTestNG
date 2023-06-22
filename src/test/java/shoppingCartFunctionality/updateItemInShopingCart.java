package shoppingCartFunctionality;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.commonMethods;
import utilities.configReader;
import utilities.driver;

public class updateItemInShopingCart extends commonMethods {
	
	@BeforeTest(enabled = true)
	public void openBrowser() {
		driver.getDriver();
	}
	
	@Test(enabled = true)
	public void updateShoppingCart() {
	scp.LoginWithValidCredentials();
	Assert.assertEquals(commonMethods.currentURL(), configReader.getProperty("accountPage"));
	scp.navigateToHomePageButton.click();
	Assert.assertEquals(commonMethods.currentURL(), configReader.getProperty("homePage"));
	scp.shoppingCartButton.click();
	List<WebElement> list = driver.getDriver().findElements(By.xpath(scp.pageContainsItemXPath));
	Assert.assertTrue(list.size() > 0, "Text not found!");
	//store quantity into int
	
	scp.findByStringXpath(scp.pageContainsItemXPath).click();
	Assert.assertEquals(commonMethods.currentURL(), configReader.getProperty("HTCTouchHDItemPage"));
	scp.addNumberOfItemToShoppingCart("2");
//	update saved
	}

	@AfterTest(enabled = false)
	public void closeBrowser() {
		driver.tearDown();
	}
}
