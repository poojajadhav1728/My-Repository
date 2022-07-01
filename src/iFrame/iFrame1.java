package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium files\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//I have to switch selenium focus from main page to iframe
		//for this I will use switchTo() method
		driver.switchTo().frame("iframeResult");
		Thread.sleep(1000);
		//now current focus is on frame
		WebElement text=driver.findElement(By.xpath("//button[contains(text(),'Click me to')]"));	//click on courses by using x_path
		Thread.sleep(1000);
		text.click();
		System.out.println(text.getText());	//print text
		Thread.sleep(1000);
		//to change theme will use switchTo().defaultContent() method
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
		
	}

}
