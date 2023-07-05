package generic_script1;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Generic_Tss
{
	
	public static void getphoto(WebDriver driver) throws IOException
	{
		
	
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		 File dst = new File("C:\\Users\\sansa\\OneDrive\\Pictures\\Saved Pictures");
		 org.openqa.selenium.io.FileHandler.copy(src, dst);
		
	}
	{
		
	}

		
	
	
		
	
	

}
