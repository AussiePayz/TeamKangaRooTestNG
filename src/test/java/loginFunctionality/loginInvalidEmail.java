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

public class loginInvalidEmail extends commonMethods{
	
	//delete me
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
        driver.findElement(By.id("input-email")).sendKeys(invalidEmail);

        WebElement passwordField = driver.findElement(By.id("input-password"));
        passwordField.sendKeys("Selenium123!");

        
        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit' ]"));
        loginButton.click();

       
        String expectedErrorMessage = "Warning: No match for E-Mail Address and/or Password.";
        String actualErrorMessage = driver.findElement(By.cssSelector(".alert.alert-danger")).getText();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
    }
    
}



