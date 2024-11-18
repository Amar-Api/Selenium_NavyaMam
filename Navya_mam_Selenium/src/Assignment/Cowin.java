package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cowin {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sandbox.abdm.gov.in/applications/cowin/Home/cowin_signup_form");
		
		
		WebElement mobileTextField = driver.findElement(By.xpath("//input[@name='mobile']"));
		int mobileTextFieldHeight = mobileTextField.getSize().getHeight();
		int mobileTextFieldWidth = mobileTextField.getSize().getWidth();
		
		System.out.println("Mobile Text Field Height = " + mobileTextFieldHeight );
		System.out.println("Mobile Text Field Weight = " + mobileTextFieldWidth);
		System.out.println();
		
		
		WebElement emailTextField = driver.findElement(By.xpath("//input[@name='email']"));
		int emailTextFieldHeight = emailTextField.getSize().getHeight();
		int emailTextFieldWidth = emailTextField.getSize().getWidth();
		
		System.out.println("Email Text Field Height = " +  emailTextFieldHeight);
		System.out.println("Email Text Field Width = " +  emailTextFieldWidth);
		System.out.println();


		if (emailTextFieldWidth == mobileTextFieldWidth && emailTextFieldHeight == mobileTextFieldHeight) {
			System.out.println("Pass : email & mobile alignment is correct");
		}
		else {
			System.out.println("Fail : email & mobile alignment is incorrect");	
		}
		System.out.println();
		
		WebElement userNameTextField = driver.findElement(By.xpath("//input[@name='uname']"));
		
		int userNameEndpoint = userNameTextField.getRect().getWidth();
		int userNameStartPoint = userNameTextField.getRect().getX();
		int userNameRightAlignment = userNameStartPoint + userNameEndpoint;
		int mobileNumberStartPoint = mobileTextField.getRect().getX();
		int mobileNumberEndPoint = mobileTextField.getRect().getWidth();
		int mobileNumberRightAlignment = mobileNumberStartPoint+mobileNumberEndPoint;
		System.out.println("Mobile Start Point = " + mobileNumberStartPoint );
		System.out.println("Mobile End Point = " + mobileNumberEndPoint);
		
		System.out.println();
		
		System.out.println("UserName Start Point = " + userNameStartPoint );
		System.out.println("Username End Point = " + userNameEndpoint);
		System.out.println();
		
		if (mobileNumberRightAlignment == userNameRightAlignment) {
			System.out.println("Pass : userName & mobile alignment is correct");
			
		}
		else {
			System.out.println("Fail : userName & mobile alignment is incorrect");

		}
		
		driver.manage().window().minimize();
		driver.quit();
	}

}
