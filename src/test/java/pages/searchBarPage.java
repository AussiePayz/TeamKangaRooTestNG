package pages;

import org.openqa.selenium.support.PageFactory;

import utilities.driver;

public class searchBarPage {
	
	public searchBarPage() {
		
		PageFactory.initElements(driver.getDriver(), this);
	}

}
