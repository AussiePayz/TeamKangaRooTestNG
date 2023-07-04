package SearchBarFunctionality;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.commonMethods;
import utilities.configReader;

public class searchWithEmptySearchBar extends commonMethods {
	
	@Test(enabled = true)
	public void searchByUsingEnterKey() {
		sbp.searchBar.click();
		sbp.searchBar.sendKeys("");
		sbp.searchBar.sendKeys(Keys.RETURN);
		String pageMessageText = sbp.pageMessage.getText();
		Assert.assertEquals(pageMessageText, configReader.getProperty("emptySearchMessage"));
	}

}
