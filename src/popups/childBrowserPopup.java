package popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class childBrowserPopup {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium files\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String idOfMainPage = driver.getWindowHandle();
		System.out.println("Main page id "+idOfMainPage);
		
		//all ids are received in set
		Set<String> allIds = driver.getWindowHandles();
		
		//set<String> need to convert into ArrayList for using for loop
		ArrayList<String> ar= new ArrayList<>(allIds);
		for(int i=0;i<=ar.size()-1;i++)
		{
			System.out.println(ar.get(i));
		}
		
		String MainPageId=ar.get(0);
		String ChildPageId=ar.get(1);
		
		//to switch to child page--> we have to sqwitch selenium focus from main page to child page
		
		driver.switchTo().window(ChildPageId);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("the7-search")).sendKeys("Selenium Exceptions");
		driver.findElement(By.xpath("//a[@class='submit']")).click();
		Thread.sleep(2000);
		
		
		driver.close();// will close only current open tab
		//driver.quit();// will close all windows open by selenuim in current session
		Thread.sleep(1000);
		driver.switchTo().window(MainPageId);// switching selenium focus from child page to main page
		
		driver.findElement(By.name("NewTab")).click();
		Thread.sleep(2000);
		driver.close();
		/*
		driver.close();
		Thread.sleep(3000);

		driver.switchTo().window(ar.get(0));	*/
	}

}
