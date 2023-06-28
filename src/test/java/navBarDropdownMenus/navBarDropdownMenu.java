package navBarDropdownMenus;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.commonMethods;
import utilities.driver;

public class navBarDropdownMenu extends commonMethods {

	@BeforeMethod
	public void openBrowser() {
		driver.getDriver();
	}

	@AfterMethod(enabled = true)
	public void closeBrowser() {
		driver.tearDown();
	}

	@Test(enabled = true)
	public void desktopsMenu() {
		Assert.assertEquals(driver.getDriver().getCurrentUrl(), "https://tutorialsninja.com/demo/");
		//driver.findElement(By.xpath("//*[text()='Desktops']")).click();
		nbp.desktopsInDropdownMenu.click();
		// driver.findElement(By.xpath("//*[text()='Mac (1)']")).click();
		// *[text()='Show AllDesktops']
		Assert.assertTrue(nbp.showAllDesktopsText.isDisplayed());
		nbp.macInDesktopMenu.click();
		String expectedText = "Mac", actualText = nbp.macText.getText();
		Assert.assertEquals(actualText, expectedText, "Text are not equal");

	}

}
