package navBarDropdownMenus;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.commonMethods;
import utilities.driver;

public class navBarDropdownMenu extends commonMethods {

//	WebDriver driver;

	@BeforeMethod
	public void openBrowser() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://tutorialsninja.com/demo/");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.getDriver();
//		

	}

	@Test
	public void desktopsMenu() {


//driver.findElement(By.xpath("//*[text()='Desktops']")).click();

		nbp.desktops.click();
//Assert.assertTrue(nbp.desktops.isSelected());
		// driver.findElement(By.xpath("//*[text()='Mac (1)']")).click();

		nbp.mac.click();

String expectedText="Mac";
String actualText=driver.getDriver().findElement(By.xpath("\"//*[@id='content']/*[text()='Mac']\"")).getText();

Assert.assertEquals(actualText, expectedText,"Text are not equal");

	}
	
	
}
