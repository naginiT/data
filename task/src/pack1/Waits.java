package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waits {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\saididdiga\\jarfiels\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.google.com/");
	    driver.findElement(By.id("lst-ib")).sendKeys("Execute automation");
	    driver.findElement(By.xpath("//*[@id=\"rso\"]/div/div/div[1]/div/div/h3/a")).click();
	    
		

	}

}
