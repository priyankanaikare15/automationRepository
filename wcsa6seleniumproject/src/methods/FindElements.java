package methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
  public static void main(String[] args) throws InterruptedException {
         WebDriver driver= new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://google.com");
         Thread.sleep(2000);
         //Switch the control to activeElement.
         driver.switchTo().activeElement().sendKeys("Poha");
         Thread.sleep(5000);
         //identify all the suggestions of poha element
        List<WebElement> PohaSuggetion =driver.findElements(By.xpath("//div[@class='pcTkSc']"));
        
        //Print the list using Looping statements.
        for(int i=0; i<PohaSuggetion.size();i++)
        {
        	/*WebElement element = PohaSuggetion.get(i);
        	String Poha= element.getText();
        	Thread.sleep(2000);
        	System.out.println(Poha);*/
        	
        	System.out.println(PohaSuggetion.get(i).getText());
        	}
        driver.quit();
  }
}
