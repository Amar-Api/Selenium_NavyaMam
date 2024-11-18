package launchthebrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class forLoopWindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dassault-aviation.com/en/");
		for(int i=1; i<=4; i++)
		{
			driver.switchTo().newWindow(WindowType.WINDOW);
			switch(i) {
	 		case 1:driver.get("https://www.dassault-aviation.com/en/group/");
	 		break;
	 		case 2:driver.get("https://www.dassault-aviation.com/en/defense/");
	 		break;
	 		case 3:driver.get("https://www.dassault-aviation.com/en/civil/");
	 		break;
	 		case 4:driver.get("https://www.dassault-aviation.com/en/space/");
	 		break;
		 			 		
		 	}
		}

	}

}
