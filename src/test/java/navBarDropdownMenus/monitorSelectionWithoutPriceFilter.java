package navBarDropdownMenus;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.commonMethods;
import utilities.driver;

public class monitorSelectionWithoutPriceFilter extends commonMethods {

	@BeforeMethod
	public void openBrowser() {
		driver.getDriver();
	}

	@AfterMethod(enabled = true)
	public void closeBrowser() {
		driver.tearDown();
	}

	@Test(enabled = true)
	public void openMonitorWithoutPriceFilter() {
		Assert.assertEquals(driver.getDriver().getCurrentUrl(), "https://tutorialsninja.com/demo/");
//		driver.findElement(By.xpath("//*[@class='dropdown'] /*[text()='Components']")).click();
//        driver.findElement(By.xpath("//*[text()='Monitors (2)']")).click();
//        driver.findElement(By.xpath("//*[@alt='Apple Cinema 30\"']")).click();
		nbp.ComponentsDropdownMenu.click();
		nbp.MonitorsInComponentsMenu.click();
		String expectedText = "Monitors", actualText = nbp.monitorsText.getText();
		Assert.assertEquals(actualText, expectedText, "Text are not equal");
		nbp.clickOnTheFirstItemThatCostsLessThan(200);
		double PriceOnPage = nbp.turnStringNumbersIntoDoubleVariable(nbp.priceOfItemOnScreen.getText());
		Assert.assertTrue(PriceOnPage<200.00,"Price is not Less Than "+"200.00");

	}

}
