package grommingsession;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.PublicApi;

public class ReusableMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/14");
		Thread.sleep(60000);
		driver.findElement(By.id("compare")).click();
		String parentWindowId = driver.getWindowHandle();
		System.out.println("Parent Window Id =" + parentWindowId);
		Set<String> allWindowIds = driver.getWindowHandles();
		System.out.println("All windows id = " + allWindowIds);
		for(String wid : allWindowIds)	
		{
			driver.switchTo().window(wid);
			String actualUrl = driver.getCurrentUrl();
			if(actualUrl.contains("ebay"))
			{
				break;
			}
			
		}
		//SwitchToWindow(driver,"String");
		
		driver.manage().window().maximize();
		String actualUrl = driver.getCurrentUrl();
		System.out.println(actualUrl);
		Thread.sleep(20000);
		driver.switchTo().window(parentWindowId);
		String actuaUrl = driver.getCurrentUrl();
		System.out.println(actuaUrl);
		
		for(String wid : allWindowIds)
		{
			driver.switchTo().window(wid);
			String acturl = driver.getCurrentUrl();
			if(acturl.equals("https://www.flipkart.com/"))
			{
				break;				
			}
			
		}
		driver.manage().window().maximize();
		String actuUrl = driver.getCurrentUrl();
		System.out.println(actuUrl);
		driver.close();
	}
	
	
}
