package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import pages.MainPage;
import pages.MyAccountPage;

public class TestCase3 extends TestBase{

	@Test
	public void testCase3() throws InterruptedException {
		MainPage mainPage = new MainPage(driver);
		MyAccountPage myAccountPage = new MyAccountPage(driver);
		mainPage.displayRewardsMenu();
		mainPage.clickOnMyAccountLink();
		myAccountPage.sendKeysEmailInput("email@test.com");

		myAccountPage.sendKeysPasswordInput("password");
		myAccountPage.clickOnLoginButton();
		
		String loginErrorMessage = myAccountPage.getLoginErrorMessageText();
		Assert.assertEquals("El Email, la contraseña o ambos son incorrectos",
				loginErrorMessage);

	}

}
