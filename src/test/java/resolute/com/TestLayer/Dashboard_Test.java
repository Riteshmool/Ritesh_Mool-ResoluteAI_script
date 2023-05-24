package resolute.com.TestLayer;



import org.testng.Assert;
import org.testng.annotations.Test;

import resolute.com.Testbase.Testbase;

public class Dashboard_Test extends Testbase{
	
	@Test
	public void Dashboard() throws InterruptedException {
		login.setEmailId("test101@gmail.com");
		logger.info("Email id entered sucessfully");
		Thread.sleep(3000);
		login.setPassword("Test@101");
		logger.info("Password entered sucessfully");
		Thread.sleep(3000);
		login.clickLogin();
		logger.info("Login sucessfully");
	    Thread.sleep(15000);
		dashboard.clickOnDate();
		logger.info("Select date sucessfully");
		Thread.sleep(15000);
		dashboard.ClickOnSync();
		logger.info("Click on Sync Todays attendance sucessfully");
		Thread.sleep(15000);
		String exp_status="Todays Attendance Data has been synced";
		Assert.assertEquals(dashboard.getStatus(),exp_status);
		logger.info("Save attendance data sucessfully");
		Thread.sleep(15000);
		dashboard.clickOnLogout();
		Thread.sleep(15000);
		dashboard.ClickOnOK();
		logger.info("Logout sucessfully");
		Thread.sleep(10000);
	
		

		
		
		
}
}