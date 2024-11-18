package webElement;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckTheTextFieldisEmpty {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement usernameTextfield = driver.findElement(By.id("username"));
		String usernameTextfieldisEmpty = usernameTextfield.getAttribute("value");
		if(usernameTextfieldisEmpty.isEmpty())
		{
			usernameTextfield.sendKeys("abcdefgh");
		}
		else
		{
			usernameTextfield.sendKeys(Keys.CONTROL + "a");
			usernameTextfield.sendKeys(Keys.DELETE);
			usernameTextfield.sendKeys(Keys.chord("1234567890"));
		}
		Thread.sleep(10000);
		driver.manage().window().minimize();
		driver.quit();

	}


}
