package launchthebrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrePostCondition {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//Pre condition - maximize the window
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		//ful screen the window
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		//Post condition - minimize the window
		driver.manage().window().minimize();
		

	}

}
