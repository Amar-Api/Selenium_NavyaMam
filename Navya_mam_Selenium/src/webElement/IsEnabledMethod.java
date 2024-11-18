package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sandbox.abdm.gov.in/applications/cowin/Home/cowin_signup_form");
		WebElement submitOption = driver.findElement(By.name("submit"));
		if (submitOption.isEnabled()) {
			submitOption.click();
			System.out.println("A/c to the method: True === False A/c to your req");
		}
		else {
			driver.findElement(By.xpath("//button[text()='Accept Terms of Service']")).click();
			Thread.sleep(5000);
			driver.findElement(By.id("confbtn")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[text()='Close']")).click();
			Thread.sleep(5000);
			submitOption.click();
			System.out.println("A/c to the method: False === True A/c to your req");
			
		}
		driver.manage().window().minimize();
		driver.quit();
	}

}
