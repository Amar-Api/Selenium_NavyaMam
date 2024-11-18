package launchthebrowser;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrlClass {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.dassault-aviation.com/en/");
		Thread.sleep(2000);
		URL mainUrl = new URL("https://www.dassault-aviation.com/en/");
		driver.navigate().to(mainUrl);
		Thread.sleep(2000);
		URL defenceUrl = new URL(mainUrl, "defense/");
		driver.navigate().to(defenceUrl);
		Thread.sleep(2000);
		URL groupUrl = new URL(mainUrl, "group/");
		driver.navigate().to(groupUrl);
		Thread.sleep(2000);
		URL civilUrl = new URL(mainUrl, "civil/");
		driver.navigate().to(civilUrl);
		Thread.sleep(2000);
		URL spaceUrl = new URL(mainUrl, "space/");
		driver.navigate().to(spaceUrl);
		Thread.sleep(2000);
		URL passionUrl = new URL(mainUrl, "passion/");
		driver.navigate().to(passionUrl);
		Thread.sleep(2000);
		driver.manage().window().minimize();
	
	}

}
