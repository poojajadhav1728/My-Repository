package Kite_Base_Class;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
	//This is base class
	protected WebDriver driver;
	
	//Browser setup
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium files\\chromedriver_win32 (2)\\chromedriver.exe ");
		 driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));			
	}

}
