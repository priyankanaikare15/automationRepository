package Practice_POM_Model;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(name = "username") private WebElement usnTB;
	@FindBy(name = "pwd")private WebElement Password;
	@FindBy(id = "loginButton")private WebElement loginbutton;
	
	//Initialization
	LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//Utilization
	public WebElement getUsnTB() {
		return usnTB;
	}
	
	public WebElement getPassword() {
		return Password;
	}
	
	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
	//Operational
	public void valid_login() throws IOException
	{
		usnTB.click();
		Flib flib = new Flib();
		usnTB.sendKeys(flib.readPropertyData("PROP_PATH", "UserName"));
		Password.sendKeys(flib.readPropertyData("PROP_PATH", "Password"));
		loginbutton.click();
		
		
	}
	

}
