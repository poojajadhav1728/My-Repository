package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class enterText_JSExecutor {
////not Executed
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium files\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
//		driver.manage().window().maximize();

		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		driver.manage().window().maximize();
		//1.To handle alert popup, we need to switch selenium focus from main page to alert popup
		Alert alt = driver.switchTo().alert();
				
		//2.Alert is an interface which contains abstract methods-->accept(),dismiss(),getText()
		System.out.println(alt.getText()); 	//print text present in a alert popup.
				
		alt.accept(); 		 // click on ok button.
				
				Thread.sleep(2000);
		// By using JavaScript Executor to enter text

		JavascriptExecutor j = (JavascriptExecutor) driver; 
		j.executeScript ("document.getElementByxpath(('//input[@role='searchbox'])[2]')).text 'Pune'");

		WebElement UserName = driver.findElement(By.id("email"));
		j.executeScript ("document.getElementByxpath('(//input[@type='text'])[2]').text='kolhapur'");


		/*WebElement Password = driver.findElement(By.id("pass"));

		String s = UserName.getAttribute("text"); 
		String s1 = Password.getAttribute("text");

		System.out.println("Username entered is:" + s);

	
		System.out.println("Password enterd is: "+ s1);

	
		driver.quit();
*/
	}

}
