package SearchBarFunctionality;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.commonMethods;
import utilities.configReader;

public class singleClickSearch extends commonMethods{

	@Test(enabled = true)
	public void searchByUsingSearchButton() {
		sbp.searchBar.click();
		sbp.searchBar.sendKeys(configReader.getProperty("searchItem"));
		sbp.searchButton.click();
		sbp.firstItemThumbnail.click();
		Assert.assertEquals(currentURL(), configReader.getProperty("itemPage"));
	}

}
