package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheTagNameTagText {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		WebElement emailTextField = driver.findElement(By.id("email"));
		String emailTextFieldTagName = emailTextField.getTagName();
		System.out.println(emailTextFieldTagName);
		WebElement forgotPasswordLink = driver.findElement(By.xpath("//a[contains(@href,'https://en-gb.facebook.com/recover/initiate/?privacy')]"));
		String forgotPasswordLinkTagText = forgotPasswordLink.getText();
		String forgotPasswordLinkTagName = forgotPasswordLink.getTagName();
		System.out.println(forgotPasswordLinkTagName + " = " + forgotPasswordLinkTagText);
		driver.manage().window().minimize();
		driver.quit();
	}

}
