package pages;

import org.openqa.selenium.support.PageFactory;

import utilities.driver;

public class loginPage {
	
	public loginPage() {
		
		PageFactory.initElements(driver.getDriver(), this);
	}

}
