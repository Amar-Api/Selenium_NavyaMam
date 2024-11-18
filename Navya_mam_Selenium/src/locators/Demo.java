package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//----------identify the email-------
		WebElement emailTextField = driver.findElement(By.id("email"));
		emailTextField.sendKeys("7008555960");
		WebElement passwordTextField = driver.findElement(By.id("pass"));
		passwordTextField.sendKeys("Iamaspecialperson#098");
		WebElement loginButton = driver.findElement(By.name("login"));
		passwordTextField.clear();
		loginButton.submit();
		
		
	}

}
