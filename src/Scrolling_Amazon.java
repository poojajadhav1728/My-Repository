import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling_Amazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium files\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		
		
		WebElement link = driver.findElement(By.xpath("//a[text()='Explore more from Amazon Pay'])[2]"));
		link.click();
		
		JavascriptExecutor j=((JavascriptExecutor)driver);
		Thread.sleep(3000);
		j.executeScript("arguments[0].scrollIntoView(true);",link);

	}

}
