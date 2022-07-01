package testNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestClass {
  @Test
  public void Zerodha_Login() 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium files\\chromedriver_win32 (2)\\chromedriver.exe ");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));	
		System.out.println("Zerodha_Login is successful");	//prints-->present in Console only
  }
  @Test
  public void Google_Login() 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium files\\chromedriver_win32 (2)\\chromedriver.exe ");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));	
		Reporter.log("Google_Login is successful"); //prints-->present in Report only not in Console 
  }
  @Test
  public void WhatsAppWeb_Login() 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium files\\chromedriver_win32 (2)\\chromedriver.exe ");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://web.whatsapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));	
		Reporter.log("WhatsAppWeb_Login is successful", true);	//prints-->present in Report as well as in Console also 
  }
}
