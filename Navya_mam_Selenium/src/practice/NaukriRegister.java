package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriRegister {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		
		WebElement registerButton = driver.findElement(By.xpath("//button[text()='Register now']"));
		if (registerButton.isEnabled()) {
			System.out.println("A/c to the method: True === False A/c to your req");
			registerButton.submit();
		}
		else {
			System.out.println("A/c to the method: false === true A/c to your req");
			driver.findElement(By.id("name")).sendKeys("Debadutta");
			driver.findElement(By.id("email")).sendKeys("debadutta2302@gmail.com");
			driver.findElement(By.id("password")).sendKeys("qwerty@1234");
			driver.findElement(By.id("mobile")).sendKeys("7204061358");
			driver.findElement(By.xpath("//h2[text()=\"I'm experienced\"]")).click();
			driver.findElement(By.xpath("//i[@class='ico resman-icon resman-icon-check-box']")).click();
			registerButton.submit();
			
		}
		driver.manage().window().minimize();
		driver.quit();	
			
		}


}
