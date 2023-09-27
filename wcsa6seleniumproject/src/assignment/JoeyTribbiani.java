package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class JoeyTribbiani {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/search?q=joey+tribbiani+%F0%9F%8D%95&rlz=1C1OPNX_en__1044__1044&sxsrf=AB5stBh6mI2IlADBNRu4fRw3oJRmLwi-bA%3A1689745216483&ei=QHe3ZNqFHY3V4-EPwNekgAE&oq=joey+tribbiani&gs_lp=Egxnd3Mtd2l6LXNlcnAiDmpvZXkgdHJpYmJpYW5pKgIIBTIHEC4YigUYJzIQEAAYgAQYFBiHAhixAxiDATIFEC4YgAQyBRAAGIAEMgUQABiABDIFEAAYgAQyBRAAGIAEMgUQABiABDIFEAAYgAQyBRAAGIAESPcrUMoFWO0TcAF4AZABAJgBkAGgAacHqgEDMC43uAEByAEA-AEBwgIKEAAYRxjWBBiwA8ICChAAGIoFGLADGEPCAg4QABjkAhjWBBiwA9gBAcICEBAuGIoFGMgDGLADGEPYAQLCAgYQABgWGB7CAggQABiKBRiGA8ICFBAuGIoFGJcFGNwEGN4EGOAE2AEDwgIKEAAYgAQYFBiHAsICFBAuGIAEGJcFGNwEGN4EGN8E2AED4gMEGAAgQYgGAZAGE7oGBggBEAEYCboGBggCEAEYCLoGBggDEAEYFA&sclient=gws-wiz-serp#cobssid=s");
		Thread.sleep(2000);
		driver.findElement(By.className("lNPNe")).click();
		Thread.sleep(4000);
		driver.close();
	}

}
