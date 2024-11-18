package launchthebrowser;

import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlayWithWindows {

	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//To open a new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		//To open a new tab
		//driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/signup/");
		Set<String> allwid = driver.getWindowHandles();
		System.out.println(allwid);
		//to get how many windows
		System.out.println(allwid.size());
		for(String wid : allwid)
		{
			String widTitle = driver.switchTo().window(wid).getTitle();
			System.out.println(widTitle);
			if(widTitle.equals("Facebook – log in or sign up"))
			{
				System.out.println("Parent Window");
			}
			else if(widTitle.equals("Sign up for Facebook"))
			{
				System.out.println("Child Window");
				int childWindowHeight = driver.manage().window().getSize().getHeight();
				System.out.println("Child window height = " + childWindowHeight);
				int childWindowWidth = driver.manage().window().getSize().getWidth();
				System.out.println("Child window width = "+childWindowWidth);
				int childWindowXAxis = driver.manage().window().getPosition().getX();
				System.out.println("Child windox x axis = " + childWindowXAxis);
				int childWindowYAxis = driver.manage().window().getPosition().getY();
				System.out.println("Child window y axis = "+ childWindowYAxis);
				Dimension size = driver.manage().window().getSize();
				System.out.println(size);
				Dimension definedsize = new Dimension(800, 900);
				driver.manage().window().setSize(definedsize);
				Point definedPosition = new Point(180, 170);
				driver.manage().window().setPosition(definedPosition);
			}
		}
		
	}

	

}
