package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAppLogin {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("singhgaurav0815@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("qwerty1234");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle = "Demo Web Shop";
		if (expectedTitle.equals(actualTitle)) {
			System.out.println("Pass");
			
		}
		else {
			System.out.println("Fail");
		}

		driver.manage().window().minimize();
		driver.quit();
		

	}

}
