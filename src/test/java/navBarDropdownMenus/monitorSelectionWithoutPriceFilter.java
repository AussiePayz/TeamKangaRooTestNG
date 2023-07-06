package navBarDropdownMenus;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.commonMethods;
import utilities.configReader;
import utilities.driver;

public class monitorSelectionWithoutPriceFilter extends commonMethods {

	@Test(enabled = true)
	public void openMonitorWithoutPriceFilter() {
		Assert.assertEquals(currentURL(), configReader.getProperty("url"));
		nbp.ComponentsDropdownMenu.click();
		nbp.MonitorsInComponentsMenu.click();
		String expectedText = configReader.getProperty("monitorExpectedResult"), actualText = nbp.monitorsText.getText();
		Assert.assertEquals(actualText, expectedText, "Text are not equal");
		nbp.clickOnTheFirstItemThatCostsLessThan(200);
		double PriceOnPage = nbp.turnStringNumbersIntoDoubleVariable(nbp.priceOfItemOnScreen.getText());
		Assert.assertTrue(PriceOnPage<200.00,"Price is not Less Than "+"200.00");

	}

}
