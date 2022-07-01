package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.microsoft.com/en-in/sql-server/sql-server-downloads");
		Thread.sleep(100);
		driver.manage().window().maximize();
		
		WebElement Element = driver.findElement(By.xpath("//a[contains(text(),'Download SQL Server Migration ')]"));
		
		String ActualText=Element.getText();
		System.out.println(ActualText);
		
		String ExpectedText="Download SQL Server Migration Assistant for Oracle";		
		
		if (ActualText.equals(ExpectedText))
		{	
			System.out.println("Text matches.Test Case is Passed");
		}
		else
		{
			System.out.println("Textdoes not match.Test Case is Failed");
		}
	}

}
