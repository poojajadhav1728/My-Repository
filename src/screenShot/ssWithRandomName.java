package screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ssWithRandomName {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium files\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
				
		driver.get("https://www.google.co.in/");
			
		driver.manage().window().maximize();
				
		Thread.sleep(100);
				
		//for random name
			
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String random= RandomString.make(4);
				
		File dest=new File("C:\\Users\\Admin\\Desktop\\Velocity Automation Testing\\Screenshots\\MyScreenShot"+random+".png");
		FileHandler.copy(source, dest);

	}

}
