package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocator {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://aiflyingreturns.b2clogin.com/aiflyingreturns.onmicrosoft.com/b2c_1a_signup_signin/oauth2/v2.0/authorize?client_id=ac5c8be3-c829-4db6-8eb7-aa4a37c61cbc&scope=ac5c8be3-c829-4db6-8eb7-aa4a37c61cbc%20openid%20profile%20offline_access&redirect_uri=https%3A%2F%2Floyalty.airindia.com%2Fin%2Fen%2Faccount-summary.html&client-request-id=26c45b20-796e-4815-9679-6424a02ff462&response_mode=fragment&response_type=code&x-client-SKU=msal.js.browser&x-client-VER=2.31.0&client_info=1&code_challenge=QyEuVfKIh5NtY1UUuq7TDjxBAQil5x_wBJnKh-gjBDM&code_challenge_method=S256&nonce=516e41ea-9b6e-4e4e-b389-325f32f475ac&state=eyJpZCI6IjczMTEzMTNlLThjN2EtNDIzNS04ODYzLTVhNDkyYjA3MjBiZSIsIm1ldGEiOnsiaW50ZXJhY3Rpb25UeXBlIjoicmVkaXJlY3QifX0%3D");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='signInName']")).sendKeys("UserName");
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Password");
	driver.findElement(By.xpath("//button[@id='next']")).click();
	}

}
// with the help of //* we can identify all the tags