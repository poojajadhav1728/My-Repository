package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTextStudy {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium files\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		//getText() method study
		
		driver.get("https://www.w3schools.com/sql/");
		
		Thread.sleep(100);
		driver.manage().window().maximize();
		
		WebElement Element1 = driver.findElement(By.xpath("//a[text()='Start learning SQL now »']"));
		
		//System.out.println(Element1.getText());
		
		String ActualText=Element1.getText();
		
		System.out.println(ActualText);
		
		String ExpectedText="Start Learning SQL now »";		
		
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
