package resolute.com.Testbase;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


import io.github.bonigarcia.wdm.WebDriverManager;
import resolute.com.PageLayer.DashboardPage;
import resolute.com.PageLayer.LoginPage;

public class Testbase {
	
	public static WebDriver driver;
	public static Logger logger;
	public LoginPage login;
	public DashboardPage dashboard;
	
	@BeforeClass
	public void start() {
		logger=Logger.getLogger("Welcome to Framework");
		PropertyConfigurator.configure("Log4j");
		logger.info("Framework Execution Started");
	}	
	@AfterClass
	public void stop() {
		logger.info("Framework Execution Stopped");
	}
	
	@Parameters("Browser")
	@BeforeMethod
	public void setBrowser(String br) {
		if(br.equalsIgnoreCase("CHROME")) {
		   WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else if(br.equalsIgnoreCase("FIREFOX")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver(); 
		}
		else {
			System.out.println("Invalid Browser Name");
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://test-bams.web.app");
		
		login= new LoginPage();
		dashboard=new DashboardPage();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	

}
