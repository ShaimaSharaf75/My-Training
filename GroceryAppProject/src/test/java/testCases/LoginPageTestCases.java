package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import elementRepository.LoginPage;
import utilities.ExcelRead;





public class LoginPageTestCases extends BaseClass {
	LoginPage lp;
	ExcelRead er;

	@Test(enabled=false)
	public void verifySigninButtonText() {
		lp = new LoginPage(driver);
		String expected = Constant.expectedSignInButtonName;
		String actual = lp.signInButtonText();
		Assert.assertEquals(actual, expected, Constant.expectedUsernameErrorMsg);
	}
	
	@Test(enabled=false)
	public void isBranIconDisplayed() {
		lp=new LoginPage(driver);
		boolean actual=lp.isBrandIconDisplayed();
		Assert.assertTrue(actual, Constant.brandIconNotDisplayedErrorMsg);
	}
	
	@Test(enabled=true)
	public void verifySignInButtonBGColor() throws InterruptedException {
		lp=new LoginPage(driver);
		String expected="rgba(52, 58, 64, 1)";
		String actual=lp.verifySignInButtonBGColor("background-color");
		Assert.assertEquals(actual,expected, "Background color of signin button is not expected");
	}
	
	@Test(enabled=false)
	public void isRememberMeCheckBoxSelected() throws InterruptedException {
		lp=new LoginPage(driver);
		lp.clickOnCheckBox();
		boolean actual=lp.isRememberMeCheckBoxSelected();
		System.out.println(actual);
		Assert.assertTrue(actual, "Remember me check box is not selected");
	}
	
	@Test(enabled=false)
	public void verifyUserNameAttributeValue() {
		lp=new LoginPage(driver);
		String expected="username";
		String actual=lp.getAttributeValueofUserNameField("name");
		Assert.assertEquals(actual,expected, "Username attribute value is not expected");		
	}
	
	@Test(enabled=false)
	public void verifyPasswordAttributeValue() {
		lp=new LoginPage(driver);
		String expected="password";
		String actual=lp.getAttributeValueOfPasswordField("type");
		Assert.assertEquals(actual,expected, "Password attribute value is not expected");
	}
}
