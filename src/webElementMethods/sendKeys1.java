package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendKeys1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium files\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		//SendKeys() Method Study for Google Page
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(100);
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//a[text()='Gmail']")).click();
		
		driver.findElement(By.xpath("//a[text()='Images']")).click();
	}

}
