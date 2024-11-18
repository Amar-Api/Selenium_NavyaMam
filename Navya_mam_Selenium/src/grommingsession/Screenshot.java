package grommingsession;

import java.io.File;
import java.util.List;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(20000);
		driver.findElement(By.id("loginBtn")).click();
		TakesScreenshot a = (TakesScreenshot)driver;
		 File temp = a.getScreenshotAs(OutputType.FILE);
		 File dest = new File("Pictures");
		// FileHandler.copy(temp,dest);
		driver.findElement(By.id("Email")).sendKeys("debadutta2302@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Password@123");
		driver.findElement(By.id("Login")).click();
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		int count = allLinks.size();
		System.out.println(count);
		
	}

}
