package testCases;

import org.testng.annotations.Test;

import base.TestBase;
import pages.MainPage;


public class TestCase1 extends TestBase {
		
	@Test
	public void testCase1() {
		MainPage mainPage = new MainPage(driver);
		mainPage.clickOnCoffeeOption();
		mainPage.clickOnMenuOption();
		mainPage.clickOnStoresOption();
		mainPage.clickOnSocialImpactOption();
		mainPage.clickOnStarbucksOption();
		mainPage.clickOnRewardsOption();
		mainPage.clickOnBlogOption();
	}
}
