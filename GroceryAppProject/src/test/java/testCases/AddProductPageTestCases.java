package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import elementRepository.AddProductPage;
import elementRepository.DashboardPage;
import elementRepository.LoginPage;
import elementRepository.ManageProductPage;
import utilities.ExcelRead;

public class AddProductPageTestCases extends BaseClass {
	DashboardPage dp;
	LoginPage lp;
	ManageProductPage mp;
	AddProductPage ap;
	ExcelRead er;

	@Test(enabled=false)
	public void verifyCategoryDropDownValueSelected() {
		lp = new LoginPage(driver);
		er = new ExcelRead();
		lp.inputUserName("admin");
		lp.inputPassword("admin");
		lp.clickSignInButton();
		dp = new DashboardPage(driver);
		dp.clickManageProduct();
		mp = new ManageProductPage(driver);
		mp.clickOnNewButton();
		ap = new AddProductPage(driver);
		ap.clickOnCategoryDropDown();
		String expected = "Fruits & Vegetables";
		String actual = ap.verifyValueSelectedOnDropDown("Fruits & Vegetables");
		Assert.assertEquals(actual, expected, "Selected Category in the Dropdown is not Expected");
	}
	
	@Test(enabled=true)
	public void verifyNonVegRadioButtionSelected() throws InterruptedException {
		lp = new LoginPage(driver);
		er = new ExcelRead();
		lp.inputUserName("admin");
		lp.inputPassword("admin");
		lp.clickSignInButton();
		dp = new DashboardPage(driver);
		dp.clickManageProduct();
		mp = new ManageProductPage(driver);
		mp.clickOnNewButton();
		ap = new AddProductPage(driver);
		ap.clickOnNonVegRadioButtonSelected();
		boolean actual=ap.isNonVegRadioButtonSelected();
		Assert.assertFalse(actual,Constant.expectedNonVegRadioButtonErrorMsg);
	}
}
