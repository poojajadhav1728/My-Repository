package vctc_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class vctc_POM
{
	//data members
	@FindBy(name = "radio") private WebElement radioButton;
	@FindBy(xpath ="(//td[text()='Velocity Trainers'])[1]")private WebElement tableData ;
	@FindBy(xpath = "//button[@id='openwindow']")private WebElement window;

//Constructor
public vctc_POM(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

//method
	public WebElement radio()
	{
		WebElement button=radioButton;
		button.click();
		return button;
	}
	public WebElement table()
	{
		WebElement data=tableData;
		return data;
		
	}
	public WebElement openWindow()
	{
		WebElement window1 =window;
		window1.clear();
		return window1;
		
	}
}