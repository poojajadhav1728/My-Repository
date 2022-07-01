package misc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTable {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium files\\chromedriver_win32 (2)\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		// driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
		Thread.sleep(1000);
		//to know how many rows are there in table
		List<WebElement> rows = driver.findElements(By.xpath("//tr"));
		int TotalNumOfRows = rows.size();
		System.out.println("Total rows in table are "+TotalNumOfRows);
		for(WebElement r:rows)
		{
		System.out.print("|| "+r.getText()+" ||");
		System.out.println();
		}
		//to know how many columns are there in table
		List<WebElement> columns = driver.findElements(By.xpath("//th"));
		int TotalNumOfColumns = columns.size();
		System.out.println("total num of columns are "+TotalNumOfColumns);
		for(WebElement c:columns)
		{
		System.out.print(c.getText()+" ||");
		}

	}

}
