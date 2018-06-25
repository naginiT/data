package pack1;

//import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HashCode
{
	    public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","F:\\JARFILES1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://cubicitsolution.co.in/project/quikrdeal/");
		/*String sizeF=driver.findElement(By.xpath("//*[@id=\"locpanel1\"]/div[1]/div/center/h6[2]/a[1]")).getCssValue("font-size");
		System.out.println("Font-Size: "+sizeF);
		
		String color=driver.findElement(By.xpath("//*[@id=\"locpanel1\"]/div[1]/div/center/h6[2]/a[1]")).getCssValue("color");
		System.out.println("BeforeColor: "+color.hashCode());
		
		WebElement e=driver.findElement(By.xpath("//*[@id=\"locpanel1\"]/div[1]/div/center/h6[2]/a[1]"));
		Actions a=new Actions(driver);
		a.moveToElement(e).build().perform();
		
		String color1=driver.findElement(By.xpath("//*[@id=\"locpanel1\"]/div[1]/div/center/h6[2]/a[1]")).getCssValue("color");
		System.out.println("AfterColor: "+color1.hashCode());*/
		
		
		
		
		/*String bcolor=driver.findElement(By.xpath("//*[@id=\"locpanel1\"]/div[1]/div/center/h6[2]/a[1]")).getCssValue("background-color");
		System.out.println("Background-Color: "+bcolor);
		
		driver.quit();*/
		WebElement e=driver.findElement(By.xpath("//*[@id='locpanel1']/div[1]/div/center/h6[2]/a[1]"));
		Actions a= new Actions(driver);
		   a.moveToElement(e).build().perform();
		   
		   String colorafter = e.getCssValue("background-color");
		  
		   System.out.println("After color is" +colorafter);
		   
		   String[] aftervalue = colorafter.replace("rgba(", "").replace(")", "").split(",");
		   
		   int aftervalue1=Integer.parseInt(aftervalue[0]);
		   
		   System.out.println(aftervalue1+"aftervalue1");
		   aftervalue[1] = aftervalue[1].trim();
		   System.out.println("Aftervalue1"+aftervalue1);
		   int aftervalue2=Integer.parseInt(aftervalue[1]);
		   aftervalue[2] = aftervalue[2].trim();
		   int aftervalue3=Integer.parseInt(aftervalue[2]);
		   String actualcolor = String.format("#%03x%03x%03x", aftervalue1, aftervalue2, aftervalue3);
		   System.out.println("The actual color afterhover"+actualcolor);
		   driver.close();
	}
	


}
