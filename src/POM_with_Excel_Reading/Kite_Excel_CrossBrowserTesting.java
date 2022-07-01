package POM_with_Excel_Reading;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import org.apache.poi.ss.usermodel.Sheet;
public class Kite_Excel_CrossBrowserTesting 
{
	WebDriver driver;
	KiteLoginPage login;
	KitePINPage pin;
	KiteHomePage home;
	Sheet sheet;
	
	@Parameters("browser")
	@BeforeClass 
	public void LaunchBrowser(String browser) throws EncryptedDocumentException, IOException
	{
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium files\\chromedriver_win32 (2)\\chromedriver.exe ");
			 driver= new ChromeDriver();
		}
		else if (browser.equals("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Desktop\\Selenium files\\geckodriver.exe ");
			 driver= new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));				
		
		File MyFile=new File("C:\\Users\\Admin\\Desktop\\Selenium files\\Excel_Sheets\\Book1.xlsx");
		sheet =WorkbookFactory.create(MyFile).getSheet("Sheet1");	
		login=new KiteLoginPage(driver);
		pin=new KitePINPage(driver);
		home=new KiteHomePage (driver);		
	}
	
	@BeforeMethod
	public void KiteLoginPage()
	{
		login.sendUserName(sheet.getRow(0).getCell(0).getStringCellValue());
		login.sendPassword(sheet.getRow(0).getCell(1).getStringCellValue());
		login.clickOnLoginButton();
		pin.sendPIN(sheet.getRow(0).getCell(2).getStringCellValue());
		pin.clickOnContinueButton();
	}
	
  @Test
  public void VerifyKiteUserName()
  {
	  //expected UserID -->fetch from excel
	  String expectedUserID = sheet.getRow(0).getCell(0).getStringCellValue();
	  String actualUserID = home.getActulUserID();
	  Assert.assertEquals(expectedUserID, actualUserID,"Expected UserID and Actual UserID are not matching TC is FAILED");
	  Reporter.log("Expected UserID and Actual UserID are matching TC is PASSED",true);
  }
  
  @AfterMethod
  public void logOutFromKiteApp() throws InterruptedException
  {
	  home.clickOnLogoutButton();
	  Reporter.log("Logging out.......",true);
  }
  
  @AfterClass
  public void closeBrowser()
  {
	  Reporter.log("closing browser", true);
	  driver.close();
  }
}
