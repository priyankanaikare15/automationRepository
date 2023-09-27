package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    public class XpathText 
    {
	 public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver .manage().window().maximize();
		driver.get("https://www.flipkart.com/search?q=laptop&sid=6bo%2Cb5g&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_1_3_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_1_3_na_na_na&as-pos=1&as-type=RECENT&suggestionId=laptop%7CLaptops&requestId=6a659887-c21a-4b1d-b737-35d57f294486&as-searchtext=laptop");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[text()='Primebook 4G Android Based MediaTek MT8788 - (4 GB/64 GB EMMC Storage/Prime OS) 4G Thin and Light Lapt...']")).click();
	    //driver.findElement(By.xpath(""))
	    driver.close();
	}

}
