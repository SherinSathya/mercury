package myAutomationTests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import myAutomationobjects.BasePage;
import myAutomationobjects.HomePagepractice;

public class HomePagePracticeTest {
	HomePagepractice home;
	BasePage bp;

	public HomePagePracticeTest() {

		home = new HomePagepractice();
		bp = new BasePage();

	}

	@Test
	public void verifyLogo() {
		Assert.assertTrue(bp.elementFound(home.getLogo()));
	}

	@Test
	public void verifySearch() {
		home.getSearchDresses();
		Assert.assertTrue(bp.getTitle().contains("Search"));

	}

	
	@AfterMethod
	public void afterMethod(){
		home.getLogo().click();
	}
	
}	


