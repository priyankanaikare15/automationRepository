package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(name = "username") private WebElement usn;
	@FindBy(name = "pwd") private WebElement pass;
	@FindBy(id = "loginButton") private WebElement loginButton;
	
	//initialization  
	
	public LoginPage(WebDriver driver)  //constructor
	{
		PageFactory.initElements(driver, this);
	}
   
	//Utilization
	
	public WebElement getUsn() {
		return usn;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
   
	//Operational
	
	public void validLogin(String validUsername, String validPassword)
	{
		usn.sendKeys(validUsername);
		pass.sendKeys(validPassword);
		loginButton.click();
	}
	
	public void invalidLogin(String invalidUsername, String invalidPassword) throws InterruptedException
	{
		usn.sendKeys(invalidUsername);
		pass.sendKeys(invalidPassword);
		loginButton.click();
		Thread.sleep(2000);
		usn.clear();
		
	}
	
}
