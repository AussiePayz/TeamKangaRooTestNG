package pages;

import org.openqa.selenium.support.PageFactory;

import utilities.driver;

public class shoppingCartPage {
	
	public shoppingCartPage() {
		
		PageFactory.initElements(driver.getDriver(), this);
	}

}
