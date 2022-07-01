package TestNg_Listener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener 
{
//It dosen't show @override bcz whichever we want to override only that we will override 
@Override
	public void onTestFailure(ITestResult result)
{
	Reporter.log("TC is failure, Screenshot captured",true);
	ITestListener.super.onTestFailure(result);
	Reporter.log("TC name is"+result.getName());
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


