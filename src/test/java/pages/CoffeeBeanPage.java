package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.PageBase;

public class CoffeeBeanPage extends PageBase {
		
	@FindBy(css = "#Filters ul li ul li")
	List<WebElement> filterCheckBoxes;
	
	@FindBy(id = "CoffeeCount")
	WebElement coffeeCountText;
	
	@FindBy(linkText = "Mexico Chiapas")
	WebElement mexicoChiapasItem;
	
	@FindBy(css = ".coffeeItems  div:nth-child(5) div.button_wrap a")
	WebElement learnMoreLinkMexicoChiapas;
	
	@FindBy(css = ".coffeeItems p:nth-child(3)")
	WebElement descriptionTextMexicoChiapas;
	
	public CoffeeBeanPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void selectFiltersExcept(List<String> exceptions) {
		filterCheckBoxes.stream()
		.filter(element -> !exceptions.contains(element.getAttribute("innerText")))
		.forEach(element -> element.click());
	}
	
	public String getCoffeeCountText() {
		return coffeeCountText.getText();
	}
	
	public void scrollToMexicoChiapasItem() {
		scrollToItem(mexicoChiapasItem);
	}
	
	public void clickOnLearnMoreMexicoChiapas() {
		learnMoreLinkMexicoChiapas.click();
	}
	
	public String getDescriptionTextMexicoChiapas() {
		return descriptionTextMexicoChiapas.getText();
	}

}
