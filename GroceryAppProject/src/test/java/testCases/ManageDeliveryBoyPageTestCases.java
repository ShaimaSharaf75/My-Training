package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import elementRepository.AddProductPage;
import elementRepository.DashboardPage;
import elementRepository.LoginPage;
import elementRepository.ManageDeliveryBoyPage;
import elementRepository.ManageProductPage;
import utilities.ExcelRead;

public class ManageDeliveryBoyPageTestCases extends BaseClass {
	DashboardPage dp;
	LoginPage lp;
	ManageProductPage mp;
	AddProductPage ap;
	ExcelRead er;
	ManageDeliveryBoyPage md;

	@Test(enabled = false)
	public void verifyDeliveryBoyStatusChanged() {
		lp = new LoginPage(driver);
		lp.inputUserName("admin");
		lp.inputPassword("admin");
		lp.clickSignInButton();
		dp = new DashboardPage(driver);
		dp.clickOnManageDeliveryBoyTab();
		md = new ManageDeliveryBoyPage(driver);
		md.clickOnDeliveryBoyStatus();
		String expected = "Inactive";
		String actual = md.verifyStatusOfDeliveryBoy();
		Assert.assertEquals(actual, Constant.expectedStatusOfDeliveryBoy);

	}

	@Test(enabled=true)
	public void verifyAlertIsPresentOnAddingNewDeliveryBoy() {
		lp=new LoginPage(driver);
		lp.inputUserName("admin");
		lp.inputPassword("admin");
		lp.clickSignInButton();
		dp = new DashboardPage(driver);
		dp.clickOnManageDeliveryBoyTab();
		md = new ManageDeliveryBoyPage(driver);
		md.clickOnNewButton();
		md.inputDeliveryBoyName("Bob");
		md.inputDeliveryBoyEmailID("bob123@mail.com");
		md.inputDeliveryBoyPhoneNumber("9990000000");
		md.inputDeliveryBoyAddress("address");
		md.inputDeliveryBoyUsername("Bob123");
		md.inputDeliveryBoyPassword("12345");
		md.clickOnSaveButton();
		String expected="Delivery Boy Details Created Successfully";
		String actual=md.verifyAlertIsPresentOnAddingDeliveryBoy();
		Assert.assertEquals(actual, Constant.expectedAlertErrorMsg);

	}
}
