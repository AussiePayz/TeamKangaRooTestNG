package pages;

import org.openqa.selenium.support.PageFactory;

import utilities.driver;

public class wishListPage {
	
	public wishListPage() {
		
		PageFactory.initElements(driver.getDriver(), this);
		
	}

}
