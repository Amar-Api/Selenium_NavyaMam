package practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("Iphone 15 pro max",Keys.ENTER);
		
		String homePage = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//div[text()='Apple iPhone 15 Pro Max (Natural Titanium, 512 GB)']")).click();
		
		Set<String> allPage = driver.getWindowHandles();
		for (String page : allPage) {
			if(!page.equals(homePage)) {
				driver.switchTo().window(page);
				break;
			}
		}
	}

}
