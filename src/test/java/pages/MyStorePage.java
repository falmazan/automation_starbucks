package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.PageBase;

public class MyStorePage extends PageBase {

	@FindBy(id = "searchField")
	WebElement searchLocationInput;

	@FindBy(css = ".pac-container :nth-child(1)")
	WebElement firstAutocompleteLocationResult;

	@FindBy(css = "#searchResults li:nth-child(1) h2")
	WebElement firstSearchResultHeader;

	@FindBy(css = "#searchResults li:nth-child(1) a")
	WebElement arrowFirstSearchResult;

	@FindBy(css = "#store-address  ul")
	WebElement addressDescription;

	public MyStorePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void allowLocationAlert() {
		acceptAlert();
	}

	public void searchLocation(String location) {
		searchLocationInput.sendKeys(location);
	}

	public void clickOnFirstAutocompleteOption() {
		firstAutocompleteLocationResult.click();
	}
	public void waitForFirstResult() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.textToBePresentInElement(firstSearchResultHeader, "Plaza Tenaria"));
	}

	public void clickOnArrowFirstSearchResult() {
		arrowFirstSearchResult.click();
	}

	public String getAddressDescription() {
		return addressDescription.getText();
	}

}
