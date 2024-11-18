package locators;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class DemoWebshop {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\debad\\eclipse-workspace\\Automation\\Screenshotscreeenshot.png");
		Files.copy(temp, dest);
		

//		driver.findElement(By.linkText("Log in")).click();
//		driver.findElement(By.id("Email")).sendKeys("debadutta2302@gmail.com");
//		driver.findElement(By.id("Password")).sendKeys("Deba@1204");
//		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

}
