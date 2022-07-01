package POM_With_ExcelReading_multipleData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Login_Page {
	//1. data members/variables
		@FindBy(id = "userid") private WebElement UN;
		@FindBy(id = "password") private WebElement PWD;
		@FindBy(xpath = "//button[@type='submit']") private WebElement loginButton;
		
		//2. constructor
		public Kite_Login_Page(WebDriver driver) 
		{
		PageFactory.initElements(driver, this);	
		}

		//3.method
		public void sendUserName(String usernm)	//string passed --> we can take any variable
		{
			UN.sendKeys(usernm);
		}
		public void sendPassword(String pass)	//string passed --> we can take any variable
		{
			PWD.sendKeys(pass);
		}
		public void clickOnLoginButton()	//string passed --> we can take any variable
		{
			loginButton.click();
		}
		

}
