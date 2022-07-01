package verification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CheckboxVerify {
  @Test
  public void Test1() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium files\\chromedriver_win32 (2)\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://vctcpune.com/selenium/practice.html");
	  driver.manage().window().maximize();
	  WebElement checkBox1 = driver.findElement(By.id("checkBoxOption1"));
	   
	  // if(checkBox1.isSelected())
	  // {
	  // Reporter.log("TC is passed", true);
	  // }
	  //
	  // else {
	  // Reporter.log("TC is failed", true);
	  // }
	   
	  checkBox1.click();
	  Thread.sleep(100);
	  Assert.assertTrue(checkBox1.isSelected(), "CheckBox is not Selected TC is failed");
	  Reporter.log("CheckBox is Selected TC is Passed", true);
  }
}
