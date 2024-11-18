package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OneMoreBehaviourOfClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
		WebElement closeOpt = driver.findElement(By.xpath("//span[@class='logSprite icClose']"));
		closeOpt.click();
		WebElement studentCheckBox = driver.findElement(By.xpath("//div[text()='Student']"));
		studentCheckBox.click();
		driver.manage().window().minimize();
		driver.quit();
		

	}

}
