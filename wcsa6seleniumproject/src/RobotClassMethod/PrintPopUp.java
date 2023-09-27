package RobotClassMethod;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintPopUp {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.selenium.dev/");
	Thread.sleep(2000);
	//Press Ctr+P to generate Print popup
	Robot robot = new Robot();
	//Press ctr key
	robot.keyPress(KeyEvent.VK_CONTROL);
	//Press P key
	robot.keyPress(KeyEvent.VK_P);
	//Release ctr Button
	robot.keyRelease(KeyEvent.VK_CONTROL);
	//Release P Key
	robot.keyRelease(KeyEvent.VK_P);
	Thread.sleep(2000);
	//Switch the control to cancel Button
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	Thread.sleep(2000);
	//Press Enter Key
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	
	
	
	
	
	
	}

}
