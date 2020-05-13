package testCases;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import pages.CoffeeBeanPage;
import pages.MainPage;

public class TestCase2 extends TestBase {

	@Test
	public void testCase2() {
		CoffeeBeanPage coffeeBeanPage = new CoffeeBeanPage(driver);
		MainPage mainPage = new MainPage(driver);
		mainPage.displayCoffeeMenu();
		mainPage.clickOnCoffeeBean();
		coffeeBeanPage.selectFiltersExcept(Arrays.asList("Rubio", "Medio", "Obscuro"));

		Assert.assertEquals("Encontramos 14 café que concuerda con su selección", coffeeBeanPage.getCoffeeCountText());

		coffeeBeanPage.scrollToMexicoChiapasItem();
		coffeeBeanPage.clickOnLearnMoreMexicoChiapas();

		String descriptionTextChiapasMexico = coffeeBeanPage.getDescriptionTextMexicoChiapas();
		Assert.assertNotNull(descriptionTextChiapasMexico);
	}

}
