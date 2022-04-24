package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import testBase.DriverFactory;


public abstract class Page {

	WebDriverWait wait;
	
	public Page()
	{
		
	wait= new WebDriverWait(DriverFactory.getInstance().getDriver(), 15);
	}
	
	public abstract String getPageTitle();
	
	public abstract String getPageHeader(By locator);
	
	public abstract WebElement getElement(By locator);
	
		
	public abstract void waitForElementPresent(By locator);
	
	public abstract void waitForPageTitle(String title);
	
	public <TPage extends BasePage> TPage getPageInstance(Class<TPage> pageClass)
	{
		
		try {
			return pageClass.getDeclaredConstructor().newInstance();
		
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	}

