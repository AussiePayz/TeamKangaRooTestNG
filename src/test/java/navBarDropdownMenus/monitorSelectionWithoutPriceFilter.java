package navBarDropdownMenus;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.commonMethods;
import utilities.driver;

public class monitorSelectionWithoutPriceFilter extends commonMethods {

	// WebDriver driver;

	@BeforeMethod
	public void openBrowser() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://tutorialsninja.com/demo/");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.getDriver();
	}

	@Test
	public void openMonitorWithoutPriceFilter() {

//		driver.findElement(By.xpath("//*[@class='dropdown'] /*[text()='Components']")).click();
//        driver.findElement(By.xpath("//*[text()='Monitors (2)']")).click();
//        driver.findElement(By.xpath("//*[@alt='Apple Cinema 30\"']")).click();

		nbp.Components.click();
		nbp.Monitors.click();
		nbp.AppleCinema.click();

	}
}
