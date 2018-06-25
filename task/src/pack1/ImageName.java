package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ImageName {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\saididdiga\\jarfiels\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://cubicitsolution.co.in/index.php/welcome");
		
    /* WebElement title=  driver.findElement(By.xpath("//*[@id=\"sb-slider\"]/li[1]/a/img"));
		//WebElement title=  driver.findElement(By.tagName("img"));
		System.out.println(title.getText());
		driver.quit();
      */
      //System.out.println(title.getAttribute("title"));
		//String path=title.getAttribute("src");
      /*String s=e.getAttribute("s");
		String [] src=s.split("");*/
		/*String toolTipText=driver.findElement(By.xpath("//*[@id=\"sb-slider\"]/li[1]/div/h3")).getAttribute("h3");
		System.out.println(toolTipText);
*/
		/*List<WebElement> e=driver.findElement(By.xpath("/html/body"));
		
		System.out.println();*/
		
		/*WebElement ele=driver.findElement(By.xpath("//*[@id=\"sb-slider\"]/li[1]/a/img"));
		Actions a=new Actions(driver);
		WebElement e1=driver.findElement(By.xpath("//*[@id=\"sb-slider\"]/li[1]/div/h3"));
		a.moveToElement(e1).build().perform();
		System.out.println(e1.getText());
*/		
		
		
		
		/*WebElement ele=driver.findElement(By.xpath("//*[@id=\"sb-slider\"]/li[1]/a/img"));
		System.out.println("get the instance");
		String Test=ele.getAttribute("src");
		//System.out.println("Element : " + Test);

		System.out.println(ele.getText());*/
		
		List<WebElement> listimage = driver.findElements(By.xpath("//div[@class='sb-description']/h3"));
		System.out.println("No of Image is " + listimage.size());
			
			for(int i=0;i<listimage.size();i++)
		     {
		     	WebElement ele=listimage.get(i);
		     	String s=ele.getAttribute("outerText");
		     	System.out.println(s);
		     }
		                                      	
		
	}

}
   