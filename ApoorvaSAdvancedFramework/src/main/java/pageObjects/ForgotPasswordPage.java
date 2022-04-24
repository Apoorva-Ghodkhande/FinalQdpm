package pageObjects;

import org.openqa.selenium.By;

public class ForgotPasswordPage {

	By txt_restreEmail=By.xpath("//input[@class='form-control placeholder-no-fix required email']");
	By button_back= By.xpath("//button[@id='back-btn']");
	By button_SendNewPass= By.xpath("//button[@type='submit']");
}
