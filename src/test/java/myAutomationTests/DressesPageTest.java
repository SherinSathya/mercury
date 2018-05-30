package myAutomationTests;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import myAutomationobjects.BasePage;
import myAutomationobjects.DressesPage;

public class DressesPageTest {
	DressesPage dp;
	BasePage bp;

	public DressesPageTest() {

		dp = new DressesPage();
		bp = new BasePage();

	}

	@BeforeMethod
	public void verifyDresses() {
		Assert.assertTrue(bp.elementFound(dp.getDresses()));
	}

	
	@Test
	public void verifygetnewsletter(){
		dp.setNewsLetter();
		Assert.assertTrue(bp.elementFound(dp.getNewsLetter()));
	}
	

	@Test
	public void verifyproductPrices() {
		dp.getDropDown("price:asc");
		ArrayList<String> a = dp.getProductPrices();
		ArrayList<Double> intValues = new ArrayList<Double>();
		for (int i = 0; i < a.size(); i++) {
			String value = a.get(i).replace("$", "");
			a.set(i, value);
		}
		for (int i = 0; i < a.size(); i++) {
			intValues.add(Double.parseDouble(a.get(i)));
		}
		for (int i = 0; i < intValues.size(); i++) {
			Assert.assertTrue(intValues.get(i) < intValues.get(i + 1));
		}
	}

	@Test
	public void verifyAddToCartdetails() {
		dp.clickToCart();
		Assert.assertTrue(bp.getTitle().contains("Product successfully added to your shopping cart"));
		
	}

}
