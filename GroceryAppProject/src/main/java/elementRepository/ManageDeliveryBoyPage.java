package elementRepository;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class ManageDeliveryBoyPage {

	GeneralUtilities gu = new GeneralUtilities();
	Actions action;

	WebDriver driver;
	JavascriptExecutor js;

	public ManageDeliveryBoyPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/Deliveryboy/delete?del=129&page_ad=1']//i[@class='fas fa-trash-alt']")
	WebElement deleteButton;

	@FindBy(xpath = "//table//tbody//tr[1]//td//span[text()='Active']")
	WebElement statusButton;

	@FindBy(xpath = "//table//tbody//tr[1]//td//span[text()='Inactive']")
	WebElement inactiveStatusButton;

	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/Deliveryboy/add']")
	WebElement newButton;
	
	@FindBy(xpath ="//input[@id='name']")
	WebElement nameField;
	
	@FindBy(id = "email")
	WebElement emailField;
	
	@FindBy(xpath = "//input[@id='phone']")
	WebElement phoneNumberField;
	
	@FindBy(id = "address")
	WebElement addressField;
	
	@FindBy(xpath ="//input[@id='username']")
	WebElement userNameField;
	
	@FindBy(id = "password")
	WebElement passwordField;
	
	@FindBy(xpath ="//button[text()='Save']")
	WebElement saveButton;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement deliveryBoycreateAlert;
	
	

	public void deleteDeliveryBoy() {
		gu.clickOnElement(deleteButton);
	}

	public void clickOnDeliveryBoyStatus() {
		gu.clickOnElement(statusButton);
	}

	public String verifyStatusOfDeliveryBoy() {
		return gu.getElementText(inactiveStatusButton);
	}
	
	public void clickOnNewButton() {
		gu.clickOnElement(newButton);
	}

	public void inputDeliveryBoyName(String name) {
		gu.inputDataToTextField(nameField, name);
	}
	

	public void inputDeliveryBoyEmailID(String email) {
		gu.inputDataToTextField(emailField, email);
	}
	

	public void inputDeliveryBoyPhoneNumber(String phonenumber) {
		gu.inputDataToTextField(phoneNumberField, phonenumber);
	}
	

	public void inputDeliveryBoyAddress(String address) {
		gu.inputDataToTextField(addressField, address);
	}
	

	public void inputDeliveryBoyUsername(String uname) {
		gu.inputDataToTextField(userNameField, uname);
	}

	public void inputDeliveryBoyPassword(String pwd) {
		gu.inputDataToTextField(passwordField, pwd);
	}
	public void clickOnSaveButton() {
//		js=(JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,3500)");
		gu.clickOnElement(saveButton);
//	action=new Actions(driver);
//	action.click(saveButton).perform();
		
	}
	
	public String verifyAlertIsPresentOnAddingDeliveryBoy() {
		return gu.getElementText(deliveryBoycreateAlert);
	}
	
}
