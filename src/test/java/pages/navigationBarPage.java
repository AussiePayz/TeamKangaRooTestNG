package pages;

import org.openqa.selenium.support.PageFactory;

import utilities.driver;

public class navigationBarPage {
	
	public navigationBarPage() {
		
		PageFactory.initElements(driver.getDriver(), this);
	}
	
	

}
