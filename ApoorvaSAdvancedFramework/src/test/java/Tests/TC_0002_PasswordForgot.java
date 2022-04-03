package Tests;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPageObjects;
import testBase.TestBase;

public class TC_0002_PasswordForgot extends TestBase {

  //LoginPageObjects login = new LoginPageObjects();
  @Test
  public void VerifyForgotPassworPage()
  {
	  String ActualTitle=page.getPageInstance(LoginPageObjects.class).forgotPasword();
	//String ActualTitle=login.forgotPasword();
	  String ExpectedTitle="qdPM | Restore Password";
	  Assert.assertEquals(ActualTitle, ExpectedTitle);
	  
  }
  
}
