package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.instagram.com/");
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//span[text()='Contact uploading and non-users']")).click();
		driver.get("https://www.facebook.com/help/instagram/261704639352628");
		List<WebElement> tag = driver.findElements(By.tagName("h2"));
		System.out.println(tag.size());
		for (WebElement heading : tag) {
		    System.out.println(heading.getText());
		}
		System.out.println(tag.size());
		driver.manage().window().minimize();
		driver.quit();

	}

}
