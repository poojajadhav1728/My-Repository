package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listBox2 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium files\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(100);
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0_2_')]")).click();
		Thread.sleep(1000);
		
		//1.Identify list box to be handled and store it in reference variable
		WebElement month =driver.findElement(By.id("month"));
		
		//2.Create an object of Select class which will accept WebElement as argument
		Select s=new Select(month);
		
		// By using one of Select Method: Perform action- Select Months 
		for(int i=0;i<=11;i++)
		{
			s.selectByIndex(i);
			//s.selectByValue("i");
			Thread.sleep(1000);		}
		
	}

}
