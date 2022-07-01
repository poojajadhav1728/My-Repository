package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabledStudy {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium files\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		//isEnabled() method study
		
		driver.get("https://auth.discoveryplus.in/login");
		
		Thread.sleep(100);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement OTPButton = driver.findElement(By.xpath("//button[@type='submit']"));
		boolean result = OTPButton.isEnabled();
		System.out.println("Status of OTP button is "+result);
		
		driver.findElement(By.id("mobileNumber")).sendKeys("9988778899");
		Thread.sleep(100);
		boolean result1 = OTPButton.isEnabled();
		System.out.println("Status of OTP button is "+result1);
		

	}

}
