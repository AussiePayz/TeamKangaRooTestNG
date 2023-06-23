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

public class forgotPasswordFunctionality extends commonMethods{
	
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
	        
	        driver.findElement(By.xpath("//a[text()='Forgotten Password']")).click();


	        
	        String expectedTitle = "Forgot Your Password";
	        String actualTitle = driver.getTitle();
	        Assert.assertEquals(actualTitle, expectedTitle);

	        
	        String validEmail = "tech@circle.com";
	        driver.findElement(By.id("input-email")).sendKeys(validEmail);

	        
	        String expectedSuccessMessage = "An email with a confirmation link has been sent your email address.";
	        String actualSuccessMessage = driver.findElement(By.cssSelector(".alert.alert-success")).getText();
	        Assert.assertEquals(actualSuccessMessage, expectedSuccessMessage);
	    }
	}


