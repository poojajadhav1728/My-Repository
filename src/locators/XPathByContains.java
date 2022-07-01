package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathByContains {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium files\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.w3schools.com/css/css_intro.asp");
		
		//X-path by contains with text
		//driver.findElement(By.xpath("//p[contains(@name,'What is CSS?')]")).click();

		//X-Path By Contains with attribute
		driver.findElement(By.xpath("//p[contains(@name,'CSS is the language we use to style a Web page.')]")).click();

	}

}
