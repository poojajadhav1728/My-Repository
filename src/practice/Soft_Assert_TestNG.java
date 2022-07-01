package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

//soft Assert concept not clear
public class Soft_Assert_TestNG {
WebDriver driver;

SoftAssert soft= new SoftAssert();
	@BeforeMethod
	public void LaunchBrowser()
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium files\\chromedriver_win32 (2)\\chromedriver.exe");
		  driver= new ChromeDriver();
		  driver.get("https://www.google.com/");
		  driver.manage().window().maximize();
	}
	
	
	@Test
	public void GoogleHomepage()
	{
			String ExpectedText = "Google Search";	
			String ActualText = driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).getText();
			
			String ActualText1 = driver.findElement(By.xpath("//img[@alt='Google']")).getText();
			String ExpectedText1="Google";
			
			soft.assertNotEquals(ActualText1, ExpectedText1);
			//Reporter.log("Text is matching TC is passed", true);
			
			soft.assertEquals(ActualText, ExpectedText);
			//Reporter.log("Text is matching TC is passed", true);
			
			
			
			
	soft.assertAll();
	}
	
	@AfterMethod
	public void CloseBrowser()
	{
		driver.close();
	}
}
