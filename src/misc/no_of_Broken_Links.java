package misc;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Exception in thread "main" java.net.MalformedURLException: no protocol: 
public class no_of_Broken_Links {

	public static void main(String[] args) throws MalformedURLException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium files\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(200));
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		//get attribute from each link
		//for each loop
		for(WebElement link:links)
		{
			String url = link.getAttribute("href");
		
		HttpURLConnection con = (HttpURLConnection)(new URL(url).openConnection());
		
		con.setRequestMethod("HEAD");	//returns header format
		con.connect();
		//validating links
		int ResponseCode = con.getResponseCode();
		
		if(ResponseCode<400)
		{
			System.out.println("Valid link");
		}
		else
			{
			System.out.println("Invalid link");
			}
		
		}
		
	}

}
