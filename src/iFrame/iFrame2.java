package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium files\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//I have to switch selenium focus from main page to iframe
		//for this I will use switchTo() method
		driver.switchTo().frame("frame1");
		Thread.sleep(1000);
		
		//now current focus is on frame1
		WebElement text1 = driver.findElement(By.xpath("//body[text()='Parent frame']"));
		System.out.println(text1.getText());	//print text 
		
		//switch selenium focus from frame1 to frame2
		WebElement f2 = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		driver.switchTo().frame(f2);
		WebElement text2 = driver.findElement(By.xpath("//p[text()='Child Iframe']"));
		System.out.println(text2.getText());	//print text 
		
		//i want to print text from main page so we can use  parentfFrame() or defaultContent() method
		driver.switchTo().defaultContent();
		WebElement text3 = driver.findElement(By.xpath("//div[text()='Nested Frames']"));
		System.out.println(text3.getText());
		
		//i want to print text from main page so we can use  parentfFrame() or defaultContent() method
		//driver.switchTo().parentFrame();
		//System.out.println(text1.getText());	//print text 
				
	
	}

}
