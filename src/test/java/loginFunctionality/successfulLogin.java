package loginFunctionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.commonMethods;

public class successfulLogin extends commonMethods{
    
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

        
        WebElement emailField = driver.findElement(By.id("input-email"));
        emailField.sendKeys("tech@circle.com");

        WebElement passwordField = driver.findElement(By.id("input-password"));
        passwordField.sendKeys("Selenium123!");

        
        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit' ]"));
        loginButton.click();

       
        String expectedRedirectUrl = "https://tutorialsninja.com/demo/index.php?route=account/account";
        String actualRedirectUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualRedirectUrl, expectedRedirectUrl, "User was not redirected to the correct page");
    }
}
	



