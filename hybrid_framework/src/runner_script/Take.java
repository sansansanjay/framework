package runner_script;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;
import generic_script1.generic_for_O_C;
public class Take  extends generic_for_O_C
{
	@Test
	public void mul() throws InterruptedException, IOException 
	{
		driver.get("https://www.amazon.in");
		Thread.sleep(5000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		  File src = ts.getScreenshotAs(OutputType.FILE);
		  File dst = new File("C:\\Users\\sansa\\OneDrive\\Pictures\\Screenshots/sanjay.jpeg");
		  FileHandler.copy(src, dst);
		
		
	}

}
