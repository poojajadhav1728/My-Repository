package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendKeysStudy {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium files\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		//SendKeys() Method Study for Facebook Login Page
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(100);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("pooja");
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("12345");
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
			}

}
