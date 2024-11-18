package launchthebrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TriggerTheUrl {

	public static void main(String[] args) {
		//launch the browser
		WebDriver driver = new ChromeDriver();
		//trigger the url--main url of an app
		driver.get("https://www.selenium.dev/");
		//invalidArgumentException--sel--run--unchecked
		driver.get("facebook.com/signup"); 
	}

}
