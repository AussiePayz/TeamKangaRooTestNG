package pages;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.configReader;
import utilities.driver;

public class navigationBarPage {

	public navigationBarPage() {

		PageFactory.initElements(driver.getDriver(), this);
	}

	@FindBy(xpath = "//*[text()='Desktops']")
	public WebElement desktopsInDropdownMenu;

	@FindBy(xpath = "//*[text()='Mac (1)']")
	public WebElement macInDesktopMenu;


	@FindBy(xpath = "//*[@id='input-sort']")
	public WebElement sortByDropDownMenu;
	
	@FindBy(xpath = "//*[text()='Name (A - Z)']")
	public WebElement nameAZInDropDownMenu;

	@FindBy(xpath = "//*[@class='dropdown'] /*[text()='Components']")
	public WebElement ComponentsDropdownMenu;
	
	@FindBy(xpath = "//*[text()='Monitors (2)']")
	public WebElement MonitorsInComponentsMenu;

	@FindBy(xpath = "//h2[text()='Mac']")
	public WebElement macText;

	@FindBy(xpath = "//*[text()='Show AllDesktops']")
	public WebElement showAllDesktopsText;

	@FindBy(xpath = "//h2[text()='Monitors']")
	public WebElement monitorsText;

	@FindBy(xpath = "//div[@class='product-thumb']/div[2]/div/h4/a")
	public WebElement firstItemNamePlate;
	
	@FindBy(xpath="//div[@id='content']//div[@class='col-sm-4']//ul[2]//h2")
	public WebElement priceOfItemOnScreen;

public double turnStringNumbersIntoDoubleVariable(String text) {
	
    double priceValue = 1000;
    Pattern pattern = Pattern.compile("\\$([0-9.]+)");
    Matcher matcher = pattern.matcher(text);

    if (matcher.find()) {
        String priceMatch = matcher.group(1);
        priceValue = Double.parseDouble(priceMatch);
    }
    return priceValue;
}
	
	public void clickOnTheFirstItemThatCostsLessThan(double spendingLimit) {

		List<WebElement> monitorElements = driver.getDriver().findElements(By.xpath("//div[@class='product-thumb']"));
		// Iterate through each monitor element
		for (WebElement monitor : monitorElements) {
			boolean monitorPriceLessthan200 = false; // Reset for each monitor element
			try {
				// Extract the price value of the monitor
				WebElement priceElement = monitor.findElement(By.xpath(".//p[@class='price']"));
				String priceText = priceElement.getText();
				String[] prices = priceText.split("\n");
				for (String price : prices) {
					try {
						// Check if the price does not contain "Ex Tax:"
						if (!price.contains("Ex Tax:")) {
							Pattern pattern = Pattern.compile("\\$([0-9.]+)");
							Matcher matcher = pattern.matcher(price);
							// Iterate through the matches
							while (matcher.find()) {
								String priceMatch = matcher.group(1);
								// Extract the price value as a double
								double priceValue = Double.parseDouble(priceMatch);
								// Check if the price is below $200
								if (priceValue < spendingLimit) {
									monitorPriceLessthan200 = true;
									// Perform clicking on the monitor element
									monitor.findElement(By.xpath(".//div[2]/div/h4/a")).click();
								}
								if (monitorPriceLessthan200 = true) {
									break;
								}
							}
						}
					} catch (NumberFormatException e) {
						System.out.println("Unable to parse price: " + e.getMessage());
					}
				}
			} catch (StaleElementReferenceException e) {
				System.out.println("StaleElementReferenceException occurred: " + e.getMessage());
			}
		}
	}
}
