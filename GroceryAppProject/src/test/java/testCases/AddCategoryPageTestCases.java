package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import elementRepository.AddCategoryPage;
import elementRepository.DashboardPage;
import elementRepository.LoginPage;




public class AddCategoryPageTestCases extends BaseClass {

	LoginPage lp;
	DashboardPage dp;
	AddCategoryPage acp;

	@Test
  public void verifyCategoryGroupItemIsSelected() {
		lp=new LoginPage(driver);
//	  lp.performLogin("admin", "admin");
		lp.inputUserName("admin");
		lp.inputPassword("admin");
		 lp.clickSignInButton();
		 dp=new DashboardPage(driver);
		 dp.clickOnManageCategoryTab();
		 dp.clickOnCategoryRadioButton();
		 dp.clikOnNewButton();
	  acp=new AddCategoryPage(driver);
	  acp.selectGroupItemOne();
	  String expected=Constant.expectedCategoryItem;
	  String actual=acp.getTextofSelectedItem();
	  Assert.assertEquals(actual,expected,Constant.errorMsgForSelectedItem);
  }
}
