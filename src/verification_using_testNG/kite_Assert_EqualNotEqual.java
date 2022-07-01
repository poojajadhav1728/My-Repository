package verification_using_testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class kite_Assert_EqualNotEqual {
  @Test
  public void verifyText() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium files\\chromedriver_win32 (2)\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://kite.zerodha.com/");
	  driver.manage().window().maximize();
	  String ActualText=driver.findElement(By.xpath("//h2[text()='Login to Kite']")).getText();
	  String ExpectedText="Login to Kite";
	  
	  //Assert.assertEquals(ActualText, ExpectedText,"Text is not matching TC is failed");
	  //Reporter.log("Text is matching TC is passed", true);
  
	  String ExpectedText1 = "Testing";
	  Assert.assertNotEquals(ActualText, ExpectedText1,"Text is matching TC is passed");
	  Reporter.log("TC are not matching TC is passed", true);
  }
}
