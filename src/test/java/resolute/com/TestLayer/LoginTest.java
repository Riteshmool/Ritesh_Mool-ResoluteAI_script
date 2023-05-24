package resolute.com.TestLayer;

import org.testng.annotations.Test;

import resolute.com.Testbase.Testbase;

public class LoginTest extends Testbase {

	@Test
	public void verifyLogin() throws InterruptedException {
		login.setEmailId("test101@gmail.com");
		logger.info("Email id entered sucessfully");
		Thread.sleep(3000);
		login.setPassword("Test2101");
		logger.info("Password entered sucessfully");
		Thread.sleep(3000);
		login.clickLogin();
		logger.info("Login sucessfully");
	}
	
	

}
