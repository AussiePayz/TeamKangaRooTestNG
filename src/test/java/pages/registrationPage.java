package pages;

import org.openqa.selenium.support.PageFactory;

import utilities.driver;

public class registrationPage {
	
	public registrationPage() {
		
		PageFactory.initElements(driver.getDriver(), this);
	}

}
