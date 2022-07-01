package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listBox1 {

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
		WebElement day = driver.findElement(By.name("birthday_day"));
		
		//2.Create an object of Select class which will accept WebElement as argument
		Select s= new Select(day);
		
		// 3. By using one of the select class methods we can select values form list box like 
		// i. selectByVisibleText: selectByVisibleText(String arg0) 
		
		Thread.sleep(1000);
		s.selectByVisibleText("12");
		
		// ii. selectByIndex: selectByIndex(int arg0) 
				
		Thread.sleep(1000);
		s.selectByIndex(2);
		
		// iii. selectByValue: selectByValue(String arg0)
		Thread.sleep(1000);
		s.selectByValue("31");
		
		WebElement month = driver.findElement(By.id("month"));
		
		Select s1= new Select(month); 	
		
		s1.selectByVisibleText("Mar");	//selectByVisibleText: selectByVisibleText(String arg0)
	
		s1.selectByIndex(9);	//selectByIndex: selectByIndex(int arg0) 
		Thread.sleep(1000);
		
		s1.selectByValue("11");	//selectByValue: selectByValue(String arg0)
		Thread.sleep(1000);
		
		
		WebElement year=driver.findElement(By.id("year"));
		
		Select s2= new Select(year);
		
		s2.selectByVisibleText("2017");	//selectByVisibleText
	
		Thread.sleep(1000);
		
		s2.selectByIndex(0);	//selectByIndex
		
		Thread.sleep(1000);
		
		s2.selectByValue("2014");
		
		Thread.sleep(1000);

	}

}
