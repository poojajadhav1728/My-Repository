package kite_Assignment_validate_loginID_PWD;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Kite_Base_Class.BaseClass;
import Kite_POM.KiteHomePage;
import Kite_POM.KiteLoginPage;
import Kite_POM.KitePINPage;
import Kite_Utility.Utility;
import Kite_Utility.UtilityUsingPropertyFile;
import practice.Soft_Assert_TestNG;

public class testClass extends BaseClass
	{
	KiteLogin login;
	KitePIN pin;
@BeforeClass
public void launchBrowser()
	{
		openBrowser();
		login= new KiteLogin(driver);
		//pin=new KitePIN(driver);
	}

@Test (priority = 2)
public void login_invalid_password() throws IOException
{
	SoftAssert soft2=new SoftAssert();
	login.clearUsernamePassworField();
	login.sendUserName(UtilityUsingPropertyFile.readDataFromProperty("UN"));
	login.sendPassword(UtilityUsingPropertyFile.readDataFromProperty("PWD1"));
	login.clickOnLoginButton();
	String actual1 = login.getPasswordWarning();
	String expected1 = UtilityUsingPropertyFile.readDataFromProperty("passErrorMsg");
	soft2.assertEquals(actual1, expected1, "Warning message not proper");
	Reporter.log("Invalid password not accepted..So Warning message displayed.",true);
	login.changeUser();
	soft2.assertAll();
	}
@Test (priority = 1)
public void login_invalidUsername() throws IOException
{
//username wrong,password correct
	SoftAssert soft3=new SoftAssert();
	login.clearUsernamePassworField();
	login.sendUserName(UtilityUsingPropertyFile.readDataFromProperty("UN1"));
	login.sendPassword(UtilityUsingPropertyFile.readDataFromProperty("PWD"));
	login.clickOnLoginButton();
	String actual2 = login.getPasswordWarning();
	String expected2 = UtilityUsingPropertyFile.readDataFromProperty("userErrorMsg");
	soft3.assertEquals(actual2,expected2 , "Warning message not proper");
	Reporter.log("Invalid username not accepted..So Warning message displayed.",true);

	login.changeUser();
	soft3.assertAll();
	}
	
@Test (priority = 0)
public void login_Blank_Data() throws IOException
{
	//userID blank
	SoftAssert soft4=new SoftAssert();
	//login.clearUsernamePassworField();
	
	login.clickOnLoginButton();
	//Reporter.log("Clicking On Login Button..",true);
	String actual = login.getUserWarning();
	String expected=UtilityUsingPropertyFile.readDataFromProperty("userErrorMsg");
	soft4.assertEquals(actual, expected, "Warning message not proper");
	Reporter.log("Blank username and password not accepted..So Warning message displayed.",true);
	soft4.assertAll();
	}
/*
@Test (priority = 3)
public void login_with_valid_Credentials() throws IOException, InterruptedException
{
	SoftAssert soft1=new SoftAssert();
	login.clearUsernamePassworField();
	login.sendUserName(UtilityUsingPropertyFile.readDataFromProperty("UN3"));
	Reporter.log("Sending UserName",true);
	login.sendPassword(UtilityUsingPropertyFile.readDataFromProperty("PWD3"));
	Reporter.log("Sending Password",true);
	login.clickOnLoginButton();
	//pin.sendPIN(UtilityUsingPropertyFile.readDataFromProperty("PIN3"));
	//pin.clickOnContinueButton();
	login.changeUser();
	soft1.assertAll();
	}
	*/

}