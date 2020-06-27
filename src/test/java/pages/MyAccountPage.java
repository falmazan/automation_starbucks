package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.PageBase;

public class MyAccountPage extends PageBase {
	
	@FindBy(xpath = "//input[@name='email']")
	WebElement emailInput;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement passwordInput;
	
	@FindBy(className = "button_green_normal-1dcwi4P")
	WebElement loginButton;
	
	@FindBy(className = "message_error-px5Sf8E")
	WebElement loginErrorMessage;
	
	@FindBy(xpath = "//a[@data-link-name='Tiendas']")
	WebElement storesMenuOption;
	
	@FindBy(linkText = "Localiza tu tienda Starbucks")
	WebElement findYourStoreLink;
	
	public MyAccountPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void sendKeysEmailInput(String keys) {
		emailInput.sendKeys(keys);
	}
	
	public void sendKeysPasswordInput(String keys) {
		passwordInput.sendKeys(keys);
	}
	
	public void clickOnLoginButton() {
		loginButton.click();
	}
	
	public String getLoginErrorMessageText() {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(loginErrorMessage));
		return loginErrorMessage.getText();
	}
	
	public void displayStoresMenu() {
		moveToElement(storesMenuOption);
	}
	
	public void clickOnFindYourStoreLink() {
		findYourStoreLink.click();
	}
}
