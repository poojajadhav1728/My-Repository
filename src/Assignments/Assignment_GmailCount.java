package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_GmailCount {

	public static void main(String[] args)
	{
		//1.Open a browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium files\\chromedriver_win32 (2)\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		

		driver.manage().window().maximize();
		
		
		//2.Navigate to Gmail (https://www.gmail.com)
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		//Login to your Gmail with correct credentials.
		WebElement option1 = driver.findElement(By.xpath("//div[@class='aKw']"));
		//option1.sendKeys("poojajdhav1728@gmail.com");
		//WebElement option2 = driver.findElement(By.xpath("//span[text()='Next']"));
		option1.click();
		
		//Verify that by default “Primary” section is selected.
		//If not click on the Primary tab.

	//	WebElement option3 = driver.findElement(By.xpath("//div[@class='aKw']"));
	//	option3.click();
		
		//Get the count of the total number of emails in the Primary tab.
		//Get the name of the sender and subject of Nth Email of your inbox.
		//Write a method to get the name of the sender and subject of email of your inbox.

	}

}
