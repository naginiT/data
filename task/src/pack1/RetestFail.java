package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RetestFail 
{

	@Test
	public  void login() throws Exception
		{
			System.setProperty("webdriver.chrome.driver", "E:\\saididdiga\\jarfiels\\chromedriver.exe");    
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();

			driver.get("http://www.way2sms.com/entry?ec=0080&id=0.10585275444510778");
			Thread.sleep(10000);

			driver.findElement(By.xpath("//*[@id=\"Login\"]/div[2]/form/div[1]/input")).sendKeys("9949990651");
					Thread.sleep(1000);

			driver.findElement(By.name("pasord")).sendKeys("9949990651");
			Thread.sleep(1000);

			driver.findElement(By.id("loginBTN")).click();
			Thread.sleep(1000);			
			if(driver.getTitle().contentEquals("Free SMS, Send Free SMS, Send Free SMS to india, Free email alerts, email2SMS, SMS Alerts,Bill Reminders, EMI Reminders, Loan Reminders, TV Shows Reminders, Future SMS, Mobile Bill Reminders"))
				{
					System.out.println("Login Success");
					driver.findElement(By.xpath("//*[@id=\"mainBody\"]/div[9]/div/ul/li[4]/i")).click();
					//driver.close();
				}
			else
				{
					System.out.println("Login Failed");
				}
			
			driver.navigate().to("http://www.way2sms.com/entry?ec=0080&id=0.10585275444510778");
			Thread.sleep(10000);

			driver.findElement(By.xpath("//*[@id=\"Login\"]/div[2]/form/div[1]/input")).sendKeys("9949990651");
					Thread.sleep(1000);

			driver.findElement(By.name("password")).sendKeys("9949990651");
			Thread.sleep(1000);

			driver.findElement(By.id("loginBTN")).click();


		}
}
