package testCases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.TestBase;
import pages.MyAccountPage;
import pages.MyStorePage;


public class TestCase4 extends TestBase {

	@Test
	@Parameters({"location"})
	public void testCase4(String location) throws InterruptedException {
		MyStorePage myStorePage = new MyStorePage(driver);
		MyAccountPage myAccountPage = new MyAccountPage(driver);

		myAccountPage.displayStoresMenu();
		myAccountPage.clickOnFindYourStoreLink();
		myStorePage.allowLocationAlert();
		myStorePage.searchLocation(location);
		myStorePage.clickOnFirstAutocompleteOption();
		myStorePage.waitForFirstResult();
		myStorePage.clickOnArrowFirstSearchResult();

		Assert.assertNotNull( myStorePage.getAddressDescription());
	}
}
