package webElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhiBus {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		driver.get("https://www.abhibus.com/");
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("search-button")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[text()='Bus Partner']")).click();
		
	}

}
