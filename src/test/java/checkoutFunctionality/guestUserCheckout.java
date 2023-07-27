package checkoutFunctionality;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.commonMethods;
import utilities.configReader;
import utilities.driver;
import utilities.retryAnalyzer;

public class guestUserCheckout extends commonMethods{
	
	
	@Test(enabled = true, retryAnalyzer = retryAnalyzer.class)
	public void test3() {
		
		cp.searchBar.sendKeys(configReader.getProperty("search"));
		cp.searchBarEnter.click();
		cp.ipodShuffle.click();
		cp.addToCartButton.click();
		cp.checkoutButton.click();
		String expectedResult = configReader.getProperty("checkoutExpectedResult");
		String actualResult = getTitle();
		Assert.assertEquals(expectedResult, actualResult);
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
		cp.shippingContinue.click();
		cp.termsAndConditionsCheckBox.click();
		cp.paymentContinue.click();
		cp.confirmOrderButton.click();
		cp.storeOwnerButton.click();
		String expectedUrl = configReader.getProperty("ContactUsExpectedURL");
		String actualUrl = driver.getDriver().getCurrentUrl();
		Assert.assertEquals(expectedUrl, actualUrl);
		cp.contactUsNameField.sendKeys(configReader.getProperty("contactUsName"));
		cp.contactUsEmail.sendKeys(configReader.getProperty("email"));
		cp.contactUsEnquiryField.sendKeys(configReader.getProperty("contactUsEnquiry"));
		cp.contactUsSubmitButton.click();
		String expectedText = configReader.getProperty("contactUsExpectedText");
		String actualText = cp.contactUsHeader.getText();
		Assert.assertEquals(expectedText, actualText);
		cp.contactUsContinue.click();
		String expectedTitle = configReader.getProperty("homePageTitle");
		String actualTitle = getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		
	
		
	}

}
