package pack1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wird2Pdf2 
{
	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","E:\\saididdiga\\jarfiels\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.ilovepdf.com/word_to_pdf");
    driver.findElement(By.id("pickfiles")).click();
	Robot r=new Robot();
	StringSelection ss=new StringSelection("E:\\saikrishna.docx");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_C);
	
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_C);
	
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_V);
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	System.out.println("File upload sucessfully");
	driver.quit();
	
	}

}



