package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GeneralUtilities {

	public String getElementText(WebElement element) {
		String text = element.getText();
		return text;

	}

	public boolean isElementDisplayed(WebElement element) {
		boolean bool = element.isDisplayed();
		return bool;
	}

	public void inputDataToTextField(WebElement element, String text) {
		element.sendKeys(text);

	}

	public void clickOnElement(WebElement element) {
		element.click();
	}

	public void selectDropDownOption(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}

	public String getBackGroundColor(WebElement element, String text) {
		return element.getCssValue(text);
		
	}

	public boolean isElementSelected(WebElement element) {
		boolean bool = element.isSelected();
		return bool;
	}
	
	public String getAttributeValueOfElement(WebElement element, String text) {
		return element.getAttribute(text);
		
	}
	
	
}
