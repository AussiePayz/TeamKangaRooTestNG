package SearchBarFunctionality;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.commonMethods;
import utilities.configReader;
import utilities.driver;

public class searchWithDoubleClick extends commonMethods {

	@BeforeMethod(enabled = true)
	public void openBrowser() {
		driver.getDriver();
	}

	@Test(enabled = true)
	public void searchByUsingSearchButton() throws InterruptedException {
		sbp.searchBar.click();
		sbp.searchBar.sendKeys("HTC Touch");
		Actions actions = new Actions(driver.getDriver());
		actions.doubleClick(sbp.searchButton).perform();
		sbp.firstItemThumbnail.click();
		Assert.assertEquals(commonMethods.currentURL(), configReader.getProperty("itemPage"));
	}

	@AfterMethod(enabled = true)
	public void closeBrowser() {
		driver.tearDown();
	}

}
