package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectMultiple {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium files\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(100);
		WebElement dropDownBox = driver.findElement(By.name("cars"));
		
		Select s= new Select(dropDownBox);  //1. create object of select class
		
		boolean result = s.isMultiple();  //2. check is Multiple
		System.out.println("isMultiple result is "+result);
		s.selectByIndex(0);
		Thread.sleep(1000);
		s.selectByIndex(1);
		Thread.sleep(1000);
		s.selectByIndex(2);
		Thread.sleep(1000);
		
		//deselect 
		s.deselectByIndex(0);
		Thread.sleep(1000);
		
	}

}
