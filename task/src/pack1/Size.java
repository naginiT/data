package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Size 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\saididdiga\\jarfiels\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.ilovepdf.com/word_to_pdf");
	    WebElement e =driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/ul/li[1]/a"));
	    System.out.println(e.getSize());
       
		
	}

}
