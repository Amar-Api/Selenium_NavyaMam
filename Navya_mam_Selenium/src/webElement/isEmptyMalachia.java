package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEmptyMalachia {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shop-global.malaicha.com/login");
		WebElement UserNameTextField = driver.findElement(By.name("username"));
		String UserNameTextFieldValue = UserNameTextField.getAttribute("value");
		if(UserNameTextFieldValue.isEmpty())
		{
			UserNameTextField.sendKeys("abcdefghijklmnop");
		}
		else
		{
			UserNameTextField.sendKeys(Keys.CONTROL + "a");
			UserNameTextField.sendKeys(Keys.DELETE);
			UserNameTextField.sendKeys(Keys.chord("1234567890"));
		}
		WebElement PasswordTextField = driver.findElement(By.name("pin"));
		String PasswordTextFieldValue = PasswordTextField.getAttribute("value");
		if(PasswordTextFieldValue.isEmpty())
		{
			PasswordTextField.sendKeys("Password@123");
		}
		else
		{
			PasswordTextField.sendKeys(Keys.CONTROL + "a");
			PasswordTextField.sendKeys(Keys.DELETE);
			PasswordTextField.sendKeys(Keys.chord("password@123"));
		}
		Thread.sleep(10000);
		driver.manage().window().minimize();
		driver.quit();
	}

}
