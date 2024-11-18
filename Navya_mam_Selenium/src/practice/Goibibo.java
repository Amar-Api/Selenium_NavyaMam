package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goibibo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.xpath("//span[@role='presentation']")).click();
		Thread.sleep(5000);
		WebElement oneWay = driver.findElement(By.xpath("//p[text()='One-way']/.."));
		WebElement roundTrip = driver.findElement(By.xpath("//p[text()='Round-trip']/.."));
		WebElement multiCity = driver.findElement(By.xpath("//p[text()='Multi-city']/.."));
		if (oneWay.isSelected()) {
			System.out.println("A/c to the method: True === False A/c to your req");

			System.out.println("One Way is enabled");
			
		}
		else {
			System.out.println("A/c to the method: false === true A/c to your req");
			oneWay.click();
		}
		if (multiCity.isSelected()) {
			System.out.println("A/c to the method: True === False A/c to your req");

			System.out.println("Multi City is enabled");
			
		}
		else {
			System.out.println("A/c to the method: false === true A/c to your req");
			multiCity.click();
		}
		if (roundTrip.isSelected()) {
			System.out.println("A/c to the method: True === False A/c to your req");

			System.out.println("Round Trip is enabled");
			
		}
		else {
			System.out.println("A/c to the method: false === true A/c to your req");
			roundTrip.click();
		}
		
		
			WebElement studentCheckbox = driver.findElement(By.xpath("//div[text()='Student']/../../.."));
			WebElement seniorCitizenCheckbox = driver.findElement(By.xpath("//div[text()='Senior Citizen']/../../.."));
			WebElement armedForcesCheckbox = driver.findElement(By.xpath("//div[text()='Armed Forces']/../../.."));
			WebElement doctorsNursesCheckbox = driver.findElement(By.xpath("//div[text()='Doctors & Nurses']/../../.."));
			if (studentCheckbox.isSelected()) {
				studentCheckbox.click();
			}
			else {
				studentCheckbox.click();

			}
			if (seniorCitizenCheckbox.isSelected()) {
				seniorCitizenCheckbox.click();
			}
			else {
				seniorCitizenCheckbox.click();

			}
			if (armedForcesCheckbox.isSelected()) {
				armedForcesCheckbox.click();
			}
			else {
				armedForcesCheckbox.click();
				
			}
			if (doctorsNursesCheckbox.isSelected()) {
				doctorsNursesCheckbox.click();
				
			}
			else {
				doctorsNursesCheckbox.click();

			}
			Thread.sleep(10000);
			driver.manage().window().minimize();
			driver.quit();
	}
	

}
