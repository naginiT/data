package pack1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Download2 {

	public static void main(String[] args) throws Exception
	{
		
			Robot robot = new Robot();
			System.setProperty("webdriver.chrome.driver","E:\\saididdiga\\jarfiels\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://www.pexels.com/search/nature/");
		    robot.setAutoDelay(2000);
		    robot.mouseMove(450, 480);
		    robot.mousePress(InputEvent.BUTTON3_MASK);
		    robot.mouseRelease(InputEvent.BUTTON3_MASK);
		    
		    robot.mouseMove(480,350);
		    
		    robot.mousePress(InputEvent.BUTTON1_MASK);
		    robot.mouseRelease(InputEvent.BUTTON1_MASK);
		    
		   // robot.mouseMove(480,650);
		    
		    robot.keyPress(KeyEvent.VK_ENTER);
		    
		    
		    driver.close();
		    
		    
		    
		

	}

}
