package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.aventstack.extentreports.Status;

import reusableComponents.ActionEngine;
import reusableComponents.ForPageObjectsInterface;
import testBase.DriverFactory;
import testBase.ExtentFactory;

public class BasePage extends Page {

	ForPageObjectsInterface action = new ActionEngine();
	@Override
	public String getPageTitle() {
	 return DriverFactory.getInstance().getDriver().getTitle();
		
	}

	@Override
	public String getPageHeader(By locator) {
	 return getElement(locator).getText();
		
	}
	@Override
	public WebElement getElement(By locator) {
		WebElement element=null;
		try {
			element= DriverFactory.getInstance().getDriver().findElement(locator);
			return element;
		}catch(Exception e)
		{
			e.printStackTrace();
			ExtentFactory.getInstance().getExtent().log(Status.FAIL, "Some error occured while creating the element: "+ locator.toString());
		}
		return element;
	}	
	
	@Override
	public void waitForElementPresent(By locator) {
	try {
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}catch(Exception e)
	{
		e.printStackTrace();
		ExtentFactory.getInstance().getExtent().log(Status.FAIL, "Some error/Exception occured while waiting for the element: "+ locator.toString());
		
	}
	}

	@Override
	public void waitForPageTitle(String title) {
		try {
			wait.until(ExpectedConditions.titleContains(title));
		}catch(Exception e)
		{
			e.printStackTrace();
			ExtentFactory.getInstance().getExtent().log(Status.FAIL, "Some error/Exception occured while waiting for the Title: ");
			
		}
		
	}





}
