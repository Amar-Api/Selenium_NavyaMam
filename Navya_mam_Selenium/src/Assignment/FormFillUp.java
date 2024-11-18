package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormFillUp {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://indianfrro.gov.in/frro/FormC/accom_reg.jsp?t4g=WR018P20");
		WebElement userId = driver.findElement(By.id("u_id"));
		userId.sendKeys("Deba7008");
		WebElement password = driver.findElement(By.id("u_pwd"));
		password.sendKeys("Deba7008");
		WebElement confirmPassword = driver.findElement(By.id("u_repwd"));
		confirmPassword.sendKeys("Deba7008");
		WebElement yourAnswer = driver.findElement(By.id("u_secans"));
		yourAnswer.sendKeys("Answer");
		WebElement uName = driver.findElement(By.id("u_name"));
		uName.sendKeys("Debadutta");
		WebElement designation = driver.findElement(By.id("u_designation"));
		designation.sendKeys("CEO");
		WebElement emailID = driver.findElement(By.id("u_emailid"));
		emailID.sendKeys("debadutta2302@gmail.com");
		WebElement mobile = driver.findElement(By.id("u_mobile"));
		mobile.sendKeys("7008555960");
		WebElement phone = driver.findElement(By.id("u_phone"));
		phone.sendKeys("7204061358");
		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("Debadutta");
		WebElement capacity = driver.findElement(By.id("capacity"));
		capacity.sendKeys("20");
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("Bangalore");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("debadutta2302@gmail.com");
		WebElement mContact = driver.findElement(By.id("mcontact"));
		mContact.sendKeys("7008555960");
		WebElement contact = driver.findElement(By.id("contact"));
		contact.sendKeys("7204061358");
		WebElement nameLast = driver.findElement(By.name("name_o"));
		nameLast.sendKeys("Debadutta");
		WebElement addressLast = driver.findElement(By.name("address_o"));
		addressLast.sendKeys("Bangalore");
		WebElement emailId = driver.findElement(By.name("emailid_o"));
		emailId.sendKeys("debadutta2302@gmail.com");
		WebElement phoneNumber = driver.findElement(By.name("phoneno_o"));
		phoneNumber.sendKeys("7008555960");
		WebElement mobileNumber = driver.findElement(By.name("mobile_o"));
		mobileNumber.sendKeys("7204061358");
		driver.manage().window().minimize();
		driver.quit();
	}

}
