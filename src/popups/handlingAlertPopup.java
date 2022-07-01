package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingAlertPopup {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium files\\chromedriver_win32 (2)\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		
		//1.To handle alert popup, we need to switch selenium focus from main page to alert popup
		Alert alt = driver.switchTo().alert();
		
		//2.Alert is an interface which contains abstract methods-->accept(),dismiss(),getText()
		System.out.println(alt.getText()); 	//print text present in a alert popup.
		
		alt.accept(); 		 // click on ok button.
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		Thread.sleep(9000);
		
		Alert alt1 = driver.switchTo().alert();
		Thread.sleep(9000);
		alt1.accept();
		
	}

}
