package SearchBarFunctionality;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.commonMethods;
import utilities.configReader;
import utilities.driver;

//@Listeners(listenersTestNG.class)
public class searchUsingEnterKey extends commonMethods {

	@BeforeMethod(enabled = true)
	public void openBrowser() {
		driver.getDriver();
	}

	@Test(enabled = true)
	public void searchByUsingEnterKey() {
		sbp.searchBar.click();
		sbp.searchBar.sendKeys("HTC Touch");
		sbp.searchBar.sendKeys(Keys.RETURN);
		sbp.firstItemThumbnail.click();
		Assert.assertEquals(commonMethods.currentURL(), configReader.getProperty("itemPage"));
	}

	@AfterMethod(enabled = true)
	public void closeBrowser() {
		driver.tearDown();
	}

}
