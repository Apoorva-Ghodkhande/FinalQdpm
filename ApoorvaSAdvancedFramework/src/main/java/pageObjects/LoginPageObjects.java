package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import testBase.DriverFactory;
import testBase.TestBase;

public class LoginPageObjects extends BasePage  {

	private By EMAIL = By.name("login[email]");
	private By PASSWORD = By.name("login[password]");
	private By LOGIN_BTN = By.xpath("//button[@type='submit' and text()='Login ']");
    By FORGOT_PASSWORD = By.xpath("//a[text()='Password forgotten?']");



	//login to App
	public void login(String email, String password) {
		action.sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(EMAIL), "LoginEmailFIeld", email);
		action.sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(PASSWORD), "LoginPasswordFIeld", password);

		action.click_custom(DriverFactory.getInstance().getDriver().findElement(LOGIN_BTN), "LoginButton");

	}

	public String forgotPasword()
	{
		
		action.click_custom(DriverFactory.getInstance().getDriver().findElement(FORGOT_PASSWORD),"ForgotPassword link ");
		String Title=DriverFactory.getInstance().getDriver().getTitle();
		
		return Title;
	}

}


