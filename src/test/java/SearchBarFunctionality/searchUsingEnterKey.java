package SearchBarFunctionality;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.commonMethods;
import utilities.configReader;

//@Listeners(listenersTestNG.class)
public class searchUsingEnterKey extends commonMethods {

	@Test(enabled = true)
	public void searchByUsingEnterKey() {
		sbp.searchBar.click();
		sbp.searchBar.sendKeys("HTC Touch");
		sbp.searchBar.sendKeys(Keys.RETURN);
		sbp.firstItemThumbnail.click();
		Assert.assertEquals(commonMethods.currentURL(), configReader.getProperty("itemPage"));
	}

}
