package loginFunctionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.commonMethods;

public class accountLockout extends commonMethods {
	//Pari
	
	private WebDriver driver;

    @BeforeMethod
    public void setup() {
       
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

   // @AfterMethod
    //public void tearDown() {
       
        //driver.quit();
   // }

    @Test
    public void testLogin() {
        
        driver.get("https://tutorialsninja.com/demo");

       
        WebElement myAccountButton = driver.findElement(By.xpath("//span[text()='My Account']"));
        myAccountButton.click();

        WebElement loginOption = driver.findElement(By.xpath("//a[text()='Login']"));
        loginOption.click();
        
        String invalidEmail = "asd@asd.com";
        String invalidPassword = "asdasd";
        int maxAttempts = 5;

        for (int i = 1; i <= maxAttempts; i++) {
            driver.findElement(By.id("input-email")).sendKeys(invalidEmail);
            driver.findElement(By.id("input-password")).sendKeys(invalidPassword);
            WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit' ]"));
            loginButton.click();

        }

        
        String expectedErrorMessage = "Warning: Your account has exceeded allowed number of login attempts. Please try again in 1 hour.";
        String actualErrorMessage = driver.findElement(By.cssSelector(".alert.alert-danger")).getText();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
}
}


