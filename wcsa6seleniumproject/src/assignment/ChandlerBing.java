package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChandlerBing {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/search?q=chandler+bing&rlz=1C1OPNX_en__1044__1044&sxsrf=AB5stBh_9aRTS0cof4y0hN8_LpzLbaqfKQ%3A1689745245984&ei=XXe3ZMO3O-X04-EP1cWzgAw&oq=candler+b&gs_lp=Egxnd3Mtd2l6LXNlcnAiCWNhbmRsZXIgYioCCAAyDRAAGIAEGLEDGIMBGAoyDRAuGIAEGLEDGIMBGAoyBxAAGIAEGAoyChAAGIAEGLEDGAoyBxAAGIAEGAoyBxAAGIAEGAoyBxAAGIAEGAoyBxAAGIAEGAoyBxAAGIAEGAoyBxAAGIAEGApIyuICUN8BWKDIAnADeAGQAQSYAfYBoAGbFqoBBjAuMTUuMrgBAcgBAPgBAagCFMICChAAGEcY1gQYsAPCAggQABiKBRiRAsICBRAuGIAEwgIFEAAYgATCAgcQIxjqAhgnwgIHEC4Y6gIYJ8ICDRAuGMcBGNEDGOoCGCfCAhYQABgDGI8BGOoCGLQCGIwDGOUC2AEBwgIWEC4YAxiPARjqAhi0AhiMAxjlAtgBAcICBxAjGIoFGCfCAgcQABiKBRhDwgIHEC4YigUYQ8ICCxAAGIAEGLEDGIMBwgILEAAYigUYsQMYgwHCAgQQIxgnwgIIEC4YigUYkQLCAg0QLhiKBRixAxiDARhDwgIREC4YgAQYsQMYgwEYxwEY0QPCAgsQLhixAxiKBRiRAsICChAuGIoFGLEDGEPCAg0QLhiABBgUGIcCGLEDwgIIEAAYgAQYsQPCAhoQLhixAxiKBRiRAhiXBRjcBBjeBBjfBNgBAsICDhAuGIoFGLEDGIMBGJECwgIQEAAYgAQYsQMYgwEYsQMYCsICChAAGIoFGLEDGEPCAggQABiABBjJA8ICCxAuGIAEGMcBGK8BwgIKEC4YgAQYsQMYCuIDBBgAIEGIBgGQBgi6BgYIARABGAu6BgYIAhABGBQ&sclient=gws-wiz-serp");
		Thread.sleep(2000);
		driver.findElement(By.className("lNPNe")).click();
		Thread.sleep(5000);
		driver.close();
	}

}