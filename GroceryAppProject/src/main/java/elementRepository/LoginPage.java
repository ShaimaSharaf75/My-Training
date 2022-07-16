package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class LoginPage {
	WebDriver driver;
	GeneralUtilities gu = new GeneralUtilities();
	Actions action;
	LoginPage lp;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@type='submit']")
	WebElement signInButton;

	@FindBy(xpath = "//b[text()='7rmart supermarket']")
	WebElement brandIcon;

	@FindBy(xpath = "//input[@name='username']")
	WebElement userName;

	@FindBy(xpath = "//input[@name='password']")
	WebElement password;

	@FindBy(xpath = "//input[@type='checkbox']")
	WebElement checkBox;

	public String signInButtonText() {
		return gu.getElementText(signInButton);
	}

	public boolean isBrandIconDisplayed() {
		return gu.isElementDisplayed(brandIcon);
	}

	public void inputUserName(String uname) {
		gu.inputDataToTextField(userName, uname);
	}

	public void inputPassword(String pwd) {
		gu.inputDataToTextField(password, pwd);
	}

	public void clickSignInButton() {
		gu.clickOnElement(signInButton);
	}

	public String verifySignInButtonBGColor(String text) throws InterruptedException {
		Thread.sleep(2000);//remove
		return gu.getBackGroundColor(signInButton, text);
		
	}
	public void clickOnCheckBox() throws InterruptedException {

		action=new Actions(driver);
		action.click(checkBox).perform();
	}

	public boolean isRememberMeCheckBoxSelected() {
		//System.out.println(gu.isElementSelected(checkBox));
		return gu.isElementSelected(checkBox);
		
	}

	public String getAttributeValueofUserNameField(String text) {
		return gu.getAttributeValueOfElement(userName, text);
	}

	public String getAttributeValueOfPasswordField(String text) {
		return gu.getAttributeValueOfElement(password, text);
	}
//	public void performLogin(String uname,String Pwd) {
//		lp.inputUserName(uname);
//		lp.inputPassword(Pwd);
//		lp.clickSignInButton();
//	}
}
