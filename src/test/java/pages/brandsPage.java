package pages;

import org.openqa.selenium.support.PageFactory;

import utilities.driver;

public class brandsPage {
	
	public brandsPage() {
		
		PageFactory.initElements(driver.getDriver(), this);
	}

}
