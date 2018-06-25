package pack1;

import java.awt.Image;
import java.awt.image.RenderedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.natives.OCR;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import com.asprise.util.ocr.OCR;
public class ImageText 
{
	WebDriver driver;  
	   
	 @BeforeTest  
	  public void setUpDriver() {  
	   driver = new ChromeDriver();  
	  }  
	   
	 @Test  
	 public void start() throws IOException{  
	    
	 driver.get("http://www.automationace.com/2014/04/extract-and-verify-text-from-images-using-selenium-webdriver.html");  
	 String imageUrl=driver.findElement(By.xpath("//*[@id='post-body-6308533711630672689']/div[1]/div/a/img")).getAttribute("src");  
	 System.out.println("Image source path : \n"+ imageUrl);  
	  
	 URL url = new URL(imageUrl);  
	 Image image = ImageIO.read(url);  
	 //String s = ((Object) new OCR()).recognizeCharacters((RenderedImage) image);  
	 //String s = new OCR().recognizeCharacters((RenderedImage) image);  
	// System.out.println("Text From Image : \n"+ s);  
	// System.out.println("Length of total text : \n"+ s.length());  
	 driver.quit();  
	      
	 /* Use below code If you want to read image location from your hard disk     
	      
	   BufferedImage image = ImageIO.read(new File("Image location"));     
	   String imageText = new OCR().recognizeCharacters((RenderedImage) image);    
	   System.out.println("Text From Image : \n"+ imageText);    
	   System.out.println("Length of total text : \n"+ imageText.length());  */

}
}