package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathUse {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium files\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		WebDriver driver1=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(100); 
		driver.close();
		Thread.sleep(100); 
		driver1.get("https://vctcpune.com/selenium/practice.html");
		
		//driver.findElement(By.xpath("//input[@value='Radio4']")).click();
		
		//driver.findElement(By.xpath("//input[@id='autocomplete']")).click();
		
		//driver.findElement(By.xpath("//input[@name='dropdown-class-example']")).click();
		
		//driver.findElement(By.xpath("//input[@for='bmw']")).click();
		
		
		
		
		//X-path by contains with attribute
		
		//X-path by contains with text
		driver.findElement(By.xpath("//a[contains(@name,'Start learning CSS now »')]"));
		
		
		}

}
