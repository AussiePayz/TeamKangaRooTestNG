package navBarDropdownMenus;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.commonMethods;
import utilities.configReader;
import utilities.driver;

public class nameAZoptionInSortbyDropdown extends commonMethods {

	@Test

	public void nameAZ() {
		Assert.assertEquals(currentURL(), configReader.getProperty("url"));
		nbp.ComponentsDropdownMenu.click();
		nbp.MonitorsInComponentsMenu.click();
		String expectedText = configReader.getProperty("monitorExpectedResult"), actualText = nbp.monitorsText.getText();
		Assert.assertEquals(actualText, expectedText, "Text are not equal");
		nbp.sortByDropDownMenu.click();
		nbp.nameAZInDropDownMenu.click();
		Assert.assertEquals(nbp.firstItemNamePlate.getText(),configReader.getProperty("desiredFirstItemNamePlate"));

	}

}
