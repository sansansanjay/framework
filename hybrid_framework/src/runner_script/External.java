package runner_script;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class External
{
	@Test
	public void man() {
		ExtentReports ff=new ExtentReports("./Reports/a.html");
		  ExtentTest te2 = ff.startTest("tc2");
		  te2.log(LogStatus.PASS,"passsedtestcase");
		  te2.log(LogStatus.FAIL, "failedtestcase");
		    ff.endTest(te2);
		    ff.flush();
	}
	
		 
	

}
