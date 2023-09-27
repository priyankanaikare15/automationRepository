package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPrimeLoginPage {
     public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Feu.primevideo.com%2Fauth%2Freturn%2Fref%3Dav_auth_ap%3F_t%3Dsg4LNdnkdAS1AwO-CdRTUE5MYebkL0ERFDQhhl_gO_KprAAAAAQAAAABktkHfcmF3AAAAAPgWC9WfHH8iB-olH_E9xQ%26location%3D%2Fhelp%3Fref_%253Datv_nb_lcl_en_US%2526ie%253DUTF8&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&accountStatusPolicy=P1&openid.assoc_handle=amzn_prime_video_sso_in&openid.mode=checkid_setup&siteState=259-2400887-8384321&language=en_US&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		Thread.sleep(2000);
		//identify email or phone text field
		driver.findElement(By.id("ap_email")).sendKeys("9876543210");
		Thread.sleep(1000);
		//identify password text field
		driver.findElement(By.id("ap_password")).sendKeys("ab@12");
		//identify sign in button
		driver.findElement(By.id("signInSubmit")).click();
		
		
		
	}
}
