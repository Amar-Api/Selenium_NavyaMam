package launchthebrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.dassault-aviation.com/en/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.dassault-aviation.com/en/civil/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.dassault-aviation.com/en/defense/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.dassault-aviation.com/en/space/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.dassault-aviation.com/en/passion/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.dassault-aviation.com/en/group/");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		driver.navigate().to("https://www.dassault-aviation.com/en/passion/");
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		
	}

}
