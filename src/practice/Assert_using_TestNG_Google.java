package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assert_using_TestNG_Google 
{
	WebDriver driver;
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
			
		//	Assert.assertNotEquals(ActualText1, ExpectedText1);
		//	Reporter.log("Text is not matching TC is passed", true);
			
			boolean a=true;
			boolean b=false;
			
			Assert.assertTrue(a, "Result-->false");
			Reporter.log("TC passed",true);
			
			
			Assert.assertTrue(true, ExpectedText1);
			Reporter.log("Text is matching TC is passed", true);
			
			WebElement typeText = driver.findElement(By.name("q"));
			typeText.sendKeys("Selenium");
			typeText.sendKeys(Keys.ENTER);
			
			Assert.assertEquals(ActualText, ExpectedText);
			Reporter.log("Text is matching TC is passed", true);
	}
	@AfterMethod
	public void CloseBrowser()
	{
		driver.close();
	}

	
}
