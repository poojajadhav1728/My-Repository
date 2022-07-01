package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium files\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		//isEnabled() method study
		
		driver.get("https://www.myvi.in/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Sign In']")).click();
		WebElement OTP=driver.findElement(By.xpath("//button[text()='send OTP']"));
		if (OTP.isEnabled())
		{
			OTP.click();
		}
		else
		{
			System.out.println("Entering Mobile Number");
			driver.findElement(By.id("mobile")).sendKeys("7768806735");
			Thread.sleep(2000);
		if(OTP.isEnabled())
		{
			System.out.println("OTP button is enabled");
			OTP.click();
		}
		else
		{
			System.out.println("Failed to click OTP button");
		}
		}

	}

}
