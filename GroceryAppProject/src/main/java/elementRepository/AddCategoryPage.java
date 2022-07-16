package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class AddCategoryPage {
	WebDriver driver;
	GeneralUtilities gu = new GeneralUtilities();
	
	public AddCategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//li[@id='1-selectable']")
	WebElement selectGroupItemOne;
	
	@FindBy(xpath = "//li[@id='1-selection']")
	WebElement selectedItem;
	
	public void selectGroupItemOne() {
		gu.clickOnElement(selectGroupItemOne);
	}
	public String getTextofSelectedItem() {
		return gu.getElementText(selectedItem);
	}
}
