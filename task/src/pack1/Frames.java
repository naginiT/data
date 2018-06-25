package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","E:\\saididdiga\\jarfiels\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
       /* driver.get("https://www.w3schools.com");
       driver.findElement(By.xpath("/html/body/div[7]/div[1]/div[2]/div/a")).click();*/

		driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
		/*List<WebElement totalframe= driver.findElement(By.tagName("iframe"));
		System.out.println("Total Frames:-> " + totalframe.size());*/
		/*driver.switchTo().frame("classFrame");
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody[2]/tr[4]/td[1]")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.switchTo().frame("packageListFrame");
		
		driver.findElement(By.xpath("/html/body/div[2]/ul/li[4]/a")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("/html/body/div/ul/li[1]/a")).click();
}*/
}}