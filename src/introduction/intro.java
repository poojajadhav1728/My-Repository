package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class intro {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/"); 	// open an application
		//driver.close();		//close the current tab of the browser opened by Selenium tool
		
		//driver.quit();		//close the all the tabs present in browser opened by Selenium tool.
		
		driver.manage().window().maximize();	//maximize  the browser
	//	driver.manage().window().minimize();	// minimize the browser
		
		driver.navigate().to("https://www.google.com/");	// this method is use to open an another application
				
		driver.navigate().back();		//move back to 1st application 
		driver.quit();
		//driver.navigate().forward();	//move forward to 1st application 
		
		//driver.navigate().refresh();
		
		//driver.close();		//close the current tab of the browser opened by Selenium tool

		//String title=driver.getTitle();
		//System.out.println(title);
		
		//String url=driver.getCurrentUrl();
		//System.out.println(url);
		

		

	}

}
