package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Class {

	public static void main(String[] args) throws InterruptedException
	{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium files\\chromedriver_win32 (2)\\chromedriver.exe ");
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://kite.zerodha.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));				
			
			//Create object of KiteLoginPage
			KiteLoginPage login=new KiteLoginPage(driver);
			login.sendUserName();
			login.sendPassword();
			login.clickOnLoginButton();
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));	
			
			//Create object of KitePINPage
			KitePINPage pin=new KitePINPage(driver);	
			pin.sendPIN();
			pin.clickOnContinueButton();		
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));	
			//Thread.sleep(2000);
			
			//create object of KiteHomePage
			KiteHomePage home=new KiteHomePage(driver);
			home.validateUserID();
			home.clickOnLogoutButton();
			
			driver.close();
		
			
	}
}