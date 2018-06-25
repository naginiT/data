package pack1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mpwoer {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","E:\\saididdiga\\jarfiels\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("http://cubicitsolution.co.in/project/mpower-admin/admin");
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/form/div/div[2]/div[1]/div/input")).sendKeys("admin");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/form/div/div[2]/div[2]/div/input")).sendKeys("admin321");
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/form/div/div[3]/button")).click();
	    Thread.sleep(2000);
	   driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/b/a")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[2]/p/a[1]")).click();
	   
	   InputStream inStream = null;
		OutputStream outStream = null;
			
	    	try{
	    		
	    	    File afile =new File("‪‪C:\\Users\\HP\\Downloads\\Candidates_list.csv");
	    	    File bfile =new File("C:\\Users\\HP\\Downloads\\sai\\Candidates_list.csv");
	    		
	    	    inStream = new FileInputStream(afile);
	    	    outStream = new FileOutputStream(bfile);
	        	
	    	    byte[] buffer = new byte[1024];
	    		
	    	    int length;
	    	    //copy the file content in bytes 
	    	    while ((length = inStream.read(buffer)) > 0)
	    	    {
	    	  
	    	    	outStream.write(buffer, 0, length);
	    	 
	    	    }
	    	 
	    	    inStream.close();
	    	    outStream.close();
	    	    
	    	    //delete the original file
	    	    afile.delete();
	    	    
	    	    System.out.println("File is copied successful!");
	    	    
	    	    driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[2]/p/a[1]")).click();
	    		Thread.sleep(1000);
	    		
	    	    
	    	}
	    	catch(IOException e)
	    	{
	    	    e.printStackTrace();
	    	}
	   
	  /*try {
	    File oldFile=new File("‪C:\\Users\\HP\\Downloads\\Candidates_list.csv.txt");
	    if(oldFile.renameTo(new File("")))
	        if (oldFile.renameTo(new File("‪C:\\Users\\HP\\Downloads\\Desktop\\files\\"+ oldFile.getName()))) 
	        	
	        {
	        	System.out.println("the file is moved sucessfully");
	        }
	        else
	        {
	        	System.out.println("the file was not moved");
	       
	        }
	    }catch(Exception e)
	  {
	    	e.printStackTrace();
	  }
	}*/
	
	 /*File file = new File("‪C:\\Users\\HP\\Downloads\\Candidates_list.csv");
         
        // renaming the file and moving it to a new location
        if(file.renameTo
           (new File("F:\\diddiga88\\newfile.csv")))
        {
            // if file copied successfully then delete the original file
            file.delete();
            System.out.println("File moved successfully");
        }
        else
        {
            System.out.println("Failed to move the file");
        }
 
         
    */
	  
	 /* File source = new File("‪C:\\Users\\HP\\Downloads\\Candidates_list.csv");
	  File dest = new File("‪C:\\Users\\HP\\Downloads\\Candidates_list2.csv");
	  try 
	  {
	      FileUtils.copyDirectory(source, dest);
	  } catch (IOException e) {
	      e.printStackTrace();
	  }
	}
*/
	  

	
}
}