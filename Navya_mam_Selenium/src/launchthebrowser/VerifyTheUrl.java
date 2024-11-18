package launchthebrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheUrl {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize(); //to maximize the window
		//System.out.println(driver.manage().window().getSize());
		//driver.manage().window().getSize();
		driver.getWindowHandle();
		driver.get("https://www.instagram.com/");
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.instagram.com/";
		String actualTitle = driver.getTitle();
		String expectedTitle = "Instagram";
		if(actualUrl.equals(expectedUrl) && actualTitle.equals(expectedTitle))
		{
			System.out.println("Comrrect");
		}
		else
		{
			System.out.println("Incorrect");
		}
		
	}

}
