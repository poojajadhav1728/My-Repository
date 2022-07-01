package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrameStudy {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium files\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//I have to switch selenium focus from main page to iframe
		//for this I will use switchTo() method
		driver.switchTo().frame("iframe-name");
		Thread.sleep(1000);
		//now current focus is on frame
		driver.findElement(By.xpath("(//a[text()='Courses'])[1]")).click();	//click on courses by using x_path
		Thread.sleep(1000);
		
		//now I have to switch on main page again, so i need to switch selenium  focus from frame to main page
		//here we can use parentfFrame() or defaultContent() method
		
		driver.switchTo().parentFrame();	// switching selenium focus from frame to main page
		
		driver.findElement(By.id("checkBoxOption1")).click();	//for clicking check box on main page
		
	}

}
