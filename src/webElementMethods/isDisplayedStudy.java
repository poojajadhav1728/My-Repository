package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayedStudy {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement textbox=driver.findElement(By.id("displayed-text"));
		boolean result = textbox.isDisplayed();
		
		System.out.println("Text Box status is "+result);
		textbox.sendKeys("text");
		
		driver.findElement(By.id("hide-textbox")).click();
		Thread.sleep(3000);
		
		boolean result1 = textbox.isDisplayed();
		Thread.sleep(5000);
		
		System.out.println("Text Box status is "+result1);

	}

}
