package ScenarioBaseScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Scenario3 {
	public static void main(String[] args) {
	WebDriver	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://jqueryui.com/droppable/");
	WebElement source = driver.findElement(By.id("draggable"));
	
	WebElement target = driver.findElement(By.id("droppable"));
	
	Actions act = new Actions(driver);
	act.dragAndDrop(source, target).perform();
	
	
	
	
	}

}
