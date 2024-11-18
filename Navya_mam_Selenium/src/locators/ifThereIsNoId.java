package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ifThereIsNoId {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup/");
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("Debadutta");
		Thread.sleep(2000);
		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.sendKeys("Choudhury");
		Thread.sleep(2000);
		WebElement phoneNumber = driver.findElement(By.name("reg_email__"));
		phoneNumber.sendKeys("123456y789");
		Thread.sleep(2000);
		WebElement newPassword = driver.findElement(By.id("password_step_input"));
		newPassword.sendKeys("Deba@1234");
		driver.manage().window().minimize();
		driver.quit();

	}

}



//flie-----new--------other-----search for maven-----click on maven project---------next-------next(new maven project window)------ maven-archetype-quickstart(filter)-----------com.github.ywchang(1.1)------next--------------- FrameWork(GroupId,ArtifactId)-------finish------   (Y: :)Y-------enter (Build Success)
//
//src/test/java
//double click on pom.xml
//line no 22 to line no 33 delete(dependency to dependency)------ctrl+s
//
//go to chrome------mvnrepository------maven repository----search browse and explore--------enter selenium---click on search------click on selenium java(Bold)-----click on 4.18.1------one click on dependency-----copy the dependency--------
//
//go to eclipse ---------- paste between dependencies------save(ctrl+s) 
//
//framework-------delete the default project
//
//
//right click on the project-------click on maven---------click on update project----force update of snapshot -------select the check box------click on ok
