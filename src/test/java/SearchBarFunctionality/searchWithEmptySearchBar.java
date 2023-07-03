package SearchBarFunctionality;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.commonMethods;
import utilities.configReader;
import utilities.driver;

public class searchWithEmptySearchBar extends commonMethods {

	@BeforeMethod(enabled = true)
	public void openBrowser() {
		driver.getDriver();
	}

	@Test(enabled = true)
	public void searchByUsingEnterKey() {
		sbp.searchBar.click();
		sbp.searchBar.sendKeys("");
		sbp.searchBar.sendKeys(Keys.RETURN);
		String pageMessageText = sbp.pageMessage.getText();
		Assert.assertEquals(pageMessageText, configReader.getProperty("emptySearchMessage"));
	}

	@AfterMethod(enabled = true)
	public void closeBrowser() {
		driver.tearDown();
	}

}
