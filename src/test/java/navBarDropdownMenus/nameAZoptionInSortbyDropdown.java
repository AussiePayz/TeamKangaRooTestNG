package navBarDropdownMenus;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.driver;
import utilities.commonMethods;

public class nameAZoptionInSortbyDropdown extends commonMethods {

	@BeforeMethod
	public void openBrowser() {
		driver.getDriver();

	}

	@Test
	public void nameAZ() {
//		driver.findElement(By.xpath("//*[@class='dropdown'] /*[text()='Components']")).click();
//		driver.findElement(By.xpath("//*[text()='Monitors (2)']")).click();
//		driver.findElement(By.xpath("//*[@id='input-sort']")).click();
//		driver.findElement(By.xpath("//*[text()='Name (A - Z)']")).click();

		nbp.components.click();
		nbp.monitors.click();
		nbp.option.click();
		nbp.nameAZ.click();

	}

}
