package try_catch_Use;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Kite_Utility.UtilityUsingPropertyFile;
import net.bytebuddy.utility.RandomString;

public class BaseClassUsingProperty
{
static WebDriver driver;
	
	//Browser setup
	public void openBrowser() throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium files\\chromedriver_win32 (2)\\chromedriver.exe ");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(UtilityUsingPropertyFile.readDataFromProperty("URL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));			
	}
	public  void takeScreenshot(String TC_Name) throws IOException
	{
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File dest= new File("C:\\Users\\Admin\\Desktop\\Velocity Automation Testing\\Screenshots\\"+TC_Name+".png");
	org.openqa.selenium.io.FileHandler.copy(src, dest);
	}

}
