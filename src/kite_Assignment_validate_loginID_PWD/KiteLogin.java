package kite_Assignment_validate_loginID_PWD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

public class KiteLogin {

	//1. data members/variables
	@FindBy(id = "userid") private WebElement UN;
	@FindBy(id = "password") private WebElement PWD;
	@FindBy(xpath = "//button[@type='submit']") private WebElement loginButton;
	@FindBy(xpath = "//p[@class='error text-center']")private WebElement warning;
	@FindBy(xpath = "//span[contains(text(),'User ID should be minimum 6 characters.')]") private WebElement userErrorMsg;
	@FindBy(xpath = "//span[contains(text(),'Password should be minimum 6 characters.')]") private WebElement passErrorMsg;
	@FindBy(linkText = "Change user") private WebElement changeUesr;
	//2. constructor
	public KiteLogin(WebDriver driver) 
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
	public String warningMsg() throws InterruptedException
	{
		Thread.sleep(1000);
		String msg=warning.getText();
		return msg;	
	}
	public String getUserWarning()
	{
		String msg1=userErrorMsg.getText();
		return msg1;
	}
	public String getPasswordWarning()
	{
		String msg2=passErrorMsg.getText();
		return msg2;
	}
	public void changeUser()
	{
		changeUesr.click();
	}
	public void clearUsernamePassworField()
	{
		UN.clear();
		PWD.clear();
	}
}
