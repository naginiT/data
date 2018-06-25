package pack1;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Takes extends FailScr
{

	public static String m(String sshot) throws Exception
	{

	
	TakesScreenshot ts=(TakesScreenshot)driver;
	 Thread.sleep(2000);
	File src=ts.getScreenshotAs(OutputType.FILE);
	String  s="E:\\saididdiga\\screenshot\\Scrren111re.png";
	File des=new File(s);
	
	 
	FileUtils.copyFile(src,des);
	 
	System.out.println("Screenshot taken");
	return s;
	} 
	



}
