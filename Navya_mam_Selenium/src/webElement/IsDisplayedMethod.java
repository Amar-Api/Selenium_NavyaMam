package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.findElement(By.xpath("//h2[text()=\"I'm experienced\"]")).click();
		WebElement uploadResumeOpt = driver.findElement(By.xpath("//button[text()='Upload Resume']"));
		if (uploadResumeOpt.isDisplayed()) {
			System.out.println("A/c to application true");
		}
		else {
			System.out.println("A/c to application false");
		}
		driver.manage().window().minimize();
		driver.quit();

	}

}
