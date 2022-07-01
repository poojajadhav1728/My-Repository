package Kite_Test_Classes;

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

import Kite_Base_Class.BaseClass;
import Kite_POM.KiteHomePage;
import Kite_POM.KiteLoginPage;
import Kite_POM.KitePINPage;
import Kite_Utility.Utility;

public class Validate_Kite_UserID extends BaseClass
	{
	KiteLoginPage login;
	KitePINPage pin;
	KiteHomePage home;
	
@BeforeClass
public void launchBrowser()
	{
		openBrowser();	//
		login= new KiteLoginPage(driver);
		pin= new KitePINPage(driver);
		home= new KiteHomePage(driver);
		
	}
	
	@BeforeMethod
	public void loginToKiteApp() throws EncryptedDocumentException, IOException
	{
	login.sendUserName(Utility.readDataFromExcel(0, 0));
	Reporter.log("Sending UserName",true);
	login.sendPassword(Utility.readDataFromExcel(0,1));
	Reporter.log("Sending Password",true);
	login.clickOnLoginButton();
	Reporter.log("Clicking On Login Button..",true);
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	pin.sendPIN(Utility.readDataFromExcel(0, 2));
	Reporter.log("Sending Pin",true);
	pin.clickOnContinueButton();
	Reporter.log("Clicking On Continue Button..",true);
	}
	
  @Test
  public void validateUserName() throws EncryptedDocumentException, IOException 
  	{
	  String actualUserName = home.getActulUserID();
	  String expectedUserName=Utility.readDataFromExcel(0, 0);
	  Assert.assertEquals(actualUserName, expectedUserName,"TC is FAILED actual and expected user names not matching");
	  Reporter.log("User names are matching TC is passed", true);
	  Utility.takeScreenshot(driver);
   }
 
  @AfterMethod
  public void logoutfromKiteApp() throws InterruptedException
  	{
	  home.clickOnLogoutButton();
	  Reporter.log("Clicking On Logout Button..",true);
  	}
 
  @AfterClass
  public void closeBrowser()
  	{
	  driver.close();
	  Reporter.log("Closing Browser..",true);
  	}

}