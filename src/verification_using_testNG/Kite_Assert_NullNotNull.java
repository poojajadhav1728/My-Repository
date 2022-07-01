package verification_using_testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Kite_Assert_NullNotNull {
  @Test
  public void checkNull() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium files\\chromedriver_win32 (2)\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://kite.zerodha.com/");
	  driver.manage().window().maximize();
	  WebElement Pass = driver.findElement(By.xpath("//input[@type='password']"));
	  
//	  String s=null;
//	  String s1="Pooja";
	  
	  Assert.assertNotNull(Pass, "Password field is not empty");
	  Reporter.log("Password field is empty",true);
  }
  @Test
	  public void CheckTrue() 
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium files\\chromedriver_win32 (2)\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  driver.get("https://kite.zerodha.com/");
		  driver.manage().window().maximize();
		  WebElement Pass = driver.findElement(By.xpath("//input[@type='password']"));
		  
		  Assert.assertTrue(Pass.isDisplayed(), "Field is not selected Tc failed");
		  Reporter.log("TC passed", true);
	  }
  
  
}
