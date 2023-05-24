package resolute.com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resolute.com.Testbase.Testbase;

public class LoginPage extends Testbase{
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement emailId;
	public void setEmailId(String email) {
		emailId.sendKeys(email);
	}
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	public void setPassword(String pass) {
		password.sendKeys(pass);
	}
	@FindBy(xpath="//button[text()='Log In']")
	private WebElement loginbt;
	public void clickLogin() {
		loginbt.click();
	}

	
	
	
}
