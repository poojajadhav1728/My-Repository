package vctc_TestClasses;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import vctc_BaseClass.BaseClass;
import vctc_POM.vctc_POM;
import vctc_Utility.vctc_Utility;

public class vctc_validation extends BaseClass
{
	vctc_POM page;
	@BeforeClass
	public void launchBrowser()
	{
		openBrowser();
		vctc_Utility.implicitWait(driver, 2000);
		page=new vctc_POM(driver);
	}
  @Test
  public void Scrolling_Screenshot() throws IOException 
  {
	  vctc_Utility.scrolling(driver, page.radio());
	  vctc_Utility.takeScreenshot(driver);
	  vctc_Utility.implicitWait(driver, 2000);
	  vctc_Utility.scrolling(driver, page.table());
	  vctc_Utility.implicitWait(driver, 2000);
	  vctc_Utility.scrolling(driver, page.openWindow());
  }
}
