package cssInfoTech;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenShotOfWebpage {
	public static void main(String[] args) throws IOException {
		getScreenshotOfWebpage();
	}

	public static void getScreenshotOfWebpage() throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.getcalley.com/page-sitemap.xml");		
		driver.findElement(By.partialLinkText("https://www.getcalley.com/")).click();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		String time = LocalDateTime.now().toString().replace(":", "-");
		File dest = new File("./Screenshot/File.png");
		Files.copy(temp, dest);
		driver.manage().window().minimize();
		driver.close();
		
	}

}
