package myAutomationobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MercuryFlightPage extends MercuryBasePage {
	@FindBy(name = "tripType")
	private WebElement radiobtn;
	@FindBy(name = "passCount")
	private WebElement passcountbtn;
	@FindBy(name = "fromPort")
	private WebElement fromportbtn;
	@FindBy(name = "fromMonth")
	private WebElement frommonthbtn;
	@FindBy(name = "fromDay")
	private WebElement fromdaybtn;
	@FindBy(name = "toPort")
	private WebElement toportbtn;

	public MercuryFlightPage() {
		PageFactory.initElements(driver, this);

	}

	public void selectTripType() {
		radiobtn.isSelected();
	}

	public void selectpassCount(String option) {
		selectFromDropDown(passcountbtn, option);
	}

	public void selectfromPort(String option) {
		selectFromDropDown(fromportbtn, option);
	}

	public void selectfromMonth(String option) {
		selectFromDropDown(frommonthbtn, option);
	}

	public void selectfromDay(String option) {
		selectFromDropDown(fromdaybtn, option);
	}

	public void toPort(String option) {
		selectFromDropDown(toportbtn, option);
	}

}
