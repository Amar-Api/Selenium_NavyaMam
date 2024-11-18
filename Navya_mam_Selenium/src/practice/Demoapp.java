package practice;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoapp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demoapp.skillrary.com/");
		driver.findElement(By.partialLinkText("SIGNUP")).click();
		String currentPageUrl = driver.getCurrentUrl();
		String actualUrl = "https://demoapp.skillrary.com/login.php?type=register";
		if (currentPageUrl.equals(actualUrl)) {
			
			System.out.println("This is the sign up page");
			
		}
		else {
			System.out.println("This is not the sign up page");
		}
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("Debadutta");
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("Choudhury");
		
		WebElement emailTextField = driver.findElement(By.xpath("//input[@type='email']"));
		emailTextField.sendKeys("choudhurydebadutta2302@gmail.com");
		WebElement passwordTextField = driver.findElement(By.xpath("//div/div/input[@name='password']"));
		passwordTextField.sendKeys("Pass@11234");
		WebElement confirmPass = driver.findElement(By.xpath("//input[@name='repassword']"));
		confirmPass.sendKeys("Pass@11234");
		driver.findElement(By.name("signup")).submit();
		driver.navigate().back();
		Thread.sleep(10000);
		

	}

}
