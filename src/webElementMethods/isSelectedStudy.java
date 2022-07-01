package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelectedStudy {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium files\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);		
		WebElement checkbox = driver.findElement(By.id("checkBoxOption1"));
		if (checkbox.isSelected())
		{
			System.out.println("Check box is already selected");
		}
		else
		{
			System.out.println("Selecting Check box now");
			checkbox.click();
			
			if (checkbox.isSelected())
			{
				System.out.println("Check box is Selected now");
			}
			else
			{
				System.out.println("Failed to select Check box");
			}
		}
		
	}

}
