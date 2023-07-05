package generic_script1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import generic_script1.generic_for_O_C;
public class Test_listener   implements ITestListener 

{
	
	@Test
	public static void run( WebDriver driver)
	{
		

	try
	{
			
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File("C:\\Users\\sansa\\OneDrive\\Pictures\\Screenshots/manoj.jpeg");
		 
			FileHandler.copy(src, dst);
			
		} 
		catch (IOException e) 
		{
			System.out.println(e);
		}
	}}

	



	
	


