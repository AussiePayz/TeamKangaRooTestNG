package navBarDropdownMenus;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.commonMethods;
import utilities.configReader;
import utilities.driver;

public class nameAZoptionInSortbyDropdown extends commonMethods {

	@BeforeMethod
	public void openBrowser() {
		driver.getDriver();

	}

	@AfterMethod(enabled = false)
	public void closeBrowser() {
		driver.tearDown();
	}

	@Test

	public void nameAZ() {
		Assert.assertEquals(driver.getDriver().getCurrentUrl(), "https://tutorialsninja.com/demo/");
//		driver.findElement(By.xpath("//*[@class='dropdown'] /*[text()='Components']")).click();
//		driver.findElement(By.xpath("//*[text()='Monitors (2)']")).click();
//		driver.findElement(By.xpath("//*[@id='input-sort']")).click();
//		driver.findElement(By.xpath("//*[text()='Name (A - Z)']")).click();
		nbp.ComponentsDropdownMenu.click();
		nbp.MonitorsInComponentsMenu.click();
		String expectedText = "Monitors", actualText = nbp.monitorsText.getText();
		Assert.assertEquals(actualText, expectedText, "Text are not equal");
		nbp.sortByDropDownMenu.click();
		nbp.nameAZInDropDownMenu.click();
		Assert.assertEquals(nbp.firstItemNamePlate.getText(),configReader.getProperty("desiredFirstItemNamePlate"));

	}

}
