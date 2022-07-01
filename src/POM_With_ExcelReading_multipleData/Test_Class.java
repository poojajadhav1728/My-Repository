package POM_With_ExcelReading_multipleData;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_with_Excel_Reading.KiteHomePage;
import POM_with_Excel_Reading.KiteLoginPage;
import POM_with_Excel_Reading.KitePINPage;

public class Test_Class {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium files\\chromedriver_win32 (2)\\chromedriver.exe ");
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://kite.zerodha.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));				
			
			File MyFile=new File("C:\\Users\\Admin\\Desktop\\Selenium files\\Excel_Sheets\\Book1.xlsx");
			Sheet MySheet = WorkbookFactory.create(MyFile).getSheet("Sheet1");
			int lastRowNum = MySheet.getLastRowNum();
			int totalRowCount=lastRowNum;
			
			for(int i=0;i<=totalRowCount;i++)
			{
			
			String UserName  = MySheet.getRow(i).getCell(0).getStringCellValue();
			String Password  = MySheet.getRow(i).getCell(1).getStringCellValue();
			String Pin = MySheet.getRow(i).getCell(2).getStringCellValue();
			
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
			
			//create object of KiteHomePage
			KiteHomePage home=new KiteHomePage(driver);
			home.validateUserID(UserName);
			home.clickOnLogoutButton();
			
			WebElement changeUser = driver.findElement(By.xpath("//a[text()='Change user']"));
			changeUser.click();
			//driver.close();
			}
}

}
