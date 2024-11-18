package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CowinRadioButton {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sandbox.abdm.gov.in/applications/cowin/Home/cowin_signup_form");
		
		WebElement publicAPI = driver.findElement(By.id("flexRadioDefault1"));
		WebElement privateAPI = driver.findElement(By.xpath("//input[@value='Private API']"));
		WebElement protectedAPI = driver.findElement(By.xpath("//input[@value='Protected API']"));
		Thread.sleep(5000);
		if (publicAPI.isSelected()) {
			System.out.println("publicAPI is enabled by default");
		}
		else {
			publicAPI.click();
			System.out.println("publicAPI is selected");
			System.out.println();
		}
		Thread.sleep(5000);
		if (privateAPI.isSelected()) {
			System.out.println("publicAPIWithoutRateLimit is enabled by default");

		}
		else {
			privateAPI.click();
			System.out.println("publicAPIWithoutRateLimit is selected");
			System.out.println();
		}
		Thread.sleep(5000);
		if (protectedAPI.isSelected()) {
			System.out.println("protectedAPI is enabled by default");

		}
		else {
			protectedAPI.click();
			System.out.println("protectedAPI is selected");
			System.out.println();
		}
		driver.findElement(By.name("organization_name")).sendKeys("qwerty");
		driver.findElement(By.id("doc_num")).sendKeys("1234567890");
		
		driver.findElement(By.xpath("//button[text()='Accept Terms of Service']")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("confbtn")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Close']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(5000);
		driver.manage().window().minimize();
		driver.quit();
	}

}
