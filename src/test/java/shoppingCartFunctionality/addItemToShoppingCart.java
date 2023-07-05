package shoppingCartFunctionality;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilities.listenersTestNG;
import utilities.commonMethods;
import utilities.configReader;
import utilities.driver;

@Listeners(listenersTestNG.class)
public class addItemToShoppingCart extends commonMethods {

	@Test(enabled = true, groups = "smokeTest")
	public void addAnItemToShoppingCart() {
		scp.LoginWithValidCredentials();
		Assert.assertEquals(commonMethods.currentURL(), configReader.getProperty("accountPage"));
		scp.navigateToHomePageButton.click();
		Assert.assertEquals(commonMethods.currentURL(), configReader.getProperty("homePage"));
		scp.SearchItem(configReader.getProperty("searchItem"));
		String messageText = scp.getTextFromXpath(scp.firstItemThumbnail);
		Assert.assertEquals(messageText,configReader.getProperty("searchItem"), "Item searched for not found!");
		scp.firstItemThumbnail.click();
		scp.addNumberOfItemToShoppingCart("2");
		scp.shoppingCartButton.click();
		List<WebElement> list = driver.getDriver().findElements(By.xpath(scp.pageContainsItemXPath));
		Assert.assertTrue(list.size() > 0, "Text not found!");
	}

}
