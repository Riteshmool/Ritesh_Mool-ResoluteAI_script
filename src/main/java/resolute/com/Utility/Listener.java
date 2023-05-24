package resolute.com.Utility;

import org.testng.ITestListener;
import org.testng.ITestResult;

import resolute.com.Testbase.Testbase;

public class Listener extends Testbase implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		logger.info("Test execution start");    
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.info("Test execution Pass");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		logger.info("Test execution Failed");
		ScreenshotCode.Screenshot(result.getName());
		logger.info("Screenshot Taken");
	}	
}
