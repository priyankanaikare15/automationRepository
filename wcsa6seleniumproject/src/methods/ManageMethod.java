package methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
       WebDriver driver=new ChromeDriver();
        //manage method use to maximize the browser
       driver.manage().window().maximize();
       
       //use manage Method and set the size of browser(SetSize)
       Thread.sleep(3000);
       Dimension targetsize = new Dimension(450,250);
       driver.manage().window().setSize(targetsize);
       driver.close();
	
       //use manage method and change the position of browser(setposition)
       Point targetposition = new Point(650,350);
       driver.manage().window().setPosition(targetposition);;
       
       //full Screen
       driver.manage().window().fullscreen();
       
       
}

}
