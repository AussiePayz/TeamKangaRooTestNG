package navBarDropdownMenus;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.commonMethods;
import utilities.configReader;
import utilities.driver;

public class navBarDropdownMenu extends commonMethods {



	@Test(enabled = true)
	public void desktopsMenu() {
		Assert.assertEquals(driver.getDriver().getCurrentUrl(), configReader.getProperty("url"));
		
		nbp.desktopsInDropdownMenu.click();
		
		Assert.assertTrue(nbp.showAllDesktopsText.isDisplayed());
		
		nbp.macInDesktopMenu.click();
		
		String expectedText = "Mac", actualText = nbp.macText.getText();
		
		Assert.assertEquals(actualText, expectedText, "Text are not equal");

	}

}
