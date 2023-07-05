package runner_script;
import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic_script1.generic_for_O_C;
public class Check_generic 
{
	@Test
	public void check() throws IOException, InterruptedException
	{
		 System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
			 WebDriver driver=new FirefoxDriver();
         driver.get("https://www.amazon.in");
         Thread.sleep(4000);

		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		 File dst = new File("C:\\Users\\sansa\\OneDrive\\Pictures\\Saved Pictures.jpeg");
		 FileHandler.copy(src, dst);
        
		
		
	}
	
	

}
