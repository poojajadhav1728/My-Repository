package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathByText {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium files\\chromedriver_win32 (2)\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.w3schools.com/css/css_intro.asp");
		
		
		//X-path by text
		driver.findElement(By.xpath("//h2[text()='What is CSS?']")).click();
		
	
		
	}

}
