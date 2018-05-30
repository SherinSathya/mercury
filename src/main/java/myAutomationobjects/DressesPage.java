package myAutomationobjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class DressesPage extends BasePage {
	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]/a")
	private WebElement Dresses;
	@FindBys(@FindBy(xpath = "//div[@class='right-block']//*[@itemprop='price']"))
	private List<WebElement> productPrices;
	@FindBy(xpath = "//*[@id='selectProductSort']")
	private WebElement dropdown;

	@FindBy(xpath = "//*[@id='newsletter-input']")
	private WebElement newsletter;

	@FindBy(xpath = "//*[@name='submitNewsletter']")
	private WebElement submit;
	@FindBy(xpath = "//*[text()=' Newsletter : This email address is already registered.']")
	private WebElement displaynewsletter;

	@FindBy(xpath = "//ul[@class='product_list grid row']/li[1]//*[text()='Add to cart']")
	private WebElement AddToCart;
	@FindBy(xpath = "//span[@title='Close window']")
	private WebElement close;
	@FindBy(xpath = "//*[@class='shopping_cart']")
	private WebElement cart;

	public DressesPage() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getDresses() {
		Dresses.click();
		return Dresses;
	}

	public String getDropDown(String option) {
		return selectFromDropDown(dropdown, option);
	}

	public ArrayList<String> getProductPrices() {
		ArrayList<String> list = new ArrayList<String>();
		for (WebElement element : productPrices) {
			list.add(element.getText());
		}
		return list;

	}

	public void setNewsLetter() {
		newsletter.sendKeys("test@email.com");
		submit.click();

	}

	public WebElement getNewsLetter() {
		return displaynewsletter;
	}

	public void clickToCart() {

		AddToCart.click();

	}

	public void CloseAddToCart() {
		close.click();
	}

	public void Cartitem() {
		cart.click();

	}

}
