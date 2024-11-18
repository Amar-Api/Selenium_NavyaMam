package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WrongUsageOfSubmit {
	//UnsupportedOperationException---java lib-----lang package---------unchecked exception
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shop-global.malaicha.com/login");
		WebElement register = driver.findElement(By.xpath("//button[text()='Register']"));
		register.submit();
	}

}
