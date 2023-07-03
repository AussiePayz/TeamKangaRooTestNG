package SearchBarFunctionality;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.commonMethods;
import utilities.configReader;
import utilities.driver;

public class singleClickSearch extends commonMethods{
	@BeforeMethod(enabled = true)
	public void openBrowser() {
		driver.getDriver();
	}

	@Test(enabled = true)
	public void searchByUsingSearchButton() {
		sbp.searchBar.click();
		sbp.searchBar.sendKeys("HTC Touch");
		sbp.searchButton.click();
		sbp.firstItemThumbnail.click();
		Assert.assertEquals(commonMethods.currentURL(), configReader.getProperty("itemPage"));
	}

	@AfterMethod(enabled = true)
	public void closeBrowser() {
		driver.tearDown();
	}
}
