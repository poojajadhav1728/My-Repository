package try_catch_Use;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Kite_Base_Class.BaseClassUsingProperty;
import Kite_POM.KiteHomePage;
import Kite_POM.KiteLoginPage;
import Kite_POM.KitePINPage;
import Kite_Utility.Utility;
import Kite_Utility.UtilityUsingPropertyFile;
@Listeners(try_catch_Use.Listener.class)
public class Kite_Validate_UserName_Using_Property extends BaseClassUsingProperty
{
	KiteLoginPage login;
	KitePINPage pin;
	KiteHomePage home;
	
	@BeforeClass
	public void launchBrowser() throws IOException
	{
		openBrowser();
		login= new KiteLoginPage(driver);
		pin= new KitePINPage(driver);
		home= new KiteHomePage(driver);
	}
	
	@BeforeMethod
	public void loginToKiteApp() throws EncryptedDocumentException, IOException
	{
	login.sendUserName(UtilityUsingPropertyFile.readDataFromProperty("UN"));
	Reporter.log("Sending UserName",true);
	login.sendPassword(UtilityUsingPropertyFile.readDataFromProperty("PWD"));
	Reporter.log("Sending Password",true);
	login.clickOnLoginButton();
	Reporter.log("Clicking On Login Button..",true);
	//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	pin.sendPIN(UtilityUsingPropertyFile.readDataFromProperty("PIN"));
	Reporter.log("Sending Pin",true);
	pin.clickOnContinueButton();
	Reporter.log("Clicking On Continue Button..",true);
	UtilityUsingPropertyFile.implicitWait(driver, 200);
	}
	
	@Test
	public void ValidateUserName() throws IOException
	{
		String actualID = home.getActulUserID();
		String expectedID=UtilityUsingPropertyFile.readDataFromProperty("UN");
		Assert.assertEquals(actualID, expectedID,"Actual UserID and Expected UserID are not matching, Test case is FAILED");
		Reporter.log("Actual UserID and Expected UserID are matching, Test case is PASSED",true);
		
		UtilityUsingPropertyFile.takeScreenshot(driver);
	}
	
	@AfterMethod
	public void logoutFromKite() throws InterruptedException
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
