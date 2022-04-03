package reusableComponents;

import org.openqa.selenium.WebElement;

public interface ForPageObjectsInterface {
	void sendKeys_custom(WebElement element, String fieldName, String valueToBeSent);
	void click_custom(WebElement element, String fieldName);
	void clear_custom(WebElement element,String fieldName);
	void moveToElement_custom(WebElement element,String fieldName);
	boolean isElementPresent_custom(WebElement element,String fieldName);
	void selectDropDownByVisibleText_custom(WebElement element, String fieldName, String ddVisibleText) throws Throwable;
	void selectDropDownByValue_custom(WebElement element, String fieldName, String ddValue) throws Throwable;
	void assertEqualsString_custom(String expvalue, String actualValue, String locatorName) throws Throwable;
	String getText_custom(WebElement element, String fieldName);
	
}
