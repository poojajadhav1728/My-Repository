package POM_with_Excel_Reading;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test_Class {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium files\\chromedriver_win32 (2)\\chromedriver.exe ");
			
			ChromeOptions opt= new ChromeOptions();
			//opt.addArguments("-incognito"); 	//used for incognito option
			//opt.addArguments("-headless");
			//opt.addArguments("-disable -notifications");    
			WebDriver driver= new ChromeDriver(opt);
			driver.manage().window().maximize();
			driver.get("https://kite.zerodha.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));				
			
			File MyFile=new File("C:\\Users\\Admin\\Desktop\\Selenium files\\Excel_Sheets\\Book1.xlsx");
			Sheet MySheet = WorkbookFactory.create(MyFile).getSheet("Sheet1");
			String UserName  = MySheet.getRow(0).getCell(0).getStringCellValue();
			String Password  = MySheet.getRow(0).getCell(1).getStringCellValue();
			String Pin = MySheet.getRow(0).getCell(2).getStringCellValue();
			
			//Create object of KiteLoginPage
			KiteLoginPage login=new KiteLoginPage(driver);
			login.sendUserName(UserName);
			login.sendPassword(Password);
			login.clickOnLoginButton();
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));	
			
			//Create object of KitePINPage
			KitePINPage pin=new KitePINPage(driver);	
			pin.sendPIN(Pin);
			pin.clickOnContinueButton();		
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));	
			//Thread.sleep(2000);
			
			//create object of KiteHomePage
			KiteHomePage home=new KiteHomePage(driver);
			home.validateUserID(UserName);
			home.clickOnLogoutButton();
			
			driver.close();
		
			
			
			
			
	}
}