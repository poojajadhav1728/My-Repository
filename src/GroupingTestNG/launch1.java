package GroupingTestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class launch1 {
  @Test
  public void zerodha()
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\Desktop\\\\Selenium files\\\\chromedriver_win32 (2)\\\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://kite.zerodha.com/");
		
		Reporter.log("Zerodha is launching", true);

  }
}
