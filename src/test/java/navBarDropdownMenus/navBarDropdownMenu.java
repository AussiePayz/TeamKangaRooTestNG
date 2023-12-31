package navBarDropdownMenus;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.commonMethods;
import utilities.configReader;
import utilities.driver;

public class navBarDropdownMenu extends commonMethods {

	@Test(enabled = true)
	public void desktopsMenu() {
		Assert.assertEquals(currentURL(), configReader.getProperty("url"));
		
		nbp.desktopsInDropdownMenu.click();
		
		Assert.assertTrue(nbp.showAllDesktopsText.isDisplayed());
		
		nbp.macInDesktopMenu.click();
		
		String expectedText = configReader.getProperty("macExpextedResult"), actualText = nbp.macText.getText();
		
		Assert.assertEquals(actualText, expectedText, "Text are not equal");

	}

}
