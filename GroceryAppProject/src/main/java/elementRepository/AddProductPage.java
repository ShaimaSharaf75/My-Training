package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.ExplicitWait;
import utilities.GeneralUtilities;

public class AddProductPage {
	WebDriver driver;
	GeneralUtilities gu = new GeneralUtilities();
	ExplicitWait ew=new ExplicitWait();

	public AddProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//select[@id='cat_id']")
	WebElement catagoryDropDown;

	@FindBy(xpath = "//label[text()=' Non Veg']")
	WebElement nonVegRadioButton;

	public void clickOnCategoryDropDown() {
		gu.clickOnElement(catagoryDropDown);
	}

	public String verifyValueSelectedOnDropDown(String text) {
		gu.selectDropDownOption(catagoryDropDown, text);
		return text;
	}
	
	public void clickOnNonVegRadioButtonSelected() throws InterruptedException {
		//ew.explicitWaitMethod(nonVegRadioButton, driver);
		gu.clickOnElement(nonVegRadioButton);
	}
	public boolean isNonVegRadioButtonSelected() {
		return gu.isElementSelected(nonVegRadioButton);
	}

}
