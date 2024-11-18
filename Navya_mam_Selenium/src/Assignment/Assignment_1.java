package Assignment;

import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dassault-aviation.com/en/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.dassault-aviation.com/en/group/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.dassault-aviation.com/en/defense/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.dassault-aviation.com/en/civil/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.dassault-aviation.com/en/space/");
		Set<String> allWid = driver.getWindowHandles();
		for(String wid : allWid)
		{
			String widTitle = driver.switchTo().window(wid).getTitle();
			System.out.println(widTitle);
			if(widTitle.equals("News and information on the Dassault Aviation Group"))
			{
				System.out.println("1st Window");
			}
			else if(widTitle.equals("Defense - Dassault Aviation"))
			{
				System.out.println("2nd Window");
				int xAxis = driver.manage().window().getPosition().getX();
				System.out.println("The X axis is = " + xAxis);
				int yAxis = driver.manage().window().getPosition().getY();
				System.out.println("The Y axis is = " + yAxis);
			}
			else if(widTitle.equals("Civil: All Falcon business jets, in service throughout the world."))
			{
				System.out.println("3rd Window");
				int windowHeight = driver.manage().window().getSize().getHeight();
				System.out.println("The window height is = " + windowHeight);
				int windowWidth = driver.manage().window().getSize().getWidth();
				System.out.println("The window width is = " + windowWidth);
			}
			else if (widTitle.equals("Space - Dassault Aviation"))
			{
				System.out.println("4th Window");
				Dimension definedsize = new Dimension(800, 900);
				driver.manage().window().setSize(definedsize);
				Point definedPosition = new Point(180, 170);
				driver.manage().window().setPosition(definedPosition);
			}
		}

	}


}
