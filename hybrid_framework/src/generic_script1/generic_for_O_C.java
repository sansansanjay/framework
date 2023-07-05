package generic_script1;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class generic_for_O_C  implements ITestListener

{
	public WebDriver driver;
	@BeforeMethod
	public void open_appl() 
	{
		 System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		driver=new FirefoxDriver();
		
	}
	@AfterMethod
	public void close_appl(ITestResult res) 
	{
		/*if(ITestResult.FAILURE==res.getStatus())
		{
			Test_listener.run(driver);
		}*/
		 Reporter.log(null, res.getStatus());
	
		
		driver.close();
		
		
	}
	
	
}
