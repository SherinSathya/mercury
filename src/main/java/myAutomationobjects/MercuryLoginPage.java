package myAutomationobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MercuryLoginPage extends MercuryBasePage {
	
	@FindBy(id = "username")
	private WebElement userName;

	@FindBy(id = "password")
	private WebElement passWord;

	@FindBy(id = "login")
	private WebElement login;

	public MercuryLoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void logintoApp() {
		userName.sendKeys("sherinshalija");
		passWord.sendKeys("fiana123");
		login.click();
		
	}
}



