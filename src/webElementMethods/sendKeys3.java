package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendKeys3 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium files\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		//SendKeys() Method Study for W3Scools 
		
		driver.get("https://www.w3schools.com/sql/");
		
		Thread.sleep(100);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();  //click on login
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("pooja");  //login page-Email
		driver.findElement(By.xpath("//input[@name='current-password']")).sendKeys("pooja2328");//enter password
		driver.findElement(By.xpath("//button[@class='_1VfsI _OD95i _3_H0V']")).click();  //click login button
		
		//clear method
		
		driver.findElement(By.xpath("//input[@name='email']")).clear();
		
		
		
		
	}

}
