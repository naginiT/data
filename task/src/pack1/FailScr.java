package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FailScr 
{

	public static WebDriver driver;
 @Test
public void captureSS() throws Exception
{
	System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Harsha\\chromedriver.exe");
	 driver = new ChromeDriver();
 
driver.manage().window().maximize();
 
driver.get("http://www.google.com");
 
driver.findElement(By.id("dgkdf")).sendKeys("bkfck");//if you want to execute the code without error comment this line and check it should execute ontestssuccess method
System.out.println("for git");




}
 


}
