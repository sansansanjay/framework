package generic_script1;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.DependencyMap;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import generic_script1.generic_for_O_C;

public class Running  extends generic_for_O_C
{
	@Test
	public void run() throws InterruptedException 
	{
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		 String ss = driver.getTitle();
		 
		Assert.assertEquals(ss,"Online");
		System.out.println("sanju");
	
		
		
	}

	
	
	
	

}
