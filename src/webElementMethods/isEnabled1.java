package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium files\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		//isEnabled() method study
		
		driver.get("https://auth.discoveryplus.in/login");
		
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement OTP=driver.findElement(By.xpath("//button[text()='Get OTP']"));
		Thread.sleep(5000);
		
		if(OTP.isEnabled())
		{
			OTP.click();
		}
		else
		{
			System.out.println("Entering Mobile Number");
			driver.findElement(By.name("mobileNumber")).sendKeys("8888889999");
			Thread.sleep(2000);
			
			if (OTP.isEnabled())
			{
				OTP.click();
			}
			else
			{
				System.out.println("Failed to click OTP button");
			}
		}
		
	}

}
