package resolute.com.PageLayer;




import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import resolute.com.Testbase.Testbase;

public class DashboardPage extends Testbase{
	
	public DashboardPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//button[@class='MuiButtonBase-root MuiPickersDay-root MuiPickersDay-dayWithMargin css-xhtuuu'])[23]")
	private WebElement date;
	public void clickOnDate(){
		date.click();
	}
	@FindBy(xpath="//button[text()='Sync Todays Attendance']")
	private WebElement syncbt;
	public void ClickOnSync() {
		syncbt.click();
	}
	
	@FindBy(xpath="//div[text()='Todays Attendance Data has been synced']")
	private WebElement status;
	public String getStatus() {
		String act_status =status.getText();
		return act_status;
	}
	
	@FindBy(xpath="//span[text()='Log Out']")
	private WebElement logout;
	public void clickOnLogout() {
		logout.click();
	}
	@FindBy(xpath="(//button[@class='MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButtonBase-root  css-3fc02r'])[3]")	
	private WebElement okbt;
	public void ClickOnOK() {
		okbt.click();
	}
	

}
