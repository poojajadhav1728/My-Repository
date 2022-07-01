package Kite_Base_Class;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Kite_Utility.UtilityUsingPropertyFile;

public class BaseClassUsingProperty
{
protected WebDriver driver;
	
	//Browser setup
	public void openBrowser() throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium files\\chromedriver_win32 (2)\\chromedriver.exe ");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(UtilityUsingPropertyFile.readDataFromProperty("URL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));			
	}

}
