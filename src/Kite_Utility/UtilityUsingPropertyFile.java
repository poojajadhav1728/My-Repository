package Kite_Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import net.bytebuddy.utility.RandomString;

public class UtilityUsingPropertyFile 
{
	public static String readDataFromProperty(String key) throws IOException 
	{
		Properties prop=new Properties();
		FileInputStream myProperty=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Velocity_5th_March_B_Selenium\\src\\myProperty.properties");
		prop.load(myProperty);
		String value=prop.getProperty(key);
		return value;		
	}
	public static void implicitWait(WebDriver driver, int timeunit)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(timeunit));
	}
	public static void takeScreenshot(WebDriver driver) throws IOException
	{
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String random=RandomString.make(3);
	File dest= new File("C:\\Users\\Admin\\Desktop\\Velocity Automation Testing\\Screenshots\\MyScreenshot"+random+".png");
	org.openqa.selenium.io.FileHandler.copy(src, dest);
	}
	
}
