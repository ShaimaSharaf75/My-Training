package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class DashboardPage {

	GeneralUtilities gu = new GeneralUtilities();

	WebDriver driver;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[@href='https://groceryapp.uniqassosiates.com/admin/list-product'])[1]")
	WebElement manageProduct;

	@FindBy(xpath = "//p[text()='Manage COD']")
	WebElement manageCOD;

	@FindBy(xpath = "//input[@value='yes']")
	WebElement radioYes;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement saveButton;

	@FindBy(xpath = "//li[@class='nav-item']//a[@href='https://groceryapp.uniqassosiates.com/admin/list-deliveryboy']")
	WebElement manageDeliveryBoyTab;

	@FindBy(xpath = "//i[@class='nav-icon fas fa-list-alt']")
	WebElement manageCategoryTab;

	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category']//i[@class='far fa-circle nav-icon']")
	WebElement categoryRadioButton;

	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/Category/add']")
	WebElement newButton;
	

	public void clickManageProduct() {
		gu.clickOnElement(manageProduct);
	}

	public void clickOnManageCOD() {
		gu.clickOnElement(manageCOD);
	}

	public void clickOnRadioYes() {
		gu.clickOnElement(radioYes);
	}

	public void clickOnSaveButton() {
		gu.clickOnElement(saveButton);
	}

	public void clickOnManageDeliveryBoyTab() {
		gu.clickOnElement(manageDeliveryBoyTab);
	}

	public void clickOnManageCategoryTab() {
		gu.clickOnElement(manageCategoryTab);
	}

	public void clickOnCategoryRadioButton() {
		gu.clickOnElement(categoryRadioButton);
	}

	public void clikOnNewButton() {
		gu.clickOnElement(newButton);
	}
}