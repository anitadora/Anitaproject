package AnitaProjectDD;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resources.base;
import resources.extentReproterdd;

public class Listeners extends base implements ITestListener {
	
	ExtentTest  test;
   ExtentReports extent= extentReproterdd.getReportObject();
   ThreadLocal<ExtentTest> extentTest= new ThreadLocal<ExtentTest>();
   
   
   
	@Override
	public void onTestStart(ITestResult result) {
		test= extent.createTest(result.getMethod().getMethodName());
		extentTest.set(test);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS,"TEST PASSED");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		//screenshot
		extentTest.get().fail(result.getThrowable());
		WebDriver driver=null;
		String testMethodName=result.getMethod().getMethodName();
	try {
		driver=(WebDriver)result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
	} catch (Exception e)
	{
	
	}
		try {
			extentTest.get().addScreenCaptureFromPath(getScreenShotPath(testMethodName,driver), result.getMethod().getMethodName());
		      
		
			
		}catch (Exception e) 
			{
				e.printStackTrace();
			}
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.flush();
	}

}
