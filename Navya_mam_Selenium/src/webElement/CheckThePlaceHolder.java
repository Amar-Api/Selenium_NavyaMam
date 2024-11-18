package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckThePlaceHolder {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement emailTextField = driver.findElement(By.id("email"));
		String emailTextFieldPlaceholder = emailTextField.getAttribute("placeholder");
		System.out.println(emailTextFieldPlaceholder);
		
		driver.manage().window().minimize();
		driver.quit();

	}

}
