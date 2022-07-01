package try_catch_Use;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener 
{
BaseClassUsingProperty b=new BaseClassUsingProperty(); //created object of base class
	@Override
	public void onTestFailure(ITestResult result)
	{
		String TC_Name = result.getName();
	try 
	{
		b.takeScreenshot("TC_Name");
	} 
	catch (IOException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
@Override
public void onTestSuccess(ITestResult result)
{
Reporter.log("TC is success, Screenshot captured",true);
ITestListener.super.onTestSuccess(result);
Reporter.log("TC name is"+result.getName());
}
@Override
public void onTestSkipped(ITestResult result)
{
Reporter.log("TC is skipped, please check dependent TC",true);
ITestListener.super.onTestSkipped(result);
Reporter.log("TC name is"+result.getName());
}
}


