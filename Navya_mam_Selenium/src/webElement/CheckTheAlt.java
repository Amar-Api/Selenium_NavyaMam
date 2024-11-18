package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckTheAlt {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement grocery = driver.findElement(By.xpath("//img[contains(@src,'https://rukminim2.flixcart.com/flap/96/96/image/29327f')]"));
		String groceryAlt = grocery.getAttribute("alt");
		System.out.println(groceryAlt);
		driver.manage().window().minimize();
		driver.quit();
		
	}

}
