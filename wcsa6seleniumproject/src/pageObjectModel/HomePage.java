package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//It is used to store all the webElements of Home Page 
	@FindBy(xpath = "//div[text()='Time-Track']/ancestor::a") private WebElement TimeTrackModule;
	@FindBy(xpath = "//div[text()='Tasks']/ancestor::a") private WebElement TaskModule;
	@FindBy(xpath = "//div[text()='Reports']/ancestor::a") private WebElement ReportsModule;
    @FindBy(xpath = "//div[text()='Users']/ancestor::a") private WebElement UsersModule;
    @FindBy(xpath = "//div[text()='Work Schedule']/ancestor::a") private WebElement WorkScheduleModule;
    @FindBy(xpath = "//div[text()='Settings']/ancestor::a") private WebElement SettingModule;
    @FindBy(partialLinkText = "Logout")private WebElement Logout_Link;
    
    //initialization
    
    public HomePage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }

    
    //utilization
    
	public WebElement getTimeTrackModule() {
		return TimeTrackModule;
	}

	public WebElement getTaskModule() {
		return TaskModule;
	}

	public WebElement getReportsModule() {
		return ReportsModule;
	}

	public WebElement getUsersModule() {
		return UsersModule;
	}

	public WebElement getWorkScheduleModule() {
		return WorkScheduleModule;
	}

	public WebElement getSettingModule() {
		return SettingModule;
	}

	public WebElement getLogout_Link() {
		return Logout_Link;
	}
	
	//Operational
	
	public void click_on_Time_Track_Module()
	{
		TimeTrackModule.click();
	}
	
	public void click_on_Task_Module()
	{
		TaskModule.click();
	}
	
	public void click_on_Report_Module()
	{
		ReportsModule.click();
	}
	
	public void click_on_Users_Module()
	{
		UsersModule.click();
	}
	public void click_on_Work_Schedule_Module()
	{
		WorkScheduleModule.click();
		
	}
	
	public void click_on_Setting_Module()
	{
		SettingModule.click();
	}
	
	public void click_on_Logout_Module()
	{
		Logout_Link.click();
	}
}
