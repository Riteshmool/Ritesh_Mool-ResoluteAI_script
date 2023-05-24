package resolute.com.Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import resolute.com.Testbase.Testbase;

public class ScreenshotCode extends Testbase{
	
	public ScreenshotCode() {
		PageFactory.initElements(driver, this);
	}

	public static void Screenshot(String nameofscreenshot) {
		
		String path="C:\\Ritesh all eclipse data\\Ritesh_ vclasses_data\\Set up\\eclipse_ide_2021_12\\eclipse_Workspace_2021_12\\Ritesh_Mool-ResoluteAI_script\\Screenshot\\";
		TakesScreenshot sc = (TakesScreenshot)driver;
		File x = sc.getScreenshotAs(OutputType.FILE);
		File y = new File(path+System.currentTimeMillis()+nameofscreenshot+".png");
		try {
			FileHandler.copy(x, y);
		} catch (IOException e) {
			System.out.println("File Not Found");
		}
		
	}
	
	
}
