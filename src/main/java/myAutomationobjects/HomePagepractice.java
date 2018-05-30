package myAutomationobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagepractice extends BasePage {

	@FindBy(xpath = "//*[@class='logo img-responsive']")
	private WebElement logo;

	

	@FindBy(xpath = "//*[@id='search_query_top']")
	private WebElement txtsearchbox;

	@FindBy(xpath = "//*[@id='searchbox']/button")
	private WebElement btnsearch;
	

	public HomePagepractice() {
		PageFactory.initElements(driver, this);

	}

	public WebElement getLogo() {
		return logo;
	}

	public WebElement getSearchDresses() {
		txtsearchbox.sendKeys("DRESSES");
		btnsearch.click();
		return btnsearch;
	}

	
	

}
