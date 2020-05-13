package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.PageBase;

public class MainPage extends PageBase {

	@FindBy(className = ".nav_menu")
	WebElement menu;
	
	@FindBy(css = "#nav_0 a")
	WebElement coffeeOption;
	
	@FindBy(css = "#nav_1 a")
	WebElement menuOption;
	
	@FindBy(css = "#nav_2 a")
	WebElement storesOption;
	
	@FindBy(css = "#nav_3 a")
	WebElement socialImpactOption;
	
	@FindBy(css = "#nav_4 a")
	WebElement starbucksOption;
	
	@FindBy(css = "#nav_5 a")
	WebElement rewardsOption;
	
	@FindBy(css = "#nav_6 a")
	WebElement blogOption;
	
	@FindBy(css = "#nav_7 a")
	WebElement storiesOption;
	
	@FindBy(linkText = "Café en grano")
	WebElement coffeeBeanLink;
	
	@FindBy(linkText = "Mi Cuenta")
	WebElement myAccountLink;
		
	public MainPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnCoffeeOption() {
		coffeeOption.click();
	}
	
	public void clickOnMenuOption() {
		menuOption.click();
	}
	
	public void clickOnStoresOption() {
		storesOption.click();
	}
	
	public void clickOnSocialImpactOption() {
		socialImpactOption.click();
	}
	
	public void clickOnStarbucksOption() {
		starbucksOption.click();
	}
	
	public void clickOnRewardsOption() {
		rewardsOption.click();
	}
	
	public void clickOnBlogOption() {
		blogOption.click();
	}
	
	public void clickOnStoriesOption() {
		storiesOption.click();
	}
	
	public void displayCoffeeMenu() {
		moveToElement(coffeeOption);
	}
	
	public void displayRewardsMenu() {
		moveToElement(rewardsOption);
	}
	
	public void clickOnCoffeeBean() {
		coffeeBeanLink.click();
	}
	
	public void clickOnMyAccountLink() {
		myAccountLink.click();
	}
	
	
}
