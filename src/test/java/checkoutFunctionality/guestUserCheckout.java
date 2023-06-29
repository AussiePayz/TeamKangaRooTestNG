package checkoutFunctionality;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.commonMethods;
import utilities.configReader;
import utilities.retryAnalyzer;

public class guestUserCheckout extends commonMethods{
	
	
	@Test//(retryAnalyzer = retryAnalyzer.class)
	public void test3() {
		
		cp.searchBar.sendKeys(configReader.getProperty("search"));
		cp.searchBarEnter.click();
		cp.macBookItem.click();
		cp.addToCartButton.click();
		cp.checkoutButton.click();
		cp.checkoutPageAssertion();
		cp.guestUserCheckBox.click();
		cp.checkoutContinue.click();
		cp.billingDetailsField.click();
		cp.firstNameField.sendKeys(configReader.getProperty("firstName"));
		cp.lastNameField.sendKeys(configReader.getProperty("lastName"));
		cp.emailField.sendKeys(configReader.getProperty("email"));
		cp.telephoneField.sendKeys(configReader.getProperty("telephone"));
		cp.addressField.sendKeys(configReader.getProperty("address"));
		cp.cityField.sendKeys(configReader.getProperty("city"));
		cp.postCodeField.sendKeys(configReader.getProperty("postCode"));
		selectOptionByVisibleText(cp.countryDropDown, configReader.getProperty("country"));
		selectOptionByVisibleText(cp.regionDropDown, configReader.getProperty("region"));
		cp.billingDetailsContinue.click();
		Assert.assertTrue(cp.noPaymentMethodErrorMessage.isDisplayed());
		cp.contactUsLink.click();
		cp.AssertionOfContactUsPage();
		cp.contactUsNameField.sendKeys(configReader.getProperty("contactUsName"));
		cp.contactUsEmail.sendKeys(configReader.getProperty("email"));
		cp.contactUsEnquiryField.sendKeys(configReader.getProperty("contactUsEnquiry"));
		cp.contactUsSubmitButton.click();
		cp.contactUsPageAssertion();
		cp.contactUsContinue.click();
		cp.homePageAssertion();
		
		
		
		
		
		
	}

}
