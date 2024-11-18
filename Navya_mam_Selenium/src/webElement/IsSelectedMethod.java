package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://services.ecourts.gov.in/ecourtindia_v6/?p=casestatus/index&app_token=f7cf112a0aa19b160d93ea8df58ae038cd6dcff2106817cf2b979a742af48668");
		WebElement disposedButton = driver.findElement(By.xpath("//label[text()='Disposed']/..//input[@id='radD']"));
		WebElement bothButton = driver.findElement(By.xpath("//label[text()='Both']/..//input[@id='radB']"));
		if (disposedButton.isSelected()) {
			System.out.println("Disposed is selected");
			
		}
		else {
			System.out.println("Disposed is not selected");
			disposedButton.click();
			
		}
		if (bothButton.isSelected()) {
			System.out.println("Both is selected");
			
		}
		else {
			System.out.println("Both is not selected");
			disposedButton.click();
			
		}
		driver.manage().window().minimize();
		driver.quit();

	}

}
